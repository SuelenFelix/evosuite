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

public class BooruItem_getSampleURL_12882927143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3091;

    public BooruItem_getSampleURL_12882927143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3091 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term3091, term3091.getClass(), "fileURL", "fzeqPnzpnt");
        setField(term3091, term3091.getClass(), "sampleURL", "RxbhrFBjkO");
        setField(term3091, term3091.getClass(), "thumbnailURL", "aanyiAOJCl");
        setField(term3091, term3091.getClass(), "tags", "VDokbsCuqq");
        setField(term3091, term3091.getClass(), "postURL", "xClUIcPECX");
        setIntField(term3091, term3091.getClass(), "id", -426764678);
        setIntField(term3091, term3091.getClass(), "width", -1222614956);
        setIntField(term3091, term3091.getClass(), "height", -1870495012);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("loliSnatcher.BooruItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSampleURL", argTypes, term3091, args);
    }

};


