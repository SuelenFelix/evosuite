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

public class PlayerProfile_getSortMode_33670771732 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term759653;

    public PlayerProfile_getSortMode_33670771732() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term760265 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term760264 = ((Class) term760265).getDeclaredField((String) "MISS");
        ((Field) term760264).setAccessible(true);
        Object enum1647 = ((Field) term760264).get((Object) null);
        Class<? extends Object> term760642 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term760641 = ((Class) term760642).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term760641).setAccessible(true);
        Object enum1648 = ((Field) term760641).get((Object) null);
        Class<? extends Object> term760925 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term760924 = ((Class) term760925).getDeclaredField((String) "NORMAL");
        ((Field) term760924).setAccessible(true);
        Object enum1649 = ((Field) term760924).get((Object) null);
        Class<? extends Object> term761200 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term761199 = ((Class) term761200).getDeclaredField((String) "ORIGINAL");
        ((Field) term761199).setAccessible(true);
        Object enum1650 = ((Field) term761199).get((Object) null);
        Class<? extends Object> term761466 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term761465 = ((Class) term761466).getDeclaredField((String) "NONE");
        ((Field) term761465).setAccessible(true);
        Object enum1651 = ((Field) term761465).get((Object) null);
        term759653 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term759776 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term759777 = newInstance(Class.forName("java.time.LocalDate"));
        Object term759781 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term759653, term759653.getClass(), "id", -5903549884298836343L);
        setIntField(term759653, term759653.getClass(), "pdId", -256542569);
        setField(term759653, term759653.getClass(), "playerName", "xxx");
        setIntField(term759653, term759653.getClass(), "vocaloidPoints", 300);
        setIntField(term759653, term759653.getClass(), "level", 1);
        setIntField(term759653, term759653.getClass(), "levelExp", -1936597357);
        setField(term759653, term759653.getClass(), "levelTitle", "xxx");
        setIntField(term759653, term759653.getClass(), "plateId", -1);
        setIntField(term759653, term759653.getClass(), "plateEffectId", -1);
        setField(term759653, term759653.getClass(), "passwordStatus", enum1647);
        setField(term759653, term759653.getClass(), "password", "**********");
        setBooleanField(term759653, term759653.getClass(), "preferPerPvModule", true);
        setBooleanField(term759653, term759653.getClass(), "preferCommonModule", true);
        setBooleanField(term759653, term759653.getClass(), "usePerPvSkin", true);
        setBooleanField(term759653, term759653.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term759653, term759653.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term759653, term759653.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term759653, term759653.getClass(), "usePerPvTouchSliderSe", true);
        setField(term759653, term759653.getClass(), "commonModule", "-999,-999,-999");
        setField(term759653, term759653.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term759777, term759777.getClass(), "year", 2026);
        setShortField(term759777, term759777.getClass(), "month", (short) 6);
        setShortField(term759777, term759777.getClass(), "day", (short) 29);
        setField(term759776, term759776.getClass(), "date", term759777);
        setByteField(term759781, term759781.getClass(), "hour", (byte) 4);
        setByteField(term759781, term759781.getClass(), "minute", (byte) 29);
        setByteField(term759781, term759781.getClass(), "second", (byte) 17);
        setIntField(term759781, term759781.getClass(), "nano", 471226000);
        setField(term759776, term759776.getClass(), "time", term759781);
        setField(term759653, term759653.getClass(), "commonModuleSetTime", term759776);
        setField(term759653, term759653.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term759653, term759653.getClass(), "commonSkin", -1);
        setIntField(term759653, term759653.getClass(), "headphoneVolume", 100);
        setBooleanField(term759653, term759653.getClass(), "buttonSeOn", true);
        setIntField(term759653, term759653.getClass(), "buttonSeVolume", 100);
        setIntField(term759653, term759653.getClass(), "sliderSeVolume", 100);
        setIntField(term759653, term759653.getClass(), "buttonSe", -1);
        setIntField(term759653, term759653.getClass(), "chainSlideSe", -1);
        setIntField(term759653, term759653.getClass(), "slideSe", -1);
        setIntField(term759653, term759653.getClass(), "sliderTouchSe", -1);
        setField(term759653, term759653.getClass(), "sortMode", enum1648);
        setIntField(term759653, term759653.getClass(), "nextPvId", -1);
        setField(term759653, term759653.getClass(), "nextDifficulty", enum1649);
        setField(term759653, term759653.getClass(), "nextEdition", enum1650);
        setBooleanField(term759653, term759653.getClass(), "showInterimRanking", true);
        setBooleanField(term759653, term759653.getClass(), "showClearStatus", true);
        setBooleanField(term759653, term759653.getClass(), "showGreatBorder", true);
        setBooleanField(term759653, term759653.getClass(), "showExcellentBorder", true);
        setBooleanField(term759653, term759653.getClass(), "showRivalBorder", true);
        setBooleanField(term759653, term759653.getClass(), "showRgoSetting", true);
        setBooleanField(term759653, term759653.getClass(), "contestNowPlayingEnable", true);
        setIntField(term759653, term759653.getClass(), "contestNowPlayingId", -1);
        setIntField(term759653, term759653.getClass(), "contestNowPlayingValue", -1);
        setField(term759653, term759653.getClass(), "contestNowPlayingResultRank", enum1651);
        setField(term759653, term759653.getClass(), "contestNowPlayingSpecifier", "");
        setField(term759653, term759653.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term759653, term759653.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term759653, term759653.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term759653, term759653.getClass(), "rivalPdId", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSortMode", argTypes, term759653, args);
    }

};


