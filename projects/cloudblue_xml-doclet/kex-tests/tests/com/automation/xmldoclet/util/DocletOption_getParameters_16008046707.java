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

public class DocletOption_getParameters_16008046707 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term680;

    public DocletOption_getParameters_16008046707() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term681 = new ArrayList();
        ((ArrayList) term681).add("kuTXqwMtDB");
        ((ArrayList) term681).add("Ghbwtircqb");
        ((ArrayList) term681).add("xrwlQZdwCp");
        ((ArrayList) term681).add("IDCWpPLRkE");
        ((ArrayList) term681).add("nyiiPDVjAc");
        ((ArrayList) term681).add("aKnKipADSo");
        ((ArrayList) term681).add("wSQxaModmm");
        ((ArrayList) term681).add("UlajhuVLaP");
        ((ArrayList) term681).add("gGSMzuGICf");
        term680 = newInstance(Class.forName("com.automation.xmldoclet.util.DocletOption"));
        setField(term680, term680.getClass(), "names", term681);
        setField(term680, term680.getClass(), "parameters", "hxCBltsObl");
        setField(term680, term680.getClass(), "description", "BndsHwAFMv");
        setIntField(term680, term680.getClass(), "argumentCount", -616727354);
        setField(term680, term680.getClass(), "processor", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.util.DocletOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getParameters", argTypes, term680, args);
    }

};


