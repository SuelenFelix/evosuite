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

public class UserPlaylog_getPlayerRating_116561359060 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term219138;

    public UserPlaylog_getPlayerRating_116561359060() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term219144 = new Long(-2614906266506360948L);
        term219138 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog"));
        Object term219140 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term219142 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term219158 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term219159 = newInstance(Class.forName("java.time.LocalDate"));
        Object term219163 = newInstance(Class.forName("java.time.LocalTime"));
        Object term219168 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term219169 = newInstance(Class.forName("java.time.LocalDate"));
        Object term219173 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term219138, term219138.getClass(), "id", 7242225263554767514L);
        setLongField(term219140, term219140.getClass(), "id", 6804456924412460417L);
        setLongField(term219142, term219142.getClass(), "id", -8509469875944408947L);
        setField(term219142, term219142.getClass(), "extId", term219144);
        setField(term219142, term219142.getClass(), "luid", "cJJYfvfkeW");
        setIntField(term219159, term219159.getClass(), "year", 2014);
        setShortField(term219159, term219159.getClass(), "month", (short) 4);
        setShortField(term219159, term219159.getClass(), "day", (short) 29);
        setField(term219158, term219158.getClass(), "date", term219159);
        setByteField(term219163, term219163.getClass(), "hour", (byte) 11);
        setByteField(term219163, term219163.getClass(), "minute", (byte) 34);
        setByteField(term219163, term219163.getClass(), "second", (byte) 37);
        setIntField(term219163, term219163.getClass(), "nano", 983028354);
        setField(term219158, term219158.getClass(), "time", term219163);
        setField(term219142, term219142.getClass(), "registerTime", term219158);
        setIntField(term219169, term219169.getClass(), "year", 2029);
        setShortField(term219169, term219169.getClass(), "month", (short) 7);
        setShortField(term219169, term219169.getClass(), "day", (short) 3);
        setField(term219168, term219168.getClass(), "date", term219169);
        setByteField(term219173, term219173.getClass(), "hour", (byte) 18);
        setByteField(term219173, term219173.getClass(), "minute", (byte) 33);
        setByteField(term219173, term219173.getClass(), "second", (byte) 32);
        setIntField(term219173, term219173.getClass(), "nano", 464450762);
        setField(term219168, term219168.getClass(), "time", term219173);
        setField(term219142, term219142.getClass(), "accessTime", term219168);
        setField(term219140, term219140.getClass(), "card", term219142);
        setField(term219140, term219140.getClass(), "userName", "rzQICgtUoG");
        setIntField(term219140, term219140.getClass(), "level", -430972061);
        setIntField(term219140, term219140.getClass(), "reincarnationNum", 303799281);
        setLongField(term219140, term219140.getClass(), "exp", -9222400055986256741L);
        setLongField(term219140, term219140.getClass(), "point", -3231533722695256678L);
        setLongField(term219140, term219140.getClass(), "totalPoint", -3540280542591861577L);
        setIntField(term219140, term219140.getClass(), "playCount", 993949631);
        setIntField(term219140, term219140.getClass(), "jewelCount", -1501399057);
        setIntField(term219140, term219140.getClass(), "totalJewelCount", 1885755605);
        setIntField(term219140, term219140.getClass(), "medalCount", -865640007);
        setIntField(term219140, term219140.getClass(), "playerRating", -852853895);
        setIntField(term219140, term219140.getClass(), "highestRating", 923992540);
        setIntField(term219140, term219140.getClass(), "battlePoint", -1752952689);
        setIntField(term219140, term219140.getClass(), "bestBattlePoint", -1876841878);
        setIntField(term219140, term219140.getClass(), "overDamageBattlePoint", -314514599);
        setBooleanField(term219140, term219140.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term219140, term219140.getClass(), "nameplateId", 913233303);
        setIntField(term219140, term219140.getClass(), "trophyId", -1757188792);
        setIntField(term219140, term219140.getClass(), "cardId", 988441469);
        setIntField(term219140, term219140.getClass(), "characterId", -152256749);
        setIntField(term219140, term219140.getClass(), "characterVoiceNo", -218639168);
        setIntField(term219140, term219140.getClass(), "tabSetting", -429628062);
        setIntField(term219140, term219140.getClass(), "tabSortSetting", 473106716);
        setIntField(term219140, term219140.getClass(), "cardCategorySetting", -434143406);
        setIntField(term219140, term219140.getClass(), "cardSortSetting", -1144966099);
        setIntField(term219140, term219140.getClass(), "rivalScoreCategorySetting", -56203372);
        setIntField(term219140, term219140.getClass(), "playedTutorialBit", -174061580);
        setIntField(term219140, term219140.getClass(), "firstTutorialCancelNum", 236856575);
        setLongField(term219140, term219140.getClass(), "sumTechHighScore", 2265015118764489452L);
        setLongField(term219140, term219140.getClass(), "sumTechBasicHighScore", 7097125905032602965L);
        setLongField(term219140, term219140.getClass(), "sumTechAdvancedHighScore", -7248453145788248328L);
        setLongField(term219140, term219140.getClass(), "sumTechExpertHighScore", 2044032406923573224L);
        setLongField(term219140, term219140.getClass(), "sumTechMasterHighScore", 374166713753831394L);
        setLongField(term219140, term219140.getClass(), "sumTechLunaticHighScore", 22932753184139997L);
        setLongField(term219140, term219140.getClass(), "sumBattleHighScore", 5105621780223864864L);
        setLongField(term219140, term219140.getClass(), "sumBattleBasicHighScore", 5982813927640588507L);
        setLongField(term219140, term219140.getClass(), "sumBattleAdvancedHighScore", -3324864942925967011L);
        setLongField(term219140, term219140.getClass(), "sumBattleExpertHighScore", 2692970857574549580L);
        setLongField(term219140, term219140.getClass(), "sumBattleMasterHighScore", 7324777923006843295L);
        setLongField(term219140, term219140.getClass(), "sumBattleLunaticHighScore", 7463407575385501468L);
        setField(term219140, term219140.getClass(), "eventWatchedDate", "OzrTIIogYX");
        setField(term219140, term219140.getClass(), "cmEventWatchedDate", "FiuHTXYxCq");
        setField(term219140, term219140.getClass(), "firstGameId", "GxjxMIDnAd");
        setField(term219140, term219140.getClass(), "firstRomVersion", "vFiRYSOyUM");
        setField(term219140, term219140.getClass(), "firstDataVersion", "ujXbNycUcd");
        setField(term219140, term219140.getClass(), "firstPlayDate", "gAbvtKhiTv");
        setField(term219140, term219140.getClass(), "lastGameId", "RJAxEvOrMM");
        setField(term219140, term219140.getClass(), "lastRomVersion", "IsqJSeebBs");
        setField(term219140, term219140.getClass(), "lastDataVersion", "diTEsrXXCQ");
        setField(term219140, term219140.getClass(), "compatibleCmVersion", "SqOEqSQZkw");
        setField(term219140, term219140.getClass(), "lastPlayDate", "PPyLKHSTwq");
        setIntField(term219140, term219140.getClass(), "lastPlaceId", -1726762020);
        setField(term219140, term219140.getClass(), "lastPlaceName", "yDpRwXOtSw");
        setIntField(term219140, term219140.getClass(), "lastRegionId", -632724023);
        setField(term219140, term219140.getClass(), "lastRegionName", "ccgyaCnTmH");
        setIntField(term219140, term219140.getClass(), "lastAllNetId", 1593018448);
        setField(term219140, term219140.getClass(), "lastClientId", "SifpHjYmTO");
        setIntField(term219140, term219140.getClass(), "lastUsedDeckId", 492544194);
        setIntField(term219140, term219140.getClass(), "lastPlayMusicLevel", -1477909979);
        setIntField(term219140, term219140.getClass(), "lastEmoneyBrand", -975558073);
        setField(term219138, term219138.getClass(), "user", term219140);
        setIntField(term219138, term219138.getClass(), "sortNumber", -541335965);
        setIntField(term219138, term219138.getClass(), "placeId", 790308552);
        setField(term219138, term219138.getClass(), "placeName", "IZnDRSkVLZ");
        setField(term219138, term219138.getClass(), "playDate", "uUUzJGuMoJ");
        setField(term219138, term219138.getClass(), "userPlayDate", "lIEluQGchu");
        setIntField(term219138, term219138.getClass(), "musicId", -1543840209);
        setIntField(term219138, term219138.getClass(), "level", 411851539);
        setIntField(term219138, term219138.getClass(), "playKind", -1461527580);
        setIntField(term219138, term219138.getClass(), "eventId", -1241679161);
        setField(term219138, term219138.getClass(), "eventName", "NstGHXZBme");
        setIntField(term219138, term219138.getClass(), "eventPoint", 1139363236);
        setIntField(term219138, term219138.getClass(), "playedUserId1", 1218891668);
        setIntField(term219138, term219138.getClass(), "playedUserId2", -2064671008);
        setIntField(term219138, term219138.getClass(), "playedUserId3", 1799911486);
        setField(term219138, term219138.getClass(), "playedUserName1", "LIOTUNOVds");
        setField(term219138, term219138.getClass(), "playedUserName2", "YfPFrlDgAP");
        setField(term219138, term219138.getClass(), "playedUserName3", "NTlzrMTFhB");
        setIntField(term219138, term219138.getClass(), "playedMusicLevel1", -171214424);
        setIntField(term219138, term219138.getClass(), "playedMusicLevel2", -1028842378);
        setIntField(term219138, term219138.getClass(), "playedMusicLevel3", 1352006091);
        setIntField(term219138, term219138.getClass(), "cardId1", -974628095);
        setIntField(term219138, term219138.getClass(), "cardId2", 59950854);
        setIntField(term219138, term219138.getClass(), "cardId3", -952403503);
        setIntField(term219138, term219138.getClass(), "cardLevel1", 1665910999);
        setIntField(term219138, term219138.getClass(), "cardLevel2", 773753844);
        setIntField(term219138, term219138.getClass(), "cardLevel3", 1562377644);
        setIntField(term219138, term219138.getClass(), "cardAttack1", 188245897);
        setIntField(term219138, term219138.getClass(), "cardAttack2", -1571960696);
        setIntField(term219138, term219138.getClass(), "cardAttack3", -1748371946);
        setIntField(term219138, term219138.getClass(), "bossCharaId", 488706905);
        setIntField(term219138, term219138.getClass(), "bossLevel", -2075020297);
        setIntField(term219138, term219138.getClass(), "bossAttribute", 1023590792);
        setIntField(term219138, term219138.getClass(), "clearStatus", 292628417);
        setIntField(term219138, term219138.getClass(), "techScore", 754216340);
        setIntField(term219138, term219138.getClass(), "techScoreRank", -1024407352);
        setIntField(term219138, term219138.getClass(), "battleScore", 289742263);
        setIntField(term219138, term219138.getClass(), "battleScoreRank", 1509344303);
        setIntField(term219138, term219138.getClass(), "platinumScore", 1042927327);
        setIntField(term219138, term219138.getClass(), "maxCombo", -953392603);
        setIntField(term219138, term219138.getClass(), "judgeMiss", -1912063354);
        setIntField(term219138, term219138.getClass(), "judgeHit", -1503327936);
        setIntField(term219138, term219138.getClass(), "judgeBreak", 621306668);
        setIntField(term219138, term219138.getClass(), "judgeCriticalBreak", 234624020);
        setIntField(term219138, term219138.getClass(), "rateTap", 1280314501);
        setIntField(term219138, term219138.getClass(), "rateHold", 1690660217);
        setIntField(term219138, term219138.getClass(), "rateFlick", -1442537584);
        setIntField(term219138, term219138.getClass(), "rateSideTap", -111918563);
        setIntField(term219138, term219138.getClass(), "rateSideHold", 113698873);
        setIntField(term219138, term219138.getClass(), "bellCount", 885365328);
        setIntField(term219138, term219138.getClass(), "totalBellCount", 1334307126);
        setIntField(term219138, term219138.getClass(), "damageCount", -417895120);
        setIntField(term219138, term219138.getClass(), "overDamage", -1331264461);
        setBooleanField(term219138, term219138.getClass(), "isTechNewRecord", true);
        setBooleanField(term219138, term219138.getClass(), "isBattleNewRecord", false);
        setBooleanField(term219138, term219138.getClass(), "isOverDamageNewRecord", false);
        setBooleanField(term219138, term219138.getClass(), "isFullCombo", true);
        setBooleanField(term219138, term219138.getClass(), "isFullBell", false);
        setBooleanField(term219138, term219138.getClass(), "isAllBreak", true);
        setIntField(term219138, term219138.getClass(), "playerRating", 1127958182);
        setIntField(term219138, term219138.getClass(), "battlePoint", -1458096235);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayerRating", argTypes, term219138, args);
    }

};


