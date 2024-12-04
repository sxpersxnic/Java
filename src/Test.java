import data.structures.Stack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ansi.AnsiCodes;
import ansi.AnsiColor;

public class Test {
    public static void main(String[] args) {
        Map<String, Map<String, List<String>>> results = new HashMap<>();
        Map<String, List<String>> stackResults = testStack();

        results.put("Stack", stackResults);
        int i = 0;
        int passed = 0;
        int failed = 0;

        for (String key : results.keySet()) {
            Map<String, List<String>> resultsMap = results.get(key);

            for (String key2 : resultsMap.keySet()) {
                List<String> resultsList = resultsMap.get(key2);

                for (String result : resultsList) {
                    i++;
                    if (result == "Passed") {
                        passed++;
                        AnsiColor.println(i + ". " + key + "." + key2 + ": ", result, AnsiCodes.GREEN);
                    } else {
                        failed++;
                        AnsiColor.println(i + ". " + key + "." + key2 + ": ", result, AnsiCodes.RED);
                    }

                }
            }
        }

        AnsiColor.print("Failed: " + failed, AnsiCodes.RED);
        AnsiColor.print("Passed: " + passed, AnsiCodes.GREEN);
    }

    public static Map<String, List<String>> testStack() {
        Map<String, List<String>> results = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        // Test 1: Push
        stack.push(1);
        stack.push(2);
        stack.push(3);

        if (!stack.isEmpty()) {
            results.put("push()", List.of("Passed"));
        } else {
            results.put("push()", List.of("Failed"));
        }

        // Test 2: HasNext
        ArrayList<Integer> hasNextResult = new ArrayList<>();
        while (stack.hasNext()) {
            hasNextResult.add(stack.next());
        }

        if (hasNextResult.size() == 3) {
            results.put("next", List.of("Passed"));
            results.put("hasNext()", List.of("Passed"));
        } else {
            results.put("next", List.of("Failed"));
            results.put("hasNext()", List.of("Failed"));
        }

        // Test 3: remove
        stack.remove();
        stack.remove();
        stack.remove();

        if (stack.isEmpty()) {
            results.put("remove()", List.of("Passed"));
        } else {
            results.put("remove()", List.of("Failed"));
        }

        // Test 4: isEmpty


        // Test 5: Remove on empty stack

        // Test 6: Next on empty stack

        return results;
    }

}
