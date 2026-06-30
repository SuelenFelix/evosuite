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

public class UserPlaylog_setId_5012154562 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term220402;
     Object term220804;

    public UserPlaylog_setId_5012154562() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term220408 = new Long(2990264647913003810L);
        term220402 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog"));
        Object term220404 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term220406 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term220422 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term220423 = newInstance(Class.forName("java.time.LocalDate"));
        Object term220427 = newInstance(Class.forName("java.time.LocalTime"));
        Object term220432 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term220433 = newInstance(Class.forName("java.time.LocalDate"));
        Object term220437 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term220402, term220402.getClass(), "id", 5069719888200469631L);
        setLongField(term220404, term220404.getClass(), "id", 3451656753795950729L);
        setLongField(term220406, term220406.getClass(), "id", -2025271947530583319L);
        setField(term220406, term220406.getClass(), "extId", term220408);
        setField(term220406, term220406.getClass(), "luid", "NDbflWbnHO");
        setIntField(term220423, term220423.getClass(), "year", 2012);
        setShortField(term220423, term220423.getClass(), "month", (short) 6);
        setShortField(term220423, term220423.getClass(), "day", (short) 1);
        setField(term220422, term220422.getClass(), "date", term220423);
        setByteField(term220427, term220427.getClass(), "hour", (byte) 14);
        setByteField(term220427, term220427.getClass(), "minute", (byte) 57);
        setByteField(term220427, term220427.getClass(), "second", (byte) 0);
        setIntField(term220427, term220427.getClass(), "nano", 965303069);
        setField(term220422, term220422.getClass(), "time", term220427);
        setField(term220406, term220406.getClass(), "registerTime", term220422);
        setIntField(term220433, term220433.getClass(), "year", 2027);
        setShortField(term220433, term220433.getClass(), "month", (short) 1);
        setShortField(term220433, term220433.getClass(), "day", (short) 31);
        setField(term220432, term220432.getClass(), "date", term220433);
        setByteField(term220437, term220437.getClass(), "hour", (byte) 16);
        setByteField(term220437, term220437.getClass(), "minute", (byte) 7);
        setByteField(term220437, term220437.getClass(), "second", (byte) 38);
        setIntField(term220437, term220437.getClass(), "nano", 713069905);
        setField(term220432, term220432.getClass(), "time", term220437);
        setField(term220406, term220406.getClass(), "accessTime", term220432);
        setField(term220404, term220404.getClass(), "card", term220406);
        setField(term220404, term220404.getClass(), "userName", "fhexkFzkON");
        setIntField(term220404, term220404.getClass(), "level", -1193638033);
        setIntField(term220404, term220404.getClass(), "reincarnationNum", -2098104719);
        setLongField(term220404, term220404.getClass(), "exp", 4989432436602612061L);
        setLongField(term220404, term220404.getClass(), "point", 5187526989196108434L);
        setLongField(term220404, term220404.getClass(), "totalPoint", 8469386823554309861L);
        setIntField(term220404, term220404.getClass(), "playCount", -120776227);
        setIntField(term220404, term220404.getClass(), "jewelCount", 1294158309);
        setIntField(term220404, term220404.getClass(), "totalJewelCount", -784492931);
        setIntField(term220404, term220404.getClass(), "medalCount", -461250607);
        setIntField(term220404, term220404.getClass(), "playerRating", -2060857326);
        setIntField(term220404, term220404.getClass(), "highestRating", -1677905526);
        setIntField(term220404, term220404.getClass(), "battlePoint", -2005574071);
        setIntField(term220404, term220404.getClass(), "bestBattlePoint", -483684474);
        setIntField(term220404, term220404.getClass(), "overDamageBattlePoint", 610276196);
        setBooleanField(term220404, term220404.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term220404, term220404.getClass(), "nameplateId", 1105443366);
        setIntField(term220404, term220404.getClass(), "trophyId", 1211186370);
        setIntField(term220404, term220404.getClass(), "cardId", -885711997);
        setIntField(term220404, term220404.getClass(), "characterId", -1915339493);
        setIntField(term220404, term220404.getClass(), "characterVoiceNo", 1982163713);
        setIntField(term220404, term220404.getClass(), "tabSetting", -936235619);
        setIntField(term220404, term220404.getClass(), "tabSortSetting", -1737988954);
        setIntField(term220404, term220404.getClass(), "cardCategorySetting", -1112663214);
        setIntField(term220404, term220404.getClass(), "cardSortSetting", -1504730734);
        setIntField(term220404, term220404.getClass(), "rivalScoreCategorySetting", 2126788729);
        setIntField(term220404, term220404.getClass(), "playedTutorialBit", -1276455926);
        setIntField(term220404, term220404.getClass(), "firstTutorialCancelNum", 1918928310);
        setLongField(term220404, term220404.getClass(), "sumTechHighScore", 2664350413971897761L);
        setLongField(term220404, term220404.getClass(), "sumTechBasicHighScore", -5995726659766729424L);
        setLongField(term220404, term220404.getClass(), "sumTechAdvancedHighScore", 2739403678151874256L);
        setLongField(term220404, term220404.getClass(), "sumTechExpertHighScore", 1240724700809231052L);
        setLongField(term220404, term220404.getClass(), "sumTechMasterHighScore", -1414076659621334961L);
        setLongField(term220404, term220404.getClass(), "sumTechLunaticHighScore", 6458955920598156356L);
        setLongField(term220404, term220404.getClass(), "sumBattleHighScore", 6981892149075125479L);
        setLongField(term220404, term220404.getClass(), "sumBattleBasicHighScore", 7869195612574467049L);
        setLongField(term220404, term220404.getClass(), "sumBattleAdvancedHighScore", 2931307961626881889L);
        setLongField(term220404, term220404.getClass(), "sumBattleExpertHighScore", 2020069278494124501L);
        setLongField(term220404, term220404.getClass(), "sumBattleMasterHighScore", -8857346335490456537L);
        setLongField(term220404, term220404.getClass(), "sumBattleLunaticHighScore", -3447344224257007572L);
        setField(term220404, term220404.getClass(), "eventWatchedDate", "IqVjhRLumD");
        setField(term220404, term220404.getClass(), "cmEventWatchedDate", "xDWanrzIKS");
        setField(term220404, term220404.getClass(), "firstGameId", "ShXGmqyilA");
        setField(term220404, term220404.getClass(), "firstRomVersion", "MeUcNMgaea");
        setField(term220404, term220404.getClass(), "firstDataVersion", "VgoGzzzTIS");
        setField(term220404, term220404.getClass(), "firstPlayDate", "KejYXFChCQ");
        setField(term220404, term220404.getClass(), "lastGameId", "KovioHqXLs");
        setField(term220404, term220404.getClass(), "lastRomVersion", "rAnoDZpUvP");
        setField(term220404, term220404.getClass(), "lastDataVersion", "tPIaNOLEjH");
        setField(term220404, term220404.getClass(), "compatibleCmVersion", "hImewbCvKZ");
        setField(term220404, term220404.getClass(), "lastPlayDate", "eAvCoinDEL");
        setIntField(term220404, term220404.getClass(), "lastPlaceId", -708509459);
        setField(term220404, term220404.getClass(), "lastPlaceName", "VTFTvSdVnp");
        setIntField(term220404, term220404.getClass(), "lastRegionId", -757195452);
        setField(term220404, term220404.getClass(), "lastRegionName", "MiXdRkhjVA");
        setIntField(term220404, term220404.getClass(), "lastAllNetId", 1691064728);
        setField(term220404, term220404.getClass(), "lastClientId", "VFNmRuSuAA");
        setIntField(term220404, term220404.getClass(), "lastUsedDeckId", -302581106);
        setIntField(term220404, term220404.getClass(), "lastPlayMusicLevel", -569973638);
        setIntField(term220404, term220404.getClass(), "lastEmoneyBrand", 1315234524);
        setField(term220402, term220402.getClass(), "user", term220404);
        setIntField(term220402, term220402.getClass(), "sortNumber", -1608597532);
        setIntField(term220402, term220402.getClass(), "placeId", 80971770);
        setField(term220402, term220402.getClass(), "placeName", "kZarUDgTET");
        setField(term220402, term220402.getClass(), "playDate", "znhFQgvSYU");
        setField(term220402, term220402.getClass(), "userPlayDate", "mDNkQJxmYt");
        setIntField(term220402, term220402.getClass(), "musicId", 1477888487);
        setIntField(term220402, term220402.getClass(), "level", -960025607);
        setIntField(term220402, term220402.getClass(), "playKind", -610981578);
        setIntField(term220402, term220402.getClass(), "eventId", -63470209);
        setField(term220402, term220402.getClass(), "eventName", "xZNZPvTRXV");
        setIntField(term220402, term220402.getClass(), "eventPoint", -466622881);
        setIntField(term220402, term220402.getClass(), "playedUserId1", 1191081545);
        setIntField(term220402, term220402.getClass(), "playedUserId2", 1005504997);
        setIntField(term220402, term220402.getClass(), "playedUserId3", -1900158526);
        setField(term220402, term220402.getClass(), "playedUserName1", "ARslLYbNsq");
        setField(term220402, term220402.getClass(), "playedUserName2", "zUcrEiuHPJ");
        setField(term220402, term220402.getClass(), "playedUserName3", "rKTibRPvGg");
        setIntField(term220402, term220402.getClass(), "playedMusicLevel1", -1670882565);
        setIntField(term220402, term220402.getClass(), "playedMusicLevel2", -1505581092);
        setIntField(term220402, term220402.getClass(), "playedMusicLevel3", 547730411);
        setIntField(term220402, term220402.getClass(), "cardId1", 352716947);
        setIntField(term220402, term220402.getClass(), "cardId2", 1942797432);
        setIntField(term220402, term220402.getClass(), "cardId3", -190935358);
        setIntField(term220402, term220402.getClass(), "cardLevel1", -1392130122);
        setIntField(term220402, term220402.getClass(), "cardLevel2", 152610093);
        setIntField(term220402, term220402.getClass(), "cardLevel3", -1115692502);
        setIntField(term220402, term220402.getClass(), "cardAttack1", -128305422);
        setIntField(term220402, term220402.getClass(), "cardAttack2", -1647436228);
        setIntField(term220402, term220402.getClass(), "cardAttack3", 601867451);
        setIntField(term220402, term220402.getClass(), "bossCharaId", -241946575);
        setIntField(term220402, term220402.getClass(), "bossLevel", -1223017876);
        setIntField(term220402, term220402.getClass(), "bossAttribute", -424247215);
        setIntField(term220402, term220402.getClass(), "clearStatus", 832576798);
        setIntField(term220402, term220402.getClass(), "techScore", 1324536041);
        setIntField(term220402, term220402.getClass(), "techScoreRank", -1310625886);
        setIntField(term220402, term220402.getClass(), "battleScore", 1040482108);
        setIntField(term220402, term220402.getClass(), "battleScoreRank", 1962507245);
        setIntField(term220402, term220402.getClass(), "platinumScore", 905482662);
        setIntField(term220402, term220402.getClass(), "maxCombo", -166421996);
        setIntField(term220402, term220402.getClass(), "judgeMiss", -1157561721);
        setIntField(term220402, term220402.getClass(), "judgeHit", 1406181821);
        setIntField(term220402, term220402.getClass(), "judgeBreak", -38316383);
        setIntField(term220402, term220402.getClass(), "judgeCriticalBreak", 896926009);
        setIntField(term220402, term220402.getClass(), "rateTap", -405250282);
        setIntField(term220402, term220402.getClass(), "rateHold", -421196383);
        setIntField(term220402, term220402.getClass(), "rateFlick", -1052354004);
        setIntField(term220402, term220402.getClass(), "rateSideTap", -1509355099);
        setIntField(term220402, term220402.getClass(), "rateSideHold", 1568426874);
        setIntField(term220402, term220402.getClass(), "bellCount", 1878621428);
        setIntField(term220402, term220402.getClass(), "totalBellCount", -763712723);
        setIntField(term220402, term220402.getClass(), "damageCount", -953389977);
        setIntField(term220402, term220402.getClass(), "overDamage", 29377926);
        setBooleanField(term220402, term220402.getClass(), "isTechNewRecord", false);
        setBooleanField(term220402, term220402.getClass(), "isBattleNewRecord", false);
        setBooleanField(term220402, term220402.getClass(), "isOverDamageNewRecord", true);
        setBooleanField(term220402, term220402.getClass(), "isFullCombo", true);
        setBooleanField(term220402, term220402.getClass(), "isFullBell", true);
        setBooleanField(term220402, term220402.getClass(), "isAllBreak", true);
        setIntField(term220402, term220402.getClass(), "playerRating", 1268654933);
        setIntField(term220402, term220402.getClass(), "battlePoint", 1996791497);
        term220804 = new Long(510000788174840108L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term220804;
        callMethod(klass, "setId", argTypes, term220402, args);
    }

};


