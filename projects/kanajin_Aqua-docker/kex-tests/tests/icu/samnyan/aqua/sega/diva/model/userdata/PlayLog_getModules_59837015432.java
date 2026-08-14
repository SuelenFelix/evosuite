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

public class PlayLog_getModules_59837015432 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term169142;

    public PlayLog_getModules_59837015432() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term169883 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term169882 = ((Class) term169883).getDeclaredField((String) "MISS");
        ((Field) term169882).setAccessible(true);
        Object enum377 = ((Field) term169882).get((Object) null);
        Class<? extends Object> term170260 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term170259 = ((Class) term170260).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term170259).setAccessible(true);
        Object enum378 = ((Field) term170259).get((Object) null);
        Class<? extends Object> term170543 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term170542 = ((Class) term170543).getDeclaredField((String) "NORMAL");
        ((Field) term170542).setAccessible(true);
        Object enum379 = ((Field) term170542).get((Object) null);
        Class<? extends Object> term170818 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term170817 = ((Class) term170818).getDeclaredField((String) "ORIGINAL");
        ((Field) term170817).setAccessible(true);
        Object enum380 = ((Field) term170817).get((Object) null);
        Class<? extends Object> term171084 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term171083 = ((Class) term171084).getDeclaredField((String) "NONE");
        ((Field) term171083).setAccessible(true);
        Object enum381 = ((Field) term171083).get((Object) null);
        Class<? extends Object> term171725 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term171724 = ((Class) term171725).getDeclaredField((String) "UNDEFINED");
        ((Field) term171724).setAccessible(true);
        Object enum382 = ((Field) term171724).get((Object) null);
        Class<? extends Object> term172009 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term172008 = ((Class) term172009).getDeclaredField((String) "EXTRA");
        ((Field) term172008).setAccessible(true);
        Object enum383 = ((Field) term172008).get((Object) null);
        Class<? extends Object> term172266 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ChallengeKind");
        Field term172265 = ((Class) term172266).getDeclaredField((String) "EXCELLENT");
        ((Field) term172265).setAccessible(true);
        Object enum384 = ((Field) term172265).get((Object) null);
        Class<? extends Object> term172565 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ClearResult");
        Field term172564 = ((Class) term172565).getDeclaredField((String) "EXCELLENT");
        ((Field) term172564).setAccessible(true);
        Object enum385 = ((Field) term172564).get((Object) null);
        term169142 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog"));
        Object term169144 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term169267 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term169268 = newInstance(Class.forName("java.time.LocalDate"));
        Object term169272 = newInstance(Class.forName("java.time.LocalTime"));
        Object term169866 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term169867 = newInstance(Class.forName("java.time.LocalDate"));
        Object term169871 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term169142, term169142.getClass(), "id", -3936701866695933852L);
        setLongField(term169144, term169144.getClass(), "id", 1215116475929634177L);
        setIntField(term169144, term169144.getClass(), "pdId", -203163250);
        setField(term169144, term169144.getClass(), "playerName", "xxx");
        setIntField(term169144, term169144.getClass(), "vocaloidPoints", 300);
        setIntField(term169144, term169144.getClass(), "level", 1);
        setIntField(term169144, term169144.getClass(), "levelExp", 498473526);
        setField(term169144, term169144.getClass(), "levelTitle", "xxx");
        setIntField(term169144, term169144.getClass(), "plateId", -1);
        setIntField(term169144, term169144.getClass(), "plateEffectId", -1);
        setField(term169144, term169144.getClass(), "passwordStatus", enum377);
        setField(term169144, term169144.getClass(), "password", "**********");
        setBooleanField(term169144, term169144.getClass(), "preferPerPvModule", true);
        setBooleanField(term169144, term169144.getClass(), "preferCommonModule", true);
        setBooleanField(term169144, term169144.getClass(), "usePerPvSkin", false);
        setBooleanField(term169144, term169144.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term169144, term169144.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term169144, term169144.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term169144, term169144.getClass(), "usePerPvTouchSliderSe", true);
        setField(term169144, term169144.getClass(), "commonModule", "-999,-999,-999");
        setField(term169144, term169144.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term169268, term169268.getClass(), "year", 2026);
        setShortField(term169268, term169268.getClass(), "month", (short) 8);
        setShortField(term169268, term169268.getClass(), "day", (short) 12);
        setField(term169267, term169267.getClass(), "date", term169268);
        setByteField(term169272, term169272.getClass(), "hour", (byte) 2);
        setByteField(term169272, term169272.getClass(), "minute", (byte) 2);
        setByteField(term169272, term169272.getClass(), "second", (byte) 48);
        setIntField(term169272, term169272.getClass(), "nano", 239387000);
        setField(term169267, term169267.getClass(), "time", term169272);
        setField(term169144, term169144.getClass(), "commonModuleSetTime", term169267);
        setField(term169144, term169144.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term169144, term169144.getClass(), "commonSkin", -1);
        setIntField(term169144, term169144.getClass(), "headphoneVolume", 100);
        setBooleanField(term169144, term169144.getClass(), "buttonSeOn", true);
        setIntField(term169144, term169144.getClass(), "buttonSeVolume", 100);
        setIntField(term169144, term169144.getClass(), "sliderSeVolume", 100);
        setIntField(term169144, term169144.getClass(), "buttonSe", -1);
        setIntField(term169144, term169144.getClass(), "chainSlideSe", -1);
        setIntField(term169144, term169144.getClass(), "slideSe", -1);
        setIntField(term169144, term169144.getClass(), "sliderTouchSe", -1);
        setField(term169144, term169144.getClass(), "sortMode", enum378);
        setIntField(term169144, term169144.getClass(), "nextPvId", -1);
        setField(term169144, term169144.getClass(), "nextDifficulty", enum379);
        setField(term169144, term169144.getClass(), "nextEdition", enum380);
        setBooleanField(term169144, term169144.getClass(), "showInterimRanking", true);
        setBooleanField(term169144, term169144.getClass(), "showClearStatus", true);
        setBooleanField(term169144, term169144.getClass(), "showGreatBorder", true);
        setBooleanField(term169144, term169144.getClass(), "showExcellentBorder", true);
        setBooleanField(term169144, term169144.getClass(), "showRivalBorder", true);
        setBooleanField(term169144, term169144.getClass(), "showRgoSetting", true);
        setBooleanField(term169144, term169144.getClass(), "contestNowPlayingEnable", true);
        setIntField(term169144, term169144.getClass(), "contestNowPlayingId", -1);
        setIntField(term169144, term169144.getClass(), "contestNowPlayingValue", -1);
        setField(term169144, term169144.getClass(), "contestNowPlayingResultRank", enum381);
        setField(term169144, term169144.getClass(), "contestNowPlayingSpecifier", "");
        setField(term169144, term169144.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term169144, term169144.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term169144, term169144.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term169144, term169144.getClass(), "rivalPdId", -1);
        setField(term169142, term169142.getClass(), "pdId", term169144);
        setIntField(term169142, term169142.getClass(), "pvId", 1186917020);
        setField(term169142, term169142.getClass(), "difficulty", enum382);
        setField(term169142, term169142.getClass(), "edition", enum383);
        setIntField(term169142, term169142.getClass(), "scriptVer", 1670041824);
        setIntField(term169142, term169142.getClass(), "score", 2140388634);
        setField(term169142, term169142.getClass(), "challengeKind", enum384);
        setIntField(term169142, term169142.getClass(), "challengeResult", 21095258);
        setField(term169142, term169142.getClass(), "clearResult", enum385);
        setIntField(term169142, term169142.getClass(), "vp", -1793997256);
        setIntField(term169142, term169142.getClass(), "coolCount", -1271598018);
        setIntField(term169142, term169142.getClass(), "coolPercent", 157967613);
        setIntField(term169142, term169142.getClass(), "fineCount", 811839399);
        setIntField(term169142, term169142.getClass(), "finePercent", 593962063);
        setIntField(term169142, term169142.getClass(), "safeCount", -1485826786);
        setIntField(term169142, term169142.getClass(), "safePercent", -1549952664);
        setIntField(term169142, term169142.getClass(), "sadCount", 148394188);
        setIntField(term169142, term169142.getClass(), "sadPercent", 504525721);
        setIntField(term169142, term169142.getClass(), "wrongCount", 1835568392);
        setIntField(term169142, term169142.getClass(), "wrongPercent", 457470807);
        setIntField(term169142, term169142.getClass(), "maxCombo", -994742871);
        setIntField(term169142, term169142.getClass(), "chanceTime", -222412326);
        setIntField(term169142, term169142.getClass(), "holdScore", -299497261);
        setIntField(term169142, term169142.getClass(), "attainPoint", -23054366);
        setIntField(term169142, term169142.getClass(), "skinId", 153009426);
        setIntField(term169142, term169142.getClass(), "buttonSe", 185751892);
        setIntField(term169142, term169142.getClass(), "buttonSeVol", 1068256001);
        setIntField(term169142, term169142.getClass(), "sliderSe", 1139078354);
        setIntField(term169142, term169142.getClass(), "ChainSlideSe", -691164974);
        setIntField(term169142, term169142.getClass(), "SliderTouchSe", -761675396);
        setField(term169142, term169142.getClass(), "modules", "XqgfKFvPSD");
        setIntField(term169142, term169142.getClass(), "stageCompletion", -1954860951);
        setIntField(term169142, term169142.getClass(), "slideScore", -2078879114);
        setIntField(term169142, term169142.getClass(), "isVocalChange", -1186882318);
        setField(term169142, term169142.getClass(), "customizeItems", "JiVRgTZvKc");
        setField(term169142, term169142.getClass(), "rhythmGameOptions", "XPKmummaqg");
        setIntField(term169142, term169142.getClass(), "screenShotCount", -1);
        setIntField(term169867, term169867.getClass(), "year", 2010);
        setShortField(term169867, term169867.getClass(), "month", (short) 5);
        setShortField(term169867, term169867.getClass(), "day", (short) 2);
        setField(term169866, term169866.getClass(), "date", term169867);
        setByteField(term169871, term169871.getClass(), "hour", (byte) 2);
        setByteField(term169871, term169871.getClass(), "minute", (byte) 22);
        setByteField(term169871, term169871.getClass(), "second", (byte) 33);
        setIntField(term169871, term169871.getClass(), "nano", 530835039);
        setField(term169866, term169866.getClass(), "time", term169871);
        setField(term169142, term169142.getClass(), "dateTime", term169866);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getModules", argTypes, term169142, args);
    }

};


