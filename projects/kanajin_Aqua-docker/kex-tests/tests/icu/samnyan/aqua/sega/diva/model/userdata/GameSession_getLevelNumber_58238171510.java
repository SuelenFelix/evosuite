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

public class GameSession_getLevelNumber_58238171510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term385253;

    public GameSession_getLevelNumber_58238171510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term385913 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term385912 = ((Class) term385913).getDeclaredField((String) "MISS");
        ((Field) term385912).setAccessible(true);
        Object enum872 = ((Field) term385912).get((Object) null);
        Class<? extends Object> term386290 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term386289 = ((Class) term386290).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term386289).setAccessible(true);
        Object enum873 = ((Field) term386289).get((Object) null);
        Class<? extends Object> term386573 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term386572 = ((Class) term386573).getDeclaredField((String) "NORMAL");
        ((Field) term386572).setAccessible(true);
        Object enum874 = ((Field) term386572).get((Object) null);
        Class<? extends Object> term386848 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term386847 = ((Class) term386848).getDeclaredField((String) "ORIGINAL");
        ((Field) term386847).setAccessible(true);
        Object enum875 = ((Field) term386847).get((Object) null);
        Class<? extends Object> term387114 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term387113 = ((Class) term387114).getDeclaredField((String) "NONE");
        ((Field) term387113).setAccessible(true);
        Object enum876 = ((Field) term387113).get((Object) null);
        Class<? extends Object> term387755 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.StartMode");
        Field term387754 = ((Class) term387755).getDeclaredField((String) "START");
        ((Field) term387754).setAccessible(true);
        Object enum877 = ((Field) term387754).get((Object) null);
        Integer term385890 = new Integer(972867650);
        Integer term385892 = new Integer(1655935355);
        Integer term385894 = new Integer(-481533957);
        Integer term385896 = new Integer(1240914516);
        Integer term385898 = new Integer(-1465035361);
        Integer term385900 = new Integer(1090617576);
        Integer term385902 = new Integer(-1547384488);
        Integer term385904 = new Integer(1442160736);
        term385253 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.GameSession"));
        Object term385256 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term385379 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term385380 = newInstance(Class.forName("java.time.LocalDate"));
        Object term385384 = newInstance(Class.forName("java.time.LocalTime"));
        Object term385870 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term385871 = newInstance(Class.forName("java.time.LocalDate"));
        Object term385875 = newInstance(Class.forName("java.time.LocalTime"));
        Object term385880 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term385881 = newInstance(Class.forName("java.time.LocalDate"));
        Object term385885 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term385253, term385253.getClass(), "id", 21047099434645581L);
        setIntField(term385253, term385253.getClass(), "acceptId", -1782801582);
        setLongField(term385256, term385256.getClass(), "id", -8862087040734407227L);
        setIntField(term385256, term385256.getClass(), "pdId", -112814060);
        setField(term385256, term385256.getClass(), "playerName", "xxx");
        setIntField(term385256, term385256.getClass(), "vocaloidPoints", 300);
        setIntField(term385256, term385256.getClass(), "level", 1);
        setIntField(term385256, term385256.getClass(), "levelExp", -1111447214);
        setField(term385256, term385256.getClass(), "levelTitle", "xxx");
        setIntField(term385256, term385256.getClass(), "plateId", -1);
        setIntField(term385256, term385256.getClass(), "plateEffectId", -1);
        setField(term385256, term385256.getClass(), "passwordStatus", enum872);
        setField(term385256, term385256.getClass(), "password", "**********");
        setBooleanField(term385256, term385256.getClass(), "preferPerPvModule", true);
        setBooleanField(term385256, term385256.getClass(), "preferCommonModule", false);
        setBooleanField(term385256, term385256.getClass(), "usePerPvSkin", true);
        setBooleanField(term385256, term385256.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term385256, term385256.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term385256, term385256.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term385256, term385256.getClass(), "usePerPvTouchSliderSe", false);
        setField(term385256, term385256.getClass(), "commonModule", "-999,-999,-999");
        setField(term385256, term385256.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term385380, term385380.getClass(), "year", 2026);
        setShortField(term385380, term385380.getClass(), "month", (short) 8);
        setShortField(term385380, term385380.getClass(), "day", (short) 12);
        setField(term385379, term385379.getClass(), "date", term385380);
        setByteField(term385384, term385384.getClass(), "hour", (byte) 2);
        setByteField(term385384, term385384.getClass(), "minute", (byte) 3);
        setByteField(term385384, term385384.getClass(), "second", (byte) 24);
        setIntField(term385384, term385384.getClass(), "nano", 300770000);
        setField(term385379, term385379.getClass(), "time", term385384);
        setField(term385256, term385256.getClass(), "commonModuleSetTime", term385379);
        setField(term385256, term385256.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term385256, term385256.getClass(), "commonSkin", -1);
        setIntField(term385256, term385256.getClass(), "headphoneVolume", 100);
        setBooleanField(term385256, term385256.getClass(), "buttonSeOn", true);
        setIntField(term385256, term385256.getClass(), "buttonSeVolume", 100);
        setIntField(term385256, term385256.getClass(), "sliderSeVolume", 100);
        setIntField(term385256, term385256.getClass(), "buttonSe", -1);
        setIntField(term385256, term385256.getClass(), "chainSlideSe", -1);
        setIntField(term385256, term385256.getClass(), "slideSe", -1);
        setIntField(term385256, term385256.getClass(), "sliderTouchSe", -1);
        setField(term385256, term385256.getClass(), "sortMode", enum873);
        setIntField(term385256, term385256.getClass(), "nextPvId", -1);
        setField(term385256, term385256.getClass(), "nextDifficulty", enum874);
        setField(term385256, term385256.getClass(), "nextEdition", enum875);
        setBooleanField(term385256, term385256.getClass(), "showInterimRanking", true);
        setBooleanField(term385256, term385256.getClass(), "showClearStatus", true);
        setBooleanField(term385256, term385256.getClass(), "showGreatBorder", true);
        setBooleanField(term385256, term385256.getClass(), "showExcellentBorder", true);
        setBooleanField(term385256, term385256.getClass(), "showRivalBorder", true);
        setBooleanField(term385256, term385256.getClass(), "showRgoSetting", true);
        setBooleanField(term385256, term385256.getClass(), "contestNowPlayingEnable", true);
        setIntField(term385256, term385256.getClass(), "contestNowPlayingId", -1);
        setIntField(term385256, term385256.getClass(), "contestNowPlayingValue", -1);
        setField(term385256, term385256.getClass(), "contestNowPlayingResultRank", enum876);
        setField(term385256, term385256.getClass(), "contestNowPlayingSpecifier", "");
        setField(term385256, term385256.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term385256, term385256.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term385256, term385256.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term385256, term385256.getClass(), "rivalPdId", -1);
        setField(term385253, term385253.getClass(), "pdId", term385256);
        setField(term385253, term385253.getClass(), "startMode", enum877);
        setIntField(term385871, term385871.getClass(), "year", 2012);
        setShortField(term385871, term385871.getClass(), "month", (short) 5);
        setShortField(term385871, term385871.getClass(), "day", (short) 17);
        setField(term385870, term385870.getClass(), "date", term385871);
        setByteField(term385875, term385875.getClass(), "hour", (byte) 19);
        setByteField(term385875, term385875.getClass(), "minute", (byte) 36);
        setByteField(term385875, term385875.getClass(), "second", (byte) 33);
        setIntField(term385875, term385875.getClass(), "nano", 46625011);
        setField(term385870, term385870.getClass(), "time", term385875);
        setField(term385253, term385253.getClass(), "startTime", term385870);
        setIntField(term385881, term385881.getClass(), "year", 2013);
        setShortField(term385881, term385881.getClass(), "month", (short) 7);
        setShortField(term385881, term385881.getClass(), "day", (short) 3);
        setField(term385880, term385880.getClass(), "date", term385881);
        setByteField(term385885, term385885.getClass(), "hour", (byte) 10);
        setByteField(term385885, term385885.getClass(), "minute", (byte) 59);
        setByteField(term385885, term385885.getClass(), "second", (byte) 22);
        setIntField(term385885, term385885.getClass(), "nano", 937921480);
        setField(term385880, term385880.getClass(), "time", term385885);
        setField(term385253, term385253.getClass(), "lastUpdateTime", term385880);
        setField(term385253, term385253.getClass(), "stageIndex", term385890);
        setField(term385253, term385253.getClass(), "stageResultIndex", term385892);
        setField(term385253, term385253.getClass(), "lastPvId", term385894);
        setField(term385253, term385253.getClass(), "levelNumber", term385896);
        setField(term385253, term385253.getClass(), "levelExp", term385898);
        setField(term385253, term385253.getClass(), "oldLevelNumber", term385900);
        setField(term385253, term385253.getClass(), "oldLevelExp", term385902);
        setField(term385253, term385253.getClass(), "vp", term385904);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.GameSession");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLevelNumber", argTypes, term385253, args);
    }

};


