package com.dmatik.orefalerts.entity;

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
import static com.dmatik.orefalerts.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Boolean;
import java.lang.Object;

public class CurrentAlertResponse_setCurrent_8382488473 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term546;
     Object term647;

    public CurrentAlertResponse_setCurrent_8382488473() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term547 = new Boolean(true);
        term546 = newInstance(Class.forName("com.dmatik.orefalerts.entity.CurrentAlertResponse"));
        Object term549 = newInstance(Class.forName("com.dmatik.orefalerts.entity.CurrentAlert"));
        Object[] term586 = (Object[]) newArray("java.lang.String", 4);
        setField(term546, term546.getClass(), "alert", term547);
        setField(term549, term549.getClass(), "id", "BYqFIqCKAV");
        setField(term549, term549.getClass(), "cat", "vrQLuWIDJX");
        setField(term549, term549.getClass(), "title", "flxyYxBRtu");
        setElement(term586, 0, "OclPbYPkcH");
        setElement(term586, 1, "IoAlmYsBwc");
        setElement(term586, 2, "TEParAifyi");
        setElement(term586, 3, "OWDIEULEFu");
        setField(term549, term549.getClass(), "data", term586);
        setField(term549, term549.getClass(), "desc", "dWRymuLBtr");
        setField(term546, term546.getClass(), "current", term549);
        term647 = newInstance(Class.forName("com.dmatik.orefalerts.entity.CurrentAlert"));
        Object[] term684 = (Object[]) newArray("java.lang.String", 1);
        setField(term647, term647.getClass(), "id", "AijpHYOFuy");
        setField(term647, term647.getClass(), "cat", "SbAoxhfrkn");
        setField(term647, term647.getClass(), "title", "kuTXqwMtDB");
        setElement(term684, 0, "Ghbwtircqb");
        setField(term647, term647.getClass(), "data", term684);
        setField(term647, term647.getClass(), "desc", "xrwlQZdwCp");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.dmatik.orefalerts.entity.CurrentAlertResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.dmatik.orefalerts.entity.CurrentAlert");
        Object[] args = new Object[1];
        args[0] = term647;
        callMethod(klass, "setCurrent", argTypes, term546, args);
    }

};


