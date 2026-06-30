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

public class RecentResp_isFullCombo_8751209624 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47433;

    public RecentResp_isFullCombo_8751209624() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47433 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp"));
        Object term47434 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term47435 = newInstance(Class.forName("java.time.LocalDate"));
        Object term47439 = newInstance(Class.forName("java.time.LocalTime"));
        Object term47444 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term47445 = newInstance(Class.forName("java.time.LocalDate"));
        Object term47449 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term47435, term47435.getClass(), "year", 2019);
        setShortField(term47435, term47435.getClass(), "month", (short) 11);
        setShortField(term47435, term47435.getClass(), "day", (short) 22);
        setField(term47434, term47434.getClass(), "date", term47435);
        setByteField(term47439, term47439.getClass(), "hour", (byte) 12);
        setByteField(term47439, term47439.getClass(), "minute", (byte) 32);
        setByteField(term47439, term47439.getClass(), "second", (byte) 48);
        setIntField(term47439, term47439.getClass(), "nano", 850810582);
        setField(term47434, term47434.getClass(), "time", term47439);
        setField(term47433, term47433.getClass(), "playDate", term47434);
        setIntField(term47445, term47445.getClass(), "year", 2024);
        setShortField(term47445, term47445.getClass(), "month", (short) 11);
        setShortField(term47445, term47445.getClass(), "day", (short) 18);
        setField(term47444, term47444.getClass(), "date", term47445);
        setByteField(term47449, term47449.getClass(), "hour", (byte) 9);
        setByteField(term47449, term47449.getClass(), "minute", (byte) 40);
        setByteField(term47449, term47449.getClass(), "second", (byte) 54);
        setIntField(term47449, term47449.getClass(), "nano", 533273343);
        setField(term47444, term47444.getClass(), "time", term47449);
        setField(term47433, term47433.getClass(), "userPlayDate", term47444);
        setIntField(term47433, term47433.getClass(), "musicId", 418080259);
        setIntField(term47433, term47433.getClass(), "level", 657195865);
        setIntField(term47433, term47433.getClass(), "customId", 1397647176);
        setIntField(term47433, term47433.getClass(), "playedCustom1", -1375675721);
        setIntField(term47433, term47433.getClass(), "playedCustom2", 456313553);
        setIntField(term47433, term47433.getClass(), "playedCustom3", 1636460194);
        setIntField(term47433, term47433.getClass(), "track", -1926178417);
        setIntField(term47433, term47433.getClass(), "score", -1011180309);
        setIntField(term47433, term47433.getClass(), "rank", -342719145);
        setIntField(term47433, term47433.getClass(), "maxCombo", 2101766592);
        setIntField(term47433, term47433.getClass(), "maxChain", 802196878);
        setIntField(term47433, term47433.getClass(), "rateTap", -174401540);
        setIntField(term47433, term47433.getClass(), "rateHold", -1881073314);
        setIntField(term47433, term47433.getClass(), "rateSlide", -1902513009);
        setIntField(term47433, term47433.getClass(), "rateAir", 1810303681);
        setIntField(term47433, term47433.getClass(), "rateFlick", 1374798468);
        setIntField(term47433, term47433.getClass(), "judgeGuilty", -425364766);
        setIntField(term47433, term47433.getClass(), "judgeAttack", -240455247);
        setIntField(term47433, term47433.getClass(), "judgeJustice", 412243891);
        setIntField(term47433, term47433.getClass(), "judgeCritical", -1517264869);
        setIntField(term47433, term47433.getClass(), "playerRating", 1498231709);
        setBooleanField(term47433, term47433.getClass(), "isNewRecord", false);
        setBooleanField(term47433, term47433.getClass(), "isFullCombo", true);
        setIntField(term47433, term47433.getClass(), "fullChainKind", -775074162);
        setBooleanField(term47433, term47433.getClass(), "isAllJustice", false);
        setIntField(term47433, term47433.getClass(), "characterId", 304255923);
        setIntField(term47433, term47433.getClass(), "skillId", 1532668668);
        setIntField(term47433, term47433.getClass(), "playKind", -100547107);
        setBooleanField(term47433, term47433.getClass(), "isClear", false);
        setIntField(term47433, term47433.getClass(), "skillLevel", 2140567451);
        setIntField(term47433, term47433.getClass(), "skillEffect", -390400057);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isFullCombo", argTypes, term47433, args);
    }

};


