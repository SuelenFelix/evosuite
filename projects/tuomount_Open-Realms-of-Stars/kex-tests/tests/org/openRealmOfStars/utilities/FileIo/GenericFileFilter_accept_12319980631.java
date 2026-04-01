package org.openRealmOfStars.utilities.FileIo;

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
import static org.openRealmOfStars.utilities.FileIo.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class GenericFileFilter_accept_12319980631 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term111;
     Object term124;

    public GenericFileFilter_accept_12319980631() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term111 = newInstance(Class.forName("org.openRealmOfStars.utilities.FileIo.GenericFileFilter"));
        setField(term111, term111.getClass(), "extension", "EGtDIRbSSb");
        Class<? extends Object> term192 = Class.forName((String) "java.io.File$PathStatus");
        Field term191 = ((Class) term192).getDeclaredField((String) "INVALID");
        ((Field) term191).setAccessible(true);
        Object enum0 = ((Field) term191).get((Object) null);
        term124 = newInstance(Class.forName("java.io.File"));
        setField(term124, term124.getClass(), "path", "SzjVpOQTyS");
        setField(term124, term124.getClass(), "status", enum0);
        setIntField(term124, term124.getClass(), "prefixLength", 568599855);
        setField(term124, term124.getClass(), "filePath", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.utilities.FileIo.GenericFileFilter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.File");
        Object[] args = new Object[1];
        args[0] = term124;
        callMethod(klass, "accept", argTypes, term111, args);
    }

};


