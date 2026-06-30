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

public class UserPlaylog_getEventPoint_19599888212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term188802;

    public UserPlaylog_getEventPoint_19599888212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term188808 = new Long(-4003544865306793676L);
        term188802 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog"));
        Object term188804 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term188806 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term188822 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term188823 = newInstance(Class.forName("java.time.LocalDate"));
        Object term188827 = newInstance(Class.forName("java.time.LocalTime"));
        Object term188832 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term188833 = newInstance(Class.forName("java.time.LocalDate"));
        Object term188837 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term188802, term188802.getClass(), "id", 713089576019309863L);
        setLongField(term188804, term188804.getClass(), "id", 2784989584166782636L);
        setLongField(term188806, term188806.getClass(), "id", 5192263620993850189L);
        setField(term188806, term188806.getClass(), "extId", term188808);
        setField(term188806, term188806.getClass(), "luid", "qbjbrJOfMv");
        setIntField(term188823, term188823.getClass(), "year", 2018);
        setShortField(term188823, term188823.getClass(), "month", (short) 2);
        setShortField(term188823, term188823.getClass(), "day", (short) 20);
        setField(term188822, term188822.getClass(), "date", term188823);
        setByteField(term188827, term188827.getClass(), "hour", (byte) 11);
        setByteField(term188827, term188827.getClass(), "minute", (byte) 56);
        setByteField(term188827, term188827.getClass(), "second", (byte) 7);
        setIntField(term188827, term188827.getClass(), "nano", 207490568);
        setField(term188822, term188822.getClass(), "time", term188827);
        setField(term188806, term188806.getClass(), "registerTime", term188822);
        setIntField(term188833, term188833.getClass(), "year", 2022);
        setShortField(term188833, term188833.getClass(), "month", (short) 7);
        setShortField(term188833, term188833.getClass(), "day", (short) 12);
        setField(term188832, term188832.getClass(), "date", term188833);
        setByteField(term188837, term188837.getClass(), "hour", (byte) 1);
        setByteField(term188837, term188837.getClass(), "minute", (byte) 2);
        setByteField(term188837, term188837.getClass(), "second", (byte) 5);
        setIntField(term188837, term188837.getClass(), "nano", 25761524);
        setField(term188832, term188832.getClass(), "time", term188837);
        setField(term188806, term188806.getClass(), "accessTime", term188832);
        setField(term188804, term188804.getClass(), "card", term188806);
        setField(term188804, term188804.getClass(), "userName", "pSbFsaLGKa");
        setIntField(term188804, term188804.getClass(), "level", 725438012);
        setIntField(term188804, term188804.getClass(), "reincarnationNum", -459474609);
        setLongField(term188804, term188804.getClass(), "exp", 3688805095243382453L);
        setLongField(term188804, term188804.getClass(), "point", 4504937734635718579L);
        setLongField(term188804, term188804.getClass(), "totalPoint", 4550990309509192328L);
        setIntField(term188804, term188804.getClass(), "playCount", -729912360);
        setIntField(term188804, term188804.getClass(), "jewelCount", 1127806915);
        setIntField(term188804, term188804.getClass(), "totalJewelCount", 1677810938);
        setIntField(term188804, term188804.getClass(), "medalCount", 1009836664);
        setIntField(term188804, term188804.getClass(), "playerRating", -618803023);
        setIntField(term188804, term188804.getClass(), "highestRating", -1722657416);
        setIntField(term188804, term188804.getClass(), "battlePoint", -1744594829);
        setIntField(term188804, term188804.getClass(), "bestBattlePoint", -1768664198);
        setIntField(term188804, term188804.getClass(), "overDamageBattlePoint", 524170199);
        setBooleanField(term188804, term188804.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term188804, term188804.getClass(), "nameplateId", 700143207);
        setIntField(term188804, term188804.getClass(), "trophyId", -1290125128);
        setIntField(term188804, term188804.getClass(), "cardId", 2090150392);
        setIntField(term188804, term188804.getClass(), "characterId", 1308493754);
        setIntField(term188804, term188804.getClass(), "characterVoiceNo", 1144770109);
        setIntField(term188804, term188804.getClass(), "tabSetting", -420207799);
        setIntField(term188804, term188804.getClass(), "tabSortSetting", 6916361);
        setIntField(term188804, term188804.getClass(), "cardCategorySetting", -1104408701);
        setIntField(term188804, term188804.getClass(), "cardSortSetting", 1385068700);
        setIntField(term188804, term188804.getClass(), "rivalScoreCategorySetting", -1278190666);
        setIntField(term188804, term188804.getClass(), "playedTutorialBit", 1513109254);
        setIntField(term188804, term188804.getClass(), "firstTutorialCancelNum", -1096037803);
        setLongField(term188804, term188804.getClass(), "sumTechHighScore", -6301961764848707433L);
        setLongField(term188804, term188804.getClass(), "sumTechBasicHighScore", -8747431336815446312L);
        setLongField(term188804, term188804.getClass(), "sumTechAdvancedHighScore", -5237303979276642621L);
        setLongField(term188804, term188804.getClass(), "sumTechExpertHighScore", 827172037650237837L);
        setLongField(term188804, term188804.getClass(), "sumTechMasterHighScore", 1415789027177212909L);
        setLongField(term188804, term188804.getClass(), "sumTechLunaticHighScore", 5250367726867863750L);
        setLongField(term188804, term188804.getClass(), "sumBattleHighScore", 3641398779533777761L);
        setLongField(term188804, term188804.getClass(), "sumBattleBasicHighScore", 517399789627055649L);
        setLongField(term188804, term188804.getClass(), "sumBattleAdvancedHighScore", -6702247661881581347L);
        setLongField(term188804, term188804.getClass(), "sumBattleExpertHighScore", 8109320850468051513L);
        setLongField(term188804, term188804.getClass(), "sumBattleMasterHighScore", -7682038221789898309L);
        setLongField(term188804, term188804.getClass(), "sumBattleLunaticHighScore", 9005437068517350512L);
        setField(term188804, term188804.getClass(), "eventWatchedDate", "BEGlTJryje");
        setField(term188804, term188804.getClass(), "cmEventWatchedDate", "QILsXlghVH");
        setField(term188804, term188804.getClass(), "firstGameId", "ZwsOKRbvqL");
        setField(term188804, term188804.getClass(), "firstRomVersion", "ibDeOdRRgF");
        setField(term188804, term188804.getClass(), "firstDataVersion", "GZHQxpfdwW");
        setField(term188804, term188804.getClass(), "firstPlayDate", "KydKnxKwCI");
        setField(term188804, term188804.getClass(), "lastGameId", "pLrznbdlTH");
        setField(term188804, term188804.getClass(), "lastRomVersion", "vhcRHSsYXX");
        setField(term188804, term188804.getClass(), "lastDataVersion", "BkCNDLLIHK");
        setField(term188804, term188804.getClass(), "compatibleCmVersion", "cgWCmtFNJm");
        setField(term188804, term188804.getClass(), "lastPlayDate", "WIsbZqIWhg");
        setIntField(term188804, term188804.getClass(), "lastPlaceId", 1278328078);
        setField(term188804, term188804.getClass(), "lastPlaceName", "yYeRbmHOzO");
        setIntField(term188804, term188804.getClass(), "lastRegionId", 90110601);
        setField(term188804, term188804.getClass(), "lastRegionName", "QWidkErWlO");
        setIntField(term188804, term188804.getClass(), "lastAllNetId", -1682406235);
        setField(term188804, term188804.getClass(), "lastClientId", "RxhCxLcgzV");
        setIntField(term188804, term188804.getClass(), "lastUsedDeckId", 446615253);
        setIntField(term188804, term188804.getClass(), "lastPlayMusicLevel", -101958090);
        setIntField(term188804, term188804.getClass(), "lastEmoneyBrand", 650819171);
        setField(term188802, term188802.getClass(), "user", term188804);
        setIntField(term188802, term188802.getClass(), "sortNumber", -755429050);
        setIntField(term188802, term188802.getClass(), "placeId", 1338628844);
        setField(term188802, term188802.getClass(), "placeName", "EaqEGPjbqc");
        setField(term188802, term188802.getClass(), "playDate", "IMHaqqAGpx");
        setField(term188802, term188802.getClass(), "userPlayDate", "PeSINYIETy");
        setIntField(term188802, term188802.getClass(), "musicId", 1806608456);
        setIntField(term188802, term188802.getClass(), "level", -1102443676);
        setIntField(term188802, term188802.getClass(), "playKind", 826146957);
        setIntField(term188802, term188802.getClass(), "eventId", 2111085515);
        setField(term188802, term188802.getClass(), "eventName", "KBvcQOXstq");
        setIntField(term188802, term188802.getClass(), "eventPoint", 2060986);
        setIntField(term188802, term188802.getClass(), "playedUserId1", 1033399504);
        setIntField(term188802, term188802.getClass(), "playedUserId2", -863210192);
        setIntField(term188802, term188802.getClass(), "playedUserId3", 829387311);
        setField(term188802, term188802.getClass(), "playedUserName1", "nbGeKYlTwW");
        setField(term188802, term188802.getClass(), "playedUserName2", "FIbTelFONG");
        setField(term188802, term188802.getClass(), "playedUserName3", "wJHjFknbbB");
        setIntField(term188802, term188802.getClass(), "playedMusicLevel1", -1196127941);
        setIntField(term188802, term188802.getClass(), "playedMusicLevel2", 396258542);
        setIntField(term188802, term188802.getClass(), "playedMusicLevel3", 172123409);
        setIntField(term188802, term188802.getClass(), "cardId1", 1029355238);
        setIntField(term188802, term188802.getClass(), "cardId2", -888533020);
        setIntField(term188802, term188802.getClass(), "cardId3", -1902510285);
        setIntField(term188802, term188802.getClass(), "cardLevel1", -1026090353);
        setIntField(term188802, term188802.getClass(), "cardLevel2", -117488752);
        setIntField(term188802, term188802.getClass(), "cardLevel3", 1600435884);
        setIntField(term188802, term188802.getClass(), "cardAttack1", 1871067296);
        setIntField(term188802, term188802.getClass(), "cardAttack2", 1477572376);
        setIntField(term188802, term188802.getClass(), "cardAttack3", -1593818198);
        setIntField(term188802, term188802.getClass(), "bossCharaId", -666808287);
        setIntField(term188802, term188802.getClass(), "bossLevel", -1852558744);
        setIntField(term188802, term188802.getClass(), "bossAttribute", -1101903102);
        setIntField(term188802, term188802.getClass(), "clearStatus", -1507159608);
        setIntField(term188802, term188802.getClass(), "techScore", 1857724245);
        setIntField(term188802, term188802.getClass(), "techScoreRank", 1501360853);
        setIntField(term188802, term188802.getClass(), "battleScore", 1742493339);
        setIntField(term188802, term188802.getClass(), "battleScoreRank", 1655055649);
        setIntField(term188802, term188802.getClass(), "platinumScore", 782864661);
        setIntField(term188802, term188802.getClass(), "maxCombo", -628195221);
        setIntField(term188802, term188802.getClass(), "judgeMiss", -204683138);
        setIntField(term188802, term188802.getClass(), "judgeHit", -1466805424);
        setIntField(term188802, term188802.getClass(), "judgeBreak", -1426893727);
        setIntField(term188802, term188802.getClass(), "judgeCriticalBreak", -388725939);
        setIntField(term188802, term188802.getClass(), "rateTap", -359314137);
        setIntField(term188802, term188802.getClass(), "rateHold", -1602360743);
        setIntField(term188802, term188802.getClass(), "rateFlick", 297534999);
        setIntField(term188802, term188802.getClass(), "rateSideTap", -1696655137);
        setIntField(term188802, term188802.getClass(), "rateSideHold", -184941622);
        setIntField(term188802, term188802.getClass(), "bellCount", 1975019241);
        setIntField(term188802, term188802.getClass(), "totalBellCount", -2140412944);
        setIntField(term188802, term188802.getClass(), "damageCount", 1286651308);
        setIntField(term188802, term188802.getClass(), "overDamage", 833678431);
        setBooleanField(term188802, term188802.getClass(), "isTechNewRecord", true);
        setBooleanField(term188802, term188802.getClass(), "isBattleNewRecord", true);
        setBooleanField(term188802, term188802.getClass(), "isOverDamageNewRecord", false);
        setBooleanField(term188802, term188802.getClass(), "isFullCombo", false);
        setBooleanField(term188802, term188802.getClass(), "isFullBell", false);
        setBooleanField(term188802, term188802.getClass(), "isAllBreak", false);
        setIntField(term188802, term188802.getClass(), "playerRating", -628503839);
        setIntField(term188802, term188802.getClass(), "battlePoint", -1277150544);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEventPoint", argTypes, term188802, args);
    }

};


