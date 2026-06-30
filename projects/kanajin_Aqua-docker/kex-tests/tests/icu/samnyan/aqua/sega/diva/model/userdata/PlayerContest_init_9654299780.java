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
import java.lang.Integer;

public class PlayerContest_init_9654299780 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term606;

    public PlayerContest_init_9654299780() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term654 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term653 = ((Class) term654).getDeclaredField((String) "MISS");
        ((Field) term653).setAccessible(true);
        Object enum0 = ((Field) term653).get((Object) null);
        Class<? extends Object> term1114 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term1113 = ((Class) term1114).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term1113).setAccessible(true);
        Object enum1 = ((Field) term1113).get((Object) null);
        Class<? extends Object> term1452 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term1451 = ((Class) term1452).getDeclaredField((String) "NORMAL");
        ((Field) term1451).setAccessible(true);
        Object enum2 = ((Field) term1451).get((Object) null);
        Class<? extends Object> term1750 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term1749 = ((Class) term1750).getDeclaredField((String) "ORIGINAL");
        ((Field) term1749).setAccessible(true);
        Object enum3 = ((Field) term1749).get((Object) null);
        Class<? extends Object> term2056 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term2055 = ((Class) term2056).getDeclaredField((String) "NONE");
        ((Field) term2055).setAccessible(true);
        Object enum4 = ((Field) term2055).get((Object) null);
        term1 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term124 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term125 = newInstance(Class.forName("java.time.LocalDate"));
        Object term129 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term1, term1.getClass(), "id", 2442117782898005296L);
        setIntField(term1, term1.getClass(), "pdId", 568599855);
        setField(term1, term1.getClass(), "playerName", "xxx");
        setIntField(term1, term1.getClass(), "vocaloidPoints", 300);
        setIntField(term1, term1.getClass(), "level", 1);
        setIntField(term1, term1.getClass(), "levelExp", 1162663216);
        setField(term1, term1.getClass(), "levelTitle", "xxx");
        setIntField(term1, term1.getClass(), "plateId", -1);
        setIntField(term1, term1.getClass(), "plateEffectId", -1);
        setField(term1, term1.getClass(), "passwordStatus", enum0);
        setField(term1, term1.getClass(), "password", "**********");
        setBooleanField(term1, term1.getClass(), "preferPerPvModule", true);
        setBooleanField(term1, term1.getClass(), "preferCommonModule", false);
        setBooleanField(term1, term1.getClass(), "usePerPvSkin", false);
        setBooleanField(term1, term1.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term1, term1.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term1, term1.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term1, term1.getClass(), "usePerPvTouchSliderSe", true);
        setField(term1, term1.getClass(), "commonModule", "-999,-999,-999");
        setField(term1, term1.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term125, term125.getClass(), "year", 2026);
        setShortField(term125, term125.getClass(), "month", (short) 6);
        setShortField(term125, term125.getClass(), "day", (short) 29);
        setField(term124, term124.getClass(), "date", term125);
        setByteField(term129, term129.getClass(), "hour", (byte) 4);
        setByteField(term129, term129.getClass(), "minute", (byte) 27);
        setByteField(term129, term129.getClass(), "second", (byte) 10);
        setIntField(term129, term129.getClass(), "nano", 127824000);
        setField(term124, term124.getClass(), "time", term129);
        setField(term1, term1.getClass(), "commonModuleSetTime", term124);
        setField(term1, term1.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term1, term1.getClass(), "commonSkin", -1);
        setIntField(term1, term1.getClass(), "headphoneVolume", 100);
        setBooleanField(term1, term1.getClass(), "buttonSeOn", true);
        setIntField(term1, term1.getClass(), "buttonSeVolume", 100);
        setIntField(term1, term1.getClass(), "sliderSeVolume", 100);
        setIntField(term1, term1.getClass(), "buttonSe", -1);
        setIntField(term1, term1.getClass(), "chainSlideSe", -1);
        setIntField(term1, term1.getClass(), "slideSe", -1);
        setIntField(term1, term1.getClass(), "sliderTouchSe", -1);
        setField(term1, term1.getClass(), "sortMode", enum1);
        setIntField(term1, term1.getClass(), "nextPvId", -1);
        setField(term1, term1.getClass(), "nextDifficulty", enum2);
        setField(term1, term1.getClass(), "nextEdition", enum3);
        setBooleanField(term1, term1.getClass(), "showInterimRanking", true);
        setBooleanField(term1, term1.getClass(), "showClearStatus", true);
        setBooleanField(term1, term1.getClass(), "showGreatBorder", true);
        setBooleanField(term1, term1.getClass(), "showExcellentBorder", true);
        setBooleanField(term1, term1.getClass(), "showRivalBorder", true);
        setBooleanField(term1, term1.getClass(), "showRgoSetting", true);
        setBooleanField(term1, term1.getClass(), "contestNowPlayingEnable", true);
        setIntField(term1, term1.getClass(), "contestNowPlayingId", -1);
        setIntField(term1, term1.getClass(), "contestNowPlayingValue", -1);
        setField(term1, term1.getClass(), "contestNowPlayingResultRank", enum4);
        setField(term1, term1.getClass(), "contestNowPlayingSpecifier", "");
        setField(term1, term1.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term1, term1.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term1, term1.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term1, term1.getClass(), "rivalPdId", -1);
        term606 = new Integer(1484323161);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerContest");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term1;
        args[1] = term606;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


