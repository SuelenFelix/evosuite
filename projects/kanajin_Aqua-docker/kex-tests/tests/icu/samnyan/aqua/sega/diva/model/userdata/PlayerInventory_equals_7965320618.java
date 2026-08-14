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

public class PlayerInventory_equals_7965320618 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term551592;
     Object term552224;

    public PlayerInventory_equals_7965320618() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term551593 = new Long(6967924379644551255L);
        Class<? extends Object> term552232 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term552231 = ((Class) term552232).getDeclaredField((String) "MISS");
        ((Field) term552231).setAccessible(true);
        Object enum1207 = ((Field) term552231).get((Object) null);
        Class<? extends Object> term552609 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term552608 = ((Class) term552609).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term552608).setAccessible(true);
        Object enum1208 = ((Field) term552608).get((Object) null);
        Class<? extends Object> term552892 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term552891 = ((Class) term552892).getDeclaredField((String) "NORMAL");
        ((Field) term552891).setAccessible(true);
        Object enum1209 = ((Field) term552891).get((Object) null);
        Class<? extends Object> term553167 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term553166 = ((Class) term553167).getDeclaredField((String) "ORIGINAL");
        ((Field) term553166).setAccessible(true);
        Object enum1210 = ((Field) term553166).get((Object) null);
        Class<? extends Object> term553433 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term553432 = ((Class) term553433).getDeclaredField((String) "NONE");
        ((Field) term553432).setAccessible(true);
        Object enum1211 = ((Field) term553432).get((Object) null);
        term551592 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerInventory"));
        Object term551595 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term551718 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term551719 = newInstance(Class.forName("java.time.LocalDate"));
        Object term551723 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term551592, term551592.getClass(), "id", term551593);
        setLongField(term551595, term551595.getClass(), "id", -3850323135468805420L);
        setIntField(term551595, term551595.getClass(), "pdId", 892506528);
        setField(term551595, term551595.getClass(), "playerName", "xxx");
        setIntField(term551595, term551595.getClass(), "vocaloidPoints", 300);
        setIntField(term551595, term551595.getClass(), "level", 1);
        setIntField(term551595, term551595.getClass(), "levelExp", -1203169418);
        setField(term551595, term551595.getClass(), "levelTitle", "xxx");
        setIntField(term551595, term551595.getClass(), "plateId", -1);
        setIntField(term551595, term551595.getClass(), "plateEffectId", -1);
        setField(term551595, term551595.getClass(), "passwordStatus", enum1207);
        setField(term551595, term551595.getClass(), "password", "**********");
        setBooleanField(term551595, term551595.getClass(), "preferPerPvModule", true);
        setBooleanField(term551595, term551595.getClass(), "preferCommonModule", true);
        setBooleanField(term551595, term551595.getClass(), "usePerPvSkin", true);
        setBooleanField(term551595, term551595.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term551595, term551595.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term551595, term551595.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term551595, term551595.getClass(), "usePerPvTouchSliderSe", true);
        setField(term551595, term551595.getClass(), "commonModule", "-999,-999,-999");
        setField(term551595, term551595.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term551719, term551719.getClass(), "year", 2026);
        setShortField(term551719, term551719.getClass(), "month", (short) 8);
        setShortField(term551719, term551719.getClass(), "day", (short) 12);
        setField(term551718, term551718.getClass(), "date", term551719);
        setByteField(term551723, term551723.getClass(), "hour", (byte) 2);
        setByteField(term551723, term551723.getClass(), "minute", (byte) 3);
        setByteField(term551723, term551723.getClass(), "second", (byte) 56);
        setIntField(term551723, term551723.getClass(), "nano", 581608000);
        setField(term551718, term551718.getClass(), "time", term551723);
        setField(term551595, term551595.getClass(), "commonModuleSetTime", term551718);
        setField(term551595, term551595.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term551595, term551595.getClass(), "commonSkin", -1);
        setIntField(term551595, term551595.getClass(), "headphoneVolume", 100);
        setBooleanField(term551595, term551595.getClass(), "buttonSeOn", true);
        setIntField(term551595, term551595.getClass(), "buttonSeVolume", 100);
        setIntField(term551595, term551595.getClass(), "sliderSeVolume", 100);
        setIntField(term551595, term551595.getClass(), "buttonSe", -1);
        setIntField(term551595, term551595.getClass(), "chainSlideSe", -1);
        setIntField(term551595, term551595.getClass(), "slideSe", -1);
        setIntField(term551595, term551595.getClass(), "sliderTouchSe", -1);
        setField(term551595, term551595.getClass(), "sortMode", enum1208);
        setIntField(term551595, term551595.getClass(), "nextPvId", -1);
        setField(term551595, term551595.getClass(), "nextDifficulty", enum1209);
        setField(term551595, term551595.getClass(), "nextEdition", enum1210);
        setBooleanField(term551595, term551595.getClass(), "showInterimRanking", true);
        setBooleanField(term551595, term551595.getClass(), "showClearStatus", true);
        setBooleanField(term551595, term551595.getClass(), "showGreatBorder", true);
        setBooleanField(term551595, term551595.getClass(), "showExcellentBorder", true);
        setBooleanField(term551595, term551595.getClass(), "showRivalBorder", true);
        setBooleanField(term551595, term551595.getClass(), "showRgoSetting", true);
        setBooleanField(term551595, term551595.getClass(), "contestNowPlayingEnable", true);
        setIntField(term551595, term551595.getClass(), "contestNowPlayingId", -1);
        setIntField(term551595, term551595.getClass(), "contestNowPlayingValue", -1);
        setField(term551595, term551595.getClass(), "contestNowPlayingResultRank", enum1211);
        setField(term551595, term551595.getClass(), "contestNowPlayingSpecifier", "");
        setField(term551595, term551595.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term551595, term551595.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term551595, term551595.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term551595, term551595.getClass(), "rivalPdId", -1);
        setField(term551592, term551592.getClass(), "pdId", term551595);
        setField(term551592, term551592.getClass(), "value", "VVNNlAePXF");
        setField(term551592, term551592.getClass(), "type", "jnwVnmKAFv");
        term552224 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerInventory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term552224;
        callMethod(klass, "equals", argTypes, term551592, args);
    }

};


