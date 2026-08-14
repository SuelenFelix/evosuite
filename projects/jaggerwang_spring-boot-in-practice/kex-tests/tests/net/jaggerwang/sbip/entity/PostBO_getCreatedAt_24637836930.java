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

public class PostBO_getCreatedAt_24637836930 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19467;

    public PostBO_getCreatedAt_24637836930() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19467 = newInstance(Class.forName("net.jaggerwang.sbip.entity.PostBO"));
        setField(term19467, term19467.getClass(), "id", null);
        setField(term19467, term19467.getClass(), "userId", null);
        setField(term19467, term19467.getClass(), "type", null);
        setField(term19467, term19467.getClass(), "text", null);
        setField(term19467, term19467.getClass(), "imageIds", null);
        setField(term19467, term19467.getClass(), "videoId", null);
        setField(term19467, term19467.getClass(), "createdAt", null);
        setField(term19467, term19467.getClass(), "updatedAt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.PostBO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCreatedAt", argTypes, term19467, args);
    }

};


