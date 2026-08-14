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

public class IcutWSReq_setNeName_14307662908 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2019;

    public IcutWSReq_setNeName_14307662908() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term2070 = newInstance(Class.forName("com.zxl.dailypractice.card.three.february.february1.CoverList"));
        setField(term2070, term2070.getClass(), "neName", "");
        setField(term2070, term2070.getClass(), "ipAddress", "");
        Object term2073 = newInstance(Class.forName("com.zxl.dailypractice.card.three.february.february1.CoverList"));
        setField(term2073, term2073.getClass(), "neName", "");
        setField(term2073, term2073.getClass(), "ipAddress", "");
        Object term2076 = newInstance(Class.forName("com.zxl.dailypractice.card.three.february.february1.CoverList"));
        setField(term2076, term2076.getClass(), "neName", "");
        setField(term2076, term2076.getClass(), "ipAddress", "");
        Object term2079 = newInstance(Class.forName("com.zxl.dailypractice.card.three.february.february1.CoverList"));
        setField(term2079, term2079.getClass(), "neName", "");
        setField(term2079, term2079.getClass(), "ipAddress", "");
        Object term2082 = newInstance(Class.forName("com.zxl.dailypractice.card.three.february.february1.CoverList"));
        setField(term2082, term2082.getClass(), "neName", "");
        setField(term2082, term2082.getClass(), "ipAddress", "");
        Object term2085 = newInstance(Class.forName("com.zxl.dailypractice.card.three.february.february1.CoverList"));
        setField(term2085, term2085.getClass(), "neName", "");
        setField(term2085, term2085.getClass(), "ipAddress", "");
        ArrayList term2068 = new ArrayList();
        ((ArrayList) term2068).add(term2070);
        ((ArrayList) term2068).add(term2073);
        ((ArrayList) term2068).add(term2076);
        ((ArrayList) term2068).add(term2079);
        ((ArrayList) term2068).add(term2082);
        ((ArrayList) term2068).add(term2085);
        term2019 = newInstance(Class.forName("com.zxl.dailypractice.card.three.february.february1.IcutWSReq"));
        Object term2090 = newInstance(Class.forName("java.util.Date"));
        Object term2092 = newInstance(Class.forName("java.util.Date"));
        setField(term2019, term2019.getClass(), "orderId", "fWKJoSoCwE");
        setField(term2019, term2019.getClass(), "city", "wfaXBpWAUH");
        setField(term2019, term2019.getClass(), "classify", "VMeAzAHwZj");
        setField(term2019, term2019.getClass(), "neName", "PznxWXsZME");
        setField(term2019, term2019.getClass(), "coverList", term2068);
        setLongField(term2090, term2090.getClass(), "fastTime", 1706078172457L);
        setField(term2090, term2090.getClass(), "cdate", null);
        setField(term2019, term2019.getClass(), "startTime", term2090);
        setLongField(term2092, term2092.getClass(), "fastTime", 1863631094992L);
        setField(term2092, term2092.getClass(), "cdate", null);
        setField(term2019, term2019.getClass(), "endTime", term2092);
        setField(term2019, term2019.getClass(), "opDetails", "ZfdXfCCFDf");
        setField(term2019, term2019.getClass(), "cutType", "MwwjNtdOFT");
        setField(term2019, term2019.getClass(), "opType", "VYkqXKVlAJ");
        setField(term2019, term2019.getClass(), "opTitle", "XkIoWJRNwN");
        setField(term2019, term2019.getClass(), "taskid", "aNWLJdrZMq");
        setField(term2019, term2019.getClass(), "description", "HHmNoYxIGj");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.three.february.february1.IcutWSReq");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "PtirvZmsGt";
        callMethod(klass, "setNeName", argTypes, term2019, args);
    }

};


