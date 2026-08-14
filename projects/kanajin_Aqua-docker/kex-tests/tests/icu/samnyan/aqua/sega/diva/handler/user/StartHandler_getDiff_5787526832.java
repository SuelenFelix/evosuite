package icu.samnyan.aqua.sega.diva.handler.user;

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
import static icu.samnyan.aqua.sega.diva.handler.user.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class StartHandler_getDiff_5787526832 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3133;
     Object term3784;

    public StartHandler_getDiff_5787526832() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3817 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term3816 = ((Class) term3817).getDeclaredField((String) "MISS");
        ((Field) term3816).setAccessible(true);
        Object enum5 = ((Field) term3816).get((Object) null);
        Class<? extends Object> term4194 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term4193 = ((Class) term4194).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term4193).setAccessible(true);
        Object enum6 = ((Field) term4193).get((Object) null);
        Class<? extends Object> term4477 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term4476 = ((Class) term4477).getDeclaredField((String) "NORMAL");
        ((Field) term4476).setAccessible(true);
        Object enum7 = ((Field) term4476).get((Object) null);
        Class<? extends Object> term4752 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term4751 = ((Class) term4752).getDeclaredField((String) "ORIGINAL");
        ((Field) term4751).setAccessible(true);
        Object enum8 = ((Field) term4751).get((Object) null);
        Class<? extends Object> term5018 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term5017 = ((Class) term5018).getDeclaredField((String) "NONE");
        ((Field) term5017).setAccessible(true);
        Object enum9 = ((Field) term5017).get((Object) null);
        Class<? extends Object> term5745 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ClearResult");
        Field term5744 = ((Class) term5745).getDeclaredField((String) "NO_CLEAR");
        ((Field) term5744).setAccessible(true);
        Object enum10 = ((Field) term5744).get((Object) null);
        Class<? extends Object> term6105 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ChallengeKind");
        Field term6104 = ((Class) term6105).getDeclaredField((String) "UNDEFINED");
        ((Field) term6104).setAccessible(true);
        Object enum11 = ((Field) term6104).get((Object) null);
        term3133 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvRecord"));
        Object term3135 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term3258 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3259 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3263 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term3133, term3133.getClass(), "id", 6375119433582206027L);
        setLongField(term3135, term3135.getClass(), "id", -8257434502486459194L);
        setIntField(term3135, term3135.getClass(), "pdId", -1922583790);
        setField(term3135, term3135.getClass(), "playerName", "xxx");
        setIntField(term3135, term3135.getClass(), "vocaloidPoints", 300);
        setIntField(term3135, term3135.getClass(), "level", 1);
        setIntField(term3135, term3135.getClass(), "levelExp", -616727354);
        setField(term3135, term3135.getClass(), "levelTitle", "xxx");
        setIntField(term3135, term3135.getClass(), "plateId", -1);
        setIntField(term3135, term3135.getClass(), "plateEffectId", -1);
        setField(term3135, term3135.getClass(), "passwordStatus", enum5);
        setField(term3135, term3135.getClass(), "password", "**********");
        setBooleanField(term3135, term3135.getClass(), "preferPerPvModule", true);
        setBooleanField(term3135, term3135.getClass(), "preferCommonModule", true);
        setBooleanField(term3135, term3135.getClass(), "usePerPvSkin", false);
        setBooleanField(term3135, term3135.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term3135, term3135.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term3135, term3135.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term3135, term3135.getClass(), "usePerPvTouchSliderSe", false);
        setField(term3135, term3135.getClass(), "commonModule", "-999,-999,-999");
        setField(term3135, term3135.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term3259, term3259.getClass(), "year", 2026);
        setShortField(term3259, term3259.getClass(), "month", (short) 8);
        setShortField(term3259, term3259.getClass(), "day", (short) 12);
        setField(term3258, term3258.getClass(), "date", term3259);
        setByteField(term3263, term3263.getClass(), "hour", (byte) 1);
        setByteField(term3263, term3263.getClass(), "minute", (byte) 6);
        setByteField(term3263, term3263.getClass(), "second", (byte) 48);
        setIntField(term3263, term3263.getClass(), "nano", 65135000);
        setField(term3258, term3258.getClass(), "time", term3263);
        setField(term3135, term3135.getClass(), "commonModuleSetTime", term3258);
        setField(term3135, term3135.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term3135, term3135.getClass(), "commonSkin", -1);
        setIntField(term3135, term3135.getClass(), "headphoneVolume", 100);
        setBooleanField(term3135, term3135.getClass(), "buttonSeOn", true);
        setIntField(term3135, term3135.getClass(), "buttonSeVolume", 100);
        setIntField(term3135, term3135.getClass(), "sliderSeVolume", 100);
        setIntField(term3135, term3135.getClass(), "buttonSe", -1);
        setIntField(term3135, term3135.getClass(), "chainSlideSe", -1);
        setIntField(term3135, term3135.getClass(), "slideSe", -1);
        setIntField(term3135, term3135.getClass(), "sliderTouchSe", -1);
        setField(term3135, term3135.getClass(), "sortMode", enum6);
        setIntField(term3135, term3135.getClass(), "nextPvId", -1);
        setField(term3135, term3135.getClass(), "nextDifficulty", enum7);
        setField(term3135, term3135.getClass(), "nextEdition", enum8);
        setBooleanField(term3135, term3135.getClass(), "showInterimRanking", true);
        setBooleanField(term3135, term3135.getClass(), "showClearStatus", true);
        setBooleanField(term3135, term3135.getClass(), "showGreatBorder", true);
        setBooleanField(term3135, term3135.getClass(), "showExcellentBorder", true);
        setBooleanField(term3135, term3135.getClass(), "showRivalBorder", true);
        setBooleanField(term3135, term3135.getClass(), "showRgoSetting", true);
        setBooleanField(term3135, term3135.getClass(), "contestNowPlayingEnable", true);
        setIntField(term3135, term3135.getClass(), "contestNowPlayingId", -1);
        setIntField(term3135, term3135.getClass(), "contestNowPlayingValue", -1);
        setField(term3135, term3135.getClass(), "contestNowPlayingResultRank", enum9);
        setField(term3135, term3135.getClass(), "contestNowPlayingSpecifier", "");
        setField(term3135, term3135.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term3135, term3135.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term3135, term3135.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term3135, term3135.getClass(), "rivalPdId", -1);
        setField(term3133, term3133.getClass(), "pdId", term3135);
        setIntField(term3133, term3133.getClass(), "pvId", -1);
        setField(term3133, term3133.getClass(), "edition", enum8);
        setField(term3133, term3133.getClass(), "difficulty", enum7);
        setField(term3133, term3133.getClass(), "result", enum10);
        setIntField(term3133, term3133.getClass(), "maxScore", -1);
        setIntField(term3133, term3133.getClass(), "maxAttain", -1);
        setField(term3133, term3133.getClass(), "challengeKind", enum11);
        setField(term3133, term3133.getClass(), "rgoPurchased", "0,0,0");
        setField(term3133, term3133.getClass(), "rgoPlayed", "0,0,0");
        term3784 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.ClearTally"));
        Object term3785 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.ClearSet"));
        Object term3790 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.ClearSet"));
        Object term3795 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.ClearSet"));
        Object term3800 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.ClearSet"));
        Object term3805 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.ClearSet"));
        setIntField(term3785, term3785.getClass(), "clear", 0);
        setIntField(term3785, term3785.getClass(), "great", 0);
        setIntField(term3785, term3785.getClass(), "excellent", 0);
        setIntField(term3785, term3785.getClass(), "perfect", 0);
        setField(term3784, term3784.getClass(), "easy", term3785);
        setIntField(term3790, term3790.getClass(), "clear", 0);
        setIntField(term3790, term3790.getClass(), "great", 0);
        setIntField(term3790, term3790.getClass(), "excellent", 0);
        setIntField(term3790, term3790.getClass(), "perfect", 0);
        setField(term3784, term3784.getClass(), "normal", term3790);
        setIntField(term3795, term3795.getClass(), "clear", 0);
        setIntField(term3795, term3795.getClass(), "great", 0);
        setIntField(term3795, term3795.getClass(), "excellent", 0);
        setIntField(term3795, term3795.getClass(), "perfect", 0);
        setField(term3784, term3784.getClass(), "hard", term3795);
        setIntField(term3800, term3800.getClass(), "clear", 0);
        setIntField(term3800, term3800.getClass(), "great", 0);
        setIntField(term3800, term3800.getClass(), "excellent", 0);
        setIntField(term3800, term3800.getClass(), "perfect", 0);
        setField(term3784, term3784.getClass(), "extreme", term3800);
        setIntField(term3805, term3805.getClass(), "clear", 0);
        setIntField(term3805, term3805.getClass(), "great", 0);
        setIntField(term3805, term3805.getClass(), "excellent", 0);
        setIntField(term3805, term3805.getClass(), "perfect", 0);
        setField(term3784, term3784.getClass(), "extraExtreme", term3805);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.handler.user.StartHandler");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvRecord");
        argTypes[1] = Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.ClearTally");
        Object[] args = new Object[2];
        args[0] = term3133;
        args[1] = term3784;
        callMethod(klass, "getDiff", argTypes, null, args);
    }

};


