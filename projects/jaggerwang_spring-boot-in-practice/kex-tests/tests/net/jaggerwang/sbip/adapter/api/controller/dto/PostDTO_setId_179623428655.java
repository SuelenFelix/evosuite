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

public class PostDTO_setId_179623428655 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90146;

    public PostDTO_setId_179623428655() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term90146 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.PostDTO"));
        setField(term90146, term90146.getClass(), "id", null);
        setField(term90146, term90146.getClass(), "userId", null);
        setField(term90146, term90146.getClass(), "type", null);
        setField(term90146, term90146.getClass(), "text", null);
        setField(term90146, term90146.getClass(), "imageIds", null);
        setField(term90146, term90146.getClass(), "videoId", null);
        setField(term90146, term90146.getClass(), "createdAt", null);
        setField(term90146, term90146.getClass(), "updatedAt", null);
        setField(term90146, term90146.getClass(), "user", null);
        setField(term90146, term90146.getClass(), "images", null);
        setField(term90146, term90146.getClass(), "video", null);
        setField(term90146, term90146.getClass(), "stat", null);
        setField(term90146, term90146.getClass(), "liked", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.PostDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setId", argTypes, term90146, args);
    }

};


