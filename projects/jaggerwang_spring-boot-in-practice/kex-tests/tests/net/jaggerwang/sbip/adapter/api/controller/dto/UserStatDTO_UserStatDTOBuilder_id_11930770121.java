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

public class UserStatDTO_UserStatDTOBuilder_id_11930770121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57922;
     Object term57955;

    public UserStatDTO_UserStatDTOBuilder_id_11930770121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term57923 = new Long(-4498877698180346473L);
        Long term57925 = new Long(4642147601851708039L);
        Long term57927 = new Long(1425489182033961019L);
        Long term57929 = new Long(-884853141515650306L);
        Long term57931 = new Long(5063961949952053841L);
        Long term57933 = new Long(5946931662340995277L);
        term57922 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserStatDTO$UserStatDTOBuilder"));
        Object term57935 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term57936 = newInstance(Class.forName("java.time.LocalDate"));
        Object term57940 = newInstance(Class.forName("java.time.LocalTime"));
        Object term57945 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term57946 = newInstance(Class.forName("java.time.LocalDate"));
        Object term57950 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term57922, term57922.getClass(), "id", term57923);
        setField(term57922, term57922.getClass(), "userId", term57925);
        setField(term57922, term57922.getClass(), "postCount", term57927);
        setField(term57922, term57922.getClass(), "likeCount", term57929);
        setField(term57922, term57922.getClass(), "followingCount", term57931);
        setField(term57922, term57922.getClass(), "followerCount", term57933);
        setIntField(term57936, term57936.getClass(), "year", 2029);
        setShortField(term57936, term57936.getClass(), "month", (short) 6);
        setShortField(term57936, term57936.getClass(), "day", (short) 2);
        setField(term57935, term57935.getClass(), "date", term57936);
        setByteField(term57940, term57940.getClass(), "hour", (byte) 7);
        setByteField(term57940, term57940.getClass(), "minute", (byte) 13);
        setByteField(term57940, term57940.getClass(), "second", (byte) 48);
        setIntField(term57940, term57940.getClass(), "nano", 642728132);
        setField(term57935, term57935.getClass(), "time", term57940);
        setField(term57922, term57922.getClass(), "createdAt", term57935);
        setIntField(term57946, term57946.getClass(), "year", 2010);
        setShortField(term57946, term57946.getClass(), "month", (short) 10);
        setShortField(term57946, term57946.getClass(), "day", (short) 8);
        setField(term57945, term57945.getClass(), "date", term57946);
        setByteField(term57950, term57950.getClass(), "hour", (byte) 6);
        setByteField(term57950, term57950.getClass(), "minute", (byte) 12);
        setByteField(term57950, term57950.getClass(), "second", (byte) 51);
        setIntField(term57950, term57950.getClass(), "nano", 851312829);
        setField(term57945, term57945.getClass(), "time", term57950);
        setField(term57922, term57922.getClass(), "updatedAt", term57945);
        term57955 = new Long(-519044061680044865L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserStatDTO$UserStatDTOBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term57955;
        callMethod(klass, "id", argTypes, term57922, args);
    }

};


