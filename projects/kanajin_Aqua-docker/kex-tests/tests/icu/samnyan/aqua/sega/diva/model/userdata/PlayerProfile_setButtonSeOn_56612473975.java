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

public class PlayerProfile_setButtonSeOn_56612473975 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term865306;
     Object term865911;

    public PlayerProfile_setButtonSeOn_56612473975() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term865920 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term865919 = ((Class) term865920).getDeclaredField((String) "MISS");
        ((Field) term865919).setAccessible(true);
        Object enum1862 = ((Field) term865919).get((Object) null);
        Class<? extends Object> term866297 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term866296 = ((Class) term866297).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term866296).setAccessible(true);
        Object enum1863 = ((Field) term866296).get((Object) null);
        Class<? extends Object> term866580 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term866579 = ((Class) term866580).getDeclaredField((String) "NORMAL");
        ((Field) term866579).setAccessible(true);
        Object enum1864 = ((Field) term866579).get((Object) null);
        Class<? extends Object> term866855 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term866854 = ((Class) term866855).getDeclaredField((String) "ORIGINAL");
        ((Field) term866854).setAccessible(true);
        Object enum1865 = ((Field) term866854).get((Object) null);
        Class<? extends Object> term867121 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term867120 = ((Class) term867121).getDeclaredField((String) "NONE");
        ((Field) term867120).setAccessible(true);
        Object enum1866 = ((Field) term867120).get((Object) null);
        term865306 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term865429 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term865430 = newInstance(Class.forName("java.time.LocalDate"));
        Object term865434 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term865306, term865306.getClass(), "id", 3447455321955655601L);
        setIntField(term865306, term865306.getClass(), "pdId", 681482688);
        setField(term865306, term865306.getClass(), "playerName", "xxx");
        setIntField(term865306, term865306.getClass(), "vocaloidPoints", 300);
        setIntField(term865306, term865306.getClass(), "level", 1);
        setIntField(term865306, term865306.getClass(), "levelExp", -1435288604);
        setField(term865306, term865306.getClass(), "levelTitle", "xxx");
        setIntField(term865306, term865306.getClass(), "plateId", -1);
        setIntField(term865306, term865306.getClass(), "plateEffectId", -1);
        setField(term865306, term865306.getClass(), "passwordStatus", enum1862);
        setField(term865306, term865306.getClass(), "password", "**********");
        setBooleanField(term865306, term865306.getClass(), "preferPerPvModule", true);
        setBooleanField(term865306, term865306.getClass(), "preferCommonModule", false);
        setBooleanField(term865306, term865306.getClass(), "usePerPvSkin", false);
        setBooleanField(term865306, term865306.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term865306, term865306.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term865306, term865306.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term865306, term865306.getClass(), "usePerPvTouchSliderSe", false);
        setField(term865306, term865306.getClass(), "commonModule", "-999,-999,-999");
        setField(term865306, term865306.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term865430, term865430.getClass(), "year", 2026);
        setShortField(term865430, term865430.getClass(), "month", (short) 6);
        setShortField(term865430, term865430.getClass(), "day", (short) 29);
        setField(term865429, term865429.getClass(), "date", term865430);
        setByteField(term865434, term865434.getClass(), "hour", (byte) 4);
        setByteField(term865434, term865434.getClass(), "minute", (byte) 29);
        setByteField(term865434, term865434.getClass(), "second", (byte) 28);
        setIntField(term865434, term865434.getClass(), "nano", 528261000);
        setField(term865429, term865429.getClass(), "time", term865434);
        setField(term865306, term865306.getClass(), "commonModuleSetTime", term865429);
        setField(term865306, term865306.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term865306, term865306.getClass(), "commonSkin", -1);
        setIntField(term865306, term865306.getClass(), "headphoneVolume", 100);
        setBooleanField(term865306, term865306.getClass(), "buttonSeOn", true);
        setIntField(term865306, term865306.getClass(), "buttonSeVolume", 100);
        setIntField(term865306, term865306.getClass(), "sliderSeVolume", 100);
        setIntField(term865306, term865306.getClass(), "buttonSe", -1);
        setIntField(term865306, term865306.getClass(), "chainSlideSe", -1);
        setIntField(term865306, term865306.getClass(), "slideSe", -1);
        setIntField(term865306, term865306.getClass(), "sliderTouchSe", -1);
        setField(term865306, term865306.getClass(), "sortMode", enum1863);
        setIntField(term865306, term865306.getClass(), "nextPvId", -1);
        setField(term865306, term865306.getClass(), "nextDifficulty", enum1864);
        setField(term865306, term865306.getClass(), "nextEdition", enum1865);
        setBooleanField(term865306, term865306.getClass(), "showInterimRanking", true);
        setBooleanField(term865306, term865306.getClass(), "showClearStatus", true);
        setBooleanField(term865306, term865306.getClass(), "showGreatBorder", true);
        setBooleanField(term865306, term865306.getClass(), "showExcellentBorder", true);
        setBooleanField(term865306, term865306.getClass(), "showRivalBorder", true);
        setBooleanField(term865306, term865306.getClass(), "showRgoSetting", true);
        setBooleanField(term865306, term865306.getClass(), "contestNowPlayingEnable", false);
        setIntField(term865306, term865306.getClass(), "contestNowPlayingId", -1);
        setIntField(term865306, term865306.getClass(), "contestNowPlayingValue", -1);
        setField(term865306, term865306.getClass(), "contestNowPlayingResultRank", enum1866);
        setField(term865306, term865306.getClass(), "contestNowPlayingSpecifier", "");
        setField(term865306, term865306.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term865306, term865306.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term865306, term865306.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term865306, term865306.getClass(), "rivalPdId", -1);
        term865911 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term865911;
        callMethod(klass, "setButtonSeOn", argTypes, term865306, args);
    }

};


