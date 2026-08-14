package net.jaggerwang.sbip.adapter.dao.jpa.entity;

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
import static net.jaggerwang.sbip.adapter.dao.jpa.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class User_getIntro_214288740110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28686;

    public User_getIntro_214288740110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term28687 = new Long(-888581501148999479L);
        Long term28737 = new Long(1835131711657183788L);
        term28686 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.User"));
        Object term28751 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28752 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28756 = newInstance(Class.forName("java.time.LocalTime"));
        Object term28761 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28762 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28766 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term28686, term28686.getClass(), "id", term28687);
        setField(term28686, term28686.getClass(), "username", "SPBstwKFVr");
        setField(term28686, term28686.getClass(), "password", "WxYUTuqmIq");
        setField(term28686, term28686.getClass(), "mobile", "OeQLvhVERT");
        setField(term28686, term28686.getClass(), "email", "IlvgFINwIa");
        setField(term28686, term28686.getClass(), "avatarId", term28737);
        setField(term28686, term28686.getClass(), "intro", "GEJABPlHSI");
        setIntField(term28752, term28752.getClass(), "year", 2028);
        setShortField(term28752, term28752.getClass(), "month", (short) 4);
        setShortField(term28752, term28752.getClass(), "day", (short) 19);
        setField(term28751, term28751.getClass(), "date", term28752);
        setByteField(term28756, term28756.getClass(), "hour", (byte) 1);
        setByteField(term28756, term28756.getClass(), "minute", (byte) 47);
        setByteField(term28756, term28756.getClass(), "second", (byte) 52);
        setIntField(term28756, term28756.getClass(), "nano", 666536453);
        setField(term28751, term28751.getClass(), "time", term28756);
        setField(term28686, term28686.getClass(), "createdAt", term28751);
        setIntField(term28762, term28762.getClass(), "year", 2023);
        setShortField(term28762, term28762.getClass(), "month", (short) 12);
        setShortField(term28762, term28762.getClass(), "day", (short) 8);
        setField(term28761, term28761.getClass(), "date", term28762);
        setByteField(term28766, term28766.getClass(), "hour", (byte) 1);
        setByteField(term28766, term28766.getClass(), "minute", (byte) 26);
        setByteField(term28766, term28766.getClass(), "second", (byte) 38);
        setIntField(term28766, term28766.getClass(), "nano", 334721598);
        setField(term28761, term28761.getClass(), "time", term28766);
        setField(term28686, term28686.getClass(), "updatedAt", term28761);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIntro", argTypes, term28686, args);
    }

};


