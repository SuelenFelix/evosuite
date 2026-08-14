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

public class UserDTO_UserDTOBuilder_createdAt_4867776758 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32888;
     Object term33113;

    public UserDTO_UserDTOBuilder_createdAt_4867776758() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term32889 = new Long(-8901189796092679153L);
        Long term32939 = new Long(1731335447688885587L);
        Long term32974 = new Long(-6206610574921547811L);
        Long term32976 = new Long(-1625372334693179543L);
        Class<? extends Object> term33174 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term33173 = ((Class) term33174).getDeclaredField((String) "LOCAL");
        ((Field) term33173).setAccessible(true);
        Object enum64 = ((Field) term33173).get((Object) null);
        Long term33024 = new Long(3778691000276335279L);
        HashMap term33070 = new HashMap();
        Long term33079 = new Long(8453730687540121475L);
        Long term33081 = new Long(8505184530074334434L);
        Long term33083 = new Long(-1610129689783641208L);
        Long term33085 = new Long(-2613029888948149747L);
        Long term33087 = new Long(-6418282217428803693L);
        Long term33089 = new Long(-5608790408657117046L);
        Boolean term33111 = new Boolean(true);
        term32888 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserDTO$UserDTOBuilder"));
        Object term32953 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term32954 = newInstance(Class.forName("java.time.LocalDate"));
        Object term32958 = newInstance(Class.forName("java.time.LocalTime"));
        Object term32963 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term32964 = newInstance(Class.forName("java.time.LocalDate"));
        Object term32968 = newInstance(Class.forName("java.time.LocalTime"));
        Object term32973 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.FileDTO"));
        Object term33011 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        Object term33038 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term33039 = newInstance(Class.forName("java.time.LocalDate"));
        Object term33043 = newInstance(Class.forName("java.time.LocalTime"));
        Object term33048 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term33049 = newInstance(Class.forName("java.time.LocalDate"));
        Object term33053 = newInstance(Class.forName("java.time.LocalTime"));
        Object term33078 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserStatDTO"));
        Object term33091 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term33092 = newInstance(Class.forName("java.time.LocalDate"));
        Object term33096 = newInstance(Class.forName("java.time.LocalTime"));
        Object term33101 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term33102 = newInstance(Class.forName("java.time.LocalDate"));
        Object term33106 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term32888, term32888.getClass(), "id", term32889);
        setField(term32888, term32888.getClass(), "username", "IDJUVPgUJf");
        setField(term32888, term32888.getClass(), "password", "JmnWRJUxGr");
        setField(term32888, term32888.getClass(), "mobile", "wgRGBNrTGP");
        setField(term32888, term32888.getClass(), "email", "FIdNVptZpW");
        setField(term32888, term32888.getClass(), "avatarId", term32939);
        setField(term32888, term32888.getClass(), "intro", "rQjxAhisjm");
        setIntField(term32954, term32954.getClass(), "year", 2025);
        setShortField(term32954, term32954.getClass(), "month", (short) 2);
        setShortField(term32954, term32954.getClass(), "day", (short) 24);
        setField(term32953, term32953.getClass(), "date", term32954);
        setByteField(term32958, term32958.getClass(), "hour", (byte) 10);
        setByteField(term32958, term32958.getClass(), "minute", (byte) 56);
        setByteField(term32958, term32958.getClass(), "second", (byte) 29);
        setIntField(term32958, term32958.getClass(), "nano", 207724630);
        setField(term32953, term32953.getClass(), "time", term32958);
        setField(term32888, term32888.getClass(), "createdAt", term32953);
        setIntField(term32964, term32964.getClass(), "year", 2027);
        setShortField(term32964, term32964.getClass(), "month", (short) 8);
        setShortField(term32964, term32964.getClass(), "day", (short) 16);
        setField(term32963, term32963.getClass(), "date", term32964);
        setByteField(term32968, term32968.getClass(), "hour", (byte) 1);
        setByteField(term32968, term32968.getClass(), "minute", (byte) 50);
        setByteField(term32968, term32968.getClass(), "second", (byte) 52);
        setIntField(term32968, term32968.getClass(), "nano", 161814778);
        setField(term32963, term32963.getClass(), "time", term32968);
        setField(term32888, term32888.getClass(), "updatedAt", term32963);
        setField(term32973, term32973.getClass(), "id", term32974);
        setField(term32973, term32973.getClass(), "userId", term32976);
        setField(term32973, term32973.getClass(), "region", enum64);
        setField(term32973, term32973.getClass(), "bucket", "ZDhASPHjDG");
        setField(term32973, term32973.getClass(), "path", "HNVOAXYNEZ");
        setField(term33011, term33011.getClass(), "name", "gbbYBYyfvr");
        setField(term33011, term33011.getClass(), "size", term33024);
        setField(term33011, term33011.getClass(), "type", "SrWMUlbtWV");
        setField(term32973, term32973.getClass(), "meta", term33011);
        setIntField(term33039, term33039.getClass(), "year", 2018);
        setShortField(term33039, term33039.getClass(), "month", (short) 2);
        setShortField(term33039, term33039.getClass(), "day", (short) 16);
        setField(term33038, term33038.getClass(), "date", term33039);
        setByteField(term33043, term33043.getClass(), "hour", (byte) 16);
        setByteField(term33043, term33043.getClass(), "minute", (byte) 32);
        setByteField(term33043, term33043.getClass(), "second", (byte) 46);
        setIntField(term33043, term33043.getClass(), "nano", 932915298);
        setField(term33038, term33038.getClass(), "time", term33043);
        setField(term32973, term32973.getClass(), "createdAt", term33038);
        setIntField(term33049, term33049.getClass(), "year", 2013);
        setShortField(term33049, term33049.getClass(), "month", (short) 11);
        setShortField(term33049, term33049.getClass(), "day", (short) 7);
        setField(term33048, term33048.getClass(), "date", term33049);
        setByteField(term33053, term33053.getClass(), "hour", (byte) 9);
        setByteField(term33053, term33053.getClass(), "minute", (byte) 3);
        setByteField(term33053, term33053.getClass(), "second", (byte) 32);
        setIntField(term33053, term33053.getClass(), "nano", 53548583);
        setField(term33048, term33048.getClass(), "time", term33053);
        setField(term32973, term32973.getClass(), "updatedAt", term33048);
        setField(term32973, term32973.getClass(), "url", "VePIumgrrU");
        setField(term32973, term32973.getClass(), "thumbs", term33070);
        setField(term32888, term32888.getClass(), "avatar", term32973);
        setField(term33078, term33078.getClass(), "id", term33079);
        setField(term33078, term33078.getClass(), "userId", term33081);
        setField(term33078, term33078.getClass(), "postCount", term33083);
        setField(term33078, term33078.getClass(), "likeCount", term33085);
        setField(term33078, term33078.getClass(), "followingCount", term33087);
        setField(term33078, term33078.getClass(), "followerCount", term33089);
        setIntField(term33092, term33092.getClass(), "year", 2024);
        setShortField(term33092, term33092.getClass(), "month", (short) 11);
        setShortField(term33092, term33092.getClass(), "day", (short) 26);
        setField(term33091, term33091.getClass(), "date", term33092);
        setByteField(term33096, term33096.getClass(), "hour", (byte) 3);
        setByteField(term33096, term33096.getClass(), "minute", (byte) 8);
        setByteField(term33096, term33096.getClass(), "second", (byte) 47);
        setIntField(term33096, term33096.getClass(), "nano", 559634968);
        setField(term33091, term33091.getClass(), "time", term33096);
        setField(term33078, term33078.getClass(), "createdAt", term33091);
        setIntField(term33102, term33102.getClass(), "year", 2018);
        setShortField(term33102, term33102.getClass(), "month", (short) 4);
        setShortField(term33102, term33102.getClass(), "day", (short) 20);
        setField(term33101, term33101.getClass(), "date", term33102);
        setByteField(term33106, term33106.getClass(), "hour", (byte) 16);
        setByteField(term33106, term33106.getClass(), "minute", (byte) 13);
        setByteField(term33106, term33106.getClass(), "second", (byte) 15);
        setIntField(term33106, term33106.getClass(), "nano", 195741881);
        setField(term33101, term33101.getClass(), "time", term33106);
        setField(term33078, term33078.getClass(), "updatedAt", term33101);
        setField(term32888, term32888.getClass(), "stat", term33078);
        setField(term32888, term32888.getClass(), "following", term33111);
        term33113 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term33114 = newInstance(Class.forName("java.time.LocalDate"));
        Object term33118 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term33114, term33114.getClass(), "year", 2026);
        setShortField(term33114, term33114.getClass(), "month", (short) 2);
        setShortField(term33114, term33114.getClass(), "day", (short) 26);
        setField(term33113, term33113.getClass(), "date", term33114);
        setByteField(term33118, term33118.getClass(), "hour", (byte) 12);
        setByteField(term33118, term33118.getClass(), "minute", (byte) 23);
        setByteField(term33118, term33118.getClass(), "second", (byte) 14);
        setIntField(term33118, term33118.getClass(), "nano", 86303611);
        setField(term33113, term33113.getClass(), "time", term33118);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserDTO$UserDTOBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term33113;
        callMethod(klass, "createdAt", argTypes, term32888, args);
    }

};


