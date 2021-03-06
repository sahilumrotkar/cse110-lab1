package tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import com.example.myfirstapp.MainActivity;
import com.example.myfirstapp.R;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(RobolectricTestRunner.class)
public class MainActivityTest {

    @Test
    public void testStudentNameIsDisplayed() {
        MainActivity activity = Robolectric.setupActivity(MainActivity.class);
        activity.findViewById(R.id.showBtn).performClick();
        assertTrue(activity.findViewById(R.id.name).isShown());
    }
}
