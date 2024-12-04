import data.structures.Stack;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
    public static void testAll() {
        Map<String, Map<String, List<String>>> results = new HashMap<>();

        Map<String, List<String>> stackResults = testStack();
        results.put("Stack", stackResults);

        for (String key : results.keySet()) {
            Map<String, List<String>> resultsMap = results.get(key);

            for (String key2 : resultsMap.keySet()) {
                List<String> resultsList = resultsMap.get(key2);

                for (String result : resultsList) {
                    System.out.println(key + "- " + key2 + ": " + result);
                }
            }
        }
    }

    public static Map<String, List<String>> testStack() {
        Map<String, List<String>> results = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        // Test 1
        stack.push(1);
        stack.push(2);
        stack.push(3);


        if (!stack.isEmpty()) {
            results.put("", List.of("Passed"));
        } else {
            results.put("", List.of("Failed"));
        }

        // Test 2

        // Test 3
        stack.remove();
        stack.remove();
        stack.remove();

        if (stack.isEmpty()) {
            results.put("", List.of("Passed"));
        } else {
            results.put("", List.of("Failed"));
        }

        return results;
    }
}
