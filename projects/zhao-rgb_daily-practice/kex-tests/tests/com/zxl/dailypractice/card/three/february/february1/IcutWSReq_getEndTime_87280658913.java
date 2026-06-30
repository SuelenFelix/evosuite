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

public class IcutWSReq_getEndTime_87280658913 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3254;

    public IcutWSReq_getEndTime_87280658913() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term3305 = newInstance(Class.forName("com.zxl.dailypractice.card.three.february.february1.CoverList"));
        setField(term3305, term3305.getClass(), "neName", "");
        setField(term3305, term3305.getClass(), "ipAddress", "");
        ArrayList term3303 = new ArrayList();
        ((ArrayList) term3303).add(term3305);
        term3254 = newInstance(Class.forName("com.zxl.dailypractice.card.three.february.february1.IcutWSReq"));
        Object term3310 = newInstance(Class.forName("java.util.Date"));
        Object term3312 = newInstance(Class.forName("java.util.Date"));
        setField(term3254, term3254.getClass(), "orderId", "gUvcueTURF");
        setField(term3254, term3254.getClass(), "city", "EwQBhZjCIT");
        setField(term3254, term3254.getClass(), "classify", "aSkmSwTnEw");
        setField(term3254, term3254.getClass(), "neName", "xvkbvaEGYd");
        setField(term3254, term3254.getClass(), "coverList", term3303);
        setLongField(term3310, term3310.getClass(), "fastTime", 1502158153899L);
        setField(term3310, term3310.getClass(), "cdate", null);
        setField(term3254, term3254.getClass(), "startTime", term3310);
        setLongField(term3312, term3312.getClass(), "fastTime", 1630952644759L);
        setField(term3312, term3312.getClass(), "cdate", null);
        setField(term3254, term3254.getClass(), "endTime", term3312);
        setField(term3254, term3254.getClass(), "opDetails", "OcJCIDNIXA");
        setField(term3254, term3254.getClass(), "cutType", "XfRABIFVEp");
        setField(term3254, term3254.getClass(), "opType", "MHGKyEnwKc");
        setField(term3254, term3254.getClass(), "opTitle", "ShIELyuULw");
        setField(term3254, term3254.getClass(), "taskid", "IpQuOGMgmj");
        setField(term3254, term3254.getClass(), "description", "pJbnHTYrxn");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.three.february.february1.IcutWSReq");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEndTime", argTypes, term3254, args);
    }

};


