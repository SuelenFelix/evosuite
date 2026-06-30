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

public class PlayLog_getSkinId_132235633826 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term147930;

    public PlayLog_getSkinId_132235633826() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term148658 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term148657 = ((Class) term148658).getDeclaredField((String) "MISS");
        ((Field) term148657).setAccessible(true);
        Object enum327 = ((Field) term148657).get((Object) null);
        Class<? extends Object> term149035 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term149034 = ((Class) term149035).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term149034).setAccessible(true);
        Object enum328 = ((Field) term149034).get((Object) null);
        Class<? extends Object> term149318 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term149317 = ((Class) term149318).getDeclaredField((String) "NORMAL");
        ((Field) term149317).setAccessible(true);
        Object enum329 = ((Field) term149317).get((Object) null);
        Class<? extends Object> term149593 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term149592 = ((Class) term149593).getDeclaredField((String) "ORIGINAL");
        ((Field) term149592).setAccessible(true);
        Object enum330 = ((Field) term149592).get((Object) null);
        Class<? extends Object> term149859 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term149858 = ((Class) term149859).getDeclaredField((String) "NONE");
        ((Field) term149858).setAccessible(true);
        Object enum331 = ((Field) term149858).get((Object) null);
        Class<? extends Object> term150500 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term150499 = ((Class) term150500).getDeclaredField((String) "EXTREME");
        ((Field) term150499).setAccessible(true);
        Object enum332 = ((Field) term150499).get((Object) null);
        Class<? extends Object> term150778 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ChallengeKind");
        Field term150777 = ((Class) term150778).getDeclaredField((String) "EXCELLENT");
        ((Field) term150777).setAccessible(true);
        Object enum333 = ((Field) term150777).get((Object) null);
        Class<? extends Object> term151077 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ClearResult");
        Field term151076 = ((Class) term151077).getDeclaredField((String) "STANDARD");
        ((Field) term151076).setAccessible(true);
        Object enum334 = ((Field) term151076).get((Object) null);
        term147930 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog"));
        Object term147932 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term148055 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term148056 = newInstance(Class.forName("java.time.LocalDate"));
        Object term148060 = newInstance(Class.forName("java.time.LocalTime"));
        Object term148641 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term148642 = newInstance(Class.forName("java.time.LocalDate"));
        Object term148646 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term147930, term147930.getClass(), "id", 2135754395358000892L);
        setLongField(term147932, term147932.getClass(), "id", -8085190702504231560L);
        setIntField(term147932, term147932.getClass(), "pdId", 953741504);
        setField(term147932, term147932.getClass(), "playerName", "xxx");
        setIntField(term147932, term147932.getClass(), "vocaloidPoints", 300);
        setIntField(term147932, term147932.getClass(), "level", 1);
        setIntField(term147932, term147932.getClass(), "levelExp", 1389452261);
        setField(term147932, term147932.getClass(), "levelTitle", "xxx");
        setIntField(term147932, term147932.getClass(), "plateId", -1);
        setIntField(term147932, term147932.getClass(), "plateEffectId", -1);
        setField(term147932, term147932.getClass(), "passwordStatus", enum327);
        setField(term147932, term147932.getClass(), "password", "**********");
        setBooleanField(term147932, term147932.getClass(), "preferPerPvModule", true);
        setBooleanField(term147932, term147932.getClass(), "preferCommonModule", true);
        setBooleanField(term147932, term147932.getClass(), "usePerPvSkin", true);
        setBooleanField(term147932, term147932.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term147932, term147932.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term147932, term147932.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term147932, term147932.getClass(), "usePerPvTouchSliderSe", true);
        setField(term147932, term147932.getClass(), "commonModule", "-999,-999,-999");
        setField(term147932, term147932.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term148056, term148056.getClass(), "year", 2026);
        setShortField(term148056, term148056.getClass(), "month", (short) 6);
        setShortField(term148056, term148056.getClass(), "day", (short) 29);
        setField(term148055, term148055.getClass(), "date", term148056);
        setByteField(term148060, term148060.getClass(), "hour", (byte) 4);
        setByteField(term148060, term148060.getClass(), "minute", (byte) 27);
        setByteField(term148060, term148060.getClass(), "second", (byte) 30);
        setIntField(term148060, term148060.getClass(), "nano", 222684000);
        setField(term148055, term148055.getClass(), "time", term148060);
        setField(term147932, term147932.getClass(), "commonModuleSetTime", term148055);
        setField(term147932, term147932.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term147932, term147932.getClass(), "commonSkin", -1);
        setIntField(term147932, term147932.getClass(), "headphoneVolume", 100);
        setBooleanField(term147932, term147932.getClass(), "buttonSeOn", true);
        setIntField(term147932, term147932.getClass(), "buttonSeVolume", 100);
        setIntField(term147932, term147932.getClass(), "sliderSeVolume", 100);
        setIntField(term147932, term147932.getClass(), "buttonSe", -1);
        setIntField(term147932, term147932.getClass(), "chainSlideSe", -1);
        setIntField(term147932, term147932.getClass(), "slideSe", -1);
        setIntField(term147932, term147932.getClass(), "sliderTouchSe", -1);
        setField(term147932, term147932.getClass(), "sortMode", enum328);
        setIntField(term147932, term147932.getClass(), "nextPvId", -1);
        setField(term147932, term147932.getClass(), "nextDifficulty", enum329);
        setField(term147932, term147932.getClass(), "nextEdition", enum330);
        setBooleanField(term147932, term147932.getClass(), "showInterimRanking", true);
        setBooleanField(term147932, term147932.getClass(), "showClearStatus", true);
        setBooleanField(term147932, term147932.getClass(), "showGreatBorder", true);
        setBooleanField(term147932, term147932.getClass(), "showExcellentBorder", true);
        setBooleanField(term147932, term147932.getClass(), "showRivalBorder", true);
        setBooleanField(term147932, term147932.getClass(), "showRgoSetting", true);
        setBooleanField(term147932, term147932.getClass(), "contestNowPlayingEnable", false);
        setIntField(term147932, term147932.getClass(), "contestNowPlayingId", -1);
        setIntField(term147932, term147932.getClass(), "contestNowPlayingValue", -1);
        setField(term147932, term147932.getClass(), "contestNowPlayingResultRank", enum331);
        setField(term147932, term147932.getClass(), "contestNowPlayingSpecifier", "");
        setField(term147932, term147932.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term147932, term147932.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term147932, term147932.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term147932, term147932.getClass(), "rivalPdId", -1);
        setField(term147930, term147930.getClass(), "pdId", term147932);
        setIntField(term147930, term147930.getClass(), "pvId", 1615957955);
        setField(term147930, term147930.getClass(), "difficulty", enum332);
        setField(term147930, term147930.getClass(), "edition", enum330);
        setIntField(term147930, term147930.getClass(), "scriptVer", 1779370220);
        setIntField(term147930, term147930.getClass(), "score", -1716046610);
        setField(term147930, term147930.getClass(), "challengeKind", enum333);
        setIntField(term147930, term147930.getClass(), "challengeResult", 65264024);
        setField(term147930, term147930.getClass(), "clearResult", enum334);
        setIntField(term147930, term147930.getClass(), "vp", -252449812);
        setIntField(term147930, term147930.getClass(), "coolCount", -1885268968);
        setIntField(term147930, term147930.getClass(), "coolPercent", 277855691);
        setIntField(term147930, term147930.getClass(), "fineCount", 675891483);
        setIntField(term147930, term147930.getClass(), "finePercent", -317900470);
        setIntField(term147930, term147930.getClass(), "safeCount", -979568);
        setIntField(term147930, term147930.getClass(), "safePercent", -1422131197);
        setIntField(term147930, term147930.getClass(), "sadCount", -20399281);
        setIntField(term147930, term147930.getClass(), "sadPercent", -830170410);
        setIntField(term147930, term147930.getClass(), "wrongCount", -1742790308);
        setIntField(term147930, term147930.getClass(), "wrongPercent", -1592093430);
        setIntField(term147930, term147930.getClass(), "maxCombo", 1178214545);
        setIntField(term147930, term147930.getClass(), "chanceTime", -985334541);
        setIntField(term147930, term147930.getClass(), "holdScore", -1870004228);
        setIntField(term147930, term147930.getClass(), "attainPoint", 380484139);
        setIntField(term147930, term147930.getClass(), "skinId", 1822317628);
        setIntField(term147930, term147930.getClass(), "buttonSe", -608830309);
        setIntField(term147930, term147930.getClass(), "buttonSeVol", -537786484);
        setIntField(term147930, term147930.getClass(), "sliderSe", 263859424);
        setIntField(term147930, term147930.getClass(), "ChainSlideSe", 1436978289);
        setIntField(term147930, term147930.getClass(), "SliderTouchSe", 696225243);
        setField(term147930, term147930.getClass(), "modules", "OWKQODBLzb");
        setIntField(term147930, term147930.getClass(), "stageCompletion", -1421649118);
        setIntField(term147930, term147930.getClass(), "slideScore", -511248284);
        setIntField(term147930, term147930.getClass(), "isVocalChange", 788630042);
        setField(term147930, term147930.getClass(), "customizeItems", "wGmYcqUkgE");
        setField(term147930, term147930.getClass(), "rhythmGameOptions", "idgaQsnJpQ");
        setIntField(term147930, term147930.getClass(), "screenShotCount", -1);
        setIntField(term148642, term148642.getClass(), "year", 2021);
        setShortField(term148642, term148642.getClass(), "month", (short) 8);
        setShortField(term148642, term148642.getClass(), "day", (short) 12);
        setField(term148641, term148641.getClass(), "date", term148642);
        setByteField(term148646, term148646.getClass(), "hour", (byte) 2);
        setByteField(term148646, term148646.getClass(), "minute", (byte) 17);
        setByteField(term148646, term148646.getClass(), "second", (byte) 51);
        setIntField(term148646, term148646.getClass(), "nano", 207375141);
        setField(term148641, term148641.getClass(), "time", term148646);
        setField(term147930, term147930.getClass(), "dateTime", term148641);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSkinId", argTypes, term147930, args);
    }

};


