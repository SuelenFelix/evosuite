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

public class IcutWSReq_getDescription_104757386425 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6219;

    public IcutWSReq_getDescription_104757386425() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term6270 = newInstance(Class.forName("com.zxl.dailypractice.card.three.february.february1.CoverList"));
        setField(term6270, term6270.getClass(), "neName", "");
        setField(term6270, term6270.getClass(), "ipAddress", "");
        ArrayList term6268 = new ArrayList();
        ((ArrayList) term6268).add(term6270);
        term6219 = newInstance(Class.forName("com.zxl.dailypractice.card.three.february.february1.IcutWSReq"));
        Object term6275 = newInstance(Class.forName("java.util.Date"));
        Object term6277 = newInstance(Class.forName("java.util.Date"));
        setField(term6219, term6219.getClass(), "orderId", "qYtAeLzOhW");
        setField(term6219, term6219.getClass(), "city", "tJzmOfcUnY");
        setField(term6219, term6219.getClass(), "classify", "TKlccZUpjz");
        setField(term6219, term6219.getClass(), "neName", "GGzwMoHZXC");
        setField(term6219, term6219.getClass(), "coverList", term6268);
        setLongField(term6275, term6275.getClass(), "fastTime", 1695425269458L);
        setField(term6275, term6275.getClass(), "cdate", null);
        setField(term6219, term6219.getClass(), "startTime", term6275);
        setLongField(term6277, term6277.getClass(), "fastTime", 1362780563394L);
        setField(term6277, term6277.getClass(), "cdate", null);
        setField(term6219, term6219.getClass(), "endTime", term6277);
        setField(term6219, term6219.getClass(), "opDetails", "YkZtEtthvz");
        setField(term6219, term6219.getClass(), "cutType", "dwlZSxlXOo");
        setField(term6219, term6219.getClass(), "opType", "lKrEAkypza");
        setField(term6219, term6219.getClass(), "opTitle", "KtuuNAqGCQ");
        setField(term6219, term6219.getClass(), "taskid", "OGQsfjmReM");
        setField(term6219, term6219.getClass(), "description", "YsUtbngnRO");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.three.february.february1.IcutWSReq");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDescription", argTypes, term6219, args);
    }

};


