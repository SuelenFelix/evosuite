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

public class PlayLog_setClearResult_124576718349 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term232052;
     Object enum533;

    public PlayLog_setClearResult_124576718349() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term232786 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term232785 = ((Class) term232786).getDeclaredField((String) "MISS");
        ((Field) term232785).setAccessible(true);
        Object enum525 = ((Field) term232785).get((Object) null);
        Class<? extends Object> term233163 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term233162 = ((Class) term233163).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term233162).setAccessible(true);
        Object enum526 = ((Field) term233162).get((Object) null);
        Class<? extends Object> term233446 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term233445 = ((Class) term233446).getDeclaredField((String) "NORMAL");
        ((Field) term233445).setAccessible(true);
        Object enum527 = ((Field) term233445).get((Object) null);
        Class<? extends Object> term233721 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term233720 = ((Class) term233721).getDeclaredField((String) "ORIGINAL");
        ((Field) term233720).setAccessible(true);
        Object enum528 = ((Field) term233720).get((Object) null);
        Class<? extends Object> term233987 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term233986 = ((Class) term233987).getDeclaredField((String) "NONE");
        ((Field) term233986).setAccessible(true);
        Object enum529 = ((Field) term233986).get((Object) null);
        Class<? extends Object> term234628 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term234627 = ((Class) term234628).getDeclaredField((String) "EASY");
        ((Field) term234627).setAccessible(true);
        Object enum530 = ((Field) term234627).get((Object) null);
        Class<? extends Object> term234897 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ChallengeKind");
        Field term234896 = ((Class) term234897).getDeclaredField((String) "PERFECT");
        ((Field) term234896).setAccessible(true);
        Object enum531 = ((Field) term234896).get((Object) null);
        Class<? extends Object> term235190 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ClearResult");
        Field term235189 = ((Class) term235190).getDeclaredField((String) "GREAT");
        ((Field) term235189).setAccessible(true);
        Object enum532 = ((Field) term235189).get((Object) null);
        term232052 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog"));
        Object term232054 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term232177 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term232178 = newInstance(Class.forName("java.time.LocalDate"));
        Object term232182 = newInstance(Class.forName("java.time.LocalTime"));
        Object term232755 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term232756 = newInstance(Class.forName("java.time.LocalDate"));
        Object term232760 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term232052, term232052.getClass(), "id", -6587807377747738663L);
        setLongField(term232054, term232054.getClass(), "id", -6301101997917060727L);
        setIntField(term232054, term232054.getClass(), "pdId", -217226756);
        setField(term232054, term232054.getClass(), "playerName", "xxx");
        setIntField(term232054, term232054.getClass(), "vocaloidPoints", 300);
        setIntField(term232054, term232054.getClass(), "level", 1);
        setIntField(term232054, term232054.getClass(), "levelExp", 1608000247);
        setField(term232054, term232054.getClass(), "levelTitle", "xxx");
        setIntField(term232054, term232054.getClass(), "plateId", -1);
        setIntField(term232054, term232054.getClass(), "plateEffectId", -1);
        setField(term232054, term232054.getClass(), "passwordStatus", enum525);
        setField(term232054, term232054.getClass(), "password", "**********");
        setBooleanField(term232054, term232054.getClass(), "preferPerPvModule", true);
        setBooleanField(term232054, term232054.getClass(), "preferCommonModule", false);
        setBooleanField(term232054, term232054.getClass(), "usePerPvSkin", false);
        setBooleanField(term232054, term232054.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term232054, term232054.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term232054, term232054.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term232054, term232054.getClass(), "usePerPvTouchSliderSe", false);
        setField(term232054, term232054.getClass(), "commonModule", "-999,-999,-999");
        setField(term232054, term232054.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term232178, term232178.getClass(), "year", 2026);
        setShortField(term232178, term232178.getClass(), "month", (short) 8);
        setShortField(term232178, term232178.getClass(), "day", (short) 12);
        setField(term232177, term232177.getClass(), "date", term232178);
        setByteField(term232182, term232182.getClass(), "hour", (byte) 2);
        setByteField(term232182, term232182.getClass(), "minute", (byte) 2);
        setByteField(term232182, term232182.getClass(), "second", (byte) 52);
        setIntField(term232182, term232182.getClass(), "nano", 580492000);
        setField(term232177, term232177.getClass(), "time", term232182);
        setField(term232054, term232054.getClass(), "commonModuleSetTime", term232177);
        setField(term232054, term232054.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term232054, term232054.getClass(), "commonSkin", -1);
        setIntField(term232054, term232054.getClass(), "headphoneVolume", 100);
        setBooleanField(term232054, term232054.getClass(), "buttonSeOn", true);
        setIntField(term232054, term232054.getClass(), "buttonSeVolume", 100);
        setIntField(term232054, term232054.getClass(), "sliderSeVolume", 100);
        setIntField(term232054, term232054.getClass(), "buttonSe", -1);
        setIntField(term232054, term232054.getClass(), "chainSlideSe", -1);
        setIntField(term232054, term232054.getClass(), "slideSe", -1);
        setIntField(term232054, term232054.getClass(), "sliderTouchSe", -1);
        setField(term232054, term232054.getClass(), "sortMode", enum526);
        setIntField(term232054, term232054.getClass(), "nextPvId", -1);
        setField(term232054, term232054.getClass(), "nextDifficulty", enum527);
        setField(term232054, term232054.getClass(), "nextEdition", enum528);
        setBooleanField(term232054, term232054.getClass(), "showInterimRanking", true);
        setBooleanField(term232054, term232054.getClass(), "showClearStatus", true);
        setBooleanField(term232054, term232054.getClass(), "showGreatBorder", true);
        setBooleanField(term232054, term232054.getClass(), "showExcellentBorder", true);
        setBooleanField(term232054, term232054.getClass(), "showRivalBorder", true);
        setBooleanField(term232054, term232054.getClass(), "showRgoSetting", true);
        setBooleanField(term232054, term232054.getClass(), "contestNowPlayingEnable", false);
        setIntField(term232054, term232054.getClass(), "contestNowPlayingId", -1);
        setIntField(term232054, term232054.getClass(), "contestNowPlayingValue", -1);
        setField(term232054, term232054.getClass(), "contestNowPlayingResultRank", enum529);
        setField(term232054, term232054.getClass(), "contestNowPlayingSpecifier", "");
        setField(term232054, term232054.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term232054, term232054.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term232054, term232054.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term232054, term232054.getClass(), "rivalPdId", -1);
        setField(term232052, term232052.getClass(), "pdId", term232054);
        setIntField(term232052, term232052.getClass(), "pvId", 1354560887);
        setField(term232052, term232052.getClass(), "difficulty", enum530);
        setField(term232052, term232052.getClass(), "edition", enum528);
        setIntField(term232052, term232052.getClass(), "scriptVer", -749474542);
        setIntField(term232052, term232052.getClass(), "score", -47907780);
        setField(term232052, term232052.getClass(), "challengeKind", enum531);
        setIntField(term232052, term232052.getClass(), "challengeResult", 1131462369);
        setField(term232052, term232052.getClass(), "clearResult", enum532);
        setIntField(term232052, term232052.getClass(), "vp", -1161206731);
        setIntField(term232052, term232052.getClass(), "coolCount", -992847709);
        setIntField(term232052, term232052.getClass(), "coolPercent", 1125156671);
        setIntField(term232052, term232052.getClass(), "fineCount", 1203107925);
        setIntField(term232052, term232052.getClass(), "finePercent", 1825448944);
        setIntField(term232052, term232052.getClass(), "safeCount", 1769496642);
        setIntField(term232052, term232052.getClass(), "safePercent", -947460705);
        setIntField(term232052, term232052.getClass(), "sadCount", -1435758764);
        setIntField(term232052, term232052.getClass(), "sadPercent", 752858379);
        setIntField(term232052, term232052.getClass(), "wrongCount", -370819357);
        setIntField(term232052, term232052.getClass(), "wrongPercent", -71819242);
        setIntField(term232052, term232052.getClass(), "maxCombo", 1268893136);
        setIntField(term232052, term232052.getClass(), "chanceTime", -1472700822);
        setIntField(term232052, term232052.getClass(), "holdScore", 1626670889);
        setIntField(term232052, term232052.getClass(), "attainPoint", -2117361140);
        setIntField(term232052, term232052.getClass(), "skinId", 407708341);
        setIntField(term232052, term232052.getClass(), "buttonSe", -287519200);
        setIntField(term232052, term232052.getClass(), "buttonSeVol", -1490696181);
        setIntField(term232052, term232052.getClass(), "sliderSe", 623717232);
        setIntField(term232052, term232052.getClass(), "ChainSlideSe", -1413291732);
        setIntField(term232052, term232052.getClass(), "SliderTouchSe", 203264365);
        setField(term232052, term232052.getClass(), "modules", "FPvxVzzSvD");
        setIntField(term232052, term232052.getClass(), "stageCompletion", -1066281036);
        setIntField(term232052, term232052.getClass(), "slideScore", 30837706);
        setIntField(term232052, term232052.getClass(), "isVocalChange", 379523101);
        setField(term232052, term232052.getClass(), "customizeItems", "WHcwFgsGFC");
        setField(term232052, term232052.getClass(), "rhythmGameOptions", "HzqpegHiRq");
        setIntField(term232052, term232052.getClass(), "screenShotCount", -1);
        setIntField(term232756, term232756.getClass(), "year", 2021);
        setShortField(term232756, term232756.getClass(), "month", (short) 4);
        setShortField(term232756, term232756.getClass(), "day", (short) 17);
        setField(term232755, term232755.getClass(), "date", term232756);
        setByteField(term232760, term232760.getClass(), "hour", (byte) 4);
        setByteField(term232760, term232760.getClass(), "minute", (byte) 11);
        setByteField(term232760, term232760.getClass(), "second", (byte) 16);
        setIntField(term232760, term232760.getClass(), "nano", 509895858);
        setField(term232755, term232755.getClass(), "time", term232760);
        setField(term232052, term232052.getClass(), "dateTime", term232755);
        Class<? extends Object> term235497 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ClearResult");
        Field term235496 = ((Class) term235497).getDeclaredField((String) "MISS_TAKE");
        ((Field) term235496).setAccessible(true);
        enum533 = ((Field) term235496).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.diva.model.common.ClearResult");
        Object[] args = new Object[1];
        args[0] = enum533;
        callMethod(klass, "setClearResult", argTypes, term232052, args);
    }

};


