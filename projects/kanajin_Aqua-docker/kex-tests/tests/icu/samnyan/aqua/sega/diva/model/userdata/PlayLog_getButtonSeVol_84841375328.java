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

public class PlayLog_getButtonSeVol_84841375328 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term154568;

    public PlayLog_getButtonSeVol_84841375328() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term155298 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term155297 = ((Class) term155298).getDeclaredField((String) "MISS");
        ((Field) term155297).setAccessible(true);
        Object enum342 = ((Field) term155297).get((Object) null);
        Class<? extends Object> term155675 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term155674 = ((Class) term155675).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term155674).setAccessible(true);
        Object enum343 = ((Field) term155674).get((Object) null);
        Class<? extends Object> term155958 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term155957 = ((Class) term155958).getDeclaredField((String) "NORMAL");
        ((Field) term155957).setAccessible(true);
        Object enum344 = ((Field) term155957).get((Object) null);
        Class<? extends Object> term156233 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term156232 = ((Class) term156233).getDeclaredField((String) "ORIGINAL");
        ((Field) term156232).setAccessible(true);
        Object enum345 = ((Field) term156232).get((Object) null);
        Class<? extends Object> term156499 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term156498 = ((Class) term156499).getDeclaredField((String) "NONE");
        ((Field) term156498).setAccessible(true);
        Object enum346 = ((Field) term156498).get((Object) null);
        Class<? extends Object> term157140 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term157139 = ((Class) term157140).getDeclaredField((String) "EASY");
        ((Field) term157139).setAccessible(true);
        Object enum347 = ((Field) term157139).get((Object) null);
        Class<? extends Object> term157409 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term157408 = ((Class) term157409).getDeclaredField((String) "EXTRA");
        ((Field) term157408).setAccessible(true);
        Object enum348 = ((Field) term157408).get((Object) null);
        Class<? extends Object> term157666 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ChallengeKind");
        Field term157665 = ((Class) term157666).getDeclaredField((String) "PERFECT");
        ((Field) term157665).setAccessible(true);
        Object enum349 = ((Field) term157665).get((Object) null);
        Class<? extends Object> term157959 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ClearResult");
        Field term157958 = ((Class) term157959).getDeclaredField((String) "GREAT");
        ((Field) term157958).setAccessible(true);
        Object enum350 = ((Field) term157958).get((Object) null);
        term154568 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog"));
        Object term154570 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term154693 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term154694 = newInstance(Class.forName("java.time.LocalDate"));
        Object term154698 = newInstance(Class.forName("java.time.LocalTime"));
        Object term155281 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term155282 = newInstance(Class.forName("java.time.LocalDate"));
        Object term155286 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term154568, term154568.getClass(), "id", -5216789073301458893L);
        setLongField(term154570, term154570.getClass(), "id", -1832940336320585644L);
        setIntField(term154570, term154570.getClass(), "pdId", 1354781442);
        setField(term154570, term154570.getClass(), "playerName", "xxx");
        setIntField(term154570, term154570.getClass(), "vocaloidPoints", 300);
        setIntField(term154570, term154570.getClass(), "level", 1);
        setIntField(term154570, term154570.getClass(), "levelExp", -393590701);
        setField(term154570, term154570.getClass(), "levelTitle", "xxx");
        setIntField(term154570, term154570.getClass(), "plateId", -1);
        setIntField(term154570, term154570.getClass(), "plateEffectId", -1);
        setField(term154570, term154570.getClass(), "passwordStatus", enum342);
        setField(term154570, term154570.getClass(), "password", "**********");
        setBooleanField(term154570, term154570.getClass(), "preferPerPvModule", true);
        setBooleanField(term154570, term154570.getClass(), "preferCommonModule", false);
        setBooleanField(term154570, term154570.getClass(), "usePerPvSkin", true);
        setBooleanField(term154570, term154570.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term154570, term154570.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term154570, term154570.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term154570, term154570.getClass(), "usePerPvTouchSliderSe", true);
        setField(term154570, term154570.getClass(), "commonModule", "-999,-999,-999");
        setField(term154570, term154570.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term154694, term154694.getClass(), "year", 2026);
        setShortField(term154694, term154694.getClass(), "month", (short) 8);
        setShortField(term154694, term154694.getClass(), "day", (short) 12);
        setField(term154693, term154693.getClass(), "date", term154694);
        setByteField(term154698, term154698.getClass(), "hour", (byte) 2);
        setByteField(term154698, term154698.getClass(), "minute", (byte) 2);
        setByteField(term154698, term154698.getClass(), "second", (byte) 47);
        setIntField(term154698, term154698.getClass(), "nano", 180185000);
        setField(term154693, term154693.getClass(), "time", term154698);
        setField(term154570, term154570.getClass(), "commonModuleSetTime", term154693);
        setField(term154570, term154570.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term154570, term154570.getClass(), "commonSkin", -1);
        setIntField(term154570, term154570.getClass(), "headphoneVolume", 100);
        setBooleanField(term154570, term154570.getClass(), "buttonSeOn", true);
        setIntField(term154570, term154570.getClass(), "buttonSeVolume", 100);
        setIntField(term154570, term154570.getClass(), "sliderSeVolume", 100);
        setIntField(term154570, term154570.getClass(), "buttonSe", -1);
        setIntField(term154570, term154570.getClass(), "chainSlideSe", -1);
        setIntField(term154570, term154570.getClass(), "slideSe", -1);
        setIntField(term154570, term154570.getClass(), "sliderTouchSe", -1);
        setField(term154570, term154570.getClass(), "sortMode", enum343);
        setIntField(term154570, term154570.getClass(), "nextPvId", -1);
        setField(term154570, term154570.getClass(), "nextDifficulty", enum344);
        setField(term154570, term154570.getClass(), "nextEdition", enum345);
        setBooleanField(term154570, term154570.getClass(), "showInterimRanking", true);
        setBooleanField(term154570, term154570.getClass(), "showClearStatus", true);
        setBooleanField(term154570, term154570.getClass(), "showGreatBorder", true);
        setBooleanField(term154570, term154570.getClass(), "showExcellentBorder", true);
        setBooleanField(term154570, term154570.getClass(), "showRivalBorder", true);
        setBooleanField(term154570, term154570.getClass(), "showRgoSetting", true);
        setBooleanField(term154570, term154570.getClass(), "contestNowPlayingEnable", true);
        setIntField(term154570, term154570.getClass(), "contestNowPlayingId", -1);
        setIntField(term154570, term154570.getClass(), "contestNowPlayingValue", -1);
        setField(term154570, term154570.getClass(), "contestNowPlayingResultRank", enum346);
        setField(term154570, term154570.getClass(), "contestNowPlayingSpecifier", "");
        setField(term154570, term154570.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term154570, term154570.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term154570, term154570.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term154570, term154570.getClass(), "rivalPdId", -1);
        setField(term154568, term154568.getClass(), "pdId", term154570);
        setIntField(term154568, term154568.getClass(), "pvId", 86344574);
        setField(term154568, term154568.getClass(), "difficulty", enum347);
        setField(term154568, term154568.getClass(), "edition", enum348);
        setIntField(term154568, term154568.getClass(), "scriptVer", -829441157);
        setIntField(term154568, term154568.getClass(), "score", -1489991025);
        setField(term154568, term154568.getClass(), "challengeKind", enum349);
        setIntField(term154568, term154568.getClass(), "challengeResult", -1542979444);
        setField(term154568, term154568.getClass(), "clearResult", enum350);
        setIntField(term154568, term154568.getClass(), "vp", -1130401612);
        setIntField(term154568, term154568.getClass(), "coolCount", -316771104);
        setIntField(term154568, term154568.getClass(), "coolPercent", -1374527319);
        setIntField(term154568, term154568.getClass(), "fineCount", -1735276919);
        setIntField(term154568, term154568.getClass(), "finePercent", -712023865);
        setIntField(term154568, term154568.getClass(), "safeCount", 613256157);
        setIntField(term154568, term154568.getClass(), "safePercent", 454242689);
        setIntField(term154568, term154568.getClass(), "sadCount", 1798354517);
        setIntField(term154568, term154568.getClass(), "sadPercent", -1495693617);
        setIntField(term154568, term154568.getClass(), "wrongCount", -890538258);
        setIntField(term154568, term154568.getClass(), "wrongPercent", -1085899912);
        setIntField(term154568, term154568.getClass(), "maxCombo", -1458980236);
        setIntField(term154568, term154568.getClass(), "chanceTime", 890505372);
        setIntField(term154568, term154568.getClass(), "holdScore", 2044137055);
        setIntField(term154568, term154568.getClass(), "attainPoint", -1452324619);
        setIntField(term154568, term154568.getClass(), "skinId", -1121709274);
        setIntField(term154568, term154568.getClass(), "buttonSe", -532304223);
        setIntField(term154568, term154568.getClass(), "buttonSeVol", 666218293);
        setIntField(term154568, term154568.getClass(), "sliderSe", 1737876343);
        setIntField(term154568, term154568.getClass(), "ChainSlideSe", -897937940);
        setIntField(term154568, term154568.getClass(), "SliderTouchSe", 1523261232);
        setField(term154568, term154568.getClass(), "modules", "cAPeiZHKGJ");
        setIntField(term154568, term154568.getClass(), "stageCompletion", -428988337);
        setIntField(term154568, term154568.getClass(), "slideScore", 48047085);
        setIntField(term154568, term154568.getClass(), "isVocalChange", 1902784843);
        setField(term154568, term154568.getClass(), "customizeItems", "LvJFtLBaxj");
        setField(term154568, term154568.getClass(), "rhythmGameOptions", "PHvxnGHptP");
        setIntField(term154568, term154568.getClass(), "screenShotCount", -1);
        setIntField(term155282, term155282.getClass(), "year", 2016);
        setShortField(term155282, term155282.getClass(), "month", (short) 6);
        setShortField(term155282, term155282.getClass(), "day", (short) 15);
        setField(term155281, term155281.getClass(), "date", term155282);
        setByteField(term155286, term155286.getClass(), "hour", (byte) 21);
        setByteField(term155286, term155286.getClass(), "minute", (byte) 23);
        setByteField(term155286, term155286.getClass(), "second", (byte) 23);
        setIntField(term155286, term155286.getClass(), "nano", 433372070);
        setField(term155281, term155281.getClass(), "time", term155286);
        setField(term154568, term154568.getClass(), "dateTime", term155281);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getButtonSeVol", argTypes, term154568, args);
    }

};


