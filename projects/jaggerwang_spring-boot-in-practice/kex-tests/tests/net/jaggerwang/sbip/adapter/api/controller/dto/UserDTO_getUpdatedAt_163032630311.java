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

public class UserDTO_getUpdatedAt_163032630311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5068;

    public UserDTO_getUpdatedAt_163032630311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5069 = new Long(-1832940336320585644L);
        Long term5119 = new Long(-8033714905181142681L);
        Long term5154 = new Long(-9040825890007374809L);
        Long term5156 = new Long(1368340889161782793L);
        Class<? extends Object> term5344 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term5343 = ((Class) term5344).getDeclaredField((String) "LOCAL");
        ((Field) term5343).setAccessible(true);
        Object enum9 = ((Field) term5343).get((Object) null);
        Long term5204 = new Long(-5786861555969446503L);
        HashMap term5250 = new HashMap();
        Long term5259 = new Long(2354625302846375590L);
        Long term5261 = new Long(7276637106827860087L);
        Long term5263 = new Long(-3936701866695933852L);
        Long term5265 = new Long(1215116475929634177L);
        Long term5267 = new Long(1597484336218508869L);
        Long term5269 = new Long(-685023850445639859L);
        Boolean term5291 = new Boolean(true);
        term5068 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserDTO"));
        Object term5133 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5134 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5138 = newInstance(Class.forName("java.time.LocalTime"));
        Object term5143 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5144 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5148 = newInstance(Class.forName("java.time.LocalTime"));
        Object term5153 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.FileDTO"));
        Object term5191 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        Object term5218 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5219 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5223 = newInstance(Class.forName("java.time.LocalTime"));
        Object term5228 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5229 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5233 = newInstance(Class.forName("java.time.LocalTime"));
        Object term5258 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserStatDTO"));
        Object term5271 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5272 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5276 = newInstance(Class.forName("java.time.LocalTime"));
        Object term5281 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5282 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5286 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term5068, term5068.getClass(), "id", term5069);
        setField(term5068, term5068.getClass(), "username", "QXzGXbEXMu");
        setField(term5068, term5068.getClass(), "password", "qxSDVejjiY");
        setField(term5068, term5068.getClass(), "mobile", "xBsXSDjXYK");
        setField(term5068, term5068.getClass(), "email", "sEnIVFtZuQ");
        setField(term5068, term5068.getClass(), "avatarId", term5119);
        setField(term5068, term5068.getClass(), "intro", "ZVecLZMLHF");
        setIntField(term5134, term5134.getClass(), "year", 2022);
        setShortField(term5134, term5134.getClass(), "month", (short) 6);
        setShortField(term5134, term5134.getClass(), "day", (short) 20);
        setField(term5133, term5133.getClass(), "date", term5134);
        setByteField(term5138, term5138.getClass(), "hour", (byte) 7);
        setByteField(term5138, term5138.getClass(), "minute", (byte) 57);
        setByteField(term5138, term5138.getClass(), "second", (byte) 37);
        setIntField(term5138, term5138.getClass(), "nano", 90374877);
        setField(term5133, term5133.getClass(), "time", term5138);
        setField(term5068, term5068.getClass(), "createdAt", term5133);
        setIntField(term5144, term5144.getClass(), "year", 2023);
        setShortField(term5144, term5144.getClass(), "month", (short) 2);
        setShortField(term5144, term5144.getClass(), "day", (short) 16);
        setField(term5143, term5143.getClass(), "date", term5144);
        setByteField(term5148, term5148.getClass(), "hour", (byte) 3);
        setByteField(term5148, term5148.getClass(), "minute", (byte) 18);
        setByteField(term5148, term5148.getClass(), "second", (byte) 56);
        setIntField(term5148, term5148.getClass(), "nano", 733017887);
        setField(term5143, term5143.getClass(), "time", term5148);
        setField(term5068, term5068.getClass(), "updatedAt", term5143);
        setField(term5153, term5153.getClass(), "id", term5154);
        setField(term5153, term5153.getClass(), "userId", term5156);
        setField(term5153, term5153.getClass(), "region", enum9);
        setField(term5153, term5153.getClass(), "bucket", "fztQhjqwdP");
        setField(term5153, term5153.getClass(), "path", "eVpkWxjuki");
        setField(term5191, term5191.getClass(), "name", "SJiQaLvSKv");
        setField(term5191, term5191.getClass(), "size", term5204);
        setField(term5191, term5191.getClass(), "type", "OEXDRUKcFl");
        setField(term5153, term5153.getClass(), "meta", term5191);
        setIntField(term5219, term5219.getClass(), "year", 2025);
        setShortField(term5219, term5219.getClass(), "month", (short) 3);
        setShortField(term5219, term5219.getClass(), "day", (short) 28);
        setField(term5218, term5218.getClass(), "date", term5219);
        setByteField(term5223, term5223.getClass(), "hour", (byte) 19);
        setByteField(term5223, term5223.getClass(), "minute", (byte) 56);
        setByteField(term5223, term5223.getClass(), "second", (byte) 52);
        setIntField(term5223, term5223.getClass(), "nano", 738558930);
        setField(term5218, term5218.getClass(), "time", term5223);
        setField(term5153, term5153.getClass(), "createdAt", term5218);
        setIntField(term5229, term5229.getClass(), "year", 2024);
        setShortField(term5229, term5229.getClass(), "month", (short) 2);
        setShortField(term5229, term5229.getClass(), "day", (short) 29);
        setField(term5228, term5228.getClass(), "date", term5229);
        setByteField(term5233, term5233.getClass(), "hour", (byte) 17);
        setByteField(term5233, term5233.getClass(), "minute", (byte) 54);
        setByteField(term5233, term5233.getClass(), "second", (byte) 21);
        setIntField(term5233, term5233.getClass(), "nano", 605973408);
        setField(term5228, term5228.getClass(), "time", term5233);
        setField(term5153, term5153.getClass(), "updatedAt", term5228);
        setField(term5153, term5153.getClass(), "url", "RYdKCNNMBR");
        setField(term5153, term5153.getClass(), "thumbs", term5250);
        setField(term5068, term5068.getClass(), "avatar", term5153);
        setField(term5258, term5258.getClass(), "id", term5259);
        setField(term5258, term5258.getClass(), "userId", term5261);
        setField(term5258, term5258.getClass(), "postCount", term5263);
        setField(term5258, term5258.getClass(), "likeCount", term5265);
        setField(term5258, term5258.getClass(), "followingCount", term5267);
        setField(term5258, term5258.getClass(), "followerCount", term5269);
        setIntField(term5272, term5272.getClass(), "year", 2016);
        setShortField(term5272, term5272.getClass(), "month", (short) 2);
        setShortField(term5272, term5272.getClass(), "day", (short) 25);
        setField(term5271, term5271.getClass(), "date", term5272);
        setByteField(term5276, term5276.getClass(), "hour", (byte) 8);
        setByteField(term5276, term5276.getClass(), "minute", (byte) 54);
        setByteField(term5276, term5276.getClass(), "second", (byte) 40);
        setIntField(term5276, term5276.getClass(), "nano", 124525896);
        setField(term5271, term5271.getClass(), "time", term5276);
        setField(term5258, term5258.getClass(), "createdAt", term5271);
        setIntField(term5282, term5282.getClass(), "year", 2029);
        setShortField(term5282, term5282.getClass(), "month", (short) 1);
        setShortField(term5282, term5282.getClass(), "day", (short) 10);
        setField(term5281, term5281.getClass(), "date", term5282);
        setByteField(term5286, term5286.getClass(), "hour", (byte) 8);
        setByteField(term5286, term5286.getClass(), "minute", (byte) 46);
        setByteField(term5286, term5286.getClass(), "second", (byte) 35);
        setIntField(term5286, term5286.getClass(), "nano", 58807194);
        setField(term5281, term5281.getClass(), "time", term5286);
        setField(term5258, term5258.getClass(), "updatedAt", term5281);
        setField(term5068, term5068.getClass(), "stat", term5258);
        setField(term5068, term5068.getClass(), "following", term5291);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUpdatedAt", argTypes, term5068, args);
    }

};


