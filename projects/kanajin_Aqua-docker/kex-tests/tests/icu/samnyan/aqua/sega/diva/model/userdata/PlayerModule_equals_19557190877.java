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

public class PlayerModule_equals_19557190877 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term671263;
     Object term671871;

    public PlayerModule_equals_19557190877() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term671879 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term671878 = ((Class) term671879).getDeclaredField((String) "MISS");
        ((Field) term671878).setAccessible(true);
        Object enum1467 = ((Field) term671878).get((Object) null);
        Class<? extends Object> term672256 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term672255 = ((Class) term672256).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term672255).setAccessible(true);
        Object enum1468 = ((Field) term672255).get((Object) null);
        Class<? extends Object> term672539 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term672538 = ((Class) term672539).getDeclaredField((String) "NORMAL");
        ((Field) term672538).setAccessible(true);
        Object enum1469 = ((Field) term672538).get((Object) null);
        Class<? extends Object> term672814 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term672813 = ((Class) term672814).getDeclaredField((String) "ORIGINAL");
        ((Field) term672813).setAccessible(true);
        Object enum1470 = ((Field) term672813).get((Object) null);
        Class<? extends Object> term673080 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term673079 = ((Class) term673080).getDeclaredField((String) "NONE");
        ((Field) term673079).setAccessible(true);
        Object enum1471 = ((Field) term673079).get((Object) null);
        term671263 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerModule"));
        Object term671265 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term671388 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term671389 = newInstance(Class.forName("java.time.LocalDate"));
        Object term671393 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term671263, term671263.getClass(), "id", 3931473624300151730L);
        setLongField(term671265, term671265.getClass(), "id", 661905373566913125L);
        setIntField(term671265, term671265.getClass(), "pdId", 1370328728);
        setField(term671265, term671265.getClass(), "playerName", "xxx");
        setIntField(term671265, term671265.getClass(), "vocaloidPoints", 300);
        setIntField(term671265, term671265.getClass(), "level", 1);
        setIntField(term671265, term671265.getClass(), "levelExp", 1126005767);
        setField(term671265, term671265.getClass(), "levelTitle", "xxx");
        setIntField(term671265, term671265.getClass(), "plateId", -1);
        setIntField(term671265, term671265.getClass(), "plateEffectId", -1);
        setField(term671265, term671265.getClass(), "passwordStatus", enum1467);
        setField(term671265, term671265.getClass(), "password", "**********");
        setBooleanField(term671265, term671265.getClass(), "preferPerPvModule", true);
        setBooleanField(term671265, term671265.getClass(), "preferCommonModule", false);
        setBooleanField(term671265, term671265.getClass(), "usePerPvSkin", false);
        setBooleanField(term671265, term671265.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term671265, term671265.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term671265, term671265.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term671265, term671265.getClass(), "usePerPvTouchSliderSe", true);
        setField(term671265, term671265.getClass(), "commonModule", "-999,-999,-999");
        setField(term671265, term671265.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term671389, term671389.getClass(), "year", 2026);
        setShortField(term671389, term671389.getClass(), "month", (short) 8);
        setShortField(term671389, term671389.getClass(), "day", (short) 12);
        setField(term671388, term671388.getClass(), "date", term671389);
        setByteField(term671393, term671393.getClass(), "hour", (byte) 2);
        setByteField(term671393, term671393.getClass(), "minute", (byte) 4);
        setByteField(term671393, term671393.getClass(), "second", (byte) 17);
        setIntField(term671393, term671393.getClass(), "nano", 957819000);
        setField(term671388, term671388.getClass(), "time", term671393);
        setField(term671265, term671265.getClass(), "commonModuleSetTime", term671388);
        setField(term671265, term671265.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term671265, term671265.getClass(), "commonSkin", -1);
        setIntField(term671265, term671265.getClass(), "headphoneVolume", 100);
        setBooleanField(term671265, term671265.getClass(), "buttonSeOn", true);
        setIntField(term671265, term671265.getClass(), "buttonSeVolume", 100);
        setIntField(term671265, term671265.getClass(), "sliderSeVolume", 100);
        setIntField(term671265, term671265.getClass(), "buttonSe", -1);
        setIntField(term671265, term671265.getClass(), "chainSlideSe", -1);
        setIntField(term671265, term671265.getClass(), "slideSe", -1);
        setIntField(term671265, term671265.getClass(), "sliderTouchSe", -1);
        setField(term671265, term671265.getClass(), "sortMode", enum1468);
        setIntField(term671265, term671265.getClass(), "nextPvId", -1);
        setField(term671265, term671265.getClass(), "nextDifficulty", enum1469);
        setField(term671265, term671265.getClass(), "nextEdition", enum1470);
        setBooleanField(term671265, term671265.getClass(), "showInterimRanking", true);
        setBooleanField(term671265, term671265.getClass(), "showClearStatus", true);
        setBooleanField(term671265, term671265.getClass(), "showGreatBorder", true);
        setBooleanField(term671265, term671265.getClass(), "showExcellentBorder", true);
        setBooleanField(term671265, term671265.getClass(), "showRivalBorder", true);
        setBooleanField(term671265, term671265.getClass(), "showRgoSetting", true);
        setBooleanField(term671265, term671265.getClass(), "contestNowPlayingEnable", true);
        setIntField(term671265, term671265.getClass(), "contestNowPlayingId", -1);
        setIntField(term671265, term671265.getClass(), "contestNowPlayingValue", -1);
        setField(term671265, term671265.getClass(), "contestNowPlayingResultRank", enum1471);
        setField(term671265, term671265.getClass(), "contestNowPlayingSpecifier", "");
        setField(term671265, term671265.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term671265, term671265.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term671265, term671265.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term671265, term671265.getClass(), "rivalPdId", -1);
        setField(term671263, term671263.getClass(), "pdId", term671265);
        setIntField(term671263, term671263.getClass(), "moduleId", -1155333431);
        term671871 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerModule");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term671871;
        callMethod(klass, "equals", argTypes, term671263, args);
    }

};


