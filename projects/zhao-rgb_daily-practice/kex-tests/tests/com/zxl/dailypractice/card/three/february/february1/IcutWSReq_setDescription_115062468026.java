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

public class IcutWSReq_setDescription_115062468026 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6451;

    public IcutWSReq_setDescription_115062468026() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term6502 = newInstance(Class.forName("com.zxl.dailypractice.card.three.february.february1.CoverList"));
        setField(term6502, term6502.getClass(), "neName", "");
        setField(term6502, term6502.getClass(), "ipAddress", "");
        Object term6505 = newInstance(Class.forName("com.zxl.dailypractice.card.three.february.february1.CoverList"));
        setField(term6505, term6505.getClass(), "neName", "");
        setField(term6505, term6505.getClass(), "ipAddress", "");
        ArrayList term6500 = new ArrayList();
        ((ArrayList) term6500).add(term6502);
        ((ArrayList) term6500).add(term6505);
        term6451 = newInstance(Class.forName("com.zxl.dailypractice.card.three.february.february1.IcutWSReq"));
        Object term6510 = newInstance(Class.forName("java.util.Date"));
        Object term6512 = newInstance(Class.forName("java.util.Date"));
        setField(term6451, term6451.getClass(), "orderId", "JisaWUxcNb");
        setField(term6451, term6451.getClass(), "city", "NxgmYPzWCI");
        setField(term6451, term6451.getClass(), "classify", "SqjyKmayBx");
        setField(term6451, term6451.getClass(), "neName", "XjDhvToxJy");
        setField(term6451, term6451.getClass(), "coverList", term6500);
        setLongField(term6510, term6510.getClass(), "fastTime", 1853963979281L);
        setField(term6510, term6510.getClass(), "cdate", null);
        setField(term6451, term6451.getClass(), "startTime", term6510);
        setLongField(term6512, term6512.getClass(), "fastTime", 1795936337628L);
        setField(term6512, term6512.getClass(), "cdate", null);
        setField(term6451, term6451.getClass(), "endTime", term6512);
        setField(term6451, term6451.getClass(), "opDetails", "ubodzJoMGW");
        setField(term6451, term6451.getClass(), "cutType", "weddIktxOA");
        setField(term6451, term6451.getClass(), "opType", "uSlMeISsDD");
        setField(term6451, term6451.getClass(), "opTitle", "WdCiTDUKqn");
        setField(term6451, term6451.getClass(), "taskid", "PSizQDoxxe");
        setField(term6451, term6451.getClass(), "description", "mKaHyMybrK");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.three.february.february1.IcutWSReq");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "AyrEXuGrEj";
        callMethod(klass, "setDescription", argTypes, term6451, args);
    }

};


