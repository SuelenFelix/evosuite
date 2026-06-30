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

public class UserPlaylog_getRateSideHold_157624940649 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term212186;

    public UserPlaylog_getRateSideHold_157624940649() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term212192 = new Long(4096288569907305445L);
        term212186 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog"));
        Object term212188 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term212190 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term212206 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term212207 = newInstance(Class.forName("java.time.LocalDate"));
        Object term212211 = newInstance(Class.forName("java.time.LocalTime"));
        Object term212216 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term212217 = newInstance(Class.forName("java.time.LocalDate"));
        Object term212221 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term212186, term212186.getClass(), "id", -5963342408779721243L);
        setLongField(term212188, term212188.getClass(), "id", 88933260114356547L);
        setLongField(term212190, term212190.getClass(), "id", 6851653249442990584L);
        setField(term212190, term212190.getClass(), "extId", term212192);
        setField(term212190, term212190.getClass(), "luid", "JkPsDinvhK");
        setIntField(term212207, term212207.getClass(), "year", 2027);
        setShortField(term212207, term212207.getClass(), "month", (short) 8);
        setShortField(term212207, term212207.getClass(), "day", (short) 28);
        setField(term212206, term212206.getClass(), "date", term212207);
        setByteField(term212211, term212211.getClass(), "hour", (byte) 18);
        setByteField(term212211, term212211.getClass(), "minute", (byte) 28);
        setByteField(term212211, term212211.getClass(), "second", (byte) 45);
        setIntField(term212211, term212211.getClass(), "nano", 351559461);
        setField(term212206, term212206.getClass(), "time", term212211);
        setField(term212190, term212190.getClass(), "registerTime", term212206);
        setIntField(term212217, term212217.getClass(), "year", 2016);
        setShortField(term212217, term212217.getClass(), "month", (short) 9);
        setShortField(term212217, term212217.getClass(), "day", (short) 28);
        setField(term212216, term212216.getClass(), "date", term212217);
        setByteField(term212221, term212221.getClass(), "hour", (byte) 13);
        setByteField(term212221, term212221.getClass(), "minute", (byte) 19);
        setByteField(term212221, term212221.getClass(), "second", (byte) 21);
        setIntField(term212221, term212221.getClass(), "nano", 258693118);
        setField(term212216, term212216.getClass(), "time", term212221);
        setField(term212190, term212190.getClass(), "accessTime", term212216);
        setField(term212188, term212188.getClass(), "card", term212190);
        setField(term212188, term212188.getClass(), "userName", "lXozXkJEdb");
        setIntField(term212188, term212188.getClass(), "level", -71096217);
        setIntField(term212188, term212188.getClass(), "reincarnationNum", -1809406090);
        setLongField(term212188, term212188.getClass(), "exp", 5739102563597880951L);
        setLongField(term212188, term212188.getClass(), "point", 2846766118789620056L);
        setLongField(term212188, term212188.getClass(), "totalPoint", -4233980847645978877L);
        setIntField(term212188, term212188.getClass(), "playCount", -1783195316);
        setIntField(term212188, term212188.getClass(), "jewelCount", -1932630543);
        setIntField(term212188, term212188.getClass(), "totalJewelCount", -1460939623);
        setIntField(term212188, term212188.getClass(), "medalCount", 1024871937);
        setIntField(term212188, term212188.getClass(), "playerRating", 1248282915);
        setIntField(term212188, term212188.getClass(), "highestRating", 530401633);
        setIntField(term212188, term212188.getClass(), "battlePoint", -2102777765);
        setIntField(term212188, term212188.getClass(), "bestBattlePoint", 994126300);
        setIntField(term212188, term212188.getClass(), "overDamageBattlePoint", -1753144993);
        setBooleanField(term212188, term212188.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term212188, term212188.getClass(), "nameplateId", -829086350);
        setIntField(term212188, term212188.getClass(), "trophyId", 1784256355);
        setIntField(term212188, term212188.getClass(), "cardId", 1725956287);
        setIntField(term212188, term212188.getClass(), "characterId", -84853525);
        setIntField(term212188, term212188.getClass(), "characterVoiceNo", -546326269);
        setIntField(term212188, term212188.getClass(), "tabSetting", 2053693297);
        setIntField(term212188, term212188.getClass(), "tabSortSetting", -1629858755);
        setIntField(term212188, term212188.getClass(), "cardCategorySetting", 357202791);
        setIntField(term212188, term212188.getClass(), "cardSortSetting", 752907570);
        setIntField(term212188, term212188.getClass(), "rivalScoreCategorySetting", -41191754);
        setIntField(term212188, term212188.getClass(), "playedTutorialBit", -298829219);
        setIntField(term212188, term212188.getClass(), "firstTutorialCancelNum", -1327779796);
        setLongField(term212188, term212188.getClass(), "sumTechHighScore", 92093736088761491L);
        setLongField(term212188, term212188.getClass(), "sumTechBasicHighScore", 5829409186054190538L);
        setLongField(term212188, term212188.getClass(), "sumTechAdvancedHighScore", 495841436056901201L);
        setLongField(term212188, term212188.getClass(), "sumTechExpertHighScore", -873800016362220906L);
        setLongField(term212188, term212188.getClass(), "sumTechMasterHighScore", -6481664010461614336L);
        setLongField(term212188, term212188.getClass(), "sumTechLunaticHighScore", 5008463148838041695L);
        setLongField(term212188, term212188.getClass(), "sumBattleHighScore", -6954793213065040205L);
        setLongField(term212188, term212188.getClass(), "sumBattleBasicHighScore", 3436342391247100875L);
        setLongField(term212188, term212188.getClass(), "sumBattleAdvancedHighScore", 5350491402991286599L);
        setLongField(term212188, term212188.getClass(), "sumBattleExpertHighScore", 8365898684422346232L);
        setLongField(term212188, term212188.getClass(), "sumBattleMasterHighScore", -1386887337337605945L);
        setLongField(term212188, term212188.getClass(), "sumBattleLunaticHighScore", 6039526514925686649L);
        setField(term212188, term212188.getClass(), "eventWatchedDate", "NvtklZtQTp");
        setField(term212188, term212188.getClass(), "cmEventWatchedDate", "EMCPKNYNKM");
        setField(term212188, term212188.getClass(), "firstGameId", "yAiKtebcQV");
        setField(term212188, term212188.getClass(), "firstRomVersion", "igVVyETyDE");
        setField(term212188, term212188.getClass(), "firstDataVersion", "aXIXlzWYYW");
        setField(term212188, term212188.getClass(), "firstPlayDate", "uHpOafvlYb");
        setField(term212188, term212188.getClass(), "lastGameId", "HqKNPHdTsZ");
        setField(term212188, term212188.getClass(), "lastRomVersion", "NAkrjjouYH");
        setField(term212188, term212188.getClass(), "lastDataVersion", "dSiUSTAjCX");
        setField(term212188, term212188.getClass(), "compatibleCmVersion", "xBAPqcTBHS");
        setField(term212188, term212188.getClass(), "lastPlayDate", "VFosMMhIdi");
        setIntField(term212188, term212188.getClass(), "lastPlaceId", -386655726);
        setField(term212188, term212188.getClass(), "lastPlaceName", "zUZtiqtfst");
        setIntField(term212188, term212188.getClass(), "lastRegionId", -1507263372);
        setField(term212188, term212188.getClass(), "lastRegionName", "hQcNBUpzME");
        setIntField(term212188, term212188.getClass(), "lastAllNetId", 1422961512);
        setField(term212188, term212188.getClass(), "lastClientId", "eNnBrxvrSt");
        setIntField(term212188, term212188.getClass(), "lastUsedDeckId", 1716206989);
        setIntField(term212188, term212188.getClass(), "lastPlayMusicLevel", -1686050149);
        setIntField(term212188, term212188.getClass(), "lastEmoneyBrand", 801148897);
        setField(term212186, term212186.getClass(), "user", term212188);
        setIntField(term212186, term212186.getClass(), "sortNumber", -1859757820);
        setIntField(term212186, term212186.getClass(), "placeId", -1791319968);
        setField(term212186, term212186.getClass(), "placeName", "PxvnQVNeCZ");
        setField(term212186, term212186.getClass(), "playDate", "DhASIoZdwe");
        setField(term212186, term212186.getClass(), "userPlayDate", "PMrzFHnOYQ");
        setIntField(term212186, term212186.getClass(), "musicId", 80849890);
        setIntField(term212186, term212186.getClass(), "level", -554684079);
        setIntField(term212186, term212186.getClass(), "playKind", 162685569);
        setIntField(term212186, term212186.getClass(), "eventId", -291983428);
        setField(term212186, term212186.getClass(), "eventName", "FrWWpuUBJY");
        setIntField(term212186, term212186.getClass(), "eventPoint", -1465588855);
        setIntField(term212186, term212186.getClass(), "playedUserId1", 758026643);
        setIntField(term212186, term212186.getClass(), "playedUserId2", -1012041102);
        setIntField(term212186, term212186.getClass(), "playedUserId3", 997299459);
        setField(term212186, term212186.getClass(), "playedUserName1", "CHVvZioDMH");
        setField(term212186, term212186.getClass(), "playedUserName2", "qsUACKTmDD");
        setField(term212186, term212186.getClass(), "playedUserName3", "EmkqGYkPzv");
        setIntField(term212186, term212186.getClass(), "playedMusicLevel1", 1765607800);
        setIntField(term212186, term212186.getClass(), "playedMusicLevel2", 1162343322);
        setIntField(term212186, term212186.getClass(), "playedMusicLevel3", -769830529);
        setIntField(term212186, term212186.getClass(), "cardId1", 980926498);
        setIntField(term212186, term212186.getClass(), "cardId2", 215326924);
        setIntField(term212186, term212186.getClass(), "cardId3", -1550515105);
        setIntField(term212186, term212186.getClass(), "cardLevel1", -1856677255);
        setIntField(term212186, term212186.getClass(), "cardLevel2", -1066312681);
        setIntField(term212186, term212186.getClass(), "cardLevel3", 1151101967);
        setIntField(term212186, term212186.getClass(), "cardAttack1", 720162054);
        setIntField(term212186, term212186.getClass(), "cardAttack2", 1656175535);
        setIntField(term212186, term212186.getClass(), "cardAttack3", -529922125);
        setIntField(term212186, term212186.getClass(), "bossCharaId", -1030934359);
        setIntField(term212186, term212186.getClass(), "bossLevel", -1413405889);
        setIntField(term212186, term212186.getClass(), "bossAttribute", 351830399);
        setIntField(term212186, term212186.getClass(), "clearStatus", -398403935);
        setIntField(term212186, term212186.getClass(), "techScore", -1098793577);
        setIntField(term212186, term212186.getClass(), "techScoreRank", 937901039);
        setIntField(term212186, term212186.getClass(), "battleScore", 729310767);
        setIntField(term212186, term212186.getClass(), "battleScoreRank", -517546330);
        setIntField(term212186, term212186.getClass(), "platinumScore", -1850791590);
        setIntField(term212186, term212186.getClass(), "maxCombo", -1853602802);
        setIntField(term212186, term212186.getClass(), "judgeMiss", 1418314493);
        setIntField(term212186, term212186.getClass(), "judgeHit", -232598231);
        setIntField(term212186, term212186.getClass(), "judgeBreak", -1780188367);
        setIntField(term212186, term212186.getClass(), "judgeCriticalBreak", -1733286958);
        setIntField(term212186, term212186.getClass(), "rateTap", 1883405940);
        setIntField(term212186, term212186.getClass(), "rateHold", 821199094);
        setIntField(term212186, term212186.getClass(), "rateFlick", 2054042505);
        setIntField(term212186, term212186.getClass(), "rateSideTap", 1071566861);
        setIntField(term212186, term212186.getClass(), "rateSideHold", 10685441);
        setIntField(term212186, term212186.getClass(), "bellCount", -739572674);
        setIntField(term212186, term212186.getClass(), "totalBellCount", -1228576844);
        setIntField(term212186, term212186.getClass(), "damageCount", 1430441426);
        setIntField(term212186, term212186.getClass(), "overDamage", -33697595);
        setBooleanField(term212186, term212186.getClass(), "isTechNewRecord", true);
        setBooleanField(term212186, term212186.getClass(), "isBattleNewRecord", true);
        setBooleanField(term212186, term212186.getClass(), "isOverDamageNewRecord", false);
        setBooleanField(term212186, term212186.getClass(), "isFullCombo", false);
        setBooleanField(term212186, term212186.getClass(), "isFullBell", false);
        setBooleanField(term212186, term212186.getClass(), "isAllBreak", false);
        setIntField(term212186, term212186.getClass(), "playerRating", 1376076514);
        setIntField(term212186, term212186.getClass(), "battlePoint", -1838652199);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRateSideHold", argTypes, term212186, args);
    }

};


