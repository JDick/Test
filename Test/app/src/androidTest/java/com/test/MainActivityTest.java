package com.test;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.test.ActivityUnitTestCase;

public class MainActivityTest extends ActivityUnitTestCase<MainActivity>{

    public MainActivityTest() {
        super(MainActivity.class);
    }

    public void testMainActivity() throws Exception {
        MainActivity testObject = startActivity(new Intent(getInstrumentation().getTargetContext(), MainActivity.class), null, null);
        FloatingActionButton fab = (FloatingActionButton) testObject.findViewById(R.id.fab);
        assertNotNull(fab);
    }
}
