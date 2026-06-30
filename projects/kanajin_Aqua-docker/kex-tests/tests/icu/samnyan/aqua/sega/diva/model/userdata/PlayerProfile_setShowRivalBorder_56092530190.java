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

public class PlayerProfile_setShowRivalBorder_56092530190 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term902660;
     Object term903265;

    public PlayerProfile_setShowRivalBorder_56092530190() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term903274 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term903273 = ((Class) term903274).getDeclaredField((String) "MISS");
        ((Field) term903273).setAccessible(true);
        Object enum1939 = ((Field) term903273).get((Object) null);
        Class<? extends Object> term903651 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term903650 = ((Class) term903651).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term903650).setAccessible(true);
        Object enum1940 = ((Field) term903650).get((Object) null);
        Class<? extends Object> term903934 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term903933 = ((Class) term903934).getDeclaredField((String) "NORMAL");
        ((Field) term903933).setAccessible(true);
        Object enum1941 = ((Field) term903933).get((Object) null);
        Class<? extends Object> term904209 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term904208 = ((Class) term904209).getDeclaredField((String) "ORIGINAL");
        ((Field) term904208).setAccessible(true);
        Object enum1942 = ((Field) term904208).get((Object) null);
        Class<? extends Object> term904475 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term904474 = ((Class) term904475).getDeclaredField((String) "NONE");
        ((Field) term904474).setAccessible(true);
        Object enum1943 = ((Field) term904474).get((Object) null);
        term902660 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term902783 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term902784 = newInstance(Class.forName("java.time.LocalDate"));
        Object term902788 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term902660, term902660.getClass(), "id", -7705159544905337794L);
        setIntField(term902660, term902660.getClass(), "pdId", -1454206593);
        setField(term902660, term902660.getClass(), "playerName", "xxx");
        setIntField(term902660, term902660.getClass(), "vocaloidPoints", 300);
        setIntField(term902660, term902660.getClass(), "level", 1);
        setIntField(term902660, term902660.getClass(), "levelExp", 675396436);
        setField(term902660, term902660.getClass(), "levelTitle", "xxx");
        setIntField(term902660, term902660.getClass(), "plateId", -1);
        setIntField(term902660, term902660.getClass(), "plateEffectId", -1);
        setField(term902660, term902660.getClass(), "passwordStatus", enum1939);
        setField(term902660, term902660.getClass(), "password", "**********");
        setBooleanField(term902660, term902660.getClass(), "preferPerPvModule", true);
        setBooleanField(term902660, term902660.getClass(), "preferCommonModule", false);
        setBooleanField(term902660, term902660.getClass(), "usePerPvSkin", false);
        setBooleanField(term902660, term902660.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term902660, term902660.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term902660, term902660.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term902660, term902660.getClass(), "usePerPvTouchSliderSe", false);
        setField(term902660, term902660.getClass(), "commonModule", "-999,-999,-999");
        setField(term902660, term902660.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term902784, term902784.getClass(), "year", 2026);
        setShortField(term902784, term902784.getClass(), "month", (short) 6);
        setShortField(term902784, term902784.getClass(), "day", (short) 29);
        setField(term902783, term902783.getClass(), "date", term902784);
        setByteField(term902788, term902788.getClass(), "hour", (byte) 4);
        setByteField(term902788, term902788.getClass(), "minute", (byte) 29);
        setByteField(term902788, term902788.getClass(), "second", (byte) 32);
        setIntField(term902788, term902788.getClass(), "nano", 390213000);
        setField(term902783, term902783.getClass(), "time", term902788);
        setField(term902660, term902660.getClass(), "commonModuleSetTime", term902783);
        setField(term902660, term902660.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term902660, term902660.getClass(), "commonSkin", -1);
        setIntField(term902660, term902660.getClass(), "headphoneVolume", 100);
        setBooleanField(term902660, term902660.getClass(), "buttonSeOn", true);
        setIntField(term902660, term902660.getClass(), "buttonSeVolume", 100);
        setIntField(term902660, term902660.getClass(), "sliderSeVolume", 100);
        setIntField(term902660, term902660.getClass(), "buttonSe", -1);
        setIntField(term902660, term902660.getClass(), "chainSlideSe", -1);
        setIntField(term902660, term902660.getClass(), "slideSe", -1);
        setIntField(term902660, term902660.getClass(), "sliderTouchSe", -1);
        setField(term902660, term902660.getClass(), "sortMode", enum1940);
        setIntField(term902660, term902660.getClass(), "nextPvId", -1);
        setField(term902660, term902660.getClass(), "nextDifficulty", enum1941);
        setField(term902660, term902660.getClass(), "nextEdition", enum1942);
        setBooleanField(term902660, term902660.getClass(), "showInterimRanking", true);
        setBooleanField(term902660, term902660.getClass(), "showClearStatus", true);
        setBooleanField(term902660, term902660.getClass(), "showGreatBorder", true);
        setBooleanField(term902660, term902660.getClass(), "showExcellentBorder", true);
        setBooleanField(term902660, term902660.getClass(), "showRivalBorder", true);
        setBooleanField(term902660, term902660.getClass(), "showRgoSetting", true);
        setBooleanField(term902660, term902660.getClass(), "contestNowPlayingEnable", false);
        setIntField(term902660, term902660.getClass(), "contestNowPlayingId", -1);
        setIntField(term902660, term902660.getClass(), "contestNowPlayingValue", -1);
        setField(term902660, term902660.getClass(), "contestNowPlayingResultRank", enum1943);
        setField(term902660, term902660.getClass(), "contestNowPlayingSpecifier", "");
        setField(term902660, term902660.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term902660, term902660.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term902660, term902660.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term902660, term902660.getClass(), "rivalPdId", -1);
        term903265 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term903265;
        callMethod(klass, "setShowRivalBorder", argTypes, term902660, args);
    }

};


