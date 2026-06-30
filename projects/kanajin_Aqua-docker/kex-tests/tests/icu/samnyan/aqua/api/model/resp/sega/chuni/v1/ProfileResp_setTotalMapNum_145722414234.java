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
import java.lang.Integer;

public class ProfileResp_setTotalMapNum_145722414234 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2887;
     Object term2950;

    public ProfileResp_setTotalMapNum_145722414234() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2887 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ProfileResp"));
        Object term2929 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2930 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2934 = newInstance(Class.forName("java.time.LocalTime"));
        Object term2939 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2940 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2944 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term2887, term2887.getClass(), "userName", "whBvTVIIlC");
        setIntField(term2887, term2887.getClass(), "level", -233024044);
        setField(term2887, term2887.getClass(), "exp", "IgRJUzaCwW");
        setLongField(term2887, term2887.getClass(), "point", -3277773415369003529L);
        setLongField(term2887, term2887.getClass(), "totalPoint", 1253549421411622358L);
        setIntField(term2887, term2887.getClass(), "playCount", 1820784228);
        setIntField(term2887, term2887.getClass(), "playerRating", 1390820006);
        setIntField(term2887, term2887.getClass(), "highestRating", -828982065);
        setIntField(term2887, term2887.getClass(), "nameplateId", 1221443226);
        setIntField(term2887, term2887.getClass(), "frameId", 908108726);
        setIntField(term2887, term2887.getClass(), "characterId", 1023209512);
        setIntField(term2887, term2887.getClass(), "trophyId", 1084849225);
        setIntField(term2887, term2887.getClass(), "totalMapNum", -1702055571);
        setLongField(term2887, term2887.getClass(), "totalHiScore", 3666226122807672448L);
        setLongField(term2887, term2887.getClass(), "totalBasicHighScore", 3108750145697087661L);
        setLongField(term2887, term2887.getClass(), "totalAdvancedHighScore", 3752337209837437327L);
        setLongField(term2887, term2887.getClass(), "totalExpertHighScore", 1860789353508856614L);
        setLongField(term2887, term2887.getClass(), "totalMasterHighScore", -7456852906235966771L);
        setIntField(term2887, term2887.getClass(), "friendCount", -944542900);
        setIntField(term2930, term2930.getClass(), "year", 2028);
        setShortField(term2930, term2930.getClass(), "month", (short) 4);
        setShortField(term2930, term2930.getClass(), "day", (short) 1);
        setField(term2929, term2929.getClass(), "date", term2930);
        setByteField(term2934, term2934.getClass(), "hour", (byte) 16);
        setByteField(term2934, term2934.getClass(), "minute", (byte) 22);
        setByteField(term2934, term2934.getClass(), "second", (byte) 32);
        setIntField(term2934, term2934.getClass(), "nano", 406353763);
        setField(term2929, term2929.getClass(), "time", term2934);
        setField(term2887, term2887.getClass(), "firstPlayDate", term2929);
        setIntField(term2940, term2940.getClass(), "year", 2019);
        setShortField(term2940, term2940.getClass(), "month", (short) 7);
        setShortField(term2940, term2940.getClass(), "day", (short) 19);
        setField(term2939, term2939.getClass(), "date", term2940);
        setByteField(term2944, term2944.getClass(), "hour", (byte) 10);
        setByteField(term2944, term2944.getClass(), "minute", (byte) 54);
        setByteField(term2944, term2944.getClass(), "second", (byte) 55);
        setIntField(term2944, term2944.getClass(), "nano", 244650454);
        setField(term2939, term2939.getClass(), "time", term2944);
        setField(term2887, term2887.getClass(), "lastPlayDate", term2939);
        setIntField(term2887, term2887.getClass(), "courseClass", 2063762142);
        term2950 = new Integer(1658391716);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ProfileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2950;
        callMethod(klass, "setTotalMapNum", argTypes, term2887, args);
    }

};


