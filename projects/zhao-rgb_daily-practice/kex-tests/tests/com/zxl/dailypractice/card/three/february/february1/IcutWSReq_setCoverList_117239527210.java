package com.zxl.dailypractice.card.three.february.february1;

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
import static com.zxl.dailypractice.card.three.february.february1.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.util.LinkedList;

public class IcutWSReq_setCoverList_117239527210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2538;
     Object term2670;

    public IcutWSReq_setCoverList_117239527210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term2589 = newInstance(Class.forName("com.zxl.dailypractice.card.three.february.february1.CoverList"));
        setField(term2589, term2589.getClass(), "neName", "");
        setField(term2589, term2589.getClass(), "ipAddress", "");
        ArrayList term2587 = new ArrayList();
        ((ArrayList) term2587).add(term2589);
        term2538 = newInstance(Class.forName("com.zxl.dailypractice.card.three.february.february1.IcutWSReq"));
        Object term2594 = newInstance(Class.forName("java.util.Date"));
        Object term2596 = newInstance(Class.forName("java.util.Date"));
        setField(term2538, term2538.getClass(), "orderId", "kVEZMHmRtR");
        setField(term2538, term2538.getClass(), "city", "ekxGuOYIwi");
        setField(term2538, term2538.getClass(), "classify", "RbVQXSpxXy");
        setField(term2538, term2538.getClass(), "neName", "YpJbIgJWWv");
        setField(term2538, term2538.getClass(), "coverList", term2587);
        setLongField(term2594, term2594.getClass(), "fastTime", 1668569229825L);
        setField(term2594, term2594.getClass(), "cdate", null);
        setField(term2538, term2538.getClass(), "startTime", term2594);
        setLongField(term2596, term2596.getClass(), "fastTime", 1725122217647L);
        setField(term2596, term2596.getClass(), "cdate", null);
        setField(term2538, term2538.getClass(), "endTime", term2596);
        setField(term2538, term2538.getClass(), "opDetails", "kNqaJKIATy");
        setField(term2538, term2538.getClass(), "cutType", "vKQukfbJUd");
        setField(term2538, term2538.getClass(), "opType", "lFRJFUMVbx");
        setField(term2538, term2538.getClass(), "opTitle", "sZdUNdggUW");
        setField(term2538, term2538.getClass(), "taskid", "OqbwYQfvAe");
        setField(term2538, term2538.getClass(), "description", "tRxZafjqIx");
        term2670 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.three.february.february1.IcutWSReq");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term2670;
        callMethod(klass, "setCoverList", argTypes, term2538, args);
    }

};


