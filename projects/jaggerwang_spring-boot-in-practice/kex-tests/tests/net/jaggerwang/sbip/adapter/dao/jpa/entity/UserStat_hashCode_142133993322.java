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

public class UserStat_hashCode_142133993322 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32566;

    public UserStat_hashCode_142133993322() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term32567 = new Long(-5097855288490086692L);
        Long term32569 = new Long(-8356953418230835643L);
        Long term32571 = new Long(-2213998544405629464L);
        Long term32573 = new Long(226516165063797489L);
        Long term32575 = new Long(-5055043026089632641L);
        Long term32577 = new Long(-3602145915631274444L);
        term32566 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserStat"));
        Object term32579 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term32580 = newInstance(Class.forName("java.time.LocalDate"));
        Object term32584 = newInstance(Class.forName("java.time.LocalTime"));
        Object term32589 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term32590 = newInstance(Class.forName("java.time.LocalDate"));
        Object term32594 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term32566, term32566.getClass(), "id", term32567);
        setField(term32566, term32566.getClass(), "userId", term32569);
        setField(term32566, term32566.getClass(), "postCount", term32571);
        setField(term32566, term32566.getClass(), "likeCount", term32573);
        setField(term32566, term32566.getClass(), "followingCount", term32575);
        setField(term32566, term32566.getClass(), "followerCount", term32577);
        setIntField(term32580, term32580.getClass(), "year", 2017);
        setShortField(term32580, term32580.getClass(), "month", (short) 10);
        setShortField(term32580, term32580.getClass(), "day", (short) 10);
        setField(term32579, term32579.getClass(), "date", term32580);
        setByteField(term32584, term32584.getClass(), "hour", (byte) 18);
        setByteField(term32584, term32584.getClass(), "minute", (byte) 16);
        setByteField(term32584, term32584.getClass(), "second", (byte) 29);
        setIntField(term32584, term32584.getClass(), "nano", 468943994);
        setField(term32579, term32579.getClass(), "time", term32584);
        setField(term32566, term32566.getClass(), "createdAt", term32579);
        setIntField(term32590, term32590.getClass(), "year", 2029);
        setShortField(term32590, term32590.getClass(), "month", (short) 3);
        setShortField(term32590, term32590.getClass(), "day", (short) 21);
        setField(term32589, term32589.getClass(), "date", term32590);
        setByteField(term32594, term32594.getClass(), "hour", (byte) 12);
        setByteField(term32594, term32594.getClass(), "minute", (byte) 42);
        setByteField(term32594, term32594.getClass(), "second", (byte) 52);
        setIntField(term32594, term32594.getClass(), "nano", 391302765);
        setField(term32589, term32589.getClass(), "time", term32594);
        setField(term32566, term32566.getClass(), "updatedAt", term32589);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserStat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term32566, args);
    }

};


