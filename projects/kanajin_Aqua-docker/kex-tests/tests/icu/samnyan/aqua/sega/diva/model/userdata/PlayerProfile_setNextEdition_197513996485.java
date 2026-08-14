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

public class PlayerProfile_setNextEdition_197513996485 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term890120;
     Object enum1918;

    public PlayerProfile_setNextEdition_197513996485() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term890742 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term890741 = ((Class) term890742).getDeclaredField((String) "MISS");
        ((Field) term890741).setAccessible(true);
        Object enum1913 = ((Field) term890741).get((Object) null);
        Class<? extends Object> term891119 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term891118 = ((Class) term891119).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term891118).setAccessible(true);
        Object enum1914 = ((Field) term891118).get((Object) null);
        Class<? extends Object> term891402 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term891401 = ((Class) term891402).getDeclaredField((String) "NORMAL");
        ((Field) term891401).setAccessible(true);
        Object enum1915 = ((Field) term891401).get((Object) null);
        Class<? extends Object> term891677 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term891676 = ((Class) term891677).getDeclaredField((String) "ORIGINAL");
        ((Field) term891676).setAccessible(true);
        Object enum1916 = ((Field) term891676).get((Object) null);
        Class<? extends Object> term891943 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term891942 = ((Class) term891943).getDeclaredField((String) "NONE");
        ((Field) term891942).setAccessible(true);
        Object enum1917 = ((Field) term891942).get((Object) null);
        term890120 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term890243 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term890244 = newInstance(Class.forName("java.time.LocalDate"));
        Object term890248 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term890120, term890120.getClass(), "id", 6381166215871562039L);
        setIntField(term890120, term890120.getClass(), "pdId", -929524036);
        setField(term890120, term890120.getClass(), "playerName", "xxx");
        setIntField(term890120, term890120.getClass(), "vocaloidPoints", 300);
        setIntField(term890120, term890120.getClass(), "level", 1);
        setIntField(term890120, term890120.getClass(), "levelExp", 1539575963);
        setField(term890120, term890120.getClass(), "levelTitle", "xxx");
        setIntField(term890120, term890120.getClass(), "plateId", -1);
        setIntField(term890120, term890120.getClass(), "plateEffectId", -1);
        setField(term890120, term890120.getClass(), "passwordStatus", enum1913);
        setField(term890120, term890120.getClass(), "password", "**********");
        setBooleanField(term890120, term890120.getClass(), "preferPerPvModule", true);
        setBooleanField(term890120, term890120.getClass(), "preferCommonModule", false);
        setBooleanField(term890120, term890120.getClass(), "usePerPvSkin", false);
        setBooleanField(term890120, term890120.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term890120, term890120.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term890120, term890120.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term890120, term890120.getClass(), "usePerPvTouchSliderSe", true);
        setField(term890120, term890120.getClass(), "commonModule", "-999,-999,-999");
        setField(term890120, term890120.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term890244, term890244.getClass(), "year", 2026);
        setShortField(term890244, term890244.getClass(), "month", (short) 8);
        setShortField(term890244, term890244.getClass(), "day", (short) 12);
        setField(term890243, term890243.getClass(), "date", term890244);
        setByteField(term890248, term890248.getClass(), "hour", (byte) 2);
        setByteField(term890248, term890248.getClass(), "minute", (byte) 4);
        setByteField(term890248, term890248.getClass(), "second", (byte) 44);
        setIntField(term890248, term890248.getClass(), "nano", 634295000);
        setField(term890243, term890243.getClass(), "time", term890248);
        setField(term890120, term890120.getClass(), "commonModuleSetTime", term890243);
        setField(term890120, term890120.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term890120, term890120.getClass(), "commonSkin", -1);
        setIntField(term890120, term890120.getClass(), "headphoneVolume", 100);
        setBooleanField(term890120, term890120.getClass(), "buttonSeOn", true);
        setIntField(term890120, term890120.getClass(), "buttonSeVolume", 100);
        setIntField(term890120, term890120.getClass(), "sliderSeVolume", 100);
        setIntField(term890120, term890120.getClass(), "buttonSe", -1);
        setIntField(term890120, term890120.getClass(), "chainSlideSe", -1);
        setIntField(term890120, term890120.getClass(), "slideSe", -1);
        setIntField(term890120, term890120.getClass(), "sliderTouchSe", -1);
        setField(term890120, term890120.getClass(), "sortMode", enum1914);
        setIntField(term890120, term890120.getClass(), "nextPvId", -1);
        setField(term890120, term890120.getClass(), "nextDifficulty", enum1915);
        setField(term890120, term890120.getClass(), "nextEdition", enum1916);
        setBooleanField(term890120, term890120.getClass(), "showInterimRanking", true);
        setBooleanField(term890120, term890120.getClass(), "showClearStatus", true);
        setBooleanField(term890120, term890120.getClass(), "showGreatBorder", true);
        setBooleanField(term890120, term890120.getClass(), "showExcellentBorder", true);
        setBooleanField(term890120, term890120.getClass(), "showRivalBorder", true);
        setBooleanField(term890120, term890120.getClass(), "showRgoSetting", true);
        setBooleanField(term890120, term890120.getClass(), "contestNowPlayingEnable", false);
        setIntField(term890120, term890120.getClass(), "contestNowPlayingId", -1);
        setIntField(term890120, term890120.getClass(), "contestNowPlayingValue", -1);
        setField(term890120, term890120.getClass(), "contestNowPlayingResultRank", enum1917);
        setField(term890120, term890120.getClass(), "contestNowPlayingSpecifier", "");
        setField(term890120, term890120.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term890120, term890120.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term890120, term890120.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term890120, term890120.getClass(), "rivalPdId", -1);
        Class<? extends Object> term892584 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term892583 = ((Class) term892584).getDeclaredField((String) "EXTRA");
        ((Field) term892583).setAccessible(true);
        enum1918 = ((Field) term892583).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.diva.model.common.Edition");
        Object[] args = new Object[1];
        args[0] = enum1918;
        callMethod(klass, "setNextEdition", argTypes, term890120, args);
    }

};


