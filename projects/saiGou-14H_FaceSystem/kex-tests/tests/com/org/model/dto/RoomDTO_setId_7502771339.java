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

public class RoomDTO_setId_7502771339 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1687;
     Object term1744;

    public RoomDTO_setId_7502771339() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1688 = new Integer(-817164822);
        Integer term1690 = new Integer(-1016503459);
        Integer term1740 = new Integer(-1968847291);
        Integer term1742 = new Integer(579005622);
        term1687 = newInstance(Class.forName("com.org.model.dto.RoomDTO"));
        setField(term1687, term1687.getClass(), "id", term1688);
        setField(term1687, term1687.getClass(), "facilityid", term1690);
        setField(term1687, term1687.getClass(), "roomName", "IgRJUzaCwW");
        setField(term1687, term1687.getClass(), "oldMeetingTime", "JUmudUmaaV");
        setField(term1687, term1687.getClass(), "meetingTime", "KoyGrUJeJW");
        setField(term1687, term1687.getClass(), "roomAddr", "HqBOwkVqjD");
        setField(term1687, term1687.getClass(), "peoples", term1740);
        setField(term1687, term1687.getClass(), "meetroomState", term1742);
        term1744 = new Integer(-14890619);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.dto.RoomDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term1744;
        callMethod(klass, "setId", argTypes, term1687, args);
    }

};


