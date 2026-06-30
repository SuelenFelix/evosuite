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

public class IcutWSReq_setOpTitle_465180522 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5461;

    public IcutWSReq_setOpTitle_465180522() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term5512 = newInstance(Class.forName("com.zxl.dailypractice.card.three.february.february1.CoverList"));
        setField(term5512, term5512.getClass(), "neName", "");
        setField(term5512, term5512.getClass(), "ipAddress", "");
        Object term5515 = newInstance(Class.forName("com.zxl.dailypractice.card.three.february.february1.CoverList"));
        setField(term5515, term5515.getClass(), "neName", "");
        setField(term5515, term5515.getClass(), "ipAddress", "");
        ArrayList term5510 = new ArrayList();
        ((ArrayList) term5510).add(term5512);
        ((ArrayList) term5510).add(term5515);
        term5461 = newInstance(Class.forName("com.zxl.dailypractice.card.three.february.february1.IcutWSReq"));
        Object term5520 = newInstance(Class.forName("java.util.Date"));
        Object term5522 = newInstance(Class.forName("java.util.Date"));
        setField(term5461, term5461.getClass(), "orderId", "HpZXWDPhlg");
        setField(term5461, term5461.getClass(), "city", "lBOokzEPfe");
        setField(term5461, term5461.getClass(), "classify", "dtGZCsKXbW");
        setField(term5461, term5461.getClass(), "neName", "bdyhHbDAmJ");
        setField(term5461, term5461.getClass(), "coverList", term5510);
        setLongField(term5520, term5520.getClass(), "fastTime", 1426018874434L);
        setField(term5520, term5520.getClass(), "cdate", null);
        setField(term5461, term5461.getClass(), "startTime", term5520);
        setLongField(term5522, term5522.getClass(), "fastTime", 1633004775487L);
        setField(term5522, term5522.getClass(), "cdate", null);
        setField(term5461, term5461.getClass(), "endTime", term5522);
        setField(term5461, term5461.getClass(), "opDetails", "mGRiYhnMcR");
        setField(term5461, term5461.getClass(), "cutType", "NFlvfJCVPO");
        setField(term5461, term5461.getClass(), "opType", "KarbTXFmUU");
        setField(term5461, term5461.getClass(), "opTitle", "jiUSjqwSIQ");
        setField(term5461, term5461.getClass(), "taskid", "MgLCedQfoj");
        setField(term5461, term5461.getClass(), "description", "zgKiINdgNu");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.three.february.february1.IcutWSReq");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "zLMTXDQHYH";
        callMethod(klass, "setOpTitle", argTypes, term5461, args);
    }

};


