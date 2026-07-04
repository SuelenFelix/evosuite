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

public class UserMeeting_setUpdateTime_26394264516 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40726;
     Object term40779;

    public UserMeeting_setUpdateTime_26394264516() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term40727 = new Integer(-1098526777);
        Integer term40729 = new Integer(871491464);
        Integer term40741 = new Integer(1250354269);
        Integer term40743 = new Integer(695748317);
        Integer term40765 = new Integer(-439470959);
        Integer term40777 = new Integer(-248472453);
        term40726 = newInstance(Class.forName("com.org.model.UserMeeting"));
        Object term40731 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term40732 = newInstance(Class.forName("java.time.LocalDate"));
        Object term40736 = newInstance(Class.forName("java.time.LocalTime"));
        Object term40745 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term40746 = newInstance(Class.forName("java.time.LocalDate"));
        Object term40750 = newInstance(Class.forName("java.time.LocalTime"));
        Object term40755 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term40756 = newInstance(Class.forName("java.time.LocalDate"));
        Object term40760 = newInstance(Class.forName("java.time.LocalTime"));
        Object term40767 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term40768 = newInstance(Class.forName("java.time.LocalDate"));
        Object term40772 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term40726, term40726.getClass(), "id", term40727);
        setField(term40726, term40726.getClass(), "umPower", term40729);
        setIntField(term40732, term40732.getClass(), "year", 2012);
        setShortField(term40732, term40732.getClass(), "month", (short) 5);
        setShortField(term40732, term40732.getClass(), "day", (short) 5);
        setField(term40731, term40731.getClass(), "date", term40732);
        setByteField(term40736, term40736.getClass(), "hour", (byte) 9);
        setByteField(term40736, term40736.getClass(), "minute", (byte) 8);
        setByteField(term40736, term40736.getClass(), "second", (byte) 40);
        setIntField(term40736, term40736.getClass(), "nano", 919436445);
        setField(term40731, term40731.getClass(), "time", term40736);
        setField(term40726, term40726.getClass(), "createTime", term40731);
        setField(term40726, term40726.getClass(), "userId", term40741);
        setField(term40726, term40726.getClass(), "meetingId", term40743);
        setIntField(term40746, term40746.getClass(), "year", 2015);
        setShortField(term40746, term40746.getClass(), "month", (short) 11);
        setShortField(term40746, term40746.getClass(), "day", (short) 3);
        setField(term40745, term40745.getClass(), "date", term40746);
        setByteField(term40750, term40750.getClass(), "hour", (byte) 5);
        setByteField(term40750, term40750.getClass(), "minute", (byte) 27);
        setByteField(term40750, term40750.getClass(), "second", (byte) 14);
        setIntField(term40750, term40750.getClass(), "nano", 150694068);
        setField(term40745, term40745.getClass(), "time", term40750);
        setField(term40726, term40726.getClass(), "updateTime", term40745);
        setIntField(term40756, term40756.getClass(), "year", 2023);
        setShortField(term40756, term40756.getClass(), "month", (short) 3);
        setShortField(term40756, term40756.getClass(), "day", (short) 15);
        setField(term40755, term40755.getClass(), "date", term40756);
        setByteField(term40760, term40760.getClass(), "hour", (byte) 9);
        setByteField(term40760, term40760.getClass(), "minute", (byte) 10);
        setByteField(term40760, term40760.getClass(), "second", (byte) 38);
        setIntField(term40760, term40760.getClass(), "nano", 695302180);
        setField(term40755, term40755.getClass(), "time", term40760);
        setField(term40726, term40726.getClass(), "startTime", term40755);
        setField(term40726, term40726.getClass(), "state", term40765);
        setIntField(term40768, term40768.getClass(), "year", 2019);
        setShortField(term40768, term40768.getClass(), "month", (short) 12);
        setShortField(term40768, term40768.getClass(), "day", (short) 29);
        setField(term40767, term40767.getClass(), "date", term40768);
        setByteField(term40772, term40772.getClass(), "hour", (byte) 19);
        setByteField(term40772, term40772.getClass(), "minute", (byte) 43);
        setByteField(term40772, term40772.getClass(), "second", (byte) 47);
        setIntField(term40772, term40772.getClass(), "nano", 957440346);
        setField(term40767, term40767.getClass(), "time", term40772);
        setField(term40726, term40726.getClass(), "endTime", term40767);
        setField(term40726, term40726.getClass(), "deleted", term40777);
        term40779 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term40780 = newInstance(Class.forName("java.time.LocalDate"));
        Object term40784 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term40780, term40780.getClass(), "year", 2014);
        setShortField(term40780, term40780.getClass(), "month", (short) 3);
        setShortField(term40780, term40780.getClass(), "day", (short) 6);
        setField(term40779, term40779.getClass(), "date", term40780);
        setByteField(term40784, term40784.getClass(), "hour", (byte) 3);
        setByteField(term40784, term40784.getClass(), "minute", (byte) 21);
        setByteField(term40784, term40784.getClass(), "second", (byte) 53);
        setIntField(term40784, term40784.getClass(), "nano", 978038024);
        setField(term40779, term40779.getClass(), "time", term40784);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.UserMeeting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term40779;
        callMethod(klass, "setUpdateTime", argTypes, term40726, args);
    }

};


