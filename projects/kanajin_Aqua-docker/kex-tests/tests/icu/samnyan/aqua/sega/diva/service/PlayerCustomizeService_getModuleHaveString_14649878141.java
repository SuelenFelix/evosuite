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

public class PlayerCustomizeService_getModuleHaveString_14649878141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5790;

    public PlayerCustomizeService_getModuleHaveString_14649878141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6402 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term6401 = ((Class) term6402).getDeclaredField((String) "MISS");
        ((Field) term6401).setAccessible(true);
        Object enum10 = ((Field) term6401).get((Object) null);
        Class<? extends Object> term6779 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term6778 = ((Class) term6779).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term6778).setAccessible(true);
        Object enum11 = ((Field) term6778).get((Object) null);
        Class<? extends Object> term7062 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term7061 = ((Class) term7062).getDeclaredField((String) "NORMAL");
        ((Field) term7061).setAccessible(true);
        Object enum12 = ((Field) term7061).get((Object) null);
        Class<? extends Object> term7337 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term7336 = ((Class) term7337).getDeclaredField((String) "ORIGINAL");
        ((Field) term7336).setAccessible(true);
        Object enum13 = ((Field) term7336).get((Object) null);
        Class<? extends Object> term7603 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term7602 = ((Class) term7603).getDeclaredField((String) "NONE");
        ((Field) term7602).setAccessible(true);
        Object enum14 = ((Field) term7602).get((Object) null);
        term5790 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term5913 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5914 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5918 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term5790, term5790.getClass(), "id", -8257434502486459194L);
        setIntField(term5790, term5790.getClass(), "pdId", -2038273078);
        setField(term5790, term5790.getClass(), "playerName", "xxx");
        setIntField(term5790, term5790.getClass(), "vocaloidPoints", 300);
        setIntField(term5790, term5790.getClass(), "level", 1);
        setIntField(term5790, term5790.getClass(), "levelExp", 1227103734);
        setField(term5790, term5790.getClass(), "levelTitle", "xxx");
        setIntField(term5790, term5790.getClass(), "plateId", -1);
        setIntField(term5790, term5790.getClass(), "plateEffectId", -1);
        setField(term5790, term5790.getClass(), "passwordStatus", enum10);
        setField(term5790, term5790.getClass(), "password", "**********");
        setBooleanField(term5790, term5790.getClass(), "preferPerPvModule", true);
        setBooleanField(term5790, term5790.getClass(), "preferCommonModule", false);
        setBooleanField(term5790, term5790.getClass(), "usePerPvSkin", false);
        setBooleanField(term5790, term5790.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term5790, term5790.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term5790, term5790.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term5790, term5790.getClass(), "usePerPvTouchSliderSe", false);
        setField(term5790, term5790.getClass(), "commonModule", "-999,-999,-999");
        setField(term5790, term5790.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term5914, term5914.getClass(), "year", 2026);
        setShortField(term5914, term5914.getClass(), "month", (short) 6);
        setShortField(term5914, term5914.getClass(), "day", (short) 29);
        setField(term5913, term5913.getClass(), "date", term5914);
        setByteField(term5918, term5918.getClass(), "hour", (byte) 4);
        setByteField(term5918, term5918.getClass(), "minute", (byte) 32);
        setByteField(term5918, term5918.getClass(), "second", (byte) 3);
        setIntField(term5918, term5918.getClass(), "nano", 880769000);
        setField(term5913, term5913.getClass(), "time", term5918);
        setField(term5790, term5790.getClass(), "commonModuleSetTime", term5913);
        setField(term5790, term5790.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term5790, term5790.getClass(), "commonSkin", -1);
        setIntField(term5790, term5790.getClass(), "headphoneVolume", 100);
        setBooleanField(term5790, term5790.getClass(), "buttonSeOn", true);
        setIntField(term5790, term5790.getClass(), "buttonSeVolume", 100);
        setIntField(term5790, term5790.getClass(), "sliderSeVolume", 100);
        setIntField(term5790, term5790.getClass(), "buttonSe", -1);
        setIntField(term5790, term5790.getClass(), "chainSlideSe", -1);
        setIntField(term5790, term5790.getClass(), "slideSe", -1);
        setIntField(term5790, term5790.getClass(), "sliderTouchSe", -1);
        setField(term5790, term5790.getClass(), "sortMode", enum11);
        setIntField(term5790, term5790.getClass(), "nextPvId", -1);
        setField(term5790, term5790.getClass(), "nextDifficulty", enum12);
        setField(term5790, term5790.getClass(), "nextEdition", enum13);
        setBooleanField(term5790, term5790.getClass(), "showInterimRanking", true);
        setBooleanField(term5790, term5790.getClass(), "showClearStatus", true);
        setBooleanField(term5790, term5790.getClass(), "showGreatBorder", true);
        setBooleanField(term5790, term5790.getClass(), "showExcellentBorder", true);
        setBooleanField(term5790, term5790.getClass(), "showRivalBorder", true);
        setBooleanField(term5790, term5790.getClass(), "showRgoSetting", true);
        setBooleanField(term5790, term5790.getClass(), "contestNowPlayingEnable", true);
        setIntField(term5790, term5790.getClass(), "contestNowPlayingId", -1);
        setIntField(term5790, term5790.getClass(), "contestNowPlayingValue", -1);
        setField(term5790, term5790.getClass(), "contestNowPlayingResultRank", enum14);
        setField(term5790, term5790.getClass(), "contestNowPlayingSpecifier", "");
        setField(term5790, term5790.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term5790, term5790.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term5790, term5790.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term5790, term5790.getClass(), "rivalPdId", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.service.PlayerCustomizeService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Object[] args = new Object[1];
        args[0] = term5790;
        callMethod(klass, "getModuleHaveString", argTypes, null, args);
    }

};


