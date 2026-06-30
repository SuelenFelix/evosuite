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

public class IcutWSReq_getCoverList_17563682309 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2288;

    public IcutWSReq_getCoverList_17563682309() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term2339 = newInstance(Class.forName("com.zxl.dailypractice.card.three.february.february1.CoverList"));
        setField(term2339, term2339.getClass(), "neName", "");
        setField(term2339, term2339.getClass(), "ipAddress", "");
        Object term2342 = newInstance(Class.forName("com.zxl.dailypractice.card.three.february.february1.CoverList"));
        setField(term2342, term2342.getClass(), "neName", "");
        setField(term2342, term2342.getClass(), "ipAddress", "");
        Object term2345 = newInstance(Class.forName("com.zxl.dailypractice.card.three.february.february1.CoverList"));
        setField(term2345, term2345.getClass(), "neName", "");
        setField(term2345, term2345.getClass(), "ipAddress", "");
        Object term2348 = newInstance(Class.forName("com.zxl.dailypractice.card.three.february.february1.CoverList"));
        setField(term2348, term2348.getClass(), "neName", "");
        setField(term2348, term2348.getClass(), "ipAddress", "");
        Object term2351 = newInstance(Class.forName("com.zxl.dailypractice.card.three.february.february1.CoverList"));
        setField(term2351, term2351.getClass(), "neName", "");
        setField(term2351, term2351.getClass(), "ipAddress", "");
        Object term2354 = newInstance(Class.forName("com.zxl.dailypractice.card.three.february.february1.CoverList"));
        setField(term2354, term2354.getClass(), "neName", "");
        setField(term2354, term2354.getClass(), "ipAddress", "");
        Object term2357 = newInstance(Class.forName("com.zxl.dailypractice.card.three.february.february1.CoverList"));
        setField(term2357, term2357.getClass(), "neName", "");
        setField(term2357, term2357.getClass(), "ipAddress", "");
        ArrayList term2337 = new ArrayList();
        ((ArrayList) term2337).add(term2339);
        ((ArrayList) term2337).add(term2342);
        ((ArrayList) term2337).add(term2345);
        ((ArrayList) term2337).add(term2348);
        ((ArrayList) term2337).add(term2351);
        ((ArrayList) term2337).add(term2354);
        ((ArrayList) term2337).add(term2357);
        term2288 = newInstance(Class.forName("com.zxl.dailypractice.card.three.february.february1.IcutWSReq"));
        Object term2362 = newInstance(Class.forName("java.util.Date"));
        Object term2364 = newInstance(Class.forName("java.util.Date"));
        setField(term2288, term2288.getClass(), "orderId", "HWkpTmtlrc");
        setField(term2288, term2288.getClass(), "city", "hMmaoREuCK");
        setField(term2288, term2288.getClass(), "classify", "VeDtgDzGAN");
        setField(term2288, term2288.getClass(), "neName", "aWYOWZFyaX");
        setField(term2288, term2288.getClass(), "coverList", term2337);
        setLongField(term2362, term2362.getClass(), "fastTime", 1882638884364L);
        setField(term2362, term2362.getClass(), "cdate", null);
        setField(term2288, term2288.getClass(), "startTime", term2362);
        setLongField(term2364, term2364.getClass(), "fastTime", 1437757323580L);
        setField(term2364, term2364.getClass(), "cdate", null);
        setField(term2288, term2288.getClass(), "endTime", term2364);
        setField(term2288, term2288.getClass(), "opDetails", "lihXWlGDxk");
        setField(term2288, term2288.getClass(), "cutType", "JmcmxoGhIK");
        setField(term2288, term2288.getClass(), "opType", "jXzmYyrnnT");
        setField(term2288, term2288.getClass(), "opTitle", "igCAtimmYB");
        setField(term2288, term2288.getClass(), "taskid", "DyiXbeYIaN");
        setField(term2288, term2288.getClass(), "description", "VGizxZnyHX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.three.february.february1.IcutWSReq");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCoverList", argTypes, term2288, args);
    }

};


