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

public class IcutWSReq_setClassify_5687963006 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1515;

    public IcutWSReq_setClassify_5687963006() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1566 = newInstance(Class.forName("com.zxl.dailypractice.card.three.february.february1.CoverList"));
        setField(term1566, term1566.getClass(), "neName", "");
        setField(term1566, term1566.getClass(), "ipAddress", "");
        Object term1569 = newInstance(Class.forName("com.zxl.dailypractice.card.three.february.february1.CoverList"));
        setField(term1569, term1569.getClass(), "neName", "");
        setField(term1569, term1569.getClass(), "ipAddress", "");
        Object term1572 = newInstance(Class.forName("com.zxl.dailypractice.card.three.february.february1.CoverList"));
        setField(term1572, term1572.getClass(), "neName", "");
        setField(term1572, term1572.getClass(), "ipAddress", "");
        Object term1575 = newInstance(Class.forName("com.zxl.dailypractice.card.three.february.february1.CoverList"));
        setField(term1575, term1575.getClass(), "neName", "");
        setField(term1575, term1575.getClass(), "ipAddress", "");
        Object term1578 = newInstance(Class.forName("com.zxl.dailypractice.card.three.february.february1.CoverList"));
        setField(term1578, term1578.getClass(), "neName", "");
        setField(term1578, term1578.getClass(), "ipAddress", "");
        Object term1581 = newInstance(Class.forName("com.zxl.dailypractice.card.three.february.february1.CoverList"));
        setField(term1581, term1581.getClass(), "neName", "");
        setField(term1581, term1581.getClass(), "ipAddress", "");
        ArrayList term1564 = new ArrayList();
        ((ArrayList) term1564).add(term1566);
        ((ArrayList) term1564).add(term1569);
        ((ArrayList) term1564).add(term1572);
        ((ArrayList) term1564).add(term1575);
        ((ArrayList) term1564).add(term1578);
        ((ArrayList) term1564).add(term1581);
        term1515 = newInstance(Class.forName("com.zxl.dailypractice.card.three.february.february1.IcutWSReq"));
        Object term1586 = newInstance(Class.forName("java.util.Date"));
        Object term1588 = newInstance(Class.forName("java.util.Date"));
        setField(term1515, term1515.getClass(), "orderId", "XPKmummaqg");
        setField(term1515, term1515.getClass(), "city", "BKLfkLiZTH");
        setField(term1515, term1515.getClass(), "classify", "SPpkrGcPRr");
        setField(term1515, term1515.getClass(), "neName", "sEccwbJKYE");
        setField(term1515, term1515.getClass(), "coverList", term1564);
        setLongField(term1586, term1586.getClass(), "fastTime", 1797203628025L);
        setField(term1586, term1586.getClass(), "cdate", null);
        setField(term1515, term1515.getClass(), "startTime", term1586);
        setLongField(term1588, term1588.getClass(), "fastTime", 1589457921030L);
        setField(term1588, term1588.getClass(), "cdate", null);
        setField(term1515, term1515.getClass(), "endTime", term1588);
        setField(term1515, term1515.getClass(), "opDetails", "yGtHPyvYiQ");
        setField(term1515, term1515.getClass(), "cutType", "MvRIxilFMJ");
        setField(term1515, term1515.getClass(), "opType", "iNwOJRBEjp");
        setField(term1515, term1515.getClass(), "opTitle", "XylxrMBraH");
        setField(term1515, term1515.getClass(), "taskid", "pORebkoRdD");
        setField(term1515, term1515.getClass(), "description", "mXGCWJDOqA");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.three.february.february1.IcutWSReq");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "dpNsDgfPso";
        callMethod(klass, "setClassify", argTypes, term1515, args);
    }

};


