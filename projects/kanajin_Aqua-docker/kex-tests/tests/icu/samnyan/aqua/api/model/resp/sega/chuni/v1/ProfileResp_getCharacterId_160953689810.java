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

public class ProfileResp_getCharacterId_160953689810 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term831;

    public ProfileResp_getCharacterId_160953689810() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term831 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ProfileResp"));
        Object term873 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term874 = newInstance(Class.forName("java.time.LocalDate"));
        Object term878 = newInstance(Class.forName("java.time.LocalTime"));
        Object term883 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term884 = newInstance(Class.forName("java.time.LocalDate"));
        Object term888 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term831, term831.getClass(), "userName", "hNxWaHcfhY");
        setIntField(term831, term831.getClass(), "level", -341962980);
        setField(term831, term831.getClass(), "exp", "RkybSrpybU");
        setLongField(term831, term831.getClass(), "point", -5248475803419977214L);
        setLongField(term831, term831.getClass(), "totalPoint", -6723783499250797216L);
        setIntField(term831, term831.getClass(), "playCount", 1532716628);
        setIntField(term831, term831.getClass(), "playerRating", -1801760683);
        setIntField(term831, term831.getClass(), "highestRating", 1141317871);
        setIntField(term831, term831.getClass(), "nameplateId", 890669485);
        setIntField(term831, term831.getClass(), "frameId", 691577392);
        setIntField(term831, term831.getClass(), "characterId", -893623680);
        setIntField(term831, term831.getClass(), "trophyId", -1963434938);
        setIntField(term831, term831.getClass(), "totalMapNum", 906181092);
        setLongField(term831, term831.getClass(), "totalHiScore", 41775768178052008L);
        setLongField(term831, term831.getClass(), "totalBasicHighScore", 6682528376118987775L);
        setLongField(term831, term831.getClass(), "totalAdvancedHighScore", 682356318767179819L);
        setLongField(term831, term831.getClass(), "totalExpertHighScore", -7291743527973326814L);
        setLongField(term831, term831.getClass(), "totalMasterHighScore", -5963439350418910964L);
        setIntField(term831, term831.getClass(), "friendCount", 1045657203);
        setIntField(term874, term874.getClass(), "year", 2014);
        setShortField(term874, term874.getClass(), "month", (short) 7);
        setShortField(term874, term874.getClass(), "day", (short) 13);
        setField(term873, term873.getClass(), "date", term874);
        setByteField(term878, term878.getClass(), "hour", (byte) 21);
        setByteField(term878, term878.getClass(), "minute", (byte) 46);
        setByteField(term878, term878.getClass(), "second", (byte) 0);
        setIntField(term878, term878.getClass(), "nano", 887884128);
        setField(term873, term873.getClass(), "time", term878);
        setField(term831, term831.getClass(), "firstPlayDate", term873);
        setIntField(term884, term884.getClass(), "year", 2023);
        setShortField(term884, term884.getClass(), "month", (short) 3);
        setShortField(term884, term884.getClass(), "day", (short) 7);
        setField(term883, term883.getClass(), "date", term884);
        setByteField(term888, term888.getClass(), "hour", (byte) 21);
        setByteField(term888, term888.getClass(), "minute", (byte) 15);
        setByteField(term888, term888.getClass(), "second", (byte) 43);
        setIntField(term888, term888.getClass(), "nano", 639721472);
        setField(term883, term883.getClass(), "time", term888);
        setField(term831, term831.getClass(), "lastPlayDate", term883);
        setIntField(term831, term831.getClass(), "courseClass", 1386130016);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ProfileResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCharacterId", argTypes, term831, args);
    }

};


