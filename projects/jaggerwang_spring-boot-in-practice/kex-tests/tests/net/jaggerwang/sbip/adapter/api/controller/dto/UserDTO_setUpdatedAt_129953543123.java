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
import java.lang.String;
import java.util.HashMap;
import java.lang.Boolean;

public class UserDTO_setUpdatedAt_129953543123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11756;
     Object term11981;

    public UserDTO_setUpdatedAt_129953543123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term11757 = new Long(-6394943900800506753L);
        Long term11807 = new Long(-4867941246533901410L);
        Long term11842 = new Long(1044883697493326351L);
        Long term11844 = new Long(-7406618974062419277L);
        Class<? extends Object> term12042 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term12041 = ((Class) term12042).getDeclaredField((String) "LOCAL");
        ((Field) term12041).setAccessible(true);
        Object enum21 = ((Field) term12041).get((Object) null);
        Long term11892 = new Long(868503089567085985L);
        HashMap term11938 = new HashMap();
        Long term11947 = new Long(-3277773415369003529L);
        Long term11949 = new Long(1253549421411622358L);
        Long term11951 = new Long(3666226122807672448L);
        Long term11953 = new Long(3108750145697087661L);
        Long term11955 = new Long(3752337209837437327L);
        Long term11957 = new Long(1860789353508856614L);
        Boolean term11979 = new Boolean(true);
        term11756 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserDTO"));
        Object term11821 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11822 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11826 = newInstance(Class.forName("java.time.LocalTime"));
        Object term11831 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11832 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11836 = newInstance(Class.forName("java.time.LocalTime"));
        Object term11841 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.FileDTO"));
        Object term11879 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        Object term11906 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11907 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11911 = newInstance(Class.forName("java.time.LocalTime"));
        Object term11916 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11917 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11921 = newInstance(Class.forName("java.time.LocalTime"));
        Object term11946 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserStatDTO"));
        Object term11959 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11960 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11964 = newInstance(Class.forName("java.time.LocalTime"));
        Object term11969 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11970 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11974 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term11756, term11756.getClass(), "id", term11757);
        setField(term11756, term11756.getClass(), "username", "nghfqDXyCG");
        setField(term11756, term11756.getClass(), "password", "WBAOTqErtm");
        setField(term11756, term11756.getClass(), "mobile", "PqtVXXZMqK");
        setField(term11756, term11756.getClass(), "email", "rYbtIDVdnd");
        setField(term11756, term11756.getClass(), "avatarId", term11807);
        setField(term11756, term11756.getClass(), "intro", "UKAReurpHG");
        setIntField(term11822, term11822.getClass(), "year", 2010);
        setShortField(term11822, term11822.getClass(), "month", (short) 12);
        setShortField(term11822, term11822.getClass(), "day", (short) 30);
        setField(term11821, term11821.getClass(), "date", term11822);
        setByteField(term11826, term11826.getClass(), "hour", (byte) 17);
        setByteField(term11826, term11826.getClass(), "minute", (byte) 44);
        setByteField(term11826, term11826.getClass(), "second", (byte) 59);
        setIntField(term11826, term11826.getClass(), "nano", 881407895);
        setField(term11821, term11821.getClass(), "time", term11826);
        setField(term11756, term11756.getClass(), "createdAt", term11821);
        setIntField(term11832, term11832.getClass(), "year", 2019);
        setShortField(term11832, term11832.getClass(), "month", (short) 6);
        setShortField(term11832, term11832.getClass(), "day", (short) 12);
        setField(term11831, term11831.getClass(), "date", term11832);
        setByteField(term11836, term11836.getClass(), "hour", (byte) 5);
        setByteField(term11836, term11836.getClass(), "minute", (byte) 13);
        setByteField(term11836, term11836.getClass(), "second", (byte) 8);
        setIntField(term11836, term11836.getClass(), "nano", 838117658);
        setField(term11831, term11831.getClass(), "time", term11836);
        setField(term11756, term11756.getClass(), "updatedAt", term11831);
        setField(term11841, term11841.getClass(), "id", term11842);
        setField(term11841, term11841.getClass(), "userId", term11844);
        setField(term11841, term11841.getClass(), "region", enum21);
        setField(term11841, term11841.getClass(), "bucket", "WVRMUmrljA");
        setField(term11841, term11841.getClass(), "path", "NTlKJDDWlk");
        setField(term11879, term11879.getClass(), "name", "vOuMEpOQAg");
        setField(term11879, term11879.getClass(), "size", term11892);
        setField(term11879, term11879.getClass(), "type", "SIODFGaQhr");
        setField(term11841, term11841.getClass(), "meta", term11879);
        setIntField(term11907, term11907.getClass(), "year", 2014);
        setShortField(term11907, term11907.getClass(), "month", (short) 8);
        setShortField(term11907, term11907.getClass(), "day", (short) 13);
        setField(term11906, term11906.getClass(), "date", term11907);
        setByteField(term11911, term11911.getClass(), "hour", (byte) 13);
        setByteField(term11911, term11911.getClass(), "minute", (byte) 15);
        setByteField(term11911, term11911.getClass(), "second", (byte) 51);
        setIntField(term11911, term11911.getClass(), "nano", 433726678);
        setField(term11906, term11906.getClass(), "time", term11911);
        setField(term11841, term11841.getClass(), "createdAt", term11906);
        setIntField(term11917, term11917.getClass(), "year", 2012);
        setShortField(term11917, term11917.getClass(), "month", (short) 5);
        setShortField(term11917, term11917.getClass(), "day", (short) 25);
        setField(term11916, term11916.getClass(), "date", term11917);
        setByteField(term11921, term11921.getClass(), "hour", (byte) 5);
        setByteField(term11921, term11921.getClass(), "minute", (byte) 8);
        setByteField(term11921, term11921.getClass(), "second", (byte) 47);
        setIntField(term11921, term11921.getClass(), "nano", 455554221);
        setField(term11916, term11916.getClass(), "time", term11921);
        setField(term11841, term11841.getClass(), "updatedAt", term11916);
        setField(term11841, term11841.getClass(), "url", "qYzsiuXOgS");
        setField(term11841, term11841.getClass(), "thumbs", term11938);
        setField(term11756, term11756.getClass(), "avatar", term11841);
        setField(term11946, term11946.getClass(), "id", term11947);
        setField(term11946, term11946.getClass(), "userId", term11949);
        setField(term11946, term11946.getClass(), "postCount", term11951);
        setField(term11946, term11946.getClass(), "likeCount", term11953);
        setField(term11946, term11946.getClass(), "followingCount", term11955);
        setField(term11946, term11946.getClass(), "followerCount", term11957);
        setIntField(term11960, term11960.getClass(), "year", 2029);
        setShortField(term11960, term11960.getClass(), "month", (short) 11);
        setShortField(term11960, term11960.getClass(), "day", (short) 18);
        setField(term11959, term11959.getClass(), "date", term11960);
        setByteField(term11964, term11964.getClass(), "hour", (byte) 5);
        setByteField(term11964, term11964.getClass(), "minute", (byte) 36);
        setByteField(term11964, term11964.getClass(), "second", (byte) 57);
        setIntField(term11964, term11964.getClass(), "nano", 394167804);
        setField(term11959, term11959.getClass(), "time", term11964);
        setField(term11946, term11946.getClass(), "createdAt", term11959);
        setIntField(term11970, term11970.getClass(), "year", 2020);
        setShortField(term11970, term11970.getClass(), "month", (short) 10);
        setShortField(term11970, term11970.getClass(), "day", (short) 8);
        setField(term11969, term11969.getClass(), "date", term11970);
        setByteField(term11974, term11974.getClass(), "hour", (byte) 15);
        setByteField(term11974, term11974.getClass(), "minute", (byte) 57);
        setByteField(term11974, term11974.getClass(), "second", (byte) 17);
        setIntField(term11974, term11974.getClass(), "nano", 288139529);
        setField(term11969, term11969.getClass(), "time", term11974);
        setField(term11946, term11946.getClass(), "updatedAt", term11969);
        setField(term11756, term11756.getClass(), "stat", term11946);
        setField(term11756, term11756.getClass(), "following", term11979);
        term11981 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11982 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11986 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term11982, term11982.getClass(), "year", 2022);
        setShortField(term11982, term11982.getClass(), "month", (short) 6);
        setShortField(term11982, term11982.getClass(), "day", (short) 12);
        setField(term11981, term11981.getClass(), "date", term11982);
        setByteField(term11986, term11986.getClass(), "hour", (byte) 14);
        setByteField(term11986, term11986.getClass(), "minute", (byte) 3);
        setByteField(term11986, term11986.getClass(), "second", (byte) 7);
        setIntField(term11986, term11986.getClass(), "nano", 637592645);
        setField(term11981, term11981.getClass(), "time", term11986);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term11981;
        callMethod(klass, "setUpdatedAt", argTypes, term11756, args);
    }

};


