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

public class PlayLog_getClearResult_59784354910 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term91205;

    public PlayLog_getClearResult_59784354910() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term91928 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term91927 = ((Class) term91928).getDeclaredField((String) "MISS");
        ((Field) term91927).setAccessible(true);
        Object enum193 = ((Field) term91927).get((Object) null);
        Class<? extends Object> term92305 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term92304 = ((Class) term92305).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term92304).setAccessible(true);
        Object enum194 = ((Field) term92304).get((Object) null);
        Class<? extends Object> term92588 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term92587 = ((Class) term92588).getDeclaredField((String) "NORMAL");
        ((Field) term92587).setAccessible(true);
        Object enum195 = ((Field) term92587).get((Object) null);
        Class<? extends Object> term92863 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term92862 = ((Class) term92863).getDeclaredField((String) "ORIGINAL");
        ((Field) term92862).setAccessible(true);
        Object enum196 = ((Field) term92862).get((Object) null);
        Class<? extends Object> term93129 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term93128 = ((Class) term93129).getDeclaredField((String) "NONE");
        ((Field) term93128).setAccessible(true);
        Object enum197 = ((Field) term93128).get((Object) null);
        Class<? extends Object> term93770 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term93769 = ((Class) term93770).getDeclaredField((String) "EXTREME");
        ((Field) term93769).setAccessible(true);
        Object enum198 = ((Field) term93769).get((Object) null);
        Class<? extends Object> term94048 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ChallengeKind");
        Field term94047 = ((Class) term94048).getDeclaredField((String) "PERFECT");
        ((Field) term94047).setAccessible(true);
        Object enum199 = ((Field) term94047).get((Object) null);
        Class<? extends Object> term94341 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ClearResult");
        Field term94340 = ((Class) term94341).getDeclaredField((String) "CHEAP");
        ((Field) term94340).setAccessible(true);
        Object enum200 = ((Field) term94340).get((Object) null);
        term91205 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog"));
        Object term91207 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term91330 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term91331 = newInstance(Class.forName("java.time.LocalDate"));
        Object term91335 = newInstance(Class.forName("java.time.LocalTime"));
        Object term91911 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term91912 = newInstance(Class.forName("java.time.LocalDate"));
        Object term91916 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term91205, term91205.getClass(), "id", 2062173786000223358L);
        setLongField(term91207, term91207.getClass(), "id", -8658027316505137504L);
        setIntField(term91207, term91207.getClass(), "pdId", 977862393);
        setField(term91207, term91207.getClass(), "playerName", "xxx");
        setIntField(term91207, term91207.getClass(), "vocaloidPoints", 300);
        setIntField(term91207, term91207.getClass(), "level", 1);
        setIntField(term91207, term91207.getClass(), "levelExp", 301401782);
        setField(term91207, term91207.getClass(), "levelTitle", "xxx");
        setIntField(term91207, term91207.getClass(), "plateId", -1);
        setIntField(term91207, term91207.getClass(), "plateEffectId", -1);
        setField(term91207, term91207.getClass(), "passwordStatus", enum193);
        setField(term91207, term91207.getClass(), "password", "**********");
        setBooleanField(term91207, term91207.getClass(), "preferPerPvModule", true);
        setBooleanField(term91207, term91207.getClass(), "preferCommonModule", true);
        setBooleanField(term91207, term91207.getClass(), "usePerPvSkin", true);
        setBooleanField(term91207, term91207.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term91207, term91207.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term91207, term91207.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term91207, term91207.getClass(), "usePerPvTouchSliderSe", true);
        setField(term91207, term91207.getClass(), "commonModule", "-999,-999,-999");
        setField(term91207, term91207.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term91331, term91331.getClass(), "year", 2026);
        setShortField(term91331, term91331.getClass(), "month", (short) 8);
        setShortField(term91331, term91331.getClass(), "day", (short) 12);
        setField(term91330, term91330.getClass(), "date", term91331);
        setByteField(term91335, term91335.getClass(), "hour", (byte) 2);
        setByteField(term91335, term91335.getClass(), "minute", (byte) 2);
        setByteField(term91335, term91335.getClass(), "second", (byte) 42);
        setIntField(term91335, term91335.getClass(), "nano", 577598000);
        setField(term91330, term91330.getClass(), "time", term91335);
        setField(term91207, term91207.getClass(), "commonModuleSetTime", term91330);
        setField(term91207, term91207.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term91207, term91207.getClass(), "commonSkin", -1);
        setIntField(term91207, term91207.getClass(), "headphoneVolume", 100);
        setBooleanField(term91207, term91207.getClass(), "buttonSeOn", true);
        setIntField(term91207, term91207.getClass(), "buttonSeVolume", 100);
        setIntField(term91207, term91207.getClass(), "sliderSeVolume", 100);
        setIntField(term91207, term91207.getClass(), "buttonSe", -1);
        setIntField(term91207, term91207.getClass(), "chainSlideSe", -1);
        setIntField(term91207, term91207.getClass(), "slideSe", -1);
        setIntField(term91207, term91207.getClass(), "sliderTouchSe", -1);
        setField(term91207, term91207.getClass(), "sortMode", enum194);
        setIntField(term91207, term91207.getClass(), "nextPvId", -1);
        setField(term91207, term91207.getClass(), "nextDifficulty", enum195);
        setField(term91207, term91207.getClass(), "nextEdition", enum196);
        setBooleanField(term91207, term91207.getClass(), "showInterimRanking", true);
        setBooleanField(term91207, term91207.getClass(), "showClearStatus", true);
        setBooleanField(term91207, term91207.getClass(), "showGreatBorder", true);
        setBooleanField(term91207, term91207.getClass(), "showExcellentBorder", true);
        setBooleanField(term91207, term91207.getClass(), "showRivalBorder", true);
        setBooleanField(term91207, term91207.getClass(), "showRgoSetting", true);
        setBooleanField(term91207, term91207.getClass(), "contestNowPlayingEnable", true);
        setIntField(term91207, term91207.getClass(), "contestNowPlayingId", -1);
        setIntField(term91207, term91207.getClass(), "contestNowPlayingValue", -1);
        setField(term91207, term91207.getClass(), "contestNowPlayingResultRank", enum197);
        setField(term91207, term91207.getClass(), "contestNowPlayingSpecifier", "");
        setField(term91207, term91207.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term91207, term91207.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term91207, term91207.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term91207, term91207.getClass(), "rivalPdId", -1);
        setField(term91205, term91205.getClass(), "pdId", term91207);
        setIntField(term91205, term91205.getClass(), "pvId", 1988605357);
        setField(term91205, term91205.getClass(), "difficulty", enum198);
        setField(term91205, term91205.getClass(), "edition", enum196);
        setIntField(term91205, term91205.getClass(), "scriptVer", 808203320);
        setIntField(term91205, term91205.getClass(), "score", -544382127);
        setField(term91205, term91205.getClass(), "challengeKind", enum199);
        setIntField(term91205, term91205.getClass(), "challengeResult", -1830198043);
        setField(term91205, term91205.getClass(), "clearResult", enum200);
        setIntField(term91205, term91205.getClass(), "vp", -439048495);
        setIntField(term91205, term91205.getClass(), "coolCount", -1849105286);
        setIntField(term91205, term91205.getClass(), "coolPercent", 1334483645);
        setIntField(term91205, term91205.getClass(), "fineCount", 917513193);
        setIntField(term91205, term91205.getClass(), "finePercent", 787278105);
        setIntField(term91205, term91205.getClass(), "safeCount", -2063843486);
        setIntField(term91205, term91205.getClass(), "safePercent", 833762980);
        setIntField(term91205, term91205.getClass(), "sadCount", 320711637);
        setIntField(term91205, term91205.getClass(), "sadPercent", 1241164745);
        setIntField(term91205, term91205.getClass(), "wrongCount", 1723148410);
        setIntField(term91205, term91205.getClass(), "wrongPercent", -920797484);
        setIntField(term91205, term91205.getClass(), "maxCombo", -1631697577);
        setIntField(term91205, term91205.getClass(), "chanceTime", 765731371);
        setIntField(term91205, term91205.getClass(), "holdScore", -1703035419);
        setIntField(term91205, term91205.getClass(), "attainPoint", 765766290);
        setIntField(term91205, term91205.getClass(), "skinId", -1284825282);
        setIntField(term91205, term91205.getClass(), "buttonSe", -1941343035);
        setIntField(term91205, term91205.getClass(), "buttonSeVol", 947897214);
        setIntField(term91205, term91205.getClass(), "sliderSe", 1496340209);
        setIntField(term91205, term91205.getClass(), "ChainSlideSe", -1748391876);
        setIntField(term91205, term91205.getClass(), "SliderTouchSe", 43258317);
        setField(term91205, term91205.getClass(), "modules", "OWDIEULEFu");
        setIntField(term91205, term91205.getClass(), "stageCompletion", 1707220033);
        setIntField(term91205, term91205.getClass(), "slideScore", -1792504217);
        setIntField(term91205, term91205.getClass(), "isVocalChange", 1824538861);
        setField(term91205, term91205.getClass(), "customizeItems", "dWRymuLBtr");
        setField(term91205, term91205.getClass(), "rhythmGameOptions", "AijpHYOFuy");
        setIntField(term91205, term91205.getClass(), "screenShotCount", -1);
        setIntField(term91912, term91912.getClass(), "year", 2012);
        setShortField(term91912, term91912.getClass(), "month", (short) 9);
        setShortField(term91912, term91912.getClass(), "day", (short) 11);
        setField(term91911, term91911.getClass(), "date", term91912);
        setByteField(term91916, term91916.getClass(), "hour", (byte) 22);
        setByteField(term91916, term91916.getClass(), "minute", (byte) 10);
        setByteField(term91916, term91916.getClass(), "second", (byte) 8);
        setIntField(term91916, term91916.getClass(), "nano", 380008862);
        setField(term91911, term91911.getClass(), "time", term91916);
        setField(term91205, term91205.getClass(), "dateTime", term91911);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getClearResult", argTypes, term91205, args);
    }

};


