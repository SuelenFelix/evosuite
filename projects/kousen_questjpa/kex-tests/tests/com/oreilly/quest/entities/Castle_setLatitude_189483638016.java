package com.oreilly.quest.entities;

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
import static com.oreilly.quest.entities.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.Double;

public class Castle_setLatitude_189483638016 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9104;
     Object term9151;

    public Castle_setLatitude_189483638016() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term9105 = new Long(1368340889161782793L);
        HashMap term9146 = new HashMap();
        Set<Object> term9183 =  ((Map) term9146).keySet();
        HashSet term9145 = new HashSet((Collection<? extends Object>) term9183);
        term9104 = newInstance(Class.forName("com.oreilly.quest.entities.Castle"));
        setField(term9104, term9104.getClass(), "id", term9105);
        setField(term9104, term9104.getClass(), "name", "xtftXXMbem");
        setField(term9104, term9104.getClass(), "city", "cudZvLMQon");
        setField(term9104, term9104.getClass(), "state", "lihXWlGDxk");
        setDoubleField(term9104, term9104.getClass(), "latitude", 0.3227335400819148);
        setDoubleField(term9104, term9104.getClass(), "longitude", 0.43337207054070237);
        setField(term9104, term9104.getClass(), "knights", term9145);
        term9151 = new Double(0.13246999699526574);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.oreilly.quest.entities.Castle");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term9151;
        callMethod(klass, "setLatitude", argTypes, term9104, args);
    }

};


