package loliSnatcher;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static loliSnatcher.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class DanbooruHandler_getWidth_107726399510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2597;

    public DanbooruHandler_getWidth_107726399510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term2626 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term2626, term2626.getClass(), "fileURL", "");
        setField(term2626, term2626.getClass(), "sampleURL", "");
        setField(term2626, term2626.getClass(), "thumbnailURL", "");
        setField(term2626, term2626.getClass(), "tags", "");
        setField(term2626, term2626.getClass(), "postURL", "");
        setIntField(term2626, term2626.getClass(), "id", 197109649);
        setIntField(term2626, term2626.getClass(), "width", -1239406390);
        setIntField(term2626, term2626.getClass(), "height", 1557431527);
        Object term2635 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term2635, term2635.getClass(), "fileURL", "");
        setField(term2635, term2635.getClass(), "sampleURL", "");
        setField(term2635, term2635.getClass(), "thumbnailURL", "");
        setField(term2635, term2635.getClass(), "tags", "");
        setField(term2635, term2635.getClass(), "postURL", "");
        setIntField(term2635, term2635.getClass(), "id", -1504890659);
        setIntField(term2635, term2635.getClass(), "width", 1358829571);
        setIntField(term2635, term2635.getClass(), "height", 991356662);
        Object term2644 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term2644, term2644.getClass(), "fileURL", "");
        setField(term2644, term2644.getClass(), "sampleURL", "");
        setField(term2644, term2644.getClass(), "thumbnailURL", "");
        setField(term2644, term2644.getClass(), "tags", "");
        setField(term2644, term2644.getClass(), "postURL", "");
        setIntField(term2644, term2644.getClass(), "id", -506958186);
        setIntField(term2644, term2644.getClass(), "width", -507387516);
        setIntField(term2644, term2644.getClass(), "height", -1970452551);
        Object term2653 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term2653, term2653.getClass(), "fileURL", "");
        setField(term2653, term2653.getClass(), "sampleURL", "");
        setField(term2653, term2653.getClass(), "thumbnailURL", "");
        setField(term2653, term2653.getClass(), "tags", "");
        setField(term2653, term2653.getClass(), "postURL", "");
        setIntField(term2653, term2653.getClass(), "id", -1896376975);
        setIntField(term2653, term2653.getClass(), "width", 729658803);
        setIntField(term2653, term2653.getClass(), "height", 114754804);
        Object term2662 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term2662, term2662.getClass(), "fileURL", "");
        setField(term2662, term2662.getClass(), "sampleURL", "");
        setField(term2662, term2662.getClass(), "thumbnailURL", "");
        setField(term2662, term2662.getClass(), "tags", "");
        setField(term2662, term2662.getClass(), "postURL", "");
        setIntField(term2662, term2662.getClass(), "id", 1687361082);
        setIntField(term2662, term2662.getClass(), "width", 584893196);
        setIntField(term2662, term2662.getClass(), "height", 497269071);
        ArrayList term2624 = new ArrayList();
        ((ArrayList) term2624).add(term2626);
        ((ArrayList) term2624).add(term2635);
        ((ArrayList) term2624).add(term2644);
        ((ArrayList) term2624).add(term2653);
        ((ArrayList) term2624).add(term2662);
        term2597 = newInstance(Class.forName("loliSnatcher.DanbooruHandler"));
        setField(term2597, term2597.getClass(), "baseURL", "wBGfLpNNiZ");
        setIntField(term2597, term2597.getClass(), "pageNum", -2066804303);
        setIntField(term2597, term2597.getClass(), "limit", -1731761810);
        setField(term2597, term2597.getClass(), "prevTags", "yUGCjlqgJE");
        setField(term2597, term2597.getClass(), "fetched", term2624);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("loliSnatcher.DanbooruHandler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "pumvwBWvpy";
        callMethod(klass, "getWidth", argTypes, term2597, args);
    }

};


