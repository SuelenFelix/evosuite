package com.org.model;

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
import static com.org.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;

public class Meeting_getId_19579496981 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26517;

    public Meeting_getId_19579496981() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term26518 = new Integer(-1889806893);
        Integer term26600 = new Integer(2101844302);
        Integer term26602 = new Integer(1975711832);
        Integer term26617 = new Integer(-712035661);
        term26517 = newInstance(Class.forName("com.org.model.Meeting"));
        Object term26520 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term26521 = newInstance(Class.forName("java.time.LocalDate"));
        Object term26525 = newInstance(Class.forName("java.time.LocalTime"));
        Object term26566 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term26567 = newInstance(Class.forName("java.time.LocalDate"));
        Object term26571 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term26517, term26517.getClass(), "id", term26518);
        setIntField(term26521, term26521.getClass(), "year", 2012);
        setShortField(term26521, term26521.getClass(), "month", (short) 3);
        setShortField(term26521, term26521.getClass(), "day", (short) 30);
        setField(term26520, term26520.getClass(), "date", term26521);
        setByteField(term26525, term26525.getClass(), "hour", (byte) 22);
        setByteField(term26525, term26525.getClass(), "minute", (byte) 56);
        setByteField(term26525, term26525.getClass(), "second", (byte) 8);
        setIntField(term26525, term26525.getClass(), "nano", 786128521);
        setField(term26520, term26520.getClass(), "time", term26525);
        setField(term26517, term26517.getClass(), "createTime", term26520);
        setField(term26517, term26517.getClass(), "name", "nsyKPkuiKM");
        setField(term26517, term26517.getClass(), "link", "QQrzJyhVFh");
        setField(term26517, term26517.getClass(), "introduce", "DifGXOBiwI");
        setIntField(term26567, term26567.getClass(), "year", 2023);
        setShortField(term26567, term26567.getClass(), "month", (short) 9);
        setShortField(term26567, term26567.getClass(), "day", (short) 9);
        setField(term26566, term26566.getClass(), "date", term26567);
        setByteField(term26571, term26571.getClass(), "hour", (byte) 3);
        setByteField(term26571, term26571.getClass(), "minute", (byte) 52);
        setByteField(term26571, term26571.getClass(), "second", (byte) 58);
        setIntField(term26571, term26571.getClass(), "nano", 185910636);
        setField(term26566, term26566.getClass(), "time", term26571);
        setField(term26517, term26517.getClass(), "updateTime", term26566);
        setField(term26517, term26517.getClass(), "meetingTime", "HLrCvrzuTI");
        setField(term26517, term26517.getClass(), "signTime", "ljsmTMvgTG");
        setField(term26517, term26517.getClass(), "signNumber", term26600);
        setField(term26517, term26517.getClass(), "userNumber", term26602);
        setField(term26517, term26517.getClass(), "fileUrl", "SvZVhBPcjK");
        setBooleanField(term26517, term26517.getClass(), "online", true);
        setField(term26517, term26517.getClass(), "deleted", term26617);
        setField(term26517, term26517.getClass(), "host", "JihKJuVbQI");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.Meeting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term26517, args);
    }

};


