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

public class UserPlaylog_getCardId1_208131216622 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term195122;

    public UserPlaylog_getCardId1_208131216622() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term195128 = new Long(7010148136855890340L);
        term195122 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog"));
        Object term195124 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term195126 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term195142 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term195143 = newInstance(Class.forName("java.time.LocalDate"));
        Object term195147 = newInstance(Class.forName("java.time.LocalTime"));
        Object term195152 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term195153 = newInstance(Class.forName("java.time.LocalDate"));
        Object term195157 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term195122, term195122.getClass(), "id", -4659933601651349834L);
        setLongField(term195124, term195124.getClass(), "id", 1367489226564827925L);
        setLongField(term195126, term195126.getClass(), "id", 5947163205971809021L);
        setField(term195126, term195126.getClass(), "extId", term195128);
        setField(term195126, term195126.getClass(), "luid", "QsCuIBxGhs");
        setIntField(term195143, term195143.getClass(), "year", 2024);
        setShortField(term195143, term195143.getClass(), "month", (short) 5);
        setShortField(term195143, term195143.getClass(), "day", (short) 28);
        setField(term195142, term195142.getClass(), "date", term195143);
        setByteField(term195147, term195147.getClass(), "hour", (byte) 15);
        setByteField(term195147, term195147.getClass(), "minute", (byte) 17);
        setByteField(term195147, term195147.getClass(), "second", (byte) 52);
        setIntField(term195147, term195147.getClass(), "nano", 650019774);
        setField(term195142, term195142.getClass(), "time", term195147);
        setField(term195126, term195126.getClass(), "registerTime", term195142);
        setIntField(term195153, term195153.getClass(), "year", 2028);
        setShortField(term195153, term195153.getClass(), "month", (short) 12);
        setShortField(term195153, term195153.getClass(), "day", (short) 5);
        setField(term195152, term195152.getClass(), "date", term195153);
        setByteField(term195157, term195157.getClass(), "hour", (byte) 0);
        setByteField(term195157, term195157.getClass(), "minute", (byte) 31);
        setByteField(term195157, term195157.getClass(), "second", (byte) 47);
        setIntField(term195157, term195157.getClass(), "nano", 889672113);
        setField(term195152, term195152.getClass(), "time", term195157);
        setField(term195126, term195126.getClass(), "accessTime", term195152);
        setField(term195124, term195124.getClass(), "card", term195126);
        setField(term195124, term195124.getClass(), "userName", "bZQNbQIhIk");
        setIntField(term195124, term195124.getClass(), "level", 503641255);
        setIntField(term195124, term195124.getClass(), "reincarnationNum", 556061823);
        setLongField(term195124, term195124.getClass(), "exp", -6575085788894320106L);
        setLongField(term195124, term195124.getClass(), "point", 550987716231833754L);
        setLongField(term195124, term195124.getClass(), "totalPoint", 1195945709581994890L);
        setIntField(term195124, term195124.getClass(), "playCount", 1060184160);
        setIntField(term195124, term195124.getClass(), "jewelCount", 74678316);
        setIntField(term195124, term195124.getClass(), "totalJewelCount", 1440958306);
        setIntField(term195124, term195124.getClass(), "medalCount", -913545640);
        setIntField(term195124, term195124.getClass(), "playerRating", 1019617568);
        setIntField(term195124, term195124.getClass(), "highestRating", -89684579);
        setIntField(term195124, term195124.getClass(), "battlePoint", -259140396);
        setIntField(term195124, term195124.getClass(), "bestBattlePoint", 2058486253);
        setIntField(term195124, term195124.getClass(), "overDamageBattlePoint", -1940345085);
        setBooleanField(term195124, term195124.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term195124, term195124.getClass(), "nameplateId", -1732622094);
        setIntField(term195124, term195124.getClass(), "trophyId", 2112663117);
        setIntField(term195124, term195124.getClass(), "cardId", 310553066);
        setIntField(term195124, term195124.getClass(), "characterId", -162362750);
        setIntField(term195124, term195124.getClass(), "characterVoiceNo", -516149823);
        setIntField(term195124, term195124.getClass(), "tabSetting", -1393682683);
        setIntField(term195124, term195124.getClass(), "tabSortSetting", 556170630);
        setIntField(term195124, term195124.getClass(), "cardCategorySetting", -705500663);
        setIntField(term195124, term195124.getClass(), "cardSortSetting", 1955702887);
        setIntField(term195124, term195124.getClass(), "rivalScoreCategorySetting", -473885637);
        setIntField(term195124, term195124.getClass(), "playedTutorialBit", 1889562581);
        setIntField(term195124, term195124.getClass(), "firstTutorialCancelNum", 812974265);
        setLongField(term195124, term195124.getClass(), "sumTechHighScore", 2172784493932185308L);
        setLongField(term195124, term195124.getClass(), "sumTechBasicHighScore", 1474532962460105752L);
        setLongField(term195124, term195124.getClass(), "sumTechAdvancedHighScore", 1355498208876702210L);
        setLongField(term195124, term195124.getClass(), "sumTechExpertHighScore", 3688474110239796801L);
        setLongField(term195124, term195124.getClass(), "sumTechMasterHighScore", 7893889106593423394L);
        setLongField(term195124, term195124.getClass(), "sumTechLunaticHighScore", 8238829374400431080L);
        setLongField(term195124, term195124.getClass(), "sumBattleHighScore", 370702188152989771L);
        setLongField(term195124, term195124.getClass(), "sumBattleBasicHighScore", 6630554467062889491L);
        setLongField(term195124, term195124.getClass(), "sumBattleAdvancedHighScore", -3595600412432359442L);
        setLongField(term195124, term195124.getClass(), "sumBattleExpertHighScore", -1592016996022241037L);
        setLongField(term195124, term195124.getClass(), "sumBattleMasterHighScore", -1355077344395009415L);
        setLongField(term195124, term195124.getClass(), "sumBattleLunaticHighScore", -319418651246501343L);
        setField(term195124, term195124.getClass(), "eventWatchedDate", "UiUlPwkluo");
        setField(term195124, term195124.getClass(), "cmEventWatchedDate", "hidWzTClRC");
        setField(term195124, term195124.getClass(), "firstGameId", "jopYvhYeRh");
        setField(term195124, term195124.getClass(), "firstRomVersion", "nXQDrjTiry");
        setField(term195124, term195124.getClass(), "firstDataVersion", "JxwsJCJdxD");
        setField(term195124, term195124.getClass(), "firstPlayDate", "pEVByJwwno");
        setField(term195124, term195124.getClass(), "lastGameId", "KReakLEucX");
        setField(term195124, term195124.getClass(), "lastRomVersion", "mhhLPCEKce");
        setField(term195124, term195124.getClass(), "lastDataVersion", "mGYVzQAKbZ");
        setField(term195124, term195124.getClass(), "compatibleCmVersion", "WRYXrZXyWW");
        setField(term195124, term195124.getClass(), "lastPlayDate", "oxutRgjLWf");
        setIntField(term195124, term195124.getClass(), "lastPlaceId", 1042200452);
        setField(term195124, term195124.getClass(), "lastPlaceName", "gwIPWwFNRB");
        setIntField(term195124, term195124.getClass(), "lastRegionId", -1721345121);
        setField(term195124, term195124.getClass(), "lastRegionName", "hFuBnwDQFp");
        setIntField(term195124, term195124.getClass(), "lastAllNetId", -639524770);
        setField(term195124, term195124.getClass(), "lastClientId", "CmxKtZlOTF");
        setIntField(term195124, term195124.getClass(), "lastUsedDeckId", -799953558);
        setIntField(term195124, term195124.getClass(), "lastPlayMusicLevel", -500432727);
        setIntField(term195124, term195124.getClass(), "lastEmoneyBrand", -2047392780);
        setField(term195122, term195122.getClass(), "user", term195124);
        setIntField(term195122, term195122.getClass(), "sortNumber", -1637799701);
        setIntField(term195122, term195122.getClass(), "placeId", 1698600430);
        setField(term195122, term195122.getClass(), "placeName", "vtuxUUlufI");
        setField(term195122, term195122.getClass(), "playDate", "IElqCRKTzX");
        setField(term195122, term195122.getClass(), "userPlayDate", "jakWEzNHql");
        setIntField(term195122, term195122.getClass(), "musicId", -1431010224);
        setIntField(term195122, term195122.getClass(), "level", -1025991695);
        setIntField(term195122, term195122.getClass(), "playKind", -1660783456);
        setIntField(term195122, term195122.getClass(), "eventId", -1695731044);
        setField(term195122, term195122.getClass(), "eventName", "FkXktXVTrX");
        setIntField(term195122, term195122.getClass(), "eventPoint", -255451892);
        setIntField(term195122, term195122.getClass(), "playedUserId1", -1224111256);
        setIntField(term195122, term195122.getClass(), "playedUserId2", -1826524081);
        setIntField(term195122, term195122.getClass(), "playedUserId3", -676295156);
        setField(term195122, term195122.getClass(), "playedUserName1", "YQdijObtLe");
        setField(term195122, term195122.getClass(), "playedUserName2", "uWIjXshoUq");
        setField(term195122, term195122.getClass(), "playedUserName3", "LDmFCvRkQr");
        setIntField(term195122, term195122.getClass(), "playedMusicLevel1", -200393215);
        setIntField(term195122, term195122.getClass(), "playedMusicLevel2", 2082267818);
        setIntField(term195122, term195122.getClass(), "playedMusicLevel3", 4015114);
        setIntField(term195122, term195122.getClass(), "cardId1", 2035858719);
        setIntField(term195122, term195122.getClass(), "cardId2", 231711893);
        setIntField(term195122, term195122.getClass(), "cardId3", 946699304);
        setIntField(term195122, term195122.getClass(), "cardLevel1", -651225608);
        setIntField(term195122, term195122.getClass(), "cardLevel2", -838905023);
        setIntField(term195122, term195122.getClass(), "cardLevel3", 1997861223);
        setIntField(term195122, term195122.getClass(), "cardAttack1", -1861970851);
        setIntField(term195122, term195122.getClass(), "cardAttack2", -1201375636);
        setIntField(term195122, term195122.getClass(), "cardAttack3", 275797745);
        setIntField(term195122, term195122.getClass(), "bossCharaId", -289448833);
        setIntField(term195122, term195122.getClass(), "bossLevel", -877446165);
        setIntField(term195122, term195122.getClass(), "bossAttribute", -1334756045);
        setIntField(term195122, term195122.getClass(), "clearStatus", -2138080639);
        setIntField(term195122, term195122.getClass(), "techScore", 1515190471);
        setIntField(term195122, term195122.getClass(), "techScoreRank", -565295100);
        setIntField(term195122, term195122.getClass(), "battleScore", -155271123);
        setIntField(term195122, term195122.getClass(), "battleScoreRank", 1876008218);
        setIntField(term195122, term195122.getClass(), "platinumScore", -1489159494);
        setIntField(term195122, term195122.getClass(), "maxCombo", 2098095371);
        setIntField(term195122, term195122.getClass(), "judgeMiss", -1167910114);
        setIntField(term195122, term195122.getClass(), "judgeHit", 887019523);
        setIntField(term195122, term195122.getClass(), "judgeBreak", 1368241755);
        setIntField(term195122, term195122.getClass(), "judgeCriticalBreak", 638332794);
        setIntField(term195122, term195122.getClass(), "rateTap", 813998278);
        setIntField(term195122, term195122.getClass(), "rateHold", 1609669666);
        setIntField(term195122, term195122.getClass(), "rateFlick", -762558361);
        setIntField(term195122, term195122.getClass(), "rateSideTap", 887781125);
        setIntField(term195122, term195122.getClass(), "rateSideHold", 156944686);
        setIntField(term195122, term195122.getClass(), "bellCount", -271866942);
        setIntField(term195122, term195122.getClass(), "totalBellCount", 385425101);
        setIntField(term195122, term195122.getClass(), "damageCount", -1505816576);
        setIntField(term195122, term195122.getClass(), "overDamage", -1877003964);
        setBooleanField(term195122, term195122.getClass(), "isTechNewRecord", false);
        setBooleanField(term195122, term195122.getClass(), "isBattleNewRecord", false);
        setBooleanField(term195122, term195122.getClass(), "isOverDamageNewRecord", false);
        setBooleanField(term195122, term195122.getClass(), "isFullCombo", false);
        setBooleanField(term195122, term195122.getClass(), "isFullBell", false);
        setBooleanField(term195122, term195122.getClass(), "isAllBreak", true);
        setIntField(term195122, term195122.getClass(), "playerRating", 1700904086);
        setIntField(term195122, term195122.getClass(), "battlePoint", -362916771);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCardId1", argTypes, term195122, args);
    }

};


