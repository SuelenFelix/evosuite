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

public class GameSession_getAcceptId_5063355572 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term362973;

    public GameSession_getAcceptId_5063355572() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term363633 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term363632 = ((Class) term363633).getDeclaredField((String) "MISS");
        ((Field) term363632).setAccessible(true);
        Object enum824 = ((Field) term363632).get((Object) null);
        Class<? extends Object> term364010 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term364009 = ((Class) term364010).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term364009).setAccessible(true);
        Object enum825 = ((Field) term364009).get((Object) null);
        Class<? extends Object> term364293 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term364292 = ((Class) term364293).getDeclaredField((String) "NORMAL");
        ((Field) term364292).setAccessible(true);
        Object enum826 = ((Field) term364292).get((Object) null);
        Class<? extends Object> term364568 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term364567 = ((Class) term364568).getDeclaredField((String) "ORIGINAL");
        ((Field) term364567).setAccessible(true);
        Object enum827 = ((Field) term364567).get((Object) null);
        Class<? extends Object> term364834 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term364833 = ((Class) term364834).getDeclaredField((String) "NONE");
        ((Field) term364833).setAccessible(true);
        Object enum828 = ((Field) term364833).get((Object) null);
        Class<? extends Object> term365475 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.StartMode");
        Field term365474 = ((Class) term365475).getDeclaredField((String) "START");
        ((Field) term365474).setAccessible(true);
        Object enum829 = ((Field) term365474).get((Object) null);
        Integer term363610 = new Integer(-1685132342);
        Integer term363612 = new Integer(-1456670397);
        Integer term363614 = new Integer(1622346318);
        Integer term363616 = new Integer(1048535127);
        Integer term363618 = new Integer(-655067527);
        Integer term363620 = new Integer(-6029667);
        Integer term363622 = new Integer(-2068769794);
        Integer term363624 = new Integer(-117576464);
        term362973 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.GameSession"));
        Object term362976 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term363099 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term363100 = newInstance(Class.forName("java.time.LocalDate"));
        Object term363104 = newInstance(Class.forName("java.time.LocalTime"));
        Object term363590 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term363591 = newInstance(Class.forName("java.time.LocalDate"));
        Object term363595 = newInstance(Class.forName("java.time.LocalTime"));
        Object term363600 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term363601 = newInstance(Class.forName("java.time.LocalDate"));
        Object term363605 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term362973, term362973.getClass(), "id", -1145146470850585022L);
        setIntField(term362973, term362973.getClass(), "acceptId", -235874398);
        setLongField(term362976, term362976.getClass(), "id", 1993646237353405740L);
        setIntField(term362976, term362976.getClass(), "pdId", -978039004);
        setField(term362976, term362976.getClass(), "playerName", "xxx");
        setIntField(term362976, term362976.getClass(), "vocaloidPoints", 300);
        setIntField(term362976, term362976.getClass(), "level", 1);
        setIntField(term362976, term362976.getClass(), "levelExp", 1162356859);
        setField(term362976, term362976.getClass(), "levelTitle", "xxx");
        setIntField(term362976, term362976.getClass(), "plateId", -1);
        setIntField(term362976, term362976.getClass(), "plateEffectId", -1);
        setField(term362976, term362976.getClass(), "passwordStatus", enum824);
        setField(term362976, term362976.getClass(), "password", "**********");
        setBooleanField(term362976, term362976.getClass(), "preferPerPvModule", true);
        setBooleanField(term362976, term362976.getClass(), "preferCommonModule", false);
        setBooleanField(term362976, term362976.getClass(), "usePerPvSkin", true);
        setBooleanField(term362976, term362976.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term362976, term362976.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term362976, term362976.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term362976, term362976.getClass(), "usePerPvTouchSliderSe", false);
        setField(term362976, term362976.getClass(), "commonModule", "-999,-999,-999");
        setField(term362976, term362976.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term363100, term363100.getClass(), "year", 2026);
        setShortField(term363100, term363100.getClass(), "month", (short) 8);
        setShortField(term363100, term363100.getClass(), "day", (short) 12);
        setField(term363099, term363099.getClass(), "date", term363100);
        setByteField(term363104, term363104.getClass(), "hour", (byte) 2);
        setByteField(term363104, term363104.getClass(), "minute", (byte) 3);
        setByteField(term363104, term363104.getClass(), "second", (byte) 22);
        setIntField(term363104, term363104.getClass(), "nano", 328208000);
        setField(term363099, term363099.getClass(), "time", term363104);
        setField(term362976, term362976.getClass(), "commonModuleSetTime", term363099);
        setField(term362976, term362976.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term362976, term362976.getClass(), "commonSkin", -1);
        setIntField(term362976, term362976.getClass(), "headphoneVolume", 100);
        setBooleanField(term362976, term362976.getClass(), "buttonSeOn", true);
        setIntField(term362976, term362976.getClass(), "buttonSeVolume", 100);
        setIntField(term362976, term362976.getClass(), "sliderSeVolume", 100);
        setIntField(term362976, term362976.getClass(), "buttonSe", -1);
        setIntField(term362976, term362976.getClass(), "chainSlideSe", -1);
        setIntField(term362976, term362976.getClass(), "slideSe", -1);
        setIntField(term362976, term362976.getClass(), "sliderTouchSe", -1);
        setField(term362976, term362976.getClass(), "sortMode", enum825);
        setIntField(term362976, term362976.getClass(), "nextPvId", -1);
        setField(term362976, term362976.getClass(), "nextDifficulty", enum826);
        setField(term362976, term362976.getClass(), "nextEdition", enum827);
        setBooleanField(term362976, term362976.getClass(), "showInterimRanking", true);
        setBooleanField(term362976, term362976.getClass(), "showClearStatus", true);
        setBooleanField(term362976, term362976.getClass(), "showGreatBorder", true);
        setBooleanField(term362976, term362976.getClass(), "showExcellentBorder", true);
        setBooleanField(term362976, term362976.getClass(), "showRivalBorder", true);
        setBooleanField(term362976, term362976.getClass(), "showRgoSetting", true);
        setBooleanField(term362976, term362976.getClass(), "contestNowPlayingEnable", true);
        setIntField(term362976, term362976.getClass(), "contestNowPlayingId", -1);
        setIntField(term362976, term362976.getClass(), "contestNowPlayingValue", -1);
        setField(term362976, term362976.getClass(), "contestNowPlayingResultRank", enum828);
        setField(term362976, term362976.getClass(), "contestNowPlayingSpecifier", "");
        setField(term362976, term362976.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term362976, term362976.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term362976, term362976.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term362976, term362976.getClass(), "rivalPdId", -1);
        setField(term362973, term362973.getClass(), "pdId", term362976);
        setField(term362973, term362973.getClass(), "startMode", enum829);
        setIntField(term363591, term363591.getClass(), "year", 2015);
        setShortField(term363591, term363591.getClass(), "month", (short) 3);
        setShortField(term363591, term363591.getClass(), "day", (short) 15);
        setField(term363590, term363590.getClass(), "date", term363591);
        setByteField(term363595, term363595.getClass(), "hour", (byte) 8);
        setByteField(term363595, term363595.getClass(), "minute", (byte) 45);
        setByteField(term363595, term363595.getClass(), "second", (byte) 29);
        setIntField(term363595, term363595.getClass(), "nano", 781486470);
        setField(term363590, term363590.getClass(), "time", term363595);
        setField(term362973, term362973.getClass(), "startTime", term363590);
        setIntField(term363601, term363601.getClass(), "year", 2021);
        setShortField(term363601, term363601.getClass(), "month", (short) 4);
        setShortField(term363601, term363601.getClass(), "day", (short) 26);
        setField(term363600, term363600.getClass(), "date", term363601);
        setByteField(term363605, term363605.getClass(), "hour", (byte) 11);
        setByteField(term363605, term363605.getClass(), "minute", (byte) 34);
        setByteField(term363605, term363605.getClass(), "second", (byte) 15);
        setIntField(term363605, term363605.getClass(), "nano", 638206023);
        setField(term363600, term363600.getClass(), "time", term363605);
        setField(term362973, term362973.getClass(), "lastUpdateTime", term363600);
        setField(term362973, term362973.getClass(), "stageIndex", term363610);
        setField(term362973, term362973.getClass(), "stageResultIndex", term363612);
        setField(term362973, term362973.getClass(), "lastPvId", term363614);
        setField(term362973, term362973.getClass(), "levelNumber", term363616);
        setField(term362973, term362973.getClass(), "levelExp", term363618);
        setField(term362973, term362973.getClass(), "oldLevelNumber", term363620);
        setField(term362973, term362973.getClass(), "oldLevelExp", term363622);
        setField(term362973, term362973.getClass(), "vp", term363624);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.GameSession");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAcceptId", argTypes, term362973, args);
    }

};


