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

public class PlayerModule_hashCode_15070324129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term676177;

    public PlayerModule_hashCode_15070324129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term676792 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term676791 = ((Class) term676792).getDeclaredField((String) "MISS");
        ((Field) term676791).setAccessible(true);
        Object enum1477 = ((Field) term676791).get((Object) null);
        Class<? extends Object> term677169 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term677168 = ((Class) term677169).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term677168).setAccessible(true);
        Object enum1478 = ((Field) term677168).get((Object) null);
        Class<? extends Object> term677452 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term677451 = ((Class) term677452).getDeclaredField((String) "NORMAL");
        ((Field) term677451).setAccessible(true);
        Object enum1479 = ((Field) term677451).get((Object) null);
        Class<? extends Object> term677727 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term677726 = ((Class) term677727).getDeclaredField((String) "ORIGINAL");
        ((Field) term677726).setAccessible(true);
        Object enum1480 = ((Field) term677726).get((Object) null);
        Class<? extends Object> term677993 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term677992 = ((Class) term677993).getDeclaredField((String) "NONE");
        ((Field) term677992).setAccessible(true);
        Object enum1481 = ((Field) term677992).get((Object) null);
        term676177 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerModule"));
        Object term676179 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term676302 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term676303 = newInstance(Class.forName("java.time.LocalDate"));
        Object term676307 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term676177, term676177.getClass(), "id", 3423155413133381764L);
        setLongField(term676179, term676179.getClass(), "id", 7711054832353934171L);
        setIntField(term676179, term676179.getClass(), "pdId", 748487022);
        setField(term676179, term676179.getClass(), "playerName", "xxx");
        setIntField(term676179, term676179.getClass(), "vocaloidPoints", 300);
        setIntField(term676179, term676179.getClass(), "level", 1);
        setIntField(term676179, term676179.getClass(), "levelExp", -706230330);
        setField(term676179, term676179.getClass(), "levelTitle", "xxx");
        setIntField(term676179, term676179.getClass(), "plateId", -1);
        setIntField(term676179, term676179.getClass(), "plateEffectId", -1);
        setField(term676179, term676179.getClass(), "passwordStatus", enum1477);
        setField(term676179, term676179.getClass(), "password", "**********");
        setBooleanField(term676179, term676179.getClass(), "preferPerPvModule", true);
        setBooleanField(term676179, term676179.getClass(), "preferCommonModule", false);
        setBooleanField(term676179, term676179.getClass(), "usePerPvSkin", true);
        setBooleanField(term676179, term676179.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term676179, term676179.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term676179, term676179.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term676179, term676179.getClass(), "usePerPvTouchSliderSe", false);
        setField(term676179, term676179.getClass(), "commonModule", "-999,-999,-999");
        setField(term676179, term676179.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term676303, term676303.getClass(), "year", 2026);
        setShortField(term676303, term676303.getClass(), "month", (short) 8);
        setShortField(term676303, term676303.getClass(), "day", (short) 12);
        setField(term676302, term676302.getClass(), "date", term676303);
        setByteField(term676307, term676307.getClass(), "hour", (byte) 2);
        setByteField(term676307, term676307.getClass(), "minute", (byte) 4);
        setByteField(term676307, term676307.getClass(), "second", (byte) 18);
        setIntField(term676307, term676307.getClass(), "nano", 457086000);
        setField(term676302, term676302.getClass(), "time", term676307);
        setField(term676179, term676179.getClass(), "commonModuleSetTime", term676302);
        setField(term676179, term676179.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term676179, term676179.getClass(), "commonSkin", -1);
        setIntField(term676179, term676179.getClass(), "headphoneVolume", 100);
        setBooleanField(term676179, term676179.getClass(), "buttonSeOn", true);
        setIntField(term676179, term676179.getClass(), "buttonSeVolume", 100);
        setIntField(term676179, term676179.getClass(), "sliderSeVolume", 100);
        setIntField(term676179, term676179.getClass(), "buttonSe", -1);
        setIntField(term676179, term676179.getClass(), "chainSlideSe", -1);
        setIntField(term676179, term676179.getClass(), "slideSe", -1);
        setIntField(term676179, term676179.getClass(), "sliderTouchSe", -1);
        setField(term676179, term676179.getClass(), "sortMode", enum1478);
        setIntField(term676179, term676179.getClass(), "nextPvId", -1);
        setField(term676179, term676179.getClass(), "nextDifficulty", enum1479);
        setField(term676179, term676179.getClass(), "nextEdition", enum1480);
        setBooleanField(term676179, term676179.getClass(), "showInterimRanking", true);
        setBooleanField(term676179, term676179.getClass(), "showClearStatus", true);
        setBooleanField(term676179, term676179.getClass(), "showGreatBorder", true);
        setBooleanField(term676179, term676179.getClass(), "showExcellentBorder", true);
        setBooleanField(term676179, term676179.getClass(), "showRivalBorder", true);
        setBooleanField(term676179, term676179.getClass(), "showRgoSetting", true);
        setBooleanField(term676179, term676179.getClass(), "contestNowPlayingEnable", false);
        setIntField(term676179, term676179.getClass(), "contestNowPlayingId", -1);
        setIntField(term676179, term676179.getClass(), "contestNowPlayingValue", -1);
        setField(term676179, term676179.getClass(), "contestNowPlayingResultRank", enum1481);
        setField(term676179, term676179.getClass(), "contestNowPlayingSpecifier", "");
        setField(term676179, term676179.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term676179, term676179.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term676179, term676179.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term676179, term676179.getClass(), "rivalPdId", -1);
        setField(term676177, term676177.getClass(), "pdId", term676179);
        setIntField(term676177, term676177.getClass(), "moduleId", -926446006);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerModule");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term676177, args);
    }

};


