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

public class IcutWSReq_setCutType_192704632818 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4456;

    public IcutWSReq_setCutType_192704632818() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term4507 = newInstance(Class.forName("com.zxl.dailypractice.card.three.february.february1.CoverList"));
        setField(term4507, term4507.getClass(), "neName", "");
        setField(term4507, term4507.getClass(), "ipAddress", "");
        Object term4510 = newInstance(Class.forName("com.zxl.dailypractice.card.three.february.february1.CoverList"));
        setField(term4510, term4510.getClass(), "neName", "");
        setField(term4510, term4510.getClass(), "ipAddress", "");
        Object term4513 = newInstance(Class.forName("com.zxl.dailypractice.card.three.february.february1.CoverList"));
        setField(term4513, term4513.getClass(), "neName", "");
        setField(term4513, term4513.getClass(), "ipAddress", "");
        Object term4516 = newInstance(Class.forName("com.zxl.dailypractice.card.three.february.february1.CoverList"));
        setField(term4516, term4516.getClass(), "neName", "");
        setField(term4516, term4516.getClass(), "ipAddress", "");
        Object term4519 = newInstance(Class.forName("com.zxl.dailypractice.card.three.february.february1.CoverList"));
        setField(term4519, term4519.getClass(), "neName", "");
        setField(term4519, term4519.getClass(), "ipAddress", "");
        ArrayList term4505 = new ArrayList();
        ((ArrayList) term4505).add(term4507);
        ((ArrayList) term4505).add(term4510);
        ((ArrayList) term4505).add(term4513);
        ((ArrayList) term4505).add(term4516);
        ((ArrayList) term4505).add(term4519);
        term4456 = newInstance(Class.forName("com.zxl.dailypractice.card.three.february.february1.IcutWSReq"));
        Object term4524 = newInstance(Class.forName("java.util.Date"));
        Object term4526 = newInstance(Class.forName("java.util.Date"));
        setField(term4456, term4456.getClass(), "orderId", "qnvxzwuGKX");
        setField(term4456, term4456.getClass(), "city", "EdPAvpluZg");
        setField(term4456, term4456.getClass(), "classify", "DzHVBMqWtE");
        setField(term4456, term4456.getClass(), "neName", "THZSpzBRYP");
        setField(term4456, term4456.getClass(), "coverList", term4505);
        setLongField(term4524, term4524.getClass(), "fastTime", 1488725902101L);
        setField(term4524, term4524.getClass(), "cdate", null);
        setField(term4456, term4456.getClass(), "startTime", term4524);
        setLongField(term4526, term4526.getClass(), "fastTime", 1311560117361L);
        setField(term4526, term4526.getClass(), "cdate", null);
        setField(term4456, term4456.getClass(), "endTime", term4526);
        setField(term4456, term4456.getClass(), "opDetails", "zNFLXMifnS");
        setField(term4456, term4456.getClass(), "cutType", "HHQcYMSBVc");
        setField(term4456, term4456.getClass(), "opType", "wdoqITnaAP");
        setField(term4456, term4456.getClass(), "opTitle", "rIPMBcrNqB");
        setField(term4456, term4456.getClass(), "taskid", "UDaboHZHhz");
        setField(term4456, term4456.getClass(), "description", "nRvKihUSPj");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.three.february.february1.IcutWSReq");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "BbNeQJpYPr";
        callMethod(klass, "setCutType", argTypes, term4456, args);
    }

};


