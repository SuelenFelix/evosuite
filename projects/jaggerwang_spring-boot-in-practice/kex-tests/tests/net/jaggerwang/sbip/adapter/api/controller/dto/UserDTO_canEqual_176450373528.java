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

public class UserDTO_canEqual_176450373528 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14686;
     Object term14911;

    public UserDTO_canEqual_176450373528() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term14687 = new Long(-1964501434345816975L);
        Long term14737 = new Long(4689907154423223972L);
        Long term14772 = new Long(8512025621149521819L);
        Long term14774 = new Long(2022482096970820459L);
        Class<? extends Object> term14963 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term14962 = ((Class) term14963).getDeclaredField((String) "LOCAL");
        ((Field) term14962).setAccessible(true);
        Object enum26 = ((Field) term14962).get((Object) null);
        Long term14822 = new Long(6315101499811179240L);
        HashMap term14868 = new HashMap();
        Long term14877 = new Long(-3033337370154155851L);
        Long term14879 = new Long(-3130003589475815807L);
        Long term14881 = new Long(-5344598381371854750L);
        Long term14883 = new Long(-3718250311794019732L);
        Long term14885 = new Long(-5935517391653614345L);
        Long term14887 = new Long(-6521561238735301071L);
        Boolean term14909 = new Boolean(false);
        term14686 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserDTO"));
        Object term14751 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term14752 = newInstance(Class.forName("java.time.LocalDate"));
        Object term14756 = newInstance(Class.forName("java.time.LocalTime"));
        Object term14761 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term14762 = newInstance(Class.forName("java.time.LocalDate"));
        Object term14766 = newInstance(Class.forName("java.time.LocalTime"));
        Object term14771 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.FileDTO"));
        Object term14809 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        Object term14836 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term14837 = newInstance(Class.forName("java.time.LocalDate"));
        Object term14841 = newInstance(Class.forName("java.time.LocalTime"));
        Object term14846 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term14847 = newInstance(Class.forName("java.time.LocalDate"));
        Object term14851 = newInstance(Class.forName("java.time.LocalTime"));
        Object term14876 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserStatDTO"));
        Object term14889 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term14890 = newInstance(Class.forName("java.time.LocalDate"));
        Object term14894 = newInstance(Class.forName("java.time.LocalTime"));
        Object term14899 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term14900 = newInstance(Class.forName("java.time.LocalDate"));
        Object term14904 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term14686, term14686.getClass(), "id", term14687);
        setField(term14686, term14686.getClass(), "username", "EdPAvpluZg");
        setField(term14686, term14686.getClass(), "password", "DzHVBMqWtE");
        setField(term14686, term14686.getClass(), "mobile", "THZSpzBRYP");
        setField(term14686, term14686.getClass(), "email", "ZfBIVGBQOE");
        setField(term14686, term14686.getClass(), "avatarId", term14737);
        setField(term14686, term14686.getClass(), "intro", "QSrDQfEsTR");
        setIntField(term14752, term14752.getClass(), "year", 2029);
        setShortField(term14752, term14752.getClass(), "month", (short) 11);
        setShortField(term14752, term14752.getClass(), "day", (short) 8);
        setField(term14751, term14751.getClass(), "date", term14752);
        setByteField(term14756, term14756.getClass(), "hour", (byte) 23);
        setByteField(term14756, term14756.getClass(), "minute", (byte) 43);
        setByteField(term14756, term14756.getClass(), "second", (byte) 12);
        setIntField(term14756, term14756.getClass(), "nano", 586227255);
        setField(term14751, term14751.getClass(), "time", term14756);
        setField(term14686, term14686.getClass(), "createdAt", term14751);
        setIntField(term14762, term14762.getClass(), "year", 2014);
        setShortField(term14762, term14762.getClass(), "month", (short) 1);
        setShortField(term14762, term14762.getClass(), "day", (short) 23);
        setField(term14761, term14761.getClass(), "date", term14762);
        setByteField(term14766, term14766.getClass(), "hour", (byte) 19);
        setByteField(term14766, term14766.getClass(), "minute", (byte) 52);
        setByteField(term14766, term14766.getClass(), "second", (byte) 9);
        setIntField(term14766, term14766.getClass(), "nano", 235326975);
        setField(term14761, term14761.getClass(), "time", term14766);
        setField(term14686, term14686.getClass(), "updatedAt", term14761);
        setField(term14771, term14771.getClass(), "id", term14772);
        setField(term14771, term14771.getClass(), "userId", term14774);
        setField(term14771, term14771.getClass(), "region", enum26);
        setField(term14771, term14771.getClass(), "bucket", "PsqusYmejD");
        setField(term14771, term14771.getClass(), "path", "NTWMiBEaDF");
        setField(term14809, term14809.getClass(), "name", "SPBstwKFVr");
        setField(term14809, term14809.getClass(), "size", term14822);
        setField(term14809, term14809.getClass(), "type", "WxYUTuqmIq");
        setField(term14771, term14771.getClass(), "meta", term14809);
        setIntField(term14837, term14837.getClass(), "year", 2023);
        setShortField(term14837, term14837.getClass(), "month", (short) 8);
        setShortField(term14837, term14837.getClass(), "day", (short) 21);
        setField(term14836, term14836.getClass(), "date", term14837);
        setByteField(term14841, term14841.getClass(), "hour", (byte) 10);
        setByteField(term14841, term14841.getClass(), "minute", (byte) 36);
        setByteField(term14841, term14841.getClass(), "second", (byte) 15);
        setIntField(term14841, term14841.getClass(), "nano", 257070204);
        setField(term14836, term14836.getClass(), "time", term14841);
        setField(term14771, term14771.getClass(), "createdAt", term14836);
        setIntField(term14847, term14847.getClass(), "year", 2012);
        setShortField(term14847, term14847.getClass(), "month", (short) 12);
        setShortField(term14847, term14847.getClass(), "day", (short) 14);
        setField(term14846, term14846.getClass(), "date", term14847);
        setByteField(term14851, term14851.getClass(), "hour", (byte) 1);
        setByteField(term14851, term14851.getClass(), "minute", (byte) 47);
        setByteField(term14851, term14851.getClass(), "second", (byte) 3);
        setIntField(term14851, term14851.getClass(), "nano", 359751066);
        setField(term14846, term14846.getClass(), "time", term14851);
        setField(term14771, term14771.getClass(), "updatedAt", term14846);
        setField(term14771, term14771.getClass(), "url", "OeQLvhVERT");
        setField(term14771, term14771.getClass(), "thumbs", term14868);
        setField(term14686, term14686.getClass(), "avatar", term14771);
        setField(term14876, term14876.getClass(), "id", term14877);
        setField(term14876, term14876.getClass(), "userId", term14879);
        setField(term14876, term14876.getClass(), "postCount", term14881);
        setField(term14876, term14876.getClass(), "likeCount", term14883);
        setField(term14876, term14876.getClass(), "followingCount", term14885);
        setField(term14876, term14876.getClass(), "followerCount", term14887);
        setIntField(term14890, term14890.getClass(), "year", 2010);
        setShortField(term14890, term14890.getClass(), "month", (short) 2);
        setShortField(term14890, term14890.getClass(), "day", (short) 28);
        setField(term14889, term14889.getClass(), "date", term14890);
        setByteField(term14894, term14894.getClass(), "hour", (byte) 2);
        setByteField(term14894, term14894.getClass(), "minute", (byte) 54);
        setByteField(term14894, term14894.getClass(), "second", (byte) 48);
        setIntField(term14894, term14894.getClass(), "nano", 930628940);
        setField(term14889, term14889.getClass(), "time", term14894);
        setField(term14876, term14876.getClass(), "createdAt", term14889);
        setIntField(term14900, term14900.getClass(), "year", 2022);
        setShortField(term14900, term14900.getClass(), "month", (short) 3);
        setShortField(term14900, term14900.getClass(), "day", (short) 11);
        setField(term14899, term14899.getClass(), "date", term14900);
        setByteField(term14904, term14904.getClass(), "hour", (byte) 7);
        setByteField(term14904, term14904.getClass(), "minute", (byte) 12);
        setByteField(term14904, term14904.getClass(), "second", (byte) 56);
        setIntField(term14904, term14904.getClass(), "nano", 884158779);
        setField(term14899, term14899.getClass(), "time", term14904);
        setField(term14876, term14876.getClass(), "updatedAt", term14899);
        setField(term14686, term14686.getClass(), "stat", term14876);
        setField(term14686, term14686.getClass(), "following", term14909);
        term14911 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term14911;
        callMethod(klass, "canEqual", argTypes, term14686, args);
    }

};


