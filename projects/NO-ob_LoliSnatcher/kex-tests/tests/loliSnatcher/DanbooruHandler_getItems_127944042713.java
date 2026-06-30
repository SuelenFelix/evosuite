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

public class DanbooruHandler_getItems_127944042713 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2720;

    public DanbooruHandler_getItems_127944042713() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2720 = newInstance(Class.forName("loliSnatcher.DanbooruHandler"));
        setField(term2720, term2720.getClass(), "baseURL", null);
        setIntField(term2720, term2720.getClass(), "pageNum", 0);
        setIntField(term2720, term2720.getClass(), "limit", 0);
        setField(term2720, term2720.getClass(), "prevTags", null);
        setField(term2720, term2720.getClass(), "fetched", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("loliSnatcher.DanbooruHandler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("javax.net.ssl.HttpsURLConnection");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getItems", argTypes, term2720, args);
    }

};


