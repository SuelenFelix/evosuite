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

public class Project_getAssignments_196518278611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41641;

    public Project_getAssignments_196518278611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term41642 = new Integer(1184968868);
        HashMap term41677 = new HashMap();
        Set<Object> term41711 =  ((Map) term41677).keySet();
        HashSet term41676 = new HashSet((Collection<? extends Object>) term41711);
        term41641 = newInstance(Class.forName("com.pfa.app.model.entity.Project"));
        Object term41656 = newInstance(Class.forName("java.time.LocalDate"));
        Object term41660 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term41641, term41641.getClass(), "projectId", term41642);
        setField(term41641, term41641.getClass(), "title", "VABzGvaFoV");
        setIntField(term41656, term41656.getClass(), "year", 2029);
        setShortField(term41656, term41656.getClass(), "month", (short) 8);
        setShortField(term41656, term41656.getClass(), "day", (short) 17);
        setField(term41641, term41641.getClass(), "startDate", term41656);
        setIntField(term41660, term41660.getClass(), "year", 2020);
        setShortField(term41660, term41660.getClass(), "month", (short) 7);
        setShortField(term41660, term41660.getClass(), "day", (short) 9);
        setField(term41641, term41641.getClass(), "endDate", term41660);
        setField(term41641, term41641.getClass(), "status", "OJfzqZgyhr");
        setField(term41641, term41641.getClass(), "assignments", term41676);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pfa.app.model.entity.Project");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAssignments", argTypes, term41641, args);
    }

};


