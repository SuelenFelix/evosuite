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

public class UserPlaylog_getTechScore_163141478835 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term203338;

    public UserPlaylog_getTechScore_163141478835() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term203344 = new Long(-1528017371096319990L);
        term203338 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog"));
        Object term203340 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term203342 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term203358 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term203359 = newInstance(Class.forName("java.time.LocalDate"));
        Object term203363 = newInstance(Class.forName("java.time.LocalTime"));
        Object term203368 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term203369 = newInstance(Class.forName("java.time.LocalDate"));
        Object term203373 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term203338, term203338.getClass(), "id", 1213540058509375119L);
        setLongField(term203340, term203340.getClass(), "id", 4327740955689019518L);
        setLongField(term203342, term203342.getClass(), "id", 1774687762041286011L);
        setField(term203342, term203342.getClass(), "extId", term203344);
        setField(term203342, term203342.getClass(), "luid", "piFghHpxcc");
        setIntField(term203359, term203359.getClass(), "year", 2020);
        setShortField(term203359, term203359.getClass(), "month", (short) 12);
        setShortField(term203359, term203359.getClass(), "day", (short) 3);
        setField(term203358, term203358.getClass(), "date", term203359);
        setByteField(term203363, term203363.getClass(), "hour", (byte) 21);
        setByteField(term203363, term203363.getClass(), "minute", (byte) 9);
        setByteField(term203363, term203363.getClass(), "second", (byte) 18);
        setIntField(term203363, term203363.getClass(), "nano", 913732377);
        setField(term203358, term203358.getClass(), "time", term203363);
        setField(term203342, term203342.getClass(), "registerTime", term203358);
        setIntField(term203369, term203369.getClass(), "year", 2018);
        setShortField(term203369, term203369.getClass(), "month", (short) 12);
        setShortField(term203369, term203369.getClass(), "day", (short) 2);
        setField(term203368, term203368.getClass(), "date", term203369);
        setByteField(term203373, term203373.getClass(), "hour", (byte) 15);
        setByteField(term203373, term203373.getClass(), "minute", (byte) 7);
        setByteField(term203373, term203373.getClass(), "second", (byte) 32);
        setIntField(term203373, term203373.getClass(), "nano", 109301383);
        setField(term203368, term203368.getClass(), "time", term203373);
        setField(term203342, term203342.getClass(), "accessTime", term203368);
        setField(term203340, term203340.getClass(), "card", term203342);
        setField(term203340, term203340.getClass(), "userName", "NAzbuyNIpr");
        setIntField(term203340, term203340.getClass(), "level", 1309683419);
        setIntField(term203340, term203340.getClass(), "reincarnationNum", -2069969294);
        setLongField(term203340, term203340.getClass(), "exp", -8824711801896933895L);
        setLongField(term203340, term203340.getClass(), "point", 5950037709703196714L);
        setLongField(term203340, term203340.getClass(), "totalPoint", 242006361301869544L);
        setIntField(term203340, term203340.getClass(), "playCount", 439212977);
        setIntField(term203340, term203340.getClass(), "jewelCount", 2018062465);
        setIntField(term203340, term203340.getClass(), "totalJewelCount", 1045822023);
        setIntField(term203340, term203340.getClass(), "medalCount", 1104676150);
        setIntField(term203340, term203340.getClass(), "playerRating", 1984472098);
        setIntField(term203340, term203340.getClass(), "highestRating", 1608550008);
        setIntField(term203340, term203340.getClass(), "battlePoint", 1198848988);
        setIntField(term203340, term203340.getClass(), "bestBattlePoint", -1791070393);
        setIntField(term203340, term203340.getClass(), "overDamageBattlePoint", 1342512875);
        setBooleanField(term203340, term203340.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term203340, term203340.getClass(), "nameplateId", 1276618218);
        setIntField(term203340, term203340.getClass(), "trophyId", -437115096);
        setIntField(term203340, term203340.getClass(), "cardId", 778176837);
        setIntField(term203340, term203340.getClass(), "characterId", 1986276488);
        setIntField(term203340, term203340.getClass(), "characterVoiceNo", -1699338837);
        setIntField(term203340, term203340.getClass(), "tabSetting", -1616907879);
        setIntField(term203340, term203340.getClass(), "tabSortSetting", -2053674332);
        setIntField(term203340, term203340.getClass(), "cardCategorySetting", 1511770563);
        setIntField(term203340, term203340.getClass(), "cardSortSetting", -1328010620);
        setIntField(term203340, term203340.getClass(), "rivalScoreCategorySetting", -1706269085);
        setIntField(term203340, term203340.getClass(), "playedTutorialBit", 2015694273);
        setIntField(term203340, term203340.getClass(), "firstTutorialCancelNum", 1833181237);
        setLongField(term203340, term203340.getClass(), "sumTechHighScore", -1590504445722854169L);
        setLongField(term203340, term203340.getClass(), "sumTechBasicHighScore", 4502587906620534305L);
        setLongField(term203340, term203340.getClass(), "sumTechAdvancedHighScore", 7871216210100524966L);
        setLongField(term203340, term203340.getClass(), "sumTechExpertHighScore", 4571799750733226029L);
        setLongField(term203340, term203340.getClass(), "sumTechMasterHighScore", 1184670454132020771L);
        setLongField(term203340, term203340.getClass(), "sumTechLunaticHighScore", -6792463087823140857L);
        setLongField(term203340, term203340.getClass(), "sumBattleHighScore", -4718834427563357621L);
        setLongField(term203340, term203340.getClass(), "sumBattleBasicHighScore", -6091670037966212829L);
        setLongField(term203340, term203340.getClass(), "sumBattleAdvancedHighScore", 1074906989807546075L);
        setLongField(term203340, term203340.getClass(), "sumBattleExpertHighScore", -8890450421014996047L);
        setLongField(term203340, term203340.getClass(), "sumBattleMasterHighScore", 8667512289505966663L);
        setLongField(term203340, term203340.getClass(), "sumBattleLunaticHighScore", 4744547938905662498L);
        setField(term203340, term203340.getClass(), "eventWatchedDate", "GFFaEIxUDv");
        setField(term203340, term203340.getClass(), "cmEventWatchedDate", "lQQhZwiByu");
        setField(term203340, term203340.getClass(), "firstGameId", "mkyixIrBsk");
        setField(term203340, term203340.getClass(), "firstRomVersion", "TzTUjXLdan");
        setField(term203340, term203340.getClass(), "firstDataVersion", "QXmHPKSKtP");
        setField(term203340, term203340.getClass(), "firstPlayDate", "fAUYJbGzYB");
        setField(term203340, term203340.getClass(), "lastGameId", "pdJMKenJHR");
        setField(term203340, term203340.getClass(), "lastRomVersion", "EzXNRELwFS");
        setField(term203340, term203340.getClass(), "lastDataVersion", "shKYNJlwYH");
        setField(term203340, term203340.getClass(), "compatibleCmVersion", "CZFEFCSdMd");
        setField(term203340, term203340.getClass(), "lastPlayDate", "NEpKgrSAsV");
        setIntField(term203340, term203340.getClass(), "lastPlaceId", -433780886);
        setField(term203340, term203340.getClass(), "lastPlaceName", "gCyzKQjTct");
        setIntField(term203340, term203340.getClass(), "lastRegionId", -1646127961);
        setField(term203340, term203340.getClass(), "lastRegionName", "qPcFkMcIXf");
        setIntField(term203340, term203340.getClass(), "lastAllNetId", -2022896330);
        setField(term203340, term203340.getClass(), "lastClientId", "imwtCakEGR");
        setIntField(term203340, term203340.getClass(), "lastUsedDeckId", -374957299);
        setIntField(term203340, term203340.getClass(), "lastPlayMusicLevel", 500378867);
        setIntField(term203340, term203340.getClass(), "lastEmoneyBrand", 455556049);
        setField(term203338, term203338.getClass(), "user", term203340);
        setIntField(term203338, term203338.getClass(), "sortNumber", 509928046);
        setIntField(term203338, term203338.getClass(), "placeId", 40043535);
        setField(term203338, term203338.getClass(), "placeName", "SpMIbdwXeR");
        setField(term203338, term203338.getClass(), "playDate", "VGwFbZhSGn");
        setField(term203338, term203338.getClass(), "userPlayDate", "pqWomZXItf");
        setIntField(term203338, term203338.getClass(), "musicId", 2042043397);
        setIntField(term203338, term203338.getClass(), "level", -1390880191);
        setIntField(term203338, term203338.getClass(), "playKind", 733084027);
        setIntField(term203338, term203338.getClass(), "eventId", 1314581727);
        setField(term203338, term203338.getClass(), "eventName", "kOsVpdMzeB");
        setIntField(term203338, term203338.getClass(), "eventPoint", 759320528);
        setIntField(term203338, term203338.getClass(), "playedUserId1", 982876717);
        setIntField(term203338, term203338.getClass(), "playedUserId2", -321180122);
        setIntField(term203338, term203338.getClass(), "playedUserId3", 1762912383);
        setField(term203338, term203338.getClass(), "playedUserName1", "srfSuLOGZR");
        setField(term203338, term203338.getClass(), "playedUserName2", "bfRIfrPHso");
        setField(term203338, term203338.getClass(), "playedUserName3", "JSZguhHdfJ");
        setIntField(term203338, term203338.getClass(), "playedMusicLevel1", -1154329859);
        setIntField(term203338, term203338.getClass(), "playedMusicLevel2", 719722692);
        setIntField(term203338, term203338.getClass(), "playedMusicLevel3", -1788049849);
        setIntField(term203338, term203338.getClass(), "cardId1", -742041322);
        setIntField(term203338, term203338.getClass(), "cardId2", -671124441);
        setIntField(term203338, term203338.getClass(), "cardId3", 938533783);
        setIntField(term203338, term203338.getClass(), "cardLevel1", -1125401257);
        setIntField(term203338, term203338.getClass(), "cardLevel2", -2142317069);
        setIntField(term203338, term203338.getClass(), "cardLevel3", 2015219082);
        setIntField(term203338, term203338.getClass(), "cardAttack1", 516261940);
        setIntField(term203338, term203338.getClass(), "cardAttack2", 894530883);
        setIntField(term203338, term203338.getClass(), "cardAttack3", -534745648);
        setIntField(term203338, term203338.getClass(), "bossCharaId", -484797447);
        setIntField(term203338, term203338.getClass(), "bossLevel", 2029445652);
        setIntField(term203338, term203338.getClass(), "bossAttribute", 849617026);
        setIntField(term203338, term203338.getClass(), "clearStatus", 300829018);
        setIntField(term203338, term203338.getClass(), "techScore", -691347179);
        setIntField(term203338, term203338.getClass(), "techScoreRank", 1092735670);
        setIntField(term203338, term203338.getClass(), "battleScore", -259065495);
        setIntField(term203338, term203338.getClass(), "battleScoreRank", -560107024);
        setIntField(term203338, term203338.getClass(), "platinumScore", 660630715);
        setIntField(term203338, term203338.getClass(), "maxCombo", 693006347);
        setIntField(term203338, term203338.getClass(), "judgeMiss", 1168153277);
        setIntField(term203338, term203338.getClass(), "judgeHit", -1469071189);
        setIntField(term203338, term203338.getClass(), "judgeBreak", -578033218);
        setIntField(term203338, term203338.getClass(), "judgeCriticalBreak", -590662380);
        setIntField(term203338, term203338.getClass(), "rateTap", -1434317430);
        setIntField(term203338, term203338.getClass(), "rateHold", -1957611106);
        setIntField(term203338, term203338.getClass(), "rateFlick", -1843660330);
        setIntField(term203338, term203338.getClass(), "rateSideTap", 1324882121);
        setIntField(term203338, term203338.getClass(), "rateSideHold", 254828594);
        setIntField(term203338, term203338.getClass(), "bellCount", -2104928418);
        setIntField(term203338, term203338.getClass(), "totalBellCount", -637342505);
        setIntField(term203338, term203338.getClass(), "damageCount", 1064415036);
        setIntField(term203338, term203338.getClass(), "overDamage", -1504699704);
        setBooleanField(term203338, term203338.getClass(), "isTechNewRecord", true);
        setBooleanField(term203338, term203338.getClass(), "isBattleNewRecord", true);
        setBooleanField(term203338, term203338.getClass(), "isOverDamageNewRecord", false);
        setBooleanField(term203338, term203338.getClass(), "isFullCombo", true);
        setBooleanField(term203338, term203338.getClass(), "isFullBell", false);
        setBooleanField(term203338, term203338.getClass(), "isAllBreak", false);
        setIntField(term203338, term203338.getClass(), "playerRating", 188156612);
        setIntField(term203338, term203338.getClass(), "battlePoint", -1650671835);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTechScore", argTypes, term203338, args);
    }

};


