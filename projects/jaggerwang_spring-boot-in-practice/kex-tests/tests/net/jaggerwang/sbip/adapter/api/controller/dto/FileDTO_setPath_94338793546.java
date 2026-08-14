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

public class FileDTO_setPath_94338793546 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28120;

    public FileDTO_setPath_94338793546() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28120 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.FileDTO"));
        setField(term28120, term28120.getClass(), "id", null);
        setField(term28120, term28120.getClass(), "userId", null);
        setField(term28120, term28120.getClass(), "region", null);
        setField(term28120, term28120.getClass(), "bucket", null);
        setField(term28120, term28120.getClass(), "path", null);
        setField(term28120, term28120.getClass(), "meta", null);
        setField(term28120, term28120.getClass(), "createdAt", null);
        setField(term28120, term28120.getClass(), "updatedAt", null);
        setField(term28120, term28120.getClass(), "url", null);
        setField(term28120, term28120.getClass(), "thumbs", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.FileDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setPath", argTypes, term28120, args);
    }

};


