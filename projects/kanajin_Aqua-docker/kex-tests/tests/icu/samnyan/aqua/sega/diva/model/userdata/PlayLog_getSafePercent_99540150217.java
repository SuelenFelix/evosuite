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

public class PlayLog_getSafePercent_99540150217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term115302;

    public PlayLog_getSafePercent_99540150217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term116041 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term116040 = ((Class) term116041).getDeclaredField((String) "MISS");
        ((Field) term116040).setAccessible(true);
        Object enum249 = ((Field) term116040).get((Object) null);
        Class<? extends Object> term116418 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term116417 = ((Class) term116418).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term116417).setAccessible(true);
        Object enum250 = ((Field) term116417).get((Object) null);
        Class<? extends Object> term116701 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term116700 = ((Class) term116701).getDeclaredField((String) "NORMAL");
        ((Field) term116700).setAccessible(true);
        Object enum251 = ((Field) term116700).get((Object) null);
        Class<? extends Object> term116976 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term116975 = ((Class) term116976).getDeclaredField((String) "ORIGINAL");
        ((Field) term116975).setAccessible(true);
        Object enum252 = ((Field) term116975).get((Object) null);
        Class<? extends Object> term117242 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term117241 = ((Class) term117242).getDeclaredField((String) "NONE");
        ((Field) term117241).setAccessible(true);
        Object enum253 = ((Field) term117241).get((Object) null);
        Class<? extends Object> term117883 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term117882 = ((Class) term117883).getDeclaredField((String) "EXTREME");
        ((Field) term117882).setAccessible(true);
        Object enum254 = ((Field) term117882).get((Object) null);
        Class<? extends Object> term118161 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term118160 = ((Class) term118161).getDeclaredField((String) "EXTRA");
        ((Field) term118160).setAccessible(true);
        Object enum255 = ((Field) term118160).get((Object) null);
        Class<? extends Object> term118418 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ChallengeKind");
        Field term118417 = ((Class) term118418).getDeclaredField((String) "EXCELLENT");
        ((Field) term118417).setAccessible(true);
        Object enum256 = ((Field) term118417).get((Object) null);
        Class<? extends Object> term118717 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ClearResult");
        Field term118716 = ((Class) term118717).getDeclaredField((String) "EXCELLENT");
        ((Field) term118716).setAccessible(true);
        Object enum257 = ((Field) term118716).get((Object) null);
        term115302 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog"));
        Object term115304 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term115427 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term115428 = newInstance(Class.forName("java.time.LocalDate"));
        Object term115432 = newInstance(Class.forName("java.time.LocalTime"));
        Object term116024 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term116025 = newInstance(Class.forName("java.time.LocalDate"));
        Object term116029 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term115302, term115302.getClass(), "id", 7862575738391801707L);
        setLongField(term115304, term115304.getClass(), "id", 50358265865610362L);
        setIntField(term115304, term115304.getClass(), "pdId", 1470349147);
        setField(term115304, term115304.getClass(), "playerName", "xxx");
        setIntField(term115304, term115304.getClass(), "vocaloidPoints", 300);
        setIntField(term115304, term115304.getClass(), "level", 1);
        setIntField(term115304, term115304.getClass(), "levelExp", -255317272);
        setField(term115304, term115304.getClass(), "levelTitle", "xxx");
        setIntField(term115304, term115304.getClass(), "plateId", -1);
        setIntField(term115304, term115304.getClass(), "plateEffectId", -1);
        setField(term115304, term115304.getClass(), "passwordStatus", enum249);
        setField(term115304, term115304.getClass(), "password", "**********");
        setBooleanField(term115304, term115304.getClass(), "preferPerPvModule", true);
        setBooleanField(term115304, term115304.getClass(), "preferCommonModule", true);
        setBooleanField(term115304, term115304.getClass(), "usePerPvSkin", true);
        setBooleanField(term115304, term115304.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term115304, term115304.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term115304, term115304.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term115304, term115304.getClass(), "usePerPvTouchSliderSe", true);
        setField(term115304, term115304.getClass(), "commonModule", "-999,-999,-999");
        setField(term115304, term115304.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term115428, term115428.getClass(), "year", 2026);
        setShortField(term115428, term115428.getClass(), "month", (short) 6);
        setShortField(term115428, term115428.getClass(), "day", (short) 29);
        setField(term115427, term115427.getClass(), "date", term115428);
        setByteField(term115432, term115432.getClass(), "hour", (byte) 4);
        setByteField(term115432, term115432.getClass(), "minute", (byte) 27);
        setByteField(term115432, term115432.getClass(), "second", (byte) 27);
        setIntField(term115432, term115432.getClass(), "nano", 917240000);
        setField(term115427, term115427.getClass(), "time", term115432);
        setField(term115304, term115304.getClass(), "commonModuleSetTime", term115427);
        setField(term115304, term115304.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term115304, term115304.getClass(), "commonSkin", -1);
        setIntField(term115304, term115304.getClass(), "headphoneVolume", 100);
        setBooleanField(term115304, term115304.getClass(), "buttonSeOn", true);
        setIntField(term115304, term115304.getClass(), "buttonSeVolume", 100);
        setIntField(term115304, term115304.getClass(), "sliderSeVolume", 100);
        setIntField(term115304, term115304.getClass(), "buttonSe", -1);
        setIntField(term115304, term115304.getClass(), "chainSlideSe", -1);
        setIntField(term115304, term115304.getClass(), "slideSe", -1);
        setIntField(term115304, term115304.getClass(), "sliderTouchSe", -1);
        setField(term115304, term115304.getClass(), "sortMode", enum250);
        setIntField(term115304, term115304.getClass(), "nextPvId", -1);
        setField(term115304, term115304.getClass(), "nextDifficulty", enum251);
        setField(term115304, term115304.getClass(), "nextEdition", enum252);
        setBooleanField(term115304, term115304.getClass(), "showInterimRanking", true);
        setBooleanField(term115304, term115304.getClass(), "showClearStatus", true);
        setBooleanField(term115304, term115304.getClass(), "showGreatBorder", true);
        setBooleanField(term115304, term115304.getClass(), "showExcellentBorder", true);
        setBooleanField(term115304, term115304.getClass(), "showRivalBorder", true);
        setBooleanField(term115304, term115304.getClass(), "showRgoSetting", true);
        setBooleanField(term115304, term115304.getClass(), "contestNowPlayingEnable", true);
        setIntField(term115304, term115304.getClass(), "contestNowPlayingId", -1);
        setIntField(term115304, term115304.getClass(), "contestNowPlayingValue", -1);
        setField(term115304, term115304.getClass(), "contestNowPlayingResultRank", enum253);
        setField(term115304, term115304.getClass(), "contestNowPlayingSpecifier", "");
        setField(term115304, term115304.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term115304, term115304.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term115304, term115304.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term115304, term115304.getClass(), "rivalPdId", -1);
        setField(term115302, term115302.getClass(), "pdId", term115304);
        setIntField(term115302, term115302.getClass(), "pvId", -706253892);
        setField(term115302, term115302.getClass(), "difficulty", enum254);
        setField(term115302, term115302.getClass(), "edition", enum255);
        setIntField(term115302, term115302.getClass(), "scriptVer", -1341439819);
        setIntField(term115302, term115302.getClass(), "score", -728760750);
        setField(term115302, term115302.getClass(), "challengeKind", enum256);
        setIntField(term115302, term115302.getClass(), "challengeResult", -1617383807);
        setField(term115302, term115302.getClass(), "clearResult", enum257);
        setIntField(term115302, term115302.getClass(), "vp", -1244386281);
        setIntField(term115302, term115302.getClass(), "coolCount", -885788574);
        setIntField(term115302, term115302.getClass(), "coolPercent", -865722613);
        setIntField(term115302, term115302.getClass(), "fineCount", -1551355284);
        setIntField(term115302, term115302.getClass(), "finePercent", -1381970335);
        setIntField(term115302, term115302.getClass(), "safeCount", 1213549815);
        setIntField(term115302, term115302.getClass(), "safePercent", -1518419301);
        setIntField(term115302, term115302.getClass(), "sadCount", 674879025);
        setIntField(term115302, term115302.getClass(), "sadPercent", -1538936030);
        setIntField(term115302, term115302.getClass(), "wrongCount", -752870423);
        setIntField(term115302, term115302.getClass(), "wrongPercent", -1698809299);
        setIntField(term115302, term115302.getClass(), "maxCombo", 401512128);
        setIntField(term115302, term115302.getClass(), "chanceTime", -2069930777);
        setIntField(term115302, term115302.getClass(), "holdScore", 1543696412);
        setIntField(term115302, term115302.getClass(), "attainPoint", -1385748168);
        setIntField(term115302, term115302.getClass(), "skinId", -270592367);
        setIntField(term115302, term115302.getClass(), "buttonSe", 178847646);
        setIntField(term115302, term115302.getClass(), "buttonSeVol", 273590437);
        setIntField(term115302, term115302.getClass(), "sliderSe", -348612876);
        setIntField(term115302, term115302.getClass(), "ChainSlideSe", 1302807565);
        setIntField(term115302, term115302.getClass(), "SliderTouchSe", -838848221);
        setField(term115302, term115302.getClass(), "modules", "UiUYnPrcCi");
        setIntField(term115302, term115302.getClass(), "stageCompletion", 1163761623);
        setIntField(term115302, term115302.getClass(), "slideScore", 718742281);
        setIntField(term115302, term115302.getClass(), "isVocalChange", 1532723756);
        setField(term115302, term115302.getClass(), "customizeItems", "UoYtihxVaS");
        setField(term115302, term115302.getClass(), "rhythmGameOptions", "JDswTTCZHV");
        setIntField(term115302, term115302.getClass(), "screenShotCount", -1);
        setIntField(term116025, term116025.getClass(), "year", 2020);
        setShortField(term116025, term116025.getClass(), "month", (short) 7);
        setShortField(term116025, term116025.getClass(), "day", (short) 24);
        setField(term116024, term116024.getClass(), "date", term116025);
        setByteField(term116029, term116029.getClass(), "hour", (byte) 0);
        setByteField(term116029, term116029.getClass(), "minute", (byte) 59);
        setByteField(term116029, term116029.getClass(), "second", (byte) 56);
        setIntField(term116029, term116029.getClass(), "nano", 320219201);
        setField(term116024, term116024.getClass(), "time", term116029);
        setField(term115302, term115302.getClass(), "dateTime", term116024);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSafePercent", argTypes, term115302, args);
    }

};


