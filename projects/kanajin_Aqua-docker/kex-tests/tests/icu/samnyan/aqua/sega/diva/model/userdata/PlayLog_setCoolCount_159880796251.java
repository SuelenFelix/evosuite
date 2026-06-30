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

public class PlayLog_setCoolCount_159880796251 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term239261;
     Object term239993;

    public PlayLog_setCoolCount_159880796251() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term240002 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term240001 = ((Class) term240002).getDeclaredField((String) "MISS");
        ((Field) term240001).setAccessible(true);
        Object enum542 = ((Field) term240001).get((Object) null);
        Class<? extends Object> term240379 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term240378 = ((Class) term240379).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term240378).setAccessible(true);
        Object enum543 = ((Field) term240378).get((Object) null);
        Class<? extends Object> term240662 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term240661 = ((Class) term240662).getDeclaredField((String) "NORMAL");
        ((Field) term240661).setAccessible(true);
        Object enum544 = ((Field) term240661).get((Object) null);
        Class<? extends Object> term240937 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term240936 = ((Class) term240937).getDeclaredField((String) "ORIGINAL");
        ((Field) term240936).setAccessible(true);
        Object enum545 = ((Field) term240936).get((Object) null);
        Class<? extends Object> term241203 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term241202 = ((Class) term241203).getDeclaredField((String) "NONE");
        ((Field) term241202).setAccessible(true);
        Object enum546 = ((Field) term241202).get((Object) null);
        Class<? extends Object> term241844 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term241843 = ((Class) term241844).getDeclaredField((String) "EXTREME");
        ((Field) term241843).setAccessible(true);
        Object enum547 = ((Field) term241843).get((Object) null);
        Class<? extends Object> term242122 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term242121 = ((Class) term242122).getDeclaredField((String) "EXTRA");
        ((Field) term242121).setAccessible(true);
        Object enum548 = ((Field) term242121).get((Object) null);
        Class<? extends Object> term242379 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ChallengeKind");
        Field term242378 = ((Class) term242379).getDeclaredField((String) "COMPLETED");
        ((Field) term242378).setAccessible(true);
        Object enum549 = ((Field) term242378).get((Object) null);
        Class<? extends Object> term242678 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ClearResult");
        Field term242677 = ((Class) term242678).getDeclaredField((String) "MISS_TAKE");
        ((Field) term242677).setAccessible(true);
        Object enum550 = ((Field) term242677).get((Object) null);
        term239261 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog"));
        Object term239263 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term239386 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term239387 = newInstance(Class.forName("java.time.LocalDate"));
        Object term239391 = newInstance(Class.forName("java.time.LocalTime"));
        Object term239983 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term239984 = newInstance(Class.forName("java.time.LocalDate"));
        Object term239988 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term239261, term239261.getClass(), "id", 138235087558060686L);
        setLongField(term239263, term239263.getClass(), "id", 5381386339318883012L);
        setIntField(term239263, term239263.getClass(), "pdId", -970417907);
        setField(term239263, term239263.getClass(), "playerName", "xxx");
        setIntField(term239263, term239263.getClass(), "vocaloidPoints", 300);
        setIntField(term239263, term239263.getClass(), "level", 1);
        setIntField(term239263, term239263.getClass(), "levelExp", 1097894139);
        setField(term239263, term239263.getClass(), "levelTitle", "xxx");
        setIntField(term239263, term239263.getClass(), "plateId", -1);
        setIntField(term239263, term239263.getClass(), "plateEffectId", -1);
        setField(term239263, term239263.getClass(), "passwordStatus", enum542);
        setField(term239263, term239263.getClass(), "password", "**********");
        setBooleanField(term239263, term239263.getClass(), "preferPerPvModule", true);
        setBooleanField(term239263, term239263.getClass(), "preferCommonModule", false);
        setBooleanField(term239263, term239263.getClass(), "usePerPvSkin", false);
        setBooleanField(term239263, term239263.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term239263, term239263.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term239263, term239263.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term239263, term239263.getClass(), "usePerPvTouchSliderSe", false);
        setField(term239263, term239263.getClass(), "commonModule", "-999,-999,-999");
        setField(term239263, term239263.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term239387, term239387.getClass(), "year", 2026);
        setShortField(term239387, term239387.getClass(), "month", (short) 6);
        setShortField(term239387, term239387.getClass(), "day", (short) 29);
        setField(term239386, term239386.getClass(), "date", term239387);
        setByteField(term239391, term239391.getClass(), "hour", (byte) 4);
        setByteField(term239391, term239391.getClass(), "minute", (byte) 27);
        setByteField(term239391, term239391.getClass(), "second", (byte) 36);
        setIntField(term239391, term239391.getClass(), "nano", 623078000);
        setField(term239386, term239386.getClass(), "time", term239391);
        setField(term239263, term239263.getClass(), "commonModuleSetTime", term239386);
        setField(term239263, term239263.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term239263, term239263.getClass(), "commonSkin", -1);
        setIntField(term239263, term239263.getClass(), "headphoneVolume", 100);
        setBooleanField(term239263, term239263.getClass(), "buttonSeOn", true);
        setIntField(term239263, term239263.getClass(), "buttonSeVolume", 100);
        setIntField(term239263, term239263.getClass(), "sliderSeVolume", 100);
        setIntField(term239263, term239263.getClass(), "buttonSe", -1);
        setIntField(term239263, term239263.getClass(), "chainSlideSe", -1);
        setIntField(term239263, term239263.getClass(), "slideSe", -1);
        setIntField(term239263, term239263.getClass(), "sliderTouchSe", -1);
        setField(term239263, term239263.getClass(), "sortMode", enum543);
        setIntField(term239263, term239263.getClass(), "nextPvId", -1);
        setField(term239263, term239263.getClass(), "nextDifficulty", enum544);
        setField(term239263, term239263.getClass(), "nextEdition", enum545);
        setBooleanField(term239263, term239263.getClass(), "showInterimRanking", true);
        setBooleanField(term239263, term239263.getClass(), "showClearStatus", true);
        setBooleanField(term239263, term239263.getClass(), "showGreatBorder", true);
        setBooleanField(term239263, term239263.getClass(), "showExcellentBorder", true);
        setBooleanField(term239263, term239263.getClass(), "showRivalBorder", true);
        setBooleanField(term239263, term239263.getClass(), "showRgoSetting", true);
        setBooleanField(term239263, term239263.getClass(), "contestNowPlayingEnable", false);
        setIntField(term239263, term239263.getClass(), "contestNowPlayingId", -1);
        setIntField(term239263, term239263.getClass(), "contestNowPlayingValue", -1);
        setField(term239263, term239263.getClass(), "contestNowPlayingResultRank", enum546);
        setField(term239263, term239263.getClass(), "contestNowPlayingSpecifier", "");
        setField(term239263, term239263.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term239263, term239263.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term239263, term239263.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term239263, term239263.getClass(), "rivalPdId", -1);
        setField(term239261, term239261.getClass(), "pdId", term239263);
        setIntField(term239261, term239261.getClass(), "pvId", 390256347);
        setField(term239261, term239261.getClass(), "difficulty", enum547);
        setField(term239261, term239261.getClass(), "edition", enum548);
        setIntField(term239261, term239261.getClass(), "scriptVer", 1471619998);
        setIntField(term239261, term239261.getClass(), "score", -1623489521);
        setField(term239261, term239261.getClass(), "challengeKind", enum549);
        setIntField(term239261, term239261.getClass(), "challengeResult", 1179937517);
        setField(term239261, term239261.getClass(), "clearResult", enum550);
        setIntField(term239261, term239261.getClass(), "vp", 200150950);
        setIntField(term239261, term239261.getClass(), "coolCount", -366198044);
        setIntField(term239261, term239261.getClass(), "coolPercent", -1350380769);
        setIntField(term239261, term239261.getClass(), "fineCount", -1432215030);
        setIntField(term239261, term239261.getClass(), "finePercent", 1233186320);
        setIntField(term239261, term239261.getClass(), "safeCount", -1303269101);
        setIntField(term239261, term239261.getClass(), "safePercent", 1435572720);
        setIntField(term239261, term239261.getClass(), "sadCount", 1437618365);
        setIntField(term239261, term239261.getClass(), "sadPercent", 1122535239);
        setIntField(term239261, term239261.getClass(), "wrongCount", 1158923260);
        setIntField(term239261, term239261.getClass(), "wrongPercent", 1633508772);
        setIntField(term239261, term239261.getClass(), "maxCombo", -545275970);
        setIntField(term239261, term239261.getClass(), "chanceTime", 1355471365);
        setIntField(term239261, term239261.getClass(), "holdScore", -1746962742);
        setIntField(term239261, term239261.getClass(), "attainPoint", -575810668);
        setIntField(term239261, term239261.getClass(), "skinId", 256028547);
        setIntField(term239261, term239261.getClass(), "buttonSe", -750603024);
        setIntField(term239261, term239261.getClass(), "buttonSeVol", 1255234202);
        setIntField(term239261, term239261.getClass(), "sliderSe", -223786928);
        setIntField(term239261, term239261.getClass(), "ChainSlideSe", 1703103733);
        setIntField(term239261, term239261.getClass(), "SliderTouchSe", 1057562436);
        setField(term239261, term239261.getClass(), "modules", "VYkqXKVlAJ");
        setIntField(term239261, term239261.getClass(), "stageCompletion", 646610000);
        setIntField(term239261, term239261.getClass(), "slideScore", 2003399396);
        setIntField(term239261, term239261.getClass(), "isVocalChange", 1223703911);
        setField(term239261, term239261.getClass(), "customizeItems", "XkIoWJRNwN");
        setField(term239261, term239261.getClass(), "rhythmGameOptions", "aNWLJdrZMq");
        setIntField(term239261, term239261.getClass(), "screenShotCount", -1);
        setIntField(term239984, term239984.getClass(), "year", 2012);
        setShortField(term239984, term239984.getClass(), "month", (short) 7);
        setShortField(term239984, term239984.getClass(), "day", (short) 21);
        setField(term239983, term239983.getClass(), "date", term239984);
        setByteField(term239988, term239988.getClass(), "hour", (byte) 13);
        setByteField(term239988, term239988.getClass(), "minute", (byte) 41);
        setByteField(term239988, term239988.getClass(), "second", (byte) 44);
        setIntField(term239988, term239988.getClass(), "nano", 394467282);
        setField(term239983, term239983.getClass(), "time", term239988);
        setField(term239261, term239261.getClass(), "dateTime", term239983);
        term239993 = new Integer(-1824905298);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term239993;
        callMethod(klass, "setCoolCount", argTypes, term239261, args);
    }

};


