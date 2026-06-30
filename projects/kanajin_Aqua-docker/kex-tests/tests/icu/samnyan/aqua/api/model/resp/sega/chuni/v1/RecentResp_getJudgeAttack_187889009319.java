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

public class RecentResp_getJudgeAttack_187889009319 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52343;

    public RecentResp_getJudgeAttack_187889009319() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52343 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp"));
        Object term52344 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term52345 = newInstance(Class.forName("java.time.LocalDate"));
        Object term52349 = newInstance(Class.forName("java.time.LocalTime"));
        Object term52354 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term52355 = newInstance(Class.forName("java.time.LocalDate"));
        Object term52359 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term52345, term52345.getClass(), "year", 2014);
        setShortField(term52345, term52345.getClass(), "month", (short) 1);
        setShortField(term52345, term52345.getClass(), "day", (short) 23);
        setField(term52344, term52344.getClass(), "date", term52345);
        setByteField(term52349, term52349.getClass(), "hour", (byte) 19);
        setByteField(term52349, term52349.getClass(), "minute", (byte) 10);
        setByteField(term52349, term52349.getClass(), "second", (byte) 5);
        setIntField(term52349, term52349.getClass(), "nano", 522099168);
        setField(term52344, term52344.getClass(), "time", term52349);
        setField(term52343, term52343.getClass(), "playDate", term52344);
        setIntField(term52355, term52355.getClass(), "year", 2024);
        setShortField(term52355, term52355.getClass(), "month", (short) 11);
        setShortField(term52355, term52355.getClass(), "day", (short) 12);
        setField(term52354, term52354.getClass(), "date", term52355);
        setByteField(term52359, term52359.getClass(), "hour", (byte) 7);
        setByteField(term52359, term52359.getClass(), "minute", (byte) 0);
        setByteField(term52359, term52359.getClass(), "second", (byte) 20);
        setIntField(term52359, term52359.getClass(), "nano", 646827761);
        setField(term52354, term52354.getClass(), "time", term52359);
        setField(term52343, term52343.getClass(), "userPlayDate", term52354);
        setIntField(term52343, term52343.getClass(), "musicId", 1619477832);
        setIntField(term52343, term52343.getClass(), "level", 611208497);
        setIntField(term52343, term52343.getClass(), "customId", 1184968868);
        setIntField(term52343, term52343.getClass(), "playedCustom1", -882725204);
        setIntField(term52343, term52343.getClass(), "playedCustom2", 912627382);
        setIntField(term52343, term52343.getClass(), "playedCustom3", -761296444);
        setIntField(term52343, term52343.getClass(), "track", -189523711);
        setIntField(term52343, term52343.getClass(), "score", 1697321852);
        setIntField(term52343, term52343.getClass(), "rank", 2107931912);
        setIntField(term52343, term52343.getClass(), "maxCombo", 198562318);
        setIntField(term52343, term52343.getClass(), "maxChain", 1164105108);
        setIntField(term52343, term52343.getClass(), "rateTap", -972073241);
        setIntField(term52343, term52343.getClass(), "rateHold", 643112473);
        setIntField(term52343, term52343.getClass(), "rateSlide", -1141492053);
        setIntField(term52343, term52343.getClass(), "rateAir", 1094053796);
        setIntField(term52343, term52343.getClass(), "rateFlick", -2097088884);
        setIntField(term52343, term52343.getClass(), "judgeGuilty", -1793718020);
        setIntField(term52343, term52343.getClass(), "judgeAttack", 1087957895);
        setIntField(term52343, term52343.getClass(), "judgeJustice", -1347788838);
        setIntField(term52343, term52343.getClass(), "judgeCritical", -83628231);
        setIntField(term52343, term52343.getClass(), "playerRating", 1337550691);
        setBooleanField(term52343, term52343.getClass(), "isNewRecord", true);
        setBooleanField(term52343, term52343.getClass(), "isFullCombo", true);
        setIntField(term52343, term52343.getClass(), "fullChainKind", 2107385711);
        setBooleanField(term52343, term52343.getClass(), "isAllJustice", true);
        setIntField(term52343, term52343.getClass(), "characterId", 986298442);
        setIntField(term52343, term52343.getClass(), "skillId", 1751660702);
        setIntField(term52343, term52343.getClass(), "playKind", 433217860);
        setBooleanField(term52343, term52343.getClass(), "isClear", true);
        setIntField(term52343, term52343.getClass(), "skillLevel", 495773924);
        setIntField(term52343, term52343.getClass(), "skillEffect", 1485597364);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getJudgeAttack", argTypes, term52343, args);
    }

};


