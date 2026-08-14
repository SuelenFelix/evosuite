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

public class PlayLog_setRhythmGameOptions_208516201176 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term326724;

    public PlayLog_setRhythmGameOptions_208516201176() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term327462 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term327461 = ((Class) term327462).getDeclaredField((String) "MISS");
        ((Field) term327461).setAccessible(true);
        Object enum747 = ((Field) term327461).get((Object) null);
        Class<? extends Object> term327839 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term327838 = ((Class) term327839).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term327838).setAccessible(true);
        Object enum748 = ((Field) term327838).get((Object) null);
        Class<? extends Object> term328122 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term328121 = ((Class) term328122).getDeclaredField((String) "NORMAL");
        ((Field) term328121).setAccessible(true);
        Object enum749 = ((Field) term328121).get((Object) null);
        Class<? extends Object> term328397 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term328396 = ((Class) term328397).getDeclaredField((String) "ORIGINAL");
        ((Field) term328396).setAccessible(true);
        Object enum750 = ((Field) term328396).get((Object) null);
        Class<? extends Object> term328663 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term328662 = ((Class) term328663).getDeclaredField((String) "NONE");
        ((Field) term328662).setAccessible(true);
        Object enum751 = ((Field) term328662).get((Object) null);
        Class<? extends Object> term329304 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term329303 = ((Class) term329304).getDeclaredField((String) "EASY");
        ((Field) term329303).setAccessible(true);
        Object enum752 = ((Field) term329303).get((Object) null);
        Class<? extends Object> term329573 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ChallengeKind");
        Field term329572 = ((Class) term329573).getDeclaredField((String) "COMPLETED");
        ((Field) term329572).setAccessible(true);
        Object enum753 = ((Field) term329572).get((Object) null);
        Class<? extends Object> term329872 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ClearResult");
        Field term329871 = ((Class) term329872).getDeclaredField((String) "EXCELLENT");
        ((Field) term329871).setAccessible(true);
        Object enum754 = ((Field) term329871).get((Object) null);
        term326724 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog"));
        Object term326726 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term326849 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term326850 = newInstance(Class.forName("java.time.LocalDate"));
        Object term326854 = newInstance(Class.forName("java.time.LocalTime"));
        Object term327433 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term327434 = newInstance(Class.forName("java.time.LocalDate"));
        Object term327438 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term326724, term326724.getClass(), "id", 4199886998224701110L);
        setLongField(term326726, term326726.getClass(), "id", 8540994973773607992L);
        setIntField(term326726, term326726.getClass(), "pdId", -1700781575);
        setField(term326726, term326726.getClass(), "playerName", "xxx");
        setIntField(term326726, term326726.getClass(), "vocaloidPoints", 300);
        setIntField(term326726, term326726.getClass(), "level", 1);
        setIntField(term326726, term326726.getClass(), "levelExp", -2042022388);
        setField(term326726, term326726.getClass(), "levelTitle", "xxx");
        setIntField(term326726, term326726.getClass(), "plateId", -1);
        setIntField(term326726, term326726.getClass(), "plateEffectId", -1);
        setField(term326726, term326726.getClass(), "passwordStatus", enum747);
        setField(term326726, term326726.getClass(), "password", "**********");
        setBooleanField(term326726, term326726.getClass(), "preferPerPvModule", true);
        setBooleanField(term326726, term326726.getClass(), "preferCommonModule", false);
        setBooleanField(term326726, term326726.getClass(), "usePerPvSkin", true);
        setBooleanField(term326726, term326726.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term326726, term326726.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term326726, term326726.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term326726, term326726.getClass(), "usePerPvTouchSliderSe", false);
        setField(term326726, term326726.getClass(), "commonModule", "-999,-999,-999");
        setField(term326726, term326726.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term326850, term326850.getClass(), "year", 2026);
        setShortField(term326850, term326850.getClass(), "month", (short) 8);
        setShortField(term326850, term326850.getClass(), "day", (short) 12);
        setField(term326849, term326849.getClass(), "date", term326850);
        setByteField(term326854, term326854.getClass(), "hour", (byte) 2);
        setByteField(term326854, term326854.getClass(), "minute", (byte) 2);
        setByteField(term326854, term326854.getClass(), "second", (byte) 59);
        setIntField(term326854, term326854.getClass(), "nano", 252474000);
        setField(term326849, term326849.getClass(), "time", term326854);
        setField(term326726, term326726.getClass(), "commonModuleSetTime", term326849);
        setField(term326726, term326726.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term326726, term326726.getClass(), "commonSkin", -1);
        setIntField(term326726, term326726.getClass(), "headphoneVolume", 100);
        setBooleanField(term326726, term326726.getClass(), "buttonSeOn", true);
        setIntField(term326726, term326726.getClass(), "buttonSeVolume", 100);
        setIntField(term326726, term326726.getClass(), "sliderSeVolume", 100);
        setIntField(term326726, term326726.getClass(), "buttonSe", -1);
        setIntField(term326726, term326726.getClass(), "chainSlideSe", -1);
        setIntField(term326726, term326726.getClass(), "slideSe", -1);
        setIntField(term326726, term326726.getClass(), "sliderTouchSe", -1);
        setField(term326726, term326726.getClass(), "sortMode", enum748);
        setIntField(term326726, term326726.getClass(), "nextPvId", -1);
        setField(term326726, term326726.getClass(), "nextDifficulty", enum749);
        setField(term326726, term326726.getClass(), "nextEdition", enum750);
        setBooleanField(term326726, term326726.getClass(), "showInterimRanking", true);
        setBooleanField(term326726, term326726.getClass(), "showClearStatus", true);
        setBooleanField(term326726, term326726.getClass(), "showGreatBorder", true);
        setBooleanField(term326726, term326726.getClass(), "showExcellentBorder", true);
        setBooleanField(term326726, term326726.getClass(), "showRivalBorder", true);
        setBooleanField(term326726, term326726.getClass(), "showRgoSetting", true);
        setBooleanField(term326726, term326726.getClass(), "contestNowPlayingEnable", false);
        setIntField(term326726, term326726.getClass(), "contestNowPlayingId", -1);
        setIntField(term326726, term326726.getClass(), "contestNowPlayingValue", -1);
        setField(term326726, term326726.getClass(), "contestNowPlayingResultRank", enum751);
        setField(term326726, term326726.getClass(), "contestNowPlayingSpecifier", "");
        setField(term326726, term326726.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term326726, term326726.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term326726, term326726.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term326726, term326726.getClass(), "rivalPdId", -1);
        setField(term326724, term326724.getClass(), "pdId", term326726);
        setIntField(term326724, term326724.getClass(), "pvId", 390228535);
        setField(term326724, term326724.getClass(), "difficulty", enum752);
        setField(term326724, term326724.getClass(), "edition", enum750);
        setIntField(term326724, term326724.getClass(), "scriptVer", -667505209);
        setIntField(term326724, term326724.getClass(), "score", 1997285343);
        setField(term326724, term326724.getClass(), "challengeKind", enum753);
        setIntField(term326724, term326724.getClass(), "challengeResult", -1814671855);
        setField(term326724, term326724.getClass(), "clearResult", enum754);
        setIntField(term326724, term326724.getClass(), "vp", -614200166);
        setIntField(term326724, term326724.getClass(), "coolCount", 1243129119);
        setIntField(term326724, term326724.getClass(), "coolPercent", 346014220);
        setIntField(term326724, term326724.getClass(), "fineCount", 1379438950);
        setIntField(term326724, term326724.getClass(), "finePercent", 1932258686);
        setIntField(term326724, term326724.getClass(), "safeCount", -261366507);
        setIntField(term326724, term326724.getClass(), "safePercent", 1015444772);
        setIntField(term326724, term326724.getClass(), "sadCount", -815684619);
        setIntField(term326724, term326724.getClass(), "sadPercent", -471499395);
        setIntField(term326724, term326724.getClass(), "wrongCount", -663671886);
        setIntField(term326724, term326724.getClass(), "wrongPercent", -1295577968);
        setIntField(term326724, term326724.getClass(), "maxCombo", 1006574741);
        setIntField(term326724, term326724.getClass(), "chanceTime", -1471698394);
        setIntField(term326724, term326724.getClass(), "holdScore", 1146444085);
        setIntField(term326724, term326724.getClass(), "attainPoint", 316145449);
        setIntField(term326724, term326724.getClass(), "skinId", 387128751);
        setIntField(term326724, term326724.getClass(), "buttonSe", 1220621259);
        setIntField(term326724, term326724.getClass(), "buttonSeVol", 272507740);
        setIntField(term326724, term326724.getClass(), "sliderSe", -2117539025);
        setIntField(term326724, term326724.getClass(), "ChainSlideSe", 736842788);
        setIntField(term326724, term326724.getClass(), "SliderTouchSe", 416550042);
        setField(term326724, term326724.getClass(), "modules", "aSkmSwTnEw");
        setIntField(term326724, term326724.getClass(), "stageCompletion", 1745727714);
        setIntField(term326724, term326724.getClass(), "slideScore", -1577886337);
        setIntField(term326724, term326724.getClass(), "isVocalChange", -481394578);
        setField(term326724, term326724.getClass(), "customizeItems", "xvkbvaEGYd");
        setField(term326724, term326724.getClass(), "rhythmGameOptions", "HBGNxdNURv");
        setIntField(term326724, term326724.getClass(), "screenShotCount", -1);
        setIntField(term327434, term327434.getClass(), "year", 2020);
        setShortField(term327434, term327434.getClass(), "month", (short) 8);
        setShortField(term327434, term327434.getClass(), "day", (short) 16);
        setField(term327433, term327433.getClass(), "date", term327434);
        setByteField(term327438, term327438.getClass(), "hour", (byte) 4);
        setByteField(term327438, term327438.getClass(), "minute", (byte) 37);
        setByteField(term327438, term327438.getClass(), "second", (byte) 19);
        setIntField(term327438, term327438.getClass(), "nano", 605410923);
        setField(term327433, term327433.getClass(), "time", term327438);
        setField(term326724, term326724.getClass(), "dateTime", term327433);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "mfCpTPPQQm";
        callMethod(klass, "setRhythmGameOptions", argTypes, term326724, args);
    }

};


