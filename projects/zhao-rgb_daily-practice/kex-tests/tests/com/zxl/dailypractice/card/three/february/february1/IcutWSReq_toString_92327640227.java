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

public class IcutWSReq_toString_92327640227 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6708;

    public IcutWSReq_toString_92327640227() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term6759 = newInstance(Class.forName("com.zxl.dailypractice.card.three.february.february1.CoverList"));
        setField(term6759, term6759.getClass(), "neName", "");
        setField(term6759, term6759.getClass(), "ipAddress", "");
        Object term6762 = newInstance(Class.forName("com.zxl.dailypractice.card.three.february.february1.CoverList"));
        setField(term6762, term6762.getClass(), "neName", "");
        setField(term6762, term6762.getClass(), "ipAddress", "");
        Object term6765 = newInstance(Class.forName("com.zxl.dailypractice.card.three.february.february1.CoverList"));
        setField(term6765, term6765.getClass(), "neName", "");
        setField(term6765, term6765.getClass(), "ipAddress", "");
        ArrayList term6757 = new ArrayList();
        ((ArrayList) term6757).add(term6759);
        ((ArrayList) term6757).add(term6762);
        ((ArrayList) term6757).add(term6765);
        term6708 = newInstance(Class.forName("com.zxl.dailypractice.card.three.february.february1.IcutWSReq"));
        Object term6770 = newInstance(Class.forName("java.util.Date"));
        Object term6772 = newInstance(Class.forName("java.util.Date"));
        setField(term6708, term6708.getClass(), "orderId", "yevIIoVYHq");
        setField(term6708, term6708.getClass(), "city", "UuYWMTqWTV");
        setField(term6708, term6708.getClass(), "classify", "DSFGlcaXUb");
        setField(term6708, term6708.getClass(), "neName", "sHMXNUzNeM");
        setField(term6708, term6708.getClass(), "coverList", term6757);
        setLongField(term6770, term6770.getClass(), "fastTime", 1802995433545L);
        setField(term6770, term6770.getClass(), "cdate", null);
        setField(term6708, term6708.getClass(), "startTime", term6770);
        setLongField(term6772, term6772.getClass(), "fastTime", 1843214817357L);
        setField(term6772, term6772.getClass(), "cdate", null);
        setField(term6708, term6708.getClass(), "endTime", term6772);
        setField(term6708, term6708.getClass(), "opDetails", "QITgiBrmfj");
        setField(term6708, term6708.getClass(), "cutType", "pXxkiXgQnq");
        setField(term6708, term6708.getClass(), "opType", "tKmrUDURku");
        setField(term6708, term6708.getClass(), "opTitle", "JeZbrwZmsP");
        setField(term6708, term6708.getClass(), "taskid", "bxyfeicqrK");
        setField(term6708, term6708.getClass(), "description", "vBnWPlsZMk");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.three.february.february1.IcutWSReq");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term6708, args);
    }

};


