package net.jaggerwang.sbip.adapter.api.controller.dto;

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
import static net.jaggerwang.sbip.adapter.api.controller.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class PostDTO_setUpdatedAt_197194122062 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90153;

    public PostDTO_setUpdatedAt_197194122062() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term90153 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.PostDTO"));
        setField(term90153, term90153.getClass(), "id", null);
        setField(term90153, term90153.getClass(), "userId", null);
        setField(term90153, term90153.getClass(), "type", null);
        setField(term90153, term90153.getClass(), "text", null);
        setField(term90153, term90153.getClass(), "imageIds", null);
        setField(term90153, term90153.getClass(), "videoId", null);
        setField(term90153, term90153.getClass(), "createdAt", null);
        setField(term90153, term90153.getClass(), "updatedAt", null);
        setField(term90153, term90153.getClass(), "user", null);
        setField(term90153, term90153.getClass(), "images", null);
        setField(term90153, term90153.getClass(), "video", null);
        setField(term90153, term90153.getClass(), "stat", null);
        setField(term90153, term90153.getClass(), "liked", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.PostDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUpdatedAt", argTypes, term90153, args);
    }

};


