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

public class PlayerPvCustomize_getSliderTouchSe_1122782211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term974629;

    public PlayerPvCustomize_getSliderTouchSe_1122782211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term975363 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term975362 = ((Class) term975363).getDeclaredField((String) "MISS");
        ((Field) term975362).setAccessible(true);
        Object enum2075 = ((Field) term975362).get((Object) null);
        Class<? extends Object> term975740 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term975739 = ((Class) term975740).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term975739).setAccessible(true);
        Object enum2076 = ((Field) term975739).get((Object) null);
        Class<? extends Object> term976023 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term976022 = ((Class) term976023).getDeclaredField((String) "NORMAL");
        ((Field) term976022).setAccessible(true);
        Object enum2077 = ((Field) term976022).get((Object) null);
        Class<? extends Object> term976298 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term976297 = ((Class) term976298).getDeclaredField((String) "ORIGINAL");
        ((Field) term976297).setAccessible(true);
        Object enum2078 = ((Field) term976297).get((Object) null);
        Class<? extends Object> term976564 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term976563 = ((Class) term976564).getDeclaredField((String) "NONE");
        ((Field) term976563).setAccessible(true);
        Object enum2079 = ((Field) term976563).get((Object) null);
        term974629 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvCustomize"));
        Object term974631 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term974754 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term974755 = newInstance(Class.forName("java.time.LocalDate"));
        Object term974759 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term974629, term974629.getClass(), "id", 800893933628130392L);
        setLongField(term974631, term974631.getClass(), "id", -6983938899150831997L);
        setIntField(term974631, term974631.getClass(), "pdId", 1708731871);
        setField(term974631, term974631.getClass(), "playerName", "xxx");
        setIntField(term974631, term974631.getClass(), "vocaloidPoints", 300);
        setIntField(term974631, term974631.getClass(), "level", 1);
        setIntField(term974631, term974631.getClass(), "levelExp", 1855866160);
        setField(term974631, term974631.getClass(), "levelTitle", "xxx");
        setIntField(term974631, term974631.getClass(), "plateId", -1);
        setIntField(term974631, term974631.getClass(), "plateEffectId", -1);
        setField(term974631, term974631.getClass(), "passwordStatus", enum2075);
        setField(term974631, term974631.getClass(), "password", "**********");
        setBooleanField(term974631, term974631.getClass(), "preferPerPvModule", true);
        setBooleanField(term974631, term974631.getClass(), "preferCommonModule", true);
        setBooleanField(term974631, term974631.getClass(), "usePerPvSkin", false);
        setBooleanField(term974631, term974631.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term974631, term974631.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term974631, term974631.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term974631, term974631.getClass(), "usePerPvTouchSliderSe", true);
        setField(term974631, term974631.getClass(), "commonModule", "-999,-999,-999");
        setField(term974631, term974631.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term974755, term974755.getClass(), "year", 2026);
        setShortField(term974755, term974755.getClass(), "month", (short) 8);
        setShortField(term974755, term974755.getClass(), "day", (short) 12);
        setField(term974754, term974754.getClass(), "date", term974755);
        setByteField(term974759, term974759.getClass(), "hour", (byte) 2);
        setByteField(term974759, term974759.getClass(), "minute", (byte) 5);
        setByteField(term974759, term974759.getClass(), "second", (byte) 19);
        setIntField(term974759, term974759.getClass(), "nano", 122223000);
        setField(term974754, term974754.getClass(), "time", term974759);
        setField(term974631, term974631.getClass(), "commonModuleSetTime", term974754);
        setField(term974631, term974631.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term974631, term974631.getClass(), "commonSkin", -1);
        setIntField(term974631, term974631.getClass(), "headphoneVolume", 100);
        setBooleanField(term974631, term974631.getClass(), "buttonSeOn", true);
        setIntField(term974631, term974631.getClass(), "buttonSeVolume", 100);
        setIntField(term974631, term974631.getClass(), "sliderSeVolume", 100);
        setIntField(term974631, term974631.getClass(), "buttonSe", -1);
        setIntField(term974631, term974631.getClass(), "chainSlideSe", -1);
        setIntField(term974631, term974631.getClass(), "slideSe", -1);
        setIntField(term974631, term974631.getClass(), "sliderTouchSe", -1);
        setField(term974631, term974631.getClass(), "sortMode", enum2076);
        setIntField(term974631, term974631.getClass(), "nextPvId", -1);
        setField(term974631, term974631.getClass(), "nextDifficulty", enum2077);
        setField(term974631, term974631.getClass(), "nextEdition", enum2078);
        setBooleanField(term974631, term974631.getClass(), "showInterimRanking", true);
        setBooleanField(term974631, term974631.getClass(), "showClearStatus", true);
        setBooleanField(term974631, term974631.getClass(), "showGreatBorder", true);
        setBooleanField(term974631, term974631.getClass(), "showExcellentBorder", true);
        setBooleanField(term974631, term974631.getClass(), "showRivalBorder", true);
        setBooleanField(term974631, term974631.getClass(), "showRgoSetting", true);
        setBooleanField(term974631, term974631.getClass(), "contestNowPlayingEnable", true);
        setIntField(term974631, term974631.getClass(), "contestNowPlayingId", -1);
        setIntField(term974631, term974631.getClass(), "contestNowPlayingValue", -1);
        setField(term974631, term974631.getClass(), "contestNowPlayingResultRank", enum2079);
        setField(term974631, term974631.getClass(), "contestNowPlayingSpecifier", "");
        setField(term974631, term974631.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term974631, term974631.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term974631, term974631.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term974631, term974631.getClass(), "rivalPdId", -1);
        setField(term974629, term974629.getClass(), "pdId", term974631);
        setIntField(term974629, term974629.getClass(), "pvId", -1);
        setField(term974629, term974629.getClass(), "module", "-999,-999,-999");
        setField(term974629, term974629.getClass(), "customize", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setField(term974629, term974629.getClass(), "customizeFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term974629, term974629.getClass(), "skin", -1);
        setIntField(term974629, term974629.getClass(), "buttonSe", -1);
        setIntField(term974629, term974629.getClass(), "slideSe", -1);
        setIntField(term974629, term974629.getClass(), "chainSlideSe", -1);
        setIntField(term974629, term974629.getClass(), "sliderTouchSe", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvCustomize");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSliderTouchSe", argTypes, term974629, args);
    }

};


