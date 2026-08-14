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

public class RememberField_isSimple_17995974864 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term424;

    public RememberField_isSimple_17995974864() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term424 = newInstance(Class.forName("org.schambon.loadsimrunner.template.RememberField"));
        setField(term424, term424.getClass(), "field", null);
        setBooleanField(term424, term424.getClass(), "preload", false);
        setField(term424, term424.getClass(), "compound", null);
        setField(term424, term424.getClass(), "name", null);
        setIntField(term424, term424.getClass(), "number", 0);
        setIntField(term424, term424.getClass(), "capped", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.schambon.loadsimrunner.template.RememberField");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isSimple", argTypes, term424, args);
    }

};


