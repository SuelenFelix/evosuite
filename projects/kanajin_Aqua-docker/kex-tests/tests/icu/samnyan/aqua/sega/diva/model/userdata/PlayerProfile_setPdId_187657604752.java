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
import java.lang.String;
import java.lang.Object;
import java.lang.Integer;

public class PlayerProfile_setPdId_187657604752 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term808715;
     Object term809320;

    public PlayerProfile_setPdId_187657604752() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term809329 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term809328 = ((Class) term809329).getDeclaredField((String) "MISS");
        ((Field) term809328).setAccessible(true);
        Object enum1747 = ((Field) term809328).get((Object) null);
        Class<? extends Object> term809706 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term809705 = ((Class) term809706).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term809705).setAccessible(true);
        Object enum1748 = ((Field) term809705).get((Object) null);
        Class<? extends Object> term809989 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term809988 = ((Class) term809989).getDeclaredField((String) "NORMAL");
        ((Field) term809988).setAccessible(true);
        Object enum1749 = ((Field) term809988).get((Object) null);
        Class<? extends Object> term810264 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term810263 = ((Class) term810264).getDeclaredField((String) "ORIGINAL");
        ((Field) term810263).setAccessible(true);
        Object enum1750 = ((Field) term810263).get((Object) null);
        Class<? extends Object> term810530 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term810529 = ((Class) term810530).getDeclaredField((String) "NONE");
        ((Field) term810529).setAccessible(true);
        Object enum1751 = ((Field) term810529).get((Object) null);
        term808715 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term808838 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term808839 = newInstance(Class.forName("java.time.LocalDate"));
        Object term808843 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term808715, term808715.getClass(), "id", 6269054578518955349L);
        setIntField(term808715, term808715.getClass(), "pdId", 366996139);
        setField(term808715, term808715.getClass(), "playerName", "xxx");
        setIntField(term808715, term808715.getClass(), "vocaloidPoints", 300);
        setIntField(term808715, term808715.getClass(), "level", 1);
        setIntField(term808715, term808715.getClass(), "levelExp", 806187937);
        setField(term808715, term808715.getClass(), "levelTitle", "xxx");
        setIntField(term808715, term808715.getClass(), "plateId", -1);
        setIntField(term808715, term808715.getClass(), "plateEffectId", -1);
        setField(term808715, term808715.getClass(), "passwordStatus", enum1747);
        setField(term808715, term808715.getClass(), "password", "**********");
        setBooleanField(term808715, term808715.getClass(), "preferPerPvModule", true);
        setBooleanField(term808715, term808715.getClass(), "preferCommonModule", false);
        setBooleanField(term808715, term808715.getClass(), "usePerPvSkin", true);
        setBooleanField(term808715, term808715.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term808715, term808715.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term808715, term808715.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term808715, term808715.getClass(), "usePerPvTouchSliderSe", true);
        setField(term808715, term808715.getClass(), "commonModule", "-999,-999,-999");
        setField(term808715, term808715.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term808839, term808839.getClass(), "year", 2026);
        setShortField(term808839, term808839.getClass(), "month", (short) 6);
        setShortField(term808839, term808839.getClass(), "day", (short) 29);
        setField(term808838, term808838.getClass(), "date", term808839);
        setByteField(term808843, term808843.getClass(), "hour", (byte) 4);
        setByteField(term808843, term808843.getClass(), "minute", (byte) 29);
        setByteField(term808843, term808843.getClass(), "second", (byte) 22);
        setIntField(term808843, term808843.getClass(), "nano", 608569000);
        setField(term808838, term808838.getClass(), "time", term808843);
        setField(term808715, term808715.getClass(), "commonModuleSetTime", term808838);
        setField(term808715, term808715.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term808715, term808715.getClass(), "commonSkin", -1);
        setIntField(term808715, term808715.getClass(), "headphoneVolume", 100);
        setBooleanField(term808715, term808715.getClass(), "buttonSeOn", true);
        setIntField(term808715, term808715.getClass(), "buttonSeVolume", 100);
        setIntField(term808715, term808715.getClass(), "sliderSeVolume", 100);
        setIntField(term808715, term808715.getClass(), "buttonSe", -1);
        setIntField(term808715, term808715.getClass(), "chainSlideSe", -1);
        setIntField(term808715, term808715.getClass(), "slideSe", -1);
        setIntField(term808715, term808715.getClass(), "sliderTouchSe", -1);
        setField(term808715, term808715.getClass(), "sortMode", enum1748);
        setIntField(term808715, term808715.getClass(), "nextPvId", -1);
        setField(term808715, term808715.getClass(), "nextDifficulty", enum1749);
        setField(term808715, term808715.getClass(), "nextEdition", enum1750);
        setBooleanField(term808715, term808715.getClass(), "showInterimRanking", true);
        setBooleanField(term808715, term808715.getClass(), "showClearStatus", true);
        setBooleanField(term808715, term808715.getClass(), "showGreatBorder", true);
        setBooleanField(term808715, term808715.getClass(), "showExcellentBorder", true);
        setBooleanField(term808715, term808715.getClass(), "showRivalBorder", true);
        setBooleanField(term808715, term808715.getClass(), "showRgoSetting", true);
        setBooleanField(term808715, term808715.getClass(), "contestNowPlayingEnable", false);
        setIntField(term808715, term808715.getClass(), "contestNowPlayingId", -1);
        setIntField(term808715, term808715.getClass(), "contestNowPlayingValue", -1);
        setField(term808715, term808715.getClass(), "contestNowPlayingResultRank", enum1751);
        setField(term808715, term808715.getClass(), "contestNowPlayingSpecifier", "");
        setField(term808715, term808715.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term808715, term808715.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term808715, term808715.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term808715, term808715.getClass(), "rivalPdId", -1);
        term809320 = new Integer(-1646415676);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term809320;
        callMethod(klass, "setPdId", argTypes, term808715, args);
    }

};


