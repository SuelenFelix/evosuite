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

public class Solution_chencktIcut_6613801502 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7062;

    public Solution_chencktIcut_6613801502() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term7113 = newInstance(Class.forName("com.zxl.dailypractice.card.three.february.february1.CoverList"));
        setField(term7113, term7113.getClass(), "neName", "");
        setField(term7113, term7113.getClass(), "ipAddress", "");
        Object term7116 = newInstance(Class.forName("com.zxl.dailypractice.card.three.february.february1.CoverList"));
        setField(term7116, term7116.getClass(), "neName", "");
        setField(term7116, term7116.getClass(), "ipAddress", "");
        Object term7119 = newInstance(Class.forName("com.zxl.dailypractice.card.three.february.february1.CoverList"));
        setField(term7119, term7119.getClass(), "neName", "");
        setField(term7119, term7119.getClass(), "ipAddress", "");
        Object term7122 = newInstance(Class.forName("com.zxl.dailypractice.card.three.february.february1.CoverList"));
        setField(term7122, term7122.getClass(), "neName", "");
        setField(term7122, term7122.getClass(), "ipAddress", "");
        Object term7125 = newInstance(Class.forName("com.zxl.dailypractice.card.three.february.february1.CoverList"));
        setField(term7125, term7125.getClass(), "neName", "");
        setField(term7125, term7125.getClass(), "ipAddress", "");
        Object term7128 = newInstance(Class.forName("com.zxl.dailypractice.card.three.february.february1.CoverList"));
        setField(term7128, term7128.getClass(), "neName", "");
        setField(term7128, term7128.getClass(), "ipAddress", "");
        Object term7131 = newInstance(Class.forName("com.zxl.dailypractice.card.three.february.february1.CoverList"));
        setField(term7131, term7131.getClass(), "neName", "");
        setField(term7131, term7131.getClass(), "ipAddress", "");
        Object term7134 = newInstance(Class.forName("com.zxl.dailypractice.card.three.february.february1.CoverList"));
        setField(term7134, term7134.getClass(), "neName", "");
        setField(term7134, term7134.getClass(), "ipAddress", "");
        Object term7137 = newInstance(Class.forName("com.zxl.dailypractice.card.three.february.february1.CoverList"));
        setField(term7137, term7137.getClass(), "neName", "");
        setField(term7137, term7137.getClass(), "ipAddress", "");
        ArrayList term7111 = new ArrayList();
        ((ArrayList) term7111).add(term7113);
        ((ArrayList) term7111).add(term7116);
        ((ArrayList) term7111).add(term7119);
        ((ArrayList) term7111).add(term7122);
        ((ArrayList) term7111).add(term7125);
        ((ArrayList) term7111).add(term7128);
        ((ArrayList) term7111).add(term7131);
        ((ArrayList) term7111).add(term7134);
        ((ArrayList) term7111).add(term7137);
        term7062 = newInstance(Class.forName("com.zxl.dailypractice.card.three.february.february1.IcutWSReq"));
        Object term7142 = newInstance(Class.forName("java.util.Date"));
        Object term7144 = newInstance(Class.forName("java.util.Date"));
        setField(term7062, term7062.getClass(), "orderId", "hIYsRyOZxk");
        setField(term7062, term7062.getClass(), "city", "RjNoEywJbC");
        setField(term7062, term7062.getClass(), "classify", "RTTvrwwhou");
        setField(term7062, term7062.getClass(), "neName", "lRORwXipuk");
        setField(term7062, term7062.getClass(), "coverList", term7111);
        setLongField(term7142, term7142.getClass(), "fastTime", 1628695316832L);
        setField(term7142, term7142.getClass(), "cdate", null);
        setField(term7062, term7062.getClass(), "startTime", term7142);
        setLongField(term7144, term7144.getClass(), "fastTime", 1393200035243L);
        setField(term7144, term7144.getClass(), "cdate", null);
        setField(term7062, term7062.getClass(), "endTime", term7144);
        setField(term7062, term7062.getClass(), "opDetails", "MqICFYzDJj");
        setField(term7062, term7062.getClass(), "cutType", "YgQvdcBQKw");
        setField(term7062, term7062.getClass(), "opType", "FiYYLuailz");
        setField(term7062, term7062.getClass(), "opTitle", "XebAeSnCKZ");
        setField(term7062, term7062.getClass(), "taskid", "GeddnXjHGy");
        setField(term7062, term7062.getClass(), "description", "vLTbaoAxBm");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.three.february.february1.Solution");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.zxl.dailypractice.card.three.february.february1.IcutWSReq");
        Object[] args = new Object[1];
        args[0] = term7062;
        callMethod(klass, "chencktIcut", argTypes, null, args);
    }

};


