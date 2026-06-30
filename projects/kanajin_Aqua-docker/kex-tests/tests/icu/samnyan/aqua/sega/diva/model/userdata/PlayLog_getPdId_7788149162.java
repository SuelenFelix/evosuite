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

public class PlayLog_getPdId_7788149162 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62794;

    public PlayLog_getPdId_7788149162() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term63521 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term63520 = ((Class) term63521).getDeclaredField((String) "MISS");
        ((Field) term63520).setAccessible(true);
        Object enum126 = ((Field) term63520).get((Object) null);
        Class<? extends Object> term63898 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term63897 = ((Class) term63898).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term63897).setAccessible(true);
        Object enum127 = ((Field) term63897).get((Object) null);
        Class<? extends Object> term64181 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term64180 = ((Class) term64181).getDeclaredField((String) "NORMAL");
        ((Field) term64180).setAccessible(true);
        Object enum128 = ((Field) term64180).get((Object) null);
        Class<? extends Object> term64456 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term64455 = ((Class) term64456).getDeclaredField((String) "ORIGINAL");
        ((Field) term64455).setAccessible(true);
        Object enum129 = ((Field) term64455).get((Object) null);
        Class<? extends Object> term64722 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term64721 = ((Class) term64722).getDeclaredField((String) "NONE");
        ((Field) term64721).setAccessible(true);
        Object enum130 = ((Field) term64721).get((Object) null);
        Class<? extends Object> term65363 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term65362 = ((Class) term65363).getDeclaredField((String) "UNDEFINED");
        ((Field) term65362).setAccessible(true);
        Object enum131 = ((Field) term65362).get((Object) null);
        Class<? extends Object> term65647 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ChallengeKind");
        Field term65646 = ((Class) term65647).getDeclaredField((String) "PERFECT");
        ((Field) term65646).setAccessible(true);
        Object enum132 = ((Field) term65646).get((Object) null);
        Class<? extends Object> term65940 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ClearResult");
        Field term65939 = ((Class) term65940).getDeclaredField((String) "PERFECT");
        ((Field) term65939).setAccessible(true);
        Object enum133 = ((Field) term65939).get((Object) null);
        term62794 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog"));
        Object term62796 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term62919 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term62920 = newInstance(Class.forName("java.time.LocalDate"));
        Object term62924 = newInstance(Class.forName("java.time.LocalTime"));
        Object term63504 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term63505 = newInstance(Class.forName("java.time.LocalDate"));
        Object term63509 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term62794, term62794.getClass(), "id", -4443169559037975007L);
        setLongField(term62796, term62796.getClass(), "id", -3842548265506930260L);
        setIntField(term62796, term62796.getClass(), "pdId", 1830648570);
        setField(term62796, term62796.getClass(), "playerName", "xxx");
        setIntField(term62796, term62796.getClass(), "vocaloidPoints", 300);
        setIntField(term62796, term62796.getClass(), "level", 1);
        setIntField(term62796, term62796.getClass(), "levelExp", -227365013);
        setField(term62796, term62796.getClass(), "levelTitle", "xxx");
        setIntField(term62796, term62796.getClass(), "plateId", -1);
        setIntField(term62796, term62796.getClass(), "plateEffectId", -1);
        setField(term62796, term62796.getClass(), "passwordStatus", enum126);
        setField(term62796, term62796.getClass(), "password", "**********");
        setBooleanField(term62796, term62796.getClass(), "preferPerPvModule", true);
        setBooleanField(term62796, term62796.getClass(), "preferCommonModule", true);
        setBooleanField(term62796, term62796.getClass(), "usePerPvSkin", true);
        setBooleanField(term62796, term62796.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term62796, term62796.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term62796, term62796.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term62796, term62796.getClass(), "usePerPvTouchSliderSe", false);
        setField(term62796, term62796.getClass(), "commonModule", "-999,-999,-999");
        setField(term62796, term62796.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term62920, term62920.getClass(), "year", 2026);
        setShortField(term62920, term62920.getClass(), "month", (short) 6);
        setShortField(term62920, term62920.getClass(), "day", (short) 29);
        setField(term62919, term62919.getClass(), "date", term62920);
        setByteField(term62924, term62924.getClass(), "hour", (byte) 4);
        setByteField(term62924, term62924.getClass(), "minute", (byte) 27);
        setByteField(term62924, term62924.getClass(), "second", (byte) 24);
        setIntField(term62924, term62924.getClass(), "nano", 52386000);
        setField(term62919, term62919.getClass(), "time", term62924);
        setField(term62796, term62796.getClass(), "commonModuleSetTime", term62919);
        setField(term62796, term62796.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term62796, term62796.getClass(), "commonSkin", -1);
        setIntField(term62796, term62796.getClass(), "headphoneVolume", 100);
        setBooleanField(term62796, term62796.getClass(), "buttonSeOn", true);
        setIntField(term62796, term62796.getClass(), "buttonSeVolume", 100);
        setIntField(term62796, term62796.getClass(), "sliderSeVolume", 100);
        setIntField(term62796, term62796.getClass(), "buttonSe", -1);
        setIntField(term62796, term62796.getClass(), "chainSlideSe", -1);
        setIntField(term62796, term62796.getClass(), "slideSe", -1);
        setIntField(term62796, term62796.getClass(), "sliderTouchSe", -1);
        setField(term62796, term62796.getClass(), "sortMode", enum127);
        setIntField(term62796, term62796.getClass(), "nextPvId", -1);
        setField(term62796, term62796.getClass(), "nextDifficulty", enum128);
        setField(term62796, term62796.getClass(), "nextEdition", enum129);
        setBooleanField(term62796, term62796.getClass(), "showInterimRanking", true);
        setBooleanField(term62796, term62796.getClass(), "showClearStatus", true);
        setBooleanField(term62796, term62796.getClass(), "showGreatBorder", true);
        setBooleanField(term62796, term62796.getClass(), "showExcellentBorder", true);
        setBooleanField(term62796, term62796.getClass(), "showRivalBorder", true);
        setBooleanField(term62796, term62796.getClass(), "showRgoSetting", true);
        setBooleanField(term62796, term62796.getClass(), "contestNowPlayingEnable", true);
        setIntField(term62796, term62796.getClass(), "contestNowPlayingId", -1);
        setIntField(term62796, term62796.getClass(), "contestNowPlayingValue", -1);
        setField(term62796, term62796.getClass(), "contestNowPlayingResultRank", enum130);
        setField(term62796, term62796.getClass(), "contestNowPlayingSpecifier", "");
        setField(term62796, term62796.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term62796, term62796.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term62796, term62796.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term62796, term62796.getClass(), "rivalPdId", -1);
        setField(term62794, term62794.getClass(), "pdId", term62796);
        setIntField(term62794, term62794.getClass(), "pvId", 11724947);
        setField(term62794, term62794.getClass(), "difficulty", enum131);
        setField(term62794, term62794.getClass(), "edition", enum129);
        setIntField(term62794, term62794.getClass(), "scriptVer", 1953277050);
        setIntField(term62794, term62794.getClass(), "score", 1283079251);
        setField(term62794, term62794.getClass(), "challengeKind", enum132);
        setIntField(term62794, term62794.getClass(), "challengeResult", -523949691);
        setField(term62794, term62794.getClass(), "clearResult", enum133);
        setIntField(term62794, term62794.getClass(), "vp", 1398204340);
        setIntField(term62794, term62794.getClass(), "coolCount", 229204365);
        setIntField(term62794, term62794.getClass(), "coolPercent", -461771056);
        setIntField(term62794, term62794.getClass(), "fineCount", -243422082);
        setIntField(term62794, term62794.getClass(), "finePercent", 1384592638);
        setIntField(term62794, term62794.getClass(), "safeCount", -1002370457);
        setIntField(term62794, term62794.getClass(), "safePercent", -2014576105);
        setIntField(term62794, term62794.getClass(), "sadCount", 1296895584);
        setIntField(term62794, term62794.getClass(), "sadPercent", 628918458);
        setIntField(term62794, term62794.getClass(), "wrongCount", -1274456137);
        setIntField(term62794, term62794.getClass(), "wrongPercent", 1041916673);
        setIntField(term62794, term62794.getClass(), "maxCombo", -601863069);
        setIntField(term62794, term62794.getClass(), "chanceTime", 663292551);
        setIntField(term62794, term62794.getClass(), "holdScore", -1885090354);
        setIntField(term62794, term62794.getClass(), "attainPoint", -2066804303);
        setIntField(term62794, term62794.getClass(), "skinId", -1731761810);
        setIntField(term62794, term62794.getClass(), "buttonSe", 197109649);
        setIntField(term62794, term62794.getClass(), "buttonSeVol", -1239406390);
        setIntField(term62794, term62794.getClass(), "sliderSe", 1557431527);
        setIntField(term62794, term62794.getClass(), "ChainSlideSe", -1504890659);
        setIntField(term62794, term62794.getClass(), "SliderTouchSe", 1358829571);
        setField(term62794, term62794.getClass(), "modules", "SzjVpOQTyS");
        setIntField(term62794, term62794.getClass(), "stageCompletion", 991356662);
        setIntField(term62794, term62794.getClass(), "slideScore", -506958186);
        setIntField(term62794, term62794.getClass(), "isVocalChange", -507387516);
        setField(term62794, term62794.getClass(), "customizeItems", "MjGYSRKTNF");
        setField(term62794, term62794.getClass(), "rhythmGameOptions", "hRNSzYYIrc");
        setIntField(term62794, term62794.getClass(), "screenShotCount", -1);
        setIntField(term63505, term63505.getClass(), "year", 2022);
        setShortField(term63505, term63505.getClass(), "month", (short) 2);
        setShortField(term63505, term63505.getClass(), "day", (short) 26);
        setField(term63504, term63504.getClass(), "date", term63505);
        setByteField(term63509, term63509.getClass(), "hour", (byte) 11);
        setByteField(term63509, term63509.getClass(), "minute", (byte) 42);
        setByteField(term63509, term63509.getClass(), "second", (byte) 15);
        setIntField(term63509, term63509.getClass(), "nano", 377731937);
        setField(term63504, term63504.getClass(), "time", term63509);
        setField(term62794, term62794.getClass(), "dateTime", term63504);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPdId", argTypes, term62794, args);
    }

};


