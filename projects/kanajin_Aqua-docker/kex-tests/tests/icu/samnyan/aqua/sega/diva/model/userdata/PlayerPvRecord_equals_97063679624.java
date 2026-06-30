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

public class PlayerPvRecord_equals_97063679624 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term637122;
     Object term637773;

    public PlayerPvRecord_equals_97063679624() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term637781 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term637780 = ((Class) term637781).getDeclaredField((String) "MISS");
        ((Field) term637780).setAccessible(true);
        Object enum1396 = ((Field) term637780).get((Object) null);
        Class<? extends Object> term638158 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term638157 = ((Class) term638158).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term638157).setAccessible(true);
        Object enum1397 = ((Field) term638157).get((Object) null);
        Class<? extends Object> term638441 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term638440 = ((Class) term638441).getDeclaredField((String) "NORMAL");
        ((Field) term638440).setAccessible(true);
        Object enum1398 = ((Field) term638440).get((Object) null);
        Class<? extends Object> term638716 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term638715 = ((Class) term638716).getDeclaredField((String) "ORIGINAL");
        ((Field) term638715).setAccessible(true);
        Object enum1399 = ((Field) term638715).get((Object) null);
        Class<? extends Object> term638982 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term638981 = ((Class) term638982).getDeclaredField((String) "NONE");
        ((Field) term638981).setAccessible(true);
        Object enum1400 = ((Field) term638981).get((Object) null);
        Class<? extends Object> term639623 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ClearResult");
        Field term639622 = ((Class) term639623).getDeclaredField((String) "NO_CLEAR");
        ((Field) term639622).setAccessible(true);
        Object enum1401 = ((Field) term639622).get((Object) null);
        Class<? extends Object> term639909 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ChallengeKind");
        Field term639908 = ((Class) term639909).getDeclaredField((String) "UNDEFINED");
        ((Field) term639908).setAccessible(true);
        Object enum1402 = ((Field) term639908).get((Object) null);
        term637122 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvRecord"));
        Object term637124 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term637247 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term637248 = newInstance(Class.forName("java.time.LocalDate"));
        Object term637252 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term637122, term637122.getClass(), "id", -4058686252500969842L);
        setLongField(term637124, term637124.getClass(), "id", 6077991958696417121L);
        setIntField(term637124, term637124.getClass(), "pdId", -325187625);
        setField(term637124, term637124.getClass(), "playerName", "xxx");
        setIntField(term637124, term637124.getClass(), "vocaloidPoints", 300);
        setIntField(term637124, term637124.getClass(), "level", 1);
        setIntField(term637124, term637124.getClass(), "levelExp", -317484961);
        setField(term637124, term637124.getClass(), "levelTitle", "xxx");
        setIntField(term637124, term637124.getClass(), "plateId", -1);
        setIntField(term637124, term637124.getClass(), "plateEffectId", -1);
        setField(term637124, term637124.getClass(), "passwordStatus", enum1396);
        setField(term637124, term637124.getClass(), "password", "**********");
        setBooleanField(term637124, term637124.getClass(), "preferPerPvModule", true);
        setBooleanField(term637124, term637124.getClass(), "preferCommonModule", false);
        setBooleanField(term637124, term637124.getClass(), "usePerPvSkin", false);
        setBooleanField(term637124, term637124.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term637124, term637124.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term637124, term637124.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term637124, term637124.getClass(), "usePerPvTouchSliderSe", true);
        setField(term637124, term637124.getClass(), "commonModule", "-999,-999,-999");
        setField(term637124, term637124.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term637248, term637248.getClass(), "year", 2026);
        setShortField(term637248, term637248.getClass(), "month", (short) 6);
        setShortField(term637248, term637248.getClass(), "day", (short) 29);
        setField(term637247, term637247.getClass(), "date", term637248);
        setByteField(term637252, term637252.getClass(), "hour", (byte) 4);
        setByteField(term637252, term637252.getClass(), "minute", (byte) 28);
        setByteField(term637252, term637252.getClass(), "second", (byte) 53);
        setIntField(term637252, term637252.getClass(), "nano", 602444000);
        setField(term637247, term637247.getClass(), "time", term637252);
        setField(term637124, term637124.getClass(), "commonModuleSetTime", term637247);
        setField(term637124, term637124.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term637124, term637124.getClass(), "commonSkin", -1);
        setIntField(term637124, term637124.getClass(), "headphoneVolume", 100);
        setBooleanField(term637124, term637124.getClass(), "buttonSeOn", true);
        setIntField(term637124, term637124.getClass(), "buttonSeVolume", 100);
        setIntField(term637124, term637124.getClass(), "sliderSeVolume", 100);
        setIntField(term637124, term637124.getClass(), "buttonSe", -1);
        setIntField(term637124, term637124.getClass(), "chainSlideSe", -1);
        setIntField(term637124, term637124.getClass(), "slideSe", -1);
        setIntField(term637124, term637124.getClass(), "sliderTouchSe", -1);
        setField(term637124, term637124.getClass(), "sortMode", enum1397);
        setIntField(term637124, term637124.getClass(), "nextPvId", -1);
        setField(term637124, term637124.getClass(), "nextDifficulty", enum1398);
        setField(term637124, term637124.getClass(), "nextEdition", enum1399);
        setBooleanField(term637124, term637124.getClass(), "showInterimRanking", true);
        setBooleanField(term637124, term637124.getClass(), "showClearStatus", true);
        setBooleanField(term637124, term637124.getClass(), "showGreatBorder", true);
        setBooleanField(term637124, term637124.getClass(), "showExcellentBorder", true);
        setBooleanField(term637124, term637124.getClass(), "showRivalBorder", true);
        setBooleanField(term637124, term637124.getClass(), "showRgoSetting", true);
        setBooleanField(term637124, term637124.getClass(), "contestNowPlayingEnable", false);
        setIntField(term637124, term637124.getClass(), "contestNowPlayingId", -1);
        setIntField(term637124, term637124.getClass(), "contestNowPlayingValue", -1);
        setField(term637124, term637124.getClass(), "contestNowPlayingResultRank", enum1400);
        setField(term637124, term637124.getClass(), "contestNowPlayingSpecifier", "");
        setField(term637124, term637124.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term637124, term637124.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term637124, term637124.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term637124, term637124.getClass(), "rivalPdId", -1);
        setField(term637122, term637122.getClass(), "pdId", term637124);
        setIntField(term637122, term637122.getClass(), "pvId", -1);
        setField(term637122, term637122.getClass(), "edition", enum1399);
        setField(term637122, term637122.getClass(), "difficulty", enum1398);
        setField(term637122, term637122.getClass(), "result", enum1401);
        setIntField(term637122, term637122.getClass(), "maxScore", -1);
        setIntField(term637122, term637122.getClass(), "maxAttain", -1);
        setField(term637122, term637122.getClass(), "challengeKind", enum1402);
        setField(term637122, term637122.getClass(), "rgoPurchased", "0,0,0");
        setField(term637122, term637122.getClass(), "rgoPlayed", "0,0,0");
        term637773 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvRecord");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term637773;
        callMethod(klass, "equals", argTypes, term637122, args);
    }

};


