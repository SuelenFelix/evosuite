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

public class UserPlaylog_hashCode_1735582223126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term261537;

    public UserPlaylog_hashCode_1735582223126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term261543 = new Long(3447455321955655601L);
        term261537 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog"));
        Object term261539 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term261541 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term261557 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term261558 = newInstance(Class.forName("java.time.LocalDate"));
        Object term261562 = newInstance(Class.forName("java.time.LocalTime"));
        Object term261567 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term261568 = newInstance(Class.forName("java.time.LocalDate"));
        Object term261572 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term261537, term261537.getClass(), "id", 4486949678479545166L);
        setLongField(term261539, term261539.getClass(), "id", -7780822153793339761L);
        setLongField(term261541, term261541.getClass(), "id", -1081065334603558553L);
        setField(term261541, term261541.getClass(), "extId", term261543);
        setField(term261541, term261541.getClass(), "luid", "cBntwyxQws");
        setIntField(term261558, term261558.getClass(), "year", 2025);
        setShortField(term261558, term261558.getClass(), "month", (short) 9);
        setShortField(term261558, term261558.getClass(), "day", (short) 28);
        setField(term261557, term261557.getClass(), "date", term261558);
        setByteField(term261562, term261562.getClass(), "hour", (byte) 19);
        setByteField(term261562, term261562.getClass(), "minute", (byte) 59);
        setByteField(term261562, term261562.getClass(), "second", (byte) 17);
        setIntField(term261562, term261562.getClass(), "nano", 528282549);
        setField(term261557, term261557.getClass(), "time", term261562);
        setField(term261541, term261541.getClass(), "registerTime", term261557);
        setIntField(term261568, term261568.getClass(), "year", 2024);
        setShortField(term261568, term261568.getClass(), "month", (short) 9);
        setShortField(term261568, term261568.getClass(), "day", (short) 15);
        setField(term261567, term261567.getClass(), "date", term261568);
        setByteField(term261572, term261572.getClass(), "hour", (byte) 7);
        setByteField(term261572, term261572.getClass(), "minute", (byte) 33);
        setByteField(term261572, term261572.getClass(), "second", (byte) 0);
        setIntField(term261572, term261572.getClass(), "nano", 990831240);
        setField(term261567, term261567.getClass(), "time", term261572);
        setField(term261541, term261541.getClass(), "accessTime", term261567);
        setField(term261539, term261539.getClass(), "card", term261541);
        setField(term261539, term261539.getClass(), "userName", "ctJmoieYHE");
        setIntField(term261539, term261539.getClass(), "level", 1221899586);
        setIntField(term261539, term261539.getClass(), "reincarnationNum", 1587152573);
        setLongField(term261539, term261539.getClass(), "exp", -1165819408782570944L);
        setLongField(term261539, term261539.getClass(), "point", 6515641205751915818L);
        setLongField(term261539, term261539.getClass(), "totalPoint", -4932499970481422256L);
        setIntField(term261539, term261539.getClass(), "playCount", 374759994);
        setIntField(term261539, term261539.getClass(), "jewelCount", 1614709177);
        setIntField(term261539, term261539.getClass(), "totalJewelCount", 966660807);
        setIntField(term261539, term261539.getClass(), "medalCount", 491650010);
        setIntField(term261539, term261539.getClass(), "playerRating", -288034028);
        setIntField(term261539, term261539.getClass(), "highestRating", 701792790);
        setIntField(term261539, term261539.getClass(), "battlePoint", -1716961612);
        setIntField(term261539, term261539.getClass(), "bestBattlePoint", 676440749);
        setIntField(term261539, term261539.getClass(), "overDamageBattlePoint", -1284761868);
        setBooleanField(term261539, term261539.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term261539, term261539.getClass(), "nameplateId", -1743993538);
        setIntField(term261539, term261539.getClass(), "trophyId", -1368813525);
        setIntField(term261539, term261539.getClass(), "cardId", -309765050);
        setIntField(term261539, term261539.getClass(), "characterId", 145184885);
        setIntField(term261539, term261539.getClass(), "characterVoiceNo", -2108989861);
        setIntField(term261539, term261539.getClass(), "tabSetting", 756442239);
        setIntField(term261539, term261539.getClass(), "tabSortSetting", 414458522);
        setIntField(term261539, term261539.getClass(), "cardCategorySetting", -1165049012);
        setIntField(term261539, term261539.getClass(), "cardSortSetting", 830585633);
        setIntField(term261539, term261539.getClass(), "rivalScoreCategorySetting", 563816474);
        setIntField(term261539, term261539.getClass(), "playedTutorialBit", 2043443606);
        setIntField(term261539, term261539.getClass(), "firstTutorialCancelNum", 2062774736);
        setLongField(term261539, term261539.getClass(), "sumTechHighScore", 3488149133235281029L);
        setLongField(term261539, term261539.getClass(), "sumTechBasicHighScore", 8537622146090289867L);
        setLongField(term261539, term261539.getClass(), "sumTechAdvancedHighScore", -8984045775963503112L);
        setLongField(term261539, term261539.getClass(), "sumTechExpertHighScore", -6115620383731978271L);
        setLongField(term261539, term261539.getClass(), "sumTechMasterHighScore", 8738012409587071936L);
        setLongField(term261539, term261539.getClass(), "sumTechLunaticHighScore", -29609808522769499L);
        setLongField(term261539, term261539.getClass(), "sumBattleHighScore", 5943369765371591991L);
        setLongField(term261539, term261539.getClass(), "sumBattleBasicHighScore", -2586147508253318639L);
        setLongField(term261539, term261539.getClass(), "sumBattleAdvancedHighScore", -197323410420958598L);
        setLongField(term261539, term261539.getClass(), "sumBattleExpertHighScore", 1230514846457580877L);
        setLongField(term261539, term261539.getClass(), "sumBattleMasterHighScore", 674662610363840076L);
        setLongField(term261539, term261539.getClass(), "sumBattleLunaticHighScore", -8470415008864596944L);
        setField(term261539, term261539.getClass(), "eventWatchedDate", "MGvYGOoYyh");
        setField(term261539, term261539.getClass(), "cmEventWatchedDate", "akolIywpGZ");
        setField(term261539, term261539.getClass(), "firstGameId", "GnPGHkkqXj");
        setField(term261539, term261539.getClass(), "firstRomVersion", "yZrxnnzSIY");
        setField(term261539, term261539.getClass(), "firstDataVersion", "EIuiJILbFJ");
        setField(term261539, term261539.getClass(), "firstPlayDate", "gmnZmbmANj");
        setField(term261539, term261539.getClass(), "lastGameId", "ugFTLYkUZt");
        setField(term261539, term261539.getClass(), "lastRomVersion", "WHRCJzYcUs");
        setField(term261539, term261539.getClass(), "lastDataVersion", "eSqgLQrNqK");
        setField(term261539, term261539.getClass(), "compatibleCmVersion", "wOeEJTeZMX");
        setField(term261539, term261539.getClass(), "lastPlayDate", "AcApCVcwZJ");
        setIntField(term261539, term261539.getClass(), "lastPlaceId", 463174911);
        setField(term261539, term261539.getClass(), "lastPlaceName", "GAfAdudsTc");
        setIntField(term261539, term261539.getClass(), "lastRegionId", -620459616);
        setField(term261539, term261539.getClass(), "lastRegionName", "vTQRVHEEmB");
        setIntField(term261539, term261539.getClass(), "lastAllNetId", 682190199);
        setField(term261539, term261539.getClass(), "lastClientId", "vJrTjupsCk");
        setIntField(term261539, term261539.getClass(), "lastUsedDeckId", -1682379076);
        setIntField(term261539, term261539.getClass(), "lastPlayMusicLevel", 994259344);
        setIntField(term261539, term261539.getClass(), "lastEmoneyBrand", -1427424428);
        setField(term261537, term261537.getClass(), "user", term261539);
        setIntField(term261537, term261537.getClass(), "sortNumber", -278748584);
        setIntField(term261537, term261537.getClass(), "placeId", -1834193100);
        setField(term261537, term261537.getClass(), "placeName", "guXghgolSm");
        setField(term261537, term261537.getClass(), "playDate", "SMGxdSkULI");
        setField(term261537, term261537.getClass(), "userPlayDate", "RMIhjBTBMG");
        setIntField(term261537, term261537.getClass(), "musicId", -2074763689);
        setIntField(term261537, term261537.getClass(), "level", -226564422);
        setIntField(term261537, term261537.getClass(), "playKind", -2112898804);
        setIntField(term261537, term261537.getClass(), "eventId", 1845963013);
        setField(term261537, term261537.getClass(), "eventName", "YHgYdYacoD");
        setIntField(term261537, term261537.getClass(), "eventPoint", 395416491);
        setIntField(term261537, term261537.getClass(), "playedUserId1", 752498302);
        setIntField(term261537, term261537.getClass(), "playedUserId2", 1000541485);
        setIntField(term261537, term261537.getClass(), "playedUserId3", 1590249777);
        setField(term261537, term261537.getClass(), "playedUserName1", "eNokNpUJyH");
        setField(term261537, term261537.getClass(), "playedUserName2", "VVCfLfrbwI");
        setField(term261537, term261537.getClass(), "playedUserName3", "pJBxuaCMAx");
        setIntField(term261537, term261537.getClass(), "playedMusicLevel1", -1635943696);
        setIntField(term261537, term261537.getClass(), "playedMusicLevel2", 2104695444);
        setIntField(term261537, term261537.getClass(), "playedMusicLevel3", -1440794507);
        setIntField(term261537, term261537.getClass(), "cardId1", 1693404841);
        setIntField(term261537, term261537.getClass(), "cardId2", 844829703);
        setIntField(term261537, term261537.getClass(), "cardId3", 1091087007);
        setIntField(term261537, term261537.getClass(), "cardLevel1", 1769359180);
        setIntField(term261537, term261537.getClass(), "cardLevel2", 1096535388);
        setIntField(term261537, term261537.getClass(), "cardLevel3", -1584065017);
        setIntField(term261537, term261537.getClass(), "cardAttack1", 1503808151);
        setIntField(term261537, term261537.getClass(), "cardAttack2", -1186485599);
        setIntField(term261537, term261537.getClass(), "cardAttack3", -1502880400);
        setIntField(term261537, term261537.getClass(), "bossCharaId", 93955884);
        setIntField(term261537, term261537.getClass(), "bossLevel", 1900672421);
        setIntField(term261537, term261537.getClass(), "bossAttribute", 128643836);
        setIntField(term261537, term261537.getClass(), "clearStatus", 1120713422);
        setIntField(term261537, term261537.getClass(), "techScore", -758128625);
        setIntField(term261537, term261537.getClass(), "techScoreRank", 1701172049);
        setIntField(term261537, term261537.getClass(), "battleScore", -679302956);
        setIntField(term261537, term261537.getClass(), "battleScoreRank", -2037557020);
        setIntField(term261537, term261537.getClass(), "platinumScore", -1132081641);
        setIntField(term261537, term261537.getClass(), "maxCombo", 70482654);
        setIntField(term261537, term261537.getClass(), "judgeMiss", 78894621);
        setIntField(term261537, term261537.getClass(), "judgeHit", -1060180315);
        setIntField(term261537, term261537.getClass(), "judgeBreak", -2103989969);
        setIntField(term261537, term261537.getClass(), "judgeCriticalBreak", 1898547444);
        setIntField(term261537, term261537.getClass(), "rateTap", 1498682661);
        setIntField(term261537, term261537.getClass(), "rateHold", -1994146092);
        setIntField(term261537, term261537.getClass(), "rateFlick", -1922551623);
        setIntField(term261537, term261537.getClass(), "rateSideTap", -97883265);
        setIntField(term261537, term261537.getClass(), "rateSideHold", -1515636576);
        setIntField(term261537, term261537.getClass(), "bellCount", -220487550);
        setIntField(term261537, term261537.getClass(), "totalBellCount", -640851007);
        setIntField(term261537, term261537.getClass(), "damageCount", 549291991);
        setIntField(term261537, term261537.getClass(), "overDamage", 1727193345);
        setBooleanField(term261537, term261537.getClass(), "isTechNewRecord", false);
        setBooleanField(term261537, term261537.getClass(), "isBattleNewRecord", true);
        setBooleanField(term261537, term261537.getClass(), "isOverDamageNewRecord", false);
        setBooleanField(term261537, term261537.getClass(), "isFullCombo", true);
        setBooleanField(term261537, term261537.getClass(), "isFullBell", true);
        setBooleanField(term261537, term261537.getClass(), "isAllBreak", false);
        setIntField(term261537, term261537.getClass(), "playerRating", 779226069);
        setIntField(term261537, term261537.getClass(), "battlePoint", 1360267381);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term261537, args);
    }

};


