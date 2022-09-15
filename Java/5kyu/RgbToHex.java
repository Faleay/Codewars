class RgbToHex {

    public static String rgb(int r, int g, int b) {
        if(r < 0 || r > 255){
          if (r < 0) r = 0;
          else r = 255;
        }
        if(g < 0 || g > 255){
            if (g < 0) g = 0;
            else g = 255;
          }
        if(b < 0 || b > 255){
            if (b < 0) b = 0;
            else b = 255;
          }
        return String.format("%02X%02X%02X", r, g, b);
    }
}