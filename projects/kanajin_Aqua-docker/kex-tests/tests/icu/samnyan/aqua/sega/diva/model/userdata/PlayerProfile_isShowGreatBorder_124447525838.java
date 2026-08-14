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

public class PlayerProfile_isShowGreatBorder_124447525838 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term774371;

    public PlayerProfile_isShowGreatBorder_124447525838() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term774983 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term774982 = ((Class) term774983).getDeclaredField((String) "MISS");
        ((Field) term774982).setAccessible(true);
        Object enum1677 = ((Field) term774982).get((Object) null);
        Class<? extends Object> term775360 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term775359 = ((Class) term775360).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term775359).setAccessible(true);
        Object enum1678 = ((Field) term775359).get((Object) null);
        Class<? extends Object> term775643 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term775642 = ((Class) term775643).getDeclaredField((String) "NORMAL");
        ((Field) term775642).setAccessible(true);
        Object enum1679 = ((Field) term775642).get((Object) null);
        Class<? extends Object> term775918 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term775917 = ((Class) term775918).getDeclaredField((String) "ORIGINAL");
        ((Field) term775917).setAccessible(true);
        Object enum1680 = ((Field) term775917).get((Object) null);
        Class<? extends Object> term776184 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term776183 = ((Class) term776184).getDeclaredField((String) "NONE");
        ((Field) term776183).setAccessible(true);
        Object enum1681 = ((Field) term776183).get((Object) null);
        term774371 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term774494 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term774495 = newInstance(Class.forName("java.time.LocalDate"));
        Object term774499 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term774371, term774371.getClass(), "id", -6237686742902369498L);
        setIntField(term774371, term774371.getClass(), "pdId", 1101065297);
        setField(term774371, term774371.getClass(), "playerName", "xxx");
        setIntField(term774371, term774371.getClass(), "vocaloidPoints", 300);
        setIntField(term774371, term774371.getClass(), "level", 1);
        setIntField(term774371, term774371.getClass(), "levelExp", -110542660);
        setField(term774371, term774371.getClass(), "levelTitle", "xxx");
        setIntField(term774371, term774371.getClass(), "plateId", -1);
        setIntField(term774371, term774371.getClass(), "plateEffectId", -1);
        setField(term774371, term774371.getClass(), "passwordStatus", enum1677);
        setField(term774371, term774371.getClass(), "password", "**********");
        setBooleanField(term774371, term774371.getClass(), "preferPerPvModule", true);
        setBooleanField(term774371, term774371.getClass(), "preferCommonModule", true);
        setBooleanField(term774371, term774371.getClass(), "usePerPvSkin", false);
        setBooleanField(term774371, term774371.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term774371, term774371.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term774371, term774371.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term774371, term774371.getClass(), "usePerPvTouchSliderSe", true);
        setField(term774371, term774371.getClass(), "commonModule", "-999,-999,-999");
        setField(term774371, term774371.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term774495, term774495.getClass(), "year", 2026);
        setShortField(term774495, term774495.getClass(), "month", (short) 8);
        setShortField(term774495, term774495.getClass(), "day", (short) 12);
        setField(term774494, term774494.getClass(), "date", term774495);
        setByteField(term774499, term774499.getClass(), "hour", (byte) 2);
        setByteField(term774499, term774499.getClass(), "minute", (byte) 4);
        setByteField(term774499, term774499.getClass(), "second", (byte) 32);
        setIntField(term774499, term774499.getClass(), "nano", 313277000);
        setField(term774494, term774494.getClass(), "time", term774499);
        setField(term774371, term774371.getClass(), "commonModuleSetTime", term774494);
        setField(term774371, term774371.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term774371, term774371.getClass(), "commonSkin", -1);
        setIntField(term774371, term774371.getClass(), "headphoneVolume", 100);
        setBooleanField(term774371, term774371.getClass(), "buttonSeOn", true);
        setIntField(term774371, term774371.getClass(), "buttonSeVolume", 100);
        setIntField(term774371, term774371.getClass(), "sliderSeVolume", 100);
        setIntField(term774371, term774371.getClass(), "buttonSe", -1);
        setIntField(term774371, term774371.getClass(), "chainSlideSe", -1);
        setIntField(term774371, term774371.getClass(), "slideSe", -1);
        setIntField(term774371, term774371.getClass(), "sliderTouchSe", -1);
        setField(term774371, term774371.getClass(), "sortMode", enum1678);
        setIntField(term774371, term774371.getClass(), "nextPvId", -1);
        setField(term774371, term774371.getClass(), "nextDifficulty", enum1679);
        setField(term774371, term774371.getClass(), "nextEdition", enum1680);
        setBooleanField(term774371, term774371.getClass(), "showInterimRanking", true);
        setBooleanField(term774371, term774371.getClass(), "showClearStatus", true);
        setBooleanField(term774371, term774371.getClass(), "showGreatBorder", true);
        setBooleanField(term774371, term774371.getClass(), "showExcellentBorder", true);
        setBooleanField(term774371, term774371.getClass(), "showRivalBorder", true);
        setBooleanField(term774371, term774371.getClass(), "showRgoSetting", true);
        setBooleanField(term774371, term774371.getClass(), "contestNowPlayingEnable", false);
        setIntField(term774371, term774371.getClass(), "contestNowPlayingId", -1);
        setIntField(term774371, term774371.getClass(), "contestNowPlayingValue", -1);
        setField(term774371, term774371.getClass(), "contestNowPlayingResultRank", enum1681);
        setField(term774371, term774371.getClass(), "contestNowPlayingSpecifier", "");
        setField(term774371, term774371.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term774371, term774371.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term774371, term774371.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term774371, term774371.getClass(), "rivalPdId", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isShowGreatBorder", argTypes, term774371, args);
    }

};


