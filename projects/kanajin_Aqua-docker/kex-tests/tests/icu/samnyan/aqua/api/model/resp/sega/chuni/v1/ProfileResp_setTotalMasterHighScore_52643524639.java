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

public class ProfileResp_setTotalMasterHighScore_52643524639 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3312;
     Object term3375;

    public ProfileResp_setTotalMasterHighScore_52643524639() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3312 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ProfileResp"));
        Object term3354 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3355 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3359 = newInstance(Class.forName("java.time.LocalTime"));
        Object term3364 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3365 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3369 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term3312, term3312.getClass(), "userName", "idgaQsnJpQ");
        setIntField(term3312, term3312.getClass(), "level", -941356098);
        setField(term3312, term3312.getClass(), "exp", "VgZnGoIFwQ");
        setLongField(term3312, term3312.getClass(), "point", 3423965054378869855L);
        setLongField(term3312, term3312.getClass(), "totalPoint", -593735869267672817L);
        setIntField(term3312, term3312.getClass(), "playCount", -201517446);
        setIntField(term3312, term3312.getClass(), "playerRating", -97742366);
        setIntField(term3312, term3312.getClass(), "highestRating", 1638851942);
        setIntField(term3312, term3312.getClass(), "nameplateId", 1374790203);
        setIntField(term3312, term3312.getClass(), "frameId", 1160010161);
        setIntField(term3312, term3312.getClass(), "characterId", -423900705);
        setIntField(term3312, term3312.getClass(), "trophyId", -525570815);
        setIntField(term3312, term3312.getClass(), "totalMapNum", 754055848);
        setLongField(term3312, term3312.getClass(), "totalHiScore", 6041374912351843923L);
        setLongField(term3312, term3312.getClass(), "totalBasicHighScore", 2535970782317488741L);
        setLongField(term3312, term3312.getClass(), "totalAdvancedHighScore", -5258945362776941718L);
        setLongField(term3312, term3312.getClass(), "totalExpertHighScore", 24067105862153728L);
        setLongField(term3312, term3312.getClass(), "totalMasterHighScore", -8477368071089201577L);
        setIntField(term3312, term3312.getClass(), "friendCount", -19246901);
        setIntField(term3355, term3355.getClass(), "year", 2020);
        setShortField(term3355, term3355.getClass(), "month", (short) 8);
        setShortField(term3355, term3355.getClass(), "day", (short) 16);
        setField(term3354, term3354.getClass(), "date", term3355);
        setByteField(term3359, term3359.getClass(), "hour", (byte) 4);
        setByteField(term3359, term3359.getClass(), "minute", (byte) 37);
        setByteField(term3359, term3359.getClass(), "second", (byte) 19);
        setIntField(term3359, term3359.getClass(), "nano", 605410923);
        setField(term3354, term3354.getClass(), "time", term3359);
        setField(term3312, term3312.getClass(), "firstPlayDate", term3354);
        setIntField(term3365, term3365.getClass(), "year", 2028);
        setShortField(term3365, term3365.getClass(), "month", (short) 5);
        setShortField(term3365, term3365.getClass(), "day", (short) 2);
        setField(term3364, term3364.getClass(), "date", term3365);
        setByteField(term3369, term3369.getClass(), "hour", (byte) 2);
        setByteField(term3369, term3369.getClass(), "minute", (byte) 59);
        setByteField(term3369, term3369.getClass(), "second", (byte) 30);
        setIntField(term3369, term3369.getClass(), "nano", 222274238);
        setField(term3364, term3364.getClass(), "time", term3369);
        setField(term3312, term3312.getClass(), "lastPlayDate", term3364);
        setIntField(term3312, term3312.getClass(), "courseClass", -370828664);
        term3375 = new Long(-1526729287349763895L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ProfileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term3375;
        callMethod(klass, "setTotalMasterHighScore", argTypes, term3312, args);
    }

};


