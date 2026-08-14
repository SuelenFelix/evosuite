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

public class PlayLog_setStageCompletion_132005947072 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term312931;
     Object term313651;

    public PlayLog_setStageCompletion_132005947072() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term313660 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term313659 = ((Class) term313660).getDeclaredField((String) "MISS");
        ((Field) term313659).setAccessible(true);
        Object enum715 = ((Field) term313659).get((Object) null);
        Class<? extends Object> term314037 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term314036 = ((Class) term314037).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term314036).setAccessible(true);
        Object enum716 = ((Field) term314036).get((Object) null);
        Class<? extends Object> term314320 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term314319 = ((Class) term314320).getDeclaredField((String) "NORMAL");
        ((Field) term314319).setAccessible(true);
        Object enum717 = ((Field) term314319).get((Object) null);
        Class<? extends Object> term314595 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term314594 = ((Class) term314595).getDeclaredField((String) "ORIGINAL");
        ((Field) term314594).setAccessible(true);
        Object enum718 = ((Field) term314594).get((Object) null);
        Class<? extends Object> term314861 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term314860 = ((Class) term314861).getDeclaredField((String) "NONE");
        ((Field) term314860).setAccessible(true);
        Object enum719 = ((Field) term314860).get((Object) null);
        Class<? extends Object> term315502 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term315501 = ((Class) term315502).getDeclaredField((String) "UNDEFINED");
        ((Field) term315501).setAccessible(true);
        Object enum720 = ((Field) term315501).get((Object) null);
        Class<? extends Object> term315786 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ChallengeKind");
        Field term315785 = ((Class) term315786).getDeclaredField((String) "UNDEFINED");
        ((Field) term315785).setAccessible(true);
        Object enum721 = ((Field) term315785).get((Object) null);
        Class<? extends Object> term316085 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ClearResult");
        Field term316084 = ((Class) term316085).getDeclaredField((String) "CHEAP");
        ((Field) term316084).setAccessible(true);
        Object enum722 = ((Field) term316084).get((Object) null);
        term312931 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog"));
        Object term312933 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term313056 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term313057 = newInstance(Class.forName("java.time.LocalDate"));
        Object term313061 = newInstance(Class.forName("java.time.LocalTime"));
        Object term313641 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term313642 = newInstance(Class.forName("java.time.LocalDate"));
        Object term313646 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term312931, term312931.getClass(), "id", -1505191021111100819L);
        setLongField(term312933, term312933.getClass(), "id", -1000830646340880796L);
        setIntField(term312933, term312933.getClass(), "pdId", 1505717672);
        setField(term312933, term312933.getClass(), "playerName", "xxx");
        setIntField(term312933, term312933.getClass(), "vocaloidPoints", 300);
        setIntField(term312933, term312933.getClass(), "level", 1);
        setIntField(term312933, term312933.getClass(), "levelExp", -1683274691);
        setField(term312933, term312933.getClass(), "levelTitle", "xxx");
        setIntField(term312933, term312933.getClass(), "plateId", -1);
        setIntField(term312933, term312933.getClass(), "plateEffectId", -1);
        setField(term312933, term312933.getClass(), "passwordStatus", enum715);
        setField(term312933, term312933.getClass(), "password", "**********");
        setBooleanField(term312933, term312933.getClass(), "preferPerPvModule", true);
        setBooleanField(term312933, term312933.getClass(), "preferCommonModule", false);
        setBooleanField(term312933, term312933.getClass(), "usePerPvSkin", true);
        setBooleanField(term312933, term312933.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term312933, term312933.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term312933, term312933.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term312933, term312933.getClass(), "usePerPvTouchSliderSe", true);
        setField(term312933, term312933.getClass(), "commonModule", "-999,-999,-999");
        setField(term312933, term312933.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term313057, term313057.getClass(), "year", 2026);
        setShortField(term313057, term313057.getClass(), "month", (short) 8);
        setShortField(term313057, term313057.getClass(), "day", (short) 12);
        setField(term313056, term313056.getClass(), "date", term313057);
        setByteField(term313061, term313061.getClass(), "hour", (byte) 2);
        setByteField(term313061, term313061.getClass(), "minute", (byte) 2);
        setByteField(term313061, term313061.getClass(), "second", (byte) 58);
        setIntField(term313061, term313061.getClass(), "nano", 265003000);
        setField(term313056, term313056.getClass(), "time", term313061);
        setField(term312933, term312933.getClass(), "commonModuleSetTime", term313056);
        setField(term312933, term312933.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term312933, term312933.getClass(), "commonSkin", -1);
        setIntField(term312933, term312933.getClass(), "headphoneVolume", 100);
        setBooleanField(term312933, term312933.getClass(), "buttonSeOn", true);
        setIntField(term312933, term312933.getClass(), "buttonSeVolume", 100);
        setIntField(term312933, term312933.getClass(), "sliderSeVolume", 100);
        setIntField(term312933, term312933.getClass(), "buttonSe", -1);
        setIntField(term312933, term312933.getClass(), "chainSlideSe", -1);
        setIntField(term312933, term312933.getClass(), "slideSe", -1);
        setIntField(term312933, term312933.getClass(), "sliderTouchSe", -1);
        setField(term312933, term312933.getClass(), "sortMode", enum716);
        setIntField(term312933, term312933.getClass(), "nextPvId", -1);
        setField(term312933, term312933.getClass(), "nextDifficulty", enum717);
        setField(term312933, term312933.getClass(), "nextEdition", enum718);
        setBooleanField(term312933, term312933.getClass(), "showInterimRanking", true);
        setBooleanField(term312933, term312933.getClass(), "showClearStatus", true);
        setBooleanField(term312933, term312933.getClass(), "showGreatBorder", true);
        setBooleanField(term312933, term312933.getClass(), "showExcellentBorder", true);
        setBooleanField(term312933, term312933.getClass(), "showRivalBorder", true);
        setBooleanField(term312933, term312933.getClass(), "showRgoSetting", true);
        setBooleanField(term312933, term312933.getClass(), "contestNowPlayingEnable", true);
        setIntField(term312933, term312933.getClass(), "contestNowPlayingId", -1);
        setIntField(term312933, term312933.getClass(), "contestNowPlayingValue", -1);
        setField(term312933, term312933.getClass(), "contestNowPlayingResultRank", enum719);
        setField(term312933, term312933.getClass(), "contestNowPlayingSpecifier", "");
        setField(term312933, term312933.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term312933, term312933.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term312933, term312933.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term312933, term312933.getClass(), "rivalPdId", -1);
        setField(term312931, term312931.getClass(), "pdId", term312933);
        setIntField(term312931, term312931.getClass(), "pvId", -935900044);
        setField(term312931, term312931.getClass(), "difficulty", enum720);
        setField(term312931, term312931.getClass(), "edition", enum718);
        setIntField(term312931, term312931.getClass(), "scriptVer", 1747876558);
        setIntField(term312931, term312931.getClass(), "score", 833477776);
        setField(term312931, term312931.getClass(), "challengeKind", enum721);
        setIntField(term312931, term312931.getClass(), "challengeResult", 2043960707);
        setField(term312931, term312931.getClass(), "clearResult", enum722);
        setIntField(term312931, term312931.getClass(), "vp", 272179554);
        setIntField(term312931, term312931.getClass(), "coolCount", 1717711536);
        setIntField(term312931, term312931.getClass(), "coolPercent", -606339607);
        setIntField(term312931, term312931.getClass(), "fineCount", 800440712);
        setIntField(term312931, term312931.getClass(), "finePercent", -1976407622);
        setIntField(term312931, term312931.getClass(), "safeCount", -552996061);
        setIntField(term312931, term312931.getClass(), "safePercent", -153013117);
        setIntField(term312931, term312931.getClass(), "sadCount", 712181359);
        setIntField(term312931, term312931.getClass(), "sadPercent", -1943255435);
        setIntField(term312931, term312931.getClass(), "wrongCount", 868436312);
        setIntField(term312931, term312931.getClass(), "wrongPercent", 1737963071);
        setIntField(term312931, term312931.getClass(), "maxCombo", 6456997);
        setIntField(term312931, term312931.getClass(), "chanceTime", -797269627);
        setIntField(term312931, term312931.getClass(), "holdScore", -224331928);
        setIntField(term312931, term312931.getClass(), "attainPoint", -587857163);
        setIntField(term312931, term312931.getClass(), "skinId", -2018093075);
        setIntField(term312931, term312931.getClass(), "buttonSe", 135879009);
        setIntField(term312931, term312931.getClass(), "buttonSeVol", 1923027847);
        setIntField(term312931, term312931.getClass(), "sliderSe", -1652693609);
        setIntField(term312931, term312931.getClass(), "ChainSlideSe", -824893512);
        setIntField(term312931, term312931.getClass(), "SliderTouchSe", -55435071);
        setField(term312931, term312931.getClass(), "modules", "GrqozDKFOk");
        setIntField(term312931, term312931.getClass(), "stageCompletion", -673356166);
        setIntField(term312931, term312931.getClass(), "slideScore", 1876812694);
        setIntField(term312931, term312931.getClass(), "isVocalChange", 461068473);
        setField(term312931, term312931.getClass(), "customizeItems", "CFyoseFGLF");
        setField(term312931, term312931.getClass(), "rhythmGameOptions", "SFqCrhEWLm");
        setIntField(term312931, term312931.getClass(), "screenShotCount", -1);
        setIntField(term313642, term313642.getClass(), "year", 2010);
        setShortField(term313642, term313642.getClass(), "month", (short) 2);
        setShortField(term313642, term313642.getClass(), "day", (short) 24);
        setField(term313641, term313641.getClass(), "date", term313642);
        setByteField(term313646, term313646.getClass(), "hour", (byte) 17);
        setByteField(term313646, term313646.getClass(), "minute", (byte) 58);
        setByteField(term313646, term313646.getClass(), "second", (byte) 56);
        setIntField(term313646, term313646.getClass(), "nano", 291725532);
        setField(term313641, term313641.getClass(), "time", term313646);
        setField(term312931, term312931.getClass(), "dateTime", term313641);
        term313651 = new Integer(-1833298266);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term313651;
        callMethod(klass, "setStageCompletion", argTypes, term312931, args);
    }

};


