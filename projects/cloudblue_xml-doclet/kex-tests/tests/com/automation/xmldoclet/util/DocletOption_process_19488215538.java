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
import java.util.LinkedList;
import java.lang.Object;

public class DocletOption_process_19488215538 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term928;
     Object term970;

    public DocletOption_process_19488215538() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term929 = new ArrayList();
        term928 = newInstance(Class.forName("com.automation.xmldoclet.util.DocletOption"));
        setField(term928, term928.getClass(), "names", term929);
        setField(term928, term928.getClass(), "parameters", "GzFkzHGYFt");
        setField(term928, term928.getClass(), "description", "tShwQLRGNe");
        setIntField(term928, term928.getClass(), "argumentCount", -1955890973);
        setField(term928, term928.getClass(), "processor", null);
        term970 = new LinkedList();
        ((LinkedList) term970).add("xLbjWUgOIL");
        ((LinkedList) term970).add("jDtqGUpnZN");
        ((LinkedList) term970).add("");
        ((LinkedList) term970).add((Object)null);
        ((LinkedList) term970).add((Object)null);
        ((LinkedList) term970).add((Object)null);
        ((LinkedList) term970).add((Object)null);
        ((LinkedList) term970).add((Object)null);
        ((LinkedList) term970).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.util.DocletOption");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.util.List");
        Object[] args = new Object[2];
        args[0] = "LvtrsXUliU";
        args[1] = term970;
        callMethod(klass, "process", argTypes, term928, args);
    }

};


