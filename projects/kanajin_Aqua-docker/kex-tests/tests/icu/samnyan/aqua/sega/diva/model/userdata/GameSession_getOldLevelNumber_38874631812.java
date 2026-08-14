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

public class GameSession_getOldLevelNumber_38874631812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term390805;

    public GameSession_getOldLevelNumber_38874631812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term391465 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term391464 = ((Class) term391465).getDeclaredField((String) "MISS");
        ((Field) term391464).setAccessible(true);
        Object enum884 = ((Field) term391464).get((Object) null);
        Class<? extends Object> term391842 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term391841 = ((Class) term391842).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term391841).setAccessible(true);
        Object enum885 = ((Field) term391841).get((Object) null);
        Class<? extends Object> term392125 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term392124 = ((Class) term392125).getDeclaredField((String) "NORMAL");
        ((Field) term392124).setAccessible(true);
        Object enum886 = ((Field) term392124).get((Object) null);
        Class<? extends Object> term392400 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term392399 = ((Class) term392400).getDeclaredField((String) "ORIGINAL");
        ((Field) term392399).setAccessible(true);
        Object enum887 = ((Field) term392399).get((Object) null);
        Class<? extends Object> term392666 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term392665 = ((Class) term392666).getDeclaredField((String) "NONE");
        ((Field) term392665).setAccessible(true);
        Object enum888 = ((Field) term392665).get((Object) null);
        Class<? extends Object> term393307 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.StartMode");
        Field term393306 = ((Class) term393307).getDeclaredField((String) "START");
        ((Field) term393306).setAccessible(true);
        Object enum889 = ((Field) term393306).get((Object) null);
        Integer term391442 = new Integer(-1034506028);
        Integer term391444 = new Integer(-1263114719);
        Integer term391446 = new Integer(-894662986);
        Integer term391448 = new Integer(304775596);
        Integer term391450 = new Integer(-1347665717);
        Integer term391452 = new Integer(-1888585309);
        Integer term391454 = new Integer(683666002);
        Integer term391456 = new Integer(1596213415);
        term390805 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.GameSession"));
        Object term390808 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term390931 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term390932 = newInstance(Class.forName("java.time.LocalDate"));
        Object term390936 = newInstance(Class.forName("java.time.LocalTime"));
        Object term391422 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term391423 = newInstance(Class.forName("java.time.LocalDate"));
        Object term391427 = newInstance(Class.forName("java.time.LocalTime"));
        Object term391432 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term391433 = newInstance(Class.forName("java.time.LocalDate"));
        Object term391437 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term390805, term390805.getClass(), "id", 1044883697493326351L);
        setIntField(term390805, term390805.getClass(), "acceptId", 55419591);
        setLongField(term390808, term390808.getClass(), "id", -7406618974062419277L);
        setIntField(term390808, term390808.getClass(), "pdId", 1020931980);
        setField(term390808, term390808.getClass(), "playerName", "xxx");
        setIntField(term390808, term390808.getClass(), "vocaloidPoints", 300);
        setIntField(term390808, term390808.getClass(), "level", 1);
        setIntField(term390808, term390808.getClass(), "levelExp", -1435032444);
        setField(term390808, term390808.getClass(), "levelTitle", "xxx");
        setIntField(term390808, term390808.getClass(), "plateId", -1);
        setIntField(term390808, term390808.getClass(), "plateEffectId", -1);
        setField(term390808, term390808.getClass(), "passwordStatus", enum884);
        setField(term390808, term390808.getClass(), "password", "**********");
        setBooleanField(term390808, term390808.getClass(), "preferPerPvModule", true);
        setBooleanField(term390808, term390808.getClass(), "preferCommonModule", true);
        setBooleanField(term390808, term390808.getClass(), "usePerPvSkin", false);
        setBooleanField(term390808, term390808.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term390808, term390808.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term390808, term390808.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term390808, term390808.getClass(), "usePerPvTouchSliderSe", false);
        setField(term390808, term390808.getClass(), "commonModule", "-999,-999,-999");
        setField(term390808, term390808.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term390932, term390932.getClass(), "year", 2026);
        setShortField(term390932, term390932.getClass(), "month", (short) 8);
        setShortField(term390932, term390932.getClass(), "day", (short) 12);
        setField(term390931, term390931.getClass(), "date", term390932);
        setByteField(term390936, term390936.getClass(), "hour", (byte) 2);
        setByteField(term390936, term390936.getClass(), "minute", (byte) 3);
        setByteField(term390936, term390936.getClass(), "second", (byte) 24);
        setIntField(term390936, term390936.getClass(), "nano", 793585000);
        setField(term390931, term390931.getClass(), "time", term390936);
        setField(term390808, term390808.getClass(), "commonModuleSetTime", term390931);
        setField(term390808, term390808.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term390808, term390808.getClass(), "commonSkin", -1);
        setIntField(term390808, term390808.getClass(), "headphoneVolume", 100);
        setBooleanField(term390808, term390808.getClass(), "buttonSeOn", true);
        setIntField(term390808, term390808.getClass(), "buttonSeVolume", 100);
        setIntField(term390808, term390808.getClass(), "sliderSeVolume", 100);
        setIntField(term390808, term390808.getClass(), "buttonSe", -1);
        setIntField(term390808, term390808.getClass(), "chainSlideSe", -1);
        setIntField(term390808, term390808.getClass(), "slideSe", -1);
        setIntField(term390808, term390808.getClass(), "sliderTouchSe", -1);
        setField(term390808, term390808.getClass(), "sortMode", enum885);
        setIntField(term390808, term390808.getClass(), "nextPvId", -1);
        setField(term390808, term390808.getClass(), "nextDifficulty", enum886);
        setField(term390808, term390808.getClass(), "nextEdition", enum887);
        setBooleanField(term390808, term390808.getClass(), "showInterimRanking", true);
        setBooleanField(term390808, term390808.getClass(), "showClearStatus", true);
        setBooleanField(term390808, term390808.getClass(), "showGreatBorder", true);
        setBooleanField(term390808, term390808.getClass(), "showExcellentBorder", true);
        setBooleanField(term390808, term390808.getClass(), "showRivalBorder", true);
        setBooleanField(term390808, term390808.getClass(), "showRgoSetting", true);
        setBooleanField(term390808, term390808.getClass(), "contestNowPlayingEnable", false);
        setIntField(term390808, term390808.getClass(), "contestNowPlayingId", -1);
        setIntField(term390808, term390808.getClass(), "contestNowPlayingValue", -1);
        setField(term390808, term390808.getClass(), "contestNowPlayingResultRank", enum888);
        setField(term390808, term390808.getClass(), "contestNowPlayingSpecifier", "");
        setField(term390808, term390808.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term390808, term390808.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term390808, term390808.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term390808, term390808.getClass(), "rivalPdId", -1);
        setField(term390805, term390805.getClass(), "pdId", term390808);
        setField(term390805, term390805.getClass(), "startMode", enum889);
        setIntField(term391423, term391423.getClass(), "year", 2028);
        setShortField(term391423, term391423.getClass(), "month", (short) 1);
        setShortField(term391423, term391423.getClass(), "day", (short) 11);
        setField(term391422, term391422.getClass(), "date", term391423);
        setByteField(term391427, term391427.getClass(), "hour", (byte) 22);
        setByteField(term391427, term391427.getClass(), "minute", (byte) 3);
        setByteField(term391427, term391427.getClass(), "second", (byte) 39);
        setIntField(term391427, term391427.getClass(), "nano", 175567313);
        setField(term391422, term391422.getClass(), "time", term391427);
        setField(term390805, term390805.getClass(), "startTime", term391422);
        setIntField(term391433, term391433.getClass(), "year", 2028);
        setShortField(term391433, term391433.getClass(), "month", (short) 4);
        setShortField(term391433, term391433.getClass(), "day", (short) 11);
        setField(term391432, term391432.getClass(), "date", term391433);
        setByteField(term391437, term391437.getClass(), "hour", (byte) 4);
        setByteField(term391437, term391437.getClass(), "minute", (byte) 45);
        setByteField(term391437, term391437.getClass(), "second", (byte) 2);
        setIntField(term391437, term391437.getClass(), "nano", 374177968);
        setField(term391432, term391432.getClass(), "time", term391437);
        setField(term390805, term390805.getClass(), "lastUpdateTime", term391432);
        setField(term390805, term390805.getClass(), "stageIndex", term391442);
        setField(term390805, term390805.getClass(), "stageResultIndex", term391444);
        setField(term390805, term390805.getClass(), "lastPvId", term391446);
        setField(term390805, term390805.getClass(), "levelNumber", term391448);
        setField(term390805, term390805.getClass(), "levelExp", term391450);
        setField(term390805, term390805.getClass(), "oldLevelNumber", term391452);
        setField(term390805, term390805.getClass(), "oldLevelExp", term391454);
        setField(term390805, term390805.getClass(), "vp", term391456);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.GameSession");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOldLevelNumber", argTypes, term390805, args);
    }

};


