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

public class PlayerProfile_setUsePerPvButtonSe_19109321665 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term840688;
     Object term841293;

    public PlayerProfile_setUsePerPvButtonSe_19109321665() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term841302 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term841301 = ((Class) term841302).getDeclaredField((String) "MISS");
        ((Field) term841301).setAccessible(true);
        Object enum1812 = ((Field) term841301).get((Object) null);
        Class<? extends Object> term841679 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term841678 = ((Class) term841679).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term841678).setAccessible(true);
        Object enum1813 = ((Field) term841678).get((Object) null);
        Class<? extends Object> term841962 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term841961 = ((Class) term841962).getDeclaredField((String) "NORMAL");
        ((Field) term841961).setAccessible(true);
        Object enum1814 = ((Field) term841961).get((Object) null);
        Class<? extends Object> term842237 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term842236 = ((Class) term842237).getDeclaredField((String) "ORIGINAL");
        ((Field) term842236).setAccessible(true);
        Object enum1815 = ((Field) term842236).get((Object) null);
        Class<? extends Object> term842503 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term842502 = ((Class) term842503).getDeclaredField((String) "NONE");
        ((Field) term842502).setAccessible(true);
        Object enum1816 = ((Field) term842502).get((Object) null);
        term840688 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term840811 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term840812 = newInstance(Class.forName("java.time.LocalDate"));
        Object term840816 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term840688, term840688.getClass(), "id", 7450734758126089960L);
        setIntField(term840688, term840688.getClass(), "pdId", 1637943121);
        setField(term840688, term840688.getClass(), "playerName", "xxx");
        setIntField(term840688, term840688.getClass(), "vocaloidPoints", 300);
        setIntField(term840688, term840688.getClass(), "level", 1);
        setIntField(term840688, term840688.getClass(), "levelExp", -1889806893);
        setField(term840688, term840688.getClass(), "levelTitle", "xxx");
        setIntField(term840688, term840688.getClass(), "plateId", -1);
        setIntField(term840688, term840688.getClass(), "plateEffectId", -1);
        setField(term840688, term840688.getClass(), "passwordStatus", enum1812);
        setField(term840688, term840688.getClass(), "password", "**********");
        setBooleanField(term840688, term840688.getClass(), "preferPerPvModule", true);
        setBooleanField(term840688, term840688.getClass(), "preferCommonModule", false);
        setBooleanField(term840688, term840688.getClass(), "usePerPvSkin", false);
        setBooleanField(term840688, term840688.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term840688, term840688.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term840688, term840688.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term840688, term840688.getClass(), "usePerPvTouchSliderSe", true);
        setField(term840688, term840688.getClass(), "commonModule", "-999,-999,-999");
        setField(term840688, term840688.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term840812, term840812.getClass(), "year", 2026);
        setShortField(term840812, term840812.getClass(), "month", (short) 6);
        setShortField(term840812, term840812.getClass(), "day", (short) 29);
        setField(term840811, term840811.getClass(), "date", term840812);
        setByteField(term840816, term840816.getClass(), "hour", (byte) 4);
        setByteField(term840816, term840816.getClass(), "minute", (byte) 29);
        setByteField(term840816, term840816.getClass(), "second", (byte) 25);
        setIntField(term840816, term840816.getClass(), "nano", 951020000);
        setField(term840811, term840811.getClass(), "time", term840816);
        setField(term840688, term840688.getClass(), "commonModuleSetTime", term840811);
        setField(term840688, term840688.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term840688, term840688.getClass(), "commonSkin", -1);
        setIntField(term840688, term840688.getClass(), "headphoneVolume", 100);
        setBooleanField(term840688, term840688.getClass(), "buttonSeOn", true);
        setIntField(term840688, term840688.getClass(), "buttonSeVolume", 100);
        setIntField(term840688, term840688.getClass(), "sliderSeVolume", 100);
        setIntField(term840688, term840688.getClass(), "buttonSe", -1);
        setIntField(term840688, term840688.getClass(), "chainSlideSe", -1);
        setIntField(term840688, term840688.getClass(), "slideSe", -1);
        setIntField(term840688, term840688.getClass(), "sliderTouchSe", -1);
        setField(term840688, term840688.getClass(), "sortMode", enum1813);
        setIntField(term840688, term840688.getClass(), "nextPvId", -1);
        setField(term840688, term840688.getClass(), "nextDifficulty", enum1814);
        setField(term840688, term840688.getClass(), "nextEdition", enum1815);
        setBooleanField(term840688, term840688.getClass(), "showInterimRanking", true);
        setBooleanField(term840688, term840688.getClass(), "showClearStatus", true);
        setBooleanField(term840688, term840688.getClass(), "showGreatBorder", true);
        setBooleanField(term840688, term840688.getClass(), "showExcellentBorder", true);
        setBooleanField(term840688, term840688.getClass(), "showRivalBorder", true);
        setBooleanField(term840688, term840688.getClass(), "showRgoSetting", true);
        setBooleanField(term840688, term840688.getClass(), "contestNowPlayingEnable", true);
        setIntField(term840688, term840688.getClass(), "contestNowPlayingId", -1);
        setIntField(term840688, term840688.getClass(), "contestNowPlayingValue", -1);
        setField(term840688, term840688.getClass(), "contestNowPlayingResultRank", enum1816);
        setField(term840688, term840688.getClass(), "contestNowPlayingSpecifier", "");
        setField(term840688, term840688.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term840688, term840688.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term840688, term840688.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term840688, term840688.getClass(), "rivalPdId", -1);
        term841293 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term841293;
        callMethod(klass, "setUsePerPvButtonSe", argTypes, term840688, args);
    }

};


