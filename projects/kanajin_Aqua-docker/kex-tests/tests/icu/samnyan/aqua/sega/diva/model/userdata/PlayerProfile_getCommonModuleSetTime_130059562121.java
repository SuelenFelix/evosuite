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

public class PlayerProfile_getCommonModuleSetTime_130059562121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term732670;

    public PlayerProfile_getCommonModuleSetTime_130059562121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term733282 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term733281 = ((Class) term733282).getDeclaredField((String) "MISS");
        ((Field) term733281).setAccessible(true);
        Object enum1592 = ((Field) term733281).get((Object) null);
        Class<? extends Object> term733659 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term733658 = ((Class) term733659).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term733658).setAccessible(true);
        Object enum1593 = ((Field) term733658).get((Object) null);
        Class<? extends Object> term733942 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term733941 = ((Class) term733942).getDeclaredField((String) "NORMAL");
        ((Field) term733941).setAccessible(true);
        Object enum1594 = ((Field) term733941).get((Object) null);
        Class<? extends Object> term734217 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term734216 = ((Class) term734217).getDeclaredField((String) "ORIGINAL");
        ((Field) term734216).setAccessible(true);
        Object enum1595 = ((Field) term734216).get((Object) null);
        Class<? extends Object> term734483 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term734482 = ((Class) term734483).getDeclaredField((String) "NONE");
        ((Field) term734482).setAccessible(true);
        Object enum1596 = ((Field) term734482).get((Object) null);
        term732670 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term732793 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term732794 = newInstance(Class.forName("java.time.LocalDate"));
        Object term732798 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term732670, term732670.getClass(), "id", 4828755228445882127L);
        setIntField(term732670, term732670.getClass(), "pdId", -1827662352);
        setField(term732670, term732670.getClass(), "playerName", "xxx");
        setIntField(term732670, term732670.getClass(), "vocaloidPoints", 300);
        setIntField(term732670, term732670.getClass(), "level", 1);
        setIntField(term732670, term732670.getClass(), "levelExp", -1292290537);
        setField(term732670, term732670.getClass(), "levelTitle", "xxx");
        setIntField(term732670, term732670.getClass(), "plateId", -1);
        setIntField(term732670, term732670.getClass(), "plateEffectId", -1);
        setField(term732670, term732670.getClass(), "passwordStatus", enum1592);
        setField(term732670, term732670.getClass(), "password", "**********");
        setBooleanField(term732670, term732670.getClass(), "preferPerPvModule", true);
        setBooleanField(term732670, term732670.getClass(), "preferCommonModule", true);
        setBooleanField(term732670, term732670.getClass(), "usePerPvSkin", true);
        setBooleanField(term732670, term732670.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term732670, term732670.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term732670, term732670.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term732670, term732670.getClass(), "usePerPvTouchSliderSe", false);
        setField(term732670, term732670.getClass(), "commonModule", "-999,-999,-999");
        setField(term732670, term732670.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term732794, term732794.getClass(), "year", 2026);
        setShortField(term732794, term732794.getClass(), "month", (short) 6);
        setShortField(term732794, term732794.getClass(), "day", (short) 29);
        setField(term732793, term732793.getClass(), "date", term732794);
        setByteField(term732798, term732798.getClass(), "hour", (byte) 4);
        setByteField(term732798, term732798.getClass(), "minute", (byte) 29);
        setByteField(term732798, term732798.getClass(), "second", (byte) 14);
        setIntField(term732798, term732798.getClass(), "nano", 646047000);
        setField(term732793, term732793.getClass(), "time", term732798);
        setField(term732670, term732670.getClass(), "commonModuleSetTime", term732793);
        setField(term732670, term732670.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term732670, term732670.getClass(), "commonSkin", -1);
        setIntField(term732670, term732670.getClass(), "headphoneVolume", 100);
        setBooleanField(term732670, term732670.getClass(), "buttonSeOn", true);
        setIntField(term732670, term732670.getClass(), "buttonSeVolume", 100);
        setIntField(term732670, term732670.getClass(), "sliderSeVolume", 100);
        setIntField(term732670, term732670.getClass(), "buttonSe", -1);
        setIntField(term732670, term732670.getClass(), "chainSlideSe", -1);
        setIntField(term732670, term732670.getClass(), "slideSe", -1);
        setIntField(term732670, term732670.getClass(), "sliderTouchSe", -1);
        setField(term732670, term732670.getClass(), "sortMode", enum1593);
        setIntField(term732670, term732670.getClass(), "nextPvId", -1);
        setField(term732670, term732670.getClass(), "nextDifficulty", enum1594);
        setField(term732670, term732670.getClass(), "nextEdition", enum1595);
        setBooleanField(term732670, term732670.getClass(), "showInterimRanking", true);
        setBooleanField(term732670, term732670.getClass(), "showClearStatus", true);
        setBooleanField(term732670, term732670.getClass(), "showGreatBorder", true);
        setBooleanField(term732670, term732670.getClass(), "showExcellentBorder", true);
        setBooleanField(term732670, term732670.getClass(), "showRivalBorder", true);
        setBooleanField(term732670, term732670.getClass(), "showRgoSetting", true);
        setBooleanField(term732670, term732670.getClass(), "contestNowPlayingEnable", false);
        setIntField(term732670, term732670.getClass(), "contestNowPlayingId", -1);
        setIntField(term732670, term732670.getClass(), "contestNowPlayingValue", -1);
        setField(term732670, term732670.getClass(), "contestNowPlayingResultRank", enum1596);
        setField(term732670, term732670.getClass(), "contestNowPlayingSpecifier", "");
        setField(term732670, term732670.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term732670, term732670.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term732670, term732670.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term732670, term732670.getClass(), "rivalPdId", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCommonModuleSetTime", argTypes, term732670, args);
    }

};


