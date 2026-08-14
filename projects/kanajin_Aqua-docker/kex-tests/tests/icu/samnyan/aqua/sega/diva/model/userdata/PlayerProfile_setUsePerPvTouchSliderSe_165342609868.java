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

public class PlayerProfile_setUsePerPvTouchSliderSe_165342609868 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term848053;
     Object term848658;

    public PlayerProfile_setUsePerPvTouchSliderSe_165342609868() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term848667 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term848666 = ((Class) term848667).getDeclaredField((String) "MISS");
        ((Field) term848666).setAccessible(true);
        Object enum1827 = ((Field) term848666).get((Object) null);
        Class<? extends Object> term849044 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term849043 = ((Class) term849044).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term849043).setAccessible(true);
        Object enum1828 = ((Field) term849043).get((Object) null);
        Class<? extends Object> term849327 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term849326 = ((Class) term849327).getDeclaredField((String) "NORMAL");
        ((Field) term849326).setAccessible(true);
        Object enum1829 = ((Field) term849326).get((Object) null);
        Class<? extends Object> term849602 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term849601 = ((Class) term849602).getDeclaredField((String) "ORIGINAL");
        ((Field) term849601).setAccessible(true);
        Object enum1830 = ((Field) term849601).get((Object) null);
        Class<? extends Object> term849868 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term849867 = ((Class) term849868).getDeclaredField((String) "NONE");
        ((Field) term849867).setAccessible(true);
        Object enum1831 = ((Field) term849867).get((Object) null);
        term848053 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term848176 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term848177 = newInstance(Class.forName("java.time.LocalDate"));
        Object term848181 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term848053, term848053.getClass(), "id", -3048863932438585863L);
        setIntField(term848053, term848053.getClass(), "pdId", -1018874255);
        setField(term848053, term848053.getClass(), "playerName", "xxx");
        setIntField(term848053, term848053.getClass(), "vocaloidPoints", 300);
        setIntField(term848053, term848053.getClass(), "level", 1);
        setIntField(term848053, term848053.getClass(), "levelExp", -268930414);
        setField(term848053, term848053.getClass(), "levelTitle", "xxx");
        setIntField(term848053, term848053.getClass(), "plateId", -1);
        setIntField(term848053, term848053.getClass(), "plateEffectId", -1);
        setField(term848053, term848053.getClass(), "passwordStatus", enum1827);
        setField(term848053, term848053.getClass(), "password", "**********");
        setBooleanField(term848053, term848053.getClass(), "preferPerPvModule", true);
        setBooleanField(term848053, term848053.getClass(), "preferCommonModule", true);
        setBooleanField(term848053, term848053.getClass(), "usePerPvSkin", true);
        setBooleanField(term848053, term848053.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term848053, term848053.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term848053, term848053.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term848053, term848053.getClass(), "usePerPvTouchSliderSe", false);
        setField(term848053, term848053.getClass(), "commonModule", "-999,-999,-999");
        setField(term848053, term848053.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term848177, term848177.getClass(), "year", 2026);
        setShortField(term848177, term848177.getClass(), "month", (short) 8);
        setShortField(term848177, term848177.getClass(), "day", (short) 12);
        setField(term848176, term848176.getClass(), "date", term848177);
        setByteField(term848181, term848181.getClass(), "hour", (byte) 2);
        setByteField(term848181, term848181.getClass(), "minute", (byte) 4);
        setByteField(term848181, term848181.getClass(), "second", (byte) 40);
        setIntField(term848181, term848181.getClass(), "nano", 235843000);
        setField(term848176, term848176.getClass(), "time", term848181);
        setField(term848053, term848053.getClass(), "commonModuleSetTime", term848176);
        setField(term848053, term848053.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term848053, term848053.getClass(), "commonSkin", -1);
        setIntField(term848053, term848053.getClass(), "headphoneVolume", 100);
        setBooleanField(term848053, term848053.getClass(), "buttonSeOn", true);
        setIntField(term848053, term848053.getClass(), "buttonSeVolume", 100);
        setIntField(term848053, term848053.getClass(), "sliderSeVolume", 100);
        setIntField(term848053, term848053.getClass(), "buttonSe", -1);
        setIntField(term848053, term848053.getClass(), "chainSlideSe", -1);
        setIntField(term848053, term848053.getClass(), "slideSe", -1);
        setIntField(term848053, term848053.getClass(), "sliderTouchSe", -1);
        setField(term848053, term848053.getClass(), "sortMode", enum1828);
        setIntField(term848053, term848053.getClass(), "nextPvId", -1);
        setField(term848053, term848053.getClass(), "nextDifficulty", enum1829);
        setField(term848053, term848053.getClass(), "nextEdition", enum1830);
        setBooleanField(term848053, term848053.getClass(), "showInterimRanking", true);
        setBooleanField(term848053, term848053.getClass(), "showClearStatus", true);
        setBooleanField(term848053, term848053.getClass(), "showGreatBorder", true);
        setBooleanField(term848053, term848053.getClass(), "showExcellentBorder", true);
        setBooleanField(term848053, term848053.getClass(), "showRivalBorder", true);
        setBooleanField(term848053, term848053.getClass(), "showRgoSetting", true);
        setBooleanField(term848053, term848053.getClass(), "contestNowPlayingEnable", false);
        setIntField(term848053, term848053.getClass(), "contestNowPlayingId", -1);
        setIntField(term848053, term848053.getClass(), "contestNowPlayingValue", -1);
        setField(term848053, term848053.getClass(), "contestNowPlayingResultRank", enum1831);
        setField(term848053, term848053.getClass(), "contestNowPlayingSpecifier", "");
        setField(term848053, term848053.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term848053, term848053.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term848053, term848053.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term848053, term848053.getClass(), "rivalPdId", -1);
        term848658 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term848658;
        callMethod(klass, "setUsePerPvTouchSliderSe", argTypes, term848053, args);
    }

};


