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

public class MeetingVO_setId_88887156315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9535;
     Object term9650;

    public MeetingVO_setId_88887156315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term9536 = new Integer(1824538861);
        Integer term9574 = new Integer(499519708);
        Integer term9634 = new Integer(1501165033);
        Integer term9646 = new Integer(510162332);
        Integer term9648 = new Integer(888506903);
        term9535 = newInstance(Class.forName("com.org.model.vo.MeetingVO"));
        Object term9576 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term9577 = newInstance(Class.forName("java.time.LocalDate"));
        Object term9581 = newInstance(Class.forName("java.time.LocalTime"));
        Object term9636 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term9637 = newInstance(Class.forName("java.time.LocalDate"));
        Object term9641 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term9535, term9535.getClass(), "id", term9536);
        setField(term9535, term9535.getClass(), "name", "GzmFcFoYft");
        setField(term9535, term9535.getClass(), "host", "LYRdIFgbgt");
        setField(term9535, term9535.getClass(), "roomName", "NiKeRXajei");
        setField(term9535, term9535.getClass(), "online", term9574);
        setIntField(term9577, term9577.getClass(), "year", 2014);
        setShortField(term9577, term9577.getClass(), "month", (short) 11);
        setShortField(term9577, term9577.getClass(), "day", (short) 8);
        setField(term9576, term9576.getClass(), "date", term9577);
        setByteField(term9581, term9581.getClass(), "hour", (byte) 8);
        setByteField(term9581, term9581.getClass(), "minute", (byte) 43);
        setByteField(term9581, term9581.getClass(), "second", (byte) 32);
        setIntField(term9581, term9581.getClass(), "nano", 154434838);
        setField(term9576, term9576.getClass(), "time", term9581);
        setField(term9535, term9535.getClass(), "createTime", term9576);
        setField(term9535, term9535.getClass(), "link", "fDNtdfDzQh");
        setField(term9535, term9535.getClass(), "meetingTime", "VbIydgisyZ");
        setField(term9535, term9535.getClass(), "signTime", "vigaMWRpCA");
        setField(term9535, term9535.getClass(), "introduce", "sgVVVUpnau");
        setField(term9535, term9535.getClass(), "state", term9634);
        setIntField(term9637, term9637.getClass(), "year", 2020);
        setShortField(term9637, term9637.getClass(), "month", (short) 5);
        setShortField(term9637, term9637.getClass(), "day", (short) 18);
        setField(term9636, term9636.getClass(), "date", term9637);
        setByteField(term9641, term9641.getClass(), "hour", (byte) 5);
        setByteField(term9641, term9641.getClass(), "minute", (byte) 46);
        setByteField(term9641, term9641.getClass(), "second", (byte) 13);
        setIntField(term9641, term9641.getClass(), "nano", 45893173);
        setField(term9636, term9636.getClass(), "time", term9641);
        setField(term9535, term9535.getClass(), "updateTime", term9636);
        setField(term9535, term9535.getClass(), "userNumber", term9646);
        setField(term9535, term9535.getClass(), "signNumber", term9648);
        term9650 = new Integer(200252898);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.vo.MeetingVO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term9650;
        callMethod(klass, "setId", argTypes, term9535, args);
    }

};


