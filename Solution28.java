class Solution28 {
    public static void main(String[] args) {
        char[] haystack = "sssssssssad".toCharArray();
        char[] needle = "sssad".toCharArray();

        System.out.print(isSubstring(haystack, needle));
    }

    private static boolean isSubstring(char[] haystack, char[] needle) {
        boolean match;
        for (int i = 0; i <= haystack.length - needle.length; i++) {
            if (needle[0] == haystack[i]) {
                match = true;
                for (int j = 0; j < needle.length; j++) {
                    if (needle[j] != haystack[i + j]) {
                        match = false;
                        break;
                    }
                }
                if (match) {
                    return true;
                }
            }
        }
        return false;
    }
}