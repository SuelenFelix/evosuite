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

public class PlayLog_getSlideScore_124832261534 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term176608;

    public PlayLog_getSlideScore_124832261534() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term177336 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term177335 = ((Class) term177336).getDeclaredField((String) "MISS");
        ((Field) term177335).setAccessible(true);
        Object enum395 = ((Field) term177335).get((Object) null);
        Class<? extends Object> term177713 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term177712 = ((Class) term177713).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term177712).setAccessible(true);
        Object enum396 = ((Field) term177712).get((Object) null);
        Class<? extends Object> term177996 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term177995 = ((Class) term177996).getDeclaredField((String) "NORMAL");
        ((Field) term177995).setAccessible(true);
        Object enum397 = ((Field) term177995).get((Object) null);
        Class<? extends Object> term178271 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term178270 = ((Class) term178271).getDeclaredField((String) "ORIGINAL");
        ((Field) term178270).setAccessible(true);
        Object enum398 = ((Field) term178270).get((Object) null);
        Class<? extends Object> term178537 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term178536 = ((Class) term178537).getDeclaredField((String) "NONE");
        ((Field) term178536).setAccessible(true);
        Object enum399 = ((Field) term178536).get((Object) null);
        Class<? extends Object> term179178 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term179177 = ((Class) term179178).getDeclaredField((String) "EXTREME");
        ((Field) term179177).setAccessible(true);
        Object enum400 = ((Field) term179177).get((Object) null);
        Class<? extends Object> term179456 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ChallengeKind");
        Field term179455 = ((Class) term179456).getDeclaredField((String) "EXCELLENT");
        ((Field) term179455).setAccessible(true);
        Object enum401 = ((Field) term179455).get((Object) null);
        Class<? extends Object> term179755 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ClearResult");
        Field term179754 = ((Class) term179755).getDeclaredField((String) "NO_CLEAR");
        ((Field) term179754).setAccessible(true);
        Object enum402 = ((Field) term179754).get((Object) null);
        term176608 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog"));
        Object term176610 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term176733 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term176734 = newInstance(Class.forName("java.time.LocalDate"));
        Object term176738 = newInstance(Class.forName("java.time.LocalTime"));
        Object term177319 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term177320 = newInstance(Class.forName("java.time.LocalDate"));
        Object term177324 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term176608, term176608.getClass(), "id", -6950146046121430355L);
        setLongField(term176610, term176610.getClass(), "id", 1667122142089513324L);
        setIntField(term176610, term176610.getClass(), "pdId", -1270258033);
        setField(term176610, term176610.getClass(), "playerName", "xxx");
        setIntField(term176610, term176610.getClass(), "vocaloidPoints", 300);
        setIntField(term176610, term176610.getClass(), "level", 1);
        setIntField(term176610, term176610.getClass(), "levelExp", 1677994069);
        setField(term176610, term176610.getClass(), "levelTitle", "xxx");
        setIntField(term176610, term176610.getClass(), "plateId", -1);
        setIntField(term176610, term176610.getClass(), "plateEffectId", -1);
        setField(term176610, term176610.getClass(), "passwordStatus", enum395);
        setField(term176610, term176610.getClass(), "password", "**********");
        setBooleanField(term176610, term176610.getClass(), "preferPerPvModule", true);
        setBooleanField(term176610, term176610.getClass(), "preferCommonModule", false);
        setBooleanField(term176610, term176610.getClass(), "usePerPvSkin", true);
        setBooleanField(term176610, term176610.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term176610, term176610.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term176610, term176610.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term176610, term176610.getClass(), "usePerPvTouchSliderSe", false);
        setField(term176610, term176610.getClass(), "commonModule", "-999,-999,-999");
        setField(term176610, term176610.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term176734, term176734.getClass(), "year", 2026);
        setShortField(term176734, term176734.getClass(), "month", (short) 8);
        setShortField(term176734, term176734.getClass(), "day", (short) 12);
        setField(term176733, term176733.getClass(), "date", term176734);
        setByteField(term176738, term176738.getClass(), "hour", (byte) 2);
        setByteField(term176738, term176738.getClass(), "minute", (byte) 2);
        setByteField(term176738, term176738.getClass(), "second", (byte) 48);
        setIntField(term176738, term176738.getClass(), "nano", 773346000);
        setField(term176733, term176733.getClass(), "time", term176738);
        setField(term176610, term176610.getClass(), "commonModuleSetTime", term176733);
        setField(term176610, term176610.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term176610, term176610.getClass(), "commonSkin", -1);
        setIntField(term176610, term176610.getClass(), "headphoneVolume", 100);
        setBooleanField(term176610, term176610.getClass(), "buttonSeOn", true);
        setIntField(term176610, term176610.getClass(), "buttonSeVolume", 100);
        setIntField(term176610, term176610.getClass(), "sliderSeVolume", 100);
        setIntField(term176610, term176610.getClass(), "buttonSe", -1);
        setIntField(term176610, term176610.getClass(), "chainSlideSe", -1);
        setIntField(term176610, term176610.getClass(), "slideSe", -1);
        setIntField(term176610, term176610.getClass(), "sliderTouchSe", -1);
        setField(term176610, term176610.getClass(), "sortMode", enum396);
        setIntField(term176610, term176610.getClass(), "nextPvId", -1);
        setField(term176610, term176610.getClass(), "nextDifficulty", enum397);
        setField(term176610, term176610.getClass(), "nextEdition", enum398);
        setBooleanField(term176610, term176610.getClass(), "showInterimRanking", true);
        setBooleanField(term176610, term176610.getClass(), "showClearStatus", true);
        setBooleanField(term176610, term176610.getClass(), "showGreatBorder", true);
        setBooleanField(term176610, term176610.getClass(), "showExcellentBorder", true);
        setBooleanField(term176610, term176610.getClass(), "showRivalBorder", true);
        setBooleanField(term176610, term176610.getClass(), "showRgoSetting", true);
        setBooleanField(term176610, term176610.getClass(), "contestNowPlayingEnable", false);
        setIntField(term176610, term176610.getClass(), "contestNowPlayingId", -1);
        setIntField(term176610, term176610.getClass(), "contestNowPlayingValue", -1);
        setField(term176610, term176610.getClass(), "contestNowPlayingResultRank", enum399);
        setField(term176610, term176610.getClass(), "contestNowPlayingSpecifier", "");
        setField(term176610, term176610.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term176610, term176610.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term176610, term176610.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term176610, term176610.getClass(), "rivalPdId", -1);
        setField(term176608, term176608.getClass(), "pdId", term176610);
        setIntField(term176608, term176608.getClass(), "pvId", -439999692);
        setField(term176608, term176608.getClass(), "difficulty", enum400);
        setField(term176608, term176608.getClass(), "edition", enum398);
        setIntField(term176608, term176608.getClass(), "scriptVer", 924095007);
        setIntField(term176608, term176608.getClass(), "score", 1302110708);
        setField(term176608, term176608.getClass(), "challengeKind", enum401);
        setIntField(term176608, term176608.getClass(), "challengeResult", 594705497);
        setField(term176608, term176608.getClass(), "clearResult", enum402);
        setIntField(term176608, term176608.getClass(), "vp", -600102466);
        setIntField(term176608, term176608.getClass(), "coolCount", -899986714);
        setIntField(term176608, term176608.getClass(), "coolPercent", 1307244466);
        setIntField(term176608, term176608.getClass(), "fineCount", -252262096);
        setIntField(term176608, term176608.getClass(), "finePercent", -37129068);
        setIntField(term176608, term176608.getClass(), "safeCount", -861014847);
        setIntField(term176608, term176608.getClass(), "safePercent", 2132934139);
        setIntField(term176608, term176608.getClass(), "sadCount", -1261824381);
        setIntField(term176608, term176608.getClass(), "sadPercent", 1594426218);
        setIntField(term176608, term176608.getClass(), "wrongCount", -2060535464);
        setIntField(term176608, term176608.getClass(), "wrongPercent", -1242946317);
        setIntField(term176608, term176608.getClass(), "maxCombo", -1541566235);
        setIntField(term176608, term176608.getClass(), "chanceTime", -189738995);
        setIntField(term176608, term176608.getClass(), "holdScore", 1943019963);
        setIntField(term176608, term176608.getClass(), "attainPoint", 186472650);
        setIntField(term176608, term176608.getClass(), "skinId", 279675992);
        setIntField(term176608, term176608.getClass(), "buttonSe", -1626074989);
        setIntField(term176608, term176608.getClass(), "buttonSeVol", -552272253);
        setIntField(term176608, term176608.getClass(), "sliderSe", -633523956);
        setIntField(term176608, term176608.getClass(), "ChainSlideSe", 1761540885);
        setIntField(term176608, term176608.getClass(), "SliderTouchSe", -168498989);
        setField(term176608, term176608.getClass(), "modules", "AWRooQKkdW");
        setIntField(term176608, term176608.getClass(), "stageCompletion", 388247095);
        setIntField(term176608, term176608.getClass(), "slideScore", -1320402633);
        setIntField(term176608, term176608.getClass(), "isVocalChange", 919602316);
        setField(term176608, term176608.getClass(), "customizeItems", "vjxIhXHxGR");
        setField(term176608, term176608.getClass(), "rhythmGameOptions", "QXzGXbEXMu");
        setIntField(term176608, term176608.getClass(), "screenShotCount", -1);
        setIntField(term177320, term177320.getClass(), "year", 2010);
        setShortField(term177320, term177320.getClass(), "month", (short) 1);
        setShortField(term177320, term177320.getClass(), "day", (short) 17);
        setField(term177319, term177319.getClass(), "date", term177320);
        setByteField(term177324, term177324.getClass(), "hour", (byte) 13);
        setByteField(term177324, term177324.getClass(), "minute", (byte) 5);
        setByteField(term177324, term177324.getClass(), "second", (byte) 51);
        setIntField(term177324, term177324.getClass(), "nano", 362260580);
        setField(term177319, term177319.getClass(), "time", term177324);
        setField(term176608, term176608.getClass(), "dateTime", term177319);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSlideScore", argTypes, term176608, args);
    }

};


