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
import java.util.HashMap;

public class CustomerInfo_setName_141412011115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2950;

    public CustomerInfo_setName_141412011115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3011 = new ArrayList();
        HashMap term3015 = new HashMap();
        term2950 = newInstance(Class.forName("ru.sbt.azatakhunov.customerservice.domain.CustomerInfo"));
        setField(term2950, term2950.getClass(), "id", "GJVkUrCVdD");
        setField(term2950, term2950.getClass(), "pw", "zNdorvdUgu");
        setField(term2950, term2950.getClass(), "name", "oPxuZbkYio");
        setField(term2950, term2950.getClass(), "address", "vKitydDVnM");
        setField(term2950, term2950.getClass(), "registeredDay", "urCiQnUFBM");
        setField(term2950, term2950.getClass(), "eventList", term3011);
        setField(term2950, term2950.getClass(), "methodMap", term3015);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.sbt.azatakhunov.customerservice.domain.CustomerInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "THZSpzBRYP";
        callMethod(klass, "setName", argTypes, term2950, args);
    }

};


