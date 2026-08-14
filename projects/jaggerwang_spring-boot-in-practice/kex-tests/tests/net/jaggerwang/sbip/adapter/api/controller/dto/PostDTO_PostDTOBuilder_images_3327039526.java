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

public class PostDTO_PostDTOBuilder_images_3327039526 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53189;

    public PostDTO_PostDTOBuilder_images_3327039526() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53189 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.PostDTO$PostDTOBuilder"));
        setField(term53189, term53189.getClass(), "id", null);
        setField(term53189, term53189.getClass(), "userId", null);
        setField(term53189, term53189.getClass(), "type", null);
        setField(term53189, term53189.getClass(), "text", null);
        setBooleanField(term53189, term53189.getClass(), "imageIds$set", false);
        setField(term53189, term53189.getClass(), "imageIds$value", null);
        setField(term53189, term53189.getClass(), "videoId", null);
        setField(term53189, term53189.getClass(), "createdAt", null);
        setField(term53189, term53189.getClass(), "updatedAt", null);
        setField(term53189, term53189.getClass(), "user", null);
        setBooleanField(term53189, term53189.getClass(), "images$set", false);
        setField(term53189, term53189.getClass(), "images$value", null);
        setField(term53189, term53189.getClass(), "video", null);
        setField(term53189, term53189.getClass(), "stat", null);
        setField(term53189, term53189.getClass(), "liked", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.PostDTO$PostDTOBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "images", argTypes, term53189, args);
    }

};


