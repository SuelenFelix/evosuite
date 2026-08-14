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

public class UserDTO_setIntro_156355243321 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10630;

    public UserDTO_setIntro_156355243321() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term10631 = new Long(2145420811068634601L);
        Long term10681 = new Long(2191130532479601175L);
        Long term10716 = new Long(860079646007397083L);
        Long term10718 = new Long(3230472384687362867L);
        Class<? extends Object> term10918 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term10917 = ((Class) term10918).getDeclaredField((String) "LOCAL");
        ((Field) term10917).setAccessible(true);
        Object enum19 = ((Field) term10917).get((Object) null);
        Long term10766 = new Long(-1145146470850585022L);
        HashMap term10812 = new HashMap();
        Long term10821 = new Long(1993646237353405740L);
        Long term10823 = new Long(-4043093655001688454L);
        Long term10825 = new Long(-419800263764810394L);
        Long term10827 = new Long(5904678961906211249L);
        Long term10829 = new Long(-1820639665251914495L);
        Long term10831 = new Long(3238645206498300107L);
        Boolean term10853 = new Boolean(false);
        term10630 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserDTO"));
        Object term10695 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10696 = newInstance(Class.forName("java.time.LocalDate"));
        Object term10700 = newInstance(Class.forName("java.time.LocalTime"));
        Object term10705 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10706 = newInstance(Class.forName("java.time.LocalDate"));
        Object term10710 = newInstance(Class.forName("java.time.LocalTime"));
        Object term10715 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.FileDTO"));
        Object term10753 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        Object term10780 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10781 = newInstance(Class.forName("java.time.LocalDate"));
        Object term10785 = newInstance(Class.forName("java.time.LocalTime"));
        Object term10790 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10791 = newInstance(Class.forName("java.time.LocalDate"));
        Object term10795 = newInstance(Class.forName("java.time.LocalTime"));
        Object term10820 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserStatDTO"));
        Object term10833 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10834 = newInstance(Class.forName("java.time.LocalDate"));
        Object term10838 = newInstance(Class.forName("java.time.LocalTime"));
        Object term10843 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10844 = newInstance(Class.forName("java.time.LocalDate"));
        Object term10848 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term10630, term10630.getClass(), "id", term10631);
        setField(term10630, term10630.getClass(), "username", "CFyoseFGLF");
        setField(term10630, term10630.getClass(), "password", "SFqCrhEWLm");
        setField(term10630, term10630.getClass(), "mobile", "GZdcJyZntS");
        setField(term10630, term10630.getClass(), "email", "OIHoJeysUi");
        setField(term10630, term10630.getClass(), "avatarId", term10681);
        setField(term10630, term10630.getClass(), "intro", "WXMWFDGcLB");
        setIntField(term10696, term10696.getClass(), "year", 2022);
        setShortField(term10696, term10696.getClass(), "month", (short) 11);
        setShortField(term10696, term10696.getClass(), "day", (short) 5);
        setField(term10695, term10695.getClass(), "date", term10696);
        setByteField(term10700, term10700.getClass(), "hour", (byte) 0);
        setByteField(term10700, term10700.getClass(), "minute", (byte) 51);
        setByteField(term10700, term10700.getClass(), "second", (byte) 23);
        setIntField(term10700, term10700.getClass(), "nano", 1140962);
        setField(term10695, term10695.getClass(), "time", term10700);
        setField(term10630, term10630.getClass(), "createdAt", term10695);
        setIntField(term10706, term10706.getClass(), "year", 2020);
        setShortField(term10706, term10706.getClass(), "month", (short) 5);
        setShortField(term10706, term10706.getClass(), "day", (short) 24);
        setField(term10705, term10705.getClass(), "date", term10706);
        setByteField(term10710, term10710.getClass(), "hour", (byte) 2);
        setByteField(term10710, term10710.getClass(), "minute", (byte) 9);
        setByteField(term10710, term10710.getClass(), "second", (byte) 52);
        setIntField(term10710, term10710.getClass(), "nano", 653329393);
        setField(term10705, term10705.getClass(), "time", term10710);
        setField(term10630, term10630.getClass(), "updatedAt", term10705);
        setField(term10715, term10715.getClass(), "id", term10716);
        setField(term10715, term10715.getClass(), "userId", term10718);
        setField(term10715, term10715.getClass(), "region", enum19);
        setField(term10715, term10715.getClass(), "bucket", "wKWbJssZuG");
        setField(term10715, term10715.getClass(), "path", "NzBMMhkhpT");
        setField(term10753, term10753.getClass(), "name", "qCpEbQDHdF");
        setField(term10753, term10753.getClass(), "size", term10766);
        setField(term10753, term10753.getClass(), "type", "AHbZyFOmlo");
        setField(term10715, term10715.getClass(), "meta", term10753);
        setIntField(term10781, term10781.getClass(), "year", 2024);
        setShortField(term10781, term10781.getClass(), "month", (short) 9);
        setShortField(term10781, term10781.getClass(), "day", (short) 22);
        setField(term10780, term10780.getClass(), "date", term10781);
        setByteField(term10785, term10785.getClass(), "hour", (byte) 0);
        setByteField(term10785, term10785.getClass(), "minute", (byte) 11);
        setByteField(term10785, term10785.getClass(), "second", (byte) 7);
        setIntField(term10785, term10785.getClass(), "nano", 56643259);
        setField(term10780, term10780.getClass(), "time", term10785);
        setField(term10715, term10715.getClass(), "createdAt", term10780);
        setIntField(term10791, term10791.getClass(), "year", 2021);
        setShortField(term10791, term10791.getClass(), "month", (short) 12);
        setShortField(term10791, term10791.getClass(), "day", (short) 21);
        setField(term10790, term10790.getClass(), "date", term10791);
        setByteField(term10795, term10795.getClass(), "hour", (byte) 12);
        setByteField(term10795, term10795.getClass(), "minute", (byte) 59);
        setByteField(term10795, term10795.getClass(), "second", (byte) 52);
        setIntField(term10795, term10795.getClass(), "nano", 47081639);
        setField(term10790, term10790.getClass(), "time", term10795);
        setField(term10715, term10715.getClass(), "updatedAt", term10790);
        setField(term10715, term10715.getClass(), "url", "TwfWVQGiIj");
        setField(term10715, term10715.getClass(), "thumbs", term10812);
        setField(term10630, term10630.getClass(), "avatar", term10715);
        setField(term10820, term10820.getClass(), "id", term10821);
        setField(term10820, term10820.getClass(), "userId", term10823);
        setField(term10820, term10820.getClass(), "postCount", term10825);
        setField(term10820, term10820.getClass(), "likeCount", term10827);
        setField(term10820, term10820.getClass(), "followingCount", term10829);
        setField(term10820, term10820.getClass(), "followerCount", term10831);
        setIntField(term10834, term10834.getClass(), "year", 2026);
        setShortField(term10834, term10834.getClass(), "month", (short) 6);
        setShortField(term10834, term10834.getClass(), "day", (short) 13);
        setField(term10833, term10833.getClass(), "date", term10834);
        setByteField(term10838, term10838.getClass(), "hour", (byte) 19);
        setByteField(term10838, term10838.getClass(), "minute", (byte) 23);
        setByteField(term10838, term10838.getClass(), "second", (byte) 46);
        setIntField(term10838, term10838.getClass(), "nano", 67955056);
        setField(term10833, term10833.getClass(), "time", term10838);
        setField(term10820, term10820.getClass(), "createdAt", term10833);
        setIntField(term10844, term10844.getClass(), "year", 2013);
        setShortField(term10844, term10844.getClass(), "month", (short) 12);
        setShortField(term10844, term10844.getClass(), "day", (short) 23);
        setField(term10843, term10843.getClass(), "date", term10844);
        setByteField(term10848, term10848.getClass(), "hour", (byte) 1);
        setByteField(term10848, term10848.getClass(), "minute", (byte) 0);
        setByteField(term10848, term10848.getClass(), "second", (byte) 32);
        setIntField(term10848, term10848.getClass(), "nano", 168525686);
        setField(term10843, term10843.getClass(), "time", term10848);
        setField(term10820, term10820.getClass(), "updatedAt", term10843);
        setField(term10630, term10630.getClass(), "stat", term10820);
        setField(term10630, term10630.getClass(), "following", term10853);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "EwQBhZjCIT";
        callMethod(klass, "setIntro", argTypes, term10630, args);
    }

};


