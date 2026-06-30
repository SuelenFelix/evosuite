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

public class BooruItem_getTags_16945967904 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3205;

    public BooruItem_getTags_16945967904() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3205 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term3205, term3205.getClass(), "fileURL", "avhRaGZaBF");
        setField(term3205, term3205.getClass(), "sampleURL", "JkgoRtImdE");
        setField(term3205, term3205.getClass(), "thumbnailURL", "qFGKIJjlmV");
        setField(term3205, term3205.getClass(), "tags", "IHqvyhMtuM");
        setField(term3205, term3205.getClass(), "postURL", "dAldIGYAXV");
        setIntField(term3205, term3205.getClass(), "id", -1310015129);
        setIntField(term3205, term3205.getClass(), "width", -2104981311);
        setIntField(term3205, term3205.getClass(), "height", -571169753);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("loliSnatcher.BooruItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTags", argTypes, term3205, args);
    }

};


