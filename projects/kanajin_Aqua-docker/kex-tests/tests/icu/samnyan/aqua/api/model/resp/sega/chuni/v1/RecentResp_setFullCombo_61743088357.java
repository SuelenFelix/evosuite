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
import java.lang.Boolean;

public class RecentResp_setFullCombo_61743088357 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54383;
     Object term54435;

    public RecentResp_setFullCombo_61743088357() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54383 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp"));
        Object term54384 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term54385 = newInstance(Class.forName("java.time.LocalDate"));
        Object term54389 = newInstance(Class.forName("java.time.LocalTime"));
        Object term54394 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term54395 = newInstance(Class.forName("java.time.LocalDate"));
        Object term54399 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term54385, term54385.getClass(), "year", 2018);
        setShortField(term54385, term54385.getClass(), "month", (short) 4);
        setShortField(term54385, term54385.getClass(), "day", (short) 12);
        setField(term54384, term54384.getClass(), "date", term54385);
        setByteField(term54389, term54389.getClass(), "hour", (byte) 3);
        setByteField(term54389, term54389.getClass(), "minute", (byte) 25);
        setByteField(term54389, term54389.getClass(), "second", (byte) 20);
        setIntField(term54389, term54389.getClass(), "nano", 226150592);
        setField(term54384, term54384.getClass(), "time", term54389);
        setField(term54383, term54383.getClass(), "playDate", term54384);
        setIntField(term54395, term54395.getClass(), "year", 2014);
        setShortField(term54395, term54395.getClass(), "month", (short) 10);
        setShortField(term54395, term54395.getClass(), "day", (short) 6);
        setField(term54394, term54394.getClass(), "date", term54395);
        setByteField(term54399, term54399.getClass(), "hour", (byte) 11);
        setByteField(term54399, term54399.getClass(), "minute", (byte) 32);
        setByteField(term54399, term54399.getClass(), "second", (byte) 49);
        setIntField(term54399, term54399.getClass(), "nano", 542065255);
        setField(term54394, term54394.getClass(), "time", term54399);
        setField(term54383, term54383.getClass(), "userPlayDate", term54394);
        setIntField(term54383, term54383.getClass(), "musicId", -263593334);
        setIntField(term54383, term54383.getClass(), "level", 257595375);
        setIntField(term54383, term54383.getClass(), "customId", 1494109106);
        setIntField(term54383, term54383.getClass(), "playedCustom1", 1902576230);
        setIntField(term54383, term54383.getClass(), "playedCustom2", -1040460528);
        setIntField(term54383, term54383.getClass(), "playedCustom3", 990725836);
        setIntField(term54383, term54383.getClass(), "track", -1231785501);
        setIntField(term54383, term54383.getClass(), "score", -2112346885);
        setIntField(term54383, term54383.getClass(), "rank", -26311618);
        setIntField(term54383, term54383.getClass(), "maxCombo", -671595545);
        setIntField(term54383, term54383.getClass(), "maxChain", -143541686);
        setIntField(term54383, term54383.getClass(), "rateTap", -1201234880);
        setIntField(term54383, term54383.getClass(), "rateHold", 1402881126);
        setIntField(term54383, term54383.getClass(), "rateSlide", 786987666);
        setIntField(term54383, term54383.getClass(), "rateAir", 1810592574);
        setIntField(term54383, term54383.getClass(), "rateFlick", 1394978641);
        setIntField(term54383, term54383.getClass(), "judgeGuilty", 1085224973);
        setIntField(term54383, term54383.getClass(), "judgeAttack", 580824436);
        setIntField(term54383, term54383.getClass(), "judgeJustice", 400588448);
        setIntField(term54383, term54383.getClass(), "judgeCritical", -798151545);
        setIntField(term54383, term54383.getClass(), "playerRating", -243386399);
        setBooleanField(term54383, term54383.getClass(), "isNewRecord", true);
        setBooleanField(term54383, term54383.getClass(), "isFullCombo", true);
        setIntField(term54383, term54383.getClass(), "fullChainKind", 1238856040);
        setBooleanField(term54383, term54383.getClass(), "isAllJustice", true);
        setIntField(term54383, term54383.getClass(), "characterId", -171442968);
        setIntField(term54383, term54383.getClass(), "skillId", 1345075451);
        setIntField(term54383, term54383.getClass(), "playKind", -482097687);
        setBooleanField(term54383, term54383.getClass(), "isClear", true);
        setIntField(term54383, term54383.getClass(), "skillLevel", -1155698012);
        setIntField(term54383, term54383.getClass(), "skillEffect", -1635314310);
        term54435 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term54435;
        callMethod(klass, "setFullCombo", argTypes, term54383, args);
    }

};


