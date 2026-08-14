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
import java.lang.Integer;

public class PlayerContest_setBestValue_153135631814 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35826;
     Object term36447;

    public PlayerContest_setBestValue_153135631814() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term36456 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term36455 = ((Class) term36456).getDeclaredField((String) "MISS");
        ((Field) term36455).setAccessible(true);
        Object enum70 = ((Field) term36455).get((Object) null);
        Class<? extends Object> term36833 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term36832 = ((Class) term36833).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term36832).setAccessible(true);
        Object enum71 = ((Field) term36832).get((Object) null);
        Class<? extends Object> term37116 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term37115 = ((Class) term37116).getDeclaredField((String) "NORMAL");
        ((Field) term37115).setAccessible(true);
        Object enum72 = ((Field) term37115).get((Object) null);
        Class<? extends Object> term37391 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term37390 = ((Class) term37391).getDeclaredField((String) "ORIGINAL");
        ((Field) term37390).setAccessible(true);
        Object enum73 = ((Field) term37390).get((Object) null);
        Class<? extends Object> term37657 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term37656 = ((Class) term37657).getDeclaredField((String) "NONE");
        ((Field) term37656).setAccessible(true);
        Object enum74 = ((Field) term37656).get((Object) null);
        term35826 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerContest"));
        Object term35828 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term35951 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term35952 = newInstance(Class.forName("java.time.LocalDate"));
        Object term35956 = newInstance(Class.forName("java.time.LocalTime"));
        Object term36437 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term36438 = newInstance(Class.forName("java.time.LocalDate"));
        Object term36442 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term35826, term35826.getClass(), "id", 2120084523938730454L);
        setLongField(term35828, term35828.getClass(), "id", 6855071767938501807L);
        setIntField(term35828, term35828.getClass(), "pdId", 1328271830);
        setField(term35828, term35828.getClass(), "playerName", "xxx");
        setIntField(term35828, term35828.getClass(), "vocaloidPoints", 300);
        setIntField(term35828, term35828.getClass(), "level", 1);
        setIntField(term35828, term35828.getClass(), "levelExp", 1596070772);
        setField(term35828, term35828.getClass(), "levelTitle", "xxx");
        setIntField(term35828, term35828.getClass(), "plateId", -1);
        setIntField(term35828, term35828.getClass(), "plateEffectId", -1);
        setField(term35828, term35828.getClass(), "passwordStatus", enum70);
        setField(term35828, term35828.getClass(), "password", "**********");
        setBooleanField(term35828, term35828.getClass(), "preferPerPvModule", true);
        setBooleanField(term35828, term35828.getClass(), "preferCommonModule", true);
        setBooleanField(term35828, term35828.getClass(), "usePerPvSkin", true);
        setBooleanField(term35828, term35828.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term35828, term35828.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term35828, term35828.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term35828, term35828.getClass(), "usePerPvTouchSliderSe", true);
        setField(term35828, term35828.getClass(), "commonModule", "-999,-999,-999");
        setField(term35828, term35828.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term35952, term35952.getClass(), "year", 2026);
        setShortField(term35952, term35952.getClass(), "month", (short) 8);
        setShortField(term35952, term35952.getClass(), "day", (short) 12);
        setField(term35951, term35951.getClass(), "date", term35952);
        setByteField(term35956, term35956.getClass(), "hour", (byte) 2);
        setByteField(term35956, term35956.getClass(), "minute", (byte) 2);
        setByteField(term35956, term35956.getClass(), "second", (byte) 31);
        setIntField(term35956, term35956.getClass(), "nano", 639421000);
        setField(term35951, term35951.getClass(), "time", term35956);
        setField(term35828, term35828.getClass(), "commonModuleSetTime", term35951);
        setField(term35828, term35828.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term35828, term35828.getClass(), "commonSkin", -1);
        setIntField(term35828, term35828.getClass(), "headphoneVolume", 100);
        setBooleanField(term35828, term35828.getClass(), "buttonSeOn", true);
        setIntField(term35828, term35828.getClass(), "buttonSeVolume", 100);
        setIntField(term35828, term35828.getClass(), "sliderSeVolume", 100);
        setIntField(term35828, term35828.getClass(), "buttonSe", -1);
        setIntField(term35828, term35828.getClass(), "chainSlideSe", -1);
        setIntField(term35828, term35828.getClass(), "slideSe", -1);
        setIntField(term35828, term35828.getClass(), "sliderTouchSe", -1);
        setField(term35828, term35828.getClass(), "sortMode", enum71);
        setIntField(term35828, term35828.getClass(), "nextPvId", -1);
        setField(term35828, term35828.getClass(), "nextDifficulty", enum72);
        setField(term35828, term35828.getClass(), "nextEdition", enum73);
        setBooleanField(term35828, term35828.getClass(), "showInterimRanking", true);
        setBooleanField(term35828, term35828.getClass(), "showClearStatus", true);
        setBooleanField(term35828, term35828.getClass(), "showGreatBorder", true);
        setBooleanField(term35828, term35828.getClass(), "showExcellentBorder", true);
        setBooleanField(term35828, term35828.getClass(), "showRivalBorder", true);
        setBooleanField(term35828, term35828.getClass(), "showRgoSetting", true);
        setBooleanField(term35828, term35828.getClass(), "contestNowPlayingEnable", false);
        setIntField(term35828, term35828.getClass(), "contestNowPlayingId", -1);
        setIntField(term35828, term35828.getClass(), "contestNowPlayingValue", -1);
        setField(term35828, term35828.getClass(), "contestNowPlayingResultRank", enum74);
        setField(term35828, term35828.getClass(), "contestNowPlayingSpecifier", "");
        setField(term35828, term35828.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term35828, term35828.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term35828, term35828.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term35828, term35828.getClass(), "rivalPdId", -1);
        setField(term35826, term35826.getClass(), "pdId", term35828);
        setIntField(term35826, term35826.getClass(), "contestId", 97029295);
        setIntField(term35826, term35826.getClass(), "startCount", -1371869594);
        setField(term35826, term35826.getClass(), "resultRank", enum74);
        setIntField(term35826, term35826.getClass(), "bestValue", -1);
        setIntField(term35826, term35826.getClass(), "flag", -1);
        setIntField(term36438, term36438.getClass(), "year", 2026);
        setShortField(term36438, term36438.getClass(), "month", (short) 8);
        setShortField(term36438, term36438.getClass(), "day", (short) 12);
        setField(term36437, term36437.getClass(), "date", term36438);
        setByteField(term36442, term36442.getClass(), "hour", (byte) 2);
        setByteField(term36442, term36442.getClass(), "minute", (byte) 2);
        setByteField(term36442, term36442.getClass(), "second", (byte) 31);
        setIntField(term36442, term36442.getClass(), "nano", 638770000);
        setField(term36437, term36437.getClass(), "time", term36442);
        setField(term35826, term35826.getClass(), "lastUpdateTime", term36437);
        term36447 = new Integer(-2095575670);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerContest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term36447;
        callMethod(klass, "setBestValue", argTypes, term35826, args);
    }

};


