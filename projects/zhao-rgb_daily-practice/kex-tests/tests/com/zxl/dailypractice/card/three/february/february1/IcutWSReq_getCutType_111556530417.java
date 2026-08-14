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

public class IcutWSReq_getCutType_111556530417 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4224;

    public IcutWSReq_getCutType_111556530417() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term4275 = newInstance(Class.forName("com.zxl.dailypractice.card.three.february.february1.CoverList"));
        setField(term4275, term4275.getClass(), "neName", "");
        setField(term4275, term4275.getClass(), "ipAddress", "");
        ArrayList term4273 = new ArrayList();
        ((ArrayList) term4273).add(term4275);
        term4224 = newInstance(Class.forName("com.zxl.dailypractice.card.three.february.february1.IcutWSReq"));
        Object term4280 = newInstance(Class.forName("java.util.Date"));
        Object term4282 = newInstance(Class.forName("java.util.Date"));
        setField(term4224, term4224.getClass(), "orderId", "oPxuZbkYio");
        setField(term4224, term4224.getClass(), "city", "vKitydDVnM");
        setField(term4224, term4224.getClass(), "classify", "urCiQnUFBM");
        setField(term4224, term4224.getClass(), "neName", "EKjQdtKxAM");
        setField(term4224, term4224.getClass(), "coverList", term4273);
        setLongField(term4280, term4280.getClass(), "fastTime", 1876872800559L);
        setField(term4280, term4280.getClass(), "cdate", null);
        setField(term4224, term4224.getClass(), "startTime", term4280);
        setLongField(term4282, term4282.getClass(), "fastTime", 1304532099366L);
        setField(term4282, term4282.getClass(), "cdate", null);
        setField(term4224, term4224.getClass(), "endTime", term4282);
        setField(term4224, term4224.getClass(), "opDetails", "dJGPlmSRnz");
        setField(term4224, term4224.getClass(), "cutType", "DPskuFUobI");
        setField(term4224, term4224.getClass(), "opType", "wBGfLpNNiZ");
        setField(term4224, term4224.getClass(), "opTitle", "yUGCjlqgJE");
        setField(term4224, term4224.getClass(), "taskid", "PXdVZyoJyC");
        setField(term4224, term4224.getClass(), "description", "vLerpqavFM");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.three.february.february1.IcutWSReq");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCutType", argTypes, term4224, args);
    }

};


