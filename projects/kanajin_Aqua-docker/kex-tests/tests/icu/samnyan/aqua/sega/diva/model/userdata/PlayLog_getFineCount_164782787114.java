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

public class PlayLog_getFineCount_164782787114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105261;

    public PlayLog_getFineCount_164782787114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term105974 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term105973 = ((Class) term105974).getDeclaredField((String) "MISS");
        ((Field) term105973).setAccessible(true);
        Object enum226 = ((Field) term105973).get((Object) null);
        Class<? extends Object> term106351 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term106350 = ((Class) term106351).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term106350).setAccessible(true);
        Object enum227 = ((Field) term106350).get((Object) null);
        Class<? extends Object> term106634 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term106633 = ((Class) term106634).getDeclaredField((String) "NORMAL");
        ((Field) term106633).setAccessible(true);
        Object enum228 = ((Field) term106633).get((Object) null);
        Class<? extends Object> term106909 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term106908 = ((Class) term106909).getDeclaredField((String) "ORIGINAL");
        ((Field) term106908).setAccessible(true);
        Object enum229 = ((Field) term106908).get((Object) null);
        Class<? extends Object> term107175 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term107174 = ((Class) term107175).getDeclaredField((String) "NONE");
        ((Field) term107174).setAccessible(true);
        Object enum230 = ((Field) term107174).get((Object) null);
        Class<? extends Object> term107816 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ChallengeKind");
        Field term107815 = ((Class) term107816).getDeclaredField((String) "GREAT");
        ((Field) term107815).setAccessible(true);
        Object enum231 = ((Field) term107815).get((Object) null);
        Class<? extends Object> term108103 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ClearResult");
        Field term108102 = ((Class) term108103).getDeclaredField((String) "EXCELLENT");
        ((Field) term108102).setAccessible(true);
        Object enum232 = ((Field) term108102).get((Object) null);
        term105261 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog"));
        Object term105263 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term105386 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term105387 = newInstance(Class.forName("java.time.LocalDate"));
        Object term105391 = newInstance(Class.forName("java.time.LocalTime"));
        Object term105957 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term105958 = newInstance(Class.forName("java.time.LocalDate"));
        Object term105962 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term105261, term105261.getClass(), "id", 41775768178052008L);
        setLongField(term105263, term105263.getClass(), "id", 6682528376118987775L);
        setIntField(term105263, term105263.getClass(), "pdId", 213831054);
        setField(term105263, term105263.getClass(), "playerName", "xxx");
        setIntField(term105263, term105263.getClass(), "vocaloidPoints", 300);
        setIntField(term105263, term105263.getClass(), "level", 1);
        setIntField(term105263, term105263.getClass(), "levelExp", 330043745);
        setField(term105263, term105263.getClass(), "levelTitle", "xxx");
        setIntField(term105263, term105263.getClass(), "plateId", -1);
        setIntField(term105263, term105263.getClass(), "plateEffectId", -1);
        setField(term105263, term105263.getClass(), "passwordStatus", enum226);
        setField(term105263, term105263.getClass(), "password", "**********");
        setBooleanField(term105263, term105263.getClass(), "preferPerPvModule", true);
        setBooleanField(term105263, term105263.getClass(), "preferCommonModule", false);
        setBooleanField(term105263, term105263.getClass(), "usePerPvSkin", true);
        setBooleanField(term105263, term105263.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term105263, term105263.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term105263, term105263.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term105263, term105263.getClass(), "usePerPvTouchSliderSe", false);
        setField(term105263, term105263.getClass(), "commonModule", "-999,-999,-999");
        setField(term105263, term105263.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term105387, term105387.getClass(), "year", 2026);
        setShortField(term105387, term105387.getClass(), "month", (short) 8);
        setShortField(term105387, term105387.getClass(), "day", (short) 12);
        setField(term105386, term105386.getClass(), "date", term105387);
        setByteField(term105391, term105391.getClass(), "hour", (byte) 2);
        setByteField(term105391, term105391.getClass(), "minute", (byte) 2);
        setByteField(term105391, term105391.getClass(), "second", (byte) 43);
        setIntField(term105391, term105391.getClass(), "nano", 615658000);
        setField(term105386, term105386.getClass(), "time", term105391);
        setField(term105263, term105263.getClass(), "commonModuleSetTime", term105386);
        setField(term105263, term105263.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term105263, term105263.getClass(), "commonSkin", -1);
        setIntField(term105263, term105263.getClass(), "headphoneVolume", 100);
        setBooleanField(term105263, term105263.getClass(), "buttonSeOn", true);
        setIntField(term105263, term105263.getClass(), "buttonSeVolume", 100);
        setIntField(term105263, term105263.getClass(), "sliderSeVolume", 100);
        setIntField(term105263, term105263.getClass(), "buttonSe", -1);
        setIntField(term105263, term105263.getClass(), "chainSlideSe", -1);
        setIntField(term105263, term105263.getClass(), "slideSe", -1);
        setIntField(term105263, term105263.getClass(), "sliderTouchSe", -1);
        setField(term105263, term105263.getClass(), "sortMode", enum227);
        setIntField(term105263, term105263.getClass(), "nextPvId", -1);
        setField(term105263, term105263.getClass(), "nextDifficulty", enum228);
        setField(term105263, term105263.getClass(), "nextEdition", enum229);
        setBooleanField(term105263, term105263.getClass(), "showInterimRanking", true);
        setBooleanField(term105263, term105263.getClass(), "showClearStatus", true);
        setBooleanField(term105263, term105263.getClass(), "showGreatBorder", true);
        setBooleanField(term105263, term105263.getClass(), "showExcellentBorder", true);
        setBooleanField(term105263, term105263.getClass(), "showRivalBorder", true);
        setBooleanField(term105263, term105263.getClass(), "showRgoSetting", true);
        setBooleanField(term105263, term105263.getClass(), "contestNowPlayingEnable", true);
        setIntField(term105263, term105263.getClass(), "contestNowPlayingId", -1);
        setIntField(term105263, term105263.getClass(), "contestNowPlayingValue", -1);
        setField(term105263, term105263.getClass(), "contestNowPlayingResultRank", enum230);
        setField(term105263, term105263.getClass(), "contestNowPlayingSpecifier", "");
        setField(term105263, term105263.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term105263, term105263.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term105263, term105263.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term105263, term105263.getClass(), "rivalPdId", -1);
        setField(term105261, term105261.getClass(), "pdId", term105263);
        setIntField(term105261, term105261.getClass(), "pvId", -509349195);
        setField(term105261, term105261.getClass(), "difficulty", enum228);
        setField(term105261, term105261.getClass(), "edition", enum229);
        setIntField(term105261, term105261.getClass(), "scriptVer", -1639041228);
        setIntField(term105261, term105261.getClass(), "score", 2027686272);
        setField(term105261, term105261.getClass(), "challengeKind", enum231);
        setIntField(term105261, term105261.getClass(), "challengeResult", -1494356104);
        setField(term105261, term105261.getClass(), "clearResult", enum232);
        setIntField(term105261, term105261.getClass(), "vp", -695279311);
        setIntField(term105261, term105261.getClass(), "coolCount", 114279242);
        setIntField(term105261, term105261.getClass(), "coolPercent", 990883365);
        setIntField(term105261, term105261.getClass(), "fineCount", 633598642);
        setIntField(term105261, term105261.getClass(), "finePercent", 1862841859);
        setIntField(term105261, term105261.getClass(), "safeCount", -1114668574);
        setIntField(term105261, term105261.getClass(), "safePercent", 514511037);
        setIntField(term105261, term105261.getClass(), "sadCount", 1713573821);
        setIntField(term105261, term105261.getClass(), "sadPercent", 1956590498);
        setIntField(term105261, term105261.getClass(), "wrongCount", 1467356494);
        setIntField(term105261, term105261.getClass(), "wrongPercent", -26316536);
        setIntField(term105261, term105261.getClass(), "maxCombo", 1716165145);
        setIntField(term105261, term105261.getClass(), "chanceTime", 1692937831);
        setIntField(term105261, term105261.getClass(), "holdScore", -1539747985);
        setIntField(term105261, term105261.getClass(), "attainPoint", -1982489643);
        setIntField(term105261, term105261.getClass(), "skinId", 550892835);
        setIntField(term105261, term105261.getClass(), "buttonSe", 1237549886);
        setIntField(term105261, term105261.getClass(), "buttonSeVol", -1945635750);
        setIntField(term105261, term105261.getClass(), "sliderSe", -1622760744);
        setIntField(term105261, term105261.getClass(), "ChainSlideSe", 2068435279);
        setIntField(term105261, term105261.getClass(), "SliderTouchSe", -1556527718);
        setField(term105261, term105261.getClass(), "modules", "gGSMzuGICf");
        setIntField(term105261, term105261.getClass(), "stageCompletion", 895255351);
        setIntField(term105261, term105261.getClass(), "slideScore", -1317044799);
        setIntField(term105261, term105261.getClass(), "isVocalChange", -1428063820);
        setField(term105261, term105261.getClass(), "customizeItems", "hxCBltsObl");
        setField(term105261, term105261.getClass(), "rhythmGameOptions", "BndsHwAFMv");
        setIntField(term105261, term105261.getClass(), "screenShotCount", -1);
        setIntField(term105958, term105958.getClass(), "year", 2015);
        setShortField(term105958, term105958.getClass(), "month", (short) 9);
        setShortField(term105958, term105958.getClass(), "day", (short) 16);
        setField(term105957, term105957.getClass(), "date", term105958);
        setByteField(term105962, term105962.getClass(), "hour", (byte) 6);
        setByteField(term105962, term105962.getClass(), "minute", (byte) 19);
        setByteField(term105962, term105962.getClass(), "second", (byte) 42);
        setIntField(term105962, term105962.getClass(), "nano", 630084975);
        setField(term105957, term105957.getClass(), "time", term105962);
        setField(term105261, term105261.getClass(), "dateTime", term105957);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFineCount", argTypes, term105261, args);
    }

};


