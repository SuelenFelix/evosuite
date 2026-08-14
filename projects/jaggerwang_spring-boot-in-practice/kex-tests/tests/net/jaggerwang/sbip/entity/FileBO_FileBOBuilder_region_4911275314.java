package net.jaggerwang.sbip.entity;

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
import static net.jaggerwang.sbip.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class FileBO_FileBOBuilder_region_4911275314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3597;

    public FileBO_FileBOBuilder_region_4911275314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3597 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$FileBOBuilder"));
        setField(term3597, term3597.getClass(), "id", null);
        setField(term3597, term3597.getClass(), "userId", null);
        setField(term3597, term3597.getClass(), "region", null);
        setField(term3597, term3597.getClass(), "bucket", null);
        setField(term3597, term3597.getClass(), "path", null);
        setField(term3597, term3597.getClass(), "meta", null);
        setField(term3597, term3597.getClass(), "createdAt", null);
        setField(term3597, term3597.getClass(), "updatedAt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.FileBO$FileBOBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("net.jaggerwang.sbip.entity.FileBO$Region");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "region", argTypes, term3597, args);
    }

};


