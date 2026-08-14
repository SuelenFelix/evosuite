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

public class PlayLog_setScore_64222338646 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term221177;
     Object term221891;

    public PlayLog_setScore_64222338646() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term221900 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term221899 = ((Class) term221900).getDeclaredField((String) "MISS");
        ((Field) term221899).setAccessible(true);
        Object enum499 = ((Field) term221899).get((Object) null);
        Class<? extends Object> term222277 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term222276 = ((Class) term222277).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term222276).setAccessible(true);
        Object enum500 = ((Field) term222276).get((Object) null);
        Class<? extends Object> term222560 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term222559 = ((Class) term222560).getDeclaredField((String) "NORMAL");
        ((Field) term222559).setAccessible(true);
        Object enum501 = ((Field) term222559).get((Object) null);
        Class<? extends Object> term222835 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term222834 = ((Class) term222835).getDeclaredField((String) "ORIGINAL");
        ((Field) term222834).setAccessible(true);
        Object enum502 = ((Field) term222834).get((Object) null);
        Class<? extends Object> term223101 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term223100 = ((Class) term223101).getDeclaredField((String) "NONE");
        ((Field) term223100).setAccessible(true);
        Object enum503 = ((Field) term223100).get((Object) null);
        Class<? extends Object> term223742 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term223741 = ((Class) term223742).getDeclaredField((String) "EXTRA");
        ((Field) term223741).setAccessible(true);
        Object enum504 = ((Field) term223741).get((Object) null);
        Class<? extends Object> term223999 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ChallengeKind");
        Field term223998 = ((Class) term223999).getDeclaredField((String) "PERFECT");
        ((Field) term223998).setAccessible(true);
        Object enum505 = ((Field) term223998).get((Object) null);
        Class<? extends Object> term224292 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ClearResult");
        Field term224291 = ((Class) term224292).getDeclaredField((String) "CHEAP");
        ((Field) term224291).setAccessible(true);
        Object enum506 = ((Field) term224291).get((Object) null);
        term221177 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog"));
        Object term221179 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term221302 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term221303 = newInstance(Class.forName("java.time.LocalDate"));
        Object term221307 = newInstance(Class.forName("java.time.LocalTime"));
        Object term221881 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term221882 = newInstance(Class.forName("java.time.LocalDate"));
        Object term221886 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term221177, term221177.getClass(), "id", 8802866251294305945L);
        setLongField(term221179, term221179.getClass(), "id", 4513004407927379358L);
        setIntField(term221179, term221179.getClass(), "pdId", -1095121979);
        setField(term221179, term221179.getClass(), "playerName", "xxx");
        setIntField(term221179, term221179.getClass(), "vocaloidPoints", 300);
        setIntField(term221179, term221179.getClass(), "level", 1);
        setIntField(term221179, term221179.getClass(), "levelExp", -1674851914);
        setField(term221179, term221179.getClass(), "levelTitle", "xxx");
        setIntField(term221179, term221179.getClass(), "plateId", -1);
        setIntField(term221179, term221179.getClass(), "plateEffectId", -1);
        setField(term221179, term221179.getClass(), "passwordStatus", enum499);
        setField(term221179, term221179.getClass(), "password", "**********");
        setBooleanField(term221179, term221179.getClass(), "preferPerPvModule", true);
        setBooleanField(term221179, term221179.getClass(), "preferCommonModule", false);
        setBooleanField(term221179, term221179.getClass(), "usePerPvSkin", true);
        setBooleanField(term221179, term221179.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term221179, term221179.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term221179, term221179.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term221179, term221179.getClass(), "usePerPvTouchSliderSe", false);
        setField(term221179, term221179.getClass(), "commonModule", "-999,-999,-999");
        setField(term221179, term221179.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term221303, term221303.getClass(), "year", 2026);
        setShortField(term221303, term221303.getClass(), "month", (short) 8);
        setShortField(term221303, term221303.getClass(), "day", (short) 12);
        setField(term221302, term221302.getClass(), "date", term221303);
        setByteField(term221307, term221307.getClass(), "hour", (byte) 2);
        setByteField(term221307, term221307.getClass(), "minute", (byte) 2);
        setByteField(term221307, term221307.getClass(), "second", (byte) 51);
        setIntField(term221307, term221307.getClass(), "nano", 838423000);
        setField(term221302, term221302.getClass(), "time", term221307);
        setField(term221179, term221179.getClass(), "commonModuleSetTime", term221302);
        setField(term221179, term221179.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term221179, term221179.getClass(), "commonSkin", -1);
        setIntField(term221179, term221179.getClass(), "headphoneVolume", 100);
        setBooleanField(term221179, term221179.getClass(), "buttonSeOn", true);
        setIntField(term221179, term221179.getClass(), "buttonSeVolume", 100);
        setIntField(term221179, term221179.getClass(), "sliderSeVolume", 100);
        setIntField(term221179, term221179.getClass(), "buttonSe", -1);
        setIntField(term221179, term221179.getClass(), "chainSlideSe", -1);
        setIntField(term221179, term221179.getClass(), "slideSe", -1);
        setIntField(term221179, term221179.getClass(), "sliderTouchSe", -1);
        setField(term221179, term221179.getClass(), "sortMode", enum500);
        setIntField(term221179, term221179.getClass(), "nextPvId", -1);
        setField(term221179, term221179.getClass(), "nextDifficulty", enum501);
        setField(term221179, term221179.getClass(), "nextEdition", enum502);
        setBooleanField(term221179, term221179.getClass(), "showInterimRanking", true);
        setBooleanField(term221179, term221179.getClass(), "showClearStatus", true);
        setBooleanField(term221179, term221179.getClass(), "showGreatBorder", true);
        setBooleanField(term221179, term221179.getClass(), "showExcellentBorder", true);
        setBooleanField(term221179, term221179.getClass(), "showRivalBorder", true);
        setBooleanField(term221179, term221179.getClass(), "showRgoSetting", true);
        setBooleanField(term221179, term221179.getClass(), "contestNowPlayingEnable", false);
        setIntField(term221179, term221179.getClass(), "contestNowPlayingId", -1);
        setIntField(term221179, term221179.getClass(), "contestNowPlayingValue", -1);
        setField(term221179, term221179.getClass(), "contestNowPlayingResultRank", enum503);
        setField(term221179, term221179.getClass(), "contestNowPlayingSpecifier", "");
        setField(term221179, term221179.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term221179, term221179.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term221179, term221179.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term221179, term221179.getClass(), "rivalPdId", -1);
        setField(term221177, term221177.getClass(), "pdId", term221179);
        setIntField(term221177, term221177.getClass(), "pvId", -1891353352);
        setField(term221177, term221177.getClass(), "difficulty", enum501);
        setField(term221177, term221177.getClass(), "edition", enum504);
        setIntField(term221177, term221177.getClass(), "scriptVer", 113007640);
        setIntField(term221177, term221177.getClass(), "score", 1782226794);
        setField(term221177, term221177.getClass(), "challengeKind", enum505);
        setIntField(term221177, term221177.getClass(), "challengeResult", 1115327577);
        setField(term221177, term221177.getClass(), "clearResult", enum506);
        setIntField(term221177, term221177.getClass(), "vp", 840704993);
        setIntField(term221177, term221177.getClass(), "coolCount", 1297035285);
        setIntField(term221177, term221177.getClass(), "coolPercent", -826239685);
        setIntField(term221177, term221177.getClass(), "fineCount", -845551243);
        setIntField(term221177, term221177.getClass(), "finePercent", 370671198);
        setIntField(term221177, term221177.getClass(), "safeCount", 1426800646);
        setIntField(term221177, term221177.getClass(), "safePercent", 954234820);
        setIntField(term221177, term221177.getClass(), "sadCount", 1047346538);
        setIntField(term221177, term221177.getClass(), "sadPercent", 728436340);
        setIntField(term221177, term221177.getClass(), "wrongCount", 1841731593);
        setIntField(term221177, term221177.getClass(), "wrongPercent", -1854929057);
        setIntField(term221177, term221177.getClass(), "maxCombo", 1703814701);
        setIntField(term221177, term221177.getClass(), "chanceTime", 1370246522);
        setIntField(term221177, term221177.getClass(), "holdScore", -574611924);
        setIntField(term221177, term221177.getClass(), "attainPoint", 512521742);
        setIntField(term221177, term221177.getClass(), "skinId", 1291000976);
        setIntField(term221177, term221177.getClass(), "buttonSe", 1143522832);
        setIntField(term221177, term221177.getClass(), "buttonSeVol", 40965975);
        setIntField(term221177, term221177.getClass(), "sliderSe", -194718582);
        setIntField(term221177, term221177.getClass(), "ChainSlideSe", 42982854);
        setIntField(term221177, term221177.getClass(), "SliderTouchSe", -1129506480);
        setField(term221177, term221177.getClass(), "modules", "PznxWXsZME");
        setIntField(term221177, term221177.getClass(), "stageCompletion", 301438568);
        setIntField(term221177, term221177.getClass(), "slideScore", -1667908453);
        setIntField(term221177, term221177.getClass(), "isVocalChange", 315910438);
        setField(term221177, term221177.getClass(), "customizeItems", "ZzIujlwVsw");
        setField(term221177, term221177.getClass(), "rhythmGameOptions", "LWyEaeIyAo");
        setIntField(term221177, term221177.getClass(), "screenShotCount", -1);
        setIntField(term221882, term221882.getClass(), "year", 2012);
        setShortField(term221882, term221882.getClass(), "month", (short) 4);
        setShortField(term221882, term221882.getClass(), "day", (short) 25);
        setField(term221881, term221881.getClass(), "date", term221882);
        setByteField(term221886, term221886.getClass(), "hour", (byte) 21);
        setByteField(term221886, term221886.getClass(), "minute", (byte) 14);
        setByteField(term221886, term221886.getClass(), "second", (byte) 15);
        setIntField(term221886, term221886.getClass(), "nano", 561700934);
        setField(term221881, term221881.getClass(), "time", term221886);
        setField(term221177, term221177.getClass(), "dateTime", term221881);
        term221891 = new Integer(-1673157821);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term221891;
        callMethod(klass, "setScore", argTypes, term221177, args);
    }

};


