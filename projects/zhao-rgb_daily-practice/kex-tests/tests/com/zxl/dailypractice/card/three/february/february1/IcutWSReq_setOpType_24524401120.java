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

public class IcutWSReq_setOpType_24524401120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4966;

    public IcutWSReq_setOpType_24524401120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term5017 = newInstance(Class.forName("com.zxl.dailypractice.card.three.february.february1.CoverList"));
        setField(term5017, term5017.getClass(), "neName", "");
        setField(term5017, term5017.getClass(), "ipAddress", "");
        Object term5020 = newInstance(Class.forName("com.zxl.dailypractice.card.three.february.february1.CoverList"));
        setField(term5020, term5020.getClass(), "neName", "");
        setField(term5020, term5020.getClass(), "ipAddress", "");
        Object term5023 = newInstance(Class.forName("com.zxl.dailypractice.card.three.february.february1.CoverList"));
        setField(term5023, term5023.getClass(), "neName", "");
        setField(term5023, term5023.getClass(), "ipAddress", "");
        Object term5026 = newInstance(Class.forName("com.zxl.dailypractice.card.three.february.february1.CoverList"));
        setField(term5026, term5026.getClass(), "neName", "");
        setField(term5026, term5026.getClass(), "ipAddress", "");
        ArrayList term5015 = new ArrayList();
        ((ArrayList) term5015).add(term5017);
        ((ArrayList) term5015).add(term5020);
        ((ArrayList) term5015).add(term5023);
        ((ArrayList) term5015).add(term5026);
        term4966 = newInstance(Class.forName("com.zxl.dailypractice.card.three.february.february1.IcutWSReq"));
        Object term5031 = newInstance(Class.forName("java.util.Date"));
        Object term5033 = newInstance(Class.forName("java.util.Date"));
        setField(term4966, term4966.getClass(), "orderId", "aanyiAOJCl");
        setField(term4966, term4966.getClass(), "city", "VDokbsCuqq");
        setField(term4966, term4966.getClass(), "classify", "xClUIcPECX");
        setField(term4966, term4966.getClass(), "neName", "avhRaGZaBF");
        setField(term4966, term4966.getClass(), "coverList", term5015);
        setLongField(term5031, term5031.getClass(), "fastTime", 1405279189488L);
        setField(term5031, term5031.getClass(), "cdate", null);
        setField(term4966, term4966.getClass(), "startTime", term5031);
        setLongField(term5033, term5033.getClass(), "fastTime", 1822704644050L);
        setField(term5033, term5033.getClass(), "cdate", null);
        setField(term4966, term4966.getClass(), "endTime", term5033);
        setField(term4966, term4966.getClass(), "opDetails", "MeTmRZXErV");
        setField(term4966, term4966.getClass(), "cutType", "jNxbVmoZgq");
        setField(term4966, term4966.getClass(), "opType", "PvmBHIXaMY");
        setField(term4966, term4966.getClass(), "opTitle", "hulYxtowxw");
        setField(term4966, term4966.getClass(), "taskid", "GNEmuHPNcU");
        setField(term4966, term4966.getClass(), "description", "IoSfuKDFRe");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.three.february.february1.IcutWSReq");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "AWYyZiNfsm";
        callMethod(klass, "setOpType", argTypes, term4966, args);
    }

};


