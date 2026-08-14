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

public class PlayerProfile_setMyList2_131040774399 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term925114;

    public PlayerProfile_setMyList2_131040774399() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term925738 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term925737 = ((Class) term925738).getDeclaredField((String) "MISS");
        ((Field) term925737).setAccessible(true);
        Object enum1985 = ((Field) term925737).get((Object) null);
        Class<? extends Object> term926115 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term926114 = ((Class) term926115).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term926114).setAccessible(true);
        Object enum1986 = ((Field) term926114).get((Object) null);
        Class<? extends Object> term926398 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term926397 = ((Class) term926398).getDeclaredField((String) "NORMAL");
        ((Field) term926397).setAccessible(true);
        Object enum1987 = ((Field) term926397).get((Object) null);
        Class<? extends Object> term926673 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term926672 = ((Class) term926673).getDeclaredField((String) "ORIGINAL");
        ((Field) term926672).setAccessible(true);
        Object enum1988 = ((Field) term926672).get((Object) null);
        Class<? extends Object> term926939 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term926938 = ((Class) term926939).getDeclaredField((String) "NONE");
        ((Field) term926938).setAccessible(true);
        Object enum1989 = ((Field) term926938).get((Object) null);
        term925114 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term925237 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term925238 = newInstance(Class.forName("java.time.LocalDate"));
        Object term925242 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term925114, term925114.getClass(), "id", 4892304277320345810L);
        setIntField(term925114, term925114.getClass(), "pdId", 260483962);
        setField(term925114, term925114.getClass(), "playerName", "xxx");
        setIntField(term925114, term925114.getClass(), "vocaloidPoints", 300);
        setIntField(term925114, term925114.getClass(), "level", 1);
        setIntField(term925114, term925114.getClass(), "levelExp", 1115251191);
        setField(term925114, term925114.getClass(), "levelTitle", "xxx");
        setIntField(term925114, term925114.getClass(), "plateId", -1);
        setIntField(term925114, term925114.getClass(), "plateEffectId", -1);
        setField(term925114, term925114.getClass(), "passwordStatus", enum1985);
        setField(term925114, term925114.getClass(), "password", "**********");
        setBooleanField(term925114, term925114.getClass(), "preferPerPvModule", true);
        setBooleanField(term925114, term925114.getClass(), "preferCommonModule", true);
        setBooleanField(term925114, term925114.getClass(), "usePerPvSkin", true);
        setBooleanField(term925114, term925114.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term925114, term925114.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term925114, term925114.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term925114, term925114.getClass(), "usePerPvTouchSliderSe", false);
        setField(term925114, term925114.getClass(), "commonModule", "-999,-999,-999");
        setField(term925114, term925114.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term925238, term925238.getClass(), "year", 2026);
        setShortField(term925238, term925238.getClass(), "month", (short) 8);
        setShortField(term925238, term925238.getClass(), "day", (short) 12);
        setField(term925237, term925237.getClass(), "date", term925238);
        setByteField(term925242, term925242.getClass(), "hour", (byte) 2);
        setByteField(term925242, term925242.getClass(), "minute", (byte) 4);
        setByteField(term925242, term925242.getClass(), "second", (byte) 48);
        setIntField(term925242, term925242.getClass(), "nano", 264450000);
        setField(term925237, term925237.getClass(), "time", term925242);
        setField(term925114, term925114.getClass(), "commonModuleSetTime", term925237);
        setField(term925114, term925114.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term925114, term925114.getClass(), "commonSkin", -1);
        setIntField(term925114, term925114.getClass(), "headphoneVolume", 100);
        setBooleanField(term925114, term925114.getClass(), "buttonSeOn", true);
        setIntField(term925114, term925114.getClass(), "buttonSeVolume", 100);
        setIntField(term925114, term925114.getClass(), "sliderSeVolume", 100);
        setIntField(term925114, term925114.getClass(), "buttonSe", -1);
        setIntField(term925114, term925114.getClass(), "chainSlideSe", -1);
        setIntField(term925114, term925114.getClass(), "slideSe", -1);
        setIntField(term925114, term925114.getClass(), "sliderTouchSe", -1);
        setField(term925114, term925114.getClass(), "sortMode", enum1986);
        setIntField(term925114, term925114.getClass(), "nextPvId", -1);
        setField(term925114, term925114.getClass(), "nextDifficulty", enum1987);
        setField(term925114, term925114.getClass(), "nextEdition", enum1988);
        setBooleanField(term925114, term925114.getClass(), "showInterimRanking", true);
        setBooleanField(term925114, term925114.getClass(), "showClearStatus", true);
        setBooleanField(term925114, term925114.getClass(), "showGreatBorder", true);
        setBooleanField(term925114, term925114.getClass(), "showExcellentBorder", true);
        setBooleanField(term925114, term925114.getClass(), "showRivalBorder", true);
        setBooleanField(term925114, term925114.getClass(), "showRgoSetting", true);
        setBooleanField(term925114, term925114.getClass(), "contestNowPlayingEnable", true);
        setIntField(term925114, term925114.getClass(), "contestNowPlayingId", -1);
        setIntField(term925114, term925114.getClass(), "contestNowPlayingValue", -1);
        setField(term925114, term925114.getClass(), "contestNowPlayingResultRank", enum1989);
        setField(term925114, term925114.getClass(), "contestNowPlayingSpecifier", "");
        setField(term925114, term925114.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term925114, term925114.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term925114, term925114.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term925114, term925114.getClass(), "rivalPdId", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "MeTmRZXErV";
        callMethod(klass, "setMyList2", argTypes, term925114, args);
    }

};


