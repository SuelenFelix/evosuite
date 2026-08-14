package net.jaggerwang.sbip.adapter.dao.jpa.entity;

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
import static net.jaggerwang.sbip.adapter.dao.jpa.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Post_setUpdatedAt_145967122445 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11531;

    public Post_setUpdatedAt_145967122445() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11531 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.Post"));
        setField(term11531, term11531.getClass(), "id", null);
        setField(term11531, term11531.getClass(), "userId", null);
        setField(term11531, term11531.getClass(), "type", null);
        setField(term11531, term11531.getClass(), "text", null);
        setField(term11531, term11531.getClass(), "imageIds", null);
        setField(term11531, term11531.getClass(), "videoId", null);
        setField(term11531, term11531.getClass(), "createdAt", null);
        setField(term11531, term11531.getClass(), "updatedAt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.Post");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUpdatedAt", argTypes, term11531, args);
    }

};


