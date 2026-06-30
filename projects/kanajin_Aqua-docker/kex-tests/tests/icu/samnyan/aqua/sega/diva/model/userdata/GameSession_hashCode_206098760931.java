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

public class GameSession_hashCode_206098760931 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term444978;

    public GameSession_hashCode_206098760931() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term445642 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term445641 = ((Class) term445642).getDeclaredField((String) "MISS");
        ((Field) term445641).setAccessible(true);
        Object enum999 = ((Field) term445641).get((Object) null);
        Class<? extends Object> term446019 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term446018 = ((Class) term446019).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term446018).setAccessible(true);
        Object enum1000 = ((Field) term446018).get((Object) null);
        Class<? extends Object> term446302 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term446301 = ((Class) term446302).getDeclaredField((String) "NORMAL");
        ((Field) term446301).setAccessible(true);
        Object enum1001 = ((Field) term446301).get((Object) null);
        Class<? extends Object> term446577 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term446576 = ((Class) term446577).getDeclaredField((String) "ORIGINAL");
        ((Field) term446576).setAccessible(true);
        Object enum1002 = ((Field) term446576).get((Object) null);
        Class<? extends Object> term446843 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term446842 = ((Class) term446843).getDeclaredField((String) "NONE");
        ((Field) term446842).setAccessible(true);
        Object enum1003 = ((Field) term446842).get((Object) null);
        Class<? extends Object> term447484 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.StartMode");
        Field term447483 = ((Class) term447484).getDeclaredField((String) "PRE_START");
        ((Field) term447483).setAccessible(true);
        Object enum1004 = ((Field) term447483).get((Object) null);
        Integer term445619 = new Integer(-420030135);
        Integer term445621 = new Integer(267763294);
        Integer term445623 = new Integer(-1497710478);
        Integer term445625 = new Integer(49950830);
        Integer term445627 = new Integer(-525257914);
        Integer term445629 = new Integer(147209682);
        Integer term445631 = new Integer(34470066);
        Integer term445633 = new Integer(2058711405);
        term444978 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.GameSession"));
        Object term444981 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term445104 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term445105 = newInstance(Class.forName("java.time.LocalDate"));
        Object term445109 = newInstance(Class.forName("java.time.LocalTime"));
        Object term445599 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term445600 = newInstance(Class.forName("java.time.LocalDate"));
        Object term445604 = newInstance(Class.forName("java.time.LocalTime"));
        Object term445609 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term445610 = newInstance(Class.forName("java.time.LocalDate"));
        Object term445614 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term444978, term444978.getClass(), "id", 3713624957161771816L);
        setIntField(term444978, term444978.getClass(), "acceptId", -21975974);
        setLongField(term444981, term444981.getClass(), "id", 6130232388739280211L);
        setIntField(term444981, term444981.getClass(), "pdId", -862969915);
        setField(term444981, term444981.getClass(), "playerName", "xxx");
        setIntField(term444981, term444981.getClass(), "vocaloidPoints", 300);
        setIntField(term444981, term444981.getClass(), "level", 1);
        setIntField(term444981, term444981.getClass(), "levelExp", -1289681614);
        setField(term444981, term444981.getClass(), "levelTitle", "xxx");
        setIntField(term444981, term444981.getClass(), "plateId", -1);
        setIntField(term444981, term444981.getClass(), "plateEffectId", -1);
        setField(term444981, term444981.getClass(), "passwordStatus", enum999);
        setField(term444981, term444981.getClass(), "password", "**********");
        setBooleanField(term444981, term444981.getClass(), "preferPerPvModule", true);
        setBooleanField(term444981, term444981.getClass(), "preferCommonModule", false);
        setBooleanField(term444981, term444981.getClass(), "usePerPvSkin", false);
        setBooleanField(term444981, term444981.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term444981, term444981.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term444981, term444981.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term444981, term444981.getClass(), "usePerPvTouchSliderSe", false);
        setField(term444981, term444981.getClass(), "commonModule", "-999,-999,-999");
        setField(term444981, term444981.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term445105, term445105.getClass(), "year", 2026);
        setShortField(term445105, term445105.getClass(), "month", (short) 6);
        setShortField(term445105, term445105.getClass(), "day", (short) 29);
        setField(term445104, term445104.getClass(), "date", term445105);
        setByteField(term445109, term445109.getClass(), "hour", (byte) 4);
        setByteField(term445109, term445109.getClass(), "minute", (byte) 28);
        setByteField(term445109, term445109.getClass(), "second", (byte) 14);
        setIntField(term445109, term445109.getClass(), "nano", 653423000);
        setField(term445104, term445104.getClass(), "time", term445109);
        setField(term444981, term444981.getClass(), "commonModuleSetTime", term445104);
        setField(term444981, term444981.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term444981, term444981.getClass(), "commonSkin", -1);
        setIntField(term444981, term444981.getClass(), "headphoneVolume", 100);
        setBooleanField(term444981, term444981.getClass(), "buttonSeOn", true);
        setIntField(term444981, term444981.getClass(), "buttonSeVolume", 100);
        setIntField(term444981, term444981.getClass(), "sliderSeVolume", 100);
        setIntField(term444981, term444981.getClass(), "buttonSe", -1);
        setIntField(term444981, term444981.getClass(), "chainSlideSe", -1);
        setIntField(term444981, term444981.getClass(), "slideSe", -1);
        setIntField(term444981, term444981.getClass(), "sliderTouchSe", -1);
        setField(term444981, term444981.getClass(), "sortMode", enum1000);
        setIntField(term444981, term444981.getClass(), "nextPvId", -1);
        setField(term444981, term444981.getClass(), "nextDifficulty", enum1001);
        setField(term444981, term444981.getClass(), "nextEdition", enum1002);
        setBooleanField(term444981, term444981.getClass(), "showInterimRanking", true);
        setBooleanField(term444981, term444981.getClass(), "showClearStatus", true);
        setBooleanField(term444981, term444981.getClass(), "showGreatBorder", true);
        setBooleanField(term444981, term444981.getClass(), "showExcellentBorder", true);
        setBooleanField(term444981, term444981.getClass(), "showRivalBorder", true);
        setBooleanField(term444981, term444981.getClass(), "showRgoSetting", true);
        setBooleanField(term444981, term444981.getClass(), "contestNowPlayingEnable", false);
        setIntField(term444981, term444981.getClass(), "contestNowPlayingId", -1);
        setIntField(term444981, term444981.getClass(), "contestNowPlayingValue", -1);
        setField(term444981, term444981.getClass(), "contestNowPlayingResultRank", enum1003);
        setField(term444981, term444981.getClass(), "contestNowPlayingSpecifier", "");
        setField(term444981, term444981.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term444981, term444981.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term444981, term444981.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term444981, term444981.getClass(), "rivalPdId", -1);
        setField(term444978, term444978.getClass(), "pdId", term444981);
        setField(term444978, term444978.getClass(), "startMode", enum1004);
        setIntField(term445600, term445600.getClass(), "year", 2012);
        setShortField(term445600, term445600.getClass(), "month", (short) 3);
        setShortField(term445600, term445600.getClass(), "day", (short) 12);
        setField(term445599, term445599.getClass(), "date", term445600);
        setByteField(term445604, term445604.getClass(), "hour", (byte) 0);
        setByteField(term445604, term445604.getClass(), "minute", (byte) 32);
        setByteField(term445604, term445604.getClass(), "second", (byte) 14);
        setIntField(term445604, term445604.getClass(), "nano", 342342345);
        setField(term445599, term445599.getClass(), "time", term445604);
        setField(term444978, term444978.getClass(), "startTime", term445599);
        setIntField(term445610, term445610.getClass(), "year", 2026);
        setShortField(term445610, term445610.getClass(), "month", (short) 9);
        setShortField(term445610, term445610.getClass(), "day", (short) 18);
        setField(term445609, term445609.getClass(), "date", term445610);
        setByteField(term445614, term445614.getClass(), "hour", (byte) 14);
        setByteField(term445614, term445614.getClass(), "minute", (byte) 51);
        setByteField(term445614, term445614.getClass(), "second", (byte) 41);
        setIntField(term445614, term445614.getClass(), "nano", 830322169);
        setField(term445609, term445609.getClass(), "time", term445614);
        setField(term444978, term444978.getClass(), "lastUpdateTime", term445609);
        setField(term444978, term444978.getClass(), "stageIndex", term445619);
        setField(term444978, term444978.getClass(), "stageResultIndex", term445621);
        setField(term444978, term444978.getClass(), "lastPvId", term445623);
        setField(term444978, term444978.getClass(), "levelNumber", term445625);
        setField(term444978, term444978.getClass(), "levelExp", term445627);
        setField(term444978, term444978.getClass(), "oldLevelNumber", term445629);
        setField(term444978, term444978.getClass(), "oldLevelExp", term445631);
        setField(term444978, term444978.getClass(), "vp", term445633);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.GameSession");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term444978, args);
    }

};


