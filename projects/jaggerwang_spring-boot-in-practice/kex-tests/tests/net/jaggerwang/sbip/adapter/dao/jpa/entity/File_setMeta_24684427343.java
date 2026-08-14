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

public class File_setMeta_24684427343 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22577;

    public File_setMeta_24684427343() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22577 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.File"));
        setField(term22577, term22577.getClass(), "id", null);
        setField(term22577, term22577.getClass(), "userId", null);
        setField(term22577, term22577.getClass(), "region", null);
        setField(term22577, term22577.getClass(), "bucket", null);
        setField(term22577, term22577.getClass(), "path", null);
        setField(term22577, term22577.getClass(), "meta", null);
        setField(term22577, term22577.getClass(), "createdAt", null);
        setField(term22577, term22577.getClass(), "updatedAt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.File");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setMeta", argTypes, term22577, args);
    }

};


