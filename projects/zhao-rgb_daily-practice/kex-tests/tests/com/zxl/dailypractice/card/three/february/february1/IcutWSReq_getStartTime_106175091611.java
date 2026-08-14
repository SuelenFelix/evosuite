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

public class IcutWSReq_getStartTime_106175091611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2773;

    public IcutWSReq_getStartTime_106175091611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term2824 = newInstance(Class.forName("com.zxl.dailypractice.card.three.february.february1.CoverList"));
        setField(term2824, term2824.getClass(), "neName", "");
        setField(term2824, term2824.getClass(), "ipAddress", "");
        Object term2827 = newInstance(Class.forName("com.zxl.dailypractice.card.three.february.february1.CoverList"));
        setField(term2827, term2827.getClass(), "neName", "");
        setField(term2827, term2827.getClass(), "ipAddress", "");
        Object term2830 = newInstance(Class.forName("com.zxl.dailypractice.card.three.february.february1.CoverList"));
        setField(term2830, term2830.getClass(), "neName", "");
        setField(term2830, term2830.getClass(), "ipAddress", "");
        Object term2833 = newInstance(Class.forName("com.zxl.dailypractice.card.three.february.february1.CoverList"));
        setField(term2833, term2833.getClass(), "neName", "");
        setField(term2833, term2833.getClass(), "ipAddress", "");
        Object term2836 = newInstance(Class.forName("com.zxl.dailypractice.card.three.february.february1.CoverList"));
        setField(term2836, term2836.getClass(), "neName", "");
        setField(term2836, term2836.getClass(), "ipAddress", "");
        Object term2839 = newInstance(Class.forName("com.zxl.dailypractice.card.three.february.february1.CoverList"));
        setField(term2839, term2839.getClass(), "neName", "");
        setField(term2839, term2839.getClass(), "ipAddress", "");
        Object term2842 = newInstance(Class.forName("com.zxl.dailypractice.card.three.february.february1.CoverList"));
        setField(term2842, term2842.getClass(), "neName", "");
        setField(term2842, term2842.getClass(), "ipAddress", "");
        ArrayList term2822 = new ArrayList();
        ((ArrayList) term2822).add(term2824);
        ((ArrayList) term2822).add(term2827);
        ((ArrayList) term2822).add(term2830);
        ((ArrayList) term2822).add(term2833);
        ((ArrayList) term2822).add(term2836);
        ((ArrayList) term2822).add(term2839);
        ((ArrayList) term2822).add(term2842);
        term2773 = newInstance(Class.forName("com.zxl.dailypractice.card.three.february.february1.IcutWSReq"));
        Object term2847 = newInstance(Class.forName("java.util.Date"));
        Object term2849 = newInstance(Class.forName("java.util.Date"));
        setField(term2773, term2773.getClass(), "orderId", "DhjNLmRMCu");
        setField(term2773, term2773.getClass(), "city", "PgPzMSEjjX");
        setField(term2773, term2773.getClass(), "classify", "wzsPSPcRdj");
        setField(term2773, term2773.getClass(), "neName", "kGMQdqJYyB");
        setField(term2773, term2773.getClass(), "coverList", term2822);
        setLongField(term2847, term2847.getClass(), "fastTime", 1550698994689L);
        setField(term2847, term2847.getClass(), "cdate", null);
        setField(term2773, term2773.getClass(), "startTime", term2847);
        setLongField(term2849, term2849.getClass(), "fastTime", 1804998087131L);
        setField(term2849, term2849.getClass(), "cdate", null);
        setField(term2773, term2773.getClass(), "endTime", term2849);
        setField(term2773, term2773.getClass(), "opDetails", "izPpKDErnQ");
        setField(term2773, term2773.getClass(), "cutType", "NnpwZBUTvx");
        setField(term2773, term2773.getClass(), "opType", "tlQSNgTkQX");
        setField(term2773, term2773.getClass(), "opTitle", "PCipZnmBOF");
        setField(term2773, term2773.getClass(), "taskid", "zcorEihhLK");
        setField(term2773, term2773.getClass(), "description", "GrqozDKFOk");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.three.february.february1.IcutWSReq");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStartTime", argTypes, term2773, args);
    }

};


