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
import java.lang.String;
import java.lang.Object;

public class PlayerProfile_getMyList1_212188780648 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term798901;

    public PlayerProfile_getMyList1_212188780648() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term799513 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term799512 = ((Class) term799513).getDeclaredField((String) "MISS");
        ((Field) term799512).setAccessible(true);
        Object enum1727 = ((Field) term799512).get((Object) null);
        Class<? extends Object> term799890 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term799889 = ((Class) term799890).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term799889).setAccessible(true);
        Object enum1728 = ((Field) term799889).get((Object) null);
        Class<? extends Object> term800173 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term800172 = ((Class) term800173).getDeclaredField((String) "NORMAL");
        ((Field) term800172).setAccessible(true);
        Object enum1729 = ((Field) term800172).get((Object) null);
        Class<? extends Object> term800448 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term800447 = ((Class) term800448).getDeclaredField((String) "ORIGINAL");
        ((Field) term800447).setAccessible(true);
        Object enum1730 = ((Field) term800447).get((Object) null);
        Class<? extends Object> term800714 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term800713 = ((Class) term800714).getDeclaredField((String) "NONE");
        ((Field) term800713).setAccessible(true);
        Object enum1731 = ((Field) term800713).get((Object) null);
        term798901 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term799024 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term799025 = newInstance(Class.forName("java.time.LocalDate"));
        Object term799029 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term798901, term798901.getClass(), "id", -4562564710769146498L);
        setIntField(term798901, term798901.getClass(), "pdId", -1585377443);
        setField(term798901, term798901.getClass(), "playerName", "xxx");
        setIntField(term798901, term798901.getClass(), "vocaloidPoints", 300);
        setIntField(term798901, term798901.getClass(), "level", 1);
        setIntField(term798901, term798901.getClass(), "levelExp", -1293961217);
        setField(term798901, term798901.getClass(), "levelTitle", "xxx");
        setIntField(term798901, term798901.getClass(), "plateId", -1);
        setIntField(term798901, term798901.getClass(), "plateEffectId", -1);
        setField(term798901, term798901.getClass(), "passwordStatus", enum1727);
        setField(term798901, term798901.getClass(), "password", "**********");
        setBooleanField(term798901, term798901.getClass(), "preferPerPvModule", true);
        setBooleanField(term798901, term798901.getClass(), "preferCommonModule", false);
        setBooleanField(term798901, term798901.getClass(), "usePerPvSkin", true);
        setBooleanField(term798901, term798901.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term798901, term798901.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term798901, term798901.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term798901, term798901.getClass(), "usePerPvTouchSliderSe", false);
        setField(term798901, term798901.getClass(), "commonModule", "-999,-999,-999");
        setField(term798901, term798901.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term799025, term799025.getClass(), "year", 2026);
        setShortField(term799025, term799025.getClass(), "month", (short) 8);
        setShortField(term799025, term799025.getClass(), "day", (short) 12);
        setField(term799024, term799024.getClass(), "date", term799025);
        setByteField(term799029, term799029.getClass(), "hour", (byte) 2);
        setByteField(term799029, term799029.getClass(), "minute", (byte) 4);
        setByteField(term799029, term799029.getClass(), "second", (byte) 34);
        setIntField(term799029, term799029.getClass(), "nano", 980167000);
        setField(term799024, term799024.getClass(), "time", term799029);
        setField(term798901, term798901.getClass(), "commonModuleSetTime", term799024);
        setField(term798901, term798901.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term798901, term798901.getClass(), "commonSkin", -1);
        setIntField(term798901, term798901.getClass(), "headphoneVolume", 100);
        setBooleanField(term798901, term798901.getClass(), "buttonSeOn", true);
        setIntField(term798901, term798901.getClass(), "buttonSeVolume", 100);
        setIntField(term798901, term798901.getClass(), "sliderSeVolume", 100);
        setIntField(term798901, term798901.getClass(), "buttonSe", -1);
        setIntField(term798901, term798901.getClass(), "chainSlideSe", -1);
        setIntField(term798901, term798901.getClass(), "slideSe", -1);
        setIntField(term798901, term798901.getClass(), "sliderTouchSe", -1);
        setField(term798901, term798901.getClass(), "sortMode", enum1728);
        setIntField(term798901, term798901.getClass(), "nextPvId", -1);
        setField(term798901, term798901.getClass(), "nextDifficulty", enum1729);
        setField(term798901, term798901.getClass(), "nextEdition", enum1730);
        setBooleanField(term798901, term798901.getClass(), "showInterimRanking", true);
        setBooleanField(term798901, term798901.getClass(), "showClearStatus", true);
        setBooleanField(term798901, term798901.getClass(), "showGreatBorder", true);
        setBooleanField(term798901, term798901.getClass(), "showExcellentBorder", true);
        setBooleanField(term798901, term798901.getClass(), "showRivalBorder", true);
        setBooleanField(term798901, term798901.getClass(), "showRgoSetting", true);
        setBooleanField(term798901, term798901.getClass(), "contestNowPlayingEnable", false);
        setIntField(term798901, term798901.getClass(), "contestNowPlayingId", -1);
        setIntField(term798901, term798901.getClass(), "contestNowPlayingValue", -1);
        setField(term798901, term798901.getClass(), "contestNowPlayingResultRank", enum1731);
        setField(term798901, term798901.getClass(), "contestNowPlayingSpecifier", "");
        setField(term798901, term798901.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term798901, term798901.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term798901, term798901.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term798901, term798901.getClass(), "rivalPdId", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMyList1", argTypes, term798901, args);
    }

};


