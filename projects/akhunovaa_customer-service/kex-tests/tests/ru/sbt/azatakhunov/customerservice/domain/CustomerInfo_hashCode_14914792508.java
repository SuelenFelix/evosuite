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

public class CustomerInfo_hashCode_14914792508 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2003;

    public CustomerInfo_hashCode_14914792508() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2064 = new ArrayList();
        ((ArrayList) term2064).add((Object)null);
        ((ArrayList) term2064).add((Object)null);
        HashMap term2068 = new HashMap();
        term2003 = newInstance(Class.forName("ru.sbt.azatakhunov.customerservice.domain.CustomerInfo"));
        setField(term2003, term2003.getClass(), "id", "BRIVNtfUWU");
        setField(term2003, term2003.getClass(), "pw", "DbiCVtPPCT");
        setField(term2003, term2003.getClass(), "name", "WzFopsaDuG");
        setField(term2003, term2003.getClass(), "address", "PapWxkhEWe");
        setField(term2003, term2003.getClass(), "registeredDay", "smnHEqRFRx");
        setField(term2003, term2003.getClass(), "eventList", term2064);
        setField(term2003, term2003.getClass(), "methodMap", term2068);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.sbt.azatakhunov.customerservice.domain.CustomerInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term2003, args);
    }

};


