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

public class File_setRegion_179999681740 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22574;

    public File_setRegion_179999681740() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22574 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.File"));
        setField(term22574, term22574.getClass(), "id", null);
        setField(term22574, term22574.getClass(), "userId", null);
        setField(term22574, term22574.getClass(), "region", null);
        setField(term22574, term22574.getClass(), "bucket", null);
        setField(term22574, term22574.getClass(), "path", null);
        setField(term22574, term22574.getClass(), "meta", null);
        setField(term22574, term22574.getClass(), "createdAt", null);
        setField(term22574, term22574.getClass(), "updatedAt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.File");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("net.jaggerwang.sbip.entity.FileBO$Region");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setRegion", argTypes, term22574, args);
    }

};


