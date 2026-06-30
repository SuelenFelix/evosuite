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

public class Quest_getTasks_33326443510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10864;

    public Quest_getTasks_33326443510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term10865 = new Long(-6432617521836576658L);
        HashMap term10881 = new HashMap();
        Set<Object> term10902 =  ((Map) term10881).keySet();
        HashSet term10880 = new HashSet((Collection<? extends Object>) term10902);
        HashMap term10887 = new HashMap();
        Set<Object> term10903 =  ((Map) term10887).keySet();
        HashSet term10886 = new HashSet((Collection<? extends Object>) term10903);
        term10864 = newInstance(Class.forName("com.oreilly.quest.entities.Quest"));
        setField(term10864, term10864.getClass(), "id", term10865);
        setField(term10864, term10864.getClass(), "name", "zcorEihhLK");
        setLongField(term10864, term10864.getClass(), "version", -3842548265506930260L);
        setField(term10864, term10864.getClass(), "tasks", term10880);
        setField(term10864, term10864.getClass(), "knights", term10886);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.oreilly.quest.entities.Quest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTasks", argTypes, term10864, args);
    }

};


