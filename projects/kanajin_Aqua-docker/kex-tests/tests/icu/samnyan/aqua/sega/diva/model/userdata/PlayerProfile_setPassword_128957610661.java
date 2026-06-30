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

public class PlayerProfile_setPassword_128957610661 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term830848;

    public PlayerProfile_setPassword_128957610661() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term831472 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term831471 = ((Class) term831472).getDeclaredField((String) "MISS");
        ((Field) term831471).setAccessible(true);
        Object enum1792 = ((Field) term831471).get((Object) null);
        Class<? extends Object> term831849 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term831848 = ((Class) term831849).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term831848).setAccessible(true);
        Object enum1793 = ((Field) term831848).get((Object) null);
        Class<? extends Object> term832132 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term832131 = ((Class) term832132).getDeclaredField((String) "NORMAL");
        ((Field) term832131).setAccessible(true);
        Object enum1794 = ((Field) term832131).get((Object) null);
        Class<? extends Object> term832407 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term832406 = ((Class) term832407).getDeclaredField((String) "ORIGINAL");
        ((Field) term832406).setAccessible(true);
        Object enum1795 = ((Field) term832406).get((Object) null);
        Class<? extends Object> term832673 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term832672 = ((Class) term832673).getDeclaredField((String) "NONE");
        ((Field) term832672).setAccessible(true);
        Object enum1796 = ((Field) term832672).get((Object) null);
        term830848 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term830971 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term830972 = newInstance(Class.forName("java.time.LocalDate"));
        Object term830976 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term830848, term830848.getClass(), "id", -354905832180781372L);
        setIntField(term830848, term830848.getClass(), "pdId", 2141179437);
        setField(term830848, term830848.getClass(), "playerName", "xxx");
        setIntField(term830848, term830848.getClass(), "vocaloidPoints", 300);
        setIntField(term830848, term830848.getClass(), "level", 1);
        setIntField(term830848, term830848.getClass(), "levelExp", -826972140);
        setField(term830848, term830848.getClass(), "levelTitle", "xxx");
        setIntField(term830848, term830848.getClass(), "plateId", -1);
        setIntField(term830848, term830848.getClass(), "plateEffectId", -1);
        setField(term830848, term830848.getClass(), "passwordStatus", enum1792);
        setField(term830848, term830848.getClass(), "password", "**********");
        setBooleanField(term830848, term830848.getClass(), "preferPerPvModule", true);
        setBooleanField(term830848, term830848.getClass(), "preferCommonModule", true);
        setBooleanField(term830848, term830848.getClass(), "usePerPvSkin", true);
        setBooleanField(term830848, term830848.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term830848, term830848.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term830848, term830848.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term830848, term830848.getClass(), "usePerPvTouchSliderSe", true);
        setField(term830848, term830848.getClass(), "commonModule", "-999,-999,-999");
        setField(term830848, term830848.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term830972, term830972.getClass(), "year", 2026);
        setShortField(term830972, term830972.getClass(), "month", (short) 6);
        setShortField(term830972, term830972.getClass(), "day", (short) 29);
        setField(term830971, term830971.getClass(), "date", term830972);
        setByteField(term830976, term830976.getClass(), "hour", (byte) 4);
        setByteField(term830976, term830976.getClass(), "minute", (byte) 29);
        setByteField(term830976, term830976.getClass(), "second", (byte) 24);
        setIntField(term830976, term830976.getClass(), "nano", 927605000);
        setField(term830971, term830971.getClass(), "time", term830976);
        setField(term830848, term830848.getClass(), "commonModuleSetTime", term830971);
        setField(term830848, term830848.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term830848, term830848.getClass(), "commonSkin", -1);
        setIntField(term830848, term830848.getClass(), "headphoneVolume", 100);
        setBooleanField(term830848, term830848.getClass(), "buttonSeOn", true);
        setIntField(term830848, term830848.getClass(), "buttonSeVolume", 100);
        setIntField(term830848, term830848.getClass(), "sliderSeVolume", 100);
        setIntField(term830848, term830848.getClass(), "buttonSe", -1);
        setIntField(term830848, term830848.getClass(), "chainSlideSe", -1);
        setIntField(term830848, term830848.getClass(), "slideSe", -1);
        setIntField(term830848, term830848.getClass(), "sliderTouchSe", -1);
        setField(term830848, term830848.getClass(), "sortMode", enum1793);
        setIntField(term830848, term830848.getClass(), "nextPvId", -1);
        setField(term830848, term830848.getClass(), "nextDifficulty", enum1794);
        setField(term830848, term830848.getClass(), "nextEdition", enum1795);
        setBooleanField(term830848, term830848.getClass(), "showInterimRanking", true);
        setBooleanField(term830848, term830848.getClass(), "showClearStatus", true);
        setBooleanField(term830848, term830848.getClass(), "showGreatBorder", true);
        setBooleanField(term830848, term830848.getClass(), "showExcellentBorder", true);
        setBooleanField(term830848, term830848.getClass(), "showRivalBorder", true);
        setBooleanField(term830848, term830848.getClass(), "showRgoSetting", true);
        setBooleanField(term830848, term830848.getClass(), "contestNowPlayingEnable", false);
        setIntField(term830848, term830848.getClass(), "contestNowPlayingId", -1);
        setIntField(term830848, term830848.getClass(), "contestNowPlayingValue", -1);
        setField(term830848, term830848.getClass(), "contestNowPlayingResultRank", enum1796);
        setField(term830848, term830848.getClass(), "contestNowPlayingSpecifier", "");
        setField(term830848, term830848.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term830848, term830848.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term830848, term830848.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term830848, term830848.getClass(), "rivalPdId", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "qFGKIJjlmV";
        callMethod(klass, "setPassword", argTypes, term830848, args);
    }

};


