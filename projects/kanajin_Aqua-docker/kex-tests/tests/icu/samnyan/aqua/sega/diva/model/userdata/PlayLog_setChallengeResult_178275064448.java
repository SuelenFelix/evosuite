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

public class PlayLog_setChallengeResult_178275064448 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term228349;
     Object term229073;

    public PlayLog_setChallengeResult_178275064448() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term229082 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term229081 = ((Class) term229082).getDeclaredField((String) "MISS");
        ((Field) term229081).setAccessible(true);
        Object enum516 = ((Field) term229081).get((Object) null);
        Class<? extends Object> term229459 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term229458 = ((Class) term229459).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term229458).setAccessible(true);
        Object enum517 = ((Field) term229458).get((Object) null);
        Class<? extends Object> term229742 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term229741 = ((Class) term229742).getDeclaredField((String) "NORMAL");
        ((Field) term229741).setAccessible(true);
        Object enum518 = ((Field) term229741).get((Object) null);
        Class<? extends Object> term230017 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term230016 = ((Class) term230017).getDeclaredField((String) "ORIGINAL");
        ((Field) term230016).setAccessible(true);
        Object enum519 = ((Field) term230016).get((Object) null);
        Class<? extends Object> term230283 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term230282 = ((Class) term230283).getDeclaredField((String) "NONE");
        ((Field) term230282).setAccessible(true);
        Object enum520 = ((Field) term230282).get((Object) null);
        Class<? extends Object> term230924 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term230923 = ((Class) term230924).getDeclaredField((String) "HARD");
        ((Field) term230923).setAccessible(true);
        Object enum521 = ((Field) term230923).get((Object) null);
        Class<? extends Object> term231193 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term231192 = ((Class) term231193).getDeclaredField((String) "EXTRA");
        ((Field) term231192).setAccessible(true);
        Object enum522 = ((Field) term231192).get((Object) null);
        Class<? extends Object> term231450 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ChallengeKind");
        Field term231449 = ((Class) term231450).getDeclaredField((String) "GREAT");
        ((Field) term231449).setAccessible(true);
        Object enum523 = ((Field) term231449).get((Object) null);
        Class<? extends Object> term231737 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ClearResult");
        Field term231736 = ((Class) term231737).getDeclaredField((String) "STANDARD");
        ((Field) term231736).setAccessible(true);
        Object enum524 = ((Field) term231736).get((Object) null);
        term228349 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog"));
        Object term228351 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term228474 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term228475 = newInstance(Class.forName("java.time.LocalDate"));
        Object term228479 = newInstance(Class.forName("java.time.LocalTime"));
        Object term229063 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term229064 = newInstance(Class.forName("java.time.LocalDate"));
        Object term229068 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term228349, term228349.getClass(), "id", -2924531382671518368L);
        setLongField(term228351, term228351.getClass(), "id", -3948863953565024517L);
        setIntField(term228351, term228351.getClass(), "pdId", 1704024265);
        setField(term228351, term228351.getClass(), "playerName", "xxx");
        setIntField(term228351, term228351.getClass(), "vocaloidPoints", 300);
        setIntField(term228351, term228351.getClass(), "level", 1);
        setIntField(term228351, term228351.getClass(), "levelExp", 501801161);
        setField(term228351, term228351.getClass(), "levelTitle", "xxx");
        setIntField(term228351, term228351.getClass(), "plateId", -1);
        setIntField(term228351, term228351.getClass(), "plateEffectId", -1);
        setField(term228351, term228351.getClass(), "passwordStatus", enum516);
        setField(term228351, term228351.getClass(), "password", "**********");
        setBooleanField(term228351, term228351.getClass(), "preferPerPvModule", true);
        setBooleanField(term228351, term228351.getClass(), "preferCommonModule", false);
        setBooleanField(term228351, term228351.getClass(), "usePerPvSkin", true);
        setBooleanField(term228351, term228351.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term228351, term228351.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term228351, term228351.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term228351, term228351.getClass(), "usePerPvTouchSliderSe", true);
        setField(term228351, term228351.getClass(), "commonModule", "-999,-999,-999");
        setField(term228351, term228351.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term228475, term228475.getClass(), "year", 2026);
        setShortField(term228475, term228475.getClass(), "month", (short) 8);
        setShortField(term228475, term228475.getClass(), "day", (short) 12);
        setField(term228474, term228474.getClass(), "date", term228475);
        setByteField(term228479, term228479.getClass(), "hour", (byte) 2);
        setByteField(term228479, term228479.getClass(), "minute", (byte) 2);
        setByteField(term228479, term228479.getClass(), "second", (byte) 52);
        setIntField(term228479, term228479.getClass(), "nano", 334229000);
        setField(term228474, term228474.getClass(), "time", term228479);
        setField(term228351, term228351.getClass(), "commonModuleSetTime", term228474);
        setField(term228351, term228351.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term228351, term228351.getClass(), "commonSkin", -1);
        setIntField(term228351, term228351.getClass(), "headphoneVolume", 100);
        setBooleanField(term228351, term228351.getClass(), "buttonSeOn", true);
        setIntField(term228351, term228351.getClass(), "buttonSeVolume", 100);
        setIntField(term228351, term228351.getClass(), "sliderSeVolume", 100);
        setIntField(term228351, term228351.getClass(), "buttonSe", -1);
        setIntField(term228351, term228351.getClass(), "chainSlideSe", -1);
        setIntField(term228351, term228351.getClass(), "slideSe", -1);
        setIntField(term228351, term228351.getClass(), "sliderTouchSe", -1);
        setField(term228351, term228351.getClass(), "sortMode", enum517);
        setIntField(term228351, term228351.getClass(), "nextPvId", -1);
        setField(term228351, term228351.getClass(), "nextDifficulty", enum518);
        setField(term228351, term228351.getClass(), "nextEdition", enum519);
        setBooleanField(term228351, term228351.getClass(), "showInterimRanking", true);
        setBooleanField(term228351, term228351.getClass(), "showClearStatus", true);
        setBooleanField(term228351, term228351.getClass(), "showGreatBorder", true);
        setBooleanField(term228351, term228351.getClass(), "showExcellentBorder", true);
        setBooleanField(term228351, term228351.getClass(), "showRivalBorder", true);
        setBooleanField(term228351, term228351.getClass(), "showRgoSetting", true);
        setBooleanField(term228351, term228351.getClass(), "contestNowPlayingEnable", true);
        setIntField(term228351, term228351.getClass(), "contestNowPlayingId", -1);
        setIntField(term228351, term228351.getClass(), "contestNowPlayingValue", -1);
        setField(term228351, term228351.getClass(), "contestNowPlayingResultRank", enum520);
        setField(term228351, term228351.getClass(), "contestNowPlayingSpecifier", "");
        setField(term228351, term228351.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term228351, term228351.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term228351, term228351.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term228351, term228351.getClass(), "rivalPdId", -1);
        setField(term228349, term228349.getClass(), "pdId", term228351);
        setIntField(term228349, term228349.getClass(), "pvId", 2103971768);
        setField(term228349, term228349.getClass(), "difficulty", enum521);
        setField(term228349, term228349.getClass(), "edition", enum522);
        setIntField(term228349, term228349.getClass(), "scriptVer", -939132796);
        setIntField(term228349, term228349.getClass(), "score", 159279866);
        setField(term228349, term228349.getClass(), "challengeKind", enum523);
        setIntField(term228349, term228349.getClass(), "challengeResult", 138122227);
        setField(term228349, term228349.getClass(), "clearResult", enum524);
        setIntField(term228349, term228349.getClass(), "vp", 1795358995);
        setIntField(term228349, term228349.getClass(), "coolCount", -781185864);
        setIntField(term228349, term228349.getClass(), "coolPercent", 340500914);
        setIntField(term228349, term228349.getClass(), "fineCount", -2061712635);
        setIntField(term228349, term228349.getClass(), "finePercent", 1182911731);
        setIntField(term228349, term228349.getClass(), "safeCount", 644726932);
        setIntField(term228349, term228349.getClass(), "safePercent", -1515977761);
        setIntField(term228349, term228349.getClass(), "sadCount", -1476037190);
        setIntField(term228349, term228349.getClass(), "sadPercent", -718204437);
        setIntField(term228349, term228349.getClass(), "wrongCount", 468974358);
        setIntField(term228349, term228349.getClass(), "wrongPercent", 346282818);
        setIntField(term228349, term228349.getClass(), "maxCombo", -857876056);
        setIntField(term228349, term228349.getClass(), "chanceTime", 1392910876);
        setIntField(term228349, term228349.getClass(), "holdScore", 1086383182);
        setIntField(term228349, term228349.getClass(), "attainPoint", 1425319286);
        setIntField(term228349, term228349.getClass(), "skinId", 1729919228);
        setIntField(term228349, term228349.getClass(), "buttonSe", 872351195);
        setIntField(term228349, term228349.getClass(), "buttonSeVol", -1664328399);
        setIntField(term228349, term228349.getClass(), "sliderSe", 1422430512);
        setIntField(term228349, term228349.getClass(), "ChainSlideSe", 1796581482);
        setIntField(term228349, term228349.getClass(), "SliderTouchSe", 1286440081);
        setField(term228349, term228349.getClass(), "modules", "GgZWSjxjyE");
        setIntField(term228349, term228349.getClass(), "stageCompletion", -928538452);
        setIntField(term228349, term228349.getClass(), "slideScore", -1313207353);
        setIntField(term228349, term228349.getClass(), "isVocalChange", 402612318);
        setField(term228349, term228349.getClass(), "customizeItems", "EeBVbzjcCI");
        setField(term228349, term228349.getClass(), "rhythmGameOptions", "UfQtPRyWRC");
        setIntField(term228349, term228349.getClass(), "screenShotCount", -1);
        setIntField(term229064, term229064.getClass(), "year", 2024);
        setShortField(term229064, term229064.getClass(), "month", (short) 5);
        setShortField(term229064, term229064.getClass(), "day", (short) 6);
        setField(term229063, term229063.getClass(), "date", term229064);
        setByteField(term229068, term229068.getClass(), "hour", (byte) 20);
        setByteField(term229068, term229068.getClass(), "minute", (byte) 14);
        setByteField(term229068, term229068.getClass(), "second", (byte) 27);
        setIntField(term229068, term229068.getClass(), "nano", 900636101);
        setField(term229063, term229063.getClass(), "time", term229068);
        setField(term228349, term228349.getClass(), "dateTime", term229063);
        term229073 = new Integer(-1628481565);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term229073;
        callMethod(klass, "setChallengeResult", argTypes, term228349, args);
    }

};


