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

public class ProfileResp_getPlayCount_10392953175 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term416;

    public ProfileResp_getPlayCount_10392953175() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term416 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ProfileResp"));
        Object term458 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term459 = newInstance(Class.forName("java.time.LocalDate"));
        Object term463 = newInstance(Class.forName("java.time.LocalTime"));
        Object term468 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term469 = newInstance(Class.forName("java.time.LocalDate"));
        Object term473 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term416, term416.getClass(), "userName", "NRdvgJlhkX");
        setIntField(term416, term416.getClass(), "level", 292681826);
        setField(term416, term416.getClass(), "exp", "uuaPigETmJ");
        setLongField(term416, term416.getClass(), "point", 1233889271256172047L);
        setLongField(term416, term416.getClass(), "totalPoint", 6617340557564669657L);
        setIntField(term416, term416.getClass(), "playCount", 458147407);
        setIntField(term416, term416.getClass(), "playerRating", -184153539);
        setIntField(term416, term416.getClass(), "highestRating", 493620644);
        setIntField(term416, term416.getClass(), "nameplateId", 1328271830);
        setIntField(term416, term416.getClass(), "frameId", 1596070772);
        setIntField(term416, term416.getClass(), "characterId", 97029295);
        setIntField(term416, term416.getClass(), "trophyId", -1371869594);
        setIntField(term416, term416.getClass(), "totalMapNum", -2095575670);
        setLongField(term416, term416.getClass(), "totalHiScore", 1439298019805881866L);
        setLongField(term416, term416.getClass(), "totalBasicHighScore", -8708192233349544946L);
        setLongField(term416, term416.getClass(), "totalAdvancedHighScore", 5907001541142728739L);
        setLongField(term416, term416.getClass(), "totalExpertHighScore", 4178434741742309755L);
        setLongField(term416, term416.getClass(), "totalMasterHighScore", -2068172595987555756L);
        setIntField(term416, term416.getClass(), "friendCount", 1225272962);
        setIntField(term459, term459.getClass(), "year", 2019);
        setShortField(term459, term459.getClass(), "month", (short) 2);
        setShortField(term459, term459.getClass(), "day", (short) 21);
        setField(term458, term458.getClass(), "date", term459);
        setByteField(term463, term463.getClass(), "hour", (byte) 5);
        setByteField(term463, term463.getClass(), "minute", (byte) 41);
        setByteField(term463, term463.getClass(), "second", (byte) 11);
        setIntField(term463, term463.getClass(), "nano", 859829782);
        setField(term458, term458.getClass(), "time", term463);
        setField(term416, term416.getClass(), "firstPlayDate", term458);
        setIntField(term469, term469.getClass(), "year", 2018);
        setShortField(term469, term469.getClass(), "month", (short) 9);
        setShortField(term469, term469.getClass(), "day", (short) 28);
        setField(term468, term468.getClass(), "date", term469);
        setByteField(term473, term473.getClass(), "hour", (byte) 3);
        setByteField(term473, term473.getClass(), "minute", (byte) 37);
        setByteField(term473, term473.getClass(), "second", (byte) 46);
        setIntField(term473, term473.getClass(), "nano", 763326845);
        setField(term468, term468.getClass(), "time", term473);
        setField(term416, term416.getClass(), "lastPlayDate", term468);
        setIntField(term416, term416.getClass(), "courseClass", 1324040357);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ProfileResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayCount", argTypes, term416, args);
    }

};


