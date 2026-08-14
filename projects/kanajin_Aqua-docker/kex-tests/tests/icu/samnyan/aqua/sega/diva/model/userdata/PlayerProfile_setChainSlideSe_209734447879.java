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

public class PlayerProfile_setChainSlideSe_209734447879 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term875126;
     Object term875731;

    public PlayerProfile_setChainSlideSe_209734447879() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term875740 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term875739 = ((Class) term875740).getDeclaredField((String) "MISS");
        ((Field) term875739).setAccessible(true);
        Object enum1882 = ((Field) term875739).get((Object) null);
        Class<? extends Object> term876117 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term876116 = ((Class) term876117).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term876116).setAccessible(true);
        Object enum1883 = ((Field) term876116).get((Object) null);
        Class<? extends Object> term876400 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term876399 = ((Class) term876400).getDeclaredField((String) "NORMAL");
        ((Field) term876399).setAccessible(true);
        Object enum1884 = ((Field) term876399).get((Object) null);
        Class<? extends Object> term876675 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term876674 = ((Class) term876675).getDeclaredField((String) "ORIGINAL");
        ((Field) term876674).setAccessible(true);
        Object enum1885 = ((Field) term876674).get((Object) null);
        Class<? extends Object> term876941 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term876940 = ((Class) term876941).getDeclaredField((String) "NONE");
        ((Field) term876940).setAccessible(true);
        Object enum1886 = ((Field) term876940).get((Object) null);
        term875126 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term875249 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term875250 = newInstance(Class.forName("java.time.LocalDate"));
        Object term875254 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term875126, term875126.getClass(), "id", -1978508496784157882L);
        setIntField(term875126, term875126.getClass(), "pdId", 1299041951);
        setField(term875126, term875126.getClass(), "playerName", "xxx");
        setIntField(term875126, term875126.getClass(), "vocaloidPoints", 300);
        setIntField(term875126, term875126.getClass(), "level", 1);
        setIntField(term875126, term875126.getClass(), "levelExp", -1772128093);
        setField(term875126, term875126.getClass(), "levelTitle", "xxx");
        setIntField(term875126, term875126.getClass(), "plateId", -1);
        setIntField(term875126, term875126.getClass(), "plateEffectId", -1);
        setField(term875126, term875126.getClass(), "passwordStatus", enum1882);
        setField(term875126, term875126.getClass(), "password", "**********");
        setBooleanField(term875126, term875126.getClass(), "preferPerPvModule", true);
        setBooleanField(term875126, term875126.getClass(), "preferCommonModule", true);
        setBooleanField(term875126, term875126.getClass(), "usePerPvSkin", true);
        setBooleanField(term875126, term875126.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term875126, term875126.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term875126, term875126.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term875126, term875126.getClass(), "usePerPvTouchSliderSe", false);
        setField(term875126, term875126.getClass(), "commonModule", "-999,-999,-999");
        setField(term875126, term875126.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term875250, term875250.getClass(), "year", 2026);
        setShortField(term875250, term875250.getClass(), "month", (short) 8);
        setShortField(term875250, term875250.getClass(), "day", (short) 12);
        setField(term875249, term875249.getClass(), "date", term875250);
        setByteField(term875254, term875254.getClass(), "hour", (byte) 2);
        setByteField(term875254, term875254.getClass(), "minute", (byte) 4);
        setByteField(term875254, term875254.getClass(), "second", (byte) 43);
        setIntField(term875254, term875254.getClass(), "nano", 80242000);
        setField(term875249, term875249.getClass(), "time", term875254);
        setField(term875126, term875126.getClass(), "commonModuleSetTime", term875249);
        setField(term875126, term875126.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term875126, term875126.getClass(), "commonSkin", -1);
        setIntField(term875126, term875126.getClass(), "headphoneVolume", 100);
        setBooleanField(term875126, term875126.getClass(), "buttonSeOn", true);
        setIntField(term875126, term875126.getClass(), "buttonSeVolume", 100);
        setIntField(term875126, term875126.getClass(), "sliderSeVolume", 100);
        setIntField(term875126, term875126.getClass(), "buttonSe", -1);
        setIntField(term875126, term875126.getClass(), "chainSlideSe", -1);
        setIntField(term875126, term875126.getClass(), "slideSe", -1);
        setIntField(term875126, term875126.getClass(), "sliderTouchSe", -1);
        setField(term875126, term875126.getClass(), "sortMode", enum1883);
        setIntField(term875126, term875126.getClass(), "nextPvId", -1);
        setField(term875126, term875126.getClass(), "nextDifficulty", enum1884);
        setField(term875126, term875126.getClass(), "nextEdition", enum1885);
        setBooleanField(term875126, term875126.getClass(), "showInterimRanking", true);
        setBooleanField(term875126, term875126.getClass(), "showClearStatus", true);
        setBooleanField(term875126, term875126.getClass(), "showGreatBorder", true);
        setBooleanField(term875126, term875126.getClass(), "showExcellentBorder", true);
        setBooleanField(term875126, term875126.getClass(), "showRivalBorder", true);
        setBooleanField(term875126, term875126.getClass(), "showRgoSetting", true);
        setBooleanField(term875126, term875126.getClass(), "contestNowPlayingEnable", true);
        setIntField(term875126, term875126.getClass(), "contestNowPlayingId", -1);
        setIntField(term875126, term875126.getClass(), "contestNowPlayingValue", -1);
        setField(term875126, term875126.getClass(), "contestNowPlayingResultRank", enum1886);
        setField(term875126, term875126.getClass(), "contestNowPlayingSpecifier", "");
        setField(term875126, term875126.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term875126, term875126.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term875126, term875126.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term875126, term875126.getClass(), "rivalPdId", -1);
        term875731 = new Integer(-2057880798);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term875731;
        callMethod(klass, "setChainSlideSe", argTypes, term875126, args);
    }

};


