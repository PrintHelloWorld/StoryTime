package com.bam.interactivestory.model;

import com.bam.interactivestory.R;

public class Story {
    private Page[] mPages;

    public Story() {
        mPages = new Page[7];

        mPages[0] = new Page(
                R.drawable.page0,
                R.string.page0_text,
                new Choice("Stop and investigate", 1),
                new Choice("Continue home to Earth", 2));

        mPages[1] = new Page(
                R.drawable.page1,
                R.string.page1_text,
                new Choice("Explore the cave", 3),
                new Choice("Explore the rover", 4));

        mPages[2] = new Page(
                R.drawable.page2,
                R.string.page2_text,
                new Choice("Head back to Mars to investigate", 4),
                new Choice("Continue home to Earth", 6));

        mPages[3] = new Page(
                R.drawable.page3,
                R.string.page3_text,
                new Choice("Refill at ship and explore the rover", 4),
                new Choice("Continue towards the faint light", 5));

        mPages[4] = new Page(
                R.drawable.page4,
                R.string.page4_text,
                new Choice("Explore the coordinates", 5),
                new Choice("Return to Earth", 6));

        mPages[5] = new Page(
                R.drawable.page5,
                R.string.page5_text);

        mPages[6] = new Page(
                R.drawable.page6,
                R.string.page6_text);
    }

    public Page getPage(int pageNumber){
        return mPages[pageNumber];
    }
}
