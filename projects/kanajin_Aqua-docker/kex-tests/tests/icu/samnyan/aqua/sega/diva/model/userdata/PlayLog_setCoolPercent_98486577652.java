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

public class PlayLog_setCoolPercent_98486577652 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term242996;
     Object term243711;

    public PlayLog_setCoolPercent_98486577652() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term243720 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term243719 = ((Class) term243720).getDeclaredField((String) "MISS");
        ((Field) term243719).setAccessible(true);
        Object enum551 = ((Field) term243719).get((Object) null);
        Class<? extends Object> term244097 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term244096 = ((Class) term244097).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term244096).setAccessible(true);
        Object enum552 = ((Field) term244096).get((Object) null);
        Class<? extends Object> term244380 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term244379 = ((Class) term244380).getDeclaredField((String) "NORMAL");
        ((Field) term244379).setAccessible(true);
        Object enum553 = ((Field) term244379).get((Object) null);
        Class<? extends Object> term244655 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term244654 = ((Class) term244655).getDeclaredField((String) "ORIGINAL");
        ((Field) term244654).setAccessible(true);
        Object enum554 = ((Field) term244654).get((Object) null);
        Class<? extends Object> term244921 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term244920 = ((Class) term244921).getDeclaredField((String) "NONE");
        ((Field) term244920).setAccessible(true);
        Object enum555 = ((Field) term244920).get((Object) null);
        Class<? extends Object> term245562 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term245561 = ((Class) term245562).getDeclaredField((String) "HARD");
        ((Field) term245561).setAccessible(true);
        Object enum556 = ((Field) term245561).get((Object) null);
        Class<? extends Object> term245831 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ChallengeKind");
        Field term245830 = ((Class) term245831).getDeclaredField((String) "EXCELLENT");
        ((Field) term245830).setAccessible(true);
        Object enum557 = ((Field) term245830).get((Object) null);
        Class<? extends Object> term246130 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ClearResult");
        Field term246129 = ((Class) term246130).getDeclaredField((String) "CHEAP");
        ((Field) term246129).setAccessible(true);
        Object enum558 = ((Field) term246129).get((Object) null);
        term242996 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog"));
        Object term242998 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term243121 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term243122 = newInstance(Class.forName("java.time.LocalDate"));
        Object term243126 = newInstance(Class.forName("java.time.LocalTime"));
        Object term243701 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term243702 = newInstance(Class.forName("java.time.LocalDate"));
        Object term243706 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term242996, term242996.getClass(), "id", -1333707622307134180L);
        setLongField(term242998, term242998.getClass(), "id", -4360569253593381888L);
        setIntField(term242998, term242998.getClass(), "pdId", -2062724184);
        setField(term242998, term242998.getClass(), "playerName", "xxx");
        setIntField(term242998, term242998.getClass(), "vocaloidPoints", 300);
        setIntField(term242998, term242998.getClass(), "level", 1);
        setIntField(term242998, term242998.getClass(), "levelExp", -716654499);
        setField(term242998, term242998.getClass(), "levelTitle", "xxx");
        setIntField(term242998, term242998.getClass(), "plateId", -1);
        setIntField(term242998, term242998.getClass(), "plateEffectId", -1);
        setField(term242998, term242998.getClass(), "passwordStatus", enum551);
        setField(term242998, term242998.getClass(), "password", "**********");
        setBooleanField(term242998, term242998.getClass(), "preferPerPvModule", true);
        setBooleanField(term242998, term242998.getClass(), "preferCommonModule", true);
        setBooleanField(term242998, term242998.getClass(), "usePerPvSkin", false);
        setBooleanField(term242998, term242998.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term242998, term242998.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term242998, term242998.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term242998, term242998.getClass(), "usePerPvTouchSliderSe", false);
        setField(term242998, term242998.getClass(), "commonModule", "-999,-999,-999");
        setField(term242998, term242998.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term243122, term243122.getClass(), "year", 2026);
        setShortField(term243122, term243122.getClass(), "month", (short) 6);
        setShortField(term243122, term243122.getClass(), "day", (short) 29);
        setField(term243121, term243121.getClass(), "date", term243122);
        setByteField(term243126, term243126.getClass(), "hour", (byte) 4);
        setByteField(term243126, term243126.getClass(), "minute", (byte) 27);
        setByteField(term243126, term243126.getClass(), "second", (byte) 36);
        setIntField(term243126, term243126.getClass(), "nano", 879356000);
        setField(term243121, term243121.getClass(), "time", term243126);
        setField(term242998, term242998.getClass(), "commonModuleSetTime", term243121);
        setField(term242998, term242998.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term242998, term242998.getClass(), "commonSkin", -1);
        setIntField(term242998, term242998.getClass(), "headphoneVolume", 100);
        setBooleanField(term242998, term242998.getClass(), "buttonSeOn", true);
        setIntField(term242998, term242998.getClass(), "buttonSeVolume", 100);
        setIntField(term242998, term242998.getClass(), "sliderSeVolume", 100);
        setIntField(term242998, term242998.getClass(), "buttonSe", -1);
        setIntField(term242998, term242998.getClass(), "chainSlideSe", -1);
        setIntField(term242998, term242998.getClass(), "slideSe", -1);
        setIntField(term242998, term242998.getClass(), "sliderTouchSe", -1);
        setField(term242998, term242998.getClass(), "sortMode", enum552);
        setIntField(term242998, term242998.getClass(), "nextPvId", -1);
        setField(term242998, term242998.getClass(), "nextDifficulty", enum553);
        setField(term242998, term242998.getClass(), "nextEdition", enum554);
        setBooleanField(term242998, term242998.getClass(), "showInterimRanking", true);
        setBooleanField(term242998, term242998.getClass(), "showClearStatus", true);
        setBooleanField(term242998, term242998.getClass(), "showGreatBorder", true);
        setBooleanField(term242998, term242998.getClass(), "showExcellentBorder", true);
        setBooleanField(term242998, term242998.getClass(), "showRivalBorder", true);
        setBooleanField(term242998, term242998.getClass(), "showRgoSetting", true);
        setBooleanField(term242998, term242998.getClass(), "contestNowPlayingEnable", false);
        setIntField(term242998, term242998.getClass(), "contestNowPlayingId", -1);
        setIntField(term242998, term242998.getClass(), "contestNowPlayingValue", -1);
        setField(term242998, term242998.getClass(), "contestNowPlayingResultRank", enum555);
        setField(term242998, term242998.getClass(), "contestNowPlayingSpecifier", "");
        setField(term242998, term242998.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term242998, term242998.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term242998, term242998.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term242998, term242998.getClass(), "rivalPdId", -1);
        setField(term242996, term242996.getClass(), "pdId", term242998);
        setIntField(term242996, term242996.getClass(), "pvId", 1641117123);
        setField(term242996, term242996.getClass(), "difficulty", enum556);
        setField(term242996, term242996.getClass(), "edition", enum554);
        setIntField(term242996, term242996.getClass(), "scriptVer", -1084408453);
        setIntField(term242996, term242996.getClass(), "score", -1466822773);
        setField(term242996, term242996.getClass(), "challengeKind", enum557);
        setIntField(term242996, term242996.getClass(), "challengeResult", -230022261);
        setField(term242996, term242996.getClass(), "clearResult", enum558);
        setIntField(term242996, term242996.getClass(), "vp", 831967494);
        setIntField(term242996, term242996.getClass(), "coolCount", -1858635791);
        setIntField(term242996, term242996.getClass(), "coolPercent", 1919079331);
        setIntField(term242996, term242996.getClass(), "fineCount", 144872711);
        setIntField(term242996, term242996.getClass(), "finePercent", -720037395);
        setIntField(term242996, term242996.getClass(), "safeCount", 1232105469);
        setIntField(term242996, term242996.getClass(), "safePercent", -1547322575);
        setIntField(term242996, term242996.getClass(), "sadCount", -61444233);
        setIntField(term242996, term242996.getClass(), "sadPercent", -400720912);
        setIntField(term242996, term242996.getClass(), "wrongCount", 1266192397);
        setIntField(term242996, term242996.getClass(), "wrongPercent", 218346781);
        setIntField(term242996, term242996.getClass(), "maxCombo", -984660976);
        setIntField(term242996, term242996.getClass(), "chanceTime", -1419341969);
        setIntField(term242996, term242996.getClass(), "holdScore", -89522625);
        setIntField(term242996, term242996.getClass(), "attainPoint", 1475906894);
        setIntField(term242996, term242996.getClass(), "skinId", -2004794532);
        setIntField(term242996, term242996.getClass(), "buttonSe", 1232958763);
        setIntField(term242996, term242996.getClass(), "buttonSeVol", -1702132549);
        setIntField(term242996, term242996.getClass(), "sliderSe", -1786136772);
        setIntField(term242996, term242996.getClass(), "ChainSlideSe", -1510967747);
        setIntField(term242996, term242996.getClass(), "SliderTouchSe", -2014792457);
        setField(term242996, term242996.getClass(), "modules", "HHmNoYxIGj");
        setIntField(term242996, term242996.getClass(), "stageCompletion", 1957633116);
        setIntField(term242996, term242996.getClass(), "slideScore", 1428598210);
        setIntField(term242996, term242996.getClass(), "isVocalChange", 1071776561);
        setField(term242996, term242996.getClass(), "customizeItems", "PtirvZmsGt");
        setField(term242996, term242996.getClass(), "rhythmGameOptions", "HWkpTmtlrc");
        setIntField(term242996, term242996.getClass(), "screenShotCount", -1);
        setIntField(term243702, term243702.getClass(), "year", 2025);
        setShortField(term243702, term243702.getClass(), "month", (short) 9);
        setShortField(term243702, term243702.getClass(), "day", (short) 25);
        setField(term243701, term243701.getClass(), "date", term243702);
        setByteField(term243706, term243706.getClass(), "hour", (byte) 20);
        setByteField(term243706, term243706.getClass(), "minute", (byte) 0);
        setByteField(term243706, term243706.getClass(), "second", (byte) 25);
        setIntField(term243706, term243706.getClass(), "nano", 65871584);
        setField(term243701, term243701.getClass(), "time", term243706);
        setField(term242996, term242996.getClass(), "dateTime", term243701);
        term243711 = new Integer(1846399918);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term243711;
        callMethod(klass, "setCoolPercent", argTypes, term242996, args);
    }

};


