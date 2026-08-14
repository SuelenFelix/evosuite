package org.schambon.loadsimrunner.template;

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
import static org.schambon.loadsimrunner.template.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;

public class RememberField_getDescription_6564729172 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term366;

    public RememberField_getDescription_6564729172() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term380 = new ArrayList();
        term366 = newInstance(Class.forName("org.schambon.loadsimrunner.template.RememberField"));
        setField(term366, term366.getClass(), "field", "HyxfbSQYBe");
        setBooleanField(term366, term366.getClass(), "preload", false);
        setField(term366, term366.getClass(), "compound", term380);
        setField(term366, term366.getClass(), "name", "pCTimMblYc");
        setIntField(term366, term366.getClass(), "number", -1922583790);
        setIntField(term366, term366.getClass(), "capped", -616727354);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.schambon.loadsimrunner.template.RememberField");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDescription", argTypes, term366, args);
    }

};


