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

public class PlayerProfile_isPreferCommonModule_199584419913 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term713046;

    public PlayerProfile_isPreferCommonModule_199584419913() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term713658 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term713657 = ((Class) term713658).getDeclaredField((String) "MISS");
        ((Field) term713657).setAccessible(true);
        Object enum1552 = ((Field) term713657).get((Object) null);
        Class<? extends Object> term714035 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term714034 = ((Class) term714035).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term714034).setAccessible(true);
        Object enum1553 = ((Field) term714034).get((Object) null);
        Class<? extends Object> term714318 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term714317 = ((Class) term714318).getDeclaredField((String) "NORMAL");
        ((Field) term714317).setAccessible(true);
        Object enum1554 = ((Field) term714317).get((Object) null);
        Class<? extends Object> term714593 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term714592 = ((Class) term714593).getDeclaredField((String) "ORIGINAL");
        ((Field) term714592).setAccessible(true);
        Object enum1555 = ((Field) term714592).get((Object) null);
        Class<? extends Object> term714859 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term714858 = ((Class) term714859).getDeclaredField((String) "NONE");
        ((Field) term714858).setAccessible(true);
        Object enum1556 = ((Field) term714858).get((Object) null);
        term713046 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term713169 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term713170 = newInstance(Class.forName("java.time.LocalDate"));
        Object term713174 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term713046, term713046.getClass(), "id", 6142089107139955834L);
        setIntField(term713046, term713046.getClass(), "pdId", 2042788478);
        setField(term713046, term713046.getClass(), "playerName", "xxx");
        setIntField(term713046, term713046.getClass(), "vocaloidPoints", 300);
        setIntField(term713046, term713046.getClass(), "level", 1);
        setIntField(term713046, term713046.getClass(), "levelExp", -620591021);
        setField(term713046, term713046.getClass(), "levelTitle", "xxx");
        setIntField(term713046, term713046.getClass(), "plateId", -1);
        setIntField(term713046, term713046.getClass(), "plateEffectId", -1);
        setField(term713046, term713046.getClass(), "passwordStatus", enum1552);
        setField(term713046, term713046.getClass(), "password", "**********");
        setBooleanField(term713046, term713046.getClass(), "preferPerPvModule", true);
        setBooleanField(term713046, term713046.getClass(), "preferCommonModule", false);
        setBooleanField(term713046, term713046.getClass(), "usePerPvSkin", false);
        setBooleanField(term713046, term713046.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term713046, term713046.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term713046, term713046.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term713046, term713046.getClass(), "usePerPvTouchSliderSe", true);
        setField(term713046, term713046.getClass(), "commonModule", "-999,-999,-999");
        setField(term713046, term713046.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term713170, term713170.getClass(), "year", 2026);
        setShortField(term713170, term713170.getClass(), "month", (short) 6);
        setShortField(term713170, term713170.getClass(), "day", (short) 29);
        setField(term713169, term713169.getClass(), "date", term713170);
        setByteField(term713174, term713174.getClass(), "hour", (byte) 4);
        setByteField(term713174, term713174.getClass(), "minute", (byte) 29);
        setByteField(term713174, term713174.getClass(), "second", (byte) 12);
        setIntField(term713174, term713174.getClass(), "nano", 590929000);
        setField(term713169, term713169.getClass(), "time", term713174);
        setField(term713046, term713046.getClass(), "commonModuleSetTime", term713169);
        setField(term713046, term713046.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term713046, term713046.getClass(), "commonSkin", -1);
        setIntField(term713046, term713046.getClass(), "headphoneVolume", 100);
        setBooleanField(term713046, term713046.getClass(), "buttonSeOn", true);
        setIntField(term713046, term713046.getClass(), "buttonSeVolume", 100);
        setIntField(term713046, term713046.getClass(), "sliderSeVolume", 100);
        setIntField(term713046, term713046.getClass(), "buttonSe", -1);
        setIntField(term713046, term713046.getClass(), "chainSlideSe", -1);
        setIntField(term713046, term713046.getClass(), "slideSe", -1);
        setIntField(term713046, term713046.getClass(), "sliderTouchSe", -1);
        setField(term713046, term713046.getClass(), "sortMode", enum1553);
        setIntField(term713046, term713046.getClass(), "nextPvId", -1);
        setField(term713046, term713046.getClass(), "nextDifficulty", enum1554);
        setField(term713046, term713046.getClass(), "nextEdition", enum1555);
        setBooleanField(term713046, term713046.getClass(), "showInterimRanking", true);
        setBooleanField(term713046, term713046.getClass(), "showClearStatus", true);
        setBooleanField(term713046, term713046.getClass(), "showGreatBorder", true);
        setBooleanField(term713046, term713046.getClass(), "showExcellentBorder", true);
        setBooleanField(term713046, term713046.getClass(), "showRivalBorder", true);
        setBooleanField(term713046, term713046.getClass(), "showRgoSetting", true);
        setBooleanField(term713046, term713046.getClass(), "contestNowPlayingEnable", false);
        setIntField(term713046, term713046.getClass(), "contestNowPlayingId", -1);
        setIntField(term713046, term713046.getClass(), "contestNowPlayingValue", -1);
        setField(term713046, term713046.getClass(), "contestNowPlayingResultRank", enum1556);
        setField(term713046, term713046.getClass(), "contestNowPlayingSpecifier", "");
        setField(term713046, term713046.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term713046, term713046.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term713046, term713046.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term713046, term713046.getClass(), "rivalPdId", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isPreferCommonModule", argTypes, term713046, args);
    }

};


