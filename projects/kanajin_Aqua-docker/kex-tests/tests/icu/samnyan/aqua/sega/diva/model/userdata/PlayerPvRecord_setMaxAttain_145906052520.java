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

public class PlayerPvRecord_setMaxAttain_145906052520 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term624700;
     Object term625351;

    public PlayerPvRecord_setMaxAttain_145906052520() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term625360 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term625359 = ((Class) term625360).getDeclaredField((String) "MISS");
        ((Field) term625359).setAccessible(true);
        Object enum1368 = ((Field) term625359).get((Object) null);
        Class<? extends Object> term625737 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term625736 = ((Class) term625737).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term625736).setAccessible(true);
        Object enum1369 = ((Field) term625736).get((Object) null);
        Class<? extends Object> term626020 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term626019 = ((Class) term626020).getDeclaredField((String) "NORMAL");
        ((Field) term626019).setAccessible(true);
        Object enum1370 = ((Field) term626019).get((Object) null);
        Class<? extends Object> term626295 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term626294 = ((Class) term626295).getDeclaredField((String) "ORIGINAL");
        ((Field) term626294).setAccessible(true);
        Object enum1371 = ((Field) term626294).get((Object) null);
        Class<? extends Object> term626561 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term626560 = ((Class) term626561).getDeclaredField((String) "NONE");
        ((Field) term626560).setAccessible(true);
        Object enum1372 = ((Field) term626560).get((Object) null);
        Class<? extends Object> term627202 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ClearResult");
        Field term627201 = ((Class) term627202).getDeclaredField((String) "NO_CLEAR");
        ((Field) term627201).setAccessible(true);
        Object enum1373 = ((Field) term627201).get((Object) null);
        Class<? extends Object> term627488 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ChallengeKind");
        Field term627487 = ((Class) term627488).getDeclaredField((String) "UNDEFINED");
        ((Field) term627487).setAccessible(true);
        Object enum1374 = ((Field) term627487).get((Object) null);
        term624700 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvRecord"));
        Object term624702 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term624825 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term624826 = newInstance(Class.forName("java.time.LocalDate"));
        Object term624830 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term624700, term624700.getClass(), "id", 9174730812791817537L);
        setLongField(term624702, term624702.getClass(), "id", 8024477479047145752L);
        setIntField(term624702, term624702.getClass(), "pdId", -1394083316);
        setField(term624702, term624702.getClass(), "playerName", "xxx");
        setIntField(term624702, term624702.getClass(), "vocaloidPoints", 300);
        setIntField(term624702, term624702.getClass(), "level", 1);
        setIntField(term624702, term624702.getClass(), "levelExp", 23814407);
        setField(term624702, term624702.getClass(), "levelTitle", "xxx");
        setIntField(term624702, term624702.getClass(), "plateId", -1);
        setIntField(term624702, term624702.getClass(), "plateEffectId", -1);
        setField(term624702, term624702.getClass(), "passwordStatus", enum1368);
        setField(term624702, term624702.getClass(), "password", "**********");
        setBooleanField(term624702, term624702.getClass(), "preferPerPvModule", true);
        setBooleanField(term624702, term624702.getClass(), "preferCommonModule", true);
        setBooleanField(term624702, term624702.getClass(), "usePerPvSkin", true);
        setBooleanField(term624702, term624702.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term624702, term624702.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term624702, term624702.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term624702, term624702.getClass(), "usePerPvTouchSliderSe", true);
        setField(term624702, term624702.getClass(), "commonModule", "-999,-999,-999");
        setField(term624702, term624702.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term624826, term624826.getClass(), "year", 2026);
        setShortField(term624826, term624826.getClass(), "month", (short) 6);
        setShortField(term624826, term624826.getClass(), "day", (short) 29);
        setField(term624825, term624825.getClass(), "date", term624826);
        setByteField(term624830, term624830.getClass(), "hour", (byte) 4);
        setByteField(term624830, term624830.getClass(), "minute", (byte) 28);
        setByteField(term624830, term624830.getClass(), "second", (byte) 52);
        setIntField(term624830, term624830.getClass(), "nano", 584858000);
        setField(term624825, term624825.getClass(), "time", term624830);
        setField(term624702, term624702.getClass(), "commonModuleSetTime", term624825);
        setField(term624702, term624702.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term624702, term624702.getClass(), "commonSkin", -1);
        setIntField(term624702, term624702.getClass(), "headphoneVolume", 100);
        setBooleanField(term624702, term624702.getClass(), "buttonSeOn", true);
        setIntField(term624702, term624702.getClass(), "buttonSeVolume", 100);
        setIntField(term624702, term624702.getClass(), "sliderSeVolume", 100);
        setIntField(term624702, term624702.getClass(), "buttonSe", -1);
        setIntField(term624702, term624702.getClass(), "chainSlideSe", -1);
        setIntField(term624702, term624702.getClass(), "slideSe", -1);
        setIntField(term624702, term624702.getClass(), "sliderTouchSe", -1);
        setField(term624702, term624702.getClass(), "sortMode", enum1369);
        setIntField(term624702, term624702.getClass(), "nextPvId", -1);
        setField(term624702, term624702.getClass(), "nextDifficulty", enum1370);
        setField(term624702, term624702.getClass(), "nextEdition", enum1371);
        setBooleanField(term624702, term624702.getClass(), "showInterimRanking", true);
        setBooleanField(term624702, term624702.getClass(), "showClearStatus", true);
        setBooleanField(term624702, term624702.getClass(), "showGreatBorder", true);
        setBooleanField(term624702, term624702.getClass(), "showExcellentBorder", true);
        setBooleanField(term624702, term624702.getClass(), "showRivalBorder", true);
        setBooleanField(term624702, term624702.getClass(), "showRgoSetting", true);
        setBooleanField(term624702, term624702.getClass(), "contestNowPlayingEnable", true);
        setIntField(term624702, term624702.getClass(), "contestNowPlayingId", -1);
        setIntField(term624702, term624702.getClass(), "contestNowPlayingValue", -1);
        setField(term624702, term624702.getClass(), "contestNowPlayingResultRank", enum1372);
        setField(term624702, term624702.getClass(), "contestNowPlayingSpecifier", "");
        setField(term624702, term624702.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term624702, term624702.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term624702, term624702.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term624702, term624702.getClass(), "rivalPdId", -1);
        setField(term624700, term624700.getClass(), "pdId", term624702);
        setIntField(term624700, term624700.getClass(), "pvId", -1);
        setField(term624700, term624700.getClass(), "edition", enum1371);
        setField(term624700, term624700.getClass(), "difficulty", enum1370);
        setField(term624700, term624700.getClass(), "result", enum1373);
        setIntField(term624700, term624700.getClass(), "maxScore", -1);
        setIntField(term624700, term624700.getClass(), "maxAttain", -1);
        setField(term624700, term624700.getClass(), "challengeKind", enum1374);
        setField(term624700, term624700.getClass(), "rgoPurchased", "0,0,0");
        setField(term624700, term624700.getClass(), "rgoPlayed", "0,0,0");
        term625351 = new Integer(1941438128);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvRecord");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term625351;
        callMethod(klass, "setMaxAttain", argTypes, term624700, args);
    }

};


