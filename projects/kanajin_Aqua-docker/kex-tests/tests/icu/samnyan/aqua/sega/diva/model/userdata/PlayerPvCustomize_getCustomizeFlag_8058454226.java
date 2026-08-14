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

public class PlayerPvCustomize_getCustomizeFlag_8058454226 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term961214;

    public PlayerPvCustomize_getCustomizeFlag_8058454226() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term961948 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term961947 = ((Class) term961948).getDeclaredField((String) "MISS");
        ((Field) term961947).setAccessible(true);
        Object enum2050 = ((Field) term961947).get((Object) null);
        Class<? extends Object> term962325 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term962324 = ((Class) term962325).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term962324).setAccessible(true);
        Object enum2051 = ((Field) term962324).get((Object) null);
        Class<? extends Object> term962608 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term962607 = ((Class) term962608).getDeclaredField((String) "NORMAL");
        ((Field) term962607).setAccessible(true);
        Object enum2052 = ((Field) term962607).get((Object) null);
        Class<? extends Object> term962883 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term962882 = ((Class) term962883).getDeclaredField((String) "ORIGINAL");
        ((Field) term962882).setAccessible(true);
        Object enum2053 = ((Field) term962882).get((Object) null);
        Class<? extends Object> term963149 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term963148 = ((Class) term963149).getDeclaredField((String) "NONE");
        ((Field) term963148).setAccessible(true);
        Object enum2054 = ((Field) term963148).get((Object) null);
        term961214 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvCustomize"));
        Object term961216 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term961339 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term961340 = newInstance(Class.forName("java.time.LocalDate"));
        Object term961344 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term961214, term961214.getClass(), "id", -5455716707538294699L);
        setLongField(term961216, term961216.getClass(), "id", -1889784286465977825L);
        setIntField(term961216, term961216.getClass(), "pdId", 2103721338);
        setField(term961216, term961216.getClass(), "playerName", "xxx");
        setIntField(term961216, term961216.getClass(), "vocaloidPoints", 300);
        setIntField(term961216, term961216.getClass(), "level", 1);
        setIntField(term961216, term961216.getClass(), "levelExp", 621330308);
        setField(term961216, term961216.getClass(), "levelTitle", "xxx");
        setIntField(term961216, term961216.getClass(), "plateId", -1);
        setIntField(term961216, term961216.getClass(), "plateEffectId", -1);
        setField(term961216, term961216.getClass(), "passwordStatus", enum2050);
        setField(term961216, term961216.getClass(), "password", "**********");
        setBooleanField(term961216, term961216.getClass(), "preferPerPvModule", true);
        setBooleanField(term961216, term961216.getClass(), "preferCommonModule", true);
        setBooleanField(term961216, term961216.getClass(), "usePerPvSkin", false);
        setBooleanField(term961216, term961216.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term961216, term961216.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term961216, term961216.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term961216, term961216.getClass(), "usePerPvTouchSliderSe", true);
        setField(term961216, term961216.getClass(), "commonModule", "-999,-999,-999");
        setField(term961216, term961216.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term961340, term961340.getClass(), "year", 2026);
        setShortField(term961340, term961340.getClass(), "month", (short) 8);
        setShortField(term961340, term961340.getClass(), "day", (short) 12);
        setField(term961339, term961339.getClass(), "date", term961340);
        setByteField(term961344, term961344.getClass(), "hour", (byte) 2);
        setByteField(term961344, term961344.getClass(), "minute", (byte) 5);
        setByteField(term961344, term961344.getClass(), "second", (byte) 17);
        setIntField(term961344, term961344.getClass(), "nano", 860207000);
        setField(term961339, term961339.getClass(), "time", term961344);
        setField(term961216, term961216.getClass(), "commonModuleSetTime", term961339);
        setField(term961216, term961216.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term961216, term961216.getClass(), "commonSkin", -1);
        setIntField(term961216, term961216.getClass(), "headphoneVolume", 100);
        setBooleanField(term961216, term961216.getClass(), "buttonSeOn", true);
        setIntField(term961216, term961216.getClass(), "buttonSeVolume", 100);
        setIntField(term961216, term961216.getClass(), "sliderSeVolume", 100);
        setIntField(term961216, term961216.getClass(), "buttonSe", -1);
        setIntField(term961216, term961216.getClass(), "chainSlideSe", -1);
        setIntField(term961216, term961216.getClass(), "slideSe", -1);
        setIntField(term961216, term961216.getClass(), "sliderTouchSe", -1);
        setField(term961216, term961216.getClass(), "sortMode", enum2051);
        setIntField(term961216, term961216.getClass(), "nextPvId", -1);
        setField(term961216, term961216.getClass(), "nextDifficulty", enum2052);
        setField(term961216, term961216.getClass(), "nextEdition", enum2053);
        setBooleanField(term961216, term961216.getClass(), "showInterimRanking", true);
        setBooleanField(term961216, term961216.getClass(), "showClearStatus", true);
        setBooleanField(term961216, term961216.getClass(), "showGreatBorder", true);
        setBooleanField(term961216, term961216.getClass(), "showExcellentBorder", true);
        setBooleanField(term961216, term961216.getClass(), "showRivalBorder", true);
        setBooleanField(term961216, term961216.getClass(), "showRgoSetting", true);
        setBooleanField(term961216, term961216.getClass(), "contestNowPlayingEnable", false);
        setIntField(term961216, term961216.getClass(), "contestNowPlayingId", -1);
        setIntField(term961216, term961216.getClass(), "contestNowPlayingValue", -1);
        setField(term961216, term961216.getClass(), "contestNowPlayingResultRank", enum2054);
        setField(term961216, term961216.getClass(), "contestNowPlayingSpecifier", "");
        setField(term961216, term961216.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term961216, term961216.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term961216, term961216.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term961216, term961216.getClass(), "rivalPdId", -1);
        setField(term961214, term961214.getClass(), "pdId", term961216);
        setIntField(term961214, term961214.getClass(), "pvId", -1);
        setField(term961214, term961214.getClass(), "module", "-999,-999,-999");
        setField(term961214, term961214.getClass(), "customize", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setField(term961214, term961214.getClass(), "customizeFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term961214, term961214.getClass(), "skin", -1);
        setIntField(term961214, term961214.getClass(), "buttonSe", -1);
        setIntField(term961214, term961214.getClass(), "slideSe", -1);
        setIntField(term961214, term961214.getClass(), "chainSlideSe", -1);
        setIntField(term961214, term961214.getClass(), "sliderTouchSe", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvCustomize");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCustomizeFlag", argTypes, term961214, args);
    }

};


