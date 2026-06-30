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

public class CustomerInfo_changeCustomerInfo_1277525441 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1180;

    public CustomerInfo_changeCustomerInfo_1277525441() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1241 = new ArrayList();
        ((ArrayList) term1241).add((Object)null);
        ((ArrayList) term1241).add((Object)null);
        ((ArrayList) term1241).add((Object)null);
        ((ArrayList) term1241).add((Object)null);
        ((ArrayList) term1241).add((Object)null);
        ((ArrayList) term1241).add((Object)null);
        HashMap term1245 = new HashMap();
        term1180 = newInstance(Class.forName("ru.sbt.azatakhunov.customerservice.domain.CustomerInfo"));
        setField(term1180, term1180.getClass(), "id", "uWHnvSvaPl");
        setField(term1180, term1180.getClass(), "pw", "kBdSllIBVz");
        setField(term1180, term1180.getClass(), "name", "TJmVBGfTML");
        setField(term1180, term1180.getClass(), "address", "tPlsykYBqO");
        setField(term1180, term1180.getClass(), "registeredDay", "bLPjGVBhlX");
        setField(term1180, term1180.getClass(), "eventList", term1241);
        setField(term1180, term1180.getClass(), "methodMap", term1245);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.sbt.azatakhunov.customerservice.domain.CustomerInfo");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = "bWWfajKbEX";
        args[1] = "cAPeiZHKGJ";
        args[2] = "LvJFtLBaxj";
        callMethod(klass, "changeCustomerInfo", argTypes, term1180, args);
    }

};


