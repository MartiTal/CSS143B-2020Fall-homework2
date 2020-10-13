import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem2Test {
    @Test
    public void testRemoveDuplicates() {
        int[][] inputs = {
                // DO NOT REMOVE OR CHANGE THE GIVEN TEST CASES!
                {0, 0, 1, 1, 1, 2, 2, 4, 4, 6},
                {2, 2, 7, 7, 7, 8, 10},
                {12, 13, 13, 100, 101, 101},
                {-3, 0, 3},
                {-2, -2, 0, 0, 0, 5, 6, 6, 46},
                {3, 3, 3, 3, 3},
                {}
                // add more test cases
        };

        int[][] expects = {
                {0, 1, 2, 4, 6},
                {2, 7, 8, 10},
                {12, 13, 100, 101},
                {-3, 0, 3},
                {-2, 0, 5, 6, 46},
                {3},
                {}
                // add more test cases
        };

        assertEquals(expects.length, inputs.length);

        for (int i = 0; i < inputs.length; i++) {
            int actualLength = Problem2.remove(inputs[i]);
            String caseId = "case " + i;
            assertEquals(caseId + " output length FAILED", expects[i].length, actualLength);
            for (int j = 0; j < actualLength; j++) {
                assertEquals(caseId + " element comparison FAILED", expects[i][j], inputs[i][j]);
            }
        }
    }
}
