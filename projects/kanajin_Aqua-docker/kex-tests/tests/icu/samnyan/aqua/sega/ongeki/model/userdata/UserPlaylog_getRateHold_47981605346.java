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

public class UserPlaylog_getRateHold_47981605346 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term210290;

    public UserPlaylog_getRateHold_47981605346() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term210296 = new Long(3423155413133381764L);
        term210290 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog"));
        Object term210292 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term210294 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term210310 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term210311 = newInstance(Class.forName("java.time.LocalDate"));
        Object term210315 = newInstance(Class.forName("java.time.LocalTime"));
        Object term210320 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term210321 = newInstance(Class.forName("java.time.LocalDate"));
        Object term210325 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term210290, term210290.getClass(), "id", 5903804105618179668L);
        setLongField(term210292, term210292.getClass(), "id", -2498276214793133202L);
        setLongField(term210294, term210294.getClass(), "id", -725268474647298062L);
        setField(term210294, term210294.getClass(), "extId", term210296);
        setField(term210294, term210294.getClass(), "luid", "zNPOnpEodJ");
        setIntField(term210311, term210311.getClass(), "year", 2011);
        setShortField(term210311, term210311.getClass(), "month", (short) 6);
        setShortField(term210311, term210311.getClass(), "day", (short) 27);
        setField(term210310, term210310.getClass(), "date", term210311);
        setByteField(term210315, term210315.getClass(), "hour", (byte) 12);
        setByteField(term210315, term210315.getClass(), "minute", (byte) 48);
        setByteField(term210315, term210315.getClass(), "second", (byte) 45);
        setIntField(term210315, term210315.getClass(), "nano", 332145929);
        setField(term210310, term210310.getClass(), "time", term210315);
        setField(term210294, term210294.getClass(), "registerTime", term210310);
        setIntField(term210321, term210321.getClass(), "year", 2020);
        setShortField(term210321, term210321.getClass(), "month", (short) 4);
        setShortField(term210321, term210321.getClass(), "day", (short) 29);
        setField(term210320, term210320.getClass(), "date", term210321);
        setByteField(term210325, term210325.getClass(), "hour", (byte) 2);
        setByteField(term210325, term210325.getClass(), "minute", (byte) 54);
        setByteField(term210325, term210325.getClass(), "second", (byte) 2);
        setIntField(term210325, term210325.getClass(), "nano", 314066531);
        setField(term210320, term210320.getClass(), "time", term210325);
        setField(term210294, term210294.getClass(), "accessTime", term210320);
        setField(term210292, term210292.getClass(), "card", term210294);
        setField(term210292, term210292.getClass(), "userName", "KVzirWEvHZ");
        setIntField(term210292, term210292.getClass(), "level", -1097669979);
        setIntField(term210292, term210292.getClass(), "reincarnationNum", -1780432495);
        setLongField(term210292, term210292.getClass(), "exp", -3707817774967982614L);
        setLongField(term210292, term210292.getClass(), "point", -2618064367065041623L);
        setLongField(term210292, term210292.getClass(), "totalPoint", 3545313331444450667L);
        setIntField(term210292, term210292.getClass(), "playCount", 428202681);
        setIntField(term210292, term210292.getClass(), "jewelCount", 1573860785);
        setIntField(term210292, term210292.getClass(), "totalJewelCount", -774422538);
        setIntField(term210292, term210292.getClass(), "medalCount", 1066017141);
        setIntField(term210292, term210292.getClass(), "playerRating", -338312520);
        setIntField(term210292, term210292.getClass(), "highestRating", -1944265950);
        setIntField(term210292, term210292.getClass(), "battlePoint", -1587031240);
        setIntField(term210292, term210292.getClass(), "bestBattlePoint", -1989664257);
        setIntField(term210292, term210292.getClass(), "overDamageBattlePoint", -1910664616);
        setBooleanField(term210292, term210292.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term210292, term210292.getClass(), "nameplateId", 487482309);
        setIntField(term210292, term210292.getClass(), "trophyId", -579808690);
        setIntField(term210292, term210292.getClass(), "cardId", -1713470455);
        setIntField(term210292, term210292.getClass(), "characterId", 216514040);
        setIntField(term210292, term210292.getClass(), "characterVoiceNo", 1192613481);
        setIntField(term210292, term210292.getClass(), "tabSetting", -904848351);
        setIntField(term210292, term210292.getClass(), "tabSortSetting", 381787538);
        setIntField(term210292, term210292.getClass(), "cardCategorySetting", 1698188292);
        setIntField(term210292, term210292.getClass(), "cardSortSetting", -602012601);
        setIntField(term210292, term210292.getClass(), "rivalScoreCategorySetting", 1074862789);
        setIntField(term210292, term210292.getClass(), "playedTutorialBit", 1938881305);
        setIntField(term210292, term210292.getClass(), "firstTutorialCancelNum", 300219839);
        setLongField(term210292, term210292.getClass(), "sumTechHighScore", -4485511773179909125L);
        setLongField(term210292, term210292.getClass(), "sumTechBasicHighScore", 1684776441978088250L);
        setLongField(term210292, term210292.getClass(), "sumTechAdvancedHighScore", -2370282564890755906L);
        setLongField(term210292, term210292.getClass(), "sumTechExpertHighScore", -3111969917356721438L);
        setLongField(term210292, term210292.getClass(), "sumTechMasterHighScore", -4369446332524462849L);
        setLongField(term210292, term210292.getClass(), "sumTechLunaticHighScore", -4076354806040198742L);
        setLongField(term210292, term210292.getClass(), "sumBattleHighScore", 4503567429162710179L);
        setLongField(term210292, term210292.getClass(), "sumBattleBasicHighScore", 8989619984036117087L);
        setLongField(term210292, term210292.getClass(), "sumBattleAdvancedHighScore", -7101236687699541681L);
        setLongField(term210292, term210292.getClass(), "sumBattleExpertHighScore", 819603696208787798L);
        setLongField(term210292, term210292.getClass(), "sumBattleMasterHighScore", -6680542577814189047L);
        setLongField(term210292, term210292.getClass(), "sumBattleLunaticHighScore", -1844628132482657104L);
        setField(term210292, term210292.getClass(), "eventWatchedDate", "MEuRnwyHJN");
        setField(term210292, term210292.getClass(), "cmEventWatchedDate", "mXAcZWCaIl");
        setField(term210292, term210292.getClass(), "firstGameId", "wxQIQXYisx");
        setField(term210292, term210292.getClass(), "firstRomVersion", "PtuPKKkQqS");
        setField(term210292, term210292.getClass(), "firstDataVersion", "kgVwdNODbO");
        setField(term210292, term210292.getClass(), "firstPlayDate", "yEORGYKBvc");
        setField(term210292, term210292.getClass(), "lastGameId", "vgSfMyOiip");
        setField(term210292, term210292.getClass(), "lastRomVersion", "nsBmlIaWyH");
        setField(term210292, term210292.getClass(), "lastDataVersion", "UOdzdFoNYj");
        setField(term210292, term210292.getClass(), "compatibleCmVersion", "ZwBPdbsbRN");
        setField(term210292, term210292.getClass(), "lastPlayDate", "IQnlZuBQxZ");
        setIntField(term210292, term210292.getClass(), "lastPlaceId", 962854007);
        setField(term210292, term210292.getClass(), "lastPlaceName", "hzcJWOOcer");
        setIntField(term210292, term210292.getClass(), "lastRegionId", 824386522);
        setField(term210292, term210292.getClass(), "lastRegionName", "yaNlisVBqV");
        setIntField(term210292, term210292.getClass(), "lastAllNetId", -1414905297);
        setField(term210292, term210292.getClass(), "lastClientId", "VimZthzAjg");
        setIntField(term210292, term210292.getClass(), "lastUsedDeckId", 1128316994);
        setIntField(term210292, term210292.getClass(), "lastPlayMusicLevel", -1431321947);
        setIntField(term210292, term210292.getClass(), "lastEmoneyBrand", 1629420340);
        setField(term210290, term210290.getClass(), "user", term210292);
        setIntField(term210290, term210290.getClass(), "sortNumber", 1060055367);
        setIntField(term210290, term210290.getClass(), "placeId", 2032052675);
        setField(term210290, term210290.getClass(), "placeName", "pjAQQPoGVc");
        setField(term210290, term210290.getClass(), "playDate", "EadswYFxjJ");
        setField(term210290, term210290.getClass(), "userPlayDate", "VMvmHcwAPc");
        setIntField(term210290, term210290.getClass(), "musicId", 534068484);
        setIntField(term210290, term210290.getClass(), "level", 2023775166);
        setIntField(term210290, term210290.getClass(), "playKind", 2041747664);
        setIntField(term210290, term210290.getClass(), "eventId", -55507174);
        setField(term210290, term210290.getClass(), "eventName", "hTygVULtJv");
        setIntField(term210290, term210290.getClass(), "eventPoint", 1686211970);
        setIntField(term210290, term210290.getClass(), "playedUserId1", -1718965606);
        setIntField(term210290, term210290.getClass(), "playedUserId2", 1584286085);
        setIntField(term210290, term210290.getClass(), "playedUserId3", 1829584257);
        setField(term210290, term210290.getClass(), "playedUserName1", "WHPjgbWEQW");
        setField(term210290, term210290.getClass(), "playedUserName2", "OXBxOEoBXG");
        setField(term210290, term210290.getClass(), "playedUserName3", "qunJPciJWS");
        setIntField(term210290, term210290.getClass(), "playedMusicLevel1", -1981265348);
        setIntField(term210290, term210290.getClass(), "playedMusicLevel2", -1586349939);
        setIntField(term210290, term210290.getClass(), "playedMusicLevel3", -2147257341);
        setIntField(term210290, term210290.getClass(), "cardId1", -295336805);
        setIntField(term210290, term210290.getClass(), "cardId2", -752400077);
        setIntField(term210290, term210290.getClass(), "cardId3", 1527625114);
        setIntField(term210290, term210290.getClass(), "cardLevel1", -824285797);
        setIntField(term210290, term210290.getClass(), "cardLevel2", -1919566665);
        setIntField(term210290, term210290.getClass(), "cardLevel3", 527364928);
        setIntField(term210290, term210290.getClass(), "cardAttack1", -52905236);
        setIntField(term210290, term210290.getClass(), "cardAttack2", 1652428393);
        setIntField(term210290, term210290.getClass(), "cardAttack3", -1884232363);
        setIntField(term210290, term210290.getClass(), "bossCharaId", -1687662011);
        setIntField(term210290, term210290.getClass(), "bossLevel", -1841656072);
        setIntField(term210290, term210290.getClass(), "bossAttribute", 475913381);
        setIntField(term210290, term210290.getClass(), "clearStatus", -200214552);
        setIntField(term210290, term210290.getClass(), "techScore", 87117477);
        setIntField(term210290, term210290.getClass(), "techScoreRank", -871200798);
        setIntField(term210290, term210290.getClass(), "battleScore", 5339448);
        setIntField(term210290, term210290.getClass(), "battleScoreRank", -1354552611);
        setIntField(term210290, term210290.getClass(), "platinumScore", 1188745205);
        setIntField(term210290, term210290.getClass(), "maxCombo", 1472049184);
        setIntField(term210290, term210290.getClass(), "judgeMiss", 1392982418);
        setIntField(term210290, term210290.getClass(), "judgeHit", -1572413221);
        setIntField(term210290, term210290.getClass(), "judgeBreak", -774130445);
        setIntField(term210290, term210290.getClass(), "judgeCriticalBreak", 1186959709);
        setIntField(term210290, term210290.getClass(), "rateTap", 627006138);
        setIntField(term210290, term210290.getClass(), "rateHold", 473286732);
        setIntField(term210290, term210290.getClass(), "rateFlick", 1705432758);
        setIntField(term210290, term210290.getClass(), "rateSideTap", 1869760927);
        setIntField(term210290, term210290.getClass(), "rateSideHold", 1737709990);
        setIntField(term210290, term210290.getClass(), "bellCount", -1596985572);
        setIntField(term210290, term210290.getClass(), "totalBellCount", -1547597017);
        setIntField(term210290, term210290.getClass(), "damageCount", -1899999573);
        setIntField(term210290, term210290.getClass(), "overDamage", 50986188);
        setBooleanField(term210290, term210290.getClass(), "isTechNewRecord", false);
        setBooleanField(term210290, term210290.getClass(), "isBattleNewRecord", false);
        setBooleanField(term210290, term210290.getClass(), "isOverDamageNewRecord", false);
        setBooleanField(term210290, term210290.getClass(), "isFullCombo", true);
        setBooleanField(term210290, term210290.getClass(), "isFullBell", true);
        setBooleanField(term210290, term210290.getClass(), "isAllBreak", false);
        setIntField(term210290, term210290.getClass(), "playerRating", -1798385983);
        setIntField(term210290, term210290.getClass(), "battlePoint", -1751426385);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRateHold", argTypes, term210290, args);
    }

};


