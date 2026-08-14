package com.automation.xmldoclet.util;

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
import static com.automation.xmldoclet.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;

public class DocletOption_getDescription_9613492844 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term332;

    public DocletOption_getDescription_9613492844() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term333 = new ArrayList();
        ((ArrayList) term333).add("pCTimMblYc");
        ((ArrayList) term333).add("hNxWaHcfhY");
        ((ArrayList) term333).add("RkybSrpybU");
        ((ArrayList) term333).add("xOEqzGAmDU");
        term332 = newInstance(Class.forName("com.automation.xmldoclet.util.DocletOption"));
        setField(term332, term332.getClass(), "names", term333);
        setField(term332, term332.getClass(), "parameters", "eZFUvlxvGV");
        setField(term332, term332.getClass(), "description", "BYqFIqCKAV");
        setIntField(term332, term332.getClass(), "argumentCount", 1484323161);
        setField(term332, term332.getClass(), "processor", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.util.DocletOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDescription", argTypes, term332, args);
    }

};


