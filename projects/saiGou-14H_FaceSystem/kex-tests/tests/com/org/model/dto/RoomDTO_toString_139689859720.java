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

public class RoomDTO_toString_139689859720 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2852;

    public RoomDTO_toString_139689859720() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2853 = new Integer(-344842608);
        Integer term2855 = new Integer(941650513);
        Integer term2905 = new Integer(444029505);
        Integer term2907 = new Integer(-1034506028);
        term2852 = newInstance(Class.forName("com.org.model.dto.RoomDTO"));
        setField(term2852, term2852.getClass(), "id", term2853);
        setField(term2852, term2852.getClass(), "facilityid", term2855);
        setField(term2852, term2852.getClass(), "roomName", "mXGCWJDOqA");
        setField(term2852, term2852.getClass(), "oldMeetingTime", "dpNsDgfPso");
        setField(term2852, term2852.getClass(), "meetingTime", "hCWPJQKpdc");
        setField(term2852, term2852.getClass(), "roomAddr", "WzMEhMXkKx");
        setField(term2852, term2852.getClass(), "peoples", term2905);
        setField(term2852, term2852.getClass(), "meetroomState", term2907);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.dto.RoomDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term2852, args);
    }

};


