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

public class MeetingVO_hashCode_75300978932 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12682;

    public MeetingVO_hashCode_75300978932() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term12683 = new Integer(-20614472);
        Integer term12721 = new Integer(1126618861);
        Integer term12781 = new Integer(947449400);
        Integer term12793 = new Integer(-763799087);
        Integer term12795 = new Integer(1207142014);
        term12682 = newInstance(Class.forName("com.org.model.vo.MeetingVO"));
        Object term12723 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12724 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12728 = newInstance(Class.forName("java.time.LocalTime"));
        Object term12783 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12784 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12788 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term12682, term12682.getClass(), "id", term12683);
        setField(term12682, term12682.getClass(), "name", "jIfbtgnHqt");
        setField(term12682, term12682.getClass(), "host", "vNvzjymLXH");
        setField(term12682, term12682.getClass(), "roomName", "TCadyfXzAm");
        setField(term12682, term12682.getClass(), "online", term12721);
        setIntField(term12724, term12724.getClass(), "year", 2020);
        setShortField(term12724, term12724.getClass(), "month", (short) 9);
        setShortField(term12724, term12724.getClass(), "day", (short) 3);
        setField(term12723, term12723.getClass(), "date", term12724);
        setByteField(term12728, term12728.getClass(), "hour", (byte) 10);
        setByteField(term12728, term12728.getClass(), "minute", (byte) 44);
        setByteField(term12728, term12728.getClass(), "second", (byte) 5);
        setIntField(term12728, term12728.getClass(), "nano", 572560230);
        setField(term12723, term12723.getClass(), "time", term12728);
        setField(term12682, term12682.getClass(), "createTime", term12723);
        setField(term12682, term12682.getClass(), "link", "rSSEpZFUMc");
        setField(term12682, term12682.getClass(), "meetingTime", "DJHwHjvNlc");
        setField(term12682, term12682.getClass(), "signTime", "ZSBzHqaLtQ");
        setField(term12682, term12682.getClass(), "introduce", "DCRuiaVwNa");
        setField(term12682, term12682.getClass(), "state", term12781);
        setIntField(term12784, term12784.getClass(), "year", 2020);
        setShortField(term12784, term12784.getClass(), "month", (short) 8);
        setShortField(term12784, term12784.getClass(), "day", (short) 16);
        setField(term12783, term12783.getClass(), "date", term12784);
        setByteField(term12788, term12788.getClass(), "hour", (byte) 4);
        setByteField(term12788, term12788.getClass(), "minute", (byte) 37);
        setByteField(term12788, term12788.getClass(), "second", (byte) 19);
        setIntField(term12788, term12788.getClass(), "nano", 605410923);
        setField(term12783, term12783.getClass(), "time", term12788);
        setField(term12682, term12682.getClass(), "updateTime", term12783);
        setField(term12682, term12682.getClass(), "userNumber", term12793);
        setField(term12682, term12682.getClass(), "signNumber", term12795);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.vo.MeetingVO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term12682, args);
    }

};


