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

public class MoebooruHandler_Search_15764528984 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term344;

    public MoebooruHandler_Search_15764528984() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term344 = newInstance(Class.forName("loliSnatcher.MoebooruHandler"));
        setIntField(term344, term344.getClass(), "pageNum", 0);
        setField(term344, term344.getClass(), "apiKey", null);
        setField(term344, term344.getClass(), "userID", null);
        setField(term344, term344.getClass(), "baseURL", null);
        setIntField(term344, term344.getClass(), "limit", 0);
        setField(term344, term344.getClass(), "prevTags", null);
        setField(term344, term344.getClass(), "fetched", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("loliSnatcher.MoebooruHandler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "Search", argTypes, term344, args);
    }

};


