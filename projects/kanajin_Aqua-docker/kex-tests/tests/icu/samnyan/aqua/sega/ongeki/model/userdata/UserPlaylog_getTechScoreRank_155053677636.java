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

public class UserPlaylog_getTechScoreRank_155053677636 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term203970;

    public UserPlaylog_getTechScoreRank_155053677636() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term203976 = new Long(-1526328443223793465L);
        term203970 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog"));
        Object term203972 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term203974 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term203990 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term203991 = newInstance(Class.forName("java.time.LocalDate"));
        Object term203995 = newInstance(Class.forName("java.time.LocalTime"));
        Object term204000 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term204001 = newInstance(Class.forName("java.time.LocalDate"));
        Object term204005 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term203970, term203970.getClass(), "id", 6908669679539387356L);
        setLongField(term203972, term203972.getClass(), "id", -7692588761426354453L);
        setLongField(term203974, term203974.getClass(), "id", 5483033495350683432L);
        setField(term203974, term203974.getClass(), "extId", term203976);
        setField(term203974, term203974.getClass(), "luid", "IrnebOMTZj");
        setIntField(term203991, term203991.getClass(), "year", 2017);
        setShortField(term203991, term203991.getClass(), "month", (short) 9);
        setShortField(term203991, term203991.getClass(), "day", (short) 8);
        setField(term203990, term203990.getClass(), "date", term203991);
        setByteField(term203995, term203995.getClass(), "hour", (byte) 6);
        setByteField(term203995, term203995.getClass(), "minute", (byte) 20);
        setByteField(term203995, term203995.getClass(), "second", (byte) 45);
        setIntField(term203995, term203995.getClass(), "nano", 768981890);
        setField(term203990, term203990.getClass(), "time", term203995);
        setField(term203974, term203974.getClass(), "registerTime", term203990);
        setIntField(term204001, term204001.getClass(), "year", 2024);
        setShortField(term204001, term204001.getClass(), "month", (short) 7);
        setShortField(term204001, term204001.getClass(), "day", (short) 3);
        setField(term204000, term204000.getClass(), "date", term204001);
        setByteField(term204005, term204005.getClass(), "hour", (byte) 8);
        setByteField(term204005, term204005.getClass(), "minute", (byte) 6);
        setByteField(term204005, term204005.getClass(), "second", (byte) 33);
        setIntField(term204005, term204005.getClass(), "nano", 210450276);
        setField(term204000, term204000.getClass(), "time", term204005);
        setField(term203974, term203974.getClass(), "accessTime", term204000);
        setField(term203972, term203972.getClass(), "card", term203974);
        setField(term203972, term203972.getClass(), "userName", "fOfUFbGEpo");
        setIntField(term203972, term203972.getClass(), "level", 1886042366);
        setIntField(term203972, term203972.getClass(), "reincarnationNum", 1750279326);
        setLongField(term203972, term203972.getClass(), "exp", 3342244067405999240L);
        setLongField(term203972, term203972.getClass(), "point", -7298604731354582631L);
        setLongField(term203972, term203972.getClass(), "totalPoint", -8820464091062875709L);
        setIntField(term203972, term203972.getClass(), "playCount", 69628657);
        setIntField(term203972, term203972.getClass(), "jewelCount", -2051929242);
        setIntField(term203972, term203972.getClass(), "totalJewelCount", -1610300223);
        setIntField(term203972, term203972.getClass(), "medalCount", 446623516);
        setIntField(term203972, term203972.getClass(), "playerRating", 1459327378);
        setIntField(term203972, term203972.getClass(), "highestRating", -2025069703);
        setIntField(term203972, term203972.getClass(), "battlePoint", -10565826);
        setIntField(term203972, term203972.getClass(), "bestBattlePoint", -613811757);
        setIntField(term203972, term203972.getClass(), "overDamageBattlePoint", -1533182108);
        setBooleanField(term203972, term203972.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term203972, term203972.getClass(), "nameplateId", -2143828825);
        setIntField(term203972, term203972.getClass(), "trophyId", -1675965095);
        setIntField(term203972, term203972.getClass(), "cardId", -1629158447);
        setIntField(term203972, term203972.getClass(), "characterId", -478026502);
        setIntField(term203972, term203972.getClass(), "characterVoiceNo", -1202054376);
        setIntField(term203972, term203972.getClass(), "tabSetting", 1502227586);
        setIntField(term203972, term203972.getClass(), "tabSortSetting", 1320517174);
        setIntField(term203972, term203972.getClass(), "cardCategorySetting", -1036993603);
        setIntField(term203972, term203972.getClass(), "cardSortSetting", -1696528248);
        setIntField(term203972, term203972.getClass(), "rivalScoreCategorySetting", -1346251427);
        setIntField(term203972, term203972.getClass(), "playedTutorialBit", -821292025);
        setIntField(term203972, term203972.getClass(), "firstTutorialCancelNum", 525638452);
        setLongField(term203972, term203972.getClass(), "sumTechHighScore", -5703762183346952605L);
        setLongField(term203972, term203972.getClass(), "sumTechBasicHighScore", 8657340983102677045L);
        setLongField(term203972, term203972.getClass(), "sumTechAdvancedHighScore", -1863074720646032217L);
        setLongField(term203972, term203972.getClass(), "sumTechExpertHighScore", -8688273580923380979L);
        setLongField(term203972, term203972.getClass(), "sumTechMasterHighScore", 2149110869830089681L);
        setLongField(term203972, term203972.getClass(), "sumTechLunaticHighScore", 2190124280923227151L);
        setLongField(term203972, term203972.getClass(), "sumBattleHighScore", 8770509605736864321L);
        setLongField(term203972, term203972.getClass(), "sumBattleBasicHighScore", 3148571922499562719L);
        setLongField(term203972, term203972.getClass(), "sumBattleAdvancedHighScore", 3261256835924329005L);
        setLongField(term203972, term203972.getClass(), "sumBattleExpertHighScore", -1379458118352377729L);
        setLongField(term203972, term203972.getClass(), "sumBattleMasterHighScore", -4957808992481568572L);
        setLongField(term203972, term203972.getClass(), "sumBattleLunaticHighScore", -7679615625814779626L);
        setField(term203972, term203972.getClass(), "eventWatchedDate", "EKjLEMismY");
        setField(term203972, term203972.getClass(), "cmEventWatchedDate", "izJjfCpyvk");
        setField(term203972, term203972.getClass(), "firstGameId", "twYgiufVKW");
        setField(term203972, term203972.getClass(), "firstRomVersion", "GUllDkCfSj");
        setField(term203972, term203972.getClass(), "firstDataVersion", "mqvlpDaexC");
        setField(term203972, term203972.getClass(), "firstPlayDate", "mhBCscYMix");
        setField(term203972, term203972.getClass(), "lastGameId", "fRCOtyFEqt");
        setField(term203972, term203972.getClass(), "lastRomVersion", "bhCOQHIHSX");
        setField(term203972, term203972.getClass(), "lastDataVersion", "zelYaUHqcj");
        setField(term203972, term203972.getClass(), "compatibleCmVersion", "aauWfWqtmH");
        setField(term203972, term203972.getClass(), "lastPlayDate", "EIcXoVcmoe");
        setIntField(term203972, term203972.getClass(), "lastPlaceId", -1387240902);
        setField(term203972, term203972.getClass(), "lastPlaceName", "vwvtAsjWYw");
        setIntField(term203972, term203972.getClass(), "lastRegionId", 1456385188);
        setField(term203972, term203972.getClass(), "lastRegionName", "ELjGrPDZKe");
        setIntField(term203972, term203972.getClass(), "lastAllNetId", -1778689215);
        setField(term203972, term203972.getClass(), "lastClientId", "MRdGOIOvoM");
        setIntField(term203972, term203972.getClass(), "lastUsedDeckId", -215214458);
        setIntField(term203972, term203972.getClass(), "lastPlayMusicLevel", 2088442412);
        setIntField(term203972, term203972.getClass(), "lastEmoneyBrand", 1432096332);
        setField(term203970, term203970.getClass(), "user", term203972);
        setIntField(term203970, term203970.getClass(), "sortNumber", -1621097679);
        setIntField(term203970, term203970.getClass(), "placeId", 1349840444);
        setField(term203970, term203970.getClass(), "placeName", "CrDChgXZIs");
        setField(term203970, term203970.getClass(), "playDate", "spKctYEaCy");
        setField(term203970, term203970.getClass(), "userPlayDate", "XldxICpJKb");
        setIntField(term203970, term203970.getClass(), "musicId", 671975307);
        setIntField(term203970, term203970.getClass(), "level", 178052838);
        setIntField(term203970, term203970.getClass(), "playKind", -890432510);
        setIntField(term203970, term203970.getClass(), "eventId", 1697782346);
        setField(term203970, term203970.getClass(), "eventName", "auwdUwJreL");
        setIntField(term203970, term203970.getClass(), "eventPoint", 1469006441);
        setIntField(term203970, term203970.getClass(), "playedUserId1", -848703672);
        setIntField(term203970, term203970.getClass(), "playedUserId2", 1610879895);
        setIntField(term203970, term203970.getClass(), "playedUserId3", -1707478961);
        setField(term203970, term203970.getClass(), "playedUserName1", "ubCTLBFDbT");
        setField(term203970, term203970.getClass(), "playedUserName2", "lmjJUxaoYd");
        setField(term203970, term203970.getClass(), "playedUserName3", "yvsgNBCrWW");
        setIntField(term203970, term203970.getClass(), "playedMusicLevel1", -1627748692);
        setIntField(term203970, term203970.getClass(), "playedMusicLevel2", -1802652052);
        setIntField(term203970, term203970.getClass(), "playedMusicLevel3", -450223205);
        setIntField(term203970, term203970.getClass(), "cardId1", -1685460453);
        setIntField(term203970, term203970.getClass(), "cardId2", -932031927);
        setIntField(term203970, term203970.getClass(), "cardId3", -396155497);
        setIntField(term203970, term203970.getClass(), "cardLevel1", 1550347477);
        setIntField(term203970, term203970.getClass(), "cardLevel2", 1999753330);
        setIntField(term203970, term203970.getClass(), "cardLevel3", -1417694542);
        setIntField(term203970, term203970.getClass(), "cardAttack1", -1703634243);
        setIntField(term203970, term203970.getClass(), "cardAttack2", -1946719296);
        setIntField(term203970, term203970.getClass(), "cardAttack3", 1702907407);
        setIntField(term203970, term203970.getClass(), "bossCharaId", 1943139725);
        setIntField(term203970, term203970.getClass(), "bossLevel", -1895631581);
        setIntField(term203970, term203970.getClass(), "bossAttribute", 1484386906);
        setIntField(term203970, term203970.getClass(), "clearStatus", -1086902549);
        setIntField(term203970, term203970.getClass(), "techScore", -1325092699);
        setIntField(term203970, term203970.getClass(), "techScoreRank", 1282150470);
        setIntField(term203970, term203970.getClass(), "battleScore", -2063207620);
        setIntField(term203970, term203970.getClass(), "battleScoreRank", 908971966);
        setIntField(term203970, term203970.getClass(), "platinumScore", -1448487643);
        setIntField(term203970, term203970.getClass(), "maxCombo", 799385851);
        setIntField(term203970, term203970.getClass(), "judgeMiss", -360289814);
        setIntField(term203970, term203970.getClass(), "judgeHit", 1714192838);
        setIntField(term203970, term203970.getClass(), "judgeBreak", 352666115);
        setIntField(term203970, term203970.getClass(), "judgeCriticalBreak", -1583419177);
        setIntField(term203970, term203970.getClass(), "rateTap", 1961030764);
        setIntField(term203970, term203970.getClass(), "rateHold", 523495110);
        setIntField(term203970, term203970.getClass(), "rateFlick", 600476089);
        setIntField(term203970, term203970.getClass(), "rateSideTap", -1449298992);
        setIntField(term203970, term203970.getClass(), "rateSideHold", -703663587);
        setIntField(term203970, term203970.getClass(), "bellCount", 2081392977);
        setIntField(term203970, term203970.getClass(), "totalBellCount", 671407930);
        setIntField(term203970, term203970.getClass(), "damageCount", -758107101);
        setIntField(term203970, term203970.getClass(), "overDamage", -555009086);
        setBooleanField(term203970, term203970.getClass(), "isTechNewRecord", true);
        setBooleanField(term203970, term203970.getClass(), "isBattleNewRecord", true);
        setBooleanField(term203970, term203970.getClass(), "isOverDamageNewRecord", false);
        setBooleanField(term203970, term203970.getClass(), "isFullCombo", true);
        setBooleanField(term203970, term203970.getClass(), "isFullBell", false);
        setBooleanField(term203970, term203970.getClass(), "isAllBreak", true);
        setIntField(term203970, term203970.getClass(), "playerRating", -1874643641);
        setIntField(term203970, term203970.getClass(), "battlePoint", -228827613);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTechScoreRank", argTypes, term203970, args);
    }

};


