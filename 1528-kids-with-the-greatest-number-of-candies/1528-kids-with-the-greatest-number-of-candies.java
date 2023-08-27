class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList <Boolean> result = new ArrayList<>(candies.length);
        int max = 0;
        for(int element : candies) {
            max = Math.max(element,max);
        }
        for(int element : candies) {
            result.add(element + extraCandies >=max);
        }
        return result;
    }
}