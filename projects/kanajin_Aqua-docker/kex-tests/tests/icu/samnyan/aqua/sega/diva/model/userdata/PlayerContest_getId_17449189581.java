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

public class PlayerContest_getId_17449189581 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2696;

    public PlayerContest_getId_17449189581() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3324 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term3323 = ((Class) term3324).getDeclaredField((String) "MISS");
        ((Field) term3323).setAccessible(true);
        Object enum5 = ((Field) term3323).get((Object) null);
        Class<? extends Object> term3701 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term3700 = ((Class) term3701).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term3700).setAccessible(true);
        Object enum6 = ((Field) term3700).get((Object) null);
        Class<? extends Object> term3984 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term3983 = ((Class) term3984).getDeclaredField((String) "NORMAL");
        ((Field) term3983).setAccessible(true);
        Object enum7 = ((Field) term3983).get((Object) null);
        Class<? extends Object> term4259 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term4258 = ((Class) term4259).getDeclaredField((String) "ORIGINAL");
        ((Field) term4258).setAccessible(true);
        Object enum8 = ((Field) term4258).get((Object) null);
        Class<? extends Object> term4525 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term4524 = ((Class) term4525).getDeclaredField((String) "NONE");
        ((Field) term4524).setAccessible(true);
        Object enum9 = ((Field) term4524).get((Object) null);
        term2696 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerContest"));
        Object term2698 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term2821 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2822 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2826 = newInstance(Class.forName("java.time.LocalTime"));
        Object term3307 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3308 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3312 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term2696, term2696.getClass(), "id", 6375119433582206027L);
        setLongField(term2698, term2698.getClass(), "id", -8257434502486459194L);
        setIntField(term2698, term2698.getClass(), "pdId", 391863371);
        setField(term2698, term2698.getClass(), "playerName", "xxx");
        setIntField(term2698, term2698.getClass(), "vocaloidPoints", 300);
        setIntField(term2698, term2698.getClass(), "level", 1);
        setIntField(term2698, term2698.getClass(), "levelExp", -1922583790);
        setField(term2698, term2698.getClass(), "levelTitle", "xxx");
        setIntField(term2698, term2698.getClass(), "plateId", -1);
        setIntField(term2698, term2698.getClass(), "plateEffectId", -1);
        setField(term2698, term2698.getClass(), "passwordStatus", enum5);
        setField(term2698, term2698.getClass(), "password", "**********");
        setBooleanField(term2698, term2698.getClass(), "preferPerPvModule", true);
        setBooleanField(term2698, term2698.getClass(), "preferCommonModule", true);
        setBooleanField(term2698, term2698.getClass(), "usePerPvSkin", false);
        setBooleanField(term2698, term2698.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term2698, term2698.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term2698, term2698.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term2698, term2698.getClass(), "usePerPvTouchSliderSe", false);
        setField(term2698, term2698.getClass(), "commonModule", "-999,-999,-999");
        setField(term2698, term2698.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term2822, term2822.getClass(), "year", 2026);
        setShortField(term2822, term2822.getClass(), "month", (short) 8);
        setShortField(term2822, term2822.getClass(), "day", (short) 12);
        setField(term2821, term2821.getClass(), "date", term2822);
        setByteField(term2826, term2826.getClass(), "hour", (byte) 2);
        setByteField(term2826, term2826.getClass(), "minute", (byte) 2);
        setByteField(term2826, term2826.getClass(), "second", (byte) 27);
        setIntField(term2826, term2826.getClass(), "nano", 295005000);
        setField(term2821, term2821.getClass(), "time", term2826);
        setField(term2698, term2698.getClass(), "commonModuleSetTime", term2821);
        setField(term2698, term2698.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term2698, term2698.getClass(), "commonSkin", -1);
        setIntField(term2698, term2698.getClass(), "headphoneVolume", 100);
        setBooleanField(term2698, term2698.getClass(), "buttonSeOn", true);
        setIntField(term2698, term2698.getClass(), "buttonSeVolume", 100);
        setIntField(term2698, term2698.getClass(), "sliderSeVolume", 100);
        setIntField(term2698, term2698.getClass(), "buttonSe", -1);
        setIntField(term2698, term2698.getClass(), "chainSlideSe", -1);
        setIntField(term2698, term2698.getClass(), "slideSe", -1);
        setIntField(term2698, term2698.getClass(), "sliderTouchSe", -1);
        setField(term2698, term2698.getClass(), "sortMode", enum6);
        setIntField(term2698, term2698.getClass(), "nextPvId", -1);
        setField(term2698, term2698.getClass(), "nextDifficulty", enum7);
        setField(term2698, term2698.getClass(), "nextEdition", enum8);
        setBooleanField(term2698, term2698.getClass(), "showInterimRanking", true);
        setBooleanField(term2698, term2698.getClass(), "showClearStatus", true);
        setBooleanField(term2698, term2698.getClass(), "showGreatBorder", true);
        setBooleanField(term2698, term2698.getClass(), "showExcellentBorder", true);
        setBooleanField(term2698, term2698.getClass(), "showRivalBorder", true);
        setBooleanField(term2698, term2698.getClass(), "showRgoSetting", true);
        setBooleanField(term2698, term2698.getClass(), "contestNowPlayingEnable", true);
        setIntField(term2698, term2698.getClass(), "contestNowPlayingId", -1);
        setIntField(term2698, term2698.getClass(), "contestNowPlayingValue", -1);
        setField(term2698, term2698.getClass(), "contestNowPlayingResultRank", enum9);
        setField(term2698, term2698.getClass(), "contestNowPlayingSpecifier", "");
        setField(term2698, term2698.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term2698, term2698.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term2698, term2698.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term2698, term2698.getClass(), "rivalPdId", -1);
        setField(term2696, term2696.getClass(), "pdId", term2698);
        setIntField(term2696, term2696.getClass(), "contestId", -616727354);
        setIntField(term2696, term2696.getClass(), "startCount", -1955890973);
        setField(term2696, term2696.getClass(), "resultRank", enum9);
        setIntField(term2696, term2696.getClass(), "bestValue", -1);
        setIntField(term2696, term2696.getClass(), "flag", -1);
        setIntField(term3308, term3308.getClass(), "year", 2026);
        setShortField(term3308, term3308.getClass(), "month", (short) 8);
        setShortField(term3308, term3308.getClass(), "day", (short) 12);
        setField(term3307, term3307.getClass(), "date", term3308);
        setByteField(term3312, term3312.getClass(), "hour", (byte) 2);
        setByteField(term3312, term3312.getClass(), "minute", (byte) 2);
        setByteField(term3312, term3312.getClass(), "second", (byte) 27);
        setIntField(term3312, term3312.getClass(), "nano", 294458000);
        setField(term3307, term3307.getClass(), "time", term3312);
        setField(term2696, term2696.getClass(), "lastUpdateTime", term3307);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerContest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term2696, args);
    }

};


