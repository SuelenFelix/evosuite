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

public class PlayLog_getFinePercent_193417693915 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108421;

    public PlayLog_getFinePercent_193417693915() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term109148 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term109147 = ((Class) term109148).getDeclaredField((String) "MISS");
        ((Field) term109147).setAccessible(true);
        Object enum233 = ((Field) term109147).get((Object) null);
        Class<? extends Object> term109525 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term109524 = ((Class) term109525).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term109524).setAccessible(true);
        Object enum234 = ((Field) term109524).get((Object) null);
        Class<? extends Object> term109808 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term109807 = ((Class) term109808).getDeclaredField((String) "NORMAL");
        ((Field) term109807).setAccessible(true);
        Object enum235 = ((Field) term109807).get((Object) null);
        Class<? extends Object> term110083 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term110082 = ((Class) term110083).getDeclaredField((String) "ORIGINAL");
        ((Field) term110082).setAccessible(true);
        Object enum236 = ((Field) term110082).get((Object) null);
        Class<? extends Object> term110349 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term110348 = ((Class) term110349).getDeclaredField((String) "NONE");
        ((Field) term110348).setAccessible(true);
        Object enum237 = ((Field) term110348).get((Object) null);
        Class<? extends Object> term110990 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term110989 = ((Class) term110990).getDeclaredField((String) "EXTREME");
        ((Field) term110989).setAccessible(true);
        Object enum238 = ((Field) term110989).get((Object) null);
        Class<? extends Object> term111268 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ChallengeKind");
        Field term111267 = ((Class) term111268).getDeclaredField((String) "PERFECT");
        ((Field) term111267).setAccessible(true);
        Object enum239 = ((Field) term111267).get((Object) null);
        Class<? extends Object> term111561 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ClearResult");
        Field term111560 = ((Class) term111561).getDeclaredField((String) "MISS_TAKE");
        ((Field) term111560).setAccessible(true);
        Object enum240 = ((Field) term111560).get((Object) null);
        term108421 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog"));
        Object term108423 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term108546 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term108547 = newInstance(Class.forName("java.time.LocalDate"));
        Object term108551 = newInstance(Class.forName("java.time.LocalTime"));
        Object term109131 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term109132 = newInstance(Class.forName("java.time.LocalDate"));
        Object term109136 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term108421, term108421.getClass(), "id", 682356318767179819L);
        setLongField(term108423, term108423.getClass(), "id", -7291743527973326814L);
        setIntField(term108423, term108423.getClass(), "pdId", -1271375703);
        setField(term108423, term108423.getClass(), "playerName", "xxx");
        setIntField(term108423, term108423.getClass(), "vocaloidPoints", 300);
        setIntField(term108423, term108423.getClass(), "level", 1);
        setIntField(term108423, term108423.getClass(), "levelExp", 1136208236);
        setField(term108423, term108423.getClass(), "levelTitle", "xxx");
        setIntField(term108423, term108423.getClass(), "plateId", -1);
        setIntField(term108423, term108423.getClass(), "plateEffectId", -1);
        setField(term108423, term108423.getClass(), "passwordStatus", enum233);
        setField(term108423, term108423.getClass(), "password", "**********");
        setBooleanField(term108423, term108423.getClass(), "preferPerPvModule", true);
        setBooleanField(term108423, term108423.getClass(), "preferCommonModule", false);
        setBooleanField(term108423, term108423.getClass(), "usePerPvSkin", false);
        setBooleanField(term108423, term108423.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term108423, term108423.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term108423, term108423.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term108423, term108423.getClass(), "usePerPvTouchSliderSe", true);
        setField(term108423, term108423.getClass(), "commonModule", "-999,-999,-999");
        setField(term108423, term108423.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term108547, term108547.getClass(), "year", 2026);
        setShortField(term108547, term108547.getClass(), "month", (short) 6);
        setShortField(term108547, term108547.getClass(), "day", (short) 29);
        setField(term108546, term108546.getClass(), "date", term108547);
        setByteField(term108551, term108551.getClass(), "hour", (byte) 4);
        setByteField(term108551, term108551.getClass(), "minute", (byte) 27);
        setByteField(term108551, term108551.getClass(), "second", (byte) 27);
        setIntField(term108551, term108551.getClass(), "nano", 403282000);
        setField(term108546, term108546.getClass(), "time", term108551);
        setField(term108423, term108423.getClass(), "commonModuleSetTime", term108546);
        setField(term108423, term108423.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term108423, term108423.getClass(), "commonSkin", -1);
        setIntField(term108423, term108423.getClass(), "headphoneVolume", 100);
        setBooleanField(term108423, term108423.getClass(), "buttonSeOn", true);
        setIntField(term108423, term108423.getClass(), "buttonSeVolume", 100);
        setIntField(term108423, term108423.getClass(), "sliderSeVolume", 100);
        setIntField(term108423, term108423.getClass(), "buttonSe", -1);
        setIntField(term108423, term108423.getClass(), "chainSlideSe", -1);
        setIntField(term108423, term108423.getClass(), "slideSe", -1);
        setIntField(term108423, term108423.getClass(), "sliderTouchSe", -1);
        setField(term108423, term108423.getClass(), "sortMode", enum234);
        setIntField(term108423, term108423.getClass(), "nextPvId", -1);
        setField(term108423, term108423.getClass(), "nextDifficulty", enum235);
        setField(term108423, term108423.getClass(), "nextEdition", enum236);
        setBooleanField(term108423, term108423.getClass(), "showInterimRanking", true);
        setBooleanField(term108423, term108423.getClass(), "showClearStatus", true);
        setBooleanField(term108423, term108423.getClass(), "showGreatBorder", true);
        setBooleanField(term108423, term108423.getClass(), "showExcellentBorder", true);
        setBooleanField(term108423, term108423.getClass(), "showRivalBorder", true);
        setBooleanField(term108423, term108423.getClass(), "showRgoSetting", true);
        setBooleanField(term108423, term108423.getClass(), "contestNowPlayingEnable", true);
        setIntField(term108423, term108423.getClass(), "contestNowPlayingId", -1);
        setIntField(term108423, term108423.getClass(), "contestNowPlayingValue", -1);
        setField(term108423, term108423.getClass(), "contestNowPlayingResultRank", enum237);
        setField(term108423, term108423.getClass(), "contestNowPlayingSpecifier", "");
        setField(term108423, term108423.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term108423, term108423.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term108423, term108423.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term108423, term108423.getClass(), "rivalPdId", -1);
        setField(term108421, term108421.getClass(), "pdId", term108423);
        setIntField(term108421, term108421.getClass(), "pvId", -1220630391);
        setField(term108421, term108421.getClass(), "difficulty", enum238);
        setField(term108421, term108421.getClass(), "edition", enum236);
        setIntField(term108421, term108421.getClass(), "scriptVer", -995822131);
        setIntField(term108421, term108421.getClass(), "score", -687282231);
        setField(term108421, term108421.getClass(), "challengeKind", enum239);
        setIntField(term108421, term108421.getClass(), "challengeResult", 1200440315);
        setField(term108421, term108421.getClass(), "clearResult", enum240);
        setIntField(term108421, term108421.getClass(), "vp", 40571662);
        setIntField(term108421, term108421.getClass(), "coolCount", 1863910269);
        setIntField(term108421, term108421.getClass(), "coolPercent", 864645689);
        setIntField(term108421, term108421.getClass(), "fineCount", 279384872);
        setIntField(term108421, term108421.getClass(), "finePercent", 1427305953);
        setIntField(term108421, term108421.getClass(), "safeCount", -781832877);
        setIntField(term108421, term108421.getClass(), "safePercent", 797203987);
        setIntField(term108421, term108421.getClass(), "sadCount", 1973060703);
        setIntField(term108421, term108421.getClass(), "sadPercent", -138239905);
        setIntField(term108421, term108421.getClass(), "wrongCount", 1709474063);
        setIntField(term108421, term108421.getClass(), "wrongPercent", 1406617209);
        setIntField(term108421, term108421.getClass(), "maxCombo", 1706047059);
        setIntField(term108421, term108421.getClass(), "chanceTime", 590451710);
        setIntField(term108421, term108421.getClass(), "holdScore", -1999787419);
        setIntField(term108421, term108421.getClass(), "attainPoint", -1224443634);
        setIntField(term108421, term108421.getClass(), "skinId", 1048451946);
        setIntField(term108421, term108421.getClass(), "buttonSe", 5603560);
        setIntField(term108421, term108421.getClass(), "buttonSeVol", -1079020032);
        setIntField(term108421, term108421.getClass(), "sliderSe", -1973791064);
        setIntField(term108421, term108421.getClass(), "ChainSlideSe", -2072158633);
        setIntField(term108421, term108421.getClass(), "SliderTouchSe", -355469363);
        setField(term108421, term108421.getClass(), "modules", "GzFkzHGYFt");
        setIntField(term108421, term108421.getClass(), "stageCompletion", 1465188553);
        setIntField(term108421, term108421.getClass(), "slideScore", 1633913667);
        setIntField(term108421, term108421.getClass(), "isVocalChange", 1292332296);
        setField(term108421, term108421.getClass(), "customizeItems", "tShwQLRGNe");
        setField(term108421, term108421.getClass(), "rhythmGameOptions", "LvtrsXUliU");
        setIntField(term108421, term108421.getClass(), "screenShotCount", -1);
        setIntField(term109132, term109132.getClass(), "year", 2029);
        setShortField(term109132, term109132.getClass(), "month", (short) 6);
        setShortField(term109132, term109132.getClass(), "day", (short) 23);
        setField(term109131, term109131.getClass(), "date", term109132);
        setByteField(term109136, term109136.getClass(), "hour", (byte) 21);
        setByteField(term109136, term109136.getClass(), "minute", (byte) 55);
        setByteField(term109136, term109136.getClass(), "second", (byte) 27);
        setIntField(term109136, term109136.getClass(), "nano", 66889274);
        setField(term109131, term109131.getClass(), "time", term109136);
        setField(term108421, term108421.getClass(), "dateTime", term109131);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFinePercent", argTypes, term108421, args);
    }

};


