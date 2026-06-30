package icu.samnyan.aqua.api.model.resp.sega.chuni.v2;

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
import static icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class RecentResp_getCharacterId_121596807127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47589;

    public RecentResp_getCharacterId_121596807127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47589 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp"));
        Object term47590 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term47591 = newInstance(Class.forName("java.time.LocalDate"));
        Object term47595 = newInstance(Class.forName("java.time.LocalTime"));
        Object term47600 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term47601 = newInstance(Class.forName("java.time.LocalDate"));
        Object term47605 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term47591, term47591.getClass(), "year", 2026);
        setShortField(term47591, term47591.getClass(), "month", (short) 10);
        setShortField(term47591, term47591.getClass(), "day", (short) 26);
        setField(term47590, term47590.getClass(), "date", term47591);
        setByteField(term47595, term47595.getClass(), "hour", (byte) 16);
        setByteField(term47595, term47595.getClass(), "minute", (byte) 45);
        setByteField(term47595, term47595.getClass(), "second", (byte) 43);
        setIntField(term47595, term47595.getClass(), "nano", 206234347);
        setField(term47590, term47590.getClass(), "time", term47595);
        setField(term47589, term47589.getClass(), "playDate", term47590);
        setIntField(term47601, term47601.getClass(), "year", 2024);
        setShortField(term47601, term47601.getClass(), "month", (short) 3);
        setShortField(term47601, term47601.getClass(), "day", (short) 27);
        setField(term47600, term47600.getClass(), "date", term47601);
        setByteField(term47605, term47605.getClass(), "hour", (byte) 23);
        setByteField(term47605, term47605.getClass(), "minute", (byte) 48);
        setByteField(term47605, term47605.getClass(), "second", (byte) 45);
        setIntField(term47605, term47605.getClass(), "nano", 181365728);
        setField(term47600, term47600.getClass(), "time", term47605);
        setField(term47589, term47589.getClass(), "userPlayDate", term47600);
        setIntField(term47589, term47589.getClass(), "musicId", -1044762733);
        setIntField(term47589, term47589.getClass(), "level", 446184231);
        setIntField(term47589, term47589.getClass(), "customId", 1313599240);
        setIntField(term47589, term47589.getClass(), "playedCustom1", 1889501733);
        setIntField(term47589, term47589.getClass(), "playedCustom2", 1316243148);
        setIntField(term47589, term47589.getClass(), "playedCustom3", 1524913540);
        setIntField(term47589, term47589.getClass(), "track", -1924743705);
        setIntField(term47589, term47589.getClass(), "score", -1829672767);
        setIntField(term47589, term47589.getClass(), "rank", -311098933);
        setIntField(term47589, term47589.getClass(), "maxCombo", -1778687889);
        setIntField(term47589, term47589.getClass(), "maxChain", -1827662352);
        setIntField(term47589, term47589.getClass(), "rateTap", -1292290537);
        setIntField(term47589, term47589.getClass(), "rateHold", 1060963259);
        setIntField(term47589, term47589.getClass(), "rateSlide", -1275604693);
        setIntField(term47589, term47589.getClass(), "rateAir", 455869012);
        setIntField(term47589, term47589.getClass(), "rateFlick", 782841747);
        setIntField(term47589, term47589.getClass(), "judgeGuilty", 744634969);
        setIntField(term47589, term47589.getClass(), "judgeAttack", -13561953);
        setIntField(term47589, term47589.getClass(), "judgeJustice", 2069622671);
        setIntField(term47589, term47589.getClass(), "judgeCritical", 86341231);
        setIntField(term47589, term47589.getClass(), "playerRating", -926119173);
        setBooleanField(term47589, term47589.getClass(), "isNewRecord", true);
        setBooleanField(term47589, term47589.getClass(), "isFullCombo", false);
        setIntField(term47589, term47589.getClass(), "fullChainKind", 1613936898);
        setBooleanField(term47589, term47589.getClass(), "isAllJustice", false);
        setIntField(term47589, term47589.getClass(), "characterId", -406599151);
        setIntField(term47589, term47589.getClass(), "skillId", -1421272179);
        setIntField(term47589, term47589.getClass(), "playKind", -2019439660);
        setBooleanField(term47589, term47589.getClass(), "isClear", true);
        setIntField(term47589, term47589.getClass(), "skillLevel", 1037621714);
        setIntField(term47589, term47589.getClass(), "skillEffect", 1072685856);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCharacterId", argTypes, term47589, args);
    }

};


