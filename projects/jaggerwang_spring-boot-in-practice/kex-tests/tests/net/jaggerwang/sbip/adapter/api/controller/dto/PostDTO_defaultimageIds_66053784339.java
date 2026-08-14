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

public class PostDTO_defaultimageIds_66053784339 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90130;

    public PostDTO_defaultimageIds_66053784339() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term90130 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.PostDTO"));
        setField(term90130, term90130.getClass(), "id", null);
        setField(term90130, term90130.getClass(), "userId", null);
        setField(term90130, term90130.getClass(), "type", null);
        setField(term90130, term90130.getClass(), "text", null);
        setField(term90130, term90130.getClass(), "imageIds", null);
        setField(term90130, term90130.getClass(), "videoId", null);
        setField(term90130, term90130.getClass(), "createdAt", null);
        setField(term90130, term90130.getClass(), "updatedAt", null);
        setField(term90130, term90130.getClass(), "user", null);
        setField(term90130, term90130.getClass(), "images", null);
        setField(term90130, term90130.getClass(), "video", null);
        setField(term90130, term90130.getClass(), "stat", null);
        setField(term90130, term90130.getClass(), "liked", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.PostDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "$default$imageIds", argTypes, term90130, args);
    }

};


