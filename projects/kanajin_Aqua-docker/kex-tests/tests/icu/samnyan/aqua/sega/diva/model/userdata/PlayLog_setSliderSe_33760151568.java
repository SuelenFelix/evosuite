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

public class PlayLog_setSliderSe_33760151568 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term299135;
     Object term299852;

    public PlayLog_setSliderSe_33760151568() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term299861 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term299860 = ((Class) term299861).getDeclaredField((String) "MISS");
        ((Field) term299860).setAccessible(true);
        Object enum683 = ((Field) term299860).get((Object) null);
        Class<? extends Object> term300238 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term300237 = ((Class) term300238).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term300237).setAccessible(true);
        Object enum684 = ((Field) term300237).get((Object) null);
        Class<? extends Object> term300521 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term300520 = ((Class) term300521).getDeclaredField((String) "NORMAL");
        ((Field) term300520).setAccessible(true);
        Object enum685 = ((Field) term300520).get((Object) null);
        Class<? extends Object> term300796 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term300795 = ((Class) term300796).getDeclaredField((String) "ORIGINAL");
        ((Field) term300795).setAccessible(true);
        Object enum686 = ((Field) term300795).get((Object) null);
        Class<? extends Object> term301062 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term301061 = ((Class) term301062).getDeclaredField((String) "NONE");
        ((Field) term301061).setAccessible(true);
        Object enum687 = ((Field) term301061).get((Object) null);
        Class<? extends Object> term301703 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term301702 = ((Class) term301703).getDeclaredField((String) "EASY");
        ((Field) term301702).setAccessible(true);
        Object enum688 = ((Field) term301702).get((Object) null);
        Class<? extends Object> term301972 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ChallengeKind");
        Field term301971 = ((Class) term301972).getDeclaredField((String) "PERFECT");
        ((Field) term301971).setAccessible(true);
        Object enum689 = ((Field) term301971).get((Object) null);
        Class<? extends Object> term302265 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ClearResult");
        Field term302264 = ((Class) term302265).getDeclaredField((String) "EXCELLENT");
        ((Field) term302264).setAccessible(true);
        Object enum690 = ((Field) term302264).get((Object) null);
        term299135 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog"));
        Object term299137 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term299260 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term299261 = newInstance(Class.forName("java.time.LocalDate"));
        Object term299265 = newInstance(Class.forName("java.time.LocalTime"));
        Object term299842 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term299843 = newInstance(Class.forName("java.time.LocalDate"));
        Object term299847 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term299135, term299135.getClass(), "id", 4795660804170399986L);
        setLongField(term299137, term299137.getClass(), "id", -4030863184426321096L);
        setIntField(term299137, term299137.getClass(), "pdId", 1669406334);
        setField(term299137, term299137.getClass(), "playerName", "xxx");
        setIntField(term299137, term299137.getClass(), "vocaloidPoints", 300);
        setIntField(term299137, term299137.getClass(), "level", 1);
        setIntField(term299137, term299137.getClass(), "levelExp", -780862464);
        setField(term299137, term299137.getClass(), "levelTitle", "xxx");
        setIntField(term299137, term299137.getClass(), "plateId", -1);
        setIntField(term299137, term299137.getClass(), "plateEffectId", -1);
        setField(term299137, term299137.getClass(), "passwordStatus", enum683);
        setField(term299137, term299137.getClass(), "password", "**********");
        setBooleanField(term299137, term299137.getClass(), "preferPerPvModule", true);
        setBooleanField(term299137, term299137.getClass(), "preferCommonModule", true);
        setBooleanField(term299137, term299137.getClass(), "usePerPvSkin", false);
        setBooleanField(term299137, term299137.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term299137, term299137.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term299137, term299137.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term299137, term299137.getClass(), "usePerPvTouchSliderSe", true);
        setField(term299137, term299137.getClass(), "commonModule", "-999,-999,-999");
        setField(term299137, term299137.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term299261, term299261.getClass(), "year", 2026);
        setShortField(term299261, term299261.getClass(), "month", (short) 8);
        setShortField(term299261, term299261.getClass(), "day", (short) 12);
        setField(term299260, term299260.getClass(), "date", term299261);
        setByteField(term299265, term299265.getClass(), "hour", (byte) 2);
        setByteField(term299265, term299265.getClass(), "minute", (byte) 2);
        setByteField(term299265, term299265.getClass(), "second", (byte) 57);
        setIntField(term299265, term299265.getClass(), "nano", 277238000);
        setField(term299260, term299260.getClass(), "time", term299265);
        setField(term299137, term299137.getClass(), "commonModuleSetTime", term299260);
        setField(term299137, term299137.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term299137, term299137.getClass(), "commonSkin", -1);
        setIntField(term299137, term299137.getClass(), "headphoneVolume", 100);
        setBooleanField(term299137, term299137.getClass(), "buttonSeOn", true);
        setIntField(term299137, term299137.getClass(), "buttonSeVolume", 100);
        setIntField(term299137, term299137.getClass(), "sliderSeVolume", 100);
        setIntField(term299137, term299137.getClass(), "buttonSe", -1);
        setIntField(term299137, term299137.getClass(), "chainSlideSe", -1);
        setIntField(term299137, term299137.getClass(), "slideSe", -1);
        setIntField(term299137, term299137.getClass(), "sliderTouchSe", -1);
        setField(term299137, term299137.getClass(), "sortMode", enum684);
        setIntField(term299137, term299137.getClass(), "nextPvId", -1);
        setField(term299137, term299137.getClass(), "nextDifficulty", enum685);
        setField(term299137, term299137.getClass(), "nextEdition", enum686);
        setBooleanField(term299137, term299137.getClass(), "showInterimRanking", true);
        setBooleanField(term299137, term299137.getClass(), "showClearStatus", true);
        setBooleanField(term299137, term299137.getClass(), "showGreatBorder", true);
        setBooleanField(term299137, term299137.getClass(), "showExcellentBorder", true);
        setBooleanField(term299137, term299137.getClass(), "showRivalBorder", true);
        setBooleanField(term299137, term299137.getClass(), "showRgoSetting", true);
        setBooleanField(term299137, term299137.getClass(), "contestNowPlayingEnable", false);
        setIntField(term299137, term299137.getClass(), "contestNowPlayingId", -1);
        setIntField(term299137, term299137.getClass(), "contestNowPlayingValue", -1);
        setField(term299137, term299137.getClass(), "contestNowPlayingResultRank", enum687);
        setField(term299137, term299137.getClass(), "contestNowPlayingSpecifier", "");
        setField(term299137, term299137.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term299137, term299137.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term299137, term299137.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term299137, term299137.getClass(), "rivalPdId", -1);
        setField(term299135, term299135.getClass(), "pdId", term299137);
        setIntField(term299135, term299135.getClass(), "pvId", 2014099129);
        setField(term299135, term299135.getClass(), "difficulty", enum688);
        setField(term299135, term299135.getClass(), "edition", enum686);
        setIntField(term299135, term299135.getClass(), "scriptVer", -1024382698);
        setIntField(term299135, term299135.getClass(), "score", -168406824);
        setField(term299135, term299135.getClass(), "challengeKind", enum689);
        setIntField(term299135, term299135.getClass(), "challengeResult", 2063577636);
        setField(term299135, term299135.getClass(), "clearResult", enum690);
        setIntField(term299135, term299135.getClass(), "vp", 1680632578);
        setIntField(term299135, term299135.getClass(), "coolCount", 511399994);
        setIntField(term299135, term299135.getClass(), "coolPercent", 2094923086);
        setIntField(term299135, term299135.getClass(), "fineCount", 1532355365);
        setIntField(term299135, term299135.getClass(), "finePercent", -156316508);
        setIntField(term299135, term299135.getClass(), "safeCount", -1304449497);
        setIntField(term299135, term299135.getClass(), "safePercent", -80320412);
        setIntField(term299135, term299135.getClass(), "sadCount", -356797136);
        setIntField(term299135, term299135.getClass(), "sadPercent", -2035641970);
        setIntField(term299135, term299135.getClass(), "wrongCount", 1813581230);
        setIntField(term299135, term299135.getClass(), "wrongPercent", 844569461);
        setIntField(term299135, term299135.getClass(), "maxCombo", -15085966);
        setIntField(term299135, term299135.getClass(), "chanceTime", -1929631412);
        setIntField(term299135, term299135.getClass(), "holdScore", 1014160441);
        setIntField(term299135, term299135.getClass(), "attainPoint", 975753484);
        setIntField(term299135, term299135.getClass(), "skinId", -1886360357);
        setIntField(term299135, term299135.getClass(), "buttonSe", -235867268);
        setIntField(term299135, term299135.getClass(), "buttonSeVol", -972330704);
        setIntField(term299135, term299135.getClass(), "sliderSe", 134173297);
        setIntField(term299135, term299135.getClass(), "ChainSlideSe", 2025698852);
        setIntField(term299135, term299135.getClass(), "SliderTouchSe", 113961338);
        setField(term299135, term299135.getClass(), "modules", "BjugTaMcxJ");
        setIntField(term299135, term299135.getClass(), "stageCompletion", 1869277085);
        setIntField(term299135, term299135.getClass(), "slideScore", 498801287);
        setIntField(term299135, term299135.getClass(), "isVocalChange", 969573395);
        setField(term299135, term299135.getClass(), "customizeItems", "vGiuZVPJNH");
        setField(term299135, term299135.getClass(), "rhythmGameOptions", "tlzpzIjMib");
        setIntField(term299135, term299135.getClass(), "screenShotCount", -1);
        setIntField(term299843, term299843.getClass(), "year", 2022);
        setShortField(term299843, term299843.getClass(), "month", (short) 4);
        setShortField(term299843, term299843.getClass(), "day", (short) 15);
        setField(term299842, term299842.getClass(), "date", term299843);
        setByteField(term299847, term299847.getClass(), "hour", (byte) 20);
        setByteField(term299847, term299847.getClass(), "minute", (byte) 58);
        setByteField(term299847, term299847.getClass(), "second", (byte) 46);
        setIntField(term299847, term299847.getClass(), "nano", 435562727);
        setField(term299842, term299842.getClass(), "time", term299847);
        setField(term299135, term299135.getClass(), "dateTime", term299842);
        term299852 = new Integer(-899109027);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term299852;
        callMethod(klass, "setSliderSe", argTypes, term299135, args);
    }

};


