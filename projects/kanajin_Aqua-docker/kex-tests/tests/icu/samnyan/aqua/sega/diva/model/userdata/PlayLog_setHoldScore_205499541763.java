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

public class PlayLog_setHoldScore_205499541763 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term281412;
     Object term282123;

    public PlayLog_setHoldScore_205499541763() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term282132 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term282131 = ((Class) term282132).getDeclaredField((String) "MISS");
        ((Field) term282131).setAccessible(true);
        Object enum641 = ((Field) term282131).get((Object) null);
        Class<? extends Object> term282509 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term282508 = ((Class) term282509).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term282508).setAccessible(true);
        Object enum642 = ((Field) term282508).get((Object) null);
        Class<? extends Object> term282792 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term282791 = ((Class) term282792).getDeclaredField((String) "NORMAL");
        ((Field) term282791).setAccessible(true);
        Object enum643 = ((Field) term282791).get((Object) null);
        Class<? extends Object> term283067 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term283066 = ((Class) term283067).getDeclaredField((String) "ORIGINAL");
        ((Field) term283066).setAccessible(true);
        Object enum644 = ((Field) term283066).get((Object) null);
        Class<? extends Object> term283333 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term283332 = ((Class) term283333).getDeclaredField((String) "NONE");
        ((Field) term283332).setAccessible(true);
        Object enum645 = ((Field) term283332).get((Object) null);
        Class<? extends Object> term283974 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term283973 = ((Class) term283974).getDeclaredField((String) "EASY");
        ((Field) term283973).setAccessible(true);
        Object enum646 = ((Field) term283973).get((Object) null);
        Class<? extends Object> term284243 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ChallengeKind");
        Field term284242 = ((Class) term284243).getDeclaredField((String) "CLEAR");
        ((Field) term284242).setAccessible(true);
        Object enum647 = ((Field) term284242).get((Object) null);
        Class<? extends Object> term284530 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ClearResult");
        Field term284529 = ((Class) term284530).getDeclaredField((String) "CHEAP");
        ((Field) term284529).setAccessible(true);
        Object enum648 = ((Field) term284529).get((Object) null);
        term281412 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog"));
        Object term281414 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term281537 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term281538 = newInstance(Class.forName("java.time.LocalDate"));
        Object term281542 = newInstance(Class.forName("java.time.LocalTime"));
        Object term282113 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term282114 = newInstance(Class.forName("java.time.LocalDate"));
        Object term282118 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term281412, term281412.getClass(), "id", -3730936709704460408L);
        setLongField(term281414, term281414.getClass(), "id", -8614778293741404325L);
        setIntField(term281414, term281414.getClass(), "pdId", 493657684);
        setField(term281414, term281414.getClass(), "playerName", "xxx");
        setIntField(term281414, term281414.getClass(), "vocaloidPoints", 300);
        setIntField(term281414, term281414.getClass(), "level", 1);
        setIntField(term281414, term281414.getClass(), "levelExp", 1882655922);
        setField(term281414, term281414.getClass(), "levelTitle", "xxx");
        setIntField(term281414, term281414.getClass(), "plateId", -1);
        setIntField(term281414, term281414.getClass(), "plateEffectId", -1);
        setField(term281414, term281414.getClass(), "passwordStatus", enum641);
        setField(term281414, term281414.getClass(), "password", "**********");
        setBooleanField(term281414, term281414.getClass(), "preferPerPvModule", true);
        setBooleanField(term281414, term281414.getClass(), "preferCommonModule", true);
        setBooleanField(term281414, term281414.getClass(), "usePerPvSkin", true);
        setBooleanField(term281414, term281414.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term281414, term281414.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term281414, term281414.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term281414, term281414.getClass(), "usePerPvTouchSliderSe", true);
        setField(term281414, term281414.getClass(), "commonModule", "-999,-999,-999");
        setField(term281414, term281414.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term281538, term281538.getClass(), "year", 2026);
        setShortField(term281538, term281538.getClass(), "month", (short) 6);
        setShortField(term281538, term281538.getClass(), "day", (short) 29);
        setField(term281537, term281537.getClass(), "date", term281538);
        setByteField(term281542, term281542.getClass(), "hour", (byte) 4);
        setByteField(term281542, term281542.getClass(), "minute", (byte) 27);
        setByteField(term281542, term281542.getClass(), "second", (byte) 39);
        setIntField(term281542, term281542.getClass(), "nano", 685472000);
        setField(term281537, term281537.getClass(), "time", term281542);
        setField(term281414, term281414.getClass(), "commonModuleSetTime", term281537);
        setField(term281414, term281414.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term281414, term281414.getClass(), "commonSkin", -1);
        setIntField(term281414, term281414.getClass(), "headphoneVolume", 100);
        setBooleanField(term281414, term281414.getClass(), "buttonSeOn", true);
        setIntField(term281414, term281414.getClass(), "buttonSeVolume", 100);
        setIntField(term281414, term281414.getClass(), "sliderSeVolume", 100);
        setIntField(term281414, term281414.getClass(), "buttonSe", -1);
        setIntField(term281414, term281414.getClass(), "chainSlideSe", -1);
        setIntField(term281414, term281414.getClass(), "slideSe", -1);
        setIntField(term281414, term281414.getClass(), "sliderTouchSe", -1);
        setField(term281414, term281414.getClass(), "sortMode", enum642);
        setIntField(term281414, term281414.getClass(), "nextPvId", -1);
        setField(term281414, term281414.getClass(), "nextDifficulty", enum643);
        setField(term281414, term281414.getClass(), "nextEdition", enum644);
        setBooleanField(term281414, term281414.getClass(), "showInterimRanking", true);
        setBooleanField(term281414, term281414.getClass(), "showClearStatus", true);
        setBooleanField(term281414, term281414.getClass(), "showGreatBorder", true);
        setBooleanField(term281414, term281414.getClass(), "showExcellentBorder", true);
        setBooleanField(term281414, term281414.getClass(), "showRivalBorder", true);
        setBooleanField(term281414, term281414.getClass(), "showRgoSetting", true);
        setBooleanField(term281414, term281414.getClass(), "contestNowPlayingEnable", true);
        setIntField(term281414, term281414.getClass(), "contestNowPlayingId", -1);
        setIntField(term281414, term281414.getClass(), "contestNowPlayingValue", -1);
        setField(term281414, term281414.getClass(), "contestNowPlayingResultRank", enum645);
        setField(term281414, term281414.getClass(), "contestNowPlayingSpecifier", "");
        setField(term281414, term281414.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term281414, term281414.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term281414, term281414.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term281414, term281414.getClass(), "rivalPdId", -1);
        setField(term281412, term281412.getClass(), "pdId", term281414);
        setIntField(term281412, term281412.getClass(), "pvId", 1314996390);
        setField(term281412, term281412.getClass(), "difficulty", enum646);
        setField(term281412, term281412.getClass(), "edition", enum644);
        setIntField(term281412, term281412.getClass(), "scriptVer", 1367703658);
        setIntField(term281412, term281412.getClass(), "score", 1120153100);
        setField(term281412, term281412.getClass(), "challengeKind", enum647);
        setIntField(term281412, term281412.getClass(), "challengeResult", 158801111);
        setField(term281412, term281412.getClass(), "clearResult", enum648);
        setIntField(term281412, term281412.getClass(), "vp", 464966803);
        setIntField(term281412, term281412.getClass(), "coolCount", -246618392);
        setIntField(term281412, term281412.getClass(), "coolPercent", 1472246167);
        setIntField(term281412, term281412.getClass(), "fineCount", 1008555478);
        setIntField(term281412, term281412.getClass(), "finePercent", 1346386442);
        setIntField(term281412, term281412.getClass(), "safeCount", 1904559758);
        setIntField(term281412, term281412.getClass(), "safePercent", 610850630);
        setIntField(term281412, term281412.getClass(), "sadCount", 170509161);
        setIntField(term281412, term281412.getClass(), "sadPercent", 491497994);
        setIntField(term281412, term281412.getClass(), "wrongCount", 1997288643);
        setIntField(term281412, term281412.getClass(), "wrongPercent", -378961519);
        setIntField(term281412, term281412.getClass(), "maxCombo", -400280008);
        setIntField(term281412, term281412.getClass(), "chanceTime", -1191957775);
        setIntField(term281412, term281412.getClass(), "holdScore", 14181775);
        setIntField(term281412, term281412.getClass(), "attainPoint", 667778327);
        setIntField(term281412, term281412.getClass(), "skinId", 395074450);
        setIntField(term281412, term281412.getClass(), "buttonSe", -2028511200);
        setIntField(term281412, term281412.getClass(), "buttonSeVol", 1415605360);
        setIntField(term281412, term281412.getClass(), "sliderSe", 896275171);
        setIntField(term281412, term281412.getClass(), "ChainSlideSe", 466010);
        setIntField(term281412, term281412.getClass(), "SliderTouchSe", -169463842);
        setField(term281412, term281412.getClass(), "modules", "vKQukfbJUd");
        setIntField(term281412, term281412.getClass(), "stageCompletion", -2106837394);
        setIntField(term281412, term281412.getClass(), "slideScore", -533202192);
        setIntField(term281412, term281412.getClass(), "isVocalChange", -1349617857);
        setField(term281412, term281412.getClass(), "customizeItems", "lFRJFUMVbx");
        setField(term281412, term281412.getClass(), "rhythmGameOptions", "sZdUNdggUW");
        setIntField(term281412, term281412.getClass(), "screenShotCount", -1);
        setIntField(term282114, term282114.getClass(), "year", 2027);
        setShortField(term282114, term282114.getClass(), "month", (short) 7);
        setShortField(term282114, term282114.getClass(), "day", (short) 23);
        setField(term282113, term282113.getClass(), "date", term282114);
        setByteField(term282118, term282118.getClass(), "hour", (byte) 12);
        setByteField(term282118, term282118.getClass(), "minute", (byte) 6);
        setByteField(term282118, term282118.getClass(), "second", (byte) 19);
        setIntField(term282118, term282118.getClass(), "nano", 8025683);
        setField(term282113, term282113.getClass(), "time", term282118);
        setField(term281412, term281412.getClass(), "dateTime", term282113);
        term282123 = new Integer(1346331516);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term282123;
        callMethod(klass, "setHoldScore", argTypes, term281412, args);
    }

};


