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

public class GameSession_setLevelNumber_84233901124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term425470;
     Object term426127;

    public GameSession_setLevelNumber_84233901124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term426136 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term426135 = ((Class) term426136).getDeclaredField((String) "MISS");
        ((Field) term426135).setAccessible(true);
        Object enum957 = ((Field) term426135).get((Object) null);
        Class<? extends Object> term426513 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term426512 = ((Class) term426513).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term426512).setAccessible(true);
        Object enum958 = ((Field) term426512).get((Object) null);
        Class<? extends Object> term426796 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term426795 = ((Class) term426796).getDeclaredField((String) "NORMAL");
        ((Field) term426795).setAccessible(true);
        Object enum959 = ((Field) term426795).get((Object) null);
        Class<? extends Object> term427071 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term427070 = ((Class) term427071).getDeclaredField((String) "ORIGINAL");
        ((Field) term427070).setAccessible(true);
        Object enum960 = ((Field) term427070).get((Object) null);
        Class<? extends Object> term427337 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term427336 = ((Class) term427337).getDeclaredField((String) "NONE");
        ((Field) term427336).setAccessible(true);
        Object enum961 = ((Field) term427336).get((Object) null);
        Class<? extends Object> term427978 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.StartMode");
        Field term427977 = ((Class) term427978).getDeclaredField((String) "PRE_START");
        ((Field) term427977).setAccessible(true);
        Object enum962 = ((Field) term427977).get((Object) null);
        Integer term426111 = new Integer(-1410220680);
        Integer term426113 = new Integer(389427431);
        Integer term426115 = new Integer(-1945706126);
        Integer term426117 = new Integer(1152356969);
        Integer term426119 = new Integer(-1667990367);
        Integer term426121 = new Integer(-1214628358);
        Integer term426123 = new Integer(1102721075);
        Integer term426125 = new Integer(-426764678);
        term425470 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.GameSession"));
        Object term425473 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term425596 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term425597 = newInstance(Class.forName("java.time.LocalDate"));
        Object term425601 = newInstance(Class.forName("java.time.LocalTime"));
        Object term426091 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term426092 = newInstance(Class.forName("java.time.LocalDate"));
        Object term426096 = newInstance(Class.forName("java.time.LocalTime"));
        Object term426101 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term426102 = newInstance(Class.forName("java.time.LocalDate"));
        Object term426106 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term425470, term425470.getClass(), "id", 8000844860910174690L);
        setIntField(term425470, term425470.getClass(), "acceptId", 1560346640);
        setLongField(term425473, term425473.getClass(), "id", 2209808079059619773L);
        setIntField(term425473, term425473.getClass(), "pdId", 100626332);
        setField(term425473, term425473.getClass(), "playerName", "xxx");
        setIntField(term425473, term425473.getClass(), "vocaloidPoints", 300);
        setIntField(term425473, term425473.getClass(), "level", 1);
        setIntField(term425473, term425473.getClass(), "levelExp", 763794722);
        setField(term425473, term425473.getClass(), "levelTitle", "xxx");
        setIntField(term425473, term425473.getClass(), "plateId", -1);
        setIntField(term425473, term425473.getClass(), "plateEffectId", -1);
        setField(term425473, term425473.getClass(), "passwordStatus", enum957);
        setField(term425473, term425473.getClass(), "password", "**********");
        setBooleanField(term425473, term425473.getClass(), "preferPerPvModule", true);
        setBooleanField(term425473, term425473.getClass(), "preferCommonModule", true);
        setBooleanField(term425473, term425473.getClass(), "usePerPvSkin", false);
        setBooleanField(term425473, term425473.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term425473, term425473.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term425473, term425473.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term425473, term425473.getClass(), "usePerPvTouchSliderSe", false);
        setField(term425473, term425473.getClass(), "commonModule", "-999,-999,-999");
        setField(term425473, term425473.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term425597, term425597.getClass(), "year", 2026);
        setShortField(term425597, term425597.getClass(), "month", (short) 8);
        setShortField(term425597, term425597.getClass(), "day", (short) 12);
        setField(term425596, term425596.getClass(), "date", term425597);
        setByteField(term425601, term425601.getClass(), "hour", (byte) 2);
        setByteField(term425601, term425601.getClass(), "minute", (byte) 3);
        setByteField(term425601, term425601.getClass(), "second", (byte) 27);
        setIntField(term425601, term425601.getClass(), "nano", 743152000);
        setField(term425596, term425596.getClass(), "time", term425601);
        setField(term425473, term425473.getClass(), "commonModuleSetTime", term425596);
        setField(term425473, term425473.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term425473, term425473.getClass(), "commonSkin", -1);
        setIntField(term425473, term425473.getClass(), "headphoneVolume", 100);
        setBooleanField(term425473, term425473.getClass(), "buttonSeOn", true);
        setIntField(term425473, term425473.getClass(), "buttonSeVolume", 100);
        setIntField(term425473, term425473.getClass(), "sliderSeVolume", 100);
        setIntField(term425473, term425473.getClass(), "buttonSe", -1);
        setIntField(term425473, term425473.getClass(), "chainSlideSe", -1);
        setIntField(term425473, term425473.getClass(), "slideSe", -1);
        setIntField(term425473, term425473.getClass(), "sliderTouchSe", -1);
        setField(term425473, term425473.getClass(), "sortMode", enum958);
        setIntField(term425473, term425473.getClass(), "nextPvId", -1);
        setField(term425473, term425473.getClass(), "nextDifficulty", enum959);
        setField(term425473, term425473.getClass(), "nextEdition", enum960);
        setBooleanField(term425473, term425473.getClass(), "showInterimRanking", true);
        setBooleanField(term425473, term425473.getClass(), "showClearStatus", true);
        setBooleanField(term425473, term425473.getClass(), "showGreatBorder", true);
        setBooleanField(term425473, term425473.getClass(), "showExcellentBorder", true);
        setBooleanField(term425473, term425473.getClass(), "showRivalBorder", true);
        setBooleanField(term425473, term425473.getClass(), "showRgoSetting", true);
        setBooleanField(term425473, term425473.getClass(), "contestNowPlayingEnable", true);
        setIntField(term425473, term425473.getClass(), "contestNowPlayingId", -1);
        setIntField(term425473, term425473.getClass(), "contestNowPlayingValue", -1);
        setField(term425473, term425473.getClass(), "contestNowPlayingResultRank", enum961);
        setField(term425473, term425473.getClass(), "contestNowPlayingSpecifier", "");
        setField(term425473, term425473.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term425473, term425473.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term425473, term425473.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term425473, term425473.getClass(), "rivalPdId", -1);
        setField(term425470, term425470.getClass(), "pdId", term425473);
        setField(term425470, term425470.getClass(), "startMode", enum962);
        setIntField(term426092, term426092.getClass(), "year", 2024);
        setShortField(term426092, term426092.getClass(), "month", (short) 4);
        setShortField(term426092, term426092.getClass(), "day", (short) 26);
        setField(term426091, term426091.getClass(), "date", term426092);
        setByteField(term426096, term426096.getClass(), "hour", (byte) 15);
        setByteField(term426096, term426096.getClass(), "minute", (byte) 12);
        setByteField(term426096, term426096.getClass(), "second", (byte) 31);
        setIntField(term426096, term426096.getClass(), "nano", 839979637);
        setField(term426091, term426091.getClass(), "time", term426096);
        setField(term425470, term425470.getClass(), "startTime", term426091);
        setIntField(term426102, term426102.getClass(), "year", 2010);
        setShortField(term426102, term426102.getClass(), "month", (short) 3);
        setShortField(term426102, term426102.getClass(), "day", (short) 11);
        setField(term426101, term426101.getClass(), "date", term426102);
        setByteField(term426106, term426106.getClass(), "hour", (byte) 0);
        setByteField(term426106, term426106.getClass(), "minute", (byte) 21);
        setByteField(term426106, term426106.getClass(), "second", (byte) 25);
        setIntField(term426106, term426106.getClass(), "nano", 201315999);
        setField(term426101, term426101.getClass(), "time", term426106);
        setField(term425470, term425470.getClass(), "lastUpdateTime", term426101);
        setField(term425470, term425470.getClass(), "stageIndex", term426111);
        setField(term425470, term425470.getClass(), "stageResultIndex", term426113);
        setField(term425470, term425470.getClass(), "lastPvId", term426115);
        setField(term425470, term425470.getClass(), "levelNumber", term426117);
        setField(term425470, term425470.getClass(), "levelExp", term426119);
        setField(term425470, term425470.getClass(), "oldLevelNumber", term426121);
        setField(term425470, term425470.getClass(), "oldLevelExp", term426123);
        setField(term425470, term425470.getClass(), "vp", term426125);
        term426127 = new Integer(-1222614956);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.GameSession");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term426127;
        callMethod(klass, "setLevelNumber", argTypes, term425470, args);
    }

};


