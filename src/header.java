public class header {
    String str;
    header(String str) {
        this.str = str;
    }
    static int charfrom(String str, char a, int pos) {   int counter=0;
        int pos1=pos;
        StringBuilder sb = new StringBuilder(str);
        while (sb.charAt(pos1)==a) {
            counter++;
            pos1=pos1+1;
        }
        return counter;
    }
    static String htmlhstr(String str) {
        String htmlstr="";
        int hdindex = str.indexOf("#");
        int hdindexcopy=hdindex;
        int a,b;
        if (hdindex!=-1) {
                StringBuilder sb = new StringBuilder(str);
                a=charfrom(str, '#',hdindex);
                for(int i=0;i<a;a++) {
                sb.deleteCharAt(hdindexcopy);
                hdindexcopy++;
                sb.insert(hdindex,  "H");
                sb.insert(hdindex+1, a);
                b= sb.length();
                sb.insert(b,"/H"+a);
                htmlstr=sb.toString();
                }
            }
        return(htmlstr);
    }
}
