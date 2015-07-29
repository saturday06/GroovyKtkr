package jp.leafytree.groovyktkr

import android.test.ActivityInstrumentationTestCase2
import com.robotium.solo.Solo

public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {
    public MainActivityTest() {
        super(MainActivity.class);
    }

    public void testFoo() {
        def solo = new Solo(instrumentation, activity)

        [
                ["Hell", true],
                ["Heaven", false],
                ["ほげほげ", false],
                ["ello", true],
        ].each {
            def (text, exists) = it
            assertEquals(exists, solo.searchText(text))
        }
    }
}
