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

public class GameSession_getLastPvId_13142522539 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term382469;

    public GameSession_getLastPvId_13142522539() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term383133 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term383132 = ((Class) term383133).getDeclaredField((String) "MISS");
        ((Field) term383132).setAccessible(true);
        Object enum866 = ((Field) term383132).get((Object) null);
        Class<? extends Object> term383510 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term383509 = ((Class) term383510).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term383509).setAccessible(true);
        Object enum867 = ((Field) term383509).get((Object) null);
        Class<? extends Object> term383793 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term383792 = ((Class) term383793).getDeclaredField((String) "NORMAL");
        ((Field) term383792).setAccessible(true);
        Object enum868 = ((Field) term383792).get((Object) null);
        Class<? extends Object> term384068 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term384067 = ((Class) term384068).getDeclaredField((String) "ORIGINAL");
        ((Field) term384067).setAccessible(true);
        Object enum869 = ((Field) term384067).get((Object) null);
        Class<? extends Object> term384334 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term384333 = ((Class) term384334).getDeclaredField((String) "NONE");
        ((Field) term384333).setAccessible(true);
        Object enum870 = ((Field) term384333).get((Object) null);
        Class<? extends Object> term384975 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.StartMode");
        Field term384974 = ((Class) term384975).getDeclaredField((String) "PRE_START");
        ((Field) term384974).setAccessible(true);
        Object enum871 = ((Field) term384974).get((Object) null);
        Integer term383110 = new Integer(1540719661);
        Integer term383112 = new Integer(1265463001);
        Integer term383114 = new Integer(335112684);
        Integer term383116 = new Integer(1551099402);
        Integer term383118 = new Integer(-2027534003);
        Integer term383120 = new Integer(1063420942);
        Integer term383122 = new Integer(1375330971);
        Integer term383124 = new Integer(-478195677);
        term382469 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.GameSession"));
        Object term382472 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term382595 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term382596 = newInstance(Class.forName("java.time.LocalDate"));
        Object term382600 = newInstance(Class.forName("java.time.LocalTime"));
        Object term383090 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term383091 = newInstance(Class.forName("java.time.LocalDate"));
        Object term383095 = newInstance(Class.forName("java.time.LocalTime"));
        Object term383100 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term383101 = newInstance(Class.forName("java.time.LocalDate"));
        Object term383105 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term382469, term382469.getClass(), "id", -7904053112604879960L);
        setIntField(term382469, term382469.getClass(), "acceptId", -679973960);
        setLongField(term382472, term382472.getClass(), "id", -6602460430714339690L);
        setIntField(term382472, term382472.getClass(), "pdId", -85442762);
        setField(term382472, term382472.getClass(), "playerName", "xxx");
        setIntField(term382472, term382472.getClass(), "vocaloidPoints", 300);
        setIntField(term382472, term382472.getClass(), "level", 1);
        setIntField(term382472, term382472.getClass(), "levelExp", 295245507);
        setField(term382472, term382472.getClass(), "levelTitle", "xxx");
        setIntField(term382472, term382472.getClass(), "plateId", -1);
        setIntField(term382472, term382472.getClass(), "plateEffectId", -1);
        setField(term382472, term382472.getClass(), "passwordStatus", enum866);
        setField(term382472, term382472.getClass(), "password", "**********");
        setBooleanField(term382472, term382472.getClass(), "preferPerPvModule", true);
        setBooleanField(term382472, term382472.getClass(), "preferCommonModule", true);
        setBooleanField(term382472, term382472.getClass(), "usePerPvSkin", false);
        setBooleanField(term382472, term382472.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term382472, term382472.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term382472, term382472.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term382472, term382472.getClass(), "usePerPvTouchSliderSe", true);
        setField(term382472, term382472.getClass(), "commonModule", "-999,-999,-999");
        setField(term382472, term382472.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term382596, term382596.getClass(), "year", 2026);
        setShortField(term382596, term382596.getClass(), "month", (short) 6);
        setShortField(term382596, term382596.getClass(), "day", (short) 29);
        setField(term382595, term382595.getClass(), "date", term382596);
        setByteField(term382600, term382600.getClass(), "hour", (byte) 4);
        setByteField(term382600, term382600.getClass(), "minute", (byte) 28);
        setByteField(term382600, term382600.getClass(), "second", (byte) 9);
        setIntField(term382600, term382600.getClass(), "nano", 75742000);
        setField(term382595, term382595.getClass(), "time", term382600);
        setField(term382472, term382472.getClass(), "commonModuleSetTime", term382595);
        setField(term382472, term382472.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term382472, term382472.getClass(), "commonSkin", -1);
        setIntField(term382472, term382472.getClass(), "headphoneVolume", 100);
        setBooleanField(term382472, term382472.getClass(), "buttonSeOn", true);
        setIntField(term382472, term382472.getClass(), "buttonSeVolume", 100);
        setIntField(term382472, term382472.getClass(), "sliderSeVolume", 100);
        setIntField(term382472, term382472.getClass(), "buttonSe", -1);
        setIntField(term382472, term382472.getClass(), "chainSlideSe", -1);
        setIntField(term382472, term382472.getClass(), "slideSe", -1);
        setIntField(term382472, term382472.getClass(), "sliderTouchSe", -1);
        setField(term382472, term382472.getClass(), "sortMode", enum867);
        setIntField(term382472, term382472.getClass(), "nextPvId", -1);
        setField(term382472, term382472.getClass(), "nextDifficulty", enum868);
        setField(term382472, term382472.getClass(), "nextEdition", enum869);
        setBooleanField(term382472, term382472.getClass(), "showInterimRanking", true);
        setBooleanField(term382472, term382472.getClass(), "showClearStatus", true);
        setBooleanField(term382472, term382472.getClass(), "showGreatBorder", true);
        setBooleanField(term382472, term382472.getClass(), "showExcellentBorder", true);
        setBooleanField(term382472, term382472.getClass(), "showRivalBorder", true);
        setBooleanField(term382472, term382472.getClass(), "showRgoSetting", true);
        setBooleanField(term382472, term382472.getClass(), "contestNowPlayingEnable", false);
        setIntField(term382472, term382472.getClass(), "contestNowPlayingId", -1);
        setIntField(term382472, term382472.getClass(), "contestNowPlayingValue", -1);
        setField(term382472, term382472.getClass(), "contestNowPlayingResultRank", enum870);
        setField(term382472, term382472.getClass(), "contestNowPlayingSpecifier", "");
        setField(term382472, term382472.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term382472, term382472.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term382472, term382472.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term382472, term382472.getClass(), "rivalPdId", -1);
        setField(term382469, term382469.getClass(), "pdId", term382472);
        setField(term382469, term382469.getClass(), "startMode", enum871);
        setIntField(term383091, term383091.getClass(), "year", 2016);
        setShortField(term383091, term383091.getClass(), "month", (short) 12);
        setShortField(term383091, term383091.getClass(), "day", (short) 20);
        setField(term383090, term383090.getClass(), "date", term383091);
        setByteField(term383095, term383095.getClass(), "hour", (byte) 8);
        setByteField(term383095, term383095.getClass(), "minute", (byte) 46);
        setByteField(term383095, term383095.getClass(), "second", (byte) 16);
        setIntField(term383095, term383095.getClass(), "nano", 10071864);
        setField(term383090, term383090.getClass(), "time", term383095);
        setField(term382469, term382469.getClass(), "startTime", term383090);
        setIntField(term383101, term383101.getClass(), "year", 2021);
        setShortField(term383101, term383101.getClass(), "month", (short) 8);
        setShortField(term383101, term383101.getClass(), "day", (short) 27);
        setField(term383100, term383100.getClass(), "date", term383101);
        setByteField(term383105, term383105.getClass(), "hour", (byte) 20);
        setByteField(term383105, term383105.getClass(), "minute", (byte) 11);
        setByteField(term383105, term383105.getClass(), "second", (byte) 47);
        setIntField(term383105, term383105.getClass(), "nano", 116303493);
        setField(term383100, term383100.getClass(), "time", term383105);
        setField(term382469, term382469.getClass(), "lastUpdateTime", term383100);
        setField(term382469, term382469.getClass(), "stageIndex", term383110);
        setField(term382469, term382469.getClass(), "stageResultIndex", term383112);
        setField(term382469, term382469.getClass(), "lastPvId", term383114);
        setField(term382469, term382469.getClass(), "levelNumber", term383116);
        setField(term382469, term382469.getClass(), "levelExp", term383118);
        setField(term382469, term382469.getClass(), "oldLevelNumber", term383120);
        setField(term382469, term382469.getClass(), "oldLevelExp", term383122);
        setField(term382469, term382469.getClass(), "vp", term383124);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.GameSession");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastPvId", argTypes, term382469, args);
    }

};


