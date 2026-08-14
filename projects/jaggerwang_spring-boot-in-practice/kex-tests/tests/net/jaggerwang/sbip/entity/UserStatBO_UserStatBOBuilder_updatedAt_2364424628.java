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
import java.lang.Object;

public class UserStatBO_UserStatBOBuilder_updatedAt_2364424628 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12667;
     Object term12704;

    public UserStatBO_UserStatBOBuilder_updatedAt_2364424628() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term12668 = new Long(-4043093655001688454L);
        Long term12670 = new Long(-419800263764810394L);
        Long term12673 = new Long(5904678961906211249L);
        Long term12676 = new Long(-1820639665251914495L);
        Long term12679 = new Long(3238645206498300107L);
        Long term12682 = new Long(-1592696983130738594L);
        term12667 = newInstance(Class.forName("net.jaggerwang.sbip.entity.UserStatBO$UserStatBOBuilder"));
        Object term12684 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12685 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12689 = newInstance(Class.forName("java.time.LocalTime"));
        Object term12694 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12695 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12699 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term12667, term12667.getClass(), "id", term12668);
        setField(term12667, term12667.getClass(), "userId", term12670);
        setBooleanField(term12667, term12667.getClass(), "postCount$set", true);
        setField(term12667, term12667.getClass(), "postCount$value", term12673);
        setBooleanField(term12667, term12667.getClass(), "likeCount$set", true);
        setField(term12667, term12667.getClass(), "likeCount$value", term12676);
        setBooleanField(term12667, term12667.getClass(), "followingCount$set", true);
        setField(term12667, term12667.getClass(), "followingCount$value", term12679);
        setBooleanField(term12667, term12667.getClass(), "followerCount$set", true);
        setField(term12667, term12667.getClass(), "followerCount$value", term12682);
        setIntField(term12685, term12685.getClass(), "year", 2028);
        setShortField(term12685, term12685.getClass(), "month", (short) 3);
        setShortField(term12685, term12685.getClass(), "day", (short) 25);
        setField(term12684, term12684.getClass(), "date", term12685);
        setByteField(term12689, term12689.getClass(), "hour", (byte) 6);
        setByteField(term12689, term12689.getClass(), "minute", (byte) 9);
        setByteField(term12689, term12689.getClass(), "second", (byte) 35);
        setIntField(term12689, term12689.getClass(), "nano", 744453524);
        setField(term12684, term12684.getClass(), "time", term12689);
        setField(term12667, term12667.getClass(), "createdAt", term12684);
        setIntField(term12695, term12695.getClass(), "year", 2017);
        setShortField(term12695, term12695.getClass(), "month", (short) 6);
        setShortField(term12695, term12695.getClass(), "day", (short) 28);
        setField(term12694, term12694.getClass(), "date", term12695);
        setByteField(term12699, term12699.getClass(), "hour", (byte) 8);
        setByteField(term12699, term12699.getClass(), "minute", (byte) 1);
        setByteField(term12699, term12699.getClass(), "second", (byte) 14);
        setIntField(term12699, term12699.getClass(), "nano", 501033715);
        setField(term12694, term12694.getClass(), "time", term12699);
        setField(term12667, term12667.getClass(), "updatedAt", term12694);
        term12704 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12705 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12709 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term12705, term12705.getClass(), "year", 2016);
        setShortField(term12705, term12705.getClass(), "month", (short) 10);
        setShortField(term12705, term12705.getClass(), "day", (short) 10);
        setField(term12704, term12704.getClass(), "date", term12705);
        setByteField(term12709, term12709.getClass(), "hour", (byte) 16);
        setByteField(term12709, term12709.getClass(), "minute", (byte) 7);
        setByteField(term12709, term12709.getClass(), "second", (byte) 16);
        setIntField(term12709, term12709.getClass(), "nano", 995200309);
        setField(term12704, term12704.getClass(), "time", term12709);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.UserStatBO$UserStatBOBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term12704;
        callMethod(klass, "updatedAt", argTypes, term12667, args);
    }

};


