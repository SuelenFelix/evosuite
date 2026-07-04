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

public class MeetingVO_getIntroduce_170766792010 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8610;

    public MeetingVO_getIntroduce_170766792010() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term8611 = new Integer(-544382127);
        Integer term8649 = new Integer(-1830198043);
        Integer term8709 = new Integer(-439048495);
        Integer term8721 = new Integer(-1849105286);
        Integer term8723 = new Integer(1334483645);
        term8610 = newInstance(Class.forName("com.org.model.vo.MeetingVO"));
        Object term8651 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8652 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8656 = newInstance(Class.forName("java.time.LocalTime"));
        Object term8711 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8712 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8716 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term8610, term8610.getClass(), "id", term8611);
        setField(term8610, term8610.getClass(), "name", "rIKLUjcdnZ");
        setField(term8610, term8610.getClass(), "host", "MQaKKukkYD");
        setField(term8610, term8610.getClass(), "roomName", "ThGyaiqnHq");
        setField(term8610, term8610.getClass(), "online", term8649);
        setIntField(term8652, term8652.getClass(), "year", 2010);
        setShortField(term8652, term8652.getClass(), "month", (short) 6);
        setShortField(term8652, term8652.getClass(), "day", (short) 14);
        setField(term8651, term8651.getClass(), "date", term8652);
        setByteField(term8656, term8656.getClass(), "hour", (byte) 6);
        setByteField(term8656, term8656.getClass(), "minute", (byte) 22);
        setByteField(term8656, term8656.getClass(), "second", (byte) 20);
        setIntField(term8656, term8656.getClass(), "nano", 25133051);
        setField(term8651, term8651.getClass(), "time", term8656);
        setField(term8610, term8610.getClass(), "createTime", term8651);
        setField(term8610, term8610.getClass(), "link", "AtEuOtHJrK");
        setField(term8610, term8610.getClass(), "meetingTime", "gzqokHWvLu");
        setField(term8610, term8610.getClass(), "signTime", "ANCcRsABGP");
        setField(term8610, term8610.getClass(), "introduce", "MBadwVIvwu");
        setField(term8610, term8610.getClass(), "state", term8709);
        setIntField(term8712, term8712.getClass(), "year", 2010);
        setShortField(term8712, term8712.getClass(), "month", (short) 5);
        setShortField(term8712, term8712.getClass(), "day", (short) 2);
        setField(term8711, term8711.getClass(), "date", term8712);
        setByteField(term8716, term8716.getClass(), "hour", (byte) 2);
        setByteField(term8716, term8716.getClass(), "minute", (byte) 22);
        setByteField(term8716, term8716.getClass(), "second", (byte) 33);
        setIntField(term8716, term8716.getClass(), "nano", 530835039);
        setField(term8711, term8711.getClass(), "time", term8716);
        setField(term8610, term8610.getClass(), "updateTime", term8711);
        setField(term8610, term8610.getClass(), "userNumber", term8721);
        setField(term8610, term8610.getClass(), "signNumber", term8723);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.vo.MeetingVO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIntroduce", argTypes, term8610, args);
    }

};


