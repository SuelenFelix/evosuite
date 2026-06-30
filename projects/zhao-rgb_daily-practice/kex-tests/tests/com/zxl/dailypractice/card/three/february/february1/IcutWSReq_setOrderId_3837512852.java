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

public class IcutWSReq_setOrderId_3837512852 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term519;

    public IcutWSReq_setOrderId_3837512852() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term570 = newInstance(Class.forName("com.zxl.dailypractice.card.three.february.february1.CoverList"));
        setField(term570, term570.getClass(), "neName", "");
        setField(term570, term570.getClass(), "ipAddress", "");
        Object term573 = newInstance(Class.forName("com.zxl.dailypractice.card.three.february.february1.CoverList"));
        setField(term573, term573.getClass(), "neName", "");
        setField(term573, term573.getClass(), "ipAddress", "");
        Object term576 = newInstance(Class.forName("com.zxl.dailypractice.card.three.february.february1.CoverList"));
        setField(term576, term576.getClass(), "neName", "");
        setField(term576, term576.getClass(), "ipAddress", "");
        Object term579 = newInstance(Class.forName("com.zxl.dailypractice.card.three.february.february1.CoverList"));
        setField(term579, term579.getClass(), "neName", "");
        setField(term579, term579.getClass(), "ipAddress", "");
        ArrayList term568 = new ArrayList();
        ((ArrayList) term568).add(term570);
        ((ArrayList) term568).add(term573);
        ((ArrayList) term568).add(term576);
        ((ArrayList) term568).add(term579);
        term519 = newInstance(Class.forName("com.zxl.dailypractice.card.three.february.february1.IcutWSReq"));
        Object term584 = newInstance(Class.forName("java.util.Date"));
        Object term586 = newInstance(Class.forName("java.util.Date"));
        setField(term519, term519.getClass(), "orderId", "AijpHYOFuy");
        setField(term519, term519.getClass(), "city", "SbAoxhfrkn");
        setField(term519, term519.getClass(), "classify", "kuTXqwMtDB");
        setField(term519, term519.getClass(), "neName", "Ghbwtircqb");
        setField(term519, term519.getClass(), "coverList", term568);
        setLongField(term584, term584.getClass(), "fastTime", 1610940182830L);
        setField(term584, term584.getClass(), "cdate", null);
        setField(term519, term519.getClass(), "startTime", term584);
        setLongField(term586, term586.getClass(), "fastTime", 1606045635837L);
        setField(term586, term586.getClass(), "cdate", null);
        setField(term519, term519.getClass(), "endTime", term586);
        setField(term519, term519.getClass(), "opDetails", "BndsHwAFMv");
        setField(term519, term519.getClass(), "cutType", "GzFkzHGYFt");
        setField(term519, term519.getClass(), "opType", "tShwQLRGNe");
        setField(term519, term519.getClass(), "opTitle", "LvtrsXUliU");
        setField(term519, term519.getClass(), "taskid", "xLbjWUgOIL");
        setField(term519, term519.getClass(), "description", "jDtqGUpnZN");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.three.february.february1.IcutWSReq");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "nGKItKLYNC";
        callMethod(klass, "setOrderId", argTypes, term519, args);
    }

};


