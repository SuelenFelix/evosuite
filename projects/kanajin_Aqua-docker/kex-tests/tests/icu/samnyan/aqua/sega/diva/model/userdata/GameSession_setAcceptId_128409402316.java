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
import java.lang.Integer;

public class GameSession_setAcceptId_128409402316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term401931;
     Object term402584;

    public GameSession_setAcceptId_128409402316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term402593 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term402592 = ((Class) term402593).getDeclaredField((String) "MISS");
        ((Field) term402592).setAccessible(true);
        Object enum908 = ((Field) term402592).get((Object) null);
        Class<? extends Object> term402970 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term402969 = ((Class) term402970).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term402969).setAccessible(true);
        Object enum909 = ((Field) term402969).get((Object) null);
        Class<? extends Object> term403253 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term403252 = ((Class) term403253).getDeclaredField((String) "NORMAL");
        ((Field) term403252).setAccessible(true);
        Object enum910 = ((Field) term403252).get((Object) null);
        Class<? extends Object> term403528 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term403527 = ((Class) term403528).getDeclaredField((String) "ORIGINAL");
        ((Field) term403527).setAccessible(true);
        Object enum911 = ((Field) term403527).get((Object) null);
        Class<? extends Object> term403794 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term403793 = ((Class) term403794).getDeclaredField((String) "NONE");
        ((Field) term403793).setAccessible(true);
        Object enum912 = ((Field) term403793).get((Object) null);
        Class<? extends Object> term404435 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.StartMode");
        Field term404434 = ((Class) term404435).getDeclaredField((String) "START");
        ((Field) term404434).setAccessible(true);
        Object enum913 = ((Field) term404434).get((Object) null);
        Integer term402568 = new Integer(480137250);
        Integer term402570 = new Integer(-341152642);
        Integer term402572 = new Integer(-2015854073);
        Integer term402574 = new Integer(538259104);
        Integer term402576 = new Integer(96566506);
        Integer term402578 = new Integer(-343325701);
        Integer term402580 = new Integer(107945604);
        Integer term402582 = new Integer(-1963464809);
        term401931 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.GameSession"));
        Object term401934 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term402057 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term402058 = newInstance(Class.forName("java.time.LocalDate"));
        Object term402062 = newInstance(Class.forName("java.time.LocalTime"));
        Object term402548 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term402549 = newInstance(Class.forName("java.time.LocalDate"));
        Object term402553 = newInstance(Class.forName("java.time.LocalTime"));
        Object term402558 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term402559 = newInstance(Class.forName("java.time.LocalDate"));
        Object term402563 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term401931, term401931.getClass(), "id", -7456852906235966771L);
        setIntField(term401931, term401931.getClass(), "acceptId", 1179045520);
        setLongField(term401934, term401934.getClass(), "id", -67485388932970712L);
        setIntField(term401934, term401934.getClass(), "pdId", 1056739921);
        setField(term401934, term401934.getClass(), "playerName", "xxx");
        setIntField(term401934, term401934.getClass(), "vocaloidPoints", 300);
        setIntField(term401934, term401934.getClass(), "level", 1);
        setIntField(term401934, term401934.getClass(), "levelExp", 1384627927);
        setField(term401934, term401934.getClass(), "levelTitle", "xxx");
        setIntField(term401934, term401934.getClass(), "plateId", -1);
        setIntField(term401934, term401934.getClass(), "plateEffectId", -1);
        setField(term401934, term401934.getClass(), "passwordStatus", enum908);
        setField(term401934, term401934.getClass(), "password", "**********");
        setBooleanField(term401934, term401934.getClass(), "preferPerPvModule", true);
        setBooleanField(term401934, term401934.getClass(), "preferCommonModule", false);
        setBooleanField(term401934, term401934.getClass(), "usePerPvSkin", true);
        setBooleanField(term401934, term401934.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term401934, term401934.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term401934, term401934.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term401934, term401934.getClass(), "usePerPvTouchSliderSe", true);
        setField(term401934, term401934.getClass(), "commonModule", "-999,-999,-999");
        setField(term401934, term401934.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term402058, term402058.getClass(), "year", 2026);
        setShortField(term402058, term402058.getClass(), "month", (short) 8);
        setShortField(term402058, term402058.getClass(), "day", (short) 12);
        setField(term402057, term402057.getClass(), "date", term402058);
        setByteField(term402062, term402062.getClass(), "hour", (byte) 2);
        setByteField(term402062, term402062.getClass(), "minute", (byte) 3);
        setByteField(term402062, term402062.getClass(), "second", (byte) 25);
        setIntField(term402062, term402062.getClass(), "nano", 771269000);
        setField(term402057, term402057.getClass(), "time", term402062);
        setField(term401934, term401934.getClass(), "commonModuleSetTime", term402057);
        setField(term401934, term401934.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term401934, term401934.getClass(), "commonSkin", -1);
        setIntField(term401934, term401934.getClass(), "headphoneVolume", 100);
        setBooleanField(term401934, term401934.getClass(), "buttonSeOn", true);
        setIntField(term401934, term401934.getClass(), "buttonSeVolume", 100);
        setIntField(term401934, term401934.getClass(), "sliderSeVolume", 100);
        setIntField(term401934, term401934.getClass(), "buttonSe", -1);
        setIntField(term401934, term401934.getClass(), "chainSlideSe", -1);
        setIntField(term401934, term401934.getClass(), "slideSe", -1);
        setIntField(term401934, term401934.getClass(), "sliderTouchSe", -1);
        setField(term401934, term401934.getClass(), "sortMode", enum909);
        setIntField(term401934, term401934.getClass(), "nextPvId", -1);
        setField(term401934, term401934.getClass(), "nextDifficulty", enum910);
        setField(term401934, term401934.getClass(), "nextEdition", enum911);
        setBooleanField(term401934, term401934.getClass(), "showInterimRanking", true);
        setBooleanField(term401934, term401934.getClass(), "showClearStatus", true);
        setBooleanField(term401934, term401934.getClass(), "showGreatBorder", true);
        setBooleanField(term401934, term401934.getClass(), "showExcellentBorder", true);
        setBooleanField(term401934, term401934.getClass(), "showRivalBorder", true);
        setBooleanField(term401934, term401934.getClass(), "showRgoSetting", true);
        setBooleanField(term401934, term401934.getClass(), "contestNowPlayingEnable", false);
        setIntField(term401934, term401934.getClass(), "contestNowPlayingId", -1);
        setIntField(term401934, term401934.getClass(), "contestNowPlayingValue", -1);
        setField(term401934, term401934.getClass(), "contestNowPlayingResultRank", enum912);
        setField(term401934, term401934.getClass(), "contestNowPlayingSpecifier", "");
        setField(term401934, term401934.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term401934, term401934.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term401934, term401934.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term401934, term401934.getClass(), "rivalPdId", -1);
        setField(term401931, term401931.getClass(), "pdId", term401934);
        setField(term401931, term401931.getClass(), "startMode", enum913);
        setIntField(term402549, term402549.getClass(), "year", 2021);
        setShortField(term402549, term402549.getClass(), "month", (short) 12);
        setShortField(term402549, term402549.getClass(), "day", (short) 21);
        setField(term402548, term402548.getClass(), "date", term402549);
        setByteField(term402553, term402553.getClass(), "hour", (byte) 12);
        setByteField(term402553, term402553.getClass(), "minute", (byte) 59);
        setByteField(term402553, term402553.getClass(), "second", (byte) 52);
        setIntField(term402553, term402553.getClass(), "nano", 47081639);
        setField(term402548, term402548.getClass(), "time", term402553);
        setField(term401931, term401931.getClass(), "startTime", term402548);
        setIntField(term402559, term402559.getClass(), "year", 2026);
        setShortField(term402559, term402559.getClass(), "month", (short) 6);
        setShortField(term402559, term402559.getClass(), "day", (short) 13);
        setField(term402558, term402558.getClass(), "date", term402559);
        setByteField(term402563, term402563.getClass(), "hour", (byte) 19);
        setByteField(term402563, term402563.getClass(), "minute", (byte) 23);
        setByteField(term402563, term402563.getClass(), "second", (byte) 46);
        setIntField(term402563, term402563.getClass(), "nano", 67955056);
        setField(term402558, term402558.getClass(), "time", term402563);
        setField(term401931, term401931.getClass(), "lastUpdateTime", term402558);
        setField(term401931, term401931.getClass(), "stageIndex", term402568);
        setField(term401931, term401931.getClass(), "stageResultIndex", term402570);
        setField(term401931, term401931.getClass(), "lastPvId", term402572);
        setField(term401931, term401931.getClass(), "levelNumber", term402574);
        setField(term401931, term401931.getClass(), "levelExp", term402576);
        setField(term401931, term401931.getClass(), "oldLevelNumber", term402578);
        setField(term401931, term401931.getClass(), "oldLevelExp", term402580);
        setField(term401931, term401931.getClass(), "vp", term402582);
        term402584 = new Integer(-1252280115);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.GameSession");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term402584;
        callMethod(klass, "setAcceptId", argTypes, term401931, args);
    }

};


