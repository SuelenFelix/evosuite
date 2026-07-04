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

public class UserMeeting_setMeetingId_143813326615 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40671;
     Object term40724;

    public UserMeeting_setMeetingId_143813326615() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term40672 = new Integer(280068573);
        Integer term40674 = new Integer(-1081530515);
        Integer term40686 = new Integer(492096339);
        Integer term40688 = new Integer(-1679827671);
        Integer term40710 = new Integer(932019255);
        Integer term40722 = new Integer(1939661233);
        term40671 = newInstance(Class.forName("com.org.model.UserMeeting"));
        Object term40676 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term40677 = newInstance(Class.forName("java.time.LocalDate"));
        Object term40681 = newInstance(Class.forName("java.time.LocalTime"));
        Object term40690 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term40691 = newInstance(Class.forName("java.time.LocalDate"));
        Object term40695 = newInstance(Class.forName("java.time.LocalTime"));
        Object term40700 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term40701 = newInstance(Class.forName("java.time.LocalDate"));
        Object term40705 = newInstance(Class.forName("java.time.LocalTime"));
        Object term40712 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term40713 = newInstance(Class.forName("java.time.LocalDate"));
        Object term40717 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term40671, term40671.getClass(), "id", term40672);
        setField(term40671, term40671.getClass(), "umPower", term40674);
        setIntField(term40677, term40677.getClass(), "year", 2010);
        setShortField(term40677, term40677.getClass(), "month", (short) 5);
        setShortField(term40677, term40677.getClass(), "day", (short) 18);
        setField(term40676, term40676.getClass(), "date", term40677);
        setByteField(term40681, term40681.getClass(), "hour", (byte) 8);
        setByteField(term40681, term40681.getClass(), "minute", (byte) 4);
        setByteField(term40681, term40681.getClass(), "second", (byte) 37);
        setIntField(term40681, term40681.getClass(), "nano", 896333553);
        setField(term40676, term40676.getClass(), "time", term40681);
        setField(term40671, term40671.getClass(), "createTime", term40676);
        setField(term40671, term40671.getClass(), "userId", term40686);
        setField(term40671, term40671.getClass(), "meetingId", term40688);
        setIntField(term40691, term40691.getClass(), "year", 2011);
        setShortField(term40691, term40691.getClass(), "month", (short) 9);
        setShortField(term40691, term40691.getClass(), "day", (short) 17);
        setField(term40690, term40690.getClass(), "date", term40691);
        setByteField(term40695, term40695.getClass(), "hour", (byte) 16);
        setByteField(term40695, term40695.getClass(), "minute", (byte) 37);
        setByteField(term40695, term40695.getClass(), "second", (byte) 45);
        setIntField(term40695, term40695.getClass(), "nano", 117475194);
        setField(term40690, term40690.getClass(), "time", term40695);
        setField(term40671, term40671.getClass(), "updateTime", term40690);
        setIntField(term40701, term40701.getClass(), "year", 2015);
        setShortField(term40701, term40701.getClass(), "month", (short) 7);
        setShortField(term40701, term40701.getClass(), "day", (short) 20);
        setField(term40700, term40700.getClass(), "date", term40701);
        setByteField(term40705, term40705.getClass(), "hour", (byte) 12);
        setByteField(term40705, term40705.getClass(), "minute", (byte) 3);
        setByteField(term40705, term40705.getClass(), "second", (byte) 51);
        setIntField(term40705, term40705.getClass(), "nano", 425566548);
        setField(term40700, term40700.getClass(), "time", term40705);
        setField(term40671, term40671.getClass(), "startTime", term40700);
        setField(term40671, term40671.getClass(), "state", term40710);
        setIntField(term40713, term40713.getClass(), "year", 2029);
        setShortField(term40713, term40713.getClass(), "month", (short) 10);
        setShortField(term40713, term40713.getClass(), "day", (short) 28);
        setField(term40712, term40712.getClass(), "date", term40713);
        setByteField(term40717, term40717.getClass(), "hour", (byte) 3);
        setByteField(term40717, term40717.getClass(), "minute", (byte) 8);
        setByteField(term40717, term40717.getClass(), "second", (byte) 59);
        setIntField(term40717, term40717.getClass(), "nano", 94100073);
        setField(term40712, term40712.getClass(), "time", term40717);
        setField(term40671, term40671.getClass(), "endTime", term40712);
        setField(term40671, term40671.getClass(), "deleted", term40722);
        term40724 = new Integer(-485147289);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.UserMeeting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term40724;
        callMethod(klass, "setMeetingId", argTypes, term40671, args);
    }

};


