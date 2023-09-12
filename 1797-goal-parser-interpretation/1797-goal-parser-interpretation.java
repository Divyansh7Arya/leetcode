class Solution {
    public String interpret(String command) {
        //command = command.replace("()","o");
        return command.replace("()","o").replace("(al)","al");
    }
}