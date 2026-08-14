package com.selimhorri.pack;

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
import static com.selimhorri.pack.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class UploadDownloadFilesOverHttpApplication_main_8296447581 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26;

    public UploadDownloadFilesOverHttpApplication_main_8296447581() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26 = (Object[]) newArray("java.lang.String", 5);
        setElement(term26, 0, "sjlJAEtRrb");
        setElement(term26, 1, "MuLcgQHgqz");
        setElement(term26, 2, "xxtlPwDYFs");
        setElement(term26, 3, "jJCZpVmanW");
        setElement(term26, 4, "EGtDIRbSSb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.selimhorri.pack.UploadDownloadFilesOverHttpApplication");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term26;
        callMethod(klass, "main", argTypes, null, args);
    }

};


