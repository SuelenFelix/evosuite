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

public class CustomerInfo_setId_14196848113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2648;

    public CustomerInfo_setId_14196848113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2709 = new ArrayList();
        ((ArrayList) term2709).add((Object)null);
        ((ArrayList) term2709).add((Object)null);
        ((ArrayList) term2709).add((Object)null);
        ((ArrayList) term2709).add((Object)null);
        ((ArrayList) term2709).add((Object)null);
        ((ArrayList) term2709).add((Object)null);
        HashMap term2713 = new HashMap();
        term2648 = newInstance(Class.forName("ru.sbt.azatakhunov.customerservice.domain.CustomerInfo"));
        setField(term2648, term2648.getClass(), "id", "SIODFGaQhr");
        setField(term2648, term2648.getClass(), "pw", "qYzsiuXOgS");
        setField(term2648, term2648.getClass(), "name", "bxrCBbrrct");
        setField(term2648, term2648.getClass(), "address", "CKWpJaaaxX");
        setField(term2648, term2648.getClass(), "registeredDay", "UBRmXJmfrt");
        setField(term2648, term2648.getClass(), "eventList", term2709);
        setField(term2648, term2648.getClass(), "methodMap", term2713);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.sbt.azatakhunov.customerservice.domain.CustomerInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "bnsyeQXFdu";
        callMethod(klass, "setId", argTypes, term2648, args);
    }

};


