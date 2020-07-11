package com.github.csaba.todo.tests;

import android.support.test.InstrumentationRegistry;
import android.support.test.rule.ActivityTestRule;

import com.github.csaba.todo.MainActivity;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;

public class BaseEspressoTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Before
    public void beforeTest() {
        InstrumentationRegistry.getInstrumentation().getUiAutomation().executeShellCommand("rm -r /data/data/com.github.csaba.todo/databases");
    }

    @After
    public void afterTest() {
        InstrumentationRegistry.getInstrumentation().getUiAutomation().executeShellCommand("rm -r /data/data/com.github.csaba.todo/databases");
    }
}
