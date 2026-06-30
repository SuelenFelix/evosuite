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

public class PlayLog_setWrongPercent_92127835260 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term270824;
     Object term271532;

    public PlayLog_setWrongPercent_92127835260() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term271541 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term271540 = ((Class) term271541).getDeclaredField((String) "MISS");
        ((Field) term271540).setAccessible(true);
        Object enum616 = ((Field) term271540).get((Object) null);
        Class<? extends Object> term271918 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term271917 = ((Class) term271918).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term271917).setAccessible(true);
        Object enum617 = ((Field) term271917).get((Object) null);
        Class<? extends Object> term272201 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term272200 = ((Class) term272201).getDeclaredField((String) "NORMAL");
        ((Field) term272200).setAccessible(true);
        Object enum618 = ((Field) term272200).get((Object) null);
        Class<? extends Object> term272476 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term272475 = ((Class) term272476).getDeclaredField((String) "ORIGINAL");
        ((Field) term272475).setAccessible(true);
        Object enum619 = ((Field) term272475).get((Object) null);
        Class<? extends Object> term272742 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term272741 = ((Class) term272742).getDeclaredField((String) "NONE");
        ((Field) term272741).setAccessible(true);
        Object enum620 = ((Field) term272741).get((Object) null);
        Class<? extends Object> term273383 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ChallengeKind");
        Field term273382 = ((Class) term273383).getDeclaredField((String) "EXCELLENT");
        ((Field) term273382).setAccessible(true);
        Object enum621 = ((Field) term273382).get((Object) null);
        Class<? extends Object> term273682 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ClearResult");
        Field term273681 = ((Class) term273682).getDeclaredField((String) "PERFECT");
        ((Field) term273681).setAccessible(true);
        Object enum622 = ((Field) term273681).get((Object) null);
        term270824 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog"));
        Object term270826 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term270949 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term270950 = newInstance(Class.forName("java.time.LocalDate"));
        Object term270954 = newInstance(Class.forName("java.time.LocalTime"));
        Object term271522 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term271523 = newInstance(Class.forName("java.time.LocalDate"));
        Object term271527 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term270824, term270824.getClass(), "id", -8471550651709805183L);
        setLongField(term270826, term270826.getClass(), "id", -948292411727204525L);
        setIntField(term270826, term270826.getClass(), "pdId", -690367798);
        setField(term270826, term270826.getClass(), "playerName", "xxx");
        setIntField(term270826, term270826.getClass(), "vocaloidPoints", 300);
        setIntField(term270826, term270826.getClass(), "level", 1);
        setIntField(term270826, term270826.getClass(), "levelExp", 1863738073);
        setField(term270826, term270826.getClass(), "levelTitle", "xxx");
        setIntField(term270826, term270826.getClass(), "plateId", -1);
        setIntField(term270826, term270826.getClass(), "plateEffectId", -1);
        setField(term270826, term270826.getClass(), "passwordStatus", enum616);
        setField(term270826, term270826.getClass(), "password", "**********");
        setBooleanField(term270826, term270826.getClass(), "preferPerPvModule", true);
        setBooleanField(term270826, term270826.getClass(), "preferCommonModule", true);
        setBooleanField(term270826, term270826.getClass(), "usePerPvSkin", false);
        setBooleanField(term270826, term270826.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term270826, term270826.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term270826, term270826.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term270826, term270826.getClass(), "usePerPvTouchSliderSe", false);
        setField(term270826, term270826.getClass(), "commonModule", "-999,-999,-999");
        setField(term270826, term270826.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term270950, term270950.getClass(), "year", 2026);
        setShortField(term270950, term270950.getClass(), "month", (short) 6);
        setShortField(term270950, term270950.getClass(), "day", (short) 29);
        setField(term270949, term270949.getClass(), "date", term270950);
        setByteField(term270954, term270954.getClass(), "hour", (byte) 4);
        setByteField(term270954, term270954.getClass(), "minute", (byte) 27);
        setByteField(term270954, term270954.getClass(), "second", (byte) 38);
        setIntField(term270954, term270954.getClass(), "nano", 919864000);
        setField(term270949, term270949.getClass(), "time", term270954);
        setField(term270826, term270826.getClass(), "commonModuleSetTime", term270949);
        setField(term270826, term270826.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term270826, term270826.getClass(), "commonSkin", -1);
        setIntField(term270826, term270826.getClass(), "headphoneVolume", 100);
        setBooleanField(term270826, term270826.getClass(), "buttonSeOn", true);
        setIntField(term270826, term270826.getClass(), "buttonSeVolume", 100);
        setIntField(term270826, term270826.getClass(), "sliderSeVolume", 100);
        setIntField(term270826, term270826.getClass(), "buttonSe", -1);
        setIntField(term270826, term270826.getClass(), "chainSlideSe", -1);
        setIntField(term270826, term270826.getClass(), "slideSe", -1);
        setIntField(term270826, term270826.getClass(), "sliderTouchSe", -1);
        setField(term270826, term270826.getClass(), "sortMode", enum617);
        setIntField(term270826, term270826.getClass(), "nextPvId", -1);
        setField(term270826, term270826.getClass(), "nextDifficulty", enum618);
        setField(term270826, term270826.getClass(), "nextEdition", enum619);
        setBooleanField(term270826, term270826.getClass(), "showInterimRanking", true);
        setBooleanField(term270826, term270826.getClass(), "showClearStatus", true);
        setBooleanField(term270826, term270826.getClass(), "showGreatBorder", true);
        setBooleanField(term270826, term270826.getClass(), "showExcellentBorder", true);
        setBooleanField(term270826, term270826.getClass(), "showRivalBorder", true);
        setBooleanField(term270826, term270826.getClass(), "showRgoSetting", true);
        setBooleanField(term270826, term270826.getClass(), "contestNowPlayingEnable", true);
        setIntField(term270826, term270826.getClass(), "contestNowPlayingId", -1);
        setIntField(term270826, term270826.getClass(), "contestNowPlayingValue", -1);
        setField(term270826, term270826.getClass(), "contestNowPlayingResultRank", enum620);
        setField(term270826, term270826.getClass(), "contestNowPlayingSpecifier", "");
        setField(term270826, term270826.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term270826, term270826.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term270826, term270826.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term270826, term270826.getClass(), "rivalPdId", -1);
        setField(term270824, term270824.getClass(), "pdId", term270826);
        setIntField(term270824, term270824.getClass(), "pvId", 2009028243);
        setField(term270824, term270824.getClass(), "difficulty", enum618);
        setField(term270824, term270824.getClass(), "edition", enum619);
        setIntField(term270824, term270824.getClass(), "scriptVer", 1900131331);
        setIntField(term270824, term270824.getClass(), "score", -1489604464);
        setField(term270824, term270824.getClass(), "challengeKind", enum621);
        setIntField(term270824, term270824.getClass(), "challengeResult", 601642248);
        setField(term270824, term270824.getClass(), "clearResult", enum622);
        setIntField(term270824, term270824.getClass(), "vp", -1186936928);
        setIntField(term270824, term270824.getClass(), "coolCount", -315380004);
        setIntField(term270824, term270824.getClass(), "coolPercent", -1945754843);
        setIntField(term270824, term270824.getClass(), "fineCount", -1512221115);
        setIntField(term270824, term270824.getClass(), "finePercent", -515486706);
        setIntField(term270824, term270824.getClass(), "safeCount", -612862488);
        setIntField(term270824, term270824.getClass(), "safePercent", 52739905);
        setIntField(term270824, term270824.getClass(), "sadCount", -2105349391);
        setIntField(term270824, term270824.getClass(), "sadPercent", -1176968921);
        setIntField(term270824, term270824.getClass(), "wrongCount", -1986225025);
        setIntField(term270824, term270824.getClass(), "wrongPercent", -838689952);
        setIntField(term270824, term270824.getClass(), "maxCombo", -307464652);
        setIntField(term270824, term270824.getClass(), "chanceTime", 460605690);
        setIntField(term270824, term270824.getClass(), "holdScore", 2119231643);
        setIntField(term270824, term270824.getClass(), "attainPoint", 688546450);
        setIntField(term270824, term270824.getClass(), "skinId", 115635779);
        setIntField(term270824, term270824.getClass(), "buttonSe", -1081685171);
        setIntField(term270824, term270824.getClass(), "buttonSeVol", 1511699134);
        setIntField(term270824, term270824.getClass(), "sliderSe", 185647247);
        setIntField(term270824, term270824.getClass(), "ChainSlideSe", 720814309);
        setIntField(term270824, term270824.getClass(), "SliderTouchSe", 964137425);
        setField(term270824, term270824.getClass(), "modules", "DyiXbeYIaN");
        setIntField(term270824, term270824.getClass(), "stageCompletion", -1378885614);
        setIntField(term270824, term270824.getClass(), "slideScore", -1408615666);
        setIntField(term270824, term270824.getClass(), "isVocalChange", -502299598);
        setField(term270824, term270824.getClass(), "customizeItems", "VGizxZnyHX");
        setField(term270824, term270824.getClass(), "rhythmGameOptions", "kVEZMHmRtR");
        setIntField(term270824, term270824.getClass(), "screenShotCount", -1);
        setIntField(term271523, term271523.getClass(), "year", 2016);
        setShortField(term271523, term271523.getClass(), "month", (short) 10);
        setShortField(term271523, term271523.getClass(), "day", (short) 20);
        setField(term271522, term271522.getClass(), "date", term271523);
        setByteField(term271527, term271527.getClass(), "hour", (byte) 18);
        setByteField(term271527, term271527.getClass(), "minute", (byte) 39);
        setByteField(term271527, term271527.getClass(), "second", (byte) 1);
        setIntField(term271527, term271527.getClass(), "nano", 196253988);
        setField(term271522, term271522.getClass(), "time", term271527);
        setField(term270824, term270824.getClass(), "dateTime", term271522);
        term271532 = new Integer(-516287593);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term271532;
        callMethod(klass, "setWrongPercent", argTypes, term270824, args);
    }

};


