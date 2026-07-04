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

public class Meeting_setHost_115379894628 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31647;

    public Meeting_setHost_115379894628() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term31648 = new Integer(-881632231);
        Integer term31730 = new Integer(-1285148224);
        Integer term31732 = new Integer(-2002558482);
        Integer term31747 = new Integer(794384312);
        term31647 = newInstance(Class.forName("com.org.model.Meeting"));
        Object term31650 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term31651 = newInstance(Class.forName("java.time.LocalDate"));
        Object term31655 = newInstance(Class.forName("java.time.LocalTime"));
        Object term31696 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term31697 = newInstance(Class.forName("java.time.LocalDate"));
        Object term31701 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term31647, term31647.getClass(), "id", term31648);
        setIntField(term31651, term31651.getClass(), "year", 2027);
        setShortField(term31651, term31651.getClass(), "month", (short) 10);
        setShortField(term31651, term31651.getClass(), "day", (short) 4);
        setField(term31650, term31650.getClass(), "date", term31651);
        setByteField(term31655, term31655.getClass(), "hour", (byte) 18);
        setByteField(term31655, term31655.getClass(), "minute", (byte) 14);
        setByteField(term31655, term31655.getClass(), "second", (byte) 14);
        setIntField(term31655, term31655.getClass(), "nano", 221363683);
        setField(term31650, term31650.getClass(), "time", term31655);
        setField(term31647, term31647.getClass(), "createTime", term31650);
        setField(term31647, term31647.getClass(), "name", "aFJwRTUFYs");
        setField(term31647, term31647.getClass(), "link", "QHNzIgBvry");
        setField(term31647, term31647.getClass(), "introduce", "SfLSyAmQEZ");
        setIntField(term31697, term31697.getClass(), "year", 2014);
        setShortField(term31697, term31697.getClass(), "month", (short) 9);
        setShortField(term31697, term31697.getClass(), "day", (short) 21);
        setField(term31696, term31696.getClass(), "date", term31697);
        setByteField(term31701, term31701.getClass(), "hour", (byte) 13);
        setByteField(term31701, term31701.getClass(), "minute", (byte) 30);
        setByteField(term31701, term31701.getClass(), "second", (byte) 57);
        setIntField(term31701, term31701.getClass(), "nano", 749136236);
        setField(term31696, term31696.getClass(), "time", term31701);
        setField(term31647, term31647.getClass(), "updateTime", term31696);
        setField(term31647, term31647.getClass(), "meetingTime", "tqNLzZCPHl");
        setField(term31647, term31647.getClass(), "signTime", "hYTyaZYHNE");
        setField(term31647, term31647.getClass(), "signNumber", term31730);
        setField(term31647, term31647.getClass(), "userNumber", term31732);
        setField(term31647, term31647.getClass(), "fileUrl", "LAxSnBvfkM");
        setBooleanField(term31647, term31647.getClass(), "online", true);
        setField(term31647, term31647.getClass(), "deleted", term31747);
        setField(term31647, term31647.getClass(), "host", "RLAVSPcIgS");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.Meeting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "kUCclcwUXz";
        callMethod(klass, "setHost", argTypes, term31647, args);
    }

};


