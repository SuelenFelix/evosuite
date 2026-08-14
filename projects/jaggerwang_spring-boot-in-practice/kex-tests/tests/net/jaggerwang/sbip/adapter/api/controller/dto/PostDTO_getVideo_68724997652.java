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

public class PostDTO_getVideo_68724997652 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90143;

    public PostDTO_getVideo_68724997652() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term90143 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.PostDTO"));
        setField(term90143, term90143.getClass(), "id", null);
        setField(term90143, term90143.getClass(), "userId", null);
        setField(term90143, term90143.getClass(), "type", null);
        setField(term90143, term90143.getClass(), "text", null);
        setField(term90143, term90143.getClass(), "imageIds", null);
        setField(term90143, term90143.getClass(), "videoId", null);
        setField(term90143, term90143.getClass(), "createdAt", null);
        setField(term90143, term90143.getClass(), "updatedAt", null);
        setField(term90143, term90143.getClass(), "user", null);
        setField(term90143, term90143.getClass(), "images", null);
        setField(term90143, term90143.getClass(), "video", null);
        setField(term90143, term90143.getClass(), "stat", null);
        setField(term90143, term90143.getClass(), "liked", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.PostDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVideo", argTypes, term90143, args);
    }

};


