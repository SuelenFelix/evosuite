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

public class DocletOption_getKind_13414327625 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term470;

    public DocletOption_getKind_13414327625() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term471 = new ArrayList();
        ((ArrayList) term471).add("vrQLuWIDJX");
        ((ArrayList) term471).add("flxyYxBRtu");
        ((ArrayList) term471).add("OclPbYPkcH");
        ((ArrayList) term471).add("IoAlmYsBwc");
        ((ArrayList) term471).add("TEParAifyi");
        term470 = newInstance(Class.forName("com.automation.xmldoclet.util.DocletOption"));
        setField(term470, term470.getClass(), "names", term471);
        setField(term470, term470.getClass(), "parameters", "OWDIEULEFu");
        setField(term470, term470.getClass(), "description", "dWRymuLBtr");
        setIntField(term470, term470.getClass(), "argumentCount", 391863371);
        setField(term470, term470.getClass(), "processor", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.util.DocletOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getKind", argTypes, term470, args);
    }

};


