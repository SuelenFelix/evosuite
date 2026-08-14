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

public class UserDTO_UserDTOBuilder_intro_4197803447 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32319;

    public UserDTO_UserDTOBuilder_intro_4197803447() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term32320 = new Long(675601558105654203L);
        Long term32370 = new Long(-6481933642917183045L);
        Long term32405 = new Long(2054808971423494757L);
        Long term32407 = new Long(8734518435788772658L);
        Class<? extends Object> term32607 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term32606 = ((Class) term32607).getDeclaredField((String) "LOCAL");
        ((Field) term32606).setAccessible(true);
        Object enum63 = ((Field) term32606).get((Object) null);
        Long term32455 = new Long(2289954139848415685L);
        HashMap term32501 = new HashMap();
        Long term32510 = new Long(-6137280723045949220L);
        Long term32512 = new Long(-7787918913179897745L);
        Long term32514 = new Long(9173715346996433126L);
        Long term32516 = new Long(-3243599172737171562L);
        Long term32518 = new Long(3221586604131689186L);
        Long term32520 = new Long(-1283936527800858962L);
        Boolean term32542 = new Boolean(true);
        term32319 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserDTO$UserDTOBuilder"));
        Object term32384 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term32385 = newInstance(Class.forName("java.time.LocalDate"));
        Object term32389 = newInstance(Class.forName("java.time.LocalTime"));
        Object term32394 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term32395 = newInstance(Class.forName("java.time.LocalDate"));
        Object term32399 = newInstance(Class.forName("java.time.LocalTime"));
        Object term32404 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.FileDTO"));
        Object term32442 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        Object term32469 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term32470 = newInstance(Class.forName("java.time.LocalDate"));
        Object term32474 = newInstance(Class.forName("java.time.LocalTime"));
        Object term32479 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term32480 = newInstance(Class.forName("java.time.LocalDate"));
        Object term32484 = newInstance(Class.forName("java.time.LocalTime"));
        Object term32509 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserStatDTO"));
        Object term32522 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term32523 = newInstance(Class.forName("java.time.LocalDate"));
        Object term32527 = newInstance(Class.forName("java.time.LocalTime"));
        Object term32532 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term32533 = newInstance(Class.forName("java.time.LocalDate"));
        Object term32537 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term32319, term32319.getClass(), "id", term32320);
        setField(term32319, term32319.getClass(), "username", "HqoTWlkbwF");
        setField(term32319, term32319.getClass(), "password", "CwNELDTAPP");
        setField(term32319, term32319.getClass(), "mobile", "GSzQdbHLHw");
        setField(term32319, term32319.getClass(), "email", "IkfarsYNJO");
        setField(term32319, term32319.getClass(), "avatarId", term32370);
        setField(term32319, term32319.getClass(), "intro", "aZKOWhHMEh");
        setIntField(term32385, term32385.getClass(), "year", 2029);
        setShortField(term32385, term32385.getClass(), "month", (short) 1);
        setShortField(term32385, term32385.getClass(), "day", (short) 15);
        setField(term32384, term32384.getClass(), "date", term32385);
        setByteField(term32389, term32389.getClass(), "hour", (byte) 1);
        setByteField(term32389, term32389.getClass(), "minute", (byte) 39);
        setByteField(term32389, term32389.getClass(), "second", (byte) 40);
        setIntField(term32389, term32389.getClass(), "nano", 99482694);
        setField(term32384, term32384.getClass(), "time", term32389);
        setField(term32319, term32319.getClass(), "createdAt", term32384);
        setIntField(term32395, term32395.getClass(), "year", 2025);
        setShortField(term32395, term32395.getClass(), "month", (short) 2);
        setShortField(term32395, term32395.getClass(), "day", (short) 11);
        setField(term32394, term32394.getClass(), "date", term32395);
        setByteField(term32399, term32399.getClass(), "hour", (byte) 15);
        setByteField(term32399, term32399.getClass(), "minute", (byte) 46);
        setByteField(term32399, term32399.getClass(), "second", (byte) 31);
        setIntField(term32399, term32399.getClass(), "nano", 989587730);
        setField(term32394, term32394.getClass(), "time", term32399);
        setField(term32319, term32319.getClass(), "updatedAt", term32394);
        setField(term32404, term32404.getClass(), "id", term32405);
        setField(term32404, term32404.getClass(), "userId", term32407);
        setField(term32404, term32404.getClass(), "region", enum63);
        setField(term32404, term32404.getClass(), "bucket", "YfkhviKZwl");
        setField(term32404, term32404.getClass(), "path", "DcOhhAfJTI");
        setField(term32442, term32442.getClass(), "name", "gYTIkBFOoS");
        setField(term32442, term32442.getClass(), "size", term32455);
        setField(term32442, term32442.getClass(), "type", "xmzSoVgiED");
        setField(term32404, term32404.getClass(), "meta", term32442);
        setIntField(term32470, term32470.getClass(), "year", 2024);
        setShortField(term32470, term32470.getClass(), "month", (short) 11);
        setShortField(term32470, term32470.getClass(), "day", (short) 16);
        setField(term32469, term32469.getClass(), "date", term32470);
        setByteField(term32474, term32474.getClass(), "hour", (byte) 23);
        setByteField(term32474, term32474.getClass(), "minute", (byte) 40);
        setByteField(term32474, term32474.getClass(), "second", (byte) 40);
        setIntField(term32474, term32474.getClass(), "nano", 810133212);
        setField(term32469, term32469.getClass(), "time", term32474);
        setField(term32404, term32404.getClass(), "createdAt", term32469);
        setIntField(term32480, term32480.getClass(), "year", 2018);
        setShortField(term32480, term32480.getClass(), "month", (short) 5);
        setShortField(term32480, term32480.getClass(), "day", (short) 15);
        setField(term32479, term32479.getClass(), "date", term32480);
        setByteField(term32484, term32484.getClass(), "hour", (byte) 17);
        setByteField(term32484, term32484.getClass(), "minute", (byte) 19);
        setByteField(term32484, term32484.getClass(), "second", (byte) 28);
        setIntField(term32484, term32484.getClass(), "nano", 153049369);
        setField(term32479, term32479.getClass(), "time", term32484);
        setField(term32404, term32404.getClass(), "updatedAt", term32479);
        setField(term32404, term32404.getClass(), "url", "pdSvedKgPq");
        setField(term32404, term32404.getClass(), "thumbs", term32501);
        setField(term32319, term32319.getClass(), "avatar", term32404);
        setField(term32509, term32509.getClass(), "id", term32510);
        setField(term32509, term32509.getClass(), "userId", term32512);
        setField(term32509, term32509.getClass(), "postCount", term32514);
        setField(term32509, term32509.getClass(), "likeCount", term32516);
        setField(term32509, term32509.getClass(), "followingCount", term32518);
        setField(term32509, term32509.getClass(), "followerCount", term32520);
        setIntField(term32523, term32523.getClass(), "year", 2018);
        setShortField(term32523, term32523.getClass(), "month", (short) 9);
        setShortField(term32523, term32523.getClass(), "day", (short) 19);
        setField(term32522, term32522.getClass(), "date", term32523);
        setByteField(term32527, term32527.getClass(), "hour", (byte) 23);
        setByteField(term32527, term32527.getClass(), "minute", (byte) 30);
        setByteField(term32527, term32527.getClass(), "second", (byte) 11);
        setIntField(term32527, term32527.getClass(), "nano", 615798597);
        setField(term32522, term32522.getClass(), "time", term32527);
        setField(term32509, term32509.getClass(), "createdAt", term32522);
        setIntField(term32533, term32533.getClass(), "year", 2021);
        setShortField(term32533, term32533.getClass(), "month", (short) 3);
        setShortField(term32533, term32533.getClass(), "day", (short) 13);
        setField(term32532, term32532.getClass(), "date", term32533);
        setByteField(term32537, term32537.getClass(), "hour", (byte) 11);
        setByteField(term32537, term32537.getClass(), "minute", (byte) 11);
        setByteField(term32537, term32537.getClass(), "second", (byte) 36);
        setIntField(term32537, term32537.getClass(), "nano", 411690155);
        setField(term32532, term32532.getClass(), "time", term32537);
        setField(term32509, term32509.getClass(), "updatedAt", term32532);
        setField(term32319, term32319.getClass(), "stat", term32509);
        setField(term32319, term32319.getClass(), "following", term32542);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserDTO$UserDTOBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "UBPHmOICBs";
        callMethod(klass, "intro", argTypes, term32319, args);
    }

};


