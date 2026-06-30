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

public class PlayerPvCustomize_getButtonSe_18860453948 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term966580;

    public PlayerPvCustomize_getButtonSe_18860453948() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term967314 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term967313 = ((Class) term967314).getDeclaredField((String) "MISS");
        ((Field) term967313).setAccessible(true);
        Object enum2060 = ((Field) term967313).get((Object) null);
        Class<? extends Object> term967691 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term967690 = ((Class) term967691).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term967690).setAccessible(true);
        Object enum2061 = ((Field) term967690).get((Object) null);
        Class<? extends Object> term967974 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term967973 = ((Class) term967974).getDeclaredField((String) "NORMAL");
        ((Field) term967973).setAccessible(true);
        Object enum2062 = ((Field) term967973).get((Object) null);
        Class<? extends Object> term968249 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term968248 = ((Class) term968249).getDeclaredField((String) "ORIGINAL");
        ((Field) term968248).setAccessible(true);
        Object enum2063 = ((Field) term968248).get((Object) null);
        Class<? extends Object> term968515 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term968514 = ((Class) term968515).getDeclaredField((String) "NONE");
        ((Field) term968514).setAccessible(true);
        Object enum2064 = ((Field) term968514).get((Object) null);
        term966580 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvCustomize"));
        Object term966582 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term966705 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term966706 = newInstance(Class.forName("java.time.LocalDate"));
        Object term966710 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term966580, term966580.getClass(), "id", 5614572229094721840L);
        setLongField(term966582, term966582.getClass(), "id", -159468133651974975L);
        setIntField(term966582, term966582.getClass(), "pdId", 1754709105);
        setField(term966582, term966582.getClass(), "playerName", "xxx");
        setIntField(term966582, term966582.getClass(), "vocaloidPoints", 300);
        setIntField(term966582, term966582.getClass(), "level", 1);
        setIntField(term966582, term966582.getClass(), "levelExp", 1523196898);
        setField(term966582, term966582.getClass(), "levelTitle", "xxx");
        setIntField(term966582, term966582.getClass(), "plateId", -1);
        setIntField(term966582, term966582.getClass(), "plateEffectId", -1);
        setField(term966582, term966582.getClass(), "passwordStatus", enum2060);
        setField(term966582, term966582.getClass(), "password", "**********");
        setBooleanField(term966582, term966582.getClass(), "preferPerPvModule", true);
        setBooleanField(term966582, term966582.getClass(), "preferCommonModule", false);
        setBooleanField(term966582, term966582.getClass(), "usePerPvSkin", false);
        setBooleanField(term966582, term966582.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term966582, term966582.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term966582, term966582.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term966582, term966582.getClass(), "usePerPvTouchSliderSe", false);
        setField(term966582, term966582.getClass(), "commonModule", "-999,-999,-999");
        setField(term966582, term966582.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term966706, term966706.getClass(), "year", 2026);
        setShortField(term966706, term966706.getClass(), "month", (short) 6);
        setShortField(term966706, term966706.getClass(), "day", (short) 29);
        setField(term966705, term966705.getClass(), "date", term966706);
        setByteField(term966710, term966710.getClass(), "hour", (byte) 4);
        setByteField(term966710, term966710.getClass(), "minute", (byte) 30);
        setByteField(term966710, term966710.getClass(), "second", (byte) 6);
        setIntField(term966710, term966710.getClass(), "nano", 169146000);
        setField(term966705, term966705.getClass(), "time", term966710);
        setField(term966582, term966582.getClass(), "commonModuleSetTime", term966705);
        setField(term966582, term966582.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term966582, term966582.getClass(), "commonSkin", -1);
        setIntField(term966582, term966582.getClass(), "headphoneVolume", 100);
        setBooleanField(term966582, term966582.getClass(), "buttonSeOn", true);
        setIntField(term966582, term966582.getClass(), "buttonSeVolume", 100);
        setIntField(term966582, term966582.getClass(), "sliderSeVolume", 100);
        setIntField(term966582, term966582.getClass(), "buttonSe", -1);
        setIntField(term966582, term966582.getClass(), "chainSlideSe", -1);
        setIntField(term966582, term966582.getClass(), "slideSe", -1);
        setIntField(term966582, term966582.getClass(), "sliderTouchSe", -1);
        setField(term966582, term966582.getClass(), "sortMode", enum2061);
        setIntField(term966582, term966582.getClass(), "nextPvId", -1);
        setField(term966582, term966582.getClass(), "nextDifficulty", enum2062);
        setField(term966582, term966582.getClass(), "nextEdition", enum2063);
        setBooleanField(term966582, term966582.getClass(), "showInterimRanking", true);
        setBooleanField(term966582, term966582.getClass(), "showClearStatus", true);
        setBooleanField(term966582, term966582.getClass(), "showGreatBorder", true);
        setBooleanField(term966582, term966582.getClass(), "showExcellentBorder", true);
        setBooleanField(term966582, term966582.getClass(), "showRivalBorder", true);
        setBooleanField(term966582, term966582.getClass(), "showRgoSetting", true);
        setBooleanField(term966582, term966582.getClass(), "contestNowPlayingEnable", true);
        setIntField(term966582, term966582.getClass(), "contestNowPlayingId", -1);
        setIntField(term966582, term966582.getClass(), "contestNowPlayingValue", -1);
        setField(term966582, term966582.getClass(), "contestNowPlayingResultRank", enum2064);
        setField(term966582, term966582.getClass(), "contestNowPlayingSpecifier", "");
        setField(term966582, term966582.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term966582, term966582.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term966582, term966582.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term966582, term966582.getClass(), "rivalPdId", -1);
        setField(term966580, term966580.getClass(), "pdId", term966582);
        setIntField(term966580, term966580.getClass(), "pvId", -1);
        setField(term966580, term966580.getClass(), "module", "-999,-999,-999");
        setField(term966580, term966580.getClass(), "customize", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setField(term966580, term966580.getClass(), "customizeFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term966580, term966580.getClass(), "skin", -1);
        setIntField(term966580, term966580.getClass(), "buttonSe", -1);
        setIntField(term966580, term966580.getClass(), "slideSe", -1);
        setIntField(term966580, term966580.getClass(), "chainSlideSe", -1);
        setIntField(term966580, term966580.getClass(), "sliderTouchSe", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvCustomize");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getButtonSe", argTypes, term966580, args);
    }

};


