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

public class PlayerPvRecord_getResult_13322329367 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term582856;

    public PlayerPvRecord_getResult_13322329367() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term583514 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term583513 = ((Class) term583514).getDeclaredField((String) "MISS");
        ((Field) term583513).setAccessible(true);
        Object enum1275 = ((Field) term583513).get((Object) null);
        Class<? extends Object> term583891 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term583890 = ((Class) term583891).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term583890).setAccessible(true);
        Object enum1276 = ((Field) term583890).get((Object) null);
        Class<? extends Object> term584174 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term584173 = ((Class) term584174).getDeclaredField((String) "NORMAL");
        ((Field) term584173).setAccessible(true);
        Object enum1277 = ((Field) term584173).get((Object) null);
        Class<? extends Object> term584449 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term584448 = ((Class) term584449).getDeclaredField((String) "ORIGINAL");
        ((Field) term584448).setAccessible(true);
        Object enum1278 = ((Field) term584448).get((Object) null);
        Class<? extends Object> term584715 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term584714 = ((Class) term584715).getDeclaredField((String) "NONE");
        ((Field) term584714).setAccessible(true);
        Object enum1279 = ((Field) term584714).get((Object) null);
        Class<? extends Object> term585356 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ClearResult");
        Field term585355 = ((Class) term585356).getDeclaredField((String) "NO_CLEAR");
        ((Field) term585355).setAccessible(true);
        Object enum1280 = ((Field) term585355).get((Object) null);
        Class<? extends Object> term585642 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ChallengeKind");
        Field term585641 = ((Class) term585642).getDeclaredField((String) "UNDEFINED");
        ((Field) term585641).setAccessible(true);
        Object enum1281 = ((Field) term585641).get((Object) null);
        term582856 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvRecord"));
        Object term582858 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term582981 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term582982 = newInstance(Class.forName("java.time.LocalDate"));
        Object term582986 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term582856, term582856.getClass(), "id", 7799452759993694308L);
        setLongField(term582858, term582858.getClass(), "id", -1571034605670661708L);
        setIntField(term582858, term582858.getClass(), "pdId", 846881911);
        setField(term582858, term582858.getClass(), "playerName", "xxx");
        setIntField(term582858, term582858.getClass(), "vocaloidPoints", 300);
        setIntField(term582858, term582858.getClass(), "level", 1);
        setIntField(term582858, term582858.getClass(), "levelExp", 780077059);
        setField(term582858, term582858.getClass(), "levelTitle", "xxx");
        setIntField(term582858, term582858.getClass(), "plateId", -1);
        setIntField(term582858, term582858.getClass(), "plateEffectId", -1);
        setField(term582858, term582858.getClass(), "passwordStatus", enum1275);
        setField(term582858, term582858.getClass(), "password", "**********");
        setBooleanField(term582858, term582858.getClass(), "preferPerPvModule", true);
        setBooleanField(term582858, term582858.getClass(), "preferCommonModule", false);
        setBooleanField(term582858, term582858.getClass(), "usePerPvSkin", true);
        setBooleanField(term582858, term582858.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term582858, term582858.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term582858, term582858.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term582858, term582858.getClass(), "usePerPvTouchSliderSe", false);
        setField(term582858, term582858.getClass(), "commonModule", "-999,-999,-999");
        setField(term582858, term582858.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term582982, term582982.getClass(), "year", 2026);
        setShortField(term582982, term582982.getClass(), "month", (short) 6);
        setShortField(term582982, term582982.getClass(), "day", (short) 29);
        setField(term582981, term582981.getClass(), "date", term582982);
        setByteField(term582986, term582986.getClass(), "hour", (byte) 4);
        setByteField(term582986, term582986.getClass(), "minute", (byte) 28);
        setByteField(term582986, term582986.getClass(), "second", (byte) 49);
        setIntField(term582986, term582986.getClass(), "nano", 243756000);
        setField(term582981, term582981.getClass(), "time", term582986);
        setField(term582858, term582858.getClass(), "commonModuleSetTime", term582981);
        setField(term582858, term582858.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term582858, term582858.getClass(), "commonSkin", -1);
        setIntField(term582858, term582858.getClass(), "headphoneVolume", 100);
        setBooleanField(term582858, term582858.getClass(), "buttonSeOn", true);
        setIntField(term582858, term582858.getClass(), "buttonSeVolume", 100);
        setIntField(term582858, term582858.getClass(), "sliderSeVolume", 100);
        setIntField(term582858, term582858.getClass(), "buttonSe", -1);
        setIntField(term582858, term582858.getClass(), "chainSlideSe", -1);
        setIntField(term582858, term582858.getClass(), "slideSe", -1);
        setIntField(term582858, term582858.getClass(), "sliderTouchSe", -1);
        setField(term582858, term582858.getClass(), "sortMode", enum1276);
        setIntField(term582858, term582858.getClass(), "nextPvId", -1);
        setField(term582858, term582858.getClass(), "nextDifficulty", enum1277);
        setField(term582858, term582858.getClass(), "nextEdition", enum1278);
        setBooleanField(term582858, term582858.getClass(), "showInterimRanking", true);
        setBooleanField(term582858, term582858.getClass(), "showClearStatus", true);
        setBooleanField(term582858, term582858.getClass(), "showGreatBorder", true);
        setBooleanField(term582858, term582858.getClass(), "showExcellentBorder", true);
        setBooleanField(term582858, term582858.getClass(), "showRivalBorder", true);
        setBooleanField(term582858, term582858.getClass(), "showRgoSetting", true);
        setBooleanField(term582858, term582858.getClass(), "contestNowPlayingEnable", true);
        setIntField(term582858, term582858.getClass(), "contestNowPlayingId", -1);
        setIntField(term582858, term582858.getClass(), "contestNowPlayingValue", -1);
        setField(term582858, term582858.getClass(), "contestNowPlayingResultRank", enum1279);
        setField(term582858, term582858.getClass(), "contestNowPlayingSpecifier", "");
        setField(term582858, term582858.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term582858, term582858.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term582858, term582858.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term582858, term582858.getClass(), "rivalPdId", -1);
        setField(term582856, term582856.getClass(), "pdId", term582858);
        setIntField(term582856, term582856.getClass(), "pvId", -1);
        setField(term582856, term582856.getClass(), "edition", enum1278);
        setField(term582856, term582856.getClass(), "difficulty", enum1277);
        setField(term582856, term582856.getClass(), "result", enum1280);
        setIntField(term582856, term582856.getClass(), "maxScore", -1);
        setIntField(term582856, term582856.getClass(), "maxAttain", -1);
        setField(term582856, term582856.getClass(), "challengeKind", enum1281);
        setField(term582856, term582856.getClass(), "rgoPurchased", "0,0,0");
        setField(term582856, term582856.getClass(), "rgoPlayed", "0,0,0");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvRecord");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getResult", argTypes, term582856, args);
    }

};


