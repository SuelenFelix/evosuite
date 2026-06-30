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

public class RecentResp_getJudgeJustice_47082976820 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52395;

    public RecentResp_getJudgeJustice_47082976820() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52395 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp"));
        Object term52396 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term52397 = newInstance(Class.forName("java.time.LocalDate"));
        Object term52401 = newInstance(Class.forName("java.time.LocalTime"));
        Object term52406 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term52407 = newInstance(Class.forName("java.time.LocalDate"));
        Object term52411 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term52397, term52397.getClass(), "year", 2022);
        setShortField(term52397, term52397.getClass(), "month", (short) 9);
        setShortField(term52397, term52397.getClass(), "day", (short) 13);
        setField(term52396, term52396.getClass(), "date", term52397);
        setByteField(term52401, term52401.getClass(), "hour", (byte) 3);
        setByteField(term52401, term52401.getClass(), "minute", (byte) 50);
        setByteField(term52401, term52401.getClass(), "second", (byte) 35);
        setIntField(term52401, term52401.getClass(), "nano", 260929854);
        setField(term52396, term52396.getClass(), "time", term52401);
        setField(term52395, term52395.getClass(), "playDate", term52396);
        setIntField(term52407, term52407.getClass(), "year", 2022);
        setShortField(term52407, term52407.getClass(), "month", (short) 4);
        setShortField(term52407, term52407.getClass(), "day", (short) 7);
        setField(term52406, term52406.getClass(), "date", term52407);
        setByteField(term52411, term52411.getClass(), "hour", (byte) 8);
        setByteField(term52411, term52411.getClass(), "minute", (byte) 56);
        setByteField(term52411, term52411.getClass(), "second", (byte) 3);
        setIntField(term52411, term52411.getClass(), "nano", 496160001);
        setField(term52406, term52406.getClass(), "time", term52411);
        setField(term52395, term52395.getClass(), "userPlayDate", term52406);
        setIntField(term52395, term52395.getClass(), "musicId", 1232259140);
        setIntField(term52395, term52395.getClass(), "level", -1371367751);
        setIntField(term52395, term52395.getClass(), "customId", -954813389);
        setIntField(term52395, term52395.getClass(), "playedCustom1", -232542458);
        setIntField(term52395, term52395.getClass(), "playedCustom2", -106999876);
        setIntField(term52395, term52395.getClass(), "playedCustom3", -2129996761);
        setIntField(term52395, term52395.getClass(), "track", 1822990018);
        setIntField(term52395, term52395.getClass(), "score", -417542619);
        setIntField(term52395, term52395.getClass(), "rank", 562244123);
        setIntField(term52395, term52395.getClass(), "maxCombo", -1020238686);
        setIntField(term52395, term52395.getClass(), "maxChain", -1450230869);
        setIntField(term52395, term52395.getClass(), "rateTap", -785918740);
        setIntField(term52395, term52395.getClass(), "rateHold", 384642213);
        setIntField(term52395, term52395.getClass(), "rateSlide", 1673176720);
        setIntField(term52395, term52395.getClass(), "rateAir", 1084767630);
        setIntField(term52395, term52395.getClass(), "rateFlick", 1634202484);
        setIntField(term52395, term52395.getClass(), "judgeGuilty", -1738191161);
        setIntField(term52395, term52395.getClass(), "judgeAttack", 48416396);
        setIntField(term52395, term52395.getClass(), "judgeJustice", -1949441630);
        setIntField(term52395, term52395.getClass(), "judgeCritical", 1641286805);
        setIntField(term52395, term52395.getClass(), "playerRating", -370516662);
        setBooleanField(term52395, term52395.getClass(), "isNewRecord", true);
        setBooleanField(term52395, term52395.getClass(), "isFullCombo", true);
        setIntField(term52395, term52395.getClass(), "fullChainKind", -372652916);
        setBooleanField(term52395, term52395.getClass(), "isAllJustice", true);
        setIntField(term52395, term52395.getClass(), "characterId", 1915058189);
        setIntField(term52395, term52395.getClass(), "skillId", -1466811987);
        setIntField(term52395, term52395.getClass(), "playKind", 469445830);
        setBooleanField(term52395, term52395.getClass(), "isClear", false);
        setIntField(term52395, term52395.getClass(), "skillLevel", -1482217659);
        setIntField(term52395, term52395.getClass(), "skillEffect", 1650302326);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getJudgeJustice", argTypes, term52395, args);
    }

};


