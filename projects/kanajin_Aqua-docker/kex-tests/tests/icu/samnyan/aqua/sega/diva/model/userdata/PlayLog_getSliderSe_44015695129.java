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

public class PlayLog_getSliderSe_44015695129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term158265;

    public PlayLog_getSliderSe_44015695129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term159004 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term159003 = ((Class) term159004).getDeclaredField((String) "MISS");
        ((Field) term159003).setAccessible(true);
        Object enum351 = ((Field) term159003).get((Object) null);
        Class<? extends Object> term159381 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term159380 = ((Class) term159381).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term159380).setAccessible(true);
        Object enum352 = ((Field) term159380).get((Object) null);
        Class<? extends Object> term159664 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term159663 = ((Class) term159664).getDeclaredField((String) "NORMAL");
        ((Field) term159663).setAccessible(true);
        Object enum353 = ((Field) term159663).get((Object) null);
        Class<? extends Object> term159939 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term159938 = ((Class) term159939).getDeclaredField((String) "ORIGINAL");
        ((Field) term159938).setAccessible(true);
        Object enum354 = ((Field) term159938).get((Object) null);
        Class<? extends Object> term160205 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term160204 = ((Class) term160205).getDeclaredField((String) "NONE");
        ((Field) term160204).setAccessible(true);
        Object enum355 = ((Field) term160204).get((Object) null);
        Class<? extends Object> term160846 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term160845 = ((Class) term160846).getDeclaredField((String) "UNDEFINED");
        ((Field) term160845).setAccessible(true);
        Object enum356 = ((Field) term160845).get((Object) null);
        Class<? extends Object> term161130 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term161129 = ((Class) term161130).getDeclaredField((String) "EXTRA");
        ((Field) term161129).setAccessible(true);
        Object enum357 = ((Field) term161129).get((Object) null);
        Class<? extends Object> term161387 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ChallengeKind");
        Field term161386 = ((Class) term161387).getDeclaredField((String) "COMPLETED");
        ((Field) term161386).setAccessible(true);
        Object enum358 = ((Field) term161386).get((Object) null);
        Class<? extends Object> term161686 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ClearResult");
        Field term161685 = ((Class) term161686).getDeclaredField((String) "PERFECT");
        ((Field) term161685).setAccessible(true);
        Object enum359 = ((Field) term161685).get((Object) null);
        term158265 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog"));
        Object term158267 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term158390 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term158391 = newInstance(Class.forName("java.time.LocalDate"));
        Object term158395 = newInstance(Class.forName("java.time.LocalTime"));
        Object term158987 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term158988 = newInstance(Class.forName("java.time.LocalDate"));
        Object term158992 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term158265, term158265.getClass(), "id", -8033714905181142681L);
        setLongField(term158267, term158267.getClass(), "id", -9040825890007374809L);
        setIntField(term158267, term158267.getClass(), "pdId", 2021136615);
        setField(term158267, term158267.getClass(), "playerName", "xxx");
        setIntField(term158267, term158267.getClass(), "vocaloidPoints", 300);
        setIntField(term158267, term158267.getClass(), "level", 1);
        setIntField(term158267, term158267.getClass(), "levelExp", 1778570695);
        setField(term158267, term158267.getClass(), "levelTitle", "xxx");
        setIntField(term158267, term158267.getClass(), "plateId", -1);
        setIntField(term158267, term158267.getClass(), "plateEffectId", -1);
        setField(term158267, term158267.getClass(), "passwordStatus", enum351);
        setField(term158267, term158267.getClass(), "password", "**********");
        setBooleanField(term158267, term158267.getClass(), "preferPerPvModule", true);
        setBooleanField(term158267, term158267.getClass(), "preferCommonModule", false);
        setBooleanField(term158267, term158267.getClass(), "usePerPvSkin", true);
        setBooleanField(term158267, term158267.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term158267, term158267.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term158267, term158267.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term158267, term158267.getClass(), "usePerPvTouchSliderSe", false);
        setField(term158267, term158267.getClass(), "commonModule", "-999,-999,-999");
        setField(term158267, term158267.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term158391, term158391.getClass(), "year", 2026);
        setShortField(term158391, term158391.getClass(), "month", (short) 6);
        setShortField(term158391, term158391.getClass(), "day", (short) 29);
        setField(term158390, term158390.getClass(), "date", term158391);
        setByteField(term158395, term158395.getClass(), "hour", (byte) 4);
        setByteField(term158395, term158395.getClass(), "minute", (byte) 27);
        setByteField(term158395, term158395.getClass(), "second", (byte) 30);
        setIntField(term158395, term158395.getClass(), "nano", 989031000);
        setField(term158390, term158390.getClass(), "time", term158395);
        setField(term158267, term158267.getClass(), "commonModuleSetTime", term158390);
        setField(term158267, term158267.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term158267, term158267.getClass(), "commonSkin", -1);
        setIntField(term158267, term158267.getClass(), "headphoneVolume", 100);
        setBooleanField(term158267, term158267.getClass(), "buttonSeOn", true);
        setIntField(term158267, term158267.getClass(), "buttonSeVolume", 100);
        setIntField(term158267, term158267.getClass(), "sliderSeVolume", 100);
        setIntField(term158267, term158267.getClass(), "buttonSe", -1);
        setIntField(term158267, term158267.getClass(), "chainSlideSe", -1);
        setIntField(term158267, term158267.getClass(), "slideSe", -1);
        setIntField(term158267, term158267.getClass(), "sliderTouchSe", -1);
        setField(term158267, term158267.getClass(), "sortMode", enum352);
        setIntField(term158267, term158267.getClass(), "nextPvId", -1);
        setField(term158267, term158267.getClass(), "nextDifficulty", enum353);
        setField(term158267, term158267.getClass(), "nextEdition", enum354);
        setBooleanField(term158267, term158267.getClass(), "showInterimRanking", true);
        setBooleanField(term158267, term158267.getClass(), "showClearStatus", true);
        setBooleanField(term158267, term158267.getClass(), "showGreatBorder", true);
        setBooleanField(term158267, term158267.getClass(), "showExcellentBorder", true);
        setBooleanField(term158267, term158267.getClass(), "showRivalBorder", true);
        setBooleanField(term158267, term158267.getClass(), "showRgoSetting", true);
        setBooleanField(term158267, term158267.getClass(), "contestNowPlayingEnable", true);
        setIntField(term158267, term158267.getClass(), "contestNowPlayingId", -1);
        setIntField(term158267, term158267.getClass(), "contestNowPlayingValue", -1);
        setField(term158267, term158267.getClass(), "contestNowPlayingResultRank", enum355);
        setField(term158267, term158267.getClass(), "contestNowPlayingSpecifier", "");
        setField(term158267, term158267.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term158267, term158267.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term158267, term158267.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term158267, term158267.getClass(), "rivalPdId", -1);
        setField(term158265, term158265.getClass(), "pdId", term158267);
        setIntField(term158265, term158265.getClass(), "pvId", -1142164411);
        setField(term158265, term158265.getClass(), "difficulty", enum356);
        setField(term158265, term158265.getClass(), "edition", enum357);
        setIntField(term158265, term158265.getClass(), "scriptVer", -1619435313);
        setIntField(term158265, term158265.getClass(), "score", 1013801066);
        setField(term158265, term158265.getClass(), "challengeKind", enum358);
        setIntField(term158265, term158265.getClass(), "challengeResult", 1512541853);
        setField(term158265, term158265.getClass(), "clearResult", enum359);
        setIntField(term158265, term158265.getClass(), "vp", -965421502);
        setIntField(term158265, term158265.getClass(), "coolCount", 1319026002);
        setIntField(term158265, term158265.getClass(), "coolPercent", -1368173231);
        setIntField(term158265, term158265.getClass(), "fineCount", 1956006038);
        setIntField(term158265, term158265.getClass(), "finePercent", -1062304878);
        setIntField(term158265, term158265.getClass(), "safeCount", -1377876610);
        setIntField(term158265, term158265.getClass(), "safePercent", -1456184732);
        setIntField(term158265, term158265.getClass(), "sadCount", 1689228897);
        setIntField(term158265, term158265.getClass(), "sadPercent", 892205855);
        setIntField(term158265, term158265.getClass(), "wrongCount", 1955560079);
        setIntField(term158265, term158265.getClass(), "wrongPercent", -1330529019);
        setIntField(term158265, term158265.getClass(), "maxCombo", 237134844);
        setIntField(term158265, term158265.getClass(), "chanceTime", 2076413861);
        setIntField(term158265, term158265.getClass(), "holdScore", 66817373);
        setIntField(term158265, term158265.getClass(), "attainPoint", 1459628013);
        setIntField(term158265, term158265.getClass(), "skinId", -1641507499);
        setIntField(term158265, term158265.getClass(), "buttonSe", -33436796);
        setIntField(term158265, term158265.getClass(), "buttonSeVol", -1527326823);
        setIntField(term158265, term158265.getClass(), "sliderSe", 469871899);
        setIntField(term158265, term158265.getClass(), "ChainSlideSe", -1348703436);
        setIntField(term158265, term158265.getClass(), "SliderTouchSe", -2027012650);
        setField(term158265, term158265.getClass(), "modules", "TimdotUuNC");
        setIntField(term158265, term158265.getClass(), "stageCompletion", 1343432022);
        setIntField(term158265, term158265.getClass(), "slideScore", -1767079160);
        setIntField(term158265, term158265.getClass(), "isVocalChange", -201010601);
        setField(term158265, term158265.getClass(), "customizeItems", "PkWMRdJcBb");
        setField(term158265, term158265.getClass(), "rhythmGameOptions", "jSpAteRute");
        setIntField(term158265, term158265.getClass(), "screenShotCount", -1);
        setIntField(term158988, term158988.getClass(), "year", 2012);
        setShortField(term158988, term158988.getClass(), "month", (short) 8);
        setShortField(term158988, term158988.getClass(), "day", (short) 25);
        setField(term158987, term158987.getClass(), "date", term158988);
        setByteField(term158992, term158992.getClass(), "hour", (byte) 19);
        setByteField(term158992, term158992.getClass(), "minute", (byte) 49);
        setByteField(term158992, term158992.getClass(), "second", (byte) 8);
        setIntField(term158992, term158992.getClass(), "nano", 912685024);
        setField(term158987, term158987.getClass(), "time", term158992);
        setField(term158265, term158265.getClass(), "dateTime", term158987);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSliderSe", argTypes, term158265, args);
    }

};


