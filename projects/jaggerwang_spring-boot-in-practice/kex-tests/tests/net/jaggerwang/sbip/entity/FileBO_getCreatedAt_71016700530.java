package net.jaggerwang.sbip.entity;

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
import static net.jaggerwang.sbip.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class FileBO_getCreatedAt_71016700530 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11590;

    public FileBO_getCreatedAt_71016700530() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11590 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO"));
        setField(term11590, term11590.getClass(), "id", null);
        setField(term11590, term11590.getClass(), "userId", null);
        setField(term11590, term11590.getClass(), "region", null);
        setField(term11590, term11590.getClass(), "bucket", null);
        setField(term11590, term11590.getClass(), "path", null);
        setField(term11590, term11590.getClass(), "meta", null);
        setField(term11590, term11590.getClass(), "createdAt", null);
        setField(term11590, term11590.getClass(), "updatedAt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.FileBO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCreatedAt", argTypes, term11590, args);
    }

};


