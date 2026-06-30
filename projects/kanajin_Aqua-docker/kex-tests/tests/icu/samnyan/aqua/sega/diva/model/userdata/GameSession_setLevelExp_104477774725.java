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

public class GameSession_setLevelExp_104477774725 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term428256;
     Object term428913;

    public GameSession_setLevelExp_104477774725() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term428922 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term428921 = ((Class) term428922).getDeclaredField((String) "MISS");
        ((Field) term428921).setAccessible(true);
        Object enum963 = ((Field) term428921).get((Object) null);
        Class<? extends Object> term429299 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term429298 = ((Class) term429299).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term429298).setAccessible(true);
        Object enum964 = ((Field) term429298).get((Object) null);
        Class<? extends Object> term429582 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term429581 = ((Class) term429582).getDeclaredField((String) "NORMAL");
        ((Field) term429581).setAccessible(true);
        Object enum965 = ((Field) term429581).get((Object) null);
        Class<? extends Object> term429857 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term429856 = ((Class) term429857).getDeclaredField((String) "ORIGINAL");
        ((Field) term429856).setAccessible(true);
        Object enum966 = ((Field) term429856).get((Object) null);
        Class<? extends Object> term430123 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term430122 = ((Class) term430123).getDeclaredField((String) "NONE");
        ((Field) term430122).setAccessible(true);
        Object enum967 = ((Field) term430122).get((Object) null);
        Class<? extends Object> term430764 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.StartMode");
        Field term430763 = ((Class) term430764).getDeclaredField((String) "PRE_START");
        ((Field) term430763).setAccessible(true);
        Object enum968 = ((Field) term430763).get((Object) null);
        Integer term428897 = new Integer(-1870495012);
        Integer term428899 = new Integer(-1310015129);
        Integer term428901 = new Integer(-2104981311);
        Integer term428903 = new Integer(-571169753);
        Integer term428905 = new Integer(318591690);
        Integer term428907 = new Integer(-165587447);
        Integer term428909 = new Integer(-1347358701);
        Integer term428911 = new Integer(806595993);
        term428256 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.GameSession"));
        Object term428259 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term428382 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term428383 = newInstance(Class.forName("java.time.LocalDate"));
        Object term428387 = newInstance(Class.forName("java.time.LocalTime"));
        Object term428877 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term428878 = newInstance(Class.forName("java.time.LocalDate"));
        Object term428882 = newInstance(Class.forName("java.time.LocalTime"));
        Object term428887 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term428888 = newInstance(Class.forName("java.time.LocalDate"));
        Object term428892 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term428256, term428256.getClass(), "id", 8403492202041709902L);
        setIntField(term428256, term428256.getClass(), "acceptId", -696403395);
        setLongField(term428259, term428259.getClass(), "id", -113028659747841511L);
        setIntField(term428259, term428259.getClass(), "pdId", 227321148);
        setField(term428259, term428259.getClass(), "playerName", "xxx");
        setIntField(term428259, term428259.getClass(), "vocaloidPoints", 300);
        setIntField(term428259, term428259.getClass(), "level", 1);
        setIntField(term428259, term428259.getClass(), "levelExp", -266870537);
        setField(term428259, term428259.getClass(), "levelTitle", "xxx");
        setIntField(term428259, term428259.getClass(), "plateId", -1);
        setIntField(term428259, term428259.getClass(), "plateEffectId", -1);
        setField(term428259, term428259.getClass(), "passwordStatus", enum963);
        setField(term428259, term428259.getClass(), "password", "**********");
        setBooleanField(term428259, term428259.getClass(), "preferPerPvModule", true);
        setBooleanField(term428259, term428259.getClass(), "preferCommonModule", false);
        setBooleanField(term428259, term428259.getClass(), "usePerPvSkin", true);
        setBooleanField(term428259, term428259.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term428259, term428259.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term428259, term428259.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term428259, term428259.getClass(), "usePerPvTouchSliderSe", true);
        setField(term428259, term428259.getClass(), "commonModule", "-999,-999,-999");
        setField(term428259, term428259.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term428383, term428383.getClass(), "year", 2026);
        setShortField(term428383, term428383.getClass(), "month", (short) 6);
        setShortField(term428383, term428383.getClass(), "day", (short) 29);
        setField(term428382, term428382.getClass(), "date", term428383);
        setByteField(term428387, term428387.getClass(), "hour", (byte) 4);
        setByteField(term428387, term428387.getClass(), "minute", (byte) 28);
        setByteField(term428387, term428387.getClass(), "second", (byte) 13);
        setIntField(term428387, term428387.getClass(), "nano", 125428000);
        setField(term428382, term428382.getClass(), "time", term428387);
        setField(term428259, term428259.getClass(), "commonModuleSetTime", term428382);
        setField(term428259, term428259.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term428259, term428259.getClass(), "commonSkin", -1);
        setIntField(term428259, term428259.getClass(), "headphoneVolume", 100);
        setBooleanField(term428259, term428259.getClass(), "buttonSeOn", true);
        setIntField(term428259, term428259.getClass(), "buttonSeVolume", 100);
        setIntField(term428259, term428259.getClass(), "sliderSeVolume", 100);
        setIntField(term428259, term428259.getClass(), "buttonSe", -1);
        setIntField(term428259, term428259.getClass(), "chainSlideSe", -1);
        setIntField(term428259, term428259.getClass(), "slideSe", -1);
        setIntField(term428259, term428259.getClass(), "sliderTouchSe", -1);
        setField(term428259, term428259.getClass(), "sortMode", enum964);
        setIntField(term428259, term428259.getClass(), "nextPvId", -1);
        setField(term428259, term428259.getClass(), "nextDifficulty", enum965);
        setField(term428259, term428259.getClass(), "nextEdition", enum966);
        setBooleanField(term428259, term428259.getClass(), "showInterimRanking", true);
        setBooleanField(term428259, term428259.getClass(), "showClearStatus", true);
        setBooleanField(term428259, term428259.getClass(), "showGreatBorder", true);
        setBooleanField(term428259, term428259.getClass(), "showExcellentBorder", true);
        setBooleanField(term428259, term428259.getClass(), "showRivalBorder", true);
        setBooleanField(term428259, term428259.getClass(), "showRgoSetting", true);
        setBooleanField(term428259, term428259.getClass(), "contestNowPlayingEnable", true);
        setIntField(term428259, term428259.getClass(), "contestNowPlayingId", -1);
        setIntField(term428259, term428259.getClass(), "contestNowPlayingValue", -1);
        setField(term428259, term428259.getClass(), "contestNowPlayingResultRank", enum967);
        setField(term428259, term428259.getClass(), "contestNowPlayingSpecifier", "");
        setField(term428259, term428259.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term428259, term428259.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term428259, term428259.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term428259, term428259.getClass(), "rivalPdId", -1);
        setField(term428256, term428256.getClass(), "pdId", term428259);
        setField(term428256, term428256.getClass(), "startMode", enum968);
        setIntField(term428878, term428878.getClass(), "year", 2016);
        setShortField(term428878, term428878.getClass(), "month", (short) 8);
        setShortField(term428878, term428878.getClass(), "day", (short) 24);
        setField(term428877, term428877.getClass(), "date", term428878);
        setByteField(term428882, term428882.getClass(), "hour", (byte) 22);
        setByteField(term428882, term428882.getClass(), "minute", (byte) 25);
        setByteField(term428882, term428882.getClass(), "second", (byte) 3);
        setIntField(term428882, term428882.getClass(), "nano", 185613519);
        setField(term428877, term428877.getClass(), "time", term428882);
        setField(term428256, term428256.getClass(), "startTime", term428877);
        setIntField(term428888, term428888.getClass(), "year", 2029);
        setShortField(term428888, term428888.getClass(), "month", (short) 5);
        setShortField(term428888, term428888.getClass(), "day", (short) 11);
        setField(term428887, term428887.getClass(), "date", term428888);
        setByteField(term428892, term428892.getClass(), "hour", (byte) 20);
        setByteField(term428892, term428892.getClass(), "minute", (byte) 17);
        setByteField(term428892, term428892.getClass(), "second", (byte) 32);
        setIntField(term428892, term428892.getClass(), "nano", 327503582);
        setField(term428887, term428887.getClass(), "time", term428892);
        setField(term428256, term428256.getClass(), "lastUpdateTime", term428887);
        setField(term428256, term428256.getClass(), "stageIndex", term428897);
        setField(term428256, term428256.getClass(), "stageResultIndex", term428899);
        setField(term428256, term428256.getClass(), "lastPvId", term428901);
        setField(term428256, term428256.getClass(), "levelNumber", term428903);
        setField(term428256, term428256.getClass(), "levelExp", term428905);
        setField(term428256, term428256.getClass(), "oldLevelNumber", term428907);
        setField(term428256, term428256.getClass(), "oldLevelExp", term428909);
        setField(term428256, term428256.getClass(), "vp", term428911);
        term428913 = new Integer(548228925);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.GameSession");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term428913;
        callMethod(klass, "setLevelExp", argTypes, term428256, args);
    }

};


