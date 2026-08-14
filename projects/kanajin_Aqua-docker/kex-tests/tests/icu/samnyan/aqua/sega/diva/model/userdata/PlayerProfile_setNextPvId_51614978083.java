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

public class PlayerProfile_setNextPvId_51614978083 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term885212;
     Object term885817;

    public PlayerProfile_setNextPvId_51614978083() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term885826 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term885825 = ((Class) term885826).getDeclaredField((String) "MISS");
        ((Field) term885825).setAccessible(true);
        Object enum1903 = ((Field) term885825).get((Object) null);
        Class<? extends Object> term886203 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term886202 = ((Class) term886203).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term886202).setAccessible(true);
        Object enum1904 = ((Field) term886202).get((Object) null);
        Class<? extends Object> term886486 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term886485 = ((Class) term886486).getDeclaredField((String) "NORMAL");
        ((Field) term886485).setAccessible(true);
        Object enum1905 = ((Field) term886485).get((Object) null);
        Class<? extends Object> term886761 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term886760 = ((Class) term886761).getDeclaredField((String) "ORIGINAL");
        ((Field) term886760).setAccessible(true);
        Object enum1906 = ((Field) term886760).get((Object) null);
        Class<? extends Object> term887027 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term887026 = ((Class) term887027).getDeclaredField((String) "NONE");
        ((Field) term887026).setAccessible(true);
        Object enum1907 = ((Field) term887026).get((Object) null);
        term885212 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term885335 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term885336 = newInstance(Class.forName("java.time.LocalDate"));
        Object term885340 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term885212, term885212.getClass(), "id", 8640463098965331396L);
        setIntField(term885212, term885212.getClass(), "pdId", 372329686);
        setField(term885212, term885212.getClass(), "playerName", "xxx");
        setIntField(term885212, term885212.getClass(), "vocaloidPoints", 300);
        setIntField(term885212, term885212.getClass(), "level", 1);
        setIntField(term885212, term885212.getClass(), "levelExp", -381739191);
        setField(term885212, term885212.getClass(), "levelTitle", "xxx");
        setIntField(term885212, term885212.getClass(), "plateId", -1);
        setIntField(term885212, term885212.getClass(), "plateEffectId", -1);
        setField(term885212, term885212.getClass(), "passwordStatus", enum1903);
        setField(term885212, term885212.getClass(), "password", "**********");
        setBooleanField(term885212, term885212.getClass(), "preferPerPvModule", true);
        setBooleanField(term885212, term885212.getClass(), "preferCommonModule", false);
        setBooleanField(term885212, term885212.getClass(), "usePerPvSkin", false);
        setBooleanField(term885212, term885212.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term885212, term885212.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term885212, term885212.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term885212, term885212.getClass(), "usePerPvTouchSliderSe", true);
        setField(term885212, term885212.getClass(), "commonModule", "-999,-999,-999");
        setField(term885212, term885212.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term885336, term885336.getClass(), "year", 2026);
        setShortField(term885336, term885336.getClass(), "month", (short) 8);
        setShortField(term885336, term885336.getClass(), "day", (short) 12);
        setField(term885335, term885335.getClass(), "date", term885336);
        setByteField(term885340, term885340.getClass(), "hour", (byte) 2);
        setByteField(term885340, term885340.getClass(), "minute", (byte) 4);
        setByteField(term885340, term885340.getClass(), "second", (byte) 44);
        setIntField(term885340, term885340.getClass(), "nano", 90077000);
        setField(term885335, term885335.getClass(), "time", term885340);
        setField(term885212, term885212.getClass(), "commonModuleSetTime", term885335);
        setField(term885212, term885212.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term885212, term885212.getClass(), "commonSkin", -1);
        setIntField(term885212, term885212.getClass(), "headphoneVolume", 100);
        setBooleanField(term885212, term885212.getClass(), "buttonSeOn", true);
        setIntField(term885212, term885212.getClass(), "buttonSeVolume", 100);
        setIntField(term885212, term885212.getClass(), "sliderSeVolume", 100);
        setIntField(term885212, term885212.getClass(), "buttonSe", -1);
        setIntField(term885212, term885212.getClass(), "chainSlideSe", -1);
        setIntField(term885212, term885212.getClass(), "slideSe", -1);
        setIntField(term885212, term885212.getClass(), "sliderTouchSe", -1);
        setField(term885212, term885212.getClass(), "sortMode", enum1904);
        setIntField(term885212, term885212.getClass(), "nextPvId", -1);
        setField(term885212, term885212.getClass(), "nextDifficulty", enum1905);
        setField(term885212, term885212.getClass(), "nextEdition", enum1906);
        setBooleanField(term885212, term885212.getClass(), "showInterimRanking", true);
        setBooleanField(term885212, term885212.getClass(), "showClearStatus", true);
        setBooleanField(term885212, term885212.getClass(), "showGreatBorder", true);
        setBooleanField(term885212, term885212.getClass(), "showExcellentBorder", true);
        setBooleanField(term885212, term885212.getClass(), "showRivalBorder", true);
        setBooleanField(term885212, term885212.getClass(), "showRgoSetting", true);
        setBooleanField(term885212, term885212.getClass(), "contestNowPlayingEnable", true);
        setIntField(term885212, term885212.getClass(), "contestNowPlayingId", -1);
        setIntField(term885212, term885212.getClass(), "contestNowPlayingValue", -1);
        setField(term885212, term885212.getClass(), "contestNowPlayingResultRank", enum1907);
        setField(term885212, term885212.getClass(), "contestNowPlayingSpecifier", "");
        setField(term885212, term885212.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term885212, term885212.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term885212, term885212.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term885212, term885212.getClass(), "rivalPdId", -1);
        term885817 = new Integer(-432438127);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term885817;
        callMethod(klass, "setNextPvId", argTypes, term885212, args);
    }

};


