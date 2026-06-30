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

public class LocalbooruHandler_dbConnect_110399378214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6812;

    public LocalbooruHandler_dbConnect_110399378214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6812 = newInstance(Class.forName("loliSnatcher.LocalbooruHandler"));
        setField(term6812, term6812.getClass(), "baseURL", null);
        setIntField(term6812, term6812.getClass(), "pageNum", 0);
        setIntField(term6812, term6812.getClass(), "limit", 0);
        setField(term6812, term6812.getClass(), "prevTags", null);
        setField(term6812, term6812.getClass(), "fetched", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("loliSnatcher.LocalbooruHandler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "dbConnect", argTypes, term6812, args);
    }

};


