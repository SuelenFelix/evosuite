package ru.sbt.azatakhunov.customerservice.domain;

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
import static ru.sbt.azatakhunov.customerservice.domain.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.util.HashMap;

public class CustomerInfo_setAddress_57124536616 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3101;

    public CustomerInfo_setAddress_57124536616() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3162 = new ArrayList();
        ((ArrayList) term3162).add((Object)null);
        ((ArrayList) term3162).add((Object)null);
        ((ArrayList) term3162).add((Object)null);
        ((ArrayList) term3162).add((Object)null);
        ((ArrayList) term3162).add((Object)null);
        ((ArrayList) term3162).add((Object)null);
        HashMap term3166 = new HashMap();
        term3101 = newInstance(Class.forName("ru.sbt.azatakhunov.customerservice.domain.CustomerInfo"));
        setField(term3101, term3101.getClass(), "id", "ZfBIVGBQOE");
        setField(term3101, term3101.getClass(), "pw", "QSrDQfEsTR");
        setField(term3101, term3101.getClass(), "name", "PsqusYmejD");
        setField(term3101, term3101.getClass(), "address", "NTWMiBEaDF");
        setField(term3101, term3101.getClass(), "registeredDay", "SPBstwKFVr");
        setField(term3101, term3101.getClass(), "eventList", term3162);
        setField(term3101, term3101.getClass(), "methodMap", term3166);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.sbt.azatakhunov.customerservice.domain.CustomerInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "YAXkVjQZcV";
        callMethod(klass, "setAddress", argTypes, term3101, args);
    }

};


