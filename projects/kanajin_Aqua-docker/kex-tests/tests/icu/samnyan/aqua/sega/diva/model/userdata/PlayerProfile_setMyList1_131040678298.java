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

public class PlayerProfile_setMyList1_131040678298 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term922639;

    public PlayerProfile_setMyList1_131040678298() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term923263 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term923262 = ((Class) term923263).getDeclaredField((String) "MISS");
        ((Field) term923262).setAccessible(true);
        Object enum1980 = ((Field) term923262).get((Object) null);
        Class<? extends Object> term923640 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term923639 = ((Class) term923640).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term923639).setAccessible(true);
        Object enum1981 = ((Field) term923639).get((Object) null);
        Class<? extends Object> term923923 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term923922 = ((Class) term923923).getDeclaredField((String) "NORMAL");
        ((Field) term923922).setAccessible(true);
        Object enum1982 = ((Field) term923922).get((Object) null);
        Class<? extends Object> term924198 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term924197 = ((Class) term924198).getDeclaredField((String) "ORIGINAL");
        ((Field) term924197).setAccessible(true);
        Object enum1983 = ((Field) term924197).get((Object) null);
        Class<? extends Object> term924464 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term924463 = ((Class) term924464).getDeclaredField((String) "NONE");
        ((Field) term924463).setAccessible(true);
        Object enum1984 = ((Field) term924463).get((Object) null);
        term922639 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term922762 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term922763 = newInstance(Class.forName("java.time.LocalDate"));
        Object term922767 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term922639, term922639.getClass(), "id", 797798302378380033L);
        setIntField(term922639, term922639.getClass(), "pdId", -189980304);
        setField(term922639, term922639.getClass(), "playerName", "xxx");
        setIntField(term922639, term922639.getClass(), "vocaloidPoints", 300);
        setIntField(term922639, term922639.getClass(), "level", 1);
        setIntField(term922639, term922639.getClass(), "levelExp", 1492044959);
        setField(term922639, term922639.getClass(), "levelTitle", "xxx");
        setIntField(term922639, term922639.getClass(), "plateId", -1);
        setIntField(term922639, term922639.getClass(), "plateEffectId", -1);
        setField(term922639, term922639.getClass(), "passwordStatus", enum1980);
        setField(term922639, term922639.getClass(), "password", "**********");
        setBooleanField(term922639, term922639.getClass(), "preferPerPvModule", true);
        setBooleanField(term922639, term922639.getClass(), "preferCommonModule", false);
        setBooleanField(term922639, term922639.getClass(), "usePerPvSkin", false);
        setBooleanField(term922639, term922639.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term922639, term922639.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term922639, term922639.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term922639, term922639.getClass(), "usePerPvTouchSliderSe", true);
        setField(term922639, term922639.getClass(), "commonModule", "-999,-999,-999");
        setField(term922639, term922639.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term922763, term922763.getClass(), "year", 2026);
        setShortField(term922763, term922763.getClass(), "month", (short) 8);
        setShortField(term922763, term922763.getClass(), "day", (short) 12);
        setField(term922762, term922762.getClass(), "date", term922763);
        setByteField(term922767, term922767.getClass(), "hour", (byte) 2);
        setByteField(term922767, term922767.getClass(), "minute", (byte) 4);
        setByteField(term922767, term922767.getClass(), "second", (byte) 48);
        setIntField(term922767, term922767.getClass(), "nano", 16145000);
        setField(term922762, term922762.getClass(), "time", term922767);
        setField(term922639, term922639.getClass(), "commonModuleSetTime", term922762);
        setField(term922639, term922639.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term922639, term922639.getClass(), "commonSkin", -1);
        setIntField(term922639, term922639.getClass(), "headphoneVolume", 100);
        setBooleanField(term922639, term922639.getClass(), "buttonSeOn", true);
        setIntField(term922639, term922639.getClass(), "buttonSeVolume", 100);
        setIntField(term922639, term922639.getClass(), "sliderSeVolume", 100);
        setIntField(term922639, term922639.getClass(), "buttonSe", -1);
        setIntField(term922639, term922639.getClass(), "chainSlideSe", -1);
        setIntField(term922639, term922639.getClass(), "slideSe", -1);
        setIntField(term922639, term922639.getClass(), "sliderTouchSe", -1);
        setField(term922639, term922639.getClass(), "sortMode", enum1981);
        setIntField(term922639, term922639.getClass(), "nextPvId", -1);
        setField(term922639, term922639.getClass(), "nextDifficulty", enum1982);
        setField(term922639, term922639.getClass(), "nextEdition", enum1983);
        setBooleanField(term922639, term922639.getClass(), "showInterimRanking", true);
        setBooleanField(term922639, term922639.getClass(), "showClearStatus", true);
        setBooleanField(term922639, term922639.getClass(), "showGreatBorder", true);
        setBooleanField(term922639, term922639.getClass(), "showExcellentBorder", true);
        setBooleanField(term922639, term922639.getClass(), "showRivalBorder", true);
        setBooleanField(term922639, term922639.getClass(), "showRgoSetting", true);
        setBooleanField(term922639, term922639.getClass(), "contestNowPlayingEnable", true);
        setIntField(term922639, term922639.getClass(), "contestNowPlayingId", -1);
        setIntField(term922639, term922639.getClass(), "contestNowPlayingValue", -1);
        setField(term922639, term922639.getClass(), "contestNowPlayingResultRank", enum1984);
        setField(term922639, term922639.getClass(), "contestNowPlayingSpecifier", "");
        setField(term922639, term922639.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term922639, term922639.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term922639, term922639.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term922639, term922639.getClass(), "rivalPdId", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "lgQkrXANyI";
        callMethod(klass, "setMyList1", argTypes, term922639, args);
    }

};


