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

public class UserStatDTO_toString_117538941322 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28857;

    public UserStatDTO_toString_117538941322() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term28858 = new Long(-723697646775816649L);
        Long term28860 = new Long(-5671086125367688052L);
        Long term28862 = new Long(7875739215674729968L);
        Long term28864 = new Long(-8605430501912680279L);
        Long term28866 = new Long(2985226914509512766L);
        Long term28868 = new Long(4041117732464806744L);
        term28857 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserStatDTO"));
        Object term28870 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28871 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28875 = newInstance(Class.forName("java.time.LocalTime"));
        Object term28880 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28881 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28885 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term28857, term28857.getClass(), "id", term28858);
        setField(term28857, term28857.getClass(), "userId", term28860);
        setField(term28857, term28857.getClass(), "postCount", term28862);
        setField(term28857, term28857.getClass(), "likeCount", term28864);
        setField(term28857, term28857.getClass(), "followingCount", term28866);
        setField(term28857, term28857.getClass(), "followerCount", term28868);
        setIntField(term28871, term28871.getClass(), "year", 2014);
        setShortField(term28871, term28871.getClass(), "month", (short) 2);
        setShortField(term28871, term28871.getClass(), "day", (short) 18);
        setField(term28870, term28870.getClass(), "date", term28871);
        setByteField(term28875, term28875.getClass(), "hour", (byte) 4);
        setByteField(term28875, term28875.getClass(), "minute", (byte) 16);
        setByteField(term28875, term28875.getClass(), "second", (byte) 8);
        setIntField(term28875, term28875.getClass(), "nano", 486006871);
        setField(term28870, term28870.getClass(), "time", term28875);
        setField(term28857, term28857.getClass(), "createdAt", term28870);
        setIntField(term28881, term28881.getClass(), "year", 2024);
        setShortField(term28881, term28881.getClass(), "month", (short) 10);
        setShortField(term28881, term28881.getClass(), "day", (short) 8);
        setField(term28880, term28880.getClass(), "date", term28881);
        setByteField(term28885, term28885.getClass(), "hour", (byte) 19);
        setByteField(term28885, term28885.getClass(), "minute", (byte) 31);
        setByteField(term28885, term28885.getClass(), "second", (byte) 10);
        setIntField(term28885, term28885.getClass(), "nano", 930417883);
        setField(term28880, term28880.getClass(), "time", term28885);
        setField(term28857, term28857.getClass(), "updatedAt", term28880);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserStatDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term28857, args);
    }

};


