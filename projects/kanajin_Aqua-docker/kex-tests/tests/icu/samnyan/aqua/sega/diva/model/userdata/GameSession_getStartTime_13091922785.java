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
import java.lang.Integer;

public class GameSession_getStartTime_13091922785 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term371329;

    public GameSession_getStartTime_13091922785() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term371989 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term371988 = ((Class) term371989).getDeclaredField((String) "MISS");
        ((Field) term371988).setAccessible(true);
        Object enum842 = ((Field) term371988).get((Object) null);
        Class<? extends Object> term372366 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term372365 = ((Class) term372366).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term372365).setAccessible(true);
        Object enum843 = ((Field) term372365).get((Object) null);
        Class<? extends Object> term372649 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term372648 = ((Class) term372649).getDeclaredField((String) "NORMAL");
        ((Field) term372648).setAccessible(true);
        Object enum844 = ((Field) term372648).get((Object) null);
        Class<? extends Object> term372924 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term372923 = ((Class) term372924).getDeclaredField((String) "ORIGINAL");
        ((Field) term372923).setAccessible(true);
        Object enum845 = ((Field) term372923).get((Object) null);
        Class<? extends Object> term373190 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term373189 = ((Class) term373190).getDeclaredField((String) "NONE");
        ((Field) term373189).setAccessible(true);
        Object enum846 = ((Field) term373189).get((Object) null);
        Class<? extends Object> term373831 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.StartMode");
        Field term373830 = ((Class) term373831).getDeclaredField((String) "START");
        ((Field) term373830).setAccessible(true);
        Object enum847 = ((Field) term373830).get((Object) null);
        Integer term371966 = new Integer(1962444399);
        Integer term371968 = new Integer(767834723);
        Integer term371970 = new Integer(-602026508);
        Integer term371972 = new Integer(-157887805);
        Integer term371974 = new Integer(1876565163);
        Integer term371976 = new Integer(-817164822);
        Integer term371978 = new Integer(-1016503459);
        Integer term371980 = new Integer(-1968847291);
        term371329 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.GameSession"));
        Object term371332 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term371455 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term371456 = newInstance(Class.forName("java.time.LocalDate"));
        Object term371460 = newInstance(Class.forName("java.time.LocalTime"));
        Object term371946 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term371947 = newInstance(Class.forName("java.time.LocalDate"));
        Object term371951 = newInstance(Class.forName("java.time.LocalTime"));
        Object term371956 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term371957 = newInstance(Class.forName("java.time.LocalDate"));
        Object term371961 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term371329, term371329.getClass(), "id", 3238645206498300107L);
        setIntField(term371329, term371329.getClass(), "acceptId", -2044768479);
        setLongField(term371332, term371332.getClass(), "id", -1592696983130738594L);
        setIntField(term371332, term371332.getClass(), "pdId", -2020209498);
        setField(term371332, term371332.getClass(), "playerName", "xxx");
        setIntField(term371332, term371332.getClass(), "vocaloidPoints", 300);
        setIntField(term371332, term371332.getClass(), "level", 1);
        setIntField(term371332, term371332.getClass(), "levelExp", 754066823);
        setField(term371332, term371332.getClass(), "levelTitle", "xxx");
        setIntField(term371332, term371332.getClass(), "plateId", -1);
        setIntField(term371332, term371332.getClass(), "plateEffectId", -1);
        setField(term371332, term371332.getClass(), "passwordStatus", enum842);
        setField(term371332, term371332.getClass(), "password", "**********");
        setBooleanField(term371332, term371332.getClass(), "preferPerPvModule", true);
        setBooleanField(term371332, term371332.getClass(), "preferCommonModule", false);
        setBooleanField(term371332, term371332.getClass(), "usePerPvSkin", true);
        setBooleanField(term371332, term371332.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term371332, term371332.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term371332, term371332.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term371332, term371332.getClass(), "usePerPvTouchSliderSe", false);
        setField(term371332, term371332.getClass(), "commonModule", "-999,-999,-999");
        setField(term371332, term371332.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term371456, term371456.getClass(), "year", 2026);
        setShortField(term371456, term371456.getClass(), "month", (short) 8);
        setShortField(term371456, term371456.getClass(), "day", (short) 12);
        setField(term371455, term371455.getClass(), "date", term371456);
        setByteField(term371460, term371460.getClass(), "hour", (byte) 2);
        setByteField(term371460, term371460.getClass(), "minute", (byte) 3);
        setByteField(term371460, term371460.getClass(), "second", (byte) 23);
        setIntField(term371460, term371460.getClass(), "nano", 74686000);
        setField(term371455, term371455.getClass(), "time", term371460);
        setField(term371332, term371332.getClass(), "commonModuleSetTime", term371455);
        setField(term371332, term371332.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term371332, term371332.getClass(), "commonSkin", -1);
        setIntField(term371332, term371332.getClass(), "headphoneVolume", 100);
        setBooleanField(term371332, term371332.getClass(), "buttonSeOn", true);
        setIntField(term371332, term371332.getClass(), "buttonSeVolume", 100);
        setIntField(term371332, term371332.getClass(), "sliderSeVolume", 100);
        setIntField(term371332, term371332.getClass(), "buttonSe", -1);
        setIntField(term371332, term371332.getClass(), "chainSlideSe", -1);
        setIntField(term371332, term371332.getClass(), "slideSe", -1);
        setIntField(term371332, term371332.getClass(), "sliderTouchSe", -1);
        setField(term371332, term371332.getClass(), "sortMode", enum843);
        setIntField(term371332, term371332.getClass(), "nextPvId", -1);
        setField(term371332, term371332.getClass(), "nextDifficulty", enum844);
        setField(term371332, term371332.getClass(), "nextEdition", enum845);
        setBooleanField(term371332, term371332.getClass(), "showInterimRanking", true);
        setBooleanField(term371332, term371332.getClass(), "showClearStatus", true);
        setBooleanField(term371332, term371332.getClass(), "showGreatBorder", true);
        setBooleanField(term371332, term371332.getClass(), "showExcellentBorder", true);
        setBooleanField(term371332, term371332.getClass(), "showRivalBorder", true);
        setBooleanField(term371332, term371332.getClass(), "showRgoSetting", true);
        setBooleanField(term371332, term371332.getClass(), "contestNowPlayingEnable", false);
        setIntField(term371332, term371332.getClass(), "contestNowPlayingId", -1);
        setIntField(term371332, term371332.getClass(), "contestNowPlayingValue", -1);
        setField(term371332, term371332.getClass(), "contestNowPlayingResultRank", enum846);
        setField(term371332, term371332.getClass(), "contestNowPlayingSpecifier", "");
        setField(term371332, term371332.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term371332, term371332.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term371332, term371332.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term371332, term371332.getClass(), "rivalPdId", -1);
        setField(term371329, term371329.getClass(), "pdId", term371332);
        setField(term371329, term371329.getClass(), "startMode", enum847);
        setIntField(term371947, term371947.getClass(), "year", 2014);
        setShortField(term371947, term371947.getClass(), "month", (short) 10);
        setShortField(term371947, term371947.getClass(), "day", (short) 7);
        setField(term371946, term371946.getClass(), "date", term371947);
        setByteField(term371951, term371951.getClass(), "hour", (byte) 12);
        setByteField(term371951, term371951.getClass(), "minute", (byte) 59);
        setByteField(term371951, term371951.getClass(), "second", (byte) 39);
        setIntField(term371951, term371951.getClass(), "nano", 603709306);
        setField(term371946, term371946.getClass(), "time", term371951);
        setField(term371329, term371329.getClass(), "startTime", term371946);
        setIntField(term371957, term371957.getClass(), "year", 2019);
        setShortField(term371957, term371957.getClass(), "month", (short) 8);
        setShortField(term371957, term371957.getClass(), "day", (short) 12);
        setField(term371956, term371956.getClass(), "date", term371957);
        setByteField(term371961, term371961.getClass(), "hour", (byte) 14);
        setByteField(term371961, term371961.getClass(), "minute", (byte) 1);
        setByteField(term371961, term371961.getClass(), "second", (byte) 51);
        setIntField(term371961, term371961.getClass(), "nano", 499021786);
        setField(term371956, term371956.getClass(), "time", term371961);
        setField(term371329, term371329.getClass(), "lastUpdateTime", term371956);
        setField(term371329, term371329.getClass(), "stageIndex", term371966);
        setField(term371329, term371329.getClass(), "stageResultIndex", term371968);
        setField(term371329, term371329.getClass(), "lastPvId", term371970);
        setField(term371329, term371329.getClass(), "levelNumber", term371972);
        setField(term371329, term371329.getClass(), "levelExp", term371974);
        setField(term371329, term371329.getClass(), "oldLevelNumber", term371976);
        setField(term371329, term371329.getClass(), "oldLevelExp", term371978);
        setField(term371329, term371329.getClass(), "vp", term371980);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.GameSession");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStartTime", argTypes, term371329, args);
    }

};


