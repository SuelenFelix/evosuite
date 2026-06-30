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

public class RecentResp_setCustomId_88347985437 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53303;
     Object term53355;

    public RecentResp_setCustomId_88347985437() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53303 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp"));
        Object term53304 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term53305 = newInstance(Class.forName("java.time.LocalDate"));
        Object term53309 = newInstance(Class.forName("java.time.LocalTime"));
        Object term53314 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term53315 = newInstance(Class.forName("java.time.LocalDate"));
        Object term53319 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term53305, term53305.getClass(), "year", 2027);
        setShortField(term53305, term53305.getClass(), "month", (short) 4);
        setShortField(term53305, term53305.getClass(), "day", (short) 25);
        setField(term53304, term53304.getClass(), "date", term53305);
        setByteField(term53309, term53309.getClass(), "hour", (byte) 18);
        setByteField(term53309, term53309.getClass(), "minute", (byte) 2);
        setByteField(term53309, term53309.getClass(), "second", (byte) 53);
        setIntField(term53309, term53309.getClass(), "nano", 468233333);
        setField(term53304, term53304.getClass(), "time", term53309);
        setField(term53303, term53303.getClass(), "playDate", term53304);
        setIntField(term53315, term53315.getClass(), "year", 2020);
        setShortField(term53315, term53315.getClass(), "month", (short) 1);
        setShortField(term53315, term53315.getClass(), "day", (short) 9);
        setField(term53314, term53314.getClass(), "date", term53315);
        setByteField(term53319, term53319.getClass(), "hour", (byte) 15);
        setByteField(term53319, term53319.getClass(), "minute", (byte) 54);
        setByteField(term53319, term53319.getClass(), "second", (byte) 0);
        setIntField(term53319, term53319.getClass(), "nano", 449352072);
        setField(term53314, term53314.getClass(), "time", term53319);
        setField(term53303, term53303.getClass(), "userPlayDate", term53314);
        setIntField(term53303, term53303.getClass(), "musicId", 1239212151);
        setIntField(term53303, term53303.getClass(), "level", 1513817979);
        setIntField(term53303, term53303.getClass(), "customId", 222944981);
        setIntField(term53303, term53303.getClass(), "playedCustom1", -1880135720);
        setIntField(term53303, term53303.getClass(), "playedCustom2", 1065058113);
        setIntField(term53303, term53303.getClass(), "playedCustom3", 159521199);
        setIntField(term53303, term53303.getClass(), "track", 2020510924);
        setIntField(term53303, term53303.getClass(), "score", -644848160);
        setIntField(term53303, term53303.getClass(), "rank", -413768483);
        setIntField(term53303, term53303.getClass(), "maxCombo", 565614678);
        setIntField(term53303, term53303.getClass(), "maxChain", -1248504675);
        setIntField(term53303, term53303.getClass(), "rateTap", 1366246744);
        setIntField(term53303, term53303.getClass(), "rateHold", -369295588);
        setIntField(term53303, term53303.getClass(), "rateSlide", 728215296);
        setIntField(term53303, term53303.getClass(), "rateAir", -1236147031);
        setIntField(term53303, term53303.getClass(), "rateFlick", 2030051112);
        setIntField(term53303, term53303.getClass(), "judgeGuilty", 1023614449);
        setIntField(term53303, term53303.getClass(), "judgeAttack", -717220010);
        setIntField(term53303, term53303.getClass(), "judgeJustice", 280068573);
        setIntField(term53303, term53303.getClass(), "judgeCritical", -1081530515);
        setIntField(term53303, term53303.getClass(), "playerRating", 492096339);
        setBooleanField(term53303, term53303.getClass(), "isNewRecord", false);
        setBooleanField(term53303, term53303.getClass(), "isFullCombo", false);
        setIntField(term53303, term53303.getClass(), "fullChainKind", -1679827671);
        setBooleanField(term53303, term53303.getClass(), "isAllJustice", true);
        setIntField(term53303, term53303.getClass(), "characterId", 932019255);
        setIntField(term53303, term53303.getClass(), "skillId", 1939661233);
        setIntField(term53303, term53303.getClass(), "playKind", -485147289);
        setBooleanField(term53303, term53303.getClass(), "isClear", true);
        setIntField(term53303, term53303.getClass(), "skillLevel", -1098526777);
        setIntField(term53303, term53303.getClass(), "skillEffect", 871491464);
        term53355 = new Integer(1250354269);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term53355;
        callMethod(klass, "setCustomId", argTypes, term53303, args);
    }

};


