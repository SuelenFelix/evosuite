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

public class IcutWSReq_setCity_6424623094 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1020;

    public IcutWSReq_setCity_6424623094() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1071 = newInstance(Class.forName("com.zxl.dailypractice.card.three.february.february1.CoverList"));
        setField(term1071, term1071.getClass(), "neName", "");
        setField(term1071, term1071.getClass(), "ipAddress", "");
        Object term1074 = newInstance(Class.forName("com.zxl.dailypractice.card.three.february.february1.CoverList"));
        setField(term1074, term1074.getClass(), "neName", "");
        setField(term1074, term1074.getClass(), "ipAddress", "");
        Object term1077 = newInstance(Class.forName("com.zxl.dailypractice.card.three.february.february1.CoverList"));
        setField(term1077, term1077.getClass(), "neName", "");
        setField(term1077, term1077.getClass(), "ipAddress", "");
        Object term1080 = newInstance(Class.forName("com.zxl.dailypractice.card.three.february.february1.CoverList"));
        setField(term1080, term1080.getClass(), "neName", "");
        setField(term1080, term1080.getClass(), "ipAddress", "");
        ArrayList term1069 = new ArrayList();
        ((ArrayList) term1069).add(term1071);
        ((ArrayList) term1069).add(term1074);
        ((ArrayList) term1069).add(term1077);
        ((ArrayList) term1069).add(term1080);
        term1020 = newInstance(Class.forName("com.zxl.dailypractice.card.three.february.february1.IcutWSReq"));
        Object term1085 = newInstance(Class.forName("java.util.Date"));
        Object term1087 = newInstance(Class.forName("java.util.Date"));
        setField(term1020, term1020.getClass(), "orderId", "TJmVBGfTML");
        setField(term1020, term1020.getClass(), "city", "tPlsykYBqO");
        setField(term1020, term1020.getClass(), "classify", "bLPjGVBhlX");
        setField(term1020, term1020.getClass(), "neName", "whBvTVIIlC");
        setField(term1020, term1020.getClass(), "coverList", term1069);
        setLongField(term1085, term1085.getClass(), "fastTime", 1429023851389L);
        setField(term1085, term1085.getClass(), "cdate", null);
        setField(term1020, term1020.getClass(), "startTime", term1085);
        setLongField(term1087, term1087.getClass(), "fastTime", 1495357463288L);
        setField(term1087, term1087.getClass(), "cdate", null);
        setField(term1020, term1020.getClass(), "endTime", term1087);
        setField(term1020, term1020.getClass(), "opDetails", "wGmYcqUkgE");
        setField(term1020, term1020.getClass(), "cutType", "idgaQsnJpQ");
        setField(term1020, term1020.getClass(), "opType", "VgZnGoIFwQ");
        setField(term1020, term1020.getClass(), "opTitle", "jUbSRrkrYZ");
        setField(term1020, term1020.getClass(), "taskid", "bWWfajKbEX");
        setField(term1020, term1020.getClass(), "description", "cAPeiZHKGJ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.three.february.february1.IcutWSReq");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "LvJFtLBaxj";
        callMethod(klass, "setCity", argTypes, term1020, args);
    }

};


