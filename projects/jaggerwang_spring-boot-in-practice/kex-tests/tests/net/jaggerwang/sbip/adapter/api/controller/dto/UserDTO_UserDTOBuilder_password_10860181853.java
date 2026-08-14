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

public class UserDTO_UserDTOBuilder_password_10860181853 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30063;

    public UserDTO_UserDTOBuilder_password_10860181853() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term30064 = new Long(-6759247883224780481L);
        Long term30114 = new Long(-3724162247917461536L);
        Long term30149 = new Long(7893661350133453338L);
        Long term30151 = new Long(9056245012917372169L);
        Class<? extends Object> term30351 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term30350 = ((Class) term30351).getDeclaredField((String) "LOCAL");
        ((Field) term30350).setAccessible(true);
        Object enum59 = ((Field) term30350).get((Object) null);
        Long term30199 = new Long(7848004402682338886L);
        HashMap term30245 = new HashMap();
        Long term30254 = new Long(8931772176819893873L);
        Long term30256 = new Long(-4370635295110591519L);
        Long term30258 = new Long(-1325109462577461208L);
        Long term30260 = new Long(-7181112149072926893L);
        Long term30262 = new Long(-5850316381591949820L);
        Long term30264 = new Long(5857854340777182167L);
        Boolean term30286 = new Boolean(true);
        term30063 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserDTO$UserDTOBuilder"));
        Object term30128 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term30129 = newInstance(Class.forName("java.time.LocalDate"));
        Object term30133 = newInstance(Class.forName("java.time.LocalTime"));
        Object term30138 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term30139 = newInstance(Class.forName("java.time.LocalDate"));
        Object term30143 = newInstance(Class.forName("java.time.LocalTime"));
        Object term30148 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.FileDTO"));
        Object term30186 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        Object term30213 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term30214 = newInstance(Class.forName("java.time.LocalDate"));
        Object term30218 = newInstance(Class.forName("java.time.LocalTime"));
        Object term30223 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term30224 = newInstance(Class.forName("java.time.LocalDate"));
        Object term30228 = newInstance(Class.forName("java.time.LocalTime"));
        Object term30253 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserStatDTO"));
        Object term30266 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term30267 = newInstance(Class.forName("java.time.LocalDate"));
        Object term30271 = newInstance(Class.forName("java.time.LocalTime"));
        Object term30276 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term30277 = newInstance(Class.forName("java.time.LocalDate"));
        Object term30281 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term30063, term30063.getClass(), "id", term30064);
        setField(term30063, term30063.getClass(), "username", "UiWhvbypdr");
        setField(term30063, term30063.getClass(), "password", "CgleElJNje");
        setField(term30063, term30063.getClass(), "mobile", "ZrchvNGMtd");
        setField(term30063, term30063.getClass(), "email", "WaEcyVlcIx");
        setField(term30063, term30063.getClass(), "avatarId", term30114);
        setField(term30063, term30063.getClass(), "intro", "ONcbPCQnHd");
        setIntField(term30129, term30129.getClass(), "year", 2023);
        setShortField(term30129, term30129.getClass(), "month", (short) 12);
        setShortField(term30129, term30129.getClass(), "day", (short) 3);
        setField(term30128, term30128.getClass(), "date", term30129);
        setByteField(term30133, term30133.getClass(), "hour", (byte) 14);
        setByteField(term30133, term30133.getClass(), "minute", (byte) 6);
        setByteField(term30133, term30133.getClass(), "second", (byte) 20);
        setIntField(term30133, term30133.getClass(), "nano", 660325634);
        setField(term30128, term30128.getClass(), "time", term30133);
        setField(term30063, term30063.getClass(), "createdAt", term30128);
        setIntField(term30139, term30139.getClass(), "year", 2019);
        setShortField(term30139, term30139.getClass(), "month", (short) 2);
        setShortField(term30139, term30139.getClass(), "day", (short) 13);
        setField(term30138, term30138.getClass(), "date", term30139);
        setByteField(term30143, term30143.getClass(), "hour", (byte) 5);
        setByteField(term30143, term30143.getClass(), "minute", (byte) 59);
        setByteField(term30143, term30143.getClass(), "second", (byte) 42);
        setIntField(term30143, term30143.getClass(), "nano", 720385556);
        setField(term30138, term30138.getClass(), "time", term30143);
        setField(term30063, term30063.getClass(), "updatedAt", term30138);
        setField(term30148, term30148.getClass(), "id", term30149);
        setField(term30148, term30148.getClass(), "userId", term30151);
        setField(term30148, term30148.getClass(), "region", enum59);
        setField(term30148, term30148.getClass(), "bucket", "AobDaplFLl");
        setField(term30148, term30148.getClass(), "path", "pDkMNnAGgv");
        setField(term30186, term30186.getClass(), "name", "PaCpFXGzdX");
        setField(term30186, term30186.getClass(), "size", term30199);
        setField(term30186, term30186.getClass(), "type", "FftYCNbnks");
        setField(term30148, term30148.getClass(), "meta", term30186);
        setIntField(term30214, term30214.getClass(), "year", 2016);
        setShortField(term30214, term30214.getClass(), "month", (short) 2);
        setShortField(term30214, term30214.getClass(), "day", (short) 12);
        setField(term30213, term30213.getClass(), "date", term30214);
        setByteField(term30218, term30218.getClass(), "hour", (byte) 7);
        setByteField(term30218, term30218.getClass(), "minute", (byte) 16);
        setByteField(term30218, term30218.getClass(), "second", (byte) 55);
        setIntField(term30218, term30218.getClass(), "nano", 690063047);
        setField(term30213, term30213.getClass(), "time", term30218);
        setField(term30148, term30148.getClass(), "createdAt", term30213);
        setIntField(term30224, term30224.getClass(), "year", 2019);
        setShortField(term30224, term30224.getClass(), "month", (short) 3);
        setShortField(term30224, term30224.getClass(), "day", (short) 19);
        setField(term30223, term30223.getClass(), "date", term30224);
        setByteField(term30228, term30228.getClass(), "hour", (byte) 19);
        setByteField(term30228, term30228.getClass(), "minute", (byte) 24);
        setByteField(term30228, term30228.getClass(), "second", (byte) 21);
        setIntField(term30228, term30228.getClass(), "nano", 765889037);
        setField(term30223, term30223.getClass(), "time", term30228);
        setField(term30148, term30148.getClass(), "updatedAt", term30223);
        setField(term30148, term30148.getClass(), "url", "lJoltmsadS");
        setField(term30148, term30148.getClass(), "thumbs", term30245);
        setField(term30063, term30063.getClass(), "avatar", term30148);
        setField(term30253, term30253.getClass(), "id", term30254);
        setField(term30253, term30253.getClass(), "userId", term30256);
        setField(term30253, term30253.getClass(), "postCount", term30258);
        setField(term30253, term30253.getClass(), "likeCount", term30260);
        setField(term30253, term30253.getClass(), "followingCount", term30262);
        setField(term30253, term30253.getClass(), "followerCount", term30264);
        setIntField(term30267, term30267.getClass(), "year", 2021);
        setShortField(term30267, term30267.getClass(), "month", (short) 7);
        setShortField(term30267, term30267.getClass(), "day", (short) 2);
        setField(term30266, term30266.getClass(), "date", term30267);
        setByteField(term30271, term30271.getClass(), "hour", (byte) 21);
        setByteField(term30271, term30271.getClass(), "minute", (byte) 55);
        setByteField(term30271, term30271.getClass(), "second", (byte) 54);
        setIntField(term30271, term30271.getClass(), "nano", 731983440);
        setField(term30266, term30266.getClass(), "time", term30271);
        setField(term30253, term30253.getClass(), "createdAt", term30266);
        setIntField(term30277, term30277.getClass(), "year", 2022);
        setShortField(term30277, term30277.getClass(), "month", (short) 10);
        setShortField(term30277, term30277.getClass(), "day", (short) 14);
        setField(term30276, term30276.getClass(), "date", term30277);
        setByteField(term30281, term30281.getClass(), "hour", (byte) 7);
        setByteField(term30281, term30281.getClass(), "minute", (byte) 29);
        setByteField(term30281, term30281.getClass(), "second", (byte) 42);
        setIntField(term30281, term30281.getClass(), "nano", 962865996);
        setField(term30276, term30276.getClass(), "time", term30281);
        setField(term30253, term30253.getClass(), "updatedAt", term30276);
        setField(term30063, term30063.getClass(), "stat", term30253);
        setField(term30063, term30063.getClass(), "following", term30286);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserDTO$UserDTOBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "bvSgmFUDOU";
        callMethod(klass, "password", argTypes, term30063, args);
    }

};


