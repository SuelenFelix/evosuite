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

public class PlayLog_setEdition_213918004744 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term214031;
     Object enum489;

    public PlayLog_setEdition_213918004744() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term214754 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term214753 = ((Class) term214754).getDeclaredField((String) "MISS");
        ((Field) term214753).setAccessible(true);
        Object enum482 = ((Field) term214753).get((Object) null);
        Class<? extends Object> term215131 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term215130 = ((Class) term215131).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term215130).setAccessible(true);
        Object enum483 = ((Field) term215130).get((Object) null);
        Class<? extends Object> term215414 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term215413 = ((Class) term215414).getDeclaredField((String) "NORMAL");
        ((Field) term215413).setAccessible(true);
        Object enum484 = ((Field) term215413).get((Object) null);
        Class<? extends Object> term215689 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term215688 = ((Class) term215689).getDeclaredField((String) "ORIGINAL");
        ((Field) term215688).setAccessible(true);
        Object enum485 = ((Field) term215688).get((Object) null);
        Class<? extends Object> term215955 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term215954 = ((Class) term215955).getDeclaredField((String) "NONE");
        ((Field) term215954).setAccessible(true);
        Object enum486 = ((Field) term215954).get((Object) null);
        Class<? extends Object> term216596 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ChallengeKind");
        Field term216595 = ((Class) term216596).getDeclaredField((String) "CLEAR");
        ((Field) term216595).setAccessible(true);
        Object enum487 = ((Field) term216595).get((Object) null);
        Class<? extends Object> term216883 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ClearResult");
        Field term216882 = ((Class) term216883).getDeclaredField((String) "EXCELLENT");
        ((Field) term216882).setAccessible(true);
        Object enum488 = ((Field) term216882).get((Object) null);
        term214031 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog"));
        Object term214033 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term214156 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term214157 = newInstance(Class.forName("java.time.LocalDate"));
        Object term214161 = newInstance(Class.forName("java.time.LocalTime"));
        Object term214727 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term214728 = newInstance(Class.forName("java.time.LocalDate"));
        Object term214732 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term214031, term214031.getClass(), "id", -4023935540989049732L);
        setLongField(term214033, term214033.getClass(), "id", 855932984568615096L);
        setIntField(term214033, term214033.getClass(), "pdId", 1641377218);
        setField(term214033, term214033.getClass(), "playerName", "xxx");
        setIntField(term214033, term214033.getClass(), "vocaloidPoints", 300);
        setIntField(term214033, term214033.getClass(), "level", 1);
        setIntField(term214033, term214033.getClass(), "levelExp", 1235375204);
        setField(term214033, term214033.getClass(), "levelTitle", "xxx");
        setIntField(term214033, term214033.getClass(), "plateId", -1);
        setIntField(term214033, term214033.getClass(), "plateEffectId", -1);
        setField(term214033, term214033.getClass(), "passwordStatus", enum482);
        setField(term214033, term214033.getClass(), "password", "**********");
        setBooleanField(term214033, term214033.getClass(), "preferPerPvModule", true);
        setBooleanField(term214033, term214033.getClass(), "preferCommonModule", true);
        setBooleanField(term214033, term214033.getClass(), "usePerPvSkin", true);
        setBooleanField(term214033, term214033.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term214033, term214033.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term214033, term214033.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term214033, term214033.getClass(), "usePerPvTouchSliderSe", true);
        setField(term214033, term214033.getClass(), "commonModule", "-999,-999,-999");
        setField(term214033, term214033.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term214157, term214157.getClass(), "year", 2026);
        setShortField(term214157, term214157.getClass(), "month", (short) 8);
        setShortField(term214157, term214157.getClass(), "day", (short) 12);
        setField(term214156, term214156.getClass(), "date", term214157);
        setByteField(term214161, term214161.getClass(), "hour", (byte) 2);
        setByteField(term214161, term214161.getClass(), "minute", (byte) 2);
        setByteField(term214161, term214161.getClass(), "second", (byte) 51);
        setIntField(term214161, term214161.getClass(), "nano", 337731000);
        setField(term214156, term214156.getClass(), "time", term214161);
        setField(term214033, term214033.getClass(), "commonModuleSetTime", term214156);
        setField(term214033, term214033.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term214033, term214033.getClass(), "commonSkin", -1);
        setIntField(term214033, term214033.getClass(), "headphoneVolume", 100);
        setBooleanField(term214033, term214033.getClass(), "buttonSeOn", true);
        setIntField(term214033, term214033.getClass(), "buttonSeVolume", 100);
        setIntField(term214033, term214033.getClass(), "sliderSeVolume", 100);
        setIntField(term214033, term214033.getClass(), "buttonSe", -1);
        setIntField(term214033, term214033.getClass(), "chainSlideSe", -1);
        setIntField(term214033, term214033.getClass(), "slideSe", -1);
        setIntField(term214033, term214033.getClass(), "sliderTouchSe", -1);
        setField(term214033, term214033.getClass(), "sortMode", enum483);
        setIntField(term214033, term214033.getClass(), "nextPvId", -1);
        setField(term214033, term214033.getClass(), "nextDifficulty", enum484);
        setField(term214033, term214033.getClass(), "nextEdition", enum485);
        setBooleanField(term214033, term214033.getClass(), "showInterimRanking", true);
        setBooleanField(term214033, term214033.getClass(), "showClearStatus", true);
        setBooleanField(term214033, term214033.getClass(), "showGreatBorder", true);
        setBooleanField(term214033, term214033.getClass(), "showExcellentBorder", true);
        setBooleanField(term214033, term214033.getClass(), "showRivalBorder", true);
        setBooleanField(term214033, term214033.getClass(), "showRgoSetting", true);
        setBooleanField(term214033, term214033.getClass(), "contestNowPlayingEnable", false);
        setIntField(term214033, term214033.getClass(), "contestNowPlayingId", -1);
        setIntField(term214033, term214033.getClass(), "contestNowPlayingValue", -1);
        setField(term214033, term214033.getClass(), "contestNowPlayingResultRank", enum486);
        setField(term214033, term214033.getClass(), "contestNowPlayingSpecifier", "");
        setField(term214033, term214033.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term214033, term214033.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term214033, term214033.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term214033, term214033.getClass(), "rivalPdId", -1);
        setField(term214031, term214031.getClass(), "pdId", term214033);
        setIntField(term214031, term214031.getClass(), "pvId", 258334639);
        setField(term214031, term214031.getClass(), "difficulty", enum484);
        setField(term214031, term214031.getClass(), "edition", enum485);
        setIntField(term214031, term214031.getClass(), "scriptVer", 1432187207);
        setIntField(term214031, term214031.getClass(), "score", -91068927);
        setField(term214031, term214031.getClass(), "challengeKind", enum487);
        setIntField(term214031, term214031.getClass(), "challengeResult", 680714112);
        setField(term214031, term214031.getClass(), "clearResult", enum488);
        setIntField(term214031, term214031.getClass(), "vp", 385297023);
        setIntField(term214031, term214031.getClass(), "coolCount", -134092543);
        setIntField(term214031, term214031.getClass(), "coolPercent", -1703642288);
        setIntField(term214031, term214031.getClass(), "fineCount", 2075139747);
        setIntField(term214031, term214031.getClass(), "finePercent", 2092881418);
        setIntField(term214031, term214031.getClass(), "safeCount", 1732410866);
        setIntField(term214031, term214031.getClass(), "safePercent", 1084102599);
        setIntField(term214031, term214031.getClass(), "sadCount", -1743503755);
        setIntField(term214031, term214031.getClass(), "sadPercent", 1641342112);
        setIntField(term214031, term214031.getClass(), "wrongCount", -1551790945);
        setIntField(term214031, term214031.getClass(), "wrongPercent", 2039538484);
        setIntField(term214031, term214031.getClass(), "maxCombo", 1235736068);
        setIntField(term214031, term214031.getClass(), "chanceTime", 329424176);
        setIntField(term214031, term214031.getClass(), "holdScore", -1897199214);
        setIntField(term214031, term214031.getClass(), "attainPoint", -1016478729);
        setIntField(term214031, term214031.getClass(), "skinId", -206889003);
        setIntField(term214031, term214031.getClass(), "buttonSe", 638046409);
        setIntField(term214031, term214031.getClass(), "buttonSeVol", 427274898);
        setIntField(term214031, term214031.getClass(), "sliderSe", -1654552020);
        setIntField(term214031, term214031.getClass(), "ChainSlideSe", -1049546692);
        setIntField(term214031, term214031.getClass(), "SliderTouchSe", 1397781598);
        setField(term214031, term214031.getClass(), "modules", "xJgPlLxpgC");
        setIntField(term214031, term214031.getClass(), "stageCompletion", -44720365);
        setIntField(term214031, term214031.getClass(), "slideScore", 1963632911);
        setIntField(term214031, term214031.getClass(), "isVocalChange", -1100497683);
        setField(term214031, term214031.getClass(), "customizeItems", "EYtfuJaxiM");
        setField(term214031, term214031.getClass(), "rhythmGameOptions", "gCWtLVKVVe");
        setIntField(term214031, term214031.getClass(), "screenShotCount", -1);
        setIntField(term214728, term214728.getClass(), "year", 2027);
        setShortField(term214728, term214728.getClass(), "month", (short) 8);
        setShortField(term214728, term214728.getClass(), "day", (short) 23);
        setField(term214727, term214727.getClass(), "date", term214728);
        setByteField(term214732, term214732.getClass(), "hour", (byte) 15);
        setByteField(term214732, term214732.getClass(), "minute", (byte) 12);
        setByteField(term214732, term214732.getClass(), "second", (byte) 6);
        setIntField(term214732, term214732.getClass(), "nano", 541218258);
        setField(term214727, term214727.getClass(), "time", term214732);
        setField(term214031, term214031.getClass(), "dateTime", term214727);
        Class<? extends Object> term217202 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term217201 = ((Class) term217202).getDeclaredField((String) "EXTRA");
        ((Field) term217201).setAccessible(true);
        enum489 = ((Field) term217201).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.diva.model.common.Edition");
        Object[] args = new Object[1];
        args[0] = enum489;
        callMethod(klass, "setEdition", argTypes, term214031, args);
    }

};


