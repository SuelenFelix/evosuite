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

public class ProfileResp_getExp_11681948442 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term167;

    public ProfileResp_getExp_11681948442() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term167 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ProfileResp"));
        Object term209 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term210 = newInstance(Class.forName("java.time.LocalDate"));
        Object term214 = newInstance(Class.forName("java.time.LocalTime"));
        Object term219 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term220 = newInstance(Class.forName("java.time.LocalDate"));
        Object term224 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term167, term167.getClass(), "userName", "jJCZpVmanW");
        setIntField(term167, term167.getClass(), "level", -2068769794);
        setField(term167, term167.getClass(), "exp", "EGtDIRbSSb");
        setLongField(term167, term167.getClass(), "point", -5476826692763582090L);
        setLongField(term167, term167.getClass(), "totalPoint", -872011222785455006L);
        setIntField(term167, term167.getClass(), "playCount", -117576464);
        setIntField(term167, term167.getClass(), "playerRating", -1007160944);
        setIntField(term167, term167.getClass(), "highestRating", 1135664017);
        setIntField(term167, term167.getClass(), "nameplateId", 590364439);
        setIntField(term167, term167.getClass(), "frameId", 865208305);
        setIntField(term167, term167.getClass(), "characterId", -1275173084);
        setIntField(term167, term167.getClass(), "trophyId", -244121226);
        setIntField(term167, term167.getClass(), "totalMapNum", -203030934);
        setLongField(term167, term167.getClass(), "totalHiScore", -316468845751588286L);
        setLongField(term167, term167.getClass(), "totalBasicHighScore", 5127676408959197577L);
        setLongField(term167, term167.getClass(), "totalAdvancedHighScore", -6573104506744284592L);
        setLongField(term167, term167.getClass(), "totalExpertHighScore", -4920224193275732920L);
        setLongField(term167, term167.getClass(), "totalMasterHighScore", 8428634514691209827L);
        setIntField(term167, term167.getClass(), "friendCount", -1179120542);
        setIntField(term210, term210.getClass(), "year", 2022);
        setShortField(term210, term210.getClass(), "month", (short) 2);
        setShortField(term210, term210.getClass(), "day", (short) 26);
        setField(term209, term209.getClass(), "date", term210);
        setByteField(term214, term214.getClass(), "hour", (byte) 11);
        setByteField(term214, term214.getClass(), "minute", (byte) 42);
        setByteField(term214, term214.getClass(), "second", (byte) 15);
        setIntField(term214, term214.getClass(), "nano", 377731937);
        setField(term209, term209.getClass(), "time", term214);
        setField(term167, term167.getClass(), "firstPlayDate", term209);
        setIntField(term220, term220.getClass(), "year", 2026);
        setShortField(term220, term220.getClass(), "month", (short) 12);
        setShortField(term220, term220.getClass(), "day", (short) 14);
        setField(term219, term219.getClass(), "date", term220);
        setByteField(term224, term224.getClass(), "hour", (byte) 16);
        setByteField(term224, term224.getClass(), "minute", (byte) 34);
        setByteField(term224, term224.getClass(), "second", (byte) 9);
        setIntField(term224, term224.getClass(), "nano", 518326996);
        setField(term219, term219.getClass(), "time", term224);
        setField(term167, term167.getClass(), "lastPlayDate", term219);
        setIntField(term167, term167.getClass(), "courseClass", -73683645);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ProfileResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExp", argTypes, term167, args);
    }

};


