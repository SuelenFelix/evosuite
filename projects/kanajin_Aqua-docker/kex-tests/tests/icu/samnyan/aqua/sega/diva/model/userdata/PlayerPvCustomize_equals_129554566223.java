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
import java.lang.Object;
import java.lang.String;

public class PlayerPvCustomize_equals_129554566223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1007932;
     Object term1008659;

    public PlayerPvCustomize_equals_129554566223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1008667 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term1008666 = ((Class) term1008667).getDeclaredField((String) "MISS");
        ((Field) term1008666).setAccessible(true);
        Object enum2135 = ((Field) term1008666).get((Object) null);
        Class<? extends Object> term1009044 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term1009043 = ((Class) term1009044).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term1009043).setAccessible(true);
        Object enum2136 = ((Field) term1009043).get((Object) null);
        Class<? extends Object> term1009327 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term1009326 = ((Class) term1009327).getDeclaredField((String) "NORMAL");
        ((Field) term1009326).setAccessible(true);
        Object enum2137 = ((Field) term1009326).get((Object) null);
        Class<? extends Object> term1009602 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term1009601 = ((Class) term1009602).getDeclaredField((String) "ORIGINAL");
        ((Field) term1009601).setAccessible(true);
        Object enum2138 = ((Field) term1009601).get((Object) null);
        Class<? extends Object> term1009868 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term1009867 = ((Class) term1009868).getDeclaredField((String) "NONE");
        ((Field) term1009867).setAccessible(true);
        Object enum2139 = ((Field) term1009867).get((Object) null);
        term1007932 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvCustomize"));
        Object term1007934 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term1008057 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1008058 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1008062 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term1007932, term1007932.getClass(), "id", 493557348274366095L);
        setLongField(term1007934, term1007934.getClass(), "id", 8699742215739444902L);
        setIntField(term1007934, term1007934.getClass(), "pdId", 1990162126);
        setField(term1007934, term1007934.getClass(), "playerName", "xxx");
        setIntField(term1007934, term1007934.getClass(), "vocaloidPoints", 300);
        setIntField(term1007934, term1007934.getClass(), "level", 1);
        setIntField(term1007934, term1007934.getClass(), "levelExp", 1728957652);
        setField(term1007934, term1007934.getClass(), "levelTitle", "xxx");
        setIntField(term1007934, term1007934.getClass(), "plateId", -1);
        setIntField(term1007934, term1007934.getClass(), "plateEffectId", -1);
        setField(term1007934, term1007934.getClass(), "passwordStatus", enum2135);
        setField(term1007934, term1007934.getClass(), "password", "**********");
        setBooleanField(term1007934, term1007934.getClass(), "preferPerPvModule", true);
        setBooleanField(term1007934, term1007934.getClass(), "preferCommonModule", false);
        setBooleanField(term1007934, term1007934.getClass(), "usePerPvSkin", false);
        setBooleanField(term1007934, term1007934.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term1007934, term1007934.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term1007934, term1007934.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term1007934, term1007934.getClass(), "usePerPvTouchSliderSe", false);
        setField(term1007934, term1007934.getClass(), "commonModule", "-999,-999,-999");
        setField(term1007934, term1007934.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term1008058, term1008058.getClass(), "year", 2026);
        setShortField(term1008058, term1008058.getClass(), "month", (short) 8);
        setShortField(term1008058, term1008058.getClass(), "day", (short) 12);
        setField(term1008057, term1008057.getClass(), "date", term1008058);
        setByteField(term1008062, term1008062.getClass(), "hour", (byte) 2);
        setByteField(term1008062, term1008062.getClass(), "minute", (byte) 5);
        setByteField(term1008062, term1008062.getClass(), "second", (byte) 22);
        setIntField(term1008062, term1008062.getClass(), "nano", 135847000);
        setField(term1008057, term1008057.getClass(), "time", term1008062);
        setField(term1007934, term1007934.getClass(), "commonModuleSetTime", term1008057);
        setField(term1007934, term1007934.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term1007934, term1007934.getClass(), "commonSkin", -1);
        setIntField(term1007934, term1007934.getClass(), "headphoneVolume", 100);
        setBooleanField(term1007934, term1007934.getClass(), "buttonSeOn", true);
        setIntField(term1007934, term1007934.getClass(), "buttonSeVolume", 100);
        setIntField(term1007934, term1007934.getClass(), "sliderSeVolume", 100);
        setIntField(term1007934, term1007934.getClass(), "buttonSe", -1);
        setIntField(term1007934, term1007934.getClass(), "chainSlideSe", -1);
        setIntField(term1007934, term1007934.getClass(), "slideSe", -1);
        setIntField(term1007934, term1007934.getClass(), "sliderTouchSe", -1);
        setField(term1007934, term1007934.getClass(), "sortMode", enum2136);
        setIntField(term1007934, term1007934.getClass(), "nextPvId", -1);
        setField(term1007934, term1007934.getClass(), "nextDifficulty", enum2137);
        setField(term1007934, term1007934.getClass(), "nextEdition", enum2138);
        setBooleanField(term1007934, term1007934.getClass(), "showInterimRanking", true);
        setBooleanField(term1007934, term1007934.getClass(), "showClearStatus", true);
        setBooleanField(term1007934, term1007934.getClass(), "showGreatBorder", true);
        setBooleanField(term1007934, term1007934.getClass(), "showExcellentBorder", true);
        setBooleanField(term1007934, term1007934.getClass(), "showRivalBorder", true);
        setBooleanField(term1007934, term1007934.getClass(), "showRgoSetting", true);
        setBooleanField(term1007934, term1007934.getClass(), "contestNowPlayingEnable", false);
        setIntField(term1007934, term1007934.getClass(), "contestNowPlayingId", -1);
        setIntField(term1007934, term1007934.getClass(), "contestNowPlayingValue", -1);
        setField(term1007934, term1007934.getClass(), "contestNowPlayingResultRank", enum2139);
        setField(term1007934, term1007934.getClass(), "contestNowPlayingSpecifier", "");
        setField(term1007934, term1007934.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term1007934, term1007934.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term1007934, term1007934.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term1007934, term1007934.getClass(), "rivalPdId", -1);
        setField(term1007932, term1007932.getClass(), "pdId", term1007934);
        setIntField(term1007932, term1007932.getClass(), "pvId", -1);
        setField(term1007932, term1007932.getClass(), "module", "-999,-999,-999");
        setField(term1007932, term1007932.getClass(), "customize", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setField(term1007932, term1007932.getClass(), "customizeFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term1007932, term1007932.getClass(), "skin", -1);
        setIntField(term1007932, term1007932.getClass(), "buttonSe", -1);
        setIntField(term1007932, term1007932.getClass(), "slideSe", -1);
        setIntField(term1007932, term1007932.getClass(), "chainSlideSe", -1);
        setIntField(term1007932, term1007932.getClass(), "sliderTouchSe", -1);
        term1008659 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvCustomize");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term1008659;
        callMethod(klass, "equals", argTypes, term1007932, args);
    }

};


