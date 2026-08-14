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

public class PlayerModule_getModuleId_1362070703 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term660408;

    public PlayerModule_getModuleId_1362070703() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term661023 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term661022 = ((Class) term661023).getDeclaredField((String) "MISS");
        ((Field) term661022).setAccessible(true);
        Object enum1447 = ((Field) term661022).get((Object) null);
        Class<? extends Object> term661400 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term661399 = ((Class) term661400).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term661399).setAccessible(true);
        Object enum1448 = ((Field) term661399).get((Object) null);
        Class<? extends Object> term661683 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term661682 = ((Class) term661683).getDeclaredField((String) "NORMAL");
        ((Field) term661682).setAccessible(true);
        Object enum1449 = ((Field) term661682).get((Object) null);
        Class<? extends Object> term661958 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term661957 = ((Class) term661958).getDeclaredField((String) "ORIGINAL");
        ((Field) term661957).setAccessible(true);
        Object enum1450 = ((Field) term661957).get((Object) null);
        Class<? extends Object> term662224 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term662223 = ((Class) term662224).getDeclaredField((String) "NONE");
        ((Field) term662223).setAccessible(true);
        Object enum1451 = ((Field) term662223).get((Object) null);
        term660408 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerModule"));
        Object term660410 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term660533 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term660534 = newInstance(Class.forName("java.time.LocalDate"));
        Object term660538 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term660408, term660408.getClass(), "id", -3231440836116263235L);
        setLongField(term660410, term660410.getClass(), "id", 8010417010297313651L);
        setIntField(term660410, term660410.getClass(), "pdId", 1498231709);
        setField(term660410, term660410.getClass(), "playerName", "xxx");
        setIntField(term660410, term660410.getClass(), "vocaloidPoints", 300);
        setIntField(term660410, term660410.getClass(), "level", 1);
        setIntField(term660410, term660410.getClass(), "levelExp", -775074162);
        setField(term660410, term660410.getClass(), "levelTitle", "xxx");
        setIntField(term660410, term660410.getClass(), "plateId", -1);
        setIntField(term660410, term660410.getClass(), "plateEffectId", -1);
        setField(term660410, term660410.getClass(), "passwordStatus", enum1447);
        setField(term660410, term660410.getClass(), "password", "**********");
        setBooleanField(term660410, term660410.getClass(), "preferPerPvModule", true);
        setBooleanField(term660410, term660410.getClass(), "preferCommonModule", false);
        setBooleanField(term660410, term660410.getClass(), "usePerPvSkin", true);
        setBooleanField(term660410, term660410.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term660410, term660410.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term660410, term660410.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term660410, term660410.getClass(), "usePerPvTouchSliderSe", false);
        setField(term660410, term660410.getClass(), "commonModule", "-999,-999,-999");
        setField(term660410, term660410.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term660534, term660534.getClass(), "year", 2026);
        setShortField(term660534, term660534.getClass(), "month", (short) 8);
        setShortField(term660534, term660534.getClass(), "day", (short) 12);
        setField(term660533, term660533.getClass(), "date", term660534);
        setByteField(term660538, term660538.getClass(), "hour", (byte) 2);
        setByteField(term660538, term660538.getClass(), "minute", (byte) 4);
        setByteField(term660538, term660538.getClass(), "second", (byte) 16);
        setIntField(term660538, term660538.getClass(), "nano", 959452000);
        setField(term660533, term660533.getClass(), "time", term660538);
        setField(term660410, term660410.getClass(), "commonModuleSetTime", term660533);
        setField(term660410, term660410.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term660410, term660410.getClass(), "commonSkin", -1);
        setIntField(term660410, term660410.getClass(), "headphoneVolume", 100);
        setBooleanField(term660410, term660410.getClass(), "buttonSeOn", true);
        setIntField(term660410, term660410.getClass(), "buttonSeVolume", 100);
        setIntField(term660410, term660410.getClass(), "sliderSeVolume", 100);
        setIntField(term660410, term660410.getClass(), "buttonSe", -1);
        setIntField(term660410, term660410.getClass(), "chainSlideSe", -1);
        setIntField(term660410, term660410.getClass(), "slideSe", -1);
        setIntField(term660410, term660410.getClass(), "sliderTouchSe", -1);
        setField(term660410, term660410.getClass(), "sortMode", enum1448);
        setIntField(term660410, term660410.getClass(), "nextPvId", -1);
        setField(term660410, term660410.getClass(), "nextDifficulty", enum1449);
        setField(term660410, term660410.getClass(), "nextEdition", enum1450);
        setBooleanField(term660410, term660410.getClass(), "showInterimRanking", true);
        setBooleanField(term660410, term660410.getClass(), "showClearStatus", true);
        setBooleanField(term660410, term660410.getClass(), "showGreatBorder", true);
        setBooleanField(term660410, term660410.getClass(), "showExcellentBorder", true);
        setBooleanField(term660410, term660410.getClass(), "showRivalBorder", true);
        setBooleanField(term660410, term660410.getClass(), "showRgoSetting", true);
        setBooleanField(term660410, term660410.getClass(), "contestNowPlayingEnable", true);
        setIntField(term660410, term660410.getClass(), "contestNowPlayingId", -1);
        setIntField(term660410, term660410.getClass(), "contestNowPlayingValue", -1);
        setField(term660410, term660410.getClass(), "contestNowPlayingResultRank", enum1451);
        setField(term660410, term660410.getClass(), "contestNowPlayingSpecifier", "");
        setField(term660410, term660410.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term660410, term660410.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term660410, term660410.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term660410, term660410.getClass(), "rivalPdId", -1);
        setField(term660408, term660408.getClass(), "pdId", term660410);
        setIntField(term660408, term660408.getClass(), "moduleId", 304255923);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerModule");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getModuleId", argTypes, term660408, args);
    }

};


