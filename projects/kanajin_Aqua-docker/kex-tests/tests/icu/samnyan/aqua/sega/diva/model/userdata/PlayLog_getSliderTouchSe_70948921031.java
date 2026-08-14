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

public class PlayLog_getSliderTouchSe_70948921031 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term165719;

    public PlayLog_getSliderTouchSe_70948921031() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term166441 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term166440 = ((Class) term166441).getDeclaredField((String) "MISS");
        ((Field) term166440).setAccessible(true);
        Object enum369 = ((Field) term166440).get((Object) null);
        Class<? extends Object> term166818 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term166817 = ((Class) term166818).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term166817).setAccessible(true);
        Object enum370 = ((Field) term166817).get((Object) null);
        Class<? extends Object> term167101 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term167100 = ((Class) term167101).getDeclaredField((String) "NORMAL");
        ((Field) term167100).setAccessible(true);
        Object enum371 = ((Field) term167100).get((Object) null);
        Class<? extends Object> term167376 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term167375 = ((Class) term167376).getDeclaredField((String) "ORIGINAL");
        ((Field) term167375).setAccessible(true);
        Object enum372 = ((Field) term167375).get((Object) null);
        Class<? extends Object> term167642 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term167641 = ((Class) term167642).getDeclaredField((String) "NONE");
        ((Field) term167641).setAccessible(true);
        Object enum373 = ((Field) term167641).get((Object) null);
        Class<? extends Object> term168283 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term168282 = ((Class) term168283).getDeclaredField((String) "EXTRA");
        ((Field) term168282).setAccessible(true);
        Object enum374 = ((Field) term168282).get((Object) null);
        Class<? extends Object> term168540 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ChallengeKind");
        Field term168539 = ((Class) term168540).getDeclaredField((String) "CLEAR");
        ((Field) term168539).setAccessible(true);
        Object enum375 = ((Field) term168539).get((Object) null);
        Class<? extends Object> term168827 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ClearResult");
        Field term168826 = ((Class) term168827).getDeclaredField((String) "STANDARD");
        ((Field) term168826).setAccessible(true);
        Object enum376 = ((Field) term168826).get((Object) null);
        term165719 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog"));
        Object term165721 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term165844 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term165845 = newInstance(Class.forName("java.time.LocalDate"));
        Object term165849 = newInstance(Class.forName("java.time.LocalTime"));
        Object term166424 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term166425 = newInstance(Class.forName("java.time.LocalDate"));
        Object term166429 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term165719, term165719.getClass(), "id", 2354625302846375590L);
        setLongField(term165721, term165721.getClass(), "id", 7276637106827860087L);
        setIntField(term165721, term165721.getClass(), "pdId", 1175146356);
        setField(term165721, term165721.getClass(), "playerName", "xxx");
        setIntField(term165721, term165721.getClass(), "vocaloidPoints", 300);
        setIntField(term165721, term165721.getClass(), "level", 1);
        setIntField(term165721, term165721.getClass(), "levelExp", -2137419728);
        setField(term165721, term165721.getClass(), "levelTitle", "xxx");
        setIntField(term165721, term165721.getClass(), "plateId", -1);
        setIntField(term165721, term165721.getClass(), "plateEffectId", -1);
        setField(term165721, term165721.getClass(), "passwordStatus", enum369);
        setField(term165721, term165721.getClass(), "password", "**********");
        setBooleanField(term165721, term165721.getClass(), "preferPerPvModule", true);
        setBooleanField(term165721, term165721.getClass(), "preferCommonModule", true);
        setBooleanField(term165721, term165721.getClass(), "usePerPvSkin", false);
        setBooleanField(term165721, term165721.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term165721, term165721.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term165721, term165721.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term165721, term165721.getClass(), "usePerPvTouchSliderSe", false);
        setField(term165721, term165721.getClass(), "commonModule", "-999,-999,-999");
        setField(term165721, term165721.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term165845, term165845.getClass(), "year", 2026);
        setShortField(term165845, term165845.getClass(), "month", (short) 8);
        setShortField(term165845, term165845.getClass(), "day", (short) 12);
        setField(term165844, term165844.getClass(), "date", term165845);
        setByteField(term165849, term165849.getClass(), "hour", (byte) 2);
        setByteField(term165849, term165849.getClass(), "minute", (byte) 2);
        setByteField(term165849, term165849.getClass(), "second", (byte) 47);
        setIntField(term165849, term165849.getClass(), "nano", 962185000);
        setField(term165844, term165844.getClass(), "time", term165849);
        setField(term165721, term165721.getClass(), "commonModuleSetTime", term165844);
        setField(term165721, term165721.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term165721, term165721.getClass(), "commonSkin", -1);
        setIntField(term165721, term165721.getClass(), "headphoneVolume", 100);
        setBooleanField(term165721, term165721.getClass(), "buttonSeOn", true);
        setIntField(term165721, term165721.getClass(), "buttonSeVolume", 100);
        setIntField(term165721, term165721.getClass(), "sliderSeVolume", 100);
        setIntField(term165721, term165721.getClass(), "buttonSe", -1);
        setIntField(term165721, term165721.getClass(), "chainSlideSe", -1);
        setIntField(term165721, term165721.getClass(), "slideSe", -1);
        setIntField(term165721, term165721.getClass(), "sliderTouchSe", -1);
        setField(term165721, term165721.getClass(), "sortMode", enum370);
        setIntField(term165721, term165721.getClass(), "nextPvId", -1);
        setField(term165721, term165721.getClass(), "nextDifficulty", enum371);
        setField(term165721, term165721.getClass(), "nextEdition", enum372);
        setBooleanField(term165721, term165721.getClass(), "showInterimRanking", true);
        setBooleanField(term165721, term165721.getClass(), "showClearStatus", true);
        setBooleanField(term165721, term165721.getClass(), "showGreatBorder", true);
        setBooleanField(term165721, term165721.getClass(), "showExcellentBorder", true);
        setBooleanField(term165721, term165721.getClass(), "showRivalBorder", true);
        setBooleanField(term165721, term165721.getClass(), "showRgoSetting", true);
        setBooleanField(term165721, term165721.getClass(), "contestNowPlayingEnable", false);
        setIntField(term165721, term165721.getClass(), "contestNowPlayingId", -1);
        setIntField(term165721, term165721.getClass(), "contestNowPlayingValue", -1);
        setField(term165721, term165721.getClass(), "contestNowPlayingResultRank", enum373);
        setField(term165721, term165721.getClass(), "contestNowPlayingSpecifier", "");
        setField(term165721, term165721.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term165721, term165721.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term165721, term165721.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term165721, term165721.getClass(), "rivalPdId", -1);
        setField(term165719, term165719.getClass(), "pdId", term165721);
        setIntField(term165719, term165719.getClass(), "pvId", 1558810715);
        setField(term165719, term165719.getClass(), "difficulty", enum371);
        setField(term165719, term165719.getClass(), "edition", enum374);
        setIntField(term165719, term165719.getClass(), "scriptVer", -382652403);
        setIntField(term165719, term165719.getClass(), "score", -2126539433);
        setField(term165719, term165719.getClass(), "challengeKind", enum375);
        setIntField(term165719, term165719.getClass(), "challengeResult", 196952878);
        setField(term165719, term165719.getClass(), "clearResult", enum376);
        setIntField(term165719, term165719.getClass(), "vp", 802673242);
        setIntField(term165719, term165719.getClass(), "coolCount", -1808638031);
        setIntField(term165719, term165719.getClass(), "coolPercent", -1514240086);
        setIntField(term165719, term165719.getClass(), "fineCount", 2052244839);
        setIntField(term165719, term165719.getClass(), "finePercent", -1763480506);
        setIntField(term165719, term165719.getClass(), "safeCount", -1541297110);
        setIntField(term165719, term165719.getClass(), "safePercent", -1581464804);
        setIntField(term165719, term165719.getClass(), "sadCount", -1954937310);
        setIntField(term165719, term165719.getClass(), "sadPercent", -460657407);
        setIntField(term165719, term165719.getClass(), "wrongCount", 941003590);
        setIntField(term165719, term165719.getClass(), "wrongPercent", -1825624890);
        setIntField(term165719, term165719.getClass(), "maxCombo", 413214164);
        setIntField(term165719, term165719.getClass(), "chanceTime", 355911655);
        setIntField(term165719, term165719.getClass(), "holdScore", 1811833766);
        setIntField(term165719, term165719.getClass(), "attainPoint", 735987104);
        setIntField(term165719, term165719.getClass(), "skinId", -1784072578);
        setIntField(term165719, term165719.getClass(), "buttonSe", 2011764585);
        setIntField(term165719, term165719.getClass(), "buttonSeVol", -860680764);
        setIntField(term165719, term165719.getClass(), "sliderSe", -963198667);
        setIntField(term165719, term165719.getClass(), "ChainSlideSe", -1007935918);
        setIntField(term165719, term165719.getClass(), "SliderTouchSe", 1485731037);
        setField(term165719, term165719.getClass(), "modules", "JqXGgAhZPl");
        setIntField(term165719, term165719.getClass(), "stageCompletion", 1304396087);
        setIntField(term165719, term165719.getClass(), "slideScore", 1782600602);
        setIntField(term165719, term165719.getClass(), "isVocalChange", -185892708);
        setField(term165719, term165719.getClass(), "customizeItems", "jiKYgYHqIS");
        setField(term165719, term165719.getClass(), "rhythmGameOptions", "DfISiziTgG");
        setIntField(term165719, term165719.getClass(), "screenShotCount", -1);
        setIntField(term166425, term166425.getClass(), "year", 2010);
        setShortField(term166425, term166425.getClass(), "month", (short) 6);
        setShortField(term166425, term166425.getClass(), "day", (short) 14);
        setField(term166424, term166424.getClass(), "date", term166425);
        setByteField(term166429, term166429.getClass(), "hour", (byte) 6);
        setByteField(term166429, term166429.getClass(), "minute", (byte) 22);
        setByteField(term166429, term166429.getClass(), "second", (byte) 20);
        setIntField(term166429, term166429.getClass(), "nano", 25133051);
        setField(term166424, term166424.getClass(), "time", term166429);
        setField(term165719, term165719.getClass(), "dateTime", term166424);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSliderTouchSe", argTypes, term165719, args);
    }

};


