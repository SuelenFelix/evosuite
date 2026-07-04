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

public class MeetingVO_getUserNumber_108483783413 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9165;

    public MeetingVO_getUserNumber_108483783413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term9166 = new Integer(-1703035419);
        Integer term9204 = new Integer(765766290);
        Integer term9264 = new Integer(-1284825282);
        Integer term9276 = new Integer(-1941343035);
        Integer term9278 = new Integer(947897214);
        term9165 = newInstance(Class.forName("com.org.model.vo.MeetingVO"));
        Object term9206 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term9207 = newInstance(Class.forName("java.time.LocalDate"));
        Object term9211 = newInstance(Class.forName("java.time.LocalTime"));
        Object term9266 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term9267 = newInstance(Class.forName("java.time.LocalDate"));
        Object term9271 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term9165, term9165.getClass(), "id", term9166);
        setField(term9165, term9165.getClass(), "name", "bjLZqJqmnv");
        setField(term9165, term9165.getClass(), "host", "TPbMBzbcHs");
        setField(term9165, term9165.getClass(), "roomName", "spkDvqsOhJ");
        setField(term9165, term9165.getClass(), "online", term9204);
        setIntField(term9207, term9207.getClass(), "year", 2018);
        setShortField(term9207, term9207.getClass(), "month", (short) 7);
        setShortField(term9207, term9207.getClass(), "day", (short) 12);
        setField(term9206, term9206.getClass(), "date", term9207);
        setByteField(term9211, term9211.getClass(), "hour", (byte) 1);
        setByteField(term9211, term9211.getClass(), "minute", (byte) 3);
        setByteField(term9211, term9211.getClass(), "second", (byte) 47);
        setIntField(term9211, term9211.getClass(), "nano", 2729929);
        setField(term9206, term9206.getClass(), "time", term9211);
        setField(term9165, term9165.getClass(), "createTime", term9206);
        setField(term9165, term9165.getClass(), "link", "faFVBESzWc");
        setField(term9165, term9165.getClass(), "meetingTime", "baFwYJAfPz");
        setField(term9165, term9165.getClass(), "signTime", "PxBSOwkatN");
        setField(term9165, term9165.getClass(), "introduce", "uKjlgaHcoc");
        setField(term9165, term9165.getClass(), "state", term9264);
        setIntField(term9267, term9267.getClass(), "year", 2015);
        setShortField(term9267, term9267.getClass(), "month", (short) 12);
        setShortField(term9267, term9267.getClass(), "day", (short) 23);
        setField(term9266, term9266.getClass(), "date", term9267);
        setByteField(term9271, term9271.getClass(), "hour", (byte) 14);
        setByteField(term9271, term9271.getClass(), "minute", (byte) 17);
        setByteField(term9271, term9271.getClass(), "second", (byte) 50);
        setIntField(term9271, term9271.getClass(), "nano", 325544804);
        setField(term9266, term9266.getClass(), "time", term9271);
        setField(term9165, term9165.getClass(), "updateTime", term9266);
        setField(term9165, term9165.getClass(), "userNumber", term9276);
        setField(term9165, term9165.getClass(), "signNumber", term9278);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.vo.MeetingVO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserNumber", argTypes, term9165, args);
    }

};


