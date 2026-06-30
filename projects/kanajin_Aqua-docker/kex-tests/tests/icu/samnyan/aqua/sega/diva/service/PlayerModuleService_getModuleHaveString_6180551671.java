package icu.samnyan.aqua.sega.diva.service;

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
import static icu.samnyan.aqua.sega.diva.service.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class PlayerModuleService_getModuleHaveString_6180551671 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10700;

    public PlayerModuleService_getModuleHaveString_6180551671() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term11312 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term11311 = ((Class) term11312).getDeclaredField((String) "MISS");
        ((Field) term11311).setAccessible(true);
        Object enum20 = ((Field) term11311).get((Object) null);
        Class<? extends Object> term11689 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term11688 = ((Class) term11689).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term11688).setAccessible(true);
        Object enum21 = ((Field) term11688).get((Object) null);
        Class<? extends Object> term11972 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term11971 = ((Class) term11972).getDeclaredField((String) "NORMAL");
        ((Field) term11971).setAccessible(true);
        Object enum22 = ((Field) term11971).get((Object) null);
        Class<? extends Object> term12247 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term12246 = ((Class) term12247).getDeclaredField((String) "ORIGINAL");
        ((Field) term12246).setAccessible(true);
        Object enum23 = ((Field) term12246).get((Object) null);
        Class<? extends Object> term12513 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term12512 = ((Class) term12513).getDeclaredField((String) "NONE");
        ((Field) term12512).setAccessible(true);
        Object enum24 = ((Field) term12512).get((Object) null);
        term10700 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term10823 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10824 = newInstance(Class.forName("java.time.LocalDate"));
        Object term10828 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term10700, term10700.getClass(), "id", 5270370404989704783L);
        setIntField(term10700, term10700.getClass(), "pdId", 1134449235);
        setField(term10700, term10700.getClass(), "playerName", "xxx");
        setIntField(term10700, term10700.getClass(), "vocaloidPoints", 300);
        setIntField(term10700, term10700.getClass(), "level", 1);
        setIntField(term10700, term10700.getClass(), "levelExp", -883034806);
        setField(term10700, term10700.getClass(), "levelTitle", "xxx");
        setIntField(term10700, term10700.getClass(), "plateId", -1);
        setIntField(term10700, term10700.getClass(), "plateEffectId", -1);
        setField(term10700, term10700.getClass(), "passwordStatus", enum20);
        setField(term10700, term10700.getClass(), "password", "**********");
        setBooleanField(term10700, term10700.getClass(), "preferPerPvModule", true);
        setBooleanField(term10700, term10700.getClass(), "preferCommonModule", true);
        setBooleanField(term10700, term10700.getClass(), "usePerPvSkin", true);
        setBooleanField(term10700, term10700.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term10700, term10700.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term10700, term10700.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term10700, term10700.getClass(), "usePerPvTouchSliderSe", true);
        setField(term10700, term10700.getClass(), "commonModule", "-999,-999,-999");
        setField(term10700, term10700.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term10824, term10824.getClass(), "year", 2026);
        setShortField(term10824, term10824.getClass(), "month", (short) 6);
        setShortField(term10824, term10824.getClass(), "day", (short) 29);
        setField(term10823, term10823.getClass(), "date", term10824);
        setByteField(term10828, term10828.getClass(), "hour", (byte) 4);
        setByteField(term10828, term10828.getClass(), "minute", (byte) 32);
        setByteField(term10828, term10828.getClass(), "second", (byte) 4);
        setIntField(term10828, term10828.getClass(), "nano", 498375000);
        setField(term10823, term10823.getClass(), "time", term10828);
        setField(term10700, term10700.getClass(), "commonModuleSetTime", term10823);
        setField(term10700, term10700.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term10700, term10700.getClass(), "commonSkin", -1);
        setIntField(term10700, term10700.getClass(), "headphoneVolume", 100);
        setBooleanField(term10700, term10700.getClass(), "buttonSeOn", true);
        setIntField(term10700, term10700.getClass(), "buttonSeVolume", 100);
        setIntField(term10700, term10700.getClass(), "sliderSeVolume", 100);
        setIntField(term10700, term10700.getClass(), "buttonSe", -1);
        setIntField(term10700, term10700.getClass(), "chainSlideSe", -1);
        setIntField(term10700, term10700.getClass(), "slideSe", -1);
        setIntField(term10700, term10700.getClass(), "sliderTouchSe", -1);
        setField(term10700, term10700.getClass(), "sortMode", enum21);
        setIntField(term10700, term10700.getClass(), "nextPvId", -1);
        setField(term10700, term10700.getClass(), "nextDifficulty", enum22);
        setField(term10700, term10700.getClass(), "nextEdition", enum23);
        setBooleanField(term10700, term10700.getClass(), "showInterimRanking", true);
        setBooleanField(term10700, term10700.getClass(), "showClearStatus", true);
        setBooleanField(term10700, term10700.getClass(), "showGreatBorder", true);
        setBooleanField(term10700, term10700.getClass(), "showExcellentBorder", true);
        setBooleanField(term10700, term10700.getClass(), "showRivalBorder", true);
        setBooleanField(term10700, term10700.getClass(), "showRgoSetting", true);
        setBooleanField(term10700, term10700.getClass(), "contestNowPlayingEnable", false);
        setIntField(term10700, term10700.getClass(), "contestNowPlayingId", -1);
        setIntField(term10700, term10700.getClass(), "contestNowPlayingValue", -1);
        setField(term10700, term10700.getClass(), "contestNowPlayingResultRank", enum24);
        setField(term10700, term10700.getClass(), "contestNowPlayingSpecifier", "");
        setField(term10700, term10700.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term10700, term10700.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term10700, term10700.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term10700, term10700.getClass(), "rivalPdId", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.service.PlayerModuleService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Object[] args = new Object[1];
        args[0] = term10700;
        callMethod(klass, "getModuleHaveString", argTypes, null, args);
    }

};


