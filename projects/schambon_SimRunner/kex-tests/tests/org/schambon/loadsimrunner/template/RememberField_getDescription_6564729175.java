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

public class RememberField_getDescription_6564729175 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term428;

    public RememberField_getDescription_6564729175() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term428 = newInstance(Class.forName("org.schambon.loadsimrunner.template.RememberField"));
        setField(term428, term428.getClass(), "field", null);
        setBooleanField(term428, term428.getClass(), "preload", false);
        setField(term428, term428.getClass(), "compound", null);
        setField(term428, term428.getClass(), "name", null);
        setIntField(term428, term428.getClass(), "number", 0);
        setIntField(term428, term428.getClass(), "capped", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.schambon.loadsimrunner.template.RememberField");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDescription", argTypes, term428, args);
    }

};


