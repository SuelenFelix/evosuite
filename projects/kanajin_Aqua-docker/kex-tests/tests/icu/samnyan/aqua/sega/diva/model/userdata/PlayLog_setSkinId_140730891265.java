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

public class PlayLog_setSkinId_140730891265 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term288276;
     Object term289006;

    public PlayLog_setSkinId_140730891265() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term289015 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term289014 = ((Class) term289015).getDeclaredField((String) "MISS");
        ((Field) term289014).setAccessible(true);
        Object enum657 = ((Field) term289014).get((Object) null);
        Class<? extends Object> term289392 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term289391 = ((Class) term289392).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term289391).setAccessible(true);
        Object enum658 = ((Field) term289391).get((Object) null);
        Class<? extends Object> term289675 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term289674 = ((Class) term289675).getDeclaredField((String) "NORMAL");
        ((Field) term289674).setAccessible(true);
        Object enum659 = ((Field) term289674).get((Object) null);
        Class<? extends Object> term289950 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term289949 = ((Class) term289950).getDeclaredField((String) "ORIGINAL");
        ((Field) term289949).setAccessible(true);
        Object enum660 = ((Field) term289949).get((Object) null);
        Class<? extends Object> term290216 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term290215 = ((Class) term290216).getDeclaredField((String) "NONE");
        ((Field) term290215).setAccessible(true);
        Object enum661 = ((Field) term290215).get((Object) null);
        Class<? extends Object> term290857 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term290856 = ((Class) term290857).getDeclaredField((String) "EXTREME");
        ((Field) term290856).setAccessible(true);
        Object enum662 = ((Field) term290856).get((Object) null);
        Class<? extends Object> term291135 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term291134 = ((Class) term291135).getDeclaredField((String) "EXTRA");
        ((Field) term291134).setAccessible(true);
        Object enum663 = ((Field) term291134).get((Object) null);
        Class<? extends Object> term291392 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ChallengeKind");
        Field term291391 = ((Class) term291392).getDeclaredField((String) "UNDEFINED");
        ((Field) term291391).setAccessible(true);
        Object enum664 = ((Field) term291391).get((Object) null);
        Class<? extends Object> term291691 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ClearResult");
        Field term291690 = ((Class) term291691).getDeclaredField((String) "PERFECT");
        ((Field) term291690).setAccessible(true);
        Object enum665 = ((Field) term291690).get((Object) null);
        term288276 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog"));
        Object term288278 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term288401 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term288402 = newInstance(Class.forName("java.time.LocalDate"));
        Object term288406 = newInstance(Class.forName("java.time.LocalTime"));
        Object term288996 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term288997 = newInstance(Class.forName("java.time.LocalDate"));
        Object term289001 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term288276, term288276.getClass(), "id", -6100012593724108983L);
        setLongField(term288278, term288278.getClass(), "id", 5465527210299101732L);
        setIntField(term288278, term288278.getClass(), "pdId", 72767889);
        setField(term288278, term288278.getClass(), "playerName", "xxx");
        setIntField(term288278, term288278.getClass(), "vocaloidPoints", 300);
        setIntField(term288278, term288278.getClass(), "level", 1);
        setIntField(term288278, term288278.getClass(), "levelExp", 1699515029);
        setField(term288278, term288278.getClass(), "levelTitle", "xxx");
        setIntField(term288278, term288278.getClass(), "plateId", -1);
        setIntField(term288278, term288278.getClass(), "plateEffectId", -1);
        setField(term288278, term288278.getClass(), "passwordStatus", enum657);
        setField(term288278, term288278.getClass(), "password", "**********");
        setBooleanField(term288278, term288278.getClass(), "preferPerPvModule", true);
        setBooleanField(term288278, term288278.getClass(), "preferCommonModule", false);
        setBooleanField(term288278, term288278.getClass(), "usePerPvSkin", true);
        setBooleanField(term288278, term288278.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term288278, term288278.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term288278, term288278.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term288278, term288278.getClass(), "usePerPvTouchSliderSe", false);
        setField(term288278, term288278.getClass(), "commonModule", "-999,-999,-999");
        setField(term288278, term288278.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term288402, term288402.getClass(), "year", 2026);
        setShortField(term288402, term288402.getClass(), "month", (short) 6);
        setShortField(term288402, term288402.getClass(), "day", (short) 29);
        setField(term288401, term288401.getClass(), "date", term288402);
        setByteField(term288406, term288406.getClass(), "hour", (byte) 4);
        setByteField(term288406, term288406.getClass(), "minute", (byte) 27);
        setByteField(term288406, term288406.getClass(), "second", (byte) 40);
        setIntField(term288406, term288406.getClass(), "nano", 196197000);
        setField(term288401, term288401.getClass(), "time", term288406);
        setField(term288278, term288278.getClass(), "commonModuleSetTime", term288401);
        setField(term288278, term288278.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term288278, term288278.getClass(), "commonSkin", -1);
        setIntField(term288278, term288278.getClass(), "headphoneVolume", 100);
        setBooleanField(term288278, term288278.getClass(), "buttonSeOn", true);
        setIntField(term288278, term288278.getClass(), "buttonSeVolume", 100);
        setIntField(term288278, term288278.getClass(), "sliderSeVolume", 100);
        setIntField(term288278, term288278.getClass(), "buttonSe", -1);
        setIntField(term288278, term288278.getClass(), "chainSlideSe", -1);
        setIntField(term288278, term288278.getClass(), "slideSe", -1);
        setIntField(term288278, term288278.getClass(), "sliderTouchSe", -1);
        setField(term288278, term288278.getClass(), "sortMode", enum658);
        setIntField(term288278, term288278.getClass(), "nextPvId", -1);
        setField(term288278, term288278.getClass(), "nextDifficulty", enum659);
        setField(term288278, term288278.getClass(), "nextEdition", enum660);
        setBooleanField(term288278, term288278.getClass(), "showInterimRanking", true);
        setBooleanField(term288278, term288278.getClass(), "showClearStatus", true);
        setBooleanField(term288278, term288278.getClass(), "showGreatBorder", true);
        setBooleanField(term288278, term288278.getClass(), "showExcellentBorder", true);
        setBooleanField(term288278, term288278.getClass(), "showRivalBorder", true);
        setBooleanField(term288278, term288278.getClass(), "showRgoSetting", true);
        setBooleanField(term288278, term288278.getClass(), "contestNowPlayingEnable", false);
        setIntField(term288278, term288278.getClass(), "contestNowPlayingId", -1);
        setIntField(term288278, term288278.getClass(), "contestNowPlayingValue", -1);
        setField(term288278, term288278.getClass(), "contestNowPlayingResultRank", enum661);
        setField(term288278, term288278.getClass(), "contestNowPlayingSpecifier", "");
        setField(term288278, term288278.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term288278, term288278.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term288278, term288278.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term288278, term288278.getClass(), "rivalPdId", -1);
        setField(term288276, term288276.getClass(), "pdId", term288278);
        setIntField(term288276, term288276.getClass(), "pvId", 673153263);
        setField(term288276, term288276.getClass(), "difficulty", enum662);
        setField(term288276, term288276.getClass(), "edition", enum663);
        setIntField(term288276, term288276.getClass(), "scriptVer", -1355715967);
        setIntField(term288276, term288276.getClass(), "score", -972516789);
        setField(term288276, term288276.getClass(), "challengeKind", enum664);
        setIntField(term288276, term288276.getClass(), "challengeResult", 720077443);
        setField(term288276, term288276.getClass(), "clearResult", enum665);
        setIntField(term288276, term288276.getClass(), "vp", -884523977);
        setIntField(term288276, term288276.getClass(), "coolCount", -1396233580);
        setIntField(term288276, term288276.getClass(), "coolPercent", -654234892);
        setIntField(term288276, term288276.getClass(), "fineCount", -50930731);
        setIntField(term288276, term288276.getClass(), "finePercent", -1067876039);
        setIntField(term288276, term288276.getClass(), "safeCount", -1143749623);
        setIntField(term288276, term288276.getClass(), "safePercent", 1961561878);
        setIntField(term288276, term288276.getClass(), "sadCount", 1235809050);
        setIntField(term288276, term288276.getClass(), "sadPercent", 1370082921);
        setIntField(term288276, term288276.getClass(), "wrongCount", 1966881264);
        setIntField(term288276, term288276.getClass(), "wrongPercent", -1707655562);
        setIntField(term288276, term288276.getClass(), "maxCombo", 1525815085);
        setIntField(term288276, term288276.getClass(), "chanceTime", 1785476260);
        setIntField(term288276, term288276.getClass(), "holdScore", -655035002);
        setIntField(term288276, term288276.getClass(), "attainPoint", 1841475189);
        setIntField(term288276, term288276.getClass(), "skinId", -456566581);
        setIntField(term288276, term288276.getClass(), "buttonSe", 2114761003);
        setIntField(term288276, term288276.getClass(), "buttonSeVol", -1128091158);
        setIntField(term288276, term288276.getClass(), "sliderSe", 380526008);
        setIntField(term288276, term288276.getClass(), "ChainSlideSe", -285065370);
        setIntField(term288276, term288276.getClass(), "SliderTouchSe", -1542216721);
        setField(term288276, term288276.getClass(), "modules", "PgPzMSEjjX");
        setIntField(term288276, term288276.getClass(), "stageCompletion", -311300330);
        setIntField(term288276, term288276.getClass(), "slideScore", 1160936971);
        setIntField(term288276, term288276.getClass(), "isVocalChange", 1258846008);
        setField(term288276, term288276.getClass(), "customizeItems", "wzsPSPcRdj");
        setField(term288276, term288276.getClass(), "rhythmGameOptions", "kGMQdqJYyB");
        setIntField(term288276, term288276.getClass(), "screenShotCount", -1);
        setIntField(term288997, term288997.getClass(), "year", 2025);
        setShortField(term288997, term288997.getClass(), "month", (short) 8);
        setShortField(term288997, term288997.getClass(), "day", (short) 22);
        setField(term288996, term288996.getClass(), "date", term288997);
        setByteField(term289001, term289001.getClass(), "hour", (byte) 6);
        setByteField(term289001, term289001.getClass(), "minute", (byte) 48);
        setByteField(term289001, term289001.getClass(), "second", (byte) 49);
        setIntField(term289001, term289001.getClass(), "nano", 46400229);
        setField(term288996, term288996.getClass(), "time", term289001);
        setField(term288276, term288276.getClass(), "dateTime", term288996);
        term289006 = new Integer(702866958);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term289006;
        callMethod(klass, "setSkinId", argTypes, term288276, args);
    }

};


