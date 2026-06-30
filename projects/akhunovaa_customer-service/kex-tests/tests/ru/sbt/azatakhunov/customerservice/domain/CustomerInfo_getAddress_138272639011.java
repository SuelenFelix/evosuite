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

public class CustomerInfo_getAddress_138272639011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2390;

    public CustomerInfo_getAddress_138272639011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2451 = new ArrayList();
        ((ArrayList) term2451).add((Object)null);
        ((ArrayList) term2451).add((Object)null);
        ((ArrayList) term2451).add((Object)null);
        ((ArrayList) term2451).add((Object)null);
        ((ArrayList) term2451).add((Object)null);
        HashMap term2455 = new HashMap();
        term2390 = newInstance(Class.forName("ru.sbt.azatakhunov.customerservice.domain.CustomerInfo"));
        setField(term2390, term2390.getClass(), "id", "tlQSNgTkQX");
        setField(term2390, term2390.getClass(), "pw", "PCipZnmBOF");
        setField(term2390, term2390.getClass(), "name", "zcorEihhLK");
        setField(term2390, term2390.getClass(), "address", "GrqozDKFOk");
        setField(term2390, term2390.getClass(), "registeredDay", "CFyoseFGLF");
        setField(term2390, term2390.getClass(), "eventList", term2451);
        setField(term2390, term2390.getClass(), "methodMap", term2455);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.sbt.azatakhunov.customerservice.domain.CustomerInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAddress", argTypes, term2390, args);
    }

};


