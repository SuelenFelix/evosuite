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

public class IcutWSReq_getOpType_160066980519 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4722;

    public IcutWSReq_getOpType_160066980519() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term4773 = newInstance(Class.forName("com.zxl.dailypractice.card.three.february.february1.CoverList"));
        setField(term4773, term4773.getClass(), "neName", "");
        setField(term4773, term4773.getClass(), "ipAddress", "");
        Object term4776 = newInstance(Class.forName("com.zxl.dailypractice.card.three.february.february1.CoverList"));
        setField(term4776, term4776.getClass(), "neName", "");
        setField(term4776, term4776.getClass(), "ipAddress", "");
        Object term4779 = newInstance(Class.forName("com.zxl.dailypractice.card.three.february.february1.CoverList"));
        setField(term4779, term4779.getClass(), "neName", "");
        setField(term4779, term4779.getClass(), "ipAddress", "");
        Object term4782 = newInstance(Class.forName("com.zxl.dailypractice.card.three.february.february1.CoverList"));
        setField(term4782, term4782.getClass(), "neName", "");
        setField(term4782, term4782.getClass(), "ipAddress", "");
        Object term4785 = newInstance(Class.forName("com.zxl.dailypractice.card.three.february.february1.CoverList"));
        setField(term4785, term4785.getClass(), "neName", "");
        setField(term4785, term4785.getClass(), "ipAddress", "");
        ArrayList term4771 = new ArrayList();
        ((ArrayList) term4771).add(term4773);
        ((ArrayList) term4771).add(term4776);
        ((ArrayList) term4771).add(term4779);
        ((ArrayList) term4771).add(term4782);
        ((ArrayList) term4771).add(term4785);
        term4722 = newInstance(Class.forName("com.zxl.dailypractice.card.three.february.february1.IcutWSReq"));
        Object term4790 = newInstance(Class.forName("java.util.Date"));
        Object term4792 = newInstance(Class.forName("java.util.Date"));
        setField(term4722, term4722.getClass(), "orderId", "riMtzCoxNj");
        setField(term4722, term4722.getClass(), "city", "YAXkVjQZcV");
        setField(term4722, term4722.getClass(), "classify", "pumvwBWvpy");
        setField(term4722, term4722.getClass(), "neName", "HwLHeGLyhe");
        setField(term4722, term4722.getClass(), "coverList", term4771);
        setLongField(term4790, term4790.getClass(), "fastTime", 1595517583842L);
        setField(term4790, term4790.getClass(), "cdate", null);
        setField(term4722, term4722.getClass(), "startTime", term4790);
        setLongField(term4792, term4792.getClass(), "fastTime", 1464421789888L);
        setField(term4792, term4792.getClass(), "cdate", null);
        setField(term4722, term4722.getClass(), "endTime", term4792);
        setField(term4722, term4722.getClass(), "opDetails", "RCOqfVsRHt");
        setField(term4722, term4722.getClass(), "cutType", "TSyCeEZPaT");
        setField(term4722, term4722.getClass(), "opType", "JeZFtaqkzW");
        setField(term4722, term4722.getClass(), "opTitle", "vOVuNSCCLe");
        setField(term4722, term4722.getClass(), "taskid", "fzeqPnzpnt");
        setField(term4722, term4722.getClass(), "description", "RxbhrFBjkO");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.three.february.february1.IcutWSReq");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOpType", argTypes, term4722, args);
    }

};


