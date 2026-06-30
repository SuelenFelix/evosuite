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
import java.lang.Long;

public class PlayerPvCustomize_setId_4147143112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term977312;
     Object term978039;

    public PlayerPvCustomize_setId_4147143112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term978048 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term978047 = ((Class) term978048).getDeclaredField((String) "MISS");
        ((Field) term978047).setAccessible(true);
        Object enum2080 = ((Field) term978047).get((Object) null);
        Class<? extends Object> term978425 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term978424 = ((Class) term978425).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term978424).setAccessible(true);
        Object enum2081 = ((Field) term978424).get((Object) null);
        Class<? extends Object> term978708 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term978707 = ((Class) term978708).getDeclaredField((String) "NORMAL");
        ((Field) term978707).setAccessible(true);
        Object enum2082 = ((Field) term978707).get((Object) null);
        Class<? extends Object> term978983 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term978982 = ((Class) term978983).getDeclaredField((String) "ORIGINAL");
        ((Field) term978982).setAccessible(true);
        Object enum2083 = ((Field) term978982).get((Object) null);
        Class<? extends Object> term979249 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term979248 = ((Class) term979249).getDeclaredField((String) "NONE");
        ((Field) term979248).setAccessible(true);
        Object enum2084 = ((Field) term979248).get((Object) null);
        term977312 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvCustomize"));
        Object term977314 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term977437 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term977438 = newInstance(Class.forName("java.time.LocalDate"));
        Object term977442 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term977312, term977312.getClass(), "id", -2720964670491002091L);
        setLongField(term977314, term977314.getClass(), "id", -723697646775816649L);
        setIntField(term977314, term977314.getClass(), "pdId", -1463148153);
        setField(term977314, term977314.getClass(), "playerName", "xxx");
        setIntField(term977314, term977314.getClass(), "vocaloidPoints", 300);
        setIntField(term977314, term977314.getClass(), "level", 1);
        setIntField(term977314, term977314.getClass(), "levelExp", -121679722);
        setField(term977314, term977314.getClass(), "levelTitle", "xxx");
        setIntField(term977314, term977314.getClass(), "plateId", -1);
        setIntField(term977314, term977314.getClass(), "plateEffectId", -1);
        setField(term977314, term977314.getClass(), "passwordStatus", enum2080);
        setField(term977314, term977314.getClass(), "password", "**********");
        setBooleanField(term977314, term977314.getClass(), "preferPerPvModule", true);
        setBooleanField(term977314, term977314.getClass(), "preferCommonModule", true);
        setBooleanField(term977314, term977314.getClass(), "usePerPvSkin", true);
        setBooleanField(term977314, term977314.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term977314, term977314.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term977314, term977314.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term977314, term977314.getClass(), "usePerPvTouchSliderSe", false);
        setField(term977314, term977314.getClass(), "commonModule", "-999,-999,-999");
        setField(term977314, term977314.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term977438, term977438.getClass(), "year", 2026);
        setShortField(term977438, term977438.getClass(), "month", (short) 6);
        setShortField(term977438, term977438.getClass(), "day", (short) 29);
        setField(term977437, term977437.getClass(), "date", term977438);
        setByteField(term977442, term977442.getClass(), "hour", (byte) 4);
        setByteField(term977442, term977442.getClass(), "minute", (byte) 30);
        setByteField(term977442, term977442.getClass(), "second", (byte) 7);
        setIntField(term977442, term977442.getClass(), "nano", 192628000);
        setField(term977437, term977437.getClass(), "time", term977442);
        setField(term977314, term977314.getClass(), "commonModuleSetTime", term977437);
        setField(term977314, term977314.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term977314, term977314.getClass(), "commonSkin", -1);
        setIntField(term977314, term977314.getClass(), "headphoneVolume", 100);
        setBooleanField(term977314, term977314.getClass(), "buttonSeOn", true);
        setIntField(term977314, term977314.getClass(), "buttonSeVolume", 100);
        setIntField(term977314, term977314.getClass(), "sliderSeVolume", 100);
        setIntField(term977314, term977314.getClass(), "buttonSe", -1);
        setIntField(term977314, term977314.getClass(), "chainSlideSe", -1);
        setIntField(term977314, term977314.getClass(), "slideSe", -1);
        setIntField(term977314, term977314.getClass(), "sliderTouchSe", -1);
        setField(term977314, term977314.getClass(), "sortMode", enum2081);
        setIntField(term977314, term977314.getClass(), "nextPvId", -1);
        setField(term977314, term977314.getClass(), "nextDifficulty", enum2082);
        setField(term977314, term977314.getClass(), "nextEdition", enum2083);
        setBooleanField(term977314, term977314.getClass(), "showInterimRanking", true);
        setBooleanField(term977314, term977314.getClass(), "showClearStatus", true);
        setBooleanField(term977314, term977314.getClass(), "showGreatBorder", true);
        setBooleanField(term977314, term977314.getClass(), "showExcellentBorder", true);
        setBooleanField(term977314, term977314.getClass(), "showRivalBorder", true);
        setBooleanField(term977314, term977314.getClass(), "showRgoSetting", true);
        setBooleanField(term977314, term977314.getClass(), "contestNowPlayingEnable", false);
        setIntField(term977314, term977314.getClass(), "contestNowPlayingId", -1);
        setIntField(term977314, term977314.getClass(), "contestNowPlayingValue", -1);
        setField(term977314, term977314.getClass(), "contestNowPlayingResultRank", enum2084);
        setField(term977314, term977314.getClass(), "contestNowPlayingSpecifier", "");
        setField(term977314, term977314.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term977314, term977314.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term977314, term977314.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term977314, term977314.getClass(), "rivalPdId", -1);
        setField(term977312, term977312.getClass(), "pdId", term977314);
        setIntField(term977312, term977312.getClass(), "pvId", -1);
        setField(term977312, term977312.getClass(), "module", "-999,-999,-999");
        setField(term977312, term977312.getClass(), "customize", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setField(term977312, term977312.getClass(), "customizeFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term977312, term977312.getClass(), "skin", -1);
        setIntField(term977312, term977312.getClass(), "buttonSe", -1);
        setIntField(term977312, term977312.getClass(), "slideSe", -1);
        setIntField(term977312, term977312.getClass(), "chainSlideSe", -1);
        setIntField(term977312, term977312.getClass(), "sliderTouchSe", -1);
        term978039 = new Long(-5671086125367688052L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvCustomize");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term978039;
        callMethod(klass, "setId", argTypes, term977312, args);
    }

};


