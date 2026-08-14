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

public class PlayLog_getHoldScore_28688646724 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term140787;

    public PlayLog_getHoldScore_28688646724() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term141519 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term141518 = ((Class) term141519).getDeclaredField((String) "MISS");
        ((Field) term141518).setAccessible(true);
        Object enum310 = ((Field) term141518).get((Object) null);
        Class<? extends Object> term141896 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term141895 = ((Class) term141896).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term141895).setAccessible(true);
        Object enum311 = ((Field) term141895).get((Object) null);
        Class<? extends Object> term142179 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term142178 = ((Class) term142179).getDeclaredField((String) "NORMAL");
        ((Field) term142178).setAccessible(true);
        Object enum312 = ((Field) term142178).get((Object) null);
        Class<? extends Object> term142454 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term142453 = ((Class) term142454).getDeclaredField((String) "ORIGINAL");
        ((Field) term142453).setAccessible(true);
        Object enum313 = ((Field) term142453).get((Object) null);
        Class<? extends Object> term142720 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term142719 = ((Class) term142720).getDeclaredField((String) "NONE");
        ((Field) term142719).setAccessible(true);
        Object enum314 = ((Field) term142719).get((Object) null);
        Class<? extends Object> term143361 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term143360 = ((Class) term143361).getDeclaredField((String) "EASY");
        ((Field) term143360).setAccessible(true);
        Object enum315 = ((Field) term143360).get((Object) null);
        Class<? extends Object> term143630 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term143629 = ((Class) term143630).getDeclaredField((String) "EXTRA");
        ((Field) term143629).setAccessible(true);
        Object enum316 = ((Field) term143629).get((Object) null);
        Class<? extends Object> term143887 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ChallengeKind");
        Field term143886 = ((Class) term143887).getDeclaredField((String) "PERFECT");
        ((Field) term143886).setAccessible(true);
        Object enum317 = ((Field) term143886).get((Object) null);
        Class<? extends Object> term144180 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ClearResult");
        Field term144179 = ((Class) term144180).getDeclaredField((String) "PERFECT");
        ((Field) term144179).setAccessible(true);
        Object enum318 = ((Field) term144179).get((Object) null);
        term140787 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog"));
        Object term140789 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term140912 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term140913 = newInstance(Class.forName("java.time.LocalDate"));
        Object term140917 = newInstance(Class.forName("java.time.LocalTime"));
        Object term141502 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term141503 = newInstance(Class.forName("java.time.LocalDate"));
        Object term141507 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term140787, term140787.getClass(), "id", -2177368829816872572L);
        setLongField(term140789, term140789.getClass(), "id", -8463029266761149071L);
        setIntField(term140789, term140789.getClass(), "pdId", -1165271567);
        setField(term140789, term140789.getClass(), "playerName", "xxx");
        setIntField(term140789, term140789.getClass(), "vocaloidPoints", 300);
        setIntField(term140789, term140789.getClass(), "level", 1);
        setIntField(term140789, term140789.getClass(), "levelExp", 376834234);
        setField(term140789, term140789.getClass(), "levelTitle", "xxx");
        setIntField(term140789, term140789.getClass(), "plateId", -1);
        setIntField(term140789, term140789.getClass(), "plateEffectId", -1);
        setField(term140789, term140789.getClass(), "passwordStatus", enum310);
        setField(term140789, term140789.getClass(), "password", "**********");
        setBooleanField(term140789, term140789.getClass(), "preferPerPvModule", true);
        setBooleanField(term140789, term140789.getClass(), "preferCommonModule", true);
        setBooleanField(term140789, term140789.getClass(), "usePerPvSkin", false);
        setBooleanField(term140789, term140789.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term140789, term140789.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term140789, term140789.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term140789, term140789.getClass(), "usePerPvTouchSliderSe", true);
        setField(term140789, term140789.getClass(), "commonModule", "-999,-999,-999");
        setField(term140789, term140789.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term140913, term140913.getClass(), "year", 2026);
        setShortField(term140913, term140913.getClass(), "month", (short) 8);
        setShortField(term140913, term140913.getClass(), "day", (short) 12);
        setField(term140912, term140912.getClass(), "date", term140913);
        setByteField(term140917, term140917.getClass(), "hour", (byte) 2);
        setByteField(term140917, term140917.getClass(), "minute", (byte) 2);
        setByteField(term140917, term140917.getClass(), "second", (byte) 46);
        setIntField(term140917, term140917.getClass(), "nano", 170798000);
        setField(term140912, term140912.getClass(), "time", term140917);
        setField(term140789, term140789.getClass(), "commonModuleSetTime", term140912);
        setField(term140789, term140789.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term140789, term140789.getClass(), "commonSkin", -1);
        setIntField(term140789, term140789.getClass(), "headphoneVolume", 100);
        setBooleanField(term140789, term140789.getClass(), "buttonSeOn", true);
        setIntField(term140789, term140789.getClass(), "buttonSeVolume", 100);
        setIntField(term140789, term140789.getClass(), "sliderSeVolume", 100);
        setIntField(term140789, term140789.getClass(), "buttonSe", -1);
        setIntField(term140789, term140789.getClass(), "chainSlideSe", -1);
        setIntField(term140789, term140789.getClass(), "slideSe", -1);
        setIntField(term140789, term140789.getClass(), "sliderTouchSe", -1);
        setField(term140789, term140789.getClass(), "sortMode", enum311);
        setIntField(term140789, term140789.getClass(), "nextPvId", -1);
        setField(term140789, term140789.getClass(), "nextDifficulty", enum312);
        setField(term140789, term140789.getClass(), "nextEdition", enum313);
        setBooleanField(term140789, term140789.getClass(), "showInterimRanking", true);
        setBooleanField(term140789, term140789.getClass(), "showClearStatus", true);
        setBooleanField(term140789, term140789.getClass(), "showGreatBorder", true);
        setBooleanField(term140789, term140789.getClass(), "showExcellentBorder", true);
        setBooleanField(term140789, term140789.getClass(), "showRivalBorder", true);
        setBooleanField(term140789, term140789.getClass(), "showRgoSetting", true);
        setBooleanField(term140789, term140789.getClass(), "contestNowPlayingEnable", false);
        setIntField(term140789, term140789.getClass(), "contestNowPlayingId", -1);
        setIntField(term140789, term140789.getClass(), "contestNowPlayingValue", -1);
        setField(term140789, term140789.getClass(), "contestNowPlayingResultRank", enum314);
        setField(term140789, term140789.getClass(), "contestNowPlayingSpecifier", "");
        setField(term140789, term140789.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term140789, term140789.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term140789, term140789.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term140789, term140789.getClass(), "rivalPdId", -1);
        setField(term140787, term140787.getClass(), "pdId", term140789);
        setIntField(term140787, term140787.getClass(), "pvId", -1911972560);
        setField(term140787, term140787.getClass(), "difficulty", enum315);
        setField(term140787, term140787.getClass(), "edition", enum316);
        setIntField(term140787, term140787.getClass(), "scriptVer", -642716895);
        setIntField(term140787, term140787.getClass(), "score", 1743398246);
        setField(term140787, term140787.getClass(), "challengeKind", enum317);
        setIntField(term140787, term140787.getClass(), "challengeResult", -934658823);
        setField(term140787, term140787.getClass(), "clearResult", enum318);
        setIntField(term140787, term140787.getClass(), "vp", 1632177303);
        setIntField(term140787, term140787.getClass(), "coolCount", -802592348);
        setIntField(term140787, term140787.getClass(), "coolPercent", -1576584269);
        setIntField(term140787, term140787.getClass(), "fineCount", 1474899591);
        setIntField(term140787, term140787.getClass(), "finePercent", 297582552);
        setIntField(term140787, term140787.getClass(), "safeCount", -1485916498);
        setIntField(term140787, term140787.getClass(), "safePercent", 722787672);
        setIntField(term140787, term140787.getClass(), "sadCount", 2077491675);
        setIntField(term140787, term140787.getClass(), "sadPercent", -1728316609);
        setIntField(term140787, term140787.getClass(), "wrongCount", 47118909);
        setIntField(term140787, term140787.getClass(), "wrongPercent", -2093707412);
        setIntField(term140787, term140787.getClass(), "maxCombo", -680627153);
        setIntField(term140787, term140787.getClass(), "chanceTime", 722519669);
        setIntField(term140787, term140787.getClass(), "holdScore", -40335961);
        setIntField(term140787, term140787.getClass(), "attainPoint", 175343605);
        setIntField(term140787, term140787.getClass(), "skinId", 1050853183);
        setIntField(term140787, term140787.getClass(), "buttonSe", 848428785);
        setIntField(term140787, term140787.getClass(), "buttonSeVol", -1984436481);
        setIntField(term140787, term140787.getClass(), "sliderSe", -407582855);
        setIntField(term140787, term140787.getClass(), "ChainSlideSe", 1190753616);
        setIntField(term140787, term140787.getClass(), "SliderTouchSe", -752378450);
        setField(term140787, term140787.getClass(), "modules", "JUmudUmaaV");
        setIntField(term140787, term140787.getClass(), "stageCompletion", 848907965);
        setIntField(term140787, term140787.getClass(), "slideScore", 1865070548);
        setIntField(term140787, term140787.getClass(), "isVocalChange", 1904515443);
        setField(term140787, term140787.getClass(), "customizeItems", "KoyGrUJeJW");
        setField(term140787, term140787.getClass(), "rhythmGameOptions", "HqBOwkVqjD");
        setIntField(term140787, term140787.getClass(), "screenShotCount", -1);
        setIntField(term141503, term141503.getClass(), "year", 2028);
        setShortField(term141503, term141503.getClass(), "month", (short) 10);
        setShortField(term141503, term141503.getClass(), "day", (short) 1);
        setField(term141502, term141502.getClass(), "date", term141503);
        setByteField(term141507, term141507.getClass(), "hour", (byte) 17);
        setByteField(term141507, term141507.getClass(), "minute", (byte) 29);
        setByteField(term141507, term141507.getClass(), "second", (byte) 30);
        setIntField(term141507, term141507.getClass(), "nano", 845472306);
        setField(term141502, term141502.getClass(), "time", term141507);
        setField(term140787, term140787.getClass(), "dateTime", term141502);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHoldScore", argTypes, term140787, args);
    }

};


