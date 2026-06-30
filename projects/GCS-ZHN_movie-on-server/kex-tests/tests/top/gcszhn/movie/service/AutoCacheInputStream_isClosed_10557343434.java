package top.gcszhn.movie.service;

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
import static top.gcszhn.movie.service.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;

public class AutoCacheInputStream_isClosed_10557343434 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term136;

    public AutoCacheInputStream_isClosed_10557343434() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term141 = new ArrayList();
        ((ArrayList) term141).add((Object)null);
        ((ArrayList) term141).add((Object)null);
        ((ArrayList) term141).add((Object)null);
        ((ArrayList) term141).add((Object)null);
        term136 = newInstance(Class.forName("top.gcszhn.movie.service.AutoCacheInputStream"));
        Object term137 = newInstance(Class.forName("java.io.FileOutputStream"));
        Object term138 = newInstance(Class.forName("java.io.FileDescriptor"));
        Object term159 = newInstance(Class.forName("java.lang.Object"));
        Object term161 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term138, term138.getClass(), "fd", -1);
        setLongField(term138, term138.getClass(), "handle", -1L);
        setField(term138, term138.getClass(), "parent", null);
        setField(term138, term138.getClass(), "otherParents", term141);
        setBooleanField(term138, term138.getClass(), "closed", true);
        setBooleanField(term138, term138.getClass(), "append", false);
        setField(term138, term138.getClass(), "cleanup", null);
        setField(term137, term137.getClass(), "fd", term138);
        setField(term137, term137.getClass(), "channel", null);
        setField(term137, term137.getClass(), "path", "jJCZpVmanW");
        setField(term137, term137.getClass(), "closeLock", term159);
        setBooleanField(term137, term137.getClass(), "closed", false);
        setField(term137, term137.getClass(), "altFinalizer", term161);
        setField(term136, term136.getClass(), "fos", term137);
        setField(term136, term136.getClass(), "in", null);
        setBooleanField(term136, term136.getClass(), "closed", true);
        setField(term136, term136.getClass(), "runWhenClosed", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("top.gcszhn.movie.service.AutoCacheInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isClosed", argTypes, term136, args);
    }

};


