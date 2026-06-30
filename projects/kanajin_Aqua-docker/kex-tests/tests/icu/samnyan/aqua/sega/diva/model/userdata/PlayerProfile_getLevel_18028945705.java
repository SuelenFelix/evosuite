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

public class PlayerProfile_getLevel_18028945705 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term693422;

    public PlayerProfile_getLevel_18028945705() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term694034 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term694033 = ((Class) term694034).getDeclaredField((String) "MISS");
        ((Field) term694033).setAccessible(true);
        Object enum1512 = ((Field) term694033).get((Object) null);
        Class<? extends Object> term694411 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term694410 = ((Class) term694411).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term694410).setAccessible(true);
        Object enum1513 = ((Field) term694410).get((Object) null);
        Class<? extends Object> term694694 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term694693 = ((Class) term694694).getDeclaredField((String) "NORMAL");
        ((Field) term694693).setAccessible(true);
        Object enum1514 = ((Field) term694693).get((Object) null);
        Class<? extends Object> term694969 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term694968 = ((Class) term694969).getDeclaredField((String) "ORIGINAL");
        ((Field) term694968).setAccessible(true);
        Object enum1515 = ((Field) term694968).get((Object) null);
        Class<? extends Object> term695235 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term695234 = ((Class) term695235).getDeclaredField((String) "NONE");
        ((Field) term695234).setAccessible(true);
        Object enum1516 = ((Field) term695234).get((Object) null);
        term693422 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term693545 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term693546 = newInstance(Class.forName("java.time.LocalDate"));
        Object term693550 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term693422, term693422.getClass(), "id", -3565554762799701668L);
        setIntField(term693422, term693422.getClass(), "pdId", -860371306);
        setField(term693422, term693422.getClass(), "playerName", "xxx");
        setIntField(term693422, term693422.getClass(), "vocaloidPoints", 300);
        setIntField(term693422, term693422.getClass(), "level", 1);
        setIntField(term693422, term693422.getClass(), "levelExp", -125626789);
        setField(term693422, term693422.getClass(), "levelTitle", "xxx");
        setIntField(term693422, term693422.getClass(), "plateId", -1);
        setIntField(term693422, term693422.getClass(), "plateEffectId", -1);
        setField(term693422, term693422.getClass(), "passwordStatus", enum1512);
        setField(term693422, term693422.getClass(), "password", "**********");
        setBooleanField(term693422, term693422.getClass(), "preferPerPvModule", true);
        setBooleanField(term693422, term693422.getClass(), "preferCommonModule", false);
        setBooleanField(term693422, term693422.getClass(), "usePerPvSkin", false);
        setBooleanField(term693422, term693422.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term693422, term693422.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term693422, term693422.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term693422, term693422.getClass(), "usePerPvTouchSliderSe", true);
        setField(term693422, term693422.getClass(), "commonModule", "-999,-999,-999");
        setField(term693422, term693422.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term693546, term693546.getClass(), "year", 2026);
        setShortField(term693546, term693546.getClass(), "month", (short) 6);
        setShortField(term693546, term693546.getClass(), "day", (short) 29);
        setField(term693545, term693545.getClass(), "date", term693546);
        setByteField(term693550, term693550.getClass(), "hour", (byte) 4);
        setByteField(term693550, term693550.getClass(), "minute", (byte) 29);
        setByteField(term693550, term693550.getClass(), "second", (byte) 10);
        setIntField(term693550, term693550.getClass(), "nano", 534314000);
        setField(term693545, term693545.getClass(), "time", term693550);
        setField(term693422, term693422.getClass(), "commonModuleSetTime", term693545);
        setField(term693422, term693422.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term693422, term693422.getClass(), "commonSkin", -1);
        setIntField(term693422, term693422.getClass(), "headphoneVolume", 100);
        setBooleanField(term693422, term693422.getClass(), "buttonSeOn", true);
        setIntField(term693422, term693422.getClass(), "buttonSeVolume", 100);
        setIntField(term693422, term693422.getClass(), "sliderSeVolume", 100);
        setIntField(term693422, term693422.getClass(), "buttonSe", -1);
        setIntField(term693422, term693422.getClass(), "chainSlideSe", -1);
        setIntField(term693422, term693422.getClass(), "slideSe", -1);
        setIntField(term693422, term693422.getClass(), "sliderTouchSe", -1);
        setField(term693422, term693422.getClass(), "sortMode", enum1513);
        setIntField(term693422, term693422.getClass(), "nextPvId", -1);
        setField(term693422, term693422.getClass(), "nextDifficulty", enum1514);
        setField(term693422, term693422.getClass(), "nextEdition", enum1515);
        setBooleanField(term693422, term693422.getClass(), "showInterimRanking", true);
        setBooleanField(term693422, term693422.getClass(), "showClearStatus", true);
        setBooleanField(term693422, term693422.getClass(), "showGreatBorder", true);
        setBooleanField(term693422, term693422.getClass(), "showExcellentBorder", true);
        setBooleanField(term693422, term693422.getClass(), "showRivalBorder", true);
        setBooleanField(term693422, term693422.getClass(), "showRgoSetting", true);
        setBooleanField(term693422, term693422.getClass(), "contestNowPlayingEnable", false);
        setIntField(term693422, term693422.getClass(), "contestNowPlayingId", -1);
        setIntField(term693422, term693422.getClass(), "contestNowPlayingValue", -1);
        setField(term693422, term693422.getClass(), "contestNowPlayingResultRank", enum1516);
        setField(term693422, term693422.getClass(), "contestNowPlayingSpecifier", "");
        setField(term693422, term693422.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term693422, term693422.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term693422, term693422.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term693422, term693422.getClass(), "rivalPdId", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLevel", argTypes, term693422, args);
    }

};


