package map_interface;

import java.util.*;

class Policy {
    String policyNumber;
    String policyHolder;
    Date expiryDate;

    public Policy(String policyNumber, String policyHolder, Date expiryDate) {
        this.policyNumber = policyNumber;
        this.policyHolder = policyHolder;
        this.expiryDate = expiryDate;
    }

    @Override
    public String toString() {
        return policyNumber + " - " + policyHolder + " (Expires: " + expiryDate + ")";
    }
}

public class InsurancePolicyManagement {
    private Map<String, Policy> policiesMap = new HashMap<>();
    private Map<String, Policy> policiesLinked = new LinkedHashMap<>();
    private TreeMap<Date, Policy> policiesSorted = new TreeMap<>();

    public void addPolicy(Policy policy) {
        policiesMap.put(policy.policyNumber, policy);
        policiesLinked.put(policy.policyNumber, policy);
        policiesSorted.put(policy.expiryDate, policy);
    }

    public Policy getPolicy(String policyNumber) {
        return policiesMap.get(policyNumber);
    }

    public List<Policy> getExpiringSoon() {
        List<Policy> expiring = new ArrayList<>();
        Date now = new Date();
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_YEAR, 30);
        Date future = cal.getTime();

        for (Map.Entry<Date, Policy> entry : policiesSorted.entrySet()) {
            if (entry.getKey().after(now) && entry.getKey().before(future)) {
                expiring.add(entry.getValue());
            }
        }
        return expiring;
    }

    public List<Policy> getPoliciesByHolder(String holder) {
        List<Policy> result = new ArrayList<>();
        for (Policy policy : policiesLinked.values()) {
            if (policy.policyHolder.equals(holder)) {
                result.add(policy);
            }
        }
        return result;
    }

    public void removeExpiredPolicies() {
        Date now = new Date();
        policiesSorted.entrySet().removeIf(entry -> entry.getKey().before(now));
    }

    public static void main(String[] args) {
        InsurancePolicyManagement system = new InsurancePolicyManagement();
        system.addPolicy(new Policy("P001", "Alice", new GregorianCalendar(2025, Calendar.MARCH, 10).getTime()));
        system.addPolicy(new Policy("P002", "Bob", new GregorianCalendar(2024, Calendar.APRIL, 5).getTime()));

        System.out.println("Expiring Soon: " + system.getExpiringSoon());
        System.out.println("Alice's Policies: " + system.getPoliciesByHolder("Alice"));
    }
}
