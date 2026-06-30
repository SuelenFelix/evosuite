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

public class PlayerPvCustomize_init_14932119530 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term945344;
     Object term945949;

    public PlayerPvCustomize_init_14932119530() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term945958 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term945957 = ((Class) term945958).getDeclaredField((String) "MISS");
        ((Field) term945957).setAccessible(true);
        Object enum2020 = ((Field) term945957).get((Object) null);
        Class<? extends Object> term946335 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term946334 = ((Class) term946335).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term946334).setAccessible(true);
        Object enum2021 = ((Field) term946334).get((Object) null);
        Class<? extends Object> term946618 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term946617 = ((Class) term946618).getDeclaredField((String) "NORMAL");
        ((Field) term946617).setAccessible(true);
        Object enum2022 = ((Field) term946617).get((Object) null);
        Class<? extends Object> term946893 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term946892 = ((Class) term946893).getDeclaredField((String) "ORIGINAL");
        ((Field) term946892).setAccessible(true);
        Object enum2023 = ((Field) term946892).get((Object) null);
        Class<? extends Object> term947159 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term947158 = ((Class) term947159).getDeclaredField((String) "NONE");
        ((Field) term947158).setAccessible(true);
        Object enum2024 = ((Field) term947158).get((Object) null);
        term945344 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term945467 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term945468 = newInstance(Class.forName("java.time.LocalDate"));
        Object term945472 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term945344, term945344.getClass(), "id", -4994148485124075625L);
        setIntField(term945344, term945344.getClass(), "pdId", -1513402749);
        setField(term945344, term945344.getClass(), "playerName", "xxx");
        setIntField(term945344, term945344.getClass(), "vocaloidPoints", 300);
        setIntField(term945344, term945344.getClass(), "level", 1);
        setIntField(term945344, term945344.getClass(), "levelExp", -1865692837);
        setField(term945344, term945344.getClass(), "levelTitle", "xxx");
        setIntField(term945344, term945344.getClass(), "plateId", -1);
        setIntField(term945344, term945344.getClass(), "plateEffectId", -1);
        setField(term945344, term945344.getClass(), "passwordStatus", enum2020);
        setField(term945344, term945344.getClass(), "password", "**********");
        setBooleanField(term945344, term945344.getClass(), "preferPerPvModule", true);
        setBooleanField(term945344, term945344.getClass(), "preferCommonModule", false);
        setBooleanField(term945344, term945344.getClass(), "usePerPvSkin", true);
        setBooleanField(term945344, term945344.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term945344, term945344.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term945344, term945344.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term945344, term945344.getClass(), "usePerPvTouchSliderSe", false);
        setField(term945344, term945344.getClass(), "commonModule", "-999,-999,-999");
        setField(term945344, term945344.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term945468, term945468.getClass(), "year", 2026);
        setShortField(term945468, term945468.getClass(), "month", (short) 6);
        setShortField(term945468, term945468.getClass(), "day", (short) 29);
        setField(term945467, term945467.getClass(), "date", term945468);
        setByteField(term945472, term945472.getClass(), "hour", (byte) 4);
        setByteField(term945472, term945472.getClass(), "minute", (byte) 30);
        setByteField(term945472, term945472.getClass(), "second", (byte) 4);
        setIntField(term945472, term945472.getClass(), "nano", 105679000);
        setField(term945467, term945467.getClass(), "time", term945472);
        setField(term945344, term945344.getClass(), "commonModuleSetTime", term945467);
        setField(term945344, term945344.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term945344, term945344.getClass(), "commonSkin", -1);
        setIntField(term945344, term945344.getClass(), "headphoneVolume", 100);
        setBooleanField(term945344, term945344.getClass(), "buttonSeOn", true);
        setIntField(term945344, term945344.getClass(), "buttonSeVolume", 100);
        setIntField(term945344, term945344.getClass(), "sliderSeVolume", 100);
        setIntField(term945344, term945344.getClass(), "buttonSe", -1);
        setIntField(term945344, term945344.getClass(), "chainSlideSe", -1);
        setIntField(term945344, term945344.getClass(), "slideSe", -1);
        setIntField(term945344, term945344.getClass(), "sliderTouchSe", -1);
        setField(term945344, term945344.getClass(), "sortMode", enum2021);
        setIntField(term945344, term945344.getClass(), "nextPvId", -1);
        setField(term945344, term945344.getClass(), "nextDifficulty", enum2022);
        setField(term945344, term945344.getClass(), "nextEdition", enum2023);
        setBooleanField(term945344, term945344.getClass(), "showInterimRanking", true);
        setBooleanField(term945344, term945344.getClass(), "showClearStatus", true);
        setBooleanField(term945344, term945344.getClass(), "showGreatBorder", true);
        setBooleanField(term945344, term945344.getClass(), "showExcellentBorder", true);
        setBooleanField(term945344, term945344.getClass(), "showRivalBorder", true);
        setBooleanField(term945344, term945344.getClass(), "showRgoSetting", true);
        setBooleanField(term945344, term945344.getClass(), "contestNowPlayingEnable", false);
        setIntField(term945344, term945344.getClass(), "contestNowPlayingId", -1);
        setIntField(term945344, term945344.getClass(), "contestNowPlayingValue", -1);
        setField(term945344, term945344.getClass(), "contestNowPlayingResultRank", enum2024);
        setField(term945344, term945344.getClass(), "contestNowPlayingSpecifier", "");
        setField(term945344, term945344.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term945344, term945344.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term945344, term945344.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term945344, term945344.getClass(), "rivalPdId", -1);
        term945949 = new Integer(966678407);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvCustomize");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term945344;
        args[1] = term945949;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


