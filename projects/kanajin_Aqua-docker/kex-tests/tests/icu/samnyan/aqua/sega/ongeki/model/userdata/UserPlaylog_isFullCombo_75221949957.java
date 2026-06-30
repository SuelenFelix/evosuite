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

public class UserPlaylog_isFullCombo_75221949957 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term217242;

    public UserPlaylog_isFullCombo_75221949957() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term217248 = new Long(-6837989212848250735L);
        term217242 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog"));
        Object term217244 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term217246 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term217262 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term217263 = newInstance(Class.forName("java.time.LocalDate"));
        Object term217267 = newInstance(Class.forName("java.time.LocalTime"));
        Object term217272 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term217273 = newInstance(Class.forName("java.time.LocalDate"));
        Object term217277 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term217242, term217242.getClass(), "id", -846917263311840069L);
        setLongField(term217244, term217244.getClass(), "id", -9166667637663056565L);
        setLongField(term217246, term217246.getClass(), "id", 9121959613346929090L);
        setField(term217246, term217246.getClass(), "extId", term217248);
        setField(term217246, term217246.getClass(), "luid", "jzAINPdgEo");
        setIntField(term217263, term217263.getClass(), "year", 2017);
        setShortField(term217263, term217263.getClass(), "month", (short) 4);
        setShortField(term217263, term217263.getClass(), "day", (short) 16);
        setField(term217262, term217262.getClass(), "date", term217263);
        setByteField(term217267, term217267.getClass(), "hour", (byte) 4);
        setByteField(term217267, term217267.getClass(), "minute", (byte) 46);
        setByteField(term217267, term217267.getClass(), "second", (byte) 10);
        setIntField(term217267, term217267.getClass(), "nano", 543909144);
        setField(term217262, term217262.getClass(), "time", term217267);
        setField(term217246, term217246.getClass(), "registerTime", term217262);
        setIntField(term217273, term217273.getClass(), "year", 2025);
        setShortField(term217273, term217273.getClass(), "month", (short) 1);
        setShortField(term217273, term217273.getClass(), "day", (short) 18);
        setField(term217272, term217272.getClass(), "date", term217273);
        setByteField(term217277, term217277.getClass(), "hour", (byte) 6);
        setByteField(term217277, term217277.getClass(), "minute", (byte) 53);
        setByteField(term217277, term217277.getClass(), "second", (byte) 54);
        setIntField(term217277, term217277.getClass(), "nano", 781716212);
        setField(term217272, term217272.getClass(), "time", term217277);
        setField(term217246, term217246.getClass(), "accessTime", term217272);
        setField(term217244, term217244.getClass(), "card", term217246);
        setField(term217244, term217244.getClass(), "userName", "sVrcNIAywr");
        setIntField(term217244, term217244.getClass(), "level", -112602297);
        setIntField(term217244, term217244.getClass(), "reincarnationNum", -2142300138);
        setLongField(term217244, term217244.getClass(), "exp", -3645821901336733540L);
        setLongField(term217244, term217244.getClass(), "point", -1867308017201037336L);
        setLongField(term217244, term217244.getClass(), "totalPoint", 6887437000471911754L);
        setIntField(term217244, term217244.getClass(), "playCount", -662235369);
        setIntField(term217244, term217244.getClass(), "jewelCount", -188505057);
        setIntField(term217244, term217244.getClass(), "totalJewelCount", 1539547587);
        setIntField(term217244, term217244.getClass(), "medalCount", -109999328);
        setIntField(term217244, term217244.getClass(), "playerRating", 2066479007);
        setIntField(term217244, term217244.getClass(), "highestRating", 513713337);
        setIntField(term217244, term217244.getClass(), "battlePoint", -563013373);
        setIntField(term217244, term217244.getClass(), "bestBattlePoint", -558676728);
        setIntField(term217244, term217244.getClass(), "overDamageBattlePoint", 356027079);
        setBooleanField(term217244, term217244.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term217244, term217244.getClass(), "nameplateId", 1395741052);
        setIntField(term217244, term217244.getClass(), "trophyId", -325013597);
        setIntField(term217244, term217244.getClass(), "cardId", 963111794);
        setIntField(term217244, term217244.getClass(), "characterId", 94574545);
        setIntField(term217244, term217244.getClass(), "characterVoiceNo", 1513786853);
        setIntField(term217244, term217244.getClass(), "tabSetting", 1635757738);
        setIntField(term217244, term217244.getClass(), "tabSortSetting", 1128345792);
        setIntField(term217244, term217244.getClass(), "cardCategorySetting", -556377581);
        setIntField(term217244, term217244.getClass(), "cardSortSetting", 1451482001);
        setIntField(term217244, term217244.getClass(), "rivalScoreCategorySetting", -2078292497);
        setIntField(term217244, term217244.getClass(), "playedTutorialBit", 1009834663);
        setIntField(term217244, term217244.getClass(), "firstTutorialCancelNum", -230210054);
        setLongField(term217244, term217244.getClass(), "sumTechHighScore", -2366037304918024278L);
        setLongField(term217244, term217244.getClass(), "sumTechBasicHighScore", -1612372344470520709L);
        setLongField(term217244, term217244.getClass(), "sumTechAdvancedHighScore", 3781778764103717062L);
        setLongField(term217244, term217244.getClass(), "sumTechExpertHighScore", -469901962958942628L);
        setLongField(term217244, term217244.getClass(), "sumTechMasterHighScore", 4998701411149070298L);
        setLongField(term217244, term217244.getClass(), "sumTechLunaticHighScore", 2824789005744869990L);
        setLongField(term217244, term217244.getClass(), "sumBattleHighScore", 4734111608222429771L);
        setLongField(term217244, term217244.getClass(), "sumBattleBasicHighScore", -5977582233881841694L);
        setLongField(term217244, term217244.getClass(), "sumBattleAdvancedHighScore", -8025764648906742680L);
        setLongField(term217244, term217244.getClass(), "sumBattleExpertHighScore", -6863590631487685970L);
        setLongField(term217244, term217244.getClass(), "sumBattleMasterHighScore", 5741254357015078350L);
        setLongField(term217244, term217244.getClass(), "sumBattleLunaticHighScore", 9064678046081220673L);
        setField(term217244, term217244.getClass(), "eventWatchedDate", "WDntvRKobM");
        setField(term217244, term217244.getClass(), "cmEventWatchedDate", "mJSuTQTfHn");
        setField(term217244, term217244.getClass(), "firstGameId", "acFAOZPfAn");
        setField(term217244, term217244.getClass(), "firstRomVersion", "FbHxdSJvHz");
        setField(term217244, term217244.getClass(), "firstDataVersion", "qoyToBugkf");
        setField(term217244, term217244.getClass(), "firstPlayDate", "PqYWLUTFTg");
        setField(term217244, term217244.getClass(), "lastGameId", "RZqzwBIYkl");
        setField(term217244, term217244.getClass(), "lastRomVersion", "bhSzAfOsQD");
        setField(term217244, term217244.getClass(), "lastDataVersion", "OgNMPElFyF");
        setField(term217244, term217244.getClass(), "compatibleCmVersion", "bFwNCFQgyk");
        setField(term217244, term217244.getClass(), "lastPlayDate", "GVcxOKuiWn");
        setIntField(term217244, term217244.getClass(), "lastPlaceId", -615000850);
        setField(term217244, term217244.getClass(), "lastPlaceName", "NdORRzKUjp");
        setIntField(term217244, term217244.getClass(), "lastRegionId", -753466696);
        setField(term217244, term217244.getClass(), "lastRegionName", "JDFnMAKNwB");
        setIntField(term217244, term217244.getClass(), "lastAllNetId", 1816927743);
        setField(term217244, term217244.getClass(), "lastClientId", "genhsDDRmw");
        setIntField(term217244, term217244.getClass(), "lastUsedDeckId", -499934638);
        setIntField(term217244, term217244.getClass(), "lastPlayMusicLevel", 332996405);
        setIntField(term217244, term217244.getClass(), "lastEmoneyBrand", -2032792413);
        setField(term217242, term217242.getClass(), "user", term217244);
        setIntField(term217242, term217242.getClass(), "sortNumber", -144153639);
        setIntField(term217242, term217242.getClass(), "placeId", -1696480829);
        setField(term217242, term217242.getClass(), "placeName", "KOaOrbbRUs");
        setField(term217242, term217242.getClass(), "playDate", "KqCHuBpskl");
        setField(term217242, term217242.getClass(), "userPlayDate", "sFaxpTrzRf");
        setIntField(term217242, term217242.getClass(), "musicId", -1518205033);
        setIntField(term217242, term217242.getClass(), "level", -1389703991);
        setIntField(term217242, term217242.getClass(), "playKind", 1125567446);
        setIntField(term217242, term217242.getClass(), "eventId", -1287731042);
        setField(term217242, term217242.getClass(), "eventName", "SchVjfSWCX");
        setIntField(term217242, term217242.getClass(), "eventPoint", 1189363638);
        setIntField(term217242, term217242.getClass(), "playedUserId1", -282860769);
        setIntField(term217242, term217242.getClass(), "playedUserId2", -2077950026);
        setIntField(term217242, term217242.getClass(), "playedUserId3", -817927463);
        setField(term217242, term217242.getClass(), "playedUserName1", "vSFfZsLZHr");
        setField(term217242, term217242.getClass(), "playedUserName2", "ozTjUqRpUi");
        setField(term217242, term217242.getClass(), "playedUserName3", "gILgHfWjrp");
        setIntField(term217242, term217242.getClass(), "playedMusicLevel1", 960720214);
        setIntField(term217242, term217242.getClass(), "playedMusicLevel2", -957641184);
        setIntField(term217242, term217242.getClass(), "playedMusicLevel3", 471804975);
        setIntField(term217242, term217242.getClass(), "cardId1", 1899331160);
        setIntField(term217242, term217242.getClass(), "cardId2", 370966868);
        setIntField(term217242, term217242.getClass(), "cardId3", 1534519464);
        setIntField(term217242, term217242.getClass(), "cardLevel1", 1522021119);
        setIntField(term217242, term217242.getClass(), "cardLevel2", 1922776430);
        setIntField(term217242, term217242.getClass(), "cardLevel3", 207030742);
        setIntField(term217242, term217242.getClass(), "cardAttack1", -1102011869);
        setIntField(term217242, term217242.getClass(), "cardAttack2", -407213500);
        setIntField(term217242, term217242.getClass(), "cardAttack3", -1528154718);
        setIntField(term217242, term217242.getClass(), "bossCharaId", -1963134013);
        setIntField(term217242, term217242.getClass(), "bossLevel", -1567320858);
        setIntField(term217242, term217242.getClass(), "bossAttribute", 292846859);
        setIntField(term217242, term217242.getClass(), "clearStatus", 1747705525);
        setIntField(term217242, term217242.getClass(), "techScore", -198676619);
        setIntField(term217242, term217242.getClass(), "techScoreRank", 899931868);
        setIntField(term217242, term217242.getClass(), "battleScore", -826588890);
        setIntField(term217242, term217242.getClass(), "battleScoreRank", 592322019);
        setIntField(term217242, term217242.getClass(), "platinumScore", -1046549331);
        setIntField(term217242, term217242.getClass(), "maxCombo", -798007195);
        setIntField(term217242, term217242.getClass(), "judgeMiss", -606955967);
        setIntField(term217242, term217242.getClass(), "judgeHit", -903464599);
        setIntField(term217242, term217242.getClass(), "judgeBreak", 814440903);
        setIntField(term217242, term217242.getClass(), "judgeCriticalBreak", 766559610);
        setIntField(term217242, term217242.getClass(), "rateTap", -1273191881);
        setIntField(term217242, term217242.getClass(), "rateHold", 313589831);
        setIntField(term217242, term217242.getClass(), "rateFlick", 842617390);
        setIntField(term217242, term217242.getClass(), "rateSideTap", 2085125396);
        setIntField(term217242, term217242.getClass(), "rateSideHold", -1735393631);
        setIntField(term217242, term217242.getClass(), "bellCount", -1094243769);
        setIntField(term217242, term217242.getClass(), "totalBellCount", -673888239);
        setIntField(term217242, term217242.getClass(), "damageCount", 2004435662);
        setIntField(term217242, term217242.getClass(), "overDamage", 2045422512);
        setBooleanField(term217242, term217242.getClass(), "isTechNewRecord", true);
        setBooleanField(term217242, term217242.getClass(), "isBattleNewRecord", true);
        setBooleanField(term217242, term217242.getClass(), "isOverDamageNewRecord", true);
        setBooleanField(term217242, term217242.getClass(), "isFullCombo", false);
        setBooleanField(term217242, term217242.getClass(), "isFullBell", false);
        setBooleanField(term217242, term217242.getClass(), "isAllBreak", false);
        setIntField(term217242, term217242.getClass(), "playerRating", -848743363);
        setIntField(term217242, term217242.getClass(), "battlePoint", 2119087446);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isFullCombo", argTypes, term217242, args);
    }

};


