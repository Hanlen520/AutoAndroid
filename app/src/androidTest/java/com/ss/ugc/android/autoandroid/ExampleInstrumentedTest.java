package com.ss.ugc.android.autoandroid;

import android.support.test.runner.AndroidJUnit4;

import com.ss.ugc.android.autoandroid.parse.SequenceParser;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.io.File;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void testRun() throws Throwable {
        TestRunner testRunner = new TestRunner();
        SequenceParser parser = new SequenceParser(testRunner, new File("/sdcard/Download/config.txt"));
        parser.parse();
        testRunner.run();
    }
}
