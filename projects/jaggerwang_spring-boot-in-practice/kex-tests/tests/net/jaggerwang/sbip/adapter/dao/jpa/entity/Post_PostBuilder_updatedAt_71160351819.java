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

public class Post_PostBuilder_updatedAt_71160351819 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27246;

    public Post_PostBuilder_updatedAt_71160351819() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27246 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.Post$PostBuilder"));
        setField(term27246, term27246.getClass(), "id", null);
        setField(term27246, term27246.getClass(), "userId", null);
        setField(term27246, term27246.getClass(), "type", null);
        setField(term27246, term27246.getClass(), "text", null);
        setField(term27246, term27246.getClass(), "imageIds", null);
        setField(term27246, term27246.getClass(), "videoId", null);
        setField(term27246, term27246.getClass(), "createdAt", null);
        setField(term27246, term27246.getClass(), "updatedAt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.Post$PostBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "updatedAt", argTypes, term27246, args);
    }

};


