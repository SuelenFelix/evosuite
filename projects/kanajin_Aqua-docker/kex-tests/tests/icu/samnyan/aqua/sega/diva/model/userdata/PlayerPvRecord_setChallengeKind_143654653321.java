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

public class PlayerPvRecord_setChallengeKind_143654653321 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term627796;
     Object enum1381;

    public PlayerPvRecord_setChallengeKind_143654653321() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term628454 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term628453 = ((Class) term628454).getDeclaredField((String) "MISS");
        ((Field) term628453).setAccessible(true);
        Object enum1375 = ((Field) term628453).get((Object) null);
        Class<? extends Object> term628831 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term628830 = ((Class) term628831).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term628830).setAccessible(true);
        Object enum1376 = ((Field) term628830).get((Object) null);
        Class<? extends Object> term629114 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term629113 = ((Class) term629114).getDeclaredField((String) "NORMAL");
        ((Field) term629113).setAccessible(true);
        Object enum1377 = ((Field) term629113).get((Object) null);
        Class<? extends Object> term629389 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term629388 = ((Class) term629389).getDeclaredField((String) "ORIGINAL");
        ((Field) term629388).setAccessible(true);
        Object enum1378 = ((Field) term629388).get((Object) null);
        Class<? extends Object> term629655 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term629654 = ((Class) term629655).getDeclaredField((String) "NONE");
        ((Field) term629654).setAccessible(true);
        Object enum1379 = ((Field) term629654).get((Object) null);
        Class<? extends Object> term630296 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ClearResult");
        Field term630295 = ((Class) term630296).getDeclaredField((String) "NO_CLEAR");
        ((Field) term630295).setAccessible(true);
        Object enum1380 = ((Field) term630295).get((Object) null);
        Class<? extends Object> term630582 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ChallengeKind");
        Field term630581 = ((Class) term630582).getDeclaredField((String) "UNDEFINED");
        ((Field) term630581).setAccessible(true);
        enum1381 = ((Field) term630581).get((Object) null);
        term627796 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvRecord"));
        Object term627798 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term627921 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term627922 = newInstance(Class.forName("java.time.LocalDate"));
        Object term627926 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term627796, term627796.getClass(), "id", 7006402814669334483L);
        setLongField(term627798, term627798.getClass(), "id", -4003544865306793676L);
        setIntField(term627798, term627798.getClass(), "pdId", -418002301);
        setField(term627798, term627798.getClass(), "playerName", "xxx");
        setIntField(term627798, term627798.getClass(), "vocaloidPoints", 300);
        setIntField(term627798, term627798.getClass(), "level", 1);
        setIntField(term627798, term627798.getClass(), "levelExp", 2067599442);
        setField(term627798, term627798.getClass(), "levelTitle", "xxx");
        setIntField(term627798, term627798.getClass(), "plateId", -1);
        setIntField(term627798, term627798.getClass(), "plateEffectId", -1);
        setField(term627798, term627798.getClass(), "passwordStatus", enum1375);
        setField(term627798, term627798.getClass(), "password", "**********");
        setBooleanField(term627798, term627798.getClass(), "preferPerPvModule", true);
        setBooleanField(term627798, term627798.getClass(), "preferCommonModule", false);
        setBooleanField(term627798, term627798.getClass(), "usePerPvSkin", true);
        setBooleanField(term627798, term627798.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term627798, term627798.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term627798, term627798.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term627798, term627798.getClass(), "usePerPvTouchSliderSe", true);
        setField(term627798, term627798.getClass(), "commonModule", "-999,-999,-999");
        setField(term627798, term627798.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term627922, term627922.getClass(), "year", 2026);
        setShortField(term627922, term627922.getClass(), "month", (short) 8);
        setShortField(term627922, term627922.getClass(), "day", (short) 12);
        setField(term627921, term627921.getClass(), "date", term627922);
        setByteField(term627926, term627926.getClass(), "hour", (byte) 2);
        setByteField(term627926, term627926.getClass(), "minute", (byte) 4);
        setByteField(term627926, term627926.getClass(), "second", (byte) 6);
        setIntField(term627926, term627926.getClass(), "nano", 688733000);
        setField(term627921, term627921.getClass(), "time", term627926);
        setField(term627798, term627798.getClass(), "commonModuleSetTime", term627921);
        setField(term627798, term627798.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term627798, term627798.getClass(), "commonSkin", -1);
        setIntField(term627798, term627798.getClass(), "headphoneVolume", 100);
        setBooleanField(term627798, term627798.getClass(), "buttonSeOn", true);
        setIntField(term627798, term627798.getClass(), "buttonSeVolume", 100);
        setIntField(term627798, term627798.getClass(), "sliderSeVolume", 100);
        setIntField(term627798, term627798.getClass(), "buttonSe", -1);
        setIntField(term627798, term627798.getClass(), "chainSlideSe", -1);
        setIntField(term627798, term627798.getClass(), "slideSe", -1);
        setIntField(term627798, term627798.getClass(), "sliderTouchSe", -1);
        setField(term627798, term627798.getClass(), "sortMode", enum1376);
        setIntField(term627798, term627798.getClass(), "nextPvId", -1);
        setField(term627798, term627798.getClass(), "nextDifficulty", enum1377);
        setField(term627798, term627798.getClass(), "nextEdition", enum1378);
        setBooleanField(term627798, term627798.getClass(), "showInterimRanking", true);
        setBooleanField(term627798, term627798.getClass(), "showClearStatus", true);
        setBooleanField(term627798, term627798.getClass(), "showGreatBorder", true);
        setBooleanField(term627798, term627798.getClass(), "showExcellentBorder", true);
        setBooleanField(term627798, term627798.getClass(), "showRivalBorder", true);
        setBooleanField(term627798, term627798.getClass(), "showRgoSetting", true);
        setBooleanField(term627798, term627798.getClass(), "contestNowPlayingEnable", false);
        setIntField(term627798, term627798.getClass(), "contestNowPlayingId", -1);
        setIntField(term627798, term627798.getClass(), "contestNowPlayingValue", -1);
        setField(term627798, term627798.getClass(), "contestNowPlayingResultRank", enum1379);
        setField(term627798, term627798.getClass(), "contestNowPlayingSpecifier", "");
        setField(term627798, term627798.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term627798, term627798.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term627798, term627798.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term627798, term627798.getClass(), "rivalPdId", -1);
        setField(term627796, term627796.getClass(), "pdId", term627798);
        setIntField(term627796, term627796.getClass(), "pvId", -1);
        setField(term627796, term627796.getClass(), "edition", enum1378);
        setField(term627796, term627796.getClass(), "difficulty", enum1377);
        setField(term627796, term627796.getClass(), "result", enum1380);
        setIntField(term627796, term627796.getClass(), "maxScore", -1);
        setIntField(term627796, term627796.getClass(), "maxAttain", -1);
        setField(term627796, term627796.getClass(), "challengeKind", enum1381);
        setField(term627796, term627796.getClass(), "rgoPurchased", "0,0,0");
        setField(term627796, term627796.getClass(), "rgoPlayed", "0,0,0");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvRecord");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.diva.model.common.ChallengeKind");
        Object[] args = new Object[1];
        args[0] = enum1381;
        callMethod(klass, "setChallengeKind", argTypes, term627796, args);
    }

};


