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
import java.lang.Object;
import java.lang.String;

public class PlayerPvCustomize_getCustomize_21433578825 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term958531;

    public PlayerPvCustomize_getCustomize_21433578825() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term959265 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term959264 = ((Class) term959265).getDeclaredField((String) "MISS");
        ((Field) term959264).setAccessible(true);
        Object enum2045 = ((Field) term959264).get((Object) null);
        Class<? extends Object> term959642 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term959641 = ((Class) term959642).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term959641).setAccessible(true);
        Object enum2046 = ((Field) term959641).get((Object) null);
        Class<? extends Object> term959925 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term959924 = ((Class) term959925).getDeclaredField((String) "NORMAL");
        ((Field) term959924).setAccessible(true);
        Object enum2047 = ((Field) term959924).get((Object) null);
        Class<? extends Object> term960200 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term960199 = ((Class) term960200).getDeclaredField((String) "ORIGINAL");
        ((Field) term960199).setAccessible(true);
        Object enum2048 = ((Field) term960199).get((Object) null);
        Class<? extends Object> term960466 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term960465 = ((Class) term960466).getDeclaredField((String) "NONE");
        ((Field) term960465).setAccessible(true);
        Object enum2049 = ((Field) term960465).get((Object) null);
        term958531 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvCustomize"));
        Object term958533 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term958656 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term958657 = newInstance(Class.forName("java.time.LocalDate"));
        Object term958661 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term958531, term958531.getClass(), "id", 4626639872957534248L);
        setLongField(term958533, term958533.getClass(), "id", -7062466217011408314L);
        setIntField(term958533, term958533.getClass(), "pdId", 1045689376);
        setField(term958533, term958533.getClass(), "playerName", "xxx");
        setIntField(term958533, term958533.getClass(), "vocaloidPoints", 300);
        setIntField(term958533, term958533.getClass(), "level", 1);
        setIntField(term958533, term958533.getClass(), "levelExp", 767458787);
        setField(term958533, term958533.getClass(), "levelTitle", "xxx");
        setIntField(term958533, term958533.getClass(), "plateId", -1);
        setIntField(term958533, term958533.getClass(), "plateEffectId", -1);
        setField(term958533, term958533.getClass(), "passwordStatus", enum2045);
        setField(term958533, term958533.getClass(), "password", "**********");
        setBooleanField(term958533, term958533.getClass(), "preferPerPvModule", true);
        setBooleanField(term958533, term958533.getClass(), "preferCommonModule", false);
        setBooleanField(term958533, term958533.getClass(), "usePerPvSkin", true);
        setBooleanField(term958533, term958533.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term958533, term958533.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term958533, term958533.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term958533, term958533.getClass(), "usePerPvTouchSliderSe", false);
        setField(term958533, term958533.getClass(), "commonModule", "-999,-999,-999");
        setField(term958533, term958533.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term958657, term958657.getClass(), "year", 2026);
        setShortField(term958657, term958657.getClass(), "month", (short) 6);
        setShortField(term958657, term958657.getClass(), "day", (short) 29);
        setField(term958656, term958656.getClass(), "date", term958657);
        setByteField(term958661, term958661.getClass(), "hour", (byte) 4);
        setByteField(term958661, term958661.getClass(), "minute", (byte) 30);
        setByteField(term958661, term958661.getClass(), "second", (byte) 5);
        setIntField(term958661, term958661.getClass(), "nano", 394932000);
        setField(term958656, term958656.getClass(), "time", term958661);
        setField(term958533, term958533.getClass(), "commonModuleSetTime", term958656);
        setField(term958533, term958533.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term958533, term958533.getClass(), "commonSkin", -1);
        setIntField(term958533, term958533.getClass(), "headphoneVolume", 100);
        setBooleanField(term958533, term958533.getClass(), "buttonSeOn", true);
        setIntField(term958533, term958533.getClass(), "buttonSeVolume", 100);
        setIntField(term958533, term958533.getClass(), "sliderSeVolume", 100);
        setIntField(term958533, term958533.getClass(), "buttonSe", -1);
        setIntField(term958533, term958533.getClass(), "chainSlideSe", -1);
        setIntField(term958533, term958533.getClass(), "slideSe", -1);
        setIntField(term958533, term958533.getClass(), "sliderTouchSe", -1);
        setField(term958533, term958533.getClass(), "sortMode", enum2046);
        setIntField(term958533, term958533.getClass(), "nextPvId", -1);
        setField(term958533, term958533.getClass(), "nextDifficulty", enum2047);
        setField(term958533, term958533.getClass(), "nextEdition", enum2048);
        setBooleanField(term958533, term958533.getClass(), "showInterimRanking", true);
        setBooleanField(term958533, term958533.getClass(), "showClearStatus", true);
        setBooleanField(term958533, term958533.getClass(), "showGreatBorder", true);
        setBooleanField(term958533, term958533.getClass(), "showExcellentBorder", true);
        setBooleanField(term958533, term958533.getClass(), "showRivalBorder", true);
        setBooleanField(term958533, term958533.getClass(), "showRgoSetting", true);
        setBooleanField(term958533, term958533.getClass(), "contestNowPlayingEnable", false);
        setIntField(term958533, term958533.getClass(), "contestNowPlayingId", -1);
        setIntField(term958533, term958533.getClass(), "contestNowPlayingValue", -1);
        setField(term958533, term958533.getClass(), "contestNowPlayingResultRank", enum2049);
        setField(term958533, term958533.getClass(), "contestNowPlayingSpecifier", "");
        setField(term958533, term958533.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term958533, term958533.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term958533, term958533.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term958533, term958533.getClass(), "rivalPdId", -1);
        setField(term958531, term958531.getClass(), "pdId", term958533);
        setIntField(term958531, term958531.getClass(), "pvId", -1);
        setField(term958531, term958531.getClass(), "module", "-999,-999,-999");
        setField(term958531, term958531.getClass(), "customize", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setField(term958531, term958531.getClass(), "customizeFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term958531, term958531.getClass(), "skin", -1);
        setIntField(term958531, term958531.getClass(), "buttonSe", -1);
        setIntField(term958531, term958531.getClass(), "slideSe", -1);
        setIntField(term958531, term958531.getClass(), "chainSlideSe", -1);
        setIntField(term958531, term958531.getClass(), "sliderTouchSe", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvCustomize");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCustomize", argTypes, term958531, args);
    }

};


