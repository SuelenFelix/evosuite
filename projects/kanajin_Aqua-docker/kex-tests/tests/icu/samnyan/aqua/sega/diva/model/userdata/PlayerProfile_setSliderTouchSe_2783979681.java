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

public class PlayerProfile_setSliderTouchSe_2783979681 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term880036;
     Object term880641;

    public PlayerProfile_setSliderTouchSe_2783979681() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term880650 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term880649 = ((Class) term880650).getDeclaredField((String) "MISS");
        ((Field) term880649).setAccessible(true);
        Object enum1892 = ((Field) term880649).get((Object) null);
        Class<? extends Object> term881027 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term881026 = ((Class) term881027).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term881026).setAccessible(true);
        Object enum1893 = ((Field) term881026).get((Object) null);
        Class<? extends Object> term881310 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term881309 = ((Class) term881310).getDeclaredField((String) "NORMAL");
        ((Field) term881309).setAccessible(true);
        Object enum1894 = ((Field) term881309).get((Object) null);
        Class<? extends Object> term881585 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term881584 = ((Class) term881585).getDeclaredField((String) "ORIGINAL");
        ((Field) term881584).setAccessible(true);
        Object enum1895 = ((Field) term881584).get((Object) null);
        Class<? extends Object> term881851 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term881850 = ((Class) term881851).getDeclaredField((String) "NONE");
        ((Field) term881850).setAccessible(true);
        Object enum1896 = ((Field) term881850).get((Object) null);
        term880036 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term880159 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term880160 = newInstance(Class.forName("java.time.LocalDate"));
        Object term880164 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term880036, term880036.getClass(), "id", 1528628920302068646L);
        setIntField(term880036, term880036.getClass(), "pdId", -640093979);
        setField(term880036, term880036.getClass(), "playerName", "xxx");
        setIntField(term880036, term880036.getClass(), "vocaloidPoints", 300);
        setIntField(term880036, term880036.getClass(), "level", 1);
        setIntField(term880036, term880036.getClass(), "levelExp", 1665282382);
        setField(term880036, term880036.getClass(), "levelTitle", "xxx");
        setIntField(term880036, term880036.getClass(), "plateId", -1);
        setIntField(term880036, term880036.getClass(), "plateEffectId", -1);
        setField(term880036, term880036.getClass(), "passwordStatus", enum1892);
        setField(term880036, term880036.getClass(), "password", "**********");
        setBooleanField(term880036, term880036.getClass(), "preferPerPvModule", true);
        setBooleanField(term880036, term880036.getClass(), "preferCommonModule", false);
        setBooleanField(term880036, term880036.getClass(), "usePerPvSkin", false);
        setBooleanField(term880036, term880036.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term880036, term880036.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term880036, term880036.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term880036, term880036.getClass(), "usePerPvTouchSliderSe", true);
        setField(term880036, term880036.getClass(), "commonModule", "-999,-999,-999");
        setField(term880036, term880036.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term880160, term880160.getClass(), "year", 2026);
        setShortField(term880160, term880160.getClass(), "month", (short) 8);
        setShortField(term880160, term880160.getClass(), "day", (short) 12);
        setField(term880159, term880159.getClass(), "date", term880160);
        setByteField(term880164, term880164.getClass(), "hour", (byte) 2);
        setByteField(term880164, term880164.getClass(), "minute", (byte) 4);
        setByteField(term880164, term880164.getClass(), "second", (byte) 43);
        setIntField(term880164, term880164.getClass(), "nano", 579978000);
        setField(term880159, term880159.getClass(), "time", term880164);
        setField(term880036, term880036.getClass(), "commonModuleSetTime", term880159);
        setField(term880036, term880036.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term880036, term880036.getClass(), "commonSkin", -1);
        setIntField(term880036, term880036.getClass(), "headphoneVolume", 100);
        setBooleanField(term880036, term880036.getClass(), "buttonSeOn", true);
        setIntField(term880036, term880036.getClass(), "buttonSeVolume", 100);
        setIntField(term880036, term880036.getClass(), "sliderSeVolume", 100);
        setIntField(term880036, term880036.getClass(), "buttonSe", -1);
        setIntField(term880036, term880036.getClass(), "chainSlideSe", -1);
        setIntField(term880036, term880036.getClass(), "slideSe", -1);
        setIntField(term880036, term880036.getClass(), "sliderTouchSe", -1);
        setField(term880036, term880036.getClass(), "sortMode", enum1893);
        setIntField(term880036, term880036.getClass(), "nextPvId", -1);
        setField(term880036, term880036.getClass(), "nextDifficulty", enum1894);
        setField(term880036, term880036.getClass(), "nextEdition", enum1895);
        setBooleanField(term880036, term880036.getClass(), "showInterimRanking", true);
        setBooleanField(term880036, term880036.getClass(), "showClearStatus", true);
        setBooleanField(term880036, term880036.getClass(), "showGreatBorder", true);
        setBooleanField(term880036, term880036.getClass(), "showExcellentBorder", true);
        setBooleanField(term880036, term880036.getClass(), "showRivalBorder", true);
        setBooleanField(term880036, term880036.getClass(), "showRgoSetting", true);
        setBooleanField(term880036, term880036.getClass(), "contestNowPlayingEnable", true);
        setIntField(term880036, term880036.getClass(), "contestNowPlayingId", -1);
        setIntField(term880036, term880036.getClass(), "contestNowPlayingValue", -1);
        setField(term880036, term880036.getClass(), "contestNowPlayingResultRank", enum1896);
        setField(term880036, term880036.getClass(), "contestNowPlayingSpecifier", "");
        setField(term880036, term880036.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term880036, term880036.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term880036, term880036.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term880036, term880036.getClass(), "rivalPdId", -1);
        term880641 = new Integer(1536865175);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term880641;
        callMethod(klass, "setSliderTouchSe", argTypes, term880036, args);
    }

};


