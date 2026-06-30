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
import java.lang.Integer;

public class RecentResp_setFullChainKind_150710421958 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49267;
     Object term49319;

    public RecentResp_setFullChainKind_150710421958() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49267 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp"));
        Object term49268 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term49269 = newInstance(Class.forName("java.time.LocalDate"));
        Object term49273 = newInstance(Class.forName("java.time.LocalTime"));
        Object term49278 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term49279 = newInstance(Class.forName("java.time.LocalDate"));
        Object term49283 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term49269, term49269.getClass(), "year", 2018);
        setShortField(term49269, term49269.getClass(), "month", (short) 2);
        setShortField(term49269, term49269.getClass(), "day", (short) 15);
        setField(term49268, term49268.getClass(), "date", term49269);
        setByteField(term49273, term49273.getClass(), "hour", (byte) 16);
        setByteField(term49273, term49273.getClass(), "minute", (byte) 4);
        setByteField(term49273, term49273.getClass(), "second", (byte) 19);
        setIntField(term49273, term49273.getClass(), "nano", 538124451);
        setField(term49268, term49268.getClass(), "time", term49273);
        setField(term49267, term49267.getClass(), "playDate", term49268);
        setIntField(term49279, term49279.getClass(), "year", 2013);
        setShortField(term49279, term49279.getClass(), "month", (short) 10);
        setShortField(term49279, term49279.getClass(), "day", (short) 20);
        setField(term49278, term49278.getClass(), "date", term49279);
        setByteField(term49283, term49283.getClass(), "hour", (byte) 11);
        setByteField(term49283, term49283.getClass(), "minute", (byte) 17);
        setByteField(term49283, term49283.getClass(), "second", (byte) 1);
        setIntField(term49283, term49283.getClass(), "nano", 266879040);
        setField(term49278, term49278.getClass(), "time", term49283);
        setField(term49267, term49267.getClass(), "userPlayDate", term49278);
        setIntField(term49267, term49267.getClass(), "musicId", 792588182);
        setIntField(term49267, term49267.getClass(), "level", 1145540785);
        setIntField(term49267, term49267.getClass(), "customId", -1255440898);
        setIntField(term49267, term49267.getClass(), "playedCustom1", -1185096329);
        setIntField(term49267, term49267.getClass(), "playedCustom2", -2051822073);
        setIntField(term49267, term49267.getClass(), "playedCustom3", -838891056);
        setIntField(term49267, term49267.getClass(), "track", -2133180225);
        setIntField(term49267, term49267.getClass(), "score", -1486915040);
        setIntField(term49267, term49267.getClass(), "rank", -1960290626);
        setIntField(term49267, term49267.getClass(), "maxCombo", -1941903722);
        setIntField(term49267, term49267.getClass(), "maxChain", 491009356);
        setIntField(term49267, term49267.getClass(), "rateTap", 1180952236);
        setIntField(term49267, term49267.getClass(), "rateHold", 1549827025);
        setIntField(term49267, term49267.getClass(), "rateSlide", 523998499);
        setIntField(term49267, term49267.getClass(), "rateAir", -808741755);
        setIntField(term49267, term49267.getClass(), "rateFlick", -1088446142);
        setIntField(term49267, term49267.getClass(), "judgeGuilty", 342337914);
        setIntField(term49267, term49267.getClass(), "judgeAttack", 920216419);
        setIntField(term49267, term49267.getClass(), "judgeJustice", -1576226952);
        setIntField(term49267, term49267.getClass(), "judgeCritical", 1555746325);
        setIntField(term49267, term49267.getClass(), "playerRating", -1910031809);
        setBooleanField(term49267, term49267.getClass(), "isNewRecord", false);
        setBooleanField(term49267, term49267.getClass(), "isFullCombo", false);
        setIntField(term49267, term49267.getClass(), "fullChainKind", 1270786654);
        setBooleanField(term49267, term49267.getClass(), "isAllJustice", true);
        setIntField(term49267, term49267.getClass(), "characterId", -1971037654);
        setIntField(term49267, term49267.getClass(), "skillId", -1001929512);
        setIntField(term49267, term49267.getClass(), "playKind", 1783875922);
        setBooleanField(term49267, term49267.getClass(), "isClear", true);
        setIntField(term49267, term49267.getClass(), "skillLevel", -1504060723);
        setIntField(term49267, term49267.getClass(), "skillEffect", 1458290326);
        term49319 = new Integer(1025606001);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term49319;
        callMethod(klass, "setFullChainKind", argTypes, term49267, args);
    }

};


