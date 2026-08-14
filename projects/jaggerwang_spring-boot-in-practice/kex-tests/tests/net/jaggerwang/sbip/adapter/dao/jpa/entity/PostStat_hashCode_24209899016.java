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

public class PostStat_hashCode_24209899016 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4038;

    public PostStat_hashCode_24209899016() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4039 = new Long(5510783420697225605L);
        Long term4041 = new Long(6005241913654469005L);
        Long term4043 = new Long(-1983291584002806658L);
        term4038 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.PostStat"));
        Object term4045 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4046 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4050 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4055 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4056 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4060 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term4038, term4038.getClass(), "id", term4039);
        setField(term4038, term4038.getClass(), "postId", term4041);
        setField(term4038, term4038.getClass(), "likeCount", term4043);
        setIntField(term4046, term4046.getClass(), "year", 2025);
        setShortField(term4046, term4046.getClass(), "month", (short) 9);
        setShortField(term4046, term4046.getClass(), "day", (short) 25);
        setField(term4045, term4045.getClass(), "date", term4046);
        setByteField(term4050, term4050.getClass(), "hour", (byte) 20);
        setByteField(term4050, term4050.getClass(), "minute", (byte) 0);
        setByteField(term4050, term4050.getClass(), "second", (byte) 25);
        setIntField(term4050, term4050.getClass(), "nano", 65871584);
        setField(term4045, term4045.getClass(), "time", term4050);
        setField(term4038, term4038.getClass(), "createdAt", term4045);
        setIntField(term4056, term4056.getClass(), "year", 2011);
        setShortField(term4056, term4056.getClass(), "month", (short) 9);
        setShortField(term4056, term4056.getClass(), "day", (short) 25);
        setField(term4055, term4055.getClass(), "date", term4056);
        setByteField(term4060, term4060.getClass(), "hour", (byte) 16);
        setByteField(term4060, term4060.getClass(), "minute", (byte) 45);
        setByteField(term4060, term4060.getClass(), "second", (byte) 19);
        setIntField(term4060, term4060.getClass(), "nano", 962864785);
        setField(term4055, term4055.getClass(), "time", term4060);
        setField(term4038, term4038.getClass(), "updatedAt", term4055);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.PostStat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term4038, args);
    }

};


