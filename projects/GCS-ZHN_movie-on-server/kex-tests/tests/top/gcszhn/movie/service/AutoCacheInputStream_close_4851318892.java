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

public class AutoCacheInputStream_close_4851318892 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62;

    public AutoCacheInputStream_close_4851318892() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term67 = new ArrayList();
        ((ArrayList) term67).add((Object)null);
        ((ArrayList) term67).add((Object)null);
        ((ArrayList) term67).add((Object)null);
        ((ArrayList) term67).add((Object)null);
        term62 = newInstance(Class.forName("top.gcszhn.movie.service.AutoCacheInputStream"));
        Object term63 = newInstance(Class.forName("java.io.FileOutputStream"));
        Object term64 = newInstance(Class.forName("java.io.FileDescriptor"));
        Object term85 = newInstance(Class.forName("java.lang.Object"));
        Object term87 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term64, term64.getClass(), "fd", -1);
        setLongField(term64, term64.getClass(), "handle", -1L);
        setField(term64, term64.getClass(), "parent", null);
        setField(term64, term64.getClass(), "otherParents", term67);
        setBooleanField(term64, term64.getClass(), "closed", true);
        setBooleanField(term64, term64.getClass(), "append", true);
        setField(term64, term64.getClass(), "cleanup", null);
        setField(term63, term63.getClass(), "fd", term64);
        setField(term63, term63.getClass(), "channel", null);
        setField(term63, term63.getClass(), "path", "MuLcgQHgqz");
        setField(term63, term63.getClass(), "closeLock", term85);
        setBooleanField(term63, term63.getClass(), "closed", true);
        setField(term63, term63.getClass(), "altFinalizer", term87);
        setField(term62, term62.getClass(), "fos", term63);
        setField(term62, term62.getClass(), "in", null);
        setBooleanField(term62, term62.getClass(), "closed", false);
        setField(term62, term62.getClass(), "runWhenClosed", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("top.gcszhn.movie.service.AutoCacheInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "close", argTypes, term62, args);
    }

};


