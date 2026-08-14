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

public class PlayerProfile_isShowRivalBorder_205337050540 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term779277;

    public PlayerProfile_isShowRivalBorder_205337050540() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term779889 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term779888 = ((Class) term779889).getDeclaredField((String) "MISS");
        ((Field) term779888).setAccessible(true);
        Object enum1687 = ((Field) term779888).get((Object) null);
        Class<? extends Object> term780266 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term780265 = ((Class) term780266).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term780265).setAccessible(true);
        Object enum1688 = ((Field) term780265).get((Object) null);
        Class<? extends Object> term780549 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term780548 = ((Class) term780549).getDeclaredField((String) "NORMAL");
        ((Field) term780548).setAccessible(true);
        Object enum1689 = ((Field) term780548).get((Object) null);
        Class<? extends Object> term780824 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term780823 = ((Class) term780824).getDeclaredField((String) "ORIGINAL");
        ((Field) term780823).setAccessible(true);
        Object enum1690 = ((Field) term780823).get((Object) null);
        Class<? extends Object> term781090 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term781089 = ((Class) term781090).getDeclaredField((String) "NONE");
        ((Field) term781089).setAccessible(true);
        Object enum1691 = ((Field) term781089).get((Object) null);
        term779277 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term779400 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term779401 = newInstance(Class.forName("java.time.LocalDate"));
        Object term779405 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term779277, term779277.getClass(), "id", 7464122056779140588L);
        setIntField(term779277, term779277.getClass(), "pdId", -74479819);
        setField(term779277, term779277.getClass(), "playerName", "xxx");
        setIntField(term779277, term779277.getClass(), "vocaloidPoints", 300);
        setIntField(term779277, term779277.getClass(), "level", 1);
        setIntField(term779277, term779277.getClass(), "levelExp", -1610494666);
        setField(term779277, term779277.getClass(), "levelTitle", "xxx");
        setIntField(term779277, term779277.getClass(), "plateId", -1);
        setIntField(term779277, term779277.getClass(), "plateEffectId", -1);
        setField(term779277, term779277.getClass(), "passwordStatus", enum1687);
        setField(term779277, term779277.getClass(), "password", "**********");
        setBooleanField(term779277, term779277.getClass(), "preferPerPvModule", true);
        setBooleanField(term779277, term779277.getClass(), "preferCommonModule", false);
        setBooleanField(term779277, term779277.getClass(), "usePerPvSkin", false);
        setBooleanField(term779277, term779277.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term779277, term779277.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term779277, term779277.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term779277, term779277.getClass(), "usePerPvTouchSliderSe", false);
        setField(term779277, term779277.getClass(), "commonModule", "-999,-999,-999");
        setField(term779277, term779277.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term779401, term779401.getClass(), "year", 2026);
        setShortField(term779401, term779401.getClass(), "month", (short) 8);
        setShortField(term779401, term779401.getClass(), "day", (short) 12);
        setField(term779400, term779400.getClass(), "date", term779401);
        setByteField(term779405, term779405.getClass(), "hour", (byte) 2);
        setByteField(term779405, term779405.getClass(), "minute", (byte) 4);
        setByteField(term779405, term779405.getClass(), "second", (byte) 32);
        setIntField(term779405, term779405.getClass(), "nano", 844347000);
        setField(term779400, term779400.getClass(), "time", term779405);
        setField(term779277, term779277.getClass(), "commonModuleSetTime", term779400);
        setField(term779277, term779277.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term779277, term779277.getClass(), "commonSkin", -1);
        setIntField(term779277, term779277.getClass(), "headphoneVolume", 100);
        setBooleanField(term779277, term779277.getClass(), "buttonSeOn", true);
        setIntField(term779277, term779277.getClass(), "buttonSeVolume", 100);
        setIntField(term779277, term779277.getClass(), "sliderSeVolume", 100);
        setIntField(term779277, term779277.getClass(), "buttonSe", -1);
        setIntField(term779277, term779277.getClass(), "chainSlideSe", -1);
        setIntField(term779277, term779277.getClass(), "slideSe", -1);
        setIntField(term779277, term779277.getClass(), "sliderTouchSe", -1);
        setField(term779277, term779277.getClass(), "sortMode", enum1688);
        setIntField(term779277, term779277.getClass(), "nextPvId", -1);
        setField(term779277, term779277.getClass(), "nextDifficulty", enum1689);
        setField(term779277, term779277.getClass(), "nextEdition", enum1690);
        setBooleanField(term779277, term779277.getClass(), "showInterimRanking", true);
        setBooleanField(term779277, term779277.getClass(), "showClearStatus", true);
        setBooleanField(term779277, term779277.getClass(), "showGreatBorder", true);
        setBooleanField(term779277, term779277.getClass(), "showExcellentBorder", true);
        setBooleanField(term779277, term779277.getClass(), "showRivalBorder", true);
        setBooleanField(term779277, term779277.getClass(), "showRgoSetting", true);
        setBooleanField(term779277, term779277.getClass(), "contestNowPlayingEnable", false);
        setIntField(term779277, term779277.getClass(), "contestNowPlayingId", -1);
        setIntField(term779277, term779277.getClass(), "contestNowPlayingValue", -1);
        setField(term779277, term779277.getClass(), "contestNowPlayingResultRank", enum1691);
        setField(term779277, term779277.getClass(), "contestNowPlayingSpecifier", "");
        setField(term779277, term779277.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term779277, term779277.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term779277, term779277.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term779277, term779277.getClass(), "rivalPdId", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isShowRivalBorder", argTypes, term779277, args);
    }

};


