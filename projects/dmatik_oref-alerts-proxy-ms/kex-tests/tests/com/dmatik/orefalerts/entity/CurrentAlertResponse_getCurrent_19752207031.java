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

public class CurrentAlertResponse_getCurrent_19752207031 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term204;

    public CurrentAlertResponse_getCurrent_19752207031() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term205 = new Boolean(false);
        term204 = newInstance(Class.forName("com.dmatik.orefalerts.entity.CurrentAlertResponse"));
        Object term207 = newInstance(Class.forName("com.dmatik.orefalerts.entity.CurrentAlert"));
        Object[] term244 = (Object[]) newArray("java.lang.String", 4);
        setField(term204, term204.getClass(), "alert", term205);
        setField(term207, term207.getClass(), "id", "RMFIsYGgne");
        setField(term207, term207.getClass(), "cat", "NRdvgJlhkX");
        setField(term207, term207.getClass(), "title", "uuaPigETmJ");
        setElement(term244, 0, "MxlszYVzRf");
        setElement(term244, 1, "LQFpaHEwXR");
        setElement(term244, 2, "oVcInYnLWB");
        setElement(term244, 3, "aJlieCFVtF");
        setField(term207, term207.getClass(), "data", term244);
        setField(term207, term207.getClass(), "desc", "ZiaGIbnzTs");
        setField(term204, term204.getClass(), "current", term207);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.dmatik.orefalerts.entity.CurrentAlertResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCurrent", argTypes, term204, args);
    }

};


