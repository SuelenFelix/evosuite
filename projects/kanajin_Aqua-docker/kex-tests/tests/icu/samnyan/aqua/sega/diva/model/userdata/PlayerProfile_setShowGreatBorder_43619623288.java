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

public class PlayerProfile_setShowGreatBorder_43619623288 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term897750;
     Object term898355;

    public PlayerProfile_setShowGreatBorder_43619623288() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term898364 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term898363 = ((Class) term898364).getDeclaredField((String) "MISS");
        ((Field) term898363).setAccessible(true);
        Object enum1929 = ((Field) term898363).get((Object) null);
        Class<? extends Object> term898741 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term898740 = ((Class) term898741).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term898740).setAccessible(true);
        Object enum1930 = ((Field) term898740).get((Object) null);
        Class<? extends Object> term899024 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term899023 = ((Class) term899024).getDeclaredField((String) "NORMAL");
        ((Field) term899023).setAccessible(true);
        Object enum1931 = ((Field) term899023).get((Object) null);
        Class<? extends Object> term899299 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term899298 = ((Class) term899299).getDeclaredField((String) "ORIGINAL");
        ((Field) term899298).setAccessible(true);
        Object enum1932 = ((Field) term899298).get((Object) null);
        Class<? extends Object> term899565 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term899564 = ((Class) term899565).getDeclaredField((String) "NONE");
        ((Field) term899564).setAccessible(true);
        Object enum1933 = ((Field) term899564).get((Object) null);
        term897750 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term897873 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term897874 = newInstance(Class.forName("java.time.LocalDate"));
        Object term897878 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term897750, term897750.getClass(), "id", 5097769785635819744L);
        setIntField(term897750, term897750.getClass(), "pdId", -920852160);
        setField(term897750, term897750.getClass(), "playerName", "xxx");
        setIntField(term897750, term897750.getClass(), "vocaloidPoints", 300);
        setIntField(term897750, term897750.getClass(), "level", 1);
        setIntField(term897750, term897750.getClass(), "levelExp", -1975385844);
        setField(term897750, term897750.getClass(), "levelTitle", "xxx");
        setIntField(term897750, term897750.getClass(), "plateId", -1);
        setIntField(term897750, term897750.getClass(), "plateEffectId", -1);
        setField(term897750, term897750.getClass(), "passwordStatus", enum1929);
        setField(term897750, term897750.getClass(), "password", "**********");
        setBooleanField(term897750, term897750.getClass(), "preferPerPvModule", true);
        setBooleanField(term897750, term897750.getClass(), "preferCommonModule", true);
        setBooleanField(term897750, term897750.getClass(), "usePerPvSkin", true);
        setBooleanField(term897750, term897750.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term897750, term897750.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term897750, term897750.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term897750, term897750.getClass(), "usePerPvTouchSliderSe", true);
        setField(term897750, term897750.getClass(), "commonModule", "-999,-999,-999");
        setField(term897750, term897750.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term897874, term897874.getClass(), "year", 2026);
        setShortField(term897874, term897874.getClass(), "month", (short) 6);
        setShortField(term897874, term897874.getClass(), "day", (short) 29);
        setField(term897873, term897873.getClass(), "date", term897874);
        setByteField(term897878, term897878.getClass(), "hour", (byte) 4);
        setByteField(term897878, term897878.getClass(), "minute", (byte) 29);
        setByteField(term897878, term897878.getClass(), "second", (byte) 31);
        setIntField(term897878, term897878.getClass(), "nano", 877542000);
        setField(term897873, term897873.getClass(), "time", term897878);
        setField(term897750, term897750.getClass(), "commonModuleSetTime", term897873);
        setField(term897750, term897750.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term897750, term897750.getClass(), "commonSkin", -1);
        setIntField(term897750, term897750.getClass(), "headphoneVolume", 100);
        setBooleanField(term897750, term897750.getClass(), "buttonSeOn", true);
        setIntField(term897750, term897750.getClass(), "buttonSeVolume", 100);
        setIntField(term897750, term897750.getClass(), "sliderSeVolume", 100);
        setIntField(term897750, term897750.getClass(), "buttonSe", -1);
        setIntField(term897750, term897750.getClass(), "chainSlideSe", -1);
        setIntField(term897750, term897750.getClass(), "slideSe", -1);
        setIntField(term897750, term897750.getClass(), "sliderTouchSe", -1);
        setField(term897750, term897750.getClass(), "sortMode", enum1930);
        setIntField(term897750, term897750.getClass(), "nextPvId", -1);
        setField(term897750, term897750.getClass(), "nextDifficulty", enum1931);
        setField(term897750, term897750.getClass(), "nextEdition", enum1932);
        setBooleanField(term897750, term897750.getClass(), "showInterimRanking", true);
        setBooleanField(term897750, term897750.getClass(), "showClearStatus", true);
        setBooleanField(term897750, term897750.getClass(), "showGreatBorder", true);
        setBooleanField(term897750, term897750.getClass(), "showExcellentBorder", true);
        setBooleanField(term897750, term897750.getClass(), "showRivalBorder", true);
        setBooleanField(term897750, term897750.getClass(), "showRgoSetting", true);
        setBooleanField(term897750, term897750.getClass(), "contestNowPlayingEnable", false);
        setIntField(term897750, term897750.getClass(), "contestNowPlayingId", -1);
        setIntField(term897750, term897750.getClass(), "contestNowPlayingValue", -1);
        setField(term897750, term897750.getClass(), "contestNowPlayingResultRank", enum1933);
        setField(term897750, term897750.getClass(), "contestNowPlayingSpecifier", "");
        setField(term897750, term897750.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term897750, term897750.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term897750, term897750.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term897750, term897750.getClass(), "rivalPdId", -1);
        term898355 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term898355;
        callMethod(klass, "setShowGreatBorder", argTypes, term897750, args);
    }

};


