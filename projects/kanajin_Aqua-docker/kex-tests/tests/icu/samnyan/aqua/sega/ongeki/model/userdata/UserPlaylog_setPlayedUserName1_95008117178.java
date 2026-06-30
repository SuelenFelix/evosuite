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

public class UserPlaylog_setPlayedUserName1_95008117178 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term231047;

    public UserPlaylog_setPlayedUserName1_95008117178() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term231053 = new Long(5818741986224130131L);
        term231047 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog"));
        Object term231049 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term231051 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term231067 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term231068 = newInstance(Class.forName("java.time.LocalDate"));
        Object term231072 = newInstance(Class.forName("java.time.LocalTime"));
        Object term231077 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term231078 = newInstance(Class.forName("java.time.LocalDate"));
        Object term231082 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term231047, term231047.getClass(), "id", -1566893501088264201L);
        setLongField(term231049, term231049.getClass(), "id", 983565881911193843L);
        setLongField(term231051, term231051.getClass(), "id", -989073038682677715L);
        setField(term231051, term231051.getClass(), "extId", term231053);
        setField(term231051, term231051.getClass(), "luid", "QKLHvMlwjO");
        setIntField(term231068, term231068.getClass(), "year", 2014);
        setShortField(term231068, term231068.getClass(), "month", (short) 7);
        setShortField(term231068, term231068.getClass(), "day", (short) 8);
        setField(term231067, term231067.getClass(), "date", term231068);
        setByteField(term231072, term231072.getClass(), "hour", (byte) 15);
        setByteField(term231072, term231072.getClass(), "minute", (byte) 58);
        setByteField(term231072, term231072.getClass(), "second", (byte) 59);
        setIntField(term231072, term231072.getClass(), "nano", 92869125);
        setField(term231067, term231067.getClass(), "time", term231072);
        setField(term231051, term231051.getClass(), "registerTime", term231067);
        setIntField(term231078, term231078.getClass(), "year", 2015);
        setShortField(term231078, term231078.getClass(), "month", (short) 3);
        setShortField(term231078, term231078.getClass(), "day", (short) 10);
        setField(term231077, term231077.getClass(), "date", term231078);
        setByteField(term231082, term231082.getClass(), "hour", (byte) 2);
        setByteField(term231082, term231082.getClass(), "minute", (byte) 20);
        setByteField(term231082, term231082.getClass(), "second", (byte) 3);
        setIntField(term231082, term231082.getClass(), "nano", 298112800);
        setField(term231077, term231077.getClass(), "time", term231082);
        setField(term231051, term231051.getClass(), "accessTime", term231077);
        setField(term231049, term231049.getClass(), "card", term231051);
        setField(term231049, term231049.getClass(), "userName", "cRYFnmgWkQ");
        setIntField(term231049, term231049.getClass(), "level", 1383798608);
        setIntField(term231049, term231049.getClass(), "reincarnationNum", -238731977);
        setLongField(term231049, term231049.getClass(), "exp", -8393460810457481740L);
        setLongField(term231049, term231049.getClass(), "point", -3227276946443135473L);
        setLongField(term231049, term231049.getClass(), "totalPoint", 1792795309279557206L);
        setIntField(term231049, term231049.getClass(), "playCount", -602134389);
        setIntField(term231049, term231049.getClass(), "jewelCount", 298623505);
        setIntField(term231049, term231049.getClass(), "totalJewelCount", -45942937);
        setIntField(term231049, term231049.getClass(), "medalCount", 1476229754);
        setIntField(term231049, term231049.getClass(), "playerRating", 286501564);
        setIntField(term231049, term231049.getClass(), "highestRating", -1175270067);
        setIntField(term231049, term231049.getClass(), "battlePoint", 157082130);
        setIntField(term231049, term231049.getClass(), "bestBattlePoint", -772180404);
        setIntField(term231049, term231049.getClass(), "overDamageBattlePoint", -1972172179);
        setBooleanField(term231049, term231049.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term231049, term231049.getClass(), "nameplateId", 2021461040);
        setIntField(term231049, term231049.getClass(), "trophyId", -253613650);
        setIntField(term231049, term231049.getClass(), "cardId", 598417977);
        setIntField(term231049, term231049.getClass(), "characterId", -594010352);
        setIntField(term231049, term231049.getClass(), "characterVoiceNo", 1901360390);
        setIntField(term231049, term231049.getClass(), "tabSetting", 2112491155);
        setIntField(term231049, term231049.getClass(), "tabSortSetting", 1153767678);
        setIntField(term231049, term231049.getClass(), "cardCategorySetting", 252401222);
        setIntField(term231049, term231049.getClass(), "cardSortSetting", 2136690836);
        setIntField(term231049, term231049.getClass(), "rivalScoreCategorySetting", 1415141329);
        setIntField(term231049, term231049.getClass(), "playedTutorialBit", 1866488615);
        setIntField(term231049, term231049.getClass(), "firstTutorialCancelNum", 303848886);
        setLongField(term231049, term231049.getClass(), "sumTechHighScore", -7598465765601346467L);
        setLongField(term231049, term231049.getClass(), "sumTechBasicHighScore", 1796308232852785436L);
        setLongField(term231049, term231049.getClass(), "sumTechAdvancedHighScore", -4354038382152421458L);
        setLongField(term231049, term231049.getClass(), "sumTechExpertHighScore", -3021702620714918745L);
        setLongField(term231049, term231049.getClass(), "sumTechMasterHighScore", 4114675760855041936L);
        setLongField(term231049, term231049.getClass(), "sumTechLunaticHighScore", 8576463951600368767L);
        setLongField(term231049, term231049.getClass(), "sumBattleHighScore", -2842686096781901325L);
        setLongField(term231049, term231049.getClass(), "sumBattleBasicHighScore", 3718326560852254547L);
        setLongField(term231049, term231049.getClass(), "sumBattleAdvancedHighScore", -768492637543849274L);
        setLongField(term231049, term231049.getClass(), "sumBattleExpertHighScore", 7610410063261059390L);
        setLongField(term231049, term231049.getClass(), "sumBattleMasterHighScore", -6089079562974402078L);
        setLongField(term231049, term231049.getClass(), "sumBattleLunaticHighScore", -8682509259109511605L);
        setField(term231049, term231049.getClass(), "eventWatchedDate", "vzPwHQljpk");
        setField(term231049, term231049.getClass(), "cmEventWatchedDate", "fUhPiJEcYO");
        setField(term231049, term231049.getClass(), "firstGameId", "dkiklmXtsm");
        setField(term231049, term231049.getClass(), "firstRomVersion", "UWqNpGeOLP");
        setField(term231049, term231049.getClass(), "firstDataVersion", "SbkAYLVQCU");
        setField(term231049, term231049.getClass(), "firstPlayDate", "KhujxNcUFH");
        setField(term231049, term231049.getClass(), "lastGameId", "wwasDIckaj");
        setField(term231049, term231049.getClass(), "lastRomVersion", "sjDZCQlsXB");
        setField(term231049, term231049.getClass(), "lastDataVersion", "fhzGBTdcwn");
        setField(term231049, term231049.getClass(), "compatibleCmVersion", "szTrbIyfvl");
        setField(term231049, term231049.getClass(), "lastPlayDate", "ffkDPmGZUE");
        setIntField(term231049, term231049.getClass(), "lastPlaceId", 1881530712);
        setField(term231049, term231049.getClass(), "lastPlaceName", "LCeiGlwPuu");
        setIntField(term231049, term231049.getClass(), "lastRegionId", 222708508);
        setField(term231049, term231049.getClass(), "lastRegionName", "ZHSmPFRHgz");
        setIntField(term231049, term231049.getClass(), "lastAllNetId", 1601090042);
        setField(term231049, term231049.getClass(), "lastClientId", "nSQlbmzzLW");
        setIntField(term231049, term231049.getClass(), "lastUsedDeckId", 1841239584);
        setIntField(term231049, term231049.getClass(), "lastPlayMusicLevel", 1759632148);
        setIntField(term231049, term231049.getClass(), "lastEmoneyBrand", -929628156);
        setField(term231047, term231047.getClass(), "user", term231049);
        setIntField(term231047, term231047.getClass(), "sortNumber", 1662377107);
        setIntField(term231047, term231047.getClass(), "placeId", -270785615);
        setField(term231047, term231047.getClass(), "placeName", "NzCUIjYlSt");
        setField(term231047, term231047.getClass(), "playDate", "lFUtoXWQuy");
        setField(term231047, term231047.getClass(), "userPlayDate", "cqUSTqSiGn");
        setIntField(term231047, term231047.getClass(), "musicId", 1707036301);
        setIntField(term231047, term231047.getClass(), "level", 19933800);
        setIntField(term231047, term231047.getClass(), "playKind", -298980528);
        setIntField(term231047, term231047.getClass(), "eventId", -5656680);
        setField(term231047, term231047.getClass(), "eventName", "uMUfxkPQVb");
        setIntField(term231047, term231047.getClass(), "eventPoint", 1091964304);
        setIntField(term231047, term231047.getClass(), "playedUserId1", -613681108);
        setIntField(term231047, term231047.getClass(), "playedUserId2", 1352625518);
        setIntField(term231047, term231047.getClass(), "playedUserId3", 668348121);
        setField(term231047, term231047.getClass(), "playedUserName1", "antCkERyql");
        setField(term231047, term231047.getClass(), "playedUserName2", "RLzWpKyOcm");
        setField(term231047, term231047.getClass(), "playedUserName3", "AiDeJiJcDC");
        setIntField(term231047, term231047.getClass(), "playedMusicLevel1", 430885685);
        setIntField(term231047, term231047.getClass(), "playedMusicLevel2", 468323881);
        setIntField(term231047, term231047.getClass(), "playedMusicLevel3", 1862554868);
        setIntField(term231047, term231047.getClass(), "cardId1", -610778528);
        setIntField(term231047, term231047.getClass(), "cardId2", 1749515367);
        setIntField(term231047, term231047.getClass(), "cardId3", -1319948187);
        setIntField(term231047, term231047.getClass(), "cardLevel1", -1019693873);
        setIntField(term231047, term231047.getClass(), "cardLevel2", 1079247960);
        setIntField(term231047, term231047.getClass(), "cardLevel3", 2145303715);
        setIntField(term231047, term231047.getClass(), "cardAttack1", -307543677);
        setIntField(term231047, term231047.getClass(), "cardAttack2", -2034844354);
        setIntField(term231047, term231047.getClass(), "cardAttack3", 1068979901);
        setIntField(term231047, term231047.getClass(), "bossCharaId", 2060073727);
        setIntField(term231047, term231047.getClass(), "bossLevel", -1770044035);
        setIntField(term231047, term231047.getClass(), "bossAttribute", -2104780176);
        setIntField(term231047, term231047.getClass(), "clearStatus", -1976301777);
        setIntField(term231047, term231047.getClass(), "techScore", -463965331);
        setIntField(term231047, term231047.getClass(), "techScoreRank", 769940367);
        setIntField(term231047, term231047.getClass(), "battleScore", 1030297962);
        setIntField(term231047, term231047.getClass(), "battleScoreRank", -925377527);
        setIntField(term231047, term231047.getClass(), "platinumScore", 1946040384);
        setIntField(term231047, term231047.getClass(), "maxCombo", -870849674);
        setIntField(term231047, term231047.getClass(), "judgeMiss", -365807826);
        setIntField(term231047, term231047.getClass(), "judgeHit", -1527783758);
        setIntField(term231047, term231047.getClass(), "judgeBreak", 1611976687);
        setIntField(term231047, term231047.getClass(), "judgeCriticalBreak", -1847574054);
        setIntField(term231047, term231047.getClass(), "rateTap", -1096876519);
        setIntField(term231047, term231047.getClass(), "rateHold", -1260030158);
        setIntField(term231047, term231047.getClass(), "rateFlick", -1556763879);
        setIntField(term231047, term231047.getClass(), "rateSideTap", -640616441);
        setIntField(term231047, term231047.getClass(), "rateSideHold", 209081740);
        setIntField(term231047, term231047.getClass(), "bellCount", -845599480);
        setIntField(term231047, term231047.getClass(), "totalBellCount", -997394743);
        setIntField(term231047, term231047.getClass(), "damageCount", -2121530653);
        setIntField(term231047, term231047.getClass(), "overDamage", 1319282638);
        setBooleanField(term231047, term231047.getClass(), "isTechNewRecord", false);
        setBooleanField(term231047, term231047.getClass(), "isBattleNewRecord", true);
        setBooleanField(term231047, term231047.getClass(), "isOverDamageNewRecord", true);
        setBooleanField(term231047, term231047.getClass(), "isFullCombo", false);
        setBooleanField(term231047, term231047.getClass(), "isFullBell", false);
        setBooleanField(term231047, term231047.getClass(), "isAllBreak", false);
        setIntField(term231047, term231047.getClass(), "playerRating", -949477062);
        setIntField(term231047, term231047.getClass(), "battlePoint", -1991471366);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ACFOBqKUKd";
        callMethod(klass, "setPlayedUserName1", argTypes, term231047, args);
    }

};


