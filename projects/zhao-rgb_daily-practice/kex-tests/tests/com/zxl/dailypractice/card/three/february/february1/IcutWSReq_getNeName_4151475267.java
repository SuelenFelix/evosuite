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

public class IcutWSReq_getNeName_4151475267 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1784;

    public IcutWSReq_getNeName_4151475267() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1835 = newInstance(Class.forName("com.zxl.dailypractice.card.three.february.february1.CoverList"));
        setField(term1835, term1835.getClass(), "neName", "");
        setField(term1835, term1835.getClass(), "ipAddress", "");
        Object term1838 = newInstance(Class.forName("com.zxl.dailypractice.card.three.february.february1.CoverList"));
        setField(term1838, term1838.getClass(), "neName", "");
        setField(term1838, term1838.getClass(), "ipAddress", "");
        ArrayList term1833 = new ArrayList();
        ((ArrayList) term1833).add(term1835);
        ((ArrayList) term1833).add(term1838);
        term1784 = newInstance(Class.forName("com.zxl.dailypractice.card.three.february.february1.IcutWSReq"));
        Object term1843 = newInstance(Class.forName("java.util.Date"));
        Object term1845 = newInstance(Class.forName("java.util.Date"));
        setField(term1784, term1784.getClass(), "orderId", "hCWPJQKpdc");
        setField(term1784, term1784.getClass(), "city", "WzMEhMXkKx");
        setField(term1784, term1784.getClass(), "classify", "XOiDvlDhdc");
        setField(term1784, term1784.getClass(), "neName", "AdxvLJhNLe");
        setField(term1784, term1784.getClass(), "coverList", term1833);
        setLongField(term1843, term1843.getClass(), "fastTime", 1745462962080L);
        setField(term1843, term1843.getClass(), "cdate", null);
        setField(term1784, term1784.getClass(), "startTime", term1843);
        setLongField(term1845, term1845.getClass(), "fastTime", 1349069753960L);
        setField(term1845, term1845.getClass(), "cdate", null);
        setField(term1784, term1784.getClass(), "endTime", term1845);
        setField(term1784, term1784.getClass(), "opDetails", "SdCKLMIYnX");
        setField(term1784, term1784.getClass(), "cutType", "OJJtVNPyKZ");
        setField(term1784, term1784.getClass(), "opType", "AKNapTAfmD");
        setField(term1784, term1784.getClass(), "opTitle", "xJgPlLxpgC");
        setField(term1784, term1784.getClass(), "taskid", "EYtfuJaxiM");
        setField(term1784, term1784.getClass(), "description", "gCWtLVKVVe");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.three.february.february1.IcutWSReq");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNeName", argTypes, term1784, args);
    }

};


