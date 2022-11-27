package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList){
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection){
        int toReach = 0;
        int forward = 0;
        int backward = 0;
        for (int i = 0; i < playList.length; i++) {
            if (selection.equals(playList[i])) {
                forward = i - startIndex;
                backward = startIndex - i + playList.length;
                if (forward > backward) {
                    toReach = backward;
                } else {
                    toReach = forward;
                }
            }
        }
        return toReach;
//        return null;
    }
}
