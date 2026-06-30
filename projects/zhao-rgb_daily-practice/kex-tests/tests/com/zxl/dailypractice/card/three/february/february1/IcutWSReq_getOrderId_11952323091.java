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

public class IcutWSReq_getOrderId_11952323091 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term275;

    public IcutWSReq_getOrderId_11952323091() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term326 = newInstance(Class.forName("com.zxl.dailypractice.card.three.february.february1.CoverList"));
        setField(term326, term326.getClass(), "neName", "");
        setField(term326, term326.getClass(), "ipAddress", "");
        Object term329 = newInstance(Class.forName("com.zxl.dailypractice.card.three.february.february1.CoverList"));
        setField(term329, term329.getClass(), "neName", "");
        setField(term329, term329.getClass(), "ipAddress", "");
        Object term332 = newInstance(Class.forName("com.zxl.dailypractice.card.three.february.february1.CoverList"));
        setField(term332, term332.getClass(), "neName", "");
        setField(term332, term332.getClass(), "ipAddress", "");
        Object term335 = newInstance(Class.forName("com.zxl.dailypractice.card.three.february.february1.CoverList"));
        setField(term335, term335.getClass(), "neName", "");
        setField(term335, term335.getClass(), "ipAddress", "");
        Object term338 = newInstance(Class.forName("com.zxl.dailypractice.card.three.february.february1.CoverList"));
        setField(term338, term338.getClass(), "neName", "");
        setField(term338, term338.getClass(), "ipAddress", "");
        ArrayList term324 = new ArrayList();
        ((ArrayList) term324).add(term326);
        ((ArrayList) term324).add(term329);
        ((ArrayList) term324).add(term332);
        ((ArrayList) term324).add(term335);
        ((ArrayList) term324).add(term338);
        term275 = newInstance(Class.forName("com.zxl.dailypractice.card.three.february.february1.IcutWSReq"));
        Object term343 = newInstance(Class.forName("java.util.Date"));
        Object term345 = newInstance(Class.forName("java.util.Date"));
        setField(term275, term275.getClass(), "orderId", "MxlszYVzRf");
        setField(term275, term275.getClass(), "city", "LQFpaHEwXR");
        setField(term275, term275.getClass(), "classify", "oVcInYnLWB");
        setField(term275, term275.getClass(), "neName", "aJlieCFVtF");
        setField(term275, term275.getClass(), "coverList", term324);
        setLongField(term343, term343.getClass(), "fastTime", 1345871412244L);
        setField(term343, term343.getClass(), "cdate", null);
        setField(term275, term275.getClass(), "startTime", term343);
        setLongField(term345, term345.getClass(), "fastTime", 1480438351369L);
        setField(term345, term345.getClass(), "cdate", null);
        setField(term275, term275.getClass(), "endTime", term345);
        setField(term275, term275.getClass(), "opDetails", "flxyYxBRtu");
        setField(term275, term275.getClass(), "cutType", "OclPbYPkcH");
        setField(term275, term275.getClass(), "opType", "IoAlmYsBwc");
        setField(term275, term275.getClass(), "opTitle", "TEParAifyi");
        setField(term275, term275.getClass(), "taskid", "OWDIEULEFu");
        setField(term275, term275.getClass(), "description", "dWRymuLBtr");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.three.february.february1.IcutWSReq");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOrderId", argTypes, term275, args);
    }

};


