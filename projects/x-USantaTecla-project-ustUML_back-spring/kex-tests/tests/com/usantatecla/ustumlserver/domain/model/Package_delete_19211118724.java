package com.usantatecla.ustumlserver.domain.model;

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
import static com.usantatecla.ustumlserver.domain.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class Package_delete_19211118724 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57203;

    public Package_delete_19211118724() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term57204 = new ArrayList();
        ArrayList term57232 = new ArrayList();
        ((ArrayList) term57232).add((Object)null);
        ((ArrayList) term57232).add((Object)null);
        term57203 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Package"));
        setField(term57203, term57203.getClass(), "members", term57204);
        setField(term57203, term57203.getClass(), "id", "uQjzusifTg");
        setField(term57203, term57203.getClass(), "name", "mOulGkUjOk");
        setField(term57203, term57203.getClass(), "relations", term57232);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.model.Package");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.usantatecla.ustumlserver.domain.model.Member");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "delete", argTypes, term57203, args);
    }

};


