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

public class PlayLog_getSadPercent_24962741919 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term122493;

    public PlayLog_getSadPercent_24962741919() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term123215 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term123214 = ((Class) term123215).getDeclaredField((String) "MISS");
        ((Field) term123214).setAccessible(true);
        Object enum266 = ((Field) term123214).get((Object) null);
        Class<? extends Object> term123592 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term123591 = ((Class) term123592).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term123591).setAccessible(true);
        Object enum267 = ((Field) term123591).get((Object) null);
        Class<? extends Object> term123875 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term123874 = ((Class) term123875).getDeclaredField((String) "NORMAL");
        ((Field) term123874).setAccessible(true);
        Object enum268 = ((Field) term123874).get((Object) null);
        Class<? extends Object> term124150 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term124149 = ((Class) term124150).getDeclaredField((String) "ORIGINAL");
        ((Field) term124149).setAccessible(true);
        Object enum269 = ((Field) term124149).get((Object) null);
        Class<? extends Object> term124416 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term124415 = ((Class) term124416).getDeclaredField((String) "NONE");
        ((Field) term124415).setAccessible(true);
        Object enum270 = ((Field) term124415).get((Object) null);
        Class<? extends Object> term125057 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term125056 = ((Class) term125057).getDeclaredField((String) "HARD");
        ((Field) term125056).setAccessible(true);
        Object enum271 = ((Field) term125056).get((Object) null);
        Class<? extends Object> term125326 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ChallengeKind");
        Field term125325 = ((Class) term125326).getDeclaredField((String) "CLEAR");
        ((Field) term125325).setAccessible(true);
        Object enum272 = ((Field) term125325).get((Object) null);
        Class<? extends Object> term125613 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ClearResult");
        Field term125612 = ((Class) term125613).getDeclaredField((String) "MISS_TAKE");
        ((Field) term125612).setAccessible(true);
        Object enum273 = ((Field) term125612).get((Object) null);
        term122493 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog"));
        Object term122495 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term122618 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term122619 = newInstance(Class.forName("java.time.LocalDate"));
        Object term122623 = newInstance(Class.forName("java.time.LocalTime"));
        Object term123198 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term123199 = newInstance(Class.forName("java.time.LocalDate"));
        Object term123203 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term122493, term122493.getClass(), "id", -1983291584002806658L);
        setLongField(term122495, term122495.getClass(), "id", 5946780097489996391L);
        setIntField(term122495, term122495.getClass(), "pdId", 1104108112);
        setField(term122495, term122495.getClass(), "playerName", "xxx");
        setIntField(term122495, term122495.getClass(), "vocaloidPoints", 300);
        setIntField(term122495, term122495.getClass(), "level", 1);
        setIntField(term122495, term122495.getClass(), "levelExp", 1648665618);
        setField(term122495, term122495.getClass(), "levelTitle", "xxx");
        setIntField(term122495, term122495.getClass(), "plateId", -1);
        setIntField(term122495, term122495.getClass(), "plateEffectId", -1);
        setField(term122495, term122495.getClass(), "passwordStatus", enum266);
        setField(term122495, term122495.getClass(), "password", "**********");
        setBooleanField(term122495, term122495.getClass(), "preferPerPvModule", true);
        setBooleanField(term122495, term122495.getClass(), "preferCommonModule", true);
        setBooleanField(term122495, term122495.getClass(), "usePerPvSkin", true);
        setBooleanField(term122495, term122495.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term122495, term122495.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term122495, term122495.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term122495, term122495.getClass(), "usePerPvTouchSliderSe", false);
        setField(term122495, term122495.getClass(), "commonModule", "-999,-999,-999");
        setField(term122495, term122495.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term122619, term122619.getClass(), "year", 2026);
        setShortField(term122619, term122619.getClass(), "month", (short) 6);
        setShortField(term122619, term122619.getClass(), "day", (short) 29);
        setField(term122618, term122618.getClass(), "date", term122619);
        setByteField(term122623, term122623.getClass(), "hour", (byte) 4);
        setByteField(term122623, term122623.getClass(), "minute", (byte) 27);
        setByteField(term122623, term122623.getClass(), "second", (byte) 28);
        setIntField(term122623, term122623.getClass(), "nano", 437891000);
        setField(term122618, term122618.getClass(), "time", term122623);
        setField(term122495, term122495.getClass(), "commonModuleSetTime", term122618);
        setField(term122495, term122495.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term122495, term122495.getClass(), "commonSkin", -1);
        setIntField(term122495, term122495.getClass(), "headphoneVolume", 100);
        setBooleanField(term122495, term122495.getClass(), "buttonSeOn", true);
        setIntField(term122495, term122495.getClass(), "buttonSeVolume", 100);
        setIntField(term122495, term122495.getClass(), "sliderSeVolume", 100);
        setIntField(term122495, term122495.getClass(), "buttonSe", -1);
        setIntField(term122495, term122495.getClass(), "chainSlideSe", -1);
        setIntField(term122495, term122495.getClass(), "slideSe", -1);
        setIntField(term122495, term122495.getClass(), "sliderTouchSe", -1);
        setField(term122495, term122495.getClass(), "sortMode", enum267);
        setIntField(term122495, term122495.getClass(), "nextPvId", -1);
        setField(term122495, term122495.getClass(), "nextDifficulty", enum268);
        setField(term122495, term122495.getClass(), "nextEdition", enum269);
        setBooleanField(term122495, term122495.getClass(), "showInterimRanking", true);
        setBooleanField(term122495, term122495.getClass(), "showClearStatus", true);
        setBooleanField(term122495, term122495.getClass(), "showGreatBorder", true);
        setBooleanField(term122495, term122495.getClass(), "showExcellentBorder", true);
        setBooleanField(term122495, term122495.getClass(), "showRivalBorder", true);
        setBooleanField(term122495, term122495.getClass(), "showRgoSetting", true);
        setBooleanField(term122495, term122495.getClass(), "contestNowPlayingEnable", true);
        setIntField(term122495, term122495.getClass(), "contestNowPlayingId", -1);
        setIntField(term122495, term122495.getClass(), "contestNowPlayingValue", -1);
        setField(term122495, term122495.getClass(), "contestNowPlayingResultRank", enum270);
        setField(term122495, term122495.getClass(), "contestNowPlayingSpecifier", "");
        setField(term122495, term122495.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term122495, term122495.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term122495, term122495.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term122495, term122495.getClass(), "rivalPdId", -1);
        setField(term122493, term122493.getClass(), "pdId", term122495);
        setIntField(term122493, term122493.getClass(), "pvId", 633765954);
        setField(term122493, term122493.getClass(), "difficulty", enum271);
        setField(term122493, term122493.getClass(), "edition", enum269);
        setIntField(term122493, term122493.getClass(), "scriptVer", 269110087);
        setIntField(term122493, term122493.getClass(), "score", 1545119095);
        setField(term122493, term122493.getClass(), "challengeKind", enum272);
        setIntField(term122493, term122493.getClass(), "challengeResult", 1671229683);
        setField(term122493, term122493.getClass(), "clearResult", enum273);
        setIntField(term122493, term122493.getClass(), "vp", 34167717);
        setIntField(term122493, term122493.getClass(), "coolCount", -514195141);
        setIntField(term122493, term122493.getClass(), "coolPercent", -297946422);
        setIntField(term122493, term122493.getClass(), "fineCount", 385463636);
        setIntField(term122493, term122493.getClass(), "finePercent", -1677599962);
        setIntField(term122493, term122493.getClass(), "safeCount", -1790275458);
        setIntField(term122493, term122493.getClass(), "safePercent", -497534255);
        setIntField(term122493, term122493.getClass(), "sadCount", 1588942911);
        setIntField(term122493, term122493.getClass(), "sadPercent", -2129828854);
        setIntField(term122493, term122493.getClass(), "wrongCount", -47438786);
        setIntField(term122493, term122493.getClass(), "wrongPercent", -1955400589);
        setIntField(term122493, term122493.getClass(), "maxCombo", 626179200);
        setIntField(term122493, term122493.getClass(), "chanceTime", -511077684);
        setIntField(term122493, term122493.getClass(), "holdScore", -711507760);
        setIntField(term122493, term122493.getClass(), "attainPoint", 1053773809);
        setIntField(term122493, term122493.getClass(), "skinId", 924127883);
        setIntField(term122493, term122493.getClass(), "buttonSe", -751079123);
        setIntField(term122493, term122493.getClass(), "buttonSeVol", -110837188);
        setIntField(term122493, term122493.getClass(), "sliderSe", -271094506);
        setIntField(term122493, term122493.getClass(), "ChainSlideSe", 455632030);
        setIntField(term122493, term122493.getClass(), "SliderTouchSe", -1632929393);
        setField(term122493, term122493.getClass(), "modules", "MLqYREekMl");
        setIntField(term122493, term122493.getClass(), "stageCompletion", -431440129);
        setIntField(term122493, term122493.getClass(), "slideScore", -763576148);
        setIntField(term122493, term122493.getClass(), "isVocalChange", 1568948514);
        setField(term122493, term122493.getClass(), "customizeItems", "ytSBIKXogI");
        setField(term122493, term122493.getClass(), "rhythmGameOptions", "nHXjMycHlU");
        setIntField(term122493, term122493.getClass(), "screenShotCount", -1);
        setIntField(term123199, term123199.getClass(), "year", 2023);
        setShortField(term123199, term123199.getClass(), "month", (short) 3);
        setShortField(term123199, term123199.getClass(), "day", (short) 7);
        setField(term123198, term123198.getClass(), "date", term123199);
        setByteField(term123203, term123203.getClass(), "hour", (byte) 21);
        setByteField(term123203, term123203.getClass(), "minute", (byte) 15);
        setByteField(term123203, term123203.getClass(), "second", (byte) 43);
        setIntField(term123203, term123203.getClass(), "nano", 639721472);
        setField(term123198, term123198.getClass(), "time", term123203);
        setField(term122493, term122493.getClass(), "dateTime", term123198);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSadPercent", argTypes, term122493, args);
    }

};


