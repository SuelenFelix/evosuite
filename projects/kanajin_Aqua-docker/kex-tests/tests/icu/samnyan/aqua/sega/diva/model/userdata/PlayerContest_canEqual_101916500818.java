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

public class PlayerContest_canEqual_101916500818 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45717;
     Object term46338;

    public PlayerContest_canEqual_101916500818() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term46346 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term46345 = ((Class) term46346).getDeclaredField((String) "MISS");
        ((Field) term46345).setAccessible(true);
        Object enum90 = ((Field) term46345).get((Object) null);
        Class<? extends Object> term46723 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term46722 = ((Class) term46723).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term46722).setAccessible(true);
        Object enum91 = ((Field) term46722).get((Object) null);
        Class<? extends Object> term47006 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term47005 = ((Class) term47006).getDeclaredField((String) "NORMAL");
        ((Field) term47005).setAccessible(true);
        Object enum92 = ((Field) term47005).get((Object) null);
        Class<? extends Object> term47281 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term47280 = ((Class) term47281).getDeclaredField((String) "ORIGINAL");
        ((Field) term47280).setAccessible(true);
        Object enum93 = ((Field) term47280).get((Object) null);
        Class<? extends Object> term47547 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term47546 = ((Class) term47547).getDeclaredField((String) "NONE");
        ((Field) term47546).setAccessible(true);
        Object enum94 = ((Field) term47546).get((Object) null);
        term45717 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerContest"));
        Object term45719 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term45842 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term45843 = newInstance(Class.forName("java.time.LocalDate"));
        Object term45847 = newInstance(Class.forName("java.time.LocalTime"));
        Object term46328 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term46329 = newInstance(Class.forName("java.time.LocalDate"));
        Object term46333 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term45717, term45717.getClass(), "id", 1439298019805881866L);
        setLongField(term45719, term45719.getClass(), "id", -8708192233349544946L);
        setIntField(term45719, term45719.getClass(), "pdId", 1063420942);
        setField(term45719, term45719.getClass(), "playerName", "xxx");
        setIntField(term45719, term45719.getClass(), "vocaloidPoints", 300);
        setIntField(term45719, term45719.getClass(), "level", 1);
        setIntField(term45719, term45719.getClass(), "levelExp", 1375330971);
        setField(term45719, term45719.getClass(), "levelTitle", "xxx");
        setIntField(term45719, term45719.getClass(), "plateId", -1);
        setIntField(term45719, term45719.getClass(), "plateEffectId", -1);
        setField(term45719, term45719.getClass(), "passwordStatus", enum90);
        setField(term45719, term45719.getClass(), "password", "**********");
        setBooleanField(term45719, term45719.getClass(), "preferPerPvModule", true);
        setBooleanField(term45719, term45719.getClass(), "preferCommonModule", true);
        setBooleanField(term45719, term45719.getClass(), "usePerPvSkin", false);
        setBooleanField(term45719, term45719.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term45719, term45719.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term45719, term45719.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term45719, term45719.getClass(), "usePerPvTouchSliderSe", true);
        setField(term45719, term45719.getClass(), "commonModule", "-999,-999,-999");
        setField(term45719, term45719.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term45843, term45843.getClass(), "year", 2026);
        setShortField(term45843, term45843.getClass(), "month", (short) 6);
        setShortField(term45843, term45843.getClass(), "day", (short) 29);
        setField(term45842, term45842.getClass(), "date", term45843);
        setByteField(term45847, term45847.getClass(), "hour", (byte) 4);
        setByteField(term45847, term45847.getClass(), "minute", (byte) 27);
        setByteField(term45847, term45847.getClass(), "second", (byte) 16);
        setIntField(term45847, term45847.getClass(), "nano", 382399000);
        setField(term45842, term45842.getClass(), "time", term45847);
        setField(term45719, term45719.getClass(), "commonModuleSetTime", term45842);
        setField(term45719, term45719.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term45719, term45719.getClass(), "commonSkin", -1);
        setIntField(term45719, term45719.getClass(), "headphoneVolume", 100);
        setBooleanField(term45719, term45719.getClass(), "buttonSeOn", true);
        setIntField(term45719, term45719.getClass(), "buttonSeVolume", 100);
        setIntField(term45719, term45719.getClass(), "sliderSeVolume", 100);
        setIntField(term45719, term45719.getClass(), "buttonSe", -1);
        setIntField(term45719, term45719.getClass(), "chainSlideSe", -1);
        setIntField(term45719, term45719.getClass(), "slideSe", -1);
        setIntField(term45719, term45719.getClass(), "sliderTouchSe", -1);
        setField(term45719, term45719.getClass(), "sortMode", enum91);
        setIntField(term45719, term45719.getClass(), "nextPvId", -1);
        setField(term45719, term45719.getClass(), "nextDifficulty", enum92);
        setField(term45719, term45719.getClass(), "nextEdition", enum93);
        setBooleanField(term45719, term45719.getClass(), "showInterimRanking", true);
        setBooleanField(term45719, term45719.getClass(), "showClearStatus", true);
        setBooleanField(term45719, term45719.getClass(), "showGreatBorder", true);
        setBooleanField(term45719, term45719.getClass(), "showExcellentBorder", true);
        setBooleanField(term45719, term45719.getClass(), "showRivalBorder", true);
        setBooleanField(term45719, term45719.getClass(), "showRgoSetting", true);
        setBooleanField(term45719, term45719.getClass(), "contestNowPlayingEnable", true);
        setIntField(term45719, term45719.getClass(), "contestNowPlayingId", -1);
        setIntField(term45719, term45719.getClass(), "contestNowPlayingValue", -1);
        setField(term45719, term45719.getClass(), "contestNowPlayingResultRank", enum94);
        setField(term45719, term45719.getClass(), "contestNowPlayingSpecifier", "");
        setField(term45719, term45719.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term45719, term45719.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term45719, term45719.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term45719, term45719.getClass(), "rivalPdId", -1);
        setField(term45717, term45717.getClass(), "pdId", term45719);
        setIntField(term45717, term45717.getClass(), "contestId", -478195677);
        setIntField(term45717, term45717.getClass(), "startCount", 972867650);
        setField(term45717, term45717.getClass(), "resultRank", enum94);
        setIntField(term45717, term45717.getClass(), "bestValue", -1);
        setIntField(term45717, term45717.getClass(), "flag", -1);
        setIntField(term46329, term46329.getClass(), "year", 2026);
        setShortField(term46329, term46329.getClass(), "month", (short) 6);
        setShortField(term46329, term46329.getClass(), "day", (short) 29);
        setField(term46328, term46328.getClass(), "date", term46329);
        setByteField(term46333, term46333.getClass(), "hour", (byte) 4);
        setByteField(term46333, term46333.getClass(), "minute", (byte) 27);
        setByteField(term46333, term46333.getClass(), "second", (byte) 16);
        setIntField(term46333, term46333.getClass(), "nano", 382234000);
        setField(term46328, term46328.getClass(), "time", term46333);
        setField(term45717, term45717.getClass(), "lastUpdateTime", term46328);
        term46338 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerContest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term46338;
        callMethod(klass, "canEqual", argTypes, term45717, args);
    }

};


