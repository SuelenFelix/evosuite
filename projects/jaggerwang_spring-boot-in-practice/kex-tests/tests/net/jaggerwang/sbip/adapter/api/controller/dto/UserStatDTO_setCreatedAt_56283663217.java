package net.jaggerwang.sbip.adapter.api.controller.dto;

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
import static net.jaggerwang.sbip.adapter.api.controller.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class UserStatDTO_setCreatedAt_56283663217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28670;
     Object term28703;

    public UserStatDTO_setCreatedAt_56283663217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term28671 = new Long(-3271370917942710167L);
        Long term28673 = new Long(-8928717808154338062L);
        Long term28675 = new Long(4628458998884457238L);
        Long term28677 = new Long(-6806576523000182981L);
        Long term28679 = new Long(6437032166810658671L);
        Long term28681 = new Long(6044346825617132280L);
        term28670 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserStatDTO"));
        Object term28683 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28684 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28688 = newInstance(Class.forName("java.time.LocalTime"));
        Object term28693 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28694 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28698 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term28670, term28670.getClass(), "id", term28671);
        setField(term28670, term28670.getClass(), "userId", term28673);
        setField(term28670, term28670.getClass(), "postCount", term28675);
        setField(term28670, term28670.getClass(), "likeCount", term28677);
        setField(term28670, term28670.getClass(), "followingCount", term28679);
        setField(term28670, term28670.getClass(), "followerCount", term28681);
        setIntField(term28684, term28684.getClass(), "year", 2016);
        setShortField(term28684, term28684.getClass(), "month", (short) 5);
        setShortField(term28684, term28684.getClass(), "day", (short) 9);
        setField(term28683, term28683.getClass(), "date", term28684);
        setByteField(term28688, term28688.getClass(), "hour", (byte) 1);
        setByteField(term28688, term28688.getClass(), "minute", (byte) 20);
        setByteField(term28688, term28688.getClass(), "second", (byte) 56);
        setIntField(term28688, term28688.getClass(), "nano", 198437232);
        setField(term28683, term28683.getClass(), "time", term28688);
        setField(term28670, term28670.getClass(), "createdAt", term28683);
        setIntField(term28694, term28694.getClass(), "year", 2021);
        setShortField(term28694, term28694.getClass(), "month", (short) 2);
        setShortField(term28694, term28694.getClass(), "day", (short) 5);
        setField(term28693, term28693.getClass(), "date", term28694);
        setByteField(term28698, term28698.getClass(), "hour", (byte) 20);
        setByteField(term28698, term28698.getClass(), "minute", (byte) 43);
        setByteField(term28698, term28698.getClass(), "second", (byte) 37);
        setIntField(term28698, term28698.getClass(), "nano", 191661361);
        setField(term28693, term28693.getClass(), "time", term28698);
        setField(term28670, term28670.getClass(), "updatedAt", term28693);
        term28703 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28704 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28708 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term28704, term28704.getClass(), "year", 2014);
        setShortField(term28704, term28704.getClass(), "month", (short) 5);
        setShortField(term28704, term28704.getClass(), "day", (short) 18);
        setField(term28703, term28703.getClass(), "date", term28704);
        setByteField(term28708, term28708.getClass(), "hour", (byte) 19);
        setByteField(term28708, term28708.getClass(), "minute", (byte) 25);
        setByteField(term28708, term28708.getClass(), "second", (byte) 8);
        setIntField(term28708, term28708.getClass(), "nano", 217186771);
        setField(term28703, term28703.getClass(), "time", term28708);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserStatDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term28703;
        callMethod(klass, "setCreatedAt", argTypes, term28670, args);
    }

};


