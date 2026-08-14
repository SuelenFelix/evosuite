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

public class PlayerPvCustomize_hashCode_174423233725 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1013300;

    public PlayerPvCustomize_hashCode_174423233725() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1014034 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term1014033 = ((Class) term1014034).getDeclaredField((String) "MISS");
        ((Field) term1014033).setAccessible(true);
        Object enum2145 = ((Field) term1014033).get((Object) null);
        Class<? extends Object> term1014411 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term1014410 = ((Class) term1014411).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term1014410).setAccessible(true);
        Object enum2146 = ((Field) term1014410).get((Object) null);
        Class<? extends Object> term1014694 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term1014693 = ((Class) term1014694).getDeclaredField((String) "NORMAL");
        ((Field) term1014693).setAccessible(true);
        Object enum2147 = ((Field) term1014693).get((Object) null);
        Class<? extends Object> term1014969 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term1014968 = ((Class) term1014969).getDeclaredField((String) "ORIGINAL");
        ((Field) term1014968).setAccessible(true);
        Object enum2148 = ((Field) term1014968).get((Object) null);
        Class<? extends Object> term1015235 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term1015234 = ((Class) term1015235).getDeclaredField((String) "NONE");
        ((Field) term1015234).setAccessible(true);
        Object enum2149 = ((Field) term1015234).get((Object) null);
        term1013300 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvCustomize"));
        Object term1013302 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term1013425 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1013426 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1013430 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term1013300, term1013300.getClass(), "id", 5498944509671266637L);
        setLongField(term1013302, term1013302.getClass(), "id", -6838909359433858599L);
        setIntField(term1013302, term1013302.getClass(), "pdId", 1102029917);
        setField(term1013302, term1013302.getClass(), "playerName", "xxx");
        setIntField(term1013302, term1013302.getClass(), "vocaloidPoints", 300);
        setIntField(term1013302, term1013302.getClass(), "level", 1);
        setIntField(term1013302, term1013302.getClass(), "levelExp", 506784803);
        setField(term1013302, term1013302.getClass(), "levelTitle", "xxx");
        setIntField(term1013302, term1013302.getClass(), "plateId", -1);
        setIntField(term1013302, term1013302.getClass(), "plateEffectId", -1);
        setField(term1013302, term1013302.getClass(), "passwordStatus", enum2145);
        setField(term1013302, term1013302.getClass(), "password", "**********");
        setBooleanField(term1013302, term1013302.getClass(), "preferPerPvModule", true);
        setBooleanField(term1013302, term1013302.getClass(), "preferCommonModule", true);
        setBooleanField(term1013302, term1013302.getClass(), "usePerPvSkin", false);
        setBooleanField(term1013302, term1013302.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term1013302, term1013302.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term1013302, term1013302.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term1013302, term1013302.getClass(), "usePerPvTouchSliderSe", true);
        setField(term1013302, term1013302.getClass(), "commonModule", "-999,-999,-999");
        setField(term1013302, term1013302.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term1013426, term1013426.getClass(), "year", 2026);
        setShortField(term1013426, term1013426.getClass(), "month", (short) 8);
        setShortField(term1013426, term1013426.getClass(), "day", (short) 12);
        setField(term1013425, term1013425.getClass(), "date", term1013426);
        setByteField(term1013430, term1013430.getClass(), "hour", (byte) 2);
        setByteField(term1013430, term1013430.getClass(), "minute", (byte) 5);
        setByteField(term1013430, term1013430.getClass(), "second", (byte) 22);
        setIntField(term1013430, term1013430.getClass(), "nano", 634590000);
        setField(term1013425, term1013425.getClass(), "time", term1013430);
        setField(term1013302, term1013302.getClass(), "commonModuleSetTime", term1013425);
        setField(term1013302, term1013302.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term1013302, term1013302.getClass(), "commonSkin", -1);
        setIntField(term1013302, term1013302.getClass(), "headphoneVolume", 100);
        setBooleanField(term1013302, term1013302.getClass(), "buttonSeOn", true);
        setIntField(term1013302, term1013302.getClass(), "buttonSeVolume", 100);
        setIntField(term1013302, term1013302.getClass(), "sliderSeVolume", 100);
        setIntField(term1013302, term1013302.getClass(), "buttonSe", -1);
        setIntField(term1013302, term1013302.getClass(), "chainSlideSe", -1);
        setIntField(term1013302, term1013302.getClass(), "slideSe", -1);
        setIntField(term1013302, term1013302.getClass(), "sliderTouchSe", -1);
        setField(term1013302, term1013302.getClass(), "sortMode", enum2146);
        setIntField(term1013302, term1013302.getClass(), "nextPvId", -1);
        setField(term1013302, term1013302.getClass(), "nextDifficulty", enum2147);
        setField(term1013302, term1013302.getClass(), "nextEdition", enum2148);
        setBooleanField(term1013302, term1013302.getClass(), "showInterimRanking", true);
        setBooleanField(term1013302, term1013302.getClass(), "showClearStatus", true);
        setBooleanField(term1013302, term1013302.getClass(), "showGreatBorder", true);
        setBooleanField(term1013302, term1013302.getClass(), "showExcellentBorder", true);
        setBooleanField(term1013302, term1013302.getClass(), "showRivalBorder", true);
        setBooleanField(term1013302, term1013302.getClass(), "showRgoSetting", true);
        setBooleanField(term1013302, term1013302.getClass(), "contestNowPlayingEnable", false);
        setIntField(term1013302, term1013302.getClass(), "contestNowPlayingId", -1);
        setIntField(term1013302, term1013302.getClass(), "contestNowPlayingValue", -1);
        setField(term1013302, term1013302.getClass(), "contestNowPlayingResultRank", enum2149);
        setField(term1013302, term1013302.getClass(), "contestNowPlayingSpecifier", "");
        setField(term1013302, term1013302.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term1013302, term1013302.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term1013302, term1013302.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term1013302, term1013302.getClass(), "rivalPdId", -1);
        setField(term1013300, term1013300.getClass(), "pdId", term1013302);
        setIntField(term1013300, term1013300.getClass(), "pvId", -1);
        setField(term1013300, term1013300.getClass(), "module", "-999,-999,-999");
        setField(term1013300, term1013300.getClass(), "customize", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setField(term1013300, term1013300.getClass(), "customizeFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term1013300, term1013300.getClass(), "skin", -1);
        setIntField(term1013300, term1013300.getClass(), "buttonSe", -1);
        setIntField(term1013300, term1013300.getClass(), "slideSe", -1);
        setIntField(term1013300, term1013300.getClass(), "chainSlideSe", -1);
        setIntField(term1013300, term1013300.getClass(), "sliderTouchSe", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvCustomize");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term1013300, args);
    }

};


