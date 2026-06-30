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
import java.lang.Integer;

public class PlayerPvCustomize_setButtonSe_110828692819 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term997192;
     Object term997919;

    public PlayerPvCustomize_setButtonSe_110828692819() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term997928 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term997927 = ((Class) term997928).getDeclaredField((String) "MISS");
        ((Field) term997927).setAccessible(true);
        Object enum2115 = ((Field) term997927).get((Object) null);
        Class<? extends Object> term998305 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term998304 = ((Class) term998305).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term998304).setAccessible(true);
        Object enum2116 = ((Field) term998304).get((Object) null);
        Class<? extends Object> term998588 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term998587 = ((Class) term998588).getDeclaredField((String) "NORMAL");
        ((Field) term998587).setAccessible(true);
        Object enum2117 = ((Field) term998587).get((Object) null);
        Class<? extends Object> term998863 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term998862 = ((Class) term998863).getDeclaredField((String) "ORIGINAL");
        ((Field) term998862).setAccessible(true);
        Object enum2118 = ((Field) term998862).get((Object) null);
        Class<? extends Object> term999129 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term999128 = ((Class) term999129).getDeclaredField((String) "NONE");
        ((Field) term999128).setAccessible(true);
        Object enum2119 = ((Field) term999128).get((Object) null);
        term997192 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvCustomize"));
        Object term997194 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term997317 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term997318 = newInstance(Class.forName("java.time.LocalDate"));
        Object term997322 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term997192, term997192.getClass(), "id", 5160033404788124731L);
        setLongField(term997194, term997194.getClass(), "id", 5071015720043054072L);
        setIntField(term997194, term997194.getClass(), "pdId", 1943280473);
        setField(term997194, term997194.getClass(), "playerName", "xxx");
        setIntField(term997194, term997194.getClass(), "vocaloidPoints", 300);
        setIntField(term997194, term997194.getClass(), "level", 1);
        setIntField(term997194, term997194.getClass(), "levelExp", 1068101842);
        setField(term997194, term997194.getClass(), "levelTitle", "xxx");
        setIntField(term997194, term997194.getClass(), "plateId", -1);
        setIntField(term997194, term997194.getClass(), "plateEffectId", -1);
        setField(term997194, term997194.getClass(), "passwordStatus", enum2115);
        setField(term997194, term997194.getClass(), "password", "**********");
        setBooleanField(term997194, term997194.getClass(), "preferPerPvModule", true);
        setBooleanField(term997194, term997194.getClass(), "preferCommonModule", false);
        setBooleanField(term997194, term997194.getClass(), "usePerPvSkin", true);
        setBooleanField(term997194, term997194.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term997194, term997194.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term997194, term997194.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term997194, term997194.getClass(), "usePerPvTouchSliderSe", true);
        setField(term997194, term997194.getClass(), "commonModule", "-999,-999,-999");
        setField(term997194, term997194.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term997318, term997318.getClass(), "year", 2026);
        setShortField(term997318, term997318.getClass(), "month", (short) 6);
        setShortField(term997318, term997318.getClass(), "day", (short) 29);
        setField(term997317, term997317.getClass(), "date", term997318);
        setByteField(term997322, term997322.getClass(), "hour", (byte) 4);
        setByteField(term997322, term997322.getClass(), "minute", (byte) 30);
        setByteField(term997322, term997322.getClass(), "second", (byte) 8);
        setIntField(term997322, term997322.getClass(), "nano", 991824000);
        setField(term997317, term997317.getClass(), "time", term997322);
        setField(term997194, term997194.getClass(), "commonModuleSetTime", term997317);
        setField(term997194, term997194.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term997194, term997194.getClass(), "commonSkin", -1);
        setIntField(term997194, term997194.getClass(), "headphoneVolume", 100);
        setBooleanField(term997194, term997194.getClass(), "buttonSeOn", true);
        setIntField(term997194, term997194.getClass(), "buttonSeVolume", 100);
        setIntField(term997194, term997194.getClass(), "sliderSeVolume", 100);
        setIntField(term997194, term997194.getClass(), "buttonSe", -1);
        setIntField(term997194, term997194.getClass(), "chainSlideSe", -1);
        setIntField(term997194, term997194.getClass(), "slideSe", -1);
        setIntField(term997194, term997194.getClass(), "sliderTouchSe", -1);
        setField(term997194, term997194.getClass(), "sortMode", enum2116);
        setIntField(term997194, term997194.getClass(), "nextPvId", -1);
        setField(term997194, term997194.getClass(), "nextDifficulty", enum2117);
        setField(term997194, term997194.getClass(), "nextEdition", enum2118);
        setBooleanField(term997194, term997194.getClass(), "showInterimRanking", true);
        setBooleanField(term997194, term997194.getClass(), "showClearStatus", true);
        setBooleanField(term997194, term997194.getClass(), "showGreatBorder", true);
        setBooleanField(term997194, term997194.getClass(), "showExcellentBorder", true);
        setBooleanField(term997194, term997194.getClass(), "showRivalBorder", true);
        setBooleanField(term997194, term997194.getClass(), "showRgoSetting", true);
        setBooleanField(term997194, term997194.getClass(), "contestNowPlayingEnable", false);
        setIntField(term997194, term997194.getClass(), "contestNowPlayingId", -1);
        setIntField(term997194, term997194.getClass(), "contestNowPlayingValue", -1);
        setField(term997194, term997194.getClass(), "contestNowPlayingResultRank", enum2119);
        setField(term997194, term997194.getClass(), "contestNowPlayingSpecifier", "");
        setField(term997194, term997194.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term997194, term997194.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term997194, term997194.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term997194, term997194.getClass(), "rivalPdId", -1);
        setField(term997192, term997192.getClass(), "pdId", term997194);
        setIntField(term997192, term997192.getClass(), "pvId", -1);
        setField(term997192, term997192.getClass(), "module", "-999,-999,-999");
        setField(term997192, term997192.getClass(), "customize", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setField(term997192, term997192.getClass(), "customizeFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term997192, term997192.getClass(), "skin", -1);
        setIntField(term997192, term997192.getClass(), "buttonSe", -1);
        setIntField(term997192, term997192.getClass(), "slideSe", -1);
        setIntField(term997192, term997192.getClass(), "chainSlideSe", -1);
        setIntField(term997192, term997192.getClass(), "sliderTouchSe", -1);
        term997919 = new Integer(1060522715);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvCustomize");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term997919;
        callMethod(klass, "setButtonSe", argTypes, term997192, args);
    }

};


