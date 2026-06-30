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

public class IcutWSReq_getClassify_10175461405 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1283;

    public IcutWSReq_getClassify_10175461405() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1334 = newInstance(Class.forName("com.zxl.dailypractice.card.three.february.february1.CoverList"));
        setField(term1334, term1334.getClass(), "neName", "");
        setField(term1334, term1334.getClass(), "ipAddress", "");
        ArrayList term1332 = new ArrayList();
        ((ArrayList) term1332).add(term1334);
        term1283 = newInstance(Class.forName("com.zxl.dailypractice.card.three.february.february1.IcutWSReq"));
        Object term1339 = newInstance(Class.forName("java.util.Date"));
        Object term1341 = newInstance(Class.forName("java.util.Date"));
        setField(term1283, term1283.getClass(), "orderId", "PHvxnGHptP");
        setField(term1283, term1283.getClass(), "city", "TimdotUuNC");
        setField(term1283, term1283.getClass(), "classify", "PkWMRdJcBb");
        setField(term1283, term1283.getClass(), "neName", "jSpAteRute");
        setField(term1283, term1283.getClass(), "coverList", term1332);
        setLongField(term1339, term1339.getClass(), "fastTime", 1645834034896L);
        setField(term1339, term1339.getClass(), "cdate", null);
        setField(term1283, term1283.getClass(), "startTime", term1339);
        setLongField(term1341, term1341.getClass(), "fastTime", 1500721068023L);
        setField(term1341, term1341.getClass(), "cdate", null);
        setField(term1283, term1283.getClass(), "endTime", term1341);
        setField(term1283, term1283.getClass(), "opDetails", "GVizqqzXpy");
        setField(term1283, term1283.getClass(), "cutType", "JqXGgAhZPl");
        setField(term1283, term1283.getClass(), "opType", "jiKYgYHqIS");
        setField(term1283, term1283.getClass(), "opTitle", "DfISiziTgG");
        setField(term1283, term1283.getClass(), "taskid", "XqgfKFvPSD");
        setField(term1283, term1283.getClass(), "description", "JiVRgTZvKc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.three.february.february1.IcutWSReq");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getClassify", argTypes, term1283, args);
    }

};


