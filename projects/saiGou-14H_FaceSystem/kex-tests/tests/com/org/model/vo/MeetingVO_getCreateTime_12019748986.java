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

public class MeetingVO_getCreateTime_12019748986 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7870;

    public MeetingVO_getCreateTime_12019748986() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term7871 = new Integer(-350454594);
        Integer term7909 = new Integer(-1148142995);
        Integer term7969 = new Integer(-233024044);
        Integer term7981 = new Integer(1820784228);
        Integer term7983 = new Integer(1390820006);
        term7870 = newInstance(Class.forName("com.org.model.vo.MeetingVO"));
        Object term7911 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7912 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7916 = newInstance(Class.forName("java.time.LocalTime"));
        Object term7971 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7972 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7976 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term7870, term7870.getClass(), "id", term7871);
        setField(term7870, term7870.getClass(), "name", "OoRBUdwown");
        setField(term7870, term7870.getClass(), "host", "lSidZunNtu");
        setField(term7870, term7870.getClass(), "roomName", "TLUhUnoanK");
        setField(term7870, term7870.getClass(), "online", term7909);
        setIntField(term7912, term7912.getClass(), "year", 2023);
        setShortField(term7912, term7912.getClass(), "month", (short) 9);
        setShortField(term7912, term7912.getClass(), "day", (short) 23);
        setField(term7911, term7911.getClass(), "date", term7912);
        setByteField(term7916, term7916.getClass(), "hour", (byte) 12);
        setByteField(term7916, term7916.getClass(), "minute", (byte) 55);
        setByteField(term7916, term7916.getClass(), "second", (byte) 58);
        setIntField(term7916, term7916.getClass(), "nano", 159178396);
        setField(term7911, term7911.getClass(), "time", term7916);
        setField(term7870, term7870.getClass(), "createTime", term7911);
        setField(term7870, term7870.getClass(), "link", "JXyQTIyIrU");
        setField(term7870, term7870.getClass(), "meetingTime", "uplmRQRGWr");
        setField(term7870, term7870.getClass(), "signTime", "ZEmNnaQFYB");
        setField(term7870, term7870.getClass(), "introduce", "FNxFpCZxLW");
        setField(term7870, term7870.getClass(), "state", term7969);
        setIntField(term7972, term7972.getClass(), "year", 2028);
        setShortField(term7972, term7972.getClass(), "month", (short) 10);
        setShortField(term7972, term7972.getClass(), "day", (short) 1);
        setField(term7971, term7971.getClass(), "date", term7972);
        setByteField(term7976, term7976.getClass(), "hour", (byte) 17);
        setByteField(term7976, term7976.getClass(), "minute", (byte) 29);
        setByteField(term7976, term7976.getClass(), "second", (byte) 30);
        setIntField(term7976, term7976.getClass(), "nano", 845472306);
        setField(term7971, term7971.getClass(), "time", term7976);
        setField(term7870, term7870.getClass(), "updateTime", term7971);
        setField(term7870, term7870.getClass(), "userNumber", term7981);
        setField(term7870, term7870.getClass(), "signNumber", term7983);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.vo.MeetingVO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCreateTime", argTypes, term7870, args);
    }

};


