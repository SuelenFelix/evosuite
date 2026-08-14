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

public class UserDTO_getAvatarId_5769945448 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3427;

    public UserDTO_getAvatarId_5769945448() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3428 = new Long(305759998609888272L);
        Long term3478 = new Long(-8654565919063661957L);
        Long term3513 = new Long(-5248475803419977214L);
        Long term3515 = new Long(-6723783499250797216L);
        Class<? extends Object> term3703 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term3702 = ((Class) term3703).getDeclaredField((String) "LOCAL");
        ((Field) term3702).setAccessible(true);
        Object enum6 = ((Field) term3702).get((Object) null);
        Long term3563 = new Long(41775768178052008L);
        HashMap term3609 = new HashMap();
        Long term3618 = new Long(6682528376118987775L);
        Long term3620 = new Long(682356318767179819L);
        Long term3622 = new Long(-7291743527973326814L);
        Long term3624 = new Long(-5963439350418910964L);
        Long term3626 = new Long(9013624480170062917L);
        Long term3628 = new Long(7862575738391801707L);
        Boolean term3650 = new Boolean(true);
        term3427 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserDTO"));
        Object term3492 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3493 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3497 = newInstance(Class.forName("java.time.LocalTime"));
        Object term3502 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3503 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3507 = newInstance(Class.forName("java.time.LocalTime"));
        Object term3512 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.FileDTO"));
        Object term3550 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        Object term3577 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3578 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3582 = newInstance(Class.forName("java.time.LocalTime"));
        Object term3587 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3588 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3592 = newInstance(Class.forName("java.time.LocalTime"));
        Object term3617 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserStatDTO"));
        Object term3630 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3631 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3635 = newInstance(Class.forName("java.time.LocalTime"));
        Object term3640 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3641 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3645 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term3427, term3427.getClass(), "id", term3428);
        setField(term3427, term3427.getClass(), "username", "IgRJUzaCwW");
        setField(term3427, term3427.getClass(), "password", "JUmudUmaaV");
        setField(term3427, term3427.getClass(), "mobile", "KoyGrUJeJW");
        setField(term3427, term3427.getClass(), "email", "HqBOwkVqjD");
        setField(term3427, term3427.getClass(), "avatarId", term3478);
        setField(term3427, term3427.getClass(), "intro", "MAcUBcBckh");
        setIntField(term3493, term3493.getClass(), "year", 2023);
        setShortField(term3493, term3493.getClass(), "month", (short) 7);
        setShortField(term3493, term3493.getClass(), "day", (short) 16);
        setField(term3492, term3492.getClass(), "date", term3493);
        setByteField(term3497, term3497.getClass(), "hour", (byte) 3);
        setByteField(term3497, term3497.getClass(), "minute", (byte) 1);
        setByteField(term3497, term3497.getClass(), "second", (byte) 19);
        setIntField(term3497, term3497.getClass(), "nano", 488629554);
        setField(term3492, term3492.getClass(), "time", term3497);
        setField(term3427, term3427.getClass(), "createdAt", term3492);
        setIntField(term3503, term3503.getClass(), "year", 2018);
        setShortField(term3503, term3503.getClass(), "month", (short) 7);
        setShortField(term3503, term3503.getClass(), "day", (short) 12);
        setField(term3502, term3502.getClass(), "date", term3503);
        setByteField(term3507, term3507.getClass(), "hour", (byte) 1);
        setByteField(term3507, term3507.getClass(), "minute", (byte) 3);
        setByteField(term3507, term3507.getClass(), "second", (byte) 47);
        setIntField(term3507, term3507.getClass(), "nano", 2729929);
        setField(term3502, term3502.getClass(), "time", term3507);
        setField(term3427, term3427.getClass(), "updatedAt", term3502);
        setField(term3512, term3512.getClass(), "id", term3513);
        setField(term3512, term3512.getClass(), "userId", term3515);
        setField(term3512, term3512.getClass(), "region", enum6);
        setField(term3512, term3512.getClass(), "bucket", "oVgzLbrsFr");
        setField(term3512, term3512.getClass(), "path", "vQVyKLdtaz");
        setField(term3550, term3550.getClass(), "name", "OWKQODBLzb");
        setField(term3550, term3550.getClass(), "size", term3563);
        setField(term3550, term3550.getClass(), "type", "wGmYcqUkgE");
        setField(term3512, term3512.getClass(), "meta", term3550);
        setIntField(term3578, term3578.getClass(), "year", 2015);
        setShortField(term3578, term3578.getClass(), "month", (short) 12);
        setShortField(term3578, term3578.getClass(), "day", (short) 23);
        setField(term3577, term3577.getClass(), "date", term3578);
        setByteField(term3582, term3582.getClass(), "hour", (byte) 14);
        setByteField(term3582, term3582.getClass(), "minute", (byte) 17);
        setByteField(term3582, term3582.getClass(), "second", (byte) 50);
        setIntField(term3582, term3582.getClass(), "nano", 325544804);
        setField(term3577, term3577.getClass(), "time", term3582);
        setField(term3512, term3512.getClass(), "createdAt", term3577);
        setIntField(term3588, term3588.getClass(), "year", 2027);
        setShortField(term3588, term3588.getClass(), "month", (short) 11);
        setShortField(term3588, term3588.getClass(), "day", (short) 8);
        setField(term3587, term3587.getClass(), "date", term3588);
        setByteField(term3592, term3592.getClass(), "hour", (byte) 11);
        setByteField(term3592, term3592.getClass(), "minute", (byte) 59);
        setByteField(term3592, term3592.getClass(), "second", (byte) 14);
        setIntField(term3592, term3592.getClass(), "nano", 322375591);
        setField(term3587, term3587.getClass(), "time", term3592);
        setField(term3512, term3512.getClass(), "updatedAt", term3587);
        setField(term3512, term3512.getClass(), "url", "idgaQsnJpQ");
        setField(term3512, term3512.getClass(), "thumbs", term3609);
        setField(term3427, term3427.getClass(), "avatar", term3512);
        setField(term3617, term3617.getClass(), "id", term3618);
        setField(term3617, term3617.getClass(), "userId", term3620);
        setField(term3617, term3617.getClass(), "postCount", term3622);
        setField(term3617, term3617.getClass(), "likeCount", term3624);
        setField(term3617, term3617.getClass(), "followingCount", term3626);
        setField(term3617, term3617.getClass(), "followerCount", term3628);
        setIntField(term3631, term3631.getClass(), "year", 2020);
        setShortField(term3631, term3631.getClass(), "month", (short) 8);
        setShortField(term3631, term3631.getClass(), "day", (short) 15);
        setField(term3630, term3630.getClass(), "date", term3631);
        setByteField(term3635, term3635.getClass(), "hour", (byte) 2);
        setByteField(term3635, term3635.getClass(), "minute", (byte) 0);
        setByteField(term3635, term3635.getClass(), "second", (byte) 38);
        setIntField(term3635, term3635.getClass(), "nano", 146431486);
        setField(term3630, term3630.getClass(), "time", term3635);
        setField(term3617, term3617.getClass(), "createdAt", term3630);
        setIntField(term3641, term3641.getClass(), "year", 2014);
        setShortField(term3641, term3641.getClass(), "month", (short) 11);
        setShortField(term3641, term3641.getClass(), "day", (short) 8);
        setField(term3640, term3640.getClass(), "date", term3641);
        setByteField(term3645, term3645.getClass(), "hour", (byte) 8);
        setByteField(term3645, term3645.getClass(), "minute", (byte) 43);
        setByteField(term3645, term3645.getClass(), "second", (byte) 32);
        setIntField(term3645, term3645.getClass(), "nano", 154434838);
        setField(term3640, term3640.getClass(), "time", term3645);
        setField(term3617, term3617.getClass(), "updatedAt", term3640);
        setField(term3427, term3427.getClass(), "stat", term3617);
        setField(term3427, term3427.getClass(), "following", term3650);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAvatarId", argTypes, term3427, args);
    }

};


