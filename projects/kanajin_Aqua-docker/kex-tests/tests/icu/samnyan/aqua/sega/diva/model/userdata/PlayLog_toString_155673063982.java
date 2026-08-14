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

public class PlayLog_toString_155673063982 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term347748;

    public PlayLog_toString_155673063982() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term348474 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term348473 = ((Class) term348474).getDeclaredField((String) "MISS");
        ((Field) term348473).setAccessible(true);
        Object enum796 = ((Field) term348473).get((Object) null);
        Class<? extends Object> term348851 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term348850 = ((Class) term348851).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term348850).setAccessible(true);
        Object enum797 = ((Field) term348850).get((Object) null);
        Class<? extends Object> term349134 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term349133 = ((Class) term349134).getDeclaredField((String) "NORMAL");
        ((Field) term349133).setAccessible(true);
        Object enum798 = ((Field) term349133).get((Object) null);
        Class<? extends Object> term349409 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term349408 = ((Class) term349409).getDeclaredField((String) "ORIGINAL");
        ((Field) term349408).setAccessible(true);
        Object enum799 = ((Field) term349408).get((Object) null);
        Class<? extends Object> term349675 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term349674 = ((Class) term349675).getDeclaredField((String) "NONE");
        ((Field) term349674).setAccessible(true);
        Object enum800 = ((Field) term349674).get((Object) null);
        Class<? extends Object> term350316 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term350315 = ((Class) term350316).getDeclaredField((String) "HARD");
        ((Field) term350315).setAccessible(true);
        Object enum801 = ((Field) term350315).get((Object) null);
        Class<? extends Object> term350585 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ChallengeKind");
        Field term350584 = ((Class) term350585).getDeclaredField((String) "UNDEFINED");
        ((Field) term350584).setAccessible(true);
        Object enum802 = ((Field) term350584).get((Object) null);
        Class<? extends Object> term350884 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ClearResult");
        Field term350883 = ((Class) term350884).getDeclaredField((String) "MISS_TAKE");
        ((Field) term350883).setAccessible(true);
        Object enum803 = ((Field) term350883).get((Object) null);
        term347748 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog"));
        Object term347750 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term347873 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term347874 = newInstance(Class.forName("java.time.LocalDate"));
        Object term347878 = newInstance(Class.forName("java.time.LocalTime"));
        Object term348457 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term348458 = newInstance(Class.forName("java.time.LocalDate"));
        Object term348462 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term347748, term347748.getClass(), "id", 6426732259596412988L);
        setLongField(term347750, term347750.getClass(), "id", 185793058502220865L);
        setIntField(term347750, term347750.getClass(), "pdId", 1404243357);
        setField(term347750, term347750.getClass(), "playerName", "xxx");
        setIntField(term347750, term347750.getClass(), "vocaloidPoints", 300);
        setIntField(term347750, term347750.getClass(), "level", 1);
        setIntField(term347750, term347750.getClass(), "levelExp", -570134327);
        setField(term347750, term347750.getClass(), "levelTitle", "xxx");
        setIntField(term347750, term347750.getClass(), "plateId", -1);
        setIntField(term347750, term347750.getClass(), "plateEffectId", -1);
        setField(term347750, term347750.getClass(), "passwordStatus", enum796);
        setField(term347750, term347750.getClass(), "password", "**********");
        setBooleanField(term347750, term347750.getClass(), "preferPerPvModule", true);
        setBooleanField(term347750, term347750.getClass(), "preferCommonModule", true);
        setBooleanField(term347750, term347750.getClass(), "usePerPvSkin", true);
        setBooleanField(term347750, term347750.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term347750, term347750.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term347750, term347750.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term347750, term347750.getClass(), "usePerPvTouchSliderSe", false);
        setField(term347750, term347750.getClass(), "commonModule", "-999,-999,-999");
        setField(term347750, term347750.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term347874, term347874.getClass(), "year", 2026);
        setShortField(term347874, term347874.getClass(), "month", (short) 8);
        setShortField(term347874, term347874.getClass(), "day", (short) 12);
        setField(term347873, term347873.getClass(), "date", term347874);
        setByteField(term347878, term347878.getClass(), "hour", (byte) 2);
        setByteField(term347878, term347878.getClass(), "minute", (byte) 3);
        setByteField(term347878, term347878.getClass(), "second", (byte) 0);
        setIntField(term347878, term347878.getClass(), "nano", 734548000);
        setField(term347873, term347873.getClass(), "time", term347878);
        setField(term347750, term347750.getClass(), "commonModuleSetTime", term347873);
        setField(term347750, term347750.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term347750, term347750.getClass(), "commonSkin", -1);
        setIntField(term347750, term347750.getClass(), "headphoneVolume", 100);
        setBooleanField(term347750, term347750.getClass(), "buttonSeOn", true);
        setIntField(term347750, term347750.getClass(), "buttonSeVolume", 100);
        setIntField(term347750, term347750.getClass(), "sliderSeVolume", 100);
        setIntField(term347750, term347750.getClass(), "buttonSe", -1);
        setIntField(term347750, term347750.getClass(), "chainSlideSe", -1);
        setIntField(term347750, term347750.getClass(), "slideSe", -1);
        setIntField(term347750, term347750.getClass(), "sliderTouchSe", -1);
        setField(term347750, term347750.getClass(), "sortMode", enum797);
        setIntField(term347750, term347750.getClass(), "nextPvId", -1);
        setField(term347750, term347750.getClass(), "nextDifficulty", enum798);
        setField(term347750, term347750.getClass(), "nextEdition", enum799);
        setBooleanField(term347750, term347750.getClass(), "showInterimRanking", true);
        setBooleanField(term347750, term347750.getClass(), "showClearStatus", true);
        setBooleanField(term347750, term347750.getClass(), "showGreatBorder", true);
        setBooleanField(term347750, term347750.getClass(), "showExcellentBorder", true);
        setBooleanField(term347750, term347750.getClass(), "showRivalBorder", true);
        setBooleanField(term347750, term347750.getClass(), "showRgoSetting", true);
        setBooleanField(term347750, term347750.getClass(), "contestNowPlayingEnable", false);
        setIntField(term347750, term347750.getClass(), "contestNowPlayingId", -1);
        setIntField(term347750, term347750.getClass(), "contestNowPlayingValue", -1);
        setField(term347750, term347750.getClass(), "contestNowPlayingResultRank", enum800);
        setField(term347750, term347750.getClass(), "contestNowPlayingSpecifier", "");
        setField(term347750, term347750.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term347750, term347750.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term347750, term347750.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term347750, term347750.getClass(), "rivalPdId", -1);
        setField(term347748, term347748.getClass(), "pdId", term347750);
        setIntField(term347748, term347748.getClass(), "pvId", 73847121);
        setField(term347748, term347748.getClass(), "difficulty", enum801);
        setField(term347748, term347748.getClass(), "edition", enum799);
        setIntField(term347748, term347748.getClass(), "scriptVer", 1721050745);
        setIntField(term347748, term347748.getClass(), "score", -1980981205);
        setField(term347748, term347748.getClass(), "challengeKind", enum802);
        setIntField(term347748, term347748.getClass(), "challengeResult", -1530498856);
        setField(term347748, term347748.getClass(), "clearResult", enum803);
        setIntField(term347748, term347748.getClass(), "vp", 1816257051);
        setIntField(term347748, term347748.getClass(), "coolCount", -541591725);
        setIntField(term347748, term347748.getClass(), "coolPercent", 498271385);
        setIntField(term347748, term347748.getClass(), "fineCount", 1418222767);
        setIntField(term347748, term347748.getClass(), "finePercent", 1862441057);
        setIntField(term347748, term347748.getClass(), "safeCount", 1889814117);
        setIntField(term347748, term347748.getClass(), "safePercent", -1336297368);
        setIntField(term347748, term347748.getClass(), "sadCount", 1535507114);
        setIntField(term347748, term347748.getClass(), "sadPercent", -1174141307);
        setIntField(term347748, term347748.getClass(), "wrongCount", -1603957392);
        setIntField(term347748, term347748.getClass(), "wrongPercent", -287005602);
        setIntField(term347748, term347748.getClass(), "maxCombo", 923353564);
        setIntField(term347748, term347748.getClass(), "chanceTime", 2013647768);
        setIntField(term347748, term347748.getClass(), "holdScore", 1706579212);
        setIntField(term347748, term347748.getClass(), "attainPoint", -1073781147);
        setIntField(term347748, term347748.getClass(), "skinId", 138913824);
        setIntField(term347748, term347748.getClass(), "buttonSe", -637767208);
        setIntField(term347748, term347748.getClass(), "buttonSeVol", 844890845);
        setIntField(term347748, term347748.getClass(), "sliderSe", -989538894);
        setIntField(term347748, term347748.getClass(), "ChainSlideSe", 1316863342);
        setIntField(term347748, term347748.getClass(), "SliderTouchSe", 735033722);
        setField(term347748, term347748.getClass(), "modules", "SIODFGaQhr");
        setIntField(term347748, term347748.getClass(), "stageCompletion", -1409886459);
        setIntField(term347748, term347748.getClass(), "slideScore", 666379561);
        setIntField(term347748, term347748.getClass(), "isVocalChange", 1071163503);
        setField(term347748, term347748.getClass(), "customizeItems", "qYzsiuXOgS");
        setField(term347748, term347748.getClass(), "rhythmGameOptions", "bxrCBbrrct");
        setIntField(term347748, term347748.getClass(), "screenShotCount", -1);
        setIntField(term348458, term348458.getClass(), "year", 2013);
        setShortField(term348458, term348458.getClass(), "month", (short) 9);
        setShortField(term348458, term348458.getClass(), "day", (short) 19);
        setField(term348457, term348457.getClass(), "date", term348458);
        setByteField(term348462, term348462.getClass(), "hour", (byte) 12);
        setByteField(term348462, term348462.getClass(), "minute", (byte) 29);
        setByteField(term348462, term348462.getClass(), "second", (byte) 28);
        setIntField(term348462, term348462.getClass(), "nano", 244069764);
        setField(term348457, term348457.getClass(), "time", term348462);
        setField(term347748, term347748.getClass(), "dateTime", term348457);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term347748, args);
    }

};


