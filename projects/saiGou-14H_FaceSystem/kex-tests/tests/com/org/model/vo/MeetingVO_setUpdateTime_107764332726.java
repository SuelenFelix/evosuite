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

public class MeetingVO_setUpdateTime_107764332726 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11740;
     Object term11855;

    public MeetingVO_setUpdateTime_107764332726() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term11741 = new Integer(-1549607466);
        Integer term11779 = new Integer(853609788);
        Integer term11839 = new Integer(-197820800);
        Integer term11851 = new Integer(723812297);
        Integer term11853 = new Integer(1639448749);
        term11740 = newInstance(Class.forName("com.org.model.vo.MeetingVO"));
        Object term11781 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11782 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11786 = newInstance(Class.forName("java.time.LocalTime"));
        Object term11841 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11842 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11846 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term11740, term11740.getClass(), "id", term11741);
        setField(term11740, term11740.getClass(), "name", "gCFzBxPZKw");
        setField(term11740, term11740.getClass(), "host", "YNVbzJpOdk");
        setField(term11740, term11740.getClass(), "roomName", "CjPfMVeNPm");
        setField(term11740, term11740.getClass(), "online", term11779);
        setIntField(term11782, term11782.getClass(), "year", 2018);
        setShortField(term11782, term11782.getClass(), "month", (short) 2);
        setShortField(term11782, term11782.getClass(), "day", (short) 14);
        setField(term11781, term11781.getClass(), "date", term11782);
        setByteField(term11786, term11786.getClass(), "hour", (byte) 2);
        setByteField(term11786, term11786.getClass(), "minute", (byte) 40);
        setByteField(term11786, term11786.getClass(), "second", (byte) 48);
        setIntField(term11786, term11786.getClass(), "nano", 371006728);
        setField(term11781, term11781.getClass(), "time", term11786);
        setField(term11740, term11740.getClass(), "createTime", term11781);
        setField(term11740, term11740.getClass(), "link", "TeqSJDWXQD");
        setField(term11740, term11740.getClass(), "meetingTime", "XNgNLbjmim");
        setField(term11740, term11740.getClass(), "signTime", "InNyZMCrst");
        setField(term11740, term11740.getClass(), "introduce", "llSJDzNeEq");
        setField(term11740, term11740.getClass(), "state", term11839);
        setIntField(term11842, term11842.getClass(), "year", 2025);
        setShortField(term11842, term11842.getClass(), "month", (short) 8);
        setShortField(term11842, term11842.getClass(), "day", (short) 22);
        setField(term11841, term11841.getClass(), "date", term11842);
        setByteField(term11846, term11846.getClass(), "hour", (byte) 6);
        setByteField(term11846, term11846.getClass(), "minute", (byte) 48);
        setByteField(term11846, term11846.getClass(), "second", (byte) 49);
        setIntField(term11846, term11846.getClass(), "nano", 46400229);
        setField(term11841, term11841.getClass(), "time", term11846);
        setField(term11740, term11740.getClass(), "updateTime", term11841);
        setField(term11740, term11740.getClass(), "userNumber", term11851);
        setField(term11740, term11740.getClass(), "signNumber", term11853);
        term11855 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11856 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11860 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term11856, term11856.getClass(), "year", 2028);
        setShortField(term11856, term11856.getClass(), "month", (short) 4);
        setShortField(term11856, term11856.getClass(), "day", (short) 1);
        setField(term11855, term11855.getClass(), "date", term11856);
        setByteField(term11860, term11860.getClass(), "hour", (byte) 16);
        setByteField(term11860, term11860.getClass(), "minute", (byte) 22);
        setByteField(term11860, term11860.getClass(), "second", (byte) 32);
        setIntField(term11860, term11860.getClass(), "nano", 406353763);
        setField(term11855, term11855.getClass(), "time", term11860);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.vo.MeetingVO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term11855;
        callMethod(klass, "setUpdateTime", argTypes, term11740, args);
    }

};


