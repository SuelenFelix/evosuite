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

public class IcutWSReq_getTaskid_102984116023 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5718;

    public IcutWSReq_getTaskid_102984116023() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term5769 = newInstance(Class.forName("com.zxl.dailypractice.card.three.february.february1.CoverList"));
        setField(term5769, term5769.getClass(), "neName", "");
        setField(term5769, term5769.getClass(), "ipAddress", "");
        Object term5772 = newInstance(Class.forName("com.zxl.dailypractice.card.three.february.february1.CoverList"));
        setField(term5772, term5772.getClass(), "neName", "");
        setField(term5772, term5772.getClass(), "ipAddress", "");
        Object term5775 = newInstance(Class.forName("com.zxl.dailypractice.card.three.february.february1.CoverList"));
        setField(term5775, term5775.getClass(), "neName", "");
        setField(term5775, term5775.getClass(), "ipAddress", "");
        Object term5778 = newInstance(Class.forName("com.zxl.dailypractice.card.three.february.february1.CoverList"));
        setField(term5778, term5778.getClass(), "neName", "");
        setField(term5778, term5778.getClass(), "ipAddress", "");
        Object term5781 = newInstance(Class.forName("com.zxl.dailypractice.card.three.february.february1.CoverList"));
        setField(term5781, term5781.getClass(), "neName", "");
        setField(term5781, term5781.getClass(), "ipAddress", "");
        Object term5784 = newInstance(Class.forName("com.zxl.dailypractice.card.three.february.february1.CoverList"));
        setField(term5784, term5784.getClass(), "neName", "");
        setField(term5784, term5784.getClass(), "ipAddress", "");
        ArrayList term5767 = new ArrayList();
        ((ArrayList) term5767).add(term5769);
        ((ArrayList) term5767).add(term5772);
        ((ArrayList) term5767).add(term5775);
        ((ArrayList) term5767).add(term5778);
        ((ArrayList) term5767).add(term5781);
        ((ArrayList) term5767).add(term5784);
        term5718 = newInstance(Class.forName("com.zxl.dailypractice.card.three.february.february1.IcutWSReq"));
        Object term5789 = newInstance(Class.forName("java.util.Date"));
        Object term5791 = newInstance(Class.forName("java.util.Date"));
        setField(term5718, term5718.getClass(), "orderId", "PqywFWJlpE");
        setField(term5718, term5718.getClass(), "city", "OzXRsFGTIp");
        setField(term5718, term5718.getClass(), "classify", "TjWpyghUWN");
        setField(term5718, term5718.getClass(), "neName", "dkZFDZxcde");
        setField(term5718, term5718.getClass(), "coverList", term5767);
        setLongField(term5789, term5789.getClass(), "fastTime", 1819191638549L);
        setField(term5789, term5789.getClass(), "cdate", null);
        setField(term5718, term5718.getClass(), "startTime", term5789);
        setLongField(term5791, term5791.getClass(), "fastTime", 1400691778698L);
        setField(term5791, term5791.getClass(), "cdate", null);
        setField(term5718, term5718.getClass(), "endTime", term5791);
        setField(term5718, term5718.getClass(), "opDetails", "CVRGEomOth");
        setField(term5718, term5718.getClass(), "cutType", "vSeruUyNWX");
        setField(term5718, term5718.getClass(), "opType", "UkKvaeJfEC");
        setField(term5718, term5718.getClass(), "opTitle", "WPxXsahPRq");
        setField(term5718, term5718.getClass(), "taskid", "IENRuqmwUU");
        setField(term5718, term5718.getClass(), "description", "GsWxOwXvSu");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.three.february.february1.IcutWSReq");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTaskid", argTypes, term5718, args);
    }

};


