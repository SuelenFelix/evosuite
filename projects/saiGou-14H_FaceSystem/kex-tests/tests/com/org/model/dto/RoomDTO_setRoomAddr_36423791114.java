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

public class RoomDTO_setRoomAddr_36423791114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2242;

    public RoomDTO_setRoomAddr_36423791114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2243 = new Integer(-93135961);
        Integer term2245 = new Integer(-112921587);
        Integer term2295 = new Integer(933028652);
        Integer term2297 = new Integer(287287233);
        term2242 = newInstance(Class.forName("com.org.model.dto.RoomDTO"));
        setField(term2242, term2242.getClass(), "id", term2243);
        setField(term2242, term2242.getClass(), "facilityid", term2245);
        setField(term2242, term2242.getClass(), "roomName", "jiKYgYHqIS");
        setField(term2242, term2242.getClass(), "oldMeetingTime", "DfISiziTgG");
        setField(term2242, term2242.getClass(), "meetingTime", "XqgfKFvPSD");
        setField(term2242, term2242.getClass(), "roomAddr", "JiVRgTZvKc");
        setField(term2242, term2242.getClass(), "peoples", term2295);
        setField(term2242, term2242.getClass(), "meetroomState", term2297);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.dto.RoomDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "XPKmummaqg";
        callMethod(klass, "setRoomAddr", argTypes, term2242, args);
    }

};


