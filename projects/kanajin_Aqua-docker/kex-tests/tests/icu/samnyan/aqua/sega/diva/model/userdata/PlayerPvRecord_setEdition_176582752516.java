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

public class PlayerPvRecord_setEdition_176582752516 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term611733;
     Object enum1341;

    public PlayerPvRecord_setEdition_176582752516() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term612391 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term612390 = ((Class) term612391).getDeclaredField((String) "MISS");
        ((Field) term612390).setAccessible(true);
        Object enum1338 = ((Field) term612390).get((Object) null);
        Class<? extends Object> term612768 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term612767 = ((Class) term612768).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term612767).setAccessible(true);
        Object enum1339 = ((Field) term612767).get((Object) null);
        Class<? extends Object> term613051 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term613050 = ((Class) term613051).getDeclaredField((String) "NORMAL");
        ((Field) term613050).setAccessible(true);
        Object enum1340 = ((Field) term613050).get((Object) null);
        Class<? extends Object> term613326 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term613325 = ((Class) term613326).getDeclaredField((String) "ORIGINAL");
        ((Field) term613325).setAccessible(true);
        enum1341 = ((Field) term613325).get((Object) null);
        Class<? extends Object> term613592 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term613591 = ((Class) term613592).getDeclaredField((String) "NONE");
        ((Field) term613591).setAccessible(true);
        Object enum1342 = ((Field) term613591).get((Object) null);
        Class<? extends Object> term614233 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ClearResult");
        Field term614232 = ((Class) term614233).getDeclaredField((String) "NO_CLEAR");
        ((Field) term614232).setAccessible(true);
        Object enum1343 = ((Field) term614232).get((Object) null);
        Class<? extends Object> term614519 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ChallengeKind");
        Field term614518 = ((Class) term614519).getDeclaredField((String) "UNDEFINED");
        ((Field) term614518).setAccessible(true);
        Object enum1344 = ((Field) term614518).get((Object) null);
        term611733 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvRecord"));
        Object term611735 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term611858 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term611859 = newInstance(Class.forName("java.time.LocalDate"));
        Object term611863 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term611733, term611733.getClass(), "id", 2287785643837657068L);
        setLongField(term611735, term611735.getClass(), "id", -7283193381993602128L);
        setIntField(term611735, term611735.getClass(), "pdId", 1451393741);
        setField(term611735, term611735.getClass(), "playerName", "xxx");
        setIntField(term611735, term611735.getClass(), "vocaloidPoints", 300);
        setIntField(term611735, term611735.getClass(), "level", 1);
        setIntField(term611735, term611735.getClass(), "levelExp", -1115815564);
        setField(term611735, term611735.getClass(), "levelTitle", "xxx");
        setIntField(term611735, term611735.getClass(), "plateId", -1);
        setIntField(term611735, term611735.getClass(), "plateEffectId", -1);
        setField(term611735, term611735.getClass(), "passwordStatus", enum1338);
        setField(term611735, term611735.getClass(), "password", "**********");
        setBooleanField(term611735, term611735.getClass(), "preferPerPvModule", true);
        setBooleanField(term611735, term611735.getClass(), "preferCommonModule", false);
        setBooleanField(term611735, term611735.getClass(), "usePerPvSkin", false);
        setBooleanField(term611735, term611735.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term611735, term611735.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term611735, term611735.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term611735, term611735.getClass(), "usePerPvTouchSliderSe", true);
        setField(term611735, term611735.getClass(), "commonModule", "-999,-999,-999");
        setField(term611735, term611735.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term611859, term611859.getClass(), "year", 2026);
        setShortField(term611859, term611859.getClass(), "month", (short) 8);
        setShortField(term611859, term611859.getClass(), "day", (short) 12);
        setField(term611858, term611858.getClass(), "date", term611859);
        setByteField(term611863, term611863.getClass(), "hour", (byte) 2);
        setByteField(term611863, term611863.getClass(), "minute", (byte) 4);
        setByteField(term611863, term611863.getClass(), "second", (byte) 5);
        setIntField(term611863, term611863.getClass(), "nano", 438239000);
        setField(term611858, term611858.getClass(), "time", term611863);
        setField(term611735, term611735.getClass(), "commonModuleSetTime", term611858);
        setField(term611735, term611735.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term611735, term611735.getClass(), "commonSkin", -1);
        setIntField(term611735, term611735.getClass(), "headphoneVolume", 100);
        setBooleanField(term611735, term611735.getClass(), "buttonSeOn", true);
        setIntField(term611735, term611735.getClass(), "buttonSeVolume", 100);
        setIntField(term611735, term611735.getClass(), "sliderSeVolume", 100);
        setIntField(term611735, term611735.getClass(), "buttonSe", -1);
        setIntField(term611735, term611735.getClass(), "chainSlideSe", -1);
        setIntField(term611735, term611735.getClass(), "slideSe", -1);
        setIntField(term611735, term611735.getClass(), "sliderTouchSe", -1);
        setField(term611735, term611735.getClass(), "sortMode", enum1339);
        setIntField(term611735, term611735.getClass(), "nextPvId", -1);
        setField(term611735, term611735.getClass(), "nextDifficulty", enum1340);
        setField(term611735, term611735.getClass(), "nextEdition", enum1341);
        setBooleanField(term611735, term611735.getClass(), "showInterimRanking", true);
        setBooleanField(term611735, term611735.getClass(), "showClearStatus", true);
        setBooleanField(term611735, term611735.getClass(), "showGreatBorder", true);
        setBooleanField(term611735, term611735.getClass(), "showExcellentBorder", true);
        setBooleanField(term611735, term611735.getClass(), "showRivalBorder", true);
        setBooleanField(term611735, term611735.getClass(), "showRgoSetting", true);
        setBooleanField(term611735, term611735.getClass(), "contestNowPlayingEnable", false);
        setIntField(term611735, term611735.getClass(), "contestNowPlayingId", -1);
        setIntField(term611735, term611735.getClass(), "contestNowPlayingValue", -1);
        setField(term611735, term611735.getClass(), "contestNowPlayingResultRank", enum1342);
        setField(term611735, term611735.getClass(), "contestNowPlayingSpecifier", "");
        setField(term611735, term611735.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term611735, term611735.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term611735, term611735.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term611735, term611735.getClass(), "rivalPdId", -1);
        setField(term611733, term611733.getClass(), "pdId", term611735);
        setIntField(term611733, term611733.getClass(), "pvId", -1);
        setField(term611733, term611733.getClass(), "edition", enum1341);
        setField(term611733, term611733.getClass(), "difficulty", enum1340);
        setField(term611733, term611733.getClass(), "result", enum1343);
        setIntField(term611733, term611733.getClass(), "maxScore", -1);
        setIntField(term611733, term611733.getClass(), "maxAttain", -1);
        setField(term611733, term611733.getClass(), "challengeKind", enum1344);
        setField(term611733, term611733.getClass(), "rgoPurchased", "0,0,0");
        setField(term611733, term611733.getClass(), "rgoPlayed", "0,0,0");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvRecord");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.diva.model.common.Edition");
        Object[] args = new Object[1];
        args[0] = enum1341;
        callMethod(klass, "setEdition", argTypes, term611733, args);
    }

};


