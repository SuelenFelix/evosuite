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

public class ProfileResp_toString_99034915347 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4004;

    public ProfileResp_toString_99034915347() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4004 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ProfileResp"));
        Object term4046 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4047 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4051 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4056 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4057 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4061 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term4004, term4004.getClass(), "userName", "XqgfKFvPSD");
        setIntField(term4004, term4004.getClass(), "level", 514511037);
        setField(term4004, term4004.getClass(), "exp", "JiVRgTZvKc");
        setLongField(term4004, term4004.getClass(), "point", 146749226579788091L);
        setLongField(term4004, term4004.getClass(), "totalPoint", -1279670138064751276L);
        setIntField(term4004, term4004.getClass(), "playCount", 1713573821);
        setIntField(term4004, term4004.getClass(), "playerRating", 1956590498);
        setIntField(term4004, term4004.getClass(), "highestRating", 1467356494);
        setIntField(term4004, term4004.getClass(), "nameplateId", -26316536);
        setIntField(term4004, term4004.getClass(), "frameId", 1716165145);
        setIntField(term4004, term4004.getClass(), "characterId", 1692937831);
        setIntField(term4004, term4004.getClass(), "trophyId", -1539747985);
        setIntField(term4004, term4004.getClass(), "totalMapNum", -1982489643);
        setLongField(term4004, term4004.getClass(), "totalHiScore", -7205236974351118210L);
        setLongField(term4004, term4004.getClass(), "totalBasicHighScore", -2136893352275781569L);
        setLongField(term4004, term4004.getClass(), "totalAdvancedHighScore", -9147545274054597570L);
        setLongField(term4004, term4004.getClass(), "totalExpertHighScore", -8398381579707958144L);
        setLongField(term4004, term4004.getClass(), "totalMasterHighScore", -2195061939206930224L);
        setIntField(term4004, term4004.getClass(), "friendCount", 550892835);
        setIntField(term4047, term4047.getClass(), "year", 2016);
        setShortField(term4047, term4047.getClass(), "month", (short) 6);
        setShortField(term4047, term4047.getClass(), "day", (short) 23);
        setField(term4046, term4046.getClass(), "date", term4047);
        setByteField(term4051, term4051.getClass(), "hour", (byte) 20);
        setByteField(term4051, term4051.getClass(), "minute", (byte) 51);
        setByteField(term4051, term4051.getClass(), "second", (byte) 43);
        setIntField(term4051, term4051.getClass(), "nano", 284389409);
        setField(term4046, term4046.getClass(), "time", term4051);
        setField(term4004, term4004.getClass(), "firstPlayDate", term4046);
        setIntField(term4057, term4057.getClass(), "year", 2014);
        setShortField(term4057, term4057.getClass(), "month", (short) 10);
        setShortField(term4057, term4057.getClass(), "day", (short) 7);
        setField(term4056, term4056.getClass(), "date", term4057);
        setByteField(term4061, term4061.getClass(), "hour", (byte) 12);
        setByteField(term4061, term4061.getClass(), "minute", (byte) 59);
        setByteField(term4061, term4061.getClass(), "second", (byte) 39);
        setIntField(term4061, term4061.getClass(), "nano", 603709306);
        setField(term4056, term4056.getClass(), "time", term4061);
        setField(term4004, term4004.getClass(), "lastPlayDate", term4056);
        setIntField(term4004, term4004.getClass(), "courseClass", 1237549886);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ProfileResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term4004, args);
    }

};


