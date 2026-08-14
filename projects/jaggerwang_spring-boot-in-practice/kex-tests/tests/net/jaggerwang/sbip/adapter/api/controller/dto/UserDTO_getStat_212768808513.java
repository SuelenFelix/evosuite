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

public class UserDTO_getStat_212768808513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6162;

    public UserDTO_getStat_212768808513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term6163 = new Long(1084801489398441516L);
        Long term6213 = new Long(6273754186658578034L);
        Long term6248 = new Long(3620247240684476031L);
        Long term6250 = new Long(8313800941204938919L);
        Class<? extends Object> term6438 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term6437 = ((Class) term6438).getDeclaredField((String) "LOCAL");
        ((Field) term6437).setAccessible(true);
        Object enum11 = ((Field) term6437).get((Object) null);
        Long term6298 = new Long(-1214968196781083707L);
        HashMap term6344 = new HashMap();
        Long term6353 = new Long(-1804015692891701666L);
        Long term6355 = new Long(-6432617521836576658L);
        Long term6357 = new Long(-2255965562447970862L);
        Long term6359 = new Long(148047808219672941L);
        Long term6361 = new Long(7489064039921396098L);
        Long term6363 = new Long(6843866297465638866L);
        Boolean term6385 = new Boolean(true);
        term6162 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserDTO"));
        Object term6227 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6228 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6232 = newInstance(Class.forName("java.time.LocalTime"));
        Object term6237 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6238 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6242 = newInstance(Class.forName("java.time.LocalTime"));
        Object term6247 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.FileDTO"));
        Object term6285 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        Object term6312 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6313 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6317 = newInstance(Class.forName("java.time.LocalTime"));
        Object term6322 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6323 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6327 = newInstance(Class.forName("java.time.LocalTime"));
        Object term6352 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserStatDTO"));
        Object term6365 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6366 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6370 = newInstance(Class.forName("java.time.LocalTime"));
        Object term6375 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6376 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6380 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term6162, term6162.getClass(), "id", term6163);
        setField(term6162, term6162.getClass(), "username", "JDaAnsVTGV");
        setField(term6162, term6162.getClass(), "password", "mLUZFTfjle");
        setField(term6162, term6162.getClass(), "mobile", "xIeFjkHkOe");
        setField(term6162, term6162.getClass(), "email", "SdCKLMIYnX");
        setField(term6162, term6162.getClass(), "avatarId", term6213);
        setField(term6162, term6162.getClass(), "intro", "OJJtVNPyKZ");
        setIntField(term6228, term6228.getClass(), "year", 2028);
        setShortField(term6228, term6228.getClass(), "month", (short) 4);
        setShortField(term6228, term6228.getClass(), "day", (short) 1);
        setField(term6227, term6227.getClass(), "date", term6228);
        setByteField(term6232, term6232.getClass(), "hour", (byte) 16);
        setByteField(term6232, term6232.getClass(), "minute", (byte) 22);
        setByteField(term6232, term6232.getClass(), "second", (byte) 32);
        setIntField(term6232, term6232.getClass(), "nano", 406353763);
        setField(term6227, term6227.getClass(), "time", term6232);
        setField(term6162, term6162.getClass(), "createdAt", term6227);
        setIntField(term6238, term6238.getClass(), "year", 2019);
        setShortField(term6238, term6238.getClass(), "month", (short) 7);
        setShortField(term6238, term6238.getClass(), "day", (short) 19);
        setField(term6237, term6237.getClass(), "date", term6238);
        setByteField(term6242, term6242.getClass(), "hour", (byte) 10);
        setByteField(term6242, term6242.getClass(), "minute", (byte) 54);
        setByteField(term6242, term6242.getClass(), "second", (byte) 55);
        setIntField(term6242, term6242.getClass(), "nano", 244650454);
        setField(term6237, term6237.getClass(), "time", term6242);
        setField(term6162, term6162.getClass(), "updatedAt", term6237);
        setField(term6247, term6247.getClass(), "id", term6248);
        setField(term6247, term6247.getClass(), "userId", term6250);
        setField(term6247, term6247.getClass(), "region", enum11);
        setField(term6247, term6247.getClass(), "bucket", "AKNapTAfmD");
        setField(term6247, term6247.getClass(), "path", "xJgPlLxpgC");
        setField(term6285, term6285.getClass(), "name", "EYtfuJaxiM");
        setField(term6285, term6285.getClass(), "size", term6298);
        setField(term6285, term6285.getClass(), "type", "gCWtLVKVVe");
        setField(term6247, term6247.getClass(), "meta", term6285);
        setIntField(term6313, term6313.getClass(), "year", 2022);
        setShortField(term6313, term6313.getClass(), "month", (short) 4);
        setShortField(term6313, term6313.getClass(), "day", (short) 15);
        setField(term6312, term6312.getClass(), "date", term6313);
        setByteField(term6317, term6317.getClass(), "hour", (byte) 20);
        setByteField(term6317, term6317.getClass(), "minute", (byte) 58);
        setByteField(term6317, term6317.getClass(), "second", (byte) 46);
        setIntField(term6317, term6317.getClass(), "nano", 435562727);
        setField(term6312, term6312.getClass(), "time", term6317);
        setField(term6247, term6247.getClass(), "createdAt", term6312);
        setIntField(term6323, term6323.getClass(), "year", 2026);
        setShortField(term6323, term6323.getClass(), "month", (short) 10);
        setShortField(term6323, term6323.getClass(), "day", (short) 31);
        setField(term6322, term6322.getClass(), "date", term6323);
        setByteField(term6327, term6327.getClass(), "hour", (byte) 17);
        setByteField(term6327, term6327.getClass(), "minute", (byte) 6);
        setByteField(term6327, term6327.getClass(), "second", (byte) 30);
        setIntField(term6327, term6327.getClass(), "nano", 785931660);
        setField(term6322, term6322.getClass(), "time", term6327);
        setField(term6247, term6247.getClass(), "updatedAt", term6322);
        setField(term6247, term6247.getClass(), "url", "fWKJoSoCwE");
        setField(term6247, term6247.getClass(), "thumbs", term6344);
        setField(term6162, term6162.getClass(), "avatar", term6247);
        setField(term6352, term6352.getClass(), "id", term6353);
        setField(term6352, term6352.getClass(), "userId", term6355);
        setField(term6352, term6352.getClass(), "postCount", term6357);
        setField(term6352, term6352.getClass(), "likeCount", term6359);
        setField(term6352, term6352.getClass(), "followingCount", term6361);
        setField(term6352, term6352.getClass(), "followerCount", term6363);
        setIntField(term6366, term6366.getClass(), "year", 2022);
        setShortField(term6366, term6366.getClass(), "month", (short) 11);
        setShortField(term6366, term6366.getClass(), "day", (short) 10);
        setField(term6365, term6365.getClass(), "date", term6366);
        setByteField(term6370, term6370.getClass(), "hour", (byte) 20);
        setByteField(term6370, term6370.getClass(), "minute", (byte) 8);
        setByteField(term6370, term6370.getClass(), "second", (byte) 35);
        setIntField(term6370, term6370.getClass(), "nano", 658416570);
        setField(term6365, term6365.getClass(), "time", term6370);
        setField(term6352, term6352.getClass(), "createdAt", term6365);
        setIntField(term6376, term6376.getClass(), "year", 2018);
        setShortField(term6376, term6376.getClass(), "month", (short) 11);
        setShortField(term6376, term6376.getClass(), "day", (short) 9);
        setField(term6375, term6375.getClass(), "date", term6376);
        setByteField(term6380, term6380.getClass(), "hour", (byte) 6);
        setByteField(term6380, term6380.getClass(), "minute", (byte) 8);
        setByteField(term6380, term6380.getClass(), "second", (byte) 32);
        setIntField(term6380, term6380.getClass(), "nano", 750733310);
        setField(term6375, term6375.getClass(), "time", term6380);
        setField(term6352, term6352.getClass(), "updatedAt", term6375);
        setField(term6162, term6162.getClass(), "stat", term6352);
        setField(term6162, term6162.getClass(), "following", term6385);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStat", argTypes, term6162, args);
    }

};


