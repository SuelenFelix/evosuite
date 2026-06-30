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

public class RecentResp_getJudgeGuilty_27789597018 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47121;

    public RecentResp_getJudgeGuilty_27789597018() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47121 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp"));
        Object term47122 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term47123 = newInstance(Class.forName("java.time.LocalDate"));
        Object term47127 = newInstance(Class.forName("java.time.LocalTime"));
        Object term47132 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term47133 = newInstance(Class.forName("java.time.LocalDate"));
        Object term47137 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term47123, term47123.getClass(), "year", 2018);
        setShortField(term47123, term47123.getClass(), "month", (short) 9);
        setShortField(term47123, term47123.getClass(), "day", (short) 10);
        setField(term47122, term47122.getClass(), "date", term47123);
        setByteField(term47127, term47127.getClass(), "hour", (byte) 11);
        setByteField(term47127, term47127.getClass(), "minute", (byte) 50);
        setByteField(term47127, term47127.getClass(), "second", (byte) 3);
        setIntField(term47127, term47127.getClass(), "nano", 33779151);
        setField(term47122, term47122.getClass(), "time", term47127);
        setField(term47121, term47121.getClass(), "playDate", term47122);
        setIntField(term47133, term47133.getClass(), "year", 2022);
        setShortField(term47133, term47133.getClass(), "month", (short) 6);
        setShortField(term47133, term47133.getClass(), "day", (short) 29);
        setField(term47132, term47132.getClass(), "date", term47133);
        setByteField(term47137, term47137.getClass(), "hour", (byte) 1);
        setByteField(term47137, term47137.getClass(), "minute", (byte) 29);
        setByteField(term47137, term47137.getClass(), "second", (byte) 33);
        setIntField(term47137, term47137.getClass(), "nano", 714362758);
        setField(term47132, term47132.getClass(), "time", term47137);
        setField(term47121, term47121.getClass(), "userPlayDate", term47132);
        setIntField(term47121, term47121.getClass(), "musicId", -861852803);
        setIntField(term47121, term47121.getClass(), "level", -2085852488);
        setIntField(term47121, term47121.getClass(), "customId", 600214846);
        setIntField(term47121, term47121.getClass(), "playedCustom1", 697208850);
        setIntField(term47121, term47121.getClass(), "playedCustom2", -973142506);
        setIntField(term47121, term47121.getClass(), "playedCustom3", -15011809);
        setIntField(term47121, term47121.getClass(), "track", -482193296);
        setIntField(term47121, term47121.getClass(), "score", 1506869786);
        setIntField(term47121, term47121.getClass(), "rank", 950749769);
        setIntField(term47121, term47121.getClass(), "maxCombo", 1497396124);
        setIntField(term47121, term47121.getClass(), "maxChain", 1013816325);
        setIntField(term47121, term47121.getClass(), "rateTap", -756785345);
        setIntField(term47121, term47121.getClass(), "rateHold", -1077451707);
        setIntField(term47121, term47121.getClass(), "rateSlide", -580180892);
        setIntField(term47121, term47121.getClass(), "rateAir", 862135498);
        setIntField(term47121, term47121.getClass(), "rateFlick", -1640521852);
        setIntField(term47121, term47121.getClass(), "judgeGuilty", 1999560627);
        setIntField(term47121, term47121.getClass(), "judgeAttack", 93344937);
        setIntField(term47121, term47121.getClass(), "judgeJustice", 1426545044);
        setIntField(term47121, term47121.getClass(), "judgeCritical", -2114135536);
        setIntField(term47121, term47121.getClass(), "playerRating", -1934156754);
        setBooleanField(term47121, term47121.getClass(), "isNewRecord", true);
        setBooleanField(term47121, term47121.getClass(), "isFullCombo", true);
        setIntField(term47121, term47121.getClass(), "fullChainKind", -2122545415);
        setBooleanField(term47121, term47121.getClass(), "isAllJustice", false);
        setIntField(term47121, term47121.getClass(), "characterId", 45477597);
        setIntField(term47121, term47121.getClass(), "skillId", 702851889);
        setIntField(term47121, term47121.getClass(), "playKind", 2035373298);
        setBooleanField(term47121, term47121.getClass(), "isClear", true);
        setIntField(term47121, term47121.getClass(), "skillLevel", 1328311779);
        setIntField(term47121, term47121.getClass(), "skillEffect", -1459351662);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getJudgeGuilty", argTypes, term47121, args);
    }

};


