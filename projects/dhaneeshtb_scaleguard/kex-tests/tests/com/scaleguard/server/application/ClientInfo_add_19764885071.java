package com.scaleguard.server.application;

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
import static com.scaleguard.server.application.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Boolean;

public class ClientInfo_add_19764885071 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term131;
     Object term145;

    public ClientInfo_add_19764885071() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term131 = new Long(2442117782898005296L);
        term145 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.application.ClientInfo");
        Class<?>[] argTypes = new Class<?>[8];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("java.lang.String");
        argTypes[5] = long.class;
        argTypes[6] = Class.forName("java.lang.String");
        argTypes[7] = boolean.class;
        Object[] args = new Object[8];
        args[0] = "xxtlPwDYFs";
        args[1] = "jJCZpVmanW";
        args[2] = "EGtDIRbSSb";
        args[3] = "SzjVpOQTyS";
        args[4] = "MjGYSRKTNF";
        args[5] = term131;
        args[6] = "hRNSzYYIrc";
        args[7] = term145;
        callMethod(klass, "add", argTypes, null, args);
    }

};


