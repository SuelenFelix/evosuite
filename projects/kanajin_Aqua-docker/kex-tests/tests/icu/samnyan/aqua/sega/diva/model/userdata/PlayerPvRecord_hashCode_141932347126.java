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

public class PlayerPvRecord_hashCode_141932347126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term643312;

    public PlayerPvRecord_hashCode_141932347126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term643970 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term643969 = ((Class) term643970).getDeclaredField((String) "MISS");
        ((Field) term643969).setAccessible(true);
        Object enum1410 = ((Field) term643969).get((Object) null);
        Class<? extends Object> term644347 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term644346 = ((Class) term644347).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term644346).setAccessible(true);
        Object enum1411 = ((Field) term644346).get((Object) null);
        Class<? extends Object> term644630 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term644629 = ((Class) term644630).getDeclaredField((String) "NORMAL");
        ((Field) term644629).setAccessible(true);
        Object enum1412 = ((Field) term644629).get((Object) null);
        Class<? extends Object> term644905 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term644904 = ((Class) term644905).getDeclaredField((String) "ORIGINAL");
        ((Field) term644904).setAccessible(true);
        Object enum1413 = ((Field) term644904).get((Object) null);
        Class<? extends Object> term645171 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term645170 = ((Class) term645171).getDeclaredField((String) "NONE");
        ((Field) term645170).setAccessible(true);
        Object enum1414 = ((Field) term645170).get((Object) null);
        Class<? extends Object> term645812 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ClearResult");
        Field term645811 = ((Class) term645812).getDeclaredField((String) "NO_CLEAR");
        ((Field) term645811).setAccessible(true);
        Object enum1415 = ((Field) term645811).get((Object) null);
        Class<? extends Object> term646098 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ChallengeKind");
        Field term646097 = ((Class) term646098).getDeclaredField((String) "UNDEFINED");
        ((Field) term646097).setAccessible(true);
        Object enum1416 = ((Field) term646097).get((Object) null);
        term643312 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvRecord"));
        Object term643314 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term643437 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term643438 = newInstance(Class.forName("java.time.LocalDate"));
        Object term643442 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term643312, term643312.getClass(), "id", 7487838449539103993L);
        setLongField(term643314, term643314.getClass(), "id", 7010148136855890340L);
        setIntField(term643314, term643314.getClass(), "pdId", 1397647176);
        setField(term643314, term643314.getClass(), "playerName", "xxx");
        setIntField(term643314, term643314.getClass(), "vocaloidPoints", 300);
        setIntField(term643314, term643314.getClass(), "level", 1);
        setIntField(term643314, term643314.getClass(), "levelExp", -1375675721);
        setField(term643314, term643314.getClass(), "levelTitle", "xxx");
        setIntField(term643314, term643314.getClass(), "plateId", -1);
        setIntField(term643314, term643314.getClass(), "plateEffectId", -1);
        setField(term643314, term643314.getClass(), "passwordStatus", enum1410);
        setField(term643314, term643314.getClass(), "password", "**********");
        setBooleanField(term643314, term643314.getClass(), "preferPerPvModule", true);
        setBooleanField(term643314, term643314.getClass(), "preferCommonModule", false);
        setBooleanField(term643314, term643314.getClass(), "usePerPvSkin", true);
        setBooleanField(term643314, term643314.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term643314, term643314.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term643314, term643314.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term643314, term643314.getClass(), "usePerPvTouchSliderSe", true);
        setField(term643314, term643314.getClass(), "commonModule", "-999,-999,-999");
        setField(term643314, term643314.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term643438, term643438.getClass(), "year", 2026);
        setShortField(term643438, term643438.getClass(), "month", (short) 8);
        setShortField(term643438, term643438.getClass(), "day", (short) 12);
        setField(term643437, term643437.getClass(), "date", term643438);
        setByteField(term643442, term643442.getClass(), "hour", (byte) 2);
        setByteField(term643442, term643442.getClass(), "minute", (byte) 4);
        setByteField(term643442, term643442.getClass(), "second", (byte) 7);
        setIntField(term643442, term643442.getClass(), "nano", 933051000);
        setField(term643437, term643437.getClass(), "time", term643442);
        setField(term643314, term643314.getClass(), "commonModuleSetTime", term643437);
        setField(term643314, term643314.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term643314, term643314.getClass(), "commonSkin", -1);
        setIntField(term643314, term643314.getClass(), "headphoneVolume", 100);
        setBooleanField(term643314, term643314.getClass(), "buttonSeOn", true);
        setIntField(term643314, term643314.getClass(), "buttonSeVolume", 100);
        setIntField(term643314, term643314.getClass(), "sliderSeVolume", 100);
        setIntField(term643314, term643314.getClass(), "buttonSe", -1);
        setIntField(term643314, term643314.getClass(), "chainSlideSe", -1);
        setIntField(term643314, term643314.getClass(), "slideSe", -1);
        setIntField(term643314, term643314.getClass(), "sliderTouchSe", -1);
        setField(term643314, term643314.getClass(), "sortMode", enum1411);
        setIntField(term643314, term643314.getClass(), "nextPvId", -1);
        setField(term643314, term643314.getClass(), "nextDifficulty", enum1412);
        setField(term643314, term643314.getClass(), "nextEdition", enum1413);
        setBooleanField(term643314, term643314.getClass(), "showInterimRanking", true);
        setBooleanField(term643314, term643314.getClass(), "showClearStatus", true);
        setBooleanField(term643314, term643314.getClass(), "showGreatBorder", true);
        setBooleanField(term643314, term643314.getClass(), "showExcellentBorder", true);
        setBooleanField(term643314, term643314.getClass(), "showRivalBorder", true);
        setBooleanField(term643314, term643314.getClass(), "showRgoSetting", true);
        setBooleanField(term643314, term643314.getClass(), "contestNowPlayingEnable", false);
        setIntField(term643314, term643314.getClass(), "contestNowPlayingId", -1);
        setIntField(term643314, term643314.getClass(), "contestNowPlayingValue", -1);
        setField(term643314, term643314.getClass(), "contestNowPlayingResultRank", enum1414);
        setField(term643314, term643314.getClass(), "contestNowPlayingSpecifier", "");
        setField(term643314, term643314.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term643314, term643314.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term643314, term643314.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term643314, term643314.getClass(), "rivalPdId", -1);
        setField(term643312, term643312.getClass(), "pdId", term643314);
        setIntField(term643312, term643312.getClass(), "pvId", -1);
        setField(term643312, term643312.getClass(), "edition", enum1413);
        setField(term643312, term643312.getClass(), "difficulty", enum1412);
        setField(term643312, term643312.getClass(), "result", enum1415);
        setIntField(term643312, term643312.getClass(), "maxScore", -1);
        setIntField(term643312, term643312.getClass(), "maxAttain", -1);
        setField(term643312, term643312.getClass(), "challengeKind", enum1416);
        setField(term643312, term643312.getClass(), "rgoPurchased", "0,0,0");
        setField(term643312, term643312.getClass(), "rgoPlayed", "0,0,0");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvRecord");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term643312, args);
    }

};


