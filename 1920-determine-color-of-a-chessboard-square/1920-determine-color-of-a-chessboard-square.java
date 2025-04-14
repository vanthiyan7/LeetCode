class Solution {
    public boolean squareIsWhite(String coordinates) {
        int a = coordinates.charAt(0)-96;
		int b = Integer.parseInt(String.valueOf(coordinates.charAt(1)));
		if((a+b)%2!=0) 
			return true;
        else 
			return false;
    }
}