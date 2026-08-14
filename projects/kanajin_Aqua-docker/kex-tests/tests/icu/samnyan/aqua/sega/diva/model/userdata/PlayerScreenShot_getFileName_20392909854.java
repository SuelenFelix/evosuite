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

public class PlayerScreenShot_getFileName_20392909854 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term494053;

    public PlayerScreenShot_getFileName_20392909854() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term494704 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term494703 = ((Class) term494704).getDeclaredField((String) "MISS");
        ((Field) term494703).setAccessible(true);
        Object enum1097 = ((Field) term494703).get((Object) null);
        Class<? extends Object> term495081 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term495080 = ((Class) term495081).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term495080).setAccessible(true);
        Object enum1098 = ((Field) term495080).get((Object) null);
        Class<? extends Object> term495364 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term495363 = ((Class) term495364).getDeclaredField((String) "NORMAL");
        ((Field) term495363).setAccessible(true);
        Object enum1099 = ((Field) term495363).get((Object) null);
        Class<? extends Object> term495639 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term495638 = ((Class) term495639).getDeclaredField((String) "ORIGINAL");
        ((Field) term495638).setAccessible(true);
        Object enum1100 = ((Field) term495638).get((Object) null);
        Class<? extends Object> term495905 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term495904 = ((Class) term495905).getDeclaredField((String) "NONE");
        ((Field) term495904).setAccessible(true);
        Object enum1101 = ((Field) term495904).get((Object) null);
        term494053 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerScreenShot"));
        Object term494055 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term494178 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term494179 = newInstance(Class.forName("java.time.LocalDate"));
        Object term494183 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term494053, term494053.getClass(), "id", -1497280900081695731L);
        setLongField(term494055, term494055.getClass(), "id", -3602825674339018793L);
        setIntField(term494055, term494055.getClass(), "pdId", 1630959866);
        setField(term494055, term494055.getClass(), "playerName", "xxx");
        setIntField(term494055, term494055.getClass(), "vocaloidPoints", 300);
        setIntField(term494055, term494055.getClass(), "level", 1);
        setIntField(term494055, term494055.getClass(), "levelExp", 414147550);
        setField(term494055, term494055.getClass(), "levelTitle", "xxx");
        setIntField(term494055, term494055.getClass(), "plateId", -1);
        setIntField(term494055, term494055.getClass(), "plateEffectId", -1);
        setField(term494055, term494055.getClass(), "passwordStatus", enum1097);
        setField(term494055, term494055.getClass(), "password", "**********");
        setBooleanField(term494055, term494055.getClass(), "preferPerPvModule", true);
        setBooleanField(term494055, term494055.getClass(), "preferCommonModule", false);
        setBooleanField(term494055, term494055.getClass(), "usePerPvSkin", false);
        setBooleanField(term494055, term494055.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term494055, term494055.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term494055, term494055.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term494055, term494055.getClass(), "usePerPvTouchSliderSe", true);
        setField(term494055, term494055.getClass(), "commonModule", "-999,-999,-999");
        setField(term494055, term494055.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term494179, term494179.getClass(), "year", 2026);
        setShortField(term494179, term494179.getClass(), "month", (short) 8);
        setShortField(term494179, term494179.getClass(), "day", (short) 12);
        setField(term494178, term494178.getClass(), "date", term494179);
        setByteField(term494183, term494183.getClass(), "hour", (byte) 2);
        setByteField(term494183, term494183.getClass(), "minute", (byte) 3);
        setByteField(term494183, term494183.getClass(), "second", (byte) 46);
        setIntField(term494183, term494183.getClass(), "nano", 279557000);
        setField(term494178, term494178.getClass(), "time", term494183);
        setField(term494055, term494055.getClass(), "commonModuleSetTime", term494178);
        setField(term494055, term494055.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term494055, term494055.getClass(), "commonSkin", -1);
        setIntField(term494055, term494055.getClass(), "headphoneVolume", 100);
        setBooleanField(term494055, term494055.getClass(), "buttonSeOn", true);
        setIntField(term494055, term494055.getClass(), "buttonSeVolume", 100);
        setIntField(term494055, term494055.getClass(), "sliderSeVolume", 100);
        setIntField(term494055, term494055.getClass(), "buttonSe", -1);
        setIntField(term494055, term494055.getClass(), "chainSlideSe", -1);
        setIntField(term494055, term494055.getClass(), "slideSe", -1);
        setIntField(term494055, term494055.getClass(), "sliderTouchSe", -1);
        setField(term494055, term494055.getClass(), "sortMode", enum1098);
        setIntField(term494055, term494055.getClass(), "nextPvId", -1);
        setField(term494055, term494055.getClass(), "nextDifficulty", enum1099);
        setField(term494055, term494055.getClass(), "nextEdition", enum1100);
        setBooleanField(term494055, term494055.getClass(), "showInterimRanking", true);
        setBooleanField(term494055, term494055.getClass(), "showClearStatus", true);
        setBooleanField(term494055, term494055.getClass(), "showGreatBorder", true);
        setBooleanField(term494055, term494055.getClass(), "showExcellentBorder", true);
        setBooleanField(term494055, term494055.getClass(), "showRivalBorder", true);
        setBooleanField(term494055, term494055.getClass(), "showRgoSetting", true);
        setBooleanField(term494055, term494055.getClass(), "contestNowPlayingEnable", true);
        setIntField(term494055, term494055.getClass(), "contestNowPlayingId", -1);
        setIntField(term494055, term494055.getClass(), "contestNowPlayingValue", -1);
        setField(term494055, term494055.getClass(), "contestNowPlayingResultRank", enum1101);
        setField(term494055, term494055.getClass(), "contestNowPlayingSpecifier", "");
        setField(term494055, term494055.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term494055, term494055.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term494055, term494055.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term494055, term494055.getClass(), "rivalPdId", -1);
        setField(term494053, term494053.getClass(), "pdId", term494055);
        setIntField(term494053, term494053.getClass(), "pvId", 1652909222);
        setField(term494053, term494053.getClass(), "fileName", "bnsyeQXFdu");
        setField(term494053, term494053.getClass(), "moduleList", "BwtdjiefJn");
        setField(term494053, term494053.getClass(), "customizeList", "jDmhBrIoDa");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerScreenShot");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFileName", argTypes, term494053, args);
    }

};


