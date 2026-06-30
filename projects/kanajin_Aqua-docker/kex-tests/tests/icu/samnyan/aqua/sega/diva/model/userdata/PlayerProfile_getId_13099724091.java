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

public class PlayerProfile_getId_13099724091 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term683610;

    public PlayerProfile_getId_13099724091() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term684222 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term684221 = ((Class) term684222).getDeclaredField((String) "MISS");
        ((Field) term684221).setAccessible(true);
        Object enum1492 = ((Field) term684221).get((Object) null);
        Class<? extends Object> term684599 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term684598 = ((Class) term684599).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term684598).setAccessible(true);
        Object enum1493 = ((Field) term684598).get((Object) null);
        Class<? extends Object> term684882 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term684881 = ((Class) term684882).getDeclaredField((String) "NORMAL");
        ((Field) term684881).setAccessible(true);
        Object enum1494 = ((Field) term684881).get((Object) null);
        Class<? extends Object> term685157 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term685156 = ((Class) term685157).getDeclaredField((String) "ORIGINAL");
        ((Field) term685156).setAccessible(true);
        Object enum1495 = ((Field) term685156).get((Object) null);
        Class<? extends Object> term685423 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term685422 = ((Class) term685423).getDeclaredField((String) "NONE");
        ((Field) term685422).setAccessible(true);
        Object enum1496 = ((Field) term685422).get((Object) null);
        term683610 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term683733 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term683734 = newInstance(Class.forName("java.time.LocalDate"));
        Object term683738 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term683610, term683610.getClass(), "id", -1084263688306617320L);
        setIntField(term683610, term683610.getClass(), "pdId", -444257155);
        setField(term683610, term683610.getClass(), "playerName", "xxx");
        setIntField(term683610, term683610.getClass(), "vocaloidPoints", 300);
        setIntField(term683610, term683610.getClass(), "level", 1);
        setIntField(term683610, term683610.getClass(), "levelExp", -309536114);
        setField(term683610, term683610.getClass(), "levelTitle", "xxx");
        setIntField(term683610, term683610.getClass(), "plateId", -1);
        setIntField(term683610, term683610.getClass(), "plateEffectId", -1);
        setField(term683610, term683610.getClass(), "passwordStatus", enum1492);
        setField(term683610, term683610.getClass(), "password", "**********");
        setBooleanField(term683610, term683610.getClass(), "preferPerPvModule", true);
        setBooleanField(term683610, term683610.getClass(), "preferCommonModule", false);
        setBooleanField(term683610, term683610.getClass(), "usePerPvSkin", false);
        setBooleanField(term683610, term683610.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term683610, term683610.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term683610, term683610.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term683610, term683610.getClass(), "usePerPvTouchSliderSe", false);
        setField(term683610, term683610.getClass(), "commonModule", "-999,-999,-999");
        setField(term683610, term683610.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term683734, term683734.getClass(), "year", 2026);
        setShortField(term683734, term683734.getClass(), "month", (short) 6);
        setShortField(term683734, term683734.getClass(), "day", (short) 29);
        setField(term683733, term683733.getClass(), "date", term683734);
        setByteField(term683738, term683738.getClass(), "hour", (byte) 4);
        setByteField(term683738, term683738.getClass(), "minute", (byte) 29);
        setByteField(term683738, term683738.getClass(), "second", (byte) 9);
        setIntField(term683738, term683738.getClass(), "nano", 510334000);
        setField(term683733, term683733.getClass(), "time", term683738);
        setField(term683610, term683610.getClass(), "commonModuleSetTime", term683733);
        setField(term683610, term683610.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term683610, term683610.getClass(), "commonSkin", -1);
        setIntField(term683610, term683610.getClass(), "headphoneVolume", 100);
        setBooleanField(term683610, term683610.getClass(), "buttonSeOn", true);
        setIntField(term683610, term683610.getClass(), "buttonSeVolume", 100);
        setIntField(term683610, term683610.getClass(), "sliderSeVolume", 100);
        setIntField(term683610, term683610.getClass(), "buttonSe", -1);
        setIntField(term683610, term683610.getClass(), "chainSlideSe", -1);
        setIntField(term683610, term683610.getClass(), "slideSe", -1);
        setIntField(term683610, term683610.getClass(), "sliderTouchSe", -1);
        setField(term683610, term683610.getClass(), "sortMode", enum1493);
        setIntField(term683610, term683610.getClass(), "nextPvId", -1);
        setField(term683610, term683610.getClass(), "nextDifficulty", enum1494);
        setField(term683610, term683610.getClass(), "nextEdition", enum1495);
        setBooleanField(term683610, term683610.getClass(), "showInterimRanking", true);
        setBooleanField(term683610, term683610.getClass(), "showClearStatus", true);
        setBooleanField(term683610, term683610.getClass(), "showGreatBorder", true);
        setBooleanField(term683610, term683610.getClass(), "showExcellentBorder", true);
        setBooleanField(term683610, term683610.getClass(), "showRivalBorder", true);
        setBooleanField(term683610, term683610.getClass(), "showRgoSetting", true);
        setBooleanField(term683610, term683610.getClass(), "contestNowPlayingEnable", true);
        setIntField(term683610, term683610.getClass(), "contestNowPlayingId", -1);
        setIntField(term683610, term683610.getClass(), "contestNowPlayingValue", -1);
        setField(term683610, term683610.getClass(), "contestNowPlayingResultRank", enum1496);
        setField(term683610, term683610.getClass(), "contestNowPlayingSpecifier", "");
        setField(term683610, term683610.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term683610, term683610.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term683610, term683610.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term683610, term683610.getClass(), "rivalPdId", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term683610, args);
    }

};


