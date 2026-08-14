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

public class PostDTO_PostDTOBuilder_id_166662984417 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53162;

    public PostDTO_PostDTOBuilder_id_166662984417() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53162 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.PostDTO$PostDTOBuilder"));
        setField(term53162, term53162.getClass(), "id", null);
        setField(term53162, term53162.getClass(), "userId", null);
        setField(term53162, term53162.getClass(), "type", null);
        setField(term53162, term53162.getClass(), "text", null);
        setBooleanField(term53162, term53162.getClass(), "imageIds$set", false);
        setField(term53162, term53162.getClass(), "imageIds$value", null);
        setField(term53162, term53162.getClass(), "videoId", null);
        setField(term53162, term53162.getClass(), "createdAt", null);
        setField(term53162, term53162.getClass(), "updatedAt", null);
        setField(term53162, term53162.getClass(), "user", null);
        setBooleanField(term53162, term53162.getClass(), "images$set", false);
        setField(term53162, term53162.getClass(), "images$value", null);
        setField(term53162, term53162.getClass(), "video", null);
        setField(term53162, term53162.getClass(), "stat", null);
        setField(term53162, term53162.getClass(), "liked", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.PostDTO$PostDTOBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "id", argTypes, term53162, args);
    }

};


