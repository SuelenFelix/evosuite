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

public class PlayerProfile_setNextDifficulty_179797469684 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term887667;
     Object enum1910;

    public PlayerProfile_setNextDifficulty_179797469684() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term888279 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term888278 = ((Class) term888279).getDeclaredField((String) "MISS");
        ((Field) term888278).setAccessible(true);
        Object enum1908 = ((Field) term888278).get((Object) null);
        Class<? extends Object> term888656 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term888655 = ((Class) term888656).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term888655).setAccessible(true);
        Object enum1909 = ((Field) term888655).get((Object) null);
        Class<? extends Object> term888939 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term888938 = ((Class) term888939).getDeclaredField((String) "NORMAL");
        ((Field) term888938).setAccessible(true);
        enum1910 = ((Field) term888938).get((Object) null);
        Class<? extends Object> term889214 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term889213 = ((Class) term889214).getDeclaredField((String) "ORIGINAL");
        ((Field) term889213).setAccessible(true);
        Object enum1911 = ((Field) term889213).get((Object) null);
        Class<? extends Object> term889480 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term889479 = ((Class) term889480).getDeclaredField((String) "NONE");
        ((Field) term889479).setAccessible(true);
        Object enum1912 = ((Field) term889479).get((Object) null);
        term887667 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term887790 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term887791 = newInstance(Class.forName("java.time.LocalDate"));
        Object term887795 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term887667, term887667.getClass(), "id", -4136906775323730350L);
        setIntField(term887667, term887667.getClass(), "pdId", 44813544);
        setField(term887667, term887667.getClass(), "playerName", "xxx");
        setIntField(term887667, term887667.getClass(), "vocaloidPoints", 300);
        setIntField(term887667, term887667.getClass(), "level", 1);
        setIntField(term887667, term887667.getClass(), "levelExp", 654539936);
        setField(term887667, term887667.getClass(), "levelTitle", "xxx");
        setIntField(term887667, term887667.getClass(), "plateId", -1);
        setIntField(term887667, term887667.getClass(), "plateEffectId", -1);
        setField(term887667, term887667.getClass(), "passwordStatus", enum1908);
        setField(term887667, term887667.getClass(), "password", "**********");
        setBooleanField(term887667, term887667.getClass(), "preferPerPvModule", true);
        setBooleanField(term887667, term887667.getClass(), "preferCommonModule", true);
        setBooleanField(term887667, term887667.getClass(), "usePerPvSkin", false);
        setBooleanField(term887667, term887667.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term887667, term887667.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term887667, term887667.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term887667, term887667.getClass(), "usePerPvTouchSliderSe", true);
        setField(term887667, term887667.getClass(), "commonModule", "-999,-999,-999");
        setField(term887667, term887667.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term887791, term887791.getClass(), "year", 2026);
        setShortField(term887791, term887791.getClass(), "month", (short) 6);
        setShortField(term887791, term887791.getClass(), "day", (short) 29);
        setField(term887790, term887790.getClass(), "date", term887791);
        setByteField(term887795, term887795.getClass(), "hour", (byte) 4);
        setByteField(term887795, term887795.getClass(), "minute", (byte) 29);
        setByteField(term887795, term887795.getClass(), "second", (byte) 30);
        setIntField(term887795, term887795.getClass(), "nano", 850157000);
        setField(term887790, term887790.getClass(), "time", term887795);
        setField(term887667, term887667.getClass(), "commonModuleSetTime", term887790);
        setField(term887667, term887667.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term887667, term887667.getClass(), "commonSkin", -1);
        setIntField(term887667, term887667.getClass(), "headphoneVolume", 100);
        setBooleanField(term887667, term887667.getClass(), "buttonSeOn", true);
        setIntField(term887667, term887667.getClass(), "buttonSeVolume", 100);
        setIntField(term887667, term887667.getClass(), "sliderSeVolume", 100);
        setIntField(term887667, term887667.getClass(), "buttonSe", -1);
        setIntField(term887667, term887667.getClass(), "chainSlideSe", -1);
        setIntField(term887667, term887667.getClass(), "slideSe", -1);
        setIntField(term887667, term887667.getClass(), "sliderTouchSe", -1);
        setField(term887667, term887667.getClass(), "sortMode", enum1909);
        setIntField(term887667, term887667.getClass(), "nextPvId", -1);
        setField(term887667, term887667.getClass(), "nextDifficulty", enum1910);
        setField(term887667, term887667.getClass(), "nextEdition", enum1911);
        setBooleanField(term887667, term887667.getClass(), "showInterimRanking", true);
        setBooleanField(term887667, term887667.getClass(), "showClearStatus", true);
        setBooleanField(term887667, term887667.getClass(), "showGreatBorder", true);
        setBooleanField(term887667, term887667.getClass(), "showExcellentBorder", true);
        setBooleanField(term887667, term887667.getClass(), "showRivalBorder", true);
        setBooleanField(term887667, term887667.getClass(), "showRgoSetting", true);
        setBooleanField(term887667, term887667.getClass(), "contestNowPlayingEnable", false);
        setIntField(term887667, term887667.getClass(), "contestNowPlayingId", -1);
        setIntField(term887667, term887667.getClass(), "contestNowPlayingValue", -1);
        setField(term887667, term887667.getClass(), "contestNowPlayingResultRank", enum1912);
        setField(term887667, term887667.getClass(), "contestNowPlayingSpecifier", "");
        setField(term887667, term887667.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term887667, term887667.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term887667, term887667.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term887667, term887667.getClass(), "rivalPdId", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Object[] args = new Object[1];
        args[0] = enum1910;
        callMethod(klass, "setNextDifficulty", argTypes, term887667, args);
    }

};


