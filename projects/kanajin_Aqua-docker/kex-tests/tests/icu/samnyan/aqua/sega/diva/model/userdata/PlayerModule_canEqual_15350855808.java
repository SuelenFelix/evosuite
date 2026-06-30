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
import java.lang.Object;
import java.lang.String;

public class PlayerModule_canEqual_15350855808 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term673720;
     Object term674328;

    public PlayerModule_canEqual_15350855808() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term674336 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term674335 = ((Class) term674336).getDeclaredField((String) "MISS");
        ((Field) term674335).setAccessible(true);
        Object enum1472 = ((Field) term674335).get((Object) null);
        Class<? extends Object> term674713 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term674712 = ((Class) term674713).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term674712).setAccessible(true);
        Object enum1473 = ((Field) term674712).get((Object) null);
        Class<? extends Object> term674996 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term674995 = ((Class) term674996).getDeclaredField((String) "NORMAL");
        ((Field) term674995).setAccessible(true);
        Object enum1474 = ((Field) term674995).get((Object) null);
        Class<? extends Object> term675271 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term675270 = ((Class) term675271).getDeclaredField((String) "ORIGINAL");
        ((Field) term675270).setAccessible(true);
        Object enum1475 = ((Field) term675270).get((Object) null);
        Class<? extends Object> term675537 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term675536 = ((Class) term675537).getDeclaredField((String) "NONE");
        ((Field) term675536).setAccessible(true);
        Object enum1476 = ((Field) term675536).get((Object) null);
        term673720 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerModule"));
        Object term673722 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term673845 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term673846 = newInstance(Class.forName("java.time.LocalDate"));
        Object term673850 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term673720, term673720.getClass(), "id", -3753621038448351550L);
        setLongField(term673722, term673722.getClass(), "id", 5304481534735378567L);
        setIntField(term673722, term673722.getClass(), "pdId", -2110210183);
        setField(term673722, term673722.getClass(), "playerName", "xxx");
        setIntField(term673722, term673722.getClass(), "vocaloidPoints", 300);
        setIntField(term673722, term673722.getClass(), "level", 1);
        setIntField(term673722, term673722.getClass(), "levelExp", -687531774);
        setField(term673722, term673722.getClass(), "levelTitle", "xxx");
        setIntField(term673722, term673722.getClass(), "plateId", -1);
        setIntField(term673722, term673722.getClass(), "plateEffectId", -1);
        setField(term673722, term673722.getClass(), "passwordStatus", enum1472);
        setField(term673722, term673722.getClass(), "password", "**********");
        setBooleanField(term673722, term673722.getClass(), "preferPerPvModule", true);
        setBooleanField(term673722, term673722.getClass(), "preferCommonModule", false);
        setBooleanField(term673722, term673722.getClass(), "usePerPvSkin", true);
        setBooleanField(term673722, term673722.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term673722, term673722.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term673722, term673722.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term673722, term673722.getClass(), "usePerPvTouchSliderSe", true);
        setField(term673722, term673722.getClass(), "commonModule", "-999,-999,-999");
        setField(term673722, term673722.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term673846, term673846.getClass(), "year", 2026);
        setShortField(term673846, term673846.getClass(), "month", (short) 6);
        setShortField(term673846, term673846.getClass(), "day", (short) 29);
        setField(term673845, term673845.getClass(), "date", term673846);
        setByteField(term673850, term673850.getClass(), "hour", (byte) 4);
        setByteField(term673850, term673850.getClass(), "minute", (byte) 29);
        setByteField(term673850, term673850.getClass(), "second", (byte) 4);
        setIntField(term673850, term673850.getClass(), "nano", 693100000);
        setField(term673845, term673845.getClass(), "time", term673850);
        setField(term673722, term673722.getClass(), "commonModuleSetTime", term673845);
        setField(term673722, term673722.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term673722, term673722.getClass(), "commonSkin", -1);
        setIntField(term673722, term673722.getClass(), "headphoneVolume", 100);
        setBooleanField(term673722, term673722.getClass(), "buttonSeOn", true);
        setIntField(term673722, term673722.getClass(), "buttonSeVolume", 100);
        setIntField(term673722, term673722.getClass(), "sliderSeVolume", 100);
        setIntField(term673722, term673722.getClass(), "buttonSe", -1);
        setIntField(term673722, term673722.getClass(), "chainSlideSe", -1);
        setIntField(term673722, term673722.getClass(), "slideSe", -1);
        setIntField(term673722, term673722.getClass(), "sliderTouchSe", -1);
        setField(term673722, term673722.getClass(), "sortMode", enum1473);
        setIntField(term673722, term673722.getClass(), "nextPvId", -1);
        setField(term673722, term673722.getClass(), "nextDifficulty", enum1474);
        setField(term673722, term673722.getClass(), "nextEdition", enum1475);
        setBooleanField(term673722, term673722.getClass(), "showInterimRanking", true);
        setBooleanField(term673722, term673722.getClass(), "showClearStatus", true);
        setBooleanField(term673722, term673722.getClass(), "showGreatBorder", true);
        setBooleanField(term673722, term673722.getClass(), "showExcellentBorder", true);
        setBooleanField(term673722, term673722.getClass(), "showRivalBorder", true);
        setBooleanField(term673722, term673722.getClass(), "showRgoSetting", true);
        setBooleanField(term673722, term673722.getClass(), "contestNowPlayingEnable", true);
        setIntField(term673722, term673722.getClass(), "contestNowPlayingId", -1);
        setIntField(term673722, term673722.getClass(), "contestNowPlayingValue", -1);
        setField(term673722, term673722.getClass(), "contestNowPlayingResultRank", enum1476);
        setField(term673722, term673722.getClass(), "contestNowPlayingSpecifier", "");
        setField(term673722, term673722.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term673722, term673722.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term673722, term673722.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term673722, term673722.getClass(), "rivalPdId", -1);
        setField(term673720, term673720.getClass(), "pdId", term673722);
        setIntField(term673720, term673720.getClass(), "moduleId", -1997574107);
        term674328 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerModule");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term674328;
        callMethod(klass, "canEqual", argTypes, term673720, args);
    }

};


