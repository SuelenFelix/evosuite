package net.jaggerwang.sbip.entity;

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
import static net.jaggerwang.sbip.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;

public class PostBO_getVideoId_6446722816 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14718;

    public PostBO_getVideoId_6446722816() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term14719 = new Long(-6969704322644192945L);
        Long term14721 = new Long(-6685235643232255177L);
        Class<? extends Object> term14775 = Class.forName((String) "net.jaggerwang.sbip.entity.PostBO$Type");
        Field term14774 = ((Class) term14775).getDeclaredField((String) "IMAGE");
        ((Field) term14774).setAccessible(true);
        Object enum38 = ((Field) term14774).get((Object) null);
        Long term14746 = new Long(-5656664340499957324L);
        Long term14748 = new Long(-5460517064177800852L);
        ArrayList term14744 = new ArrayList();
        ((ArrayList) term14744).add(term14746);
        ((ArrayList) term14744).add(term14748);
        Long term14752 = new Long(-5242567610844514867L);
        term14718 = newInstance(Class.forName("net.jaggerwang.sbip.entity.PostBO"));
        Object term14754 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term14755 = newInstance(Class.forName("java.time.LocalDate"));
        Object term14759 = newInstance(Class.forName("java.time.LocalTime"));
        Object term14764 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term14765 = newInstance(Class.forName("java.time.LocalDate"));
        Object term14769 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term14718, term14718.getClass(), "id", term14719);
        setField(term14718, term14718.getClass(), "userId", term14721);
        setField(term14718, term14718.getClass(), "type", enum38);
        setField(term14718, term14718.getClass(), "text", "BRIVNtfUWU");
        setField(term14718, term14718.getClass(), "imageIds", term14744);
        setField(term14718, term14718.getClass(), "videoId", term14752);
        setIntField(term14755, term14755.getClass(), "year", 2010);
        setShortField(term14755, term14755.getClass(), "month", (short) 1);
        setShortField(term14755, term14755.getClass(), "day", (short) 10);
        setField(term14754, term14754.getClass(), "date", term14755);
        setByteField(term14759, term14759.getClass(), "hour", (byte) 12);
        setByteField(term14759, term14759.getClass(), "minute", (byte) 46);
        setByteField(term14759, term14759.getClass(), "second", (byte) 5);
        setIntField(term14759, term14759.getClass(), "nano", 540440953);
        setField(term14754, term14754.getClass(), "time", term14759);
        setField(term14718, term14718.getClass(), "createdAt", term14754);
        setIntField(term14765, term14765.getClass(), "year", 2028);
        setShortField(term14765, term14765.getClass(), "month", (short) 5);
        setShortField(term14765, term14765.getClass(), "day", (short) 7);
        setField(term14764, term14764.getClass(), "date", term14765);
        setByteField(term14769, term14769.getClass(), "hour", (byte) 7);
        setByteField(term14769, term14769.getClass(), "minute", (byte) 48);
        setByteField(term14769, term14769.getClass(), "second", (byte) 4);
        setIntField(term14769, term14769.getClass(), "nano", 380425174);
        setField(term14764, term14764.getClass(), "time", term14769);
        setField(term14718, term14718.getClass(), "updatedAt", term14764);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.PostBO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVideoId", argTypes, term14718, args);
    }

};


