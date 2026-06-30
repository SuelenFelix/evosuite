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

public class PlayLog_getId_13240049751 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59372;

    public PlayLog_getId_13240049751() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term60090 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term60089 = ((Class) term60090).getDeclaredField((String) "MISS");
        ((Field) term60089).setAccessible(true);
        Object enum118 = ((Field) term60089).get((Object) null);
        Class<? extends Object> term60467 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term60466 = ((Class) term60467).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term60466).setAccessible(true);
        Object enum119 = ((Field) term60466).get((Object) null);
        Class<? extends Object> term60750 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term60749 = ((Class) term60750).getDeclaredField((String) "NORMAL");
        ((Field) term60749).setAccessible(true);
        Object enum120 = ((Field) term60749).get((Object) null);
        Class<? extends Object> term61025 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term61024 = ((Class) term61025).getDeclaredField((String) "ORIGINAL");
        ((Field) term61024).setAccessible(true);
        Object enum121 = ((Field) term61024).get((Object) null);
        Class<? extends Object> term61291 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term61290 = ((Class) term61291).getDeclaredField((String) "NONE");
        ((Field) term61290).setAccessible(true);
        Object enum122 = ((Field) term61290).get((Object) null);
        Class<? extends Object> term61932 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term61931 = ((Class) term61932).getDeclaredField((String) "HARD");
        ((Field) term61931).setAccessible(true);
        Object enum123 = ((Field) term61931).get((Object) null);
        Class<? extends Object> term62201 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ChallengeKind");
        Field term62200 = ((Class) term62201).getDeclaredField((String) "GREAT");
        ((Field) term62200).setAccessible(true);
        Object enum124 = ((Field) term62200).get((Object) null);
        Class<? extends Object> term62488 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ClearResult");
        Field term62487 = ((Class) term62488).getDeclaredField((String) "GREAT");
        ((Field) term62487).setAccessible(true);
        Object enum125 = ((Field) term62487).get((Object) null);
        term59372 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog"));
        Object term59374 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term59497 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term59498 = newInstance(Class.forName("java.time.LocalDate"));
        Object term59502 = newInstance(Class.forName("java.time.LocalTime"));
        Object term60073 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term60074 = newInstance(Class.forName("java.time.LocalDate"));
        Object term60078 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term59372, term59372.getClass(), "id", -2170847986967241072L);
        setLongField(term59374, term59374.getClass(), "id", 4044358158040652353L);
        setIntField(term59374, term59374.getClass(), "pdId", -375014958);
        setField(term59374, term59374.getClass(), "playerName", "xxx");
        setIntField(term59374, term59374.getClass(), "vocaloidPoints", 300);
        setIntField(term59374, term59374.getClass(), "level", 1);
        setIntField(term59374, term59374.getClass(), "levelExp", 1107176718);
        setField(term59374, term59374.getClass(), "levelTitle", "xxx");
        setIntField(term59374, term59374.getClass(), "plateId", -1);
        setIntField(term59374, term59374.getClass(), "plateEffectId", -1);
        setField(term59374, term59374.getClass(), "passwordStatus", enum118);
        setField(term59374, term59374.getClass(), "password", "**********");
        setBooleanField(term59374, term59374.getClass(), "preferPerPvModule", true);
        setBooleanField(term59374, term59374.getClass(), "preferCommonModule", true);
        setBooleanField(term59374, term59374.getClass(), "usePerPvSkin", false);
        setBooleanField(term59374, term59374.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term59374, term59374.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term59374, term59374.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term59374, term59374.getClass(), "usePerPvTouchSliderSe", true);
        setField(term59374, term59374.getClass(), "commonModule", "-999,-999,-999");
        setField(term59374, term59374.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term59498, term59498.getClass(), "year", 2026);
        setShortField(term59498, term59498.getClass(), "month", (short) 6);
        setShortField(term59498, term59498.getClass(), "day", (short) 29);
        setField(term59497, term59497.getClass(), "date", term59498);
        setByteField(term59502, term59502.getClass(), "hour", (byte) 4);
        setByteField(term59502, term59502.getClass(), "minute", (byte) 27);
        setByteField(term59502, term59502.getClass(), "second", (byte) 23);
        setIntField(term59502, term59502.getClass(), "nano", 796173000);
        setField(term59497, term59497.getClass(), "time", term59502);
        setField(term59374, term59374.getClass(), "commonModuleSetTime", term59497);
        setField(term59374, term59374.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term59374, term59374.getClass(), "commonSkin", -1);
        setIntField(term59374, term59374.getClass(), "headphoneVolume", 100);
        setBooleanField(term59374, term59374.getClass(), "buttonSeOn", true);
        setIntField(term59374, term59374.getClass(), "buttonSeVolume", 100);
        setIntField(term59374, term59374.getClass(), "sliderSeVolume", 100);
        setIntField(term59374, term59374.getClass(), "buttonSe", -1);
        setIntField(term59374, term59374.getClass(), "chainSlideSe", -1);
        setIntField(term59374, term59374.getClass(), "slideSe", -1);
        setIntField(term59374, term59374.getClass(), "sliderTouchSe", -1);
        setField(term59374, term59374.getClass(), "sortMode", enum119);
        setIntField(term59374, term59374.getClass(), "nextPvId", -1);
        setField(term59374, term59374.getClass(), "nextDifficulty", enum120);
        setField(term59374, term59374.getClass(), "nextEdition", enum121);
        setBooleanField(term59374, term59374.getClass(), "showInterimRanking", true);
        setBooleanField(term59374, term59374.getClass(), "showClearStatus", true);
        setBooleanField(term59374, term59374.getClass(), "showGreatBorder", true);
        setBooleanField(term59374, term59374.getClass(), "showExcellentBorder", true);
        setBooleanField(term59374, term59374.getClass(), "showRivalBorder", true);
        setBooleanField(term59374, term59374.getClass(), "showRgoSetting", true);
        setBooleanField(term59374, term59374.getClass(), "contestNowPlayingEnable", false);
        setIntField(term59374, term59374.getClass(), "contestNowPlayingId", -1);
        setIntField(term59374, term59374.getClass(), "contestNowPlayingValue", -1);
        setField(term59374, term59374.getClass(), "contestNowPlayingResultRank", enum122);
        setField(term59374, term59374.getClass(), "contestNowPlayingSpecifier", "");
        setField(term59374, term59374.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term59374, term59374.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term59374, term59374.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term59374, term59374.getClass(), "rivalPdId", -1);
        setField(term59372, term59372.getClass(), "pdId", term59374);
        setIntField(term59372, term59372.getClass(), "pvId", 480137250);
        setField(term59372, term59372.getClass(), "difficulty", enum123);
        setField(term59372, term59372.getClass(), "edition", enum121);
        setIntField(term59372, term59372.getClass(), "scriptVer", -341152642);
        setIntField(term59372, term59372.getClass(), "score", -2015854073);
        setField(term59372, term59372.getClass(), "challengeKind", enum124);
        setIntField(term59372, term59372.getClass(), "challengeResult", 538259104);
        setField(term59372, term59372.getClass(), "clearResult", enum125);
        setIntField(term59372, term59372.getClass(), "vp", 96566506);
        setIntField(term59372, term59372.getClass(), "coolCount", -343325701);
        setIntField(term59372, term59372.getClass(), "coolPercent", 107945604);
        setIntField(term59372, term59372.getClass(), "fineCount", -1963464809);
        setIntField(term59372, term59372.getClass(), "finePercent", 71190297);
        setIntField(term59372, term59372.getClass(), "safeCount", 1202361360);
        setIntField(term59372, term59372.getClass(), "safePercent", -2015048153);
        setIntField(term59372, term59372.getClass(), "sadCount", -2063457669);
        setIntField(term59372, term59372.getClass(), "sadPercent", -1222006000);
        setIntField(term59372, term59372.getClass(), "wrongCount", 2095798786);
        setIntField(term59372, term59372.getClass(), "wrongPercent", -1565502840);
        setIntField(term59372, term59372.getClass(), "maxCombo", 344323424);
        setIntField(term59372, term59372.getClass(), "chanceTime", 9726679);
        setIntField(term59372, term59372.getClass(), "holdScore", -25637976);
        setIntField(term59372, term59372.getClass(), "attainPoint", 1555897383);
        setIntField(term59372, term59372.getClass(), "skinId", 202001407);
        setIntField(term59372, term59372.getClass(), "buttonSe", 158873461);
        setIntField(term59372, term59372.getClass(), "buttonSeVol", -430151637);
        setIntField(term59372, term59372.getClass(), "sliderSe", -1697741339);
        setIntField(term59372, term59372.getClass(), "ChainSlideSe", 98922530);
        setIntField(term59372, term59372.getClass(), "SliderTouchSe", -1388471422);
        setField(term59372, term59372.getClass(), "modules", "xxtlPwDYFs");
        setIntField(term59372, term59372.getClass(), "stageCompletion", -1498296052);
        setIntField(term59372, term59372.getClass(), "slideScore", 2098647989);
        setIntField(term59372, term59372.getClass(), "isVocalChange", 1598895173);
        setField(term59372, term59372.getClass(), "customizeItems", "jJCZpVmanW");
        setField(term59372, term59372.getClass(), "rhythmGameOptions", "EGtDIRbSSb");
        setIntField(term59372, term59372.getClass(), "screenShotCount", -1);
        setIntField(term60074, term60074.getClass(), "year", 2015);
        setShortField(term60074, term60074.getClass(), "month", (short) 4);
        setShortField(term60074, term60074.getClass(), "day", (short) 14);
        setField(term60073, term60073.getClass(), "date", term60074);
        setByteField(term60078, term60078.getClass(), "hour", (byte) 18);
        setByteField(term60078, term60078.getClass(), "minute", (byte) 24);
        setByteField(term60078, term60078.getClass(), "second", (byte) 32);
        setIntField(term60078, term60078.getClass(), "nano", 369233818);
        setField(term60073, term60073.getClass(), "time", term60078);
        setField(term59372, term59372.getClass(), "dateTime", term60073);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term59372, args);
    }

};


