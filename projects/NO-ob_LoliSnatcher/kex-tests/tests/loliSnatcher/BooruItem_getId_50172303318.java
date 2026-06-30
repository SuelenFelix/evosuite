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

public class BooruItem_getId_50172303318 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3923;

    public BooruItem_getId_50172303318() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3923 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term3923, term3923.getClass(), "fileURL", null);
        setField(term3923, term3923.getClass(), "sampleURL", null);
        setField(term3923, term3923.getClass(), "thumbnailURL", null);
        setField(term3923, term3923.getClass(), "tags", null);
        setField(term3923, term3923.getClass(), "postURL", null);
        setIntField(term3923, term3923.getClass(), "id", 0);
        setIntField(term3923, term3923.getClass(), "width", 0);
        setIntField(term3923, term3923.getClass(), "height", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("loliSnatcher.BooruItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term3923, args);
    }

};


