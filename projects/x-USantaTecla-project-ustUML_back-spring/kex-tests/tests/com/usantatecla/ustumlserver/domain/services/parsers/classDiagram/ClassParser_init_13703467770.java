package com.usantatecla.ustumlserver.domain.services.parsers.classDiagram;

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
import static com.usantatecla.ustumlserver.domain.services.parsers.classDiagram.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;

public class ClassParser_init_13703467770 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7067;

    public ClassParser_init_13703467770() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term7162 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.Role");
        Field term7161 = ((Class) term7162).getDeclaredField((String) "AUTHENTICATED");
        ((Field) term7161).setAccessible(true);
        Object enum17 = ((Field) term7161).get((Object) null);
        ArrayList term7109 = new ArrayList();
        ArrayList term7137 = new ArrayList();
        term7067 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Account"));
        setField(term7067, term7067.getClass(), "email", "VeDtgDzGAN");
        setField(term7067, term7067.getClass(), "password", "aWYOWZFyaX");
        setField(term7067, term7067.getClass(), "role", enum17);
        setField(term7067, term7067.getClass(), "projects", term7109);
        setField(term7067, term7067.getClass(), "id", "BRIVNtfUWU");
        setField(term7067, term7067.getClass(), "name", "DbiCVtPPCT");
        setField(term7067, term7067.getClass(), "relations", term7137);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.services.parsers.classDiagram.ClassParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.usantatecla.ustumlserver.domain.model.Account");
        Object[] args = new Object[1];
        args[0] = term7067;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


