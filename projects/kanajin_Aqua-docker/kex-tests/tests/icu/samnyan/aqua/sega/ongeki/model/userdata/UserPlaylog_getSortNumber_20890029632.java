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

public class UserPlaylog_getSortNumber_20890029632 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term182482;

    public UserPlaylog_getSortNumber_20890029632() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term182488 = new Long(-7283193381993602128L);
        term182482 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog"));
        Object term182484 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term182486 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term182502 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term182503 = newInstance(Class.forName("java.time.LocalDate"));
        Object term182507 = newInstance(Class.forName("java.time.LocalTime"));
        Object term182512 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term182513 = newInstance(Class.forName("java.time.LocalDate"));
        Object term182517 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term182482, term182482.getClass(), "id", 449789890077874470L);
        setLongField(term182484, term182484.getClass(), "id", 2705815334800907277L);
        setLongField(term182486, term182486.getClass(), "id", -1480160142292210731L);
        setField(term182486, term182486.getClass(), "extId", term182488);
        setField(term182486, term182486.getClass(), "luid", "rsfnVYdDMq");
        setIntField(term182503, term182503.getClass(), "year", 2027);
        setShortField(term182503, term182503.getClass(), "month", (short) 2);
        setShortField(term182503, term182503.getClass(), "day", (short) 28);
        setField(term182502, term182502.getClass(), "date", term182503);
        setByteField(term182507, term182507.getClass(), "hour", (byte) 10);
        setByteField(term182507, term182507.getClass(), "minute", (byte) 42);
        setByteField(term182507, term182507.getClass(), "second", (byte) 49);
        setIntField(term182507, term182507.getClass(), "nano", 494945461);
        setField(term182502, term182502.getClass(), "time", term182507);
        setField(term182486, term182486.getClass(), "registerTime", term182502);
        setIntField(term182513, term182513.getClass(), "year", 2018);
        setShortField(term182513, term182513.getClass(), "month", (short) 3);
        setShortField(term182513, term182513.getClass(), "day", (short) 28);
        setField(term182512, term182512.getClass(), "date", term182513);
        setByteField(term182517, term182517.getClass(), "hour", (byte) 21);
        setByteField(term182517, term182517.getClass(), "minute", (byte) 12);
        setByteField(term182517, term182517.getClass(), "second", (byte) 31);
        setIntField(term182517, term182517.getClass(), "nano", 841920486);
        setField(term182512, term182512.getClass(), "time", term182517);
        setField(term182486, term182486.getClass(), "accessTime", term182512);
        setField(term182484, term182484.getClass(), "card", term182486);
        setField(term182484, term182484.getClass(), "userName", "taIJBiYTRw");
        setIntField(term182484, term182484.getClass(), "level", -578503258);
        setIntField(term182484, term182484.getClass(), "reincarnationNum", 833158114);
        setLongField(term182484, term182484.getClass(), "exp", 3914089655926308630L);
        setLongField(term182484, term182484.getClass(), "point", 471574466241202477L);
        setLongField(term182484, term182484.getClass(), "totalPoint", 6921966529919120680L);
        setIntField(term182484, term182484.getClass(), "playCount", -325758712);
        setIntField(term182484, term182484.getClass(), "jewelCount", 1342823930);
        setIntField(term182484, term182484.getClass(), "totalJewelCount", -1223751366);
        setIntField(term182484, term182484.getClass(), "medalCount", 145156559);
        setIntField(term182484, term182484.getClass(), "playerRating", 1693594719);
        setIntField(term182484, term182484.getClass(), "highestRating", -1409727542);
        setIntField(term182484, term182484.getClass(), "battlePoint", 510444342);
        setIntField(term182484, term182484.getClass(), "bestBattlePoint", 351051431);
        setIntField(term182484, term182484.getClass(), "overDamageBattlePoint", -1286877824);
        setBooleanField(term182484, term182484.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term182484, term182484.getClass(), "nameplateId", -1707611997);
        setIntField(term182484, term182484.getClass(), "trophyId", 1479740413);
        setIntField(term182484, term182484.getClass(), "cardId", 1061932374);
        setIntField(term182484, term182484.getClass(), "characterId", 402502879);
        setIntField(term182484, term182484.getClass(), "characterVoiceNo", 2128927520);
        setIntField(term182484, term182484.getClass(), "tabSetting", -917408283);
        setIntField(term182484, term182484.getClass(), "tabSortSetting", 1409215518);
        setIntField(term182484, term182484.getClass(), "cardCategorySetting", -2109218958);
        setIntField(term182484, term182484.getClass(), "cardSortSetting", 506512884);
        setIntField(term182484, term182484.getClass(), "rivalScoreCategorySetting", 1528202850);
        setIntField(term182484, term182484.getClass(), "playedTutorialBit", -372602638);
        setIntField(term182484, term182484.getClass(), "firstTutorialCancelNum", -2135753104);
        setLongField(term182484, term182484.getClass(), "sumTechHighScore", 7885177573716845935L);
        setLongField(term182484, term182484.getClass(), "sumTechBasicHighScore", 7611899443645591700L);
        setLongField(term182484, term182484.getClass(), "sumTechAdvancedHighScore", 904109184471797244L);
        setLongField(term182484, term182484.getClass(), "sumTechExpertHighScore", 7335322702070483255L);
        setLongField(term182484, term182484.getClass(), "sumTechMasterHighScore", 4882267736842596671L);
        setLongField(term182484, term182484.getClass(), "sumTechLunaticHighScore", 2424177001662013695L);
        setLongField(term182484, term182484.getClass(), "sumBattleHighScore", 4099916510103109834L);
        setLongField(term182484, term182484.getClass(), "sumBattleBasicHighScore", -3195597238532109139L);
        setLongField(term182484, term182484.getClass(), "sumBattleAdvancedHighScore", -6010618625691381313L);
        setLongField(term182484, term182484.getClass(), "sumBattleExpertHighScore", 166461101785203931L);
        setLongField(term182484, term182484.getClass(), "sumBattleMasterHighScore", -5498768254914601103L);
        setLongField(term182484, term182484.getClass(), "sumBattleLunaticHighScore", -7313763512981216447L);
        setField(term182484, term182484.getClass(), "eventWatchedDate", "aPcjboMLdY");
        setField(term182484, term182484.getClass(), "cmEventWatchedDate", "PJiTDBdAZc");
        setField(term182484, term182484.getClass(), "firstGameId", "FatVilGINh");
        setField(term182484, term182484.getClass(), "firstRomVersion", "alOcZfpjkh");
        setField(term182484, term182484.getClass(), "firstDataVersion", "yJYfKodqsu");
        setField(term182484, term182484.getClass(), "firstPlayDate", "lRUldvzxkD");
        setField(term182484, term182484.getClass(), "lastGameId", "YuWfrVdqNy");
        setField(term182484, term182484.getClass(), "lastRomVersion", "oxIEBLRuFO");
        setField(term182484, term182484.getClass(), "lastDataVersion", "gXNuDLMuYT");
        setField(term182484, term182484.getClass(), "compatibleCmVersion", "suxDfOZyfB");
        setField(term182484, term182484.getClass(), "lastPlayDate", "pzOTYsZONn");
        setIntField(term182484, term182484.getClass(), "lastPlaceId", 1708445283);
        setField(term182484, term182484.getClass(), "lastPlaceName", "vdoyqGUjCc");
        setIntField(term182484, term182484.getClass(), "lastRegionId", -1181178525);
        setField(term182484, term182484.getClass(), "lastRegionName", "IpFtQrAOzn");
        setIntField(term182484, term182484.getClass(), "lastAllNetId", -1544614140);
        setField(term182484, term182484.getClass(), "lastClientId", "BjfkRThhpT");
        setIntField(term182484, term182484.getClass(), "lastUsedDeckId", 150247259);
        setIntField(term182484, term182484.getClass(), "lastPlayMusicLevel", 309618163);
        setIntField(term182484, term182484.getClass(), "lastEmoneyBrand", 179576571);
        setField(term182482, term182482.getClass(), "user", term182484);
        setIntField(term182482, term182482.getClass(), "sortNumber", 217633179);
        setIntField(term182482, term182482.getClass(), "placeId", 1605244993);
        setField(term182482, term182482.getClass(), "placeName", "whofJLshdK");
        setField(term182482, term182482.getClass(), "playDate", "HzLLlFEgVo");
        setField(term182482, term182482.getClass(), "userPlayDate", "dtousSFtEL");
        setIntField(term182482, term182482.getClass(), "musicId", -1361181853);
        setIntField(term182482, term182482.getClass(), "level", -608887996);
        setIntField(term182482, term182482.getClass(), "playKind", -1157271510);
        setIntField(term182482, term182482.getClass(), "eventId", 2085776446);
        setField(term182482, term182482.getClass(), "eventName", "AfjNWQpirg");
        setIntField(term182482, term182482.getClass(), "eventPoint", -1041631524);
        setIntField(term182482, term182482.getClass(), "playedUserId1", -1815170945);
        setIntField(term182482, term182482.getClass(), "playedUserId2", -135075938);
        setIntField(term182482, term182482.getClass(), "playedUserId3", -1070476220);
        setField(term182482, term182482.getClass(), "playedUserName1", "PcrhWPBqDM");
        setField(term182482, term182482.getClass(), "playedUserName2", "ieYPDqxhrJ");
        setField(term182482, term182482.getClass(), "playedUserName3", "EjLCKTHFYE");
        setIntField(term182482, term182482.getClass(), "playedMusicLevel1", 804638054);
        setIntField(term182482, term182482.getClass(), "playedMusicLevel2", 401503104);
        setIntField(term182482, term182482.getClass(), "playedMusicLevel3", 1784538359);
        setIntField(term182482, term182482.getClass(), "cardId1", -513538018);
        setIntField(term182482, term182482.getClass(), "cardId2", -2115111012);
        setIntField(term182482, term182482.getClass(), "cardId3", 2072914504);
        setIntField(term182482, term182482.getClass(), "cardLevel1", -1399182054);
        setIntField(term182482, term182482.getClass(), "cardLevel2", -280697935);
        setIntField(term182482, term182482.getClass(), "cardLevel3", -2067880029);
        setIntField(term182482, term182482.getClass(), "cardAttack1", -2145680141);
        setIntField(term182482, term182482.getClass(), "cardAttack2", -433508892);
        setIntField(term182482, term182482.getClass(), "cardAttack3", 1186473092);
        setIntField(term182482, term182482.getClass(), "bossCharaId", 1411390040);
        setIntField(term182482, term182482.getClass(), "bossLevel", 1269301460);
        setIntField(term182482, term182482.getClass(), "bossAttribute", 937430146);
        setIntField(term182482, term182482.getClass(), "clearStatus", -592643197);
        setIntField(term182482, term182482.getClass(), "techScore", -1572749368);
        setIntField(term182482, term182482.getClass(), "techScoreRank", -1777247778);
        setIntField(term182482, term182482.getClass(), "battleScore", -1943026433);
        setIntField(term182482, term182482.getClass(), "battleScoreRank", 765622015);
        setIntField(term182482, term182482.getClass(), "platinumScore", -568658204);
        setIntField(term182482, term182482.getClass(), "maxCombo", -1544212923);
        setIntField(term182482, term182482.getClass(), "judgeMiss", 1763127070);
        setIntField(term182482, term182482.getClass(), "judgeHit", 1568278777);
        setIntField(term182482, term182482.getClass(), "judgeBreak", -1554034571);
        setIntField(term182482, term182482.getClass(), "judgeCriticalBreak", -1228359580);
        setIntField(term182482, term182482.getClass(), "rateTap", 292551785);
        setIntField(term182482, term182482.getClass(), "rateHold", 603303328);
        setIntField(term182482, term182482.getClass(), "rateFlick", -1132491443);
        setIntField(term182482, term182482.getClass(), "rateSideTap", 999801569);
        setIntField(term182482, term182482.getClass(), "rateSideHold", 1153762185);
        setIntField(term182482, term182482.getClass(), "bellCount", 1276343831);
        setIntField(term182482, term182482.getClass(), "totalBellCount", 2147470271);
        setIntField(term182482, term182482.getClass(), "damageCount", 1954298638);
        setIntField(term182482, term182482.getClass(), "overDamage", -2131661608);
        setBooleanField(term182482, term182482.getClass(), "isTechNewRecord", false);
        setBooleanField(term182482, term182482.getClass(), "isBattleNewRecord", false);
        setBooleanField(term182482, term182482.getClass(), "isOverDamageNewRecord", false);
        setBooleanField(term182482, term182482.getClass(), "isFullCombo", false);
        setBooleanField(term182482, term182482.getClass(), "isFullBell", true);
        setBooleanField(term182482, term182482.getClass(), "isAllBreak", false);
        setIntField(term182482, term182482.getClass(), "playerRating", 391150458);
        setIntField(term182482, term182482.getClass(), "battlePoint", -1174497200);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSortNumber", argTypes, term182482, args);
    }

};


