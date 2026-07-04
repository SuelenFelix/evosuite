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

public class MeetingVO_hashCode_75300978931 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12681;

    public MeetingVO_hashCode_75300978931() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term12682 = new Integer(-20614472);
        Integer term12720 = new Integer(1126618861);
        Integer term12780 = new Integer(947449400);
        Integer term12792 = new Integer(-763799087);
        Integer term12794 = new Integer(1207142014);
        term12681 = newInstance(Class.forName("com.org.model.vo.MeetingVO"));
        Object term12722 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12723 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12727 = newInstance(Class.forName("java.time.LocalTime"));
        Object term12782 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12783 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12787 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term12681, term12681.getClass(), "id", term12682);
        setField(term12681, term12681.getClass(), "name", "jIfbtgnHqt");
        setField(term12681, term12681.getClass(), "host", "vNvzjymLXH");
        setField(term12681, term12681.getClass(), "roomName", "TCadyfXzAm");
        setField(term12681, term12681.getClass(), "online", term12720);
        setIntField(term12723, term12723.getClass(), "year", 2020);
        setShortField(term12723, term12723.getClass(), "month", (short) 9);
        setShortField(term12723, term12723.getClass(), "day", (short) 3);
        setField(term12722, term12722.getClass(), "date", term12723);
        setByteField(term12727, term12727.getClass(), "hour", (byte) 10);
        setByteField(term12727, term12727.getClass(), "minute", (byte) 44);
        setByteField(term12727, term12727.getClass(), "second", (byte) 5);
        setIntField(term12727, term12727.getClass(), "nano", 572560230);
        setField(term12722, term12722.getClass(), "time", term12727);
        setField(term12681, term12681.getClass(), "createTime", term12722);
        setField(term12681, term12681.getClass(), "link", "rSSEpZFUMc");
        setField(term12681, term12681.getClass(), "meetingTime", "DJHwHjvNlc");
        setField(term12681, term12681.getClass(), "signTime", "ZSBzHqaLtQ");
        setField(term12681, term12681.getClass(), "introduce", "DCRuiaVwNa");
        setField(term12681, term12681.getClass(), "state", term12780);
        setIntField(term12783, term12783.getClass(), "year", 2020);
        setShortField(term12783, term12783.getClass(), "month", (short) 8);
        setShortField(term12783, term12783.getClass(), "day", (short) 16);
        setField(term12782, term12782.getClass(), "date", term12783);
        setByteField(term12787, term12787.getClass(), "hour", (byte) 4);
        setByteField(term12787, term12787.getClass(), "minute", (byte) 37);
        setByteField(term12787, term12787.getClass(), "second", (byte) 19);
        setIntField(term12787, term12787.getClass(), "nano", 605410923);
        setField(term12782, term12782.getClass(), "time", term12787);
        setField(term12681, term12681.getClass(), "updateTime", term12782);
        setField(term12681, term12681.getClass(), "userNumber", term12792);
        setField(term12681, term12681.getClass(), "signNumber", term12794);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.vo.MeetingVO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term12681, args);
    }

};


