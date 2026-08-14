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

public class PlayerProfile_setContestNowPlayingResultRank_179468974095 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term914935;
     Object enum1969;

    public PlayerProfile_setContestNowPlayingResultRank_179468974095() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term915558 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term915557 = ((Class) term915558).getDeclaredField((String) "MISS");
        ((Field) term915557).setAccessible(true);
        Object enum1964 = ((Field) term915557).get((Object) null);
        Class<? extends Object> term915935 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term915934 = ((Class) term915935).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term915934).setAccessible(true);
        Object enum1965 = ((Field) term915934).get((Object) null);
        Class<? extends Object> term916218 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term916217 = ((Class) term916218).getDeclaredField((String) "NORMAL");
        ((Field) term916217).setAccessible(true);
        Object enum1966 = ((Field) term916217).get((Object) null);
        Class<? extends Object> term916493 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term916492 = ((Class) term916493).getDeclaredField((String) "ORIGINAL");
        ((Field) term916492).setAccessible(true);
        Object enum1967 = ((Field) term916492).get((Object) null);
        Class<? extends Object> term916759 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term916758 = ((Class) term916759).getDeclaredField((String) "NONE");
        ((Field) term916758).setAccessible(true);
        Object enum1968 = ((Field) term916758).get((Object) null);
        term914935 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term915058 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term915059 = newInstance(Class.forName("java.time.LocalDate"));
        Object term915063 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term914935, term914935.getClass(), "id", 1964822153944985001L);
        setIntField(term914935, term914935.getClass(), "pdId", 18596324);
        setField(term914935, term914935.getClass(), "playerName", "xxx");
        setIntField(term914935, term914935.getClass(), "vocaloidPoints", 300);
        setIntField(term914935, term914935.getClass(), "level", 1);
        setIntField(term914935, term914935.getClass(), "levelExp", 907968883);
        setField(term914935, term914935.getClass(), "levelTitle", "xxx");
        setIntField(term914935, term914935.getClass(), "plateId", -1);
        setIntField(term914935, term914935.getClass(), "plateEffectId", -1);
        setField(term914935, term914935.getClass(), "passwordStatus", enum1964);
        setField(term914935, term914935.getClass(), "password", "**********");
        setBooleanField(term914935, term914935.getClass(), "preferPerPvModule", true);
        setBooleanField(term914935, term914935.getClass(), "preferCommonModule", false);
        setBooleanField(term914935, term914935.getClass(), "usePerPvSkin", true);
        setBooleanField(term914935, term914935.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term914935, term914935.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term914935, term914935.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term914935, term914935.getClass(), "usePerPvTouchSliderSe", true);
        setField(term914935, term914935.getClass(), "commonModule", "-999,-999,-999");
        setField(term914935, term914935.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term915059, term915059.getClass(), "year", 2026);
        setShortField(term915059, term915059.getClass(), "month", (short) 8);
        setShortField(term915059, term915059.getClass(), "day", (short) 12);
        setField(term915058, term915058.getClass(), "date", term915059);
        setByteField(term915063, term915063.getClass(), "hour", (byte) 2);
        setByteField(term915063, term915063.getClass(), "minute", (byte) 4);
        setByteField(term915063, term915063.getClass(), "second", (byte) 47);
        setIntField(term915063, term915063.getClass(), "nano", 265611000);
        setField(term915058, term915058.getClass(), "time", term915063);
        setField(term914935, term914935.getClass(), "commonModuleSetTime", term915058);
        setField(term914935, term914935.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term914935, term914935.getClass(), "commonSkin", -1);
        setIntField(term914935, term914935.getClass(), "headphoneVolume", 100);
        setBooleanField(term914935, term914935.getClass(), "buttonSeOn", true);
        setIntField(term914935, term914935.getClass(), "buttonSeVolume", 100);
        setIntField(term914935, term914935.getClass(), "sliderSeVolume", 100);
        setIntField(term914935, term914935.getClass(), "buttonSe", -1);
        setIntField(term914935, term914935.getClass(), "chainSlideSe", -1);
        setIntField(term914935, term914935.getClass(), "slideSe", -1);
        setIntField(term914935, term914935.getClass(), "sliderTouchSe", -1);
        setField(term914935, term914935.getClass(), "sortMode", enum1965);
        setIntField(term914935, term914935.getClass(), "nextPvId", -1);
        setField(term914935, term914935.getClass(), "nextDifficulty", enum1966);
        setField(term914935, term914935.getClass(), "nextEdition", enum1967);
        setBooleanField(term914935, term914935.getClass(), "showInterimRanking", true);
        setBooleanField(term914935, term914935.getClass(), "showClearStatus", true);
        setBooleanField(term914935, term914935.getClass(), "showGreatBorder", true);
        setBooleanField(term914935, term914935.getClass(), "showExcellentBorder", true);
        setBooleanField(term914935, term914935.getClass(), "showRivalBorder", true);
        setBooleanField(term914935, term914935.getClass(), "showRgoSetting", true);
        setBooleanField(term914935, term914935.getClass(), "contestNowPlayingEnable", false);
        setIntField(term914935, term914935.getClass(), "contestNowPlayingId", -1);
        setIntField(term914935, term914935.getClass(), "contestNowPlayingValue", -1);
        setField(term914935, term914935.getClass(), "contestNowPlayingResultRank", enum1968);
        setField(term914935, term914935.getClass(), "contestNowPlayingSpecifier", "");
        setField(term914935, term914935.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term914935, term914935.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term914935, term914935.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term914935, term914935.getClass(), "rivalPdId", -1);
        Class<? extends Object> term917400 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term917399 = ((Class) term917400).getDeclaredField((String) "BRONZE");
        ((Field) term917399).setAccessible(true);
        enum1969 = ((Field) term917399).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Object[] args = new Object[1];
        args[0] = enum1969;
        callMethod(klass, "setContestNowPlayingResultRank", argTypes, term914935, args);
    }

};


