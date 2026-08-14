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

public class PlayLog_getButtonSe_118778400627 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term151392;

    public PlayLog_getButtonSe_118778400627() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term152109 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term152108 = ((Class) term152109).getDeclaredField((String) "MISS");
        ((Field) term152108).setAccessible(true);
        Object enum335 = ((Field) term152108).get((Object) null);
        Class<? extends Object> term152486 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term152485 = ((Class) term152486).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term152485).setAccessible(true);
        Object enum336 = ((Field) term152485).get((Object) null);
        Class<? extends Object> term152769 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term152768 = ((Class) term152769).getDeclaredField((String) "NORMAL");
        ((Field) term152768).setAccessible(true);
        Object enum337 = ((Field) term152768).get((Object) null);
        Class<? extends Object> term153044 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term153043 = ((Class) term153044).getDeclaredField((String) "ORIGINAL");
        ((Field) term153043).setAccessible(true);
        Object enum338 = ((Field) term153043).get((Object) null);
        Class<? extends Object> term153310 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term153309 = ((Class) term153310).getDeclaredField((String) "NONE");
        ((Field) term153309).setAccessible(true);
        Object enum339 = ((Field) term153309).get((Object) null);
        Class<? extends Object> term153951 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ChallengeKind");
        Field term153950 = ((Class) term153951).getDeclaredField((String) "UNDEFINED");
        ((Field) term153950).setAccessible(true);
        Object enum340 = ((Field) term153950).get((Object) null);
        Class<? extends Object> term154250 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ClearResult");
        Field term154249 = ((Class) term154250).getDeclaredField((String) "MISS_TAKE");
        ((Field) term154249).setAccessible(true);
        Object enum341 = ((Field) term154249).get((Object) null);
        term151392 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog"));
        Object term151394 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term151517 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term151518 = newInstance(Class.forName("java.time.LocalDate"));
        Object term151522 = newInstance(Class.forName("java.time.LocalTime"));
        Object term152092 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term152093 = newInstance(Class.forName("java.time.LocalDate"));
        Object term152097 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term151392, term151392.getClass(), "id", 1672578078364590450L);
        setLongField(term151394, term151394.getClass(), "id", 4949335493504695457L);
        setIntField(term151394, term151394.getClass(), "pdId", 1430066560);
        setField(term151394, term151394.getClass(), "playerName", "xxx");
        setIntField(term151394, term151394.getClass(), "vocaloidPoints", 300);
        setIntField(term151394, term151394.getClass(), "level", 1);
        setIntField(term151394, term151394.getClass(), "levelExp", 836734074);
        setField(term151394, term151394.getClass(), "levelTitle", "xxx");
        setIntField(term151394, term151394.getClass(), "plateId", -1);
        setIntField(term151394, term151394.getClass(), "plateEffectId", -1);
        setField(term151394, term151394.getClass(), "passwordStatus", enum335);
        setField(term151394, term151394.getClass(), "password", "**********");
        setBooleanField(term151394, term151394.getClass(), "preferPerPvModule", true);
        setBooleanField(term151394, term151394.getClass(), "preferCommonModule", true);
        setBooleanField(term151394, term151394.getClass(), "usePerPvSkin", false);
        setBooleanField(term151394, term151394.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term151394, term151394.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term151394, term151394.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term151394, term151394.getClass(), "usePerPvTouchSliderSe", false);
        setField(term151394, term151394.getClass(), "commonModule", "-999,-999,-999");
        setField(term151394, term151394.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term151518, term151518.getClass(), "year", 2026);
        setShortField(term151518, term151518.getClass(), "month", (short) 8);
        setShortField(term151518, term151518.getClass(), "day", (short) 12);
        setField(term151517, term151517.getClass(), "date", term151518);
        setByteField(term151522, term151522.getClass(), "hour", (byte) 2);
        setByteField(term151522, term151522.getClass(), "minute", (byte) 2);
        setByteField(term151522, term151522.getClass(), "second", (byte) 46);
        setIntField(term151522, term151522.getClass(), "nano", 928876000);
        setField(term151517, term151517.getClass(), "time", term151522);
        setField(term151394, term151394.getClass(), "commonModuleSetTime", term151517);
        setField(term151394, term151394.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term151394, term151394.getClass(), "commonSkin", -1);
        setIntField(term151394, term151394.getClass(), "headphoneVolume", 100);
        setBooleanField(term151394, term151394.getClass(), "buttonSeOn", true);
        setIntField(term151394, term151394.getClass(), "buttonSeVolume", 100);
        setIntField(term151394, term151394.getClass(), "sliderSeVolume", 100);
        setIntField(term151394, term151394.getClass(), "buttonSe", -1);
        setIntField(term151394, term151394.getClass(), "chainSlideSe", -1);
        setIntField(term151394, term151394.getClass(), "slideSe", -1);
        setIntField(term151394, term151394.getClass(), "sliderTouchSe", -1);
        setField(term151394, term151394.getClass(), "sortMode", enum336);
        setIntField(term151394, term151394.getClass(), "nextPvId", -1);
        setField(term151394, term151394.getClass(), "nextDifficulty", enum337);
        setField(term151394, term151394.getClass(), "nextEdition", enum338);
        setBooleanField(term151394, term151394.getClass(), "showInterimRanking", true);
        setBooleanField(term151394, term151394.getClass(), "showClearStatus", true);
        setBooleanField(term151394, term151394.getClass(), "showGreatBorder", true);
        setBooleanField(term151394, term151394.getClass(), "showExcellentBorder", true);
        setBooleanField(term151394, term151394.getClass(), "showRivalBorder", true);
        setBooleanField(term151394, term151394.getClass(), "showRgoSetting", true);
        setBooleanField(term151394, term151394.getClass(), "contestNowPlayingEnable", false);
        setIntField(term151394, term151394.getClass(), "contestNowPlayingId", -1);
        setIntField(term151394, term151394.getClass(), "contestNowPlayingValue", -1);
        setField(term151394, term151394.getClass(), "contestNowPlayingResultRank", enum339);
        setField(term151394, term151394.getClass(), "contestNowPlayingSpecifier", "");
        setField(term151394, term151394.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term151394, term151394.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term151394, term151394.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term151394, term151394.getClass(), "rivalPdId", -1);
        setField(term151392, term151392.getClass(), "pdId", term151394);
        setIntField(term151392, term151392.getClass(), "pvId", -1747711865);
        setField(term151392, term151392.getClass(), "difficulty", enum337);
        setField(term151392, term151392.getClass(), "edition", enum338);
        setIntField(term151392, term151392.getClass(), "scriptVer", 682812715);
        setIntField(term151392, term151392.getClass(), "score", -1092883950);
        setField(term151392, term151392.getClass(), "challengeKind", enum340);
        setIntField(term151392, term151392.getClass(), "challengeResult", 950385621);
        setField(term151392, term151392.getClass(), "clearResult", enum341);
        setIntField(term151392, term151392.getClass(), "vp", -232352320);
        setIntField(term151392, term151392.getClass(), "coolCount", -232333014);
        setIntField(term151392, term151392.getClass(), "coolPercent", -139694079);
        setIntField(term151392, term151392.getClass(), "fineCount", -1602072035);
        setIntField(term151392, term151392.getClass(), "finePercent", 1902624392);
        setIntField(term151392, term151392.getClass(), "safeCount", 904607217);
        setIntField(term151392, term151392.getClass(), "safePercent", 434914590);
        setIntField(term151392, term151392.getClass(), "sadCount", 1983756621);
        setIntField(term151392, term151392.getClass(), "sadPercent", -2134711835);
        setIntField(term151392, term151392.getClass(), "wrongCount", -1641244494);
        setIntField(term151392, term151392.getClass(), "wrongPercent", 1124282188);
        setIntField(term151392, term151392.getClass(), "maxCombo", -489441521);
        setIntField(term151392, term151392.getClass(), "chanceTime", 225873732);
        setIntField(term151392, term151392.getClass(), "holdScore", 529879356);
        setIntField(term151392, term151392.getClass(), "attainPoint", 18072182);
        setIntField(term151392, term151392.getClass(), "skinId", 1544768934);
        setIntField(term151392, term151392.getClass(), "buttonSe", -383508597);
        setIntField(term151392, term151392.getClass(), "buttonSeVol", -819372164);
        setIntField(term151392, term151392.getClass(), "sliderSe", 958132675);
        setIntField(term151392, term151392.getClass(), "ChainSlideSe", -689879283);
        setIntField(term151392, term151392.getClass(), "SliderTouchSe", 1985432430);
        setField(term151392, term151392.getClass(), "modules", "VgZnGoIFwQ");
        setIntField(term151392, term151392.getClass(), "stageCompletion", -1769933499);
        setIntField(term151392, term151392.getClass(), "slideScore", -1510932472);
        setIntField(term151392, term151392.getClass(), "isVocalChange", 1970654816);
        setField(term151392, term151392.getClass(), "customizeItems", "jUbSRrkrYZ");
        setField(term151392, term151392.getClass(), "rhythmGameOptions", "bWWfajKbEX");
        setIntField(term151392, term151392.getClass(), "screenShotCount", -1);
        setIntField(term152093, term152093.getClass(), "year", 2025);
        setShortField(term152093, term152093.getClass(), "month", (short) 11);
        setShortField(term152093, term152093.getClass(), "day", (short) 3);
        setField(term152092, term152092.getClass(), "date", term152093);
        setByteField(term152097, term152097.getClass(), "hour", (byte) 21);
        setByteField(term152097, term152097.getClass(), "minute", (byte) 24);
        setByteField(term152097, term152097.getClass(), "second", (byte) 23);
        setIntField(term152097, term152097.getClass(), "nano", 210986721);
        setField(term152092, term152092.getClass(), "time", term152097);
        setField(term151392, term151392.getClass(), "dateTime", term152092);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getButtonSe", argTypes, term151392, args);
    }

};


