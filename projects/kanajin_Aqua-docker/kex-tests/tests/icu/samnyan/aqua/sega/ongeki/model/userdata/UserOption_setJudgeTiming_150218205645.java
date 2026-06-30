package icu.samnyan.aqua.sega.ongeki.model.userdata;

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
import static icu.samnyan.aqua.sega.ongeki.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;
import java.lang.Integer;

public class UserOption_setJudgeTiming_150218205645 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term329672;
     Object term329974;

    public UserOption_setJudgeTiming_150218205645() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term329678 = new Long(-7717027128782374599L);
        term329672 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption"));
        Object term329674 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term329676 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term329692 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term329693 = newInstance(Class.forName("java.time.LocalDate"));
        Object term329697 = newInstance(Class.forName("java.time.LocalTime"));
        Object term329702 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term329703 = newInstance(Class.forName("java.time.LocalDate"));
        Object term329707 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term329672, term329672.getClass(), "id", 313180953425039013L);
        setLongField(term329674, term329674.getClass(), "id", 3387604025820875803L);
        setLongField(term329676, term329676.getClass(), "id", 2659307987240948116L);
        setField(term329676, term329676.getClass(), "extId", term329678);
        setField(term329676, term329676.getClass(), "luid", "MuTITiXdzE");
        setIntField(term329693, term329693.getClass(), "year", 2012);
        setShortField(term329693, term329693.getClass(), "month", (short) 3);
        setShortField(term329693, term329693.getClass(), "day", (short) 21);
        setField(term329692, term329692.getClass(), "date", term329693);
        setByteField(term329697, term329697.getClass(), "hour", (byte) 12);
        setByteField(term329697, term329697.getClass(), "minute", (byte) 51);
        setByteField(term329697, term329697.getClass(), "second", (byte) 45);
        setIntField(term329697, term329697.getClass(), "nano", 154935437);
        setField(term329692, term329692.getClass(), "time", term329697);
        setField(term329676, term329676.getClass(), "registerTime", term329692);
        setIntField(term329703, term329703.getClass(), "year", 2018);
        setShortField(term329703, term329703.getClass(), "month", (short) 3);
        setShortField(term329703, term329703.getClass(), "day", (short) 27);
        setField(term329702, term329702.getClass(), "date", term329703);
        setByteField(term329707, term329707.getClass(), "hour", (byte) 0);
        setByteField(term329707, term329707.getClass(), "minute", (byte) 22);
        setByteField(term329707, term329707.getClass(), "second", (byte) 59);
        setIntField(term329707, term329707.getClass(), "nano", 148735615);
        setField(term329702, term329702.getClass(), "time", term329707);
        setField(term329676, term329676.getClass(), "accessTime", term329702);
        setField(term329674, term329674.getClass(), "card", term329676);
        setField(term329674, term329674.getClass(), "userName", "sWdaTmtXhp");
        setIntField(term329674, term329674.getClass(), "level", -1346292188);
        setIntField(term329674, term329674.getClass(), "reincarnationNum", -678131933);
        setLongField(term329674, term329674.getClass(), "exp", 360050303569226774L);
        setLongField(term329674, term329674.getClass(), "point", 3735905355377127870L);
        setLongField(term329674, term329674.getClass(), "totalPoint", 1749841888188854836L);
        setIntField(term329674, term329674.getClass(), "playCount", 975637339);
        setIntField(term329674, term329674.getClass(), "jewelCount", -1623660303);
        setIntField(term329674, term329674.getClass(), "totalJewelCount", 56755956);
        setIntField(term329674, term329674.getClass(), "medalCount", -1314899847);
        setIntField(term329674, term329674.getClass(), "playerRating", -888543810);
        setIntField(term329674, term329674.getClass(), "highestRating", -1084206906);
        setIntField(term329674, term329674.getClass(), "battlePoint", -1819445741);
        setIntField(term329674, term329674.getClass(), "bestBattlePoint", -1810043859);
        setIntField(term329674, term329674.getClass(), "overDamageBattlePoint", 1401192135);
        setBooleanField(term329674, term329674.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term329674, term329674.getClass(), "nameplateId", 1201714538);
        setIntField(term329674, term329674.getClass(), "trophyId", -642183946);
        setIntField(term329674, term329674.getClass(), "cardId", 1338802034);
        setIntField(term329674, term329674.getClass(), "characterId", -61980376);
        setIntField(term329674, term329674.getClass(), "characterVoiceNo", 507463127);
        setIntField(term329674, term329674.getClass(), "tabSetting", -455476320);
        setIntField(term329674, term329674.getClass(), "tabSortSetting", 301886967);
        setIntField(term329674, term329674.getClass(), "cardCategorySetting", 1790148819);
        setIntField(term329674, term329674.getClass(), "cardSortSetting", -601874101);
        setIntField(term329674, term329674.getClass(), "rivalScoreCategorySetting", 126724695);
        setIntField(term329674, term329674.getClass(), "playedTutorialBit", 1756205967);
        setIntField(term329674, term329674.getClass(), "firstTutorialCancelNum", -127253041);
        setLongField(term329674, term329674.getClass(), "sumTechHighScore", 4701004261293567399L);
        setLongField(term329674, term329674.getClass(), "sumTechBasicHighScore", 5258422689720773981L);
        setLongField(term329674, term329674.getClass(), "sumTechAdvancedHighScore", -3638403697596157611L);
        setLongField(term329674, term329674.getClass(), "sumTechExpertHighScore", -1178791581932234605L);
        setLongField(term329674, term329674.getClass(), "sumTechMasterHighScore", 470415411205539343L);
        setLongField(term329674, term329674.getClass(), "sumTechLunaticHighScore", -5650971699899803049L);
        setLongField(term329674, term329674.getClass(), "sumBattleHighScore", 7126208212935260775L);
        setLongField(term329674, term329674.getClass(), "sumBattleBasicHighScore", -2245122963528427957L);
        setLongField(term329674, term329674.getClass(), "sumBattleAdvancedHighScore", -7372771300153768325L);
        setLongField(term329674, term329674.getClass(), "sumBattleExpertHighScore", -1812634000049818344L);
        setLongField(term329674, term329674.getClass(), "sumBattleMasterHighScore", 2062386881399206007L);
        setLongField(term329674, term329674.getClass(), "sumBattleLunaticHighScore", -3745037288125610351L);
        setField(term329674, term329674.getClass(), "eventWatchedDate", "zLQQlXGlsd");
        setField(term329674, term329674.getClass(), "cmEventWatchedDate", "vOSNWlxTlR");
        setField(term329674, term329674.getClass(), "firstGameId", "PQCwKYZoCH");
        setField(term329674, term329674.getClass(), "firstRomVersion", "XthVPciJGC");
        setField(term329674, term329674.getClass(), "firstDataVersion", "rdaZirokMr");
        setField(term329674, term329674.getClass(), "firstPlayDate", "fLitMxcrdx");
        setField(term329674, term329674.getClass(), "lastGameId", "boWBVgCJsw");
        setField(term329674, term329674.getClass(), "lastRomVersion", "qhFnceBThW");
        setField(term329674, term329674.getClass(), "lastDataVersion", "jfbgYlZyDS");
        setField(term329674, term329674.getClass(), "compatibleCmVersion", "rzQaRdQpYf");
        setField(term329674, term329674.getClass(), "lastPlayDate", "nyhlHkHJpz");
        setIntField(term329674, term329674.getClass(), "lastPlaceId", -1811207274);
        setField(term329674, term329674.getClass(), "lastPlaceName", "AGrmXERxZu");
        setIntField(term329674, term329674.getClass(), "lastRegionId", 768422554);
        setField(term329674, term329674.getClass(), "lastRegionName", "EaDgZJsRCM");
        setIntField(term329674, term329674.getClass(), "lastAllNetId", 394650643);
        setField(term329674, term329674.getClass(), "lastClientId", "QuoGoiVMdd");
        setIntField(term329674, term329674.getClass(), "lastUsedDeckId", -932679601);
        setIntField(term329674, term329674.getClass(), "lastPlayMusicLevel", -1330421355);
        setIntField(term329674, term329674.getClass(), "lastEmoneyBrand", 1571484497);
        setField(term329672, term329672.getClass(), "user", term329674);
        setIntField(term329672, term329672.getClass(), "optionSet", -206357114);
        setIntField(term329672, term329672.getClass(), "speed", 535792127);
        setIntField(term329672, term329672.getClass(), "mirror", 1312846329);
        setIntField(term329672, term329672.getClass(), "judgeTiming", 1121498182);
        setIntField(term329672, term329672.getClass(), "judgeAdjustment", 382253178);
        setIntField(term329672, term329672.getClass(), "abort", -1183590239);
        setIntField(term329672, term329672.getClass(), "stealthField", -1714250163);
        setIntField(term329672, term329672.getClass(), "tapSound", 1034423507);
        setIntField(term329672, term329672.getClass(), "volGuide", 1679956659);
        setIntField(term329672, term329672.getClass(), "volAll", 55150040);
        setIntField(term329672, term329672.getClass(), "volTap", -1569380298);
        setIntField(term329672, term329672.getClass(), "volCrTap", -618790435);
        setIntField(term329672, term329672.getClass(), "volHold", 2115457033);
        setIntField(term329672, term329672.getClass(), "volSide", -279187388);
        setIntField(term329672, term329672.getClass(), "volFlick", -1821126917);
        setIntField(term329672, term329672.getClass(), "volBell", -1479667968);
        setIntField(term329672, term329672.getClass(), "volEnemy", -344715886);
        setIntField(term329672, term329672.getClass(), "volSkill", 14711246);
        setIntField(term329672, term329672.getClass(), "volDamage", 1011622215);
        setIntField(term329672, term329672.getClass(), "colorField", 968888075);
        setIntField(term329672, term329672.getClass(), "colorLaneBright", -1071381760);
        setIntField(term329672, term329672.getClass(), "colorWallBright", 305620804);
        setIntField(term329672, term329672.getClass(), "colorLane", -826562770);
        setIntField(term329672, term329672.getClass(), "colorSide", 166180782);
        setIntField(term329672, term329672.getClass(), "effectDamage", -1339670970);
        setIntField(term329672, term329672.getClass(), "effectPos", 625124647);
        setIntField(term329672, term329672.getClass(), "judgeDisp", -738711443);
        setIntField(term329672, term329672.getClass(), "judgePos", 720084082);
        setIntField(term329672, term329672.getClass(), "judgeBreak", -2054783);
        setIntField(term329672, term329672.getClass(), "judgeHit", -861698621);
        setIntField(term329672, term329672.getClass(), "platinumBreakDisp", 120558325);
        setIntField(term329672, term329672.getClass(), "judgeCriticalBreak", 879029480);
        setIntField(term329672, term329672.getClass(), "matching", 1662429974);
        setIntField(term329672, term329672.getClass(), "dispPlayerLv", 164482176);
        setIntField(term329672, term329672.getClass(), "dispRating", 1229014442);
        setIntField(term329672, term329672.getClass(), "dispBP", 1721786917);
        setIntField(term329672, term329672.getClass(), "headphone", 173318167);
        term329974 = new Integer(468687480);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term329974;
        callMethod(klass, "setJudgeTiming", argTypes, term329672, args);
    }

};


