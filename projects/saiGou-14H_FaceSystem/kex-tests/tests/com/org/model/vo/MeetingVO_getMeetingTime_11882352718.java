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

public class MeetingVO_getMeetingTime_11882352718 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8240;

    public MeetingVO_getMeetingTime_11882352718() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term8241 = new Integer(-1702055571);
        Integer term8279 = new Integer(-944542900);
        Integer term8339 = new Integer(2063762142);
        Integer term8351 = new Integer(1658391716);
        Integer term8353 = new Integer(2143282300);
        term8240 = newInstance(Class.forName("com.org.model.vo.MeetingVO"));
        Object term8281 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8282 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8286 = newInstance(Class.forName("java.time.LocalTime"));
        Object term8341 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8342 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8346 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term8240, term8240.getClass(), "id", term8241);
        setField(term8240, term8240.getClass(), "name", "pZrAdSHQIs");
        setField(term8240, term8240.getClass(), "host", "XTOiucaEva");
        setField(term8240, term8240.getClass(), "roomName", "JMekRNxFMU");
        setField(term8240, term8240.getClass(), "online", term8279);
        setIntField(term8282, term8282.getClass(), "year", 2025);
        setShortField(term8282, term8282.getClass(), "month", (short) 11);
        setShortField(term8282, term8282.getClass(), "day", (short) 3);
        setField(term8281, term8281.getClass(), "date", term8282);
        setByteField(term8286, term8286.getClass(), "hour", (byte) 21);
        setByteField(term8286, term8286.getClass(), "minute", (byte) 24);
        setByteField(term8286, term8286.getClass(), "second", (byte) 23);
        setIntField(term8286, term8286.getClass(), "nano", 210986721);
        setField(term8281, term8281.getClass(), "time", term8286);
        setField(term8240, term8240.getClass(), "createTime", term8281);
        setField(term8240, term8240.getClass(), "link", "LBNEEquiet");
        setField(term8240, term8240.getClass(), "meetingTime", "cBMdxJirJj");
        setField(term8240, term8240.getClass(), "signTime", "kVnxgkemHF");
        setField(term8240, term8240.getClass(), "introduce", "JUQnEoujef");
        setField(term8240, term8240.getClass(), "state", term8339);
        setIntField(term8342, term8342.getClass(), "year", 2016);
        setShortField(term8342, term8342.getClass(), "month", (short) 6);
        setShortField(term8342, term8342.getClass(), "day", (short) 15);
        setField(term8341, term8341.getClass(), "date", term8342);
        setByteField(term8346, term8346.getClass(), "hour", (byte) 21);
        setByteField(term8346, term8346.getClass(), "minute", (byte) 23);
        setByteField(term8346, term8346.getClass(), "second", (byte) 23);
        setIntField(term8346, term8346.getClass(), "nano", 433372070);
        setField(term8341, term8341.getClass(), "time", term8346);
        setField(term8240, term8240.getClass(), "updateTime", term8341);
        setField(term8240, term8240.getClass(), "userNumber", term8351);
        setField(term8240, term8240.getClass(), "signNumber", term8353);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.vo.MeetingVO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMeetingTime", argTypes, term8240, args);
    }

};


