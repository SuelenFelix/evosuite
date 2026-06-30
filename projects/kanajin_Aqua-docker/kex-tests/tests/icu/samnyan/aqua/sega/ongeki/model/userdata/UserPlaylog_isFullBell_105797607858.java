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

public class UserPlaylog_isFullBell_105797607858 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term217874;

    public UserPlaylog_isFullBell_105797607858() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term217880 = new Long(-4231979631084175364L);
        term217874 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog"));
        Object term217876 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term217878 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term217894 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term217895 = newInstance(Class.forName("java.time.LocalDate"));
        Object term217899 = newInstance(Class.forName("java.time.LocalTime"));
        Object term217904 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term217905 = newInstance(Class.forName("java.time.LocalDate"));
        Object term217909 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term217874, term217874.getClass(), "id", 1184649885524711437L);
        setLongField(term217876, term217876.getClass(), "id", -979919897631219477L);
        setLongField(term217878, term217878.getClass(), "id", 4866401985210807179L);
        setField(term217878, term217878.getClass(), "extId", term217880);
        setField(term217878, term217878.getClass(), "luid", "YAygBNnnul");
        setIntField(term217895, term217895.getClass(), "year", 2013);
        setShortField(term217895, term217895.getClass(), "month", (short) 10);
        setShortField(term217895, term217895.getClass(), "day", (short) 4);
        setField(term217894, term217894.getClass(), "date", term217895);
        setByteField(term217899, term217899.getClass(), "hour", (byte) 13);
        setByteField(term217899, term217899.getClass(), "minute", (byte) 8);
        setByteField(term217899, term217899.getClass(), "second", (byte) 57);
        setIntField(term217899, term217899.getClass(), "nano", 285165765);
        setField(term217894, term217894.getClass(), "time", term217899);
        setField(term217878, term217878.getClass(), "registerTime", term217894);
        setIntField(term217905, term217905.getClass(), "year", 2029);
        setShortField(term217905, term217905.getClass(), "month", (short) 8);
        setShortField(term217905, term217905.getClass(), "day", (short) 12);
        setField(term217904, term217904.getClass(), "date", term217905);
        setByteField(term217909, term217909.getClass(), "hour", (byte) 20);
        setByteField(term217909, term217909.getClass(), "minute", (byte) 27);
        setByteField(term217909, term217909.getClass(), "second", (byte) 47);
        setIntField(term217909, term217909.getClass(), "nano", 668392287);
        setField(term217904, term217904.getClass(), "time", term217909);
        setField(term217878, term217878.getClass(), "accessTime", term217904);
        setField(term217876, term217876.getClass(), "card", term217878);
        setField(term217876, term217876.getClass(), "userName", "uLEKeQiFEV");
        setIntField(term217876, term217876.getClass(), "level", -14672184);
        setIntField(term217876, term217876.getClass(), "reincarnationNum", -1230971844);
        setLongField(term217876, term217876.getClass(), "exp", 3897338907318958433L);
        setLongField(term217876, term217876.getClass(), "point", -6650702725181065560L);
        setLongField(term217876, term217876.getClass(), "totalPoint", 3905983226868506745L);
        setIntField(term217876, term217876.getClass(), "playCount", 1597389967);
        setIntField(term217876, term217876.getClass(), "jewelCount", -1597870129);
        setIntField(term217876, term217876.getClass(), "totalJewelCount", -225312817);
        setIntField(term217876, term217876.getClass(), "medalCount", -1260130532);
        setIntField(term217876, term217876.getClass(), "playerRating", 1087742967);
        setIntField(term217876, term217876.getClass(), "highestRating", -627819349);
        setIntField(term217876, term217876.getClass(), "battlePoint", 800478138);
        setIntField(term217876, term217876.getClass(), "bestBattlePoint", -1710282313);
        setIntField(term217876, term217876.getClass(), "overDamageBattlePoint", 206796423);
        setBooleanField(term217876, term217876.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term217876, term217876.getClass(), "nameplateId", 1775312686);
        setIntField(term217876, term217876.getClass(), "trophyId", 260588054);
        setIntField(term217876, term217876.getClass(), "cardId", -1349711909);
        setIntField(term217876, term217876.getClass(), "characterId", -1813258003);
        setIntField(term217876, term217876.getClass(), "characterVoiceNo", -2049220956);
        setIntField(term217876, term217876.getClass(), "tabSetting", -274830075);
        setIntField(term217876, term217876.getClass(), "tabSortSetting", 1931556045);
        setIntField(term217876, term217876.getClass(), "cardCategorySetting", 1036137976);
        setIntField(term217876, term217876.getClass(), "cardSortSetting", 1761376146);
        setIntField(term217876, term217876.getClass(), "rivalScoreCategorySetting", -671916958);
        setIntField(term217876, term217876.getClass(), "playedTutorialBit", 984646048);
        setIntField(term217876, term217876.getClass(), "firstTutorialCancelNum", 1422149722);
        setLongField(term217876, term217876.getClass(), "sumTechHighScore", 8210318515961864995L);
        setLongField(term217876, term217876.getClass(), "sumTechBasicHighScore", -3771555949314802383L);
        setLongField(term217876, term217876.getClass(), "sumTechAdvancedHighScore", 2284085036211088827L);
        setLongField(term217876, term217876.getClass(), "sumTechExpertHighScore", -362453079275456267L);
        setLongField(term217876, term217876.getClass(), "sumTechMasterHighScore", -4242877906053577703L);
        setLongField(term217876, term217876.getClass(), "sumTechLunaticHighScore", 993002974475670049L);
        setLongField(term217876, term217876.getClass(), "sumBattleHighScore", 5942873651038145772L);
        setLongField(term217876, term217876.getClass(), "sumBattleBasicHighScore", -8067651270110686525L);
        setLongField(term217876, term217876.getClass(), "sumBattleAdvancedHighScore", 2057585681704126038L);
        setLongField(term217876, term217876.getClass(), "sumBattleExpertHighScore", -1946000381839282266L);
        setLongField(term217876, term217876.getClass(), "sumBattleMasterHighScore", 3970819512954283654L);
        setLongField(term217876, term217876.getClass(), "sumBattleLunaticHighScore", 1567501790944957323L);
        setField(term217876, term217876.getClass(), "eventWatchedDate", "LLHRVyRKVK");
        setField(term217876, term217876.getClass(), "cmEventWatchedDate", "tIfqZYRucD");
        setField(term217876, term217876.getClass(), "firstGameId", "cKSabLpjIK");
        setField(term217876, term217876.getClass(), "firstRomVersion", "pRVLWyIjhC");
        setField(term217876, term217876.getClass(), "firstDataVersion", "AJxYoXFJNY");
        setField(term217876, term217876.getClass(), "firstPlayDate", "oBsIEyGozN");
        setField(term217876, term217876.getClass(), "lastGameId", "SlYQtEzucG");
        setField(term217876, term217876.getClass(), "lastRomVersion", "ZBFeHlboAy");
        setField(term217876, term217876.getClass(), "lastDataVersion", "afGJMrmxjH");
        setField(term217876, term217876.getClass(), "compatibleCmVersion", "ZpfhRlkkoy");
        setField(term217876, term217876.getClass(), "lastPlayDate", "ktAQrMqyFJ");
        setIntField(term217876, term217876.getClass(), "lastPlaceId", -1131910097);
        setField(term217876, term217876.getClass(), "lastPlaceName", "opvZXdLOeG");
        setIntField(term217876, term217876.getClass(), "lastRegionId", 52885289);
        setField(term217876, term217876.getClass(), "lastRegionName", "CEbsFjwCEa");
        setIntField(term217876, term217876.getClass(), "lastAllNetId", -1419678518);
        setField(term217876, term217876.getClass(), "lastClientId", "yBOGhnrobI");
        setIntField(term217876, term217876.getClass(), "lastUsedDeckId", 1338186927);
        setIntField(term217876, term217876.getClass(), "lastPlayMusicLevel", -1576982510);
        setIntField(term217876, term217876.getClass(), "lastEmoneyBrand", -1877758186);
        setField(term217874, term217874.getClass(), "user", term217876);
        setIntField(term217874, term217874.getClass(), "sortNumber", -830140684);
        setIntField(term217874, term217874.getClass(), "placeId", 685127614);
        setField(term217874, term217874.getClass(), "placeName", "oBMtVEyUVi");
        setField(term217874, term217874.getClass(), "playDate", "HMCVESmviS");
        setField(term217874, term217874.getClass(), "userPlayDate", "YbonlejajI");
        setIntField(term217874, term217874.getClass(), "musicId", 1063250731);
        setIntField(term217874, term217874.getClass(), "level", 1679311499);
        setIntField(term217874, term217874.getClass(), "playKind", 627147024);
        setIntField(term217874, term217874.getClass(), "eventId", 347016445);
        setField(term217874, term217874.getClass(), "eventName", "OagWYKvTVA");
        setIntField(term217874, term217874.getClass(), "eventPoint", 479588343);
        setIntField(term217874, term217874.getClass(), "playedUserId1", -534693706);
        setIntField(term217874, term217874.getClass(), "playedUserId2", -319549520);
        setIntField(term217874, term217874.getClass(), "playedUserId3", -2731686);
        setField(term217874, term217874.getClass(), "playedUserName1", "pTahHEFmUl");
        setField(term217874, term217874.getClass(), "playedUserName2", "JtSiTSYFjh");
        setField(term217874, term217874.getClass(), "playedUserName3", "jrGBzCkgWr");
        setIntField(term217874, term217874.getClass(), "playedMusicLevel1", -743128849);
        setIntField(term217874, term217874.getClass(), "playedMusicLevel2", 2106293234);
        setIntField(term217874, term217874.getClass(), "playedMusicLevel3", -1923952746);
        setIntField(term217874, term217874.getClass(), "cardId1", -148556232);
        setIntField(term217874, term217874.getClass(), "cardId2", 1463939393);
        setIntField(term217874, term217874.getClass(), "cardId3", 1437316718);
        setIntField(term217874, term217874.getClass(), "cardLevel1", -1967495289);
        setIntField(term217874, term217874.getClass(), "cardLevel2", 359190711);
        setIntField(term217874, term217874.getClass(), "cardLevel3", 440478914);
        setIntField(term217874, term217874.getClass(), "cardAttack1", -2057546484);
        setIntField(term217874, term217874.getClass(), "cardAttack2", -506584220);
        setIntField(term217874, term217874.getClass(), "cardAttack3", 1245589816);
        setIntField(term217874, term217874.getClass(), "bossCharaId", -1631923422);
        setIntField(term217874, term217874.getClass(), "bossLevel", -139570037);
        setIntField(term217874, term217874.getClass(), "bossAttribute", -2107792262);
        setIntField(term217874, term217874.getClass(), "clearStatus", -1575358689);
        setIntField(term217874, term217874.getClass(), "techScore", -1187736992);
        setIntField(term217874, term217874.getClass(), "techScoreRank", 1979137255);
        setIntField(term217874, term217874.getClass(), "battleScore", 761578264);
        setIntField(term217874, term217874.getClass(), "battleScoreRank", -44684070);
        setIntField(term217874, term217874.getClass(), "platinumScore", 1156887680);
        setIntField(term217874, term217874.getClass(), "maxCombo", -1707544833);
        setIntField(term217874, term217874.getClass(), "judgeMiss", -1188072095);
        setIntField(term217874, term217874.getClass(), "judgeHit", -129083358);
        setIntField(term217874, term217874.getClass(), "judgeBreak", 490738811);
        setIntField(term217874, term217874.getClass(), "judgeCriticalBreak", 25569400);
        setIntField(term217874, term217874.getClass(), "rateTap", 584372068);
        setIntField(term217874, term217874.getClass(), "rateHold", 1228941953);
        setIntField(term217874, term217874.getClass(), "rateFlick", 776859255);
        setIntField(term217874, term217874.getClass(), "rateSideTap", -1731141151);
        setIntField(term217874, term217874.getClass(), "rateSideHold", -1411813271);
        setIntField(term217874, term217874.getClass(), "bellCount", -300044781);
        setIntField(term217874, term217874.getClass(), "totalBellCount", 78380856);
        setIntField(term217874, term217874.getClass(), "damageCount", 901638935);
        setIntField(term217874, term217874.getClass(), "overDamage", -285544051);
        setBooleanField(term217874, term217874.getClass(), "isTechNewRecord", true);
        setBooleanField(term217874, term217874.getClass(), "isBattleNewRecord", true);
        setBooleanField(term217874, term217874.getClass(), "isOverDamageNewRecord", false);
        setBooleanField(term217874, term217874.getClass(), "isFullCombo", true);
        setBooleanField(term217874, term217874.getClass(), "isFullBell", false);
        setBooleanField(term217874, term217874.getClass(), "isAllBreak", false);
        setIntField(term217874, term217874.getClass(), "playerRating", 351554192);
        setIntField(term217874, term217874.getClass(), "battlePoint", -830429483);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isFullBell", argTypes, term217874, args);
    }

};


