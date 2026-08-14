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

public class IcutWSReq_setStartTime_31183287812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3023;
     Object term3152;

    public IcutWSReq_setStartTime_31183287812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3072 = new ArrayList();
        term3023 = newInstance(Class.forName("com.zxl.dailypractice.card.three.february.february1.IcutWSReq"));
        Object term3076 = newInstance(Class.forName("java.util.Date"));
        Object term3078 = newInstance(Class.forName("java.util.Date"));
        setField(term3023, term3023.getClass(), "orderId", "CFyoseFGLF");
        setField(term3023, term3023.getClass(), "city", "SFqCrhEWLm");
        setField(term3023, term3023.getClass(), "classify", "GZdcJyZntS");
        setField(term3023, term3023.getClass(), "neName", "OIHoJeysUi");
        setField(term3023, term3023.getClass(), "coverList", term3072);
        setLongField(term3076, term3076.getClass(), "fastTime", 1538078916394L);
        setField(term3076, term3076.getClass(), "cdate", null);
        setField(term3023, term3023.getClass(), "startTime", term3076);
        setLongField(term3078, term3078.getClass(), "fastTime", 1744090065937L);
        setField(term3078, term3078.getClass(), "cdate", null);
        setField(term3023, term3023.getClass(), "endTime", term3078);
        setField(term3023, term3023.getClass(), "opDetails", "WXMWFDGcLB");
        setField(term3023, term3023.getClass(), "cutType", "wKWbJssZuG");
        setField(term3023, term3023.getClass(), "opType", "NzBMMhkhpT");
        setField(term3023, term3023.getClass(), "opTitle", "qCpEbQDHdF");
        setField(term3023, term3023.getClass(), "taskid", "AHbZyFOmlo");
        setField(term3023, term3023.getClass(), "description", "TwfWVQGiIj");
        term3152 = newInstance(Class.forName("java.util.Date"));
        setLongField(term3152, term3152.getClass(), "fastTime", 1347400561385L);
        setField(term3152, term3152.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.three.february.february1.IcutWSReq");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Date");
        Object[] args = new Object[1];
        args[0] = term3152;
        callMethod(klass, "setStartTime", argTypes, term3023, args);
    }

};


