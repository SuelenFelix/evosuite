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

public class PlayerProfile_getNextDifficulty_100217471834 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term764559;

    public PlayerProfile_getNextDifficulty_100217471834() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term765171 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term765170 = ((Class) term765171).getDeclaredField((String) "MISS");
        ((Field) term765170).setAccessible(true);
        Object enum1657 = ((Field) term765170).get((Object) null);
        Class<? extends Object> term765548 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term765547 = ((Class) term765548).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term765547).setAccessible(true);
        Object enum1658 = ((Field) term765547).get((Object) null);
        Class<? extends Object> term765831 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term765830 = ((Class) term765831).getDeclaredField((String) "NORMAL");
        ((Field) term765830).setAccessible(true);
        Object enum1659 = ((Field) term765830).get((Object) null);
        Class<? extends Object> term766106 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term766105 = ((Class) term766106).getDeclaredField((String) "ORIGINAL");
        ((Field) term766105).setAccessible(true);
        Object enum1660 = ((Field) term766105).get((Object) null);
        Class<? extends Object> term766372 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term766371 = ((Class) term766372).getDeclaredField((String) "NONE");
        ((Field) term766371).setAccessible(true);
        Object enum1661 = ((Field) term766371).get((Object) null);
        term764559 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term764682 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term764683 = newInstance(Class.forName("java.time.LocalDate"));
        Object term764687 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term764559, term764559.getClass(), "id", 1950957495500453461L);
        setIntField(term764559, term764559.getClass(), "pdId", 1384334359);
        setField(term764559, term764559.getClass(), "playerName", "xxx");
        setIntField(term764559, term764559.getClass(), "vocaloidPoints", 300);
        setIntField(term764559, term764559.getClass(), "level", 1);
        setIntField(term764559, term764559.getClass(), "levelExp", -552245510);
        setField(term764559, term764559.getClass(), "levelTitle", "xxx");
        setIntField(term764559, term764559.getClass(), "plateId", -1);
        setIntField(term764559, term764559.getClass(), "plateEffectId", -1);
        setField(term764559, term764559.getClass(), "passwordStatus", enum1657);
        setField(term764559, term764559.getClass(), "password", "**********");
        setBooleanField(term764559, term764559.getClass(), "preferPerPvModule", true);
        setBooleanField(term764559, term764559.getClass(), "preferCommonModule", false);
        setBooleanField(term764559, term764559.getClass(), "usePerPvSkin", true);
        setBooleanField(term764559, term764559.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term764559, term764559.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term764559, term764559.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term764559, term764559.getClass(), "usePerPvTouchSliderSe", true);
        setField(term764559, term764559.getClass(), "commonModule", "-999,-999,-999");
        setField(term764559, term764559.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term764683, term764683.getClass(), "year", 2026);
        setShortField(term764683, term764683.getClass(), "month", (short) 8);
        setShortField(term764683, term764683.getClass(), "day", (short) 12);
        setField(term764682, term764682.getClass(), "date", term764683);
        setByteField(term764687, term764687.getClass(), "hour", (byte) 2);
        setByteField(term764687, term764687.getClass(), "minute", (byte) 4);
        setByteField(term764687, term764687.getClass(), "second", (byte) 31);
        setIntField(term764687, term764687.getClass(), "nano", 232991000);
        setField(term764682, term764682.getClass(), "time", term764687);
        setField(term764559, term764559.getClass(), "commonModuleSetTime", term764682);
        setField(term764559, term764559.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term764559, term764559.getClass(), "commonSkin", -1);
        setIntField(term764559, term764559.getClass(), "headphoneVolume", 100);
        setBooleanField(term764559, term764559.getClass(), "buttonSeOn", true);
        setIntField(term764559, term764559.getClass(), "buttonSeVolume", 100);
        setIntField(term764559, term764559.getClass(), "sliderSeVolume", 100);
        setIntField(term764559, term764559.getClass(), "buttonSe", -1);
        setIntField(term764559, term764559.getClass(), "chainSlideSe", -1);
        setIntField(term764559, term764559.getClass(), "slideSe", -1);
        setIntField(term764559, term764559.getClass(), "sliderTouchSe", -1);
        setField(term764559, term764559.getClass(), "sortMode", enum1658);
        setIntField(term764559, term764559.getClass(), "nextPvId", -1);
        setField(term764559, term764559.getClass(), "nextDifficulty", enum1659);
        setField(term764559, term764559.getClass(), "nextEdition", enum1660);
        setBooleanField(term764559, term764559.getClass(), "showInterimRanking", true);
        setBooleanField(term764559, term764559.getClass(), "showClearStatus", true);
        setBooleanField(term764559, term764559.getClass(), "showGreatBorder", true);
        setBooleanField(term764559, term764559.getClass(), "showExcellentBorder", true);
        setBooleanField(term764559, term764559.getClass(), "showRivalBorder", true);
        setBooleanField(term764559, term764559.getClass(), "showRgoSetting", true);
        setBooleanField(term764559, term764559.getClass(), "contestNowPlayingEnable", true);
        setIntField(term764559, term764559.getClass(), "contestNowPlayingId", -1);
        setIntField(term764559, term764559.getClass(), "contestNowPlayingValue", -1);
        setField(term764559, term764559.getClass(), "contestNowPlayingResultRank", enum1661);
        setField(term764559, term764559.getClass(), "contestNowPlayingSpecifier", "");
        setField(term764559, term764559.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term764559, term764559.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term764559, term764559.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term764559, term764559.getClass(), "rivalPdId", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNextDifficulty", argTypes, term764559, args);
    }

};


