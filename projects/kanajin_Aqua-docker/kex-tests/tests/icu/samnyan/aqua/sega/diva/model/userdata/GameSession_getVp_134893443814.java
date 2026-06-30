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

public class GameSession_getVp_134893443814 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term396357;

    public GameSession_getVp_134893443814() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term397026 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term397025 = ((Class) term397026).getDeclaredField((String) "MISS");
        ((Field) term397025).setAccessible(true);
        Object enum896 = ((Field) term397025).get((Object) null);
        Class<? extends Object> term397403 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term397402 = ((Class) term397403).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term397402).setAccessible(true);
        Object enum897 = ((Field) term397402).get((Object) null);
        Class<? extends Object> term397686 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term397685 = ((Class) term397686).getDeclaredField((String) "NORMAL");
        ((Field) term397685).setAccessible(true);
        Object enum898 = ((Field) term397685).get((Object) null);
        Class<? extends Object> term397961 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term397960 = ((Class) term397961).getDeclaredField((String) "ORIGINAL");
        ((Field) term397960).setAccessible(true);
        Object enum899 = ((Field) term397960).get((Object) null);
        Class<? extends Object> term398227 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term398226 = ((Class) term398227).getDeclaredField((String) "NONE");
        ((Field) term398226).setAccessible(true);
        Object enum900 = ((Field) term398226).get((Object) null);
        Class<? extends Object> term398868 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.StartMode");
        Field term398867 = ((Class) term398868).getDeclaredField((String) "CARD_PROCEDURE");
        ((Field) term398867).setAccessible(true);
        Object enum901 = ((Field) term398867).get((Object) null);
        Integer term397003 = new Integer(-1801760683);
        Integer term397005 = new Integer(1141317871);
        Integer term397007 = new Integer(890669485);
        Integer term397009 = new Integer(691577392);
        Integer term397011 = new Integer(-893623680);
        Integer term397013 = new Integer(-1963434938);
        Integer term397015 = new Integer(906181092);
        Integer term397017 = new Integer(1045657203);
        term396357 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.GameSession"));
        Object term396360 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term396483 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term396484 = newInstance(Class.forName("java.time.LocalDate"));
        Object term396488 = newInstance(Class.forName("java.time.LocalTime"));
        Object term396983 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term396984 = newInstance(Class.forName("java.time.LocalDate"));
        Object term396988 = newInstance(Class.forName("java.time.LocalTime"));
        Object term396993 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term396994 = newInstance(Class.forName("java.time.LocalDate"));
        Object term396998 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term396357, term396357.getClass(), "id", 1253549421411622358L);
        setIntField(term396357, term396357.getClass(), "acceptId", 1080834214);
        setLongField(term396360, term396360.getClass(), "id", 3666226122807672448L);
        setIntField(term396360, term396360.getClass(), "pdId", 323842695);
        setField(term396360, term396360.getClass(), "playerName", "xxx");
        setIntField(term396360, term396360.getClass(), "vocaloidPoints", 300);
        setIntField(term396360, term396360.getClass(), "level", 1);
        setIntField(term396360, term396360.getClass(), "levelExp", 331897564);
        setField(term396360, term396360.getClass(), "levelTitle", "xxx");
        setIntField(term396360, term396360.getClass(), "plateId", -1);
        setIntField(term396360, term396360.getClass(), "plateEffectId", -1);
        setField(term396360, term396360.getClass(), "passwordStatus", enum896);
        setField(term396360, term396360.getClass(), "password", "**********");
        setBooleanField(term396360, term396360.getClass(), "preferPerPvModule", true);
        setBooleanField(term396360, term396360.getClass(), "preferCommonModule", true);
        setBooleanField(term396360, term396360.getClass(), "usePerPvSkin", false);
        setBooleanField(term396360, term396360.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term396360, term396360.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term396360, term396360.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term396360, term396360.getClass(), "usePerPvTouchSliderSe", false);
        setField(term396360, term396360.getClass(), "commonModule", "-999,-999,-999");
        setField(term396360, term396360.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term396484, term396484.getClass(), "year", 2026);
        setShortField(term396484, term396484.getClass(), "month", (short) 6);
        setShortField(term396484, term396484.getClass(), "day", (short) 29);
        setField(term396483, term396483.getClass(), "date", term396484);
        setByteField(term396488, term396488.getClass(), "hour", (byte) 4);
        setByteField(term396488, term396488.getClass(), "minute", (byte) 28);
        setByteField(term396488, term396488.getClass(), "second", (byte) 10);
        setIntField(term396488, term396488.getClass(), "nano", 336518000);
        setField(term396483, term396483.getClass(), "time", term396488);
        setField(term396360, term396360.getClass(), "commonModuleSetTime", term396483);
        setField(term396360, term396360.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term396360, term396360.getClass(), "commonSkin", -1);
        setIntField(term396360, term396360.getClass(), "headphoneVolume", 100);
        setBooleanField(term396360, term396360.getClass(), "buttonSeOn", true);
        setIntField(term396360, term396360.getClass(), "buttonSeVolume", 100);
        setIntField(term396360, term396360.getClass(), "sliderSeVolume", 100);
        setIntField(term396360, term396360.getClass(), "buttonSe", -1);
        setIntField(term396360, term396360.getClass(), "chainSlideSe", -1);
        setIntField(term396360, term396360.getClass(), "slideSe", -1);
        setIntField(term396360, term396360.getClass(), "sliderTouchSe", -1);
        setField(term396360, term396360.getClass(), "sortMode", enum897);
        setIntField(term396360, term396360.getClass(), "nextPvId", -1);
        setField(term396360, term396360.getClass(), "nextDifficulty", enum898);
        setField(term396360, term396360.getClass(), "nextEdition", enum899);
        setBooleanField(term396360, term396360.getClass(), "showInterimRanking", true);
        setBooleanField(term396360, term396360.getClass(), "showClearStatus", true);
        setBooleanField(term396360, term396360.getClass(), "showGreatBorder", true);
        setBooleanField(term396360, term396360.getClass(), "showExcellentBorder", true);
        setBooleanField(term396360, term396360.getClass(), "showRivalBorder", true);
        setBooleanField(term396360, term396360.getClass(), "showRgoSetting", true);
        setBooleanField(term396360, term396360.getClass(), "contestNowPlayingEnable", false);
        setIntField(term396360, term396360.getClass(), "contestNowPlayingId", -1);
        setIntField(term396360, term396360.getClass(), "contestNowPlayingValue", -1);
        setField(term396360, term396360.getClass(), "contestNowPlayingResultRank", enum900);
        setField(term396360, term396360.getClass(), "contestNowPlayingSpecifier", "");
        setField(term396360, term396360.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term396360, term396360.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term396360, term396360.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term396360, term396360.getClass(), "rivalPdId", -1);
        setField(term396357, term396357.getClass(), "pdId", term396360);
        setField(term396357, term396357.getClass(), "startMode", enum901);
        setIntField(term396984, term396984.getClass(), "year", 2018);
        setShortField(term396984, term396984.getClass(), "month", (short) 10);
        setShortField(term396984, term396984.getClass(), "day", (short) 17);
        setField(term396983, term396983.getClass(), "date", term396984);
        setByteField(term396988, term396988.getClass(), "hour", (byte) 5);
        setByteField(term396988, term396988.getClass(), "minute", (byte) 10);
        setByteField(term396988, term396988.getClass(), "second", (byte) 23);
        setIntField(term396988, term396988.getClass(), "nano", 571520422);
        setField(term396983, term396983.getClass(), "time", term396988);
        setField(term396357, term396357.getClass(), "startTime", term396983);
        setIntField(term396994, term396994.getClass(), "year", 2022);
        setShortField(term396994, term396994.getClass(), "month", (short) 11);
        setShortField(term396994, term396994.getClass(), "day", (short) 5);
        setField(term396993, term396993.getClass(), "date", term396994);
        setByteField(term396998, term396998.getClass(), "hour", (byte) 0);
        setByteField(term396998, term396998.getClass(), "minute", (byte) 51);
        setByteField(term396998, term396998.getClass(), "second", (byte) 23);
        setIntField(term396998, term396998.getClass(), "nano", 1140962);
        setField(term396993, term396993.getClass(), "time", term396998);
        setField(term396357, term396357.getClass(), "lastUpdateTime", term396993);
        setField(term396357, term396357.getClass(), "stageIndex", term397003);
        setField(term396357, term396357.getClass(), "stageResultIndex", term397005);
        setField(term396357, term396357.getClass(), "lastPvId", term397007);
        setField(term396357, term396357.getClass(), "levelNumber", term397009);
        setField(term396357, term396357.getClass(), "levelExp", term397011);
        setField(term396357, term396357.getClass(), "oldLevelNumber", term397013);
        setField(term396357, term396357.getClass(), "oldLevelExp", term397015);
        setField(term396357, term396357.getClass(), "vp", term397017);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.GameSession");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVp", argTypes, term396357, args);
    }

};


