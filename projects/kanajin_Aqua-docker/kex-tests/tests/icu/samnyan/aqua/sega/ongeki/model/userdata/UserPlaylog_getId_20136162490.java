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

public class UserPlaylog_getId_20136162490 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term181218;

    public UserPlaylog_getId_20136162490() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term181224 = new Long(-8993073054427011802L);
        term181218 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog"));
        Object term181220 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term181222 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term181238 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term181239 = newInstance(Class.forName("java.time.LocalDate"));
        Object term181243 = newInstance(Class.forName("java.time.LocalTime"));
        Object term181248 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term181249 = newInstance(Class.forName("java.time.LocalDate"));
        Object term181253 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term181218, term181218.getClass(), "id", -1029002728045148704L);
        setLongField(term181220, term181220.getClass(), "id", -4259484540511871567L);
        setLongField(term181222, term181222.getClass(), "id", 4055534988877935884L);
        setField(term181222, term181222.getClass(), "extId", term181224);
        setField(term181222, term181222.getClass(), "luid", "MPrLDVhNce");
        setIntField(term181239, term181239.getClass(), "year", 2021);
        setShortField(term181239, term181239.getClass(), "month", (short) 4);
        setShortField(term181239, term181239.getClass(), "day", (short) 17);
        setField(term181238, term181238.getClass(), "date", term181239);
        setByteField(term181243, term181243.getClass(), "hour", (byte) 22);
        setByteField(term181243, term181243.getClass(), "minute", (byte) 34);
        setByteField(term181243, term181243.getClass(), "second", (byte) 19);
        setIntField(term181243, term181243.getClass(), "nano", 565497804);
        setField(term181238, term181238.getClass(), "time", term181243);
        setField(term181222, term181222.getClass(), "registerTime", term181238);
        setIntField(term181249, term181249.getClass(), "year", 2019);
        setShortField(term181249, term181249.getClass(), "month", (short) 11);
        setShortField(term181249, term181249.getClass(), "day", (short) 26);
        setField(term181248, term181248.getClass(), "date", term181249);
        setByteField(term181253, term181253.getClass(), "hour", (byte) 21);
        setByteField(term181253, term181253.getClass(), "minute", (byte) 16);
        setByteField(term181253, term181253.getClass(), "second", (byte) 42);
        setIntField(term181253, term181253.getClass(), "nano", 559995047);
        setField(term181248, term181248.getClass(), "time", term181253);
        setField(term181222, term181222.getClass(), "accessTime", term181248);
        setField(term181220, term181220.getClass(), "card", term181222);
        setField(term181220, term181220.getClass(), "userName", "tXidIUmzlF");
        setIntField(term181220, term181220.getClass(), "level", -1074107086);
        setIntField(term181220, term181220.getClass(), "reincarnationNum", -1109747483);
        setLongField(term181220, term181220.getClass(), "exp", -3448651599140085712L);
        setLongField(term181220, term181220.getClass(), "point", -3609260099774913750L);
        setLongField(term181220, term181220.getClass(), "totalPoint", 4303732152768858405L);
        setIntField(term181220, term181220.getClass(), "playCount", 593503302);
        setIntField(term181220, term181220.getClass(), "jewelCount", -432642258);
        setIntField(term181220, term181220.getClass(), "totalJewelCount", 1556333637);
        setIntField(term181220, term181220.getClass(), "medalCount", -565003432);
        setIntField(term181220, term181220.getClass(), "playerRating", 200942673);
        setIntField(term181220, term181220.getClass(), "highestRating", 494420860);
        setIntField(term181220, term181220.getClass(), "battlePoint", 1719483689);
        setIntField(term181220, term181220.getClass(), "bestBattlePoint", -496949040);
        setIntField(term181220, term181220.getClass(), "overDamageBattlePoint", 1993312573);
        setBooleanField(term181220, term181220.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term181220, term181220.getClass(), "nameplateId", -720266848);
        setIntField(term181220, term181220.getClass(), "trophyId", 1274739943);
        setIntField(term181220, term181220.getClass(), "cardId", 2052597279);
        setIntField(term181220, term181220.getClass(), "characterId", 1051940041);
        setIntField(term181220, term181220.getClass(), "characterVoiceNo", -1438630933);
        setIntField(term181220, term181220.getClass(), "tabSetting", 1429450341);
        setIntField(term181220, term181220.getClass(), "tabSortSetting", 853910835);
        setIntField(term181220, term181220.getClass(), "cardCategorySetting", 523509597);
        setIntField(term181220, term181220.getClass(), "cardSortSetting", 2115455955);
        setIntField(term181220, term181220.getClass(), "rivalScoreCategorySetting", 386488843);
        setIntField(term181220, term181220.getClass(), "playedTutorialBit", 914648563);
        setIntField(term181220, term181220.getClass(), "firstTutorialCancelNum", 938013259);
        setLongField(term181220, term181220.getClass(), "sumTechHighScore", 2871414186316219488L);
        setLongField(term181220, term181220.getClass(), "sumTechBasicHighScore", -3990638584040447441L);
        setLongField(term181220, term181220.getClass(), "sumTechAdvancedHighScore", 122679439739867306L);
        setLongField(term181220, term181220.getClass(), "sumTechExpertHighScore", -2461790613276258316L);
        setLongField(term181220, term181220.getClass(), "sumTechMasterHighScore", -108156486325010619L);
        setLongField(term181220, term181220.getClass(), "sumTechLunaticHighScore", -7872624721231178208L);
        setLongField(term181220, term181220.getClass(), "sumBattleHighScore", -7527069582035495855L);
        setLongField(term181220, term181220.getClass(), "sumBattleBasicHighScore", -1286075784303241299L);
        setLongField(term181220, term181220.getClass(), "sumBattleAdvancedHighScore", 8755645356008809649L);
        setLongField(term181220, term181220.getClass(), "sumBattleExpertHighScore", -8674690599315417243L);
        setLongField(term181220, term181220.getClass(), "sumBattleMasterHighScore", -951836718289537995L);
        setLongField(term181220, term181220.getClass(), "sumBattleLunaticHighScore", -5472272690082825051L);
        setField(term181220, term181220.getClass(), "eventWatchedDate", "fVdLejYqxd");
        setField(term181220, term181220.getClass(), "cmEventWatchedDate", "cRmXUJxIrJ");
        setField(term181220, term181220.getClass(), "firstGameId", "EoLbvbBEMP");
        setField(term181220, term181220.getClass(), "firstRomVersion", "btsaaRMdBp");
        setField(term181220, term181220.getClass(), "firstDataVersion", "ItCoFoogyQ");
        setField(term181220, term181220.getClass(), "firstPlayDate", "nepnhlILBS");
        setField(term181220, term181220.getClass(), "lastGameId", "huaIuyRHxW");
        setField(term181220, term181220.getClass(), "lastRomVersion", "ogERhHtdmR");
        setField(term181220, term181220.getClass(), "lastDataVersion", "ChbSEsWapt");
        setField(term181220, term181220.getClass(), "compatibleCmVersion", "bQISZgxxwm");
        setField(term181220, term181220.getClass(), "lastPlayDate", "GTtXOBrgdi");
        setIntField(term181220, term181220.getClass(), "lastPlaceId", -1744748317);
        setField(term181220, term181220.getClass(), "lastPlaceName", "YYhXdHIurl");
        setIntField(term181220, term181220.getClass(), "lastRegionId", -136997975);
        setField(term181220, term181220.getClass(), "lastRegionName", "CkrdSBVicO");
        setIntField(term181220, term181220.getClass(), "lastAllNetId", -1265205171);
        setField(term181220, term181220.getClass(), "lastClientId", "msqTjDOpSS");
        setIntField(term181220, term181220.getClass(), "lastUsedDeckId", 1765474903);
        setIntField(term181220, term181220.getClass(), "lastPlayMusicLevel", -823727373);
        setIntField(term181220, term181220.getClass(), "lastEmoneyBrand", -521133417);
        setField(term181218, term181218.getClass(), "user", term181220);
        setIntField(term181218, term181218.getClass(), "sortNumber", -1409612913);
        setIntField(term181218, term181218.getClass(), "placeId", -994963847);
        setField(term181218, term181218.getClass(), "placeName", "pwskCNsTJJ");
        setField(term181218, term181218.getClass(), "playDate", "QTKtugVjKE");
        setField(term181218, term181218.getClass(), "userPlayDate", "NTbKSHXEkV");
        setIntField(term181218, term181218.getClass(), "musicId", 1267196825);
        setIntField(term181218, term181218.getClass(), "level", -1556772835);
        setIntField(term181218, term181218.getClass(), "playKind", 826496758);
        setIntField(term181218, term181218.getClass(), "eventId", -1092524320);
        setField(term181218, term181218.getClass(), "eventName", "ddCKOtvsQp");
        setIntField(term181218, term181218.getClass(), "eventPoint", -1369169185);
        setIntField(term181218, term181218.getClass(), "playedUserId1", 621086741);
        setIntField(term181218, term181218.getClass(), "playedUserId2", 1859131268);
        setIntField(term181218, term181218.getClass(), "playedUserId3", -2039488454);
        setField(term181218, term181218.getClass(), "playedUserName1", "UBkzzMavEW");
        setField(term181218, term181218.getClass(), "playedUserName2", "jObyDgxBpp");
        setField(term181218, term181218.getClass(), "playedUserName3", "MsYMjAnASM");
        setIntField(term181218, term181218.getClass(), "playedMusicLevel1", 2103290677);
        setIntField(term181218, term181218.getClass(), "playedMusicLevel2", 1837373391);
        setIntField(term181218, term181218.getClass(), "playedMusicLevel3", -128438506);
        setIntField(term181218, term181218.getClass(), "cardId1", 714422066);
        setIntField(term181218, term181218.getClass(), "cardId2", 1681162409);
        setIntField(term181218, term181218.getClass(), "cardId3", 1970231092);
        setIntField(term181218, term181218.getClass(), "cardLevel1", 1491681461);
        setIntField(term181218, term181218.getClass(), "cardLevel2", 671852602);
        setIntField(term181218, term181218.getClass(), "cardLevel3", 644767573);
        setIntField(term181218, term181218.getClass(), "cardAttack1", 530544685);
        setIntField(term181218, term181218.getClass(), "cardAttack2", 1402078763);
        setIntField(term181218, term181218.getClass(), "cardAttack3", -1642283126);
        setIntField(term181218, term181218.getClass(), "bossCharaId", -195107561);
        setIntField(term181218, term181218.getClass(), "bossLevel", 1290451013);
        setIntField(term181218, term181218.getClass(), "bossAttribute", 1222406873);
        setIntField(term181218, term181218.getClass(), "clearStatus", 844932455);
        setIntField(term181218, term181218.getClass(), "techScore", -283368825);
        setIntField(term181218, term181218.getClass(), "techScoreRank", -26095476);
        setIntField(term181218, term181218.getClass(), "battleScore", -817451064);
        setIntField(term181218, term181218.getClass(), "battleScoreRank", 1763142312);
        setIntField(term181218, term181218.getClass(), "platinumScore", 58115877);
        setIntField(term181218, term181218.getClass(), "maxCombo", 1626439614);
        setIntField(term181218, term181218.getClass(), "judgeMiss", 1481065725);
        setIntField(term181218, term181218.getClass(), "judgeHit", -1767368331);
        setIntField(term181218, term181218.getClass(), "judgeBreak", 1372347602);
        setIntField(term181218, term181218.getClass(), "judgeCriticalBreak", 1235227301);
        setIntField(term181218, term181218.getClass(), "rateTap", -681966576);
        setIntField(term181218, term181218.getClass(), "rateHold", 858361426);
        setIntField(term181218, term181218.getClass(), "rateFlick", 989677185);
        setIntField(term181218, term181218.getClass(), "rateSideTap", -1548710213);
        setIntField(term181218, term181218.getClass(), "rateSideHold", -1034385409);
        setIntField(term181218, term181218.getClass(), "bellCount", 846028123);
        setIntField(term181218, term181218.getClass(), "totalBellCount", -113805778);
        setIntField(term181218, term181218.getClass(), "damageCount", -217357550);
        setIntField(term181218, term181218.getClass(), "overDamage", 1933205055);
        setBooleanField(term181218, term181218.getClass(), "isTechNewRecord", false);
        setBooleanField(term181218, term181218.getClass(), "isBattleNewRecord", true);
        setBooleanField(term181218, term181218.getClass(), "isOverDamageNewRecord", false);
        setBooleanField(term181218, term181218.getClass(), "isFullCombo", false);
        setBooleanField(term181218, term181218.getClass(), "isFullBell", true);
        setBooleanField(term181218, term181218.getClass(), "isAllBreak", true);
        setIntField(term181218, term181218.getClass(), "playerRating", 2116372433);
        setIntField(term181218, term181218.getClass(), "battlePoint", -1327362546);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term181218, args);
    }

};


