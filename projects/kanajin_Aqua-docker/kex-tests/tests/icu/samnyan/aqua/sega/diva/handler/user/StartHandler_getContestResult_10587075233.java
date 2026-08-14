package icu.samnyan.aqua.sega.diva.handler.user;

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
import static icu.samnyan.aqua.sega.diva.handler.user.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class StartHandler_getContestResult_10587075233 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6413;

    public StartHandler_getContestResult_10587075233() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term7025 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term7024 = ((Class) term7025).getDeclaredField((String) "MISS");
        ((Field) term7024).setAccessible(true);
        Object enum12 = ((Field) term7024).get((Object) null);
        Class<? extends Object> term7402 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term7401 = ((Class) term7402).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term7401).setAccessible(true);
        Object enum13 = ((Field) term7401).get((Object) null);
        Class<? extends Object> term7685 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term7684 = ((Class) term7685).getDeclaredField((String) "NORMAL");
        ((Field) term7684).setAccessible(true);
        Object enum14 = ((Field) term7684).get((Object) null);
        Class<? extends Object> term7960 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term7959 = ((Class) term7960).getDeclaredField((String) "ORIGINAL");
        ((Field) term7959).setAccessible(true);
        Object enum15 = ((Field) term7959).get((Object) null);
        Class<? extends Object> term8226 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term8225 = ((Class) term8226).getDeclaredField((String) "NONE");
        ((Field) term8225).setAccessible(true);
        Object enum16 = ((Field) term8225).get((Object) null);
        term6413 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term6536 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6537 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6541 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term6413, term6413.getClass(), "id", -8400487765614892086L);
        setIntField(term6413, term6413.getClass(), "pdId", -1955890973);
        setField(term6413, term6413.getClass(), "playerName", "xxx");
        setIntField(term6413, term6413.getClass(), "vocaloidPoints", 300);
        setIntField(term6413, term6413.getClass(), "level", 1);
        setIntField(term6413, term6413.getClass(), "levelExp", -2038273078);
        setField(term6413, term6413.getClass(), "levelTitle", "xxx");
        setIntField(term6413, term6413.getClass(), "plateId", -1);
        setIntField(term6413, term6413.getClass(), "plateEffectId", -1);
        setField(term6413, term6413.getClass(), "passwordStatus", enum12);
        setField(term6413, term6413.getClass(), "password", "**********");
        setBooleanField(term6413, term6413.getClass(), "preferPerPvModule", true);
        setBooleanField(term6413, term6413.getClass(), "preferCommonModule", false);
        setBooleanField(term6413, term6413.getClass(), "usePerPvSkin", false);
        setBooleanField(term6413, term6413.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term6413, term6413.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term6413, term6413.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term6413, term6413.getClass(), "usePerPvTouchSliderSe", false);
        setField(term6413, term6413.getClass(), "commonModule", "-999,-999,-999");
        setField(term6413, term6413.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term6537, term6537.getClass(), "year", 2026);
        setShortField(term6537, term6537.getClass(), "month", (short) 8);
        setShortField(term6537, term6537.getClass(), "day", (short) 12);
        setField(term6536, term6536.getClass(), "date", term6537);
        setByteField(term6541, term6541.getClass(), "hour", (byte) 1);
        setByteField(term6541, term6541.getClass(), "minute", (byte) 6);
        setByteField(term6541, term6541.getClass(), "second", (byte) 48);
        setIntField(term6541, term6541.getClass(), "nano", 380269000);
        setField(term6536, term6536.getClass(), "time", term6541);
        setField(term6413, term6413.getClass(), "commonModuleSetTime", term6536);
        setField(term6413, term6413.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term6413, term6413.getClass(), "commonSkin", -1);
        setIntField(term6413, term6413.getClass(), "headphoneVolume", 100);
        setBooleanField(term6413, term6413.getClass(), "buttonSeOn", true);
        setIntField(term6413, term6413.getClass(), "buttonSeVolume", 100);
        setIntField(term6413, term6413.getClass(), "sliderSeVolume", 100);
        setIntField(term6413, term6413.getClass(), "buttonSe", -1);
        setIntField(term6413, term6413.getClass(), "chainSlideSe", -1);
        setIntField(term6413, term6413.getClass(), "slideSe", -1);
        setIntField(term6413, term6413.getClass(), "sliderTouchSe", -1);
        setField(term6413, term6413.getClass(), "sortMode", enum13);
        setIntField(term6413, term6413.getClass(), "nextPvId", -1);
        setField(term6413, term6413.getClass(), "nextDifficulty", enum14);
        setField(term6413, term6413.getClass(), "nextEdition", enum15);
        setBooleanField(term6413, term6413.getClass(), "showInterimRanking", true);
        setBooleanField(term6413, term6413.getClass(), "showClearStatus", true);
        setBooleanField(term6413, term6413.getClass(), "showGreatBorder", true);
        setBooleanField(term6413, term6413.getClass(), "showExcellentBorder", true);
        setBooleanField(term6413, term6413.getClass(), "showRivalBorder", true);
        setBooleanField(term6413, term6413.getClass(), "showRgoSetting", true);
        setBooleanField(term6413, term6413.getClass(), "contestNowPlayingEnable", true);
        setIntField(term6413, term6413.getClass(), "contestNowPlayingId", -1);
        setIntField(term6413, term6413.getClass(), "contestNowPlayingValue", -1);
        setField(term6413, term6413.getClass(), "contestNowPlayingResultRank", enum16);
        setField(term6413, term6413.getClass(), "contestNowPlayingSpecifier", "");
        setField(term6413, term6413.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term6413, term6413.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term6413, term6413.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term6413, term6413.getClass(), "rivalPdId", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.handler.user.StartHandler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Object[] args = new Object[1];
        args[0] = term6413;
        callMethod(klass, "getContestResult", argTypes, null, args);
    }

};


