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

public class UserDTO_UserDTOBuilder_email_2787251765 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31201;

    public UserDTO_UserDTOBuilder_email_2787251765() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term31202 = new Long(6252795312796363233L);
        Long term31252 = new Long(3968143267572761057L);
        Long term31287 = new Long(2712394591642260550L);
        Long term31289 = new Long(-1211273460223868511L);
        Class<? extends Object> term31489 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term31488 = ((Class) term31489).getDeclaredField((String) "LOCAL");
        ((Field) term31488).setAccessible(true);
        Object enum61 = ((Field) term31488).get((Object) null);
        Long term31337 = new Long(-8172564209423941839L);
        HashMap term31383 = new HashMap();
        Long term31392 = new Long(-4561371668792438386L);
        Long term31394 = new Long(7065003857377879971L);
        Long term31396 = new Long(2243864141567980599L);
        Long term31398 = new Long(353705949229610067L);
        Long term31400 = new Long(3288572082902580031L);
        Long term31402 = new Long(-8698230272673009418L);
        Boolean term31424 = new Boolean(true);
        term31201 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserDTO$UserDTOBuilder"));
        Object term31266 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term31267 = newInstance(Class.forName("java.time.LocalDate"));
        Object term31271 = newInstance(Class.forName("java.time.LocalTime"));
        Object term31276 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term31277 = newInstance(Class.forName("java.time.LocalDate"));
        Object term31281 = newInstance(Class.forName("java.time.LocalTime"));
        Object term31286 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.FileDTO"));
        Object term31324 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        Object term31351 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term31352 = newInstance(Class.forName("java.time.LocalDate"));
        Object term31356 = newInstance(Class.forName("java.time.LocalTime"));
        Object term31361 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term31362 = newInstance(Class.forName("java.time.LocalDate"));
        Object term31366 = newInstance(Class.forName("java.time.LocalTime"));
        Object term31391 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserStatDTO"));
        Object term31404 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term31405 = newInstance(Class.forName("java.time.LocalDate"));
        Object term31409 = newInstance(Class.forName("java.time.LocalTime"));
        Object term31414 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term31415 = newInstance(Class.forName("java.time.LocalDate"));
        Object term31419 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term31201, term31201.getClass(), "id", term31202);
        setField(term31201, term31201.getClass(), "username", "EEYmuwyVDP");
        setField(term31201, term31201.getClass(), "password", "EWFbEDAVrE");
        setField(term31201, term31201.getClass(), "mobile", "EMiMtYgfvr");
        setField(term31201, term31201.getClass(), "email", "OyYyYYnJuF");
        setField(term31201, term31201.getClass(), "avatarId", term31252);
        setField(term31201, term31201.getClass(), "intro", "aYLvcxZohT");
        setIntField(term31267, term31267.getClass(), "year", 2012);
        setShortField(term31267, term31267.getClass(), "month", (short) 11);
        setShortField(term31267, term31267.getClass(), "day", (short) 23);
        setField(term31266, term31266.getClass(), "date", term31267);
        setByteField(term31271, term31271.getClass(), "hour", (byte) 21);
        setByteField(term31271, term31271.getClass(), "minute", (byte) 45);
        setByteField(term31271, term31271.getClass(), "second", (byte) 46);
        setIntField(term31271, term31271.getClass(), "nano", 484678696);
        setField(term31266, term31266.getClass(), "time", term31271);
        setField(term31201, term31201.getClass(), "createdAt", term31266);
        setIntField(term31277, term31277.getClass(), "year", 2027);
        setShortField(term31277, term31277.getClass(), "month", (short) 12);
        setShortField(term31277, term31277.getClass(), "day", (short) 25);
        setField(term31276, term31276.getClass(), "date", term31277);
        setByteField(term31281, term31281.getClass(), "hour", (byte) 8);
        setByteField(term31281, term31281.getClass(), "minute", (byte) 19);
        setByteField(term31281, term31281.getClass(), "second", (byte) 20);
        setIntField(term31281, term31281.getClass(), "nano", 127700185);
        setField(term31276, term31276.getClass(), "time", term31281);
        setField(term31201, term31201.getClass(), "updatedAt", term31276);
        setField(term31286, term31286.getClass(), "id", term31287);
        setField(term31286, term31286.getClass(), "userId", term31289);
        setField(term31286, term31286.getClass(), "region", enum61);
        setField(term31286, term31286.getClass(), "bucket", "mnHyQbMyld");
        setField(term31286, term31286.getClass(), "path", "KHtaDOIcJZ");
        setField(term31324, term31324.getClass(), "name", "vgdwrCZczl");
        setField(term31324, term31324.getClass(), "size", term31337);
        setField(term31324, term31324.getClass(), "type", "gKMNrpKBpu");
        setField(term31286, term31286.getClass(), "meta", term31324);
        setIntField(term31352, term31352.getClass(), "year", 2018);
        setShortField(term31352, term31352.getClass(), "month", (short) 1);
        setShortField(term31352, term31352.getClass(), "day", (short) 7);
        setField(term31351, term31351.getClass(), "date", term31352);
        setByteField(term31356, term31356.getClass(), "hour", (byte) 5);
        setByteField(term31356, term31356.getClass(), "minute", (byte) 42);
        setByteField(term31356, term31356.getClass(), "second", (byte) 49);
        setIntField(term31356, term31356.getClass(), "nano", 291814792);
        setField(term31351, term31351.getClass(), "time", term31356);
        setField(term31286, term31286.getClass(), "createdAt", term31351);
        setIntField(term31362, term31362.getClass(), "year", 2022);
        setShortField(term31362, term31362.getClass(), "month", (short) 7);
        setShortField(term31362, term31362.getClass(), "day", (short) 9);
        setField(term31361, term31361.getClass(), "date", term31362);
        setByteField(term31366, term31366.getClass(), "hour", (byte) 21);
        setByteField(term31366, term31366.getClass(), "minute", (byte) 48);
        setByteField(term31366, term31366.getClass(), "second", (byte) 58);
        setIntField(term31366, term31366.getClass(), "nano", 579553780);
        setField(term31361, term31361.getClass(), "time", term31366);
        setField(term31286, term31286.getClass(), "updatedAt", term31361);
        setField(term31286, term31286.getClass(), "url", "ZbHJVEqcoa");
        setField(term31286, term31286.getClass(), "thumbs", term31383);
        setField(term31201, term31201.getClass(), "avatar", term31286);
        setField(term31391, term31391.getClass(), "id", term31392);
        setField(term31391, term31391.getClass(), "userId", term31394);
        setField(term31391, term31391.getClass(), "postCount", term31396);
        setField(term31391, term31391.getClass(), "likeCount", term31398);
        setField(term31391, term31391.getClass(), "followingCount", term31400);
        setField(term31391, term31391.getClass(), "followerCount", term31402);
        setIntField(term31405, term31405.getClass(), "year", 2017);
        setShortField(term31405, term31405.getClass(), "month", (short) 5);
        setShortField(term31405, term31405.getClass(), "day", (short) 2);
        setField(term31404, term31404.getClass(), "date", term31405);
        setByteField(term31409, term31409.getClass(), "hour", (byte) 7);
        setByteField(term31409, term31409.getClass(), "minute", (byte) 24);
        setByteField(term31409, term31409.getClass(), "second", (byte) 51);
        setIntField(term31409, term31409.getClass(), "nano", 706502334);
        setField(term31404, term31404.getClass(), "time", term31409);
        setField(term31391, term31391.getClass(), "createdAt", term31404);
        setIntField(term31415, term31415.getClass(), "year", 2026);
        setShortField(term31415, term31415.getClass(), "month", (short) 11);
        setShortField(term31415, term31415.getClass(), "day", (short) 1);
        setField(term31414, term31414.getClass(), "date", term31415);
        setByteField(term31419, term31419.getClass(), "hour", (byte) 9);
        setByteField(term31419, term31419.getClass(), "minute", (byte) 4);
        setByteField(term31419, term31419.getClass(), "second", (byte) 25);
        setIntField(term31419, term31419.getClass(), "nano", 272299951);
        setField(term31414, term31414.getClass(), "time", term31419);
        setField(term31391, term31391.getClass(), "updatedAt", term31414);
        setField(term31201, term31201.getClass(), "stat", term31391);
        setField(term31201, term31201.getClass(), "following", term31424);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserDTO$UserDTOBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "HJwNgUzZZR";
        callMethod(klass, "email", argTypes, term31201, args);
    }

};


