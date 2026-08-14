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

public class PlayerProfile_setContestNowPlayingValue_13162108394 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term912480;
     Object term913085;

    public PlayerProfile_setContestNowPlayingValue_13162108394() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term913094 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term913093 = ((Class) term913094).getDeclaredField((String) "MISS");
        ((Field) term913093).setAccessible(true);
        Object enum1959 = ((Field) term913093).get((Object) null);
        Class<? extends Object> term913471 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term913470 = ((Class) term913471).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term913470).setAccessible(true);
        Object enum1960 = ((Field) term913470).get((Object) null);
        Class<? extends Object> term913754 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term913753 = ((Class) term913754).getDeclaredField((String) "NORMAL");
        ((Field) term913753).setAccessible(true);
        Object enum1961 = ((Field) term913753).get((Object) null);
        Class<? extends Object> term914029 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term914028 = ((Class) term914029).getDeclaredField((String) "ORIGINAL");
        ((Field) term914028).setAccessible(true);
        Object enum1962 = ((Field) term914028).get((Object) null);
        Class<? extends Object> term914295 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term914294 = ((Class) term914295).getDeclaredField((String) "NONE");
        ((Field) term914294).setAccessible(true);
        Object enum1963 = ((Field) term914294).get((Object) null);
        term912480 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term912603 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term912604 = newInstance(Class.forName("java.time.LocalDate"));
        Object term912608 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term912480, term912480.getClass(), "id", 2166921473521388808L);
        setIntField(term912480, term912480.getClass(), "pdId", -1320712215);
        setField(term912480, term912480.getClass(), "playerName", "xxx");
        setIntField(term912480, term912480.getClass(), "vocaloidPoints", 300);
        setIntField(term912480, term912480.getClass(), "level", 1);
        setIntField(term912480, term912480.getClass(), "levelExp", -619414497);
        setField(term912480, term912480.getClass(), "levelTitle", "xxx");
        setIntField(term912480, term912480.getClass(), "plateId", -1);
        setIntField(term912480, term912480.getClass(), "plateEffectId", -1);
        setField(term912480, term912480.getClass(), "passwordStatus", enum1959);
        setField(term912480, term912480.getClass(), "password", "**********");
        setBooleanField(term912480, term912480.getClass(), "preferPerPvModule", true);
        setBooleanField(term912480, term912480.getClass(), "preferCommonModule", false);
        setBooleanField(term912480, term912480.getClass(), "usePerPvSkin", true);
        setBooleanField(term912480, term912480.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term912480, term912480.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term912480, term912480.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term912480, term912480.getClass(), "usePerPvTouchSliderSe", false);
        setField(term912480, term912480.getClass(), "commonModule", "-999,-999,-999");
        setField(term912480, term912480.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term912604, term912604.getClass(), "year", 2026);
        setShortField(term912604, term912604.getClass(), "month", (short) 8);
        setShortField(term912604, term912604.getClass(), "day", (short) 12);
        setField(term912603, term912603.getClass(), "date", term912604);
        setByteField(term912608, term912608.getClass(), "hour", (byte) 2);
        setByteField(term912608, term912608.getClass(), "minute", (byte) 4);
        setByteField(term912608, term912608.getClass(), "second", (byte) 47);
        setIntField(term912608, term912608.getClass(), "nano", 17650000);
        setField(term912603, term912603.getClass(), "time", term912608);
        setField(term912480, term912480.getClass(), "commonModuleSetTime", term912603);
        setField(term912480, term912480.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term912480, term912480.getClass(), "commonSkin", -1);
        setIntField(term912480, term912480.getClass(), "headphoneVolume", 100);
        setBooleanField(term912480, term912480.getClass(), "buttonSeOn", true);
        setIntField(term912480, term912480.getClass(), "buttonSeVolume", 100);
        setIntField(term912480, term912480.getClass(), "sliderSeVolume", 100);
        setIntField(term912480, term912480.getClass(), "buttonSe", -1);
        setIntField(term912480, term912480.getClass(), "chainSlideSe", -1);
        setIntField(term912480, term912480.getClass(), "slideSe", -1);
        setIntField(term912480, term912480.getClass(), "sliderTouchSe", -1);
        setField(term912480, term912480.getClass(), "sortMode", enum1960);
        setIntField(term912480, term912480.getClass(), "nextPvId", -1);
        setField(term912480, term912480.getClass(), "nextDifficulty", enum1961);
        setField(term912480, term912480.getClass(), "nextEdition", enum1962);
        setBooleanField(term912480, term912480.getClass(), "showInterimRanking", true);
        setBooleanField(term912480, term912480.getClass(), "showClearStatus", true);
        setBooleanField(term912480, term912480.getClass(), "showGreatBorder", true);
        setBooleanField(term912480, term912480.getClass(), "showExcellentBorder", true);
        setBooleanField(term912480, term912480.getClass(), "showRivalBorder", true);
        setBooleanField(term912480, term912480.getClass(), "showRgoSetting", true);
        setBooleanField(term912480, term912480.getClass(), "contestNowPlayingEnable", false);
        setIntField(term912480, term912480.getClass(), "contestNowPlayingId", -1);
        setIntField(term912480, term912480.getClass(), "contestNowPlayingValue", -1);
        setField(term912480, term912480.getClass(), "contestNowPlayingResultRank", enum1963);
        setField(term912480, term912480.getClass(), "contestNowPlayingSpecifier", "");
        setField(term912480, term912480.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term912480, term912480.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term912480, term912480.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term912480, term912480.getClass(), "rivalPdId", -1);
        term913085 = new Integer(1414603242);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term913085;
        callMethod(klass, "setContestNowPlayingValue", argTypes, term912480, args);
    }

};


