package org.s1ck.gdl.model;

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
import static org.s1ck.gdl.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.util.ArrayList;
import java.util.HashMap;

public class Element_hashCode_178988934215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3193;

    public Element_hashCode_178988934215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3194 = new Long(-5788180182343976541L);
        ArrayList term3196 = new ArrayList();
        ((ArrayList) term3196).add("WzMEhMXkKx");
        ((ArrayList) term3196).add("XOiDvlDhdc");
        ((ArrayList) term3196).add("AdxvLJhNLe");
        ((ArrayList) term3196).add("lHfTrWKMPk");
        HashMap term3248 = new HashMap();
        term3193 = newInstance(Class.forName("org.s1ck.gdl.model.Element"));
        setField(term3193, term3193.getClass(), "id", term3194);
        setField(term3193, term3193.getClass(), "labels", term3196);
        setField(term3193, term3193.getClass(), "properties", term3248);
        setField(term3193, term3193.getClass(), "variable", "JDaAnsVTGV");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.s1ck.gdl.model.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term3193, args);
    }

};


