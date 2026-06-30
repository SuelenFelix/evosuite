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

public class PlayLog_setDifficulty_43848150743 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term210036;
     Object enum481;

    public PlayLog_setDifficulty_43848150743() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term210780 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term210779 = ((Class) term210780).getDeclaredField((String) "MISS");
        ((Field) term210779).setAccessible(true);
        Object enum472 = ((Field) term210779).get((Object) null);
        Class<? extends Object> term211157 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term211156 = ((Class) term211157).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term211156).setAccessible(true);
        Object enum473 = ((Field) term211156).get((Object) null);
        Class<? extends Object> term211440 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term211439 = ((Class) term211440).getDeclaredField((String) "NORMAL");
        ((Field) term211439).setAccessible(true);
        Object enum474 = ((Field) term211439).get((Object) null);
        Class<? extends Object> term211715 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term211714 = ((Class) term211715).getDeclaredField((String) "ORIGINAL");
        ((Field) term211714).setAccessible(true);
        Object enum475 = ((Field) term211714).get((Object) null);
        Class<? extends Object> term211981 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term211980 = ((Class) term211981).getDeclaredField((String) "NONE");
        ((Field) term211980).setAccessible(true);
        Object enum476 = ((Field) term211980).get((Object) null);
        Class<? extends Object> term212622 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term212621 = ((Class) term212622).getDeclaredField((String) "UNDEFINED");
        ((Field) term212621).setAccessible(true);
        Object enum477 = ((Field) term212621).get((Object) null);
        Class<? extends Object> term212906 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term212905 = ((Class) term212906).getDeclaredField((String) "EXTRA");
        ((Field) term212905).setAccessible(true);
        Object enum478 = ((Field) term212905).get((Object) null);
        Class<? extends Object> term213163 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ChallengeKind");
        Field term213162 = ((Class) term213163).getDeclaredField((String) "CLEAR");
        ((Field) term213162).setAccessible(true);
        Object enum479 = ((Field) term213162).get((Object) null);
        Class<? extends Object> term213450 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ClearResult");
        Field term213449 = ((Class) term213450).getDeclaredField((String) "PERFECT");
        ((Field) term213449).setAccessible(true);
        Object enum480 = ((Field) term213449).get((Object) null);
        term210036 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog"));
        Object term210038 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term210161 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term210162 = newInstance(Class.forName("java.time.LocalDate"));
        Object term210166 = newInstance(Class.forName("java.time.LocalTime"));
        Object term210754 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term210755 = newInstance(Class.forName("java.time.LocalDate"));
        Object term210759 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term210036, term210036.getClass(), "id", 7489064039921396098L);
        setLongField(term210038, term210038.getClass(), "id", 6843866297465638866L);
        setIntField(term210038, term210038.getClass(), "pdId", -126399768);
        setField(term210038, term210038.getClass(), "playerName", "xxx");
        setIntField(term210038, term210038.getClass(), "vocaloidPoints", 300);
        setIntField(term210038, term210038.getClass(), "level", 1);
        setIntField(term210038, term210038.getClass(), "levelExp", 318982923);
        setField(term210038, term210038.getClass(), "levelTitle", "xxx");
        setIntField(term210038, term210038.getClass(), "plateId", -1);
        setIntField(term210038, term210038.getClass(), "plateEffectId", -1);
        setField(term210038, term210038.getClass(), "passwordStatus", enum472);
        setField(term210038, term210038.getClass(), "password", "**********");
        setBooleanField(term210038, term210038.getClass(), "preferPerPvModule", true);
        setBooleanField(term210038, term210038.getClass(), "preferCommonModule", false);
        setBooleanField(term210038, term210038.getClass(), "usePerPvSkin", true);
        setBooleanField(term210038, term210038.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term210038, term210038.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term210038, term210038.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term210038, term210038.getClass(), "usePerPvTouchSliderSe", false);
        setField(term210038, term210038.getClass(), "commonModule", "-999,-999,-999");
        setField(term210038, term210038.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term210162, term210162.getClass(), "year", 2026);
        setShortField(term210162, term210162.getClass(), "month", (short) 6);
        setShortField(term210162, term210162.getClass(), "day", (short) 29);
        setField(term210161, term210161.getClass(), "date", term210162);
        setByteField(term210166, term210166.getClass(), "hour", (byte) 4);
        setByteField(term210166, term210166.getClass(), "minute", (byte) 27);
        setByteField(term210166, term210166.getClass(), "second", (byte) 34);
        setIntField(term210166, term210166.getClass(), "nano", 574869000);
        setField(term210161, term210161.getClass(), "time", term210166);
        setField(term210038, term210038.getClass(), "commonModuleSetTime", term210161);
        setField(term210038, term210038.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term210038, term210038.getClass(), "commonSkin", -1);
        setIntField(term210038, term210038.getClass(), "headphoneVolume", 100);
        setBooleanField(term210038, term210038.getClass(), "buttonSeOn", true);
        setIntField(term210038, term210038.getClass(), "buttonSeVolume", 100);
        setIntField(term210038, term210038.getClass(), "sliderSeVolume", 100);
        setIntField(term210038, term210038.getClass(), "buttonSe", -1);
        setIntField(term210038, term210038.getClass(), "chainSlideSe", -1);
        setIntField(term210038, term210038.getClass(), "slideSe", -1);
        setIntField(term210038, term210038.getClass(), "sliderTouchSe", -1);
        setField(term210038, term210038.getClass(), "sortMode", enum473);
        setIntField(term210038, term210038.getClass(), "nextPvId", -1);
        setField(term210038, term210038.getClass(), "nextDifficulty", enum474);
        setField(term210038, term210038.getClass(), "nextEdition", enum475);
        setBooleanField(term210038, term210038.getClass(), "showInterimRanking", true);
        setBooleanField(term210038, term210038.getClass(), "showClearStatus", true);
        setBooleanField(term210038, term210038.getClass(), "showGreatBorder", true);
        setBooleanField(term210038, term210038.getClass(), "showExcellentBorder", true);
        setBooleanField(term210038, term210038.getClass(), "showRivalBorder", true);
        setBooleanField(term210038, term210038.getClass(), "showRgoSetting", true);
        setBooleanField(term210038, term210038.getClass(), "contestNowPlayingEnable", true);
        setIntField(term210038, term210038.getClass(), "contestNowPlayingId", -1);
        setIntField(term210038, term210038.getClass(), "contestNowPlayingValue", -1);
        setField(term210038, term210038.getClass(), "contestNowPlayingResultRank", enum476);
        setField(term210038, term210038.getClass(), "contestNowPlayingSpecifier", "");
        setField(term210038, term210038.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term210038, term210038.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term210038, term210038.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term210038, term210038.getClass(), "rivalPdId", -1);
        setField(term210036, term210036.getClass(), "pdId", term210038);
        setIntField(term210036, term210036.getClass(), "pvId", -154210001);
        setField(term210036, term210036.getClass(), "difficulty", enum477);
        setField(term210036, term210036.getClass(), "edition", enum478);
        setIntField(term210036, term210036.getClass(), "scriptVer", 621910137);
        setIntField(term210036, term210036.getClass(), "score", 241533020);
        setField(term210036, term210036.getClass(), "challengeKind", enum479);
        setIntField(term210036, term210036.getClass(), "challengeResult", 2081679151);
        setField(term210036, term210036.getClass(), "clearResult", enum480);
        setIntField(term210036, term210036.getClass(), "vp", -1030167086);
        setIntField(term210036, term210036.getClass(), "coolCount", -434230943);
        setIntField(term210036, term210036.getClass(), "coolPercent", 698633875);
        setIntField(term210036, term210036.getClass(), "fineCount", 548468113);
        setIntField(term210036, term210036.getClass(), "finePercent", 1701819905);
        setIntField(term210036, term210036.getClass(), "safeCount", 1721418943);
        setIntField(term210036, term210036.getClass(), "safePercent", -111082612);
        setIntField(term210036, term210036.getClass(), "sadCount", 1253334988);
        setIntField(term210036, term210036.getClass(), "sadPercent", 1086709736);
        setIntField(term210036, term210036.getClass(), "wrongCount", -1606698075);
        setIntField(term210036, term210036.getClass(), "wrongPercent", 90996421);
        setIntField(term210036, term210036.getClass(), "maxCombo", -1805802783);
        setIntField(term210036, term210036.getClass(), "chanceTime", -529831900);
        setIntField(term210036, term210036.getClass(), "holdScore", 1574493440);
        setIntField(term210036, term210036.getClass(), "attainPoint", 1854694585);
        setIntField(term210036, term210036.getClass(), "skinId", -1260562836);
        setIntField(term210036, term210036.getClass(), "buttonSe", 694100722);
        setIntField(term210036, term210036.getClass(), "buttonSeVol", -680529431);
        setIntField(term210036, term210036.getClass(), "sliderSe", 212698793);
        setIntField(term210036, term210036.getClass(), "ChainSlideSe", 1169519385);
        setIntField(term210036, term210036.getClass(), "SliderTouchSe", 1846078344);
        setField(term210036, term210036.getClass(), "modules", "SdCKLMIYnX");
        setIntField(term210036, term210036.getClass(), "stageCompletion", 1692543802);
        setIntField(term210036, term210036.getClass(), "slideScore", 376341151);
        setIntField(term210036, term210036.getClass(), "isVocalChange", -1607267243);
        setField(term210036, term210036.getClass(), "customizeItems", "OJJtVNPyKZ");
        setField(term210036, term210036.getClass(), "rhythmGameOptions", "AKNapTAfmD");
        setIntField(term210036, term210036.getClass(), "screenShotCount", -1);
        setIntField(term210755, term210755.getClass(), "year", 2017);
        setShortField(term210755, term210755.getClass(), "month", (short) 4);
        setShortField(term210755, term210755.getClass(), "day", (short) 3);
        setField(term210754, term210754.getClass(), "date", term210755);
        setByteField(term210759, term210759.getClass(), "hour", (byte) 6);
        setByteField(term210759, term210759.getClass(), "minute", (byte) 51);
        setByteField(term210759, term210759.getClass(), "second", (byte) 10);
        setIntField(term210759, term210759.getClass(), "nano", 316377166);
        setField(term210754, term210754.getClass(), "time", term210759);
        setField(term210036, term210036.getClass(), "dateTime", term210754);
        Class<? extends Object> term213763 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term213762 = ((Class) term213763).getDeclaredField((String) "EASY");
        ((Field) term213762).setAccessible(true);
        enum481 = ((Field) term213762).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Object[] args = new Object[1];
        args[0] = enum481;
        callMethod(klass, "setDifficulty", argTypes, term210036, args);
    }

};


