package net.jaggerwang.sbip.adapter.api.controller.dto;

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
import static net.jaggerwang.sbip.adapter.api.controller.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;

public class RootDTO_addDataEntry_6226877684 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90846;
     Object term90870;

    public RootDTO_addDataEntry_6226877684() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term90853 = new HashMap();
        term90846 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.RootDTO"));
        setField(term90846, term90846.getClass(), "code", "ok");
        setField(term90846, term90846.getClass(), "message", "");
        setField(term90846, term90846.getClass(), "data", term90853);
        term90870 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.RootDTO");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = "AaxnITALtd";
        args[1] = term90870;
        callMethod(klass, "addDataEntry", argTypes, term90846, args);
    }

};


