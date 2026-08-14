package org.spdx.spdx_to_osv.osvmodel;

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
import static org.spdx.spdx_to_osv.osvmodel.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.LinkedList;

public class OsvAffects_setRanges_9122006232 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10344;
     Object term10461;

    public OsvAffects_setRanges_9122006232() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term10345 = new ArrayList();
        ArrayList term10349 = new ArrayList();
        ((ArrayList) term10349).add("PapWxkhEWe");
        ((ArrayList) term10349).add("smnHEqRFRx");
        ((ArrayList) term10349).add("XYtryyobou");
        ((ArrayList) term10349).add("OYbzXylRWW");
        ((ArrayList) term10349).add("DSNsTGYXDF");
        ((ArrayList) term10349).add("sQvGcVjdEx");
        ((ArrayList) term10349).add("rLHAoqXgPh");
        ((ArrayList) term10349).add("zUlRdimJtU");
        ((ArrayList) term10349).add("vwbEQQNQrx");
        term10344 = newInstance(Class.forName("org.spdx.spdx_to_osv.osvmodel.OsvAffects"));
        setField(term10344, term10344.getClass(), "ranges", term10345);
        setField(term10344, term10344.getClass(), "versions", term10349);
        term10461 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.spdx.spdx_to_osv.osvmodel.OsvAffects");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term10461;
        callMethod(klass, "setRanges", argTypes, term10344, args);
    }

};


