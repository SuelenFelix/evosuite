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

public class UserDTO_equals_172630093227 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14138;
     Object term14363;

    public UserDTO_equals_172630093227() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term14139 = new Long(-6078481855513028760L);
        Long term14189 = new Long(-6985556670871089725L);
        Long term14224 = new Long(-8469818909085103606L);
        Long term14226 = new Long(11315815278355083L);
        Class<? extends Object> term14415 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term14414 = ((Class) term14415).getDeclaredField((String) "LOCAL");
        ((Field) term14414).setAccessible(true);
        Object enum25 = ((Field) term14414).get((Object) null);
        Long term14274 = new Long(7735460540091431012L);
        HashMap term14320 = new HashMap();
        Long term14329 = new Long(1346299551708610248L);
        Long term14331 = new Long(-7191625829563442696L);
        Long term14333 = new Long(1463379874413441830L);
        Long term14335 = new Long(7998051124369147543L);
        Long term14337 = new Long(-1481367303699139651L);
        Long term14339 = new Long(-7709317346333670618L);
        Boolean term14361 = new Boolean(false);
        term14138 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserDTO"));
        Object term14203 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term14204 = newInstance(Class.forName("java.time.LocalDate"));
        Object term14208 = newInstance(Class.forName("java.time.LocalTime"));
        Object term14213 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term14214 = newInstance(Class.forName("java.time.LocalDate"));
        Object term14218 = newInstance(Class.forName("java.time.LocalTime"));
        Object term14223 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.FileDTO"));
        Object term14261 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        Object term14288 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term14289 = newInstance(Class.forName("java.time.LocalDate"));
        Object term14293 = newInstance(Class.forName("java.time.LocalTime"));
        Object term14298 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term14299 = newInstance(Class.forName("java.time.LocalDate"));
        Object term14303 = newInstance(Class.forName("java.time.LocalTime"));
        Object term14328 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserStatDTO"));
        Object term14341 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term14342 = newInstance(Class.forName("java.time.LocalDate"));
        Object term14346 = newInstance(Class.forName("java.time.LocalTime"));
        Object term14351 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term14352 = newInstance(Class.forName("java.time.LocalDate"));
        Object term14356 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term14138, term14138.getClass(), "id", term14139);
        setField(term14138, term14138.getClass(), "username", "urCiQnUFBM");
        setField(term14138, term14138.getClass(), "password", "EKjQdtKxAM");
        setField(term14138, term14138.getClass(), "mobile", "TXZAIPQJHt");
        setField(term14138, term14138.getClass(), "email", "DIbeDHICho");
        setField(term14138, term14138.getClass(), "avatarId", term14189);
        setField(term14138, term14138.getClass(), "intro", "dJGPlmSRnz");
        setIntField(term14204, term14204.getClass(), "year", 2026);
        setShortField(term14204, term14204.getClass(), "month", (short) 2);
        setShortField(term14204, term14204.getClass(), "day", (short) 5);
        setField(term14203, term14203.getClass(), "date", term14204);
        setByteField(term14208, term14208.getClass(), "hour", (byte) 1);
        setByteField(term14208, term14208.getClass(), "minute", (byte) 38);
        setByteField(term14208, term14208.getClass(), "second", (byte) 15);
        setIntField(term14208, term14208.getClass(), "nano", 167345230);
        setField(term14203, term14203.getClass(), "time", term14208);
        setField(term14138, term14138.getClass(), "createdAt", term14203);
        setIntField(term14214, term14214.getClass(), "year", 2029);
        setShortField(term14214, term14214.getClass(), "month", (short) 6);
        setShortField(term14214, term14214.getClass(), "day", (short) 4);
        setField(term14213, term14213.getClass(), "date", term14214);
        setByteField(term14218, term14218.getClass(), "hour", (byte) 22);
        setByteField(term14218, term14218.getClass(), "minute", (byte) 1);
        setByteField(term14218, term14218.getClass(), "second", (byte) 38);
        setIntField(term14218, term14218.getClass(), "nano", 329228491);
        setField(term14213, term14213.getClass(), "time", term14218);
        setField(term14138, term14138.getClass(), "updatedAt", term14213);
        setField(term14223, term14223.getClass(), "id", term14224);
        setField(term14223, term14223.getClass(), "userId", term14226);
        setField(term14223, term14223.getClass(), "region", enum25);
        setField(term14223, term14223.getClass(), "bucket", "DPskuFUobI");
        setField(term14223, term14223.getClass(), "path", "wBGfLpNNiZ");
        setField(term14261, term14261.getClass(), "name", "yUGCjlqgJE");
        setField(term14261, term14261.getClass(), "size", term14274);
        setField(term14261, term14261.getClass(), "type", "PXdVZyoJyC");
        setField(term14223, term14223.getClass(), "meta", term14261);
        setIntField(term14289, term14289.getClass(), "year", 2027);
        setShortField(term14289, term14289.getClass(), "month", (short) 5);
        setShortField(term14289, term14289.getClass(), "day", (short) 2);
        setField(term14288, term14288.getClass(), "date", term14289);
        setByteField(term14293, term14293.getClass(), "hour", (byte) 6);
        setByteField(term14293, term14293.getClass(), "minute", (byte) 10);
        setByteField(term14293, term14293.getClass(), "second", (byte) 19);
        setIntField(term14293, term14293.getClass(), "nano", 422884120);
        setField(term14288, term14288.getClass(), "time", term14293);
        setField(term14223, term14223.getClass(), "createdAt", term14288);
        setIntField(term14299, term14299.getClass(), "year", 2029);
        setShortField(term14299, term14299.getClass(), "month", (short) 10);
        setShortField(term14299, term14299.getClass(), "day", (short) 19);
        setField(term14298, term14298.getClass(), "date", term14299);
        setByteField(term14303, term14303.getClass(), "hour", (byte) 15);
        setByteField(term14303, term14303.getClass(), "minute", (byte) 8);
        setByteField(term14303, term14303.getClass(), "second", (byte) 15);
        setIntField(term14303, term14303.getClass(), "nano", 25396748);
        setField(term14298, term14298.getClass(), "time", term14303);
        setField(term14223, term14223.getClass(), "updatedAt", term14298);
        setField(term14223, term14223.getClass(), "url", "vLerpqavFM");
        setField(term14223, term14223.getClass(), "thumbs", term14320);
        setField(term14138, term14138.getClass(), "avatar", term14223);
        setField(term14328, term14328.getClass(), "id", term14329);
        setField(term14328, term14328.getClass(), "userId", term14331);
        setField(term14328, term14328.getClass(), "postCount", term14333);
        setField(term14328, term14328.getClass(), "likeCount", term14335);
        setField(term14328, term14328.getClass(), "followingCount", term14337);
        setField(term14328, term14328.getClass(), "followerCount", term14339);
        setIntField(term14342, term14342.getClass(), "year", 2014);
        setShortField(term14342, term14342.getClass(), "month", (short) 6);
        setShortField(term14342, term14342.getClass(), "day", (short) 28);
        setField(term14341, term14341.getClass(), "date", term14342);
        setByteField(term14346, term14346.getClass(), "hour", (byte) 7);
        setByteField(term14346, term14346.getClass(), "minute", (byte) 14);
        setByteField(term14346, term14346.getClass(), "second", (byte) 59);
        setIntField(term14346, term14346.getClass(), "nano", 314278386);
        setField(term14341, term14341.getClass(), "time", term14346);
        setField(term14328, term14328.getClass(), "createdAt", term14341);
        setIntField(term14352, term14352.getClass(), "year", 2015);
        setShortField(term14352, term14352.getClass(), "month", (short) 10);
        setShortField(term14352, term14352.getClass(), "day", (short) 8);
        setField(term14351, term14351.getClass(), "date", term14352);
        setByteField(term14356, term14356.getClass(), "hour", (byte) 22);
        setByteField(term14356, term14356.getClass(), "minute", (byte) 20);
        setByteField(term14356, term14356.getClass(), "second", (byte) 59);
        setIntField(term14356, term14356.getClass(), "nano", 350521903);
        setField(term14351, term14351.getClass(), "time", term14356);
        setField(term14328, term14328.getClass(), "updatedAt", term14351);
        setField(term14138, term14138.getClass(), "stat", term14328);
        setField(term14138, term14138.getClass(), "following", term14361);
        term14363 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term14363;
        callMethod(klass, "equals", argTypes, term14138, args);
    }

};


