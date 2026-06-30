package icu.samnyan.aqua.api.model.resp.sega.chuni.v1;

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
import static icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ProfileResp_setFirstPlayDate_198777587741 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3482;
     Object term3545;

    public ProfileResp_setFirstPlayDate_198777587741() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3482 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ProfileResp"));
        Object term3524 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3525 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3529 = newInstance(Class.forName("java.time.LocalTime"));
        Object term3534 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3535 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3539 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term3482, term3482.getClass(), "userName", "cAPeiZHKGJ");
        setIntField(term3482, term3482.getClass(), "level", 354196060);
        setField(term3482, term3482.getClass(), "exp", "LvJFtLBaxj");
        setLongField(term3482, term3482.getClass(), "point", -7191625829563442696L);
        setLongField(term3482, term3482.getClass(), "totalPoint", 1463379874413441830L);
        setIntField(term3482, term3482.getClass(), "playCount", -1840305774);
        setIntField(term3482, term3482.getClass(), "playerRating", 1365087144);
        setIntField(term3482, term3482.getClass(), "highestRating", -1537255112);
        setIntField(term3482, term3482.getClass(), "nameplateId", 934477462);
        setIntField(term3482, term3482.getClass(), "frameId", 4900410);
        setIntField(term3482, term3482.getClass(), "characterId", -1252345779);
        setIntField(term3482, term3482.getClass(), "trophyId", -2063365430);
        setIntField(term3482, term3482.getClass(), "totalMapNum", 812570053);
        setLongField(term3482, term3482.getClass(), "totalHiScore", 7998051124369147543L);
        setLongField(term3482, term3482.getClass(), "totalBasicHighScore", -1481367303699139651L);
        setLongField(term3482, term3482.getClass(), "totalAdvancedHighScore", -7709317346333670618L);
        setLongField(term3482, term3482.getClass(), "totalExpertHighScore", -1964501434345816975L);
        setLongField(term3482, term3482.getClass(), "totalMasterHighScore", 4689907154423223972L);
        setIntField(term3482, term3482.getClass(), "friendCount", -1488938905);
        setIntField(term3525, term3525.getClass(), "year", 2021);
        setShortField(term3525, term3525.getClass(), "month", (short) 3);
        setShortField(term3525, term3525.getClass(), "day", (short) 13);
        setField(term3524, term3524.getClass(), "date", term3525);
        setByteField(term3529, term3529.getClass(), "hour", (byte) 6);
        setByteField(term3529, term3529.getClass(), "minute", (byte) 25);
        setByteField(term3529, term3529.getClass(), "second", (byte) 42);
        setIntField(term3529, term3529.getClass(), "nano", 282924199);
        setField(term3524, term3524.getClass(), "time", term3529);
        setField(term3482, term3482.getClass(), "firstPlayDate", term3524);
        setIntField(term3535, term3535.getClass(), "year", 2020);
        setShortField(term3535, term3535.getClass(), "month", (short) 10);
        setShortField(term3535, term3535.getClass(), "day", (short) 25);
        setField(term3534, term3534.getClass(), "date", term3535);
        setByteField(term3539, term3539.getClass(), "hour", (byte) 18);
        setByteField(term3539, term3539.getClass(), "minute", (byte) 22);
        setByteField(term3539, term3539.getClass(), "second", (byte) 30);
        setIntField(term3539, term3539.getClass(), "nano", 948592965);
        setField(term3534, term3534.getClass(), "time", term3539);
        setField(term3482, term3482.getClass(), "lastPlayDate", term3534);
        setIntField(term3482, term3482.getClass(), "courseClass", 1916544127);
        term3545 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3546 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3550 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term3546, term3546.getClass(), "year", 2020);
        setShortField(term3546, term3546.getClass(), "month", (short) 5);
        setShortField(term3546, term3546.getClass(), "day", (short) 12);
        setField(term3545, term3545.getClass(), "date", term3546);
        setByteField(term3550, term3550.getClass(), "hour", (byte) 0);
        setByteField(term3550, term3550.getClass(), "minute", (byte) 15);
        setByteField(term3550, term3550.getClass(), "second", (byte) 24);
        setIntField(term3550, term3550.getClass(), "nano", 250257744);
        setField(term3545, term3545.getClass(), "time", term3550);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ProfileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term3545;
        callMethod(klass, "setFirstPlayDate", argTypes, term3482, args);
    }

};


