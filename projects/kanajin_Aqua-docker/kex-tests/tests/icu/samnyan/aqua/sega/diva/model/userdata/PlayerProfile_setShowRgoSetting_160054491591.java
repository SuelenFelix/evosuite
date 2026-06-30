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
import java.lang.Boolean;

public class PlayerProfile_setShowRgoSetting_160054491591 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term905115;
     Object term905720;

    public PlayerProfile_setShowRgoSetting_160054491591() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term905729 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term905728 = ((Class) term905729).getDeclaredField((String) "MISS");
        ((Field) term905728).setAccessible(true);
        Object enum1944 = ((Field) term905728).get((Object) null);
        Class<? extends Object> term906106 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term906105 = ((Class) term906106).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term906105).setAccessible(true);
        Object enum1945 = ((Field) term906105).get((Object) null);
        Class<? extends Object> term906389 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term906388 = ((Class) term906389).getDeclaredField((String) "NORMAL");
        ((Field) term906388).setAccessible(true);
        Object enum1946 = ((Field) term906388).get((Object) null);
        Class<? extends Object> term906664 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term906663 = ((Class) term906664).getDeclaredField((String) "ORIGINAL");
        ((Field) term906663).setAccessible(true);
        Object enum1947 = ((Field) term906663).get((Object) null);
        Class<? extends Object> term906930 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term906929 = ((Class) term906930).getDeclaredField((String) "NONE");
        ((Field) term906929).setAccessible(true);
        Object enum1948 = ((Field) term906929).get((Object) null);
        term905115 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term905238 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term905239 = newInstance(Class.forName("java.time.LocalDate"));
        Object term905243 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term905115, term905115.getClass(), "id", 678465732474023847L);
        setIntField(term905115, term905115.getClass(), "pdId", -41963319);
        setField(term905115, term905115.getClass(), "playerName", "xxx");
        setIntField(term905115, term905115.getClass(), "vocaloidPoints", 300);
        setIntField(term905115, term905115.getClass(), "level", 1);
        setIntField(term905115, term905115.getClass(), "levelExp", -831752810);
        setField(term905115, term905115.getClass(), "levelTitle", "xxx");
        setIntField(term905115, term905115.getClass(), "plateId", -1);
        setIntField(term905115, term905115.getClass(), "plateEffectId", -1);
        setField(term905115, term905115.getClass(), "passwordStatus", enum1944);
        setField(term905115, term905115.getClass(), "password", "**********");
        setBooleanField(term905115, term905115.getClass(), "preferPerPvModule", true);
        setBooleanField(term905115, term905115.getClass(), "preferCommonModule", true);
        setBooleanField(term905115, term905115.getClass(), "usePerPvSkin", false);
        setBooleanField(term905115, term905115.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term905115, term905115.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term905115, term905115.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term905115, term905115.getClass(), "usePerPvTouchSliderSe", true);
        setField(term905115, term905115.getClass(), "commonModule", "-999,-999,-999");
        setField(term905115, term905115.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term905239, term905239.getClass(), "year", 2026);
        setShortField(term905239, term905239.getClass(), "month", (short) 6);
        setShortField(term905239, term905239.getClass(), "day", (short) 29);
        setField(term905238, term905238.getClass(), "date", term905239);
        setByteField(term905243, term905243.getClass(), "hour", (byte) 4);
        setByteField(term905243, term905243.getClass(), "minute", (byte) 29);
        setByteField(term905243, term905243.getClass(), "second", (byte) 32);
        setIntField(term905243, term905243.getClass(), "nano", 652854000);
        setField(term905238, term905238.getClass(), "time", term905243);
        setField(term905115, term905115.getClass(), "commonModuleSetTime", term905238);
        setField(term905115, term905115.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term905115, term905115.getClass(), "commonSkin", -1);
        setIntField(term905115, term905115.getClass(), "headphoneVolume", 100);
        setBooleanField(term905115, term905115.getClass(), "buttonSeOn", true);
        setIntField(term905115, term905115.getClass(), "buttonSeVolume", 100);
        setIntField(term905115, term905115.getClass(), "sliderSeVolume", 100);
        setIntField(term905115, term905115.getClass(), "buttonSe", -1);
        setIntField(term905115, term905115.getClass(), "chainSlideSe", -1);
        setIntField(term905115, term905115.getClass(), "slideSe", -1);
        setIntField(term905115, term905115.getClass(), "sliderTouchSe", -1);
        setField(term905115, term905115.getClass(), "sortMode", enum1945);
        setIntField(term905115, term905115.getClass(), "nextPvId", -1);
        setField(term905115, term905115.getClass(), "nextDifficulty", enum1946);
        setField(term905115, term905115.getClass(), "nextEdition", enum1947);
        setBooleanField(term905115, term905115.getClass(), "showInterimRanking", true);
        setBooleanField(term905115, term905115.getClass(), "showClearStatus", true);
        setBooleanField(term905115, term905115.getClass(), "showGreatBorder", true);
        setBooleanField(term905115, term905115.getClass(), "showExcellentBorder", true);
        setBooleanField(term905115, term905115.getClass(), "showRivalBorder", true);
        setBooleanField(term905115, term905115.getClass(), "showRgoSetting", true);
        setBooleanField(term905115, term905115.getClass(), "contestNowPlayingEnable", false);
        setIntField(term905115, term905115.getClass(), "contestNowPlayingId", -1);
        setIntField(term905115, term905115.getClass(), "contestNowPlayingValue", -1);
        setField(term905115, term905115.getClass(), "contestNowPlayingResultRank", enum1948);
        setField(term905115, term905115.getClass(), "contestNowPlayingSpecifier", "");
        setField(term905115, term905115.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term905115, term905115.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term905115, term905115.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term905115, term905115.getClass(), "rivalPdId", -1);
        term905720 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term905720;
        callMethod(klass, "setShowRgoSetting", argTypes, term905115, args);
    }

};


