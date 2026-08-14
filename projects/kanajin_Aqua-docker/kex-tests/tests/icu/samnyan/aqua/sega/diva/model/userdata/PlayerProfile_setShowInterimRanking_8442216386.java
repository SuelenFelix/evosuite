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
import java.lang.Boolean;

public class PlayerProfile_setShowInterimRanking_8442216386 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term892840;
     Object term893445;

    public PlayerProfile_setShowInterimRanking_8442216386() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term893454 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term893453 = ((Class) term893454).getDeclaredField((String) "MISS");
        ((Field) term893453).setAccessible(true);
        Object enum1919 = ((Field) term893453).get((Object) null);
        Class<? extends Object> term893831 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term893830 = ((Class) term893831).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term893830).setAccessible(true);
        Object enum1920 = ((Field) term893830).get((Object) null);
        Class<? extends Object> term894114 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term894113 = ((Class) term894114).getDeclaredField((String) "NORMAL");
        ((Field) term894113).setAccessible(true);
        Object enum1921 = ((Field) term894113).get((Object) null);
        Class<? extends Object> term894389 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term894388 = ((Class) term894389).getDeclaredField((String) "ORIGINAL");
        ((Field) term894388).setAccessible(true);
        Object enum1922 = ((Field) term894388).get((Object) null);
        Class<? extends Object> term894655 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term894654 = ((Class) term894655).getDeclaredField((String) "NONE");
        ((Field) term894654).setAccessible(true);
        Object enum1923 = ((Field) term894654).get((Object) null);
        term892840 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term892963 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term892964 = newInstance(Class.forName("java.time.LocalDate"));
        Object term892968 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term892840, term892840.getClass(), "id", 7656211287234019484L);
        setIntField(term892840, term892840.getClass(), "pdId", -381662221);
        setField(term892840, term892840.getClass(), "playerName", "xxx");
        setIntField(term892840, term892840.getClass(), "vocaloidPoints", 300);
        setIntField(term892840, term892840.getClass(), "level", 1);
        setIntField(term892840, term892840.getClass(), "levelExp", -1367263864);
        setField(term892840, term892840.getClass(), "levelTitle", "xxx");
        setIntField(term892840, term892840.getClass(), "plateId", -1);
        setIntField(term892840, term892840.getClass(), "plateEffectId", -1);
        setField(term892840, term892840.getClass(), "passwordStatus", enum1919);
        setField(term892840, term892840.getClass(), "password", "**********");
        setBooleanField(term892840, term892840.getClass(), "preferPerPvModule", true);
        setBooleanField(term892840, term892840.getClass(), "preferCommonModule", true);
        setBooleanField(term892840, term892840.getClass(), "usePerPvSkin", false);
        setBooleanField(term892840, term892840.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term892840, term892840.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term892840, term892840.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term892840, term892840.getClass(), "usePerPvTouchSliderSe", true);
        setField(term892840, term892840.getClass(), "commonModule", "-999,-999,-999");
        setField(term892840, term892840.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term892964, term892964.getClass(), "year", 2026);
        setShortField(term892964, term892964.getClass(), "month", (short) 8);
        setShortField(term892964, term892964.getClass(), "day", (short) 12);
        setField(term892963, term892963.getClass(), "date", term892964);
        setByteField(term892968, term892968.getClass(), "hour", (byte) 2);
        setByteField(term892968, term892968.getClass(), "minute", (byte) 4);
        setByteField(term892968, term892968.getClass(), "second", (byte) 44);
        setIntField(term892968, term892968.getClass(), "nano", 912332000);
        setField(term892963, term892963.getClass(), "time", term892968);
        setField(term892840, term892840.getClass(), "commonModuleSetTime", term892963);
        setField(term892840, term892840.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term892840, term892840.getClass(), "commonSkin", -1);
        setIntField(term892840, term892840.getClass(), "headphoneVolume", 100);
        setBooleanField(term892840, term892840.getClass(), "buttonSeOn", true);
        setIntField(term892840, term892840.getClass(), "buttonSeVolume", 100);
        setIntField(term892840, term892840.getClass(), "sliderSeVolume", 100);
        setIntField(term892840, term892840.getClass(), "buttonSe", -1);
        setIntField(term892840, term892840.getClass(), "chainSlideSe", -1);
        setIntField(term892840, term892840.getClass(), "slideSe", -1);
        setIntField(term892840, term892840.getClass(), "sliderTouchSe", -1);
        setField(term892840, term892840.getClass(), "sortMode", enum1920);
        setIntField(term892840, term892840.getClass(), "nextPvId", -1);
        setField(term892840, term892840.getClass(), "nextDifficulty", enum1921);
        setField(term892840, term892840.getClass(), "nextEdition", enum1922);
        setBooleanField(term892840, term892840.getClass(), "showInterimRanking", true);
        setBooleanField(term892840, term892840.getClass(), "showClearStatus", true);
        setBooleanField(term892840, term892840.getClass(), "showGreatBorder", true);
        setBooleanField(term892840, term892840.getClass(), "showExcellentBorder", true);
        setBooleanField(term892840, term892840.getClass(), "showRivalBorder", true);
        setBooleanField(term892840, term892840.getClass(), "showRgoSetting", true);
        setBooleanField(term892840, term892840.getClass(), "contestNowPlayingEnable", false);
        setIntField(term892840, term892840.getClass(), "contestNowPlayingId", -1);
        setIntField(term892840, term892840.getClass(), "contestNowPlayingValue", -1);
        setField(term892840, term892840.getClass(), "contestNowPlayingResultRank", enum1923);
        setField(term892840, term892840.getClass(), "contestNowPlayingSpecifier", "");
        setField(term892840, term892840.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term892840, term892840.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term892840, term892840.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term892840, term892840.getClass(), "rivalPdId", -1);
        term893445 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term893445;
        callMethod(klass, "setShowInterimRanking", argTypes, term892840, args);
    }

};


