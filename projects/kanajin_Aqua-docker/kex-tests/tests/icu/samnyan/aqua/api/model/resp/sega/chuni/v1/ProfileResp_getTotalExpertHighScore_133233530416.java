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

public class ProfileResp_getTotalExpertHighScore_133233530416 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1329;

    public ProfileResp_getTotalExpertHighScore_133233530416() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1329 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ProfileResp"));
        Object term1371 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1372 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1376 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1381 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1382 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1386 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1329, term1329.getClass(), "userName", "AijpHYOFuy");
        setIntField(term1329, term1329.getClass(), "level", -2066804303);
        setField(term1329, term1329.getClass(), "exp", "SbAoxhfrkn");
        setLongField(term1329, term1329.getClass(), "point", -6950146046121430355L);
        setLongField(term1329, term1329.getClass(), "totalPoint", 1667122142089513324L);
        setIntField(term1329, term1329.getClass(), "playCount", -1731761810);
        setIntField(term1329, term1329.getClass(), "playerRating", 197109649);
        setIntField(term1329, term1329.getClass(), "highestRating", -1239406390);
        setIntField(term1329, term1329.getClass(), "nameplateId", 1557431527);
        setIntField(term1329, term1329.getClass(), "frameId", -1504890659);
        setIntField(term1329, term1329.getClass(), "characterId", 1358829571);
        setIntField(term1329, term1329.getClass(), "trophyId", 991356662);
        setIntField(term1329, term1329.getClass(), "totalMapNum", -506958186);
        setLongField(term1329, term1329.getClass(), "totalHiScore", -6342139649364011743L);
        setLongField(term1329, term1329.getClass(), "totalBasicHighScore", -4924950707540628022L);
        setLongField(term1329, term1329.getClass(), "totalAdvancedHighScore", -4393710401270724527L);
        setLongField(term1329, term1329.getClass(), "totalExpertHighScore", -4822736661741380518L);
        setLongField(term1329, term1329.getClass(), "totalMasterHighScore", -5386201758403679145L);
        setIntField(term1329, term1329.getClass(), "friendCount", -507387516);
        setIntField(term1372, term1372.getClass(), "year", 2012);
        setShortField(term1372, term1372.getClass(), "month", (short) 3);
        setShortField(term1372, term1372.getClass(), "day", (short) 27);
        setField(term1371, term1371.getClass(), "date", term1372);
        setByteField(term1376, term1376.getClass(), "hour", (byte) 17);
        setByteField(term1376, term1376.getClass(), "minute", (byte) 49);
        setByteField(term1376, term1376.getClass(), "second", (byte) 24);
        setIntField(term1376, term1376.getClass(), "nano", 530647398);
        setField(term1371, term1371.getClass(), "time", term1376);
        setField(term1329, term1329.getClass(), "firstPlayDate", term1371);
        setIntField(term1382, term1382.getClass(), "year", 2010);
        setShortField(term1382, term1382.getClass(), "month", (short) 6);
        setShortField(term1382, term1382.getClass(), "day", (short) 14);
        setField(term1381, term1381.getClass(), "date", term1382);
        setByteField(term1386, term1386.getClass(), "hour", (byte) 6);
        setByteField(term1386, term1386.getClass(), "minute", (byte) 22);
        setByteField(term1386, term1386.getClass(), "second", (byte) 20);
        setIntField(term1386, term1386.getClass(), "nano", 25133051);
        setField(term1381, term1381.getClass(), "time", term1386);
        setField(term1329, term1329.getClass(), "lastPlayDate", term1381);
        setIntField(term1329, term1329.getClass(), "courseClass", -1970452551);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ProfileResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalExpertHighScore", argTypes, term1329, args);
    }

};


