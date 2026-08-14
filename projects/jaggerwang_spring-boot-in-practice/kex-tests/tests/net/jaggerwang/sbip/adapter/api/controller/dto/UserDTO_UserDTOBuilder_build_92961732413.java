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

public class UserDTO_UserDTOBuilder_build_92961732413 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35827;

    public UserDTO_UserDTOBuilder_build_92961732413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term35828 = new Long(7717843551775677202L);
        Long term35878 = new Long(2823262561274956150L);
        Long term35913 = new Long(8039153062846287600L);
        Long term35915 = new Long(-7087265016767824631L);
        Class<? extends Object> term36103 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term36102 = ((Class) term36103).getDeclaredField((String) "LOCAL");
        ((Field) term36102).setAccessible(true);
        Object enum69 = ((Field) term36102).get((Object) null);
        Long term35963 = new Long(-8121348431673567857L);
        HashMap term36009 = new HashMap();
        Long term36018 = new Long(7594342965038171122L);
        Long term36020 = new Long(-4475453924678388077L);
        Long term36022 = new Long(3831842879355381917L);
        Long term36024 = new Long(-2196447813514870436L);
        Long term36026 = new Long(2984955721798941743L);
        Long term36028 = new Long(7495572757420909707L);
        Boolean term36050 = new Boolean(false);
        term35827 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserDTO$UserDTOBuilder"));
        Object term35892 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term35893 = newInstance(Class.forName("java.time.LocalDate"));
        Object term35897 = newInstance(Class.forName("java.time.LocalTime"));
        Object term35902 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term35903 = newInstance(Class.forName("java.time.LocalDate"));
        Object term35907 = newInstance(Class.forName("java.time.LocalTime"));
        Object term35912 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.FileDTO"));
        Object term35950 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        Object term35977 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term35978 = newInstance(Class.forName("java.time.LocalDate"));
        Object term35982 = newInstance(Class.forName("java.time.LocalTime"));
        Object term35987 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term35988 = newInstance(Class.forName("java.time.LocalDate"));
        Object term35992 = newInstance(Class.forName("java.time.LocalTime"));
        Object term36017 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserStatDTO"));
        Object term36030 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term36031 = newInstance(Class.forName("java.time.LocalDate"));
        Object term36035 = newInstance(Class.forName("java.time.LocalTime"));
        Object term36040 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term36041 = newInstance(Class.forName("java.time.LocalDate"));
        Object term36045 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term35827, term35827.getClass(), "id", term35828);
        setField(term35827, term35827.getClass(), "username", "POPYycoDBy");
        setField(term35827, term35827.getClass(), "password", "LuWMOXdAPA");
        setField(term35827, term35827.getClass(), "mobile", "blSffTnsOv");
        setField(term35827, term35827.getClass(), "email", "qbUMcIvEXH");
        setField(term35827, term35827.getClass(), "avatarId", term35878);
        setField(term35827, term35827.getClass(), "intro", "TVxGTjeDcu");
        setIntField(term35893, term35893.getClass(), "year", 2026);
        setShortField(term35893, term35893.getClass(), "month", (short) 9);
        setShortField(term35893, term35893.getClass(), "day", (short) 22);
        setField(term35892, term35892.getClass(), "date", term35893);
        setByteField(term35897, term35897.getClass(), "hour", (byte) 22);
        setByteField(term35897, term35897.getClass(), "minute", (byte) 25);
        setByteField(term35897, term35897.getClass(), "second", (byte) 25);
        setIntField(term35897, term35897.getClass(), "nano", 526433618);
        setField(term35892, term35892.getClass(), "time", term35897);
        setField(term35827, term35827.getClass(), "createdAt", term35892);
        setIntField(term35903, term35903.getClass(), "year", 2017);
        setShortField(term35903, term35903.getClass(), "month", (short) 8);
        setShortField(term35903, term35903.getClass(), "day", (short) 11);
        setField(term35902, term35902.getClass(), "date", term35903);
        setByteField(term35907, term35907.getClass(), "hour", (byte) 0);
        setByteField(term35907, term35907.getClass(), "minute", (byte) 12);
        setByteField(term35907, term35907.getClass(), "second", (byte) 8);
        setIntField(term35907, term35907.getClass(), "nano", 421599135);
        setField(term35902, term35902.getClass(), "time", term35907);
        setField(term35827, term35827.getClass(), "updatedAt", term35902);
        setField(term35912, term35912.getClass(), "id", term35913);
        setField(term35912, term35912.getClass(), "userId", term35915);
        setField(term35912, term35912.getClass(), "region", enum69);
        setField(term35912, term35912.getClass(), "bucket", "ABPtcyCzkR");
        setField(term35912, term35912.getClass(), "path", "QgHhxMyKvr");
        setField(term35950, term35950.getClass(), "name", "VGiXZZTWRO");
        setField(term35950, term35950.getClass(), "size", term35963);
        setField(term35950, term35950.getClass(), "type", "MlPtwXnJOJ");
        setField(term35912, term35912.getClass(), "meta", term35950);
        setIntField(term35978, term35978.getClass(), "year", 2026);
        setShortField(term35978, term35978.getClass(), "month", (short) 12);
        setShortField(term35978, term35978.getClass(), "day", (short) 22);
        setField(term35977, term35977.getClass(), "date", term35978);
        setByteField(term35982, term35982.getClass(), "hour", (byte) 19);
        setByteField(term35982, term35982.getClass(), "minute", (byte) 39);
        setByteField(term35982, term35982.getClass(), "second", (byte) 23);
        setIntField(term35982, term35982.getClass(), "nano", 342247024);
        setField(term35977, term35977.getClass(), "time", term35982);
        setField(term35912, term35912.getClass(), "createdAt", term35977);
        setIntField(term35988, term35988.getClass(), "year", 2020);
        setShortField(term35988, term35988.getClass(), "month", (short) 5);
        setShortField(term35988, term35988.getClass(), "day", (short) 8);
        setField(term35987, term35987.getClass(), "date", term35988);
        setByteField(term35992, term35992.getClass(), "hour", (byte) 8);
        setByteField(term35992, term35992.getClass(), "minute", (byte) 25);
        setByteField(term35992, term35992.getClass(), "second", (byte) 28);
        setIntField(term35992, term35992.getClass(), "nano", 159788425);
        setField(term35987, term35987.getClass(), "time", term35992);
        setField(term35912, term35912.getClass(), "updatedAt", term35987);
        setField(term35912, term35912.getClass(), "url", "DbfiyFeaTe");
        setField(term35912, term35912.getClass(), "thumbs", term36009);
        setField(term35827, term35827.getClass(), "avatar", term35912);
        setField(term36017, term36017.getClass(), "id", term36018);
        setField(term36017, term36017.getClass(), "userId", term36020);
        setField(term36017, term36017.getClass(), "postCount", term36022);
        setField(term36017, term36017.getClass(), "likeCount", term36024);
        setField(term36017, term36017.getClass(), "followingCount", term36026);
        setField(term36017, term36017.getClass(), "followerCount", term36028);
        setIntField(term36031, term36031.getClass(), "year", 2017);
        setShortField(term36031, term36031.getClass(), "month", (short) 11);
        setShortField(term36031, term36031.getClass(), "day", (short) 17);
        setField(term36030, term36030.getClass(), "date", term36031);
        setByteField(term36035, term36035.getClass(), "hour", (byte) 8);
        setByteField(term36035, term36035.getClass(), "minute", (byte) 54);
        setByteField(term36035, term36035.getClass(), "second", (byte) 50);
        setIntField(term36035, term36035.getClass(), "nano", 819857135);
        setField(term36030, term36030.getClass(), "time", term36035);
        setField(term36017, term36017.getClass(), "createdAt", term36030);
        setIntField(term36041, term36041.getClass(), "year", 2020);
        setShortField(term36041, term36041.getClass(), "month", (short) 2);
        setShortField(term36041, term36041.getClass(), "day", (short) 27);
        setField(term36040, term36040.getClass(), "date", term36041);
        setByteField(term36045, term36045.getClass(), "hour", (byte) 21);
        setByteField(term36045, term36045.getClass(), "minute", (byte) 35);
        setByteField(term36045, term36045.getClass(), "second", (byte) 42);
        setIntField(term36045, term36045.getClass(), "nano", 887239335);
        setField(term36040, term36040.getClass(), "time", term36045);
        setField(term36017, term36017.getClass(), "updatedAt", term36040);
        setField(term35827, term35827.getClass(), "stat", term36017);
        setField(term35827, term35827.getClass(), "following", term36050);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserDTO$UserDTOBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term35827, args);
    }

};


