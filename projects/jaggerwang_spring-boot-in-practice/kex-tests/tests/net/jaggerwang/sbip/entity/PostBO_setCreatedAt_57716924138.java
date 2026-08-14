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

public class PostBO_setCreatedAt_57716924138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19475;

    public PostBO_setCreatedAt_57716924138() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19475 = newInstance(Class.forName("net.jaggerwang.sbip.entity.PostBO"));
        setField(term19475, term19475.getClass(), "id", null);
        setField(term19475, term19475.getClass(), "userId", null);
        setField(term19475, term19475.getClass(), "type", null);
        setField(term19475, term19475.getClass(), "text", null);
        setField(term19475, term19475.getClass(), "imageIds", null);
        setField(term19475, term19475.getClass(), "videoId", null);
        setField(term19475, term19475.getClass(), "createdAt", null);
        setField(term19475, term19475.getClass(), "updatedAt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.PostBO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setCreatedAt", argTypes, term19475, args);
    }

};


