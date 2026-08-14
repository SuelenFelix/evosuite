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

public class UserDTO_UserDTOBuilder_id_2183511241 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28945;
     Object term29170;

    public UserDTO_UserDTOBuilder_id_2183511241() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term28946 = new Long(-7514437039500876647L);
        Long term28996 = new Long(204473662283899955L);
        Long term29031 = new Long(-4029227951294167228L);
        Long term29033 = new Long(5160033404788124731L);
        Class<? extends Object> term29223 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term29222 = ((Class) term29223).getDeclaredField((String) "LOCAL");
        ((Field) term29222).setAccessible(true);
        Object enum57 = ((Field) term29222).get((Object) null);
        Long term29081 = new Long(5071015720043054072L);
        HashMap term29127 = new HashMap();
        Long term29136 = new Long(-7006877527579112761L);
        Long term29138 = new Long(-8699693633047465617L);
        Long term29140 = new Long(-590890905395927244L);
        Long term29142 = new Long(6978548804004471804L);
        Long term29144 = new Long(-8957441653116712448L);
        Long term29146 = new Long(-5761087225966065493L);
        Boolean term29168 = new Boolean(true);
        term28945 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserDTO$UserDTOBuilder"));
        Object term29010 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29011 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29015 = newInstance(Class.forName("java.time.LocalTime"));
        Object term29020 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29021 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29025 = newInstance(Class.forName("java.time.LocalTime"));
        Object term29030 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.FileDTO"));
        Object term29068 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        Object term29095 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29096 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29100 = newInstance(Class.forName("java.time.LocalTime"));
        Object term29105 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29106 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29110 = newInstance(Class.forName("java.time.LocalTime"));
        Object term29135 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserStatDTO"));
        Object term29148 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29149 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29153 = newInstance(Class.forName("java.time.LocalTime"));
        Object term29158 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29159 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29163 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term28945, term28945.getClass(), "id", term28946);
        setField(term28945, term28945.getClass(), "username", "qnYaYSpDwO");
        setField(term28945, term28945.getClass(), "password", "dgbFDCdHtj");
        setField(term28945, term28945.getClass(), "mobile", "EKpdCBubDE");
        setField(term28945, term28945.getClass(), "email", "zMsSLTfGhl");
        setField(term28945, term28945.getClass(), "avatarId", term28996);
        setField(term28945, term28945.getClass(), "intro", "bEmHScVZaQ");
        setIntField(term29011, term29011.getClass(), "year", 2015);
        setShortField(term29011, term29011.getClass(), "month", (short) 4);
        setShortField(term29011, term29011.getClass(), "day", (short) 14);
        setField(term29010, term29010.getClass(), "date", term29011);
        setByteField(term29015, term29015.getClass(), "hour", (byte) 23);
        setByteField(term29015, term29015.getClass(), "minute", (byte) 8);
        setByteField(term29015, term29015.getClass(), "second", (byte) 53);
        setIntField(term29015, term29015.getClass(), "nano", 375234559);
        setField(term29010, term29010.getClass(), "time", term29015);
        setField(term28945, term28945.getClass(), "createdAt", term29010);
        setIntField(term29021, term29021.getClass(), "year", 2018);
        setShortField(term29021, term29021.getClass(), "month", (short) 1);
        setShortField(term29021, term29021.getClass(), "day", (short) 29);
        setField(term29020, term29020.getClass(), "date", term29021);
        setByteField(term29025, term29025.getClass(), "hour", (byte) 17);
        setByteField(term29025, term29025.getClass(), "minute", (byte) 5);
        setByteField(term29025, term29025.getClass(), "second", (byte) 53);
        setIntField(term29025, term29025.getClass(), "nano", 36624440);
        setField(term29020, term29020.getClass(), "time", term29025);
        setField(term28945, term28945.getClass(), "updatedAt", term29020);
        setField(term29030, term29030.getClass(), "id", term29031);
        setField(term29030, term29030.getClass(), "userId", term29033);
        setField(term29030, term29030.getClass(), "region", enum57);
        setField(term29030, term29030.getClass(), "bucket", "TcuXODkzBV");
        setField(term29030, term29030.getClass(), "path", "coJPjrBZNe");
        setField(term29068, term29068.getClass(), "name", "vMsWjuPTnO");
        setField(term29068, term29068.getClass(), "size", term29081);
        setField(term29068, term29068.getClass(), "type", "zHvfKaOstO");
        setField(term29030, term29030.getClass(), "meta", term29068);
        setIntField(term29096, term29096.getClass(), "year", 2022);
        setShortField(term29096, term29096.getClass(), "month", (short) 12);
        setShortField(term29096, term29096.getClass(), "day", (short) 22);
        setField(term29095, term29095.getClass(), "date", term29096);
        setByteField(term29100, term29100.getClass(), "hour", (byte) 18);
        setByteField(term29100, term29100.getClass(), "minute", (byte) 30);
        setByteField(term29100, term29100.getClass(), "second", (byte) 56);
        setIntField(term29100, term29100.getClass(), "nano", 111391416);
        setField(term29095, term29095.getClass(), "time", term29100);
        setField(term29030, term29030.getClass(), "createdAt", term29095);
        setIntField(term29106, term29106.getClass(), "year", 2019);
        setShortField(term29106, term29106.getClass(), "month", (short) 6);
        setShortField(term29106, term29106.getClass(), "day", (short) 22);
        setField(term29105, term29105.getClass(), "date", term29106);
        setByteField(term29110, term29110.getClass(), "hour", (byte) 9);
        setByteField(term29110, term29110.getClass(), "minute", (byte) 14);
        setByteField(term29110, term29110.getClass(), "second", (byte) 27);
        setIntField(term29110, term29110.getClass(), "nano", 124138657);
        setField(term29105, term29105.getClass(), "time", term29110);
        setField(term29030, term29030.getClass(), "updatedAt", term29105);
        setField(term29030, term29030.getClass(), "url", "tOszriqETr");
        setField(term29030, term29030.getClass(), "thumbs", term29127);
        setField(term28945, term28945.getClass(), "avatar", term29030);
        setField(term29135, term29135.getClass(), "id", term29136);
        setField(term29135, term29135.getClass(), "userId", term29138);
        setField(term29135, term29135.getClass(), "postCount", term29140);
        setField(term29135, term29135.getClass(), "likeCount", term29142);
        setField(term29135, term29135.getClass(), "followingCount", term29144);
        setField(term29135, term29135.getClass(), "followerCount", term29146);
        setIntField(term29149, term29149.getClass(), "year", 2023);
        setShortField(term29149, term29149.getClass(), "month", (short) 5);
        setShortField(term29149, term29149.getClass(), "day", (short) 8);
        setField(term29148, term29148.getClass(), "date", term29149);
        setByteField(term29153, term29153.getClass(), "hour", (byte) 6);
        setByteField(term29153, term29153.getClass(), "minute", (byte) 35);
        setByteField(term29153, term29153.getClass(), "second", (byte) 9);
        setIntField(term29153, term29153.getClass(), "nano", 577816079);
        setField(term29148, term29148.getClass(), "time", term29153);
        setField(term29135, term29135.getClass(), "createdAt", term29148);
        setIntField(term29159, term29159.getClass(), "year", 2019);
        setShortField(term29159, term29159.getClass(), "month", (short) 12);
        setShortField(term29159, term29159.getClass(), "day", (short) 13);
        setField(term29158, term29158.getClass(), "date", term29159);
        setByteField(term29163, term29163.getClass(), "hour", (byte) 7);
        setByteField(term29163, term29163.getClass(), "minute", (byte) 59);
        setByteField(term29163, term29163.getClass(), "second", (byte) 40);
        setIntField(term29163, term29163.getClass(), "nano", 824164134);
        setField(term29158, term29158.getClass(), "time", term29163);
        setField(term29135, term29135.getClass(), "updatedAt", term29158);
        setField(term28945, term28945.getClass(), "stat", term29135);
        setField(term28945, term28945.getClass(), "following", term29168);
        term29170 = new Long(493557348274366095L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserDTO$UserDTOBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term29170;
        callMethod(klass, "id", argTypes, term28945, args);
    }

};


