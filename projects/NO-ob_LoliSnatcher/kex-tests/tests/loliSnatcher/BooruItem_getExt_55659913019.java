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

public class BooruItem_getExt_55659913019 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3927;

    public BooruItem_getExt_55659913019() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3927 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term3927, term3927.getClass(), "fileURL", null);
        setField(term3927, term3927.getClass(), "sampleURL", null);
        setField(term3927, term3927.getClass(), "thumbnailURL", null);
        setField(term3927, term3927.getClass(), "tags", null);
        setField(term3927, term3927.getClass(), "postURL", null);
        setIntField(term3927, term3927.getClass(), "id", 0);
        setIntField(term3927, term3927.getClass(), "width", 0);
        setIntField(term3927, term3927.getClass(), "height", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("loliSnatcher.BooruItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExt", argTypes, term3927, args);
    }

};


