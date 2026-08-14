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

public class UserDTO_UserDTOBuilder_username_308119182 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29494;

    public UserDTO_UserDTOBuilder_username_308119182() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term29495 = new Long(8699742215739444902L);
        Long term29545 = new Long(8261619652909874476L);
        Long term29580 = new Long(-3692936312179064102L);
        Long term29582 = new Long(5498944509671266637L);
        Class<? extends Object> term29782 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term29781 = ((Class) term29782).getDeclaredField((String) "LOCAL");
        ((Field) term29781).setAccessible(true);
        Object enum58 = ((Field) term29781).get((Object) null);
        Long term29630 = new Long(-6838909359433858599L);
        HashMap term29676 = new HashMap();
        Long term29685 = new Long(4947643967691976731L);
        Long term29687 = new Long(4548576710115075073L);
        Long term29689 = new Long(-1486519351300660432L);
        Long term29691 = new Long(4777103307547199454L);
        Long term29693 = new Long(6462632207326555041L);
        Long term29695 = new Long(-3188913050877092148L);
        Boolean term29717 = new Boolean(true);
        term29494 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserDTO$UserDTOBuilder"));
        Object term29559 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29560 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29564 = newInstance(Class.forName("java.time.LocalTime"));
        Object term29569 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29570 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29574 = newInstance(Class.forName("java.time.LocalTime"));
        Object term29579 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.FileDTO"));
        Object term29617 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        Object term29644 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29645 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29649 = newInstance(Class.forName("java.time.LocalTime"));
        Object term29654 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29655 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29659 = newInstance(Class.forName("java.time.LocalTime"));
        Object term29684 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserStatDTO"));
        Object term29697 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29698 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29702 = newInstance(Class.forName("java.time.LocalTime"));
        Object term29707 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29708 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29712 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term29494, term29494.getClass(), "id", term29495);
        setField(term29494, term29494.getClass(), "username", "jcWKHRWhyj");
        setField(term29494, term29494.getClass(), "password", "nrQjODRMLD");
        setField(term29494, term29494.getClass(), "mobile", "PNoWXrsFic");
        setField(term29494, term29494.getClass(), "email", "QZBHZqZope");
        setField(term29494, term29494.getClass(), "avatarId", term29545);
        setField(term29494, term29494.getClass(), "intro", "VBUahCvyxC");
        setIntField(term29560, term29560.getClass(), "year", 2013);
        setShortField(term29560, term29560.getClass(), "month", (short) 6);
        setShortField(term29560, term29560.getClass(), "day", (short) 29);
        setField(term29559, term29559.getClass(), "date", term29560);
        setByteField(term29564, term29564.getClass(), "hour", (byte) 22);
        setByteField(term29564, term29564.getClass(), "minute", (byte) 31);
        setByteField(term29564, term29564.getClass(), "second", (byte) 28);
        setIntField(term29564, term29564.getClass(), "nano", 930397670);
        setField(term29559, term29559.getClass(), "time", term29564);
        setField(term29494, term29494.getClass(), "createdAt", term29559);
        setIntField(term29570, term29570.getClass(), "year", 2020);
        setShortField(term29570, term29570.getClass(), "month", (short) 5);
        setShortField(term29570, term29570.getClass(), "day", (short) 8);
        setField(term29569, term29569.getClass(), "date", term29570);
        setByteField(term29574, term29574.getClass(), "hour", (byte) 14);
        setByteField(term29574, term29574.getClass(), "minute", (byte) 28);
        setByteField(term29574, term29574.getClass(), "second", (byte) 38);
        setIntField(term29574, term29574.getClass(), "nano", 93855882);
        setField(term29569, term29569.getClass(), "time", term29574);
        setField(term29494, term29494.getClass(), "updatedAt", term29569);
        setField(term29579, term29579.getClass(), "id", term29580);
        setField(term29579, term29579.getClass(), "userId", term29582);
        setField(term29579, term29579.getClass(), "region", enum58);
        setField(term29579, term29579.getClass(), "bucket", "MlzTkzKMCX");
        setField(term29579, term29579.getClass(), "path", "UqKUbMyPMJ");
        setField(term29617, term29617.getClass(), "name", "QpYltHAdyY");
        setField(term29617, term29617.getClass(), "size", term29630);
        setField(term29617, term29617.getClass(), "type", "lbmSGBwIiV");
        setField(term29579, term29579.getClass(), "meta", term29617);
        setIntField(term29645, term29645.getClass(), "year", 2023);
        setShortField(term29645, term29645.getClass(), "month", (short) 4);
        setShortField(term29645, term29645.getClass(), "day", (short) 10);
        setField(term29644, term29644.getClass(), "date", term29645);
        setByteField(term29649, term29649.getClass(), "hour", (byte) 19);
        setByteField(term29649, term29649.getClass(), "minute", (byte) 34);
        setByteField(term29649, term29649.getClass(), "second", (byte) 41);
        setIntField(term29649, term29649.getClass(), "nano", 911888376);
        setField(term29644, term29644.getClass(), "time", term29649);
        setField(term29579, term29579.getClass(), "createdAt", term29644);
        setIntField(term29655, term29655.getClass(), "year", 2014);
        setShortField(term29655, term29655.getClass(), "month", (short) 2);
        setShortField(term29655, term29655.getClass(), "day", (short) 5);
        setField(term29654, term29654.getClass(), "date", term29655);
        setByteField(term29659, term29659.getClass(), "hour", (byte) 14);
        setByteField(term29659, term29659.getClass(), "minute", (byte) 2);
        setByteField(term29659, term29659.getClass(), "second", (byte) 4);
        setIntField(term29659, term29659.getClass(), "nano", 458277660);
        setField(term29654, term29654.getClass(), "time", term29659);
        setField(term29579, term29579.getClass(), "updatedAt", term29654);
        setField(term29579, term29579.getClass(), "url", "DAxyHoTLzZ");
        setField(term29579, term29579.getClass(), "thumbs", term29676);
        setField(term29494, term29494.getClass(), "avatar", term29579);
        setField(term29684, term29684.getClass(), "id", term29685);
        setField(term29684, term29684.getClass(), "userId", term29687);
        setField(term29684, term29684.getClass(), "postCount", term29689);
        setField(term29684, term29684.getClass(), "likeCount", term29691);
        setField(term29684, term29684.getClass(), "followingCount", term29693);
        setField(term29684, term29684.getClass(), "followerCount", term29695);
        setIntField(term29698, term29698.getClass(), "year", 2019);
        setShortField(term29698, term29698.getClass(), "month", (short) 3);
        setShortField(term29698, term29698.getClass(), "day", (short) 23);
        setField(term29697, term29697.getClass(), "date", term29698);
        setByteField(term29702, term29702.getClass(), "hour", (byte) 13);
        setByteField(term29702, term29702.getClass(), "minute", (byte) 19);
        setByteField(term29702, term29702.getClass(), "second", (byte) 44);
        setIntField(term29702, term29702.getClass(), "nano", 912714703);
        setField(term29697, term29697.getClass(), "time", term29702);
        setField(term29684, term29684.getClass(), "createdAt", term29697);
        setIntField(term29708, term29708.getClass(), "year", 2027);
        setShortField(term29708, term29708.getClass(), "month", (short) 3);
        setShortField(term29708, term29708.getClass(), "day", (short) 4);
        setField(term29707, term29707.getClass(), "date", term29708);
        setByteField(term29712, term29712.getClass(), "hour", (byte) 2);
        setByteField(term29712, term29712.getClass(), "minute", (byte) 3);
        setByteField(term29712, term29712.getClass(), "second", (byte) 31);
        setIntField(term29712, term29712.getClass(), "nano", 652064220);
        setField(term29707, term29707.getClass(), "time", term29712);
        setField(term29684, term29684.getClass(), "updatedAt", term29707);
        setField(term29494, term29494.getClass(), "stat", term29684);
        setField(term29494, term29494.getClass(), "following", term29717);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserDTO$UserDTOBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "wrikqJwXvL";
        callMethod(klass, "username", argTypes, term29494, args);
    }

};


