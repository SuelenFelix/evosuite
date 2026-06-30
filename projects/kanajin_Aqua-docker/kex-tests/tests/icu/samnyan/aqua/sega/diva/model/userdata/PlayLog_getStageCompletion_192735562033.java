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

public class PlayLog_getStageCompletion_192735562033 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term172883;

    public PlayLog_getStageCompletion_192735562033() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term173620 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term173619 = ((Class) term173620).getDeclaredField((String) "MISS");
        ((Field) term173619).setAccessible(true);
        Object enum386 = ((Field) term173619).get((Object) null);
        Class<? extends Object> term173997 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term173996 = ((Class) term173997).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term173996).setAccessible(true);
        Object enum387 = ((Field) term173996).get((Object) null);
        Class<? extends Object> term174280 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term174279 = ((Class) term174280).getDeclaredField((String) "NORMAL");
        ((Field) term174279).setAccessible(true);
        Object enum388 = ((Field) term174279).get((Object) null);
        Class<? extends Object> term174555 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term174554 = ((Class) term174555).getDeclaredField((String) "ORIGINAL");
        ((Field) term174554).setAccessible(true);
        Object enum389 = ((Field) term174554).get((Object) null);
        Class<? extends Object> term174821 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term174820 = ((Class) term174821).getDeclaredField((String) "NONE");
        ((Field) term174820).setAccessible(true);
        Object enum390 = ((Field) term174820).get((Object) null);
        Class<? extends Object> term175462 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term175461 = ((Class) term175462).getDeclaredField((String) "UNDEFINED");
        ((Field) term175461).setAccessible(true);
        Object enum391 = ((Field) term175461).get((Object) null);
        Class<? extends Object> term175746 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term175745 = ((Class) term175746).getDeclaredField((String) "EXTRA");
        ((Field) term175745).setAccessible(true);
        Object enum392 = ((Field) term175745).get((Object) null);
        Class<? extends Object> term176003 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ChallengeKind");
        Field term176002 = ((Class) term176003).getDeclaredField((String) "CLEAR");
        ((Field) term176002).setAccessible(true);
        Object enum393 = ((Field) term176002).get((Object) null);
        Class<? extends Object> term176290 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ClearResult");
        Field term176289 = ((Class) term176290).getDeclaredField((String) "EXCELLENT");
        ((Field) term176289).setAccessible(true);
        Object enum394 = ((Field) term176289).get((Object) null);
        term172883 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog"));
        Object term172885 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term173008 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term173009 = newInstance(Class.forName("java.time.LocalDate"));
        Object term173013 = newInstance(Class.forName("java.time.LocalTime"));
        Object term173603 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term173604 = newInstance(Class.forName("java.time.LocalDate"));
        Object term173608 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term172883, term172883.getClass(), "id", 1597484336218508869L);
        setLongField(term172885, term172885.getClass(), "id", -685023850445639859L);
        setIntField(term172885, term172885.getClass(), "pdId", 1077647088);
        setField(term172885, term172885.getClass(), "playerName", "xxx");
        setIntField(term172885, term172885.getClass(), "vocaloidPoints", 300);
        setIntField(term172885, term172885.getClass(), "level", 1);
        setIntField(term172885, term172885.getClass(), "levelExp", -705176810);
        setField(term172885, term172885.getClass(), "levelTitle", "xxx");
        setIntField(term172885, term172885.getClass(), "plateId", -1);
        setIntField(term172885, term172885.getClass(), "plateEffectId", -1);
        setField(term172885, term172885.getClass(), "passwordStatus", enum386);
        setField(term172885, term172885.getClass(), "password", "**********");
        setBooleanField(term172885, term172885.getClass(), "preferPerPvModule", true);
        setBooleanField(term172885, term172885.getClass(), "preferCommonModule", false);
        setBooleanField(term172885, term172885.getClass(), "usePerPvSkin", false);
        setBooleanField(term172885, term172885.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term172885, term172885.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term172885, term172885.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term172885, term172885.getClass(), "usePerPvTouchSliderSe", false);
        setField(term172885, term172885.getClass(), "commonModule", "-999,-999,-999");
        setField(term172885, term172885.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term173009, term173009.getClass(), "year", 2026);
        setShortField(term173009, term173009.getClass(), "month", (short) 6);
        setShortField(term173009, term173009.getClass(), "day", (short) 29);
        setField(term173008, term173008.getClass(), "date", term173009);
        setByteField(term173013, term173013.getClass(), "hour", (byte) 4);
        setByteField(term173013, term173013.getClass(), "minute", (byte) 27);
        setByteField(term173013, term173013.getClass(), "second", (byte) 32);
        setIntField(term173013, term173013.getClass(), "nano", 14453000);
        setField(term173008, term173008.getClass(), "time", term173013);
        setField(term172885, term172885.getClass(), "commonModuleSetTime", term173008);
        setField(term172885, term172885.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term172885, term172885.getClass(), "commonSkin", -1);
        setIntField(term172885, term172885.getClass(), "headphoneVolume", 100);
        setBooleanField(term172885, term172885.getClass(), "buttonSeOn", true);
        setIntField(term172885, term172885.getClass(), "buttonSeVolume", 100);
        setIntField(term172885, term172885.getClass(), "sliderSeVolume", 100);
        setIntField(term172885, term172885.getClass(), "buttonSe", -1);
        setIntField(term172885, term172885.getClass(), "chainSlideSe", -1);
        setIntField(term172885, term172885.getClass(), "slideSe", -1);
        setIntField(term172885, term172885.getClass(), "sliderTouchSe", -1);
        setField(term172885, term172885.getClass(), "sortMode", enum387);
        setIntField(term172885, term172885.getClass(), "nextPvId", -1);
        setField(term172885, term172885.getClass(), "nextDifficulty", enum388);
        setField(term172885, term172885.getClass(), "nextEdition", enum389);
        setBooleanField(term172885, term172885.getClass(), "showInterimRanking", true);
        setBooleanField(term172885, term172885.getClass(), "showClearStatus", true);
        setBooleanField(term172885, term172885.getClass(), "showGreatBorder", true);
        setBooleanField(term172885, term172885.getClass(), "showExcellentBorder", true);
        setBooleanField(term172885, term172885.getClass(), "showRivalBorder", true);
        setBooleanField(term172885, term172885.getClass(), "showRgoSetting", true);
        setBooleanField(term172885, term172885.getClass(), "contestNowPlayingEnable", false);
        setIntField(term172885, term172885.getClass(), "contestNowPlayingId", -1);
        setIntField(term172885, term172885.getClass(), "contestNowPlayingValue", -1);
        setField(term172885, term172885.getClass(), "contestNowPlayingResultRank", enum390);
        setField(term172885, term172885.getClass(), "contestNowPlayingSpecifier", "");
        setField(term172885, term172885.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term172885, term172885.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term172885, term172885.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term172885, term172885.getClass(), "rivalPdId", -1);
        setField(term172883, term172883.getClass(), "pdId", term172885);
        setIntField(term172883, term172883.getClass(), "pvId", -1584779593);
        setField(term172883, term172883.getClass(), "difficulty", enum391);
        setField(term172883, term172883.getClass(), "edition", enum392);
        setIntField(term172883, term172883.getClass(), "scriptVer", 303007547);
        setIntField(term172883, term172883.getClass(), "score", 1498738343);
        setField(term172883, term172883.getClass(), "challengeKind", enum393);
        setIntField(term172883, term172883.getClass(), "challengeResult", -1635571857);
        setField(term172883, term172883.getClass(), "clearResult", enum394);
        setIntField(term172883, term172883.getClass(), "vp", 1407309162);
        setIntField(term172883, term172883.getClass(), "coolCount", -534033672);
        setIntField(term172883, term172883.getClass(), "coolPercent", -1162790806);
        setIntField(term172883, term172883.getClass(), "fineCount", -1264595049);
        setIntField(term172883, term172883.getClass(), "finePercent", -2058884635);
        setIntField(term172883, term172883.getClass(), "safeCount", 1064185088);
        setIntField(term172883, term172883.getClass(), "safePercent", -1249782654);
        setIntField(term172883, term172883.getClass(), "sadCount", 399302934);
        setIntField(term172883, term172883.getClass(), "sadPercent", -1823255084);
        setIntField(term172883, term172883.getClass(), "wrongCount", 793345010);
        setIntField(term172883, term172883.getClass(), "wrongPercent", -2092117838);
        setIntField(term172883, term172883.getClass(), "maxCombo", 1524590776);
        setIntField(term172883, term172883.getClass(), "chanceTime", 1523896653);
        setIntField(term172883, term172883.getClass(), "holdScore", -1731921726);
        setIntField(term172883, term172883.getClass(), "attainPoint", 919994471);
        setIntField(term172883, term172883.getClass(), "skinId", 183531701);
        setIntField(term172883, term172883.getClass(), "buttonSe", -974923743);
        setIntField(term172883, term172883.getClass(), "buttonSeVol", 1876738932);
        setIntField(term172883, term172883.getClass(), "sliderSe", -1870339027);
        setIntField(term172883, term172883.getClass(), "ChainSlideSe", -1549603566);
        setIntField(term172883, term172883.getClass(), "SliderTouchSe", 1077223540);
        setField(term172883, term172883.getClass(), "modules", "BKLfkLiZTH");
        setIntField(term172883, term172883.getClass(), "stageCompletion", -1823813592);
        setIntField(term172883, term172883.getClass(), "slideScore", -1644358555);
        setIntField(term172883, term172883.getClass(), "isVocalChange", -388591034);
        setField(term172883, term172883.getClass(), "customizeItems", "SPpkrGcPRr");
        setField(term172883, term172883.getClass(), "rhythmGameOptions", "sEccwbJKYE");
        setIntField(term172883, term172883.getClass(), "screenShotCount", -1);
        setIntField(term173604, term173604.getClass(), "year", 2024);
        setShortField(term173604, term173604.getClass(), "month", (short) 4);
        setShortField(term173604, term173604.getClass(), "day", (short) 24);
        setField(term173603, term173603.getClass(), "date", term173604);
        setByteField(term173608, term173608.getClass(), "hour", (byte) 7);
        setByteField(term173608, term173608.getClass(), "minute", (byte) 2);
        setByteField(term173608, term173608.getClass(), "second", (byte) 51);
        setIntField(term173608, term173608.getClass(), "nano", 635502964);
        setField(term173603, term173603.getClass(), "time", term173608);
        setField(term172883, term172883.getClass(), "dateTime", term173603);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStageCompletion", argTypes, term172883, args);
    }

};


