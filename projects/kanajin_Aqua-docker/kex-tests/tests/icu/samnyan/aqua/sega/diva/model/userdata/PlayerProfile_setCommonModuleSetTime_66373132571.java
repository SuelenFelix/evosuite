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

public class PlayerProfile_setCommonModuleSetTime_66373132571 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term855458;
     Object term856063;

    public PlayerProfile_setCommonModuleSetTime_66373132571() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term856080 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term856079 = ((Class) term856080).getDeclaredField((String) "MISS");
        ((Field) term856079).setAccessible(true);
        Object enum1842 = ((Field) term856079).get((Object) null);
        Class<? extends Object> term856457 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term856456 = ((Class) term856457).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term856456).setAccessible(true);
        Object enum1843 = ((Field) term856456).get((Object) null);
        Class<? extends Object> term856740 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term856739 = ((Class) term856740).getDeclaredField((String) "NORMAL");
        ((Field) term856739).setAccessible(true);
        Object enum1844 = ((Field) term856739).get((Object) null);
        Class<? extends Object> term857015 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term857014 = ((Class) term857015).getDeclaredField((String) "ORIGINAL");
        ((Field) term857014).setAccessible(true);
        Object enum1845 = ((Field) term857014).get((Object) null);
        Class<? extends Object> term857281 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term857280 = ((Class) term857281).getDeclaredField((String) "NONE");
        ((Field) term857280).setAccessible(true);
        Object enum1846 = ((Field) term857280).get((Object) null);
        term855458 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term855581 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term855582 = newInstance(Class.forName("java.time.LocalDate"));
        Object term855586 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term855458, term855458.getClass(), "id", 349726685019432833L);
        setIntField(term855458, term855458.getClass(), "pdId", -1034929475);
        setField(term855458, term855458.getClass(), "playerName", "xxx");
        setIntField(term855458, term855458.getClass(), "vocaloidPoints", 300);
        setIntField(term855458, term855458.getClass(), "level", 1);
        setIntField(term855458, term855458.getClass(), "levelExp", 2125774573);
        setField(term855458, term855458.getClass(), "levelTitle", "xxx");
        setIntField(term855458, term855458.getClass(), "plateId", -1);
        setIntField(term855458, term855458.getClass(), "plateEffectId", -1);
        setField(term855458, term855458.getClass(), "passwordStatus", enum1842);
        setField(term855458, term855458.getClass(), "password", "**********");
        setBooleanField(term855458, term855458.getClass(), "preferPerPvModule", true);
        setBooleanField(term855458, term855458.getClass(), "preferCommonModule", true);
        setBooleanField(term855458, term855458.getClass(), "usePerPvSkin", false);
        setBooleanField(term855458, term855458.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term855458, term855458.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term855458, term855458.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term855458, term855458.getClass(), "usePerPvTouchSliderSe", true);
        setField(term855458, term855458.getClass(), "commonModule", "-999,-999,-999");
        setField(term855458, term855458.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term855582, term855582.getClass(), "year", 2026);
        setShortField(term855582, term855582.getClass(), "month", (short) 6);
        setShortField(term855582, term855582.getClass(), "day", (short) 29);
        setField(term855581, term855581.getClass(), "date", term855582);
        setByteField(term855586, term855586.getClass(), "hour", (byte) 4);
        setByteField(term855586, term855586.getClass(), "minute", (byte) 29);
        setByteField(term855586, term855586.getClass(), "second", (byte) 27);
        setIntField(term855586, term855586.getClass(), "nano", 506502000);
        setField(term855581, term855581.getClass(), "time", term855586);
        setField(term855458, term855458.getClass(), "commonModuleSetTime", term855581);
        setField(term855458, term855458.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term855458, term855458.getClass(), "commonSkin", -1);
        setIntField(term855458, term855458.getClass(), "headphoneVolume", 100);
        setBooleanField(term855458, term855458.getClass(), "buttonSeOn", true);
        setIntField(term855458, term855458.getClass(), "buttonSeVolume", 100);
        setIntField(term855458, term855458.getClass(), "sliderSeVolume", 100);
        setIntField(term855458, term855458.getClass(), "buttonSe", -1);
        setIntField(term855458, term855458.getClass(), "chainSlideSe", -1);
        setIntField(term855458, term855458.getClass(), "slideSe", -1);
        setIntField(term855458, term855458.getClass(), "sliderTouchSe", -1);
        setField(term855458, term855458.getClass(), "sortMode", enum1843);
        setIntField(term855458, term855458.getClass(), "nextPvId", -1);
        setField(term855458, term855458.getClass(), "nextDifficulty", enum1844);
        setField(term855458, term855458.getClass(), "nextEdition", enum1845);
        setBooleanField(term855458, term855458.getClass(), "showInterimRanking", true);
        setBooleanField(term855458, term855458.getClass(), "showClearStatus", true);
        setBooleanField(term855458, term855458.getClass(), "showGreatBorder", true);
        setBooleanField(term855458, term855458.getClass(), "showExcellentBorder", true);
        setBooleanField(term855458, term855458.getClass(), "showRivalBorder", true);
        setBooleanField(term855458, term855458.getClass(), "showRgoSetting", true);
        setBooleanField(term855458, term855458.getClass(), "contestNowPlayingEnable", false);
        setIntField(term855458, term855458.getClass(), "contestNowPlayingId", -1);
        setIntField(term855458, term855458.getClass(), "contestNowPlayingValue", -1);
        setField(term855458, term855458.getClass(), "contestNowPlayingResultRank", enum1846);
        setField(term855458, term855458.getClass(), "contestNowPlayingSpecifier", "");
        setField(term855458, term855458.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term855458, term855458.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term855458, term855458.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term855458, term855458.getClass(), "rivalPdId", -1);
        term856063 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term856064 = newInstance(Class.forName("java.time.LocalDate"));
        Object term856068 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term856064, term856064.getClass(), "year", 2010);
        setShortField(term856064, term856064.getClass(), "month", (short) 11);
        setShortField(term856064, term856064.getClass(), "day", (short) 1);
        setField(term856063, term856063.getClass(), "date", term856064);
        setByteField(term856068, term856068.getClass(), "hour", (byte) 5);
        setByteField(term856068, term856068.getClass(), "minute", (byte) 32);
        setByteField(term856068, term856068.getClass(), "second", (byte) 8);
        setIntField(term856068, term856068.getClass(), "nano", 918832231);
        setField(term856063, term856063.getClass(), "time", term856068);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term856063;
        callMethod(klass, "setCommonModuleSetTime", argTypes, term855458, args);
    }

};


