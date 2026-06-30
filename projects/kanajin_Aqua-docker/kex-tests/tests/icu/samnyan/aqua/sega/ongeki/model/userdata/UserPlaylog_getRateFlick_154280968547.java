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

public class UserPlaylog_getRateFlick_154280968547 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term210922;

    public UserPlaylog_getRateFlick_154280968547() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term210928 = new Long(7711054832353934171L);
        term210922 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog"));
        Object term210924 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term210926 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term210942 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term210943 = newInstance(Class.forName("java.time.LocalDate"));
        Object term210947 = newInstance(Class.forName("java.time.LocalTime"));
        Object term210952 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term210953 = newInstance(Class.forName("java.time.LocalDate"));
        Object term210957 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term210922, term210922.getClass(), "id", -5513686678924151521L);
        setLongField(term210924, term210924.getClass(), "id", 2285382345856240863L);
        setLongField(term210926, term210926.getClass(), "id", 6680799276613605959L);
        setField(term210926, term210926.getClass(), "extId", term210928);
        setField(term210926, term210926.getClass(), "luid", "ucJGaAjWGS");
        setIntField(term210943, term210943.getClass(), "year", 2010);
        setShortField(term210943, term210943.getClass(), "month", (short) 2);
        setShortField(term210943, term210943.getClass(), "day", (short) 11);
        setField(term210942, term210942.getClass(), "date", term210943);
        setByteField(term210947, term210947.getClass(), "hour", (byte) 12);
        setByteField(term210947, term210947.getClass(), "minute", (byte) 49);
        setByteField(term210947, term210947.getClass(), "second", (byte) 35);
        setIntField(term210947, term210947.getClass(), "nano", 685384504);
        setField(term210942, term210942.getClass(), "time", term210947);
        setField(term210926, term210926.getClass(), "registerTime", term210942);
        setIntField(term210953, term210953.getClass(), "year", 2024);
        setShortField(term210953, term210953.getClass(), "month", (short) 8);
        setShortField(term210953, term210953.getClass(), "day", (short) 7);
        setField(term210952, term210952.getClass(), "date", term210953);
        setByteField(term210957, term210957.getClass(), "hour", (byte) 8);
        setByteField(term210957, term210957.getClass(), "minute", (byte) 41);
        setByteField(term210957, term210957.getClass(), "second", (byte) 36);
        setIntField(term210957, term210957.getClass(), "nano", 84091386);
        setField(term210952, term210952.getClass(), "time", term210957);
        setField(term210926, term210926.getClass(), "accessTime", term210952);
        setField(term210924, term210924.getClass(), "card", term210926);
        setField(term210924, term210924.getClass(), "userName", "thdbTbQhSP");
        setIntField(term210924, term210924.getClass(), "level", -2043903065);
        setIntField(term210924, term210924.getClass(), "reincarnationNum", -1301683464);
        setLongField(term210924, term210924.getClass(), "exp", 3875820802428647785L);
        setLongField(term210924, term210924.getClass(), "point", 885627014332734215L);
        setLongField(term210924, term210924.getClass(), "totalPoint", 1053668783363456491L);
        setIntField(term210924, term210924.getClass(), "playCount", 1838060666);
        setIntField(term210924, term210924.getClass(), "jewelCount", -1354834639);
        setIntField(term210924, term210924.getClass(), "totalJewelCount", 1855161601);
        setIntField(term210924, term210924.getClass(), "medalCount", 1447406432);
        setIntField(term210924, term210924.getClass(), "playerRating", -1261622822);
        setIntField(term210924, term210924.getClass(), "highestRating", 1191113274);
        setIntField(term210924, term210924.getClass(), "battlePoint", -1722069360);
        setIntField(term210924, term210924.getClass(), "bestBattlePoint", -1495659787);
        setIntField(term210924, term210924.getClass(), "overDamageBattlePoint", -13450873);
        setBooleanField(term210924, term210924.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term210924, term210924.getClass(), "nameplateId", 214091895);
        setIntField(term210924, term210924.getClass(), "trophyId", -1653301256);
        setIntField(term210924, term210924.getClass(), "cardId", 1107780347);
        setIntField(term210924, term210924.getClass(), "characterId", 1162865727);
        setIntField(term210924, term210924.getClass(), "characterVoiceNo", 46557287);
        setIntField(term210924, term210924.getClass(), "tabSetting", 1977860945);
        setIntField(term210924, term210924.getClass(), "tabSortSetting", -449467173);
        setIntField(term210924, term210924.getClass(), "cardCategorySetting", -1896252900);
        setIntField(term210924, term210924.getClass(), "cardSortSetting", -1530087856);
        setIntField(term210924, term210924.getClass(), "rivalScoreCategorySetting", -1430480374);
        setIntField(term210924, term210924.getClass(), "playedTutorialBit", -294990025);
        setIntField(term210924, term210924.getClass(), "firstTutorialCancelNum", -1062556648);
        setLongField(term210924, term210924.getClass(), "sumTechHighScore", 816349611483004758L);
        setLongField(term210924, term210924.getClass(), "sumTechBasicHighScore", 6334449203091770209L);
        setLongField(term210924, term210924.getClass(), "sumTechAdvancedHighScore", -2874074023279549309L);
        setLongField(term210924, term210924.getClass(), "sumTechExpertHighScore", -720539725628116572L);
        setLongField(term210924, term210924.getClass(), "sumTechMasterHighScore", -9056433761226632106L);
        setLongField(term210924, term210924.getClass(), "sumTechLunaticHighScore", -7685679100526197453L);
        setLongField(term210924, term210924.getClass(), "sumBattleHighScore", 7466644310571264628L);
        setLongField(term210924, term210924.getClass(), "sumBattleBasicHighScore", -8835499959898956491L);
        setLongField(term210924, term210924.getClass(), "sumBattleAdvancedHighScore", -4986925145460708345L);
        setLongField(term210924, term210924.getClass(), "sumBattleExpertHighScore", 5078180932363824574L);
        setLongField(term210924, term210924.getClass(), "sumBattleMasterHighScore", -3984389941033634402L);
        setLongField(term210924, term210924.getClass(), "sumBattleLunaticHighScore", 4502595137064026705L);
        setField(term210924, term210924.getClass(), "eventWatchedDate", "TnvDurRKCl");
        setField(term210924, term210924.getClass(), "cmEventWatchedDate", "wKWVWhtCTC");
        setField(term210924, term210924.getClass(), "firstGameId", "KyKQStmGux");
        setField(term210924, term210924.getClass(), "firstRomVersion", "TLJEXuSRxb");
        setField(term210924, term210924.getClass(), "firstDataVersion", "JWZFPLoHkl");
        setField(term210924, term210924.getClass(), "firstPlayDate", "kWjqFgZlvD");
        setField(term210924, term210924.getClass(), "lastGameId", "MGUVOXFsPy");
        setField(term210924, term210924.getClass(), "lastRomVersion", "RvPuKTmuhO");
        setField(term210924, term210924.getClass(), "lastDataVersion", "bRYuMVvhgr");
        setField(term210924, term210924.getClass(), "compatibleCmVersion", "NQpLpxNFZU");
        setField(term210924, term210924.getClass(), "lastPlayDate", "MrOKRjSFWl");
        setIntField(term210924, term210924.getClass(), "lastPlaceId", -1323622538);
        setField(term210924, term210924.getClass(), "lastPlaceName", "jAanNWfdUH");
        setIntField(term210924, term210924.getClass(), "lastRegionId", -975694837);
        setField(term210924, term210924.getClass(), "lastRegionName", "ZrgHSWiWuW");
        setIntField(term210924, term210924.getClass(), "lastAllNetId", 600354879);
        setField(term210924, term210924.getClass(), "lastClientId", "oluLwslgub");
        setIntField(term210924, term210924.getClass(), "lastUsedDeckId", -1910867502);
        setIntField(term210924, term210924.getClass(), "lastPlayMusicLevel", -681154934);
        setIntField(term210924, term210924.getClass(), "lastEmoneyBrand", -1605929703);
        setField(term210922, term210922.getClass(), "user", term210924);
        setIntField(term210922, term210922.getClass(), "sortNumber", -299263678);
        setIntField(term210922, term210922.getClass(), "placeId", 347664273);
        setField(term210922, term210922.getClass(), "placeName", "ZpIBiZjLAq");
        setField(term210922, term210922.getClass(), "playDate", "oVqBRwuHXG");
        setField(term210922, term210922.getClass(), "userPlayDate", "tDVqIrnItY");
        setIntField(term210922, term210922.getClass(), "musicId", 1180386145);
        setIntField(term210922, term210922.getClass(), "level", -1226044289);
        setIntField(term210922, term210922.getClass(), "playKind", 803651464);
        setIntField(term210922, term210922.getClass(), "eventId", -1466570615);
        setField(term210922, term210922.getClass(), "eventName", "QTYhuHxYVL");
        setIntField(term210922, term210922.getClass(), "eventPoint", -471545371);
        setIntField(term210922, term210922.getClass(), "playedUserId1", -505396503);
        setIntField(term210922, term210922.getClass(), "playedUserId2", 1161692766);
        setIntField(term210922, term210922.getClass(), "playedUserId3", -1367168675);
        setField(term210922, term210922.getClass(), "playedUserName1", "VZrQRCXhOr");
        setField(term210922, term210922.getClass(), "playedUserName2", "wXuqNYoOrb");
        setField(term210922, term210922.getClass(), "playedUserName3", "EtrfOKqtZx");
        setIntField(term210922, term210922.getClass(), "playedMusicLevel1", 1207815248);
        setIntField(term210922, term210922.getClass(), "playedMusicLevel2", -574020974);
        setIntField(term210922, term210922.getClass(), "playedMusicLevel3", 1971932785);
        setIntField(term210922, term210922.getClass(), "cardId1", 2069110501);
        setIntField(term210922, term210922.getClass(), "cardId2", 620342422);
        setIntField(term210922, term210922.getClass(), "cardId3", -839533151);
        setIntField(term210922, term210922.getClass(), "cardLevel1", -1395988897);
        setIntField(term210922, term210922.getClass(), "cardLevel2", -1572616912);
        setIntField(term210922, term210922.getClass(), "cardLevel3", 637817122);
        setIntField(term210922, term210922.getClass(), "cardAttack1", -1666967856);
        setIntField(term210922, term210922.getClass(), "cardAttack2", 288878731);
        setIntField(term210922, term210922.getClass(), "cardAttack3", -1345750324);
        setIntField(term210922, term210922.getClass(), "bossCharaId", -329240379);
        setIntField(term210922, term210922.getClass(), "bossLevel", 706310223);
        setIntField(term210922, term210922.getClass(), "bossAttribute", 1503842864);
        setIntField(term210922, term210922.getClass(), "clearStatus", 1395180612);
        setIntField(term210922, term210922.getClass(), "techScore", 1625598443);
        setIntField(term210922, term210922.getClass(), "techScoreRank", -38394649);
        setIntField(term210922, term210922.getClass(), "battleScore", 1832189880);
        setIntField(term210922, term210922.getClass(), "battleScoreRank", -2087697431);
        setIntField(term210922, term210922.getClass(), "platinumScore", 682498319);
        setIntField(term210922, term210922.getClass(), "maxCombo", 1946906465);
        setIntField(term210922, term210922.getClass(), "judgeMiss", 470334030);
        setIntField(term210922, term210922.getClass(), "judgeHit", 1448241621);
        setIntField(term210922, term210922.getClass(), "judgeBreak", -2062261648);
        setIntField(term210922, term210922.getClass(), "judgeCriticalBreak", -1535392729);
        setIntField(term210922, term210922.getClass(), "rateTap", -802647375);
        setIntField(term210922, term210922.getClass(), "rateHold", 1588240428);
        setIntField(term210922, term210922.getClass(), "rateFlick", 118743812);
        setIntField(term210922, term210922.getClass(), "rateSideTap", -967532244);
        setIntField(term210922, term210922.getClass(), "rateSideHold", 679724363);
        setIntField(term210922, term210922.getClass(), "bellCount", 1827829669);
        setIntField(term210922, term210922.getClass(), "totalBellCount", 1084226733);
        setIntField(term210922, term210922.getClass(), "damageCount", 853211145);
        setIntField(term210922, term210922.getClass(), "overDamage", 281265026);
        setBooleanField(term210922, term210922.getClass(), "isTechNewRecord", false);
        setBooleanField(term210922, term210922.getClass(), "isBattleNewRecord", false);
        setBooleanField(term210922, term210922.getClass(), "isOverDamageNewRecord", false);
        setBooleanField(term210922, term210922.getClass(), "isFullCombo", false);
        setBooleanField(term210922, term210922.getClass(), "isFullBell", false);
        setBooleanField(term210922, term210922.getClass(), "isAllBreak", true);
        setIntField(term210922, term210922.getClass(), "playerRating", -10577848);
        setIntField(term210922, term210922.getClass(), "battlePoint", 1914024362);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRateFlick", argTypes, term210922, args);
    }

};


