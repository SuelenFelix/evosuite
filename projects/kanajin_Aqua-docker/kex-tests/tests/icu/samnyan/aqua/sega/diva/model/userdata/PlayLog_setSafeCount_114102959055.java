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

public class PlayLog_setSafeCount_114102959055 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term253591;
     Object term254310;

    public PlayLog_setSafeCount_114102959055() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term254319 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term254318 = ((Class) term254319).getDeclaredField((String) "MISS");
        ((Field) term254318).setAccessible(true);
        Object enum576 = ((Field) term254318).get((Object) null);
        Class<? extends Object> term254696 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term254695 = ((Class) term254696).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term254695).setAccessible(true);
        Object enum577 = ((Field) term254695).get((Object) null);
        Class<? extends Object> term254979 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term254978 = ((Class) term254979).getDeclaredField((String) "NORMAL");
        ((Field) term254978).setAccessible(true);
        Object enum578 = ((Field) term254978).get((Object) null);
        Class<? extends Object> term255254 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term255253 = ((Class) term255254).getDeclaredField((String) "ORIGINAL");
        ((Field) term255253).setAccessible(true);
        Object enum579 = ((Field) term255253).get((Object) null);
        Class<? extends Object> term255520 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term255519 = ((Class) term255520).getDeclaredField((String) "NONE");
        ((Field) term255519).setAccessible(true);
        Object enum580 = ((Field) term255519).get((Object) null);
        Class<? extends Object> term256161 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term256160 = ((Class) term256161).getDeclaredField((String) "HARD");
        ((Field) term256160).setAccessible(true);
        Object enum581 = ((Field) term256160).get((Object) null);
        Class<? extends Object> term256430 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ChallengeKind");
        Field term256429 = ((Class) term256430).getDeclaredField((String) "EXCELLENT");
        ((Field) term256429).setAccessible(true);
        Object enum582 = ((Field) term256429).get((Object) null);
        Class<? extends Object> term256729 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ClearResult");
        Field term256728 = ((Class) term256729).getDeclaredField((String) "EXCELLENT");
        ((Field) term256728).setAccessible(true);
        Object enum583 = ((Field) term256728).get((Object) null);
        term253591 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog"));
        Object term253593 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term253716 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term253717 = newInstance(Class.forName("java.time.LocalDate"));
        Object term253721 = newInstance(Class.forName("java.time.LocalTime"));
        Object term254300 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term254301 = newInstance(Class.forName("java.time.LocalDate"));
        Object term254305 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term253591, term253591.getClass(), "id", -8649738738252714180L);
        setLongField(term253593, term253593.getClass(), "id", -7278883608542636188L);
        setIntField(term253593, term253593.getClass(), "pdId", -455052015);
        setField(term253593, term253593.getClass(), "playerName", "xxx");
        setIntField(term253593, term253593.getClass(), "vocaloidPoints", 300);
        setIntField(term253593, term253593.getClass(), "level", 1);
        setIntField(term253593, term253593.getClass(), "levelExp", -1322797287);
        setField(term253593, term253593.getClass(), "levelTitle", "xxx");
        setIntField(term253593, term253593.getClass(), "plateId", -1);
        setIntField(term253593, term253593.getClass(), "plateEffectId", -1);
        setField(term253593, term253593.getClass(), "passwordStatus", enum576);
        setField(term253593, term253593.getClass(), "password", "**********");
        setBooleanField(term253593, term253593.getClass(), "preferPerPvModule", true);
        setBooleanField(term253593, term253593.getClass(), "preferCommonModule", false);
        setBooleanField(term253593, term253593.getClass(), "usePerPvSkin", false);
        setBooleanField(term253593, term253593.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term253593, term253593.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term253593, term253593.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term253593, term253593.getClass(), "usePerPvTouchSliderSe", false);
        setField(term253593, term253593.getClass(), "commonModule", "-999,-999,-999");
        setField(term253593, term253593.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term253717, term253717.getClass(), "year", 2026);
        setShortField(term253717, term253717.getClass(), "month", (short) 8);
        setShortField(term253717, term253717.getClass(), "day", (short) 12);
        setField(term253716, term253716.getClass(), "date", term253717);
        setByteField(term253721, term253721.getClass(), "hour", (byte) 2);
        setByteField(term253721, term253721.getClass(), "minute", (byte) 2);
        setByteField(term253721, term253721.getClass(), "second", (byte) 54);
        setIntField(term253721, term253721.getClass(), "nano", 63551000);
        setField(term253716, term253716.getClass(), "time", term253721);
        setField(term253593, term253593.getClass(), "commonModuleSetTime", term253716);
        setField(term253593, term253593.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term253593, term253593.getClass(), "commonSkin", -1);
        setIntField(term253593, term253593.getClass(), "headphoneVolume", 100);
        setBooleanField(term253593, term253593.getClass(), "buttonSeOn", true);
        setIntField(term253593, term253593.getClass(), "buttonSeVolume", 100);
        setIntField(term253593, term253593.getClass(), "sliderSeVolume", 100);
        setIntField(term253593, term253593.getClass(), "buttonSe", -1);
        setIntField(term253593, term253593.getClass(), "chainSlideSe", -1);
        setIntField(term253593, term253593.getClass(), "slideSe", -1);
        setIntField(term253593, term253593.getClass(), "sliderTouchSe", -1);
        setField(term253593, term253593.getClass(), "sortMode", enum577);
        setIntField(term253593, term253593.getClass(), "nextPvId", -1);
        setField(term253593, term253593.getClass(), "nextDifficulty", enum578);
        setField(term253593, term253593.getClass(), "nextEdition", enum579);
        setBooleanField(term253593, term253593.getClass(), "showInterimRanking", true);
        setBooleanField(term253593, term253593.getClass(), "showClearStatus", true);
        setBooleanField(term253593, term253593.getClass(), "showGreatBorder", true);
        setBooleanField(term253593, term253593.getClass(), "showExcellentBorder", true);
        setBooleanField(term253593, term253593.getClass(), "showRivalBorder", true);
        setBooleanField(term253593, term253593.getClass(), "showRgoSetting", true);
        setBooleanField(term253593, term253593.getClass(), "contestNowPlayingEnable", false);
        setIntField(term253593, term253593.getClass(), "contestNowPlayingId", -1);
        setIntField(term253593, term253593.getClass(), "contestNowPlayingValue", -1);
        setField(term253593, term253593.getClass(), "contestNowPlayingResultRank", enum580);
        setField(term253593, term253593.getClass(), "contestNowPlayingSpecifier", "");
        setField(term253593, term253593.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term253593, term253593.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term253593, term253593.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term253593, term253593.getClass(), "rivalPdId", -1);
        setField(term253591, term253591.getClass(), "pdId", term253593);
        setIntField(term253591, term253591.getClass(), "pvId", -615198242);
        setField(term253591, term253591.getClass(), "difficulty", enum581);
        setField(term253591, term253591.getClass(), "edition", enum579);
        setIntField(term253591, term253591.getClass(), "scriptVer", -491132382);
        setIntField(term253591, term253591.getClass(), "score", 918882916);
        setField(term253591, term253591.getClass(), "challengeKind", enum582);
        setIntField(term253591, term253591.getClass(), "challengeResult", 1544012770);
        setField(term253591, term253591.getClass(), "clearResult", enum583);
        setIntField(term253591, term253591.getClass(), "vp", 1922068039);
        setIntField(term253591, term253591.getClass(), "coolCount", -410564443);
        setIntField(term253591, term253591.getClass(), "coolPercent", 996017434);
        setIntField(term253591, term253591.getClass(), "fineCount", -983870300);
        setIntField(term253591, term253591.getClass(), "finePercent", 360715062);
        setIntField(term253591, term253591.getClass(), "safeCount", 1047409266);
        setIntField(term253591, term253591.getClass(), "safePercent", 1427248961);
        setIntField(term253591, term253591.getClass(), "sadCount", 1445291866);
        setIntField(term253591, term253591.getClass(), "sadPercent", -139927812);
        setIntField(term253591, term253591.getClass(), "wrongCount", -2065157320);
        setIntField(term253591, term253591.getClass(), "wrongPercent", 1782011477);
        setIntField(term253591, term253591.getClass(), "maxCombo", 2129957018);
        setIntField(term253591, term253591.getClass(), "chanceTime", 691663312);
        setIntField(term253591, term253591.getClass(), "holdScore", -1236696275);
        setIntField(term253591, term253591.getClass(), "attainPoint", 575249858);
        setIntField(term253591, term253591.getClass(), "skinId", -297957951);
        setIntField(term253591, term253591.getClass(), "buttonSe", -1816920588);
        setIntField(term253591, term253591.getClass(), "buttonSeVol", 1674165862);
        setIntField(term253591, term253591.getClass(), "sliderSe", 1875252647);
        setIntField(term253591, term253591.getClass(), "ChainSlideSe", -1298688401);
        setIntField(term253591, term253591.getClass(), "SliderTouchSe", 1907832341);
        setField(term253591, term253591.getClass(), "modules", "PapWxkhEWe");
        setIntField(term253591, term253591.getClass(), "stageCompletion", 932199784);
        setIntField(term253591, term253591.getClass(), "slideScore", 1953620444);
        setIntField(term253591, term253591.getClass(), "isVocalChange", -1111307978);
        setField(term253591, term253591.getClass(), "customizeItems", "smnHEqRFRx");
        setField(term253591, term253591.getClass(), "rhythmGameOptions", "XYtryyobou");
        setIntField(term253591, term253591.getClass(), "screenShotCount", -1);
        setIntField(term254301, term254301.getClass(), "year", 2023);
        setShortField(term254301, term254301.getClass(), "month", (short) 2);
        setShortField(term254301, term254301.getClass(), "day", (short) 16);
        setField(term254300, term254300.getClass(), "date", term254301);
        setByteField(term254305, term254305.getClass(), "hour", (byte) 3);
        setByteField(term254305, term254305.getClass(), "minute", (byte) 18);
        setByteField(term254305, term254305.getClass(), "second", (byte) 56);
        setIntField(term254305, term254305.getClass(), "nano", 733017887);
        setField(term254300, term254300.getClass(), "time", term254305);
        setField(term253591, term253591.getClass(), "dateTime", term254300);
        term254310 = new Integer(609697271);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term254310;
        callMethod(klass, "setSafeCount", argTypes, term253591, args);
    }

};


