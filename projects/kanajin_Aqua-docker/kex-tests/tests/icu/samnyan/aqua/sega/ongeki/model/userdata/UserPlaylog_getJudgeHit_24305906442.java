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

public class UserPlaylog_getJudgeHit_24305906442 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term207762;

    public UserPlaylog_getJudgeHit_24305906442() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term207768 = new Long(3931473624300151730L);
        term207762 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog"));
        Object term207764 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term207766 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term207782 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term207783 = newInstance(Class.forName("java.time.LocalDate"));
        Object term207787 = newInstance(Class.forName("java.time.LocalTime"));
        Object term207792 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term207793 = newInstance(Class.forName("java.time.LocalDate"));
        Object term207797 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term207762, term207762.getClass(), "id", 6568501727654064567L);
        setLongField(term207764, term207764.getClass(), "id", 351279025584289695L);
        setLongField(term207766, term207766.getClass(), "id", 4461616566482480930L);
        setField(term207766, term207766.getClass(), "extId", term207768);
        setField(term207766, term207766.getClass(), "luid", "yKOwtIGejO");
        setIntField(term207783, term207783.getClass(), "year", 2010);
        setShortField(term207783, term207783.getClass(), "month", (short) 4);
        setShortField(term207783, term207783.getClass(), "day", (short) 22);
        setField(term207782, term207782.getClass(), "date", term207783);
        setByteField(term207787, term207787.getClass(), "hour", (byte) 16);
        setByteField(term207787, term207787.getClass(), "minute", (byte) 6);
        setByteField(term207787, term207787.getClass(), "second", (byte) 12);
        setIntField(term207787, term207787.getClass(), "nano", 46820039);
        setField(term207782, term207782.getClass(), "time", term207787);
        setField(term207766, term207766.getClass(), "registerTime", term207782);
        setIntField(term207793, term207793.getClass(), "year", 2025);
        setShortField(term207793, term207793.getClass(), "month", (short) 10);
        setShortField(term207793, term207793.getClass(), "day", (short) 24);
        setField(term207792, term207792.getClass(), "date", term207793);
        setByteField(term207797, term207797.getClass(), "hour", (byte) 16);
        setByteField(term207797, term207797.getClass(), "minute", (byte) 37);
        setByteField(term207797, term207797.getClass(), "second", (byte) 14);
        setIntField(term207797, term207797.getClass(), "nano", 973421967);
        setField(term207792, term207792.getClass(), "time", term207797);
        setField(term207766, term207766.getClass(), "accessTime", term207792);
        setField(term207764, term207764.getClass(), "card", term207766);
        setField(term207764, term207764.getClass(), "userName", "eKWlJDvRzQ");
        setIntField(term207764, term207764.getClass(), "level", -663114662);
        setIntField(term207764, term207764.getClass(), "reincarnationNum", 1816340610);
        setLongField(term207764, term207764.getClass(), "exp", 3234389094474790303L);
        setLongField(term207764, term207764.getClass(), "point", 9007807794250938645L);
        setLongField(term207764, term207764.getClass(), "totalPoint", 8658777247847008159L);
        setIntField(term207764, term207764.getClass(), "playCount", -2106969244);
        setIntField(term207764, term207764.getClass(), "jewelCount", 1867730492);
        setIntField(term207764, term207764.getClass(), "totalJewelCount", 2124844100);
        setIntField(term207764, term207764.getClass(), "medalCount", 23858291);
        setIntField(term207764, term207764.getClass(), "playerRating", 59541663);
        setIntField(term207764, term207764.getClass(), "highestRating", -200802631);
        setIntField(term207764, term207764.getClass(), "battlePoint", 80749910);
        setIntField(term207764, term207764.getClass(), "bestBattlePoint", -1917030847);
        setIntField(term207764, term207764.getClass(), "overDamageBattlePoint", -1678066921);
        setBooleanField(term207764, term207764.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term207764, term207764.getClass(), "nameplateId", 1398239082);
        setIntField(term207764, term207764.getClass(), "trophyId", -822609904);
        setIntField(term207764, term207764.getClass(), "cardId", 1496179101);
        setIntField(term207764, term207764.getClass(), "characterId", -830145650);
        setIntField(term207764, term207764.getClass(), "characterVoiceNo", 163814430);
        setIntField(term207764, term207764.getClass(), "tabSetting", 118692552);
        setIntField(term207764, term207764.getClass(), "tabSortSetting", -99466254);
        setIntField(term207764, term207764.getClass(), "cardCategorySetting", -1474933209);
        setIntField(term207764, term207764.getClass(), "cardSortSetting", 257817118);
        setIntField(term207764, term207764.getClass(), "rivalScoreCategorySetting", 2037455054);
        setIntField(term207764, term207764.getClass(), "playedTutorialBit", -2037705033);
        setIntField(term207764, term207764.getClass(), "firstTutorialCancelNum", 673019945);
        setLongField(term207764, term207764.getClass(), "sumTechHighScore", 3273123371166375467L);
        setLongField(term207764, term207764.getClass(), "sumTechBasicHighScore", -6205677879514991907L);
        setLongField(term207764, term207764.getClass(), "sumTechAdvancedHighScore", 1929850772420268482L);
        setLongField(term207764, term207764.getClass(), "sumTechExpertHighScore", -5029412497698150722L);
        setLongField(term207764, term207764.getClass(), "sumTechMasterHighScore", -2199087486060229158L);
        setLongField(term207764, term207764.getClass(), "sumTechLunaticHighScore", -4073944005565232294L);
        setLongField(term207764, term207764.getClass(), "sumBattleHighScore", -6497624916602474685L);
        setLongField(term207764, term207764.getClass(), "sumBattleBasicHighScore", 6760544199192294462L);
        setLongField(term207764, term207764.getClass(), "sumBattleAdvancedHighScore", -6651079315330617353L);
        setLongField(term207764, term207764.getClass(), "sumBattleExpertHighScore", -6320752922130515092L);
        setLongField(term207764, term207764.getClass(), "sumBattleMasterHighScore", 1613162776657945540L);
        setLongField(term207764, term207764.getClass(), "sumBattleLunaticHighScore", -3877948757160556378L);
        setField(term207764, term207764.getClass(), "eventWatchedDate", "rCUCVDsyQP");
        setField(term207764, term207764.getClass(), "cmEventWatchedDate", "zjPsshCNVy");
        setField(term207764, term207764.getClass(), "firstGameId", "DRCHHWDnEN");
        setField(term207764, term207764.getClass(), "firstRomVersion", "EvkrAYYQdd");
        setField(term207764, term207764.getClass(), "firstDataVersion", "ecpuRvtEYD");
        setField(term207764, term207764.getClass(), "firstPlayDate", "DoOdWGphdi");
        setField(term207764, term207764.getClass(), "lastGameId", "oLrpPSByjw");
        setField(term207764, term207764.getClass(), "lastRomVersion", "SZgtAalZXH");
        setField(term207764, term207764.getClass(), "lastDataVersion", "yRAXrykXQM");
        setField(term207764, term207764.getClass(), "compatibleCmVersion", "XHZWMGtcXo");
        setField(term207764, term207764.getClass(), "lastPlayDate", "ofKwawJquL");
        setIntField(term207764, term207764.getClass(), "lastPlaceId", -1161638748);
        setField(term207764, term207764.getClass(), "lastPlaceName", "oXAHnAQLXO");
        setIntField(term207764, term207764.getClass(), "lastRegionId", 2056200144);
        setField(term207764, term207764.getClass(), "lastRegionName", "hRAbNXbihs");
        setIntField(term207764, term207764.getClass(), "lastAllNetId", -1167348988);
        setField(term207764, term207764.getClass(), "lastClientId", "pBhsNcDwjq");
        setIntField(term207764, term207764.getClass(), "lastUsedDeckId", 426804739);
        setIntField(term207764, term207764.getClass(), "lastPlayMusicLevel", -2012164979);
        setIntField(term207764, term207764.getClass(), "lastEmoneyBrand", -786030720);
        setField(term207762, term207762.getClass(), "user", term207764);
        setIntField(term207762, term207762.getClass(), "sortNumber", -1294339480);
        setIntField(term207762, term207762.getClass(), "placeId", -858509937);
        setField(term207762, term207762.getClass(), "placeName", "KlCILqBuzi");
        setField(term207762, term207762.getClass(), "playDate", "jrXwpZtXQd");
        setField(term207762, term207762.getClass(), "userPlayDate", "YiUhIkzvfS");
        setIntField(term207762, term207762.getClass(), "musicId", -1249437874);
        setIntField(term207762, term207762.getClass(), "level", 721993587);
        setIntField(term207762, term207762.getClass(), "playKind", -2115303175);
        setIntField(term207762, term207762.getClass(), "eventId", 958435482);
        setField(term207762, term207762.getClass(), "eventName", "bsUiwCzIyy");
        setIntField(term207762, term207762.getClass(), "eventPoint", -1013016284);
        setIntField(term207762, term207762.getClass(), "playedUserId1", 2102415180);
        setIntField(term207762, term207762.getClass(), "playedUserId2", 448122027);
        setIntField(term207762, term207762.getClass(), "playedUserId3", -1936645212);
        setField(term207762, term207762.getClass(), "playedUserName1", "lJgySfFWtA");
        setField(term207762, term207762.getClass(), "playedUserName2", "ErZOzqPTwr");
        setField(term207762, term207762.getClass(), "playedUserName3", "LDVdMfqhmz");
        setIntField(term207762, term207762.getClass(), "playedMusicLevel1", -770480497);
        setIntField(term207762, term207762.getClass(), "playedMusicLevel2", 379983129);
        setIntField(term207762, term207762.getClass(), "playedMusicLevel3", -215542299);
        setIntField(term207762, term207762.getClass(), "cardId1", 1063632099);
        setIntField(term207762, term207762.getClass(), "cardId2", -1851410176);
        setIntField(term207762, term207762.getClass(), "cardId3", -9921028);
        setIntField(term207762, term207762.getClass(), "cardLevel1", 159933777);
        setIntField(term207762, term207762.getClass(), "cardLevel2", -2049503346);
        setIntField(term207762, term207762.getClass(), "cardLevel3", 178356944);
        setIntField(term207762, term207762.getClass(), "cardAttack1", 1296233741);
        setIntField(term207762, term207762.getClass(), "cardAttack2", -1453122829);
        setIntField(term207762, term207762.getClass(), "cardAttack3", 1723930455);
        setIntField(term207762, term207762.getClass(), "bossCharaId", -172568972);
        setIntField(term207762, term207762.getClass(), "bossLevel", 952493182);
        setIntField(term207762, term207762.getClass(), "bossAttribute", -1820882307);
        setIntField(term207762, term207762.getClass(), "clearStatus", 1368012856);
        setIntField(term207762, term207762.getClass(), "techScore", 1989958895);
        setIntField(term207762, term207762.getClass(), "techScoreRank", 1509008640);
        setIntField(term207762, term207762.getClass(), "battleScore", -534740768);
        setIntField(term207762, term207762.getClass(), "battleScoreRank", 1760958066);
        setIntField(term207762, term207762.getClass(), "platinumScore", 26818439);
        setIntField(term207762, term207762.getClass(), "maxCombo", 1721802598);
        setIntField(term207762, term207762.getClass(), "judgeMiss", -1208938714);
        setIntField(term207762, term207762.getClass(), "judgeHit", -1241552174);
        setIntField(term207762, term207762.getClass(), "judgeBreak", 1571367099);
        setIntField(term207762, term207762.getClass(), "judgeCriticalBreak", -106290041);
        setIntField(term207762, term207762.getClass(), "rateTap", -1931235714);
        setIntField(term207762, term207762.getClass(), "rateHold", 1975801653);
        setIntField(term207762, term207762.getClass(), "rateFlick", -2017767309);
        setIntField(term207762, term207762.getClass(), "rateSideTap", 1167998823);
        setIntField(term207762, term207762.getClass(), "rateSideHold", -464580200);
        setIntField(term207762, term207762.getClass(), "bellCount", -599457969);
        setIntField(term207762, term207762.getClass(), "totalBellCount", -1479981191);
        setIntField(term207762, term207762.getClass(), "damageCount", -2140535400);
        setIntField(term207762, term207762.getClass(), "overDamage", -1606011085);
        setBooleanField(term207762, term207762.getClass(), "isTechNewRecord", false);
        setBooleanField(term207762, term207762.getClass(), "isBattleNewRecord", false);
        setBooleanField(term207762, term207762.getClass(), "isOverDamageNewRecord", false);
        setBooleanField(term207762, term207762.getClass(), "isFullCombo", false);
        setBooleanField(term207762, term207762.getClass(), "isFullBell", true);
        setBooleanField(term207762, term207762.getClass(), "isAllBreak", false);
        setIntField(term207762, term207762.getClass(), "playerRating", 460089767);
        setIntField(term207762, term207762.getClass(), "battlePoint", -243759577);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getJudgeHit", argTypes, term207762, args);
    }

};


