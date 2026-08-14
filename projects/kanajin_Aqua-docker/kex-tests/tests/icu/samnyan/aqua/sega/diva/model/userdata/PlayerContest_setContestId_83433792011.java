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

public class PlayerContest_setContestId_83433792011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28415;
     Object term29036;

    public PlayerContest_setContestId_83433792011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term29045 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term29044 = ((Class) term29045).getDeclaredField((String) "MISS");
        ((Field) term29044).setAccessible(true);
        Object enum55 = ((Field) term29044).get((Object) null);
        Class<? extends Object> term29422 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term29421 = ((Class) term29422).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term29421).setAccessible(true);
        Object enum56 = ((Field) term29421).get((Object) null);
        Class<? extends Object> term29705 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term29704 = ((Class) term29705).getDeclaredField((String) "NORMAL");
        ((Field) term29704).setAccessible(true);
        Object enum57 = ((Field) term29704).get((Object) null);
        Class<? extends Object> term29980 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term29979 = ((Class) term29980).getDeclaredField((String) "ORIGINAL");
        ((Field) term29979).setAccessible(true);
        Object enum58 = ((Field) term29979).get((Object) null);
        Class<? extends Object> term30246 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term30245 = ((Class) term30246).getDeclaredField((String) "NONE");
        ((Field) term30245).setAccessible(true);
        Object enum59 = ((Field) term30245).get((Object) null);
        term28415 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerContest"));
        Object term28417 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term28540 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28541 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28545 = newInstance(Class.forName("java.time.LocalTime"));
        Object term29026 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29027 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29031 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term28415, term28415.getClass(), "id", -4365849114644724155L);
        setLongField(term28417, term28417.getClass(), "id", 2486810210675247493L);
        setIntField(term28417, term28417.getClass(), "pdId", -817164822);
        setField(term28417, term28417.getClass(), "playerName", "xxx");
        setIntField(term28417, term28417.getClass(), "vocaloidPoints", 300);
        setIntField(term28417, term28417.getClass(), "level", 1);
        setIntField(term28417, term28417.getClass(), "levelExp", -1016503459);
        setField(term28417, term28417.getClass(), "levelTitle", "xxx");
        setIntField(term28417, term28417.getClass(), "plateId", -1);
        setIntField(term28417, term28417.getClass(), "plateEffectId", -1);
        setField(term28417, term28417.getClass(), "passwordStatus", enum55);
        setField(term28417, term28417.getClass(), "password", "**********");
        setBooleanField(term28417, term28417.getClass(), "preferPerPvModule", true);
        setBooleanField(term28417, term28417.getClass(), "preferCommonModule", true);
        setBooleanField(term28417, term28417.getClass(), "usePerPvSkin", false);
        setBooleanField(term28417, term28417.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term28417, term28417.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term28417, term28417.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term28417, term28417.getClass(), "usePerPvTouchSliderSe", true);
        setField(term28417, term28417.getClass(), "commonModule", "-999,-999,-999");
        setField(term28417, term28417.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term28541, term28541.getClass(), "year", 2026);
        setShortField(term28541, term28541.getClass(), "month", (short) 8);
        setShortField(term28541, term28541.getClass(), "day", (short) 12);
        setField(term28540, term28540.getClass(), "date", term28541);
        setByteField(term28545, term28545.getClass(), "hour", (byte) 2);
        setByteField(term28545, term28545.getClass(), "minute", (byte) 2);
        setByteField(term28545, term28545.getClass(), "second", (byte) 30);
        setIntField(term28545, term28545.getClass(), "nano", 815819000);
        setField(term28540, term28540.getClass(), "time", term28545);
        setField(term28417, term28417.getClass(), "commonModuleSetTime", term28540);
        setField(term28417, term28417.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term28417, term28417.getClass(), "commonSkin", -1);
        setIntField(term28417, term28417.getClass(), "headphoneVolume", 100);
        setBooleanField(term28417, term28417.getClass(), "buttonSeOn", true);
        setIntField(term28417, term28417.getClass(), "buttonSeVolume", 100);
        setIntField(term28417, term28417.getClass(), "sliderSeVolume", 100);
        setIntField(term28417, term28417.getClass(), "buttonSe", -1);
        setIntField(term28417, term28417.getClass(), "chainSlideSe", -1);
        setIntField(term28417, term28417.getClass(), "slideSe", -1);
        setIntField(term28417, term28417.getClass(), "sliderTouchSe", -1);
        setField(term28417, term28417.getClass(), "sortMode", enum56);
        setIntField(term28417, term28417.getClass(), "nextPvId", -1);
        setField(term28417, term28417.getClass(), "nextDifficulty", enum57);
        setField(term28417, term28417.getClass(), "nextEdition", enum58);
        setBooleanField(term28417, term28417.getClass(), "showInterimRanking", true);
        setBooleanField(term28417, term28417.getClass(), "showClearStatus", true);
        setBooleanField(term28417, term28417.getClass(), "showGreatBorder", true);
        setBooleanField(term28417, term28417.getClass(), "showExcellentBorder", true);
        setBooleanField(term28417, term28417.getClass(), "showRivalBorder", true);
        setBooleanField(term28417, term28417.getClass(), "showRgoSetting", true);
        setBooleanField(term28417, term28417.getClass(), "contestNowPlayingEnable", true);
        setIntField(term28417, term28417.getClass(), "contestNowPlayingId", -1);
        setIntField(term28417, term28417.getClass(), "contestNowPlayingValue", -1);
        setField(term28417, term28417.getClass(), "contestNowPlayingResultRank", enum59);
        setField(term28417, term28417.getClass(), "contestNowPlayingSpecifier", "");
        setField(term28417, term28417.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term28417, term28417.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term28417, term28417.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term28417, term28417.getClass(), "rivalPdId", -1);
        setField(term28415, term28415.getClass(), "pdId", term28417);
        setIntField(term28415, term28415.getClass(), "contestId", -1968847291);
        setIntField(term28415, term28415.getClass(), "startCount", 579005622);
        setField(term28415, term28415.getClass(), "resultRank", enum59);
        setIntField(term28415, term28415.getClass(), "bestValue", -1);
        setIntField(term28415, term28415.getClass(), "flag", -1);
        setIntField(term29027, term29027.getClass(), "year", 2026);
        setShortField(term29027, term29027.getClass(), "month", (short) 8);
        setShortField(term29027, term29027.getClass(), "day", (short) 12);
        setField(term29026, term29026.getClass(), "date", term29027);
        setByteField(term29031, term29031.getClass(), "hour", (byte) 2);
        setByteField(term29031, term29031.getClass(), "minute", (byte) 2);
        setByteField(term29031, term29031.getClass(), "second", (byte) 30);
        setIntField(term29031, term29031.getClass(), "nano", 815645000);
        setField(term29026, term29026.getClass(), "time", term29031);
        setField(term28415, term28415.getClass(), "lastUpdateTime", term29026);
        term29036 = new Integer(-14890619);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerContest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term29036;
        callMethod(klass, "setContestId", argTypes, term28415, args);
    }

};


