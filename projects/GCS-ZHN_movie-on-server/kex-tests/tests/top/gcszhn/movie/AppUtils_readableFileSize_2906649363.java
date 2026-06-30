package top.gcszhn.movie;

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
import static top.gcszhn.movie.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class AppUtils_readableFileSize_2906649363 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9923;
     Object term9924;

    public AppUtils_readableFileSize_2906649363() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9923 = newInstance(Class.forName("top.gcszhn.movie.AppUtils"));
        term9924 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("top.gcszhn.movie.AppUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term9924;
        callMethod(klass, "readableFileSize", argTypes, term9923, args);
    }

};


