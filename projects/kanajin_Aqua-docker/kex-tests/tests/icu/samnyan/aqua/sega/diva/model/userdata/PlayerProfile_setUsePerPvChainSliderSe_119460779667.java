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

public class PlayerProfile_setUsePerPvChainSliderSe_119460779667 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term845598;
     Object term846203;

    public PlayerProfile_setUsePerPvChainSliderSe_119460779667() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term846212 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term846211 = ((Class) term846212).getDeclaredField((String) "MISS");
        ((Field) term846211).setAccessible(true);
        Object enum1822 = ((Field) term846211).get((Object) null);
        Class<? extends Object> term846589 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term846588 = ((Class) term846589).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term846588).setAccessible(true);
        Object enum1823 = ((Field) term846588).get((Object) null);
        Class<? extends Object> term846872 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term846871 = ((Class) term846872).getDeclaredField((String) "NORMAL");
        ((Field) term846871).setAccessible(true);
        Object enum1824 = ((Field) term846871).get((Object) null);
        Class<? extends Object> term847147 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term847146 = ((Class) term847147).getDeclaredField((String) "ORIGINAL");
        ((Field) term847146).setAccessible(true);
        Object enum1825 = ((Field) term847146).get((Object) null);
        Class<? extends Object> term847413 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term847412 = ((Class) term847413).getDeclaredField((String) "NONE");
        ((Field) term847412).setAccessible(true);
        Object enum1826 = ((Field) term847412).get((Object) null);
        term845598 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term845721 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term845722 = newInstance(Class.forName("java.time.LocalDate"));
        Object term845726 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term845598, term845598.getClass(), "id", -8531377551015443915L);
        setIntField(term845598, term845598.getClass(), "pdId", -712035661);
        setField(term845598, term845598.getClass(), "playerName", "xxx");
        setIntField(term845598, term845598.getClass(), "vocaloidPoints", 300);
        setIntField(term845598, term845598.getClass(), "level", 1);
        setIntField(term845598, term845598.getClass(), "levelExp", -545530498);
        setField(term845598, term845598.getClass(), "levelTitle", "xxx");
        setIntField(term845598, term845598.getClass(), "plateId", -1);
        setIntField(term845598, term845598.getClass(), "plateEffectId", -1);
        setField(term845598, term845598.getClass(), "passwordStatus", enum1822);
        setField(term845598, term845598.getClass(), "password", "**********");
        setBooleanField(term845598, term845598.getClass(), "preferPerPvModule", true);
        setBooleanField(term845598, term845598.getClass(), "preferCommonModule", false);
        setBooleanField(term845598, term845598.getClass(), "usePerPvSkin", false);
        setBooleanField(term845598, term845598.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term845598, term845598.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term845598, term845598.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term845598, term845598.getClass(), "usePerPvTouchSliderSe", false);
        setField(term845598, term845598.getClass(), "commonModule", "-999,-999,-999");
        setField(term845598, term845598.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term845722, term845722.getClass(), "year", 2026);
        setShortField(term845722, term845722.getClass(), "month", (short) 6);
        setShortField(term845722, term845722.getClass(), "day", (short) 29);
        setField(term845721, term845721.getClass(), "date", term845722);
        setByteField(term845726, term845726.getClass(), "hour", (byte) 4);
        setByteField(term845726, term845726.getClass(), "minute", (byte) 29);
        setByteField(term845726, term845726.getClass(), "second", (byte) 26);
        setIntField(term845726, term845726.getClass(), "nano", 464378000);
        setField(term845721, term845721.getClass(), "time", term845726);
        setField(term845598, term845598.getClass(), "commonModuleSetTime", term845721);
        setField(term845598, term845598.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term845598, term845598.getClass(), "commonSkin", -1);
        setIntField(term845598, term845598.getClass(), "headphoneVolume", 100);
        setBooleanField(term845598, term845598.getClass(), "buttonSeOn", true);
        setIntField(term845598, term845598.getClass(), "buttonSeVolume", 100);
        setIntField(term845598, term845598.getClass(), "sliderSeVolume", 100);
        setIntField(term845598, term845598.getClass(), "buttonSe", -1);
        setIntField(term845598, term845598.getClass(), "chainSlideSe", -1);
        setIntField(term845598, term845598.getClass(), "slideSe", -1);
        setIntField(term845598, term845598.getClass(), "sliderTouchSe", -1);
        setField(term845598, term845598.getClass(), "sortMode", enum1823);
        setIntField(term845598, term845598.getClass(), "nextPvId", -1);
        setField(term845598, term845598.getClass(), "nextDifficulty", enum1824);
        setField(term845598, term845598.getClass(), "nextEdition", enum1825);
        setBooleanField(term845598, term845598.getClass(), "showInterimRanking", true);
        setBooleanField(term845598, term845598.getClass(), "showClearStatus", true);
        setBooleanField(term845598, term845598.getClass(), "showGreatBorder", true);
        setBooleanField(term845598, term845598.getClass(), "showExcellentBorder", true);
        setBooleanField(term845598, term845598.getClass(), "showRivalBorder", true);
        setBooleanField(term845598, term845598.getClass(), "showRgoSetting", true);
        setBooleanField(term845598, term845598.getClass(), "contestNowPlayingEnable", true);
        setIntField(term845598, term845598.getClass(), "contestNowPlayingId", -1);
        setIntField(term845598, term845598.getClass(), "contestNowPlayingValue", -1);
        setField(term845598, term845598.getClass(), "contestNowPlayingResultRank", enum1826);
        setField(term845598, term845598.getClass(), "contestNowPlayingSpecifier", "");
        setField(term845598, term845598.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term845598, term845598.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term845598, term845598.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term845598, term845598.getClass(), "rivalPdId", -1);
        term846203 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term846203;
        callMethod(klass, "setUsePerPvChainSliderSe", argTypes, term845598, args);
    }

};


