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

public class UserDTO_UserDTOBuilder_mobile_12441430384 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30632;

    public UserDTO_UserDTOBuilder_mobile_12441430384() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term30633 = new Long(3660520943100987842L);
        Long term30683 = new Long(-8211240904293846981L);
        Long term30718 = new Long(3535528164828723056L);
        Long term30720 = new Long(4036794646678680547L);
        Class<? extends Object> term30920 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term30919 = ((Class) term30920).getDeclaredField((String) "LOCAL");
        ((Field) term30919).setAccessible(true);
        Object enum60 = ((Field) term30919).get((Object) null);
        Long term30768 = new Long(4006388896509492239L);
        HashMap term30814 = new HashMap();
        Long term30823 = new Long(-6314099457945626605L);
        Long term30825 = new Long(-8697239524885136781L);
        Long term30827 = new Long(6465539339431559532L);
        Long term30829 = new Long(-5304831679802174866L);
        Long term30831 = new Long(1909175111101717943L);
        Long term30833 = new Long(8499930868919012909L);
        Boolean term30855 = new Boolean(false);
        term30632 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserDTO$UserDTOBuilder"));
        Object term30697 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term30698 = newInstance(Class.forName("java.time.LocalDate"));
        Object term30702 = newInstance(Class.forName("java.time.LocalTime"));
        Object term30707 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term30708 = newInstance(Class.forName("java.time.LocalDate"));
        Object term30712 = newInstance(Class.forName("java.time.LocalTime"));
        Object term30717 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.FileDTO"));
        Object term30755 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        Object term30782 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term30783 = newInstance(Class.forName("java.time.LocalDate"));
        Object term30787 = newInstance(Class.forName("java.time.LocalTime"));
        Object term30792 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term30793 = newInstance(Class.forName("java.time.LocalDate"));
        Object term30797 = newInstance(Class.forName("java.time.LocalTime"));
        Object term30822 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserStatDTO"));
        Object term30835 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term30836 = newInstance(Class.forName("java.time.LocalDate"));
        Object term30840 = newInstance(Class.forName("java.time.LocalTime"));
        Object term30845 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term30846 = newInstance(Class.forName("java.time.LocalDate"));
        Object term30850 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term30632, term30632.getClass(), "id", term30633);
        setField(term30632, term30632.getClass(), "username", "XMHwbfiHRl");
        setField(term30632, term30632.getClass(), "password", "bucTnYicnp");
        setField(term30632, term30632.getClass(), "mobile", "EkgprvqZlM");
        setField(term30632, term30632.getClass(), "email", "fbnKvthhOz");
        setField(term30632, term30632.getClass(), "avatarId", term30683);
        setField(term30632, term30632.getClass(), "intro", "PGfCDJTBek");
        setIntField(term30698, term30698.getClass(), "year", 2026);
        setShortField(term30698, term30698.getClass(), "month", (short) 7);
        setShortField(term30698, term30698.getClass(), "day", (short) 18);
        setField(term30697, term30697.getClass(), "date", term30698);
        setByteField(term30702, term30702.getClass(), "hour", (byte) 14);
        setByteField(term30702, term30702.getClass(), "minute", (byte) 29);
        setByteField(term30702, term30702.getClass(), "second", (byte) 53);
        setIntField(term30702, term30702.getClass(), "nano", 285756900);
        setField(term30697, term30697.getClass(), "time", term30702);
        setField(term30632, term30632.getClass(), "createdAt", term30697);
        setIntField(term30708, term30708.getClass(), "year", 2012);
        setShortField(term30708, term30708.getClass(), "month", (short) 2);
        setShortField(term30708, term30708.getClass(), "day", (short) 2);
        setField(term30707, term30707.getClass(), "date", term30708);
        setByteField(term30712, term30712.getClass(), "hour", (byte) 4);
        setByteField(term30712, term30712.getClass(), "minute", (byte) 19);
        setByteField(term30712, term30712.getClass(), "second", (byte) 58);
        setIntField(term30712, term30712.getClass(), "nano", 550709112);
        setField(term30707, term30707.getClass(), "time", term30712);
        setField(term30632, term30632.getClass(), "updatedAt", term30707);
        setField(term30717, term30717.getClass(), "id", term30718);
        setField(term30717, term30717.getClass(), "userId", term30720);
        setField(term30717, term30717.getClass(), "region", enum60);
        setField(term30717, term30717.getClass(), "bucket", "ZwjARhAtHC");
        setField(term30717, term30717.getClass(), "path", "XXvscsYBWv");
        setField(term30755, term30755.getClass(), "name", "uePedtiAfL");
        setField(term30755, term30755.getClass(), "size", term30768);
        setField(term30755, term30755.getClass(), "type", "AdSHvysxQB");
        setField(term30717, term30717.getClass(), "meta", term30755);
        setIntField(term30783, term30783.getClass(), "year", 2028);
        setShortField(term30783, term30783.getClass(), "month", (short) 7);
        setShortField(term30783, term30783.getClass(), "day", (short) 4);
        setField(term30782, term30782.getClass(), "date", term30783);
        setByteField(term30787, term30787.getClass(), "hour", (byte) 13);
        setByteField(term30787, term30787.getClass(), "minute", (byte) 43);
        setByteField(term30787, term30787.getClass(), "second", (byte) 17);
        setIntField(term30787, term30787.getClass(), "nano", 949713407);
        setField(term30782, term30782.getClass(), "time", term30787);
        setField(term30717, term30717.getClass(), "createdAt", term30782);
        setIntField(term30793, term30793.getClass(), "year", 2013);
        setShortField(term30793, term30793.getClass(), "month", (short) 3);
        setShortField(term30793, term30793.getClass(), "day", (short) 25);
        setField(term30792, term30792.getClass(), "date", term30793);
        setByteField(term30797, term30797.getClass(), "hour", (byte) 16);
        setByteField(term30797, term30797.getClass(), "minute", (byte) 28);
        setByteField(term30797, term30797.getClass(), "second", (byte) 0);
        setIntField(term30797, term30797.getClass(), "nano", 265797826);
        setField(term30792, term30792.getClass(), "time", term30797);
        setField(term30717, term30717.getClass(), "updatedAt", term30792);
        setField(term30717, term30717.getClass(), "url", "jlraKkBWFA");
        setField(term30717, term30717.getClass(), "thumbs", term30814);
        setField(term30632, term30632.getClass(), "avatar", term30717);
        setField(term30822, term30822.getClass(), "id", term30823);
        setField(term30822, term30822.getClass(), "userId", term30825);
        setField(term30822, term30822.getClass(), "postCount", term30827);
        setField(term30822, term30822.getClass(), "likeCount", term30829);
        setField(term30822, term30822.getClass(), "followingCount", term30831);
        setField(term30822, term30822.getClass(), "followerCount", term30833);
        setIntField(term30836, term30836.getClass(), "year", 2013);
        setShortField(term30836, term30836.getClass(), "month", (short) 9);
        setShortField(term30836, term30836.getClass(), "day", (short) 12);
        setField(term30835, term30835.getClass(), "date", term30836);
        setByteField(term30840, term30840.getClass(), "hour", (byte) 14);
        setByteField(term30840, term30840.getClass(), "minute", (byte) 21);
        setByteField(term30840, term30840.getClass(), "second", (byte) 35);
        setIntField(term30840, term30840.getClass(), "nano", 520302725);
        setField(term30835, term30835.getClass(), "time", term30840);
        setField(term30822, term30822.getClass(), "createdAt", term30835);
        setIntField(term30846, term30846.getClass(), "year", 2016);
        setShortField(term30846, term30846.getClass(), "month", (short) 2);
        setShortField(term30846, term30846.getClass(), "day", (short) 15);
        setField(term30845, term30845.getClass(), "date", term30846);
        setByteField(term30850, term30850.getClass(), "hour", (byte) 7);
        setByteField(term30850, term30850.getClass(), "minute", (byte) 36);
        setByteField(term30850, term30850.getClass(), "second", (byte) 21);
        setIntField(term30850, term30850.getClass(), "nano", 74269011);
        setField(term30845, term30845.getClass(), "time", term30850);
        setField(term30822, term30822.getClass(), "updatedAt", term30845);
        setField(term30632, term30632.getClass(), "stat", term30822);
        setField(term30632, term30632.getClass(), "following", term30855);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserDTO$UserDTOBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "IVacFDAZcj";
        callMethod(klass, "mobile", argTypes, term30632, args);
    }

};


