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

public class UserPlaylog_getCardAttack1_204245290328 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term198914;

    public UserPlaylog_getCardAttack1_204245290328() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term198920 = new Long(3103198349031409063L);
        term198914 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog"));
        Object term198916 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term198918 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term198934 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term198935 = newInstance(Class.forName("java.time.LocalDate"));
        Object term198939 = newInstance(Class.forName("java.time.LocalTime"));
        Object term198944 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term198945 = newInstance(Class.forName("java.time.LocalDate"));
        Object term198949 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term198914, term198914.getClass(), "id", -2667466093094305338L);
        setLongField(term198916, term198916.getClass(), "id", -5451630668638977834L);
        setLongField(term198918, term198918.getClass(), "id", 3816575703649188940L);
        setField(term198918, term198918.getClass(), "extId", term198920);
        setField(term198918, term198918.getClass(), "luid", "dyXofAqUFr");
        setIntField(term198935, term198935.getClass(), "year", 2010);
        setShortField(term198935, term198935.getClass(), "month", (short) 5);
        setShortField(term198935, term198935.getClass(), "day", (short) 14);
        setField(term198934, term198934.getClass(), "date", term198935);
        setByteField(term198939, term198939.getClass(), "hour", (byte) 17);
        setByteField(term198939, term198939.getClass(), "minute", (byte) 11);
        setByteField(term198939, term198939.getClass(), "second", (byte) 30);
        setIntField(term198939, term198939.getClass(), "nano", 641019384);
        setField(term198934, term198934.getClass(), "time", term198939);
        setField(term198918, term198918.getClass(), "registerTime", term198934);
        setIntField(term198945, term198945.getClass(), "year", 2022);
        setShortField(term198945, term198945.getClass(), "month", (short) 9);
        setShortField(term198945, term198945.getClass(), "day", (short) 6);
        setField(term198944, term198944.getClass(), "date", term198945);
        setByteField(term198949, term198949.getClass(), "hour", (byte) 0);
        setByteField(term198949, term198949.getClass(), "minute", (byte) 36);
        setByteField(term198949, term198949.getClass(), "second", (byte) 57);
        setIntField(term198949, term198949.getClass(), "nano", 623892951);
        setField(term198944, term198944.getClass(), "time", term198949);
        setField(term198918, term198918.getClass(), "accessTime", term198944);
        setField(term198916, term198916.getClass(), "card", term198918);
        setField(term198916, term198916.getClass(), "userName", "XuAtvPKXnf");
        setIntField(term198916, term198916.getClass(), "level", -501288301);
        setIntField(term198916, term198916.getClass(), "reincarnationNum", 946229454);
        setLongField(term198916, term198916.getClass(), "exp", -8364829941856463433L);
        setLongField(term198916, term198916.getClass(), "point", 6600517470617673840L);
        setLongField(term198916, term198916.getClass(), "totalPoint", -8113170645249933687L);
        setIntField(term198916, term198916.getClass(), "playCount", -1409812406);
        setIntField(term198916, term198916.getClass(), "jewelCount", 1663759912);
        setIntField(term198916, term198916.getClass(), "totalJewelCount", 1868786781);
        setIntField(term198916, term198916.getClass(), "medalCount", 658806605);
        setIntField(term198916, term198916.getClass(), "playerRating", 818300916);
        setIntField(term198916, term198916.getClass(), "highestRating", -1167820473);
        setIntField(term198916, term198916.getClass(), "battlePoint", 1652075304);
        setIntField(term198916, term198916.getClass(), "bestBattlePoint", -334758037);
        setIntField(term198916, term198916.getClass(), "overDamageBattlePoint", -739198561);
        setBooleanField(term198916, term198916.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term198916, term198916.getClass(), "nameplateId", -1768461509);
        setIntField(term198916, term198916.getClass(), "trophyId", 401667728);
        setIntField(term198916, term198916.getClass(), "cardId", 1534158183);
        setIntField(term198916, term198916.getClass(), "characterId", 478171174);
        setIntField(term198916, term198916.getClass(), "characterVoiceNo", -1715722834);
        setIntField(term198916, term198916.getClass(), "tabSetting", 1691652192);
        setIntField(term198916, term198916.getClass(), "tabSortSetting", -1857177422);
        setIntField(term198916, term198916.getClass(), "cardCategorySetting", -335578660);
        setIntField(term198916, term198916.getClass(), "cardSortSetting", -808530434);
        setIntField(term198916, term198916.getClass(), "rivalScoreCategorySetting", 629899573);
        setIntField(term198916, term198916.getClass(), "playedTutorialBit", -1221233211);
        setIntField(term198916, term198916.getClass(), "firstTutorialCancelNum", 1272801235);
        setLongField(term198916, term198916.getClass(), "sumTechHighScore", 5838639850524113941L);
        setLongField(term198916, term198916.getClass(), "sumTechBasicHighScore", 5355929630915463748L);
        setLongField(term198916, term198916.getClass(), "sumTechAdvancedHighScore", -5315531364455719448L);
        setLongField(term198916, term198916.getClass(), "sumTechExpertHighScore", -4658138664140766892L);
        setLongField(term198916, term198916.getClass(), "sumTechMasterHighScore", -6205506425338335293L);
        setLongField(term198916, term198916.getClass(), "sumTechLunaticHighScore", -4332323893295849314L);
        setLongField(term198916, term198916.getClass(), "sumBattleHighScore", -8454521075131051178L);
        setLongField(term198916, term198916.getClass(), "sumBattleBasicHighScore", 454285570562556096L);
        setLongField(term198916, term198916.getClass(), "sumBattleAdvancedHighScore", 7366210029539026180L);
        setLongField(term198916, term198916.getClass(), "sumBattleExpertHighScore", 2462299976129637789L);
        setLongField(term198916, term198916.getClass(), "sumBattleMasterHighScore", 7987458655093426442L);
        setLongField(term198916, term198916.getClass(), "sumBattleLunaticHighScore", 493465833808425496L);
        setField(term198916, term198916.getClass(), "eventWatchedDate", "agKQyzBuct");
        setField(term198916, term198916.getClass(), "cmEventWatchedDate", "wHvZwYZIxZ");
        setField(term198916, term198916.getClass(), "firstGameId", "OlJfDZmXUZ");
        setField(term198916, term198916.getClass(), "firstRomVersion", "JIXkAuXhDx");
        setField(term198916, term198916.getClass(), "firstDataVersion", "NeokzisPfy");
        setField(term198916, term198916.getClass(), "firstPlayDate", "OFPijZbUEP");
        setField(term198916, term198916.getClass(), "lastGameId", "aGlubgKNsG");
        setField(term198916, term198916.getClass(), "lastRomVersion", "UaJYBEwJNx");
        setField(term198916, term198916.getClass(), "lastDataVersion", "tNmMWpvuIO");
        setField(term198916, term198916.getClass(), "compatibleCmVersion", "hkYquFUwUR");
        setField(term198916, term198916.getClass(), "lastPlayDate", "qwXUESXGXo");
        setIntField(term198916, term198916.getClass(), "lastPlaceId", -852323024);
        setField(term198916, term198916.getClass(), "lastPlaceName", "MNfbjaLbKe");
        setIntField(term198916, term198916.getClass(), "lastRegionId", -427488411);
        setField(term198916, term198916.getClass(), "lastRegionName", "aiBUdqSjno");
        setIntField(term198916, term198916.getClass(), "lastAllNetId", -416454353);
        setField(term198916, term198916.getClass(), "lastClientId", "OCoOUoeCiu");
        setIntField(term198916, term198916.getClass(), "lastUsedDeckId", -1978067621);
        setIntField(term198916, term198916.getClass(), "lastPlayMusicLevel", -235633884);
        setIntField(term198916, term198916.getClass(), "lastEmoneyBrand", -165091300);
        setField(term198914, term198914.getClass(), "user", term198916);
        setIntField(term198914, term198914.getClass(), "sortNumber", 562040813);
        setIntField(term198914, term198914.getClass(), "placeId", 1058456521);
        setField(term198914, term198914.getClass(), "placeName", "bVsQcebTuv");
        setField(term198914, term198914.getClass(), "playDate", "bmJCAJxtqz");
        setField(term198914, term198914.getClass(), "userPlayDate", "cgUciMZVPe");
        setIntField(term198914, term198914.getClass(), "musicId", -1013759734);
        setIntField(term198914, term198914.getClass(), "level", 1505538760);
        setIntField(term198914, term198914.getClass(), "playKind", 1763191037);
        setIntField(term198914, term198914.getClass(), "eventId", 1265299065);
        setField(term198914, term198914.getClass(), "eventName", "iENHbBSfhn");
        setIntField(term198914, term198914.getClass(), "eventPoint", -1084975340);
        setIntField(term198914, term198914.getClass(), "playedUserId1", 615130806);
        setIntField(term198914, term198914.getClass(), "playedUserId2", 318393397);
        setIntField(term198914, term198914.getClass(), "playedUserId3", -812516587);
        setField(term198914, term198914.getClass(), "playedUserName1", "EJsOMQLFBT");
        setField(term198914, term198914.getClass(), "playedUserName2", "pPLPfTNTko");
        setField(term198914, term198914.getClass(), "playedUserName3", "DDIcAmyVHW");
        setIntField(term198914, term198914.getClass(), "playedMusicLevel1", 1384681837);
        setIntField(term198914, term198914.getClass(), "playedMusicLevel2", 691606269);
        setIntField(term198914, term198914.getClass(), "playedMusicLevel3", -1530881456);
        setIntField(term198914, term198914.getClass(), "cardId1", -1321457130);
        setIntField(term198914, term198914.getClass(), "cardId2", 128286825);
        setIntField(term198914, term198914.getClass(), "cardId3", -1650841446);
        setIntField(term198914, term198914.getClass(), "cardLevel1", 278452809);
        setIntField(term198914, term198914.getClass(), "cardLevel2", 1447660426);
        setIntField(term198914, term198914.getClass(), "cardLevel3", 505890812);
        setIntField(term198914, term198914.getClass(), "cardAttack1", 1045300956);
        setIntField(term198914, term198914.getClass(), "cardAttack2", 343316459);
        setIntField(term198914, term198914.getClass(), "cardAttack3", -1123419112);
        setIntField(term198914, term198914.getClass(), "bossCharaId", 315601520);
        setIntField(term198914, term198914.getClass(), "bossLevel", 1908812290);
        setIntField(term198914, term198914.getClass(), "bossAttribute", 858789801);
        setIntField(term198914, term198914.getClass(), "clearStatus", 806448705);
        setIntField(term198914, term198914.getClass(), "techScore", 1837939282);
        setIntField(term198914, term198914.getClass(), "techScoreRank", -1630298078);
        setIntField(term198914, term198914.getClass(), "battleScore", 1918251946);
        setIntField(term198914, term198914.getClass(), "battleScoreRank", 842073064);
        setIntField(term198914, term198914.getClass(), "platinumScore", 86310829);
        setIntField(term198914, term198914.getClass(), "maxCombo", 307341387);
        setIntField(term198914, term198914.getClass(), "judgeMiss", 1543796264);
        setIntField(term198914, term198914.getClass(), "judgeHit", 1495907347);
        setIntField(term198914, term198914.getClass(), "judgeBreak", -837165958);
        setIntField(term198914, term198914.getClass(), "judgeCriticalBreak", -1497849874);
        setIntField(term198914, term198914.getClass(), "rateTap", -370670342);
        setIntField(term198914, term198914.getClass(), "rateHold", 464894195);
        setIntField(term198914, term198914.getClass(), "rateFlick", -315503530);
        setIntField(term198914, term198914.getClass(), "rateSideTap", -1272454535);
        setIntField(term198914, term198914.getClass(), "rateSideHold", -74370450);
        setIntField(term198914, term198914.getClass(), "bellCount", -707698143);
        setIntField(term198914, term198914.getClass(), "totalBellCount", -837477515);
        setIntField(term198914, term198914.getClass(), "damageCount", 1463516996);
        setIntField(term198914, term198914.getClass(), "overDamage", -418592932);
        setBooleanField(term198914, term198914.getClass(), "isTechNewRecord", true);
        setBooleanField(term198914, term198914.getClass(), "isBattleNewRecord", false);
        setBooleanField(term198914, term198914.getClass(), "isOverDamageNewRecord", false);
        setBooleanField(term198914, term198914.getClass(), "isFullCombo", true);
        setBooleanField(term198914, term198914.getClass(), "isFullBell", false);
        setBooleanField(term198914, term198914.getClass(), "isAllBreak", true);
        setIntField(term198914, term198914.getClass(), "playerRating", -1258428630);
        setIntField(term198914, term198914.getClass(), "battlePoint", 1183977686);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCardAttack1", argTypes, term198914, args);
    }

};


