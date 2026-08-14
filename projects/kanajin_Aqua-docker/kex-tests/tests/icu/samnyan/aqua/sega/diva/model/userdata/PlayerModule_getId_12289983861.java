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

public class PlayerModule_getId_12289983861 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term655496;

    public PlayerModule_getId_12289983861() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term656111 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term656110 = ((Class) term656111).getDeclaredField((String) "MISS");
        ((Field) term656110).setAccessible(true);
        Object enum1437 = ((Field) term656110).get((Object) null);
        Class<? extends Object> term656488 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term656487 = ((Class) term656488).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term656487).setAccessible(true);
        Object enum1438 = ((Field) term656487).get((Object) null);
        Class<? extends Object> term656771 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term656770 = ((Class) term656771).getDeclaredField((String) "NORMAL");
        ((Field) term656770).setAccessible(true);
        Object enum1439 = ((Field) term656770).get((Object) null);
        Class<? extends Object> term657046 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term657045 = ((Class) term657046).getDeclaredField((String) "ORIGINAL");
        ((Field) term657045).setAccessible(true);
        Object enum1440 = ((Field) term657045).get((Object) null);
        Class<? extends Object> term657312 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term657311 = ((Class) term657312).getDeclaredField((String) "NONE");
        ((Field) term657311).setAccessible(true);
        Object enum1441 = ((Field) term657311).get((Object) null);
        term655496 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerModule"));
        Object term655498 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term655621 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term655622 = newInstance(Class.forName("java.time.LocalDate"));
        Object term655626 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term655496, term655496.getClass(), "id", 3103198349031409063L);
        setLongField(term655498, term655498.getClass(), "id", 753095050088595263L);
        setIntField(term655498, term655498.getClass(), "pdId", 1810303681);
        setField(term655498, term655498.getClass(), "playerName", "xxx");
        setIntField(term655498, term655498.getClass(), "vocaloidPoints", 300);
        setIntField(term655498, term655498.getClass(), "level", 1);
        setIntField(term655498, term655498.getClass(), "levelExp", 1374798468);
        setField(term655498, term655498.getClass(), "levelTitle", "xxx");
        setIntField(term655498, term655498.getClass(), "plateId", -1);
        setIntField(term655498, term655498.getClass(), "plateEffectId", -1);
        setField(term655498, term655498.getClass(), "passwordStatus", enum1437);
        setField(term655498, term655498.getClass(), "password", "**********");
        setBooleanField(term655498, term655498.getClass(), "preferPerPvModule", true);
        setBooleanField(term655498, term655498.getClass(), "preferCommonModule", true);
        setBooleanField(term655498, term655498.getClass(), "usePerPvSkin", false);
        setBooleanField(term655498, term655498.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term655498, term655498.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term655498, term655498.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term655498, term655498.getClass(), "usePerPvTouchSliderSe", true);
        setField(term655498, term655498.getClass(), "commonModule", "-999,-999,-999");
        setField(term655498, term655498.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term655622, term655622.getClass(), "year", 2026);
        setShortField(term655622, term655622.getClass(), "month", (short) 8);
        setShortField(term655622, term655622.getClass(), "day", (short) 12);
        setField(term655621, term655621.getClass(), "date", term655622);
        setByteField(term655626, term655626.getClass(), "hour", (byte) 2);
        setByteField(term655626, term655626.getClass(), "minute", (byte) 4);
        setByteField(term655626, term655626.getClass(), "second", (byte) 16);
        setIntField(term655626, term655626.getClass(), "nano", 461468000);
        setField(term655621, term655621.getClass(), "time", term655626);
        setField(term655498, term655498.getClass(), "commonModuleSetTime", term655621);
        setField(term655498, term655498.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term655498, term655498.getClass(), "commonSkin", -1);
        setIntField(term655498, term655498.getClass(), "headphoneVolume", 100);
        setBooleanField(term655498, term655498.getClass(), "buttonSeOn", true);
        setIntField(term655498, term655498.getClass(), "buttonSeVolume", 100);
        setIntField(term655498, term655498.getClass(), "sliderSeVolume", 100);
        setIntField(term655498, term655498.getClass(), "buttonSe", -1);
        setIntField(term655498, term655498.getClass(), "chainSlideSe", -1);
        setIntField(term655498, term655498.getClass(), "slideSe", -1);
        setIntField(term655498, term655498.getClass(), "sliderTouchSe", -1);
        setField(term655498, term655498.getClass(), "sortMode", enum1438);
        setIntField(term655498, term655498.getClass(), "nextPvId", -1);
        setField(term655498, term655498.getClass(), "nextDifficulty", enum1439);
        setField(term655498, term655498.getClass(), "nextEdition", enum1440);
        setBooleanField(term655498, term655498.getClass(), "showInterimRanking", true);
        setBooleanField(term655498, term655498.getClass(), "showClearStatus", true);
        setBooleanField(term655498, term655498.getClass(), "showGreatBorder", true);
        setBooleanField(term655498, term655498.getClass(), "showExcellentBorder", true);
        setBooleanField(term655498, term655498.getClass(), "showRivalBorder", true);
        setBooleanField(term655498, term655498.getClass(), "showRgoSetting", true);
        setBooleanField(term655498, term655498.getClass(), "contestNowPlayingEnable", true);
        setIntField(term655498, term655498.getClass(), "contestNowPlayingId", -1);
        setIntField(term655498, term655498.getClass(), "contestNowPlayingValue", -1);
        setField(term655498, term655498.getClass(), "contestNowPlayingResultRank", enum1441);
        setField(term655498, term655498.getClass(), "contestNowPlayingSpecifier", "");
        setField(term655498, term655498.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term655498, term655498.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term655498, term655498.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term655498, term655498.getClass(), "rivalPdId", -1);
        setField(term655496, term655496.getClass(), "pdId", term655498);
        setIntField(term655496, term655496.getClass(), "moduleId", -425364766);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerModule");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term655496, args);
    }

};


