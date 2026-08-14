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

public class UserDTO_UserDTOBuilder_following_83415216212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35278;
     Object term35503;

    public UserDTO_UserDTOBuilder_following_83415216212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term35279 = new Long(7440648013789140935L);
        Long term35329 = new Long(-7488291606536854368L);
        Long term35364 = new Long(-6664891356964396236L);
        Long term35366 = new Long(5307445998877056304L);
        Class<? extends Object> term35556 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term35555 = ((Class) term35556).getDeclaredField((String) "LOCAL");
        ((Field) term35555).setAccessible(true);
        Object enum68 = ((Field) term35555).get((Object) null);
        Long term35414 = new Long(-8148408579143384073L);
        HashMap term35460 = new HashMap();
        Long term35469 = new Long(-888581501148999479L);
        Long term35471 = new Long(1835131711657183788L);
        Long term35473 = new Long(-4507768716367203234L);
        Long term35475 = new Long(-192072503176550129L);
        Long term35477 = new Long(-4726601557653351735L);
        Long term35479 = new Long(-3502423991725415780L);
        Boolean term35501 = new Boolean(true);
        term35278 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserDTO$UserDTOBuilder"));
        Object term35343 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term35344 = newInstance(Class.forName("java.time.LocalDate"));
        Object term35348 = newInstance(Class.forName("java.time.LocalTime"));
        Object term35353 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term35354 = newInstance(Class.forName("java.time.LocalDate"));
        Object term35358 = newInstance(Class.forName("java.time.LocalTime"));
        Object term35363 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.FileDTO"));
        Object term35401 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        Object term35428 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term35429 = newInstance(Class.forName("java.time.LocalDate"));
        Object term35433 = newInstance(Class.forName("java.time.LocalTime"));
        Object term35438 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term35439 = newInstance(Class.forName("java.time.LocalDate"));
        Object term35443 = newInstance(Class.forName("java.time.LocalTime"));
        Object term35468 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserStatDTO"));
        Object term35481 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term35482 = newInstance(Class.forName("java.time.LocalDate"));
        Object term35486 = newInstance(Class.forName("java.time.LocalTime"));
        Object term35491 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term35492 = newInstance(Class.forName("java.time.LocalDate"));
        Object term35496 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term35278, term35278.getClass(), "id", term35279);
        setField(term35278, term35278.getClass(), "username", "vpZIqpFbKM");
        setField(term35278, term35278.getClass(), "password", "dAbwpJCDif");
        setField(term35278, term35278.getClass(), "mobile", "ATSXJPySio");
        setField(term35278, term35278.getClass(), "email", "XZkOUcbfFg");
        setField(term35278, term35278.getClass(), "avatarId", term35329);
        setField(term35278, term35278.getClass(), "intro", "TGiJfagfky");
        setIntField(term35344, term35344.getClass(), "year", 2025);
        setShortField(term35344, term35344.getClass(), "month", (short) 8);
        setShortField(term35344, term35344.getClass(), "day", (short) 4);
        setField(term35343, term35343.getClass(), "date", term35344);
        setByteField(term35348, term35348.getClass(), "hour", (byte) 7);
        setByteField(term35348, term35348.getClass(), "minute", (byte) 29);
        setByteField(term35348, term35348.getClass(), "second", (byte) 4);
        setIntField(term35348, term35348.getClass(), "nano", 175288511);
        setField(term35343, term35343.getClass(), "time", term35348);
        setField(term35278, term35278.getClass(), "createdAt", term35343);
        setIntField(term35354, term35354.getClass(), "year", 2029);
        setShortField(term35354, term35354.getClass(), "month", (short) 9);
        setShortField(term35354, term35354.getClass(), "day", (short) 1);
        setField(term35353, term35353.getClass(), "date", term35354);
        setByteField(term35358, term35358.getClass(), "hour", (byte) 19);
        setByteField(term35358, term35358.getClass(), "minute", (byte) 56);
        setByteField(term35358, term35358.getClass(), "second", (byte) 46);
        setIntField(term35358, term35358.getClass(), "nano", 657110114);
        setField(term35353, term35353.getClass(), "time", term35358);
        setField(term35278, term35278.getClass(), "updatedAt", term35353);
        setField(term35363, term35363.getClass(), "id", term35364);
        setField(term35363, term35363.getClass(), "userId", term35366);
        setField(term35363, term35363.getClass(), "region", enum68);
        setField(term35363, term35363.getClass(), "bucket", "BJklinBmhN");
        setField(term35363, term35363.getClass(), "path", "IOddzvEWcl");
        setField(term35401, term35401.getClass(), "name", "bIrtpkYJWT");
        setField(term35401, term35401.getClass(), "size", term35414);
        setField(term35401, term35401.getClass(), "type", "VuLLXpvPpZ");
        setField(term35363, term35363.getClass(), "meta", term35401);
        setIntField(term35429, term35429.getClass(), "year", 2020);
        setShortField(term35429, term35429.getClass(), "month", (short) 2);
        setShortField(term35429, term35429.getClass(), "day", (short) 22);
        setField(term35428, term35428.getClass(), "date", term35429);
        setByteField(term35433, term35433.getClass(), "hour", (byte) 5);
        setByteField(term35433, term35433.getClass(), "minute", (byte) 45);
        setByteField(term35433, term35433.getClass(), "second", (byte) 53);
        setIntField(term35433, term35433.getClass(), "nano", 933056720);
        setField(term35428, term35428.getClass(), "time", term35433);
        setField(term35363, term35363.getClass(), "createdAt", term35428);
        setIntField(term35439, term35439.getClass(), "year", 2012);
        setShortField(term35439, term35439.getClass(), "month", (short) 11);
        setShortField(term35439, term35439.getClass(), "day", (short) 26);
        setField(term35438, term35438.getClass(), "date", term35439);
        setByteField(term35443, term35443.getClass(), "hour", (byte) 23);
        setByteField(term35443, term35443.getClass(), "minute", (byte) 32);
        setByteField(term35443, term35443.getClass(), "second", (byte) 25);
        setIntField(term35443, term35443.getClass(), "nano", 47326173);
        setField(term35438, term35438.getClass(), "time", term35443);
        setField(term35363, term35363.getClass(), "updatedAt", term35438);
        setField(term35363, term35363.getClass(), "url", "UEdzEKEEEV");
        setField(term35363, term35363.getClass(), "thumbs", term35460);
        setField(term35278, term35278.getClass(), "avatar", term35363);
        setField(term35468, term35468.getClass(), "id", term35469);
        setField(term35468, term35468.getClass(), "userId", term35471);
        setField(term35468, term35468.getClass(), "postCount", term35473);
        setField(term35468, term35468.getClass(), "likeCount", term35475);
        setField(term35468, term35468.getClass(), "followingCount", term35477);
        setField(term35468, term35468.getClass(), "followerCount", term35479);
        setIntField(term35482, term35482.getClass(), "year", 2010);
        setShortField(term35482, term35482.getClass(), "month", (short) 2);
        setShortField(term35482, term35482.getClass(), "day", (short) 22);
        setField(term35481, term35481.getClass(), "date", term35482);
        setByteField(term35486, term35486.getClass(), "hour", (byte) 10);
        setByteField(term35486, term35486.getClass(), "minute", (byte) 57);
        setByteField(term35486, term35486.getClass(), "second", (byte) 47);
        setIntField(term35486, term35486.getClass(), "nano", 236871229);
        setField(term35481, term35481.getClass(), "time", term35486);
        setField(term35468, term35468.getClass(), "createdAt", term35481);
        setIntField(term35492, term35492.getClass(), "year", 2028);
        setShortField(term35492, term35492.getClass(), "month", (short) 10);
        setShortField(term35492, term35492.getClass(), "day", (short) 4);
        setField(term35491, term35491.getClass(), "date", term35492);
        setByteField(term35496, term35496.getClass(), "hour", (byte) 7);
        setByteField(term35496, term35496.getClass(), "minute", (byte) 45);
        setByteField(term35496, term35496.getClass(), "second", (byte) 52);
        setIntField(term35496, term35496.getClass(), "nano", 886309979);
        setField(term35491, term35491.getClass(), "time", term35496);
        setField(term35468, term35468.getClass(), "updatedAt", term35491);
        setField(term35278, term35278.getClass(), "stat", term35468);
        setField(term35278, term35278.getClass(), "following", term35501);
        term35503 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserDTO$UserDTOBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[1];
        args[0] = term35503;
        callMethod(klass, "following", argTypes, term35278, args);
    }

};


