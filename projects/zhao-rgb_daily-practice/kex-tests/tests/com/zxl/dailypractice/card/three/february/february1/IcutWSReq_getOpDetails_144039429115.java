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

public class IcutWSReq_getOpDetails_144039429115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3717;

    public IcutWSReq_getOpDetails_144039429115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term3768 = newInstance(Class.forName("com.zxl.dailypractice.card.three.february.february1.CoverList"));
        setField(term3768, term3768.getClass(), "neName", "");
        setField(term3768, term3768.getClass(), "ipAddress", "");
        Object term3771 = newInstance(Class.forName("com.zxl.dailypractice.card.three.february.february1.CoverList"));
        setField(term3771, term3771.getClass(), "neName", "");
        setField(term3771, term3771.getClass(), "ipAddress", "");
        ArrayList term3766 = new ArrayList();
        ((ArrayList) term3766).add(term3768);
        ((ArrayList) term3766).add(term3771);
        term3717 = newInstance(Class.forName("com.zxl.dailypractice.card.three.february.february1.IcutWSReq"));
        Object term3776 = newInstance(Class.forName("java.util.Date"));
        Object term3778 = newInstance(Class.forName("java.util.Date"));
        setField(term3717, term3717.getClass(), "orderId", "qYzsiuXOgS");
        setField(term3717, term3717.getClass(), "city", "bxrCBbrrct");
        setField(term3717, term3717.getClass(), "classify", "CKWpJaaaxX");
        setField(term3717, term3717.getClass(), "neName", "UBRmXJmfrt");
        setField(term3717, term3717.getClass(), "coverList", term3766);
        setLongField(term3776, term3776.getClass(), "fastTime", 1496859828764L);
        setField(term3776, term3776.getClass(), "cdate", null);
        setField(term3717, term3717.getClass(), "startTime", term3776);
        setLongField(term3778, term3778.getClass(), "fastTime", 1691868468367L);
        setField(term3778, term3778.getClass(), "cdate", null);
        setField(term3717, term3717.getClass(), "endTime", term3778);
        setField(term3717, term3717.getClass(), "opDetails", "ypEdrstygY");
        setField(term3717, term3717.getClass(), "cutType", "sNQFlATEeQ");
        setField(term3717, term3717.getClass(), "opType", "ZKMLioamsY");
        setField(term3717, term3717.getClass(), "opTitle", "WVbxuoDBcn");
        setField(term3717, term3717.getClass(), "taskid", "pvDEABOxLt");
        setField(term3717, term3717.getClass(), "description", "beAMpkroCQ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.three.february.february1.IcutWSReq");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOpDetails", argTypes, term3717, args);
    }

};


