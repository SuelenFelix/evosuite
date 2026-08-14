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

public class PlayerPvCustomize_setSlideSe_120030491720 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term999877;
     Object term1000604;

    public PlayerPvCustomize_setSlideSe_120030491720() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1000613 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term1000612 = ((Class) term1000613).getDeclaredField((String) "MISS");
        ((Field) term1000612).setAccessible(true);
        Object enum2120 = ((Field) term1000612).get((Object) null);
        Class<? extends Object> term1000990 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term1000989 = ((Class) term1000990).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term1000989).setAccessible(true);
        Object enum2121 = ((Field) term1000989).get((Object) null);
        Class<? extends Object> term1001273 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term1001272 = ((Class) term1001273).getDeclaredField((String) "NORMAL");
        ((Field) term1001272).setAccessible(true);
        Object enum2122 = ((Field) term1001272).get((Object) null);
        Class<? extends Object> term1001548 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term1001547 = ((Class) term1001548).getDeclaredField((String) "ORIGINAL");
        ((Field) term1001547).setAccessible(true);
        Object enum2123 = ((Field) term1001547).get((Object) null);
        Class<? extends Object> term1001814 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term1001813 = ((Class) term1001814).getDeclaredField((String) "NONE");
        ((Field) term1001813).setAccessible(true);
        Object enum2124 = ((Field) term1001813).get((Object) null);
        term999877 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvCustomize"));
        Object term999879 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term1000002 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1000003 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1000007 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term999877, term999877.getClass(), "id", -7006877527579112761L);
        setLongField(term999879, term999879.getClass(), "id", -8699693633047465617L);
        setIntField(term999879, term999879.getClass(), "pdId", -451590147);
        setField(term999879, term999879.getClass(), "playerName", "xxx");
        setIntField(term999879, term999879.getClass(), "vocaloidPoints", 300);
        setIntField(term999879, term999879.getClass(), "level", 1);
        setIntField(term999879, term999879.getClass(), "levelExp", -537090894);
        setField(term999879, term999879.getClass(), "levelTitle", "xxx");
        setIntField(term999879, term999879.getClass(), "plateId", -1);
        setIntField(term999879, term999879.getClass(), "plateEffectId", -1);
        setField(term999879, term999879.getClass(), "passwordStatus", enum2120);
        setField(term999879, term999879.getClass(), "password", "**********");
        setBooleanField(term999879, term999879.getClass(), "preferPerPvModule", true);
        setBooleanField(term999879, term999879.getClass(), "preferCommonModule", false);
        setBooleanField(term999879, term999879.getClass(), "usePerPvSkin", true);
        setBooleanField(term999879, term999879.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term999879, term999879.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term999879, term999879.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term999879, term999879.getClass(), "usePerPvTouchSliderSe", false);
        setField(term999879, term999879.getClass(), "commonModule", "-999,-999,-999");
        setField(term999879, term999879.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term1000003, term1000003.getClass(), "year", 2026);
        setShortField(term1000003, term1000003.getClass(), "month", (short) 8);
        setShortField(term1000003, term1000003.getClass(), "day", (short) 12);
        setField(term1000002, term1000002.getClass(), "date", term1000003);
        setByteField(term1000007, term1000007.getClass(), "hour", (byte) 2);
        setByteField(term1000007, term1000007.getClass(), "minute", (byte) 5);
        setByteField(term1000007, term1000007.getClass(), "second", (byte) 21);
        setIntField(term1000007, term1000007.getClass(), "nano", 383238000);
        setField(term1000002, term1000002.getClass(), "time", term1000007);
        setField(term999879, term999879.getClass(), "commonModuleSetTime", term1000002);
        setField(term999879, term999879.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term999879, term999879.getClass(), "commonSkin", -1);
        setIntField(term999879, term999879.getClass(), "headphoneVolume", 100);
        setBooleanField(term999879, term999879.getClass(), "buttonSeOn", true);
        setIntField(term999879, term999879.getClass(), "buttonSeVolume", 100);
        setIntField(term999879, term999879.getClass(), "sliderSeVolume", 100);
        setIntField(term999879, term999879.getClass(), "buttonSe", -1);
        setIntField(term999879, term999879.getClass(), "chainSlideSe", -1);
        setIntField(term999879, term999879.getClass(), "slideSe", -1);
        setIntField(term999879, term999879.getClass(), "sliderTouchSe", -1);
        setField(term999879, term999879.getClass(), "sortMode", enum2121);
        setIntField(term999879, term999879.getClass(), "nextPvId", -1);
        setField(term999879, term999879.getClass(), "nextDifficulty", enum2122);
        setField(term999879, term999879.getClass(), "nextEdition", enum2123);
        setBooleanField(term999879, term999879.getClass(), "showInterimRanking", true);
        setBooleanField(term999879, term999879.getClass(), "showClearStatus", true);
        setBooleanField(term999879, term999879.getClass(), "showGreatBorder", true);
        setBooleanField(term999879, term999879.getClass(), "showExcellentBorder", true);
        setBooleanField(term999879, term999879.getClass(), "showRivalBorder", true);
        setBooleanField(term999879, term999879.getClass(), "showRgoSetting", true);
        setBooleanField(term999879, term999879.getClass(), "contestNowPlayingEnable", false);
        setIntField(term999879, term999879.getClass(), "contestNowPlayingId", -1);
        setIntField(term999879, term999879.getClass(), "contestNowPlayingValue", -1);
        setField(term999879, term999879.getClass(), "contestNowPlayingResultRank", enum2124);
        setField(term999879, term999879.getClass(), "contestNowPlayingSpecifier", "");
        setField(term999879, term999879.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term999879, term999879.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term999879, term999879.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term999879, term999879.getClass(), "rivalPdId", -1);
        setField(term999877, term999877.getClass(), "pdId", term999879);
        setIntField(term999877, term999877.getClass(), "pvId", -1);
        setField(term999877, term999877.getClass(), "module", "-999,-999,-999");
        setField(term999877, term999877.getClass(), "customize", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setField(term999877, term999877.getClass(), "customizeFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term999877, term999877.getClass(), "skin", -1);
        setIntField(term999877, term999877.getClass(), "buttonSe", -1);
        setIntField(term999877, term999877.getClass(), "slideSe", -1);
        setIntField(term999877, term999877.getClass(), "chainSlideSe", -1);
        setIntField(term999877, term999877.getClass(), "sliderTouchSe", -1);
        term1000604 = new Integer(105089682);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvCustomize");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1000604;
        callMethod(klass, "setSlideSe", argTypes, term999877, args);
    }

};


