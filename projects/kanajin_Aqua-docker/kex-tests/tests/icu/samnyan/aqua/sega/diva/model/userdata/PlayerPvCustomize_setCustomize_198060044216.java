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

public class PlayerPvCustomize_setCustomize_198060044216 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term989097;

    public PlayerPvCustomize_setCustomize_198060044216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term989843 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term989842 = ((Class) term989843).getDeclaredField((String) "MISS");
        ((Field) term989842).setAccessible(true);
        Object enum2100 = ((Field) term989842).get((Object) null);
        Class<? extends Object> term990220 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term990219 = ((Class) term990220).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term990219).setAccessible(true);
        Object enum2101 = ((Field) term990219).get((Object) null);
        Class<? extends Object> term990503 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term990502 = ((Class) term990503).getDeclaredField((String) "NORMAL");
        ((Field) term990502).setAccessible(true);
        Object enum2102 = ((Field) term990502).get((Object) null);
        Class<? extends Object> term990778 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term990777 = ((Class) term990778).getDeclaredField((String) "ORIGINAL");
        ((Field) term990777).setAccessible(true);
        Object enum2103 = ((Field) term990777).get((Object) null);
        Class<? extends Object> term991044 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term991043 = ((Class) term991044).getDeclaredField((String) "NONE");
        ((Field) term991043).setAccessible(true);
        Object enum2104 = ((Field) term991043).get((Object) null);
        term989097 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvCustomize"));
        Object term989099 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term989222 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term989223 = newInstance(Class.forName("java.time.LocalDate"));
        Object term989227 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term989097, term989097.getClass(), "id", -2413135395771470086L);
        setLongField(term989099, term989099.getClass(), "id", -823085399570394644L);
        setIntField(term989099, term989099.getClass(), "pdId", -1258846135);
        setField(term989099, term989099.getClass(), "playerName", "xxx");
        setIntField(term989099, term989099.getClass(), "vocaloidPoints", 300);
        setIntField(term989099, term989099.getClass(), "level", 1);
        setIntField(term989099, term989099.getClass(), "levelExp", -2113882456);
        setField(term989099, term989099.getClass(), "levelTitle", "xxx");
        setIntField(term989099, term989099.getClass(), "plateId", -1);
        setIntField(term989099, term989099.getClass(), "plateEffectId", -1);
        setField(term989099, term989099.getClass(), "passwordStatus", enum2100);
        setField(term989099, term989099.getClass(), "password", "**********");
        setBooleanField(term989099, term989099.getClass(), "preferPerPvModule", true);
        setBooleanField(term989099, term989099.getClass(), "preferCommonModule", false);
        setBooleanField(term989099, term989099.getClass(), "usePerPvSkin", true);
        setBooleanField(term989099, term989099.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term989099, term989099.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term989099, term989099.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term989099, term989099.getClass(), "usePerPvTouchSliderSe", false);
        setField(term989099, term989099.getClass(), "commonModule", "-999,-999,-999");
        setField(term989099, term989099.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term989223, term989223.getClass(), "year", 2026);
        setShortField(term989223, term989223.getClass(), "month", (short) 8);
        setShortField(term989223, term989223.getClass(), "day", (short) 12);
        setField(term989222, term989222.getClass(), "date", term989223);
        setByteField(term989227, term989227.getClass(), "hour", (byte) 2);
        setByteField(term989227, term989227.getClass(), "minute", (byte) 5);
        setByteField(term989227, term989227.getClass(), "second", (byte) 20);
        setIntField(term989227, term989227.getClass(), "nano", 381607000);
        setField(term989222, term989222.getClass(), "time", term989227);
        setField(term989099, term989099.getClass(), "commonModuleSetTime", term989222);
        setField(term989099, term989099.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term989099, term989099.getClass(), "commonSkin", -1);
        setIntField(term989099, term989099.getClass(), "headphoneVolume", 100);
        setBooleanField(term989099, term989099.getClass(), "buttonSeOn", true);
        setIntField(term989099, term989099.getClass(), "buttonSeVolume", 100);
        setIntField(term989099, term989099.getClass(), "sliderSeVolume", 100);
        setIntField(term989099, term989099.getClass(), "buttonSe", -1);
        setIntField(term989099, term989099.getClass(), "chainSlideSe", -1);
        setIntField(term989099, term989099.getClass(), "slideSe", -1);
        setIntField(term989099, term989099.getClass(), "sliderTouchSe", -1);
        setField(term989099, term989099.getClass(), "sortMode", enum2101);
        setIntField(term989099, term989099.getClass(), "nextPvId", -1);
        setField(term989099, term989099.getClass(), "nextDifficulty", enum2102);
        setField(term989099, term989099.getClass(), "nextEdition", enum2103);
        setBooleanField(term989099, term989099.getClass(), "showInterimRanking", true);
        setBooleanField(term989099, term989099.getClass(), "showClearStatus", true);
        setBooleanField(term989099, term989099.getClass(), "showGreatBorder", true);
        setBooleanField(term989099, term989099.getClass(), "showExcellentBorder", true);
        setBooleanField(term989099, term989099.getClass(), "showRivalBorder", true);
        setBooleanField(term989099, term989099.getClass(), "showRgoSetting", true);
        setBooleanField(term989099, term989099.getClass(), "contestNowPlayingEnable", false);
        setIntField(term989099, term989099.getClass(), "contestNowPlayingId", -1);
        setIntField(term989099, term989099.getClass(), "contestNowPlayingValue", -1);
        setField(term989099, term989099.getClass(), "contestNowPlayingResultRank", enum2104);
        setField(term989099, term989099.getClass(), "contestNowPlayingSpecifier", "");
        setField(term989099, term989099.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term989099, term989099.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term989099, term989099.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term989099, term989099.getClass(), "rivalPdId", -1);
        setField(term989097, term989097.getClass(), "pdId", term989099);
        setIntField(term989097, term989097.getClass(), "pvId", -1);
        setField(term989097, term989097.getClass(), "module", "-999,-999,-999");
        setField(term989097, term989097.getClass(), "customize", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setField(term989097, term989097.getClass(), "customizeFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term989097, term989097.getClass(), "skin", -1);
        setIntField(term989097, term989097.getClass(), "buttonSe", -1);
        setIntField(term989097, term989097.getClass(), "slideSe", -1);
        setIntField(term989097, term989097.getClass(), "chainSlideSe", -1);
        setIntField(term989097, term989097.getClass(), "sliderTouchSe", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvCustomize");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "nKZKnxWYCK";
        callMethod(klass, "setCustomize", argTypes, term989097, args);
    }

};


