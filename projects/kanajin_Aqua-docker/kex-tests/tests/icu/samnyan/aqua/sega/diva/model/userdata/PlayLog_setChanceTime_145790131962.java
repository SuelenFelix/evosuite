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

public class PlayLog_setChanceTime_145790131962 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term277697;
     Object term278424;

    public PlayLog_setChanceTime_145790131962() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term278433 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term278432 = ((Class) term278433).getDeclaredField((String) "MISS");
        ((Field) term278432).setAccessible(true);
        Object enum632 = ((Field) term278432).get((Object) null);
        Class<? extends Object> term278810 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term278809 = ((Class) term278810).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term278809).setAccessible(true);
        Object enum633 = ((Field) term278809).get((Object) null);
        Class<? extends Object> term279093 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term279092 = ((Class) term279093).getDeclaredField((String) "NORMAL");
        ((Field) term279092).setAccessible(true);
        Object enum634 = ((Field) term279092).get((Object) null);
        Class<? extends Object> term279368 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term279367 = ((Class) term279368).getDeclaredField((String) "ORIGINAL");
        ((Field) term279367).setAccessible(true);
        Object enum635 = ((Field) term279367).get((Object) null);
        Class<? extends Object> term279634 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term279633 = ((Class) term279634).getDeclaredField((String) "NONE");
        ((Field) term279633).setAccessible(true);
        Object enum636 = ((Field) term279633).get((Object) null);
        Class<? extends Object> term280275 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term280274 = ((Class) term280275).getDeclaredField((String) "HARD");
        ((Field) term280274).setAccessible(true);
        Object enum637 = ((Field) term280274).get((Object) null);
        Class<? extends Object> term280544 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term280543 = ((Class) term280544).getDeclaredField((String) "EXTRA");
        ((Field) term280543).setAccessible(true);
        Object enum638 = ((Field) term280543).get((Object) null);
        Class<? extends Object> term280801 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ChallengeKind");
        Field term280800 = ((Class) term280801).getDeclaredField((String) "EXCELLENT");
        ((Field) term280800).setAccessible(true);
        Object enum639 = ((Field) term280800).get((Object) null);
        Class<? extends Object> term281100 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ClearResult");
        Field term281099 = ((Class) term281100).getDeclaredField((String) "PERFECT");
        ((Field) term281099).setAccessible(true);
        Object enum640 = ((Field) term281099).get((Object) null);
        term277697 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog"));
        Object term277699 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term277822 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term277823 = newInstance(Class.forName("java.time.LocalDate"));
        Object term277827 = newInstance(Class.forName("java.time.LocalTime"));
        Object term278414 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term278415 = newInstance(Class.forName("java.time.LocalDate"));
        Object term278419 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term277697, term277697.getClass(), "id", 3427570961451840069L);
        setLongField(term277699, term277699.getClass(), "id", 4502292577098212311L);
        setIntField(term277699, term277699.getClass(), "pdId", 1359973218);
        setField(term277699, term277699.getClass(), "playerName", "xxx");
        setIntField(term277699, term277699.getClass(), "vocaloidPoints", 300);
        setIntField(term277699, term277699.getClass(), "level", 1);
        setIntField(term277699, term277699.getClass(), "levelExp", -218759803);
        setField(term277699, term277699.getClass(), "levelTitle", "xxx");
        setIntField(term277699, term277699.getClass(), "plateId", -1);
        setIntField(term277699, term277699.getClass(), "plateEffectId", -1);
        setField(term277699, term277699.getClass(), "passwordStatus", enum632);
        setField(term277699, term277699.getClass(), "password", "**********");
        setBooleanField(term277699, term277699.getClass(), "preferPerPvModule", true);
        setBooleanField(term277699, term277699.getClass(), "preferCommonModule", false);
        setBooleanField(term277699, term277699.getClass(), "usePerPvSkin", false);
        setBooleanField(term277699, term277699.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term277699, term277699.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term277699, term277699.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term277699, term277699.getClass(), "usePerPvTouchSliderSe", true);
        setField(term277699, term277699.getClass(), "commonModule", "-999,-999,-999");
        setField(term277699, term277699.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term277823, term277823.getClass(), "year", 2026);
        setShortField(term277823, term277823.getClass(), "month", (short) 6);
        setShortField(term277823, term277823.getClass(), "day", (short) 29);
        setField(term277822, term277822.getClass(), "date", term277823);
        setByteField(term277827, term277827.getClass(), "hour", (byte) 4);
        setByteField(term277827, term277827.getClass(), "minute", (byte) 27);
        setByteField(term277827, term277827.getClass(), "second", (byte) 39);
        setIntField(term277827, term277827.getClass(), "nano", 426625000);
        setField(term277822, term277822.getClass(), "time", term277827);
        setField(term277699, term277699.getClass(), "commonModuleSetTime", term277822);
        setField(term277699, term277699.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term277699, term277699.getClass(), "commonSkin", -1);
        setIntField(term277699, term277699.getClass(), "headphoneVolume", 100);
        setBooleanField(term277699, term277699.getClass(), "buttonSeOn", true);
        setIntField(term277699, term277699.getClass(), "buttonSeVolume", 100);
        setIntField(term277699, term277699.getClass(), "sliderSeVolume", 100);
        setIntField(term277699, term277699.getClass(), "buttonSe", -1);
        setIntField(term277699, term277699.getClass(), "chainSlideSe", -1);
        setIntField(term277699, term277699.getClass(), "slideSe", -1);
        setIntField(term277699, term277699.getClass(), "sliderTouchSe", -1);
        setField(term277699, term277699.getClass(), "sortMode", enum633);
        setIntField(term277699, term277699.getClass(), "nextPvId", -1);
        setField(term277699, term277699.getClass(), "nextDifficulty", enum634);
        setField(term277699, term277699.getClass(), "nextEdition", enum635);
        setBooleanField(term277699, term277699.getClass(), "showInterimRanking", true);
        setBooleanField(term277699, term277699.getClass(), "showClearStatus", true);
        setBooleanField(term277699, term277699.getClass(), "showGreatBorder", true);
        setBooleanField(term277699, term277699.getClass(), "showExcellentBorder", true);
        setBooleanField(term277699, term277699.getClass(), "showRivalBorder", true);
        setBooleanField(term277699, term277699.getClass(), "showRgoSetting", true);
        setBooleanField(term277699, term277699.getClass(), "contestNowPlayingEnable", true);
        setIntField(term277699, term277699.getClass(), "contestNowPlayingId", -1);
        setIntField(term277699, term277699.getClass(), "contestNowPlayingValue", -1);
        setField(term277699, term277699.getClass(), "contestNowPlayingResultRank", enum636);
        setField(term277699, term277699.getClass(), "contestNowPlayingSpecifier", "");
        setField(term277699, term277699.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term277699, term277699.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term277699, term277699.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term277699, term277699.getClass(), "rivalPdId", -1);
        setField(term277697, term277697.getClass(), "pdId", term277699);
        setIntField(term277697, term277697.getClass(), "pvId", 1288936083);
        setField(term277697, term277697.getClass(), "difficulty", enum637);
        setField(term277697, term277697.getClass(), "edition", enum638);
        setIntField(term277697, term277697.getClass(), "scriptVer", 4086209);
        setIntField(term277697, term277697.getClass(), "score", 300964556);
        setField(term277697, term277697.getClass(), "challengeKind", enum639);
        setIntField(term277697, term277697.getClass(), "challengeResult", -958207893);
        setField(term277697, term277697.getClass(), "clearResult", enum640);
        setIntField(term277697, term277697.getClass(), "vp", 674390543);
        setIntField(term277697, term277697.getClass(), "coolCount", 1472100258);
        setIntField(term277697, term277697.getClass(), "coolPercent", 12681987);
        setIntField(term277697, term277697.getClass(), "fineCount", -1987364934);
        setIntField(term277697, term277697.getClass(), "finePercent", 1364414277);
        setIntField(term277697, term277697.getClass(), "safeCount", -961137606);
        setIntField(term277697, term277697.getClass(), "safePercent", 795205527);
        setIntField(term277697, term277697.getClass(), "sadCount", 600958607);
        setIntField(term277697, term277697.getClass(), "sadPercent", 897159778);
        setIntField(term277697, term277697.getClass(), "wrongCount", -1934934961);
        setIntField(term277697, term277697.getClass(), "wrongPercent", 2120054887);
        setIntField(term277697, term277697.getClass(), "maxCombo", 2145648967);
        setIntField(term277697, term277697.getClass(), "chanceTime", 2060624021);
        setIntField(term277697, term277697.getClass(), "holdScore", -1853309523);
        setIntField(term277697, term277697.getClass(), "attainPoint", 241741655);
        setIntField(term277697, term277697.getClass(), "skinId", -1062022366);
        setIntField(term277697, term277697.getClass(), "buttonSe", -1347618079);
        setIntField(term277697, term277697.getClass(), "buttonSeVol", 1510246255);
        setIntField(term277697, term277697.getClass(), "sliderSe", -515631808);
        setIntField(term277697, term277697.getClass(), "ChainSlideSe", 1546701347);
        setIntField(term277697, term277697.getClass(), "SliderTouchSe", -111931851);
        setField(term277697, term277697.getClass(), "modules", "JppkknKVOw");
        setIntField(term277697, term277697.getClass(), "stageCompletion", -251696516);
        setIntField(term277697, term277697.getClass(), "slideScore", 1075321384);
        setIntField(term277697, term277697.getClass(), "isVocalChange", -1726073541);
        setField(term277697, term277697.getClass(), "customizeItems", "iljANwuEjk");
        setField(term277697, term277697.getClass(), "rhythmGameOptions", "kNqaJKIATy");
        setIntField(term277697, term277697.getClass(), "screenShotCount", -1);
        setIntField(term278415, term278415.getClass(), "year", 2028);
        setShortField(term278415, term278415.getClass(), "month", (short) 1);
        setShortField(term278415, term278415.getClass(), "day", (short) 18);
        setField(term278414, term278414.getClass(), "date", term278415);
        setByteField(term278419, term278419.getClass(), "hour", (byte) 12);
        setByteField(term278419, term278419.getClass(), "minute", (byte) 4);
        setByteField(term278419, term278419.getClass(), "second", (byte) 39);
        setIntField(term278419, term278419.getClass(), "nano", 651287093);
        setField(term278414, term278414.getClass(), "time", term278419);
        setField(term277697, term277697.getClass(), "dateTime", term278414);
        term278424 = new Integer(406945977);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term278424;
        callMethod(klass, "setChanceTime", argTypes, term277697, args);
    }

};


