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

public class Quest_setName_6571638879 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10802;

    public Quest_setName_6571638879() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term10803 = new Long(-1804015692891701666L);
        HashMap term10819 = new HashMap();
        Set<Object> term10852 =  ((Map) term10819).keySet();
        HashSet term10818 = new HashSet((Collection<? extends Object>) term10852);
        HashMap term10825 = new HashMap();
        Set<Object> term10853 =  ((Map) term10825).keySet();
        HashSet term10824 = new HashSet((Collection<? extends Object>) term10853);
        term10802 = newInstance(Class.forName("com.oreilly.quest.entities.Quest"));
        setField(term10802, term10802.getClass(), "id", term10803);
        setField(term10802, term10802.getClass(), "name", "tlQSNgTkQX");
        setLongField(term10802, term10802.getClass(), "version", -4443169559037975007L);
        setField(term10802, term10802.getClass(), "tasks", term10818);
        setField(term10802, term10802.getClass(), "knights", term10824);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.oreilly.quest.entities.Quest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "PCipZnmBOF";
        callMethod(klass, "setName", argTypes, term10802, args);
    }

};


