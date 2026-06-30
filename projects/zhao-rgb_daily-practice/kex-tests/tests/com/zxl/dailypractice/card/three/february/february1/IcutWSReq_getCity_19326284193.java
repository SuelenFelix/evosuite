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

public class IcutWSReq_getCity_19326284193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term782;

    public IcutWSReq_getCity_19326284193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term833 = newInstance(Class.forName("com.zxl.dailypractice.card.three.february.february1.CoverList"));
        setField(term833, term833.getClass(), "neName", "");
        setField(term833, term833.getClass(), "ipAddress", "");
        Object term836 = newInstance(Class.forName("com.zxl.dailypractice.card.three.february.february1.CoverList"));
        setField(term836, term836.getClass(), "neName", "");
        setField(term836, term836.getClass(), "ipAddress", "");
        Object term839 = newInstance(Class.forName("com.zxl.dailypractice.card.three.february.february1.CoverList"));
        setField(term839, term839.getClass(), "neName", "");
        setField(term839, term839.getClass(), "ipAddress", "");
        ArrayList term831 = new ArrayList();
        ((ArrayList) term831).add(term833);
        ((ArrayList) term831).add(term836);
        ((ArrayList) term831).add(term839);
        term782 = newInstance(Class.forName("com.zxl.dailypractice.card.three.february.february1.IcutWSReq"));
        Object term844 = newInstance(Class.forName("java.util.Date"));
        Object term846 = newInstance(Class.forName("java.util.Date"));
        setField(term782, term782.getClass(), "orderId", "UiUYnPrcCi");
        setField(term782, term782.getClass(), "city", "UoYtihxVaS");
        setField(term782, term782.getClass(), "classify", "JDswTTCZHV");
        setField(term782, term782.getClass(), "neName", "onpbIeEKoi");
        setField(term782, term782.getClass(), "coverList", term831);
        setLongField(term844, term844.getClass(), "fastTime", 1442639565302L);
        setField(term844, term844.getClass(), "cdate", null);
        setField(term782, term782.getClass(), "startTime", term844);
        setLongField(term846, term846.getClass(), "fastTime", 1515890130018L);
        setField(term846, term846.getClass(), "cdate", null);
        setField(term782, term782.getClass(), "endTime", term846);
        setField(term782, term782.getClass(), "opDetails", "dEnhdmILtU");
        setField(term782, term782.getClass(), "cutType", "hoicvmsovO");
        setField(term782, term782.getClass(), "opType", "eqJfYWRaEL");
        setField(term782, term782.getClass(), "opTitle", "fhkbdRViHi");
        setField(term782, term782.getClass(), "taskid", "uWHnvSvaPl");
        setField(term782, term782.getClass(), "description", "kBdSllIBVz");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.three.february.february1.IcutWSReq");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCity", argTypes, term782, args);
    }

};


