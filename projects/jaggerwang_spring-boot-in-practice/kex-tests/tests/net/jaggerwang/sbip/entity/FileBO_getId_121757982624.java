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

public class FileBO_getId_121757982624 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11584;

    public FileBO_getId_121757982624() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11584 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO"));
        setField(term11584, term11584.getClass(), "id", null);
        setField(term11584, term11584.getClass(), "userId", null);
        setField(term11584, term11584.getClass(), "region", null);
        setField(term11584, term11584.getClass(), "bucket", null);
        setField(term11584, term11584.getClass(), "path", null);
        setField(term11584, term11584.getClass(), "meta", null);
        setField(term11584, term11584.getClass(), "createdAt", null);
        setField(term11584, term11584.getClass(), "updatedAt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.FileBO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term11584, args);
    }

};


