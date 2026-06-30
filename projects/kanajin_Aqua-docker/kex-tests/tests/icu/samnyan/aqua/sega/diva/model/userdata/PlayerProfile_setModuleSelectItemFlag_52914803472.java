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

public class PlayerProfile_setModuleSelectItemFlag_52914803472 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term857921;

    public PlayerProfile_setModuleSelectItemFlag_52914803472() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term858545 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term858544 = ((Class) term858545).getDeclaredField((String) "MISS");
        ((Field) term858544).setAccessible(true);
        Object enum1847 = ((Field) term858544).get((Object) null);
        Class<? extends Object> term858922 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term858921 = ((Class) term858922).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term858921).setAccessible(true);
        Object enum1848 = ((Field) term858921).get((Object) null);
        Class<? extends Object> term859205 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term859204 = ((Class) term859205).getDeclaredField((String) "NORMAL");
        ((Field) term859204).setAccessible(true);
        Object enum1849 = ((Field) term859204).get((Object) null);
        Class<? extends Object> term859480 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term859479 = ((Class) term859480).getDeclaredField((String) "ORIGINAL");
        ((Field) term859479).setAccessible(true);
        Object enum1850 = ((Field) term859479).get((Object) null);
        Class<? extends Object> term859746 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term859745 = ((Class) term859746).getDeclaredField((String) "NONE");
        ((Field) term859745).setAccessible(true);
        Object enum1851 = ((Field) term859745).get((Object) null);
        term857921 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term858044 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term858045 = newInstance(Class.forName("java.time.LocalDate"));
        Object term858049 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term857921, term857921.getClass(), "id", 5047215164896153648L);
        setIntField(term857921, term857921.getClass(), "pdId", -1338560431);
        setField(term857921, term857921.getClass(), "playerName", "xxx");
        setIntField(term857921, term857921.getClass(), "vocaloidPoints", 300);
        setIntField(term857921, term857921.getClass(), "level", 1);
        setIntField(term857921, term857921.getClass(), "levelExp", 1768827963);
        setField(term857921, term857921.getClass(), "levelTitle", "xxx");
        setIntField(term857921, term857921.getClass(), "plateId", -1);
        setIntField(term857921, term857921.getClass(), "plateEffectId", -1);
        setField(term857921, term857921.getClass(), "passwordStatus", enum1847);
        setField(term857921, term857921.getClass(), "password", "**********");
        setBooleanField(term857921, term857921.getClass(), "preferPerPvModule", true);
        setBooleanField(term857921, term857921.getClass(), "preferCommonModule", false);
        setBooleanField(term857921, term857921.getClass(), "usePerPvSkin", true);
        setBooleanField(term857921, term857921.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term857921, term857921.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term857921, term857921.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term857921, term857921.getClass(), "usePerPvTouchSliderSe", true);
        setField(term857921, term857921.getClass(), "commonModule", "-999,-999,-999");
        setField(term857921, term857921.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term858045, term858045.getClass(), "year", 2026);
        setShortField(term858045, term858045.getClass(), "month", (short) 6);
        setShortField(term858045, term858045.getClass(), "day", (short) 29);
        setField(term858044, term858044.getClass(), "date", term858045);
        setByteField(term858049, term858049.getClass(), "hour", (byte) 4);
        setByteField(term858049, term858049.getClass(), "minute", (byte) 29);
        setByteField(term858049, term858049.getClass(), "second", (byte) 27);
        setIntField(term858049, term858049.getClass(), "nano", 764165000);
        setField(term858044, term858044.getClass(), "time", term858049);
        setField(term857921, term857921.getClass(), "commonModuleSetTime", term858044);
        setField(term857921, term857921.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term857921, term857921.getClass(), "commonSkin", -1);
        setIntField(term857921, term857921.getClass(), "headphoneVolume", 100);
        setBooleanField(term857921, term857921.getClass(), "buttonSeOn", true);
        setIntField(term857921, term857921.getClass(), "buttonSeVolume", 100);
        setIntField(term857921, term857921.getClass(), "sliderSeVolume", 100);
        setIntField(term857921, term857921.getClass(), "buttonSe", -1);
        setIntField(term857921, term857921.getClass(), "chainSlideSe", -1);
        setIntField(term857921, term857921.getClass(), "slideSe", -1);
        setIntField(term857921, term857921.getClass(), "sliderTouchSe", -1);
        setField(term857921, term857921.getClass(), "sortMode", enum1848);
        setIntField(term857921, term857921.getClass(), "nextPvId", -1);
        setField(term857921, term857921.getClass(), "nextDifficulty", enum1849);
        setField(term857921, term857921.getClass(), "nextEdition", enum1850);
        setBooleanField(term857921, term857921.getClass(), "showInterimRanking", true);
        setBooleanField(term857921, term857921.getClass(), "showClearStatus", true);
        setBooleanField(term857921, term857921.getClass(), "showGreatBorder", true);
        setBooleanField(term857921, term857921.getClass(), "showExcellentBorder", true);
        setBooleanField(term857921, term857921.getClass(), "showRivalBorder", true);
        setBooleanField(term857921, term857921.getClass(), "showRgoSetting", true);
        setBooleanField(term857921, term857921.getClass(), "contestNowPlayingEnable", false);
        setIntField(term857921, term857921.getClass(), "contestNowPlayingId", -1);
        setIntField(term857921, term857921.getClass(), "contestNowPlayingValue", -1);
        setField(term857921, term857921.getClass(), "contestNowPlayingResultRank", enum1851);
        setField(term857921, term857921.getClass(), "contestNowPlayingSpecifier", "");
        setField(term857921, term857921.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term857921, term857921.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term857921, term857921.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term857921, term857921.getClass(), "rivalPdId", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "mLwibAPEsa";
        callMethod(klass, "setModuleSelectItemFlag", argTypes, term857921, args);
    }

};


