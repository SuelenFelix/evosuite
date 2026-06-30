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

public class PlayerModule_toString_99627272210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term678633;

    public PlayerModule_toString_99627272210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term679248 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term679247 = ((Class) term679248).getDeclaredField((String) "MISS");
        ((Field) term679247).setAccessible(true);
        Object enum1482 = ((Field) term679247).get((Object) null);
        Class<? extends Object> term679625 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term679624 = ((Class) term679625).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term679624).setAccessible(true);
        Object enum1483 = ((Field) term679624).get((Object) null);
        Class<? extends Object> term679908 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term679907 = ((Class) term679908).getDeclaredField((String) "NORMAL");
        ((Field) term679907).setAccessible(true);
        Object enum1484 = ((Field) term679907).get((Object) null);
        Class<? extends Object> term680183 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term680182 = ((Class) term680183).getDeclaredField((String) "ORIGINAL");
        ((Field) term680182).setAccessible(true);
        Object enum1485 = ((Field) term680182).get((Object) null);
        Class<? extends Object> term680449 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term680448 = ((Class) term680449).getDeclaredField((String) "NONE");
        ((Field) term680448).setAccessible(true);
        Object enum1486 = ((Field) term680448).get((Object) null);
        term678633 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerModule"));
        Object term678635 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term678758 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term678759 = newInstance(Class.forName("java.time.LocalDate"));
        Object term678763 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term678633, term678633.getClass(), "id", 185544001230120339L);
        setLongField(term678635, term678635.getClass(), "id", 4096288569907305445L);
        setIntField(term678635, term678635.getClass(), "pdId", 572417171);
        setField(term678635, term678635.getClass(), "playerName", "xxx");
        setIntField(term678635, term678635.getClass(), "vocaloidPoints", 300);
        setIntField(term678635, term678635.getClass(), "level", 1);
        setIntField(term678635, term678635.getClass(), "levelExp", 46222099);
        setField(term678635, term678635.getClass(), "levelTitle", "xxx");
        setIntField(term678635, term678635.getClass(), "plateId", -1);
        setIntField(term678635, term678635.getClass(), "plateEffectId", -1);
        setField(term678635, term678635.getClass(), "passwordStatus", enum1482);
        setField(term678635, term678635.getClass(), "password", "**********");
        setBooleanField(term678635, term678635.getClass(), "preferPerPvModule", true);
        setBooleanField(term678635, term678635.getClass(), "preferCommonModule", false);
        setBooleanField(term678635, term678635.getClass(), "usePerPvSkin", true);
        setBooleanField(term678635, term678635.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term678635, term678635.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term678635, term678635.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term678635, term678635.getClass(), "usePerPvTouchSliderSe", true);
        setField(term678635, term678635.getClass(), "commonModule", "-999,-999,-999");
        setField(term678635, term678635.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term678759, term678759.getClass(), "year", 2026);
        setShortField(term678759, term678759.getClass(), "month", (short) 6);
        setShortField(term678759, term678759.getClass(), "day", (short) 29);
        setField(term678758, term678758.getClass(), "date", term678759);
        setByteField(term678763, term678763.getClass(), "hour", (byte) 4);
        setByteField(term678763, term678763.getClass(), "minute", (byte) 29);
        setByteField(term678763, term678763.getClass(), "second", (byte) 5);
        setIntField(term678763, term678763.getClass(), "nano", 206904000);
        setField(term678758, term678758.getClass(), "time", term678763);
        setField(term678635, term678635.getClass(), "commonModuleSetTime", term678758);
        setField(term678635, term678635.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term678635, term678635.getClass(), "commonSkin", -1);
        setIntField(term678635, term678635.getClass(), "headphoneVolume", 100);
        setBooleanField(term678635, term678635.getClass(), "buttonSeOn", true);
        setIntField(term678635, term678635.getClass(), "buttonSeVolume", 100);
        setIntField(term678635, term678635.getClass(), "sliderSeVolume", 100);
        setIntField(term678635, term678635.getClass(), "buttonSe", -1);
        setIntField(term678635, term678635.getClass(), "chainSlideSe", -1);
        setIntField(term678635, term678635.getClass(), "slideSe", -1);
        setIntField(term678635, term678635.getClass(), "sliderTouchSe", -1);
        setField(term678635, term678635.getClass(), "sortMode", enum1483);
        setIntField(term678635, term678635.getClass(), "nextPvId", -1);
        setField(term678635, term678635.getClass(), "nextDifficulty", enum1484);
        setField(term678635, term678635.getClass(), "nextEdition", enum1485);
        setBooleanField(term678635, term678635.getClass(), "showInterimRanking", true);
        setBooleanField(term678635, term678635.getClass(), "showClearStatus", true);
        setBooleanField(term678635, term678635.getClass(), "showGreatBorder", true);
        setBooleanField(term678635, term678635.getClass(), "showExcellentBorder", true);
        setBooleanField(term678635, term678635.getClass(), "showRivalBorder", true);
        setBooleanField(term678635, term678635.getClass(), "showRgoSetting", true);
        setBooleanField(term678635, term678635.getClass(), "contestNowPlayingEnable", true);
        setIntField(term678635, term678635.getClass(), "contestNowPlayingId", -1);
        setIntField(term678635, term678635.getClass(), "contestNowPlayingValue", -1);
        setField(term678635, term678635.getClass(), "contestNowPlayingResultRank", enum1486);
        setField(term678635, term678635.getClass(), "contestNowPlayingSpecifier", "");
        setField(term678635, term678635.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term678635, term678635.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term678635, term678635.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term678635, term678635.getClass(), "rivalPdId", -1);
        setField(term678633, term678633.getClass(), "pdId", term678635);
        setIntField(term678633, term678633.getClass(), "moduleId", 1985711069);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerModule");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term678633, args);
    }

};


