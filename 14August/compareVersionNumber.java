class Solution {
    public int compareVersion(String version1, String version2) {
        int i = 0;
        int j = 0;
        while(i < version1.length() && j < version2.length()){
            String rev1 = "";
            String rev2 = "";
            while(i < version1.length() && version1.charAt(i) != '.')
                rev1 += version1.charAt(i++);
            while(j < version2.length() && version2.charAt(j) != '.')
                rev2 += version2.charAt(j++);
            if(Integer.parseInt(rev1) < Integer.parseInt(rev2)) return -1;
            if(Integer.parseInt(rev2) < Integer.parseInt(rev1)) return 1;
            i++;
            j++;
        }
        while(i < version1.length()){
            String rev1 = "";
            while(i < version1.length() && version1.charAt(i) != '.')
                rev1 += version1.charAt(i++);
            if(Integer.parseInt(rev1) > 0) return 1;
            i++;
        }
        while(j < version2.length()){
            String rev2 = "";
            while(j < version2.length() && version2.charAt(j) != '.')
                rev2 += version2.charAt(j++);
            if(Integer.parseInt(rev2) > 0) return -1;
            j++;
        }
        return 0;
    }
}