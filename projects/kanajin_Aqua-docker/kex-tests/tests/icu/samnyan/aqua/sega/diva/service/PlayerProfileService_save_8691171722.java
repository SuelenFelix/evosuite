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

public class PlayerProfileService_save_8691171722 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term639;

    public PlayerProfileService_save_8691171722() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1290 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term1289 = ((Class) term1290).getDeclaredField((String) "MISS");
        ((Field) term1289).setAccessible(true);
        Object enum0 = ((Field) term1289).get((Object) null);
        Class<? extends Object> term1750 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term1749 = ((Class) term1750).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term1749).setAccessible(true);
        Object enum1 = ((Field) term1749).get((Object) null);
        Class<? extends Object> term2088 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term2087 = ((Class) term2088).getDeclaredField((String) "NORMAL");
        ((Field) term2087).setAccessible(true);
        Object enum2 = ((Field) term2087).get((Object) null);
        Class<? extends Object> term2386 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term2385 = ((Class) term2386).getDeclaredField((String) "ORIGINAL");
        ((Field) term2385).setAccessible(true);
        Object enum3 = ((Field) term2385).get((Object) null);
        Class<? extends Object> term2692 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term2691 = ((Class) term2692).getDeclaredField((String) "NONE");
        ((Field) term2691).setAccessible(true);
        Object enum4 = ((Field) term2691).get((Object) null);
        term639 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term762 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term763 = newInstance(Class.forName("java.time.LocalDate"));
        Object term767 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term639, term639.getClass(), "id", 2442117782898005296L);
        setIntField(term639, term639.getClass(), "pdId", 1484323161);
        setField(term639, term639.getClass(), "playerName", "xxx");
        setIntField(term639, term639.getClass(), "vocaloidPoints", 300);
        setIntField(term639, term639.getClass(), "level", 1);
        setIntField(term639, term639.getClass(), "levelExp", 391863371);
        setField(term639, term639.getClass(), "levelTitle", "xxx");
        setIntField(term639, term639.getClass(), "plateId", -1);
        setIntField(term639, term639.getClass(), "plateEffectId", -1);
        setField(term639, term639.getClass(), "passwordStatus", enum0);
        setField(term639, term639.getClass(), "password", "**********");
        setBooleanField(term639, term639.getClass(), "preferPerPvModule", true);
        setBooleanField(term639, term639.getClass(), "preferCommonModule", false);
        setBooleanField(term639, term639.getClass(), "usePerPvSkin", false);
        setBooleanField(term639, term639.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term639, term639.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term639, term639.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term639, term639.getClass(), "usePerPvTouchSliderSe", true);
        setField(term639, term639.getClass(), "commonModule", "-999,-999,-999");
        setField(term639, term639.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term763, term763.getClass(), "year", 2026);
        setShortField(term763, term763.getClass(), "month", (short) 8);
        setShortField(term763, term763.getClass(), "day", (short) 12);
        setField(term762, term762.getClass(), "date", term763);
        setByteField(term767, term767.getClass(), "hour", (byte) 2);
        setByteField(term767, term767.getClass(), "minute", (byte) 7);
        setByteField(term767, term767.getClass(), "second", (byte) 15);
        setIntField(term767, term767.getClass(), "nano", 25970000);
        setField(term762, term762.getClass(), "time", term767);
        setField(term639, term639.getClass(), "commonModuleSetTime", term762);
        setField(term639, term639.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term639, term639.getClass(), "commonSkin", -1);
        setIntField(term639, term639.getClass(), "headphoneVolume", 100);
        setBooleanField(term639, term639.getClass(), "buttonSeOn", true);
        setIntField(term639, term639.getClass(), "buttonSeVolume", 100);
        setIntField(term639, term639.getClass(), "sliderSeVolume", 100);
        setIntField(term639, term639.getClass(), "buttonSe", -1);
        setIntField(term639, term639.getClass(), "chainSlideSe", -1);
        setIntField(term639, term639.getClass(), "slideSe", -1);
        setIntField(term639, term639.getClass(), "sliderTouchSe", -1);
        setField(term639, term639.getClass(), "sortMode", enum1);
        setIntField(term639, term639.getClass(), "nextPvId", -1);
        setField(term639, term639.getClass(), "nextDifficulty", enum2);
        setField(term639, term639.getClass(), "nextEdition", enum3);
        setBooleanField(term639, term639.getClass(), "showInterimRanking", true);
        setBooleanField(term639, term639.getClass(), "showClearStatus", true);
        setBooleanField(term639, term639.getClass(), "showGreatBorder", true);
        setBooleanField(term639, term639.getClass(), "showExcellentBorder", true);
        setBooleanField(term639, term639.getClass(), "showRivalBorder", true);
        setBooleanField(term639, term639.getClass(), "showRgoSetting", true);
        setBooleanField(term639, term639.getClass(), "contestNowPlayingEnable", true);
        setIntField(term639, term639.getClass(), "contestNowPlayingId", -1);
        setIntField(term639, term639.getClass(), "contestNowPlayingValue", -1);
        setField(term639, term639.getClass(), "contestNowPlayingResultRank", enum4);
        setField(term639, term639.getClass(), "contestNowPlayingSpecifier", "");
        setField(term639, term639.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term639, term639.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term639, term639.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term639, term639.getClass(), "rivalPdId", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.service.PlayerProfileService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Object[] args = new Object[1];
        args[0] = term639;
        callMethod(klass, "save", argTypes, null, args);
    }

};


