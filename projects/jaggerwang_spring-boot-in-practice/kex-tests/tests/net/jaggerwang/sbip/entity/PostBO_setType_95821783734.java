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

public class PostBO_setType_95821783734 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19471;

    public PostBO_setType_95821783734() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19471 = newInstance(Class.forName("net.jaggerwang.sbip.entity.PostBO"));
        setField(term19471, term19471.getClass(), "id", null);
        setField(term19471, term19471.getClass(), "userId", null);
        setField(term19471, term19471.getClass(), "type", null);
        setField(term19471, term19471.getClass(), "text", null);
        setField(term19471, term19471.getClass(), "imageIds", null);
        setField(term19471, term19471.getClass(), "videoId", null);
        setField(term19471, term19471.getClass(), "createdAt", null);
        setField(term19471, term19471.getClass(), "updatedAt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.PostBO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("net.jaggerwang.sbip.entity.PostBO$Type");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setType", argTypes, term19471, args);
    }

};


