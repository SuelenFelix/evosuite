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

public class PlayerProfile_setContestNowPlayingEnable_25014097192 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term907570;
     Object term908175;

    public PlayerProfile_setContestNowPlayingEnable_25014097192() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term908184 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term908183 = ((Class) term908184).getDeclaredField((String) "MISS");
        ((Field) term908183).setAccessible(true);
        Object enum1949 = ((Field) term908183).get((Object) null);
        Class<? extends Object> term908561 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term908560 = ((Class) term908561).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term908560).setAccessible(true);
        Object enum1950 = ((Field) term908560).get((Object) null);
        Class<? extends Object> term908844 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term908843 = ((Class) term908844).getDeclaredField((String) "NORMAL");
        ((Field) term908843).setAccessible(true);
        Object enum1951 = ((Field) term908843).get((Object) null);
        Class<? extends Object> term909119 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term909118 = ((Class) term909119).getDeclaredField((String) "ORIGINAL");
        ((Field) term909118).setAccessible(true);
        Object enum1952 = ((Field) term909118).get((Object) null);
        Class<? extends Object> term909385 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term909384 = ((Class) term909385).getDeclaredField((String) "NONE");
        ((Field) term909384).setAccessible(true);
        Object enum1953 = ((Field) term909384).get((Object) null);
        term907570 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term907693 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term907694 = newInstance(Class.forName("java.time.LocalDate"));
        Object term907698 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term907570, term907570.getClass(), "id", 2551047634163864862L);
        setIntField(term907570, term907570.getClass(), "pdId", -386141354);
        setField(term907570, term907570.getClass(), "playerName", "xxx");
        setIntField(term907570, term907570.getClass(), "vocaloidPoints", 300);
        setIntField(term907570, term907570.getClass(), "level", 1);
        setIntField(term907570, term907570.getClass(), "levelExp", -226677391);
        setField(term907570, term907570.getClass(), "levelTitle", "xxx");
        setIntField(term907570, term907570.getClass(), "plateId", -1);
        setIntField(term907570, term907570.getClass(), "plateEffectId", -1);
        setField(term907570, term907570.getClass(), "passwordStatus", enum1949);
        setField(term907570, term907570.getClass(), "password", "**********");
        setBooleanField(term907570, term907570.getClass(), "preferPerPvModule", true);
        setBooleanField(term907570, term907570.getClass(), "preferCommonModule", true);
        setBooleanField(term907570, term907570.getClass(), "usePerPvSkin", true);
        setBooleanField(term907570, term907570.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term907570, term907570.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term907570, term907570.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term907570, term907570.getClass(), "usePerPvTouchSliderSe", false);
        setField(term907570, term907570.getClass(), "commonModule", "-999,-999,-999");
        setField(term907570, term907570.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term907694, term907694.getClass(), "year", 2026);
        setShortField(term907694, term907694.getClass(), "month", (short) 8);
        setShortField(term907694, term907694.getClass(), "day", (short) 12);
        setField(term907693, term907693.getClass(), "date", term907694);
        setByteField(term907698, term907698.getClass(), "hour", (byte) 2);
        setByteField(term907698, term907698.getClass(), "minute", (byte) 4);
        setByteField(term907698, term907698.getClass(), "second", (byte) 46);
        setIntField(term907698, term907698.getClass(), "nano", 520757000);
        setField(term907693, term907693.getClass(), "time", term907698);
        setField(term907570, term907570.getClass(), "commonModuleSetTime", term907693);
        setField(term907570, term907570.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term907570, term907570.getClass(), "commonSkin", -1);
        setIntField(term907570, term907570.getClass(), "headphoneVolume", 100);
        setBooleanField(term907570, term907570.getClass(), "buttonSeOn", true);
        setIntField(term907570, term907570.getClass(), "buttonSeVolume", 100);
        setIntField(term907570, term907570.getClass(), "sliderSeVolume", 100);
        setIntField(term907570, term907570.getClass(), "buttonSe", -1);
        setIntField(term907570, term907570.getClass(), "chainSlideSe", -1);
        setIntField(term907570, term907570.getClass(), "slideSe", -1);
        setIntField(term907570, term907570.getClass(), "sliderTouchSe", -1);
        setField(term907570, term907570.getClass(), "sortMode", enum1950);
        setIntField(term907570, term907570.getClass(), "nextPvId", -1);
        setField(term907570, term907570.getClass(), "nextDifficulty", enum1951);
        setField(term907570, term907570.getClass(), "nextEdition", enum1952);
        setBooleanField(term907570, term907570.getClass(), "showInterimRanking", true);
        setBooleanField(term907570, term907570.getClass(), "showClearStatus", true);
        setBooleanField(term907570, term907570.getClass(), "showGreatBorder", true);
        setBooleanField(term907570, term907570.getClass(), "showExcellentBorder", true);
        setBooleanField(term907570, term907570.getClass(), "showRivalBorder", true);
        setBooleanField(term907570, term907570.getClass(), "showRgoSetting", true);
        setBooleanField(term907570, term907570.getClass(), "contestNowPlayingEnable", false);
        setIntField(term907570, term907570.getClass(), "contestNowPlayingId", -1);
        setIntField(term907570, term907570.getClass(), "contestNowPlayingValue", -1);
        setField(term907570, term907570.getClass(), "contestNowPlayingResultRank", enum1953);
        setField(term907570, term907570.getClass(), "contestNowPlayingSpecifier", "");
        setField(term907570, term907570.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term907570, term907570.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term907570, term907570.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term907570, term907570.getClass(), "rivalPdId", -1);
        term908175 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term908175;
        callMethod(klass, "setContestNowPlayingEnable", argTypes, term907570, args);
    }

};


