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

public class GameSession_setLastUpdateTime_37876419120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term414350;
     Object term415007;

    public GameSession_setLastUpdateTime_37876419120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term415024 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term415023 = ((Class) term415024).getDeclaredField((String) "MISS");
        ((Field) term415023).setAccessible(true);
        Object enum933 = ((Field) term415023).get((Object) null);
        Class<? extends Object> term415401 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term415400 = ((Class) term415401).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term415400).setAccessible(true);
        Object enum934 = ((Field) term415400).get((Object) null);
        Class<? extends Object> term415684 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term415683 = ((Class) term415684).getDeclaredField((String) "NORMAL");
        ((Field) term415683).setAccessible(true);
        Object enum935 = ((Field) term415683).get((Object) null);
        Class<? extends Object> term415959 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term415958 = ((Class) term415959).getDeclaredField((String) "ORIGINAL");
        ((Field) term415958).setAccessible(true);
        Object enum936 = ((Field) term415958).get((Object) null);
        Class<? extends Object> term416225 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term416224 = ((Class) term416225).getDeclaredField((String) "NONE");
        ((Field) term416224).setAccessible(true);
        Object enum937 = ((Field) term416224).get((Object) null);
        Class<? extends Object> term416866 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.StartMode");
        Field term416865 = ((Class) term416866).getDeclaredField((String) "PRE_START");
        ((Field) term416865).setAccessible(true);
        Object enum938 = ((Field) term416865).get((Object) null);
        Integer term414991 = new Integer(1283079251);
        Integer term414993 = new Integer(-523949691);
        Integer term414995 = new Integer(1398204340);
        Integer term414997 = new Integer(229204365);
        Integer term414999 = new Integer(-461771056);
        Integer term415001 = new Integer(-243422082);
        Integer term415003 = new Integer(1384592638);
        Integer term415005 = new Integer(-1002370457);
        term414350 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.GameSession"));
        Object term414353 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term414476 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term414477 = newInstance(Class.forName("java.time.LocalDate"));
        Object term414481 = newInstance(Class.forName("java.time.LocalTime"));
        Object term414971 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term414972 = newInstance(Class.forName("java.time.LocalDate"));
        Object term414976 = newInstance(Class.forName("java.time.LocalTime"));
        Object term414981 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term414982 = newInstance(Class.forName("java.time.LocalDate"));
        Object term414986 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term414350, term414350.getClass(), "id", -88538481937688851L);
        setIntField(term414350, term414350.getClass(), "acceptId", 1984492528);
        setLongField(term414353, term414353.getClass(), "id", 4069264186851023313L);
        setIntField(term414353, term414353.getClass(), "pdId", -655764067);
        setField(term414353, term414353.getClass(), "playerName", "xxx");
        setIntField(term414353, term414353.getClass(), "vocaloidPoints", 300);
        setIntField(term414353, term414353.getClass(), "level", 1);
        setIntField(term414353, term414353.getClass(), "levelExp", 31238744);
        setField(term414353, term414353.getClass(), "levelTitle", "xxx");
        setIntField(term414353, term414353.getClass(), "plateId", -1);
        setIntField(term414353, term414353.getClass(), "plateEffectId", -1);
        setField(term414353, term414353.getClass(), "passwordStatus", enum933);
        setField(term414353, term414353.getClass(), "password", "**********");
        setBooleanField(term414353, term414353.getClass(), "preferPerPvModule", true);
        setBooleanField(term414353, term414353.getClass(), "preferCommonModule", true);
        setBooleanField(term414353, term414353.getClass(), "usePerPvSkin", true);
        setBooleanField(term414353, term414353.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term414353, term414353.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term414353, term414353.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term414353, term414353.getClass(), "usePerPvTouchSliderSe", true);
        setField(term414353, term414353.getClass(), "commonModule", "-999,-999,-999");
        setField(term414353, term414353.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term414477, term414477.getClass(), "year", 2026);
        setShortField(term414477, term414477.getClass(), "month", (short) 8);
        setShortField(term414477, term414477.getClass(), "day", (short) 12);
        setField(term414476, term414476.getClass(), "date", term414477);
        setByteField(term414481, term414481.getClass(), "hour", (byte) 2);
        setByteField(term414481, term414481.getClass(), "minute", (byte) 3);
        setByteField(term414481, term414481.getClass(), "second", (byte) 26);
        setIntField(term414481, term414481.getClass(), "nano", 760711000);
        setField(term414476, term414476.getClass(), "time", term414481);
        setField(term414353, term414353.getClass(), "commonModuleSetTime", term414476);
        setField(term414353, term414353.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term414353, term414353.getClass(), "commonSkin", -1);
        setIntField(term414353, term414353.getClass(), "headphoneVolume", 100);
        setBooleanField(term414353, term414353.getClass(), "buttonSeOn", true);
        setIntField(term414353, term414353.getClass(), "buttonSeVolume", 100);
        setIntField(term414353, term414353.getClass(), "sliderSeVolume", 100);
        setIntField(term414353, term414353.getClass(), "buttonSe", -1);
        setIntField(term414353, term414353.getClass(), "chainSlideSe", -1);
        setIntField(term414353, term414353.getClass(), "slideSe", -1);
        setIntField(term414353, term414353.getClass(), "sliderTouchSe", -1);
        setField(term414353, term414353.getClass(), "sortMode", enum934);
        setIntField(term414353, term414353.getClass(), "nextPvId", -1);
        setField(term414353, term414353.getClass(), "nextDifficulty", enum935);
        setField(term414353, term414353.getClass(), "nextEdition", enum936);
        setBooleanField(term414353, term414353.getClass(), "showInterimRanking", true);
        setBooleanField(term414353, term414353.getClass(), "showClearStatus", true);
        setBooleanField(term414353, term414353.getClass(), "showGreatBorder", true);
        setBooleanField(term414353, term414353.getClass(), "showExcellentBorder", true);
        setBooleanField(term414353, term414353.getClass(), "showRivalBorder", true);
        setBooleanField(term414353, term414353.getClass(), "showRgoSetting", true);
        setBooleanField(term414353, term414353.getClass(), "contestNowPlayingEnable", false);
        setIntField(term414353, term414353.getClass(), "contestNowPlayingId", -1);
        setIntField(term414353, term414353.getClass(), "contestNowPlayingValue", -1);
        setField(term414353, term414353.getClass(), "contestNowPlayingResultRank", enum937);
        setField(term414353, term414353.getClass(), "contestNowPlayingSpecifier", "");
        setField(term414353, term414353.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term414353, term414353.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term414353, term414353.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term414353, term414353.getClass(), "rivalPdId", -1);
        setField(term414350, term414350.getClass(), "pdId", term414353);
        setField(term414350, term414350.getClass(), "startMode", enum938);
        setIntField(term414972, term414972.getClass(), "year", 2014);
        setShortField(term414972, term414972.getClass(), "month", (short) 5);
        setShortField(term414972, term414972.getClass(), "day", (short) 31);
        setField(term414971, term414971.getClass(), "date", term414972);
        setByteField(term414976, term414976.getClass(), "hour", (byte) 16);
        setByteField(term414976, term414976.getClass(), "minute", (byte) 3);
        setByteField(term414976, term414976.getClass(), "second", (byte) 14);
        setIntField(term414976, term414976.getClass(), "nano", 281059649);
        setField(term414971, term414971.getClass(), "time", term414976);
        setField(term414350, term414350.getClass(), "startTime", term414971);
        setIntField(term414982, term414982.getClass(), "year", 2010);
        setShortField(term414982, term414982.getClass(), "month", (short) 12);
        setShortField(term414982, term414982.getClass(), "day", (short) 30);
        setField(term414981, term414981.getClass(), "date", term414982);
        setByteField(term414986, term414986.getClass(), "hour", (byte) 17);
        setByteField(term414986, term414986.getClass(), "minute", (byte) 44);
        setByteField(term414986, term414986.getClass(), "second", (byte) 59);
        setIntField(term414986, term414986.getClass(), "nano", 881407895);
        setField(term414981, term414981.getClass(), "time", term414986);
        setField(term414350, term414350.getClass(), "lastUpdateTime", term414981);
        setField(term414350, term414350.getClass(), "stageIndex", term414991);
        setField(term414350, term414350.getClass(), "stageResultIndex", term414993);
        setField(term414350, term414350.getClass(), "lastPvId", term414995);
        setField(term414350, term414350.getClass(), "levelNumber", term414997);
        setField(term414350, term414350.getClass(), "levelExp", term414999);
        setField(term414350, term414350.getClass(), "oldLevelNumber", term415001);
        setField(term414350, term414350.getClass(), "oldLevelExp", term415003);
        setField(term414350, term414350.getClass(), "vp", term415005);
        term415007 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term415008 = newInstance(Class.forName("java.time.LocalDate"));
        Object term415012 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term415008, term415008.getClass(), "year", 2019);
        setShortField(term415008, term415008.getClass(), "month", (short) 6);
        setShortField(term415008, term415008.getClass(), "day", (short) 12);
        setField(term415007, term415007.getClass(), "date", term415008);
        setByteField(term415012, term415012.getClass(), "hour", (byte) 5);
        setByteField(term415012, term415012.getClass(), "minute", (byte) 13);
        setByteField(term415012, term415012.getClass(), "second", (byte) 8);
        setIntField(term415012, term415012.getClass(), "nano", 838117658);
        setField(term415007, term415007.getClass(), "time", term415012);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.GameSession");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term415007;
        callMethod(klass, "setLastUpdateTime", argTypes, term414350, args);
    }

};


