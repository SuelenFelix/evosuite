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

public class UserPlaylog_getCardAttack2_204245194229 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term199546;

    public UserPlaylog_getCardAttack2_204245194229() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term199552 = new Long(753095050088595263L);
        term199546 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog"));
        Object term199548 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term199550 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term199566 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term199567 = newInstance(Class.forName("java.time.LocalDate"));
        Object term199571 = newInstance(Class.forName("java.time.LocalTime"));
        Object term199576 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term199577 = newInstance(Class.forName("java.time.LocalDate"));
        Object term199581 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term199546, term199546.getClass(), "id", 8360361375556347622L);
        setLongField(term199548, term199548.getClass(), "id", 2239581449985563678L);
        setLongField(term199550, term199550.getClass(), "id", 2240412885678765814L);
        setField(term199550, term199550.getClass(), "extId", term199552);
        setField(term199550, term199550.getClass(), "luid", "NGZdGZFMkB");
        setIntField(term199567, term199567.getClass(), "year", 2014);
        setShortField(term199567, term199567.getClass(), "month", (short) 12);
        setShortField(term199567, term199567.getClass(), "day", (short) 12);
        setField(term199566, term199566.getClass(), "date", term199567);
        setByteField(term199571, term199571.getClass(), "hour", (byte) 8);
        setByteField(term199571, term199571.getClass(), "minute", (byte) 44);
        setByteField(term199571, term199571.getClass(), "second", (byte) 19);
        setIntField(term199571, term199571.getClass(), "nano", 16834354);
        setField(term199566, term199566.getClass(), "time", term199571);
        setField(term199550, term199550.getClass(), "registerTime", term199566);
        setIntField(term199577, term199577.getClass(), "year", 2012);
        setShortField(term199577, term199577.getClass(), "month", (short) 11);
        setShortField(term199577, term199577.getClass(), "day", (short) 5);
        setField(term199576, term199576.getClass(), "date", term199577);
        setByteField(term199581, term199581.getClass(), "hour", (byte) 16);
        setByteField(term199581, term199581.getClass(), "minute", (byte) 51);
        setByteField(term199581, term199581.getClass(), "second", (byte) 52);
        setIntField(term199581, term199581.getClass(), "nano", 794474514);
        setField(term199576, term199576.getClass(), "time", term199581);
        setField(term199550, term199550.getClass(), "accessTime", term199576);
        setField(term199548, term199548.getClass(), "card", term199550);
        setField(term199548, term199548.getClass(), "userName", "YVpPEyJHMG");
        setIntField(term199548, term199548.getClass(), "level", -1293096528);
        setIntField(term199548, term199548.getClass(), "reincarnationNum", -50374025);
        setLongField(term199548, term199548.getClass(), "exp", 9061850626649390314L);
        setLongField(term199548, term199548.getClass(), "point", -6504788176054122914L);
        setLongField(term199548, term199548.getClass(), "totalPoint", 5809510607542954371L);
        setIntField(term199548, term199548.getClass(), "playCount", -506796467);
        setIntField(term199548, term199548.getClass(), "jewelCount", -1497561160);
        setIntField(term199548, term199548.getClass(), "totalJewelCount", -1274280051);
        setIntField(term199548, term199548.getClass(), "medalCount", -2108798746);
        setIntField(term199548, term199548.getClass(), "playerRating", 479017858);
        setIntField(term199548, term199548.getClass(), "highestRating", 7613516);
        setIntField(term199548, term199548.getClass(), "battlePoint", -305118788);
        setIntField(term199548, term199548.getClass(), "bestBattlePoint", 2114397202);
        setIntField(term199548, term199548.getClass(), "overDamageBattlePoint", 1829059518);
        setBooleanField(term199548, term199548.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term199548, term199548.getClass(), "nameplateId", -451555413);
        setIntField(term199548, term199548.getClass(), "trophyId", 752319253);
        setIntField(term199548, term199548.getClass(), "cardId", -1276139327);
        setIntField(term199548, term199548.getClass(), "characterId", 1209458805);
        setIntField(term199548, term199548.getClass(), "characterVoiceNo", -2118940919);
        setIntField(term199548, term199548.getClass(), "tabSetting", 1122177418);
        setIntField(term199548, term199548.getClass(), "tabSortSetting", 2016777060);
        setIntField(term199548, term199548.getClass(), "cardCategorySetting", 1071294304);
        setIntField(term199548, term199548.getClass(), "cardSortSetting", -292309);
        setIntField(term199548, term199548.getClass(), "rivalScoreCategorySetting", -1610527348);
        setIntField(term199548, term199548.getClass(), "playedTutorialBit", -2007571028);
        setIntField(term199548, term199548.getClass(), "firstTutorialCancelNum", -1988744576);
        setLongField(term199548, term199548.getClass(), "sumTechHighScore", -398124435773483729L);
        setLongField(term199548, term199548.getClass(), "sumTechBasicHighScore", -3947402645604057207L);
        setLongField(term199548, term199548.getClass(), "sumTechAdvancedHighScore", -1184230244221177148L);
        setLongField(term199548, term199548.getClass(), "sumTechExpertHighScore", -1109718382523354574L);
        setLongField(term199548, term199548.getClass(), "sumTechMasterHighScore", -6560774889222308753L);
        setLongField(term199548, term199548.getClass(), "sumTechLunaticHighScore", -6318216268001746034L);
        setLongField(term199548, term199548.getClass(), "sumBattleHighScore", 5701476000199713365L);
        setLongField(term199548, term199548.getClass(), "sumBattleBasicHighScore", -4877304396721271278L);
        setLongField(term199548, term199548.getClass(), "sumBattleAdvancedHighScore", 8371073346692060822L);
        setLongField(term199548, term199548.getClass(), "sumBattleExpertHighScore", -376589131619220909L);
        setLongField(term199548, term199548.getClass(), "sumBattleMasterHighScore", 2796621250659977904L);
        setLongField(term199548, term199548.getClass(), "sumBattleLunaticHighScore", -433116873991783151L);
        setField(term199548, term199548.getClass(), "eventWatchedDate", "msJZLOQXdn");
        setField(term199548, term199548.getClass(), "cmEventWatchedDate", "xSzkQnpniw");
        setField(term199548, term199548.getClass(), "firstGameId", "ZavNLUnxAM");
        setField(term199548, term199548.getClass(), "firstRomVersion", "PRWGbTHeCZ");
        setField(term199548, term199548.getClass(), "firstDataVersion", "rQyRjKpYAl");
        setField(term199548, term199548.getClass(), "firstPlayDate", "BzpLtOjekg");
        setField(term199548, term199548.getClass(), "lastGameId", "nintxVDHsE");
        setField(term199548, term199548.getClass(), "lastRomVersion", "xshvvpVuIr");
        setField(term199548, term199548.getClass(), "lastDataVersion", "YbAQojaNEs");
        setField(term199548, term199548.getClass(), "compatibleCmVersion", "LbypvZviib");
        setField(term199548, term199548.getClass(), "lastPlayDate", "mQaMWxZbut");
        setIntField(term199548, term199548.getClass(), "lastPlaceId", -1212873450);
        setField(term199548, term199548.getClass(), "lastPlaceName", "bdcsoUTcvf");
        setIntField(term199548, term199548.getClass(), "lastRegionId", 2144592813);
        setField(term199548, term199548.getClass(), "lastRegionName", "DDDxtakFvE");
        setIntField(term199548, term199548.getClass(), "lastAllNetId", 1708159330);
        setField(term199548, term199548.getClass(), "lastClientId", "xMpekGjaKa");
        setIntField(term199548, term199548.getClass(), "lastUsedDeckId", 1033352289);
        setIntField(term199548, term199548.getClass(), "lastPlayMusicLevel", 1363366152);
        setIntField(term199548, term199548.getClass(), "lastEmoneyBrand", -1718981498);
        setField(term199546, term199546.getClass(), "user", term199548);
        setIntField(term199546, term199546.getClass(), "sortNumber", -1985364873);
        setIntField(term199546, term199546.getClass(), "placeId", -1805626205);
        setField(term199546, term199546.getClass(), "placeName", "lnroitmiAA");
        setField(term199546, term199546.getClass(), "playDate", "bFTGCDAnNF");
        setField(term199546, term199546.getClass(), "userPlayDate", "CMqxKqrJQY");
        setIntField(term199546, term199546.getClass(), "musicId", -126924629);
        setIntField(term199546, term199546.getClass(), "level", 1496446682);
        setIntField(term199546, term199546.getClass(), "playKind", 970101338);
        setIntField(term199546, term199546.getClass(), "eventId", -1606666058);
        setField(term199546, term199546.getClass(), "eventName", "bYSZOavJQQ");
        setIntField(term199546, term199546.getClass(), "eventPoint", 385166216);
        setIntField(term199546, term199546.getClass(), "playedUserId1", 258545659);
        setIntField(term199546, term199546.getClass(), "playedUserId2", 1941427849);
        setIntField(term199546, term199546.getClass(), "playedUserId3", 1558269156);
        setField(term199546, term199546.getClass(), "playedUserName1", "ZxOXRuKpMx");
        setField(term199546, term199546.getClass(), "playedUserName2", "vCcKCEDJQu");
        setField(term199546, term199546.getClass(), "playedUserName3", "RuHnBNHrCE");
        setIntField(term199546, term199546.getClass(), "playedMusicLevel1", 1665713337);
        setIntField(term199546, term199546.getClass(), "playedMusicLevel2", 999956076);
        setIntField(term199546, term199546.getClass(), "playedMusicLevel3", -1212519317);
        setIntField(term199546, term199546.getClass(), "cardId1", -1264031340);
        setIntField(term199546, term199546.getClass(), "cardId2", -118961950);
        setIntField(term199546, term199546.getClass(), "cardId3", 47401671);
        setIntField(term199546, term199546.getClass(), "cardLevel1", 277629019);
        setIntField(term199546, term199546.getClass(), "cardLevel2", 1458933964);
        setIntField(term199546, term199546.getClass(), "cardLevel3", 2008391522);
        setIntField(term199546, term199546.getClass(), "cardAttack1", 342831841);
        setIntField(term199546, term199546.getClass(), "cardAttack2", 1428487687);
        setIntField(term199546, term199546.getClass(), "cardAttack3", -1834483721);
        setIntField(term199546, term199546.getClass(), "bossCharaId", 240061124);
        setIntField(term199546, term199546.getClass(), "bossLevel", 473805611);
        setIntField(term199546, term199546.getClass(), "bossAttribute", -851419141);
        setIntField(term199546, term199546.getClass(), "clearStatus", -1747772952);
        setIntField(term199546, term199546.getClass(), "techScore", -876649349);
        setIntField(term199546, term199546.getClass(), "techScoreRank", -2113924518);
        setIntField(term199546, term199546.getClass(), "battleScore", 1416561784);
        setIntField(term199546, term199546.getClass(), "battleScoreRank", -2003997410);
        setIntField(term199546, term199546.getClass(), "platinumScore", -2047713330);
        setIntField(term199546, term199546.getClass(), "maxCombo", -1911473334);
        setIntField(term199546, term199546.getClass(), "judgeMiss", 803849098);
        setIntField(term199546, term199546.getClass(), "judgeHit", 431184457);
        setIntField(term199546, term199546.getClass(), "judgeBreak", 669026321);
        setIntField(term199546, term199546.getClass(), "judgeCriticalBreak", 893202719);
        setIntField(term199546, term199546.getClass(), "rateTap", -1261010343);
        setIntField(term199546, term199546.getClass(), "rateHold", 1984896780);
        setIntField(term199546, term199546.getClass(), "rateFlick", -482873835);
        setIntField(term199546, term199546.getClass(), "rateSideTap", 1213800877);
        setIntField(term199546, term199546.getClass(), "rateSideHold", -658645058);
        setIntField(term199546, term199546.getClass(), "bellCount", -349157116);
        setIntField(term199546, term199546.getClass(), "totalBellCount", -790775583);
        setIntField(term199546, term199546.getClass(), "damageCount", -1319126503);
        setIntField(term199546, term199546.getClass(), "overDamage", -371812839);
        setBooleanField(term199546, term199546.getClass(), "isTechNewRecord", true);
        setBooleanField(term199546, term199546.getClass(), "isBattleNewRecord", false);
        setBooleanField(term199546, term199546.getClass(), "isOverDamageNewRecord", true);
        setBooleanField(term199546, term199546.getClass(), "isFullCombo", false);
        setBooleanField(term199546, term199546.getClass(), "isFullBell", false);
        setBooleanField(term199546, term199546.getClass(), "isAllBreak", false);
        setIntField(term199546, term199546.getClass(), "playerRating", 542692617);
        setIntField(term199546, term199546.getClass(), "battlePoint", 959155617);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCardAttack2", argTypes, term199546, args);
    }

};


