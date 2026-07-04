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

public class MeetingVO_getState_91725928911 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8795;

    public MeetingVO_getState_91725928911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term8796 = new Integer(917513193);
        Integer term8834 = new Integer(787278105);
        Integer term8894 = new Integer(-2063843486);
        Integer term8906 = new Integer(833762980);
        Integer term8908 = new Integer(320711637);
        term8795 = newInstance(Class.forName("com.org.model.vo.MeetingVO"));
        Object term8836 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8837 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8841 = newInstance(Class.forName("java.time.LocalTime"));
        Object term8896 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8897 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8901 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term8795, term8795.getClass(), "id", term8796);
        setField(term8795, term8795.getClass(), "name", "zTMIjtwMQL");
        setField(term8795, term8795.getClass(), "host", "cjJhlsbSLZ");
        setField(term8795, term8795.getClass(), "roomName", "BvcBilSFZf");
        setField(term8795, term8795.getClass(), "online", term8834);
        setIntField(term8837, term8837.getClass(), "year", 2024);
        setShortField(term8837, term8837.getClass(), "month", (short) 4);
        setShortField(term8837, term8837.getClass(), "day", (short) 24);
        setField(term8836, term8836.getClass(), "date", term8837);
        setByteField(term8841, term8841.getClass(), "hour", (byte) 7);
        setByteField(term8841, term8841.getClass(), "minute", (byte) 2);
        setByteField(term8841, term8841.getClass(), "second", (byte) 51);
        setIntField(term8841, term8841.getClass(), "nano", 635502964);
        setField(term8836, term8836.getClass(), "time", term8841);
        setField(term8795, term8795.getClass(), "createTime", term8836);
        setField(term8795, term8795.getClass(), "link", "ppUmoMssug");
        setField(term8795, term8795.getClass(), "meetingTime", "FcponInvBb");
        setField(term8795, term8795.getClass(), "signTime", "IFOOxmFxbX");
        setField(term8795, term8795.getClass(), "introduce", "aDEuPKrSZt");
        setField(term8795, term8795.getClass(), "state", term8894);
        setIntField(term8897, term8897.getClass(), "year", 2010);
        setShortField(term8897, term8897.getClass(), "month", (short) 1);
        setShortField(term8897, term8897.getClass(), "day", (short) 17);
        setField(term8896, term8896.getClass(), "date", term8897);
        setByteField(term8901, term8901.getClass(), "hour", (byte) 13);
        setByteField(term8901, term8901.getClass(), "minute", (byte) 5);
        setByteField(term8901, term8901.getClass(), "second", (byte) 51);
        setIntField(term8901, term8901.getClass(), "nano", 362260580);
        setField(term8896, term8896.getClass(), "time", term8901);
        setField(term8795, term8795.getClass(), "updateTime", term8896);
        setField(term8795, term8795.getClass(), "userNumber", term8906);
        setField(term8795, term8795.getClass(), "signNumber", term8908);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.vo.MeetingVO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getState", argTypes, term8795, args);
    }

};


