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
import java.lang.Long;

public class ProfileResp_setTotalBasicHighScore_102599450636 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3057;
     Object term3120;

    public ProfileResp_setTotalBasicHighScore_102599450636() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3057 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ProfileResp"));
        Object term3099 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3100 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3104 = newInstance(Class.forName("java.time.LocalTime"));
        Object term3109 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3110 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3114 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term3057, term3057.getClass(), "userName", "HqBOwkVqjD");
        setIntField(term3057, term3057.getClass(), "level", 917513193);
        setField(term3057, term3057.getClass(), "exp", "MAcUBcBckh");
        setLongField(term3057, term3057.getClass(), "point", -88538481937688851L);
        setLongField(term3057, term3057.getClass(), "totalPoint", 4069264186851023313L);
        setIntField(term3057, term3057.getClass(), "playCount", 787278105);
        setIntField(term3057, term3057.getClass(), "playerRating", -2063843486);
        setIntField(term3057, term3057.getClass(), "highestRating", 833762980);
        setIntField(term3057, term3057.getClass(), "nameplateId", 320711637);
        setIntField(term3057, term3057.getClass(), "frameId", 1241164745);
        setIntField(term3057, term3057.getClass(), "characterId", 1723148410);
        setIntField(term3057, term3057.getClass(), "trophyId", -920797484);
        setIntField(term3057, term3057.getClass(), "totalMapNum", -1631697577);
        setLongField(term3057, term3057.getClass(), "totalHiScore", 5184635470881147510L);
        setLongField(term3057, term3057.getClass(), "totalBasicHighScore", 918397384129253729L);
        setLongField(term3057, term3057.getClass(), "totalAdvancedHighScore", -2187638136407967948L);
        setLongField(term3057, term3057.getClass(), "totalExpertHighScore", 8708846223293804408L);
        setLongField(term3057, term3057.getClass(), "totalMasterHighScore", -2986201902216133814L);
        setIntField(term3057, term3057.getClass(), "friendCount", 765731371);
        setIntField(term3100, term3100.getClass(), "year", 2022);
        setShortField(term3100, term3100.getClass(), "month", (short) 11);
        setShortField(term3100, term3100.getClass(), "day", (short) 10);
        setField(term3099, term3099.getClass(), "date", term3100);
        setByteField(term3104, term3104.getClass(), "hour", (byte) 20);
        setByteField(term3104, term3104.getClass(), "minute", (byte) 8);
        setByteField(term3104, term3104.getClass(), "second", (byte) 35);
        setIntField(term3104, term3104.getClass(), "nano", 658416570);
        setField(term3099, term3099.getClass(), "time", term3104);
        setField(term3057, term3057.getClass(), "firstPlayDate", term3099);
        setIntField(term3110, term3110.getClass(), "year", 2018);
        setShortField(term3110, term3110.getClass(), "month", (short) 11);
        setShortField(term3110, term3110.getClass(), "day", (short) 9);
        setField(term3109, term3109.getClass(), "date", term3110);
        setByteField(term3114, term3114.getClass(), "hour", (byte) 6);
        setByteField(term3114, term3114.getClass(), "minute", (byte) 8);
        setByteField(term3114, term3114.getClass(), "second", (byte) 32);
        setIntField(term3114, term3114.getClass(), "nano", 750733310);
        setField(term3109, term3109.getClass(), "time", term3114);
        setField(term3057, term3057.getClass(), "lastPlayDate", term3109);
        setIntField(term3057, term3057.getClass(), "courseClass", -1703035419);
        term3120 = new Long(4255811647459029682L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ProfileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term3120;
        callMethod(klass, "setTotalBasicHighScore", argTypes, term3057, args);
    }

};


