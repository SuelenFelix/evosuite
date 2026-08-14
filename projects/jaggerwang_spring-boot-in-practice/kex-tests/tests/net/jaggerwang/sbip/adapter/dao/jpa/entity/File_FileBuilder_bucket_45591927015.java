package net.jaggerwang.sbip.adapter.dao.jpa.entity;

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
import static net.jaggerwang.sbip.adapter.dao.jpa.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class File_FileBuilder_bucket_45591927015 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3598;

    public File_FileBuilder_bucket_45591927015() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3598 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.File$FileBuilder"));
        setField(term3598, term3598.getClass(), "id", null);
        setField(term3598, term3598.getClass(), "userId", null);
        setField(term3598, term3598.getClass(), "region", null);
        setField(term3598, term3598.getClass(), "bucket", null);
        setField(term3598, term3598.getClass(), "path", null);
        setField(term3598, term3598.getClass(), "meta", null);
        setField(term3598, term3598.getClass(), "createdAt", null);
        setField(term3598, term3598.getClass(), "updatedAt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.File$FileBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "bucket", argTypes, term3598, args);
    }

};


