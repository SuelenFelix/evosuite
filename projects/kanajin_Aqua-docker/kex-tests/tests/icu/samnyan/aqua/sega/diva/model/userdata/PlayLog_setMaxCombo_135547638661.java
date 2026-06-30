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

public class PlayLog_setMaxCombo_135547638661 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term273994;
     Object term274718;

    public PlayLog_setMaxCombo_135547638661() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term274727 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term274726 = ((Class) term274727).getDeclaredField((String) "MISS");
        ((Field) term274726).setAccessible(true);
        Object enum623 = ((Field) term274726).get((Object) null);
        Class<? extends Object> term275104 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term275103 = ((Class) term275104).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term275103).setAccessible(true);
        Object enum624 = ((Field) term275103).get((Object) null);
        Class<? extends Object> term275387 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term275386 = ((Class) term275387).getDeclaredField((String) "NORMAL");
        ((Field) term275386).setAccessible(true);
        Object enum625 = ((Field) term275386).get((Object) null);
        Class<? extends Object> term275662 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term275661 = ((Class) term275662).getDeclaredField((String) "ORIGINAL");
        ((Field) term275661).setAccessible(true);
        Object enum626 = ((Field) term275661).get((Object) null);
        Class<? extends Object> term275928 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term275927 = ((Class) term275928).getDeclaredField((String) "NONE");
        ((Field) term275927).setAccessible(true);
        Object enum627 = ((Field) term275927).get((Object) null);
        Class<? extends Object> term276569 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term276568 = ((Class) term276569).getDeclaredField((String) "EASY");
        ((Field) term276568).setAccessible(true);
        Object enum628 = ((Field) term276568).get((Object) null);
        Class<? extends Object> term276838 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term276837 = ((Class) term276838).getDeclaredField((String) "EXTRA");
        ((Field) term276837).setAccessible(true);
        Object enum629 = ((Field) term276837).get((Object) null);
        Class<? extends Object> term277095 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ChallengeKind");
        Field term277094 = ((Class) term277095).getDeclaredField((String) "CLEAR");
        ((Field) term277094).setAccessible(true);
        Object enum630 = ((Field) term277094).get((Object) null);
        Class<? extends Object> term277382 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ClearResult");
        Field term277381 = ((Class) term277382).getDeclaredField((String) "NO_CLEAR");
        ((Field) term277381).setAccessible(true);
        Object enum631 = ((Field) term277381).get((Object) null);
        term273994 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog"));
        Object term273996 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term274119 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term274120 = newInstance(Class.forName("java.time.LocalDate"));
        Object term274124 = newInstance(Class.forName("java.time.LocalTime"));
        Object term274708 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term274709 = newInstance(Class.forName("java.time.LocalDate"));
        Object term274713 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term273994, term273994.getClass(), "id", -8892586408602479513L);
        setLongField(term273996, term273996.getClass(), "id", 4616440478358528406L);
        setIntField(term273996, term273996.getClass(), "pdId", -187311406);
        setField(term273996, term273996.getClass(), "playerName", "xxx");
        setIntField(term273996, term273996.getClass(), "vocaloidPoints", 300);
        setIntField(term273996, term273996.getClass(), "level", 1);
        setIntField(term273996, term273996.getClass(), "levelExp", 1496632406);
        setField(term273996, term273996.getClass(), "levelTitle", "xxx");
        setIntField(term273996, term273996.getClass(), "plateId", -1);
        setIntField(term273996, term273996.getClass(), "plateEffectId", -1);
        setField(term273996, term273996.getClass(), "passwordStatus", enum623);
        setField(term273996, term273996.getClass(), "password", "**********");
        setBooleanField(term273996, term273996.getClass(), "preferPerPvModule", true);
        setBooleanField(term273996, term273996.getClass(), "preferCommonModule", false);
        setBooleanField(term273996, term273996.getClass(), "usePerPvSkin", true);
        setBooleanField(term273996, term273996.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term273996, term273996.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term273996, term273996.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term273996, term273996.getClass(), "usePerPvTouchSliderSe", false);
        setField(term273996, term273996.getClass(), "commonModule", "-999,-999,-999");
        setField(term273996, term273996.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term274120, term274120.getClass(), "year", 2026);
        setShortField(term274120, term274120.getClass(), "month", (short) 6);
        setShortField(term274120, term274120.getClass(), "day", (short) 29);
        setField(term274119, term274119.getClass(), "date", term274120);
        setByteField(term274124, term274124.getClass(), "hour", (byte) 4);
        setByteField(term274124, term274124.getClass(), "minute", (byte) 27);
        setByteField(term274124, term274124.getClass(), "second", (byte) 39);
        setIntField(term274124, term274124.getClass(), "nano", 171970000);
        setField(term274119, term274119.getClass(), "time", term274124);
        setField(term273996, term273996.getClass(), "commonModuleSetTime", term274119);
        setField(term273996, term273996.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term273996, term273996.getClass(), "commonSkin", -1);
        setIntField(term273996, term273996.getClass(), "headphoneVolume", 100);
        setBooleanField(term273996, term273996.getClass(), "buttonSeOn", true);
        setIntField(term273996, term273996.getClass(), "buttonSeVolume", 100);
        setIntField(term273996, term273996.getClass(), "sliderSeVolume", 100);
        setIntField(term273996, term273996.getClass(), "buttonSe", -1);
        setIntField(term273996, term273996.getClass(), "chainSlideSe", -1);
        setIntField(term273996, term273996.getClass(), "slideSe", -1);
        setIntField(term273996, term273996.getClass(), "sliderTouchSe", -1);
        setField(term273996, term273996.getClass(), "sortMode", enum624);
        setIntField(term273996, term273996.getClass(), "nextPvId", -1);
        setField(term273996, term273996.getClass(), "nextDifficulty", enum625);
        setField(term273996, term273996.getClass(), "nextEdition", enum626);
        setBooleanField(term273996, term273996.getClass(), "showInterimRanking", true);
        setBooleanField(term273996, term273996.getClass(), "showClearStatus", true);
        setBooleanField(term273996, term273996.getClass(), "showGreatBorder", true);
        setBooleanField(term273996, term273996.getClass(), "showExcellentBorder", true);
        setBooleanField(term273996, term273996.getClass(), "showRivalBorder", true);
        setBooleanField(term273996, term273996.getClass(), "showRgoSetting", true);
        setBooleanField(term273996, term273996.getClass(), "contestNowPlayingEnable", false);
        setIntField(term273996, term273996.getClass(), "contestNowPlayingId", -1);
        setIntField(term273996, term273996.getClass(), "contestNowPlayingValue", -1);
        setField(term273996, term273996.getClass(), "contestNowPlayingResultRank", enum627);
        setField(term273996, term273996.getClass(), "contestNowPlayingSpecifier", "");
        setField(term273996, term273996.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term273996, term273996.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term273996, term273996.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term273996, term273996.getClass(), "rivalPdId", -1);
        setField(term273994, term273994.getClass(), "pdId", term273996);
        setIntField(term273994, term273994.getClass(), "pvId", 1858277277);
        setField(term273994, term273994.getClass(), "difficulty", enum628);
        setField(term273994, term273994.getClass(), "edition", enum629);
        setIntField(term273994, term273994.getClass(), "scriptVer", 2145928130);
        setIntField(term273994, term273994.getClass(), "score", -1095947031);
        setField(term273994, term273994.getClass(), "challengeKind", enum630);
        setIntField(term273994, term273994.getClass(), "challengeResult", 1504187156);
        setField(term273994, term273994.getClass(), "clearResult", enum631);
        setIntField(term273994, term273994.getClass(), "vp", -1713723083);
        setIntField(term273994, term273994.getClass(), "coolCount", -1337690242);
        setIntField(term273994, term273994.getClass(), "coolPercent", 264872152);
        setIntField(term273994, term273994.getClass(), "fineCount", 1645751151);
        setIntField(term273994, term273994.getClass(), "finePercent", -2117930201);
        setIntField(term273994, term273994.getClass(), "safeCount", 1839150896);
        setIntField(term273994, term273994.getClass(), "safePercent", -1487860516);
        setIntField(term273994, term273994.getClass(), "sadCount", 784631129);
        setIntField(term273994, term273994.getClass(), "sadPercent", 658285959);
        setIntField(term273994, term273994.getClass(), "wrongCount", -89362706);
        setIntField(term273994, term273994.getClass(), "wrongPercent", 341388367);
        setIntField(term273994, term273994.getClass(), "maxCombo", 1078807592);
        setIntField(term273994, term273994.getClass(), "chanceTime", 1673044047);
        setIntField(term273994, term273994.getClass(), "holdScore", -1835617743);
        setIntField(term273994, term273994.getClass(), "attainPoint", -337695922);
        setIntField(term273994, term273994.getClass(), "skinId", 817836900);
        setIntField(term273994, term273994.getClass(), "buttonSe", 1691654567);
        setIntField(term273994, term273994.getClass(), "buttonSeVol", -1604942135);
        setIntField(term273994, term273994.getClass(), "sliderSe", 2000275611);
        setIntField(term273994, term273994.getClass(), "ChainSlideSe", 2060369122);
        setIntField(term273994, term273994.getClass(), "SliderTouchSe", -1275204506);
        setField(term273994, term273994.getClass(), "modules", "ekxGuOYIwi");
        setIntField(term273994, term273994.getClass(), "stageCompletion", 507439888);
        setIntField(term273994, term273994.getClass(), "slideScore", 1936798149);
        setIntField(term273994, term273994.getClass(), "isVocalChange", 188304401);
        setField(term273994, term273994.getClass(), "customizeItems", "RbVQXSpxXy");
        setField(term273994, term273994.getClass(), "rhythmGameOptions", "YpJbIgJWWv");
        setIntField(term273994, term273994.getClass(), "screenShotCount", -1);
        setIntField(term274709, term274709.getClass(), "year", 2019);
        setShortField(term274709, term274709.getClass(), "month", (short) 1);
        setShortField(term274709, term274709.getClass(), "day", (short) 6);
        setField(term274708, term274708.getClass(), "date", term274709);
        setByteField(term274713, term274713.getClass(), "hour", (byte) 18);
        setByteField(term274713, term274713.getClass(), "minute", (byte) 8);
        setByteField(term274713, term274713.getClass(), "second", (byte) 46);
        setIntField(term274713, term274713.getClass(), "nano", 934136445);
        setField(term274708, term274708.getClass(), "time", term274713);
        setField(term273994, term273994.getClass(), "dateTime", term274708);
        term274718 = new Integer(-40613160);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term274718;
        callMethod(klass, "setMaxCombo", argTypes, term273994, args);
    }

};


