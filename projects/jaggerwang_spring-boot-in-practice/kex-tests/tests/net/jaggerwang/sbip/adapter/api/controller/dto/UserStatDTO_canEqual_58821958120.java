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

public class UserStatDTO_canEqual_58821958120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28790;
     Object term28823;

    public UserStatDTO_canEqual_58821958120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term28791 = new Long(-1889784286465977825L);
        Long term28793 = new Long(5592522907226111065L);
        Long term28795 = new Long(-2577420466618938650L);
        Long term28797 = new Long(5614572229094721840L);
        Long term28799 = new Long(-159468133651974975L);
        Long term28801 = new Long(9160882370265093763L);
        term28790 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserStatDTO"));
        Object term28803 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28804 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28808 = newInstance(Class.forName("java.time.LocalTime"));
        Object term28813 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28814 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28818 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term28790, term28790.getClass(), "id", term28791);
        setField(term28790, term28790.getClass(), "userId", term28793);
        setField(term28790, term28790.getClass(), "postCount", term28795);
        setField(term28790, term28790.getClass(), "likeCount", term28797);
        setField(term28790, term28790.getClass(), "followingCount", term28799);
        setField(term28790, term28790.getClass(), "followerCount", term28801);
        setIntField(term28804, term28804.getClass(), "year", 2021);
        setShortField(term28804, term28804.getClass(), "month", (short) 2);
        setShortField(term28804, term28804.getClass(), "day", (short) 21);
        setField(term28803, term28803.getClass(), "date", term28804);
        setByteField(term28808, term28808.getClass(), "hour", (byte) 4);
        setByteField(term28808, term28808.getClass(), "minute", (byte) 22);
        setByteField(term28808, term28808.getClass(), "second", (byte) 2);
        setIntField(term28808, term28808.getClass(), "nano", 752727543);
        setField(term28803, term28803.getClass(), "time", term28808);
        setField(term28790, term28790.getClass(), "createdAt", term28803);
        setIntField(term28814, term28814.getClass(), "year", 2017);
        setShortField(term28814, term28814.getClass(), "month", (short) 8);
        setShortField(term28814, term28814.getClass(), "day", (short) 30);
        setField(term28813, term28813.getClass(), "date", term28814);
        setByteField(term28818, term28818.getClass(), "hour", (byte) 3);
        setByteField(term28818, term28818.getClass(), "minute", (byte) 48);
        setByteField(term28818, term28818.getClass(), "second", (byte) 37);
        setIntField(term28818, term28818.getClass(), "nano", 121640121);
        setField(term28813, term28813.getClass(), "time", term28818);
        setField(term28790, term28790.getClass(), "updatedAt", term28813);
        term28823 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserStatDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term28823;
        callMethod(klass, "canEqual", argTypes, term28790, args);
    }

};


