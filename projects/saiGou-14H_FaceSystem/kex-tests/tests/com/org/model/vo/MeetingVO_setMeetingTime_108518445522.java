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

public class MeetingVO_setMeetingTime_108518445522 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10932;

    public MeetingVO_setMeetingTime_108518445522() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term10933 = new Integer(-1840305774);
        Integer term10971 = new Integer(1365087144);
        Integer term11031 = new Integer(-1537255112);
        Integer term11043 = new Integer(934477462);
        Integer term11045 = new Integer(4900410);
        term10932 = newInstance(Class.forName("com.org.model.vo.MeetingVO"));
        Object term10973 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10974 = newInstance(Class.forName("java.time.LocalDate"));
        Object term10978 = newInstance(Class.forName("java.time.LocalTime"));
        Object term11033 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11034 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11038 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term10932, term10932.getClass(), "id", term10933);
        setField(term10932, term10932.getClass(), "name", "VzkPDPPGQl");
        setField(term10932, term10932.getClass(), "host", "iojOXjfZFr");
        setField(term10932, term10932.getClass(), "roomName", "yyrkuIYJKj");
        setField(term10932, term10932.getClass(), "online", term10971);
        setIntField(term10974, term10974.getClass(), "year", 2025);
        setShortField(term10974, term10974.getClass(), "month", (short) 3);
        setShortField(term10974, term10974.getClass(), "day", (short) 28);
        setField(term10973, term10973.getClass(), "date", term10974);
        setByteField(term10978, term10978.getClass(), "hour", (byte) 19);
        setByteField(term10978, term10978.getClass(), "minute", (byte) 56);
        setByteField(term10978, term10978.getClass(), "second", (byte) 52);
        setIntField(term10978, term10978.getClass(), "nano", 738558930);
        setField(term10973, term10973.getClass(), "time", term10978);
        setField(term10932, term10932.getClass(), "createTime", term10973);
        setField(term10932, term10932.getClass(), "link", "reGIMbnrGF");
        setField(term10932, term10932.getClass(), "meetingTime", "yquSngBHqd");
        setField(term10932, term10932.getClass(), "signTime", "ZSdaJkZZPm");
        setField(term10932, term10932.getClass(), "introduce", "ICnzwgujDT");
        setField(term10932, term10932.getClass(), "state", term11031);
        setIntField(term11034, term11034.getClass(), "year", 2024);
        setShortField(term11034, term11034.getClass(), "month", (short) 2);
        setShortField(term11034, term11034.getClass(), "day", (short) 29);
        setField(term11033, term11033.getClass(), "date", term11034);
        setByteField(term11038, term11038.getClass(), "hour", (byte) 17);
        setByteField(term11038, term11038.getClass(), "minute", (byte) 54);
        setByteField(term11038, term11038.getClass(), "second", (byte) 21);
        setIntField(term11038, term11038.getClass(), "nano", 605973408);
        setField(term11033, term11033.getClass(), "time", term11038);
        setField(term10932, term10932.getClass(), "updateTime", term11033);
        setField(term10932, term10932.getClass(), "userNumber", term11043);
        setField(term10932, term10932.getClass(), "signNumber", term11045);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.vo.MeetingVO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "RfDgUkIYjW";
        callMethod(klass, "setMeetingTime", argTypes, term10932, args);
    }

};


