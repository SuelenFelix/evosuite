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

public class RoomDTO_setMeetroomState_49822915517 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10585;
     Object term10642;

    public RoomDTO_setMeetroomState_49822915517() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term10586 = new Integer(-1546528470);
        Integer term10588 = new Integer(-1518971561);
        Integer term10638 = new Integer(1513663171);
        Integer term10640 = new Integer(1527034193);
        term10585 = newInstance(Class.forName("com.org.model.dto.RoomDTO"));
        setField(term10585, term10585.getClass(), "id", term10586);
        setField(term10585, term10585.getClass(), "facilityid", term10588);
        setField(term10585, term10585.getClass(), "roomName", "zpxPoasWgA");
        setField(term10585, term10585.getClass(), "oldMeetingTime", "lZNePPEWLC");
        setField(term10585, term10585.getClass(), "meetingTime", "XyvyWBkpUr");
        setField(term10585, term10585.getClass(), "roomAddr", "AuUQylJqWv");
        setField(term10585, term10585.getClass(), "peoples", term10638);
        setField(term10585, term10585.getClass(), "meetroomState", term10640);
        term10642 = new Integer(1309545946);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.dto.RoomDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term10642;
        callMethod(klass, "setMeetroomState", argTypes, term10585, args);
    }

};


