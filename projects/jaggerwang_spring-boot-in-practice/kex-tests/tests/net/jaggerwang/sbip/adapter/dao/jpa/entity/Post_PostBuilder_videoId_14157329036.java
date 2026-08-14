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

public class Post_PostBuilder_videoId_14157329036 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25801;
     Object term25861;

    public Post_PostBuilder_videoId_14157329036() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term25802 = new Long(2243864141567980599L);
        Long term25804 = new Long(353705949229610067L);
        Class<? extends Object> term25864 = Class.forName((String) "net.jaggerwang.sbip.entity.PostBO$Type");
        Field term25863 = ((Class) term25864).getDeclaredField((String) "IMAGE");
        ((Field) term25863).setAccessible(true);
        Object enum65 = ((Field) term25863).get((Object) null);
        Long term25829 = new Long(3288572082902580031L);
        Long term25831 = new Long(-8698230272673009418L);
        Long term25833 = new Long(-8792567429538693571L);
        Long term25835 = new Long(3810487266967550400L);
        ArrayList term25827 = new ArrayList();
        ((ArrayList) term25827).add(term25829);
        ((ArrayList) term25827).add(term25831);
        ((ArrayList) term25827).add(term25833);
        ((ArrayList) term25827).add(term25835);
        Long term25839 = new Long(8965244485590834147L);
        term25801 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.Post$PostBuilder"));
        Object term25841 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term25842 = newInstance(Class.forName("java.time.LocalDate"));
        Object term25846 = newInstance(Class.forName("java.time.LocalTime"));
        Object term25851 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term25852 = newInstance(Class.forName("java.time.LocalDate"));
        Object term25856 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term25801, term25801.getClass(), "id", term25802);
        setField(term25801, term25801.getClass(), "userId", term25804);
        setField(term25801, term25801.getClass(), "type", enum65);
        setField(term25801, term25801.getClass(), "text", "sNQFlATEeQ");
        setField(term25801, term25801.getClass(), "imageIds", term25827);
        setField(term25801, term25801.getClass(), "videoId", term25839);
        setIntField(term25842, term25842.getClass(), "year", 2018);
        setShortField(term25842, term25842.getClass(), "month", (short) 9);
        setShortField(term25842, term25842.getClass(), "day", (short) 19);
        setField(term25841, term25841.getClass(), "date", term25842);
        setByteField(term25846, term25846.getClass(), "hour", (byte) 23);
        setByteField(term25846, term25846.getClass(), "minute", (byte) 30);
        setByteField(term25846, term25846.getClass(), "second", (byte) 11);
        setIntField(term25846, term25846.getClass(), "nano", 615798597);
        setField(term25841, term25841.getClass(), "time", term25846);
        setField(term25801, term25801.getClass(), "createdAt", term25841);
        setIntField(term25852, term25852.getClass(), "year", 2021);
        setShortField(term25852, term25852.getClass(), "month", (short) 3);
        setShortField(term25852, term25852.getClass(), "day", (short) 13);
        setField(term25851, term25851.getClass(), "date", term25852);
        setByteField(term25856, term25856.getClass(), "hour", (byte) 11);
        setByteField(term25856, term25856.getClass(), "minute", (byte) 11);
        setByteField(term25856, term25856.getClass(), "second", (byte) 36);
        setIntField(term25856, term25856.getClass(), "nano", 411690155);
        setField(term25851, term25851.getClass(), "time", term25856);
        setField(term25801, term25801.getClass(), "updatedAt", term25851);
        term25861 = new Long(-4825509285016265943L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.Post$PostBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term25861;
        callMethod(klass, "videoId", argTypes, term25801, args);
    }

};


