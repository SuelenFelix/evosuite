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

public class UserPlaylog_getRateTap_174190188545 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term209658;

    public UserPlaylog_getRateTap_174190188545() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term209664 = new Long(5304481534735378567L);
        term209658 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog"));
        Object term209660 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term209662 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term209678 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term209679 = newInstance(Class.forName("java.time.LocalDate"));
        Object term209683 = newInstance(Class.forName("java.time.LocalTime"));
        Object term209688 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term209689 = newInstance(Class.forName("java.time.LocalDate"));
        Object term209693 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term209658, term209658.getClass(), "id", -6805474568319731987L);
        setLongField(term209660, term209660.getClass(), "id", 9185310332814987599L);
        setLongField(term209662, term209662.getClass(), "id", -4736884397729166623L);
        setField(term209662, term209662.getClass(), "extId", term209664);
        setField(term209662, term209662.getClass(), "luid", "RIZmTXYeSJ");
        setIntField(term209679, term209679.getClass(), "year", 2014);
        setShortField(term209679, term209679.getClass(), "month", (short) 6);
        setShortField(term209679, term209679.getClass(), "day", (short) 26);
        setField(term209678, term209678.getClass(), "date", term209679);
        setByteField(term209683, term209683.getClass(), "hour", (byte) 23);
        setByteField(term209683, term209683.getClass(), "minute", (byte) 29);
        setByteField(term209683, term209683.getClass(), "second", (byte) 42);
        setIntField(term209683, term209683.getClass(), "nano", 792765324);
        setField(term209678, term209678.getClass(), "time", term209683);
        setField(term209662, term209662.getClass(), "registerTime", term209678);
        setIntField(term209689, term209689.getClass(), "year", 2019);
        setShortField(term209689, term209689.getClass(), "month", (short) 3);
        setShortField(term209689, term209689.getClass(), "day", (short) 23);
        setField(term209688, term209688.getClass(), "date", term209689);
        setByteField(term209693, term209693.getClass(), "hour", (byte) 1);
        setByteField(term209693, term209693.getClass(), "minute", (byte) 15);
        setByteField(term209693, term209693.getClass(), "second", (byte) 57);
        setIntField(term209693, term209693.getClass(), "nano", 53985671);
        setField(term209688, term209688.getClass(), "time", term209693);
        setField(term209662, term209662.getClass(), "accessTime", term209688);
        setField(term209660, term209660.getClass(), "card", term209662);
        setField(term209660, term209660.getClass(), "userName", "oNrGulyKDD");
        setIntField(term209660, term209660.getClass(), "level", 101565487);
        setIntField(term209660, term209660.getClass(), "reincarnationNum", -1974519039);
        setLongField(term209660, term209660.getClass(), "exp", -3609033843305859408L);
        setLongField(term209660, term209660.getClass(), "point", 7683219852267031953L);
        setLongField(term209660, term209660.getClass(), "totalPoint", 5436897249263218091L);
        setIntField(term209660, term209660.getClass(), "playCount", 2093268279);
        setIntField(term209660, term209660.getClass(), "jewelCount", -197188292);
        setIntField(term209660, term209660.getClass(), "totalJewelCount", 1982258363);
        setIntField(term209660, term209660.getClass(), "medalCount", -2134281126);
        setIntField(term209660, term209660.getClass(), "playerRating", -1023001269);
        setIntField(term209660, term209660.getClass(), "highestRating", 2123871728);
        setIntField(term209660, term209660.getClass(), "battlePoint", 687921602);
        setIntField(term209660, term209660.getClass(), "bestBattlePoint", -848859060);
        setIntField(term209660, term209660.getClass(), "overDamageBattlePoint", 276568220);
        setBooleanField(term209660, term209660.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term209660, term209660.getClass(), "nameplateId", -434766528);
        setIntField(term209660, term209660.getClass(), "trophyId", 1954430952);
        setIntField(term209660, term209660.getClass(), "cardId", 1603606390);
        setIntField(term209660, term209660.getClass(), "characterId", -234709686);
        setIntField(term209660, term209660.getClass(), "characterVoiceNo", -550885989);
        setIntField(term209660, term209660.getClass(), "tabSetting", 1661591466);
        setIntField(term209660, term209660.getClass(), "tabSortSetting", -375409691);
        setIntField(term209660, term209660.getClass(), "cardCategorySetting", 975944827);
        setIntField(term209660, term209660.getClass(), "cardSortSetting", 880513984);
        setIntField(term209660, term209660.getClass(), "rivalScoreCategorySetting", -846950202);
        setIntField(term209660, term209660.getClass(), "playedTutorialBit", -109407576);
        setIntField(term209660, term209660.getClass(), "firstTutorialCancelNum", -2104308132);
        setLongField(term209660, term209660.getClass(), "sumTechHighScore", 8349674341135166190L);
        setLongField(term209660, term209660.getClass(), "sumTechBasicHighScore", 2449024892212706402L);
        setLongField(term209660, term209660.getClass(), "sumTechAdvancedHighScore", 3977735853853030523L);
        setLongField(term209660, term209660.getClass(), "sumTechExpertHighScore", -7540555705838845232L);
        setLongField(term209660, term209660.getClass(), "sumTechMasterHighScore", -6985725007546263573L);
        setLongField(term209660, term209660.getClass(), "sumTechLunaticHighScore", -1650621820741347317L);
        setLongField(term209660, term209660.getClass(), "sumBattleHighScore", 461946014443413513L);
        setLongField(term209660, term209660.getClass(), "sumBattleBasicHighScore", 2569080328178972616L);
        setLongField(term209660, term209660.getClass(), "sumBattleAdvancedHighScore", -615536300700028969L);
        setLongField(term209660, term209660.getClass(), "sumBattleExpertHighScore", 370944316023964708L);
        setLongField(term209660, term209660.getClass(), "sumBattleMasterHighScore", 3500779314636148730L);
        setLongField(term209660, term209660.getClass(), "sumBattleLunaticHighScore", -3742975059358998623L);
        setField(term209660, term209660.getClass(), "eventWatchedDate", "LsZMMPfJyo");
        setField(term209660, term209660.getClass(), "cmEventWatchedDate", "DIjPJLZkuN");
        setField(term209660, term209660.getClass(), "firstGameId", "mFGvDIAaPV");
        setField(term209660, term209660.getClass(), "firstRomVersion", "tSBiNpJBCG");
        setField(term209660, term209660.getClass(), "firstDataVersion", "NoJsnVjWEQ");
        setField(term209660, term209660.getClass(), "firstPlayDate", "ZgJlwtRyss");
        setField(term209660, term209660.getClass(), "lastGameId", "jaUSNGgyPJ");
        setField(term209660, term209660.getClass(), "lastRomVersion", "XxDHAdmCbo");
        setField(term209660, term209660.getClass(), "lastDataVersion", "HoItLNtiRa");
        setField(term209660, term209660.getClass(), "compatibleCmVersion", "yVwIDSErFo");
        setField(term209660, term209660.getClass(), "lastPlayDate", "qChIJomfix");
        setIntField(term209660, term209660.getClass(), "lastPlaceId", 1163850867);
        setField(term209660, term209660.getClass(), "lastPlaceName", "GPbvtEgxWl");
        setIntField(term209660, term209660.getClass(), "lastRegionId", -37175334);
        setField(term209660, term209660.getClass(), "lastRegionName", "KleXGbqLCZ");
        setIntField(term209660, term209660.getClass(), "lastAllNetId", 657697442);
        setField(term209660, term209660.getClass(), "lastClientId", "lHPixZLDIw");
        setIntField(term209660, term209660.getClass(), "lastUsedDeckId", 1692013158);
        setIntField(term209660, term209660.getClass(), "lastPlayMusicLevel", 1102246253);
        setIntField(term209660, term209660.getClass(), "lastEmoneyBrand", -551112117);
        setField(term209658, term209658.getClass(), "user", term209660);
        setIntField(term209658, term209658.getClass(), "sortNumber", -1391764319);
        setIntField(term209658, term209658.getClass(), "placeId", -37130270);
        setField(term209658, term209658.getClass(), "placeName", "VgDpsGWncx");
        setField(term209658, term209658.getClass(), "playDate", "ZptVUzLPCw");
        setField(term209658, term209658.getClass(), "userPlayDate", "PhxaskGUox");
        setIntField(term209658, term209658.getClass(), "musicId", -1868643949);
        setIntField(term209658, term209658.getClass(), "level", -83450776);
        setIntField(term209658, term209658.getClass(), "playKind", -1598054225);
        setIntField(term209658, term209658.getClass(), "eventId", 2121939630);
        setField(term209658, term209658.getClass(), "eventName", "PqySjixIoc");
        setIntField(term209658, term209658.getClass(), "eventPoint", 1336739947);
        setIntField(term209658, term209658.getClass(), "playedUserId1", 1393305038);
        setIntField(term209658, term209658.getClass(), "playedUserId2", 2110534824);
        setIntField(term209658, term209658.getClass(), "playedUserId3", -67895231);
        setField(term209658, term209658.getClass(), "playedUserName1", "QCJXeGbEor");
        setField(term209658, term209658.getClass(), "playedUserName2", "TwCbrCjzwL");
        setField(term209658, term209658.getClass(), "playedUserName3", "hOZqhvhcjq");
        setIntField(term209658, term209658.getClass(), "playedMusicLevel1", 275822795);
        setIntField(term209658, term209658.getClass(), "playedMusicLevel2", 1508399117);
        setIntField(term209658, term209658.getClass(), "playedMusicLevel3", -228155380);
        setIntField(term209658, term209658.getClass(), "cardId1", -2124766997);
        setIntField(term209658, term209658.getClass(), "cardId2", 1133047506);
        setIntField(term209658, term209658.getClass(), "cardId3", 2126443403);
        setIntField(term209658, term209658.getClass(), "cardLevel1", 907419926);
        setIntField(term209658, term209658.getClass(), "cardLevel2", 1410218337);
        setIntField(term209658, term209658.getClass(), "cardLevel3", -1548487396);
        setIntField(term209658, term209658.getClass(), "cardAttack1", -1092864344);
        setIntField(term209658, term209658.getClass(), "cardAttack2", 909432589);
        setIntField(term209658, term209658.getClass(), "cardAttack3", -803102599);
        setIntField(term209658, term209658.getClass(), "bossCharaId", 1911613745);
        setIntField(term209658, term209658.getClass(), "bossLevel", -1397218525);
        setIntField(term209658, term209658.getClass(), "bossAttribute", -878133799);
        setIntField(term209658, term209658.getClass(), "clearStatus", -1097564879);
        setIntField(term209658, term209658.getClass(), "techScore", 531804989);
        setIntField(term209658, term209658.getClass(), "techScoreRank", 606449083);
        setIntField(term209658, term209658.getClass(), "battleScore", -84390184);
        setIntField(term209658, term209658.getClass(), "battleScoreRank", 1107966197);
        setIntField(term209658, term209658.getClass(), "platinumScore", -987871994);
        setIntField(term209658, term209658.getClass(), "maxCombo", 810730521);
        setIntField(term209658, term209658.getClass(), "judgeMiss", 231201522);
        setIntField(term209658, term209658.getClass(), "judgeHit", -1299754463);
        setIntField(term209658, term209658.getClass(), "judgeBreak", 1383683097);
        setIntField(term209658, term209658.getClass(), "judgeCriticalBreak", 1395150060);
        setIntField(term209658, term209658.getClass(), "rateTap", -1878396438);
        setIntField(term209658, term209658.getClass(), "rateHold", 22205123);
        setIntField(term209658, term209658.getClass(), "rateFlick", 479068999);
        setIntField(term209658, term209658.getClass(), "rateSideTap", -1528330666);
        setIntField(term209658, term209658.getClass(), "rateSideHold", -453088521);
        setIntField(term209658, term209658.getClass(), "bellCount", -1951273050);
        setIntField(term209658, term209658.getClass(), "totalBellCount", 924528463);
        setIntField(term209658, term209658.getClass(), "damageCount", 148137606);
        setIntField(term209658, term209658.getClass(), "overDamage", 364962451);
        setBooleanField(term209658, term209658.getClass(), "isTechNewRecord", false);
        setBooleanField(term209658, term209658.getClass(), "isBattleNewRecord", true);
        setBooleanField(term209658, term209658.getClass(), "isOverDamageNewRecord", false);
        setBooleanField(term209658, term209658.getClass(), "isFullCombo", true);
        setBooleanField(term209658, term209658.getClass(), "isFullBell", true);
        setBooleanField(term209658, term209658.getClass(), "isAllBreak", false);
        setIntField(term209658, term209658.getClass(), "playerRating", -368045173);
        setIntField(term209658, term209658.getClass(), "battlePoint", -38776100);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRateTap", argTypes, term209658, args);
    }

};


