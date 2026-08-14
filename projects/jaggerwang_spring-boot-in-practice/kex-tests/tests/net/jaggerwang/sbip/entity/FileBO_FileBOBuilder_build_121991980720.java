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

public class FileBO_FileBOBuilder_build_121991980720 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3603;

    public FileBO_FileBOBuilder_build_121991980720() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3603 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$FileBOBuilder"));
        setField(term3603, term3603.getClass(), "id", null);
        setField(term3603, term3603.getClass(), "userId", null);
        setField(term3603, term3603.getClass(), "region", null);
        setField(term3603, term3603.getClass(), "bucket", null);
        setField(term3603, term3603.getClass(), "path", null);
        setField(term3603, term3603.getClass(), "meta", null);
        setField(term3603, term3603.getClass(), "createdAt", null);
        setField(term3603, term3603.getClass(), "updatedAt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.FileBO$FileBOBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term3603, args);
    }

};


