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

public class PlayLog_setVp_74013064250 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term235785;
     Object term236509;

    public PlayLog_setVp_74013064250() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term236518 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term236517 = ((Class) term236518).getDeclaredField((String) "MISS");
        ((Field) term236517).setAccessible(true);
        Object enum534 = ((Field) term236517).get((Object) null);
        Class<? extends Object> term236895 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term236894 = ((Class) term236895).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term236894).setAccessible(true);
        Object enum535 = ((Field) term236894).get((Object) null);
        Class<? extends Object> term237178 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term237177 = ((Class) term237178).getDeclaredField((String) "NORMAL");
        ((Field) term237177).setAccessible(true);
        Object enum536 = ((Field) term237177).get((Object) null);
        Class<? extends Object> term237453 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term237452 = ((Class) term237453).getDeclaredField((String) "ORIGINAL");
        ((Field) term237452).setAccessible(true);
        Object enum537 = ((Field) term237452).get((Object) null);
        Class<? extends Object> term237719 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term237718 = ((Class) term237719).getDeclaredField((String) "NONE");
        ((Field) term237718).setAccessible(true);
        Object enum538 = ((Field) term237718).get((Object) null);
        Class<? extends Object> term238360 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term238359 = ((Class) term238360).getDeclaredField((String) "UNDEFINED");
        ((Field) term238359).setAccessible(true);
        Object enum539 = ((Field) term238359).get((Object) null);
        Class<? extends Object> term238644 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ChallengeKind");
        Field term238643 = ((Class) term238644).getDeclaredField((String) "UNDEFINED");
        ((Field) term238643).setAccessible(true);
        Object enum540 = ((Field) term238643).get((Object) null);
        Class<? extends Object> term238943 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ClearResult");
        Field term238942 = ((Class) term238943).getDeclaredField((String) "MISS_TAKE");
        ((Field) term238942).setAccessible(true);
        Object enum541 = ((Field) term238942).get((Object) null);
        term235785 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog"));
        Object term235787 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term235910 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term235911 = newInstance(Class.forName("java.time.LocalDate"));
        Object term235915 = newInstance(Class.forName("java.time.LocalTime"));
        Object term236499 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term236500 = newInstance(Class.forName("java.time.LocalDate"));
        Object term236504 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term235785, term235785.getClass(), "id", 8166095254618543564L);
        setLongField(term235787, term235787.getClass(), "id", -4598158870068953328L);
        setIntField(term235787, term235787.getClass(), "pdId", 1017354215);
        setField(term235787, term235787.getClass(), "playerName", "xxx");
        setIntField(term235787, term235787.getClass(), "vocaloidPoints", 300);
        setIntField(term235787, term235787.getClass(), "level", 1);
        setIntField(term235787, term235787.getClass(), "levelExp", 695330987);
        setField(term235787, term235787.getClass(), "levelTitle", "xxx");
        setIntField(term235787, term235787.getClass(), "plateId", -1);
        setIntField(term235787, term235787.getClass(), "plateEffectId", -1);
        setField(term235787, term235787.getClass(), "passwordStatus", enum534);
        setField(term235787, term235787.getClass(), "password", "**********");
        setBooleanField(term235787, term235787.getClass(), "preferPerPvModule", true);
        setBooleanField(term235787, term235787.getClass(), "preferCommonModule", true);
        setBooleanField(term235787, term235787.getClass(), "usePerPvSkin", true);
        setBooleanField(term235787, term235787.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term235787, term235787.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term235787, term235787.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term235787, term235787.getClass(), "usePerPvTouchSliderSe", false);
        setField(term235787, term235787.getClass(), "commonModule", "-999,-999,-999");
        setField(term235787, term235787.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term235911, term235911.getClass(), "year", 2026);
        setShortField(term235911, term235911.getClass(), "month", (short) 8);
        setShortField(term235911, term235911.getClass(), "day", (short) 12);
        setField(term235910, term235910.getClass(), "date", term235911);
        setByteField(term235915, term235915.getClass(), "hour", (byte) 2);
        setByteField(term235915, term235915.getClass(), "minute", (byte) 2);
        setByteField(term235915, term235915.getClass(), "second", (byte) 52);
        setIntField(term235915, term235915.getClass(), "nano", 827645000);
        setField(term235910, term235910.getClass(), "time", term235915);
        setField(term235787, term235787.getClass(), "commonModuleSetTime", term235910);
        setField(term235787, term235787.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term235787, term235787.getClass(), "commonSkin", -1);
        setIntField(term235787, term235787.getClass(), "headphoneVolume", 100);
        setBooleanField(term235787, term235787.getClass(), "buttonSeOn", true);
        setIntField(term235787, term235787.getClass(), "buttonSeVolume", 100);
        setIntField(term235787, term235787.getClass(), "sliderSeVolume", 100);
        setIntField(term235787, term235787.getClass(), "buttonSe", -1);
        setIntField(term235787, term235787.getClass(), "chainSlideSe", -1);
        setIntField(term235787, term235787.getClass(), "slideSe", -1);
        setIntField(term235787, term235787.getClass(), "sliderTouchSe", -1);
        setField(term235787, term235787.getClass(), "sortMode", enum535);
        setIntField(term235787, term235787.getClass(), "nextPvId", -1);
        setField(term235787, term235787.getClass(), "nextDifficulty", enum536);
        setField(term235787, term235787.getClass(), "nextEdition", enum537);
        setBooleanField(term235787, term235787.getClass(), "showInterimRanking", true);
        setBooleanField(term235787, term235787.getClass(), "showClearStatus", true);
        setBooleanField(term235787, term235787.getClass(), "showGreatBorder", true);
        setBooleanField(term235787, term235787.getClass(), "showExcellentBorder", true);
        setBooleanField(term235787, term235787.getClass(), "showRivalBorder", true);
        setBooleanField(term235787, term235787.getClass(), "showRgoSetting", true);
        setBooleanField(term235787, term235787.getClass(), "contestNowPlayingEnable", false);
        setIntField(term235787, term235787.getClass(), "contestNowPlayingId", -1);
        setIntField(term235787, term235787.getClass(), "contestNowPlayingValue", -1);
        setField(term235787, term235787.getClass(), "contestNowPlayingResultRank", enum538);
        setField(term235787, term235787.getClass(), "contestNowPlayingSpecifier", "");
        setField(term235787, term235787.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term235787, term235787.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term235787, term235787.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term235787, term235787.getClass(), "rivalPdId", -1);
        setField(term235785, term235785.getClass(), "pdId", term235787);
        setIntField(term235785, term235785.getClass(), "pvId", -267289967);
        setField(term235785, term235785.getClass(), "difficulty", enum539);
        setField(term235785, term235785.getClass(), "edition", enum537);
        setIntField(term235785, term235785.getClass(), "scriptVer", 773432822);
        setIntField(term235785, term235785.getClass(), "score", -488294922);
        setField(term235785, term235785.getClass(), "challengeKind", enum540);
        setIntField(term235785, term235785.getClass(), "challengeResult", -397161164);
        setField(term235785, term235785.getClass(), "clearResult", enum541);
        setIntField(term235785, term235785.getClass(), "vp", -703717191);
        setIntField(term235785, term235785.getClass(), "coolCount", -1255535445);
        setIntField(term235785, term235785.getClass(), "coolPercent", -2033952124);
        setIntField(term235785, term235785.getClass(), "fineCount", 560401653);
        setIntField(term235785, term235785.getClass(), "finePercent", 1633691536);
        setIntField(term235785, term235785.getClass(), "safeCount", 898165245);
        setIntField(term235785, term235785.getClass(), "safePercent", 1810754549);
        setIntField(term235785, term235785.getClass(), "sadCount", 338342107);
        setIntField(term235785, term235785.getClass(), "sadPercent", -650288950);
        setIntField(term235785, term235785.getClass(), "wrongCount", 433039357);
        setIntField(term235785, term235785.getClass(), "wrongPercent", 1469939797);
        setIntField(term235785, term235785.getClass(), "maxCombo", 252799294);
        setIntField(term235785, term235785.getClass(), "chanceTime", -2072618022);
        setIntField(term235785, term235785.getClass(), "holdScore", -269909549);
        setIntField(term235785, term235785.getClass(), "attainPoint", 686286032);
        setIntField(term235785, term235785.getClass(), "skinId", -1277201854);
        setIntField(term235785, term235785.getClass(), "buttonSe", 1691516034);
        setIntField(term235785, term235785.getClass(), "buttonSeVol", 335681723);
        setIntField(term235785, term235785.getClass(), "sliderSe", -773707674);
        setIntField(term235785, term235785.getClass(), "ChainSlideSe", 383244929);
        setIntField(term235785, term235785.getClass(), "SliderTouchSe", -2114034003);
        setField(term235785, term235785.getClass(), "modules", "jwsfVjMoJT");
        setIntField(term235785, term235785.getClass(), "stageCompletion", 207213904);
        setIntField(term235785, term235785.getClass(), "slideScore", -484303394);
        setIntField(term235785, term235785.getClass(), "isVocalChange", -31125530);
        setField(term235785, term235785.getClass(), "customizeItems", "ZfdXfCCFDf");
        setField(term235785, term235785.getClass(), "rhythmGameOptions", "MwwjNtdOFT");
        setIntField(term235785, term235785.getClass(), "screenShotCount", -1);
        setIntField(term236500, term236500.getClass(), "year", 2011);
        setShortField(term236500, term236500.getClass(), "month", (short) 6);
        setShortField(term236500, term236500.getClass(), "day", (short) 26);
        setField(term236499, term236499.getClass(), "date", term236500);
        setByteField(term236504, term236504.getClass(), "hour", (byte) 22);
        setByteField(term236504, term236504.getClass(), "minute", (byte) 39);
        setByteField(term236504, term236504.getClass(), "second", (byte) 11);
        setIntField(term236504, term236504.getClass(), "nano", 686293604);
        setField(term236499, term236499.getClass(), "time", term236504);
        setField(term235785, term235785.getClass(), "dateTime", term236499);
        term236509 = new Integer(1909773180);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term236509;
        callMethod(klass, "setVp", argTypes, term235785, args);
    }

};


