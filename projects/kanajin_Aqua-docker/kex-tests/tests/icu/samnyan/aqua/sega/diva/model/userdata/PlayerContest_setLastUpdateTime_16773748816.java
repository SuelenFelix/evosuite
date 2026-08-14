package icu.samnyan.aqua.sega.diva.model.userdata;

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
import static icu.samnyan.aqua.sega.diva.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class PlayerContest_setLastUpdateTime_16773748816 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40768;
     Object term41389;

    public PlayerContest_setLastUpdateTime_16773748816() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term41406 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term41405 = ((Class) term41406).getDeclaredField((String) "MISS");
        ((Field) term41405).setAccessible(true);
        Object enum80 = ((Field) term41405).get((Object) null);
        Class<? extends Object> term41783 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term41782 = ((Class) term41783).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term41782).setAccessible(true);
        Object enum81 = ((Field) term41782).get((Object) null);
        Class<? extends Object> term42066 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term42065 = ((Class) term42066).getDeclaredField((String) "NORMAL");
        ((Field) term42065).setAccessible(true);
        Object enum82 = ((Field) term42065).get((Object) null);
        Class<? extends Object> term42341 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term42340 = ((Class) term42341).getDeclaredField((String) "ORIGINAL");
        ((Field) term42340).setAccessible(true);
        Object enum83 = ((Field) term42340).get((Object) null);
        Class<? extends Object> term42607 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term42606 = ((Class) term42607).getDeclaredField((String) "NONE");
        ((Field) term42606).setAccessible(true);
        Object enum84 = ((Field) term42606).get((Object) null);
        term40768 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerContest"));
        Object term40770 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term40893 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term40894 = newInstance(Class.forName("java.time.LocalDate"));
        Object term40898 = newInstance(Class.forName("java.time.LocalTime"));
        Object term41379 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term41380 = newInstance(Class.forName("java.time.LocalDate"));
        Object term41384 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term40768, term40768.getClass(), "id", -6823727938421990489L);
        setLongField(term40770, term40770.getClass(), "id", -484994522244390100L);
        setIntField(term40770, term40770.getClass(), "pdId", 933028652);
        setField(term40770, term40770.getClass(), "playerName", "xxx");
        setIntField(term40770, term40770.getClass(), "vocaloidPoints", 300);
        setIntField(term40770, term40770.getClass(), "level", 1);
        setIntField(term40770, term40770.getClass(), "levelExp", 287287233);
        setField(term40770, term40770.getClass(), "levelTitle", "xxx");
        setIntField(term40770, term40770.getClass(), "plateId", -1);
        setIntField(term40770, term40770.getClass(), "plateEffectId", -1);
        setField(term40770, term40770.getClass(), "passwordStatus", enum80);
        setField(term40770, term40770.getClass(), "password", "**********");
        setBooleanField(term40770, term40770.getClass(), "preferPerPvModule", true);
        setBooleanField(term40770, term40770.getClass(), "preferCommonModule", false);
        setBooleanField(term40770, term40770.getClass(), "usePerPvSkin", false);
        setBooleanField(term40770, term40770.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term40770, term40770.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term40770, term40770.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term40770, term40770.getClass(), "usePerPvTouchSliderSe", false);
        setField(term40770, term40770.getClass(), "commonModule", "-999,-999,-999");
        setField(term40770, term40770.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term40894, term40894.getClass(), "year", 2026);
        setShortField(term40894, term40894.getClass(), "month", (short) 8);
        setShortField(term40894, term40894.getClass(), "day", (short) 12);
        setField(term40893, term40893.getClass(), "date", term40894);
        setByteField(term40898, term40898.getClass(), "hour", (byte) 2);
        setByteField(term40898, term40898.getClass(), "minute", (byte) 2);
        setByteField(term40898, term40898.getClass(), "second", (byte) 32);
        setIntField(term40898, term40898.getClass(), "nano", 223209000);
        setField(term40893, term40893.getClass(), "time", term40898);
        setField(term40770, term40770.getClass(), "commonModuleSetTime", term40893);
        setField(term40770, term40770.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term40770, term40770.getClass(), "commonSkin", -1);
        setIntField(term40770, term40770.getClass(), "headphoneVolume", 100);
        setBooleanField(term40770, term40770.getClass(), "buttonSeOn", true);
        setIntField(term40770, term40770.getClass(), "buttonSeVolume", 100);
        setIntField(term40770, term40770.getClass(), "sliderSeVolume", 100);
        setIntField(term40770, term40770.getClass(), "buttonSe", -1);
        setIntField(term40770, term40770.getClass(), "chainSlideSe", -1);
        setIntField(term40770, term40770.getClass(), "slideSe", -1);
        setIntField(term40770, term40770.getClass(), "sliderTouchSe", -1);
        setField(term40770, term40770.getClass(), "sortMode", enum81);
        setIntField(term40770, term40770.getClass(), "nextPvId", -1);
        setField(term40770, term40770.getClass(), "nextDifficulty", enum82);
        setField(term40770, term40770.getClass(), "nextEdition", enum83);
        setBooleanField(term40770, term40770.getClass(), "showInterimRanking", true);
        setBooleanField(term40770, term40770.getClass(), "showClearStatus", true);
        setBooleanField(term40770, term40770.getClass(), "showGreatBorder", true);
        setBooleanField(term40770, term40770.getClass(), "showExcellentBorder", true);
        setBooleanField(term40770, term40770.getClass(), "showRivalBorder", true);
        setBooleanField(term40770, term40770.getClass(), "showRgoSetting", true);
        setBooleanField(term40770, term40770.getClass(), "contestNowPlayingEnable", false);
        setIntField(term40770, term40770.getClass(), "contestNowPlayingId", -1);
        setIntField(term40770, term40770.getClass(), "contestNowPlayingValue", -1);
        setField(term40770, term40770.getClass(), "contestNowPlayingResultRank", enum84);
        setField(term40770, term40770.getClass(), "contestNowPlayingSpecifier", "");
        setField(term40770, term40770.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term40770, term40770.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term40770, term40770.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term40770, term40770.getClass(), "rivalPdId", -1);
        setField(term40768, term40768.getClass(), "pdId", term40770);
        setIntField(term40768, term40768.getClass(), "contestId", 962840079);
        setIntField(term40768, term40768.getClass(), "startCount", 1540719661);
        setField(term40768, term40768.getClass(), "resultRank", enum84);
        setIntField(term40768, term40768.getClass(), "bestValue", -1);
        setIntField(term40768, term40768.getClass(), "flag", -1);
        setIntField(term41380, term41380.getClass(), "year", 2026);
        setShortField(term41380, term41380.getClass(), "month", (short) 8);
        setShortField(term41380, term41380.getClass(), "day", (short) 12);
        setField(term41379, term41379.getClass(), "date", term41380);
        setByteField(term41384, term41384.getClass(), "hour", (byte) 2);
        setByteField(term41384, term41384.getClass(), "minute", (byte) 2);
        setByteField(term41384, term41384.getClass(), "second", (byte) 32);
        setIntField(term41384, term41384.getClass(), "nano", 223037000);
        setField(term41379, term41379.getClass(), "time", term41384);
        setField(term40768, term40768.getClass(), "lastUpdateTime", term41379);
        term41389 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term41390 = newInstance(Class.forName("java.time.LocalDate"));
        Object term41394 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term41390, term41390.getClass(), "year", 2012);
        setShortField(term41390, term41390.getClass(), "month", (short) 8);
        setShortField(term41390, term41390.getClass(), "day", (short) 25);
        setField(term41389, term41389.getClass(), "date", term41390);
        setByteField(term41394, term41394.getClass(), "hour", (byte) 5);
        setByteField(term41394, term41394.getClass(), "minute", (byte) 20);
        setByteField(term41394, term41394.getClass(), "second", (byte) 50);
        setIntField(term41394, term41394.getClass(), "nano", 345595912);
        setField(term41389, term41389.getClass(), "time", term41394);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerContest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term41389;
        callMethod(klass, "setLastUpdateTime", argTypes, term40768, args);
    }

};


