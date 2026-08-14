package com.usantatecla.ustumlserver.domain.services.reverseEngineering;

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
import static com.usantatecla.ustumlserver.domain.services.reverseEngineering.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.lang.Object;
import java.lang.String;

public class RepositoryParser_get_6195366631 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term114;
     Object term126;

    public RepositoryParser_get_6195366631() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term115 = new HashMap();
        term114 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.services.reverseEngineering.RepositoryParser"));
        setField(term114, term114.getClass(), "memberPersistence", null);
        setField(term114, term114.getClass(), "classMap", term115);
        Class<? extends Object> term185 = Class.forName((String) "java.io.File$PathStatus");
        Field term184 = ((Class) term185).getDeclaredField((String) "INVALID");
        ((Field) term184).setAccessible(true);
        Object enum0 = ((Field) term184).get((Object) null);
        term126 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.services.reverseEngineering.Directory"));
        Object term127 = newInstance(Class.forName("java.io.File"));
        setField(term127, term127.getClass(), "path", "LvJFtLBaxj");
        setField(term127, term127.getClass(), "status", enum0);
        setIntField(term127, term127.getClass(), "prefixLength", 391863371);
        setField(term127, term127.getClass(), "filePath", null);
        setField(term126, term126.getClass(), "file", term127);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.services.reverseEngineering.RepositoryParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.usantatecla.ustumlserver.domain.services.reverseEngineering.Directory");
        Object[] args = new Object[1];
        args[0] = term126;
        callMethod(klass, "get", argTypes, term114, args);
    }

};


