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

public class PlayerProfile_setPreferCommonModule_80458188163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term835778;
     Object term836383;

    public PlayerProfile_setPreferCommonModule_80458188163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term836392 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term836391 = ((Class) term836392).getDeclaredField((String) "MISS");
        ((Field) term836391).setAccessible(true);
        Object enum1802 = ((Field) term836391).get((Object) null);
        Class<? extends Object> term836769 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term836768 = ((Class) term836769).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term836768).setAccessible(true);
        Object enum1803 = ((Field) term836768).get((Object) null);
        Class<? extends Object> term837052 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term837051 = ((Class) term837052).getDeclaredField((String) "NORMAL");
        ((Field) term837051).setAccessible(true);
        Object enum1804 = ((Field) term837051).get((Object) null);
        Class<? extends Object> term837327 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term837326 = ((Class) term837327).getDeclaredField((String) "ORIGINAL");
        ((Field) term837326).setAccessible(true);
        Object enum1805 = ((Field) term837326).get((Object) null);
        Class<? extends Object> term837593 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term837592 = ((Class) term837593).getDeclaredField((String) "NONE");
        ((Field) term837592).setAccessible(true);
        Object enum1806 = ((Field) term837592).get((Object) null);
        term835778 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term835901 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term835902 = newInstance(Class.forName("java.time.LocalDate"));
        Object term835906 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term835778, term835778.getClass(), "id", 1550364590565203407L);
        setIntField(term835778, term835778.getClass(), "pdId", -719110417);
        setField(term835778, term835778.getClass(), "playerName", "xxx");
        setIntField(term835778, term835778.getClass(), "vocaloidPoints", 300);
        setIntField(term835778, term835778.getClass(), "level", 1);
        setIntField(term835778, term835778.getClass(), "levelExp", -1866172730);
        setField(term835778, term835778.getClass(), "levelTitle", "xxx");
        setIntField(term835778, term835778.getClass(), "plateId", -1);
        setIntField(term835778, term835778.getClass(), "plateEffectId", -1);
        setField(term835778, term835778.getClass(), "passwordStatus", enum1802);
        setField(term835778, term835778.getClass(), "password", "**********");
        setBooleanField(term835778, term835778.getClass(), "preferPerPvModule", true);
        setBooleanField(term835778, term835778.getClass(), "preferCommonModule", true);
        setBooleanField(term835778, term835778.getClass(), "usePerPvSkin", false);
        setBooleanField(term835778, term835778.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term835778, term835778.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term835778, term835778.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term835778, term835778.getClass(), "usePerPvTouchSliderSe", true);
        setField(term835778, term835778.getClass(), "commonModule", "-999,-999,-999");
        setField(term835778, term835778.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term835902, term835902.getClass(), "year", 2026);
        setShortField(term835902, term835902.getClass(), "month", (short) 8);
        setShortField(term835902, term835902.getClass(), "day", (short) 12);
        setField(term835901, term835901.getClass(), "date", term835902);
        setByteField(term835906, term835906.getClass(), "hour", (byte) 2);
        setByteField(term835906, term835906.getClass(), "minute", (byte) 4);
        setByteField(term835906, term835906.getClass(), "second", (byte) 38);
        setIntField(term835906, term835906.getClass(), "nano", 936845000);
        setField(term835901, term835901.getClass(), "time", term835906);
        setField(term835778, term835778.getClass(), "commonModuleSetTime", term835901);
        setField(term835778, term835778.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term835778, term835778.getClass(), "commonSkin", -1);
        setIntField(term835778, term835778.getClass(), "headphoneVolume", 100);
        setBooleanField(term835778, term835778.getClass(), "buttonSeOn", true);
        setIntField(term835778, term835778.getClass(), "buttonSeVolume", 100);
        setIntField(term835778, term835778.getClass(), "sliderSeVolume", 100);
        setIntField(term835778, term835778.getClass(), "buttonSe", -1);
        setIntField(term835778, term835778.getClass(), "chainSlideSe", -1);
        setIntField(term835778, term835778.getClass(), "slideSe", -1);
        setIntField(term835778, term835778.getClass(), "sliderTouchSe", -1);
        setField(term835778, term835778.getClass(), "sortMode", enum1803);
        setIntField(term835778, term835778.getClass(), "nextPvId", -1);
        setField(term835778, term835778.getClass(), "nextDifficulty", enum1804);
        setField(term835778, term835778.getClass(), "nextEdition", enum1805);
        setBooleanField(term835778, term835778.getClass(), "showInterimRanking", true);
        setBooleanField(term835778, term835778.getClass(), "showClearStatus", true);
        setBooleanField(term835778, term835778.getClass(), "showGreatBorder", true);
        setBooleanField(term835778, term835778.getClass(), "showExcellentBorder", true);
        setBooleanField(term835778, term835778.getClass(), "showRivalBorder", true);
        setBooleanField(term835778, term835778.getClass(), "showRgoSetting", true);
        setBooleanField(term835778, term835778.getClass(), "contestNowPlayingEnable", true);
        setIntField(term835778, term835778.getClass(), "contestNowPlayingId", -1);
        setIntField(term835778, term835778.getClass(), "contestNowPlayingValue", -1);
        setField(term835778, term835778.getClass(), "contestNowPlayingResultRank", enum1806);
        setField(term835778, term835778.getClass(), "contestNowPlayingSpecifier", "");
        setField(term835778, term835778.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term835778, term835778.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term835778, term835778.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term835778, term835778.getClass(), "rivalPdId", -1);
        term836383 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term836383;
        callMethod(klass, "setPreferCommonModule", argTypes, term835778, args);
    }

};


