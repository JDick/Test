package com.test;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.test.ActivityUnitTestCase;
import android.view.ContextThemeWrapper;

public class MainActivityTest extends ActivityUnitTestCase<MainActivity>{

    public MainActivityTest() {
        super(MainActivity.class);
    }

    public void setUp() throws Exception {
        super.setUp();

        ContextThemeWrapper context = new ContextThemeWrapper(getInstrumentation().getTargetContext(), R.style.AppTheme);
        setActivityContext(context);
    }

    public void testMainActivity() throws Exception {
        MainActivity testObject = startActivity(new Intent(getInstrumentation().getTargetContext(), MainActivity.class), null, null);
        FloatingActionButton fab = (FloatingActionButton) testObject.findViewById(R.id.fab);
        assertNotNull(fab);
    }
}
