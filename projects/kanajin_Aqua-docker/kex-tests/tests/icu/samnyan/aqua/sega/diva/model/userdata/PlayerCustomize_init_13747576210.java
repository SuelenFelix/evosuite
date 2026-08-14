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

public class PlayerCustomize_init_13747576210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term453421;
     Object term454026;

    public PlayerCustomize_init_13747576210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term454035 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term454034 = ((Class) term454035).getDeclaredField((String) "MISS");
        ((Field) term454034).setAccessible(true);
        Object enum1017 = ((Field) term454034).get((Object) null);
        Class<? extends Object> term454412 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term454411 = ((Class) term454412).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term454411).setAccessible(true);
        Object enum1018 = ((Field) term454411).get((Object) null);
        Class<? extends Object> term454695 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term454694 = ((Class) term454695).getDeclaredField((String) "NORMAL");
        ((Field) term454694).setAccessible(true);
        Object enum1019 = ((Field) term454694).get((Object) null);
        Class<? extends Object> term454970 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term454969 = ((Class) term454970).getDeclaredField((String) "ORIGINAL");
        ((Field) term454969).setAccessible(true);
        Object enum1020 = ((Field) term454969).get((Object) null);
        Class<? extends Object> term455236 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term455235 = ((Class) term455236).getDeclaredField((String) "NONE");
        ((Field) term455235).setAccessible(true);
        Object enum1021 = ((Field) term455235).get((Object) null);
        term453421 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term453544 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term453545 = newInstance(Class.forName("java.time.LocalDate"));
        Object term453549 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term453421, term453421.getClass(), "id", -5258945362776941718L);
        setIntField(term453421, term453421.getClass(), "pdId", -2100246850);
        setField(term453421, term453421.getClass(), "playerName", "xxx");
        setIntField(term453421, term453421.getClass(), "vocaloidPoints", 300);
        setIntField(term453421, term453421.getClass(), "level", 1);
        setIntField(term453421, term453421.getClass(), "levelExp", 174682854);
        setField(term453421, term453421.getClass(), "levelTitle", "xxx");
        setIntField(term453421, term453421.getClass(), "plateId", -1);
        setIntField(term453421, term453421.getClass(), "plateEffectId", -1);
        setField(term453421, term453421.getClass(), "passwordStatus", enum1017);
        setField(term453421, term453421.getClass(), "password", "**********");
        setBooleanField(term453421, term453421.getClass(), "preferPerPvModule", true);
        setBooleanField(term453421, term453421.getClass(), "preferCommonModule", true);
        setBooleanField(term453421, term453421.getClass(), "usePerPvSkin", false);
        setBooleanField(term453421, term453421.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term453421, term453421.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term453421, term453421.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term453421, term453421.getClass(), "usePerPvTouchSliderSe", true);
        setField(term453421, term453421.getClass(), "commonModule", "-999,-999,-999");
        setField(term453421, term453421.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term453545, term453545.getClass(), "year", 2026);
        setShortField(term453545, term453545.getClass(), "month", (short) 8);
        setShortField(term453545, term453545.getClass(), "day", (short) 12);
        setField(term453544, term453544.getClass(), "date", term453545);
        setByteField(term453549, term453549.getClass(), "hour", (byte) 2);
        setByteField(term453549, term453549.getClass(), "minute", (byte) 3);
        setByteField(term453549, term453549.getClass(), "second", (byte) 38);
        setIntField(term453549, term453549.getClass(), "nano", 893652000);
        setField(term453544, term453544.getClass(), "time", term453549);
        setField(term453421, term453421.getClass(), "commonModuleSetTime", term453544);
        setField(term453421, term453421.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term453421, term453421.getClass(), "commonSkin", -1);
        setIntField(term453421, term453421.getClass(), "headphoneVolume", 100);
        setBooleanField(term453421, term453421.getClass(), "buttonSeOn", true);
        setIntField(term453421, term453421.getClass(), "buttonSeVolume", 100);
        setIntField(term453421, term453421.getClass(), "sliderSeVolume", 100);
        setIntField(term453421, term453421.getClass(), "buttonSe", -1);
        setIntField(term453421, term453421.getClass(), "chainSlideSe", -1);
        setIntField(term453421, term453421.getClass(), "slideSe", -1);
        setIntField(term453421, term453421.getClass(), "sliderTouchSe", -1);
        setField(term453421, term453421.getClass(), "sortMode", enum1018);
        setIntField(term453421, term453421.getClass(), "nextPvId", -1);
        setField(term453421, term453421.getClass(), "nextDifficulty", enum1019);
        setField(term453421, term453421.getClass(), "nextEdition", enum1020);
        setBooleanField(term453421, term453421.getClass(), "showInterimRanking", true);
        setBooleanField(term453421, term453421.getClass(), "showClearStatus", true);
        setBooleanField(term453421, term453421.getClass(), "showGreatBorder", true);
        setBooleanField(term453421, term453421.getClass(), "showExcellentBorder", true);
        setBooleanField(term453421, term453421.getClass(), "showRivalBorder", true);
        setBooleanField(term453421, term453421.getClass(), "showRgoSetting", true);
        setBooleanField(term453421, term453421.getClass(), "contestNowPlayingEnable", true);
        setIntField(term453421, term453421.getClass(), "contestNowPlayingId", -1);
        setIntField(term453421, term453421.getClass(), "contestNowPlayingValue", -1);
        setField(term453421, term453421.getClass(), "contestNowPlayingResultRank", enum1021);
        setField(term453421, term453421.getClass(), "contestNowPlayingSpecifier", "");
        setField(term453421, term453421.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term453421, term453421.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term453421, term453421.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term453421, term453421.getClass(), "rivalPdId", -1);
        term454026 = new Integer(-1618786023);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerCustomize");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term453421;
        args[1] = term454026;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


