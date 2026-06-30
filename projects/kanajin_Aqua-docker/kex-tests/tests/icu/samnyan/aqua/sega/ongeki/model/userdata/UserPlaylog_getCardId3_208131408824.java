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

public class UserPlaylog_getCardId3_208131408824 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term196386;

    public UserPlaylog_getCardId3_208131408824() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term196392 = new Long(1278107327214302894L);
        term196386 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog"));
        Object term196388 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term196390 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term196406 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term196407 = newInstance(Class.forName("java.time.LocalDate"));
        Object term196411 = newInstance(Class.forName("java.time.LocalTime"));
        Object term196416 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term196417 = newInstance(Class.forName("java.time.LocalDate"));
        Object term196421 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term196386, term196386.getClass(), "id", -545137129115486502L);
        setLongField(term196388, term196388.getClass(), "id", 4166553518909175990L);
        setLongField(term196390, term196390.getClass(), "id", 1654276301502617595L);
        setField(term196390, term196390.getClass(), "extId", term196392);
        setField(term196390, term196390.getClass(), "luid", "SIrxSOacpa");
        setIntField(term196407, term196407.getClass(), "year", 2011);
        setShortField(term196407, term196407.getClass(), "month", (short) 12);
        setShortField(term196407, term196407.getClass(), "day", (short) 6);
        setField(term196406, term196406.getClass(), "date", term196407);
        setByteField(term196411, term196411.getClass(), "hour", (byte) 21);
        setByteField(term196411, term196411.getClass(), "minute", (byte) 3);
        setByteField(term196411, term196411.getClass(), "second", (byte) 28);
        setIntField(term196411, term196411.getClass(), "nano", 650612376);
        setField(term196406, term196406.getClass(), "time", term196411);
        setField(term196390, term196390.getClass(), "registerTime", term196406);
        setIntField(term196417, term196417.getClass(), "year", 2025);
        setShortField(term196417, term196417.getClass(), "month", (short) 1);
        setShortField(term196417, term196417.getClass(), "day", (short) 2);
        setField(term196416, term196416.getClass(), "date", term196417);
        setByteField(term196421, term196421.getClass(), "hour", (byte) 12);
        setByteField(term196421, term196421.getClass(), "minute", (byte) 18);
        setByteField(term196421, term196421.getClass(), "second", (byte) 4);
        setIntField(term196421, term196421.getClass(), "nano", 249732001);
        setField(term196416, term196416.getClass(), "time", term196421);
        setField(term196390, term196390.getClass(), "accessTime", term196416);
        setField(term196388, term196388.getClass(), "card", term196390);
        setField(term196388, term196388.getClass(), "userName", "xMPmjpkCtD");
        setIntField(term196388, term196388.getClass(), "level", 2043358189);
        setIntField(term196388, term196388.getClass(), "reincarnationNum", 1222446497);
        setLongField(term196388, term196388.getClass(), "exp", 8338369120556895460L);
        setLongField(term196388, term196388.getClass(), "point", 7154184307925982828L);
        setLongField(term196388, term196388.getClass(), "totalPoint", -5207730813547288172L);
        setIntField(term196388, term196388.getClass(), "playCount", 1143101638);
        setIntField(term196388, term196388.getClass(), "jewelCount", 847829222);
        setIntField(term196388, term196388.getClass(), "totalJewelCount", -1549345951);
        setIntField(term196388, term196388.getClass(), "medalCount", 120466526);
        setIntField(term196388, term196388.getClass(), "playerRating", 194321953);
        setIntField(term196388, term196388.getClass(), "highestRating", -1560488637);
        setIntField(term196388, term196388.getClass(), "battlePoint", -186965795);
        setIntField(term196388, term196388.getClass(), "bestBattlePoint", 1888098393);
        setIntField(term196388, term196388.getClass(), "overDamageBattlePoint", 902896185);
        setBooleanField(term196388, term196388.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term196388, term196388.getClass(), "nameplateId", -1788613904);
        setIntField(term196388, term196388.getClass(), "trophyId", 1060985275);
        setIntField(term196388, term196388.getClass(), "cardId", 2096741709);
        setIntField(term196388, term196388.getClass(), "characterId", 203201648);
        setIntField(term196388, term196388.getClass(), "characterVoiceNo", 1395361336);
        setIntField(term196388, term196388.getClass(), "tabSetting", -1646830507);
        setIntField(term196388, term196388.getClass(), "tabSortSetting", -1166739277);
        setIntField(term196388, term196388.getClass(), "cardCategorySetting", 257262317);
        setIntField(term196388, term196388.getClass(), "cardSortSetting", -2085894102);
        setIntField(term196388, term196388.getClass(), "rivalScoreCategorySetting", 1015570852);
        setIntField(term196388, term196388.getClass(), "playedTutorialBit", 2038394011);
        setIntField(term196388, term196388.getClass(), "firstTutorialCancelNum", 261191400);
        setLongField(term196388, term196388.getClass(), "sumTechHighScore", -510937684670985529L);
        setLongField(term196388, term196388.getClass(), "sumTechBasicHighScore", 1192407558484496588L);
        setLongField(term196388, term196388.getClass(), "sumTechAdvancedHighScore", 8625975904896496353L);
        setLongField(term196388, term196388.getClass(), "sumTechExpertHighScore", 6135307896569200631L);
        setLongField(term196388, term196388.getClass(), "sumTechMasterHighScore", 1031054677094806315L);
        setLongField(term196388, term196388.getClass(), "sumTechLunaticHighScore", -3656817367531185688L);
        setLongField(term196388, term196388.getClass(), "sumBattleHighScore", -3765180286128614822L);
        setLongField(term196388, term196388.getClass(), "sumBattleBasicHighScore", 6084086533039418654L);
        setLongField(term196388, term196388.getClass(), "sumBattleAdvancedHighScore", -8794861785844729014L);
        setLongField(term196388, term196388.getClass(), "sumBattleExpertHighScore", 3452505587260283465L);
        setLongField(term196388, term196388.getClass(), "sumBattleMasterHighScore", 2873446169751400735L);
        setLongField(term196388, term196388.getClass(), "sumBattleLunaticHighScore", -5415998181117845748L);
        setField(term196388, term196388.getClass(), "eventWatchedDate", "YGhSawJoTE");
        setField(term196388, term196388.getClass(), "cmEventWatchedDate", "AGCkqlfRlT");
        setField(term196388, term196388.getClass(), "firstGameId", "FtACxNMFtP");
        setField(term196388, term196388.getClass(), "firstRomVersion", "NulMLxVDkW");
        setField(term196388, term196388.getClass(), "firstDataVersion", "byLyhPdHMc");
        setField(term196388, term196388.getClass(), "firstPlayDate", "rHYvAUloGS");
        setField(term196388, term196388.getClass(), "lastGameId", "SsxScQXyGY");
        setField(term196388, term196388.getClass(), "lastRomVersion", "WKImQJKciy");
        setField(term196388, term196388.getClass(), "lastDataVersion", "zFxenstHzS");
        setField(term196388, term196388.getClass(), "compatibleCmVersion", "bgMqDcjsLV");
        setField(term196388, term196388.getClass(), "lastPlayDate", "zLEZEALrtb");
        setIntField(term196388, term196388.getClass(), "lastPlaceId", -1204402292);
        setField(term196388, term196388.getClass(), "lastPlaceName", "fYrFVWJxMv");
        setIntField(term196388, term196388.getClass(), "lastRegionId", -1265081046);
        setField(term196388, term196388.getClass(), "lastRegionName", "nctbaYsHdQ");
        setIntField(term196388, term196388.getClass(), "lastAllNetId", -1103156289);
        setField(term196388, term196388.getClass(), "lastClientId", "RejSdSVgkk");
        setIntField(term196388, term196388.getClass(), "lastUsedDeckId", 734996772);
        setIntField(term196388, term196388.getClass(), "lastPlayMusicLevel", -929338097);
        setIntField(term196388, term196388.getClass(), "lastEmoneyBrand", 1514610449);
        setField(term196386, term196386.getClass(), "user", term196388);
        setIntField(term196386, term196386.getClass(), "sortNumber", -1941335339);
        setIntField(term196386, term196386.getClass(), "placeId", 1423987389);
        setField(term196386, term196386.getClass(), "placeName", "nhcRjrlhrI");
        setField(term196386, term196386.getClass(), "playDate", "tjxSuDIeTM");
        setField(term196386, term196386.getClass(), "userPlayDate", "daQBUXyGRt");
        setIntField(term196386, term196386.getClass(), "musicId", 2049760964);
        setIntField(term196386, term196386.getClass(), "level", 743308436);
        setIntField(term196386, term196386.getClass(), "playKind", 1515447076);
        setIntField(term196386, term196386.getClass(), "eventId", 317488675);
        setField(term196386, term196386.getClass(), "eventName", "TUbAuzVZQV");
        setIntField(term196386, term196386.getClass(), "eventPoint", -524898610);
        setIntField(term196386, term196386.getClass(), "playedUserId1", 601799326);
        setIntField(term196386, term196386.getClass(), "playedUserId2", -1480953254);
        setIntField(term196386, term196386.getClass(), "playedUserId3", -1805067162);
        setField(term196386, term196386.getClass(), "playedUserName1", "EkQvxsYMfN");
        setField(term196386, term196386.getClass(), "playedUserName2", "pmEgYqGmTc");
        setField(term196386, term196386.getClass(), "playedUserName3", "tQFzyzdTDx");
        setIntField(term196386, term196386.getClass(), "playedMusicLevel1", -95403687);
        setIntField(term196386, term196386.getClass(), "playedMusicLevel2", -803305808);
        setIntField(term196386, term196386.getClass(), "playedMusicLevel3", -643136612);
        setIntField(term196386, term196386.getClass(), "cardId1", -396252493);
        setIntField(term196386, term196386.getClass(), "cardId2", 2139168202);
        setIntField(term196386, term196386.getClass(), "cardId3", -38286841);
        setIntField(term196386, term196386.getClass(), "cardLevel1", 233315805);
        setIntField(term196386, term196386.getClass(), "cardLevel2", -390730722);
        setIntField(term196386, term196386.getClass(), "cardLevel3", -2142953673);
        setIntField(term196386, term196386.getClass(), "cardAttack1", -1743060227);
        setIntField(term196386, term196386.getClass(), "cardAttack2", 1726641010);
        setIntField(term196386, term196386.getClass(), "cardAttack3", -72451167);
        setIntField(term196386, term196386.getClass(), "bossCharaId", -1623279591);
        setIntField(term196386, term196386.getClass(), "bossLevel", -2002169681);
        setIntField(term196386, term196386.getClass(), "bossAttribute", 1033809638);
        setIntField(term196386, term196386.getClass(), "clearStatus", -211436956);
        setIntField(term196386, term196386.getClass(), "techScore", -165855936);
        setIntField(term196386, term196386.getClass(), "techScoreRank", -1903586081);
        setIntField(term196386, term196386.getClass(), "battleScore", 2043296011);
        setIntField(term196386, term196386.getClass(), "battleScoreRank", -318415298);
        setIntField(term196386, term196386.getClass(), "platinumScore", -2077725690);
        setIntField(term196386, term196386.getClass(), "maxCombo", 2056474652);
        setIntField(term196386, term196386.getClass(), "judgeMiss", 1073925201);
        setIntField(term196386, term196386.getClass(), "judgeHit", -298572677);
        setIntField(term196386, term196386.getClass(), "judgeBreak", -1992187961);
        setIntField(term196386, term196386.getClass(), "judgeCriticalBreak", -473392096);
        setIntField(term196386, term196386.getClass(), "rateTap", -322705062);
        setIntField(term196386, term196386.getClass(), "rateHold", -463115041);
        setIntField(term196386, term196386.getClass(), "rateFlick", 532572816);
        setIntField(term196386, term196386.getClass(), "rateSideTap", -326440840);
        setIntField(term196386, term196386.getClass(), "rateSideHold", -1936817971);
        setIntField(term196386, term196386.getClass(), "bellCount", -1537670934);
        setIntField(term196386, term196386.getClass(), "totalBellCount", 2106033430);
        setIntField(term196386, term196386.getClass(), "damageCount", -1790157462);
        setIntField(term196386, term196386.getClass(), "overDamage", 1383655017);
        setBooleanField(term196386, term196386.getClass(), "isTechNewRecord", true);
        setBooleanField(term196386, term196386.getClass(), "isBattleNewRecord", false);
        setBooleanField(term196386, term196386.getClass(), "isOverDamageNewRecord", true);
        setBooleanField(term196386, term196386.getClass(), "isFullCombo", true);
        setBooleanField(term196386, term196386.getClass(), "isFullBell", false);
        setBooleanField(term196386, term196386.getClass(), "isAllBreak", false);
        setIntField(term196386, term196386.getClass(), "playerRating", 674859870);
        setIntField(term196386, term196386.getClass(), "battlePoint", 1814186472);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCardId3", argTypes, term196386, args);
    }

};


