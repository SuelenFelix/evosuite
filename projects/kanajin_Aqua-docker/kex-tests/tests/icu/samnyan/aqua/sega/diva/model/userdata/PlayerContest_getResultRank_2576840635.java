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

public class PlayerContest_getResultRank_2576840635 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12572;

    public PlayerContest_getResultRank_2576840635() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term13200 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term13199 = ((Class) term13200).getDeclaredField((String) "MISS");
        ((Field) term13199).setAccessible(true);
        Object enum25 = ((Field) term13199).get((Object) null);
        Class<? extends Object> term13577 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term13576 = ((Class) term13577).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term13576).setAccessible(true);
        Object enum26 = ((Field) term13576).get((Object) null);
        Class<? extends Object> term13860 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term13859 = ((Class) term13860).getDeclaredField((String) "NORMAL");
        ((Field) term13859).setAccessible(true);
        Object enum27 = ((Field) term13859).get((Object) null);
        Class<? extends Object> term14135 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term14134 = ((Class) term14135).getDeclaredField((String) "ORIGINAL");
        ((Field) term14134).setAccessible(true);
        Object enum28 = ((Field) term14134).get((Object) null);
        Class<? extends Object> term14401 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term14400 = ((Class) term14401).getDeclaredField((String) "NONE");
        ((Field) term14400).setAccessible(true);
        Object enum29 = ((Field) term14400).get((Object) null);
        term12572 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerContest"));
        Object term12574 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term12697 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12698 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12702 = newInstance(Class.forName("java.time.LocalTime"));
        Object term13183 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term13184 = newInstance(Class.forName("java.time.LocalDate"));
        Object term13188 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term12572, term12572.getClass(), "id", 6967924379644551255L);
        setLongField(term12574, term12574.getClass(), "id", -2813493605142626659L);
        setIntField(term12574, term12574.getClass(), "pdId", 1048535127);
        setField(term12574, term12574.getClass(), "playerName", "xxx");
        setIntField(term12574, term12574.getClass(), "vocaloidPoints", 300);
        setIntField(term12574, term12574.getClass(), "level", 1);
        setIntField(term12574, term12574.getClass(), "levelExp", -655067527);
        setField(term12574, term12574.getClass(), "levelTitle", "xxx");
        setIntField(term12574, term12574.getClass(), "plateId", -1);
        setIntField(term12574, term12574.getClass(), "plateEffectId", -1);
        setField(term12574, term12574.getClass(), "passwordStatus", enum25);
        setField(term12574, term12574.getClass(), "password", "**********");
        setBooleanField(term12574, term12574.getClass(), "preferPerPvModule", true);
        setBooleanField(term12574, term12574.getClass(), "preferCommonModule", true);
        setBooleanField(term12574, term12574.getClass(), "usePerPvSkin", true);
        setBooleanField(term12574, term12574.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term12574, term12574.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term12574, term12574.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term12574, term12574.getClass(), "usePerPvTouchSliderSe", false);
        setField(term12574, term12574.getClass(), "commonModule", "-999,-999,-999");
        setField(term12574, term12574.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term12698, term12698.getClass(), "year", 2026);
        setShortField(term12698, term12698.getClass(), "month", (short) 8);
        setShortField(term12698, term12698.getClass(), "day", (short) 12);
        setField(term12697, term12697.getClass(), "date", term12698);
        setByteField(term12702, term12702.getClass(), "hour", (byte) 2);
        setByteField(term12702, term12702.getClass(), "minute", (byte) 2);
        setByteField(term12702, term12702.getClass(), "second", (byte) 28);
        setIntField(term12702, term12702.getClass(), "nano", 821831000);
        setField(term12697, term12697.getClass(), "time", term12702);
        setField(term12574, term12574.getClass(), "commonModuleSetTime", term12697);
        setField(term12574, term12574.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term12574, term12574.getClass(), "commonSkin", -1);
        setIntField(term12574, term12574.getClass(), "headphoneVolume", 100);
        setBooleanField(term12574, term12574.getClass(), "buttonSeOn", true);
        setIntField(term12574, term12574.getClass(), "buttonSeVolume", 100);
        setIntField(term12574, term12574.getClass(), "sliderSeVolume", 100);
        setIntField(term12574, term12574.getClass(), "buttonSe", -1);
        setIntField(term12574, term12574.getClass(), "chainSlideSe", -1);
        setIntField(term12574, term12574.getClass(), "slideSe", -1);
        setIntField(term12574, term12574.getClass(), "sliderTouchSe", -1);
        setField(term12574, term12574.getClass(), "sortMode", enum26);
        setIntField(term12574, term12574.getClass(), "nextPvId", -1);
        setField(term12574, term12574.getClass(), "nextDifficulty", enum27);
        setField(term12574, term12574.getClass(), "nextEdition", enum28);
        setBooleanField(term12574, term12574.getClass(), "showInterimRanking", true);
        setBooleanField(term12574, term12574.getClass(), "showClearStatus", true);
        setBooleanField(term12574, term12574.getClass(), "showGreatBorder", true);
        setBooleanField(term12574, term12574.getClass(), "showExcellentBorder", true);
        setBooleanField(term12574, term12574.getClass(), "showRivalBorder", true);
        setBooleanField(term12574, term12574.getClass(), "showRgoSetting", true);
        setBooleanField(term12574, term12574.getClass(), "contestNowPlayingEnable", false);
        setIntField(term12574, term12574.getClass(), "contestNowPlayingId", -1);
        setIntField(term12574, term12574.getClass(), "contestNowPlayingValue", -1);
        setField(term12574, term12574.getClass(), "contestNowPlayingResultRank", enum29);
        setField(term12574, term12574.getClass(), "contestNowPlayingSpecifier", "");
        setField(term12574, term12574.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term12574, term12574.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term12574, term12574.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term12574, term12574.getClass(), "rivalPdId", -1);
        setField(term12572, term12572.getClass(), "pdId", term12574);
        setIntField(term12572, term12572.getClass(), "contestId", -6029667);
        setIntField(term12572, term12572.getClass(), "startCount", -2068769794);
        setField(term12572, term12572.getClass(), "resultRank", enum29);
        setIntField(term12572, term12572.getClass(), "bestValue", -1);
        setIntField(term12572, term12572.getClass(), "flag", -1);
        setIntField(term13184, term13184.getClass(), "year", 2026);
        setShortField(term13184, term13184.getClass(), "month", (short) 8);
        setShortField(term13184, term13184.getClass(), "day", (short) 12);
        setField(term13183, term13183.getClass(), "date", term13184);
        setByteField(term13188, term13188.getClass(), "hour", (byte) 2);
        setByteField(term13188, term13188.getClass(), "minute", (byte) 2);
        setByteField(term13188, term13188.getClass(), "second", (byte) 28);
        setIntField(term13188, term13188.getClass(), "nano", 821671000);
        setField(term13183, term13183.getClass(), "time", term13188);
        setField(term12572, term12572.getClass(), "lastUpdateTime", term13183);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerContest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getResultRank", argTypes, term12572, args);
    }

};


