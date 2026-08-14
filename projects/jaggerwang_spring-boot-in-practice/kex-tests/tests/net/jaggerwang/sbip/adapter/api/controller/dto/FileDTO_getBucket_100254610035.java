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

public class FileDTO_getBucket_100254610035 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28109;

    public FileDTO_getBucket_100254610035() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28109 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.FileDTO"));
        setField(term28109, term28109.getClass(), "id", null);
        setField(term28109, term28109.getClass(), "userId", null);
        setField(term28109, term28109.getClass(), "region", null);
        setField(term28109, term28109.getClass(), "bucket", null);
        setField(term28109, term28109.getClass(), "path", null);
        setField(term28109, term28109.getClass(), "meta", null);
        setField(term28109, term28109.getClass(), "createdAt", null);
        setField(term28109, term28109.getClass(), "updatedAt", null);
        setField(term28109, term28109.getClass(), "url", null);
        setField(term28109, term28109.getClass(), "thumbs", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.FileDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBucket", argTypes, term28109, args);
    }

};


