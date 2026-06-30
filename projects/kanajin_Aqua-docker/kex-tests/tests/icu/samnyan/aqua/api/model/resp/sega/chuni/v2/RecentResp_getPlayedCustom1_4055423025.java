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

public class RecentResp_getPlayedCustom1_4055423025 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46445;

    public RecentResp_getPlayedCustom1_4055423025() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46445 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp"));
        Object term46446 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term46447 = newInstance(Class.forName("java.time.LocalDate"));
        Object term46451 = newInstance(Class.forName("java.time.LocalTime"));
        Object term46456 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term46457 = newInstance(Class.forName("java.time.LocalDate"));
        Object term46461 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term46447, term46447.getClass(), "year", 2019);
        setShortField(term46447, term46447.getClass(), "month", (short) 2);
        setShortField(term46447, term46447.getClass(), "day", (short) 19);
        setField(term46446, term46446.getClass(), "date", term46447);
        setByteField(term46451, term46451.getClass(), "hour", (byte) 9);
        setByteField(term46451, term46451.getClass(), "minute", (byte) 3);
        setByteField(term46451, term46451.getClass(), "second", (byte) 19);
        setIntField(term46451, term46451.getClass(), "nano", 646336873);
        setField(term46446, term46446.getClass(), "time", term46451);
        setField(term46445, term46445.getClass(), "playDate", term46446);
        setIntField(term46457, term46457.getClass(), "year", 2017);
        setShortField(term46457, term46457.getClass(), "month", (short) 2);
        setShortField(term46457, term46457.getClass(), "day", (short) 10);
        setField(term46456, term46456.getClass(), "date", term46457);
        setByteField(term46461, term46461.getClass(), "hour", (byte) 13);
        setByteField(term46461, term46461.getClass(), "minute", (byte) 52);
        setByteField(term46461, term46461.getClass(), "second", (byte) 4);
        setIntField(term46461, term46461.getClass(), "nano", 660576536);
        setField(term46456, term46456.getClass(), "time", term46461);
        setField(term46445, term46445.getClass(), "userPlayDate", term46456);
        setIntField(term46445, term46445.getClass(), "musicId", -815684619);
        setIntField(term46445, term46445.getClass(), "level", -471499395);
        setIntField(term46445, term46445.getClass(), "customId", -663671886);
        setIntField(term46445, term46445.getClass(), "playedCustom1", -1295577968);
        setIntField(term46445, term46445.getClass(), "playedCustom2", 1006574741);
        setIntField(term46445, term46445.getClass(), "playedCustom3", -1471698394);
        setIntField(term46445, term46445.getClass(), "track", 1146444085);
        setIntField(term46445, term46445.getClass(), "score", 316145449);
        setIntField(term46445, term46445.getClass(), "rank", 387128751);
        setIntField(term46445, term46445.getClass(), "maxCombo", 1220621259);
        setIntField(term46445, term46445.getClass(), "maxChain", 272507740);
        setIntField(term46445, term46445.getClass(), "rateTap", -2117539025);
        setIntField(term46445, term46445.getClass(), "rateHold", 736842788);
        setIntField(term46445, term46445.getClass(), "rateSlide", 416550042);
        setIntField(term46445, term46445.getClass(), "rateAir", 1745727714);
        setIntField(term46445, term46445.getClass(), "rateFlick", -1577886337);
        setIntField(term46445, term46445.getClass(), "judgeGuilty", -481394578);
        setIntField(term46445, term46445.getClass(), "judgeAttack", 1440683242);
        setIntField(term46445, term46445.getClass(), "judgeJustice", -1746192055);
        setIntField(term46445, term46445.getClass(), "judgeCritical", -996911099);
        setIntField(term46445, term46445.getClass(), "playerRating", -610865659);
        setBooleanField(term46445, term46445.getClass(), "isNewRecord", true);
        setBooleanField(term46445, term46445.getClass(), "isFullCombo", false);
        setIntField(term46445, term46445.getClass(), "fullChainKind", 2044119255);
        setBooleanField(term46445, term46445.getClass(), "isAllJustice", true);
        setIntField(term46445, term46445.getClass(), "characterId", -1924668199);
        setIntField(term46445, term46445.getClass(), "skillId", 903039854);
        setIntField(term46445, term46445.getClass(), "playKind", -705528573);
        setBooleanField(term46445, term46445.getClass(), "isClear", true);
        setIntField(term46445, term46445.getClass(), "skillLevel", -480070896);
        setIntField(term46445, term46445.getClass(), "skillEffect", -1811732249);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayedCustom1", argTypes, term46445, args);
    }

};


