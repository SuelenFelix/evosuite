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

public class GameSession_canEqual_80813830530 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term442209;
     Object term442862;

    public GameSession_canEqual_80813830530() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term442870 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term442869 = ((Class) term442870).getDeclaredField((String) "MISS");
        ((Field) term442869).setAccessible(true);
        Object enum993 = ((Field) term442869).get((Object) null);
        Class<? extends Object> term443247 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term443246 = ((Class) term443247).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term443246).setAccessible(true);
        Object enum994 = ((Field) term443246).get((Object) null);
        Class<? extends Object> term443530 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term443529 = ((Class) term443530).getDeclaredField((String) "NORMAL");
        ((Field) term443529).setAccessible(true);
        Object enum995 = ((Field) term443529).get((Object) null);
        Class<? extends Object> term443805 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term443804 = ((Class) term443805).getDeclaredField((String) "ORIGINAL");
        ((Field) term443804).setAccessible(true);
        Object enum996 = ((Field) term443804).get((Object) null);
        Class<? extends Object> term444071 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term444070 = ((Class) term444071).getDeclaredField((String) "NONE");
        ((Field) term444070).setAccessible(true);
        Object enum997 = ((Field) term444070).get((Object) null);
        Class<? extends Object> term444712 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.StartMode");
        Field term444711 = ((Class) term444712).getDeclaredField((String) "START");
        ((Field) term444711).setAccessible(true);
        Object enum998 = ((Field) term444711).get((Object) null);
        Integer term442846 = new Integer(1460722225);
        Integer term442848 = new Integer(1743224434);
        Integer term442850 = new Integer(842904495);
        Integer term442852 = new Integer(1008080511);
        Integer term442854 = new Integer(1935707624);
        Integer term442856 = new Integer(1507074215);
        Integer term442858 = new Integer(-282881827);
        Integer term442860 = new Integer(-1183353915);
        term442209 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.GameSession"));
        Object term442212 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term442335 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term442336 = newInstance(Class.forName("java.time.LocalDate"));
        Object term442340 = newInstance(Class.forName("java.time.LocalTime"));
        Object term442826 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term442827 = newInstance(Class.forName("java.time.LocalDate"));
        Object term442831 = newInstance(Class.forName("java.time.LocalTime"));
        Object term442836 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term442837 = newInstance(Class.forName("java.time.LocalDate"));
        Object term442841 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term442209, term442209.getClass(), "id", -2951854704066477061L);
        setIntField(term442209, term442209.getClass(), "acceptId", 449172516);
        setLongField(term442212, term442212.getClass(), "id", 174253963298276221L);
        setIntField(term442212, term442212.getClass(), "pdId", -1224535182);
        setField(term442212, term442212.getClass(), "playerName", "xxx");
        setIntField(term442212, term442212.getClass(), "vocaloidPoints", 300);
        setIntField(term442212, term442212.getClass(), "level", 1);
        setIntField(term442212, term442212.getClass(), "levelExp", 1181771633);
        setField(term442212, term442212.getClass(), "levelTitle", "xxx");
        setIntField(term442212, term442212.getClass(), "plateId", -1);
        setIntField(term442212, term442212.getClass(), "plateEffectId", -1);
        setField(term442212, term442212.getClass(), "passwordStatus", enum993);
        setField(term442212, term442212.getClass(), "password", "**********");
        setBooleanField(term442212, term442212.getClass(), "preferPerPvModule", true);
        setBooleanField(term442212, term442212.getClass(), "preferCommonModule", false);
        setBooleanField(term442212, term442212.getClass(), "usePerPvSkin", true);
        setBooleanField(term442212, term442212.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term442212, term442212.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term442212, term442212.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term442212, term442212.getClass(), "usePerPvTouchSliderSe", true);
        setField(term442212, term442212.getClass(), "commonModule", "-999,-999,-999");
        setField(term442212, term442212.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term442336, term442336.getClass(), "year", 2026);
        setShortField(term442336, term442336.getClass(), "month", (short) 8);
        setShortField(term442336, term442336.getClass(), "day", (short) 12);
        setField(term442335, term442335.getClass(), "date", term442336);
        setByteField(term442340, term442340.getClass(), "hour", (byte) 2);
        setByteField(term442340, term442340.getClass(), "minute", (byte) 3);
        setByteField(term442340, term442340.getClass(), "second", (byte) 29);
        setIntField(term442340, term442340.getClass(), "nano", 227118000);
        setField(term442335, term442335.getClass(), "time", term442340);
        setField(term442212, term442212.getClass(), "commonModuleSetTime", term442335);
        setField(term442212, term442212.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term442212, term442212.getClass(), "commonSkin", -1);
        setIntField(term442212, term442212.getClass(), "headphoneVolume", 100);
        setBooleanField(term442212, term442212.getClass(), "buttonSeOn", true);
        setIntField(term442212, term442212.getClass(), "buttonSeVolume", 100);
        setIntField(term442212, term442212.getClass(), "sliderSeVolume", 100);
        setIntField(term442212, term442212.getClass(), "buttonSe", -1);
        setIntField(term442212, term442212.getClass(), "chainSlideSe", -1);
        setIntField(term442212, term442212.getClass(), "slideSe", -1);
        setIntField(term442212, term442212.getClass(), "sliderTouchSe", -1);
        setField(term442212, term442212.getClass(), "sortMode", enum994);
        setIntField(term442212, term442212.getClass(), "nextPvId", -1);
        setField(term442212, term442212.getClass(), "nextDifficulty", enum995);
        setField(term442212, term442212.getClass(), "nextEdition", enum996);
        setBooleanField(term442212, term442212.getClass(), "showInterimRanking", true);
        setBooleanField(term442212, term442212.getClass(), "showClearStatus", true);
        setBooleanField(term442212, term442212.getClass(), "showGreatBorder", true);
        setBooleanField(term442212, term442212.getClass(), "showExcellentBorder", true);
        setBooleanField(term442212, term442212.getClass(), "showRivalBorder", true);
        setBooleanField(term442212, term442212.getClass(), "showRgoSetting", true);
        setBooleanField(term442212, term442212.getClass(), "contestNowPlayingEnable", false);
        setIntField(term442212, term442212.getClass(), "contestNowPlayingId", -1);
        setIntField(term442212, term442212.getClass(), "contestNowPlayingValue", -1);
        setField(term442212, term442212.getClass(), "contestNowPlayingResultRank", enum997);
        setField(term442212, term442212.getClass(), "contestNowPlayingSpecifier", "");
        setField(term442212, term442212.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term442212, term442212.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term442212, term442212.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term442212, term442212.getClass(), "rivalPdId", -1);
        setField(term442209, term442209.getClass(), "pdId", term442212);
        setField(term442209, term442209.getClass(), "startMode", enum998);
        setIntField(term442827, term442827.getClass(), "year", 2021);
        setShortField(term442827, term442827.getClass(), "month", (short) 8);
        setShortField(term442827, term442827.getClass(), "day", (short) 23);
        setField(term442826, term442826.getClass(), "date", term442827);
        setByteField(term442831, term442831.getClass(), "hour", (byte) 15);
        setByteField(term442831, term442831.getClass(), "minute", (byte) 43);
        setByteField(term442831, term442831.getClass(), "second", (byte) 10);
        setIntField(term442831, term442831.getClass(), "nano", 893504165);
        setField(term442826, term442826.getClass(), "time", term442831);
        setField(term442209, term442209.getClass(), "startTime", term442826);
        setIntField(term442837, term442837.getClass(), "year", 2015);
        setShortField(term442837, term442837.getClass(), "month", (short) 2);
        setShortField(term442837, term442837.getClass(), "day", (short) 1);
        setField(term442836, term442836.getClass(), "date", term442837);
        setByteField(term442841, term442841.getClass(), "hour", (byte) 11);
        setByteField(term442841, term442841.getClass(), "minute", (byte) 31);
        setByteField(term442841, term442841.getClass(), "second", (byte) 24);
        setIntField(term442841, term442841.getClass(), "nano", 461437823);
        setField(term442836, term442836.getClass(), "time", term442841);
        setField(term442209, term442209.getClass(), "lastUpdateTime", term442836);
        setField(term442209, term442209.getClass(), "stageIndex", term442846);
        setField(term442209, term442209.getClass(), "stageResultIndex", term442848);
        setField(term442209, term442209.getClass(), "lastPvId", term442850);
        setField(term442209, term442209.getClass(), "levelNumber", term442852);
        setField(term442209, term442209.getClass(), "levelExp", term442854);
        setField(term442209, term442209.getClass(), "oldLevelNumber", term442856);
        setField(term442209, term442209.getClass(), "oldLevelExp", term442858);
        setField(term442209, term442209.getClass(), "vp", term442860);
        term442862 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.GameSession");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term442862;
        callMethod(klass, "canEqual", argTypes, term442209, args);
    }

};


