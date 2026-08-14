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

public class UserDTO_getCreatedAt_171019822010 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4521;

    public UserDTO_getCreatedAt_171019822010() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4522 = new Long(6689117472719450333L);
        Long term4572 = new Long(5836128569274066678L);
        Long term4607 = new Long(-2177368829816872572L);
        Long term4609 = new Long(-8463029266761149071L);
        Class<? extends Object> term4797 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term4796 = ((Class) term4797).getDeclaredField((String) "LOCAL");
        ((Field) term4796).setAccessible(true);
        Object enum8 = ((Field) term4796).get((Object) null);
        Long term4657 = new Long(3133860696238261492L);
        HashMap term4703 = new HashMap();
        Long term4712 = new Long(7247160664318067468L);
        Long term4714 = new Long(2135754395358000892L);
        Long term4716 = new Long(-8085190702504231560L);
        Long term4718 = new Long(1672578078364590450L);
        Long term4720 = new Long(4949335493504695457L);
        Long term4722 = new Long(-5216789073301458893L);
        Boolean term4744 = new Boolean(false);
        term4521 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserDTO"));
        Object term4586 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4587 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4591 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4596 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4597 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4601 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4606 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.FileDTO"));
        Object term4644 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        Object term4671 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4672 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4676 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4681 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4682 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4686 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4711 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserStatDTO"));
        Object term4724 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4725 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4729 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4734 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4735 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4739 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term4521, term4521.getClass(), "id", term4522);
        setField(term4521, term4521.getClass(), "username", "JqXGgAhZPl");
        setField(term4521, term4521.getClass(), "password", "jiKYgYHqIS");
        setField(term4521, term4521.getClass(), "mobile", "DfISiziTgG");
        setField(term4521, term4521.getClass(), "email", "XqgfKFvPSD");
        setField(term4521, term4521.getClass(), "avatarId", term4572);
        setField(term4521, term4521.getClass(), "intro", "JiVRgTZvKc");
        setIntField(term4587, term4587.getClass(), "year", 2024);
        setShortField(term4587, term4587.getClass(), "month", (short) 5);
        setShortField(term4587, term4587.getClass(), "day", (short) 6);
        setField(term4586, term4586.getClass(), "date", term4587);
        setByteField(term4591, term4591.getClass(), "hour", (byte) 20);
        setByteField(term4591, term4591.getClass(), "minute", (byte) 14);
        setByteField(term4591, term4591.getClass(), "second", (byte) 27);
        setIntField(term4591, term4591.getClass(), "nano", 900636101);
        setField(term4586, term4586.getClass(), "time", term4591);
        setField(term4521, term4521.getClass(), "createdAt", term4586);
        setIntField(term4597, term4597.getClass(), "year", 2021);
        setShortField(term4597, term4597.getClass(), "month", (short) 4);
        setShortField(term4597, term4597.getClass(), "day", (short) 17);
        setField(term4596, term4596.getClass(), "date", term4597);
        setByteField(term4601, term4601.getClass(), "hour", (byte) 4);
        setByteField(term4601, term4601.getClass(), "minute", (byte) 11);
        setByteField(term4601, term4601.getClass(), "second", (byte) 16);
        setIntField(term4601, term4601.getClass(), "nano", 509895858);
        setField(term4596, term4596.getClass(), "time", term4601);
        setField(term4521, term4521.getClass(), "updatedAt", term4596);
        setField(term4606, term4606.getClass(), "id", term4607);
        setField(term4606, term4606.getClass(), "userId", term4609);
        setField(term4606, term4606.getClass(), "region", enum8);
        setField(term4606, term4606.getClass(), "bucket", "XPKmummaqg");
        setField(term4606, term4606.getClass(), "path", "BKLfkLiZTH");
        setField(term4644, term4644.getClass(), "name", "SPpkrGcPRr");
        setField(term4644, term4644.getClass(), "size", term4657);
        setField(term4644, term4644.getClass(), "type", "sEccwbJKYE");
        setField(term4606, term4606.getClass(), "meta", term4644);
        setIntField(term4672, term4672.getClass(), "year", 2011);
        setShortField(term4672, term4672.getClass(), "month", (short) 6);
        setShortField(term4672, term4672.getClass(), "day", (short) 26);
        setField(term4671, term4671.getClass(), "date", term4672);
        setByteField(term4676, term4676.getClass(), "hour", (byte) 22);
        setByteField(term4676, term4676.getClass(), "minute", (byte) 39);
        setByteField(term4676, term4676.getClass(), "second", (byte) 11);
        setIntField(term4676, term4676.getClass(), "nano", 686293604);
        setField(term4671, term4671.getClass(), "time", term4676);
        setField(term4606, term4606.getClass(), "createdAt", term4671);
        setIntField(term4682, term4682.getClass(), "year", 2012);
        setShortField(term4682, term4682.getClass(), "month", (short) 7);
        setShortField(term4682, term4682.getClass(), "day", (short) 21);
        setField(term4681, term4681.getClass(), "date", term4682);
        setByteField(term4686, term4686.getClass(), "hour", (byte) 13);
        setByteField(term4686, term4686.getClass(), "minute", (byte) 41);
        setByteField(term4686, term4686.getClass(), "second", (byte) 44);
        setIntField(term4686, term4686.getClass(), "nano", 394467282);
        setField(term4681, term4681.getClass(), "time", term4686);
        setField(term4606, term4606.getClass(), "updatedAt", term4681);
        setField(term4606, term4606.getClass(), "url", "AWRooQKkdW");
        setField(term4606, term4606.getClass(), "thumbs", term4703);
        setField(term4521, term4521.getClass(), "avatar", term4606);
        setField(term4711, term4711.getClass(), "id", term4712);
        setField(term4711, term4711.getClass(), "userId", term4714);
        setField(term4711, term4711.getClass(), "postCount", term4716);
        setField(term4711, term4711.getClass(), "likeCount", term4718);
        setField(term4711, term4711.getClass(), "followingCount", term4720);
        setField(term4711, term4711.getClass(), "followerCount", term4722);
        setIntField(term4725, term4725.getClass(), "year", 2025);
        setShortField(term4725, term4725.getClass(), "month", (short) 9);
        setShortField(term4725, term4725.getClass(), "day", (short) 25);
        setField(term4724, term4724.getClass(), "date", term4725);
        setByteField(term4729, term4729.getClass(), "hour", (byte) 20);
        setByteField(term4729, term4729.getClass(), "minute", (byte) 0);
        setByteField(term4729, term4729.getClass(), "second", (byte) 25);
        setIntField(term4729, term4729.getClass(), "nano", 65871584);
        setField(term4724, term4724.getClass(), "time", term4729);
        setField(term4711, term4711.getClass(), "createdAt", term4724);
        setIntField(term4735, term4735.getClass(), "year", 2011);
        setShortField(term4735, term4735.getClass(), "month", (short) 9);
        setShortField(term4735, term4735.getClass(), "day", (short) 25);
        setField(term4734, term4734.getClass(), "date", term4735);
        setByteField(term4739, term4739.getClass(), "hour", (byte) 16);
        setByteField(term4739, term4739.getClass(), "minute", (byte) 45);
        setByteField(term4739, term4739.getClass(), "second", (byte) 19);
        setIntField(term4739, term4739.getClass(), "nano", 962864785);
        setField(term4734, term4734.getClass(), "time", term4739);
        setField(term4711, term4711.getClass(), "updatedAt", term4734);
        setField(term4521, term4521.getClass(), "stat", term4711);
        setField(term4521, term4521.getClass(), "following", term4744);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCreatedAt", argTypes, term4521, args);
    }

};


