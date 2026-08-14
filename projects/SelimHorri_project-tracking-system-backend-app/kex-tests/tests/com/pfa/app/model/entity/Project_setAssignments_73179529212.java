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
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class Project_setAssignments_73179529212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41712;
     Object term41758;

    public Project_setAssignments_73179529212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term41713 = new Integer(48416396);
        HashMap term41748 = new HashMap();
        Set<Object> term41784 =  ((Map) term41748).keySet();
        HashSet term41747 = new HashSet((Collection<? extends Object>) term41784);
        term41712 = newInstance(Class.forName("com.pfa.app.model.entity.Project"));
        Object term41727 = newInstance(Class.forName("java.time.LocalDate"));
        Object term41731 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term41712, term41712.getClass(), "projectId", term41713);
        setField(term41712, term41712.getClass(), "title", "noKFXgekjv");
        setIntField(term41727, term41727.getClass(), "year", 2014);
        setShortField(term41727, term41727.getClass(), "month", (short) 11);
        setShortField(term41727, term41727.getClass(), "day", (short) 16);
        setField(term41712, term41712.getClass(), "startDate", term41727);
        setIntField(term41731, term41731.getClass(), "year", 2013);
        setShortField(term41731, term41731.getClass(), "month", (short) 12);
        setShortField(term41731, term41731.getClass(), "day", (short) 2);
        setField(term41712, term41712.getClass(), "endDate", term41731);
        setField(term41712, term41712.getClass(), "status", "DDVjHRnQxN");
        setField(term41712, term41712.getClass(), "assignments", term41747);
        HashMap term41759 = new HashMap();
        Set<Object> term41785 =  ((Map) term41759).keySet();
        term41758 = new HashSet((Collection<? extends Object>) term41785);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pfa.app.model.entity.Project");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Set");
        Object[] args = new Object[1];
        args[0] = term41758;
        callMethod(klass, "setAssignments", argTypes, term41712, args);
    }

};


