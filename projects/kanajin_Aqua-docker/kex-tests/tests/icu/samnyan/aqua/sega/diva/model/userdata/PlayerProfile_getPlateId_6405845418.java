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

public class PlayerProfile_getPlateId_6405845418 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term700781;

    public PlayerProfile_getPlateId_6405845418() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term701393 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term701392 = ((Class) term701393).getDeclaredField((String) "MISS");
        ((Field) term701392).setAccessible(true);
        Object enum1527 = ((Field) term701392).get((Object) null);
        Class<? extends Object> term701770 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term701769 = ((Class) term701770).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term701769).setAccessible(true);
        Object enum1528 = ((Field) term701769).get((Object) null);
        Class<? extends Object> term702053 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term702052 = ((Class) term702053).getDeclaredField((String) "NORMAL");
        ((Field) term702052).setAccessible(true);
        Object enum1529 = ((Field) term702052).get((Object) null);
        Class<? extends Object> term702328 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term702327 = ((Class) term702328).getDeclaredField((String) "ORIGINAL");
        ((Field) term702327).setAccessible(true);
        Object enum1530 = ((Field) term702327).get((Object) null);
        Class<? extends Object> term702594 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term702593 = ((Class) term702594).getDeclaredField((String) "NONE");
        ((Field) term702593).setAccessible(true);
        Object enum1531 = ((Field) term702593).get((Object) null);
        term700781 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term700904 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term700905 = newInstance(Class.forName("java.time.LocalDate"));
        Object term700909 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term700781, term700781.getClass(), "id", 1634166935474035772L);
        setIntField(term700781, term700781.getClass(), "pdId", 205469595);
        setField(term700781, term700781.getClass(), "playerName", "xxx");
        setIntField(term700781, term700781.getClass(), "vocaloidPoints", 300);
        setIntField(term700781, term700781.getClass(), "level", 1);
        setIntField(term700781, term700781.getClass(), "levelExp", -638606539);
        setField(term700781, term700781.getClass(), "levelTitle", "xxx");
        setIntField(term700781, term700781.getClass(), "plateId", -1);
        setIntField(term700781, term700781.getClass(), "plateEffectId", -1);
        setField(term700781, term700781.getClass(), "passwordStatus", enum1527);
        setField(term700781, term700781.getClass(), "password", "**********");
        setBooleanField(term700781, term700781.getClass(), "preferPerPvModule", true);
        setBooleanField(term700781, term700781.getClass(), "preferCommonModule", false);
        setBooleanField(term700781, term700781.getClass(), "usePerPvSkin", true);
        setBooleanField(term700781, term700781.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term700781, term700781.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term700781, term700781.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term700781, term700781.getClass(), "usePerPvTouchSliderSe", true);
        setField(term700781, term700781.getClass(), "commonModule", "-999,-999,-999");
        setField(term700781, term700781.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term700905, term700905.getClass(), "year", 2026);
        setShortField(term700905, term700905.getClass(), "month", (short) 6);
        setShortField(term700905, term700905.getClass(), "day", (short) 29);
        setField(term700904, term700904.getClass(), "date", term700905);
        setByteField(term700909, term700909.getClass(), "hour", (byte) 4);
        setByteField(term700909, term700909.getClass(), "minute", (byte) 29);
        setByteField(term700909, term700909.getClass(), "second", (byte) 11);
        setIntField(term700909, term700909.getClass(), "nano", 302828000);
        setField(term700904, term700904.getClass(), "time", term700909);
        setField(term700781, term700781.getClass(), "commonModuleSetTime", term700904);
        setField(term700781, term700781.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term700781, term700781.getClass(), "commonSkin", -1);
        setIntField(term700781, term700781.getClass(), "headphoneVolume", 100);
        setBooleanField(term700781, term700781.getClass(), "buttonSeOn", true);
        setIntField(term700781, term700781.getClass(), "buttonSeVolume", 100);
        setIntField(term700781, term700781.getClass(), "sliderSeVolume", 100);
        setIntField(term700781, term700781.getClass(), "buttonSe", -1);
        setIntField(term700781, term700781.getClass(), "chainSlideSe", -1);
        setIntField(term700781, term700781.getClass(), "slideSe", -1);
        setIntField(term700781, term700781.getClass(), "sliderTouchSe", -1);
        setField(term700781, term700781.getClass(), "sortMode", enum1528);
        setIntField(term700781, term700781.getClass(), "nextPvId", -1);
        setField(term700781, term700781.getClass(), "nextDifficulty", enum1529);
        setField(term700781, term700781.getClass(), "nextEdition", enum1530);
        setBooleanField(term700781, term700781.getClass(), "showInterimRanking", true);
        setBooleanField(term700781, term700781.getClass(), "showClearStatus", true);
        setBooleanField(term700781, term700781.getClass(), "showGreatBorder", true);
        setBooleanField(term700781, term700781.getClass(), "showExcellentBorder", true);
        setBooleanField(term700781, term700781.getClass(), "showRivalBorder", true);
        setBooleanField(term700781, term700781.getClass(), "showRgoSetting", true);
        setBooleanField(term700781, term700781.getClass(), "contestNowPlayingEnable", false);
        setIntField(term700781, term700781.getClass(), "contestNowPlayingId", -1);
        setIntField(term700781, term700781.getClass(), "contestNowPlayingValue", -1);
        setField(term700781, term700781.getClass(), "contestNowPlayingResultRank", enum1531);
        setField(term700781, term700781.getClass(), "contestNowPlayingSpecifier", "");
        setField(term700781, term700781.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term700781, term700781.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term700781, term700781.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term700781, term700781.getClass(), "rivalPdId", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlateId", argTypes, term700781, args);
    }

};


