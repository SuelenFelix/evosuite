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

public class GelbooruHandler_getWidth_13749066421 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5402;

    public GelbooruHandler_getWidth_13749066421() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5402 = newInstance(Class.forName("loliSnatcher.GelbooruHandler"));
        setField(term5402, term5402.getClass(), "apiKey", null);
        setField(term5402, term5402.getClass(), "userID", null);
        setField(term5402, term5402.getClass(), "baseURL", null);
        setIntField(term5402, term5402.getClass(), "pageNum", 0);
        setIntField(term5402, term5402.getClass(), "limit", 0);
        setField(term5402, term5402.getClass(), "prevTags", null);
        setField(term5402, term5402.getClass(), "fetched", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("loliSnatcher.GelbooruHandler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getWidth", argTypes, term5402, args);
    }

};


