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

public class PostDTO_setLiked_74113413667 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90158;

    public PostDTO_setLiked_74113413667() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term90158 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.PostDTO"));
        setField(term90158, term90158.getClass(), "id", null);
        setField(term90158, term90158.getClass(), "userId", null);
        setField(term90158, term90158.getClass(), "type", null);
        setField(term90158, term90158.getClass(), "text", null);
        setField(term90158, term90158.getClass(), "imageIds", null);
        setField(term90158, term90158.getClass(), "videoId", null);
        setField(term90158, term90158.getClass(), "createdAt", null);
        setField(term90158, term90158.getClass(), "updatedAt", null);
        setField(term90158, term90158.getClass(), "user", null);
        setField(term90158, term90158.getClass(), "images", null);
        setField(term90158, term90158.getClass(), "video", null);
        setField(term90158, term90158.getClass(), "stat", null);
        setField(term90158, term90158.getClass(), "liked", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.PostDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setLiked", argTypes, term90158, args);
    }

};


