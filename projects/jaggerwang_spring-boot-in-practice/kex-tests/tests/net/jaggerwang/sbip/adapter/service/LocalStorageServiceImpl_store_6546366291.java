package net.jaggerwang.sbip.adapter.service;

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
import static net.jaggerwang.sbip.adapter.service.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class LocalStorageServiceImpl_store_6546366291 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term26;
     Object term32;

    public LocalStorageServiceImpl_store_6546366291() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.service.LocalStorageServiceImpl"));
        setField(term1, term1.getClass(), "uploadDir", "PAEBtnZtTD");
        term26 = (byte[]) newByteArray(5);
        setByteElement(term26, 0, (byte) 47);
        setByteElement(term26, 1, (byte) 48);
        setByteElement(term26, 2, (byte) 89);
        setByteElement(term26, 3, (byte) 75);
        setByteElement(term26, 4, (byte) 18);
        Long term45 = new Long(2442117782898005296L);
        term32 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        setField(term32, term32.getClass(), "name", "MuLcgQHgqz");
        setField(term32, term32.getClass(), "size", term45);
        setField(term32, term32.getClass(), "type", "xxtlPwDYFs");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.service.LocalStorageServiceImpl");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Array.newInstance(byte.class, 0).getClass();
        argTypes[2] = Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta");
        Object[] args = new Object[3];
        args[0] = "sjlJAEtRrb";
        args[1] = term26;
        args[2] = term32;
        callMethod(klass, "store", argTypes, term1, args);
    }

};


