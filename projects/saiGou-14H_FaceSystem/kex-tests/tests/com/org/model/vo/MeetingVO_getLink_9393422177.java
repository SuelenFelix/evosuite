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

public class MeetingVO_getLink_9393422177 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8055;

    public MeetingVO_getLink_9393422177() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term8056 = new Integer(-828982065);
        Integer term8094 = new Integer(1221443226);
        Integer term8154 = new Integer(908108726);
        Integer term8166 = new Integer(1023209512);
        Integer term8168 = new Integer(1084849225);
        term8055 = newInstance(Class.forName("com.org.model.vo.MeetingVO"));
        Object term8096 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8097 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8101 = newInstance(Class.forName("java.time.LocalTime"));
        Object term8156 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8157 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8161 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term8055, term8055.getClass(), "id", term8056);
        setField(term8055, term8055.getClass(), "name", "sXMXSCUbRu");
        setField(term8055, term8055.getClass(), "host", "iualVLfDmL");
        setField(term8055, term8055.getClass(), "roomName", "bhEFtkUvDw");
        setField(term8055, term8055.getClass(), "online", term8094);
        setIntField(term8097, term8097.getClass(), "year", 2027);
        setShortField(term8097, term8097.getClass(), "month", (short) 2);
        setShortField(term8097, term8097.getClass(), "day", (short) 19);
        setField(term8096, term8096.getClass(), "date", term8097);
        setByteField(term8101, term8101.getClass(), "hour", (byte) 17);
        setByteField(term8101, term8101.getClass(), "minute", (byte) 37);
        setByteField(term8101, term8101.getClass(), "second", (byte) 27);
        setIntField(term8101, term8101.getClass(), "nano", 920380537);
        setField(term8096, term8096.getClass(), "time", term8101);
        setField(term8055, term8055.getClass(), "createTime", term8096);
        setField(term8055, term8055.getClass(), "link", "ZmbknwMIBa");
        setField(term8055, term8055.getClass(), "meetingTime", "UiRmBTpDTp");
        setField(term8055, term8055.getClass(), "signTime", "zQtuUgUIjK");
        setField(term8055, term8055.getClass(), "introduce", "VBeGRjPsPN");
        setField(term8055, term8055.getClass(), "state", term8154);
        setIntField(term8157, term8157.getClass(), "year", 2021);
        setShortField(term8157, term8157.getClass(), "month", (short) 8);
        setShortField(term8157, term8157.getClass(), "day", (short) 12);
        setField(term8156, term8156.getClass(), "date", term8157);
        setByteField(term8161, term8161.getClass(), "hour", (byte) 2);
        setByteField(term8161, term8161.getClass(), "minute", (byte) 17);
        setByteField(term8161, term8161.getClass(), "second", (byte) 51);
        setIntField(term8161, term8161.getClass(), "nano", 207375141);
        setField(term8156, term8156.getClass(), "time", term8161);
        setField(term8055, term8055.getClass(), "updateTime", term8156);
        setField(term8055, term8055.getClass(), "userNumber", term8166);
        setField(term8055, term8055.getClass(), "signNumber", term8168);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.vo.MeetingVO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLink", argTypes, term8055, args);
    }

};


