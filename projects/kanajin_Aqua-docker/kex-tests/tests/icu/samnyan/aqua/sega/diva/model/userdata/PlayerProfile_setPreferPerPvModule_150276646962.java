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

public class PlayerProfile_setPreferPerPvModule_150276646962 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term833323;
     Object term833928;

    public PlayerProfile_setPreferPerPvModule_150276646962() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term833937 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term833936 = ((Class) term833937).getDeclaredField((String) "MISS");
        ((Field) term833936).setAccessible(true);
        Object enum1797 = ((Field) term833936).get((Object) null);
        Class<? extends Object> term834314 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term834313 = ((Class) term834314).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term834313).setAccessible(true);
        Object enum1798 = ((Field) term834313).get((Object) null);
        Class<? extends Object> term834597 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term834596 = ((Class) term834597).getDeclaredField((String) "NORMAL");
        ((Field) term834596).setAccessible(true);
        Object enum1799 = ((Field) term834596).get((Object) null);
        Class<? extends Object> term834872 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term834871 = ((Class) term834872).getDeclaredField((String) "ORIGINAL");
        ((Field) term834871).setAccessible(true);
        Object enum1800 = ((Field) term834871).get((Object) null);
        Class<? extends Object> term835138 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term835137 = ((Class) term835138).getDeclaredField((String) "NONE");
        ((Field) term835137).setAccessible(true);
        Object enum1801 = ((Field) term835137).get((Object) null);
        term833323 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term833446 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term833447 = newInstance(Class.forName("java.time.LocalDate"));
        Object term833451 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term833323, term833323.getClass(), "id", -5967061076297699457L);
        setIntField(term833323, term833323.getClass(), "pdId", 737250028);
        setField(term833323, term833323.getClass(), "playerName", "xxx");
        setIntField(term833323, term833323.getClass(), "vocaloidPoints", 300);
        setIntField(term833323, term833323.getClass(), "level", 1);
        setIntField(term833323, term833323.getClass(), "levelExp", -1870044711);
        setField(term833323, term833323.getClass(), "levelTitle", "xxx");
        setIntField(term833323, term833323.getClass(), "plateId", -1);
        setIntField(term833323, term833323.getClass(), "plateEffectId", -1);
        setField(term833323, term833323.getClass(), "passwordStatus", enum1797);
        setField(term833323, term833323.getClass(), "password", "**********");
        setBooleanField(term833323, term833323.getClass(), "preferPerPvModule", true);
        setBooleanField(term833323, term833323.getClass(), "preferCommonModule", false);
        setBooleanField(term833323, term833323.getClass(), "usePerPvSkin", false);
        setBooleanField(term833323, term833323.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term833323, term833323.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term833323, term833323.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term833323, term833323.getClass(), "usePerPvTouchSliderSe", true);
        setField(term833323, term833323.getClass(), "commonModule", "-999,-999,-999");
        setField(term833323, term833323.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term833447, term833447.getClass(), "year", 2026);
        setShortField(term833447, term833447.getClass(), "month", (short) 6);
        setShortField(term833447, term833447.getClass(), "day", (short) 29);
        setField(term833446, term833446.getClass(), "date", term833447);
        setByteField(term833451, term833451.getClass(), "hour", (byte) 4);
        setByteField(term833451, term833451.getClass(), "minute", (byte) 29);
        setByteField(term833451, term833451.getClass(), "second", (byte) 25);
        setIntField(term833451, term833451.getClass(), "nano", 183451000);
        setField(term833446, term833446.getClass(), "time", term833451);
        setField(term833323, term833323.getClass(), "commonModuleSetTime", term833446);
        setField(term833323, term833323.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term833323, term833323.getClass(), "commonSkin", -1);
        setIntField(term833323, term833323.getClass(), "headphoneVolume", 100);
        setBooleanField(term833323, term833323.getClass(), "buttonSeOn", true);
        setIntField(term833323, term833323.getClass(), "buttonSeVolume", 100);
        setIntField(term833323, term833323.getClass(), "sliderSeVolume", 100);
        setIntField(term833323, term833323.getClass(), "buttonSe", -1);
        setIntField(term833323, term833323.getClass(), "chainSlideSe", -1);
        setIntField(term833323, term833323.getClass(), "slideSe", -1);
        setIntField(term833323, term833323.getClass(), "sliderTouchSe", -1);
        setField(term833323, term833323.getClass(), "sortMode", enum1798);
        setIntField(term833323, term833323.getClass(), "nextPvId", -1);
        setField(term833323, term833323.getClass(), "nextDifficulty", enum1799);
        setField(term833323, term833323.getClass(), "nextEdition", enum1800);
        setBooleanField(term833323, term833323.getClass(), "showInterimRanking", true);
        setBooleanField(term833323, term833323.getClass(), "showClearStatus", true);
        setBooleanField(term833323, term833323.getClass(), "showGreatBorder", true);
        setBooleanField(term833323, term833323.getClass(), "showExcellentBorder", true);
        setBooleanField(term833323, term833323.getClass(), "showRivalBorder", true);
        setBooleanField(term833323, term833323.getClass(), "showRgoSetting", true);
        setBooleanField(term833323, term833323.getClass(), "contestNowPlayingEnable", false);
        setIntField(term833323, term833323.getClass(), "contestNowPlayingId", -1);
        setIntField(term833323, term833323.getClass(), "contestNowPlayingValue", -1);
        setField(term833323, term833323.getClass(), "contestNowPlayingResultRank", enum1801);
        setField(term833323, term833323.getClass(), "contestNowPlayingSpecifier", "");
        setField(term833323, term833323.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term833323, term833323.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term833323, term833323.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term833323, term833323.getClass(), "rivalPdId", -1);
        term833928 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term833928;
        callMethod(klass, "setPreferPerPvModule", argTypes, term833323, args);
    }

};


