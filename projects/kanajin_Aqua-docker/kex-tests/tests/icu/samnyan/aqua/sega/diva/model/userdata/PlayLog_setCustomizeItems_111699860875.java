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

public class PlayLog_setCustomizeItems_111699860875 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term323005;

    public PlayLog_setCustomizeItems_111699860875() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term323747 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term323746 = ((Class) term323747).getDeclaredField((String) "MISS");
        ((Field) term323746).setAccessible(true);
        Object enum738 = ((Field) term323746).get((Object) null);
        Class<? extends Object> term324124 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term324123 = ((Class) term324124).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term324123).setAccessible(true);
        Object enum739 = ((Field) term324123).get((Object) null);
        Class<? extends Object> term324407 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term324406 = ((Class) term324407).getDeclaredField((String) "NORMAL");
        ((Field) term324406).setAccessible(true);
        Object enum740 = ((Field) term324406).get((Object) null);
        Class<? extends Object> term324682 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term324681 = ((Class) term324682).getDeclaredField((String) "ORIGINAL");
        ((Field) term324681).setAccessible(true);
        Object enum741 = ((Field) term324681).get((Object) null);
        Class<? extends Object> term324948 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term324947 = ((Class) term324948).getDeclaredField((String) "NONE");
        ((Field) term324947).setAccessible(true);
        Object enum742 = ((Field) term324947).get((Object) null);
        Class<? extends Object> term325589 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term325588 = ((Class) term325589).getDeclaredField((String) "EASY");
        ((Field) term325588).setAccessible(true);
        Object enum743 = ((Field) term325588).get((Object) null);
        Class<? extends Object> term325858 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term325857 = ((Class) term325858).getDeclaredField((String) "EXTRA");
        ((Field) term325857).setAccessible(true);
        Object enum744 = ((Field) term325857).get((Object) null);
        Class<? extends Object> term326115 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ChallengeKind");
        Field term326114 = ((Class) term326115).getDeclaredField((String) "GREAT");
        ((Field) term326114).setAccessible(true);
        Object enum745 = ((Field) term326114).get((Object) null);
        Class<? extends Object> term326402 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ClearResult");
        Field term326401 = ((Class) term326402).getDeclaredField((String) "PERFECT");
        ((Field) term326401).setAccessible(true);
        Object enum746 = ((Field) term326401).get((Object) null);
        term323005 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog"));
        Object term323007 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term323130 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term323131 = newInstance(Class.forName("java.time.LocalDate"));
        Object term323135 = newInstance(Class.forName("java.time.LocalTime"));
        Object term323718 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term323719 = newInstance(Class.forName("java.time.LocalDate"));
        Object term323723 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term323005, term323005.getClass(), "id", 8863790908271299748L);
        setLongField(term323007, term323007.getClass(), "id", 9205327385733285058L);
        setIntField(term323007, term323007.getClass(), "pdId", -1284079635);
        setField(term323007, term323007.getClass(), "playerName", "xxx");
        setIntField(term323007, term323007.getClass(), "vocaloidPoints", 300);
        setIntField(term323007, term323007.getClass(), "level", 1);
        setIntField(term323007, term323007.getClass(), "levelExp", -2130090775);
        setField(term323007, term323007.getClass(), "levelTitle", "xxx");
        setIntField(term323007, term323007.getClass(), "plateId", -1);
        setIntField(term323007, term323007.getClass(), "plateEffectId", -1);
        setField(term323007, term323007.getClass(), "passwordStatus", enum738);
        setField(term323007, term323007.getClass(), "password", "**********");
        setBooleanField(term323007, term323007.getClass(), "preferPerPvModule", true);
        setBooleanField(term323007, term323007.getClass(), "preferCommonModule", true);
        setBooleanField(term323007, term323007.getClass(), "usePerPvSkin", true);
        setBooleanField(term323007, term323007.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term323007, term323007.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term323007, term323007.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term323007, term323007.getClass(), "usePerPvTouchSliderSe", true);
        setField(term323007, term323007.getClass(), "commonModule", "-999,-999,-999");
        setField(term323007, term323007.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term323131, term323131.getClass(), "year", 2026);
        setShortField(term323131, term323131.getClass(), "month", (short) 8);
        setShortField(term323131, term323131.getClass(), "day", (short) 12);
        setField(term323130, term323130.getClass(), "date", term323131);
        setByteField(term323135, term323135.getClass(), "hour", (byte) 2);
        setByteField(term323135, term323135.getClass(), "minute", (byte) 2);
        setByteField(term323135, term323135.getClass(), "second", (byte) 59);
        setIntField(term323135, term323135.getClass(), "nano", 4764000);
        setField(term323130, term323130.getClass(), "time", term323135);
        setField(term323007, term323007.getClass(), "commonModuleSetTime", term323130);
        setField(term323007, term323007.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term323007, term323007.getClass(), "commonSkin", -1);
        setIntField(term323007, term323007.getClass(), "headphoneVolume", 100);
        setBooleanField(term323007, term323007.getClass(), "buttonSeOn", true);
        setIntField(term323007, term323007.getClass(), "buttonSeVolume", 100);
        setIntField(term323007, term323007.getClass(), "sliderSeVolume", 100);
        setIntField(term323007, term323007.getClass(), "buttonSe", -1);
        setIntField(term323007, term323007.getClass(), "chainSlideSe", -1);
        setIntField(term323007, term323007.getClass(), "slideSe", -1);
        setIntField(term323007, term323007.getClass(), "sliderTouchSe", -1);
        setField(term323007, term323007.getClass(), "sortMode", enum739);
        setIntField(term323007, term323007.getClass(), "nextPvId", -1);
        setField(term323007, term323007.getClass(), "nextDifficulty", enum740);
        setField(term323007, term323007.getClass(), "nextEdition", enum741);
        setBooleanField(term323007, term323007.getClass(), "showInterimRanking", true);
        setBooleanField(term323007, term323007.getClass(), "showClearStatus", true);
        setBooleanField(term323007, term323007.getClass(), "showGreatBorder", true);
        setBooleanField(term323007, term323007.getClass(), "showExcellentBorder", true);
        setBooleanField(term323007, term323007.getClass(), "showRivalBorder", true);
        setBooleanField(term323007, term323007.getClass(), "showRgoSetting", true);
        setBooleanField(term323007, term323007.getClass(), "contestNowPlayingEnable", false);
        setIntField(term323007, term323007.getClass(), "contestNowPlayingId", -1);
        setIntField(term323007, term323007.getClass(), "contestNowPlayingValue", -1);
        setField(term323007, term323007.getClass(), "contestNowPlayingResultRank", enum742);
        setField(term323007, term323007.getClass(), "contestNowPlayingSpecifier", "");
        setField(term323007, term323007.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term323007, term323007.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term323007, term323007.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term323007, term323007.getClass(), "rivalPdId", -1);
        setField(term323005, term323005.getClass(), "pdId", term323007);
        setIntField(term323005, term323005.getClass(), "pvId", -1455026066);
        setField(term323005, term323005.getClass(), "difficulty", enum743);
        setField(term323005, term323005.getClass(), "edition", enum744);
        setIntField(term323005, term323005.getClass(), "scriptVer", -169160528);
        setIntField(term323005, term323005.getClass(), "score", 951748736);
        setField(term323005, term323005.getClass(), "challengeKind", enum745);
        setIntField(term323005, term323005.getClass(), "challengeResult", 787260842);
        setField(term323005, term323005.getClass(), "clearResult", enum746);
        setIntField(term323005, term323005.getClass(), "vp", -137516512);
        setIntField(term323005, term323005.getClass(), "coolCount", -585134115);
        setIntField(term323005, term323005.getClass(), "coolPercent", 1435872700);
        setIntField(term323005, term323005.getClass(), "fineCount", 1421496660);
        setIntField(term323005, term323005.getClass(), "finePercent", -1299897376);
        setIntField(term323005, term323005.getClass(), "safeCount", 1829266361);
        setIntField(term323005, term323005.getClass(), "safePercent", -1296335739);
        setIntField(term323005, term323005.getClass(), "sadCount", -520737857);
        setIntField(term323005, term323005.getClass(), "sadPercent", -2038325814);
        setIntField(term323005, term323005.getClass(), "wrongCount", -581928806);
        setIntField(term323005, term323005.getClass(), "wrongPercent", -1387086578);
        setIntField(term323005, term323005.getClass(), "maxCombo", -2098841130);
        setIntField(term323005, term323005.getClass(), "chanceTime", 65321166);
        setIntField(term323005, term323005.getClass(), "holdScore", -2114805689);
        setIntField(term323005, term323005.getClass(), "attainPoint", 400772784);
        setIntField(term323005, term323005.getClass(), "skinId", 46781158);
        setIntField(term323005, term323005.getClass(), "buttonSe", -1987966813);
        setIntField(term323005, term323005.getClass(), "buttonSeVol", 1778126559);
        setIntField(term323005, term323005.getClass(), "sliderSe", -1557828355);
        setIntField(term323005, term323005.getClass(), "ChainSlideSe", 546963992);
        setIntField(term323005, term323005.getClass(), "SliderTouchSe", 1377120507);
        setField(term323005, term323005.getClass(), "modules", "AHbZyFOmlo");
        setIntField(term323005, term323005.getClass(), "stageCompletion", -1581022727);
        setIntField(term323005, term323005.getClass(), "slideScore", -371740139);
        setIntField(term323005, term323005.getClass(), "isVocalChange", -508560324);
        setField(term323005, term323005.getClass(), "customizeItems", "TwfWVQGiIj");
        setField(term323005, term323005.getClass(), "rhythmGameOptions", "gUvcueTURF");
        setIntField(term323005, term323005.getClass(), "screenShotCount", -1);
        setIntField(term323719, term323719.getClass(), "year", 2020);
        setShortField(term323719, term323719.getClass(), "month", (short) 9);
        setShortField(term323719, term323719.getClass(), "day", (short) 3);
        setField(term323718, term323718.getClass(), "date", term323719);
        setByteField(term323723, term323723.getClass(), "hour", (byte) 10);
        setByteField(term323723, term323723.getClass(), "minute", (byte) 44);
        setByteField(term323723, term323723.getClass(), "second", (byte) 5);
        setIntField(term323723, term323723.getClass(), "nano", 572560230);
        setField(term323718, term323718.getClass(), "time", term323723);
        setField(term323005, term323005.getClass(), "dateTime", term323718);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "EwQBhZjCIT";
        callMethod(klass, "setCustomizeItems", argTypes, term323005, args);
    }

};


