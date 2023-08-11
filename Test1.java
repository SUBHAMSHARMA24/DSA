// import java.util.ArrayList;

// public class Test1 {
//     public static void main(String[] args) {
//     int[] nums = {1, 2, 3};
//     backtrack(nums, new ArrayList<>());
// }

// public static void backtrack(int[] nums, List<Integer> path) {
//     if (path.size() == nums.length) {
//         System.out.println(path);
//     } else {
//         for (int i = 0; i < nums.length; i++) {
//             if (path.contains(nums[i])) {
//                 continue;
//             }
//             path.add(nums[i]);
//             backtrack(nums, path);
//             path.remove(path.size() - 1);
//         }
//     }
// }

// }