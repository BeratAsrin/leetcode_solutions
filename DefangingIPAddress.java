// https://leetcode.com/problems/defanging-an-ip-address/description/
public class DefangingIPAddress {
    public static void main(String[] args) {
        DefangingSolution defangingSolution = new DefangingSolution();
        System.out.println(defangingSolution.defangIPaddr("255.100.50.0"));
    }
}

class DefangingSolution {
    public String defangIPaddr(String address) {
        StringBuilder output = new StringBuilder();
        for(int i=0; i<address.length(); i++) {
            if (address.charAt(i) == '.') {
                output.append("[.]");
            }
            else {
                output.append(address.charAt(i));
            }
        }
        return output.toString();
    }
}