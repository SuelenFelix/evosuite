package com.strategyengine.xrpl.fsedistributionservice.model;

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
import static com.strategyengine.xrpl.fsedistributionservice.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.LinkedList;
import java.lang.Object;

public class UserAddresses_UserAddressesBuilder_addresses_5113549712 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term336156;
     Object term336281;

    public UserAddresses_UserAddressesBuilder_addresses_5113549712() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term336169 = new ArrayList();
        ((ArrayList) term336169).add("DneBWnIeDx");
        ((ArrayList) term336169).add("pDqUZCoDIX");
        ((ArrayList) term336169).add("ErlJXmBNko");
        ((ArrayList) term336169).add("qyKAThLlxF");
        ((ArrayList) term336169).add("QASMnlCopd");
        ((ArrayList) term336169).add("YwgBBLYGUf");
        ((ArrayList) term336169).add("GmUcxwDIHd");
        ((ArrayList) term336169).add("DONVlTbOjd");
        ((ArrayList) term336169).add("fLWpUJgZWD");
        term336156 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.UserAddresses$UserAddressesBuilder"));
        setField(term336156, term336156.getClass(), "uniqueid", "rrCIslqAVq");
        setField(term336156, term336156.getClass(), "addresses", term336169);
        term336281 = new LinkedList();
        ((LinkedList) term336281).add("zpxPoasWgA");
        ((LinkedList) term336281).add("lZNePPEWLC");
        ((LinkedList) term336281).add("");
        ((LinkedList) term336281).add((Object)null);
        ((LinkedList) term336281).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.UserAddresses$UserAddressesBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term336281;
        callMethod(klass, "addresses", argTypes, term336156, args);
    }

};


