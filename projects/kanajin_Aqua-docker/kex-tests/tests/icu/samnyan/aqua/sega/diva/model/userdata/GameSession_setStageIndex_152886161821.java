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

public class GameSession_setStageIndex_152886161821 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term417144;
     Object term417801;

    public GameSession_setStageIndex_152886161821() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term417810 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term417809 = ((Class) term417810).getDeclaredField((String) "MISS");
        ((Field) term417809).setAccessible(true);
        Object enum939 = ((Field) term417809).get((Object) null);
        Class<? extends Object> term418187 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term418186 = ((Class) term418187).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term418186).setAccessible(true);
        Object enum940 = ((Field) term418186).get((Object) null);
        Class<? extends Object> term418470 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term418469 = ((Class) term418470).getDeclaredField((String) "NORMAL");
        ((Field) term418469).setAccessible(true);
        Object enum941 = ((Field) term418469).get((Object) null);
        Class<? extends Object> term418745 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term418744 = ((Class) term418745).getDeclaredField((String) "ORIGINAL");
        ((Field) term418744).setAccessible(true);
        Object enum942 = ((Field) term418744).get((Object) null);
        Class<? extends Object> term419011 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term419010 = ((Class) term419011).getDeclaredField((String) "NONE");
        ((Field) term419010).setAccessible(true);
        Object enum943 = ((Field) term419010).get((Object) null);
        Class<? extends Object> term419652 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.StartMode");
        Field term419651 = ((Class) term419652).getDeclaredField((String) "PRE_START");
        ((Field) term419651).setAccessible(true);
        Object enum944 = ((Field) term419651).get((Object) null);
        Integer term417785 = new Integer(-2014576105);
        Integer term417787 = new Integer(1296895584);
        Integer term417789 = new Integer(628918458);
        Integer term417791 = new Integer(-1274456137);
        Integer term417793 = new Integer(1041916673);
        Integer term417795 = new Integer(-601863069);
        Integer term417797 = new Integer(663292551);
        Integer term417799 = new Integer(-1885090354);
        term417144 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.GameSession"));
        Object term417147 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term417270 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term417271 = newInstance(Class.forName("java.time.LocalDate"));
        Object term417275 = newInstance(Class.forName("java.time.LocalTime"));
        Object term417765 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term417766 = newInstance(Class.forName("java.time.LocalDate"));
        Object term417770 = newInstance(Class.forName("java.time.LocalTime"));
        Object term417775 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term417776 = newInstance(Class.forName("java.time.LocalDate"));
        Object term417780 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term417144, term417144.getClass(), "id", 5184635470881147510L);
        setIntField(term417144, term417144.getClass(), "acceptId", 680031965);
        setLongField(term417147, term417147.getClass(), "id", 918397384129253729L);
        setIntField(term417147, term417147.getClass(), "pdId", -2112419098);
        setField(term417147, term417147.getClass(), "playerName", "xxx");
        setIntField(term417147, term417147.getClass(), "vocaloidPoints", 300);
        setIntField(term417147, term417147.getClass(), "level", 1);
        setIntField(term417147, term417147.getClass(), "levelExp", -1649429373);
        setField(term417147, term417147.getClass(), "levelTitle", "xxx");
        setIntField(term417147, term417147.getClass(), "plateId", -1);
        setIntField(term417147, term417147.getClass(), "plateEffectId", -1);
        setField(term417147, term417147.getClass(), "passwordStatus", enum939);
        setField(term417147, term417147.getClass(), "password", "**********");
        setBooleanField(term417147, term417147.getClass(), "preferPerPvModule", true);
        setBooleanField(term417147, term417147.getClass(), "preferCommonModule", true);
        setBooleanField(term417147, term417147.getClass(), "usePerPvSkin", false);
        setBooleanField(term417147, term417147.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term417147, term417147.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term417147, term417147.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term417147, term417147.getClass(), "usePerPvTouchSliderSe", true);
        setField(term417147, term417147.getClass(), "commonModule", "-999,-999,-999");
        setField(term417147, term417147.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term417271, term417271.getClass(), "year", 2026);
        setShortField(term417271, term417271.getClass(), "month", (short) 8);
        setShortField(term417271, term417271.getClass(), "day", (short) 12);
        setField(term417270, term417270.getClass(), "date", term417271);
        setByteField(term417275, term417275.getClass(), "hour", (byte) 2);
        setByteField(term417275, term417275.getClass(), "minute", (byte) 3);
        setByteField(term417275, term417275.getClass(), "second", (byte) 27);
        setIntField(term417275, term417275.getClass(), "nano", 6879000);
        setField(term417270, term417270.getClass(), "time", term417275);
        setField(term417147, term417147.getClass(), "commonModuleSetTime", term417270);
        setField(term417147, term417147.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term417147, term417147.getClass(), "commonSkin", -1);
        setIntField(term417147, term417147.getClass(), "headphoneVolume", 100);
        setBooleanField(term417147, term417147.getClass(), "buttonSeOn", true);
        setIntField(term417147, term417147.getClass(), "buttonSeVolume", 100);
        setIntField(term417147, term417147.getClass(), "sliderSeVolume", 100);
        setIntField(term417147, term417147.getClass(), "buttonSe", -1);
        setIntField(term417147, term417147.getClass(), "chainSlideSe", -1);
        setIntField(term417147, term417147.getClass(), "slideSe", -1);
        setIntField(term417147, term417147.getClass(), "sliderTouchSe", -1);
        setField(term417147, term417147.getClass(), "sortMode", enum940);
        setIntField(term417147, term417147.getClass(), "nextPvId", -1);
        setField(term417147, term417147.getClass(), "nextDifficulty", enum941);
        setField(term417147, term417147.getClass(), "nextEdition", enum942);
        setBooleanField(term417147, term417147.getClass(), "showInterimRanking", true);
        setBooleanField(term417147, term417147.getClass(), "showClearStatus", true);
        setBooleanField(term417147, term417147.getClass(), "showGreatBorder", true);
        setBooleanField(term417147, term417147.getClass(), "showExcellentBorder", true);
        setBooleanField(term417147, term417147.getClass(), "showRivalBorder", true);
        setBooleanField(term417147, term417147.getClass(), "showRgoSetting", true);
        setBooleanField(term417147, term417147.getClass(), "contestNowPlayingEnable", false);
        setIntField(term417147, term417147.getClass(), "contestNowPlayingId", -1);
        setIntField(term417147, term417147.getClass(), "contestNowPlayingValue", -1);
        setField(term417147, term417147.getClass(), "contestNowPlayingResultRank", enum943);
        setField(term417147, term417147.getClass(), "contestNowPlayingSpecifier", "");
        setField(term417147, term417147.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term417147, term417147.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term417147, term417147.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term417147, term417147.getClass(), "rivalPdId", -1);
        setField(term417144, term417144.getClass(), "pdId", term417147);
        setField(term417144, term417144.getClass(), "startMode", enum944);
        setIntField(term417766, term417766.getClass(), "year", 2014);
        setShortField(term417766, term417766.getClass(), "month", (short) 8);
        setShortField(term417766, term417766.getClass(), "day", (short) 13);
        setField(term417765, term417765.getClass(), "date", term417766);
        setByteField(term417770, term417770.getClass(), "hour", (byte) 13);
        setByteField(term417770, term417770.getClass(), "minute", (byte) 15);
        setByteField(term417770, term417770.getClass(), "second", (byte) 51);
        setIntField(term417770, term417770.getClass(), "nano", 433726678);
        setField(term417765, term417765.getClass(), "time", term417770);
        setField(term417144, term417144.getClass(), "startTime", term417765);
        setIntField(term417776, term417776.getClass(), "year", 2012);
        setShortField(term417776, term417776.getClass(), "month", (short) 5);
        setShortField(term417776, term417776.getClass(), "day", (short) 25);
        setField(term417775, term417775.getClass(), "date", term417776);
        setByteField(term417780, term417780.getClass(), "hour", (byte) 5);
        setByteField(term417780, term417780.getClass(), "minute", (byte) 8);
        setByteField(term417780, term417780.getClass(), "second", (byte) 47);
        setIntField(term417780, term417780.getClass(), "nano", 455554221);
        setField(term417775, term417775.getClass(), "time", term417780);
        setField(term417144, term417144.getClass(), "lastUpdateTime", term417775);
        setField(term417144, term417144.getClass(), "stageIndex", term417785);
        setField(term417144, term417144.getClass(), "stageResultIndex", term417787);
        setField(term417144, term417144.getClass(), "lastPvId", term417789);
        setField(term417144, term417144.getClass(), "levelNumber", term417791);
        setField(term417144, term417144.getClass(), "levelExp", term417793);
        setField(term417144, term417144.getClass(), "oldLevelNumber", term417795);
        setField(term417144, term417144.getClass(), "oldLevelExp", term417797);
        setField(term417144, term417144.getClass(), "vp", term417799);
        term417801 = new Integer(-2066804303);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.GameSession");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term417801;
        callMethod(klass, "setStageIndex", argTypes, term417144, args);
    }

};


