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

public class UserDTO_setMobile_205183675718 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8943;

    public UserDTO_setMobile_205183675718() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term8944 = new Long(-78240609295693193L);
        Long term8994 = new Long(3090901538358721367L);
        Long term9029 = new Long(-1677189124507026637L);
        Long term9031 = new Long(4795660804170399986L);
        Class<? extends Object> term9231 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term9230 = ((Class) term9231).getDeclaredField((String) "LOCAL");
        ((Field) term9230).setAccessible(true);
        Object enum16 = ((Field) term9230).get((Object) null);
        Long term9079 = new Long(-4030863184426321096L);
        HashMap term9125 = new HashMap();
        Long term9134 = new Long(-8010214112439224349L);
        Long term9136 = new Long(-6673920710396545553L);
        Long term9138 = new Long(3412644969878030772L);
        Long term9140 = new Long(6698455537431331246L);
        Long term9142 = new Long(-8327432141027603933L);
        Long term9144 = new Long(-433040798405298080L);
        Boolean term9166 = new Boolean(true);
        term8943 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserDTO"));
        Object term9008 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term9009 = newInstance(Class.forName("java.time.LocalDate"));
        Object term9013 = newInstance(Class.forName("java.time.LocalTime"));
        Object term9018 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term9019 = newInstance(Class.forName("java.time.LocalDate"));
        Object term9023 = newInstance(Class.forName("java.time.LocalTime"));
        Object term9028 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.FileDTO"));
        Object term9066 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        Object term9093 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term9094 = newInstance(Class.forName("java.time.LocalDate"));
        Object term9098 = newInstance(Class.forName("java.time.LocalTime"));
        Object term9103 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term9104 = newInstance(Class.forName("java.time.LocalDate"));
        Object term9108 = newInstance(Class.forName("java.time.LocalTime"));
        Object term9133 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserStatDTO"));
        Object term9146 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term9147 = newInstance(Class.forName("java.time.LocalDate"));
        Object term9151 = newInstance(Class.forName("java.time.LocalTime"));
        Object term9156 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term9157 = newInstance(Class.forName("java.time.LocalDate"));
        Object term9161 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term8943, term8943.getClass(), "id", term8944);
        setField(term8943, term8943.getClass(), "username", "ekxGuOYIwi");
        setField(term8943, term8943.getClass(), "password", "RbVQXSpxXy");
        setField(term8943, term8943.getClass(), "mobile", "YpJbIgJWWv");
        setField(term8943, term8943.getClass(), "email", "JppkknKVOw");
        setField(term8943, term8943.getClass(), "avatarId", term8994);
        setField(term8943, term8943.getClass(), "intro", "iljANwuEjk");
        setIntField(term9009, term9009.getClass(), "year", 2019);
        setShortField(term9009, term9009.getClass(), "month", (short) 8);
        setShortField(term9009, term9009.getClass(), "day", (short) 12);
        setField(term9008, term9008.getClass(), "date", term9009);
        setByteField(term9013, term9013.getClass(), "hour", (byte) 14);
        setByteField(term9013, term9013.getClass(), "minute", (byte) 1);
        setByteField(term9013, term9013.getClass(), "second", (byte) 51);
        setIntField(term9013, term9013.getClass(), "nano", 499021786);
        setField(term9008, term9008.getClass(), "time", term9013);
        setField(term8943, term8943.getClass(), "createdAt", term9008);
        setIntField(term9019, term9019.getClass(), "year", 2014);
        setShortField(term9019, term9019.getClass(), "month", (short) 7);
        setShortField(term9019, term9019.getClass(), "day", (short) 22);
        setField(term9018, term9018.getClass(), "date", term9019);
        setByteField(term9023, term9023.getClass(), "hour", (byte) 9);
        setByteField(term9023, term9023.getClass(), "minute", (byte) 40);
        setByteField(term9023, term9023.getClass(), "second", (byte) 34);
        setIntField(term9023, term9023.getClass(), "nano", 463008257);
        setField(term9018, term9018.getClass(), "time", term9023);
        setField(term8943, term8943.getClass(), "updatedAt", term9018);
        setField(term9028, term9028.getClass(), "id", term9029);
        setField(term9028, term9028.getClass(), "userId", term9031);
        setField(term9028, term9028.getClass(), "region", enum16);
        setField(term9028, term9028.getClass(), "bucket", "kNqaJKIATy");
        setField(term9028, term9028.getClass(), "path", "vKQukfbJUd");
        setField(term9066, term9066.getClass(), "name", "lFRJFUMVbx");
        setField(term9066, term9066.getClass(), "size", term9079);
        setField(term9066, term9066.getClass(), "type", "sZdUNdggUW");
        setField(term9028, term9028.getClass(), "meta", term9066);
        setIntField(term9094, term9094.getClass(), "year", 2027);
        setShortField(term9094, term9094.getClass(), "month", (short) 6);
        setShortField(term9094, term9094.getClass(), "day", (short) 20);
        setField(term9093, term9093.getClass(), "date", term9094);
        setByteField(term9098, term9098.getClass(), "hour", (byte) 23);
        setByteField(term9098, term9098.getClass(), "minute", (byte) 21);
        setByteField(term9098, term9098.getClass(), "second", (byte) 6);
        setIntField(term9098, term9098.getClass(), "nano", 897776059);
        setField(term9093, term9093.getClass(), "time", term9098);
        setField(term9028, term9028.getClass(), "createdAt", term9093);
        setIntField(term9104, term9104.getClass(), "year", 2016);
        setShortField(term9104, term9104.getClass(), "month", (short) 3);
        setShortField(term9104, term9104.getClass(), "day", (short) 20);
        setField(term9103, term9103.getClass(), "date", term9104);
        setByteField(term9108, term9108.getClass(), "hour", (byte) 0);
        setByteField(term9108, term9108.getClass(), "minute", (byte) 54);
        setByteField(term9108, term9108.getClass(), "second", (byte) 6);
        setIntField(term9108, term9108.getClass(), "nano", 183302469);
        setField(term9103, term9103.getClass(), "time", term9108);
        setField(term9028, term9028.getClass(), "updatedAt", term9103);
        setField(term9028, term9028.getClass(), "url", "OqbwYQfvAe");
        setField(term9028, term9028.getClass(), "thumbs", term9125);
        setField(term8943, term8943.getClass(), "avatar", term9028);
        setField(term9133, term9133.getClass(), "id", term9134);
        setField(term9133, term9133.getClass(), "userId", term9136);
        setField(term9133, term9133.getClass(), "postCount", term9138);
        setField(term9133, term9133.getClass(), "likeCount", term9140);
        setField(term9133, term9133.getClass(), "followingCount", term9142);
        setField(term9133, term9133.getClass(), "followerCount", term9144);
        setIntField(term9147, term9147.getClass(), "year", 2013);
        setShortField(term9147, term9147.getClass(), "month", (short) 11);
        setShortField(term9147, term9147.getClass(), "day", (short) 19);
        setField(term9146, term9146.getClass(), "date", term9147);
        setByteField(term9151, term9151.getClass(), "hour", (byte) 6);
        setByteField(term9151, term9151.getClass(), "minute", (byte) 45);
        setByteField(term9151, term9151.getClass(), "second", (byte) 10);
        setIntField(term9151, term9151.getClass(), "nano", 288981190);
        setField(term9146, term9146.getClass(), "time", term9151);
        setField(term9133, term9133.getClass(), "createdAt", term9146);
        setIntField(term9157, term9157.getClass(), "year", 2025);
        setShortField(term9157, term9157.getClass(), "month", (short) 9);
        setShortField(term9157, term9157.getClass(), "day", (short) 18);
        setField(term9156, term9156.getClass(), "date", term9157);
        setByteField(term9161, term9161.getClass(), "hour", (byte) 16);
        setByteField(term9161, term9161.getClass(), "minute", (byte) 1);
        setByteField(term9161, term9161.getClass(), "second", (byte) 23);
        setIntField(term9161, term9161.getClass(), "nano", 178285726);
        setField(term9156, term9156.getClass(), "time", term9161);
        setField(term9133, term9133.getClass(), "updatedAt", term9156);
        setField(term8943, term8943.getClass(), "stat", term9133);
        setField(term8943, term8943.getClass(), "following", term9166);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "DhjNLmRMCu";
        callMethod(klass, "setMobile", argTypes, term8943, args);
    }

};


