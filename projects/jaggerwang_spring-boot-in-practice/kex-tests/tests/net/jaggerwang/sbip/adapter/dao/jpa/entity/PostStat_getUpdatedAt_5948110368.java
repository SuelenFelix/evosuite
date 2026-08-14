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

public class PostStat_getUpdatedAt_5948110368 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3794;

    public PostStat_getUpdatedAt_5948110368() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3795 = new Long(-2850532706972744550L);
        Long term3797 = new Long(-2644215923136513282L);
        Long term3799 = new Long(-1468719814009985452L);
        term3794 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.PostStat"));
        Object term3801 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3802 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3806 = newInstance(Class.forName("java.time.LocalTime"));
        Object term3811 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3812 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3816 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term3794, term3794.getClass(), "id", term3795);
        setField(term3794, term3794.getClass(), "postId", term3797);
        setField(term3794, term3794.getClass(), "likeCount", term3799);
        setIntField(term3802, term3802.getClass(), "year", 2010);
        setShortField(term3802, term3802.getClass(), "month", (short) 1);
        setShortField(term3802, term3802.getClass(), "day", (short) 17);
        setField(term3801, term3801.getClass(), "date", term3802);
        setByteField(term3806, term3806.getClass(), "hour", (byte) 13);
        setByteField(term3806, term3806.getClass(), "minute", (byte) 5);
        setByteField(term3806, term3806.getClass(), "second", (byte) 51);
        setIntField(term3806, term3806.getClass(), "nano", 362260580);
        setField(term3801, term3801.getClass(), "time", term3806);
        setField(term3794, term3794.getClass(), "createdAt", term3801);
        setIntField(term3812, term3812.getClass(), "year", 2010);
        setShortField(term3812, term3812.getClass(), "month", (short) 9);
        setShortField(term3812, term3812.getClass(), "day", (short) 28);
        setField(term3811, term3811.getClass(), "date", term3812);
        setByteField(term3816, term3816.getClass(), "hour", (byte) 6);
        setByteField(term3816, term3816.getClass(), "minute", (byte) 4);
        setByteField(term3816, term3816.getClass(), "second", (byte) 54);
        setIntField(term3816, term3816.getClass(), "nano", 604713782);
        setField(term3811, term3811.getClass(), "time", term3816);
        setField(term3794, term3794.getClass(), "updatedAt", term3811);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.PostStat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUpdatedAt", argTypes, term3794, args);
    }

};


