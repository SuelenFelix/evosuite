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

public class CurrentAlertResponse_setAlert_3257907802 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term385;
     Object term474;

    public CurrentAlertResponse_setAlert_3257907802() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term386 = new Boolean(false);
        term385 = newInstance(Class.forName("com.dmatik.orefalerts.entity.CurrentAlertResponse"));
        Object term388 = newInstance(Class.forName("com.dmatik.orefalerts.entity.CurrentAlert"));
        Object[] term425 = (Object[]) newArray("java.lang.String", 3);
        setField(term385, term385.getClass(), "alert", term386);
        setField(term388, term388.getClass(), "id", "tbcdzjIfER");
        setField(term388, term388.getClass(), "cat", "HyxfbSQYBe");
        setField(term388, term388.getClass(), "title", "pCTimMblYc");
        setElement(term425, 0, "hNxWaHcfhY");
        setElement(term425, 1, "RkybSrpybU");
        setElement(term425, 2, "xOEqzGAmDU");
        setField(term388, term388.getClass(), "data", term425);
        setField(term388, term388.getClass(), "desc", "eZFUvlxvGV");
        setField(term385, term385.getClass(), "current", term388);
        term474 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.dmatik.orefalerts.entity.CurrentAlertResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[1];
        args[0] = term474;
        callMethod(klass, "setAlert", argTypes, term385, args);
    }

};


