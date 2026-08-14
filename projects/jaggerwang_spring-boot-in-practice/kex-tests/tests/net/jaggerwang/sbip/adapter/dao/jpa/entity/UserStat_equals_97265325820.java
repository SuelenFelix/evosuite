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

public class UserStat_equals_97265325820 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32498;
     Object term32531;

    public UserStat_equals_97265325820() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term32499 = new Long(9219442829218784847L);
        Long term32501 = new Long(5153056225441125523L);
        Long term32503 = new Long(8082286259336326914L);
        Long term32505 = new Long(1093716108786896379L);
        Long term32507 = new Long(3917904228139004931L);
        Long term32509 = new Long(-2746162973618820048L);
        term32498 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserStat"));
        Object term32511 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term32512 = newInstance(Class.forName("java.time.LocalDate"));
        Object term32516 = newInstance(Class.forName("java.time.LocalTime"));
        Object term32521 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term32522 = newInstance(Class.forName("java.time.LocalDate"));
        Object term32526 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term32498, term32498.getClass(), "id", term32499);
        setField(term32498, term32498.getClass(), "userId", term32501);
        setField(term32498, term32498.getClass(), "postCount", term32503);
        setField(term32498, term32498.getClass(), "likeCount", term32505);
        setField(term32498, term32498.getClass(), "followingCount", term32507);
        setField(term32498, term32498.getClass(), "followerCount", term32509);
        setIntField(term32512, term32512.getClass(), "year", 2022);
        setShortField(term32512, term32512.getClass(), "month", (short) 6);
        setShortField(term32512, term32512.getClass(), "day", (short) 2);
        setField(term32511, term32511.getClass(), "date", term32512);
        setByteField(term32516, term32516.getClass(), "hour", (byte) 18);
        setByteField(term32516, term32516.getClass(), "minute", (byte) 14);
        setByteField(term32516, term32516.getClass(), "second", (byte) 42);
        setIntField(term32516, term32516.getClass(), "nano", 593545677);
        setField(term32511, term32511.getClass(), "time", term32516);
        setField(term32498, term32498.getClass(), "createdAt", term32511);
        setIntField(term32522, term32522.getClass(), "year", 2010);
        setShortField(term32522, term32522.getClass(), "month", (short) 7);
        setShortField(term32522, term32522.getClass(), "day", (short) 19);
        setField(term32521, term32521.getClass(), "date", term32522);
        setByteField(term32526, term32526.getClass(), "hour", (byte) 16);
        setByteField(term32526, term32526.getClass(), "minute", (byte) 23);
        setByteField(term32526, term32526.getClass(), "second", (byte) 11);
        setIntField(term32526, term32526.getClass(), "nano", 638450755);
        setField(term32521, term32521.getClass(), "time", term32526);
        setField(term32498, term32498.getClass(), "updatedAt", term32521);
        term32531 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserStat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term32531;
        callMethod(klass, "equals", argTypes, term32498, args);
    }

};


