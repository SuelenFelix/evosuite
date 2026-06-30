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
import java.lang.Integer;

public class PlayerProfile_setSliderSeVolume_122495258977 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term870216;
     Object term870821;

    public PlayerProfile_setSliderSeVolume_122495258977() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term870830 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term870829 = ((Class) term870830).getDeclaredField((String) "MISS");
        ((Field) term870829).setAccessible(true);
        Object enum1872 = ((Field) term870829).get((Object) null);
        Class<? extends Object> term871207 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term871206 = ((Class) term871207).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term871206).setAccessible(true);
        Object enum1873 = ((Field) term871206).get((Object) null);
        Class<? extends Object> term871490 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term871489 = ((Class) term871490).getDeclaredField((String) "NORMAL");
        ((Field) term871489).setAccessible(true);
        Object enum1874 = ((Field) term871489).get((Object) null);
        Class<? extends Object> term871765 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term871764 = ((Class) term871765).getDeclaredField((String) "ORIGINAL");
        ((Field) term871764).setAccessible(true);
        Object enum1875 = ((Field) term871764).get((Object) null);
        Class<? extends Object> term872031 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term872030 = ((Class) term872031).getDeclaredField((String) "NONE");
        ((Field) term872030).setAccessible(true);
        Object enum1876 = ((Field) term872030).get((Object) null);
        term870216 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term870339 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term870340 = newInstance(Class.forName("java.time.LocalDate"));
        Object term870344 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term870216, term870216.getClass(), "id", -7574091101944828886L);
        setIntField(term870216, term870216.getClass(), "pdId", 2042811670);
        setField(term870216, term870216.getClass(), "playerName", "xxx");
        setIntField(term870216, term870216.getClass(), "vocaloidPoints", 300);
        setIntField(term870216, term870216.getClass(), "level", 1);
        setIntField(term870216, term870216.getClass(), "levelExp", -1713263092);
        setField(term870216, term870216.getClass(), "levelTitle", "xxx");
        setIntField(term870216, term870216.getClass(), "plateId", -1);
        setIntField(term870216, term870216.getClass(), "plateEffectId", -1);
        setField(term870216, term870216.getClass(), "passwordStatus", enum1872);
        setField(term870216, term870216.getClass(), "password", "**********");
        setBooleanField(term870216, term870216.getClass(), "preferPerPvModule", true);
        setBooleanField(term870216, term870216.getClass(), "preferCommonModule", false);
        setBooleanField(term870216, term870216.getClass(), "usePerPvSkin", false);
        setBooleanField(term870216, term870216.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term870216, term870216.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term870216, term870216.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term870216, term870216.getClass(), "usePerPvTouchSliderSe", false);
        setField(term870216, term870216.getClass(), "commonModule", "-999,-999,-999");
        setField(term870216, term870216.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term870340, term870340.getClass(), "year", 2026);
        setShortField(term870340, term870340.getClass(), "month", (short) 6);
        setShortField(term870340, term870340.getClass(), "day", (short) 29);
        setField(term870339, term870339.getClass(), "date", term870340);
        setByteField(term870344, term870344.getClass(), "hour", (byte) 4);
        setByteField(term870344, term870344.getClass(), "minute", (byte) 29);
        setByteField(term870344, term870344.getClass(), "second", (byte) 29);
        setIntField(term870344, term870344.getClass(), "nano", 47258000);
        setField(term870339, term870339.getClass(), "time", term870344);
        setField(term870216, term870216.getClass(), "commonModuleSetTime", term870339);
        setField(term870216, term870216.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term870216, term870216.getClass(), "commonSkin", -1);
        setIntField(term870216, term870216.getClass(), "headphoneVolume", 100);
        setBooleanField(term870216, term870216.getClass(), "buttonSeOn", true);
        setIntField(term870216, term870216.getClass(), "buttonSeVolume", 100);
        setIntField(term870216, term870216.getClass(), "sliderSeVolume", 100);
        setIntField(term870216, term870216.getClass(), "buttonSe", -1);
        setIntField(term870216, term870216.getClass(), "chainSlideSe", -1);
        setIntField(term870216, term870216.getClass(), "slideSe", -1);
        setIntField(term870216, term870216.getClass(), "sliderTouchSe", -1);
        setField(term870216, term870216.getClass(), "sortMode", enum1873);
        setIntField(term870216, term870216.getClass(), "nextPvId", -1);
        setField(term870216, term870216.getClass(), "nextDifficulty", enum1874);
        setField(term870216, term870216.getClass(), "nextEdition", enum1875);
        setBooleanField(term870216, term870216.getClass(), "showInterimRanking", true);
        setBooleanField(term870216, term870216.getClass(), "showClearStatus", true);
        setBooleanField(term870216, term870216.getClass(), "showGreatBorder", true);
        setBooleanField(term870216, term870216.getClass(), "showExcellentBorder", true);
        setBooleanField(term870216, term870216.getClass(), "showRivalBorder", true);
        setBooleanField(term870216, term870216.getClass(), "showRgoSetting", true);
        setBooleanField(term870216, term870216.getClass(), "contestNowPlayingEnable", true);
        setIntField(term870216, term870216.getClass(), "contestNowPlayingId", -1);
        setIntField(term870216, term870216.getClass(), "contestNowPlayingValue", -1);
        setField(term870216, term870216.getClass(), "contestNowPlayingResultRank", enum1876);
        setField(term870216, term870216.getClass(), "contestNowPlayingSpecifier", "");
        setField(term870216, term870216.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term870216, term870216.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term870216, term870216.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term870216, term870216.getClass(), "rivalPdId", -1);
        term870821 = new Integer(73609068);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term870821;
        callMethod(klass, "setSliderSeVolume", argTypes, term870216, args);
    }

};


