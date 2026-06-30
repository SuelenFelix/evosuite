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

public class PlayerProfile_getPassword_29676633411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term708140;

    public PlayerProfile_getPassword_29676633411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term708752 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term708751 = ((Class) term708752).getDeclaredField((String) "MISS");
        ((Field) term708751).setAccessible(true);
        Object enum1542 = ((Field) term708751).get((Object) null);
        Class<? extends Object> term709129 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term709128 = ((Class) term709129).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term709128).setAccessible(true);
        Object enum1543 = ((Field) term709128).get((Object) null);
        Class<? extends Object> term709412 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term709411 = ((Class) term709412).getDeclaredField((String) "NORMAL");
        ((Field) term709411).setAccessible(true);
        Object enum1544 = ((Field) term709411).get((Object) null);
        Class<? extends Object> term709687 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term709686 = ((Class) term709687).getDeclaredField((String) "ORIGINAL");
        ((Field) term709686).setAccessible(true);
        Object enum1545 = ((Field) term709686).get((Object) null);
        Class<? extends Object> term709953 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term709952 = ((Class) term709953).getDeclaredField((String) "NONE");
        ((Field) term709952).setAccessible(true);
        Object enum1546 = ((Field) term709952).get((Object) null);
        term708140 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term708263 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term708264 = newInstance(Class.forName("java.time.LocalDate"));
        Object term708268 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term708140, term708140.getClass(), "id", 2990264647913003810L);
        setIntField(term708140, term708140.getClass(), "pdId", 1780832439);
        setField(term708140, term708140.getClass(), "playerName", "xxx");
        setIntField(term708140, term708140.getClass(), "vocaloidPoints", 300);
        setIntField(term708140, term708140.getClass(), "level", 1);
        setIntField(term708140, term708140.getClass(), "levelExp", 1781593194);
        setField(term708140, term708140.getClass(), "levelTitle", "xxx");
        setIntField(term708140, term708140.getClass(), "plateId", -1);
        setIntField(term708140, term708140.getClass(), "plateEffectId", -1);
        setField(term708140, term708140.getClass(), "passwordStatus", enum1542);
        setField(term708140, term708140.getClass(), "password", "**********");
        setBooleanField(term708140, term708140.getClass(), "preferPerPvModule", true);
        setBooleanField(term708140, term708140.getClass(), "preferCommonModule", true);
        setBooleanField(term708140, term708140.getClass(), "usePerPvSkin", true);
        setBooleanField(term708140, term708140.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term708140, term708140.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term708140, term708140.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term708140, term708140.getClass(), "usePerPvTouchSliderSe", false);
        setField(term708140, term708140.getClass(), "commonModule", "-999,-999,-999");
        setField(term708140, term708140.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term708264, term708264.getClass(), "year", 2026);
        setShortField(term708264, term708264.getClass(), "month", (short) 6);
        setShortField(term708264, term708264.getClass(), "day", (short) 29);
        setField(term708263, term708263.getClass(), "date", term708264);
        setByteField(term708268, term708268.getClass(), "hour", (byte) 4);
        setByteField(term708268, term708268.getClass(), "minute", (byte) 29);
        setByteField(term708268, term708268.getClass(), "second", (byte) 12);
        setIntField(term708268, term708268.getClass(), "nano", 75646000);
        setField(term708263, term708263.getClass(), "time", term708268);
        setField(term708140, term708140.getClass(), "commonModuleSetTime", term708263);
        setField(term708140, term708140.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term708140, term708140.getClass(), "commonSkin", -1);
        setIntField(term708140, term708140.getClass(), "headphoneVolume", 100);
        setBooleanField(term708140, term708140.getClass(), "buttonSeOn", true);
        setIntField(term708140, term708140.getClass(), "buttonSeVolume", 100);
        setIntField(term708140, term708140.getClass(), "sliderSeVolume", 100);
        setIntField(term708140, term708140.getClass(), "buttonSe", -1);
        setIntField(term708140, term708140.getClass(), "chainSlideSe", -1);
        setIntField(term708140, term708140.getClass(), "slideSe", -1);
        setIntField(term708140, term708140.getClass(), "sliderTouchSe", -1);
        setField(term708140, term708140.getClass(), "sortMode", enum1543);
        setIntField(term708140, term708140.getClass(), "nextPvId", -1);
        setField(term708140, term708140.getClass(), "nextDifficulty", enum1544);
        setField(term708140, term708140.getClass(), "nextEdition", enum1545);
        setBooleanField(term708140, term708140.getClass(), "showInterimRanking", true);
        setBooleanField(term708140, term708140.getClass(), "showClearStatus", true);
        setBooleanField(term708140, term708140.getClass(), "showGreatBorder", true);
        setBooleanField(term708140, term708140.getClass(), "showExcellentBorder", true);
        setBooleanField(term708140, term708140.getClass(), "showRivalBorder", true);
        setBooleanField(term708140, term708140.getClass(), "showRgoSetting", true);
        setBooleanField(term708140, term708140.getClass(), "contestNowPlayingEnable", false);
        setIntField(term708140, term708140.getClass(), "contestNowPlayingId", -1);
        setIntField(term708140, term708140.getClass(), "contestNowPlayingValue", -1);
        setField(term708140, term708140.getClass(), "contestNowPlayingResultRank", enum1546);
        setField(term708140, term708140.getClass(), "contestNowPlayingSpecifier", "");
        setField(term708140, term708140.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term708140, term708140.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term708140, term708140.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term708140, term708140.getClass(), "rivalPdId", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPassword", argTypes, term708140, args);
    }

};


