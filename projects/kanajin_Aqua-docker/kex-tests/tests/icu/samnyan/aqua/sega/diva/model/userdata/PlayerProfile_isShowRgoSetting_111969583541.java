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

public class PlayerProfile_isShowRgoSetting_111969583541 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term781730;

    public PlayerProfile_isShowRgoSetting_111969583541() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term782342 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term782341 = ((Class) term782342).getDeclaredField((String) "MISS");
        ((Field) term782341).setAccessible(true);
        Object enum1692 = ((Field) term782341).get((Object) null);
        Class<? extends Object> term782719 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term782718 = ((Class) term782719).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term782718).setAccessible(true);
        Object enum1693 = ((Field) term782718).get((Object) null);
        Class<? extends Object> term783002 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term783001 = ((Class) term783002).getDeclaredField((String) "NORMAL");
        ((Field) term783001).setAccessible(true);
        Object enum1694 = ((Field) term783001).get((Object) null);
        Class<? extends Object> term783277 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term783276 = ((Class) term783277).getDeclaredField((String) "ORIGINAL");
        ((Field) term783276).setAccessible(true);
        Object enum1695 = ((Field) term783276).get((Object) null);
        Class<? extends Object> term783543 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term783542 = ((Class) term783543).getDeclaredField((String) "NONE");
        ((Field) term783542).setAccessible(true);
        Object enum1696 = ((Field) term783542).get((Object) null);
        term781730 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term781853 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term781854 = newInstance(Class.forName("java.time.LocalDate"));
        Object term781858 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term781730, term781730.getClass(), "id", 6542357174275680335L);
        setIntField(term781730, term781730.getClass(), "pdId", 564476854);
        setField(term781730, term781730.getClass(), "playerName", "xxx");
        setIntField(term781730, term781730.getClass(), "vocaloidPoints", 300);
        setIntField(term781730, term781730.getClass(), "level", 1);
        setIntField(term781730, term781730.getClass(), "levelExp", 963238257);
        setField(term781730, term781730.getClass(), "levelTitle", "xxx");
        setIntField(term781730, term781730.getClass(), "plateId", -1);
        setIntField(term781730, term781730.getClass(), "plateEffectId", -1);
        setField(term781730, term781730.getClass(), "passwordStatus", enum1692);
        setField(term781730, term781730.getClass(), "password", "**********");
        setBooleanField(term781730, term781730.getClass(), "preferPerPvModule", true);
        setBooleanField(term781730, term781730.getClass(), "preferCommonModule", true);
        setBooleanField(term781730, term781730.getClass(), "usePerPvSkin", false);
        setBooleanField(term781730, term781730.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term781730, term781730.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term781730, term781730.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term781730, term781730.getClass(), "usePerPvTouchSliderSe", false);
        setField(term781730, term781730.getClass(), "commonModule", "-999,-999,-999");
        setField(term781730, term781730.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term781854, term781854.getClass(), "year", 2026);
        setShortField(term781854, term781854.getClass(), "month", (short) 6);
        setShortField(term781854, term781854.getClass(), "day", (short) 29);
        setField(term781853, term781853.getClass(), "date", term781854);
        setByteField(term781858, term781858.getClass(), "hour", (byte) 4);
        setByteField(term781858, term781858.getClass(), "minute", (byte) 29);
        setByteField(term781858, term781858.getClass(), "second", (byte) 19);
        setIntField(term781858, term781858.getClass(), "nano", 778112000);
        setField(term781853, term781853.getClass(), "time", term781858);
        setField(term781730, term781730.getClass(), "commonModuleSetTime", term781853);
        setField(term781730, term781730.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term781730, term781730.getClass(), "commonSkin", -1);
        setIntField(term781730, term781730.getClass(), "headphoneVolume", 100);
        setBooleanField(term781730, term781730.getClass(), "buttonSeOn", true);
        setIntField(term781730, term781730.getClass(), "buttonSeVolume", 100);
        setIntField(term781730, term781730.getClass(), "sliderSeVolume", 100);
        setIntField(term781730, term781730.getClass(), "buttonSe", -1);
        setIntField(term781730, term781730.getClass(), "chainSlideSe", -1);
        setIntField(term781730, term781730.getClass(), "slideSe", -1);
        setIntField(term781730, term781730.getClass(), "sliderTouchSe", -1);
        setField(term781730, term781730.getClass(), "sortMode", enum1693);
        setIntField(term781730, term781730.getClass(), "nextPvId", -1);
        setField(term781730, term781730.getClass(), "nextDifficulty", enum1694);
        setField(term781730, term781730.getClass(), "nextEdition", enum1695);
        setBooleanField(term781730, term781730.getClass(), "showInterimRanking", true);
        setBooleanField(term781730, term781730.getClass(), "showClearStatus", true);
        setBooleanField(term781730, term781730.getClass(), "showGreatBorder", true);
        setBooleanField(term781730, term781730.getClass(), "showExcellentBorder", true);
        setBooleanField(term781730, term781730.getClass(), "showRivalBorder", true);
        setBooleanField(term781730, term781730.getClass(), "showRgoSetting", true);
        setBooleanField(term781730, term781730.getClass(), "contestNowPlayingEnable", false);
        setIntField(term781730, term781730.getClass(), "contestNowPlayingId", -1);
        setIntField(term781730, term781730.getClass(), "contestNowPlayingValue", -1);
        setField(term781730, term781730.getClass(), "contestNowPlayingResultRank", enum1696);
        setField(term781730, term781730.getClass(), "contestNowPlayingSpecifier", "");
        setField(term781730, term781730.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term781730, term781730.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term781730, term781730.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term781730, term781730.getClass(), "rivalPdId", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isShowRgoSetting", argTypes, term781730, args);
    }

};


