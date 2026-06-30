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

public class PlayerModule_setModuleId_9139655366 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term668805;
     Object term669413;

    public PlayerModule_setModuleId_9139655366() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term669422 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term669421 = ((Class) term669422).getDeclaredField((String) "MISS");
        ((Field) term669421).setAccessible(true);
        Object enum1462 = ((Field) term669421).get((Object) null);
        Class<? extends Object> term669799 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term669798 = ((Class) term669799).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term669798).setAccessible(true);
        Object enum1463 = ((Field) term669798).get((Object) null);
        Class<? extends Object> term670082 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term670081 = ((Class) term670082).getDeclaredField((String) "NORMAL");
        ((Field) term670081).setAccessible(true);
        Object enum1464 = ((Field) term670081).get((Object) null);
        Class<? extends Object> term670357 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term670356 = ((Class) term670357).getDeclaredField((String) "ORIGINAL");
        ((Field) term670356).setAccessible(true);
        Object enum1465 = ((Field) term670356).get((Object) null);
        Class<? extends Object> term670623 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term670622 = ((Class) term670623).getDeclaredField((String) "NONE");
        ((Field) term670622).setAccessible(true);
        Object enum1466 = ((Field) term670622).get((Object) null);
        term668805 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerModule"));
        Object term668807 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term668930 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term668931 = newInstance(Class.forName("java.time.LocalDate"));
        Object term668935 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term668805, term668805.getClass(), "id", -1223573843683081410L);
        setLongField(term668807, term668807.getClass(), "id", 3453457027014743006L);
        setIntField(term668807, term668807.getClass(), "pdId", -1920705464);
        setField(term668807, term668807.getClass(), "playerName", "xxx");
        setIntField(term668807, term668807.getClass(), "vocaloidPoints", 300);
        setIntField(term668807, term668807.getClass(), "level", 1);
        setIntField(term668807, term668807.getClass(), "levelExp", 428714196);
        setField(term668807, term668807.getClass(), "levelTitle", "xxx");
        setIntField(term668807, term668807.getClass(), "plateId", -1);
        setIntField(term668807, term668807.getClass(), "plateEffectId", -1);
        setField(term668807, term668807.getClass(), "passwordStatus", enum1462);
        setField(term668807, term668807.getClass(), "password", "**********");
        setBooleanField(term668807, term668807.getClass(), "preferPerPvModule", true);
        setBooleanField(term668807, term668807.getClass(), "preferCommonModule", true);
        setBooleanField(term668807, term668807.getClass(), "usePerPvSkin", true);
        setBooleanField(term668807, term668807.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term668807, term668807.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term668807, term668807.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term668807, term668807.getClass(), "usePerPvTouchSliderSe", false);
        setField(term668807, term668807.getClass(), "commonModule", "-999,-999,-999");
        setField(term668807, term668807.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term668931, term668931.getClass(), "year", 2026);
        setShortField(term668931, term668931.getClass(), "month", (short) 6);
        setShortField(term668931, term668931.getClass(), "day", (short) 29);
        setField(term668930, term668930.getClass(), "date", term668931);
        setByteField(term668935, term668935.getClass(), "hour", (byte) 4);
        setByteField(term668935, term668935.getClass(), "minute", (byte) 29);
        setByteField(term668935, term668935.getClass(), "second", (byte) 4);
        setIntField(term668935, term668935.getClass(), "nano", 181689000);
        setField(term668930, term668930.getClass(), "time", term668935);
        setField(term668807, term668807.getClass(), "commonModuleSetTime", term668930);
        setField(term668807, term668807.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term668807, term668807.getClass(), "commonSkin", -1);
        setIntField(term668807, term668807.getClass(), "headphoneVolume", 100);
        setBooleanField(term668807, term668807.getClass(), "buttonSeOn", true);
        setIntField(term668807, term668807.getClass(), "buttonSeVolume", 100);
        setIntField(term668807, term668807.getClass(), "sliderSeVolume", 100);
        setIntField(term668807, term668807.getClass(), "buttonSe", -1);
        setIntField(term668807, term668807.getClass(), "chainSlideSe", -1);
        setIntField(term668807, term668807.getClass(), "slideSe", -1);
        setIntField(term668807, term668807.getClass(), "sliderTouchSe", -1);
        setField(term668807, term668807.getClass(), "sortMode", enum1463);
        setIntField(term668807, term668807.getClass(), "nextPvId", -1);
        setField(term668807, term668807.getClass(), "nextDifficulty", enum1464);
        setField(term668807, term668807.getClass(), "nextEdition", enum1465);
        setBooleanField(term668807, term668807.getClass(), "showInterimRanking", true);
        setBooleanField(term668807, term668807.getClass(), "showClearStatus", true);
        setBooleanField(term668807, term668807.getClass(), "showGreatBorder", true);
        setBooleanField(term668807, term668807.getClass(), "showExcellentBorder", true);
        setBooleanField(term668807, term668807.getClass(), "showRivalBorder", true);
        setBooleanField(term668807, term668807.getClass(), "showRgoSetting", true);
        setBooleanField(term668807, term668807.getClass(), "contestNowPlayingEnable", false);
        setIntField(term668807, term668807.getClass(), "contestNowPlayingId", -1);
        setIntField(term668807, term668807.getClass(), "contestNowPlayingValue", -1);
        setField(term668807, term668807.getClass(), "contestNowPlayingResultRank", enum1466);
        setField(term668807, term668807.getClass(), "contestNowPlayingSpecifier", "");
        setField(term668807, term668807.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term668807, term668807.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term668807, term668807.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term668807, term668807.getClass(), "rivalPdId", -1);
        setField(term668805, term668805.getClass(), "pdId", term668807);
        setIntField(term668805, term668805.getClass(), "moduleId", 934939315);
        term669413 = new Integer(-935897776);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerModule");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term669413;
        callMethod(klass, "setModuleId", argTypes, term668805, args);
    }

};


