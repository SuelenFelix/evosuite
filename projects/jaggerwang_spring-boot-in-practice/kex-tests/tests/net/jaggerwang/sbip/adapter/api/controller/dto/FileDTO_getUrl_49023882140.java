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

public class FileDTO_getUrl_49023882140 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28114;

    public FileDTO_getUrl_49023882140() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28114 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.FileDTO"));
        setField(term28114, term28114.getClass(), "id", null);
        setField(term28114, term28114.getClass(), "userId", null);
        setField(term28114, term28114.getClass(), "region", null);
        setField(term28114, term28114.getClass(), "bucket", null);
        setField(term28114, term28114.getClass(), "path", null);
        setField(term28114, term28114.getClass(), "meta", null);
        setField(term28114, term28114.getClass(), "createdAt", null);
        setField(term28114, term28114.getClass(), "updatedAt", null);
        setField(term28114, term28114.getClass(), "url", null);
        setField(term28114, term28114.getClass(), "thumbs", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.FileDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUrl", argTypes, term28114, args);
    }

};


