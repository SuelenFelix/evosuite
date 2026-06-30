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

public class PlayLog_setSadPercent_66475235958 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term263932;
     Object term264648;

    public PlayLog_setSadPercent_66475235958() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term264657 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term264656 = ((Class) term264657).getDeclaredField((String) "MISS");
        ((Field) term264656).setAccessible(true);
        Object enum600 = ((Field) term264656).get((Object) null);
        Class<? extends Object> term265034 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term265033 = ((Class) term265034).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term265033).setAccessible(true);
        Object enum601 = ((Field) term265033).get((Object) null);
        Class<? extends Object> term265317 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term265316 = ((Class) term265317).getDeclaredField((String) "NORMAL");
        ((Field) term265316).setAccessible(true);
        Object enum602 = ((Field) term265316).get((Object) null);
        Class<? extends Object> term265592 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term265591 = ((Class) term265592).getDeclaredField((String) "ORIGINAL");
        ((Field) term265591).setAccessible(true);
        Object enum603 = ((Field) term265591).get((Object) null);
        Class<? extends Object> term265858 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term265857 = ((Class) term265858).getDeclaredField((String) "NONE");
        ((Field) term265857).setAccessible(true);
        Object enum604 = ((Field) term265857).get((Object) null);
        Class<? extends Object> term266499 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term266498 = ((Class) term266499).getDeclaredField((String) "UNDEFINED");
        ((Field) term266498).setAccessible(true);
        Object enum605 = ((Field) term266498).get((Object) null);
        Class<? extends Object> term266783 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ChallengeKind");
        Field term266782 = ((Class) term266783).getDeclaredField((String) "CLEAR");
        ((Field) term266782).setAccessible(true);
        Object enum606 = ((Field) term266782).get((Object) null);
        Class<? extends Object> term267070 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ClearResult");
        Field term267069 = ((Class) term267070).getDeclaredField((String) "CHEAP");
        ((Field) term267069).setAccessible(true);
        Object enum607 = ((Field) term267069).get((Object) null);
        term263932 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog"));
        Object term263934 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term264057 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term264058 = newInstance(Class.forName("java.time.LocalDate"));
        Object term264062 = newInstance(Class.forName("java.time.LocalTime"));
        Object term264638 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term264639 = newInstance(Class.forName("java.time.LocalDate"));
        Object term264643 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term263932, term263932.getClass(), "id", 4266570509071948633L);
        setLongField(term263934, term263934.getClass(), "id", -7291742736502427077L);
        setIntField(term263934, term263934.getClass(), "pdId", -177243872);
        setField(term263934, term263934.getClass(), "playerName", "xxx");
        setIntField(term263934, term263934.getClass(), "vocaloidPoints", 300);
        setIntField(term263934, term263934.getClass(), "level", 1);
        setIntField(term263934, term263934.getClass(), "levelExp", 1485047282);
        setField(term263934, term263934.getClass(), "levelTitle", "xxx");
        setIntField(term263934, term263934.getClass(), "plateId", -1);
        setIntField(term263934, term263934.getClass(), "plateEffectId", -1);
        setField(term263934, term263934.getClass(), "passwordStatus", enum600);
        setField(term263934, term263934.getClass(), "password", "**********");
        setBooleanField(term263934, term263934.getClass(), "preferPerPvModule", true);
        setBooleanField(term263934, term263934.getClass(), "preferCommonModule", false);
        setBooleanField(term263934, term263934.getClass(), "usePerPvSkin", false);
        setBooleanField(term263934, term263934.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term263934, term263934.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term263934, term263934.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term263934, term263934.getClass(), "usePerPvTouchSliderSe", false);
        setField(term263934, term263934.getClass(), "commonModule", "-999,-999,-999");
        setField(term263934, term263934.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term264058, term264058.getClass(), "year", 2026);
        setShortField(term264058, term264058.getClass(), "month", (short) 6);
        setShortField(term264058, term264058.getClass(), "day", (short) 29);
        setField(term264057, term264057.getClass(), "date", term264058);
        setByteField(term264062, term264062.getClass(), "hour", (byte) 4);
        setByteField(term264062, term264062.getClass(), "minute", (byte) 27);
        setByteField(term264062, term264062.getClass(), "second", (byte) 38);
        setIntField(term264062, term264062.getClass(), "nano", 409819000);
        setField(term264057, term264057.getClass(), "time", term264062);
        setField(term263934, term263934.getClass(), "commonModuleSetTime", term264057);
        setField(term263934, term263934.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term263934, term263934.getClass(), "commonSkin", -1);
        setIntField(term263934, term263934.getClass(), "headphoneVolume", 100);
        setBooleanField(term263934, term263934.getClass(), "buttonSeOn", true);
        setIntField(term263934, term263934.getClass(), "buttonSeVolume", 100);
        setIntField(term263934, term263934.getClass(), "sliderSeVolume", 100);
        setIntField(term263934, term263934.getClass(), "buttonSe", -1);
        setIntField(term263934, term263934.getClass(), "chainSlideSe", -1);
        setIntField(term263934, term263934.getClass(), "slideSe", -1);
        setIntField(term263934, term263934.getClass(), "sliderTouchSe", -1);
        setField(term263934, term263934.getClass(), "sortMode", enum601);
        setIntField(term263934, term263934.getClass(), "nextPvId", -1);
        setField(term263934, term263934.getClass(), "nextDifficulty", enum602);
        setField(term263934, term263934.getClass(), "nextEdition", enum603);
        setBooleanField(term263934, term263934.getClass(), "showInterimRanking", true);
        setBooleanField(term263934, term263934.getClass(), "showClearStatus", true);
        setBooleanField(term263934, term263934.getClass(), "showGreatBorder", true);
        setBooleanField(term263934, term263934.getClass(), "showExcellentBorder", true);
        setBooleanField(term263934, term263934.getClass(), "showRivalBorder", true);
        setBooleanField(term263934, term263934.getClass(), "showRgoSetting", true);
        setBooleanField(term263934, term263934.getClass(), "contestNowPlayingEnable", true);
        setIntField(term263934, term263934.getClass(), "contestNowPlayingId", -1);
        setIntField(term263934, term263934.getClass(), "contestNowPlayingValue", -1);
        setField(term263934, term263934.getClass(), "contestNowPlayingResultRank", enum604);
        setField(term263934, term263934.getClass(), "contestNowPlayingSpecifier", "");
        setField(term263934, term263934.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term263934, term263934.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term263934, term263934.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term263934, term263934.getClass(), "rivalPdId", -1);
        setField(term263932, term263932.getClass(), "pdId", term263934);
        setIntField(term263932, term263932.getClass(), "pvId", 1624190794);
        setField(term263932, term263932.getClass(), "difficulty", enum605);
        setField(term263932, term263932.getClass(), "edition", enum603);
        setIntField(term263932, term263932.getClass(), "scriptVer", -773608881);
        setIntField(term263932, term263932.getClass(), "score", -1642688455);
        setField(term263932, term263932.getClass(), "challengeKind", enum606);
        setIntField(term263932, term263932.getClass(), "challengeResult", -1184558215);
        setField(term263932, term263932.getClass(), "clearResult", enum607);
        setIntField(term263932, term263932.getClass(), "vp", 2123688338);
        setIntField(term263932, term263932.getClass(), "coolCount", -1051941387);
        setIntField(term263932, term263932.getClass(), "coolPercent", -640763660);
        setIntField(term263932, term263932.getClass(), "fineCount", -1189468129);
        setIntField(term263932, term263932.getClass(), "finePercent", -1099664830);
        setIntField(term263932, term263932.getClass(), "safeCount", 873502011);
        setIntField(term263932, term263932.getClass(), "safePercent", -2004575734);
        setIntField(term263932, term263932.getClass(), "sadCount", 1491468856);
        setIntField(term263932, term263932.getClass(), "sadPercent", 962385185);
        setIntField(term263932, term263932.getClass(), "wrongCount", 2146718886);
        setIntField(term263932, term263932.getClass(), "wrongPercent", -985577036);
        setIntField(term263932, term263932.getClass(), "maxCombo", 802539130);
        setIntField(term263932, term263932.getClass(), "chanceTime", 2105146188);
        setIntField(term263932, term263932.getClass(), "holdScore", -862415480);
        setIntField(term263932, term263932.getClass(), "attainPoint", 312605349);
        setIntField(term263932, term263932.getClass(), "skinId", -402072606);
        setIntField(term263932, term263932.getClass(), "buttonSe", -477355193);
        setIntField(term263932, term263932.getClass(), "buttonSeVol", 168425089);
        setIntField(term263932, term263932.getClass(), "sliderSe", -571931590);
        setIntField(term263932, term263932.getClass(), "ChainSlideSe", 37757400);
        setIntField(term263932, term263932.getClass(), "SliderTouchSe", -1632221612);
        setField(term263932, term263932.getClass(), "modules", "xtftXXMbem");
        setIntField(term263932, term263932.getClass(), "stageCompletion", 1545314376);
        setIntField(term263932, term263932.getClass(), "slideScore", 437959151);
        setIntField(term263932, term263932.getClass(), "isVocalChange", 27780241);
        setField(term263932, term263932.getClass(), "customizeItems", "cudZvLMQon");
        setField(term263932, term263932.getClass(), "rhythmGameOptions", "lihXWlGDxk");
        setIntField(term263932, term263932.getClass(), "screenShotCount", -1);
        setIntField(term264639, term264639.getClass(), "year", 2016);
        setShortField(term264639, term264639.getClass(), "month", (short) 2);
        setShortField(term264639, term264639.getClass(), "day", (short) 25);
        setField(term264638, term264638.getClass(), "date", term264639);
        setByteField(term264643, term264643.getClass(), "hour", (byte) 8);
        setByteField(term264643, term264643.getClass(), "minute", (byte) 54);
        setByteField(term264643, term264643.getClass(), "second", (byte) 40);
        setIntField(term264643, term264643.getClass(), "nano", 124525896);
        setField(term264638, term264638.getClass(), "time", term264643);
        setField(term263932, term263932.getClass(), "dateTime", term264638);
        term264648 = new Integer(-683868408);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term264648;
        callMethod(klass, "setSadPercent", argTypes, term263932, args);
    }

};


