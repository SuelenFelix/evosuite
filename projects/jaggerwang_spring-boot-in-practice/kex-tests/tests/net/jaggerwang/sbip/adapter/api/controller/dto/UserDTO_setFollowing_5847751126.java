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

public class UserDTO_setFollowing_5847751126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13589;
     Object term13814;

    public UserDTO_setFollowing_5847751126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term13590 = new Long(3713624957161771816L);
        Long term13640 = new Long(6130232388739280211L);
        Long term13675 = new Long(3423965054378869855L);
        Long term13677 = new Long(-593735869267672817L);
        Class<? extends Object> term13867 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term13866 = ((Class) term13867).getDeclaredField((String) "LOCAL");
        ((Field) term13866).setAccessible(true);
        Object enum24 = ((Field) term13866).get((Object) null);
        Long term13725 = new Long(6041374912351843923L);
        HashMap term13771 = new HashMap();
        Long term13780 = new Long(2535970782317488741L);
        Long term13782 = new Long(-5258945362776941718L);
        Long term13784 = new Long(24067105862153728L);
        Long term13786 = new Long(-8477368071089201577L);
        Long term13788 = new Long(-1526729287349763895L);
        Long term13790 = new Long(7017605765544766728L);
        Boolean term13812 = new Boolean(true);
        term13589 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserDTO"));
        Object term13654 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term13655 = newInstance(Class.forName("java.time.LocalDate"));
        Object term13659 = newInstance(Class.forName("java.time.LocalTime"));
        Object term13664 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term13665 = newInstance(Class.forName("java.time.LocalDate"));
        Object term13669 = newInstance(Class.forName("java.time.LocalTime"));
        Object term13674 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.FileDTO"));
        Object term13712 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        Object term13739 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term13740 = newInstance(Class.forName("java.time.LocalDate"));
        Object term13744 = newInstance(Class.forName("java.time.LocalTime"));
        Object term13749 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term13750 = newInstance(Class.forName("java.time.LocalDate"));
        Object term13754 = newInstance(Class.forName("java.time.LocalTime"));
        Object term13779 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserStatDTO"));
        Object term13792 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term13793 = newInstance(Class.forName("java.time.LocalDate"));
        Object term13797 = newInstance(Class.forName("java.time.LocalTime"));
        Object term13802 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term13803 = newInstance(Class.forName("java.time.LocalDate"));
        Object term13807 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term13589, term13589.getClass(), "id", term13590);
        setField(term13589, term13589.getClass(), "username", "NBrvVzvQHe");
        setField(term13589, term13589.getClass(), "password", "FjOiNAfBOc");
        setField(term13589, term13589.getClass(), "mobile", "iCCsaLHohG");
        setField(term13589, term13589.getClass(), "email", "NJhGgctbdj");
        setField(term13589, term13589.getClass(), "avatarId", term13640);
        setField(term13589, term13589.getClass(), "intro", "MYWYUeLGOp");
        setIntField(term13655, term13655.getClass(), "year", 2026);
        setShortField(term13655, term13655.getClass(), "month", (short) 9);
        setShortField(term13655, term13655.getClass(), "day", (short) 18);
        setField(term13654, term13654.getClass(), "date", term13655);
        setByteField(term13659, term13659.getClass(), "hour", (byte) 14);
        setByteField(term13659, term13659.getClass(), "minute", (byte) 51);
        setByteField(term13659, term13659.getClass(), "second", (byte) 41);
        setIntField(term13659, term13659.getClass(), "nano", 830322169);
        setField(term13654, term13654.getClass(), "time", term13659);
        setField(term13589, term13589.getClass(), "createdAt", term13654);
        setIntField(term13665, term13665.getClass(), "year", 2024);
        setShortField(term13665, term13665.getClass(), "month", (short) 3);
        setShortField(term13665, term13665.getClass(), "day", (short) 17);
        setField(term13664, term13664.getClass(), "date", term13665);
        setByteField(term13669, term13669.getClass(), "hour", (byte) 5);
        setByteField(term13669, term13669.getClass(), "minute", (byte) 21);
        setByteField(term13669, term13669.getClass(), "second", (byte) 47);
        setIntField(term13669, term13669.getClass(), "nano", 798433252);
        setField(term13664, term13664.getClass(), "time", term13669);
        setField(term13589, term13589.getClass(), "updatedAt", term13664);
        setField(term13674, term13674.getClass(), "id", term13675);
        setField(term13674, term13674.getClass(), "userId", term13677);
        setField(term13674, term13674.getClass(), "region", enum24);
        setField(term13674, term13674.getClass(), "bucket", "tsTGdgQYUL");
        setField(term13674, term13674.getClass(), "path", "TtGbVmKcnX");
        setField(term13712, term13712.getClass(), "name", "GJVkUrCVdD");
        setField(term13712, term13712.getClass(), "size", term13725);
        setField(term13712, term13712.getClass(), "type", "zNdorvdUgu");
        setField(term13674, term13674.getClass(), "meta", term13712);
        setIntField(term13740, term13740.getClass(), "year", 2023);
        setShortField(term13740, term13740.getClass(), "month", (short) 7);
        setShortField(term13740, term13740.getClass(), "day", (short) 27);
        setField(term13739, term13739.getClass(), "date", term13740);
        setByteField(term13744, term13744.getClass(), "hour", (byte) 4);
        setByteField(term13744, term13744.getClass(), "minute", (byte) 25);
        setByteField(term13744, term13744.getClass(), "second", (byte) 46);
        setIntField(term13744, term13744.getClass(), "nano", 646465452);
        setField(term13739, term13739.getClass(), "time", term13744);
        setField(term13674, term13674.getClass(), "createdAt", term13739);
        setIntField(term13750, term13750.getClass(), "year", 2022);
        setShortField(term13750, term13750.getClass(), "month", (short) 11);
        setShortField(term13750, term13750.getClass(), "day", (short) 2);
        setField(term13749, term13749.getClass(), "date", term13750);
        setByteField(term13754, term13754.getClass(), "hour", (byte) 4);
        setByteField(term13754, term13754.getClass(), "minute", (byte) 14);
        setByteField(term13754, term13754.getClass(), "second", (byte) 5);
        setIntField(term13754, term13754.getClass(), "nano", 604465127);
        setField(term13749, term13749.getClass(), "time", term13754);
        setField(term13674, term13674.getClass(), "updatedAt", term13749);
        setField(term13674, term13674.getClass(), "url", "oPxuZbkYio");
        setField(term13674, term13674.getClass(), "thumbs", term13771);
        setField(term13589, term13589.getClass(), "avatar", term13674);
        setField(term13779, term13779.getClass(), "id", term13780);
        setField(term13779, term13779.getClass(), "userId", term13782);
        setField(term13779, term13779.getClass(), "postCount", term13784);
        setField(term13779, term13779.getClass(), "likeCount", term13786);
        setField(term13779, term13779.getClass(), "followingCount", term13788);
        setField(term13779, term13779.getClass(), "followerCount", term13790);
        setIntField(term13793, term13793.getClass(), "year", 2020);
        setShortField(term13793, term13793.getClass(), "month", (short) 5);
        setShortField(term13793, term13793.getClass(), "day", (short) 12);
        setField(term13792, term13792.getClass(), "date", term13793);
        setByteField(term13797, term13797.getClass(), "hour", (byte) 22);
        setByteField(term13797, term13797.getClass(), "minute", (byte) 7);
        setByteField(term13797, term13797.getClass(), "second", (byte) 49);
        setIntField(term13797, term13797.getClass(), "nano", 677355362);
        setField(term13792, term13792.getClass(), "time", term13797);
        setField(term13779, term13779.getClass(), "createdAt", term13792);
        setIntField(term13803, term13803.getClass(), "year", 2010);
        setShortField(term13803, term13803.getClass(), "month", (short) 11);
        setShortField(term13803, term13803.getClass(), "day", (short) 1);
        setField(term13802, term13802.getClass(), "date", term13803);
        setByteField(term13807, term13807.getClass(), "hour", (byte) 5);
        setByteField(term13807, term13807.getClass(), "minute", (byte) 32);
        setByteField(term13807, term13807.getClass(), "second", (byte) 8);
        setIntField(term13807, term13807.getClass(), "nano", 918832231);
        setField(term13802, term13802.getClass(), "time", term13807);
        setField(term13779, term13779.getClass(), "updatedAt", term13802);
        setField(term13589, term13589.getClass(), "stat", term13779);
        setField(term13589, term13589.getClass(), "following", term13812);
        term13814 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[1];
        args[0] = term13814;
        callMethod(klass, "setFollowing", argTypes, term13589, args);
    }

};


