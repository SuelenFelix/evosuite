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

public class PlayerProfile_getMyList0_212188684547 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term796448;

    public PlayerProfile_getMyList0_212188684547() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term797060 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term797059 = ((Class) term797060).getDeclaredField((String) "MISS");
        ((Field) term797059).setAccessible(true);
        Object enum1722 = ((Field) term797059).get((Object) null);
        Class<? extends Object> term797437 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term797436 = ((Class) term797437).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term797436).setAccessible(true);
        Object enum1723 = ((Field) term797436).get((Object) null);
        Class<? extends Object> term797720 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term797719 = ((Class) term797720).getDeclaredField((String) "NORMAL");
        ((Field) term797719).setAccessible(true);
        Object enum1724 = ((Field) term797719).get((Object) null);
        Class<? extends Object> term797995 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term797994 = ((Class) term797995).getDeclaredField((String) "ORIGINAL");
        ((Field) term797994).setAccessible(true);
        Object enum1725 = ((Field) term797994).get((Object) null);
        Class<? extends Object> term798261 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term798260 = ((Class) term798261).getDeclaredField((String) "NONE");
        ((Field) term798260).setAccessible(true);
        Object enum1726 = ((Field) term798260).get((Object) null);
        term796448 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term796571 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term796572 = newInstance(Class.forName("java.time.LocalDate"));
        Object term796576 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term796448, term796448.getClass(), "id", -5876259280451647338L);
        setIntField(term796448, term796448.getClass(), "pdId", 228070072);
        setField(term796448, term796448.getClass(), "playerName", "xxx");
        setIntField(term796448, term796448.getClass(), "vocaloidPoints", 300);
        setIntField(term796448, term796448.getClass(), "level", 1);
        setIntField(term796448, term796448.getClass(), "levelExp", 1918578349);
        setField(term796448, term796448.getClass(), "levelTitle", "xxx");
        setIntField(term796448, term796448.getClass(), "plateId", -1);
        setIntField(term796448, term796448.getClass(), "plateEffectId", -1);
        setField(term796448, term796448.getClass(), "passwordStatus", enum1722);
        setField(term796448, term796448.getClass(), "password", "**********");
        setBooleanField(term796448, term796448.getClass(), "preferPerPvModule", true);
        setBooleanField(term796448, term796448.getClass(), "preferCommonModule", true);
        setBooleanField(term796448, term796448.getClass(), "usePerPvSkin", true);
        setBooleanField(term796448, term796448.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term796448, term796448.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term796448, term796448.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term796448, term796448.getClass(), "usePerPvTouchSliderSe", false);
        setField(term796448, term796448.getClass(), "commonModule", "-999,-999,-999");
        setField(term796448, term796448.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term796572, term796572.getClass(), "year", 2026);
        setShortField(term796572, term796572.getClass(), "month", (short) 6);
        setShortField(term796572, term796572.getClass(), "day", (short) 29);
        setField(term796571, term796571.getClass(), "date", term796572);
        setByteField(term796576, term796576.getClass(), "hour", (byte) 4);
        setByteField(term796576, term796576.getClass(), "minute", (byte) 29);
        setByteField(term796576, term796576.getClass(), "second", (byte) 21);
        setIntField(term796576, term796576.getClass(), "nano", 324548000);
        setField(term796571, term796571.getClass(), "time", term796576);
        setField(term796448, term796448.getClass(), "commonModuleSetTime", term796571);
        setField(term796448, term796448.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term796448, term796448.getClass(), "commonSkin", -1);
        setIntField(term796448, term796448.getClass(), "headphoneVolume", 100);
        setBooleanField(term796448, term796448.getClass(), "buttonSeOn", true);
        setIntField(term796448, term796448.getClass(), "buttonSeVolume", 100);
        setIntField(term796448, term796448.getClass(), "sliderSeVolume", 100);
        setIntField(term796448, term796448.getClass(), "buttonSe", -1);
        setIntField(term796448, term796448.getClass(), "chainSlideSe", -1);
        setIntField(term796448, term796448.getClass(), "slideSe", -1);
        setIntField(term796448, term796448.getClass(), "sliderTouchSe", -1);
        setField(term796448, term796448.getClass(), "sortMode", enum1723);
        setIntField(term796448, term796448.getClass(), "nextPvId", -1);
        setField(term796448, term796448.getClass(), "nextDifficulty", enum1724);
        setField(term796448, term796448.getClass(), "nextEdition", enum1725);
        setBooleanField(term796448, term796448.getClass(), "showInterimRanking", true);
        setBooleanField(term796448, term796448.getClass(), "showClearStatus", true);
        setBooleanField(term796448, term796448.getClass(), "showGreatBorder", true);
        setBooleanField(term796448, term796448.getClass(), "showExcellentBorder", true);
        setBooleanField(term796448, term796448.getClass(), "showRivalBorder", true);
        setBooleanField(term796448, term796448.getClass(), "showRgoSetting", true);
        setBooleanField(term796448, term796448.getClass(), "contestNowPlayingEnable", false);
        setIntField(term796448, term796448.getClass(), "contestNowPlayingId", -1);
        setIntField(term796448, term796448.getClass(), "contestNowPlayingValue", -1);
        setField(term796448, term796448.getClass(), "contestNowPlayingResultRank", enum1726);
        setField(term796448, term796448.getClass(), "contestNowPlayingSpecifier", "");
        setField(term796448, term796448.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term796448, term796448.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term796448, term796448.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term796448, term796448.getClass(), "rivalPdId", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMyList0", argTypes, term796448, args);
    }

};


