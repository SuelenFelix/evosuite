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

public class GameSession_toString_172321999732 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term447762;

    public GameSession_toString_172321999732() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term448422 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term448421 = ((Class) term448422).getDeclaredField((String) "MISS");
        ((Field) term448421).setAccessible(true);
        Object enum1005 = ((Field) term448421).get((Object) null);
        Class<? extends Object> term448799 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term448798 = ((Class) term448799).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term448798).setAccessible(true);
        Object enum1006 = ((Field) term448798).get((Object) null);
        Class<? extends Object> term449082 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term449081 = ((Class) term449082).getDeclaredField((String) "NORMAL");
        ((Field) term449081).setAccessible(true);
        Object enum1007 = ((Field) term449081).get((Object) null);
        Class<? extends Object> term449357 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term449356 = ((Class) term449357).getDeclaredField((String) "ORIGINAL");
        ((Field) term449356).setAccessible(true);
        Object enum1008 = ((Field) term449356).get((Object) null);
        Class<? extends Object> term449623 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term449622 = ((Class) term449623).getDeclaredField((String) "NONE");
        ((Field) term449622).setAccessible(true);
        Object enum1009 = ((Field) term449622).get((Object) null);
        Class<? extends Object> term450264 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.StartMode");
        Field term450263 = ((Class) term450264).getDeclaredField((String) "START");
        ((Field) term450263).setAccessible(true);
        Object enum1010 = ((Field) term450263).get((Object) null);
        Integer term448399 = new Integer(1743683601);
        Integer term448401 = new Integer(-945116798);
        Integer term448403 = new Integer(1593461795);
        Integer term448405 = new Integer(515182546);
        Integer term448407 = new Integer(-936895502);
        Integer term448409 = new Integer(-129547140);
        Integer term448411 = new Integer(199287428);
        Integer term448413 = new Integer(-1195339592);
        term447762 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.GameSession"));
        Object term447765 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term447888 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term447889 = newInstance(Class.forName("java.time.LocalDate"));
        Object term447893 = newInstance(Class.forName("java.time.LocalTime"));
        Object term448379 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term448380 = newInstance(Class.forName("java.time.LocalDate"));
        Object term448384 = newInstance(Class.forName("java.time.LocalTime"));
        Object term448389 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term448390 = newInstance(Class.forName("java.time.LocalDate"));
        Object term448394 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term447762, term447762.getClass(), "id", 3423965054378869855L);
        setIntField(term447762, term447762.getClass(), "acceptId", 496461454);
        setLongField(term447765, term447765.getClass(), "id", -593735869267672817L);
        setIntField(term447765, term447765.getClass(), "pdId", -697047947);
        setField(term447765, term447765.getClass(), "playerName", "xxx");
        setIntField(term447765, term447765.getClass(), "vocaloidPoints", 300);
        setIntField(term447765, term447765.getClass(), "level", 1);
        setIntField(term447765, term447765.getClass(), "levelExp", 505327656);
        setField(term447765, term447765.getClass(), "levelTitle", "xxx");
        setIntField(term447765, term447765.getClass(), "plateId", -1);
        setIntField(term447765, term447765.getClass(), "plateEffectId", -1);
        setField(term447765, term447765.getClass(), "passwordStatus", enum1005);
        setField(term447765, term447765.getClass(), "password", "**********");
        setBooleanField(term447765, term447765.getClass(), "preferPerPvModule", true);
        setBooleanField(term447765, term447765.getClass(), "preferCommonModule", true);
        setBooleanField(term447765, term447765.getClass(), "usePerPvSkin", true);
        setBooleanField(term447765, term447765.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term447765, term447765.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term447765, term447765.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term447765, term447765.getClass(), "usePerPvTouchSliderSe", true);
        setField(term447765, term447765.getClass(), "commonModule", "-999,-999,-999");
        setField(term447765, term447765.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term447889, term447889.getClass(), "year", 2026);
        setShortField(term447889, term447889.getClass(), "month", (short) 8);
        setShortField(term447889, term447889.getClass(), "day", (short) 12);
        setField(term447888, term447888.getClass(), "date", term447889);
        setByteField(term447893, term447893.getClass(), "hour", (byte) 2);
        setByteField(term447893, term447893.getClass(), "minute", (byte) 3);
        setByteField(term447893, term447893.getClass(), "second", (byte) 29);
        setIntField(term447893, term447893.getClass(), "nano", 727366000);
        setField(term447888, term447888.getClass(), "time", term447893);
        setField(term447765, term447765.getClass(), "commonModuleSetTime", term447888);
        setField(term447765, term447765.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term447765, term447765.getClass(), "commonSkin", -1);
        setIntField(term447765, term447765.getClass(), "headphoneVolume", 100);
        setBooleanField(term447765, term447765.getClass(), "buttonSeOn", true);
        setIntField(term447765, term447765.getClass(), "buttonSeVolume", 100);
        setIntField(term447765, term447765.getClass(), "sliderSeVolume", 100);
        setIntField(term447765, term447765.getClass(), "buttonSe", -1);
        setIntField(term447765, term447765.getClass(), "chainSlideSe", -1);
        setIntField(term447765, term447765.getClass(), "slideSe", -1);
        setIntField(term447765, term447765.getClass(), "sliderTouchSe", -1);
        setField(term447765, term447765.getClass(), "sortMode", enum1006);
        setIntField(term447765, term447765.getClass(), "nextPvId", -1);
        setField(term447765, term447765.getClass(), "nextDifficulty", enum1007);
        setField(term447765, term447765.getClass(), "nextEdition", enum1008);
        setBooleanField(term447765, term447765.getClass(), "showInterimRanking", true);
        setBooleanField(term447765, term447765.getClass(), "showClearStatus", true);
        setBooleanField(term447765, term447765.getClass(), "showGreatBorder", true);
        setBooleanField(term447765, term447765.getClass(), "showExcellentBorder", true);
        setBooleanField(term447765, term447765.getClass(), "showRivalBorder", true);
        setBooleanField(term447765, term447765.getClass(), "showRgoSetting", true);
        setBooleanField(term447765, term447765.getClass(), "contestNowPlayingEnable", false);
        setIntField(term447765, term447765.getClass(), "contestNowPlayingId", -1);
        setIntField(term447765, term447765.getClass(), "contestNowPlayingValue", -1);
        setField(term447765, term447765.getClass(), "contestNowPlayingResultRank", enum1009);
        setField(term447765, term447765.getClass(), "contestNowPlayingSpecifier", "");
        setField(term447765, term447765.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term447765, term447765.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term447765, term447765.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term447765, term447765.getClass(), "rivalPdId", -1);
        setField(term447762, term447762.getClass(), "pdId", term447765);
        setField(term447762, term447762.getClass(), "startMode", enum1010);
        setIntField(term448380, term448380.getClass(), "year", 2024);
        setShortField(term448380, term448380.getClass(), "month", (short) 3);
        setShortField(term448380, term448380.getClass(), "day", (short) 17);
        setField(term448379, term448379.getClass(), "date", term448380);
        setByteField(term448384, term448384.getClass(), "hour", (byte) 5);
        setByteField(term448384, term448384.getClass(), "minute", (byte) 21);
        setByteField(term448384, term448384.getClass(), "second", (byte) 47);
        setIntField(term448384, term448384.getClass(), "nano", 798433252);
        setField(term448379, term448379.getClass(), "time", term448384);
        setField(term447762, term447762.getClass(), "startTime", term448379);
        setIntField(term448390, term448390.getClass(), "year", 2023);
        setShortField(term448390, term448390.getClass(), "month", (short) 7);
        setShortField(term448390, term448390.getClass(), "day", (short) 27);
        setField(term448389, term448389.getClass(), "date", term448390);
        setByteField(term448394, term448394.getClass(), "hour", (byte) 4);
        setByteField(term448394, term448394.getClass(), "minute", (byte) 25);
        setByteField(term448394, term448394.getClass(), "second", (byte) 46);
        setIntField(term448394, term448394.getClass(), "nano", 646465452);
        setField(term448389, term448389.getClass(), "time", term448394);
        setField(term447762, term447762.getClass(), "lastUpdateTime", term448389);
        setField(term447762, term447762.getClass(), "stageIndex", term448399);
        setField(term447762, term447762.getClass(), "stageResultIndex", term448401);
        setField(term447762, term447762.getClass(), "lastPvId", term448403);
        setField(term447762, term447762.getClass(), "levelNumber", term448405);
        setField(term447762, term447762.getClass(), "levelExp", term448407);
        setField(term447762, term447762.getClass(), "oldLevelNumber", term448409);
        setField(term447762, term447762.getClass(), "oldLevelExp", term448411);
        setField(term447762, term447762.getClass(), "vp", term448413);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.GameSession");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term447762, args);
    }

};


