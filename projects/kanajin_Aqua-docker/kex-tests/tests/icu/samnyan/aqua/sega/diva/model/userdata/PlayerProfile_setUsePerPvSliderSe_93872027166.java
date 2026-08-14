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
import java.lang.Boolean;

public class PlayerProfile_setUsePerPvSliderSe_93872027166 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term843143;
     Object term843748;

    public PlayerProfile_setUsePerPvSliderSe_93872027166() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term843757 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term843756 = ((Class) term843757).getDeclaredField((String) "MISS");
        ((Field) term843756).setAccessible(true);
        Object enum1817 = ((Field) term843756).get((Object) null);
        Class<? extends Object> term844134 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term844133 = ((Class) term844134).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term844133).setAccessible(true);
        Object enum1818 = ((Field) term844133).get((Object) null);
        Class<? extends Object> term844417 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term844416 = ((Class) term844417).getDeclaredField((String) "NORMAL");
        ((Field) term844416).setAccessible(true);
        Object enum1819 = ((Field) term844416).get((Object) null);
        Class<? extends Object> term844692 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term844691 = ((Class) term844692).getDeclaredField((String) "ORIGINAL");
        ((Field) term844691).setAccessible(true);
        Object enum1820 = ((Field) term844691).get((Object) null);
        Class<? extends Object> term844958 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term844957 = ((Class) term844958).getDeclaredField((String) "NONE");
        ((Field) term844957).setAccessible(true);
        Object enum1821 = ((Field) term844957).get((Object) null);
        term843143 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term843266 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term843267 = newInstance(Class.forName("java.time.LocalDate"));
        Object term843271 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term843143, term843143.getClass(), "id", 1377567570761089535L);
        setIntField(term843143, term843143.getClass(), "pdId", 2101844302);
        setField(term843143, term843143.getClass(), "playerName", "xxx");
        setIntField(term843143, term843143.getClass(), "vocaloidPoints", 300);
        setIntField(term843143, term843143.getClass(), "level", 1);
        setIntField(term843143, term843143.getClass(), "levelExp", 1975711832);
        setField(term843143, term843143.getClass(), "levelTitle", "xxx");
        setIntField(term843143, term843143.getClass(), "plateId", -1);
        setIntField(term843143, term843143.getClass(), "plateEffectId", -1);
        setField(term843143, term843143.getClass(), "passwordStatus", enum1817);
        setField(term843143, term843143.getClass(), "password", "**********");
        setBooleanField(term843143, term843143.getClass(), "preferPerPvModule", true);
        setBooleanField(term843143, term843143.getClass(), "preferCommonModule", true);
        setBooleanField(term843143, term843143.getClass(), "usePerPvSkin", true);
        setBooleanField(term843143, term843143.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term843143, term843143.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term843143, term843143.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term843143, term843143.getClass(), "usePerPvTouchSliderSe", false);
        setField(term843143, term843143.getClass(), "commonModule", "-999,-999,-999");
        setField(term843143, term843143.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term843267, term843267.getClass(), "year", 2026);
        setShortField(term843267, term843267.getClass(), "month", (short) 8);
        setShortField(term843267, term843267.getClass(), "day", (short) 12);
        setField(term843266, term843266.getClass(), "date", term843267);
        setByteField(term843271, term843271.getClass(), "hour", (byte) 2);
        setByteField(term843271, term843271.getClass(), "minute", (byte) 4);
        setByteField(term843271, term843271.getClass(), "second", (byte) 39);
        setIntField(term843271, term843271.getClass(), "nano", 717521000);
        setField(term843266, term843266.getClass(), "time", term843271);
        setField(term843143, term843143.getClass(), "commonModuleSetTime", term843266);
        setField(term843143, term843143.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term843143, term843143.getClass(), "commonSkin", -1);
        setIntField(term843143, term843143.getClass(), "headphoneVolume", 100);
        setBooleanField(term843143, term843143.getClass(), "buttonSeOn", true);
        setIntField(term843143, term843143.getClass(), "buttonSeVolume", 100);
        setIntField(term843143, term843143.getClass(), "sliderSeVolume", 100);
        setIntField(term843143, term843143.getClass(), "buttonSe", -1);
        setIntField(term843143, term843143.getClass(), "chainSlideSe", -1);
        setIntField(term843143, term843143.getClass(), "slideSe", -1);
        setIntField(term843143, term843143.getClass(), "sliderTouchSe", -1);
        setField(term843143, term843143.getClass(), "sortMode", enum1818);
        setIntField(term843143, term843143.getClass(), "nextPvId", -1);
        setField(term843143, term843143.getClass(), "nextDifficulty", enum1819);
        setField(term843143, term843143.getClass(), "nextEdition", enum1820);
        setBooleanField(term843143, term843143.getClass(), "showInterimRanking", true);
        setBooleanField(term843143, term843143.getClass(), "showClearStatus", true);
        setBooleanField(term843143, term843143.getClass(), "showGreatBorder", true);
        setBooleanField(term843143, term843143.getClass(), "showExcellentBorder", true);
        setBooleanField(term843143, term843143.getClass(), "showRivalBorder", true);
        setBooleanField(term843143, term843143.getClass(), "showRgoSetting", true);
        setBooleanField(term843143, term843143.getClass(), "contestNowPlayingEnable", false);
        setIntField(term843143, term843143.getClass(), "contestNowPlayingId", -1);
        setIntField(term843143, term843143.getClass(), "contestNowPlayingValue", -1);
        setField(term843143, term843143.getClass(), "contestNowPlayingResultRank", enum1821);
        setField(term843143, term843143.getClass(), "contestNowPlayingSpecifier", "");
        setField(term843143, term843143.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term843143, term843143.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term843143, term843143.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term843143, term843143.getClass(), "rivalPdId", -1);
        term843748 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term843748;
        callMethod(klass, "setUsePerPvSliderSe", argTypes, term843143, args);
    }

};


