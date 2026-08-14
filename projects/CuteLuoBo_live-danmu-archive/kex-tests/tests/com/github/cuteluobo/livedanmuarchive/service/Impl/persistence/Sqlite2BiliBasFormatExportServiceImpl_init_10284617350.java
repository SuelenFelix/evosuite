package com.github.cuteluobo.livedanmuarchive.service.Impl.persistence;

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
import static com.github.cuteluobo.livedanmuarchive.service.Impl.persistence.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;
import java.lang.Object;
import java.lang.String;

public class Sqlite2BiliBasFormatExportServiceImpl_init_10284617350 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4638;
     Object term4694;

    public Sqlite2BiliBasFormatExportServiceImpl_init_10284617350() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4731 = Class.forName((String) "java.io.File$PathStatus");
        Field term4730 = ((Class) term4731).getDeclaredField((String) "CHECKED");
        ((Field) term4730).setAccessible(true);
        Object enum16 = ((Field) term4730).get((Object) null);
        Object term4641 = newInstance(Class.forName("java.io.File"));
        setField(term4641, term4641.getClass(), "path", "OJJtVNPyKZ");
        setField(term4641, term4641.getClass(), "status", enum16);
        setIntField(term4641, term4641.getClass(), "prefixLength", 1532716628);
        setField(term4641, term4641.getClass(), "filePath", null);
        Object term4659 = newInstance(Class.forName("java.io.File"));
        setField(term4659, term4659.getClass(), "path", "");
        setField(term4659, term4659.getClass(), "status", enum16);
        setIntField(term4659, term4659.getClass(), "prefixLength", -1801760683);
        setField(term4659, term4659.getClass(), "filePath", null);
        Object term4663 = newInstance(Class.forName("java.io.File"));
        setField(term4663, term4663.getClass(), "path", null);
        setField(term4663, term4663.getClass(), "status", null);
        setIntField(term4663, term4663.getClass(), "prefixLength", 1141317871);
        setField(term4663, term4663.getClass(), "filePath", null);
        term4638 = new LinkedList();
        ((LinkedList) term4638).add(term4641);
        ((LinkedList) term4638).add(term4659);
        ((LinkedList) term4638).add(term4663);
        ((LinkedList) term4638).add((Object)null);
        ((LinkedList) term4638).add((Object)null);
        term4694 = newInstance(Class.forName("java.io.File"));
        setField(term4694, term4694.getClass(), "path", "wfaXBpWAUH");
        setField(term4694, term4694.getClass(), "status", enum16);
        setIntField(term4694, term4694.getClass(), "prefixLength", -893623680);
        setField(term4694, term4694.getClass(), "filePath", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.service.Impl.persistence.Sqlite2BiliBasFormatExportServiceImpl");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.util.List");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.io.File");
        argTypes[3] = Class.forName("java.lang.String");
        Object[] args = new Object[4];
        args[0] = term4638;
        args[1] = "fWKJoSoCwE";
        args[2] = term4694;
        args[3] = "VMeAzAHwZj";
        Object instance = callConstructor(klass, argTypes, args);
    }

};


