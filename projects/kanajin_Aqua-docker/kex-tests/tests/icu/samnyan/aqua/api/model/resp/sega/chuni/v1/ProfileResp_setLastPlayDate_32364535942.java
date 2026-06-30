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

public class ProfileResp_setLastPlayDate_32364535942 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3575;
     Object term3638;

    public ProfileResp_setLastPlayDate_32364535942() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3575 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ProfileResp"));
        Object term3617 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3618 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3622 = newInstance(Class.forName("java.time.LocalTime"));
        Object term3627 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3628 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3632 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term3575, term3575.getClass(), "userName", "PHvxnGHptP");
        setIntField(term3575, term3575.getClass(), "level", -1133405894);
        setField(term3575, term3575.getClass(), "exp", "TimdotUuNC");
        setLongField(term3575, term3575.getClass(), "point", 8512025621149521819L);
        setLongField(term3575, term3575.getClass(), "totalPoint", 2022482096970820459L);
        setIntField(term3575, term3575.getClass(), "playCount", 1289741214);
        setIntField(term3575, term3575.getClass(), "playerRating", 243280944);
        setIntField(term3575, term3575.getClass(), "highestRating", -726681073);
        setIntField(term3575, term3575.getClass(), "nameplateId", -1724487863);
        setIntField(term3575, term3575.getClass(), "frameId", -128490829);
        setIntField(term3575, term3575.getClass(), "characterId", 202214133);
        setIntField(term3575, term3575.getClass(), "trophyId", 1543091617);
        setIntField(term3575, term3575.getClass(), "totalMapNum", -763166094);
        setLongField(term3575, term3575.getClass(), "totalHiScore", 6315101499811179240L);
        setLongField(term3575, term3575.getClass(), "totalBasicHighScore", -3033337370154155851L);
        setLongField(term3575, term3575.getClass(), "totalAdvancedHighScore", -3130003589475815807L);
        setLongField(term3575, term3575.getClass(), "totalExpertHighScore", -5344598381371854750L);
        setLongField(term3575, term3575.getClass(), "totalMasterHighScore", -3718250311794019732L);
        setIntField(term3575, term3575.getClass(), "friendCount", -222941705);
        setIntField(term3618, term3618.getClass(), "year", 2013);
        setShortField(term3618, term3618.getClass(), "month", (short) 9);
        setShortField(term3618, term3618.getClass(), "day", (short) 19);
        setField(term3617, term3617.getClass(), "date", term3618);
        setByteField(term3622, term3622.getClass(), "hour", (byte) 12);
        setByteField(term3622, term3622.getClass(), "minute", (byte) 29);
        setByteField(term3622, term3622.getClass(), "second", (byte) 28);
        setIntField(term3622, term3622.getClass(), "nano", 244069764);
        setField(term3617, term3617.getClass(), "time", term3622);
        setField(term3575, term3575.getClass(), "firstPlayDate", term3617);
        setIntField(term3628, term3628.getClass(), "year", 2025);
        setShortField(term3628, term3628.getClass(), "month", (short) 12);
        setShortField(term3628, term3628.getClass(), "day", (short) 16);
        setField(term3627, term3627.getClass(), "date", term3628);
        setByteField(term3632, term3632.getClass(), "hour", (byte) 7);
        setByteField(term3632, term3632.getClass(), "minute", (byte) 53);
        setByteField(term3632, term3632.getClass(), "second", (byte) 23);
        setIntField(term3632, term3632.getClass(), "nano", 532991944);
        setField(term3627, term3627.getClass(), "time", term3632);
        setField(term3575, term3575.getClass(), "lastPlayDate", term3627);
        setIntField(term3575, term3575.getClass(), "courseClass", 291864719);
        term3638 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3639 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3643 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term3639, term3639.getClass(), "year", 2024);
        setShortField(term3639, term3639.getClass(), "month", (short) 2);
        setShortField(term3639, term3639.getClass(), "day", (short) 5);
        setField(term3638, term3638.getClass(), "date", term3639);
        setByteField(term3643, term3643.getClass(), "hour", (byte) 12);
        setByteField(term3643, term3643.getClass(), "minute", (byte) 28);
        setByteField(term3643, term3643.getClass(), "second", (byte) 37);
        setIntField(term3643, term3643.getClass(), "nano", 689695229);
        setField(term3638, term3638.getClass(), "time", term3643);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ProfileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term3638;
        callMethod(klass, "setLastPlayDate", argTypes, term3575, args);
    }

};


