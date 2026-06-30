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

public class Castle_setCity_88754507112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8748;

    public Castle_setCity_88754507112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term8749 = new Long(-5216789073301458893L);
        HashMap term8790 = new HashMap();
        Set<Object> term8837 =  ((Map) term8790).keySet();
        HashSet term8789 = new HashSet((Collection<? extends Object>) term8837);
        term8748 = newInstance(Class.forName("com.oreilly.quest.entities.Castle"));
        setField(term8748, term8748.getClass(), "id", term8749);
        setField(term8748, term8748.getClass(), "name", "VeDtgDzGAN");
        setField(term8748, term8748.getClass(), "city", "aWYOWZFyaX");
        setField(term8748, term8748.getClass(), "state", "BRIVNtfUWU");
        setDoubleField(term8748, term8748.getClass(), "latitude", 0.9374115574082594);
        setDoubleField(term8748, term8748.getClass(), "longitude", 0.8454723071922143);
        setField(term8748, term8748.getClass(), "knights", term8789);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.oreilly.quest.entities.Castle");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "DbiCVtPPCT";
        callMethod(klass, "setCity", argTypes, term8748, args);
    }

};


