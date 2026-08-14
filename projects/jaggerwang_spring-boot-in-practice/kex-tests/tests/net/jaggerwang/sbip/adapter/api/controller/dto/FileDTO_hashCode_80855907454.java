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

public class FileDTO_hashCode_80855907454 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28128;

    public FileDTO_hashCode_80855907454() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28128 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.FileDTO"));
        setField(term28128, term28128.getClass(), "id", null);
        setField(term28128, term28128.getClass(), "userId", null);
        setField(term28128, term28128.getClass(), "region", null);
        setField(term28128, term28128.getClass(), "bucket", null);
        setField(term28128, term28128.getClass(), "path", null);
        setField(term28128, term28128.getClass(), "meta", null);
        setField(term28128, term28128.getClass(), "createdAt", null);
        setField(term28128, term28128.getClass(), "updatedAt", null);
        setField(term28128, term28128.getClass(), "url", null);
        setField(term28128, term28128.getClass(), "thumbs", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.FileDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term28128, args);
    }

};


