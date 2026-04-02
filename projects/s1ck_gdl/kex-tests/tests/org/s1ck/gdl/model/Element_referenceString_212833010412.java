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

public class Element_referenceString_212833010412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2781;

    public Element_referenceString_212833010412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2782 = new Long(4044358158040652353L);
        ArrayList term2784 = new ArrayList();
        ((ArrayList) term2784).add("qxSDVejjiY");
        ((ArrayList) term2784).add("xBsXSDjXYK");
        HashMap term2812 = new HashMap();
        term2781 = newInstance(Class.forName("org.s1ck.gdl.model.Element"));
        setField(term2781, term2781.getClass(), "id", term2782);
        setField(term2781, term2781.getClass(), "labels", term2784);
        setField(term2781, term2781.getClass(), "properties", term2812);
        setField(term2781, term2781.getClass(), "variable", "sEnIVFtZuQ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.s1ck.gdl.model.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "referenceString", argTypes, term2781, args);
    }

};


