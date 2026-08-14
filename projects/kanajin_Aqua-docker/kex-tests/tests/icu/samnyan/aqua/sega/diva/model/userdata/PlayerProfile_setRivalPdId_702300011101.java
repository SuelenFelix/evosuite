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
import java.lang.Integer;

public class PlayerProfile_setRivalPdId_702300011101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4900414;
     Object term4901019;

    public PlayerProfile_setRivalPdId_702300011101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4901028 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term4901027 = ((Class) term4901028).getDeclaredField((String) "MISS");
        ((Field) term4901027).setAccessible(true);
        Object enum3137 = ((Field) term4901027).get((Object) null);
        Class<? extends Object> term4901405 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term4901404 = ((Class) term4901405).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term4901404).setAccessible(true);
        Object enum3138 = ((Field) term4901404).get((Object) null);
        Class<? extends Object> term4901688 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term4901687 = ((Class) term4901688).getDeclaredField((String) "NORMAL");
        ((Field) term4901687).setAccessible(true);
        Object enum3139 = ((Field) term4901687).get((Object) null);
        Class<? extends Object> term4901963 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term4901962 = ((Class) term4901963).getDeclaredField((String) "ORIGINAL");
        ((Field) term4901962).setAccessible(true);
        Object enum3140 = ((Field) term4901962).get((Object) null);
        Class<? extends Object> term4902229 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term4902228 = ((Class) term4902229).getDeclaredField((String) "NONE");
        ((Field) term4902228).setAccessible(true);
        Object enum3141 = ((Field) term4902228).get((Object) null);
        term4900414 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term4900537 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4900538 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4900542 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4900414, term4900414.getClass(), "id", 3849755335068821549L);
        setIntField(term4900414, term4900414.getClass(), "pdId", 1585897321);
        setField(term4900414, term4900414.getClass(), "playerName", "xxx");
        setIntField(term4900414, term4900414.getClass(), "vocaloidPoints", 300);
        setIntField(term4900414, term4900414.getClass(), "level", 1);
        setIntField(term4900414, term4900414.getClass(), "levelExp", -1557991379);
        setField(term4900414, term4900414.getClass(), "levelTitle", "xxx");
        setIntField(term4900414, term4900414.getClass(), "plateId", -1);
        setIntField(term4900414, term4900414.getClass(), "plateEffectId", -1);
        setField(term4900414, term4900414.getClass(), "passwordStatus", enum3137);
        setField(term4900414, term4900414.getClass(), "password", "**********");
        setBooleanField(term4900414, term4900414.getClass(), "preferPerPvModule", true);
        setBooleanField(term4900414, term4900414.getClass(), "preferCommonModule", true);
        setBooleanField(term4900414, term4900414.getClass(), "usePerPvSkin", false);
        setBooleanField(term4900414, term4900414.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term4900414, term4900414.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term4900414, term4900414.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term4900414, term4900414.getClass(), "usePerPvTouchSliderSe", false);
        setField(term4900414, term4900414.getClass(), "commonModule", "-999,-999,-999");
        setField(term4900414, term4900414.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term4900538, term4900538.getClass(), "year", 2026);
        setShortField(term4900538, term4900538.getClass(), "month", (short) 8);
        setShortField(term4900538, term4900538.getClass(), "day", (short) 11);
        setField(term4900537, term4900537.getClass(), "date", term4900538);
        setByteField(term4900542, term4900542.getClass(), "hour", (byte) 23);
        setByteField(term4900542, term4900542.getClass(), "minute", (byte) 7);
        setByteField(term4900542, term4900542.getClass(), "second", (byte) 41);
        setIntField(term4900542, term4900542.getClass(), "nano", 608454000);
        setField(term4900537, term4900537.getClass(), "time", term4900542);
        setField(term4900414, term4900414.getClass(), "commonModuleSetTime", term4900537);
        setField(term4900414, term4900414.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term4900414, term4900414.getClass(), "commonSkin", -1);
        setIntField(term4900414, term4900414.getClass(), "headphoneVolume", 100);
        setBooleanField(term4900414, term4900414.getClass(), "buttonSeOn", true);
        setIntField(term4900414, term4900414.getClass(), "buttonSeVolume", 100);
        setIntField(term4900414, term4900414.getClass(), "sliderSeVolume", 100);
        setIntField(term4900414, term4900414.getClass(), "buttonSe", -1);
        setIntField(term4900414, term4900414.getClass(), "chainSlideSe", -1);
        setIntField(term4900414, term4900414.getClass(), "slideSe", -1);
        setIntField(term4900414, term4900414.getClass(), "sliderTouchSe", -1);
        setField(term4900414, term4900414.getClass(), "sortMode", enum3138);
        setIntField(term4900414, term4900414.getClass(), "nextPvId", -1);
        setField(term4900414, term4900414.getClass(), "nextDifficulty", enum3139);
        setField(term4900414, term4900414.getClass(), "nextEdition", enum3140);
        setBooleanField(term4900414, term4900414.getClass(), "showInterimRanking", true);
        setBooleanField(term4900414, term4900414.getClass(), "showClearStatus", true);
        setBooleanField(term4900414, term4900414.getClass(), "showGreatBorder", true);
        setBooleanField(term4900414, term4900414.getClass(), "showExcellentBorder", true);
        setBooleanField(term4900414, term4900414.getClass(), "showRivalBorder", true);
        setBooleanField(term4900414, term4900414.getClass(), "showRgoSetting", true);
        setBooleanField(term4900414, term4900414.getClass(), "contestNowPlayingEnable", true);
        setIntField(term4900414, term4900414.getClass(), "contestNowPlayingId", -1);
        setIntField(term4900414, term4900414.getClass(), "contestNowPlayingValue", -1);
        setField(term4900414, term4900414.getClass(), "contestNowPlayingResultRank", enum3141);
        setField(term4900414, term4900414.getClass(), "contestNowPlayingSpecifier", "");
        setField(term4900414, term4900414.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term4900414, term4900414.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term4900414, term4900414.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term4900414, term4900414.getClass(), "rivalPdId", -1);
        term4901019 = new Integer(-358439449);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4901019;
        callMethod(klass, "setRivalPdId", argTypes, term4900414, args);
    }

};


