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
import java.lang.Long;

public class PlayLog_setId_73973281940 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term198408;
     Object term199124;

    public PlayLog_setId_73973281940() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term199133 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term199132 = ((Class) term199133).getDeclaredField((String) "MISS");
        ((Field) term199132).setAccessible(true);
        Object enum447 = ((Field) term199132).get((Object) null);
        Class<? extends Object> term199510 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term199509 = ((Class) term199510).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term199509).setAccessible(true);
        Object enum448 = ((Field) term199509).get((Object) null);
        Class<? extends Object> term199793 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term199792 = ((Class) term199793).getDeclaredField((String) "NORMAL");
        ((Field) term199792).setAccessible(true);
        Object enum449 = ((Field) term199792).get((Object) null);
        Class<? extends Object> term200068 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term200067 = ((Class) term200068).getDeclaredField((String) "ORIGINAL");
        ((Field) term200067).setAccessible(true);
        Object enum450 = ((Field) term200067).get((Object) null);
        Class<? extends Object> term200334 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term200333 = ((Class) term200334).getDeclaredField((String) "NONE");
        ((Field) term200333).setAccessible(true);
        Object enum451 = ((Field) term200333).get((Object) null);
        Class<? extends Object> term200975 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term200974 = ((Class) term200975).getDeclaredField((String) "EXTREME");
        ((Field) term200974).setAccessible(true);
        Object enum452 = ((Field) term200974).get((Object) null);
        Class<? extends Object> term201253 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ChallengeKind");
        Field term201252 = ((Class) term201253).getDeclaredField((String) "CLEAR");
        ((Field) term201252).setAccessible(true);
        Object enum453 = ((Field) term201252).get((Object) null);
        Class<? extends Object> term201540 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ClearResult");
        Field term201539 = ((Class) term201540).getDeclaredField((String) "PERFECT");
        ((Field) term201539).setAccessible(true);
        Object enum454 = ((Field) term201539).get((Object) null);
        term198408 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog"));
        Object term198410 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term198533 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term198534 = newInstance(Class.forName("java.time.LocalDate"));
        Object term198538 = newInstance(Class.forName("java.time.LocalTime"));
        Object term199114 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term199115 = newInstance(Class.forName("java.time.LocalDate"));
        Object term199119 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term198408, term198408.getClass(), "id", 6273754186658578034L);
        setLongField(term198410, term198410.getClass(), "id", 3620247240684476031L);
        setIntField(term198410, term198410.getClass(), "pdId", 1134565344);
        setField(term198410, term198410.getClass(), "playerName", "xxx");
        setIntField(term198410, term198410.getClass(), "vocaloidPoints", 300);
        setIntField(term198410, term198410.getClass(), "level", 1);
        setIntField(term198410, term198410.getClass(), "levelExp", -1747434000);
        setField(term198410, term198410.getClass(), "levelTitle", "xxx");
        setIntField(term198410, term198410.getClass(), "plateId", -1);
        setIntField(term198410, term198410.getClass(), "plateEffectId", -1);
        setField(term198410, term198410.getClass(), "passwordStatus", enum447);
        setField(term198410, term198410.getClass(), "password", "**********");
        setBooleanField(term198410, term198410.getClass(), "preferPerPvModule", true);
        setBooleanField(term198410, term198410.getClass(), "preferCommonModule", false);
        setBooleanField(term198410, term198410.getClass(), "usePerPvSkin", false);
        setBooleanField(term198410, term198410.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term198410, term198410.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term198410, term198410.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term198410, term198410.getClass(), "usePerPvTouchSliderSe", false);
        setField(term198410, term198410.getClass(), "commonModule", "-999,-999,-999");
        setField(term198410, term198410.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term198534, term198534.getClass(), "year", 2026);
        setShortField(term198534, term198534.getClass(), "month", (short) 6);
        setShortField(term198534, term198534.getClass(), "day", (short) 29);
        setField(term198533, term198533.getClass(), "date", term198534);
        setByteField(term198538, term198538.getClass(), "hour", (byte) 4);
        setByteField(term198538, term198538.getClass(), "minute", (byte) 27);
        setByteField(term198538, term198538.getClass(), "second", (byte) 33);
        setIntField(term198538, term198538.getClass(), "nano", 798001000);
        setField(term198533, term198533.getClass(), "time", term198538);
        setField(term198410, term198410.getClass(), "commonModuleSetTime", term198533);
        setField(term198410, term198410.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term198410, term198410.getClass(), "commonSkin", -1);
        setIntField(term198410, term198410.getClass(), "headphoneVolume", 100);
        setBooleanField(term198410, term198410.getClass(), "buttonSeOn", true);
        setIntField(term198410, term198410.getClass(), "buttonSeVolume", 100);
        setIntField(term198410, term198410.getClass(), "sliderSeVolume", 100);
        setIntField(term198410, term198410.getClass(), "buttonSe", -1);
        setIntField(term198410, term198410.getClass(), "chainSlideSe", -1);
        setIntField(term198410, term198410.getClass(), "slideSe", -1);
        setIntField(term198410, term198410.getClass(), "sliderTouchSe", -1);
        setField(term198410, term198410.getClass(), "sortMode", enum448);
        setIntField(term198410, term198410.getClass(), "nextPvId", -1);
        setField(term198410, term198410.getClass(), "nextDifficulty", enum449);
        setField(term198410, term198410.getClass(), "nextEdition", enum450);
        setBooleanField(term198410, term198410.getClass(), "showInterimRanking", true);
        setBooleanField(term198410, term198410.getClass(), "showClearStatus", true);
        setBooleanField(term198410, term198410.getClass(), "showGreatBorder", true);
        setBooleanField(term198410, term198410.getClass(), "showExcellentBorder", true);
        setBooleanField(term198410, term198410.getClass(), "showRivalBorder", true);
        setBooleanField(term198410, term198410.getClass(), "showRgoSetting", true);
        setBooleanField(term198410, term198410.getClass(), "contestNowPlayingEnable", true);
        setIntField(term198410, term198410.getClass(), "contestNowPlayingId", -1);
        setIntField(term198410, term198410.getClass(), "contestNowPlayingValue", -1);
        setField(term198410, term198410.getClass(), "contestNowPlayingResultRank", enum451);
        setField(term198410, term198410.getClass(), "contestNowPlayingSpecifier", "");
        setField(term198410, term198410.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term198410, term198410.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term198410, term198410.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term198410, term198410.getClass(), "rivalPdId", -1);
        setField(term198408, term198408.getClass(), "pdId", term198410);
        setIntField(term198408, term198408.getClass(), "pvId", 1611620166);
        setField(term198408, term198408.getClass(), "difficulty", enum452);
        setField(term198408, term198408.getClass(), "edition", enum450);
        setIntField(term198408, term198408.getClass(), "scriptVer", 249657454);
        setIntField(term198408, term198408.getClass(), "score", 1734630901);
        setField(term198408, term198408.getClass(), "challengeKind", enum453);
        setIntField(term198408, term198408.getClass(), "challengeResult", -703815246);
        setField(term198408, term198408.getClass(), "clearResult", enum454);
        setIntField(term198408, term198408.getClass(), "vp", 157300746);
        setIntField(term198408, term198408.getClass(), "coolCount", -1600748613);
        setIntField(term198408, term198408.getClass(), "coolPercent", -1509192782);
        setIntField(term198408, term198408.getClass(), "fineCount", -867925573);
        setIntField(term198408, term198408.getClass(), "finePercent", 478422495);
        setIntField(term198408, term198408.getClass(), "safeCount", 1727771237);
        setIntField(term198408, term198408.getClass(), "safePercent", 2033663549);
        setIntField(term198408, term198408.getClass(), "sadCount", 1766479154);
        setIntField(term198408, term198408.getClass(), "sadPercent", 533171496);
        setIntField(term198408, term198408.getClass(), "wrongCount", 1369020869);
        setIntField(term198408, term198408.getClass(), "wrongPercent", -1428947021);
        setIntField(term198408, term198408.getClass(), "maxCombo", -134324004);
        setIntField(term198408, term198408.getClass(), "chanceTime", -1813266173);
        setIntField(term198408, term198408.getClass(), "holdScore", -1201819537);
        setIntField(term198408, term198408.getClass(), "attainPoint", 2135922049);
        setIntField(term198408, term198408.getClass(), "skinId", -263876378);
        setIntField(term198408, term198408.getClass(), "buttonSe", -755209283);
        setIntField(term198408, term198408.getClass(), "buttonSeVol", -616562794);
        setIntField(term198408, term198408.getClass(), "sliderSe", 750084083);
        setIntField(term198408, term198408.getClass(), "ChainSlideSe", -1603460382);
        setIntField(term198408, term198408.getClass(), "SliderTouchSe", -298939768);
        setField(term198408, term198408.getClass(), "modules", "dpNsDgfPso");
        setIntField(term198408, term198408.getClass(), "stageCompletion", -767031634);
        setIntField(term198408, term198408.getClass(), "slideScore", -2072469750);
        setIntField(term198408, term198408.getClass(), "isVocalChange", 2106616847);
        setField(term198408, term198408.getClass(), "customizeItems", "hCWPJQKpdc");
        setField(term198408, term198408.getClass(), "rhythmGameOptions", "WzMEhMXkKx");
        setIntField(term198408, term198408.getClass(), "screenShotCount", -1);
        setIntField(term199115, term199115.getClass(), "year", 2020);
        setShortField(term199115, term199115.getClass(), "month", (short) 8);
        setShortField(term199115, term199115.getClass(), "day", (short) 15);
        setField(term199114, term199114.getClass(), "date", term199115);
        setByteField(term199119, term199119.getClass(), "hour", (byte) 2);
        setByteField(term199119, term199119.getClass(), "minute", (byte) 0);
        setByteField(term199119, term199119.getClass(), "second", (byte) 38);
        setIntField(term199119, term199119.getClass(), "nano", 146431486);
        setField(term199114, term199114.getClass(), "time", term199119);
        setField(term198408, term198408.getClass(), "dateTime", term199114);
        term199124 = new Long(8313800941204938919L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term199124;
        callMethod(klass, "setId", argTypes, term198408, args);
    }

};


