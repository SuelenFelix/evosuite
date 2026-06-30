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

public class UserPlaylog_getBattleScoreRank_140829122638 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term205234;

    public UserPlaylog_getBattleScoreRank_140829122638() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term205240 = new Long(-1449569009562240465L);
        term205234 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog"));
        Object term205236 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term205238 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term205254 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term205255 = newInstance(Class.forName("java.time.LocalDate"));
        Object term205259 = newInstance(Class.forName("java.time.LocalTime"));
        Object term205264 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term205265 = newInstance(Class.forName("java.time.LocalDate"));
        Object term205269 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term205234, term205234.getClass(), "id", -8812968989706369855L);
        setLongField(term205236, term205236.getClass(), "id", 1918233396303860114L);
        setLongField(term205238, term205238.getClass(), "id", -8697608146515998914L);
        setField(term205238, term205238.getClass(), "extId", term205240);
        setField(term205238, term205238.getClass(), "luid", "XVSaLwDWRY");
        setIntField(term205255, term205255.getClass(), "year", 2025);
        setShortField(term205255, term205255.getClass(), "month", (short) 2);
        setShortField(term205255, term205255.getClass(), "day", (short) 11);
        setField(term205254, term205254.getClass(), "date", term205255);
        setByteField(term205259, term205259.getClass(), "hour", (byte) 22);
        setByteField(term205259, term205259.getClass(), "minute", (byte) 56);
        setByteField(term205259, term205259.getClass(), "second", (byte) 10);
        setIntField(term205259, term205259.getClass(), "nano", 94699593);
        setField(term205254, term205254.getClass(), "time", term205259);
        setField(term205238, term205238.getClass(), "registerTime", term205254);
        setIntField(term205265, term205265.getClass(), "year", 2023);
        setShortField(term205265, term205265.getClass(), "month", (short) 2);
        setShortField(term205265, term205265.getClass(), "day", (short) 6);
        setField(term205264, term205264.getClass(), "date", term205265);
        setByteField(term205269, term205269.getClass(), "hour", (byte) 13);
        setByteField(term205269, term205269.getClass(), "minute", (byte) 35);
        setByteField(term205269, term205269.getClass(), "second", (byte) 14);
        setIntField(term205269, term205269.getClass(), "nano", 917848995);
        setField(term205264, term205264.getClass(), "time", term205269);
        setField(term205238, term205238.getClass(), "accessTime", term205264);
        setField(term205236, term205236.getClass(), "card", term205238);
        setField(term205236, term205236.getClass(), "userName", "lpVRiaBSuj");
        setIntField(term205236, term205236.getClass(), "level", -382750942);
        setIntField(term205236, term205236.getClass(), "reincarnationNum", 753064895);
        setLongField(term205236, term205236.getClass(), "exp", -2636301423748481180L);
        setLongField(term205236, term205236.getClass(), "point", -9207674693273072295L);
        setLongField(term205236, term205236.getClass(), "totalPoint", -6997182250345175814L);
        setIntField(term205236, term205236.getClass(), "playCount", -1315883617);
        setIntField(term205236, term205236.getClass(), "jewelCount", 2097293687);
        setIntField(term205236, term205236.getClass(), "totalJewelCount", -1521321707);
        setIntField(term205236, term205236.getClass(), "medalCount", 2016028680);
        setIntField(term205236, term205236.getClass(), "playerRating", -551041121);
        setIntField(term205236, term205236.getClass(), "highestRating", 762083421);
        setIntField(term205236, term205236.getClass(), "battlePoint", 1147575851);
        setIntField(term205236, term205236.getClass(), "bestBattlePoint", -1444871975);
        setIntField(term205236, term205236.getClass(), "overDamageBattlePoint", 16937693);
        setBooleanField(term205236, term205236.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term205236, term205236.getClass(), "nameplateId", 449328397);
        setIntField(term205236, term205236.getClass(), "trophyId", 2141163970);
        setIntField(term205236, term205236.getClass(), "cardId", -1171001349);
        setIntField(term205236, term205236.getClass(), "characterId", -171268418);
        setIntField(term205236, term205236.getClass(), "characterVoiceNo", -512014955);
        setIntField(term205236, term205236.getClass(), "tabSetting", 727682522);
        setIntField(term205236, term205236.getClass(), "tabSortSetting", -948539005);
        setIntField(term205236, term205236.getClass(), "cardCategorySetting", -109851814);
        setIntField(term205236, term205236.getClass(), "cardSortSetting", -1512846192);
        setIntField(term205236, term205236.getClass(), "rivalScoreCategorySetting", 1915662147);
        setIntField(term205236, term205236.getClass(), "playedTutorialBit", 1574061857);
        setIntField(term205236, term205236.getClass(), "firstTutorialCancelNum", 1496265790);
        setLongField(term205236, term205236.getClass(), "sumTechHighScore", -5162784231431459710L);
        setLongField(term205236, term205236.getClass(), "sumTechBasicHighScore", 5671578075099347901L);
        setLongField(term205236, term205236.getClass(), "sumTechAdvancedHighScore", -7286533343246428835L);
        setLongField(term205236, term205236.getClass(), "sumTechExpertHighScore", -3527422387314975948L);
        setLongField(term205236, term205236.getClass(), "sumTechMasterHighScore", -5958154304307155804L);
        setLongField(term205236, term205236.getClass(), "sumTechLunaticHighScore", -7639412008388127098L);
        setLongField(term205236, term205236.getClass(), "sumBattleHighScore", 8969791860551454284L);
        setLongField(term205236, term205236.getClass(), "sumBattleBasicHighScore", -6962561513576665540L);
        setLongField(term205236, term205236.getClass(), "sumBattleAdvancedHighScore", 2886111967462612710L);
        setLongField(term205236, term205236.getClass(), "sumBattleExpertHighScore", -3824378508047410614L);
        setLongField(term205236, term205236.getClass(), "sumBattleMasterHighScore", 6309334620859649864L);
        setLongField(term205236, term205236.getClass(), "sumBattleLunaticHighScore", 6918676465101434959L);
        setField(term205236, term205236.getClass(), "eventWatchedDate", "KXTswwnaBw");
        setField(term205236, term205236.getClass(), "cmEventWatchedDate", "ISWqUwSggV");
        setField(term205236, term205236.getClass(), "firstGameId", "AUPNEcHypG");
        setField(term205236, term205236.getClass(), "firstRomVersion", "UmeqMAzUwa");
        setField(term205236, term205236.getClass(), "firstDataVersion", "PNFDIHfYEp");
        setField(term205236, term205236.getClass(), "firstPlayDate", "nGniXvSdtW");
        setField(term205236, term205236.getClass(), "lastGameId", "quVglHvsIx");
        setField(term205236, term205236.getClass(), "lastRomVersion", "JXODZCOpvf");
        setField(term205236, term205236.getClass(), "lastDataVersion", "ycTiGquQOQ");
        setField(term205236, term205236.getClass(), "compatibleCmVersion", "gtBUZHUXYc");
        setField(term205236, term205236.getClass(), "lastPlayDate", "iFapMdPnGw");
        setIntField(term205236, term205236.getClass(), "lastPlaceId", -1548575078);
        setField(term205236, term205236.getClass(), "lastPlaceName", "RfWXuIRYLA");
        setIntField(term205236, term205236.getClass(), "lastRegionId", 80031735);
        setField(term205236, term205236.getClass(), "lastRegionName", "UmDEkQQiuz");
        setIntField(term205236, term205236.getClass(), "lastAllNetId", -1471664971);
        setField(term205236, term205236.getClass(), "lastClientId", "TCXBrRDTcJ");
        setIntField(term205236, term205236.getClass(), "lastUsedDeckId", -1016726676);
        setIntField(term205236, term205236.getClass(), "lastPlayMusicLevel", 375593728);
        setIntField(term205236, term205236.getClass(), "lastEmoneyBrand", -1684773948);
        setField(term205234, term205234.getClass(), "user", term205236);
        setIntField(term205234, term205234.getClass(), "sortNumber", -902905305);
        setIntField(term205234, term205234.getClass(), "placeId", -800651098);
        setField(term205234, term205234.getClass(), "placeName", "RkPxDEtRcH");
        setField(term205234, term205234.getClass(), "playDate", "OLhmDSgInU");
        setField(term205234, term205234.getClass(), "userPlayDate", "IfnjJhNdXG");
        setIntField(term205234, term205234.getClass(), "musicId", -1572119625);
        setIntField(term205234, term205234.getClass(), "level", 248535854);
        setIntField(term205234, term205234.getClass(), "playKind", -1512718729);
        setIntField(term205234, term205234.getClass(), "eventId", -1550333717);
        setField(term205234, term205234.getClass(), "eventName", "sYHwXJenPx");
        setIntField(term205234, term205234.getClass(), "eventPoint", 1700458639);
        setIntField(term205234, term205234.getClass(), "playedUserId1", 2109100178);
        setIntField(term205234, term205234.getClass(), "playedUserId2", -1329545198);
        setIntField(term205234, term205234.getClass(), "playedUserId3", 106584642);
        setField(term205234, term205234.getClass(), "playedUserName1", "vknqoIHcVy");
        setField(term205234, term205234.getClass(), "playedUserName2", "RnlJVSdVqG");
        setField(term205234, term205234.getClass(), "playedUserName3", "PhGBkiAfqm");
        setIntField(term205234, term205234.getClass(), "playedMusicLevel1", 2127403432);
        setIntField(term205234, term205234.getClass(), "playedMusicLevel2", -1964358770);
        setIntField(term205234, term205234.getClass(), "playedMusicLevel3", -1186050457);
        setIntField(term205234, term205234.getClass(), "cardId1", 1724133301);
        setIntField(term205234, term205234.getClass(), "cardId2", 1312470308);
        setIntField(term205234, term205234.getClass(), "cardId3", 1284007584);
        setIntField(term205234, term205234.getClass(), "cardLevel1", 299163834);
        setIntField(term205234, term205234.getClass(), "cardLevel2", 1798074784);
        setIntField(term205234, term205234.getClass(), "cardLevel3", -465480674);
        setIntField(term205234, term205234.getClass(), "cardAttack1", -919780595);
        setIntField(term205234, term205234.getClass(), "cardAttack2", -343343560);
        setIntField(term205234, term205234.getClass(), "cardAttack3", 1363779115);
        setIntField(term205234, term205234.getClass(), "bossCharaId", 1605118681);
        setIntField(term205234, term205234.getClass(), "bossLevel", 1912715011);
        setIntField(term205234, term205234.getClass(), "bossAttribute", -1793275062);
        setIntField(term205234, term205234.getClass(), "clearStatus", 311045652);
        setIntField(term205234, term205234.getClass(), "techScore", -404238276);
        setIntField(term205234, term205234.getClass(), "techScoreRank", 453390849);
        setIntField(term205234, term205234.getClass(), "battleScore", 792369197);
        setIntField(term205234, term205234.getClass(), "battleScoreRank", 550257073);
        setIntField(term205234, term205234.getClass(), "platinumScore", 72941694);
        setIntField(term205234, term205234.getClass(), "maxCombo", 1084937078);
        setIntField(term205234, term205234.getClass(), "judgeMiss", 1895908546);
        setIntField(term205234, term205234.getClass(), "judgeHit", -1334535627);
        setIntField(term205234, term205234.getClass(), "judgeBreak", -1899505891);
        setIntField(term205234, term205234.getClass(), "judgeCriticalBreak", -1703391320);
        setIntField(term205234, term205234.getClass(), "rateTap", -1849520734);
        setIntField(term205234, term205234.getClass(), "rateHold", -1641716943);
        setIntField(term205234, term205234.getClass(), "rateFlick", -118475757);
        setIntField(term205234, term205234.getClass(), "rateSideTap", -664289577);
        setIntField(term205234, term205234.getClass(), "rateSideHold", -122644875);
        setIntField(term205234, term205234.getClass(), "bellCount", -2091282338);
        setIntField(term205234, term205234.getClass(), "totalBellCount", 295092300);
        setIntField(term205234, term205234.getClass(), "damageCount", 566606497);
        setIntField(term205234, term205234.getClass(), "overDamage", 539575684);
        setBooleanField(term205234, term205234.getClass(), "isTechNewRecord", false);
        setBooleanField(term205234, term205234.getClass(), "isBattleNewRecord", true);
        setBooleanField(term205234, term205234.getClass(), "isOverDamageNewRecord", true);
        setBooleanField(term205234, term205234.getClass(), "isFullCombo", false);
        setBooleanField(term205234, term205234.getClass(), "isFullBell", false);
        setBooleanField(term205234, term205234.getClass(), "isAllBreak", false);
        setIntField(term205234, term205234.getClass(), "playerRating", -164506727);
        setIntField(term205234, term205234.getClass(), "battlePoint", -1752873646);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBattleScoreRank", argTypes, term205234, args);
    }

};


