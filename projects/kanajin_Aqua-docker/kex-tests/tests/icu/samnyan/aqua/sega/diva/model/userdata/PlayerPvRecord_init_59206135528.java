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

public class PlayerPvRecord_init_59206135528 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term649500;
     Object term649502;
     Object term650107;
     Object enum1427;
     Object enum1429;
     Object enum1430;
     Object term650130;
     Object term650132;
     Object enum1431;

    public PlayerPvRecord_init_59206135528() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term649500 = new Long(3104349415269466587L);
        Class<? extends Object> term650179 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term650178 = ((Class) term650179).getDeclaredField((String) "MISS");
        ((Field) term650178).setAccessible(true);
        Object enum1424 = ((Field) term650178).get((Object) null);
        Class<? extends Object> term650556 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term650555 = ((Class) term650556).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term650555).setAccessible(true);
        Object enum1425 = ((Field) term650555).get((Object) null);
        Class<? extends Object> term650839 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term650838 = ((Class) term650839).getDeclaredField((String) "NORMAL");
        ((Field) term650838).setAccessible(true);
        Object enum1426 = ((Field) term650838).get((Object) null);
        Class<? extends Object> term651114 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term651113 = ((Class) term651114).getDeclaredField((String) "ORIGINAL");
        ((Field) term651113).setAccessible(true);
        enum1427 = ((Field) term651113).get((Object) null);
        Class<? extends Object> term651380 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term651379 = ((Class) term651380).getDeclaredField((String) "NONE");
        ((Field) term651379).setAccessible(true);
        Object enum1428 = ((Field) term651379).get((Object) null);
        term649502 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term649625 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term649626 = newInstance(Class.forName("java.time.LocalDate"));
        Object term649630 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term649502, term649502.getClass(), "id", -7423063312741500355L);
        setIntField(term649502, term649502.getClass(), "pdId", -1926178417);
        setField(term649502, term649502.getClass(), "playerName", "xxx");
        setIntField(term649502, term649502.getClass(), "vocaloidPoints", 300);
        setIntField(term649502, term649502.getClass(), "level", 1);
        setIntField(term649502, term649502.getClass(), "levelExp", -1011180309);
        setField(term649502, term649502.getClass(), "levelTitle", "xxx");
        setIntField(term649502, term649502.getClass(), "plateId", -1);
        setIntField(term649502, term649502.getClass(), "plateEffectId", -1);
        setField(term649502, term649502.getClass(), "passwordStatus", enum1424);
        setField(term649502, term649502.getClass(), "password", "**********");
        setBooleanField(term649502, term649502.getClass(), "preferPerPvModule", true);
        setBooleanField(term649502, term649502.getClass(), "preferCommonModule", false);
        setBooleanField(term649502, term649502.getClass(), "usePerPvSkin", false);
        setBooleanField(term649502, term649502.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term649502, term649502.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term649502, term649502.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term649502, term649502.getClass(), "usePerPvTouchSliderSe", false);
        setField(term649502, term649502.getClass(), "commonModule", "-999,-999,-999");
        setField(term649502, term649502.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term649626, term649626.getClass(), "year", 2026);
        setShortField(term649626, term649626.getClass(), "month", (short) 8);
        setShortField(term649626, term649626.getClass(), "day", (short) 12);
        setField(term649625, term649625.getClass(), "date", term649626);
        setByteField(term649630, term649630.getClass(), "hour", (byte) 2);
        setByteField(term649630, term649630.getClass(), "minute", (byte) 4);
        setByteField(term649630, term649630.getClass(), "second", (byte) 8);
        setIntField(term649630, term649630.getClass(), "nano", 436565000);
        setField(term649625, term649625.getClass(), "time", term649630);
        setField(term649502, term649502.getClass(), "commonModuleSetTime", term649625);
        setField(term649502, term649502.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term649502, term649502.getClass(), "commonSkin", -1);
        setIntField(term649502, term649502.getClass(), "headphoneVolume", 100);
        setBooleanField(term649502, term649502.getClass(), "buttonSeOn", true);
        setIntField(term649502, term649502.getClass(), "buttonSeVolume", 100);
        setIntField(term649502, term649502.getClass(), "sliderSeVolume", 100);
        setIntField(term649502, term649502.getClass(), "buttonSe", -1);
        setIntField(term649502, term649502.getClass(), "chainSlideSe", -1);
        setIntField(term649502, term649502.getClass(), "slideSe", -1);
        setIntField(term649502, term649502.getClass(), "sliderTouchSe", -1);
        setField(term649502, term649502.getClass(), "sortMode", enum1425);
        setIntField(term649502, term649502.getClass(), "nextPvId", -1);
        setField(term649502, term649502.getClass(), "nextDifficulty", enum1426);
        setField(term649502, term649502.getClass(), "nextEdition", enum1427);
        setBooleanField(term649502, term649502.getClass(), "showInterimRanking", true);
        setBooleanField(term649502, term649502.getClass(), "showClearStatus", true);
        setBooleanField(term649502, term649502.getClass(), "showGreatBorder", true);
        setBooleanField(term649502, term649502.getClass(), "showExcellentBorder", true);
        setBooleanField(term649502, term649502.getClass(), "showRivalBorder", true);
        setBooleanField(term649502, term649502.getClass(), "showRgoSetting", true);
        setBooleanField(term649502, term649502.getClass(), "contestNowPlayingEnable", false);
        setIntField(term649502, term649502.getClass(), "contestNowPlayingId", -1);
        setIntField(term649502, term649502.getClass(), "contestNowPlayingValue", -1);
        setField(term649502, term649502.getClass(), "contestNowPlayingResultRank", enum1428);
        setField(term649502, term649502.getClass(), "contestNowPlayingSpecifier", "");
        setField(term649502, term649502.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term649502, term649502.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term649502, term649502.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term649502, term649502.getClass(), "rivalPdId", -1);
        term650107 = new Integer(-342719145);
        Class<? extends Object> term652021 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term652020 = ((Class) term652021).getDeclaredField((String) "HARD");
        ((Field) term652020).setAccessible(true);
        enum1429 = ((Field) term652020).get((Object) null);
        Class<? extends Object> term652290 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ClearResult");
        Field term652289 = ((Class) term652290).getDeclaredField((String) "PERFECT");
        ((Field) term652289).setAccessible(true);
        enum1430 = ((Field) term652289).get((Object) null);
        term650130 = new Integer(2101766592);
        term650132 = new Integer(802196878);
        Class<? extends Object> term652573 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ChallengeKind");
        Field term652572 = ((Class) term652573).getDeclaredField((String) "UNDEFINED");
        ((Field) term652572).setAccessible(true);
        enum1431 = ((Field) term652572).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvRecord");
        Class<?>[] argTypes = new Class<?>[11];
        argTypes[0] = long.class;
        argTypes[1] = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        argTypes[2] = int.class;
        argTypes[3] = Class.forName("icu.samnyan.aqua.sega.diva.model.common.Edition");
        argTypes[4] = Class.forName("icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        argTypes[5] = Class.forName("icu.samnyan.aqua.sega.diva.model.common.ClearResult");
        argTypes[6] = int.class;
        argTypes[7] = int.class;
        argTypes[8] = Class.forName("icu.samnyan.aqua.sega.diva.model.common.ChallengeKind");
        argTypes[9] = Class.forName("java.lang.String");
        argTypes[10] = Class.forName("java.lang.String");
        Object[] args = new Object[11];
        args[0] = term649500;
        args[1] = term649502;
        args[2] = term650107;
        args[3] = enum1427;
        args[4] = enum1429;
        args[5] = enum1430;
        args[6] = term650130;
        args[7] = term650132;
        args[8] = enum1431;
        args[9] = "aanyiAOJCl";
        args[10] = "VDokbsCuqq";
        Object instance = callConstructor(klass, argTypes, args);
    }

};


