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

public class UserPlaylog_equals_1286895548124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term260271;
     Object term260673;

    public UserPlaylog_equals_1286895548124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term260277 = new Long(6695041041196724237L);
        term260271 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog"));
        Object term260273 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term260275 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term260291 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term260292 = newInstance(Class.forName("java.time.LocalDate"));
        Object term260296 = newInstance(Class.forName("java.time.LocalTime"));
        Object term260301 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term260302 = newInstance(Class.forName("java.time.LocalDate"));
        Object term260306 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term260271, term260271.getClass(), "id", -5650041113709713472L);
        setLongField(term260273, term260273.getClass(), "id", -318073710460941304L);
        setLongField(term260275, term260275.getClass(), "id", -6604981815460391866L);
        setField(term260275, term260275.getClass(), "extId", term260277);
        setField(term260275, term260275.getClass(), "luid", "BfYbWESTcb");
        setIntField(term260292, term260292.getClass(), "year", 2029);
        setShortField(term260292, term260292.getClass(), "month", (short) 12);
        setShortField(term260292, term260292.getClass(), "day", (short) 20);
        setField(term260291, term260291.getClass(), "date", term260292);
        setByteField(term260296, term260296.getClass(), "hour", (byte) 12);
        setByteField(term260296, term260296.getClass(), "minute", (byte) 40);
        setByteField(term260296, term260296.getClass(), "second", (byte) 30);
        setIntField(term260296, term260296.getClass(), "nano", 927903151);
        setField(term260291, term260291.getClass(), "time", term260296);
        setField(term260275, term260275.getClass(), "registerTime", term260291);
        setIntField(term260302, term260302.getClass(), "year", 2011);
        setShortField(term260302, term260302.getClass(), "month", (short) 9);
        setShortField(term260302, term260302.getClass(), "day", (short) 13);
        setField(term260301, term260301.getClass(), "date", term260302);
        setByteField(term260306, term260306.getClass(), "hour", (byte) 23);
        setByteField(term260306, term260306.getClass(), "minute", (byte) 46);
        setByteField(term260306, term260306.getClass(), "second", (byte) 54);
        setIntField(term260306, term260306.getClass(), "nano", 701561816);
        setField(term260301, term260301.getClass(), "time", term260306);
        setField(term260275, term260275.getClass(), "accessTime", term260301);
        setField(term260273, term260273.getClass(), "card", term260275);
        setField(term260273, term260273.getClass(), "userName", "zLcrvdaGyU");
        setIntField(term260273, term260273.getClass(), "level", 1458099219);
        setIntField(term260273, term260273.getClass(), "reincarnationNum", -1278539504);
        setLongField(term260273, term260273.getClass(), "exp", -6836151137033127730L);
        setLongField(term260273, term260273.getClass(), "point", -6974566131394981325L);
        setLongField(term260273, term260273.getClass(), "totalPoint", 3913519163631706091L);
        setIntField(term260273, term260273.getClass(), "playCount", 1652135036);
        setIntField(term260273, term260273.getClass(), "jewelCount", 909871871);
        setIntField(term260273, term260273.getClass(), "totalJewelCount", -1483569912);
        setIntField(term260273, term260273.getClass(), "medalCount", -1197582769);
        setIntField(term260273, term260273.getClass(), "playerRating", -2007225277);
        setIntField(term260273, term260273.getClass(), "highestRating", -215960445);
        setIntField(term260273, term260273.getClass(), "battlePoint", -2077313277);
        setIntField(term260273, term260273.getClass(), "bestBattlePoint", 296721446);
        setIntField(term260273, term260273.getClass(), "overDamageBattlePoint", -1571698152);
        setBooleanField(term260273, term260273.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term260273, term260273.getClass(), "nameplateId", -1823489423);
        setIntField(term260273, term260273.getClass(), "trophyId", 1561760677);
        setIntField(term260273, term260273.getClass(), "cardId", 729377410);
        setIntField(term260273, term260273.getClass(), "characterId", -925745287);
        setIntField(term260273, term260273.getClass(), "characterVoiceNo", -716933787);
        setIntField(term260273, term260273.getClass(), "tabSetting", -2061540313);
        setIntField(term260273, term260273.getClass(), "tabSortSetting", -1956160644);
        setIntField(term260273, term260273.getClass(), "cardCategorySetting", 559045287);
        setIntField(term260273, term260273.getClass(), "cardSortSetting", -1095401718);
        setIntField(term260273, term260273.getClass(), "rivalScoreCategorySetting", 1264175299);
        setIntField(term260273, term260273.getClass(), "playedTutorialBit", 1513390318);
        setIntField(term260273, term260273.getClass(), "firstTutorialCancelNum", -77887831);
        setLongField(term260273, term260273.getClass(), "sumTechHighScore", 8939253797122524396L);
        setLongField(term260273, term260273.getClass(), "sumTechBasicHighScore", -1439208551493841386L);
        setLongField(term260273, term260273.getClass(), "sumTechAdvancedHighScore", 6570760926306122921L);
        setLongField(term260273, term260273.getClass(), "sumTechExpertHighScore", -2485623213653262563L);
        setLongField(term260273, term260273.getClass(), "sumTechMasterHighScore", 7637295978314861840L);
        setLongField(term260273, term260273.getClass(), "sumTechLunaticHighScore", 8354233249776570154L);
        setLongField(term260273, term260273.getClass(), "sumBattleHighScore", -7615645269616023008L);
        setLongField(term260273, term260273.getClass(), "sumBattleBasicHighScore", 929374817434991687L);
        setLongField(term260273, term260273.getClass(), "sumBattleAdvancedHighScore", -1747443298231505072L);
        setLongField(term260273, term260273.getClass(), "sumBattleExpertHighScore", -1798223639090185181L);
        setLongField(term260273, term260273.getClass(), "sumBattleMasterHighScore", -6500788244765657865L);
        setLongField(term260273, term260273.getClass(), "sumBattleLunaticHighScore", 8875253983186168342L);
        setField(term260273, term260273.getClass(), "eventWatchedDate", "NrEYUPcqwP");
        setField(term260273, term260273.getClass(), "cmEventWatchedDate", "TGeszwaHRe");
        setField(term260273, term260273.getClass(), "firstGameId", "udgIsSKFRr");
        setField(term260273, term260273.getClass(), "firstRomVersion", "aOLivtFpQk");
        setField(term260273, term260273.getClass(), "firstDataVersion", "ZOLKnxBnCK");
        setField(term260273, term260273.getClass(), "firstPlayDate", "NfgTNwHaCV");
        setField(term260273, term260273.getClass(), "lastGameId", "XAejapRogI");
        setField(term260273, term260273.getClass(), "lastRomVersion", "tjtosnRhZg");
        setField(term260273, term260273.getClass(), "lastDataVersion", "fAebRNsXjr");
        setField(term260273, term260273.getClass(), "compatibleCmVersion", "EQODXZdfZL");
        setField(term260273, term260273.getClass(), "lastPlayDate", "QScgqkQatE");
        setIntField(term260273, term260273.getClass(), "lastPlaceId", 890715088);
        setField(term260273, term260273.getClass(), "lastPlaceName", "vLgGnXxXre");
        setIntField(term260273, term260273.getClass(), "lastRegionId", -1484619182);
        setField(term260273, term260273.getClass(), "lastRegionName", "AccEBvkfGm");
        setIntField(term260273, term260273.getClass(), "lastAllNetId", 1078630217);
        setField(term260273, term260273.getClass(), "lastClientId", "RXhiAWuHdv");
        setIntField(term260273, term260273.getClass(), "lastUsedDeckId", -533796969);
        setIntField(term260273, term260273.getClass(), "lastPlayMusicLevel", 941872091);
        setIntField(term260273, term260273.getClass(), "lastEmoneyBrand", 1820570166);
        setField(term260271, term260271.getClass(), "user", term260273);
        setIntField(term260271, term260271.getClass(), "sortNumber", -1537142362);
        setIntField(term260271, term260271.getClass(), "placeId", -1681426668);
        setField(term260271, term260271.getClass(), "placeName", "ERohGnSYkC");
        setField(term260271, term260271.getClass(), "playDate", "yMgWhzgQld");
        setField(term260271, term260271.getClass(), "userPlayDate", "eeXAgrClVJ");
        setIntField(term260271, term260271.getClass(), "musicId", 1594881854);
        setIntField(term260271, term260271.getClass(), "level", -1863338887);
        setIntField(term260271, term260271.getClass(), "playKind", 955798298);
        setIntField(term260271, term260271.getClass(), "eventId", -515709669);
        setField(term260271, term260271.getClass(), "eventName", "tRRSLRxoVF");
        setIntField(term260271, term260271.getClass(), "eventPoint", 1070770536);
        setIntField(term260271, term260271.getClass(), "playedUserId1", -800262090);
        setIntField(term260271, term260271.getClass(), "playedUserId2", 37661005);
        setIntField(term260271, term260271.getClass(), "playedUserId3", -554614529);
        setField(term260271, term260271.getClass(), "playedUserName1", "rogVlsxmoq");
        setField(term260271, term260271.getClass(), "playedUserName2", "PcMQxtTThd");
        setField(term260271, term260271.getClass(), "playedUserName3", "tlNezuIPME");
        setIntField(term260271, term260271.getClass(), "playedMusicLevel1", -749088802);
        setIntField(term260271, term260271.getClass(), "playedMusicLevel2", 865892919);
        setIntField(term260271, term260271.getClass(), "playedMusicLevel3", -1867391923);
        setIntField(term260271, term260271.getClass(), "cardId1", -876106068);
        setIntField(term260271, term260271.getClass(), "cardId2", -789809110);
        setIntField(term260271, term260271.getClass(), "cardId3", 1509606879);
        setIntField(term260271, term260271.getClass(), "cardLevel1", 514418591);
        setIntField(term260271, term260271.getClass(), "cardLevel2", -1594708942);
        setIntField(term260271, term260271.getClass(), "cardLevel3", -1449719534);
        setIntField(term260271, term260271.getClass(), "cardAttack1", 768974922);
        setIntField(term260271, term260271.getClass(), "cardAttack2", -316493673);
        setIntField(term260271, term260271.getClass(), "cardAttack3", 50899844);
        setIntField(term260271, term260271.getClass(), "bossCharaId", 26006285);
        setIntField(term260271, term260271.getClass(), "bossLevel", -30490190);
        setIntField(term260271, term260271.getClass(), "bossAttribute", -1746285079);
        setIntField(term260271, term260271.getClass(), "clearStatus", 254149756);
        setIntField(term260271, term260271.getClass(), "techScore", -1272073230);
        setIntField(term260271, term260271.getClass(), "techScoreRank", 1208369428);
        setIntField(term260271, term260271.getClass(), "battleScore", -405883777);
        setIntField(term260271, term260271.getClass(), "battleScoreRank", -850951391);
        setIntField(term260271, term260271.getClass(), "platinumScore", -15351310);
        setIntField(term260271, term260271.getClass(), "maxCombo", 1351456274);
        setIntField(term260271, term260271.getClass(), "judgeMiss", -1002447476);
        setIntField(term260271, term260271.getClass(), "judgeHit", 1925781036);
        setIntField(term260271, term260271.getClass(), "judgeBreak", -58183224);
        setIntField(term260271, term260271.getClass(), "judgeCriticalBreak", -1620159206);
        setIntField(term260271, term260271.getClass(), "rateTap", 2040576480);
        setIntField(term260271, term260271.getClass(), "rateHold", 708993481);
        setIntField(term260271, term260271.getClass(), "rateFlick", 753265710);
        setIntField(term260271, term260271.getClass(), "rateSideTap", 1870531016);
        setIntField(term260271, term260271.getClass(), "rateSideHold", 1480820350);
        setIntField(term260271, term260271.getClass(), "bellCount", -1991034214);
        setIntField(term260271, term260271.getClass(), "totalBellCount", 888374930);
        setIntField(term260271, term260271.getClass(), "damageCount", -303377527);
        setIntField(term260271, term260271.getClass(), "overDamage", 1314084459);
        setBooleanField(term260271, term260271.getClass(), "isTechNewRecord", true);
        setBooleanField(term260271, term260271.getClass(), "isBattleNewRecord", false);
        setBooleanField(term260271, term260271.getClass(), "isOverDamageNewRecord", true);
        setBooleanField(term260271, term260271.getClass(), "isFullCombo", false);
        setBooleanField(term260271, term260271.getClass(), "isFullBell", false);
        setBooleanField(term260271, term260271.getClass(), "isAllBreak", false);
        setIntField(term260271, term260271.getClass(), "playerRating", 1166953728);
        setIntField(term260271, term260271.getClass(), "battlePoint", -491154679);
        term260673 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term260673;
        callMethod(klass, "equals", argTypes, term260271, args);
    }

};


