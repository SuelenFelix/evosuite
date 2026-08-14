package icu.samnyan.aqua.sega.diva.handler.user;

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
import static icu.samnyan.aqua.sega.diva.handler.user.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class StartHandler_countClearStatus_9627862991 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term440;

    public StartHandler_countClearStatus_9627862991() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1091 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term1090 = ((Class) term1091).getDeclaredField((String) "MISS");
        ((Field) term1090).setAccessible(true);
        Object enum0 = ((Field) term1090).get((Object) null);
        Class<? extends Object> term1551 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term1550 = ((Class) term1551).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term1550).setAccessible(true);
        Object enum1 = ((Field) term1550).get((Object) null);
        Class<? extends Object> term1889 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term1888 = ((Class) term1889).getDeclaredField((String) "NORMAL");
        ((Field) term1888).setAccessible(true);
        Object enum2 = ((Field) term1888).get((Object) null);
        Class<? extends Object> term2187 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term2186 = ((Class) term2187).getDeclaredField((String) "ORIGINAL");
        ((Field) term2186).setAccessible(true);
        Object enum3 = ((Field) term2186).get((Object) null);
        Class<? extends Object> term2493 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term2492 = ((Class) term2493).getDeclaredField((String) "NONE");
        ((Field) term2492).setAccessible(true);
        Object enum4 = ((Field) term2492).get((Object) null);
        term440 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term563 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term564 = newInstance(Class.forName("java.time.LocalDate"));
        Object term568 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term440, term440.getClass(), "id", 2442117782898005296L);
        setIntField(term440, term440.getClass(), "pdId", 1484323161);
        setField(term440, term440.getClass(), "playerName", "xxx");
        setIntField(term440, term440.getClass(), "vocaloidPoints", 300);
        setIntField(term440, term440.getClass(), "level", 1);
        setIntField(term440, term440.getClass(), "levelExp", 391863371);
        setField(term440, term440.getClass(), "levelTitle", "xxx");
        setIntField(term440, term440.getClass(), "plateId", -1);
        setIntField(term440, term440.getClass(), "plateEffectId", -1);
        setField(term440, term440.getClass(), "passwordStatus", enum0);
        setField(term440, term440.getClass(), "password", "**********");
        setBooleanField(term440, term440.getClass(), "preferPerPvModule", true);
        setBooleanField(term440, term440.getClass(), "preferCommonModule", false);
        setBooleanField(term440, term440.getClass(), "usePerPvSkin", false);
        setBooleanField(term440, term440.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term440, term440.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term440, term440.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term440, term440.getClass(), "usePerPvTouchSliderSe", true);
        setField(term440, term440.getClass(), "commonModule", "-999,-999,-999");
        setField(term440, term440.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term564, term564.getClass(), "year", 2026);
        setShortField(term564, term564.getClass(), "month", (short) 8);
        setShortField(term564, term564.getClass(), "day", (short) 12);
        setField(term563, term563.getClass(), "date", term564);
        setByteField(term568, term568.getClass(), "hour", (byte) 1);
        setByteField(term568, term568.getClass(), "minute", (byte) 6);
        setByteField(term568, term568.getClass(), "second", (byte) 47);
        setIntField(term568, term568.getClass(), "nano", 676435000);
        setField(term563, term563.getClass(), "time", term568);
        setField(term440, term440.getClass(), "commonModuleSetTime", term563);
        setField(term440, term440.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term440, term440.getClass(), "commonSkin", -1);
        setIntField(term440, term440.getClass(), "headphoneVolume", 100);
        setBooleanField(term440, term440.getClass(), "buttonSeOn", true);
        setIntField(term440, term440.getClass(), "buttonSeVolume", 100);
        setIntField(term440, term440.getClass(), "sliderSeVolume", 100);
        setIntField(term440, term440.getClass(), "buttonSe", -1);
        setIntField(term440, term440.getClass(), "chainSlideSe", -1);
        setIntField(term440, term440.getClass(), "slideSe", -1);
        setIntField(term440, term440.getClass(), "sliderTouchSe", -1);
        setField(term440, term440.getClass(), "sortMode", enum1);
        setIntField(term440, term440.getClass(), "nextPvId", -1);
        setField(term440, term440.getClass(), "nextDifficulty", enum2);
        setField(term440, term440.getClass(), "nextEdition", enum3);
        setBooleanField(term440, term440.getClass(), "showInterimRanking", true);
        setBooleanField(term440, term440.getClass(), "showClearStatus", true);
        setBooleanField(term440, term440.getClass(), "showGreatBorder", true);
        setBooleanField(term440, term440.getClass(), "showExcellentBorder", true);
        setBooleanField(term440, term440.getClass(), "showRivalBorder", true);
        setBooleanField(term440, term440.getClass(), "showRgoSetting", true);
        setBooleanField(term440, term440.getClass(), "contestNowPlayingEnable", true);
        setIntField(term440, term440.getClass(), "contestNowPlayingId", -1);
        setIntField(term440, term440.getClass(), "contestNowPlayingValue", -1);
        setField(term440, term440.getClass(), "contestNowPlayingResultRank", enum4);
        setField(term440, term440.getClass(), "contestNowPlayingSpecifier", "");
        setField(term440, term440.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term440, term440.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term440, term440.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term440, term440.getClass(), "rivalPdId", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.handler.user.StartHandler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Object[] args = new Object[1];
        args[0] = term440;
        callMethod(klass, "countClearStatus", argTypes, null, args);
    }

};


