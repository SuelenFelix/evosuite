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

public class RecentResp_setPlayedCustom2_81152257239 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53411;
     Object term53463;

    public RecentResp_setPlayedCustom2_81152257239() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53411 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp"));
        Object term53412 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term53413 = newInstance(Class.forName("java.time.LocalDate"));
        Object term53417 = newInstance(Class.forName("java.time.LocalTime"));
        Object term53422 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term53423 = newInstance(Class.forName("java.time.LocalDate"));
        Object term53427 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term53413, term53413.getClass(), "year", 2016);
        setShortField(term53413, term53413.getClass(), "month", (short) 9);
        setShortField(term53413, term53413.getClass(), "day", (short) 8);
        setField(term53412, term53412.getClass(), "date", term53413);
        setByteField(term53417, term53417.getClass(), "hour", (byte) 12);
        setByteField(term53417, term53417.getClass(), "minute", (byte) 9);
        setByteField(term53417, term53417.getClass(), "second", (byte) 23);
        setIntField(term53417, term53417.getClass(), "nano", 697344055);
        setField(term53412, term53412.getClass(), "time", term53417);
        setField(term53411, term53411.getClass(), "playDate", term53412);
        setIntField(term53423, term53423.getClass(), "year", 2023);
        setShortField(term53423, term53423.getClass(), "month", (short) 12);
        setShortField(term53423, term53423.getClass(), "day", (short) 19);
        setField(term53422, term53422.getClass(), "date", term53423);
        setByteField(term53427, term53427.getClass(), "hour", (byte) 20);
        setByteField(term53427, term53427.getClass(), "minute", (byte) 30);
        setByteField(term53427, term53427.getClass(), "second", (byte) 13);
        setIntField(term53427, term53427.getClass(), "nano", 525415298);
        setField(term53422, term53422.getClass(), "time", term53427);
        setField(term53411, term53411.getClass(), "userPlayDate", term53422);
        setIntField(term53411, term53411.getClass(), "musicId", -1910031809);
        setIntField(term53411, term53411.getClass(), "level", 1270786654);
        setIntField(term53411, term53411.getClass(), "customId", -1971037654);
        setIntField(term53411, term53411.getClass(), "playedCustom1", -1001929512);
        setIntField(term53411, term53411.getClass(), "playedCustom2", 1783875922);
        setIntField(term53411, term53411.getClass(), "playedCustom3", -1504060723);
        setIntField(term53411, term53411.getClass(), "track", 1458290326);
        setIntField(term53411, term53411.getClass(), "score", 1025606001);
        setIntField(term53411, term53411.getClass(), "rank", -1227561158);
        setIntField(term53411, term53411.getClass(), "maxCombo", -1853440273);
        setIntField(term53411, term53411.getClass(), "maxChain", 1884281846);
        setIntField(term53411, term53411.getClass(), "rateTap", -1779176468);
        setIntField(term53411, term53411.getClass(), "rateHold", -790563662);
        setIntField(term53411, term53411.getClass(), "rateSlide", 692290973);
        setIntField(term53411, term53411.getClass(), "rateAir", 344667712);
        setIntField(term53411, term53411.getClass(), "rateFlick", 921447346);
        setIntField(term53411, term53411.getClass(), "judgeGuilty", 1514227664);
        setIntField(term53411, term53411.getClass(), "judgeAttack", 2000874140);
        setIntField(term53411, term53411.getClass(), "judgeJustice", -701728269);
        setIntField(term53411, term53411.getClass(), "judgeCritical", -1094813190);
        setIntField(term53411, term53411.getClass(), "playerRating", -355401879);
        setBooleanField(term53411, term53411.getClass(), "isNewRecord", false);
        setBooleanField(term53411, term53411.getClass(), "isFullCombo", true);
        setIntField(term53411, term53411.getClass(), "fullChainKind", -1878519758);
        setBooleanField(term53411, term53411.getClass(), "isAllJustice", true);
        setIntField(term53411, term53411.getClass(), "characterId", -214099950);
        setIntField(term53411, term53411.getClass(), "skillId", -1324210306);
        setIntField(term53411, term53411.getClass(), "playKind", -1148507981);
        setBooleanField(term53411, term53411.getClass(), "isClear", false);
        setIntField(term53411, term53411.getClass(), "skillLevel", 149806587);
        setIntField(term53411, term53411.getClass(), "skillEffect", 2030509680);
        term53463 = new Integer(-927217294);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term53463;
        callMethod(klass, "setPlayedCustom2", argTypes, term53411, args);
    }

};


