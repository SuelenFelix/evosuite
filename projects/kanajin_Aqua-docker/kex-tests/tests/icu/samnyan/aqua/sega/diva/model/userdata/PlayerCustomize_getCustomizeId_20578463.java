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

public class PlayerCustomize_getCustomizeId_20578463 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term460788;

    public PlayerCustomize_getCustomizeId_20578463() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term461403 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term461402 = ((Class) term461403).getDeclaredField((String) "MISS");
        ((Field) term461402).setAccessible(true);
        Object enum1032 = ((Field) term461402).get((Object) null);
        Class<? extends Object> term461780 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term461779 = ((Class) term461780).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term461779).setAccessible(true);
        Object enum1033 = ((Field) term461779).get((Object) null);
        Class<? extends Object> term462063 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term462062 = ((Class) term462063).getDeclaredField((String) "NORMAL");
        ((Field) term462062).setAccessible(true);
        Object enum1034 = ((Field) term462062).get((Object) null);
        Class<? extends Object> term462338 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term462337 = ((Class) term462338).getDeclaredField((String) "ORIGINAL");
        ((Field) term462337).setAccessible(true);
        Object enum1035 = ((Field) term462337).get((Object) null);
        Class<? extends Object> term462604 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term462603 = ((Class) term462604).getDeclaredField((String) "NONE");
        ((Field) term462603).setAccessible(true);
        Object enum1036 = ((Field) term462603).get((Object) null);
        term460788 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerCustomize"));
        Object term460790 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term460913 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term460914 = newInstance(Class.forName("java.time.LocalDate"));
        Object term460918 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term460788, term460788.getClass(), "id", -6078481855513028760L);
        setLongField(term460790, term460790.getClass(), "id", -6985556670871089725L);
        setIntField(term460790, term460790.getClass(), "pdId", -1458746421);
        setField(term460790, term460790.getClass(), "playerName", "xxx");
        setIntField(term460790, term460790.getClass(), "vocaloidPoints", 300);
        setIntField(term460790, term460790.getClass(), "level", 1);
        setIntField(term460790, term460790.getClass(), "levelExp", 1248508832);
        setField(term460790, term460790.getClass(), "levelTitle", "xxx");
        setIntField(term460790, term460790.getClass(), "plateId", -1);
        setIntField(term460790, term460790.getClass(), "plateEffectId", -1);
        setField(term460790, term460790.getClass(), "passwordStatus", enum1032);
        setField(term460790, term460790.getClass(), "password", "**********");
        setBooleanField(term460790, term460790.getClass(), "preferPerPvModule", true);
        setBooleanField(term460790, term460790.getClass(), "preferCommonModule", true);
        setBooleanField(term460790, term460790.getClass(), "usePerPvSkin", true);
        setBooleanField(term460790, term460790.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term460790, term460790.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term460790, term460790.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term460790, term460790.getClass(), "usePerPvTouchSliderSe", true);
        setField(term460790, term460790.getClass(), "commonModule", "-999,-999,-999");
        setField(term460790, term460790.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term460914, term460914.getClass(), "year", 2026);
        setShortField(term460914, term460914.getClass(), "month", (short) 6);
        setShortField(term460914, term460914.getClass(), "day", (short) 29);
        setField(term460913, term460913.getClass(), "date", term460914);
        setByteField(term460918, term460918.getClass(), "hour", (byte) 4);
        setByteField(term460918, term460918.getClass(), "minute", (byte) 28);
        setByteField(term460918, term460918.getClass(), "second", (byte) 25);
        setIntField(term460918, term460918.getClass(), "nano", 76259000);
        setField(term460913, term460913.getClass(), "time", term460918);
        setField(term460790, term460790.getClass(), "commonModuleSetTime", term460913);
        setField(term460790, term460790.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term460790, term460790.getClass(), "commonSkin", -1);
        setIntField(term460790, term460790.getClass(), "headphoneVolume", 100);
        setBooleanField(term460790, term460790.getClass(), "buttonSeOn", true);
        setIntField(term460790, term460790.getClass(), "buttonSeVolume", 100);
        setIntField(term460790, term460790.getClass(), "sliderSeVolume", 100);
        setIntField(term460790, term460790.getClass(), "buttonSe", -1);
        setIntField(term460790, term460790.getClass(), "chainSlideSe", -1);
        setIntField(term460790, term460790.getClass(), "slideSe", -1);
        setIntField(term460790, term460790.getClass(), "sliderTouchSe", -1);
        setField(term460790, term460790.getClass(), "sortMode", enum1033);
        setIntField(term460790, term460790.getClass(), "nextPvId", -1);
        setField(term460790, term460790.getClass(), "nextDifficulty", enum1034);
        setField(term460790, term460790.getClass(), "nextEdition", enum1035);
        setBooleanField(term460790, term460790.getClass(), "showInterimRanking", true);
        setBooleanField(term460790, term460790.getClass(), "showClearStatus", true);
        setBooleanField(term460790, term460790.getClass(), "showGreatBorder", true);
        setBooleanField(term460790, term460790.getClass(), "showExcellentBorder", true);
        setBooleanField(term460790, term460790.getClass(), "showRivalBorder", true);
        setBooleanField(term460790, term460790.getClass(), "showRgoSetting", true);
        setBooleanField(term460790, term460790.getClass(), "contestNowPlayingEnable", false);
        setIntField(term460790, term460790.getClass(), "contestNowPlayingId", -1);
        setIntField(term460790, term460790.getClass(), "contestNowPlayingValue", -1);
        setField(term460790, term460790.getClass(), "contestNowPlayingResultRank", enum1036);
        setField(term460790, term460790.getClass(), "contestNowPlayingSpecifier", "");
        setField(term460790, term460790.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term460790, term460790.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term460790, term460790.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term460790, term460790.getClass(), "rivalPdId", -1);
        setField(term460788, term460788.getClass(), "pdId", term460790);
        setIntField(term460788, term460788.getClass(), "customizeId", -1508290965);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerCustomize");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCustomizeId", argTypes, term460788, args);
    }

};


