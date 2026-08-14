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

public class File_FileBuilder_path_106386179316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3599;

    public File_FileBuilder_path_106386179316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3599 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.File$FileBuilder"));
        setField(term3599, term3599.getClass(), "id", null);
        setField(term3599, term3599.getClass(), "userId", null);
        setField(term3599, term3599.getClass(), "region", null);
        setField(term3599, term3599.getClass(), "bucket", null);
        setField(term3599, term3599.getClass(), "path", null);
        setField(term3599, term3599.getClass(), "meta", null);
        setField(term3599, term3599.getClass(), "createdAt", null);
        setField(term3599, term3599.getClass(), "updatedAt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.File$FileBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "path", argTypes, term3599, args);
    }

};


