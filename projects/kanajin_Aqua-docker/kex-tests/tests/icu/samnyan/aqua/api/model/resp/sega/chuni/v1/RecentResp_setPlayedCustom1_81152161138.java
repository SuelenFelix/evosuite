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
import java.lang.Integer;

public class RecentResp_setPlayedCustom1_81152161138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53357;
     Object term53409;

    public RecentResp_setPlayedCustom1_81152161138() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53357 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp"));
        Object term53358 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term53359 = newInstance(Class.forName("java.time.LocalDate"));
        Object term53363 = newInstance(Class.forName("java.time.LocalTime"));
        Object term53368 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term53369 = newInstance(Class.forName("java.time.LocalDate"));
        Object term53373 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term53359, term53359.getClass(), "year", 2024);
        setShortField(term53359, term53359.getClass(), "month", (short) 1);
        setShortField(term53359, term53359.getClass(), "day", (short) 9);
        setField(term53358, term53358.getClass(), "date", term53359);
        setByteField(term53363, term53363.getClass(), "hour", (byte) 16);
        setByteField(term53363, term53363.getClass(), "minute", (byte) 51);
        setByteField(term53363, term53363.getClass(), "second", (byte) 43);
        setIntField(term53363, term53363.getClass(), "nano", 661225347);
        setField(term53358, term53358.getClass(), "time", term53363);
        setField(term53357, term53357.getClass(), "playDate", term53358);
        setIntField(term53369, term53369.getClass(), "year", 2014);
        setShortField(term53369, term53369.getClass(), "month", (short) 6);
        setShortField(term53369, term53369.getClass(), "day", (short) 7);
        setField(term53368, term53368.getClass(), "date", term53369);
        setByteField(term53373, term53373.getClass(), "hour", (byte) 23);
        setByteField(term53373, term53373.getClass(), "minute", (byte) 34);
        setByteField(term53373, term53373.getClass(), "second", (byte) 36);
        setIntField(term53373, term53373.getClass(), "nano", 967981946);
        setField(term53368, term53368.getClass(), "time", term53373);
        setField(term53357, term53357.getClass(), "userPlayDate", term53368);
        setIntField(term53357, term53357.getClass(), "musicId", 695748317);
        setIntField(term53357, term53357.getClass(), "level", -439470959);
        setIntField(term53357, term53357.getClass(), "customId", -248472453);
        setIntField(term53357, term53357.getClass(), "playedCustom1", 1056759659);
        setIntField(term53357, term53357.getClass(), "playedCustom2", -233313895);
        setIntField(term53357, term53357.getClass(), "playedCustom3", 2014416586);
        setIntField(term53357, term53357.getClass(), "track", 1614071253);
        setIntField(term53357, term53357.getClass(), "score", -548611489);
        setIntField(term53357, term53357.getClass(), "rank", 792588182);
        setIntField(term53357, term53357.getClass(), "maxCombo", 1145540785);
        setIntField(term53357, term53357.getClass(), "maxChain", -1255440898);
        setIntField(term53357, term53357.getClass(), "rateTap", -1185096329);
        setIntField(term53357, term53357.getClass(), "rateHold", -2051822073);
        setIntField(term53357, term53357.getClass(), "rateSlide", -838891056);
        setIntField(term53357, term53357.getClass(), "rateAir", -2133180225);
        setIntField(term53357, term53357.getClass(), "rateFlick", -1486915040);
        setIntField(term53357, term53357.getClass(), "judgeGuilty", -1960290626);
        setIntField(term53357, term53357.getClass(), "judgeAttack", -1941903722);
        setIntField(term53357, term53357.getClass(), "judgeJustice", 491009356);
        setIntField(term53357, term53357.getClass(), "judgeCritical", 1180952236);
        setIntField(term53357, term53357.getClass(), "playerRating", 1549827025);
        setBooleanField(term53357, term53357.getClass(), "isNewRecord", false);
        setBooleanField(term53357, term53357.getClass(), "isFullCombo", true);
        setIntField(term53357, term53357.getClass(), "fullChainKind", 523998499);
        setBooleanField(term53357, term53357.getClass(), "isAllJustice", true);
        setIntField(term53357, term53357.getClass(), "characterId", -808741755);
        setIntField(term53357, term53357.getClass(), "skillId", -1088446142);
        setIntField(term53357, term53357.getClass(), "playKind", 342337914);
        setBooleanField(term53357, term53357.getClass(), "isClear", true);
        setIntField(term53357, term53357.getClass(), "skillLevel", 920216419);
        setIntField(term53357, term53357.getClass(), "skillEffect", -1576226952);
        term53409 = new Integer(1555746325);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term53409;
        callMethod(klass, "setPlayedCustom1", argTypes, term53357, args);
    }

};


