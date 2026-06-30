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

public class PlayerProfile_getLevelTitle_9006823277 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term698328;

    public PlayerProfile_getLevelTitle_9006823277() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term698940 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term698939 = ((Class) term698940).getDeclaredField((String) "MISS");
        ((Field) term698939).setAccessible(true);
        Object enum1522 = ((Field) term698939).get((Object) null);
        Class<? extends Object> term699317 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term699316 = ((Class) term699317).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term699316).setAccessible(true);
        Object enum1523 = ((Field) term699316).get((Object) null);
        Class<? extends Object> term699600 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term699599 = ((Class) term699600).getDeclaredField((String) "NORMAL");
        ((Field) term699599).setAccessible(true);
        Object enum1524 = ((Field) term699599).get((Object) null);
        Class<? extends Object> term699875 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term699874 = ((Class) term699875).getDeclaredField((String) "ORIGINAL");
        ((Field) term699874).setAccessible(true);
        Object enum1525 = ((Field) term699874).get((Object) null);
        Class<? extends Object> term700141 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term700140 = ((Class) term700141).getDeclaredField((String) "NONE");
        ((Field) term700140).setAccessible(true);
        Object enum1526 = ((Field) term700140).get((Object) null);
        term698328 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term698451 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term698452 = newInstance(Class.forName("java.time.LocalDate"));
        Object term698456 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term698328, term698328.getClass(), "id", -4231979631084175364L);
        setIntField(term698328, term698328.getClass(), "pdId", -468720148);
        setField(term698328, term698328.getClass(), "playerName", "xxx");
        setIntField(term698328, term698328.getClass(), "vocaloidPoints", 300);
        setIntField(term698328, term698328.getClass(), "level", 1);
        setIntField(term698328, term698328.getClass(), "levelExp", 164755425);
        setField(term698328, term698328.getClass(), "levelTitle", "xxx");
        setIntField(term698328, term698328.getClass(), "plateId", -1);
        setIntField(term698328, term698328.getClass(), "plateEffectId", -1);
        setField(term698328, term698328.getClass(), "passwordStatus", enum1522);
        setField(term698328, term698328.getClass(), "password", "**********");
        setBooleanField(term698328, term698328.getClass(), "preferPerPvModule", true);
        setBooleanField(term698328, term698328.getClass(), "preferCommonModule", false);
        setBooleanField(term698328, term698328.getClass(), "usePerPvSkin", false);
        setBooleanField(term698328, term698328.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term698328, term698328.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term698328, term698328.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term698328, term698328.getClass(), "usePerPvTouchSliderSe", true);
        setField(term698328, term698328.getClass(), "commonModule", "-999,-999,-999");
        setField(term698328, term698328.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term698452, term698452.getClass(), "year", 2026);
        setShortField(term698452, term698452.getClass(), "month", (short) 6);
        setShortField(term698452, term698452.getClass(), "day", (short) 29);
        setField(term698451, term698451.getClass(), "date", term698452);
        setByteField(term698456, term698456.getClass(), "hour", (byte) 4);
        setByteField(term698456, term698456.getClass(), "minute", (byte) 29);
        setByteField(term698456, term698456.getClass(), "second", (byte) 11);
        setIntField(term698456, term698456.getClass(), "nano", 46612000);
        setField(term698451, term698451.getClass(), "time", term698456);
        setField(term698328, term698328.getClass(), "commonModuleSetTime", term698451);
        setField(term698328, term698328.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term698328, term698328.getClass(), "commonSkin", -1);
        setIntField(term698328, term698328.getClass(), "headphoneVolume", 100);
        setBooleanField(term698328, term698328.getClass(), "buttonSeOn", true);
        setIntField(term698328, term698328.getClass(), "buttonSeVolume", 100);
        setIntField(term698328, term698328.getClass(), "sliderSeVolume", 100);
        setIntField(term698328, term698328.getClass(), "buttonSe", -1);
        setIntField(term698328, term698328.getClass(), "chainSlideSe", -1);
        setIntField(term698328, term698328.getClass(), "slideSe", -1);
        setIntField(term698328, term698328.getClass(), "sliderTouchSe", -1);
        setField(term698328, term698328.getClass(), "sortMode", enum1523);
        setIntField(term698328, term698328.getClass(), "nextPvId", -1);
        setField(term698328, term698328.getClass(), "nextDifficulty", enum1524);
        setField(term698328, term698328.getClass(), "nextEdition", enum1525);
        setBooleanField(term698328, term698328.getClass(), "showInterimRanking", true);
        setBooleanField(term698328, term698328.getClass(), "showClearStatus", true);
        setBooleanField(term698328, term698328.getClass(), "showGreatBorder", true);
        setBooleanField(term698328, term698328.getClass(), "showExcellentBorder", true);
        setBooleanField(term698328, term698328.getClass(), "showRivalBorder", true);
        setBooleanField(term698328, term698328.getClass(), "showRgoSetting", true);
        setBooleanField(term698328, term698328.getClass(), "contestNowPlayingEnable", true);
        setIntField(term698328, term698328.getClass(), "contestNowPlayingId", -1);
        setIntField(term698328, term698328.getClass(), "contestNowPlayingValue", -1);
        setField(term698328, term698328.getClass(), "contestNowPlayingResultRank", enum1526);
        setField(term698328, term698328.getClass(), "contestNowPlayingSpecifier", "");
        setField(term698328, term698328.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term698328, term698328.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term698328, term698328.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term698328, term698328.getClass(), "rivalPdId", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLevelTitle", argTypes, term698328, args);
    }

};


