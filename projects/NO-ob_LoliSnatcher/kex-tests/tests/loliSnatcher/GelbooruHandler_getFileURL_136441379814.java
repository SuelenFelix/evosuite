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

public class GelbooruHandler_getFileURL_136441379814 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5381;

    public GelbooruHandler_getFileURL_136441379814() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5381 = newInstance(Class.forName("loliSnatcher.GelbooruHandler"));
        setField(term5381, term5381.getClass(), "apiKey", null);
        setField(term5381, term5381.getClass(), "userID", null);
        setField(term5381, term5381.getClass(), "baseURL", null);
        setIntField(term5381, term5381.getClass(), "pageNum", 0);
        setIntField(term5381, term5381.getClass(), "limit", 0);
        setField(term5381, term5381.getClass(), "prevTags", null);
        setField(term5381, term5381.getClass(), "fetched", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("loliSnatcher.GelbooruHandler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getFileURL", argTypes, term5381, args);
    }

};


