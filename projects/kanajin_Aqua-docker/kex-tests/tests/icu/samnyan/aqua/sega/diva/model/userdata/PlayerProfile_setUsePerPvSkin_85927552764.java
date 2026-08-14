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
import java.lang.Boolean;

public class PlayerProfile_setUsePerPvSkin_85927552764 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term838233;
     Object term838838;

    public PlayerProfile_setUsePerPvSkin_85927552764() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term838847 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term838846 = ((Class) term838847).getDeclaredField((String) "MISS");
        ((Field) term838846).setAccessible(true);
        Object enum1807 = ((Field) term838846).get((Object) null);
        Class<? extends Object> term839224 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term839223 = ((Class) term839224).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term839223).setAccessible(true);
        Object enum1808 = ((Field) term839223).get((Object) null);
        Class<? extends Object> term839507 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term839506 = ((Class) term839507).getDeclaredField((String) "NORMAL");
        ((Field) term839506).setAccessible(true);
        Object enum1809 = ((Field) term839506).get((Object) null);
        Class<? extends Object> term839782 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term839781 = ((Class) term839782).getDeclaredField((String) "ORIGINAL");
        ((Field) term839781).setAccessible(true);
        Object enum1810 = ((Field) term839781).get((Object) null);
        Class<? extends Object> term840048 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term840047 = ((Class) term840048).getDeclaredField((String) "NONE");
        ((Field) term840047).setAccessible(true);
        Object enum1811 = ((Field) term840047).get((Object) null);
        term838233 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term838356 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term838357 = newInstance(Class.forName("java.time.LocalDate"));
        Object term838361 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term838233, term838233.getClass(), "id", 4530705892517898929L);
        setIntField(term838233, term838233.getClass(), "pdId", 1129688211);
        setField(term838233, term838233.getClass(), "playerName", "xxx");
        setIntField(term838233, term838233.getClass(), "vocaloidPoints", 300);
        setIntField(term838233, term838233.getClass(), "level", 1);
        setIntField(term838233, term838233.getClass(), "levelExp", 2126253731);
        setField(term838233, term838233.getClass(), "levelTitle", "xxx");
        setIntField(term838233, term838233.getClass(), "plateId", -1);
        setIntField(term838233, term838233.getClass(), "plateEffectId", -1);
        setField(term838233, term838233.getClass(), "passwordStatus", enum1807);
        setField(term838233, term838233.getClass(), "password", "**********");
        setBooleanField(term838233, term838233.getClass(), "preferPerPvModule", true);
        setBooleanField(term838233, term838233.getClass(), "preferCommonModule", false);
        setBooleanField(term838233, term838233.getClass(), "usePerPvSkin", true);
        setBooleanField(term838233, term838233.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term838233, term838233.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term838233, term838233.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term838233, term838233.getClass(), "usePerPvTouchSliderSe", true);
        setField(term838233, term838233.getClass(), "commonModule", "-999,-999,-999");
        setField(term838233, term838233.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term838357, term838357.getClass(), "year", 2026);
        setShortField(term838357, term838357.getClass(), "month", (short) 8);
        setShortField(term838357, term838357.getClass(), "day", (short) 12);
        setField(term838356, term838356.getClass(), "date", term838357);
        setByteField(term838361, term838361.getClass(), "hour", (byte) 2);
        setByteField(term838361, term838361.getClass(), "minute", (byte) 4);
        setByteField(term838361, term838361.getClass(), "second", (byte) 39);
        setIntField(term838361, term838361.getClass(), "nano", 204817000);
        setField(term838356, term838356.getClass(), "time", term838361);
        setField(term838233, term838233.getClass(), "commonModuleSetTime", term838356);
        setField(term838233, term838233.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term838233, term838233.getClass(), "commonSkin", -1);
        setIntField(term838233, term838233.getClass(), "headphoneVolume", 100);
        setBooleanField(term838233, term838233.getClass(), "buttonSeOn", true);
        setIntField(term838233, term838233.getClass(), "buttonSeVolume", 100);
        setIntField(term838233, term838233.getClass(), "sliderSeVolume", 100);
        setIntField(term838233, term838233.getClass(), "buttonSe", -1);
        setIntField(term838233, term838233.getClass(), "chainSlideSe", -1);
        setIntField(term838233, term838233.getClass(), "slideSe", -1);
        setIntField(term838233, term838233.getClass(), "sliderTouchSe", -1);
        setField(term838233, term838233.getClass(), "sortMode", enum1808);
        setIntField(term838233, term838233.getClass(), "nextPvId", -1);
        setField(term838233, term838233.getClass(), "nextDifficulty", enum1809);
        setField(term838233, term838233.getClass(), "nextEdition", enum1810);
        setBooleanField(term838233, term838233.getClass(), "showInterimRanking", true);
        setBooleanField(term838233, term838233.getClass(), "showClearStatus", true);
        setBooleanField(term838233, term838233.getClass(), "showGreatBorder", true);
        setBooleanField(term838233, term838233.getClass(), "showExcellentBorder", true);
        setBooleanField(term838233, term838233.getClass(), "showRivalBorder", true);
        setBooleanField(term838233, term838233.getClass(), "showRgoSetting", true);
        setBooleanField(term838233, term838233.getClass(), "contestNowPlayingEnable", true);
        setIntField(term838233, term838233.getClass(), "contestNowPlayingId", -1);
        setIntField(term838233, term838233.getClass(), "contestNowPlayingValue", -1);
        setField(term838233, term838233.getClass(), "contestNowPlayingResultRank", enum1811);
        setField(term838233, term838233.getClass(), "contestNowPlayingSpecifier", "");
        setField(term838233, term838233.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term838233, term838233.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term838233, term838233.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term838233, term838233.getClass(), "rivalPdId", -1);
        term838838 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term838838;
        callMethod(klass, "setUsePerPvSkin", argTypes, term838233, args);
    }

};


