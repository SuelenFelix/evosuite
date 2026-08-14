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

public class UserDTO_setId_77274364115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7256;
     Object term7481;

    public UserDTO_setId_77274364115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term7257 = new Long(-6301101997917060727L);
        Long term7307 = new Long(8166095254618543564L);
        Long term7342 = new Long(-4598158870068953328L);
        Long term7344 = new Long(138235087558060686L);
        Class<? extends Object> term7534 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term7533 = ((Class) term7534).getDeclaredField((String) "LOCAL");
        ((Field) term7533).setAccessible(true);
        Object enum13 = ((Field) term7533).get((Object) null);
        Long term7392 = new Long(5381386339318883012L);
        HashMap term7438 = new HashMap();
        Long term7447 = new Long(-1333707622307134180L);
        Long term7449 = new Long(-4360569253593381888L);
        Long term7451 = new Long(1457594663983990440L);
        Long term7453 = new Long(3452833434644634217L);
        Long term7455 = new Long(-8603648071751666348L);
        Long term7457 = new Long(-7884871963229073324L);
        Boolean term7479 = new Boolean(true);
        term7256 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserDTO"));
        Object term7321 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7322 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7326 = newInstance(Class.forName("java.time.LocalTime"));
        Object term7331 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7332 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7336 = newInstance(Class.forName("java.time.LocalTime"));
        Object term7341 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.FileDTO"));
        Object term7379 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        Object term7406 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7407 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7411 = newInstance(Class.forName("java.time.LocalTime"));
        Object term7416 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7417 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7421 = newInstance(Class.forName("java.time.LocalTime"));
        Object term7446 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserStatDTO"));
        Object term7459 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7460 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7464 = newInstance(Class.forName("java.time.LocalTime"));
        Object term7469 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7470 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7474 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term7256, term7256.getClass(), "id", term7257);
        setField(term7256, term7256.getClass(), "username", "WHcwFgsGFC");
        setField(term7256, term7256.getClass(), "password", "HzqpegHiRq");
        setField(term7256, term7256.getClass(), "mobile", "jwsfVjMoJT");
        setField(term7256, term7256.getClass(), "email", "ZfdXfCCFDf");
        setField(term7256, term7256.getClass(), "avatarId", term7307);
        setField(term7256, term7256.getClass(), "intro", "MwwjNtdOFT");
        setIntField(term7322, term7322.getClass(), "year", 2011);
        setShortField(term7322, term7322.getClass(), "month", (short) 4);
        setShortField(term7322, term7322.getClass(), "day", (short) 19);
        setField(term7321, term7321.getClass(), "date", term7322);
        setByteField(term7326, term7326.getClass(), "hour", (byte) 12);
        setByteField(term7326, term7326.getClass(), "minute", (byte) 0);
        setByteField(term7326, term7326.getClass(), "second", (byte) 14);
        setIntField(term7326, term7326.getClass(), "nano", 849079063);
        setField(term7321, term7321.getClass(), "time", term7326);
        setField(term7256, term7256.getClass(), "createdAt", term7321);
        setIntField(term7332, term7332.getClass(), "year", 2014);
        setShortField(term7332, term7332.getClass(), "month", (short) 8);
        setShortField(term7332, term7332.getClass(), "day", (short) 17);
        setField(term7331, term7331.getClass(), "date", term7332);
        setByteField(term7336, term7336.getClass(), "hour", (byte) 19);
        setByteField(term7336, term7336.getClass(), "minute", (byte) 32);
        setByteField(term7336, term7336.getClass(), "second", (byte) 5);
        setIntField(term7336, term7336.getClass(), "nano", 604713831);
        setField(term7331, term7331.getClass(), "time", term7336);
        setField(term7256, term7256.getClass(), "updatedAt", term7331);
        setField(term7341, term7341.getClass(), "id", term7342);
        setField(term7341, term7341.getClass(), "userId", term7344);
        setField(term7341, term7341.getClass(), "region", enum13);
        setField(term7341, term7341.getClass(), "bucket", "VYkqXKVlAJ");
        setField(term7341, term7341.getClass(), "path", "XkIoWJRNwN");
        setField(term7379, term7379.getClass(), "name", "aNWLJdrZMq");
        setField(term7379, term7379.getClass(), "size", term7392);
        setField(term7379, term7379.getClass(), "type", "HHmNoYxIGj");
        setField(term7341, term7341.getClass(), "meta", term7379);
        setIntField(term7407, term7407.getClass(), "year", 2021);
        setShortField(term7407, term7407.getClass(), "month", (short) 3);
        setShortField(term7407, term7407.getClass(), "day", (short) 13);
        setField(term7406, term7406.getClass(), "date", term7407);
        setByteField(term7411, term7411.getClass(), "hour", (byte) 6);
        setByteField(term7411, term7411.getClass(), "minute", (byte) 25);
        setByteField(term7411, term7411.getClass(), "second", (byte) 42);
        setIntField(term7411, term7411.getClass(), "nano", 282924199);
        setField(term7406, term7406.getClass(), "time", term7411);
        setField(term7341, term7341.getClass(), "createdAt", term7406);
        setIntField(term7417, term7417.getClass(), "year", 2020);
        setShortField(term7417, term7417.getClass(), "month", (short) 10);
        setShortField(term7417, term7417.getClass(), "day", (short) 25);
        setField(term7416, term7416.getClass(), "date", term7417);
        setByteField(term7421, term7421.getClass(), "hour", (byte) 18);
        setByteField(term7421, term7421.getClass(), "minute", (byte) 22);
        setByteField(term7421, term7421.getClass(), "second", (byte) 30);
        setIntField(term7421, term7421.getClass(), "nano", 948592965);
        setField(term7416, term7416.getClass(), "time", term7421);
        setField(term7341, term7341.getClass(), "updatedAt", term7416);
        setField(term7341, term7341.getClass(), "url", "PtirvZmsGt");
        setField(term7341, term7341.getClass(), "thumbs", term7438);
        setField(term7256, term7256.getClass(), "avatar", term7341);
        setField(term7446, term7446.getClass(), "id", term7447);
        setField(term7446, term7446.getClass(), "userId", term7449);
        setField(term7446, term7446.getClass(), "postCount", term7451);
        setField(term7446, term7446.getClass(), "likeCount", term7453);
        setField(term7446, term7446.getClass(), "followingCount", term7455);
        setField(term7446, term7446.getClass(), "followerCount", term7457);
        setIntField(term7460, term7460.getClass(), "year", 2020);
        setShortField(term7460, term7460.getClass(), "month", (short) 5);
        setShortField(term7460, term7460.getClass(), "day", (short) 12);
        setField(term7459, term7459.getClass(), "date", term7460);
        setByteField(term7464, term7464.getClass(), "hour", (byte) 0);
        setByteField(term7464, term7464.getClass(), "minute", (byte) 15);
        setByteField(term7464, term7464.getClass(), "second", (byte) 24);
        setIntField(term7464, term7464.getClass(), "nano", 250257744);
        setField(term7459, term7459.getClass(), "time", term7464);
        setField(term7446, term7446.getClass(), "createdAt", term7459);
        setIntField(term7470, term7470.getClass(), "year", 2013);
        setShortField(term7470, term7470.getClass(), "month", (short) 9);
        setShortField(term7470, term7470.getClass(), "day", (short) 19);
        setField(term7469, term7469.getClass(), "date", term7470);
        setByteField(term7474, term7474.getClass(), "hour", (byte) 12);
        setByteField(term7474, term7474.getClass(), "minute", (byte) 29);
        setByteField(term7474, term7474.getClass(), "second", (byte) 28);
        setIntField(term7474, term7474.getClass(), "nano", 244069764);
        setField(term7469, term7469.getClass(), "time", term7474);
        setField(term7446, term7446.getClass(), "updatedAt", term7469);
        setField(term7256, term7256.getClass(), "stat", term7446);
        setField(term7256, term7256.getClass(), "following", term7479);
        term7481 = new Long(-8649738738252714180L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term7481;
        callMethod(klass, "setId", argTypes, term7256, args);
    }

};


