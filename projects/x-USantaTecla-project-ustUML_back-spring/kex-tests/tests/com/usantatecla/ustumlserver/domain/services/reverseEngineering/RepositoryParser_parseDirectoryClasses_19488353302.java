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
import java.util.ArrayList;
import java.lang.Object;
import java.lang.String;

public class RepositoryParser_parseDirectoryClasses_19488353302 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term327;
     Object term339;
     Object term372;

    public RepositoryParser_parseDirectoryClasses_19488353302() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term328 = new HashMap();
        term327 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.services.reverseEngineering.RepositoryParser"));
        setField(term327, term327.getClass(), "memberPersistence", null);
        setField(term327, term327.getClass(), "classMap", term328);
        ArrayList term340 = new ArrayList();
        ((ArrayList) term340).add((Object)null);
        ((ArrayList) term340).add((Object)null);
        ((ArrayList) term340).add((Object)null);
        ((ArrayList) term340).add((Object)null);
        ((ArrayList) term340).add((Object)null);
        ((ArrayList) term340).add((Object)null);
        ArrayList term368 = new ArrayList();
        term339 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Package"));
        setField(term339, term339.getClass(), "members", term340);
        setField(term339, term339.getClass(), "id", "yVMkkQhvmN");
        setField(term339, term339.getClass(), "name", "mvrkADEgpp");
        setField(term339, term339.getClass(), "relations", term368);
        Class<? extends Object> term429 = Class.forName((String) "java.io.File$PathStatus");
        Field term428 = ((Class) term429).getDeclaredField((String) "CHECKED");
        ((Field) term428).setAccessible(true);
        Object enum1 = ((Field) term428).get((Object) null);
        term372 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.services.reverseEngineering.Directory"));
        Object term373 = newInstance(Class.forName("java.io.File"));
        setField(term373, term373.getClass(), "path", "pXOkjyeIRb");
        setField(term373, term373.getClass(), "status", enum1);
        setIntField(term373, term373.getClass(), "prefixLength", -616727354);
        setField(term373, term373.getClass(), "filePath", null);
        setField(term372, term372.getClass(), "file", term373);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.services.reverseEngineering.RepositoryParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.usantatecla.ustumlserver.domain.model.Package");
        argTypes[1] = Class.forName("com.usantatecla.ustumlserver.domain.services.reverseEngineering.Directory");
        Object[] args = new Object[2];
        args[0] = term339;
        args[1] = term372;
        callMethod(klass, "parseDirectoryClasses", argTypes, term327, args);
    }

};


