package com.pfa.app.model.entity;

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
import static com.pfa.app.model.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class Location_setDepartments_104862120711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10747;
     Object term10792;

    public Location_setDepartments_104862120711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term10748 = new Integer(-2085566906);
        HashMap term10787 = new HashMap();
        Set<Object> term10828 =  ((Map) term10787).keySet();
        HashSet term10786 = new HashSet((Collection<? extends Object>) term10828);
        term10747 = newInstance(Class.forName("com.pfa.app.model.entity.Location"));
        setField(term10747, term10747.getClass(), "locationId", term10748);
        setField(term10747, term10747.getClass(), "adr", "BIcjuljzhc");
        setField(term10747, term10747.getClass(), "postalCode", "SQDHGXSyaX");
        setField(term10747, term10747.getClass(), "city", "apdJoJDItV");
        setField(term10747, term10747.getClass(), "departments", term10786);
        HashMap term10793 = new HashMap();
        Set<Object> term10829 =  ((Map) term10793).keySet();
        term10792 = new HashSet((Collection<? extends Object>) term10829);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pfa.app.model.entity.Location");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Set");
        Object[] args = new Object[1];
        args[0] = term10792;
        callMethod(klass, "setDepartments", argTypes, term10747, args);
    }

};


