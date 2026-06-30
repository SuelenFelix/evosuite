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

public class IcutWSReq_setTaskid_81607265624 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5965;

    public IcutWSReq_setTaskid_81607265624() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term6016 = newInstance(Class.forName("com.zxl.dailypractice.card.three.february.february1.CoverList"));
        setField(term6016, term6016.getClass(), "neName", "");
        setField(term6016, term6016.getClass(), "ipAddress", "");
        ArrayList term6014 = new ArrayList();
        ((ArrayList) term6014).add(term6016);
        term5965 = newInstance(Class.forName("com.zxl.dailypractice.card.three.february.february1.IcutWSReq"));
        Object term6021 = newInstance(Class.forName("java.util.Date"));
        Object term6023 = newInstance(Class.forName("java.util.Date"));
        setField(term5965, term5965.getClass(), "orderId", "bKBSncrMEZ");
        setField(term5965, term5965.getClass(), "city", "yeSXGqQExb");
        setField(term5965, term5965.getClass(), "classify", "uXYcXVYJZM");
        setField(term5965, term5965.getClass(), "neName", "BJhjdJUhkz");
        setField(term5965, term5965.getClass(), "coverList", term6014);
        setLongField(term6021, term6021.getClass(), "fastTime", 1741444563811L);
        setField(term6021, term6021.getClass(), "cdate", null);
        setField(term5965, term5965.getClass(), "startTime", term6021);
        setLongField(term6023, term6023.getClass(), "fastTime", 1761994701322L);
        setField(term6023, term6023.getClass(), "cdate", null);
        setField(term5965, term5965.getClass(), "endTime", term6023);
        setField(term5965, term5965.getClass(), "opDetails", "UimMMORkzd");
        setField(term5965, term5965.getClass(), "cutType", "huVIXUWLtI");
        setField(term5965, term5965.getClass(), "opType", "vhKzFyKPOT");
        setField(term5965, term5965.getClass(), "opTitle", "nQhIgWXdRc");
        setField(term5965, term5965.getClass(), "taskid", "EusenEbIoF");
        setField(term5965, term5965.getClass(), "description", "SScVQYSvWH");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.three.february.february1.IcutWSReq");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "MnovcqFhCl";
        callMethod(klass, "setTaskid", argTypes, term5965, args);
    }

};


