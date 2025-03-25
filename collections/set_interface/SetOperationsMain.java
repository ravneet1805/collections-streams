package set_interface;

import java.util.*;


public class SetOperationsMain {
    public static void main(String[] args) {
        // Check if Two Sets Are Equal
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 2, 1));
        System.out.println("Sets are equal: " + SetOperations.areSetsEqual(set1, set2));

        //  Union & Intersection
        Set<Integer> setA = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> setB = new HashSet<>(Arrays.asList(3, 4, 5));
        System.out.println("Union: " + SetOperations.getUnion(setA, setB));
        System.out.println("Intersection: " + SetOperations.getIntersection(setA, setB));

        // Symmetric Difference
        System.out.println("Symmetric Difference: " + SetOperations.getSymmetricDifference(setA, setB));

        // Convert a Set to Sorted List
        Set<Integer> unsortedSet = new HashSet<>(Arrays.asList(5, 3, 9, 1));
        System.out.println("Sorted List: " + SetOperations.convertSetToSortedList(unsortedSet));

        // Check if Subset
        Set<Integer> subset = new HashSet<>(Arrays.asList(2, 3));
        Set<Integer> superset = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        System.out.println("Is Subset: " + SetOperations.isSubset(subset, superset));

        // Insurance Policy Management System
        InsuranceManagement insuranceManager = new InsuranceManagement();

        // Sample Policies
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_MONTH, 10);
        Date expiry1 = calendar.getTime();

        calendar.add(Calendar.DAY_OF_MONTH, 50);
        Date expiry2 = calendar.getTime();

        insuranceManager.addPolicy(new InsurancePolicy("P123", "John Doe", expiry1, "Health", 500.0));
        insuranceManager.addPolicy(new InsurancePolicy("P124", "Jane Smith", expiry2, "Auto", 800.0));

        // Retrieve all policies
        System.out.println("\nAll Policies: " + insuranceManager.getAllPolicies());

        // Policies expiring soon
        System.out.println("\nPolicies Expiring Soon: " + insuranceManager.getPoliciesExpiringSoon());

        // Get policies by type
        System.out.println("\nAuto Insurance Policies: " + insuranceManager.getPoliciesByType("Auto"));
    }
}
