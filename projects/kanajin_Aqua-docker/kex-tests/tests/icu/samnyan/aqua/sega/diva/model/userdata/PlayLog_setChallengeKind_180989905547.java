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

public class PlayLog_setChallengeKind_180989905547 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term224598;
     Object enum515;

    public PlayLog_setChallengeKind_180989905547() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term225334 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term225333 = ((Class) term225334).getDeclaredField((String) "MISS");
        ((Field) term225333).setAccessible(true);
        Object enum507 = ((Field) term225333).get((Object) null);
        Class<? extends Object> term225711 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term225710 = ((Class) term225711).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term225710).setAccessible(true);
        Object enum508 = ((Field) term225710).get((Object) null);
        Class<? extends Object> term225994 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term225993 = ((Class) term225994).getDeclaredField((String) "NORMAL");
        ((Field) term225993).setAccessible(true);
        Object enum509 = ((Field) term225993).get((Object) null);
        Class<? extends Object> term226269 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term226268 = ((Class) term226269).getDeclaredField((String) "ORIGINAL");
        ((Field) term226268).setAccessible(true);
        Object enum510 = ((Field) term226268).get((Object) null);
        Class<? extends Object> term226535 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term226534 = ((Class) term226535).getDeclaredField((String) "NONE");
        ((Field) term226534).setAccessible(true);
        Object enum511 = ((Field) term226534).get((Object) null);
        Class<? extends Object> term227176 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term227175 = ((Class) term227176).getDeclaredField((String) "EASY");
        ((Field) term227175).setAccessible(true);
        Object enum512 = ((Field) term227175).get((Object) null);
        Class<? extends Object> term227445 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ChallengeKind");
        Field term227444 = ((Class) term227445).getDeclaredField((String) "PERFECT");
        ((Field) term227444).setAccessible(true);
        Object enum513 = ((Field) term227444).get((Object) null);
        Class<? extends Object> term227738 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ClearResult");
        Field term227737 = ((Class) term227738).getDeclaredField((String) "PERFECT");
        ((Field) term227737).setAccessible(true);
        Object enum514 = ((Field) term227737).get((Object) null);
        term224598 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog"));
        Object term224600 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term224723 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term224724 = newInstance(Class.forName("java.time.LocalDate"));
        Object term224728 = newInstance(Class.forName("java.time.LocalTime"));
        Object term225303 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term225304 = newInstance(Class.forName("java.time.LocalDate"));
        Object term225308 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term224598, term224598.getClass(), "id", -7115418542247301000L);
        setLongField(term224600, term224600.getClass(), "id", 8034714140377562739L);
        setIntField(term224600, term224600.getClass(), "pdId", 1217804703);
        setField(term224600, term224600.getClass(), "playerName", "xxx");
        setIntField(term224600, term224600.getClass(), "vocaloidPoints", 300);
        setIntField(term224600, term224600.getClass(), "level", 1);
        setIntField(term224600, term224600.getClass(), "levelExp", -1981494102);
        setField(term224600, term224600.getClass(), "levelTitle", "xxx");
        setIntField(term224600, term224600.getClass(), "plateId", -1);
        setIntField(term224600, term224600.getClass(), "plateEffectId", -1);
        setField(term224600, term224600.getClass(), "passwordStatus", enum507);
        setField(term224600, term224600.getClass(), "password", "**********");
        setBooleanField(term224600, term224600.getClass(), "preferPerPvModule", true);
        setBooleanField(term224600, term224600.getClass(), "preferCommonModule", true);
        setBooleanField(term224600, term224600.getClass(), "usePerPvSkin", false);
        setBooleanField(term224600, term224600.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term224600, term224600.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term224600, term224600.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term224600, term224600.getClass(), "usePerPvTouchSliderSe", true);
        setField(term224600, term224600.getClass(), "commonModule", "-999,-999,-999");
        setField(term224600, term224600.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term224724, term224724.getClass(), "year", 2026);
        setShortField(term224724, term224724.getClass(), "month", (short) 8);
        setShortField(term224724, term224724.getClass(), "day", (short) 12);
        setField(term224723, term224723.getClass(), "date", term224724);
        setByteField(term224728, term224728.getClass(), "hour", (byte) 2);
        setByteField(term224728, term224728.getClass(), "minute", (byte) 2);
        setByteField(term224728, term224728.getClass(), "second", (byte) 52);
        setIntField(term224728, term224728.getClass(), "nano", 86239000);
        setField(term224723, term224723.getClass(), "time", term224728);
        setField(term224600, term224600.getClass(), "commonModuleSetTime", term224723);
        setField(term224600, term224600.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term224600, term224600.getClass(), "commonSkin", -1);
        setIntField(term224600, term224600.getClass(), "headphoneVolume", 100);
        setBooleanField(term224600, term224600.getClass(), "buttonSeOn", true);
        setIntField(term224600, term224600.getClass(), "buttonSeVolume", 100);
        setIntField(term224600, term224600.getClass(), "sliderSeVolume", 100);
        setIntField(term224600, term224600.getClass(), "buttonSe", -1);
        setIntField(term224600, term224600.getClass(), "chainSlideSe", -1);
        setIntField(term224600, term224600.getClass(), "slideSe", -1);
        setIntField(term224600, term224600.getClass(), "sliderTouchSe", -1);
        setField(term224600, term224600.getClass(), "sortMode", enum508);
        setIntField(term224600, term224600.getClass(), "nextPvId", -1);
        setField(term224600, term224600.getClass(), "nextDifficulty", enum509);
        setField(term224600, term224600.getClass(), "nextEdition", enum510);
        setBooleanField(term224600, term224600.getClass(), "showInterimRanking", true);
        setBooleanField(term224600, term224600.getClass(), "showClearStatus", true);
        setBooleanField(term224600, term224600.getClass(), "showGreatBorder", true);
        setBooleanField(term224600, term224600.getClass(), "showExcellentBorder", true);
        setBooleanField(term224600, term224600.getClass(), "showRivalBorder", true);
        setBooleanField(term224600, term224600.getClass(), "showRgoSetting", true);
        setBooleanField(term224600, term224600.getClass(), "contestNowPlayingEnable", false);
        setIntField(term224600, term224600.getClass(), "contestNowPlayingId", -1);
        setIntField(term224600, term224600.getClass(), "contestNowPlayingValue", -1);
        setField(term224600, term224600.getClass(), "contestNowPlayingResultRank", enum511);
        setField(term224600, term224600.getClass(), "contestNowPlayingSpecifier", "");
        setField(term224600, term224600.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term224600, term224600.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term224600, term224600.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term224600, term224600.getClass(), "rivalPdId", -1);
        setField(term224598, term224598.getClass(), "pdId", term224600);
        setIntField(term224598, term224598.getClass(), "pvId", -2064148945);
        setField(term224598, term224598.getClass(), "difficulty", enum512);
        setField(term224598, term224598.getClass(), "edition", enum510);
        setIntField(term224598, term224598.getClass(), "scriptVer", 494400151);
        setIntField(term224598, term224598.getClass(), "score", 1588058685);
        setField(term224598, term224598.getClass(), "challengeKind", enum513);
        setIntField(term224598, term224598.getClass(), "challengeResult", 1677707412);
        setField(term224598, term224598.getClass(), "clearResult", enum514);
        setIntField(term224598, term224598.getClass(), "vp", -297367861);
        setIntField(term224598, term224598.getClass(), "coolCount", -1133541490);
        setIntField(term224598, term224598.getClass(), "coolPercent", 942412391);
        setIntField(term224598, term224598.getClass(), "fineCount", 751596480);
        setIntField(term224598, term224598.getClass(), "finePercent", 1971485144);
        setIntField(term224598, term224598.getClass(), "safeCount", 2059603512);
        setIntField(term224598, term224598.getClass(), "safePercent", -1308902065);
        setIntField(term224598, term224598.getClass(), "sadCount", 605255795);
        setIntField(term224598, term224598.getClass(), "sadPercent", 1743438307);
        setIntField(term224598, term224598.getClass(), "wrongCount", -1122596893);
        setIntField(term224598, term224598.getClass(), "wrongPercent", -2147297900);
        setIntField(term224598, term224598.getClass(), "maxCombo", 539095138);
        setIntField(term224598, term224598.getClass(), "chanceTime", 1462297654);
        setIntField(term224598, term224598.getClass(), "holdScore", 1009915858);
        setIntField(term224598, term224598.getClass(), "attainPoint", 500127209);
        setIntField(term224598, term224598.getClass(), "skinId", -1482530168);
        setIntField(term224598, term224598.getClass(), "buttonSe", -432987116);
        setIntField(term224598, term224598.getClass(), "buttonSeVol", 1483499310);
        setIntField(term224598, term224598.getClass(), "sliderSe", -1516568587);
        setIntField(term224598, term224598.getClass(), "ChainSlideSe", 1537690170);
        setIntField(term224598, term224598.getClass(), "SliderTouchSe", 1133116994);
        setField(term224598, term224598.getClass(), "modules", "yVMkkQhvmN");
        setIntField(term224598, term224598.getClass(), "stageCompletion", -1195191239);
        setIntField(term224598, term224598.getClass(), "slideScore", -470798982);
        setIntField(term224598, term224598.getClass(), "isVocalChange", 1844345719);
        setField(term224598, term224598.getClass(), "customizeItems", "mvrkADEgpp");
        setField(term224598, term224598.getClass(), "rhythmGameOptions", "pXOkjyeIRb");
        setIntField(term224598, term224598.getClass(), "screenShotCount", -1);
        setIntField(term225304, term225304.getClass(), "year", 2011);
        setShortField(term225304, term225304.getClass(), "month", (short) 10);
        setShortField(term225304, term225304.getClass(), "day", (short) 25);
        setField(term225303, term225303.getClass(), "date", term225304);
        setByteField(term225308, term225308.getClass(), "hour", (byte) 10);
        setByteField(term225308, term225308.getClass(), "minute", (byte) 33);
        setByteField(term225308, term225308.getClass(), "second", (byte) 8);
        setIntField(term225308, term225308.getClass(), "nano", 268304014);
        setField(term225303, term225303.getClass(), "time", term225308);
        setField(term224598, term224598.getClass(), "dateTime", term225303);
        Class<? extends Object> term228051 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ChallengeKind");
        Field term228050 = ((Class) term228051).getDeclaredField((String) "EXCELLENT");
        ((Field) term228050).setAccessible(true);
        enum515 = ((Field) term228050).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.diva.model.common.ChallengeKind");
        Object[] args = new Object[1];
        args[0] = enum515;
        callMethod(klass, "setChallengeKind", argTypes, term224598, args);
    }

};


