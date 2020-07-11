package com.github.csaba.todo.tests;

import android.support.test.rule.ActivityTestRule;

import com.github.csaba.todo.MainActivity;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;

import static android.support.test.InstrumentationRegistry.getInstrumentation;

public class BaseEspressoTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Before
    public void beforeTest() {
        getInstrumentation().getUiAutomation().executeShellCommand("rm -r /data/data/com.github.csaba.todo/databases");
    }

    @After
    public void afterTest() {
        getInstrumentation().getUiAutomation().executeShellCommand("rm -r /data/data/com.github.csaba.todo/databases");
    }
}
