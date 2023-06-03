import java.util.Optional;

class j35_TrappingRainWater {
     int heights[], length, width, trappedwater;

     int TrappedWater(int height[], Optional<Integer> wid) {
          heights = height;
          this.length = heights.length;
          width = wid.orElse(1);

          // Left Max Elements[] = Max(Current Element, Previous Max)
          int leftMaxElements[] = leftMaxElements(heights);

          // Right Max Elements[] = Max(Current Element, Next Max)
          int rightMaxElements[] = rightMaxElements(heights);

          // Water level = minimum(Left Max Element, Right Max Element)
          int waterLevel[] = min(leftMaxElements, rightMaxElements);

          // Storing all the trapped water values for each index element.
          // Trapped water = (Water level - current bar height) * Bar Width
          int trappedwaters[] = trappedwaters(waterLevel, width);

          // Sum of all trapped water vlues in each index elements.
          this.trappedwater = sum(trappedwaters);

          return trappedwater;
     }

     // This function returns array of trapped waters on each bar.
     int[] trappedwaters(int waterlevel[], int width){
          int trappedwaters[] = new int[length];
          for(int i = 0; i<length; i++){
               trappedwaters[i] = (waterlevel[i] - heights[i]) * width;
          }
          return trappedwaters;
     }

     // This function returns sum of all elements in trappedwaters array.
     int sum(int trappedwaters[]){
          int sum = 0;
          for(int i =0; i<length; i++){
               sum += trappedwaters[i];
          }
          return sum;
     }

     // This Function returns Array of water level.
     int[] min(int leftMaxElements[], int rightMaxElements[]) {
          int waterLevel[] = new int[length];
          for (int i = 0; i < length; i++) {
               waterLevel[i] = Math.min(leftMaxElements[i], rightMaxElements[i]);
          }
          return waterLevel;
     }

     // This Function returns Array of Left Maximum Elements of each index Elements.
     int[] leftMaxElements(int heights[]) {
          int leftMaxElements[] = new int[length];
          leftMaxElements[0] = heights[0];
          for (int i = 1; i < length; i++) {
               leftMaxElements[i] = Math.max(leftMaxElements[i - 1], heights[i]);
          }
          return leftMaxElements;
     }

     // This Function returns Array of Right Maximum Elements of each index Elements.
     int[] rightMaxElements(int heights[]){
          int rightMaxElements[] = new int[length];
          rightMaxElements[length-1] = heights[length-1];
          for(int i = length-2; i>=0; i--){
               rightMaxElements[i] = Math.max(rightMaxElements[i+1], heights[i]);
          }
          return rightMaxElements;
     }

     public static void main(String args[]) {
          j35_TrappingRainWater find = new j35_TrappingRainWater();
          // int heights[] = { 4, 2, 0, 3, 2, 5 };
          // int heights[] = { 4, 2, 0, 6 };
          // int heights[] = { 3, 2, 0, 6, 0,1,3 };
          int heights[] = { 0, 1, 0,  2, 1, 0, 1, 3, 2, 1, 2, 1};

          System.out.println("Total Trapped Water: "+find.TrappedWater(heights, Optional.empty()));
     }
}