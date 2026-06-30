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

public class PlayerContest_equals_182332763717 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43247;
     Object term43868;

    public PlayerContest_equals_182332763717() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term43876 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term43875 = ((Class) term43876).getDeclaredField((String) "MISS");
        ((Field) term43875).setAccessible(true);
        Object enum85 = ((Field) term43875).get((Object) null);
        Class<? extends Object> term44253 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term44252 = ((Class) term44253).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term44252).setAccessible(true);
        Object enum86 = ((Field) term44252).get((Object) null);
        Class<? extends Object> term44536 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term44535 = ((Class) term44536).getDeclaredField((String) "NORMAL");
        ((Field) term44535).setAccessible(true);
        Object enum87 = ((Field) term44535).get((Object) null);
        Class<? extends Object> term44811 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term44810 = ((Class) term44811).getDeclaredField((String) "ORIGINAL");
        ((Field) term44810).setAccessible(true);
        Object enum88 = ((Field) term44810).get((Object) null);
        Class<? extends Object> term45077 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term45076 = ((Class) term45077).getDeclaredField((String) "NONE");
        ((Field) term45076).setAccessible(true);
        Object enum89 = ((Field) term45076).get((Object) null);
        term43247 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerContest"));
        Object term43249 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term43372 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term43373 = newInstance(Class.forName("java.time.LocalDate"));
        Object term43377 = newInstance(Class.forName("java.time.LocalTime"));
        Object term43858 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term43859 = newInstance(Class.forName("java.time.LocalDate"));
        Object term43863 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term43247, term43247.getClass(), "id", 1233889271256172047L);
        setLongField(term43249, term43249.getClass(), "id", 6617340557564669657L);
        setIntField(term43249, term43249.getClass(), "pdId", 1265463001);
        setField(term43249, term43249.getClass(), "playerName", "xxx");
        setIntField(term43249, term43249.getClass(), "vocaloidPoints", 300);
        setIntField(term43249, term43249.getClass(), "level", 1);
        setIntField(term43249, term43249.getClass(), "levelExp", 335112684);
        setField(term43249, term43249.getClass(), "levelTitle", "xxx");
        setIntField(term43249, term43249.getClass(), "plateId", -1);
        setIntField(term43249, term43249.getClass(), "plateEffectId", -1);
        setField(term43249, term43249.getClass(), "passwordStatus", enum85);
        setField(term43249, term43249.getClass(), "password", "**********");
        setBooleanField(term43249, term43249.getClass(), "preferPerPvModule", true);
        setBooleanField(term43249, term43249.getClass(), "preferCommonModule", true);
        setBooleanField(term43249, term43249.getClass(), "usePerPvSkin", false);
        setBooleanField(term43249, term43249.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term43249, term43249.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term43249, term43249.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term43249, term43249.getClass(), "usePerPvTouchSliderSe", false);
        setField(term43249, term43249.getClass(), "commonModule", "-999,-999,-999");
        setField(term43249, term43249.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term43373, term43373.getClass(), "year", 2026);
        setShortField(term43373, term43373.getClass(), "month", (short) 6);
        setShortField(term43373, term43373.getClass(), "day", (short) 29);
        setField(term43372, term43372.getClass(), "date", term43373);
        setByteField(term43377, term43377.getClass(), "hour", (byte) 4);
        setByteField(term43377, term43377.getClass(), "minute", (byte) 27);
        setByteField(term43377, term43377.getClass(), "second", (byte) 16);
        setIntField(term43377, term43377.getClass(), "nano", 116124000);
        setField(term43372, term43372.getClass(), "time", term43377);
        setField(term43249, term43249.getClass(), "commonModuleSetTime", term43372);
        setField(term43249, term43249.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term43249, term43249.getClass(), "commonSkin", -1);
        setIntField(term43249, term43249.getClass(), "headphoneVolume", 100);
        setBooleanField(term43249, term43249.getClass(), "buttonSeOn", true);
        setIntField(term43249, term43249.getClass(), "buttonSeVolume", 100);
        setIntField(term43249, term43249.getClass(), "sliderSeVolume", 100);
        setIntField(term43249, term43249.getClass(), "buttonSe", -1);
        setIntField(term43249, term43249.getClass(), "chainSlideSe", -1);
        setIntField(term43249, term43249.getClass(), "slideSe", -1);
        setIntField(term43249, term43249.getClass(), "sliderTouchSe", -1);
        setField(term43249, term43249.getClass(), "sortMode", enum86);
        setIntField(term43249, term43249.getClass(), "nextPvId", -1);
        setField(term43249, term43249.getClass(), "nextDifficulty", enum87);
        setField(term43249, term43249.getClass(), "nextEdition", enum88);
        setBooleanField(term43249, term43249.getClass(), "showInterimRanking", true);
        setBooleanField(term43249, term43249.getClass(), "showClearStatus", true);
        setBooleanField(term43249, term43249.getClass(), "showGreatBorder", true);
        setBooleanField(term43249, term43249.getClass(), "showExcellentBorder", true);
        setBooleanField(term43249, term43249.getClass(), "showRivalBorder", true);
        setBooleanField(term43249, term43249.getClass(), "showRgoSetting", true);
        setBooleanField(term43249, term43249.getClass(), "contestNowPlayingEnable", false);
        setIntField(term43249, term43249.getClass(), "contestNowPlayingId", -1);
        setIntField(term43249, term43249.getClass(), "contestNowPlayingValue", -1);
        setField(term43249, term43249.getClass(), "contestNowPlayingResultRank", enum89);
        setField(term43249, term43249.getClass(), "contestNowPlayingSpecifier", "");
        setField(term43249, term43249.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term43249, term43249.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term43249, term43249.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term43249, term43249.getClass(), "rivalPdId", -1);
        setField(term43247, term43247.getClass(), "pdId", term43249);
        setIntField(term43247, term43247.getClass(), "contestId", 1551099402);
        setIntField(term43247, term43247.getClass(), "startCount", -2027534003);
        setField(term43247, term43247.getClass(), "resultRank", enum89);
        setIntField(term43247, term43247.getClass(), "bestValue", -1);
        setIntField(term43247, term43247.getClass(), "flag", -1);
        setIntField(term43859, term43859.getClass(), "year", 2026);
        setShortField(term43859, term43859.getClass(), "month", (short) 6);
        setShortField(term43859, term43859.getClass(), "day", (short) 29);
        setField(term43858, term43858.getClass(), "date", term43859);
        setByteField(term43863, term43863.getClass(), "hour", (byte) 4);
        setByteField(term43863, term43863.getClass(), "minute", (byte) 27);
        setByteField(term43863, term43863.getClass(), "second", (byte) 16);
        setIntField(term43863, term43863.getClass(), "nano", 115958000);
        setField(term43858, term43858.getClass(), "time", term43863);
        setField(term43247, term43247.getClass(), "lastUpdateTime", term43858);
        term43868 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerContest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term43868;
        callMethod(klass, "equals", argTypes, term43247, args);
    }

};


