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

public class UserDTO_toBO_2306000331 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term136;

    public UserDTO_toBO_2306000331() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term137 = new Long(-8257434502486459194L);
        Long term187 = new Long(-8400487765614892086L);
        Long term222 = new Long(5270370404989704783L);
        Long term224 = new Long(7411271909051562686L);
        Class<? extends Object> term421 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term420 = ((Class) term421).getDeclaredField((String) "LOCAL");
        ((Field) term420).setAccessible(true);
        Object enum0 = ((Field) term420).get((Object) null);
        Long term272 = new Long(4872422362414183754L);
        HashMap term318 = new HashMap();
        Long term327 = new Long(6811161968424632369L);
        Long term329 = new Long(-7237588299778557629L);
        Long term331 = new Long(6967924379644551255L);
        Long term333 = new Long(-2813493605142626659L);
        Long term335 = new Long(-8885298608300233488L);
        Long term337 = new Long(-4325723315152823407L);
        Boolean term359 = new Boolean(false);
        term136 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserDTO"));
        Object term201 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term202 = newInstance(Class.forName("java.time.LocalDate"));
        Object term206 = newInstance(Class.forName("java.time.LocalTime"));
        Object term211 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term212 = newInstance(Class.forName("java.time.LocalDate"));
        Object term216 = newInstance(Class.forName("java.time.LocalTime"));
        Object term221 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.FileDTO"));
        Object term259 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        Object term286 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term287 = newInstance(Class.forName("java.time.LocalDate"));
        Object term291 = newInstance(Class.forName("java.time.LocalTime"));
        Object term296 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term297 = newInstance(Class.forName("java.time.LocalDate"));
        Object term301 = newInstance(Class.forName("java.time.LocalTime"));
        Object term326 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserStatDTO"));
        Object term339 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term340 = newInstance(Class.forName("java.time.LocalDate"));
        Object term344 = newInstance(Class.forName("java.time.LocalTime"));
        Object term349 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term350 = newInstance(Class.forName("java.time.LocalDate"));
        Object term354 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term136, term136.getClass(), "id", term137);
        setField(term136, term136.getClass(), "username", "EGtDIRbSSb");
        setField(term136, term136.getClass(), "password", "SzjVpOQTyS");
        setField(term136, term136.getClass(), "mobile", "MjGYSRKTNF");
        setField(term136, term136.getClass(), "email", "hRNSzYYIrc");
        setField(term136, term136.getClass(), "avatarId", term187);
        setField(term136, term136.getClass(), "intro", "RMFIsYGgne");
        setIntField(term202, term202.getClass(), "year", 2015);
        setShortField(term202, term202.getClass(), "month", (short) 9);
        setShortField(term202, term202.getClass(), "day", (short) 19);
        setField(term201, term201.getClass(), "date", term202);
        setByteField(term206, term206.getClass(), "hour", (byte) 9);
        setByteField(term206, term206.getClass(), "minute", (byte) 4);
        setByteField(term206, term206.getClass(), "second", (byte) 10);
        setIntField(term206, term206.getClass(), "nano", 401765865);
        setField(term201, term201.getClass(), "time", term206);
        setField(term136, term136.getClass(), "createdAt", term201);
        setIntField(term212, term212.getClass(), "year", 2015);
        setShortField(term212, term212.getClass(), "month", (short) 4);
        setShortField(term212, term212.getClass(), "day", (short) 14);
        setField(term211, term211.getClass(), "date", term212);
        setByteField(term216, term216.getClass(), "hour", (byte) 18);
        setByteField(term216, term216.getClass(), "minute", (byte) 24);
        setByteField(term216, term216.getClass(), "second", (byte) 32);
        setIntField(term216, term216.getClass(), "nano", 369233818);
        setField(term211, term211.getClass(), "time", term216);
        setField(term136, term136.getClass(), "updatedAt", term211);
        setField(term221, term221.getClass(), "id", term222);
        setField(term221, term221.getClass(), "userId", term224);
        setField(term221, term221.getClass(), "region", enum0);
        setField(term221, term221.getClass(), "bucket", "NRdvgJlhkX");
        setField(term221, term221.getClass(), "path", "uuaPigETmJ");
        setField(term259, term259.getClass(), "name", "MxlszYVzRf");
        setField(term259, term259.getClass(), "size", term272);
        setField(term259, term259.getClass(), "type", "LQFpaHEwXR");
        setField(term221, term221.getClass(), "meta", term259);
        setIntField(term287, term287.getClass(), "year", 2022);
        setShortField(term287, term287.getClass(), "month", (short) 2);
        setShortField(term287, term287.getClass(), "day", (short) 26);
        setField(term286, term286.getClass(), "date", term287);
        setByteField(term291, term291.getClass(), "hour", (byte) 11);
        setByteField(term291, term291.getClass(), "minute", (byte) 42);
        setByteField(term291, term291.getClass(), "second", (byte) 15);
        setIntField(term291, term291.getClass(), "nano", 377731937);
        setField(term286, term286.getClass(), "time", term291);
        setField(term221, term221.getClass(), "createdAt", term286);
        setIntField(term297, term297.getClass(), "year", 2026);
        setShortField(term297, term297.getClass(), "month", (short) 12);
        setShortField(term297, term297.getClass(), "day", (short) 14);
        setField(term296, term296.getClass(), "date", term297);
        setByteField(term301, term301.getClass(), "hour", (byte) 16);
        setByteField(term301, term301.getClass(), "minute", (byte) 34);
        setByteField(term301, term301.getClass(), "second", (byte) 9);
        setIntField(term301, term301.getClass(), "nano", 518326996);
        setField(term296, term296.getClass(), "time", term301);
        setField(term221, term221.getClass(), "updatedAt", term296);
        setField(term221, term221.getClass(), "url", "oVcInYnLWB");
        setField(term221, term221.getClass(), "thumbs", term318);
        setField(term136, term136.getClass(), "avatar", term221);
        setField(term326, term326.getClass(), "id", term327);
        setField(term326, term326.getClass(), "userId", term329);
        setField(term326, term326.getClass(), "postCount", term331);
        setField(term326, term326.getClass(), "likeCount", term333);
        setField(term326, term326.getClass(), "followingCount", term335);
        setField(term326, term326.getClass(), "followerCount", term337);
        setIntField(term340, term340.getClass(), "year", 2025);
        setShortField(term340, term340.getClass(), "month", (short) 4);
        setShortField(term340, term340.getClass(), "day", (short) 24);
        setField(term339, term339.getClass(), "date", term340);
        setByteField(term344, term344.getClass(), "hour", (byte) 18);
        setByteField(term344, term344.getClass(), "minute", (byte) 11);
        setByteField(term344, term344.getClass(), "second", (byte) 40);
        setIntField(term344, term344.getClass(), "nano", 137454929);
        setField(term339, term339.getClass(), "time", term344);
        setField(term326, term326.getClass(), "createdAt", term339);
        setIntField(term350, term350.getClass(), "year", 2024);
        setShortField(term350, term350.getClass(), "month", (short) 1);
        setShortField(term350, term350.getClass(), "day", (short) 24);
        setField(term349, term349.getClass(), "date", term350);
        setByteField(term354, term354.getClass(), "hour", (byte) 20);
        setByteField(term354, term354.getClass(), "minute", (byte) 28);
        setByteField(term354, term354.getClass(), "second", (byte) 39);
        setIntField(term354, term354.getClass(), "nano", 952728177);
        setField(term349, term349.getClass(), "time", term354);
        setField(term326, term326.getClass(), "updatedAt", term349);
        setField(term136, term136.getClass(), "stat", term326);
        setField(term136, term136.getClass(), "following", term359);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toBO", argTypes, term136, args);
    }

};


