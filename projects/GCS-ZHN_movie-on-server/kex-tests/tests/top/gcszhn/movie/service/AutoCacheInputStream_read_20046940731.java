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

public class AutoCacheInputStream_read_20046940731 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25;

    public AutoCacheInputStream_read_20046940731() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term30 = new ArrayList();
        ((ArrayList) term30).add((Object)null);
        ((ArrayList) term30).add((Object)null);
        ((ArrayList) term30).add((Object)null);
        ((ArrayList) term30).add((Object)null);
        ((ArrayList) term30).add((Object)null);
        term25 = newInstance(Class.forName("top.gcszhn.movie.service.AutoCacheInputStream"));
        Object term26 = newInstance(Class.forName("java.io.FileOutputStream"));
        Object term27 = newInstance(Class.forName("java.io.FileDescriptor"));
        Object term48 = newInstance(Class.forName("java.lang.Object"));
        Object term50 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term27, term27.getClass(), "fd", -1);
        setLongField(term27, term27.getClass(), "handle", -1L);
        setField(term27, term27.getClass(), "parent", null);
        setField(term27, term27.getClass(), "otherParents", term30);
        setBooleanField(term27, term27.getClass(), "closed", false);
        setBooleanField(term27, term27.getClass(), "append", false);
        setField(term27, term27.getClass(), "cleanup", null);
        setField(term26, term26.getClass(), "fd", term27);
        setField(term26, term26.getClass(), "channel", null);
        setField(term26, term26.getClass(), "path", "sjlJAEtRrb");
        setField(term26, term26.getClass(), "closeLock", term48);
        setBooleanField(term26, term26.getClass(), "closed", false);
        setField(term26, term26.getClass(), "altFinalizer", term50);
        setField(term25, term25.getClass(), "fos", term26);
        setField(term25, term25.getClass(), "in", null);
        setBooleanField(term25, term25.getClass(), "closed", true);
        setField(term25, term25.getClass(), "runWhenClosed", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("top.gcszhn.movie.service.AutoCacheInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "read", argTypes, term25, args);
    }

};


