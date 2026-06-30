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

public class UserPlaylog_setPlayedUserName3_95007924980 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term232355;

    public UserPlaylog_setPlayedUserName3_95007924980() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term232361 = new Long(-6399462725251497844L);
        term232355 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog"));
        Object term232357 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term232359 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term232375 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term232376 = newInstance(Class.forName("java.time.LocalDate"));
        Object term232380 = newInstance(Class.forName("java.time.LocalTime"));
        Object term232385 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term232386 = newInstance(Class.forName("java.time.LocalDate"));
        Object term232390 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term232355, term232355.getClass(), "id", 6480775153663346038L);
        setLongField(term232357, term232357.getClass(), "id", -1343518427891203414L);
        setLongField(term232359, term232359.getClass(), "id", 968043942193261455L);
        setField(term232359, term232359.getClass(), "extId", term232361);
        setField(term232359, term232359.getClass(), "luid", "wNfCoECSdJ");
        setIntField(term232376, term232376.getClass(), "year", 2024);
        setShortField(term232376, term232376.getClass(), "month", (short) 1);
        setShortField(term232376, term232376.getClass(), "day", (short) 2);
        setField(term232375, term232375.getClass(), "date", term232376);
        setByteField(term232380, term232380.getClass(), "hour", (byte) 11);
        setByteField(term232380, term232380.getClass(), "minute", (byte) 57);
        setByteField(term232380, term232380.getClass(), "second", (byte) 11);
        setIntField(term232380, term232380.getClass(), "nano", 372467179);
        setField(term232375, term232375.getClass(), "time", term232380);
        setField(term232359, term232359.getClass(), "registerTime", term232375);
        setIntField(term232386, term232386.getClass(), "year", 2027);
        setShortField(term232386, term232386.getClass(), "month", (short) 8);
        setShortField(term232386, term232386.getClass(), "day", (short) 9);
        setField(term232385, term232385.getClass(), "date", term232386);
        setByteField(term232390, term232390.getClass(), "hour", (byte) 20);
        setByteField(term232390, term232390.getClass(), "minute", (byte) 47);
        setByteField(term232390, term232390.getClass(), "second", (byte) 18);
        setIntField(term232390, term232390.getClass(), "nano", 296781163);
        setField(term232385, term232385.getClass(), "time", term232390);
        setField(term232359, term232359.getClass(), "accessTime", term232385);
        setField(term232357, term232357.getClass(), "card", term232359);
        setField(term232357, term232357.getClass(), "userName", "tCNdSxfOaB");
        setIntField(term232357, term232357.getClass(), "level", -171593389);
        setIntField(term232357, term232357.getClass(), "reincarnationNum", 1617777059);
        setLongField(term232357, term232357.getClass(), "exp", -972759122150297482L);
        setLongField(term232357, term232357.getClass(), "point", 5610173559139695003L);
        setLongField(term232357, term232357.getClass(), "totalPoint", 2406637246055452179L);
        setIntField(term232357, term232357.getClass(), "playCount", 1582718344);
        setIntField(term232357, term232357.getClass(), "jewelCount", 122167659);
        setIntField(term232357, term232357.getClass(), "totalJewelCount", -1126970397);
        setIntField(term232357, term232357.getClass(), "medalCount", 1728431100);
        setIntField(term232357, term232357.getClass(), "playerRating", -869897258);
        setIntField(term232357, term232357.getClass(), "highestRating", 962362818);
        setIntField(term232357, term232357.getClass(), "battlePoint", -1177115437);
        setIntField(term232357, term232357.getClass(), "bestBattlePoint", -488175128);
        setIntField(term232357, term232357.getClass(), "overDamageBattlePoint", -663945631);
        setBooleanField(term232357, term232357.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term232357, term232357.getClass(), "nameplateId", 721797064);
        setIntField(term232357, term232357.getClass(), "trophyId", 1046449580);
        setIntField(term232357, term232357.getClass(), "cardId", 371812655);
        setIntField(term232357, term232357.getClass(), "characterId", 1065841171);
        setIntField(term232357, term232357.getClass(), "characterVoiceNo", 1086310493);
        setIntField(term232357, term232357.getClass(), "tabSetting", 1541036402);
        setIntField(term232357, term232357.getClass(), "tabSortSetting", 1185835742);
        setIntField(term232357, term232357.getClass(), "cardCategorySetting", 1564010051);
        setIntField(term232357, term232357.getClass(), "cardSortSetting", -393490765);
        setIntField(term232357, term232357.getClass(), "rivalScoreCategorySetting", 1719645392);
        setIntField(term232357, term232357.getClass(), "playedTutorialBit", -1568726677);
        setIntField(term232357, term232357.getClass(), "firstTutorialCancelNum", -50171390);
        setLongField(term232357, term232357.getClass(), "sumTechHighScore", -6553474771576136211L);
        setLongField(term232357, term232357.getClass(), "sumTechBasicHighScore", -1623841727990454933L);
        setLongField(term232357, term232357.getClass(), "sumTechAdvancedHighScore", -5700041176720960136L);
        setLongField(term232357, term232357.getClass(), "sumTechExpertHighScore", -6410504668000162352L);
        setLongField(term232357, term232357.getClass(), "sumTechMasterHighScore", 8093161021380956016L);
        setLongField(term232357, term232357.getClass(), "sumTechLunaticHighScore", 7462322552351560259L);
        setLongField(term232357, term232357.getClass(), "sumBattleHighScore", 8089340307747530544L);
        setLongField(term232357, term232357.getClass(), "sumBattleBasicHighScore", -4327537392312363022L);
        setLongField(term232357, term232357.getClass(), "sumBattleAdvancedHighScore", 3894769061851355230L);
        setLongField(term232357, term232357.getClass(), "sumBattleExpertHighScore", -4809767258377279230L);
        setLongField(term232357, term232357.getClass(), "sumBattleMasterHighScore", 1537519037363441996L);
        setLongField(term232357, term232357.getClass(), "sumBattleLunaticHighScore", -1440615708368533617L);
        setField(term232357, term232357.getClass(), "eventWatchedDate", "MGMcdMpSfC");
        setField(term232357, term232357.getClass(), "cmEventWatchedDate", "kMdSIzbJlX");
        setField(term232357, term232357.getClass(), "firstGameId", "SjYMHgEWRM");
        setField(term232357, term232357.getClass(), "firstRomVersion", "KZGFIzWwqH");
        setField(term232357, term232357.getClass(), "firstDataVersion", "AelQdYRmHZ");
        setField(term232357, term232357.getClass(), "firstPlayDate", "bOPaMsPSyq");
        setField(term232357, term232357.getClass(), "lastGameId", "slpsXDdiXm");
        setField(term232357, term232357.getClass(), "lastRomVersion", "CrwhMcTxfa");
        setField(term232357, term232357.getClass(), "lastDataVersion", "HqjOaRqVoo");
        setField(term232357, term232357.getClass(), "compatibleCmVersion", "HouDaCvEOJ");
        setField(term232357, term232357.getClass(), "lastPlayDate", "OkSXzntFXp");
        setIntField(term232357, term232357.getClass(), "lastPlaceId", -1864856304);
        setField(term232357, term232357.getClass(), "lastPlaceName", "krvvLzcVhh");
        setIntField(term232357, term232357.getClass(), "lastRegionId", -350728812);
        setField(term232357, term232357.getClass(), "lastRegionName", "rUsEwvlLpO");
        setIntField(term232357, term232357.getClass(), "lastAllNetId", 809905435);
        setField(term232357, term232357.getClass(), "lastClientId", "UWZEdfWFvS");
        setIntField(term232357, term232357.getClass(), "lastUsedDeckId", 574151348);
        setIntField(term232357, term232357.getClass(), "lastPlayMusicLevel", 70907345);
        setIntField(term232357, term232357.getClass(), "lastEmoneyBrand", 545684828);
        setField(term232355, term232355.getClass(), "user", term232357);
        setIntField(term232355, term232355.getClass(), "sortNumber", 1278943912);
        setIntField(term232355, term232355.getClass(), "placeId", -1918459934);
        setField(term232355, term232355.getClass(), "placeName", "AOOxoUEqxT");
        setField(term232355, term232355.getClass(), "playDate", "sbHglfuJyn");
        setField(term232355, term232355.getClass(), "userPlayDate", "hjKMxDKUku");
        setIntField(term232355, term232355.getClass(), "musicId", -1518816079);
        setIntField(term232355, term232355.getClass(), "level", -1959564399);
        setIntField(term232355, term232355.getClass(), "playKind", 789264413);
        setIntField(term232355, term232355.getClass(), "eventId", 1411543119);
        setField(term232355, term232355.getClass(), "eventName", "bAkWQIpVFz");
        setIntField(term232355, term232355.getClass(), "eventPoint", 21102667);
        setIntField(term232355, term232355.getClass(), "playedUserId1", -1730684267);
        setIntField(term232355, term232355.getClass(), "playedUserId2", -291152891);
        setIntField(term232355, term232355.getClass(), "playedUserId3", 527391816);
        setField(term232355, term232355.getClass(), "playedUserName1", "lMVrMjVtkh");
        setField(term232355, term232355.getClass(), "playedUserName2", "pCYeiJyEzg");
        setField(term232355, term232355.getClass(), "playedUserName3", "trtedumQuD");
        setIntField(term232355, term232355.getClass(), "playedMusicLevel1", 407142365);
        setIntField(term232355, term232355.getClass(), "playedMusicLevel2", -303557577);
        setIntField(term232355, term232355.getClass(), "playedMusicLevel3", -24241468);
        setIntField(term232355, term232355.getClass(), "cardId1", 1648187712);
        setIntField(term232355, term232355.getClass(), "cardId2", -1643165362);
        setIntField(term232355, term232355.getClass(), "cardId3", 644721007);
        setIntField(term232355, term232355.getClass(), "cardLevel1", -1061030332);
        setIntField(term232355, term232355.getClass(), "cardLevel2", 1719003803);
        setIntField(term232355, term232355.getClass(), "cardLevel3", 1792293745);
        setIntField(term232355, term232355.getClass(), "cardAttack1", 294713671);
        setIntField(term232355, term232355.getClass(), "cardAttack2", 1869812691);
        setIntField(term232355, term232355.getClass(), "cardAttack3", 1131021258);
        setIntField(term232355, term232355.getClass(), "bossCharaId", 1216297099);
        setIntField(term232355, term232355.getClass(), "bossLevel", 1287631638);
        setIntField(term232355, term232355.getClass(), "bossAttribute", -447126454);
        setIntField(term232355, term232355.getClass(), "clearStatus", 1697871767);
        setIntField(term232355, term232355.getClass(), "techScore", -1700264686);
        setIntField(term232355, term232355.getClass(), "techScoreRank", 1753008116);
        setIntField(term232355, term232355.getClass(), "battleScore", 1276815986);
        setIntField(term232355, term232355.getClass(), "battleScoreRank", -521303871);
        setIntField(term232355, term232355.getClass(), "platinumScore", -1392718153);
        setIntField(term232355, term232355.getClass(), "maxCombo", -256278679);
        setIntField(term232355, term232355.getClass(), "judgeMiss", -524155996);
        setIntField(term232355, term232355.getClass(), "judgeHit", -1349685301);
        setIntField(term232355, term232355.getClass(), "judgeBreak", -2128633946);
        setIntField(term232355, term232355.getClass(), "judgeCriticalBreak", 1147052903);
        setIntField(term232355, term232355.getClass(), "rateTap", 328521391);
        setIntField(term232355, term232355.getClass(), "rateHold", 2086464016);
        setIntField(term232355, term232355.getClass(), "rateFlick", 332481036);
        setIntField(term232355, term232355.getClass(), "rateSideTap", -962070662);
        setIntField(term232355, term232355.getClass(), "rateSideHold", -1257419523);
        setIntField(term232355, term232355.getClass(), "bellCount", -1180293605);
        setIntField(term232355, term232355.getClass(), "totalBellCount", 1441290201);
        setIntField(term232355, term232355.getClass(), "damageCount", -1067225283);
        setIntField(term232355, term232355.getClass(), "overDamage", 1939913208);
        setBooleanField(term232355, term232355.getClass(), "isTechNewRecord", true);
        setBooleanField(term232355, term232355.getClass(), "isBattleNewRecord", true);
        setBooleanField(term232355, term232355.getClass(), "isOverDamageNewRecord", false);
        setBooleanField(term232355, term232355.getClass(), "isFullCombo", false);
        setBooleanField(term232355, term232355.getClass(), "isFullBell", false);
        setBooleanField(term232355, term232355.getClass(), "isAllBreak", false);
        setIntField(term232355, term232355.getClass(), "playerRating", 2000789813);
        setIntField(term232355, term232355.getClass(), "battlePoint", -1740920122);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "sxkHztjOJZ";
        callMethod(klass, "setPlayedUserName3", argTypes, term232355, args);
    }

};


