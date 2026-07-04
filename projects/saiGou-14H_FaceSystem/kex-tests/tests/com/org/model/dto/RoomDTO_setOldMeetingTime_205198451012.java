package com.org.model.dto;

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
import static com.org.model.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class RoomDTO_setOldMeetingTime_205198451012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2004;

    public RoomDTO_setOldMeetingTime_205198451012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2005 = new Integer(1328271830);
        Integer term2007 = new Integer(1596070772);
        Integer term2057 = new Integer(97029295);
        Integer term2059 = new Integer(-1371869594);
        term2004 = newInstance(Class.forName("com.org.model.dto.RoomDTO"));
        setField(term2004, term2004.getClass(), "id", term2005);
        setField(term2004, term2004.getClass(), "facilityid", term2007);
        setField(term2004, term2004.getClass(), "roomName", "cAPeiZHKGJ");
        setField(term2004, term2004.getClass(), "oldMeetingTime", "LvJFtLBaxj");
        setField(term2004, term2004.getClass(), "meetingTime", "PHvxnGHptP");
        setField(term2004, term2004.getClass(), "roomAddr", "TimdotUuNC");
        setField(term2004, term2004.getClass(), "peoples", term2057);
        setField(term2004, term2004.getClass(), "meetroomState", term2059);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.dto.RoomDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "PkWMRdJcBb";
        callMethod(klass, "setOldMeetingTime", argTypes, term2004, args);
    }

};


