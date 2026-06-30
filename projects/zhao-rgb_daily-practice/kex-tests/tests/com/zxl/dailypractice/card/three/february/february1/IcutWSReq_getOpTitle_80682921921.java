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

public class IcutWSReq_getOpTitle_80682921921 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5229;

    public IcutWSReq_getOpTitle_80682921921() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term5280 = newInstance(Class.forName("com.zxl.dailypractice.card.three.february.february1.CoverList"));
        setField(term5280, term5280.getClass(), "neName", "");
        setField(term5280, term5280.getClass(), "ipAddress", "");
        ArrayList term5278 = new ArrayList();
        ((ArrayList) term5278).add(term5280);
        term5229 = newInstance(Class.forName("com.zxl.dailypractice.card.three.february.february1.IcutWSReq"));
        Object term5285 = newInstance(Class.forName("java.util.Date"));
        Object term5287 = newInstance(Class.forName("java.util.Date"));
        setField(term5229, term5229.getClass(), "orderId", "ITRRYiuDwH");
        setField(term5229, term5229.getClass(), "city", "llRfwANcVF");
        setField(term5229, term5229.getClass(), "classify", "sUEeHQTWkA");
        setField(term5229, term5229.getClass(), "neName", "BDIRCxAWLA");
        setField(term5229, term5229.getClass(), "coverList", term5278);
        setLongField(term5285, term5285.getClass(), "fastTime", 1678177615298L);
        setField(term5285, term5285.getClass(), "cdate", null);
        setField(term5229, term5229.getClass(), "startTime", term5285);
        setLongField(term5287, term5287.getClass(), "fastTime", 1666076287186L);
        setField(term5287, term5287.getClass(), "cdate", null);
        setField(term5229, term5229.getClass(), "endTime", term5287);
        setField(term5229, term5229.getClass(), "opDetails", "JOqQxuzRuZ");
        setField(term5229, term5229.getClass(), "cutType", "RSaoipUlsg");
        setField(term5229, term5229.getClass(), "opType", "cSHGbqKqlN");
        setField(term5229, term5229.getClass(), "opTitle", "pFAfANnxup");
        setField(term5229, term5229.getClass(), "taskid", "FbSIUZyBXZ");
        setField(term5229, term5229.getClass(), "description", "mhQDwIyrRi");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.three.february.february1.IcutWSReq");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOpTitle", argTypes, term5229, args);
    }

};


