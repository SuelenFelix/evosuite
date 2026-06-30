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

public class UserPlaylog_getLevel_8315159328 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term186274;

    public UserPlaylog_getLevel_8315159328() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term186280 = new Long(4811527754205378980L);
        term186274 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog"));
        Object term186276 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term186278 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term186294 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term186295 = newInstance(Class.forName("java.time.LocalDate"));
        Object term186299 = newInstance(Class.forName("java.time.LocalTime"));
        Object term186304 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term186305 = newInstance(Class.forName("java.time.LocalDate"));
        Object term186309 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term186274, term186274.getClass(), "id", -526295297238874082L);
        setLongField(term186276, term186276.getClass(), "id", 7118207130851662360L);
        setLongField(term186278, term186278.getClass(), "id", -7333602000853268873L);
        setField(term186278, term186278.getClass(), "extId", term186280);
        setField(term186278, term186278.getClass(), "luid", "CsezPlAELx");
        setIntField(term186295, term186295.getClass(), "year", 2023);
        setShortField(term186295, term186295.getClass(), "month", (short) 3);
        setShortField(term186295, term186295.getClass(), "day", (short) 26);
        setField(term186294, term186294.getClass(), "date", term186295);
        setByteField(term186299, term186299.getClass(), "hour", (byte) 7);
        setByteField(term186299, term186299.getClass(), "minute", (byte) 20);
        setByteField(term186299, term186299.getClass(), "second", (byte) 59);
        setIntField(term186299, term186299.getClass(), "nano", 990229662);
        setField(term186294, term186294.getClass(), "time", term186299);
        setField(term186278, term186278.getClass(), "registerTime", term186294);
        setIntField(term186305, term186305.getClass(), "year", 2028);
        setShortField(term186305, term186305.getClass(), "month", (short) 3);
        setShortField(term186305, term186305.getClass(), "day", (short) 16);
        setField(term186304, term186304.getClass(), "date", term186305);
        setByteField(term186309, term186309.getClass(), "hour", (byte) 3);
        setByteField(term186309, term186309.getClass(), "minute", (byte) 36);
        setByteField(term186309, term186309.getClass(), "second", (byte) 15);
        setIntField(term186309, term186309.getClass(), "nano", 536214083);
        setField(term186304, term186304.getClass(), "time", term186309);
        setField(term186278, term186278.getClass(), "accessTime", term186304);
        setField(term186276, term186276.getClass(), "card", term186278);
        setField(term186276, term186276.getClass(), "userName", "YTzeIhnRJF");
        setIntField(term186276, term186276.getClass(), "level", 1704390140);
        setIntField(term186276, term186276.getClass(), "reincarnationNum", 1542577034);
        setLongField(term186276, term186276.getClass(), "exp", 5324115370347537200L);
        setLongField(term186276, term186276.getClass(), "point", -1031690816663361709L);
        setLongField(term186276, term186276.getClass(), "totalPoint", -8704969733298716750L);
        setIntField(term186276, term186276.getClass(), "playCount", 1626193513);
        setIntField(term186276, term186276.getClass(), "jewelCount", -161988555);
        setIntField(term186276, term186276.getClass(), "totalJewelCount", 43440548);
        setIntField(term186276, term186276.getClass(), "medalCount", 4471197);
        setIntField(term186276, term186276.getClass(), "playerRating", 1738718362);
        setIntField(term186276, term186276.getClass(), "highestRating", 581835806);
        setIntField(term186276, term186276.getClass(), "battlePoint", -421243361);
        setIntField(term186276, term186276.getClass(), "bestBattlePoint", -1188968198);
        setIntField(term186276, term186276.getClass(), "overDamageBattlePoint", 1939849063);
        setBooleanField(term186276, term186276.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term186276, term186276.getClass(), "nameplateId", -748650486);
        setIntField(term186276, term186276.getClass(), "trophyId", 577034812);
        setIntField(term186276, term186276.getClass(), "cardId", 1899791293);
        setIntField(term186276, term186276.getClass(), "characterId", -12316989);
        setIntField(term186276, term186276.getClass(), "characterVoiceNo", 692299594);
        setIntField(term186276, term186276.getClass(), "tabSetting", 882243847);
        setIntField(term186276, term186276.getClass(), "tabSortSetting", -2058528763);
        setIntField(term186276, term186276.getClass(), "cardCategorySetting", -1748699477);
        setIntField(term186276, term186276.getClass(), "cardSortSetting", -1325011408);
        setIntField(term186276, term186276.getClass(), "rivalScoreCategorySetting", 50151279);
        setIntField(term186276, term186276.getClass(), "playedTutorialBit", -1106846011);
        setIntField(term186276, term186276.getClass(), "firstTutorialCancelNum", -1120397462);
        setLongField(term186276, term186276.getClass(), "sumTechHighScore", -3384354359532522329L);
        setLongField(term186276, term186276.getClass(), "sumTechBasicHighScore", 2388267345399324768L);
        setLongField(term186276, term186276.getClass(), "sumTechAdvancedHighScore", 320740926381311842L);
        setLongField(term186276, term186276.getClass(), "sumTechExpertHighScore", -3923648646183771872L);
        setLongField(term186276, term186276.getClass(), "sumTechMasterHighScore", -385192334019668780L);
        setLongField(term186276, term186276.getClass(), "sumTechLunaticHighScore", 8841131133960236803L);
        setLongField(term186276, term186276.getClass(), "sumBattleHighScore", -7441555227944374707L);
        setLongField(term186276, term186276.getClass(), "sumBattleBasicHighScore", 1333815261980166786L);
        setLongField(term186276, term186276.getClass(), "sumBattleAdvancedHighScore", -2216846611014871291L);
        setLongField(term186276, term186276.getClass(), "sumBattleExpertHighScore", 2388734666140215817L);
        setLongField(term186276, term186276.getClass(), "sumBattleMasterHighScore", 8399679939883897915L);
        setLongField(term186276, term186276.getClass(), "sumBattleLunaticHighScore", 8115609489953325241L);
        setField(term186276, term186276.getClass(), "eventWatchedDate", "PtKdjHiCdR");
        setField(term186276, term186276.getClass(), "cmEventWatchedDate", "DhqiNYcpwz");
        setField(term186276, term186276.getClass(), "firstGameId", "fucEyubzVO");
        setField(term186276, term186276.getClass(), "firstRomVersion", "VQZBPbMvYQ");
        setField(term186276, term186276.getClass(), "firstDataVersion", "oHSwzbCFmL");
        setField(term186276, term186276.getClass(), "firstPlayDate", "MferVdTtqd");
        setField(term186276, term186276.getClass(), "lastGameId", "UTLozPBird");
        setField(term186276, term186276.getClass(), "lastRomVersion", "CygCjfEdOl");
        setField(term186276, term186276.getClass(), "lastDataVersion", "wImPNGQXmB");
        setField(term186276, term186276.getClass(), "compatibleCmVersion", "CJvQvpTlhn");
        setField(term186276, term186276.getClass(), "lastPlayDate", "ToDZTHWcWm");
        setIntField(term186276, term186276.getClass(), "lastPlaceId", 39917319);
        setField(term186276, term186276.getClass(), "lastPlaceName", "stEQoDImRV");
        setIntField(term186276, term186276.getClass(), "lastRegionId", 235259945);
        setField(term186276, term186276.getClass(), "lastRegionName", "mQlNexCpvc");
        setIntField(term186276, term186276.getClass(), "lastAllNetId", -209966116);
        setField(term186276, term186276.getClass(), "lastClientId", "afdMUXeCXp");
        setIntField(term186276, term186276.getClass(), "lastUsedDeckId", -21236200);
        setIntField(term186276, term186276.getClass(), "lastPlayMusicLevel", -521770429);
        setIntField(term186276, term186276.getClass(), "lastEmoneyBrand", -1798788652);
        setField(term186274, term186274.getClass(), "user", term186276);
        setIntField(term186274, term186274.getClass(), "sortNumber", 496765794);
        setIntField(term186274, term186274.getClass(), "placeId", 427463011);
        setField(term186274, term186274.getClass(), "placeName", "raSUkLBDic");
        setField(term186274, term186274.getClass(), "playDate", "kkhrNXKLUh");
        setField(term186274, term186274.getClass(), "userPlayDate", "NbsoEyxgdC");
        setIntField(term186274, term186274.getClass(), "musicId", -563075591);
        setIntField(term186274, term186274.getClass(), "level", 7054174);
        setIntField(term186274, term186274.getClass(), "playKind", -1097711548);
        setIntField(term186274, term186274.getClass(), "eventId", -1430651247);
        setField(term186274, term186274.getClass(), "eventName", "ycLbhblhxr");
        setIntField(term186274, term186274.getClass(), "eventPoint", 1358295184);
        setIntField(term186274, term186274.getClass(), "playedUserId1", 1150528165);
        setIntField(term186274, term186274.getClass(), "playedUserId2", -1763338222);
        setIntField(term186274, term186274.getClass(), "playedUserId3", 99308229);
        setField(term186274, term186274.getClass(), "playedUserName1", "TeMgqKBBmJ");
        setField(term186274, term186274.getClass(), "playedUserName2", "NMKQfAoNiL");
        setField(term186274, term186274.getClass(), "playedUserName3", "QkEnJzkqzt");
        setIntField(term186274, term186274.getClass(), "playedMusicLevel1", -550944071);
        setIntField(term186274, term186274.getClass(), "playedMusicLevel2", -1977663135);
        setIntField(term186274, term186274.getClass(), "playedMusicLevel3", -1186797545);
        setIntField(term186274, term186274.getClass(), "cardId1", -1477944192);
        setIntField(term186274, term186274.getClass(), "cardId2", -2078671716);
        setIntField(term186274, term186274.getClass(), "cardId3", 1043772480);
        setIntField(term186274, term186274.getClass(), "cardLevel1", -95270998);
        setIntField(term186274, term186274.getClass(), "cardLevel2", 76869994);
        setIntField(term186274, term186274.getClass(), "cardLevel3", -1317889453);
        setIntField(term186274, term186274.getClass(), "cardAttack1", -1342265262);
        setIntField(term186274, term186274.getClass(), "cardAttack2", -1862984765);
        setIntField(term186274, term186274.getClass(), "cardAttack3", -2078223278);
        setIntField(term186274, term186274.getClass(), "bossCharaId", -589382757);
        setIntField(term186274, term186274.getClass(), "bossLevel", -1793353049);
        setIntField(term186274, term186274.getClass(), "bossAttribute", -1977563184);
        setIntField(term186274, term186274.getClass(), "clearStatus", 762541939);
        setIntField(term186274, term186274.getClass(), "techScore", -282725688);
        setIntField(term186274, term186274.getClass(), "techScoreRank", -822397387);
        setIntField(term186274, term186274.getClass(), "battleScore", -1837951031);
        setIntField(term186274, term186274.getClass(), "battleScoreRank", -199549191);
        setIntField(term186274, term186274.getClass(), "platinumScore", -1783623943);
        setIntField(term186274, term186274.getClass(), "maxCombo", 2059576319);
        setIntField(term186274, term186274.getClass(), "judgeMiss", -203769983);
        setIntField(term186274, term186274.getClass(), "judgeHit", -307419197);
        setIntField(term186274, term186274.getClass(), "judgeBreak", -1329113715);
        setIntField(term186274, term186274.getClass(), "judgeCriticalBreak", -233883276);
        setIntField(term186274, term186274.getClass(), "rateTap", -2139141313);
        setIntField(term186274, term186274.getClass(), "rateHold", -585271703);
        setIntField(term186274, term186274.getClass(), "rateFlick", 88104661);
        setIntField(term186274, term186274.getClass(), "rateSideTap", -844551916);
        setIntField(term186274, term186274.getClass(), "rateSideHold", 1387920781);
        setIntField(term186274, term186274.getClass(), "bellCount", -697347457);
        setIntField(term186274, term186274.getClass(), "totalBellCount", -294221302);
        setIntField(term186274, term186274.getClass(), "damageCount", -81913511);
        setIntField(term186274, term186274.getClass(), "overDamage", -1247242673);
        setBooleanField(term186274, term186274.getClass(), "isTechNewRecord", true);
        setBooleanField(term186274, term186274.getClass(), "isBattleNewRecord", true);
        setBooleanField(term186274, term186274.getClass(), "isOverDamageNewRecord", true);
        setBooleanField(term186274, term186274.getClass(), "isFullCombo", false);
        setBooleanField(term186274, term186274.getClass(), "isFullBell", false);
        setBooleanField(term186274, term186274.getClass(), "isAllBreak", false);
        setIntField(term186274, term186274.getClass(), "playerRating", 176304667);
        setIntField(term186274, term186274.getClass(), "battlePoint", 956775553);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLevel", argTypes, term186274, args);
    }

};


