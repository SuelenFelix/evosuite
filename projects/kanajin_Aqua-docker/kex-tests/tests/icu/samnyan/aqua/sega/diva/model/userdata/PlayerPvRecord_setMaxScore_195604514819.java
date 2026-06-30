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

public class PlayerPvRecord_setMaxScore_195604514819 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term621604;
     Object term622255;

    public PlayerPvRecord_setMaxScore_195604514819() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term622264 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term622263 = ((Class) term622264).getDeclaredField((String) "MISS");
        ((Field) term622263).setAccessible(true);
        Object enum1361 = ((Field) term622263).get((Object) null);
        Class<? extends Object> term622641 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term622640 = ((Class) term622641).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term622640).setAccessible(true);
        Object enum1362 = ((Field) term622640).get((Object) null);
        Class<? extends Object> term622924 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term622923 = ((Class) term622924).getDeclaredField((String) "NORMAL");
        ((Field) term622923).setAccessible(true);
        Object enum1363 = ((Field) term622923).get((Object) null);
        Class<? extends Object> term623199 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term623198 = ((Class) term623199).getDeclaredField((String) "ORIGINAL");
        ((Field) term623198).setAccessible(true);
        Object enum1364 = ((Field) term623198).get((Object) null);
        Class<? extends Object> term623465 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term623464 = ((Class) term623465).getDeclaredField((String) "NONE");
        ((Field) term623464).setAccessible(true);
        Object enum1365 = ((Field) term623464).get((Object) null);
        Class<? extends Object> term624106 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ClearResult");
        Field term624105 = ((Class) term624106).getDeclaredField((String) "NO_CLEAR");
        ((Field) term624105).setAccessible(true);
        Object enum1366 = ((Field) term624105).get((Object) null);
        Class<? extends Object> term624392 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ChallengeKind");
        Field term624391 = ((Class) term624392).getDeclaredField((String) "UNDEFINED");
        ((Field) term624391).setAccessible(true);
        Object enum1367 = ((Field) term624391).get((Object) null);
        term621604 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvRecord"));
        Object term621606 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term621729 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term621730 = newInstance(Class.forName("java.time.LocalDate"));
        Object term621734 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term621604, term621604.getClass(), "id", -421166328269063791L);
        setLongField(term621606, term621606.getClass(), "id", 4811527754205378980L);
        setIntField(term621606, term621606.getClass(), "pdId", -1082123686);
        setField(term621606, term621606.getClass(), "playerName", "xxx");
        setIntField(term621606, term621606.getClass(), "vocaloidPoints", 300);
        setIntField(term621606, term621606.getClass(), "level", 1);
        setIntField(term621606, term621606.getClass(), "levelExp", -991011239);
        setField(term621606, term621606.getClass(), "levelTitle", "xxx");
        setIntField(term621606, term621606.getClass(), "plateId", -1);
        setIntField(term621606, term621606.getClass(), "plateEffectId", -1);
        setField(term621606, term621606.getClass(), "passwordStatus", enum1361);
        setField(term621606, term621606.getClass(), "password", "**********");
        setBooleanField(term621606, term621606.getClass(), "preferPerPvModule", true);
        setBooleanField(term621606, term621606.getClass(), "preferCommonModule", false);
        setBooleanField(term621606, term621606.getClass(), "usePerPvSkin", false);
        setBooleanField(term621606, term621606.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term621606, term621606.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term621606, term621606.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term621606, term621606.getClass(), "usePerPvTouchSliderSe", false);
        setField(term621606, term621606.getClass(), "commonModule", "-999,-999,-999");
        setField(term621606, term621606.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term621730, term621730.getClass(), "year", 2026);
        setShortField(term621730, term621730.getClass(), "month", (short) 6);
        setShortField(term621730, term621730.getClass(), "day", (short) 29);
        setField(term621729, term621729.getClass(), "date", term621730);
        setByteField(term621734, term621734.getClass(), "hour", (byte) 4);
        setByteField(term621734, term621734.getClass(), "minute", (byte) 28);
        setByteField(term621734, term621734.getClass(), "second", (byte) 52);
        setIntField(term621734, term621734.getClass(), "nano", 330179000);
        setField(term621729, term621729.getClass(), "time", term621734);
        setField(term621606, term621606.getClass(), "commonModuleSetTime", term621729);
        setField(term621606, term621606.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term621606, term621606.getClass(), "commonSkin", -1);
        setIntField(term621606, term621606.getClass(), "headphoneVolume", 100);
        setBooleanField(term621606, term621606.getClass(), "buttonSeOn", true);
        setIntField(term621606, term621606.getClass(), "buttonSeVolume", 100);
        setIntField(term621606, term621606.getClass(), "sliderSeVolume", 100);
        setIntField(term621606, term621606.getClass(), "buttonSe", -1);
        setIntField(term621606, term621606.getClass(), "chainSlideSe", -1);
        setIntField(term621606, term621606.getClass(), "slideSe", -1);
        setIntField(term621606, term621606.getClass(), "sliderTouchSe", -1);
        setField(term621606, term621606.getClass(), "sortMode", enum1362);
        setIntField(term621606, term621606.getClass(), "nextPvId", -1);
        setField(term621606, term621606.getClass(), "nextDifficulty", enum1363);
        setField(term621606, term621606.getClass(), "nextEdition", enum1364);
        setBooleanField(term621606, term621606.getClass(), "showInterimRanking", true);
        setBooleanField(term621606, term621606.getClass(), "showClearStatus", true);
        setBooleanField(term621606, term621606.getClass(), "showGreatBorder", true);
        setBooleanField(term621606, term621606.getClass(), "showExcellentBorder", true);
        setBooleanField(term621606, term621606.getClass(), "showRivalBorder", true);
        setBooleanField(term621606, term621606.getClass(), "showRgoSetting", true);
        setBooleanField(term621606, term621606.getClass(), "contestNowPlayingEnable", false);
        setIntField(term621606, term621606.getClass(), "contestNowPlayingId", -1);
        setIntField(term621606, term621606.getClass(), "contestNowPlayingValue", -1);
        setField(term621606, term621606.getClass(), "contestNowPlayingResultRank", enum1365);
        setField(term621606, term621606.getClass(), "contestNowPlayingSpecifier", "");
        setField(term621606, term621606.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term621606, term621606.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term621606, term621606.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term621606, term621606.getClass(), "rivalPdId", -1);
        setField(term621604, term621604.getClass(), "pdId", term621606);
        setIntField(term621604, term621604.getClass(), "pvId", -1);
        setField(term621604, term621604.getClass(), "edition", enum1364);
        setField(term621604, term621604.getClass(), "difficulty", enum1363);
        setField(term621604, term621604.getClass(), "result", enum1366);
        setIntField(term621604, term621604.getClass(), "maxScore", -1);
        setIntField(term621604, term621604.getClass(), "maxAttain", -1);
        setField(term621604, term621604.getClass(), "challengeKind", enum1367);
        setField(term621604, term621604.getClass(), "rgoPurchased", "0,0,0");
        setField(term621604, term621604.getClass(), "rgoPlayed", "0,0,0");
        term622255 = new Integer(-1774267288);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvRecord");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term622255;
        callMethod(klass, "setMaxScore", argTypes, term621604, args);
    }

};


