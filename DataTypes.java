public class Solution {
    public static int dataTypes(String type) {
        int sizeInBytes = 0;
        switch(type){
            case "Integer":
            sizeInBytes = 4;
            break;
            case "Long":
            sizeInBytes = 8;
            break;
            case "Float":
           sizeInBytes = 4;
            break;
            case "Double":
           sizeInBytes = 8;
            break;
            case "Character":
            sizeInBytes = 1;
            break;
            default:
            System.out.println(" ");
        }
        return sizeInBytes;
    }
}
