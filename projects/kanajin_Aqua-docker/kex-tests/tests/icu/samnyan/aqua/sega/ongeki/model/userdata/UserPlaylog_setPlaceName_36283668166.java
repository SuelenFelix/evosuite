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

public class UserPlaylog_setPlaceName_36283668166 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term223359;

    public UserPlaylog_setPlaceName_36283668166() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term223365 = new Long(-997945615782059734L);
        term223359 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog"));
        Object term223361 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term223363 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term223379 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term223380 = newInstance(Class.forName("java.time.LocalDate"));
        Object term223384 = newInstance(Class.forName("java.time.LocalTime"));
        Object term223389 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term223390 = newInstance(Class.forName("java.time.LocalDate"));
        Object term223394 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term223359, term223359.getClass(), "id", -7949089352615443442L);
        setLongField(term223361, term223361.getClass(), "id", 6091614362645222697L);
        setLongField(term223363, term223363.getClass(), "id", -7645850818717932590L);
        setField(term223363, term223363.getClass(), "extId", term223365);
        setField(term223363, term223363.getClass(), "luid", "emjMEFGuQe");
        setIntField(term223380, term223380.getClass(), "year", 2014);
        setShortField(term223380, term223380.getClass(), "month", (short) 3);
        setShortField(term223380, term223380.getClass(), "day", (short) 6);
        setField(term223379, term223379.getClass(), "date", term223380);
        setByteField(term223384, term223384.getClass(), "hour", (byte) 3);
        setByteField(term223384, term223384.getClass(), "minute", (byte) 21);
        setByteField(term223384, term223384.getClass(), "second", (byte) 53);
        setIntField(term223384, term223384.getClass(), "nano", 978038024);
        setField(term223379, term223379.getClass(), "time", term223384);
        setField(term223363, term223363.getClass(), "registerTime", term223379);
        setIntField(term223390, term223390.getClass(), "year", 2013);
        setShortField(term223390, term223390.getClass(), "month", (short) 5);
        setShortField(term223390, term223390.getClass(), "day", (short) 10);
        setField(term223389, term223389.getClass(), "date", term223390);
        setByteField(term223394, term223394.getClass(), "hour", (byte) 8);
        setByteField(term223394, term223394.getClass(), "minute", (byte) 51);
        setByteField(term223394, term223394.getClass(), "second", (byte) 38);
        setIntField(term223394, term223394.getClass(), "nano", 326978944);
        setField(term223389, term223389.getClass(), "time", term223394);
        setField(term223363, term223363.getClass(), "accessTime", term223389);
        setField(term223361, term223361.getClass(), "card", term223363);
        setField(term223361, term223361.getClass(), "userName", "aCelWtbpig");
        setIntField(term223361, term223361.getClass(), "level", 229323589);
        setIntField(term223361, term223361.getClass(), "reincarnationNum", 608950067);
        setLongField(term223361, term223361.getClass(), "exp", 8089166918213337334L);
        setLongField(term223361, term223361.getClass(), "point", 8822045384640483341L);
        setLongField(term223361, term223361.getClass(), "totalPoint", 45893618898764862L);
        setIntField(term223361, term223361.getClass(), "playCount", -1976530324);
        setIntField(term223361, term223361.getClass(), "jewelCount", -345508496);
        setIntField(term223361, term223361.getClass(), "totalJewelCount", 1836772931);
        setIntField(term223361, term223361.getClass(), "medalCount", 1471156136);
        setIntField(term223361, term223361.getClass(), "playerRating", 869271750);
        setIntField(term223361, term223361.getClass(), "highestRating", -891906508);
        setIntField(term223361, term223361.getClass(), "battlePoint", 33200561);
        setIntField(term223361, term223361.getClass(), "bestBattlePoint", -391675562);
        setIntField(term223361, term223361.getClass(), "overDamageBattlePoint", 206061309);
        setBooleanField(term223361, term223361.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term223361, term223361.getClass(), "nameplateId", -469486858);
        setIntField(term223361, term223361.getClass(), "trophyId", -1184776933);
        setIntField(term223361, term223361.getClass(), "cardId", -947890577);
        setIntField(term223361, term223361.getClass(), "characterId", -2103526812);
        setIntField(term223361, term223361.getClass(), "characterVoiceNo", 2001968974);
        setIntField(term223361, term223361.getClass(), "tabSetting", 2036080787);
        setIntField(term223361, term223361.getClass(), "tabSortSetting", -1187989955);
        setIntField(term223361, term223361.getClass(), "cardCategorySetting", 1522845770);
        setIntField(term223361, term223361.getClass(), "cardSortSetting", 457792368);
        setIntField(term223361, term223361.getClass(), "rivalScoreCategorySetting", 1883178473);
        setIntField(term223361, term223361.getClass(), "playedTutorialBit", -1873487804);
        setIntField(term223361, term223361.getClass(), "firstTutorialCancelNum", 338162762);
        setLongField(term223361, term223361.getClass(), "sumTechHighScore", -5276697364172452398L);
        setLongField(term223361, term223361.getClass(), "sumTechBasicHighScore", -144730067102776606L);
        setLongField(term223361, term223361.getClass(), "sumTechAdvancedHighScore", -7896951062125228961L);
        setLongField(term223361, term223361.getClass(), "sumTechExpertHighScore", 3508165207481641200L);
        setLongField(term223361, term223361.getClass(), "sumTechMasterHighScore", 8981882085945801014L);
        setLongField(term223361, term223361.getClass(), "sumTechLunaticHighScore", 627916511020111213L);
        setLongField(term223361, term223361.getClass(), "sumBattleHighScore", -5331019109573791092L);
        setLongField(term223361, term223361.getClass(), "sumBattleBasicHighScore", -5347198056336462508L);
        setLongField(term223361, term223361.getClass(), "sumBattleAdvancedHighScore", -2702700372556153881L);
        setLongField(term223361, term223361.getClass(), "sumBattleExpertHighScore", 1474337122072763102L);
        setLongField(term223361, term223361.getClass(), "sumBattleMasterHighScore", -1776244408886273790L);
        setLongField(term223361, term223361.getClass(), "sumBattleLunaticHighScore", 554091061204450564L);
        setField(term223361, term223361.getClass(), "eventWatchedDate", "TubQqMAZMG");
        setField(term223361, term223361.getClass(), "cmEventWatchedDate", "IUuulkfmPZ");
        setField(term223361, term223361.getClass(), "firstGameId", "HMifkHQqqR");
        setField(term223361, term223361.getClass(), "firstRomVersion", "LUhJYRnWlM");
        setField(term223361, term223361.getClass(), "firstDataVersion", "PXBOCbWSgZ");
        setField(term223361, term223361.getClass(), "firstPlayDate", "MMzUVotIxA");
        setField(term223361, term223361.getClass(), "lastGameId", "IEsKbVeLPx");
        setField(term223361, term223361.getClass(), "lastRomVersion", "QAHCagitRs");
        setField(term223361, term223361.getClass(), "lastDataVersion", "gSOrkTglFJ");
        setField(term223361, term223361.getClass(), "compatibleCmVersion", "fKXvKpxZED");
        setField(term223361, term223361.getClass(), "lastPlayDate", "CprvJJGTqi");
        setIntField(term223361, term223361.getClass(), "lastPlaceId", -2029988360);
        setField(term223361, term223361.getClass(), "lastPlaceName", "OJGakpSQhy");
        setIntField(term223361, term223361.getClass(), "lastRegionId", 985415961);
        setField(term223361, term223361.getClass(), "lastRegionName", "FwGREezwMB");
        setIntField(term223361, term223361.getClass(), "lastAllNetId", 1163437479);
        setField(term223361, term223361.getClass(), "lastClientId", "YxEZYvgyuO");
        setIntField(term223361, term223361.getClass(), "lastUsedDeckId", 446404576);
        setIntField(term223361, term223361.getClass(), "lastPlayMusicLevel", -250771991);
        setIntField(term223361, term223361.getClass(), "lastEmoneyBrand", -87432188);
        setField(term223359, term223359.getClass(), "user", term223361);
        setIntField(term223359, term223359.getClass(), "sortNumber", 1028623562);
        setIntField(term223359, term223359.getClass(), "placeId", 731074367);
        setField(term223359, term223359.getClass(), "placeName", "lRBYPAjXhB");
        setField(term223359, term223359.getClass(), "playDate", "qrsQgUztdZ");
        setField(term223359, term223359.getClass(), "userPlayDate", "QenkwXumYt");
        setIntField(term223359, term223359.getClass(), "musicId", 969220339);
        setIntField(term223359, term223359.getClass(), "level", 78410083);
        setIntField(term223359, term223359.getClass(), "playKind", -1308398792);
        setIntField(term223359, term223359.getClass(), "eventId", 1624205154);
        setField(term223359, term223359.getClass(), "eventName", "ezxBCHaETQ");
        setIntField(term223359, term223359.getClass(), "eventPoint", 872444404);
        setIntField(term223359, term223359.getClass(), "playedUserId1", 1400687352);
        setIntField(term223359, term223359.getClass(), "playedUserId2", 1391309255);
        setIntField(term223359, term223359.getClass(), "playedUserId3", 437885281);
        setField(term223359, term223359.getClass(), "playedUserName1", "AgmkTabDEc");
        setField(term223359, term223359.getClass(), "playedUserName2", "zrLjRgoVtb");
        setField(term223359, term223359.getClass(), "playedUserName3", "qAFqArCVTm");
        setIntField(term223359, term223359.getClass(), "playedMusicLevel1", 1144296384);
        setIntField(term223359, term223359.getClass(), "playedMusicLevel2", 375541509);
        setIntField(term223359, term223359.getClass(), "playedMusicLevel3", 1549543162);
        setIntField(term223359, term223359.getClass(), "cardId1", -893278459);
        setIntField(term223359, term223359.getClass(), "cardId2", -2086759387);
        setIntField(term223359, term223359.getClass(), "cardId3", -1639130879);
        setIntField(term223359, term223359.getClass(), "cardLevel1", -1439372378);
        setIntField(term223359, term223359.getClass(), "cardLevel2", -1838240610);
        setIntField(term223359, term223359.getClass(), "cardLevel3", 676840233);
        setIntField(term223359, term223359.getClass(), "cardAttack1", -125724279);
        setIntField(term223359, term223359.getClass(), "cardAttack2", -1125931561);
        setIntField(term223359, term223359.getClass(), "cardAttack3", -1395442669);
        setIntField(term223359, term223359.getClass(), "bossCharaId", 868823701);
        setIntField(term223359, term223359.getClass(), "bossLevel", 588180);
        setIntField(term223359, term223359.getClass(), "bossAttribute", 1798567411);
        setIntField(term223359, term223359.getClass(), "clearStatus", -1507879623);
        setIntField(term223359, term223359.getClass(), "techScore", 727263670);
        setIntField(term223359, term223359.getClass(), "techScoreRank", -2042954517);
        setIntField(term223359, term223359.getClass(), "battleScore", -1585735136);
        setIntField(term223359, term223359.getClass(), "battleScoreRank", -202469528);
        setIntField(term223359, term223359.getClass(), "platinumScore", -1147825822);
        setIntField(term223359, term223359.getClass(), "maxCombo", -192227369);
        setIntField(term223359, term223359.getClass(), "judgeMiss", 1203299299);
        setIntField(term223359, term223359.getClass(), "judgeHit", -115406772);
        setIntField(term223359, term223359.getClass(), "judgeBreak", -1194681287);
        setIntField(term223359, term223359.getClass(), "judgeCriticalBreak", -24531941);
        setIntField(term223359, term223359.getClass(), "rateTap", 1265656841);
        setIntField(term223359, term223359.getClass(), "rateHold", -1881871368);
        setIntField(term223359, term223359.getClass(), "rateFlick", -1725616340);
        setIntField(term223359, term223359.getClass(), "rateSideTap", 1579393316);
        setIntField(term223359, term223359.getClass(), "rateSideHold", 291434697);
        setIntField(term223359, term223359.getClass(), "bellCount", 1157245504);
        setIntField(term223359, term223359.getClass(), "totalBellCount", -1468740029);
        setIntField(term223359, term223359.getClass(), "damageCount", 1419365246);
        setIntField(term223359, term223359.getClass(), "overDamage", -591173078);
        setBooleanField(term223359, term223359.getClass(), "isTechNewRecord", true);
        setBooleanField(term223359, term223359.getClass(), "isBattleNewRecord", true);
        setBooleanField(term223359, term223359.getClass(), "isOverDamageNewRecord", false);
        setBooleanField(term223359, term223359.getClass(), "isFullCombo", false);
        setBooleanField(term223359, term223359.getClass(), "isFullBell", false);
        setBooleanField(term223359, term223359.getClass(), "isAllBreak", true);
        setIntField(term223359, term223359.getClass(), "playerRating", 1565076807);
        setIntField(term223359, term223359.getClass(), "battlePoint", 1016664474);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "vBBSdxtETg";
        callMethod(klass, "setPlaceName", argTypes, term223359, args);
    }

};


