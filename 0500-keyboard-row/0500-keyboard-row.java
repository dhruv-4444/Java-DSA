class Solution {
    public String[] findWords(String[] words) {
        String first = "qwertyuiop";
        String second = "asdfghjkl";
        String third = "zxcvbnm";

        List<String> ans = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            String def = "";
            if (first.contains(String.valueOf(words[i].charAt(0)).toLowerCase()))
                def = first;
            else if (second.contains(String.valueOf(words[i].charAt(0)).toLowerCase()))
                def = second;
            else
                def = third;
            boolean flag = true;
            for (int j = 1; j < words[i].length(); j++) {
                if (first.contains(String.valueOf(words[i].charAt(j)).toLowerCase()) && !def.equals(first)) {
                    flag = false;
                    break;
                } else if (second.contains(String.valueOf(words[i].charAt(j)).toLowerCase()) && !def.equals(second)) {
                    flag = false;
                    break;
                }
                 else if (third.contains(String.valueOf(words[i].charAt(j)).toLowerCase()) && !def.equals(third)) {
                    flag = false;
                    break;
                }
            }
            if (flag == true)
                ans.add(words[i]);

        }

        System.out.println(ans);
        String[] ans1 = new String[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            ans1[i] = ans.get(i);
        }
        return ans1;

    }
}