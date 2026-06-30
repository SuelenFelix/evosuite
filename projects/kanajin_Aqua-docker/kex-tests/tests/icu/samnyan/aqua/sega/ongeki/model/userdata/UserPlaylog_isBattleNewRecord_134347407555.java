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

public class UserPlaylog_isBattleNewRecord_134347407555 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term215978;

    public UserPlaylog_isBattleNewRecord_134347407555() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term215984 = new Long(-6108006981756732593L);
        term215978 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog"));
        Object term215980 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term215982 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term215998 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term215999 = newInstance(Class.forName("java.time.LocalDate"));
        Object term216003 = newInstance(Class.forName("java.time.LocalTime"));
        Object term216008 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term216009 = newInstance(Class.forName("java.time.LocalDate"));
        Object term216013 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term215978, term215978.getClass(), "id", 8598124661374154993L);
        setLongField(term215980, term215980.getClass(), "id", -4657983727699507915L);
        setLongField(term215982, term215982.getClass(), "id", 8371846874123508864L);
        setField(term215982, term215982.getClass(), "extId", term215984);
        setField(term215982, term215982.getClass(), "luid", "svGVEkynTC");
        setIntField(term215999, term215999.getClass(), "year", 2027);
        setShortField(term215999, term215999.getClass(), "month", (short) 5);
        setShortField(term215999, term215999.getClass(), "day", (short) 9);
        setField(term215998, term215998.getClass(), "date", term215999);
        setByteField(term216003, term216003.getClass(), "hour", (byte) 18);
        setByteField(term216003, term216003.getClass(), "minute", (byte) 17);
        setByteField(term216003, term216003.getClass(), "second", (byte) 45);
        setIntField(term216003, term216003.getClass(), "nano", 184100659);
        setField(term215998, term215998.getClass(), "time", term216003);
        setField(term215982, term215982.getClass(), "registerTime", term215998);
        setIntField(term216009, term216009.getClass(), "year", 2029);
        setShortField(term216009, term216009.getClass(), "month", (short) 7);
        setShortField(term216009, term216009.getClass(), "day", (short) 19);
        setField(term216008, term216008.getClass(), "date", term216009);
        setByteField(term216013, term216013.getClass(), "hour", (byte) 21);
        setByteField(term216013, term216013.getClass(), "minute", (byte) 46);
        setByteField(term216013, term216013.getClass(), "second", (byte) 27);
        setIntField(term216013, term216013.getClass(), "nano", 413909191);
        setField(term216008, term216008.getClass(), "time", term216013);
        setField(term215982, term215982.getClass(), "accessTime", term216008);
        setField(term215980, term215980.getClass(), "card", term215982);
        setField(term215980, term215980.getClass(), "userName", "aBNkBoMFBD");
        setIntField(term215980, term215980.getClass(), "level", 530249699);
        setIntField(term215980, term215980.getClass(), "reincarnationNum", 693000024);
        setLongField(term215980, term215980.getClass(), "exp", 5139914115068593411L);
        setLongField(term215980, term215980.getClass(), "point", -8828375492863660333L);
        setLongField(term215980, term215980.getClass(), "totalPoint", 3829060389754535308L);
        setIntField(term215980, term215980.getClass(), "playCount", -659244791);
        setIntField(term215980, term215980.getClass(), "jewelCount", -1592022320);
        setIntField(term215980, term215980.getClass(), "totalJewelCount", -1743070082);
        setIntField(term215980, term215980.getClass(), "medalCount", -1196577732);
        setIntField(term215980, term215980.getClass(), "playerRating", 658985528);
        setIntField(term215980, term215980.getClass(), "highestRating", -514950354);
        setIntField(term215980, term215980.getClass(), "battlePoint", -1467577794);
        setIntField(term215980, term215980.getClass(), "bestBattlePoint", 1957000422);
        setIntField(term215980, term215980.getClass(), "overDamageBattlePoint", 1521595403);
        setBooleanField(term215980, term215980.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term215980, term215980.getClass(), "nameplateId", -1211596748);
        setIntField(term215980, term215980.getClass(), "trophyId", -607616145);
        setIntField(term215980, term215980.getClass(), "cardId", -1504241847);
        setIntField(term215980, term215980.getClass(), "characterId", -187711145);
        setIntField(term215980, term215980.getClass(), "characterVoiceNo", 132086207);
        setIntField(term215980, term215980.getClass(), "tabSetting", -1371629267);
        setIntField(term215980, term215980.getClass(), "tabSortSetting", 991981146);
        setIntField(term215980, term215980.getClass(), "cardCategorySetting", 1689577386);
        setIntField(term215980, term215980.getClass(), "cardSortSetting", 20929363);
        setIntField(term215980, term215980.getClass(), "rivalScoreCategorySetting", 1997659725);
        setIntField(term215980, term215980.getClass(), "playedTutorialBit", -982053590);
        setIntField(term215980, term215980.getClass(), "firstTutorialCancelNum", -1866750250);
        setLongField(term215980, term215980.getClass(), "sumTechHighScore", -4152905340342113900L);
        setLongField(term215980, term215980.getClass(), "sumTechBasicHighScore", -2320858494141057588L);
        setLongField(term215980, term215980.getClass(), "sumTechAdvancedHighScore", 3671531966262068453L);
        setLongField(term215980, term215980.getClass(), "sumTechExpertHighScore", 8091751543255986624L);
        setLongField(term215980, term215980.getClass(), "sumTechMasterHighScore", -3105437328811671426L);
        setLongField(term215980, term215980.getClass(), "sumTechLunaticHighScore", 4652127938324994599L);
        setLongField(term215980, term215980.getClass(), "sumBattleHighScore", 8066087404848503575L);
        setLongField(term215980, term215980.getClass(), "sumBattleBasicHighScore", -6205406662057862003L);
        setLongField(term215980, term215980.getClass(), "sumBattleAdvancedHighScore", 2812994364572081165L);
        setLongField(term215980, term215980.getClass(), "sumBattleExpertHighScore", -381737772463044732L);
        setLongField(term215980, term215980.getClass(), "sumBattleMasterHighScore", 1022195053841077055L);
        setLongField(term215980, term215980.getClass(), "sumBattleLunaticHighScore", -5735359083132852428L);
        setField(term215980, term215980.getClass(), "eventWatchedDate", "vqWeaGfohT");
        setField(term215980, term215980.getClass(), "cmEventWatchedDate", "yabXWbBRfo");
        setField(term215980, term215980.getClass(), "firstGameId", "IZlNsiBzLl");
        setField(term215980, term215980.getClass(), "firstRomVersion", "cZTgmafbYV");
        setField(term215980, term215980.getClass(), "firstDataVersion", "RLzTlJiyRN");
        setField(term215980, term215980.getClass(), "firstPlayDate", "aDeEhgiUgQ");
        setField(term215980, term215980.getClass(), "lastGameId", "FCqDLvWKzc");
        setField(term215980, term215980.getClass(), "lastRomVersion", "MiydJqGGaE");
        setField(term215980, term215980.getClass(), "lastDataVersion", "ncYBFFKRYX");
        setField(term215980, term215980.getClass(), "compatibleCmVersion", "OtwcFpbHya");
        setField(term215980, term215980.getClass(), "lastPlayDate", "ZQTwlFBqLd");
        setIntField(term215980, term215980.getClass(), "lastPlaceId", 1106745170);
        setField(term215980, term215980.getClass(), "lastPlaceName", "FTSegVMXzZ");
        setIntField(term215980, term215980.getClass(), "lastRegionId", 1163945085);
        setField(term215980, term215980.getClass(), "lastRegionName", "YdclkiqKLw");
        setIntField(term215980, term215980.getClass(), "lastAllNetId", -1127473353);
        setField(term215980, term215980.getClass(), "lastClientId", "HjnANDAraH");
        setIntField(term215980, term215980.getClass(), "lastUsedDeckId", 1804045488);
        setIntField(term215980, term215980.getClass(), "lastPlayMusicLevel", 557148522);
        setIntField(term215980, term215980.getClass(), "lastEmoneyBrand", 1264789417);
        setField(term215978, term215978.getClass(), "user", term215980);
        setIntField(term215978, term215978.getClass(), "sortNumber", -430081538);
        setIntField(term215978, term215978.getClass(), "placeId", -146495211);
        setField(term215978, term215978.getClass(), "placeName", "ArRbkfOXUU");
        setField(term215978, term215978.getClass(), "playDate", "usMwphyYRn");
        setField(term215978, term215978.getClass(), "userPlayDate", "cSIISDBvFn");
        setIntField(term215978, term215978.getClass(), "musicId", 2134103119);
        setIntField(term215978, term215978.getClass(), "level", -8598624);
        setIntField(term215978, term215978.getClass(), "playKind", -1307724844);
        setIntField(term215978, term215978.getClass(), "eventId", -711213523);
        setField(term215978, term215978.getClass(), "eventName", "UeVnwmFLjY");
        setIntField(term215978, term215978.getClass(), "eventPoint", -364820822);
        setIntField(term215978, term215978.getClass(), "playedUserId1", -1698426889);
        setIntField(term215978, term215978.getClass(), "playedUserId2", 229004277);
        setIntField(term215978, term215978.getClass(), "playedUserId3", 1552068851);
        setField(term215978, term215978.getClass(), "playedUserName1", "IIlFHyBACX");
        setField(term215978, term215978.getClass(), "playedUserName2", "KYRCFppeJM");
        setField(term215978, term215978.getClass(), "playedUserName3", "LFMqdKgGfW");
        setIntField(term215978, term215978.getClass(), "playedMusicLevel1", -230286512);
        setIntField(term215978, term215978.getClass(), "playedMusicLevel2", -932766163);
        setIntField(term215978, term215978.getClass(), "playedMusicLevel3", -1954254883);
        setIntField(term215978, term215978.getClass(), "cardId1", 75824628);
        setIntField(term215978, term215978.getClass(), "cardId2", -751408969);
        setIntField(term215978, term215978.getClass(), "cardId3", 1332942351);
        setIntField(term215978, term215978.getClass(), "cardLevel1", 417417686);
        setIntField(term215978, term215978.getClass(), "cardLevel2", -862439850);
        setIntField(term215978, term215978.getClass(), "cardLevel3", -1769155675);
        setIntField(term215978, term215978.getClass(), "cardAttack1", 56458333);
        setIntField(term215978, term215978.getClass(), "cardAttack2", 418235602);
        setIntField(term215978, term215978.getClass(), "cardAttack3", 239913244);
        setIntField(term215978, term215978.getClass(), "bossCharaId", -1013753559);
        setIntField(term215978, term215978.getClass(), "bossLevel", -43814994);
        setIntField(term215978, term215978.getClass(), "bossAttribute", -703544966);
        setIntField(term215978, term215978.getClass(), "clearStatus", -479486809);
        setIntField(term215978, term215978.getClass(), "techScore", 958022606);
        setIntField(term215978, term215978.getClass(), "techScoreRank", -743651440);
        setIntField(term215978, term215978.getClass(), "battleScore", 1996863622);
        setIntField(term215978, term215978.getClass(), "battleScoreRank", 538262655);
        setIntField(term215978, term215978.getClass(), "platinumScore", -661864434);
        setIntField(term215978, term215978.getClass(), "maxCombo", 1633649139);
        setIntField(term215978, term215978.getClass(), "judgeMiss", 865740366);
        setIntField(term215978, term215978.getClass(), "judgeHit", 2055184211);
        setIntField(term215978, term215978.getClass(), "judgeBreak", -178928635);
        setIntField(term215978, term215978.getClass(), "judgeCriticalBreak", -1900928314);
        setIntField(term215978, term215978.getClass(), "rateTap", 1771936673);
        setIntField(term215978, term215978.getClass(), "rateHold", 2143013182);
        setIntField(term215978, term215978.getClass(), "rateFlick", -1417724314);
        setIntField(term215978, term215978.getClass(), "rateSideTap", 399632866);
        setIntField(term215978, term215978.getClass(), "rateSideHold", -2021554219);
        setIntField(term215978, term215978.getClass(), "bellCount", -1413689781);
        setIntField(term215978, term215978.getClass(), "totalBellCount", 815841458);
        setIntField(term215978, term215978.getClass(), "damageCount", 1868301095);
        setIntField(term215978, term215978.getClass(), "overDamage", -194834401);
        setBooleanField(term215978, term215978.getClass(), "isTechNewRecord", true);
        setBooleanField(term215978, term215978.getClass(), "isBattleNewRecord", false);
        setBooleanField(term215978, term215978.getClass(), "isOverDamageNewRecord", false);
        setBooleanField(term215978, term215978.getClass(), "isFullCombo", false);
        setBooleanField(term215978, term215978.getClass(), "isFullBell", true);
        setBooleanField(term215978, term215978.getClass(), "isAllBreak", true);
        setIntField(term215978, term215978.getClass(), "playerRating", 1718483259);
        setIntField(term215978, term215978.getClass(), "battlePoint", 835852454);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isBattleNewRecord", argTypes, term215978, args);
    }

};


