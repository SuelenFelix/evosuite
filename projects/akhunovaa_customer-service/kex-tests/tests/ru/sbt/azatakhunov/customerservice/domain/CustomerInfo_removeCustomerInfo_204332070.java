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

public class CustomerInfo_removeCustomerInfo_204332070 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1007;

    public CustomerInfo_removeCustomerInfo_204332070() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1068 = new ArrayList();
        ((ArrayList) term1068).add((Object)null);
        ((ArrayList) term1068).add((Object)null);
        ((ArrayList) term1068).add((Object)null);
        ((ArrayList) term1068).add((Object)null);
        ((ArrayList) term1068).add((Object)null);
        HashMap term1072 = new HashMap();
        term1007 = newInstance(Class.forName("ru.sbt.azatakhunov.customerservice.domain.CustomerInfo"));
        setField(term1007, term1007.getClass(), "id", "GzFkzHGYFt");
        setField(term1007, term1007.getClass(), "pw", "tShwQLRGNe");
        setField(term1007, term1007.getClass(), "name", "LvtrsXUliU");
        setField(term1007, term1007.getClass(), "address", "xLbjWUgOIL");
        setField(term1007, term1007.getClass(), "registeredDay", "jDtqGUpnZN");
        setField(term1007, term1007.getClass(), "eventList", term1068);
        setField(term1007, term1007.getClass(), "methodMap", term1072);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.sbt.azatakhunov.customerservice.domain.CustomerInfo");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "eqJfYWRaEL";
        args[1] = "fhkbdRViHi";
        callMethod(klass, "removeCustomerInfo", argTypes, term1007, args);
    }

};


