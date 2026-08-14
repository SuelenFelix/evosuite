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

public class GameSession_setStartMode_123326154118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term408512;
     Object enum926;

    public GameSession_setStartMode_123326154118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term409185 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term409184 = ((Class) term409185).getDeclaredField((String) "MISS");
        ((Field) term409184).setAccessible(true);
        Object enum920 = ((Field) term409184).get((Object) null);
        Class<? extends Object> term409562 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term409561 = ((Class) term409562).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term409561).setAccessible(true);
        Object enum921 = ((Field) term409561).get((Object) null);
        Class<? extends Object> term409845 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term409844 = ((Class) term409845).getDeclaredField((String) "NORMAL");
        ((Field) term409844).setAccessible(true);
        Object enum922 = ((Field) term409844).get((Object) null);
        Class<? extends Object> term410120 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term410119 = ((Class) term410120).getDeclaredField((String) "ORIGINAL");
        ((Field) term410119).setAccessible(true);
        Object enum923 = ((Field) term410119).get((Object) null);
        Class<? extends Object> term410386 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term410385 = ((Class) term410386).getDeclaredField((String) "NONE");
        ((Field) term410385).setAccessible(true);
        Object enum924 = ((Field) term410385).get((Object) null);
        Class<? extends Object> term411027 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.StartMode");
        Field term411026 = ((Class) term411027).getDeclaredField((String) "PRE_START");
        ((Field) term411026).setAccessible(true);
        Object enum925 = ((Field) term411026).get((Object) null);
        Integer term409153 = new Integer(9726679);
        Integer term409155 = new Integer(-25637976);
        Integer term409157 = new Integer(1555897383);
        Integer term409159 = new Integer(202001407);
        Integer term409161 = new Integer(158873461);
        Integer term409163 = new Integer(-430151637);
        Integer term409165 = new Integer(-1697741339);
        Integer term409167 = new Integer(98922530);
        term408512 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.GameSession"));
        Object term408515 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term408638 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term408639 = newInstance(Class.forName("java.time.LocalDate"));
        Object term408643 = newInstance(Class.forName("java.time.LocalTime"));
        Object term409133 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term409134 = newInstance(Class.forName("java.time.LocalDate"));
        Object term409138 = newInstance(Class.forName("java.time.LocalTime"));
        Object term409143 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term409144 = newInstance(Class.forName("java.time.LocalDate"));
        Object term409148 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term408512, term408512.getClass(), "id", -4714000263923324167L);
        setIntField(term408512, term408512.getClass(), "acceptId", 1934437115);
        setLongField(term408515, term408515.getClass(), "id", 6906379511067694917L);
        setIntField(term408515, term408515.getClass(), "pdId", 1820319919);
        setField(term408515, term408515.getClass(), "playerName", "xxx");
        setIntField(term408515, term408515.getClass(), "vocaloidPoints", 300);
        setIntField(term408515, term408515.getClass(), "level", 1);
        setIntField(term408515, term408515.getClass(), "levelExp", 1444962020);
        setField(term408515, term408515.getClass(), "levelTitle", "xxx");
        setIntField(term408515, term408515.getClass(), "plateId", -1);
        setIntField(term408515, term408515.getClass(), "plateEffectId", -1);
        setField(term408515, term408515.getClass(), "passwordStatus", enum920);
        setField(term408515, term408515.getClass(), "password", "**********");
        setBooleanField(term408515, term408515.getClass(), "preferPerPvModule", true);
        setBooleanField(term408515, term408515.getClass(), "preferCommonModule", true);
        setBooleanField(term408515, term408515.getClass(), "usePerPvSkin", true);
        setBooleanField(term408515, term408515.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term408515, term408515.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term408515, term408515.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term408515, term408515.getClass(), "usePerPvTouchSliderSe", true);
        setField(term408515, term408515.getClass(), "commonModule", "-999,-999,-999");
        setField(term408515, term408515.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term408639, term408639.getClass(), "year", 2026);
        setShortField(term408639, term408639.getClass(), "month", (short) 8);
        setShortField(term408639, term408639.getClass(), "day", (short) 12);
        setField(term408638, term408638.getClass(), "date", term408639);
        setByteField(term408643, term408643.getClass(), "hour", (byte) 2);
        setByteField(term408643, term408643.getClass(), "minute", (byte) 3);
        setByteField(term408643, term408643.getClass(), "second", (byte) 26);
        setIntField(term408643, term408643.getClass(), "nano", 266599000);
        setField(term408638, term408638.getClass(), "time", term408643);
        setField(term408515, term408515.getClass(), "commonModuleSetTime", term408638);
        setField(term408515, term408515.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term408515, term408515.getClass(), "commonSkin", -1);
        setIntField(term408515, term408515.getClass(), "headphoneVolume", 100);
        setBooleanField(term408515, term408515.getClass(), "buttonSeOn", true);
        setIntField(term408515, term408515.getClass(), "buttonSeVolume", 100);
        setIntField(term408515, term408515.getClass(), "sliderSeVolume", 100);
        setIntField(term408515, term408515.getClass(), "buttonSe", -1);
        setIntField(term408515, term408515.getClass(), "chainSlideSe", -1);
        setIntField(term408515, term408515.getClass(), "slideSe", -1);
        setIntField(term408515, term408515.getClass(), "sliderTouchSe", -1);
        setField(term408515, term408515.getClass(), "sortMode", enum921);
        setIntField(term408515, term408515.getClass(), "nextPvId", -1);
        setField(term408515, term408515.getClass(), "nextDifficulty", enum922);
        setField(term408515, term408515.getClass(), "nextEdition", enum923);
        setBooleanField(term408515, term408515.getClass(), "showInterimRanking", true);
        setBooleanField(term408515, term408515.getClass(), "showClearStatus", true);
        setBooleanField(term408515, term408515.getClass(), "showGreatBorder", true);
        setBooleanField(term408515, term408515.getClass(), "showExcellentBorder", true);
        setBooleanField(term408515, term408515.getClass(), "showRivalBorder", true);
        setBooleanField(term408515, term408515.getClass(), "showRgoSetting", true);
        setBooleanField(term408515, term408515.getClass(), "contestNowPlayingEnable", true);
        setIntField(term408515, term408515.getClass(), "contestNowPlayingId", -1);
        setIntField(term408515, term408515.getClass(), "contestNowPlayingValue", -1);
        setField(term408515, term408515.getClass(), "contestNowPlayingResultRank", enum924);
        setField(term408515, term408515.getClass(), "contestNowPlayingSpecifier", "");
        setField(term408515, term408515.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term408515, term408515.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term408515, term408515.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term408515, term408515.getClass(), "rivalPdId", -1);
        setField(term408512, term408512.getClass(), "pdId", term408515);
        setField(term408512, term408512.getClass(), "startMode", enum925);
        setIntField(term409134, term409134.getClass(), "year", 2021);
        setShortField(term409134, term409134.getClass(), "month", (short) 12);
        setShortField(term409134, term409134.getClass(), "day", (short) 1);
        setField(term409133, term409133.getClass(), "date", term409134);
        setByteField(term409138, term409138.getClass(), "hour", (byte) 15);
        setByteField(term409138, term409138.getClass(), "minute", (byte) 30);
        setByteField(term409138, term409138.getClass(), "second", (byte) 5);
        setIntField(term409138, term409138.getClass(), "nano", 996341606);
        setField(term409133, term409133.getClass(), "time", term409138);
        setField(term408512, term408512.getClass(), "startTime", term409133);
        setIntField(term409144, term409144.getClass(), "year", 2016);
        setShortField(term409144, term409144.getClass(), "month", (short) 4);
        setShortField(term409144, term409144.getClass(), "day", (short) 18);
        setField(term409143, term409143.getClass(), "date", term409144);
        setByteField(term409148, term409148.getClass(), "hour", (byte) 15);
        setByteField(term409148, term409148.getClass(), "minute", (byte) 56);
        setByteField(term409148, term409148.getClass(), "second", (byte) 45);
        setIntField(term409148, term409148.getClass(), "nano", 248103350);
        setField(term409143, term409143.getClass(), "time", term409148);
        setField(term408512, term408512.getClass(), "lastUpdateTime", term409143);
        setField(term408512, term408512.getClass(), "stageIndex", term409153);
        setField(term408512, term408512.getClass(), "stageResultIndex", term409155);
        setField(term408512, term408512.getClass(), "lastPvId", term409157);
        setField(term408512, term408512.getClass(), "levelNumber", term409159);
        setField(term408512, term408512.getClass(), "levelExp", term409161);
        setField(term408512, term408512.getClass(), "oldLevelNumber", term409163);
        setField(term408512, term408512.getClass(), "oldLevelExp", term409165);
        setField(term408512, term408512.getClass(), "vp", term409167);
        Class<? extends Object> term411306 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.StartMode");
        Field term411305 = ((Class) term411306).getDeclaredField((String) "START");
        ((Field) term411305).setAccessible(true);
        enum926 = ((Field) term411305).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.GameSession");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.diva.model.common.StartMode");
        Object[] args = new Object[1];
        args[0] = enum926;
        callMethod(klass, "setStartMode", argTypes, term408512, args);
    }

};


