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
import java.lang.Object;
import java.lang.String;

public class PlayerInventory_setType_9738308147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term549070;

    public PlayerInventory_setType_9738308147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term549071 = new Long(-7237588299778557629L);
        Class<? extends Object> term549721 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term549720 = ((Class) term549721).getDeclaredField((String) "MISS");
        ((Field) term549720).setAccessible(true);
        Object enum1202 = ((Field) term549720).get((Object) null);
        Class<? extends Object> term550098 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term550097 = ((Class) term550098).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term550097).setAccessible(true);
        Object enum1203 = ((Field) term550097).get((Object) null);
        Class<? extends Object> term550381 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term550380 = ((Class) term550381).getDeclaredField((String) "NORMAL");
        ((Field) term550380).setAccessible(true);
        Object enum1204 = ((Field) term550380).get((Object) null);
        Class<? extends Object> term550656 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term550655 = ((Class) term550656).getDeclaredField((String) "ORIGINAL");
        ((Field) term550655).setAccessible(true);
        Object enum1205 = ((Field) term550655).get((Object) null);
        Class<? extends Object> term550922 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term550921 = ((Class) term550922).getDeclaredField((String) "NONE");
        ((Field) term550921).setAccessible(true);
        Object enum1206 = ((Field) term550921).get((Object) null);
        term549070 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerInventory"));
        Object term549073 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term549196 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term549197 = newInstance(Class.forName("java.time.LocalDate"));
        Object term549201 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term549070, term549070.getClass(), "id", term549071);
        setLongField(term549073, term549073.getClass(), "id", 6150186973473930616L);
        setIntField(term549073, term549073.getClass(), "pdId", -1920949340);
        setField(term549073, term549073.getClass(), "playerName", "xxx");
        setIntField(term549073, term549073.getClass(), "vocaloidPoints", 300);
        setIntField(term549073, term549073.getClass(), "level", 1);
        setIntField(term549073, term549073.getClass(), "levelExp", 1211730228);
        setField(term549073, term549073.getClass(), "levelTitle", "xxx");
        setIntField(term549073, term549073.getClass(), "plateId", -1);
        setIntField(term549073, term549073.getClass(), "plateEffectId", -1);
        setField(term549073, term549073.getClass(), "passwordStatus", enum1202);
        setField(term549073, term549073.getClass(), "password", "**********");
        setBooleanField(term549073, term549073.getClass(), "preferPerPvModule", true);
        setBooleanField(term549073, term549073.getClass(), "preferCommonModule", false);
        setBooleanField(term549073, term549073.getClass(), "usePerPvSkin", false);
        setBooleanField(term549073, term549073.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term549073, term549073.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term549073, term549073.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term549073, term549073.getClass(), "usePerPvTouchSliderSe", true);
        setField(term549073, term549073.getClass(), "commonModule", "-999,-999,-999");
        setField(term549073, term549073.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term549197, term549197.getClass(), "year", 2026);
        setShortField(term549197, term549197.getClass(), "month", (short) 6);
        setShortField(term549197, term549197.getClass(), "day", (short) 29);
        setField(term549196, term549196.getClass(), "date", term549197);
        setByteField(term549201, term549201.getClass(), "hour", (byte) 4);
        setByteField(term549201, term549201.getClass(), "minute", (byte) 28);
        setByteField(term549201, term549201.getClass(), "second", (byte) 42);
        setIntField(term549201, term549201.getClass(), "nano", 185153000);
        setField(term549196, term549196.getClass(), "time", term549201);
        setField(term549073, term549073.getClass(), "commonModuleSetTime", term549196);
        setField(term549073, term549073.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term549073, term549073.getClass(), "commonSkin", -1);
        setIntField(term549073, term549073.getClass(), "headphoneVolume", 100);
        setBooleanField(term549073, term549073.getClass(), "buttonSeOn", true);
        setIntField(term549073, term549073.getClass(), "buttonSeVolume", 100);
        setIntField(term549073, term549073.getClass(), "sliderSeVolume", 100);
        setIntField(term549073, term549073.getClass(), "buttonSe", -1);
        setIntField(term549073, term549073.getClass(), "chainSlideSe", -1);
        setIntField(term549073, term549073.getClass(), "slideSe", -1);
        setIntField(term549073, term549073.getClass(), "sliderTouchSe", -1);
        setField(term549073, term549073.getClass(), "sortMode", enum1203);
        setIntField(term549073, term549073.getClass(), "nextPvId", -1);
        setField(term549073, term549073.getClass(), "nextDifficulty", enum1204);
        setField(term549073, term549073.getClass(), "nextEdition", enum1205);
        setBooleanField(term549073, term549073.getClass(), "showInterimRanking", true);
        setBooleanField(term549073, term549073.getClass(), "showClearStatus", true);
        setBooleanField(term549073, term549073.getClass(), "showGreatBorder", true);
        setBooleanField(term549073, term549073.getClass(), "showExcellentBorder", true);
        setBooleanField(term549073, term549073.getClass(), "showRivalBorder", true);
        setBooleanField(term549073, term549073.getClass(), "showRgoSetting", true);
        setBooleanField(term549073, term549073.getClass(), "contestNowPlayingEnable", false);
        setIntField(term549073, term549073.getClass(), "contestNowPlayingId", -1);
        setIntField(term549073, term549073.getClass(), "contestNowPlayingValue", -1);
        setField(term549073, term549073.getClass(), "contestNowPlayingResultRank", enum1206);
        setField(term549073, term549073.getClass(), "contestNowPlayingSpecifier", "");
        setField(term549073, term549073.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term549073, term549073.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term549073, term549073.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term549073, term549073.getClass(), "rivalPdId", -1);
        setField(term549070, term549070.getClass(), "pdId", term549073);
        setField(term549070, term549070.getClass(), "value", "IBpaxltauX");
        setField(term549070, term549070.getClass(), "type", "hePqROaplw");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerInventory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "PJcSNDruWd";
        callMethod(klass, "setType", argTypes, term549070, args);
    }

};


