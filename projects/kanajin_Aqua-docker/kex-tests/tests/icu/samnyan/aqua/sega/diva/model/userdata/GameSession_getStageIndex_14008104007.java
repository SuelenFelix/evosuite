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

public class GameSession_getStageIndex_14008104007 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term376901;

    public GameSession_getStageIndex_14008104007() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term377565 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term377564 = ((Class) term377565).getDeclaredField((String) "MISS");
        ((Field) term377564).setAccessible(true);
        Object enum854 = ((Field) term377564).get((Object) null);
        Class<? extends Object> term377942 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term377941 = ((Class) term377942).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term377941).setAccessible(true);
        Object enum855 = ((Field) term377941).get((Object) null);
        Class<? extends Object> term378225 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term378224 = ((Class) term378225).getDeclaredField((String) "NORMAL");
        ((Field) term378224).setAccessible(true);
        Object enum856 = ((Field) term378224).get((Object) null);
        Class<? extends Object> term378500 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term378499 = ((Class) term378500).getDeclaredField((String) "ORIGINAL");
        ((Field) term378499).setAccessible(true);
        Object enum857 = ((Field) term378499).get((Object) null);
        Class<? extends Object> term378766 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term378765 = ((Class) term378766).getDeclaredField((String) "NONE");
        ((Field) term378765).setAccessible(true);
        Object enum858 = ((Field) term378765).get((Object) null);
        Class<? extends Object> term379407 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.StartMode");
        Field term379406 = ((Class) term379407).getDeclaredField((String) "PRE_START");
        ((Field) term379406).setAccessible(true);
        Object enum859 = ((Field) term379406).get((Object) null);
        Integer term377542 = new Integer(458147407);
        Integer term377544 = new Integer(-184153539);
        Integer term377546 = new Integer(493620644);
        Integer term377548 = new Integer(1328271830);
        Integer term377550 = new Integer(1596070772);
        Integer term377552 = new Integer(97029295);
        Integer term377554 = new Integer(-1371869594);
        Integer term377556 = new Integer(-2095575670);
        term376901 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.GameSession"));
        Object term376904 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term377027 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term377028 = newInstance(Class.forName("java.time.LocalDate"));
        Object term377032 = newInstance(Class.forName("java.time.LocalTime"));
        Object term377522 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term377523 = newInstance(Class.forName("java.time.LocalDate"));
        Object term377527 = newInstance(Class.forName("java.time.LocalTime"));
        Object term377532 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term377533 = newInstance(Class.forName("java.time.LocalDate"));
        Object term377537 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term376901, term376901.getClass(), "id", 394960377236392159L);
        setIntField(term376901, term376901.getClass(), "acceptId", -1741920202);
        setLongField(term376904, term376904.getClass(), "id", -2955854401507097864L);
        setIntField(term376904, term376904.getClass(), "pdId", 1639977614);
        setField(term376904, term376904.getClass(), "playerName", "xxx");
        setIntField(term376904, term376904.getClass(), "vocaloidPoints", 300);
        setIntField(term376904, term376904.getClass(), "level", 1);
        setIntField(term376904, term376904.getClass(), "levelExp", -27270642);
        setField(term376904, term376904.getClass(), "levelTitle", "xxx");
        setIntField(term376904, term376904.getClass(), "plateId", -1);
        setIntField(term376904, term376904.getClass(), "plateEffectId", -1);
        setField(term376904, term376904.getClass(), "passwordStatus", enum854);
        setField(term376904, term376904.getClass(), "password", "**********");
        setBooleanField(term376904, term376904.getClass(), "preferPerPvModule", true);
        setBooleanField(term376904, term376904.getClass(), "preferCommonModule", true);
        setBooleanField(term376904, term376904.getClass(), "usePerPvSkin", true);
        setBooleanField(term376904, term376904.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term376904, term376904.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term376904, term376904.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term376904, term376904.getClass(), "usePerPvTouchSliderSe", false);
        setField(term376904, term376904.getClass(), "commonModule", "-999,-999,-999");
        setField(term376904, term376904.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term377028, term377028.getClass(), "year", 2026);
        setShortField(term377028, term377028.getClass(), "month", (short) 6);
        setShortField(term377028, term377028.getClass(), "day", (short) 29);
        setField(term377027, term377027.getClass(), "date", term377028);
        setByteField(term377032, term377032.getClass(), "hour", (byte) 4);
        setByteField(term377032, term377032.getClass(), "minute", (byte) 28);
        setByteField(term377032, term377032.getClass(), "second", (byte) 8);
        setIntField(term377032, term377032.getClass(), "nano", 559960000);
        setField(term377027, term377027.getClass(), "time", term377032);
        setField(term376904, term376904.getClass(), "commonModuleSetTime", term377027);
        setField(term376904, term376904.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term376904, term376904.getClass(), "commonSkin", -1);
        setIntField(term376904, term376904.getClass(), "headphoneVolume", 100);
        setBooleanField(term376904, term376904.getClass(), "buttonSeOn", true);
        setIntField(term376904, term376904.getClass(), "buttonSeVolume", 100);
        setIntField(term376904, term376904.getClass(), "sliderSeVolume", 100);
        setIntField(term376904, term376904.getClass(), "buttonSe", -1);
        setIntField(term376904, term376904.getClass(), "chainSlideSe", -1);
        setIntField(term376904, term376904.getClass(), "slideSe", -1);
        setIntField(term376904, term376904.getClass(), "sliderTouchSe", -1);
        setField(term376904, term376904.getClass(), "sortMode", enum855);
        setIntField(term376904, term376904.getClass(), "nextPvId", -1);
        setField(term376904, term376904.getClass(), "nextDifficulty", enum856);
        setField(term376904, term376904.getClass(), "nextEdition", enum857);
        setBooleanField(term376904, term376904.getClass(), "showInterimRanking", true);
        setBooleanField(term376904, term376904.getClass(), "showClearStatus", true);
        setBooleanField(term376904, term376904.getClass(), "showGreatBorder", true);
        setBooleanField(term376904, term376904.getClass(), "showExcellentBorder", true);
        setBooleanField(term376904, term376904.getClass(), "showRivalBorder", true);
        setBooleanField(term376904, term376904.getClass(), "showRgoSetting", true);
        setBooleanField(term376904, term376904.getClass(), "contestNowPlayingEnable", false);
        setIntField(term376904, term376904.getClass(), "contestNowPlayingId", -1);
        setIntField(term376904, term376904.getClass(), "contestNowPlayingValue", -1);
        setField(term376904, term376904.getClass(), "contestNowPlayingResultRank", enum858);
        setField(term376904, term376904.getClass(), "contestNowPlayingSpecifier", "");
        setField(term376904, term376904.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term376904, term376904.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term376904, term376904.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term376904, term376904.getClass(), "rivalPdId", -1);
        setField(term376901, term376901.getClass(), "pdId", term376904);
        setField(term376901, term376901.getClass(), "startMode", enum859);
        setIntField(term377523, term377523.getClass(), "year", 2016);
        setShortField(term377523, term377523.getClass(), "month", (short) 3);
        setShortField(term377523, term377523.getClass(), "day", (short) 20);
        setField(term377522, term377522.getClass(), "date", term377523);
        setByteField(term377527, term377527.getClass(), "hour", (byte) 0);
        setByteField(term377527, term377527.getClass(), "minute", (byte) 54);
        setByteField(term377527, term377527.getClass(), "second", (byte) 6);
        setIntField(term377527, term377527.getClass(), "nano", 183302469);
        setField(term377522, term377522.getClass(), "time", term377527);
        setField(term376901, term376901.getClass(), "startTime", term377522);
        setIntField(term377533, term377533.getClass(), "year", 2013);
        setShortField(term377533, term377533.getClass(), "month", (short) 11);
        setShortField(term377533, term377533.getClass(), "day", (short) 19);
        setField(term377532, term377532.getClass(), "date", term377533);
        setByteField(term377537, term377537.getClass(), "hour", (byte) 6);
        setByteField(term377537, term377537.getClass(), "minute", (byte) 45);
        setByteField(term377537, term377537.getClass(), "second", (byte) 10);
        setIntField(term377537, term377537.getClass(), "nano", 288981190);
        setField(term377532, term377532.getClass(), "time", term377537);
        setField(term376901, term376901.getClass(), "lastUpdateTime", term377532);
        setField(term376901, term376901.getClass(), "stageIndex", term377542);
        setField(term376901, term376901.getClass(), "stageResultIndex", term377544);
        setField(term376901, term376901.getClass(), "lastPvId", term377546);
        setField(term376901, term376901.getClass(), "levelNumber", term377548);
        setField(term376901, term376901.getClass(), "levelExp", term377550);
        setField(term376901, term376901.getClass(), "oldLevelNumber", term377552);
        setField(term376901, term376901.getClass(), "oldLevelExp", term377554);
        setField(term376901, term376901.getClass(), "vp", term377556);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.GameSession");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStageIndex", argTypes, term376901, args);
    }

};


