package com.org.model.vo;

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
import static com.org.model.vo.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;

public class MeetingVO_getId_1324342751 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6945;

    public MeetingVO_getId_1324342751() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term6946 = new Integer(1209799204);
        Integer term6984 = new Integer(1094107751);
        Integer term7044 = new Integer(844222656);
        Integer term7056 = new Integer(-18216811);
        Integer term7058 = new Integer(-1813280137);
        term6945 = newInstance(Class.forName("com.org.model.vo.MeetingVO"));
        Object term6986 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6987 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6991 = newInstance(Class.forName("java.time.LocalTime"));
        Object term7046 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7047 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7051 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term6945, term6945.getClass(), "id", term6946);
        setField(term6945, term6945.getClass(), "name", "jcJNIBACPb");
        setField(term6945, term6945.getClass(), "host", "mPQmjoknqi");
        setField(term6945, term6945.getClass(), "roomName", "gLgvePQRQT");
        setField(term6945, term6945.getClass(), "online", term6984);
        setIntField(term6987, term6987.getClass(), "year", 2017);
        setShortField(term6987, term6987.getClass(), "month", (short) 6);
        setShortField(term6987, term6987.getClass(), "day", (short) 8);
        setField(term6986, term6986.getClass(), "date", term6987);
        setByteField(term6991, term6991.getClass(), "hour", (byte) 0);
        setByteField(term6991, term6991.getClass(), "minute", (byte) 18);
        setByteField(term6991, term6991.getClass(), "second", (byte) 55);
        setIntField(term6991, term6991.getClass(), "nano", 680586717);
        setField(term6986, term6986.getClass(), "time", term6991);
        setField(term6945, term6945.getClass(), "createTime", term6986);
        setField(term6945, term6945.getClass(), "link", "SCmsfHIEPK");
        setField(term6945, term6945.getClass(), "meetingTime", "dFOuezLNWb");
        setField(term6945, term6945.getClass(), "signTime", "PUWJnLuyiR");
        setField(term6945, term6945.getClass(), "introduce", "ADhJCRgHaS");
        setField(term6945, term6945.getClass(), "state", term7044);
        setIntField(term7047, term7047.getClass(), "year", 2015);
        setShortField(term7047, term7047.getClass(), "month", (short) 9);
        setShortField(term7047, term7047.getClass(), "day", (short) 16);
        setField(term7046, term7046.getClass(), "date", term7047);
        setByteField(term7051, term7051.getClass(), "hour", (byte) 6);
        setByteField(term7051, term7051.getClass(), "minute", (byte) 19);
        setByteField(term7051, term7051.getClass(), "second", (byte) 42);
        setIntField(term7051, term7051.getClass(), "nano", 630084975);
        setField(term7046, term7046.getClass(), "time", term7051);
        setField(term6945, term6945.getClass(), "updateTime", term7046);
        setField(term6945, term6945.getClass(), "userNumber", term7056);
        setField(term6945, term6945.getClass(), "signNumber", term7058);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.vo.MeetingVO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term6945, args);
    }

};


