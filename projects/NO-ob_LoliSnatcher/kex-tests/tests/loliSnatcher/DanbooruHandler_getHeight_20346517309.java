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

public class DanbooruHandler_getHeight_20346517309 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2470;

    public DanbooruHandler_getHeight_20346517309() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term2499 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term2499, term2499.getClass(), "fileURL", "");
        setField(term2499, term2499.getClass(), "sampleURL", "");
        setField(term2499, term2499.getClass(), "thumbnailURL", "");
        setField(term2499, term2499.getClass(), "tags", "");
        setField(term2499, term2499.getClass(), "postURL", "");
        setIntField(term2499, term2499.getClass(), "id", 11724947);
        setIntField(term2499, term2499.getClass(), "width", 1953277050);
        setIntField(term2499, term2499.getClass(), "height", 1283079251);
        Object term2508 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term2508, term2508.getClass(), "fileURL", "");
        setField(term2508, term2508.getClass(), "sampleURL", "");
        setField(term2508, term2508.getClass(), "thumbnailURL", "");
        setField(term2508, term2508.getClass(), "tags", "");
        setField(term2508, term2508.getClass(), "postURL", "");
        setIntField(term2508, term2508.getClass(), "id", -523949691);
        setIntField(term2508, term2508.getClass(), "width", 1398204340);
        setIntField(term2508, term2508.getClass(), "height", 229204365);
        Object term2517 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term2517, term2517.getClass(), "fileURL", "");
        setField(term2517, term2517.getClass(), "sampleURL", "");
        setField(term2517, term2517.getClass(), "thumbnailURL", "");
        setField(term2517, term2517.getClass(), "tags", "");
        setField(term2517, term2517.getClass(), "postURL", "");
        setIntField(term2517, term2517.getClass(), "id", -461771056);
        setIntField(term2517, term2517.getClass(), "width", -243422082);
        setIntField(term2517, term2517.getClass(), "height", 1384592638);
        Object term2526 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term2526, term2526.getClass(), "fileURL", "");
        setField(term2526, term2526.getClass(), "sampleURL", "");
        setField(term2526, term2526.getClass(), "thumbnailURL", "");
        setField(term2526, term2526.getClass(), "tags", "");
        setField(term2526, term2526.getClass(), "postURL", "");
        setIntField(term2526, term2526.getClass(), "id", -1002370457);
        setIntField(term2526, term2526.getClass(), "width", -2014576105);
        setIntField(term2526, term2526.getClass(), "height", 1296895584);
        Object term2535 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term2535, term2535.getClass(), "fileURL", "");
        setField(term2535, term2535.getClass(), "sampleURL", "");
        setField(term2535, term2535.getClass(), "thumbnailURL", "");
        setField(term2535, term2535.getClass(), "tags", "");
        setField(term2535, term2535.getClass(), "postURL", "");
        setIntField(term2535, term2535.getClass(), "id", 628918458);
        setIntField(term2535, term2535.getClass(), "width", -1274456137);
        setIntField(term2535, term2535.getClass(), "height", 1041916673);
        Object term2544 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term2544, term2544.getClass(), "fileURL", "");
        setField(term2544, term2544.getClass(), "sampleURL", "");
        setField(term2544, term2544.getClass(), "thumbnailURL", "");
        setField(term2544, term2544.getClass(), "tags", "");
        setField(term2544, term2544.getClass(), "postURL", "");
        setIntField(term2544, term2544.getClass(), "id", -601863069);
        setIntField(term2544, term2544.getClass(), "width", 663292551);
        setIntField(term2544, term2544.getClass(), "height", -1885090354);
        ArrayList term2497 = new ArrayList();
        ((ArrayList) term2497).add(term2499);
        ((ArrayList) term2497).add(term2508);
        ((ArrayList) term2497).add(term2517);
        ((ArrayList) term2497).add(term2526);
        ((ArrayList) term2497).add(term2535);
        ((ArrayList) term2497).add(term2544);
        term2470 = newInstance(Class.forName("loliSnatcher.DanbooruHandler"));
        setField(term2470, term2470.getClass(), "baseURL", "uSUvKAyuvd");
        setIntField(term2470, term2470.getClass(), "pageNum", 1830648570);
        setIntField(term2470, term2470.getClass(), "limit", -227365013);
        setField(term2470, term2470.getClass(), "prevTags", "onQLVONGuf");
        setField(term2470, term2470.getClass(), "fetched", term2497);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("loliSnatcher.DanbooruHandler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "DPskuFUobI";
        callMethod(klass, "getHeight", argTypes, term2470, args);
    }

};


