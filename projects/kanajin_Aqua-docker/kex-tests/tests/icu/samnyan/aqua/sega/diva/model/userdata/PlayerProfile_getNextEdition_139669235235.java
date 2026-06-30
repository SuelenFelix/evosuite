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

public class PlayerProfile_getNextEdition_139669235235 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term767012;

    public PlayerProfile_getNextEdition_139669235235() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term767624 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term767623 = ((Class) term767624).getDeclaredField((String) "MISS");
        ((Field) term767623).setAccessible(true);
        Object enum1662 = ((Field) term767623).get((Object) null);
        Class<? extends Object> term768001 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term768000 = ((Class) term768001).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term768000).setAccessible(true);
        Object enum1663 = ((Field) term768000).get((Object) null);
        Class<? extends Object> term768284 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term768283 = ((Class) term768284).getDeclaredField((String) "NORMAL");
        ((Field) term768283).setAccessible(true);
        Object enum1664 = ((Field) term768283).get((Object) null);
        Class<? extends Object> term768559 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term768558 = ((Class) term768559).getDeclaredField((String) "ORIGINAL");
        ((Field) term768558).setAccessible(true);
        Object enum1665 = ((Field) term768558).get((Object) null);
        Class<? extends Object> term768825 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term768824 = ((Class) term768825).getDeclaredField((String) "NONE");
        ((Field) term768824).setAccessible(true);
        Object enum1666 = ((Field) term768824).get((Object) null);
        term767012 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term767135 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term767136 = newInstance(Class.forName("java.time.LocalDate"));
        Object term767140 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term767012, term767012.getClass(), "id", -6423955170741487890L);
        setIntField(term767012, term767012.getClass(), "pdId", 1590263959);
        setField(term767012, term767012.getClass(), "playerName", "xxx");
        setIntField(term767012, term767012.getClass(), "vocaloidPoints", 300);
        setIntField(term767012, term767012.getClass(), "level", 1);
        setIntField(term767012, term767012.getClass(), "levelExp", -203971814);
        setField(term767012, term767012.getClass(), "levelTitle", "xxx");
        setIntField(term767012, term767012.getClass(), "plateId", -1);
        setIntField(term767012, term767012.getClass(), "plateEffectId", -1);
        setField(term767012, term767012.getClass(), "passwordStatus", enum1662);
        setField(term767012, term767012.getClass(), "password", "**********");
        setBooleanField(term767012, term767012.getClass(), "preferPerPvModule", true);
        setBooleanField(term767012, term767012.getClass(), "preferCommonModule", true);
        setBooleanField(term767012, term767012.getClass(), "usePerPvSkin", false);
        setBooleanField(term767012, term767012.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term767012, term767012.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term767012, term767012.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term767012, term767012.getClass(), "usePerPvTouchSliderSe", true);
        setField(term767012, term767012.getClass(), "commonModule", "-999,-999,-999");
        setField(term767012, term767012.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term767136, term767136.getClass(), "year", 2026);
        setShortField(term767136, term767136.getClass(), "month", (short) 6);
        setShortField(term767136, term767136.getClass(), "day", (short) 29);
        setField(term767135, term767135.getClass(), "date", term767136);
        setByteField(term767140, term767140.getClass(), "hour", (byte) 4);
        setByteField(term767140, term767140.getClass(), "minute", (byte) 29);
        setByteField(term767140, term767140.getClass(), "second", (byte) 18);
        setIntField(term767140, term767140.getClass(), "nano", 238846000);
        setField(term767135, term767135.getClass(), "time", term767140);
        setField(term767012, term767012.getClass(), "commonModuleSetTime", term767135);
        setField(term767012, term767012.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term767012, term767012.getClass(), "commonSkin", -1);
        setIntField(term767012, term767012.getClass(), "headphoneVolume", 100);
        setBooleanField(term767012, term767012.getClass(), "buttonSeOn", true);
        setIntField(term767012, term767012.getClass(), "buttonSeVolume", 100);
        setIntField(term767012, term767012.getClass(), "sliderSeVolume", 100);
        setIntField(term767012, term767012.getClass(), "buttonSe", -1);
        setIntField(term767012, term767012.getClass(), "chainSlideSe", -1);
        setIntField(term767012, term767012.getClass(), "slideSe", -1);
        setIntField(term767012, term767012.getClass(), "sliderTouchSe", -1);
        setField(term767012, term767012.getClass(), "sortMode", enum1663);
        setIntField(term767012, term767012.getClass(), "nextPvId", -1);
        setField(term767012, term767012.getClass(), "nextDifficulty", enum1664);
        setField(term767012, term767012.getClass(), "nextEdition", enum1665);
        setBooleanField(term767012, term767012.getClass(), "showInterimRanking", true);
        setBooleanField(term767012, term767012.getClass(), "showClearStatus", true);
        setBooleanField(term767012, term767012.getClass(), "showGreatBorder", true);
        setBooleanField(term767012, term767012.getClass(), "showExcellentBorder", true);
        setBooleanField(term767012, term767012.getClass(), "showRivalBorder", true);
        setBooleanField(term767012, term767012.getClass(), "showRgoSetting", true);
        setBooleanField(term767012, term767012.getClass(), "contestNowPlayingEnable", false);
        setIntField(term767012, term767012.getClass(), "contestNowPlayingId", -1);
        setIntField(term767012, term767012.getClass(), "contestNowPlayingValue", -1);
        setField(term767012, term767012.getClass(), "contestNowPlayingResultRank", enum1666);
        setField(term767012, term767012.getClass(), "contestNowPlayingSpecifier", "");
        setField(term767012, term767012.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term767012, term767012.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term767012, term767012.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term767012, term767012.getClass(), "rivalPdId", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNextEdition", argTypes, term767012, args);
    }

};


