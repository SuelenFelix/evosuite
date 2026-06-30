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

public class IcutWSReq_setEndTime_147501566914 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3486;
     Object term3615;

    public IcutWSReq_setEndTime_147501566914() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3535 = new ArrayList();
        term3486 = newInstance(Class.forName("com.zxl.dailypractice.card.three.february.february1.IcutWSReq"));
        Object term3539 = newInstance(Class.forName("java.util.Date"));
        Object term3541 = newInstance(Class.forName("java.util.Date"));
        setField(term3486, term3486.getClass(), "orderId", "iIRsCSYqXH");
        setField(term3486, term3486.getClass(), "city", "nghfqDXyCG");
        setField(term3486, term3486.getClass(), "classify", "WBAOTqErtm");
        setField(term3486, term3486.getClass(), "neName", "PqtVXXZMqK");
        setField(term3486, term3486.getClass(), "coverList", term3535);
        setLongField(term3539, term3539.getClass(), "fastTime", 1739417792956L);
        setField(term3539, term3539.getClass(), "cdate", null);
        setField(term3486, term3486.getClass(), "startTime", term3539);
        setLongField(term3541, term3541.getClass(), "fastTime", 1329640267573L);
        setField(term3541, term3541.getClass(), "cdate", null);
        setField(term3486, term3486.getClass(), "endTime", term3541);
        setField(term3486, term3486.getClass(), "opDetails", "rYbtIDVdnd");
        setField(term3486, term3486.getClass(), "cutType", "UKAReurpHG");
        setField(term3486, term3486.getClass(), "opType", "WVRMUmrljA");
        setField(term3486, term3486.getClass(), "opTitle", "NTlKJDDWlk");
        setField(term3486, term3486.getClass(), "taskid", "vOuMEpOQAg");
        setField(term3486, term3486.getClass(), "description", "SIODFGaQhr");
        term3615 = newInstance(Class.forName("java.util.Date"));
        setLongField(term3615, term3615.getClass(), "fastTime", 1334853104718L);
        setField(term3615, term3615.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.three.february.february1.IcutWSReq");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Date");
        Object[] args = new Object[1];
        args[0] = term3615;
        callMethod(klass, "setEndTime", argTypes, term3486, args);
    }

};


