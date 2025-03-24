package collections.set_interface;

import java.util.*;

public class InsuranceManagement {
    private Set<InsurancePolicy> policySet;
    private Set<InsurancePolicy> linkedPolicySet;
    private Set<InsurancePolicy> sortedPolicySet;

    public InsuranceManagement() {
        policySet = new HashSet<>();
        linkedPolicySet = new LinkedHashSet<>();
        sortedPolicySet = new TreeSet<>();
    }

    public void addPolicy(InsurancePolicy policy) {
        policySet.add(policy);
        linkedPolicySet.add(policy);
        sortedPolicySet.add(policy);
    }

    public Set<InsurancePolicy> getAllPolicies() {
        return new HashSet<>(policySet);
    }

    public Set<InsurancePolicy> getPoliciesExpiringSoon() {
        Set<InsurancePolicy> expiringSoon = new TreeSet<>();
        Date now = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(now);
        cal.add(Calendar.DAY_OF_MONTH, 30);
        Date thresholdDate = cal.getTime();

        for (InsurancePolicy policy : sortedPolicySet) {
            if (policy.getExpiryDate().before(thresholdDate)) {
                expiringSoon.add(policy);
            }
        }
        return expiringSoon;
    }

    public Set<InsurancePolicy> getPoliciesByType(String coverageType) {
        Set<InsurancePolicy> filteredPolicies = new HashSet<>();
        for (InsurancePolicy policy : policySet) {
            if (policy.getCoverageType().equalsIgnoreCase(coverageType)) {
                filteredPolicies.add(policy);
            }
        }
        return filteredPolicies;
    }
}
