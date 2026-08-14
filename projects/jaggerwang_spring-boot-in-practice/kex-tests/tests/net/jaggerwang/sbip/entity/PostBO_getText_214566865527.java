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

public class PostBO_getText_214566865527 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19464;

    public PostBO_getText_214566865527() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19464 = newInstance(Class.forName("net.jaggerwang.sbip.entity.PostBO"));
        setField(term19464, term19464.getClass(), "id", null);
        setField(term19464, term19464.getClass(), "userId", null);
        setField(term19464, term19464.getClass(), "type", null);
        setField(term19464, term19464.getClass(), "text", null);
        setField(term19464, term19464.getClass(), "imageIds", null);
        setField(term19464, term19464.getClass(), "videoId", null);
        setField(term19464, term19464.getClass(), "createdAt", null);
        setField(term19464, term19464.getClass(), "updatedAt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.PostBO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getText", argTypes, term19464, args);
    }

};


