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

public class RecentResp_setPlayDate_178487674933 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53071;
     Object term53123;

    public RecentResp_setPlayDate_178487674933() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53071 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp"));
        Object term53072 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term53073 = newInstance(Class.forName("java.time.LocalDate"));
        Object term53077 = newInstance(Class.forName("java.time.LocalTime"));
        Object term53082 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term53083 = newInstance(Class.forName("java.time.LocalDate"));
        Object term53087 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term53073, term53073.getClass(), "year", 2018);
        setShortField(term53073, term53073.getClass(), "month", (short) 10);
        setShortField(term53073, term53073.getClass(), "day", (short) 31);
        setField(term53072, term53072.getClass(), "date", term53073);
        setByteField(term53077, term53077.getClass(), "hour", (byte) 9);
        setByteField(term53077, term53077.getClass(), "minute", (byte) 43);
        setByteField(term53077, term53077.getClass(), "second", (byte) 37);
        setIntField(term53077, term53077.getClass(), "nano", 207857677);
        setField(term53072, term53072.getClass(), "time", term53077);
        setField(term53071, term53071.getClass(), "playDate", term53072);
        setIntField(term53083, term53083.getClass(), "year", 2026);
        setShortField(term53083, term53083.getClass(), "month", (short) 6);
        setShortField(term53083, term53083.getClass(), "day", (short) 21);
        setField(term53082, term53082.getClass(), "date", term53083);
        setByteField(term53087, term53087.getClass(), "hour", (byte) 16);
        setByteField(term53087, term53087.getClass(), "minute", (byte) 57);
        setByteField(term53087, term53087.getClass(), "second", (byte) 9);
        setIntField(term53087, term53087.getClass(), "nano", 14807006);
        setField(term53082, term53082.getClass(), "time", term53087);
        setField(term53071, term53071.getClass(), "userPlayDate", term53082);
        setIntField(term53071, term53071.getClass(), "musicId", 1253501512);
        setIntField(term53071, term53071.getClass(), "level", 594655877);
        setIntField(term53071, term53071.getClass(), "customId", 281155455);
        setIntField(term53071, term53071.getClass(), "playedCustom1", 85079003);
        setIntField(term53071, term53071.getClass(), "playedCustom2", -2010823131);
        setIntField(term53071, term53071.getClass(), "playedCustom3", -1368198865);
        setIntField(term53071, term53071.getClass(), "track", -14635574);
        setIntField(term53071, term53071.getClass(), "score", 2111644026);
        setIntField(term53071, term53071.getClass(), "rank", 1000189054);
        setIntField(term53071, term53071.getClass(), "maxCombo", 832500285);
        setIntField(term53071, term53071.getClass(), "maxChain", 1519973734);
        setIntField(term53071, term53071.getClass(), "rateTap", -988300994);
        setIntField(term53071, term53071.getClass(), "rateHold", 1939692211);
        setIntField(term53071, term53071.getClass(), "rateSlide", 121806851);
        setIntField(term53071, term53071.getClass(), "rateAir", 1753247664);
        setIntField(term53071, term53071.getClass(), "rateFlick", 521507971);
        setIntField(term53071, term53071.getClass(), "judgeGuilty", 1760654275);
        setIntField(term53071, term53071.getClass(), "judgeAttack", -1048247843);
        setIntField(term53071, term53071.getClass(), "judgeJustice", -545135207);
        setIntField(term53071, term53071.getClass(), "judgeCritical", 969786656);
        setIntField(term53071, term53071.getClass(), "playerRating", -1568320050);
        setBooleanField(term53071, term53071.getClass(), "isNewRecord", false);
        setBooleanField(term53071, term53071.getClass(), "isFullCombo", false);
        setIntField(term53071, term53071.getClass(), "fullChainKind", 398869857);
        setBooleanField(term53071, term53071.getClass(), "isAllJustice", false);
        setIntField(term53071, term53071.getClass(), "characterId", -2011847985);
        setIntField(term53071, term53071.getClass(), "skillId", 1113480119);
        setIntField(term53071, term53071.getClass(), "playKind", -159235116);
        setBooleanField(term53071, term53071.getClass(), "isClear", true);
        setIntField(term53071, term53071.getClass(), "skillLevel", 1280384723);
        setIntField(term53071, term53071.getClass(), "skillEffect", 1755299610);
        term53123 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term53124 = newInstance(Class.forName("java.time.LocalDate"));
        Object term53128 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term53124, term53124.getClass(), "year", 2014);
        setShortField(term53124, term53124.getClass(), "month", (short) 5);
        setShortField(term53124, term53124.getClass(), "day", (short) 26);
        setField(term53123, term53123.getClass(), "date", term53124);
        setByteField(term53128, term53128.getClass(), "hour", (byte) 21);
        setByteField(term53128, term53128.getClass(), "minute", (byte) 54);
        setByteField(term53128, term53128.getClass(), "second", (byte) 33);
        setIntField(term53128, term53128.getClass(), "nano", 182465793);
        setField(term53123, term53123.getClass(), "time", term53128);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term53123;
        callMethod(klass, "setPlayDate", argTypes, term53071, args);
    }

};


