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

public class PostStat_prePersist_11896963282 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3659;

    public PostStat_prePersist_11896963282() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3660 = new Long(-8708192233349544946L);
        Long term3662 = new Long(5907001541142728739L);
        Long term3664 = new Long(4178434741742309755L);
        term3659 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.PostStat"));
        Object term3666 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3667 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3671 = newInstance(Class.forName("java.time.LocalTime"));
        Object term3676 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3677 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3681 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term3659, term3659.getClass(), "id", term3660);
        setField(term3659, term3659.getClass(), "postId", term3662);
        setField(term3659, term3659.getClass(), "likeCount", term3664);
        setIntField(term3667, term3667.getClass(), "year", 2028);
        setShortField(term3667, term3667.getClass(), "month", (short) 10);
        setShortField(term3667, term3667.getClass(), "day", (short) 1);
        setField(term3666, term3666.getClass(), "date", term3667);
        setByteField(term3671, term3671.getClass(), "hour", (byte) 17);
        setByteField(term3671, term3671.getClass(), "minute", (byte) 29);
        setByteField(term3671, term3671.getClass(), "second", (byte) 30);
        setIntField(term3671, term3671.getClass(), "nano", 845472306);
        setField(term3666, term3666.getClass(), "time", term3671);
        setField(term3659, term3659.getClass(), "createdAt", term3666);
        setIntField(term3677, term3677.getClass(), "year", 2027);
        setShortField(term3677, term3677.getClass(), "month", (short) 2);
        setShortField(term3677, term3677.getClass(), "day", (short) 19);
        setField(term3676, term3676.getClass(), "date", term3677);
        setByteField(term3681, term3681.getClass(), "hour", (byte) 17);
        setByteField(term3681, term3681.getClass(), "minute", (byte) 37);
        setByteField(term3681, term3681.getClass(), "second", (byte) 27);
        setIntField(term3681, term3681.getClass(), "nano", 920380537);
        setField(term3676, term3676.getClass(), "time", term3681);
        setField(term3659, term3659.getClass(), "updatedAt", term3676);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.PostStat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "prePersist", argTypes, term3659, args);
    }

};


