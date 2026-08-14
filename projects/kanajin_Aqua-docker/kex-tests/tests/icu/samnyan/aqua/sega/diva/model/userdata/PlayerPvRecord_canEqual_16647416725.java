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

public class PlayerPvRecord_canEqual_16647416725 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term640217;
     Object term640868;

    public PlayerPvRecord_canEqual_16647416725() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term640876 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term640875 = ((Class) term640876).getDeclaredField((String) "MISS");
        ((Field) term640875).setAccessible(true);
        Object enum1403 = ((Field) term640875).get((Object) null);
        Class<? extends Object> term641253 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term641252 = ((Class) term641253).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term641252).setAccessible(true);
        Object enum1404 = ((Field) term641252).get((Object) null);
        Class<? extends Object> term641536 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term641535 = ((Class) term641536).getDeclaredField((String) "NORMAL");
        ((Field) term641535).setAccessible(true);
        Object enum1405 = ((Field) term641535).get((Object) null);
        Class<? extends Object> term641811 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term641810 = ((Class) term641811).getDeclaredField((String) "ORIGINAL");
        ((Field) term641810).setAccessible(true);
        Object enum1406 = ((Field) term641810).get((Object) null);
        Class<? extends Object> term642077 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term642076 = ((Class) term642077).getDeclaredField((String) "NONE");
        ((Field) term642076).setAccessible(true);
        Object enum1407 = ((Field) term642076).get((Object) null);
        Class<? extends Object> term642718 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ClearResult");
        Field term642717 = ((Class) term642718).getDeclaredField((String) "NO_CLEAR");
        ((Field) term642717).setAccessible(true);
        Object enum1408 = ((Field) term642717).get((Object) null);
        Class<? extends Object> term643004 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ChallengeKind");
        Field term643003 = ((Class) term643004).getDeclaredField((String) "UNDEFINED");
        ((Field) term643003).setAccessible(true);
        Object enum1409 = ((Field) term643003).get((Object) null);
        term640217 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvRecord"));
        Object term640219 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term640342 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term640343 = newInstance(Class.forName("java.time.LocalDate"));
        Object term640347 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term640217, term640217.getClass(), "id", -5004803270846838598L);
        setLongField(term640219, term640219.getClass(), "id", -8211859616692114655L);
        setIntField(term640219, term640219.getClass(), "pdId", 418080259);
        setField(term640219, term640219.getClass(), "playerName", "xxx");
        setIntField(term640219, term640219.getClass(), "vocaloidPoints", 300);
        setIntField(term640219, term640219.getClass(), "level", 1);
        setIntField(term640219, term640219.getClass(), "levelExp", 657195865);
        setField(term640219, term640219.getClass(), "levelTitle", "xxx");
        setIntField(term640219, term640219.getClass(), "plateId", -1);
        setIntField(term640219, term640219.getClass(), "plateEffectId", -1);
        setField(term640219, term640219.getClass(), "passwordStatus", enum1403);
        setField(term640219, term640219.getClass(), "password", "**********");
        setBooleanField(term640219, term640219.getClass(), "preferPerPvModule", true);
        setBooleanField(term640219, term640219.getClass(), "preferCommonModule", false);
        setBooleanField(term640219, term640219.getClass(), "usePerPvSkin", true);
        setBooleanField(term640219, term640219.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term640219, term640219.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term640219, term640219.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term640219, term640219.getClass(), "usePerPvTouchSliderSe", false);
        setField(term640219, term640219.getClass(), "commonModule", "-999,-999,-999");
        setField(term640219, term640219.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term640343, term640343.getClass(), "year", 2026);
        setShortField(term640343, term640343.getClass(), "month", (short) 8);
        setShortField(term640343, term640343.getClass(), "day", (short) 12);
        setField(term640342, term640342.getClass(), "date", term640343);
        setByteField(term640347, term640347.getClass(), "hour", (byte) 2);
        setByteField(term640347, term640347.getClass(), "minute", (byte) 4);
        setByteField(term640347, term640347.getClass(), "second", (byte) 7);
        setIntField(term640347, term640347.getClass(), "nano", 683933000);
        setField(term640342, term640342.getClass(), "time", term640347);
        setField(term640219, term640219.getClass(), "commonModuleSetTime", term640342);
        setField(term640219, term640219.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term640219, term640219.getClass(), "commonSkin", -1);
        setIntField(term640219, term640219.getClass(), "headphoneVolume", 100);
        setBooleanField(term640219, term640219.getClass(), "buttonSeOn", true);
        setIntField(term640219, term640219.getClass(), "buttonSeVolume", 100);
        setIntField(term640219, term640219.getClass(), "sliderSeVolume", 100);
        setIntField(term640219, term640219.getClass(), "buttonSe", -1);
        setIntField(term640219, term640219.getClass(), "chainSlideSe", -1);
        setIntField(term640219, term640219.getClass(), "slideSe", -1);
        setIntField(term640219, term640219.getClass(), "sliderTouchSe", -1);
        setField(term640219, term640219.getClass(), "sortMode", enum1404);
        setIntField(term640219, term640219.getClass(), "nextPvId", -1);
        setField(term640219, term640219.getClass(), "nextDifficulty", enum1405);
        setField(term640219, term640219.getClass(), "nextEdition", enum1406);
        setBooleanField(term640219, term640219.getClass(), "showInterimRanking", true);
        setBooleanField(term640219, term640219.getClass(), "showClearStatus", true);
        setBooleanField(term640219, term640219.getClass(), "showGreatBorder", true);
        setBooleanField(term640219, term640219.getClass(), "showExcellentBorder", true);
        setBooleanField(term640219, term640219.getClass(), "showRivalBorder", true);
        setBooleanField(term640219, term640219.getClass(), "showRgoSetting", true);
        setBooleanField(term640219, term640219.getClass(), "contestNowPlayingEnable", true);
        setIntField(term640219, term640219.getClass(), "contestNowPlayingId", -1);
        setIntField(term640219, term640219.getClass(), "contestNowPlayingValue", -1);
        setField(term640219, term640219.getClass(), "contestNowPlayingResultRank", enum1407);
        setField(term640219, term640219.getClass(), "contestNowPlayingSpecifier", "");
        setField(term640219, term640219.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term640219, term640219.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term640219, term640219.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term640219, term640219.getClass(), "rivalPdId", -1);
        setField(term640217, term640217.getClass(), "pdId", term640219);
        setIntField(term640217, term640217.getClass(), "pvId", -1);
        setField(term640217, term640217.getClass(), "edition", enum1406);
        setField(term640217, term640217.getClass(), "difficulty", enum1405);
        setField(term640217, term640217.getClass(), "result", enum1408);
        setIntField(term640217, term640217.getClass(), "maxScore", -1);
        setIntField(term640217, term640217.getClass(), "maxAttain", -1);
        setField(term640217, term640217.getClass(), "challengeKind", enum1409);
        setField(term640217, term640217.getClass(), "rgoPurchased", "0,0,0");
        setField(term640217, term640217.getClass(), "rgoPlayed", "0,0,0");
        term640868 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvRecord");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term640868;
        callMethod(klass, "canEqual", argTypes, term640217, args);
    }

};


