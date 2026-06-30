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

public class PlayLog_getWrongCount_1857330420 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term125931;

    public PlayLog_getWrongCount_1857330420() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term126664 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term126663 = ((Class) term126664).getDeclaredField((String) "MISS");
        ((Field) term126663).setAccessible(true);
        Object enum274 = ((Field) term126663).get((Object) null);
        Class<? extends Object> term127041 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term127040 = ((Class) term127041).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term127040).setAccessible(true);
        Object enum275 = ((Field) term127040).get((Object) null);
        Class<? extends Object> term127324 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term127323 = ((Class) term127324).getDeclaredField((String) "NORMAL");
        ((Field) term127323).setAccessible(true);
        Object enum276 = ((Field) term127323).get((Object) null);
        Class<? extends Object> term127599 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term127598 = ((Class) term127599).getDeclaredField((String) "ORIGINAL");
        ((Field) term127598).setAccessible(true);
        Object enum277 = ((Field) term127598).get((Object) null);
        Class<? extends Object> term127865 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term127864 = ((Class) term127865).getDeclaredField((String) "NONE");
        ((Field) term127864).setAccessible(true);
        Object enum278 = ((Field) term127864).get((Object) null);
        Class<? extends Object> term128506 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term128505 = ((Class) term128506).getDeclaredField((String) "EXTREME");
        ((Field) term128505).setAccessible(true);
        Object enum279 = ((Field) term128505).get((Object) null);
        Class<? extends Object> term128784 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term128783 = ((Class) term128784).getDeclaredField((String) "EXTRA");
        ((Field) term128783).setAccessible(true);
        Object enum280 = ((Field) term128783).get((Object) null);
        Class<? extends Object> term129041 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ChallengeKind");
        Field term129040 = ((Class) term129041).getDeclaredField((String) "PERFECT");
        ((Field) term129040).setAccessible(true);
        Object enum281 = ((Field) term129040).get((Object) null);
        Class<? extends Object> term129334 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ClearResult");
        Field term129333 = ((Class) term129334).getDeclaredField((String) "GREAT");
        ((Field) term129333).setAccessible(true);
        Object enum282 = ((Field) term129333).get((Object) null);
        term125931 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog"));
        Object term125933 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term126056 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term126057 = newInstance(Class.forName("java.time.LocalDate"));
        Object term126061 = newInstance(Class.forName("java.time.LocalTime"));
        Object term126647 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term126648 = newInstance(Class.forName("java.time.LocalDate"));
        Object term126652 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term125931, term125931.getClass(), "id", -8652538484981166496L);
        setLongField(term125933, term125933.getClass(), "id", 2701184207686293431L);
        setIntField(term125933, term125933.getClass(), "pdId", -1511130237);
        setField(term125933, term125933.getClass(), "playerName", "xxx");
        setIntField(term125933, term125933.getClass(), "vocaloidPoints", 300);
        setIntField(term125933, term125933.getClass(), "level", 1);
        setIntField(term125933, term125933.getClass(), "levelExp", 452088587);
        setField(term125933, term125933.getClass(), "levelTitle", "xxx");
        setIntField(term125933, term125933.getClass(), "plateId", -1);
        setIntField(term125933, term125933.getClass(), "plateEffectId", -1);
        setField(term125933, term125933.getClass(), "passwordStatus", enum274);
        setField(term125933, term125933.getClass(), "password", "**********");
        setBooleanField(term125933, term125933.getClass(), "preferPerPvModule", true);
        setBooleanField(term125933, term125933.getClass(), "preferCommonModule", true);
        setBooleanField(term125933, term125933.getClass(), "usePerPvSkin", true);
        setBooleanField(term125933, term125933.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term125933, term125933.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term125933, term125933.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term125933, term125933.getClass(), "usePerPvTouchSliderSe", false);
        setField(term125933, term125933.getClass(), "commonModule", "-999,-999,-999");
        setField(term125933, term125933.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term126057, term126057.getClass(), "year", 2026);
        setShortField(term126057, term126057.getClass(), "month", (short) 6);
        setShortField(term126057, term126057.getClass(), "day", (short) 29);
        setField(term126056, term126056.getClass(), "date", term126057);
        setByteField(term126061, term126061.getClass(), "hour", (byte) 4);
        setByteField(term126061, term126061.getClass(), "minute", (byte) 27);
        setByteField(term126061, term126061.getClass(), "second", (byte) 28);
        setIntField(term126061, term126061.getClass(), "nano", 690113000);
        setField(term126056, term126056.getClass(), "time", term126061);
        setField(term125933, term125933.getClass(), "commonModuleSetTime", term126056);
        setField(term125933, term125933.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term125933, term125933.getClass(), "commonSkin", -1);
        setIntField(term125933, term125933.getClass(), "headphoneVolume", 100);
        setBooleanField(term125933, term125933.getClass(), "buttonSeOn", true);
        setIntField(term125933, term125933.getClass(), "buttonSeVolume", 100);
        setIntField(term125933, term125933.getClass(), "sliderSeVolume", 100);
        setIntField(term125933, term125933.getClass(), "buttonSe", -1);
        setIntField(term125933, term125933.getClass(), "chainSlideSe", -1);
        setIntField(term125933, term125933.getClass(), "slideSe", -1);
        setIntField(term125933, term125933.getClass(), "sliderTouchSe", -1);
        setField(term125933, term125933.getClass(), "sortMode", enum275);
        setIntField(term125933, term125933.getClass(), "nextPvId", -1);
        setField(term125933, term125933.getClass(), "nextDifficulty", enum276);
        setField(term125933, term125933.getClass(), "nextEdition", enum277);
        setBooleanField(term125933, term125933.getClass(), "showInterimRanking", true);
        setBooleanField(term125933, term125933.getClass(), "showClearStatus", true);
        setBooleanField(term125933, term125933.getClass(), "showGreatBorder", true);
        setBooleanField(term125933, term125933.getClass(), "showExcellentBorder", true);
        setBooleanField(term125933, term125933.getClass(), "showRivalBorder", true);
        setBooleanField(term125933, term125933.getClass(), "showRgoSetting", true);
        setBooleanField(term125933, term125933.getClass(), "contestNowPlayingEnable", false);
        setIntField(term125933, term125933.getClass(), "contestNowPlayingId", -1);
        setIntField(term125933, term125933.getClass(), "contestNowPlayingValue", -1);
        setField(term125933, term125933.getClass(), "contestNowPlayingResultRank", enum278);
        setField(term125933, term125933.getClass(), "contestNowPlayingSpecifier", "");
        setField(term125933, term125933.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term125933, term125933.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term125933, term125933.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term125933, term125933.getClass(), "rivalPdId", -1);
        setField(term125931, term125931.getClass(), "pdId", term125933);
        setIntField(term125931, term125931.getClass(), "pvId", -1630069454);
        setField(term125931, term125931.getClass(), "difficulty", enum279);
        setField(term125931, term125931.getClass(), "edition", enum280);
        setIntField(term125931, term125931.getClass(), "scriptVer", 1499735894);
        setIntField(term125931, term125931.getClass(), "score", 716486048);
        setField(term125931, term125931.getClass(), "challengeKind", enum281);
        setIntField(term125931, term125931.getClass(), "challengeResult", -466708718);
        setField(term125931, term125931.getClass(), "clearResult", enum282);
        setIntField(term125931, term125931.getClass(), "vp", 1038029515);
        setIntField(term125931, term125931.getClass(), "coolCount", 1137154606);
        setIntField(term125931, term125931.getClass(), "coolPercent", -100681578);
        setIntField(term125931, term125931.getClass(), "fineCount", 296568835);
        setIntField(term125931, term125931.getClass(), "finePercent", 1431951992);
        setIntField(term125931, term125931.getClass(), "safeCount", -1608123016);
        setIntField(term125931, term125931.getClass(), "safePercent", -896473214);
        setIntField(term125931, term125931.getClass(), "sadCount", 401203924);
        setIntField(term125931, term125931.getClass(), "sadPercent", -1212399479);
        setIntField(term125931, term125931.getClass(), "wrongCount", 2107679041);
        setIntField(term125931, term125931.getClass(), "wrongPercent", 2040965507);
        setIntField(term125931, term125931.getClass(), "maxCombo", -1281083262);
        setIntField(term125931, term125931.getClass(), "chanceTime", 1059930704);
        setIntField(term125931, term125931.getClass(), "holdScore", -1967153290);
        setIntField(term125931, term125931.getClass(), "attainPoint", -1397251956);
        setIntField(term125931, term125931.getClass(), "skinId", -796934571);
        setIntField(term125931, term125931.getClass(), "buttonSe", 405295896);
        setIntField(term125931, term125931.getClass(), "buttonSeVol", -814977075);
        setIntField(term125931, term125931.getClass(), "sliderSe", 808614267);
        setIntField(term125931, term125931.getClass(), "ChainSlideSe", 1611734632);
        setIntField(term125931, term125931.getClass(), "SliderTouchSe", 868908117);
        setField(term125931, term125931.getClass(), "modules", "ieCtQFdkii");
        setIntField(term125931, term125931.getClass(), "stageCompletion", 1789351397);
        setIntField(term125931, term125931.getClass(), "slideScore", 2145528170);
        setIntField(term125931, term125931.getClass(), "isVocalChange", -585773976);
        setField(term125931, term125931.getClass(), "customizeItems", "dEnhdmILtU");
        setField(term125931, term125931.getClass(), "rhythmGameOptions", "hoicvmsovO");
        setIntField(term125931, term125931.getClass(), "screenShotCount", -1);
        setIntField(term126648, term126648.getClass(), "year", 2015);
        setShortField(term126648, term126648.getClass(), "month", (short) 3);
        setShortField(term126648, term126648.getClass(), "day", (short) 10);
        setField(term126647, term126647.getClass(), "date", term126648);
        setByteField(term126652, term126652.getClass(), "hour", (byte) 23);
        setByteField(term126652, term126652.getClass(), "minute", (byte) 34);
        setByteField(term126652, term126652.getClass(), "second", (byte) 44);
        setIntField(term126652, term126652.getClass(), "nano", 587322824);
        setField(term126647, term126647.getClass(), "time", term126652);
        setField(term125931, term125931.getClass(), "dateTime", term126647);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getWrongCount", argTypes, term125931, args);
    }

};


