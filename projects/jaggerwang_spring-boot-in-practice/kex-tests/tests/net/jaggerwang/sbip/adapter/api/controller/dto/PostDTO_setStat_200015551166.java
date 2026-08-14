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

public class PostDTO_setStat_200015551166 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90157;

    public PostDTO_setStat_200015551166() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term90157 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.PostDTO"));
        setField(term90157, term90157.getClass(), "id", null);
        setField(term90157, term90157.getClass(), "userId", null);
        setField(term90157, term90157.getClass(), "type", null);
        setField(term90157, term90157.getClass(), "text", null);
        setField(term90157, term90157.getClass(), "imageIds", null);
        setField(term90157, term90157.getClass(), "videoId", null);
        setField(term90157, term90157.getClass(), "createdAt", null);
        setField(term90157, term90157.getClass(), "updatedAt", null);
        setField(term90157, term90157.getClass(), "user", null);
        setField(term90157, term90157.getClass(), "images", null);
        setField(term90157, term90157.getClass(), "video", null);
        setField(term90157, term90157.getClass(), "stat", null);
        setField(term90157, term90157.getClass(), "liked", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.PostDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.PostStatDTO");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setStat", argTypes, term90157, args);
    }

};


