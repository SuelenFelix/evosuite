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

public class AutoCacheInputStream_whenClosed_3019689103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99;

    public AutoCacheInputStream_whenClosed_3019689103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term104 = new ArrayList();
        ((ArrayList) term104).add((Object)null);
        ((ArrayList) term104).add((Object)null);
        ((ArrayList) term104).add((Object)null);
        term99 = newInstance(Class.forName("top.gcszhn.movie.service.AutoCacheInputStream"));
        Object term100 = newInstance(Class.forName("java.io.FileOutputStream"));
        Object term101 = newInstance(Class.forName("java.io.FileDescriptor"));
        Object term122 = newInstance(Class.forName("java.lang.Object"));
        Object term124 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term101, term101.getClass(), "fd", -1);
        setLongField(term101, term101.getClass(), "handle", -1L);
        setField(term101, term101.getClass(), "parent", null);
        setField(term101, term101.getClass(), "otherParents", term104);
        setBooleanField(term101, term101.getClass(), "closed", true);
        setBooleanField(term101, term101.getClass(), "append", false);
        setField(term101, term101.getClass(), "cleanup", null);
        setField(term100, term100.getClass(), "fd", term101);
        setField(term100, term100.getClass(), "channel", null);
        setField(term100, term100.getClass(), "path", "xxtlPwDYFs");
        setField(term100, term100.getClass(), "closeLock", term122);
        setBooleanField(term100, term100.getClass(), "closed", true);
        setField(term100, term100.getClass(), "altFinalizer", term124);
        setField(term99, term99.getClass(), "fos", term100);
        setField(term99, term99.getClass(), "in", null);
        setBooleanField(term99, term99.getClass(), "closed", false);
        setField(term99, term99.getClass(), "runWhenClosed", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("top.gcszhn.movie.service.AutoCacheInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Runnable");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "whenClosed", argTypes, term99, args);
    }

};


