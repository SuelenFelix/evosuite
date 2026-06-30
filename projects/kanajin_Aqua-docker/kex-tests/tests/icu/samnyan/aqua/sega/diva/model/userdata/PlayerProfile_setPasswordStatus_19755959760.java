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

public class PlayerProfile_setPasswordStatus_19755959760 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term828395;
     Object enum1787;

    public PlayerProfile_setPasswordStatus_19755959760() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term829007 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term829006 = ((Class) term829007).getDeclaredField((String) "MISS");
        ((Field) term829006).setAccessible(true);
        enum1787 = ((Field) term829006).get((Object) null);
        Class<? extends Object> term829384 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term829383 = ((Class) term829384).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term829383).setAccessible(true);
        Object enum1788 = ((Field) term829383).get((Object) null);
        Class<? extends Object> term829667 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term829666 = ((Class) term829667).getDeclaredField((String) "NORMAL");
        ((Field) term829666).setAccessible(true);
        Object enum1789 = ((Field) term829666).get((Object) null);
        Class<? extends Object> term829942 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term829941 = ((Class) term829942).getDeclaredField((String) "ORIGINAL");
        ((Field) term829941).setAccessible(true);
        Object enum1790 = ((Field) term829941).get((Object) null);
        Class<? extends Object> term830208 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term830207 = ((Class) term830208).getDeclaredField((String) "NONE");
        ((Field) term830207).setAccessible(true);
        Object enum1791 = ((Field) term830207).get((Object) null);
        term828395 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term828518 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term828519 = newInstance(Class.forName("java.time.LocalDate"));
        Object term828523 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term828395, term828395.getClass(), "id", 6323132402520425961L);
        setIntField(term828395, term828395.getClass(), "pdId", 364063308);
        setField(term828395, term828395.getClass(), "playerName", "xxx");
        setIntField(term828395, term828395.getClass(), "vocaloidPoints", 300);
        setIntField(term828395, term828395.getClass(), "level", 1);
        setIntField(term828395, term828395.getClass(), "levelExp", -787041664);
        setField(term828395, term828395.getClass(), "levelTitle", "xxx");
        setIntField(term828395, term828395.getClass(), "plateId", -1);
        setIntField(term828395, term828395.getClass(), "plateEffectId", -1);
        setField(term828395, term828395.getClass(), "passwordStatus", enum1787);
        setField(term828395, term828395.getClass(), "password", "**********");
        setBooleanField(term828395, term828395.getClass(), "preferPerPvModule", true);
        setBooleanField(term828395, term828395.getClass(), "preferCommonModule", false);
        setBooleanField(term828395, term828395.getClass(), "usePerPvSkin", true);
        setBooleanField(term828395, term828395.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term828395, term828395.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term828395, term828395.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term828395, term828395.getClass(), "usePerPvTouchSliderSe", false);
        setField(term828395, term828395.getClass(), "commonModule", "-999,-999,-999");
        setField(term828395, term828395.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term828519, term828519.getClass(), "year", 2026);
        setShortField(term828519, term828519.getClass(), "month", (short) 6);
        setShortField(term828519, term828519.getClass(), "day", (short) 29);
        setField(term828518, term828518.getClass(), "date", term828519);
        setByteField(term828523, term828523.getClass(), "hour", (byte) 4);
        setByteField(term828523, term828523.getClass(), "minute", (byte) 29);
        setByteField(term828523, term828523.getClass(), "second", (byte) 24);
        setIntField(term828523, term828523.getClass(), "nano", 663037000);
        setField(term828518, term828518.getClass(), "time", term828523);
        setField(term828395, term828395.getClass(), "commonModuleSetTime", term828518);
        setField(term828395, term828395.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term828395, term828395.getClass(), "commonSkin", -1);
        setIntField(term828395, term828395.getClass(), "headphoneVolume", 100);
        setBooleanField(term828395, term828395.getClass(), "buttonSeOn", true);
        setIntField(term828395, term828395.getClass(), "buttonSeVolume", 100);
        setIntField(term828395, term828395.getClass(), "sliderSeVolume", 100);
        setIntField(term828395, term828395.getClass(), "buttonSe", -1);
        setIntField(term828395, term828395.getClass(), "chainSlideSe", -1);
        setIntField(term828395, term828395.getClass(), "slideSe", -1);
        setIntField(term828395, term828395.getClass(), "sliderTouchSe", -1);
        setField(term828395, term828395.getClass(), "sortMode", enum1788);
        setIntField(term828395, term828395.getClass(), "nextPvId", -1);
        setField(term828395, term828395.getClass(), "nextDifficulty", enum1789);
        setField(term828395, term828395.getClass(), "nextEdition", enum1790);
        setBooleanField(term828395, term828395.getClass(), "showInterimRanking", true);
        setBooleanField(term828395, term828395.getClass(), "showClearStatus", true);
        setBooleanField(term828395, term828395.getClass(), "showGreatBorder", true);
        setBooleanField(term828395, term828395.getClass(), "showExcellentBorder", true);
        setBooleanField(term828395, term828395.getClass(), "showRivalBorder", true);
        setBooleanField(term828395, term828395.getClass(), "showRgoSetting", true);
        setBooleanField(term828395, term828395.getClass(), "contestNowPlayingEnable", false);
        setIntField(term828395, term828395.getClass(), "contestNowPlayingId", -1);
        setIntField(term828395, term828395.getClass(), "contestNowPlayingValue", -1);
        setField(term828395, term828395.getClass(), "contestNowPlayingResultRank", enum1791);
        setField(term828395, term828395.getClass(), "contestNowPlayingSpecifier", "");
        setField(term828395, term828395.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term828395, term828395.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term828395, term828395.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term828395, term828395.getClass(), "rivalPdId", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Object[] args = new Object[1];
        args[0] = enum1787;
        callMethod(klass, "setPasswordStatus", argTypes, term828395, args);
    }

};


