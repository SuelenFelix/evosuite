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
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;

public class Post_PostBuilder_type_8119913153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24695;
     Object enum62;

    public Post_PostBuilder_type_8119913153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term24696 = new Long(-3724162247917461536L);
        Long term24698 = new Long(7893661350133453338L);
        Class<? extends Object> term24766 = Class.forName((String) "net.jaggerwang.sbip.entity.PostBO$Type");
        Field term24765 = ((Class) term24766).getDeclaredField((String) "TEXT");
        ((Field) term24765).setAccessible(true);
        Object enum61 = ((Field) term24765).get((Object) null);
        Long term24722 = new Long(9056245012917372169L);
        Long term24724 = new Long(7848004402682338886L);
        Long term24726 = new Long(8931772176819893873L);
        Long term24728 = new Long(-4370635295110591519L);
        Long term24730 = new Long(-1325109462577461208L);
        ArrayList term24720 = new ArrayList();
        ((ArrayList) term24720).add(term24722);
        ((ArrayList) term24720).add(term24724);
        ((ArrayList) term24720).add(term24726);
        ((ArrayList) term24720).add(term24728);
        ((ArrayList) term24720).add(term24730);
        Long term24734 = new Long(-7181112149072926893L);
        term24695 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.Post$PostBuilder"));
        Object term24736 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term24737 = newInstance(Class.forName("java.time.LocalDate"));
        Object term24741 = newInstance(Class.forName("java.time.LocalTime"));
        Object term24746 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term24747 = newInstance(Class.forName("java.time.LocalDate"));
        Object term24751 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term24695, term24695.getClass(), "id", term24696);
        setField(term24695, term24695.getClass(), "userId", term24698);
        setField(term24695, term24695.getClass(), "type", enum61);
        setField(term24695, term24695.getClass(), "text", "doQLHkjpNm");
        setField(term24695, term24695.getClass(), "imageIds", term24720);
        setField(term24695, term24695.getClass(), "videoId", term24734);
        setIntField(term24737, term24737.getClass(), "year", 2021);
        setShortField(term24737, term24737.getClass(), "month", (short) 11);
        setShortField(term24737, term24737.getClass(), "day", (short) 19);
        setField(term24736, term24736.getClass(), "date", term24737);
        setByteField(term24741, term24741.getClass(), "hour", (byte) 4);
        setByteField(term24741, term24741.getClass(), "minute", (byte) 39);
        setByteField(term24741, term24741.getClass(), "second", (byte) 43);
        setIntField(term24741, term24741.getClass(), "nano", 638695514);
        setField(term24736, term24736.getClass(), "time", term24741);
        setField(term24695, term24695.getClass(), "createdAt", term24736);
        setIntField(term24747, term24747.getClass(), "year", 2015);
        setShortField(term24747, term24747.getClass(), "month", (short) 10);
        setShortField(term24747, term24747.getClass(), "day", (short) 4);
        setField(term24746, term24746.getClass(), "date", term24747);
        setByteField(term24751, term24751.getClass(), "hour", (byte) 1);
        setByteField(term24751, term24751.getClass(), "minute", (byte) 29);
        setByteField(term24751, term24751.getClass(), "second", (byte) 20);
        setIntField(term24751, term24751.getClass(), "nano", 558273892);
        setField(term24746, term24746.getClass(), "time", term24751);
        setField(term24695, term24695.getClass(), "updatedAt", term24746);
        Class<? extends Object> term24985 = Class.forName((String) "net.jaggerwang.sbip.entity.PostBO$Type");
        Field term24984 = ((Class) term24985).getDeclaredField((String) "IMAGE");
        ((Field) term24984).setAccessible(true);
        enum62 = ((Field) term24984).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.Post$PostBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("net.jaggerwang.sbip.entity.PostBO$Type");
        Object[] args = new Object[1];
        args[0] = enum62;
        callMethod(klass, "type", argTypes, term24695, args);
    }

};


