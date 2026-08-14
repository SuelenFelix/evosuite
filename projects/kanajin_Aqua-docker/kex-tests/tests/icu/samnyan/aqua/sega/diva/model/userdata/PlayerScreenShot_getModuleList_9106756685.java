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

public class PlayerScreenShot_getModuleList_9106756685 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term496575;

    public PlayerScreenShot_getModuleList_9106756685() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term497226 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term497225 = ((Class) term497226).getDeclaredField((String) "MISS");
        ((Field) term497225).setAccessible(true);
        Object enum1102 = ((Field) term497225).get((Object) null);
        Class<? extends Object> term497603 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term497602 = ((Class) term497603).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term497602).setAccessible(true);
        Object enum1103 = ((Field) term497602).get((Object) null);
        Class<? extends Object> term497886 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term497885 = ((Class) term497886).getDeclaredField((String) "NORMAL");
        ((Field) term497885).setAccessible(true);
        Object enum1104 = ((Field) term497885).get((Object) null);
        Class<? extends Object> term498161 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term498160 = ((Class) term498161).getDeclaredField((String) "ORIGINAL");
        ((Field) term498160).setAccessible(true);
        Object enum1105 = ((Field) term498160).get((Object) null);
        Class<? extends Object> term498427 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term498426 = ((Class) term498427).getDeclaredField((String) "NONE");
        ((Field) term498426).setAccessible(true);
        Object enum1106 = ((Field) term498426).get((Object) null);
        term496575 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerScreenShot"));
        Object term496577 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term496700 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term496701 = newInstance(Class.forName("java.time.LocalDate"));
        Object term496705 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term496575, term496575.getClass(), "id", 3086974592680165932L);
        setLongField(term496577, term496577.getClass(), "id", -532956263280568707L);
        setIntField(term496577, term496577.getClass(), "pdId", 1130098561);
        setField(term496577, term496577.getClass(), "playerName", "xxx");
        setIntField(term496577, term496577.getClass(), "vocaloidPoints", 300);
        setIntField(term496577, term496577.getClass(), "level", 1);
        setIntField(term496577, term496577.getClass(), "levelExp", 954169543);
        setField(term496577, term496577.getClass(), "levelTitle", "xxx");
        setIntField(term496577, term496577.getClass(), "plateId", -1);
        setIntField(term496577, term496577.getClass(), "plateEffectId", -1);
        setField(term496577, term496577.getClass(), "passwordStatus", enum1102);
        setField(term496577, term496577.getClass(), "password", "**********");
        setBooleanField(term496577, term496577.getClass(), "preferPerPvModule", true);
        setBooleanField(term496577, term496577.getClass(), "preferCommonModule", true);
        setBooleanField(term496577, term496577.getClass(), "usePerPvSkin", false);
        setBooleanField(term496577, term496577.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term496577, term496577.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term496577, term496577.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term496577, term496577.getClass(), "usePerPvTouchSliderSe", true);
        setField(term496577, term496577.getClass(), "commonModule", "-999,-999,-999");
        setField(term496577, term496577.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term496701, term496701.getClass(), "year", 2026);
        setShortField(term496701, term496701.getClass(), "month", (short) 8);
        setShortField(term496701, term496701.getClass(), "day", (short) 12);
        setField(term496700, term496700.getClass(), "date", term496701);
        setByteField(term496705, term496705.getClass(), "hour", (byte) 2);
        setByteField(term496705, term496705.getClass(), "minute", (byte) 3);
        setByteField(term496705, term496705.getClass(), "second", (byte) 46);
        setIntField(term496705, term496705.getClass(), "nano", 526064000);
        setField(term496700, term496700.getClass(), "time", term496705);
        setField(term496577, term496577.getClass(), "commonModuleSetTime", term496700);
        setField(term496577, term496577.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term496577, term496577.getClass(), "commonSkin", -1);
        setIntField(term496577, term496577.getClass(), "headphoneVolume", 100);
        setBooleanField(term496577, term496577.getClass(), "buttonSeOn", true);
        setIntField(term496577, term496577.getClass(), "buttonSeVolume", 100);
        setIntField(term496577, term496577.getClass(), "sliderSeVolume", 100);
        setIntField(term496577, term496577.getClass(), "buttonSe", -1);
        setIntField(term496577, term496577.getClass(), "chainSlideSe", -1);
        setIntField(term496577, term496577.getClass(), "slideSe", -1);
        setIntField(term496577, term496577.getClass(), "sliderTouchSe", -1);
        setField(term496577, term496577.getClass(), "sortMode", enum1103);
        setIntField(term496577, term496577.getClass(), "nextPvId", -1);
        setField(term496577, term496577.getClass(), "nextDifficulty", enum1104);
        setField(term496577, term496577.getClass(), "nextEdition", enum1105);
        setBooleanField(term496577, term496577.getClass(), "showInterimRanking", true);
        setBooleanField(term496577, term496577.getClass(), "showClearStatus", true);
        setBooleanField(term496577, term496577.getClass(), "showGreatBorder", true);
        setBooleanField(term496577, term496577.getClass(), "showExcellentBorder", true);
        setBooleanField(term496577, term496577.getClass(), "showRivalBorder", true);
        setBooleanField(term496577, term496577.getClass(), "showRgoSetting", true);
        setBooleanField(term496577, term496577.getClass(), "contestNowPlayingEnable", true);
        setIntField(term496577, term496577.getClass(), "contestNowPlayingId", -1);
        setIntField(term496577, term496577.getClass(), "contestNowPlayingValue", -1);
        setField(term496577, term496577.getClass(), "contestNowPlayingResultRank", enum1106);
        setField(term496577, term496577.getClass(), "contestNowPlayingSpecifier", "");
        setField(term496577, term496577.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term496577, term496577.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term496577, term496577.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term496577, term496577.getClass(), "rivalPdId", -1);
        setField(term496575, term496575.getClass(), "pdId", term496577);
        setIntField(term496575, term496575.getClass(), "pvId", -2124307939);
        setField(term496575, term496575.getClass(), "fileName", "SPtPatHeOm");
        setField(term496575, term496575.getClass(), "moduleList", "ywmcuThdfL");
        setField(term496575, term496575.getClass(), "customizeList", "GBOEuByOfr");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerScreenShot");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getModuleList", argTypes, term496575, args);
    }

};


