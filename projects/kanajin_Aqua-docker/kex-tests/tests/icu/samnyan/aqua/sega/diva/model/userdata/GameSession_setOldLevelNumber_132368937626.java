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

public class GameSession_setOldLevelNumber_132368937626 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term431042;
     Object term431699;

    public GameSession_setOldLevelNumber_132368937626() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term431708 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term431707 = ((Class) term431708).getDeclaredField((String) "MISS");
        ((Field) term431707).setAccessible(true);
        Object enum969 = ((Field) term431707).get((Object) null);
        Class<? extends Object> term432085 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term432084 = ((Class) term432085).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term432084).setAccessible(true);
        Object enum970 = ((Field) term432084).get((Object) null);
        Class<? extends Object> term432368 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term432367 = ((Class) term432368).getDeclaredField((String) "NORMAL");
        ((Field) term432367).setAccessible(true);
        Object enum971 = ((Field) term432367).get((Object) null);
        Class<? extends Object> term432643 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term432642 = ((Class) term432643).getDeclaredField((String) "ORIGINAL");
        ((Field) term432642).setAccessible(true);
        Object enum972 = ((Field) term432642).get((Object) null);
        Class<? extends Object> term432909 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term432908 = ((Class) term432909).getDeclaredField((String) "NONE");
        ((Field) term432908).setAccessible(true);
        Object enum973 = ((Field) term432908).get((Object) null);
        Class<? extends Object> term433550 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.StartMode");
        Field term433549 = ((Class) term433550).getDeclaredField((String) "PRE_START");
        ((Field) term433549).setAccessible(true);
        Object enum974 = ((Field) term433549).get((Object) null);
        Integer term431683 = new Integer(-749861210);
        Integer term431685 = new Integer(1694224101);
        Integer term431687 = new Integer(937859191);
        Integer term431689 = new Integer(-916584829);
        Integer term431691 = new Integer(-2131181468);
        Integer term431693 = new Integer(282916351);
        Integer term431695 = new Integer(880977281);
        Integer term431697 = new Integer(371943306);
        term431042 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.GameSession"));
        Object term431045 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term431168 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term431169 = newInstance(Class.forName("java.time.LocalDate"));
        Object term431173 = newInstance(Class.forName("java.time.LocalTime"));
        Object term431663 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term431664 = newInstance(Class.forName("java.time.LocalDate"));
        Object term431668 = newInstance(Class.forName("java.time.LocalTime"));
        Object term431673 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term431674 = newInstance(Class.forName("java.time.LocalDate"));
        Object term431678 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term431042, term431042.getClass(), "id", 7271112616766426991L);
        setIntField(term431042, term431042.getClass(), "acceptId", -453010858);
        setLongField(term431045, term431045.getClass(), "id", -8514728180792822493L);
        setIntField(term431045, term431045.getClass(), "pdId", -1855427206);
        setField(term431045, term431045.getClass(), "playerName", "xxx");
        setIntField(term431045, term431045.getClass(), "vocaloidPoints", 300);
        setIntField(term431045, term431045.getClass(), "level", 1);
        setIntField(term431045, term431045.getClass(), "levelExp", -647618746);
        setField(term431045, term431045.getClass(), "levelTitle", "xxx");
        setIntField(term431045, term431045.getClass(), "plateId", -1);
        setIntField(term431045, term431045.getClass(), "plateEffectId", -1);
        setField(term431045, term431045.getClass(), "passwordStatus", enum969);
        setField(term431045, term431045.getClass(), "password", "**********");
        setBooleanField(term431045, term431045.getClass(), "preferPerPvModule", true);
        setBooleanField(term431045, term431045.getClass(), "preferCommonModule", true);
        setBooleanField(term431045, term431045.getClass(), "usePerPvSkin", true);
        setBooleanField(term431045, term431045.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term431045, term431045.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term431045, term431045.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term431045, term431045.getClass(), "usePerPvTouchSliderSe", true);
        setField(term431045, term431045.getClass(), "commonModule", "-999,-999,-999");
        setField(term431045, term431045.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term431169, term431169.getClass(), "year", 2026);
        setShortField(term431169, term431169.getClass(), "month", (short) 8);
        setShortField(term431169, term431169.getClass(), "day", (short) 12);
        setField(term431168, term431168.getClass(), "date", term431169);
        setByteField(term431173, term431173.getClass(), "hour", (byte) 2);
        setByteField(term431173, term431173.getClass(), "minute", (byte) 3);
        setByteField(term431173, term431173.getClass(), "second", (byte) 28);
        setIntField(term431173, term431173.getClass(), "nano", 242431000);
        setField(term431168, term431168.getClass(), "time", term431173);
        setField(term431045, term431045.getClass(), "commonModuleSetTime", term431168);
        setField(term431045, term431045.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term431045, term431045.getClass(), "commonSkin", -1);
        setIntField(term431045, term431045.getClass(), "headphoneVolume", 100);
        setBooleanField(term431045, term431045.getClass(), "buttonSeOn", true);
        setIntField(term431045, term431045.getClass(), "buttonSeVolume", 100);
        setIntField(term431045, term431045.getClass(), "sliderSeVolume", 100);
        setIntField(term431045, term431045.getClass(), "buttonSe", -1);
        setIntField(term431045, term431045.getClass(), "chainSlideSe", -1);
        setIntField(term431045, term431045.getClass(), "slideSe", -1);
        setIntField(term431045, term431045.getClass(), "sliderTouchSe", -1);
        setField(term431045, term431045.getClass(), "sortMode", enum970);
        setIntField(term431045, term431045.getClass(), "nextPvId", -1);
        setField(term431045, term431045.getClass(), "nextDifficulty", enum971);
        setField(term431045, term431045.getClass(), "nextEdition", enum972);
        setBooleanField(term431045, term431045.getClass(), "showInterimRanking", true);
        setBooleanField(term431045, term431045.getClass(), "showClearStatus", true);
        setBooleanField(term431045, term431045.getClass(), "showGreatBorder", true);
        setBooleanField(term431045, term431045.getClass(), "showExcellentBorder", true);
        setBooleanField(term431045, term431045.getClass(), "showRivalBorder", true);
        setBooleanField(term431045, term431045.getClass(), "showRgoSetting", true);
        setBooleanField(term431045, term431045.getClass(), "contestNowPlayingEnable", true);
        setIntField(term431045, term431045.getClass(), "contestNowPlayingId", -1);
        setIntField(term431045, term431045.getClass(), "contestNowPlayingValue", -1);
        setField(term431045, term431045.getClass(), "contestNowPlayingResultRank", enum973);
        setField(term431045, term431045.getClass(), "contestNowPlayingSpecifier", "");
        setField(term431045, term431045.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term431045, term431045.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term431045, term431045.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term431045, term431045.getClass(), "rivalPdId", -1);
        setField(term431042, term431042.getClass(), "pdId", term431045);
        setField(term431042, term431042.getClass(), "startMode", enum974);
        setIntField(term431664, term431664.getClass(), "year", 2012);
        setShortField(term431664, term431664.getClass(), "month", (short) 10);
        setShortField(term431664, term431664.getClass(), "day", (short) 1);
        setField(term431663, term431663.getClass(), "date", term431664);
        setByteField(term431668, term431668.getClass(), "hour", (byte) 9);
        setByteField(term431668, term431668.getClass(), "minute", (byte) 27);
        setByteField(term431668, term431668.getClass(), "second", (byte) 33);
        setIntField(term431668, term431668.getClass(), "nano", 714912000);
        setField(term431663, term431663.getClass(), "time", term431668);
        setField(term431042, term431042.getClass(), "startTime", term431663);
        setIntField(term431674, term431674.getClass(), "year", 2010);
        setShortField(term431674, term431674.getClass(), "month", (short) 1);
        setShortField(term431674, term431674.getClass(), "day", (short) 10);
        setField(term431673, term431673.getClass(), "date", term431674);
        setByteField(term431678, term431678.getClass(), "hour", (byte) 12);
        setByteField(term431678, term431678.getClass(), "minute", (byte) 46);
        setByteField(term431678, term431678.getClass(), "second", (byte) 5);
        setIntField(term431678, term431678.getClass(), "nano", 540440953);
        setField(term431673, term431673.getClass(), "time", term431678);
        setField(term431042, term431042.getClass(), "lastUpdateTime", term431673);
        setField(term431042, term431042.getClass(), "stageIndex", term431683);
        setField(term431042, term431042.getClass(), "stageResultIndex", term431685);
        setField(term431042, term431042.getClass(), "lastPvId", term431687);
        setField(term431042, term431042.getClass(), "levelNumber", term431689);
        setField(term431042, term431042.getClass(), "levelExp", term431691);
        setField(term431042, term431042.getClass(), "oldLevelNumber", term431693);
        setField(term431042, term431042.getClass(), "oldLevelExp", term431695);
        setField(term431042, term431042.getClass(), "vp", term431697);
        term431699 = new Integer(982388293);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.GameSession");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term431699;
        callMethod(klass, "setOldLevelNumber", argTypes, term431042, args);
    }

};


