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

public class Package_isPackage_60991225011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57654;

    public Package_isPackage_60991225011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term57655 = new ArrayList();
        ((ArrayList) term57655).add((Object)null);
        ArrayList term57683 = new ArrayList();
        ((ArrayList) term57683).add((Object)null);
        ((ArrayList) term57683).add((Object)null);
        ((ArrayList) term57683).add((Object)null);
        ((ArrayList) term57683).add((Object)null);
        term57654 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Package"));
        setField(term57654, term57654.getClass(), "members", term57655);
        setField(term57654, term57654.getClass(), "id", "IWJWbrHcqm");
        setField(term57654, term57654.getClass(), "name", "ucTcadpUdW");
        setField(term57654, term57654.getClass(), "relations", term57683);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.model.Package");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isPackage", argTypes, term57654, args);
    }

};


