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
import java.lang.Long;
import java.lang.String;
import java.lang.Object;
import java.lang.Integer;

public class PlayerContest_init_98204150421 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53125;
     Object term53127;
     Object term53732;
     Object term53734;
     Object enum110;
     Object term53747;
     Object term53749;
     Object term53751;

    public PlayerContest_init_98204150421() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53125 = new Long(-6645965768855543712L);
        Class<? extends Object> term53768 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term53767 = ((Class) term53768).getDeclaredField((String) "MISS");
        ((Field) term53767).setAccessible(true);
        Object enum105 = ((Field) term53767).get((Object) null);
        Class<? extends Object> term54145 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term54144 = ((Class) term54145).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term54144).setAccessible(true);
        Object enum106 = ((Field) term54144).get((Object) null);
        Class<? extends Object> term54428 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term54427 = ((Class) term54428).getDeclaredField((String) "NORMAL");
        ((Field) term54427).setAccessible(true);
        Object enum107 = ((Field) term54427).get((Object) null);
        Class<? extends Object> term54703 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term54702 = ((Class) term54703).getDeclaredField((String) "ORIGINAL");
        ((Field) term54702).setAccessible(true);
        Object enum108 = ((Field) term54702).get((Object) null);
        Class<? extends Object> term54969 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term54968 = ((Class) term54969).getDeclaredField((String) "NONE");
        ((Field) term54968).setAccessible(true);
        Object enum109 = ((Field) term54968).get((Object) null);
        term53127 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term53250 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term53251 = newInstance(Class.forName("java.time.LocalDate"));
        Object term53255 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term53127, term53127.getClass(), "id", 4784595517102746672L);
        setIntField(term53127, term53127.getClass(), "pdId", -556405712);
        setField(term53127, term53127.getClass(), "playerName", "xxx");
        setIntField(term53127, term53127.getClass(), "vocaloidPoints", 300);
        setIntField(term53127, term53127.getClass(), "level", 1);
        setIntField(term53127, term53127.getClass(), "levelExp", -1772434990);
        setField(term53127, term53127.getClass(), "levelTitle", "xxx");
        setIntField(term53127, term53127.getClass(), "plateId", -1);
        setIntField(term53127, term53127.getClass(), "plateEffectId", -1);
        setField(term53127, term53127.getClass(), "passwordStatus", enum105);
        setField(term53127, term53127.getClass(), "password", "**********");
        setBooleanField(term53127, term53127.getClass(), "preferPerPvModule", true);
        setBooleanField(term53127, term53127.getClass(), "preferCommonModule", false);
        setBooleanField(term53127, term53127.getClass(), "usePerPvSkin", false);
        setBooleanField(term53127, term53127.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term53127, term53127.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term53127, term53127.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term53127, term53127.getClass(), "usePerPvTouchSliderSe", false);
        setField(term53127, term53127.getClass(), "commonModule", "-999,-999,-999");
        setField(term53127, term53127.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term53251, term53251.getClass(), "year", 2026);
        setShortField(term53251, term53251.getClass(), "month", (short) 8);
        setShortField(term53251, term53251.getClass(), "day", (short) 12);
        setField(term53250, term53250.getClass(), "date", term53251);
        setByteField(term53255, term53255.getClass(), "hour", (byte) 2);
        setByteField(term53255, term53255.getClass(), "minute", (byte) 2);
        setByteField(term53255, term53255.getClass(), "second", (byte) 33);
        setIntField(term53255, term53255.getClass(), "nano", 569068000);
        setField(term53250, term53250.getClass(), "time", term53255);
        setField(term53127, term53127.getClass(), "commonModuleSetTime", term53250);
        setField(term53127, term53127.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term53127, term53127.getClass(), "commonSkin", -1);
        setIntField(term53127, term53127.getClass(), "headphoneVolume", 100);
        setBooleanField(term53127, term53127.getClass(), "buttonSeOn", true);
        setIntField(term53127, term53127.getClass(), "buttonSeVolume", 100);
        setIntField(term53127, term53127.getClass(), "sliderSeVolume", 100);
        setIntField(term53127, term53127.getClass(), "buttonSe", -1);
        setIntField(term53127, term53127.getClass(), "chainSlideSe", -1);
        setIntField(term53127, term53127.getClass(), "slideSe", -1);
        setIntField(term53127, term53127.getClass(), "sliderTouchSe", -1);
        setField(term53127, term53127.getClass(), "sortMode", enum106);
        setIntField(term53127, term53127.getClass(), "nextPvId", -1);
        setField(term53127, term53127.getClass(), "nextDifficulty", enum107);
        setField(term53127, term53127.getClass(), "nextEdition", enum108);
        setBooleanField(term53127, term53127.getClass(), "showInterimRanking", true);
        setBooleanField(term53127, term53127.getClass(), "showClearStatus", true);
        setBooleanField(term53127, term53127.getClass(), "showGreatBorder", true);
        setBooleanField(term53127, term53127.getClass(), "showExcellentBorder", true);
        setBooleanField(term53127, term53127.getClass(), "showRivalBorder", true);
        setBooleanField(term53127, term53127.getClass(), "showRgoSetting", true);
        setBooleanField(term53127, term53127.getClass(), "contestNowPlayingEnable", false);
        setIntField(term53127, term53127.getClass(), "contestNowPlayingId", -1);
        setIntField(term53127, term53127.getClass(), "contestNowPlayingValue", -1);
        setField(term53127, term53127.getClass(), "contestNowPlayingResultRank", enum109);
        setField(term53127, term53127.getClass(), "contestNowPlayingSpecifier", "");
        setField(term53127, term53127.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term53127, term53127.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term53127, term53127.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term53127, term53127.getClass(), "rivalPdId", -1);
        term53732 = new Integer(-1845499264);
        term53734 = new Integer(-505439934);
        Class<? extends Object> term55610 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term55609 = ((Class) term55610).getDeclaredField((String) "BRONZE");
        ((Field) term55609).setAccessible(true);
        enum110 = ((Field) term55609).get((Object) null);
        term53747 = new Integer(-344842608);
        term53749 = new Integer(941650513);
        term53751 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term53752 = newInstance(Class.forName("java.time.LocalDate"));
        Object term53756 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term53752, term53752.getClass(), "year", 2021);
        setShortField(term53752, term53752.getClass(), "month", (short) 1);
        setShortField(term53752, term53752.getClass(), "day", (short) 18);
        setField(term53751, term53751.getClass(), "date", term53752);
        setByteField(term53756, term53756.getClass(), "hour", (byte) 13);
        setByteField(term53756, term53756.getClass(), "minute", (byte) 38);
        setByteField(term53756, term53756.getClass(), "second", (byte) 26);
        setIntField(term53756, term53756.getClass(), "nano", 544608644);
        setField(term53751, term53751.getClass(), "time", term53756);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerContest");
        Class<?>[] argTypes = new Class<?>[8];
        argTypes[0] = long.class;
        argTypes[1] = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = Class.forName("icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        argTypes[5] = int.class;
        argTypes[6] = int.class;
        argTypes[7] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[8];
        args[0] = term53125;
        args[1] = term53127;
        args[2] = term53732;
        args[3] = term53734;
        args[4] = enum110;
        args[5] = term53747;
        args[6] = term53749;
        args[7] = term53751;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


