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

public class FileBO_setBucket_110794232635 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11595;

    public FileBO_setBucket_110794232635() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11595 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO"));
        setField(term11595, term11595.getClass(), "id", null);
        setField(term11595, term11595.getClass(), "userId", null);
        setField(term11595, term11595.getClass(), "region", null);
        setField(term11595, term11595.getClass(), "bucket", null);
        setField(term11595, term11595.getClass(), "path", null);
        setField(term11595, term11595.getClass(), "meta", null);
        setField(term11595, term11595.getClass(), "createdAt", null);
        setField(term11595, term11595.getClass(), "updatedAt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.FileBO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setBucket", argTypes, term11595, args);
    }

};


