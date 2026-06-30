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

public class BooruItem_getFileURL_44941500011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3895;

    public BooruItem_getFileURL_44941500011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3895 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term3895, term3895.getClass(), "fileURL", null);
        setField(term3895, term3895.getClass(), "sampleURL", null);
        setField(term3895, term3895.getClass(), "thumbnailURL", null);
        setField(term3895, term3895.getClass(), "tags", null);
        setField(term3895, term3895.getClass(), "postURL", null);
        setIntField(term3895, term3895.getClass(), "id", 0);
        setIntField(term3895, term3895.getClass(), "width", 0);
        setIntField(term3895, term3895.getClass(), "height", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("loliSnatcher.BooruItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFileURL", argTypes, term3895, args);
    }

};


