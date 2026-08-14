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

public class UserDTO_getMobile_3972167236 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2333;

    public UserDTO_getMobile_3972167236() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2334 = new Long(-2170847986967241072L);
        Long term2384 = new Long(4044358158040652353L);
        Long term2419 = new Long(-4443169559037975007L);
        Long term2421 = new Long(-3842548265506930260L);
        Class<? extends Object> term2609 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term2608 = ((Class) term2609).getDeclaredField((String) "LOCAL");
        ((Field) term2608).setAccessible(true);
        Object enum4 = ((Field) term2608).get((Object) null);
        Long term2469 = new Long(-5788180182343976541L);
        HashMap term2515 = new HashMap();
        Long term2524 = new Long(2936323121573284007L);
        Long term2526 = new Long(-1154553077993834885L);
        Long term2528 = new Long(-2850532706972744550L);
        Long term2530 = new Long(-2644215923136513282L);
        Long term2532 = new Long(-1468719814009985452L);
        Long term2534 = new Long(-7738503207562305297L);
        Boolean term2556 = new Boolean(true);
        term2333 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserDTO"));
        Object term2398 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2399 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2403 = newInstance(Class.forName("java.time.LocalTime"));
        Object term2408 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2409 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2413 = newInstance(Class.forName("java.time.LocalTime"));
        Object term2418 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.FileDTO"));
        Object term2456 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        Object term2483 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2484 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2488 = newInstance(Class.forName("java.time.LocalTime"));
        Object term2493 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2494 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2498 = newInstance(Class.forName("java.time.LocalTime"));
        Object term2523 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserStatDTO"));
        Object term2536 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2537 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2541 = newInstance(Class.forName("java.time.LocalTime"));
        Object term2546 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2547 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2551 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term2333, term2333.getClass(), "id", term2334);
        setField(term2333, term2333.getClass(), "username", "jDtqGUpnZN");
        setField(term2333, term2333.getClass(), "password", "nGKItKLYNC");
        setField(term2333, term2333.getClass(), "mobile", "UiUYnPrcCi");
        setField(term2333, term2333.getClass(), "email", "UoYtihxVaS");
        setField(term2333, term2333.getClass(), "avatarId", term2384);
        setField(term2333, term2333.getClass(), "intro", "JDswTTCZHV");
        setIntField(term2399, term2399.getClass(), "year", 2028);
        setShortField(term2399, term2399.getClass(), "month", (short) 10);
        setShortField(term2399, term2399.getClass(), "day", (short) 1);
        setField(term2398, term2398.getClass(), "date", term2399);
        setByteField(term2403, term2403.getClass(), "hour", (byte) 17);
        setByteField(term2403, term2403.getClass(), "minute", (byte) 29);
        setByteField(term2403, term2403.getClass(), "second", (byte) 30);
        setIntField(term2403, term2403.getClass(), "nano", 845472306);
        setField(term2398, term2398.getClass(), "time", term2403);
        setField(term2333, term2333.getClass(), "createdAt", term2398);
        setIntField(term2409, term2409.getClass(), "year", 2027);
        setShortField(term2409, term2409.getClass(), "month", (short) 2);
        setShortField(term2409, term2409.getClass(), "day", (short) 19);
        setField(term2408, term2408.getClass(), "date", term2409);
        setByteField(term2413, term2413.getClass(), "hour", (byte) 17);
        setByteField(term2413, term2413.getClass(), "minute", (byte) 37);
        setByteField(term2413, term2413.getClass(), "second", (byte) 27);
        setIntField(term2413, term2413.getClass(), "nano", 920380537);
        setField(term2408, term2408.getClass(), "time", term2413);
        setField(term2333, term2333.getClass(), "updatedAt", term2408);
        setField(term2418, term2418.getClass(), "id", term2419);
        setField(term2418, term2418.getClass(), "userId", term2421);
        setField(term2418, term2418.getClass(), "region", enum4);
        setField(term2418, term2418.getClass(), "bucket", "onpbIeEKoi");
        setField(term2418, term2418.getClass(), "path", "YRHGsAkhxb");
        setField(term2456, term2456.getClass(), "name", "ffYhPOzlUs");
        setField(term2456, term2456.getClass(), "size", term2469);
        setField(term2456, term2456.getClass(), "type", "MLqYREekMl");
        setField(term2418, term2418.getClass(), "meta", term2456);
        setIntField(term2484, term2484.getClass(), "year", 2021);
        setShortField(term2484, term2484.getClass(), "month", (short) 8);
        setShortField(term2484, term2484.getClass(), "day", (short) 12);
        setField(term2483, term2483.getClass(), "date", term2484);
        setByteField(term2488, term2488.getClass(), "hour", (byte) 2);
        setByteField(term2488, term2488.getClass(), "minute", (byte) 17);
        setByteField(term2488, term2488.getClass(), "second", (byte) 51);
        setIntField(term2488, term2488.getClass(), "nano", 207375141);
        setField(term2483, term2483.getClass(), "time", term2488);
        setField(term2418, term2418.getClass(), "createdAt", term2483);
        setIntField(term2494, term2494.getClass(), "year", 2025);
        setShortField(term2494, term2494.getClass(), "month", (short) 11);
        setShortField(term2494, term2494.getClass(), "day", (short) 3);
        setField(term2493, term2493.getClass(), "date", term2494);
        setByteField(term2498, term2498.getClass(), "hour", (byte) 21);
        setByteField(term2498, term2498.getClass(), "minute", (byte) 24);
        setByteField(term2498, term2498.getClass(), "second", (byte) 23);
        setIntField(term2498, term2498.getClass(), "nano", 210986721);
        setField(term2493, term2493.getClass(), "time", term2498);
        setField(term2418, term2418.getClass(), "updatedAt", term2493);
        setField(term2418, term2418.getClass(), "url", "ytSBIKXogI");
        setField(term2418, term2418.getClass(), "thumbs", term2515);
        setField(term2333, term2333.getClass(), "avatar", term2418);
        setField(term2523, term2523.getClass(), "id", term2524);
        setField(term2523, term2523.getClass(), "userId", term2526);
        setField(term2523, term2523.getClass(), "postCount", term2528);
        setField(term2523, term2523.getClass(), "likeCount", term2530);
        setField(term2523, term2523.getClass(), "followingCount", term2532);
        setField(term2523, term2523.getClass(), "followerCount", term2534);
        setIntField(term2537, term2537.getClass(), "year", 2016);
        setShortField(term2537, term2537.getClass(), "month", (short) 6);
        setShortField(term2537, term2537.getClass(), "day", (short) 15);
        setField(term2536, term2536.getClass(), "date", term2537);
        setByteField(term2541, term2541.getClass(), "hour", (byte) 21);
        setByteField(term2541, term2541.getClass(), "minute", (byte) 23);
        setByteField(term2541, term2541.getClass(), "second", (byte) 23);
        setIntField(term2541, term2541.getClass(), "nano", 433372070);
        setField(term2536, term2536.getClass(), "time", term2541);
        setField(term2523, term2523.getClass(), "createdAt", term2536);
        setIntField(term2547, term2547.getClass(), "year", 2012);
        setShortField(term2547, term2547.getClass(), "month", (short) 8);
        setShortField(term2547, term2547.getClass(), "day", (short) 25);
        setField(term2546, term2546.getClass(), "date", term2547);
        setByteField(term2551, term2551.getClass(), "hour", (byte) 19);
        setByteField(term2551, term2551.getClass(), "minute", (byte) 49);
        setByteField(term2551, term2551.getClass(), "second", (byte) 8);
        setIntField(term2551, term2551.getClass(), "nano", 912685024);
        setField(term2546, term2546.getClass(), "time", term2551);
        setField(term2523, term2523.getClass(), "updatedAt", term2546);
        setField(term2333, term2333.getClass(), "stat", term2523);
        setField(term2333, term2333.getClass(), "following", term2556);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMobile", argTypes, term2333, args);
    }

};


