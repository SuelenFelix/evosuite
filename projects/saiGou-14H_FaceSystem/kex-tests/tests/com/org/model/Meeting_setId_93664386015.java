package com.org.model;

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
import static com.org.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;

public class Meeting_setId_93664386015 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29093;
     Object term29207;

    public Meeting_setId_93664386015() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term29094 = new Integer(-720629032);
        Integer term29176 = new Integer(398554038);
        Integer term29178 = new Integer(-1454206593);
        Integer term29193 = new Integer(675396436);
        term29093 = newInstance(Class.forName("com.org.model.Meeting"));
        Object term29096 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29097 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29101 = newInstance(Class.forName("java.time.LocalTime"));
        Object term29142 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29143 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29147 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term29093, term29093.getClass(), "id", term29094);
        setIntField(term29097, term29097.getClass(), "year", 2020);
        setShortField(term29097, term29097.getClass(), "month", (short) 8);
        setShortField(term29097, term29097.getClass(), "day", (short) 5);
        setField(term29096, term29096.getClass(), "date", term29097);
        setByteField(term29101, term29101.getClass(), "hour", (byte) 12);
        setByteField(term29101, term29101.getClass(), "minute", (byte) 1);
        setByteField(term29101, term29101.getClass(), "second", (byte) 26);
        setIntField(term29101, term29101.getClass(), "nano", 71456472);
        setField(term29096, term29096.getClass(), "time", term29101);
        setField(term29093, term29093.getClass(), "createTime", term29096);
        setField(term29093, term29093.getClass(), "name", "hHcuunhdDN");
        setField(term29093, term29093.getClass(), "link", "OWXMvkMqRq");
        setField(term29093, term29093.getClass(), "introduce", "cilVUGuAzp");
        setIntField(term29143, term29143.getClass(), "year", 2011);
        setShortField(term29143, term29143.getClass(), "month", (short) 11);
        setShortField(term29143, term29143.getClass(), "day", (short) 10);
        setField(term29142, term29142.getClass(), "date", term29143);
        setByteField(term29147, term29147.getClass(), "hour", (byte) 6);
        setByteField(term29147, term29147.getClass(), "minute", (byte) 13);
        setByteField(term29147, term29147.getClass(), "second", (byte) 21);
        setIntField(term29147, term29147.getClass(), "nano", 381837054);
        setField(term29142, term29142.getClass(), "time", term29147);
        setField(term29093, term29093.getClass(), "updateTime", term29142);
        setField(term29093, term29093.getClass(), "meetingTime", "DEGmRHMLsx");
        setField(term29093, term29093.getClass(), "signTime", "NpRJptUmML");
        setField(term29093, term29093.getClass(), "signNumber", term29176);
        setField(term29093, term29093.getClass(), "userNumber", term29178);
        setField(term29093, term29093.getClass(), "fileUrl", "UNUfwYHgBp");
        setBooleanField(term29093, term29093.getClass(), "online", true);
        setField(term29093, term29093.getClass(), "deleted", term29193);
        setField(term29093, term29093.getClass(), "host", "muOBCWXlnl");
        term29207 = new Integer(-41963319);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.Meeting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term29207;
        callMethod(klass, "setId", argTypes, term29093, args);
    }

};


