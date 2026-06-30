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

public class UserPlaylog_getPlayedUserName1_202131588516 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term191330;

    public UserPlaylog_getPlayedUserName1_202131588516() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term191336 = new Long(4012955251407483889L);
        term191330 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog"));
        Object term191332 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term191334 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term191350 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term191351 = newInstance(Class.forName("java.time.LocalDate"));
        Object term191355 = newInstance(Class.forName("java.time.LocalTime"));
        Object term191360 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term191361 = newInstance(Class.forName("java.time.LocalDate"));
        Object term191365 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term191330, term191330.getClass(), "id", 8334183398809330820L);
        setLongField(term191332, term191332.getClass(), "id", -8676124637070711103L);
        setLongField(term191334, term191334.getClass(), "id", 7783879338190250500L);
        setField(term191334, term191334.getClass(), "extId", term191336);
        setField(term191334, term191334.getClass(), "luid", "zshgXTsVbE");
        setIntField(term191351, term191351.getClass(), "year", 2019);
        setShortField(term191351, term191351.getClass(), "month", (short) 10);
        setShortField(term191351, term191351.getClass(), "day", (short) 19);
        setField(term191350, term191350.getClass(), "date", term191351);
        setByteField(term191355, term191355.getClass(), "hour", (byte) 13);
        setByteField(term191355, term191355.getClass(), "minute", (byte) 22);
        setByteField(term191355, term191355.getClass(), "second", (byte) 53);
        setIntField(term191355, term191355.getClass(), "nano", 628070727);
        setField(term191350, term191350.getClass(), "time", term191355);
        setField(term191334, term191334.getClass(), "registerTime", term191350);
        setIntField(term191361, term191361.getClass(), "year", 2018);
        setShortField(term191361, term191361.getClass(), "month", (short) 3);
        setShortField(term191361, term191361.getClass(), "day", (short) 4);
        setField(term191360, term191360.getClass(), "date", term191361);
        setByteField(term191365, term191365.getClass(), "hour", (byte) 20);
        setByteField(term191365, term191365.getClass(), "minute", (byte) 47);
        setByteField(term191365, term191365.getClass(), "second", (byte) 55);
        setIntField(term191365, term191365.getClass(), "nano", 479898286);
        setField(term191360, term191360.getClass(), "time", term191365);
        setField(term191334, term191334.getClass(), "accessTime", term191360);
        setField(term191332, term191332.getClass(), "card", term191334);
        setField(term191332, term191332.getClass(), "userName", "JNCTnqZpIg");
        setIntField(term191332, term191332.getClass(), "level", 1719745693);
        setIntField(term191332, term191332.getClass(), "reincarnationNum", 1396423456);
        setLongField(term191332, term191332.getClass(), "exp", 4316743640644410772L);
        setLongField(term191332, term191332.getClass(), "point", -4183478737341281242L);
        setLongField(term191332, term191332.getClass(), "totalPoint", -960127958410557996L);
        setIntField(term191332, term191332.getClass(), "playCount", -2091570079);
        setIntField(term191332, term191332.getClass(), "jewelCount", 2001463947);
        setIntField(term191332, term191332.getClass(), "totalJewelCount", -1587664582);
        setIntField(term191332, term191332.getClass(), "medalCount", 672112674);
        setIntField(term191332, term191332.getClass(), "playerRating", -1442617726);
        setIntField(term191332, term191332.getClass(), "highestRating", 1394911907);
        setIntField(term191332, term191332.getClass(), "battlePoint", 1378933437);
        setIntField(term191332, term191332.getClass(), "bestBattlePoint", -570039168);
        setIntField(term191332, term191332.getClass(), "overDamageBattlePoint", -43796344);
        setBooleanField(term191332, term191332.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term191332, term191332.getClass(), "nameplateId", 297571645);
        setIntField(term191332, term191332.getClass(), "trophyId", 2088590010);
        setIntField(term191332, term191332.getClass(), "cardId", -1799691099);
        setIntField(term191332, term191332.getClass(), "characterId", 1473993117);
        setIntField(term191332, term191332.getClass(), "characterVoiceNo", 1696678822);
        setIntField(term191332, term191332.getClass(), "tabSetting", -372738716);
        setIntField(term191332, term191332.getClass(), "tabSortSetting", 1314588637);
        setIntField(term191332, term191332.getClass(), "cardCategorySetting", 303137364);
        setIntField(term191332, term191332.getClass(), "cardSortSetting", 39424528);
        setIntField(term191332, term191332.getClass(), "rivalScoreCategorySetting", -1798333136);
        setIntField(term191332, term191332.getClass(), "playedTutorialBit", -534510293);
        setIntField(term191332, term191332.getClass(), "firstTutorialCancelNum", -650104084);
        setLongField(term191332, term191332.getClass(), "sumTechHighScore", -9109033671281845327L);
        setLongField(term191332, term191332.getClass(), "sumTechBasicHighScore", -9020562412772214681L);
        setLongField(term191332, term191332.getClass(), "sumTechAdvancedHighScore", -9076799915988307065L);
        setLongField(term191332, term191332.getClass(), "sumTechExpertHighScore", -4421656534116492940L);
        setLongField(term191332, term191332.getClass(), "sumTechMasterHighScore", 4314746393079054345L);
        setLongField(term191332, term191332.getClass(), "sumTechLunaticHighScore", 3424047645128515693L);
        setLongField(term191332, term191332.getClass(), "sumBattleHighScore", 4599450768183486649L);
        setLongField(term191332, term191332.getClass(), "sumBattleBasicHighScore", -849061143557743537L);
        setLongField(term191332, term191332.getClass(), "sumBattleAdvancedHighScore", 3274260817753159712L);
        setLongField(term191332, term191332.getClass(), "sumBattleExpertHighScore", -5754577192356906968L);
        setLongField(term191332, term191332.getClass(), "sumBattleMasterHighScore", -6636501985091625487L);
        setLongField(term191332, term191332.getClass(), "sumBattleLunaticHighScore", 6245978369677657049L);
        setField(term191332, term191332.getClass(), "eventWatchedDate", "VjuvMQEpZX");
        setField(term191332, term191332.getClass(), "cmEventWatchedDate", "nAYdUazkEj");
        setField(term191332, term191332.getClass(), "firstGameId", "VyTYMGcrgM");
        setField(term191332, term191332.getClass(), "firstRomVersion", "OeKMJtCDog");
        setField(term191332, term191332.getClass(), "firstDataVersion", "LTceGGZtni");
        setField(term191332, term191332.getClass(), "firstPlayDate", "caYVRSWaEW");
        setField(term191332, term191332.getClass(), "lastGameId", "FcYQsAjyPy");
        setField(term191332, term191332.getClass(), "lastRomVersion", "VcnqcssLhW");
        setField(term191332, term191332.getClass(), "lastDataVersion", "tRFfkVPyod");
        setField(term191332, term191332.getClass(), "compatibleCmVersion", "mcJDrdzGZc");
        setField(term191332, term191332.getClass(), "lastPlayDate", "YcttkdwDXl");
        setIntField(term191332, term191332.getClass(), "lastPlaceId", 849027714);
        setField(term191332, term191332.getClass(), "lastPlaceName", "IZyYESyOBY");
        setIntField(term191332, term191332.getClass(), "lastRegionId", -504830793);
        setField(term191332, term191332.getClass(), "lastRegionName", "uBOKncKWnU");
        setIntField(term191332, term191332.getClass(), "lastAllNetId", 1140138330);
        setField(term191332, term191332.getClass(), "lastClientId", "qmcOViLjxg");
        setIntField(term191332, term191332.getClass(), "lastUsedDeckId", -1814783532);
        setIntField(term191332, term191332.getClass(), "lastPlayMusicLevel", 1096850191);
        setIntField(term191332, term191332.getClass(), "lastEmoneyBrand", -363973920);
        setField(term191330, term191330.getClass(), "user", term191332);
        setIntField(term191330, term191330.getClass(), "sortNumber", -2124629423);
        setIntField(term191330, term191330.getClass(), "placeId", 282123890);
        setField(term191330, term191330.getClass(), "placeName", "SfdVypszRN");
        setField(term191330, term191330.getClass(), "playDate", "qtLTYGkIKy");
        setField(term191330, term191330.getClass(), "userPlayDate", "okeTzncAkm");
        setIntField(term191330, term191330.getClass(), "musicId", -370601142);
        setIntField(term191330, term191330.getClass(), "level", 379917629);
        setIntField(term191330, term191330.getClass(), "playKind", 748860331);
        setIntField(term191330, term191330.getClass(), "eventId", -315010017);
        setField(term191330, term191330.getClass(), "eventName", "uJZdhmQqly");
        setIntField(term191330, term191330.getClass(), "eventPoint", -1573100296);
        setIntField(term191330, term191330.getClass(), "playedUserId1", 1850135733);
        setIntField(term191330, term191330.getClass(), "playedUserId2", 708089991);
        setIntField(term191330, term191330.getClass(), "playedUserId3", -151824010);
        setField(term191330, term191330.getClass(), "playedUserName1", "SlaEVblljq");
        setField(term191330, term191330.getClass(), "playedUserName2", "vWOXFteDkq");
        setField(term191330, term191330.getClass(), "playedUserName3", "IsffVLAFSj");
        setIntField(term191330, term191330.getClass(), "playedMusicLevel1", -1151904761);
        setIntField(term191330, term191330.getClass(), "playedMusicLevel2", 1659023460);
        setIntField(term191330, term191330.getClass(), "playedMusicLevel3", 634488475);
        setIntField(term191330, term191330.getClass(), "cardId1", 1847355342);
        setIntField(term191330, term191330.getClass(), "cardId2", 819839423);
        setIntField(term191330, term191330.getClass(), "cardId3", -1521589570);
        setIntField(term191330, term191330.getClass(), "cardLevel1", 2082551439);
        setIntField(term191330, term191330.getClass(), "cardLevel2", -1320937724);
        setIntField(term191330, term191330.getClass(), "cardLevel3", -1914675402);
        setIntField(term191330, term191330.getClass(), "cardAttack1", 1190614266);
        setIntField(term191330, term191330.getClass(), "cardAttack2", 1145222536);
        setIntField(term191330, term191330.getClass(), "cardAttack3", -161736323);
        setIntField(term191330, term191330.getClass(), "bossCharaId", 321295113);
        setIntField(term191330, term191330.getClass(), "bossLevel", 1168712877);
        setIntField(term191330, term191330.getClass(), "bossAttribute", -1701534718);
        setIntField(term191330, term191330.getClass(), "clearStatus", -841124758);
        setIntField(term191330, term191330.getClass(), "techScore", -716929464);
        setIntField(term191330, term191330.getClass(), "techScoreRank", -1283170380);
        setIntField(term191330, term191330.getClass(), "battleScore", 1069682146);
        setIntField(term191330, term191330.getClass(), "battleScoreRank", -271419315);
        setIntField(term191330, term191330.getClass(), "platinumScore", -1865380686);
        setIntField(term191330, term191330.getClass(), "maxCombo", 894081623);
        setIntField(term191330, term191330.getClass(), "judgeMiss", 1547448267);
        setIntField(term191330, term191330.getClass(), "judgeHit", -1620492868);
        setIntField(term191330, term191330.getClass(), "judgeBreak", -1467327455);
        setIntField(term191330, term191330.getClass(), "judgeCriticalBreak", 735265706);
        setIntField(term191330, term191330.getClass(), "rateTap", -1577402961);
        setIntField(term191330, term191330.getClass(), "rateHold", 833268325);
        setIntField(term191330, term191330.getClass(), "rateFlick", 125421383);
        setIntField(term191330, term191330.getClass(), "rateSideTap", -858858442);
        setIntField(term191330, term191330.getClass(), "rateSideHold", -773751127);
        setIntField(term191330, term191330.getClass(), "bellCount", -1557249454);
        setIntField(term191330, term191330.getClass(), "totalBellCount", 1328672666);
        setIntField(term191330, term191330.getClass(), "damageCount", -650874151);
        setIntField(term191330, term191330.getClass(), "overDamage", -1597812214);
        setBooleanField(term191330, term191330.getClass(), "isTechNewRecord", true);
        setBooleanField(term191330, term191330.getClass(), "isBattleNewRecord", true);
        setBooleanField(term191330, term191330.getClass(), "isOverDamageNewRecord", false);
        setBooleanField(term191330, term191330.getClass(), "isFullCombo", false);
        setBooleanField(term191330, term191330.getClass(), "isFullBell", true);
        setBooleanField(term191330, term191330.getClass(), "isAllBreak", false);
        setIntField(term191330, term191330.getClass(), "playerRating", -681358996);
        setIntField(term191330, term191330.getClass(), "battlePoint", -608099699);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayedUserName1", argTypes, term191330, args);
    }

};


