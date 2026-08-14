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

public class UserDTO_getUsername_10415804234 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1239;

    public UserDTO_getUsername_10415804234() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1240 = new Long(2486810210675247493L);
        Long term1290 = new Long(7009926388951271268L);
        Long term1325 = new Long(-7672528020740371001L);
        Long term1327 = new Long(-4502405999831680926L);
        Class<? extends Object> term1515 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term1514 = ((Class) term1515).getDeclaredField((String) "LOCAL");
        ((Field) term1514).setAccessible(true);
        Object enum2 = ((Field) term1514).get((Object) null);
        Long term1375 = new Long(1967728129628047933L);
        HashMap term1421 = new HashMap();
        Long term1430 = new Long(2120084523938730454L);
        Long term1432 = new Long(6855071767938501807L);
        Long term1434 = new Long(-5892135042702373494L);
        Long term1436 = new Long(5262507301787091109L);
        Long term1438 = new Long(-6823727938421990489L);
        Long term1440 = new Long(-484994522244390100L);
        Boolean term1462 = new Boolean(false);
        term1239 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserDTO"));
        Object term1304 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1305 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1309 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1314 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1315 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1319 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1324 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.FileDTO"));
        Object term1362 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        Object term1389 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1390 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1394 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1399 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1400 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1404 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1429 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserStatDTO"));
        Object term1442 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1443 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1447 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1452 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1453 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1457 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1239, term1239.getClass(), "id", term1240);
        setField(term1239, term1239.getClass(), "username", "OclPbYPkcH");
        setField(term1239, term1239.getClass(), "password", "IoAlmYsBwc");
        setField(term1239, term1239.getClass(), "mobile", "TEParAifyi");
        setField(term1239, term1239.getClass(), "email", "OWDIEULEFu");
        setField(term1239, term1239.getClass(), "avatarId", term1290);
        setField(term1239, term1239.getClass(), "intro", "dWRymuLBtr");
        setIntField(term1305, term1305.getClass(), "year", 2012);
        setShortField(term1305, term1305.getClass(), "month", (short) 2);
        setShortField(term1305, term1305.getClass(), "day", (short) 19);
        setField(term1304, term1304.getClass(), "date", term1305);
        setByteField(term1309, term1309.getClass(), "hour", (byte) 8);
        setByteField(term1309, term1309.getClass(), "minute", (byte) 4);
        setByteField(term1309, term1309.getClass(), "second", (byte) 43);
        setIntField(term1309, term1309.getClass(), "nano", 114930008);
        setField(term1304, term1304.getClass(), "time", term1309);
        setField(term1239, term1239.getClass(), "createdAt", term1304);
        setIntField(term1315, term1315.getClass(), "year", 2017);
        setShortField(term1315, term1315.getClass(), "month", (short) 6);
        setShortField(term1315, term1315.getClass(), "day", (short) 8);
        setField(term1314, term1314.getClass(), "date", term1315);
        setByteField(term1319, term1319.getClass(), "hour", (byte) 0);
        setByteField(term1319, term1319.getClass(), "minute", (byte) 18);
        setByteField(term1319, term1319.getClass(), "second", (byte) 55);
        setIntField(term1319, term1319.getClass(), "nano", 680586717);
        setField(term1314, term1314.getClass(), "time", term1319);
        setField(term1239, term1239.getClass(), "updatedAt", term1314);
        setField(term1324, term1324.getClass(), "id", term1325);
        setField(term1324, term1324.getClass(), "userId", term1327);
        setField(term1324, term1324.getClass(), "region", enum2);
        setField(term1324, term1324.getClass(), "bucket", "AijpHYOFuy");
        setField(term1324, term1324.getClass(), "path", "SbAoxhfrkn");
        setField(term1362, term1362.getClass(), "name", "kuTXqwMtDB");
        setField(term1362, term1362.getClass(), "size", term1375);
        setField(term1362, term1362.getClass(), "type", "Ghbwtircqb");
        setField(term1324, term1324.getClass(), "meta", term1362);
        setIntField(term1390, term1390.getClass(), "year", 2015);
        setShortField(term1390, term1390.getClass(), "month", (short) 9);
        setShortField(term1390, term1390.getClass(), "day", (short) 16);
        setField(term1389, term1389.getClass(), "date", term1390);
        setByteField(term1394, term1394.getClass(), "hour", (byte) 6);
        setByteField(term1394, term1394.getClass(), "minute", (byte) 19);
        setByteField(term1394, term1394.getClass(), "second", (byte) 42);
        setIntField(term1394, term1394.getClass(), "nano", 630084975);
        setField(term1389, term1389.getClass(), "time", term1394);
        setField(term1324, term1324.getClass(), "createdAt", term1389);
        setIntField(term1400, term1400.getClass(), "year", 2029);
        setShortField(term1400, term1400.getClass(), "month", (short) 6);
        setShortField(term1400, term1400.getClass(), "day", (short) 23);
        setField(term1399, term1399.getClass(), "date", term1400);
        setByteField(term1404, term1404.getClass(), "hour", (byte) 21);
        setByteField(term1404, term1404.getClass(), "minute", (byte) 55);
        setByteField(term1404, term1404.getClass(), "second", (byte) 27);
        setIntField(term1404, term1404.getClass(), "nano", 66889274);
        setField(term1399, term1399.getClass(), "time", term1404);
        setField(term1324, term1324.getClass(), "updatedAt", term1399);
        setField(term1324, term1324.getClass(), "url", "xrwlQZdwCp");
        setField(term1324, term1324.getClass(), "thumbs", term1421);
        setField(term1239, term1239.getClass(), "avatar", term1324);
        setField(term1429, term1429.getClass(), "id", term1430);
        setField(term1429, term1429.getClass(), "userId", term1432);
        setField(term1429, term1429.getClass(), "postCount", term1434);
        setField(term1429, term1429.getClass(), "likeCount", term1436);
        setField(term1429, term1429.getClass(), "followingCount", term1438);
        setField(term1429, term1429.getClass(), "followerCount", term1440);
        setIntField(term1443, term1443.getClass(), "year", 2017);
        setShortField(term1443, term1443.getClass(), "month", (short) 3);
        setShortField(term1443, term1443.getClass(), "day", (short) 5);
        setField(term1442, term1442.getClass(), "date", term1443);
        setByteField(term1447, term1447.getClass(), "hour", (byte) 20);
        setByteField(term1447, term1447.getClass(), "minute", (byte) 34);
        setByteField(term1447, term1447.getClass(), "second", (byte) 55);
        setIntField(term1447, term1447.getClass(), "nano", 78024496);
        setField(term1442, term1442.getClass(), "time", term1447);
        setField(term1429, term1429.getClass(), "createdAt", term1442);
        setIntField(term1453, term1453.getClass(), "year", 2020);
        setShortField(term1453, term1453.getClass(), "month", (short) 7);
        setShortField(term1453, term1453.getClass(), "day", (short) 24);
        setField(term1452, term1452.getClass(), "date", term1453);
        setByteField(term1457, term1457.getClass(), "hour", (byte) 0);
        setByteField(term1457, term1457.getClass(), "minute", (byte) 59);
        setByteField(term1457, term1457.getClass(), "second", (byte) 56);
        setIntField(term1457, term1457.getClass(), "nano", 320219201);
        setField(term1452, term1452.getClass(), "time", term1457);
        setField(term1429, term1429.getClass(), "updatedAt", term1452);
        setField(term1239, term1239.getClass(), "stat", term1429);
        setField(term1239, term1239.getClass(), "following", term1462);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUsername", argTypes, term1239, args);
    }

};


