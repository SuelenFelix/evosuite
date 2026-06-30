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

public class IcutWSReq_setOpDetails_127763685116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3952;

    public IcutWSReq_setOpDetails_127763685116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term4003 = newInstance(Class.forName("com.zxl.dailypractice.card.three.february.february1.CoverList"));
        setField(term4003, term4003.getClass(), "neName", "");
        setField(term4003, term4003.getClass(), "ipAddress", "");
        Object term4006 = newInstance(Class.forName("com.zxl.dailypractice.card.three.february.february1.CoverList"));
        setField(term4006, term4006.getClass(), "neName", "");
        setField(term4006, term4006.getClass(), "ipAddress", "");
        Object term4009 = newInstance(Class.forName("com.zxl.dailypractice.card.three.february.february1.CoverList"));
        setField(term4009, term4009.getClass(), "neName", "");
        setField(term4009, term4009.getClass(), "ipAddress", "");
        Object term4012 = newInstance(Class.forName("com.zxl.dailypractice.card.three.february.february1.CoverList"));
        setField(term4012, term4012.getClass(), "neName", "");
        setField(term4012, term4012.getClass(), "ipAddress", "");
        Object term4015 = newInstance(Class.forName("com.zxl.dailypractice.card.three.february.february1.CoverList"));
        setField(term4015, term4015.getClass(), "neName", "");
        setField(term4015, term4015.getClass(), "ipAddress", "");
        Object term4018 = newInstance(Class.forName("com.zxl.dailypractice.card.three.february.february1.CoverList"));
        setField(term4018, term4018.getClass(), "neName", "");
        setField(term4018, term4018.getClass(), "ipAddress", "");
        Object term4021 = newInstance(Class.forName("com.zxl.dailypractice.card.three.february.february1.CoverList"));
        setField(term4021, term4021.getClass(), "neName", "");
        setField(term4021, term4021.getClass(), "ipAddress", "");
        ArrayList term4001 = new ArrayList();
        ((ArrayList) term4001).add(term4003);
        ((ArrayList) term4001).add(term4006);
        ((ArrayList) term4001).add(term4009);
        ((ArrayList) term4001).add(term4012);
        ((ArrayList) term4001).add(term4015);
        ((ArrayList) term4001).add(term4018);
        ((ArrayList) term4001).add(term4021);
        term3952 = newInstance(Class.forName("com.zxl.dailypractice.card.three.february.february1.IcutWSReq"));
        Object term4026 = newInstance(Class.forName("java.util.Date"));
        Object term4028 = newInstance(Class.forName("java.util.Date"));
        setField(term3952, term3952.getClass(), "orderId", "uSUvKAyuvd");
        setField(term3952, term3952.getClass(), "city", "onQLVONGuf");
        setField(term3952, term3952.getClass(), "classify", "SOrEHbcbmn");
        setField(term3952, term3952.getClass(), "neName", "bnsyeQXFdu");
        setField(term3952, term3952.getClass(), "coverList", term4001);
        setLongField(term4026, term4026.getClass(), "fastTime", 1442370534632L);
        setField(term4026, term4026.getClass(), "cdate", null);
        setField(term3952, term3952.getClass(), "startTime", term4026);
        setLongField(term4028, term4028.getClass(), "fastTime", 1659994192918L);
        setField(term4028, term4028.getClass(), "cdate", null);
        setField(term3952, term3952.getClass(), "endTime", term4028);
        setField(term3952, term3952.getClass(), "opDetails", "iCCsaLHohG");
        setField(term3952, term3952.getClass(), "cutType", "NJhGgctbdj");
        setField(term3952, term3952.getClass(), "opType", "MYWYUeLGOp");
        setField(term3952, term3952.getClass(), "opTitle", "tsTGdgQYUL");
        setField(term3952, term3952.getClass(), "taskid", "TtGbVmKcnX");
        setField(term3952, term3952.getClass(), "description", "GJVkUrCVdD");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.three.february.february1.IcutWSReq");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "zNdorvdUgu";
        callMethod(klass, "setOpDetails", argTypes, term3952, args);
    }

};


