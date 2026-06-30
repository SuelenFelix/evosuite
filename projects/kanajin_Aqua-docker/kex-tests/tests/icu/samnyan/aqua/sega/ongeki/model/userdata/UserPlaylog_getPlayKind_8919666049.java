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

public class UserPlaylog_getPlayKind_8919666049 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term186906;

    public UserPlaylog_getPlayKind_8919666049() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term186912 = new Long(9174730812791817537L);
        term186906 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog"));
        Object term186908 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term186910 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term186926 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term186927 = newInstance(Class.forName("java.time.LocalDate"));
        Object term186931 = newInstance(Class.forName("java.time.LocalTime"));
        Object term186936 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term186937 = newInstance(Class.forName("java.time.LocalDate"));
        Object term186941 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term186906, term186906.getClass(), "id", 4476216855495072671L);
        setLongField(term186908, term186908.getClass(), "id", -2746737972931875478L);
        setLongField(term186910, term186910.getClass(), "id", -2149342198360488972L);
        setField(term186910, term186910.getClass(), "extId", term186912);
        setField(term186910, term186910.getClass(), "luid", "EXjflggRNx");
        setIntField(term186927, term186927.getClass(), "year", 2019);
        setShortField(term186927, term186927.getClass(), "month", (short) 3);
        setShortField(term186927, term186927.getClass(), "day", (short) 14);
        setField(term186926, term186926.getClass(), "date", term186927);
        setByteField(term186931, term186931.getClass(), "hour", (byte) 21);
        setByteField(term186931, term186931.getClass(), "minute", (byte) 1);
        setByteField(term186931, term186931.getClass(), "second", (byte) 27);
        setIntField(term186931, term186931.getClass(), "nano", 855781320);
        setField(term186926, term186926.getClass(), "time", term186931);
        setField(term186910, term186910.getClass(), "registerTime", term186926);
        setIntField(term186937, term186937.getClass(), "year", 2010);
        setShortField(term186937, term186937.getClass(), "month", (short) 2);
        setShortField(term186937, term186937.getClass(), "day", (short) 1);
        setField(term186936, term186936.getClass(), "date", term186937);
        setByteField(term186941, term186941.getClass(), "hour", (byte) 15);
        setByteField(term186941, term186941.getClass(), "minute", (byte) 12);
        setByteField(term186941, term186941.getClass(), "second", (byte) 8);
        setIntField(term186941, term186941.getClass(), "nano", 722621943);
        setField(term186936, term186936.getClass(), "time", term186941);
        setField(term186910, term186910.getClass(), "accessTime", term186936);
        setField(term186908, term186908.getClass(), "card", term186910);
        setField(term186908, term186908.getClass(), "userName", "PgMPqpnlSJ");
        setIntField(term186908, term186908.getClass(), "level", 1966327252);
        setIntField(term186908, term186908.getClass(), "reincarnationNum", 1878159126);
        setLongField(term186908, term186908.getClass(), "exp", -7034296151494978066L);
        setLongField(term186908, term186908.getClass(), "point", -6146142113347625999L);
        setLongField(term186908, term186908.getClass(), "totalPoint", -7133010630953586020L);
        setIntField(term186908, term186908.getClass(), "playCount", -1511966316);
        setIntField(term186908, term186908.getClass(), "jewelCount", 782589981);
        setIntField(term186908, term186908.getClass(), "totalJewelCount", 2072055445);
        setIntField(term186908, term186908.getClass(), "medalCount", -604514122);
        setIntField(term186908, term186908.getClass(), "playerRating", -1364954228);
        setIntField(term186908, term186908.getClass(), "highestRating", -2097031932);
        setIntField(term186908, term186908.getClass(), "battlePoint", 830347728);
        setIntField(term186908, term186908.getClass(), "bestBattlePoint", 1528415765);
        setIntField(term186908, term186908.getClass(), "overDamageBattlePoint", -790690511);
        setBooleanField(term186908, term186908.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term186908, term186908.getClass(), "nameplateId", -2007184748);
        setIntField(term186908, term186908.getClass(), "trophyId", 792882108);
        setIntField(term186908, term186908.getClass(), "cardId", 2119225413);
        setIntField(term186908, term186908.getClass(), "characterId", 1862656703);
        setIntField(term186908, term186908.getClass(), "characterVoiceNo", 1394553752);
        setIntField(term186908, term186908.getClass(), "tabSetting", -1070458690);
        setIntField(term186908, term186908.getClass(), "tabSortSetting", -1037572139);
        setIntField(term186908, term186908.getClass(), "cardCategorySetting", 946784328);
        setIntField(term186908, term186908.getClass(), "cardSortSetting", 773507510);
        setIntField(term186908, term186908.getClass(), "rivalScoreCategorySetting", -1404471865);
        setIntField(term186908, term186908.getClass(), "playedTutorialBit", -1734326428);
        setIntField(term186908, term186908.getClass(), "firstTutorialCancelNum", 599751351);
        setLongField(term186908, term186908.getClass(), "sumTechHighScore", -1097157523065435288L);
        setLongField(term186908, term186908.getClass(), "sumTechBasicHighScore", -7844861193927750132L);
        setLongField(term186908, term186908.getClass(), "sumTechAdvancedHighScore", -860682302683028822L);
        setLongField(term186908, term186908.getClass(), "sumTechExpertHighScore", 17244785355570463L);
        setLongField(term186908, term186908.getClass(), "sumTechMasterHighScore", 995195003475950632L);
        setLongField(term186908, term186908.getClass(), "sumTechLunaticHighScore", -2796992689516620991L);
        setLongField(term186908, term186908.getClass(), "sumBattleHighScore", 8580748612869592157L);
        setLongField(term186908, term186908.getClass(), "sumBattleBasicHighScore", -5159869066555402511L);
        setLongField(term186908, term186908.getClass(), "sumBattleAdvancedHighScore", -1243173272477811733L);
        setLongField(term186908, term186908.getClass(), "sumBattleExpertHighScore", -5732733563551384959L);
        setLongField(term186908, term186908.getClass(), "sumBattleMasterHighScore", 6507693519590541316L);
        setLongField(term186908, term186908.getClass(), "sumBattleLunaticHighScore", -666884393422185190L);
        setField(term186908, term186908.getClass(), "eventWatchedDate", "SxfQzUVFcM");
        setField(term186908, term186908.getClass(), "cmEventWatchedDate", "KcuTYTFMUf");
        setField(term186908, term186908.getClass(), "firstGameId", "duoDGJxDsp");
        setField(term186908, term186908.getClass(), "firstRomVersion", "WGJVyGNNwV");
        setField(term186908, term186908.getClass(), "firstDataVersion", "dqaCYPfqWF");
        setField(term186908, term186908.getClass(), "firstPlayDate", "vGGvtGbfze");
        setField(term186908, term186908.getClass(), "lastGameId", "jWmpFQNuJp");
        setField(term186908, term186908.getClass(), "lastRomVersion", "dQGTDrUjmt");
        setField(term186908, term186908.getClass(), "lastDataVersion", "ITLIaODlGc");
        setField(term186908, term186908.getClass(), "compatibleCmVersion", "kZiqgxcCTP");
        setField(term186908, term186908.getClass(), "lastPlayDate", "LoJRQPNqoD");
        setIntField(term186908, term186908.getClass(), "lastPlaceId", -1744677844);
        setField(term186908, term186908.getClass(), "lastPlaceName", "gXdFddXyRw");
        setIntField(term186908, term186908.getClass(), "lastRegionId", 2043210489);
        setField(term186908, term186908.getClass(), "lastRegionName", "AmYGzDcymG");
        setIntField(term186908, term186908.getClass(), "lastAllNetId", 633961334);
        setField(term186908, term186908.getClass(), "lastClientId", "OuPFXYLHnZ");
        setIntField(term186908, term186908.getClass(), "lastUsedDeckId", 1646368018);
        setIntField(term186908, term186908.getClass(), "lastPlayMusicLevel", -1919736389);
        setIntField(term186908, term186908.getClass(), "lastEmoneyBrand", -50803568);
        setField(term186906, term186906.getClass(), "user", term186908);
        setIntField(term186906, term186906.getClass(), "sortNumber", 355570570);
        setIntField(term186906, term186906.getClass(), "placeId", -1567660546);
        setField(term186906, term186906.getClass(), "placeName", "LvqRPoVTcD");
        setField(term186906, term186906.getClass(), "playDate", "kMMtGnlzVA");
        setField(term186906, term186906.getClass(), "userPlayDate", "BEoDKOnmGz");
        setIntField(term186906, term186906.getClass(), "musicId", -301726238);
        setIntField(term186906, term186906.getClass(), "level", -724083201);
        setIntField(term186906, term186906.getClass(), "playKind", 603902059);
        setIntField(term186906, term186906.getClass(), "eventId", 2127733128);
        setField(term186906, term186906.getClass(), "eventName", "bWdbzxGXLQ");
        setIntField(term186906, term186906.getClass(), "eventPoint", -1881343665);
        setIntField(term186906, term186906.getClass(), "playedUserId1", -1946066087);
        setIntField(term186906, term186906.getClass(), "playedUserId2", -691706938);
        setIntField(term186906, term186906.getClass(), "playedUserId3", -434771166);
        setField(term186906, term186906.getClass(), "playedUserName1", "JMTsbSARpN");
        setField(term186906, term186906.getClass(), "playedUserName2", "XAadPSqCed");
        setField(term186906, term186906.getClass(), "playedUserName3", "munBmcPVsD");
        setIntField(term186906, term186906.getClass(), "playedMusicLevel1", 379493778);
        setIntField(term186906, term186906.getClass(), "playedMusicLevel2", -1891113742);
        setIntField(term186906, term186906.getClass(), "playedMusicLevel3", -1740565252);
        setIntField(term186906, term186906.getClass(), "cardId1", -948536342);
        setIntField(term186906, term186906.getClass(), "cardId2", -1395192813);
        setIntField(term186906, term186906.getClass(), "cardId3", -43251386);
        setIntField(term186906, term186906.getClass(), "cardLevel1", -2008817863);
        setIntField(term186906, term186906.getClass(), "cardLevel2", -1575786190);
        setIntField(term186906, term186906.getClass(), "cardLevel3", -1918011322);
        setIntField(term186906, term186906.getClass(), "cardAttack1", -1750849256);
        setIntField(term186906, term186906.getClass(), "cardAttack2", 1034411205);
        setIntField(term186906, term186906.getClass(), "cardAttack3", 1005342524);
        setIntField(term186906, term186906.getClass(), "bossCharaId", 1405943068);
        setIntField(term186906, term186906.getClass(), "bossLevel", 1327202782);
        setIntField(term186906, term186906.getClass(), "bossAttribute", -333180006);
        setIntField(term186906, term186906.getClass(), "clearStatus", -575052731);
        setIntField(term186906, term186906.getClass(), "techScore", -1792389700);
        setIntField(term186906, term186906.getClass(), "techScoreRank", 852503132);
        setIntField(term186906, term186906.getClass(), "battleScore", -725027019);
        setIntField(term186906, term186906.getClass(), "battleScoreRank", -1677510716);
        setIntField(term186906, term186906.getClass(), "platinumScore", -1566098062);
        setIntField(term186906, term186906.getClass(), "maxCombo", -515297906);
        setIntField(term186906, term186906.getClass(), "judgeMiss", -824003664);
        setIntField(term186906, term186906.getClass(), "judgeHit", 2103484915);
        setIntField(term186906, term186906.getClass(), "judgeBreak", -1152232729);
        setIntField(term186906, term186906.getClass(), "judgeCriticalBreak", 1155067850);
        setIntField(term186906, term186906.getClass(), "rateTap", -1941137904);
        setIntField(term186906, term186906.getClass(), "rateHold", -2027575410);
        setIntField(term186906, term186906.getClass(), "rateFlick", -2077238638);
        setIntField(term186906, term186906.getClass(), "rateSideTap", -708951514);
        setIntField(term186906, term186906.getClass(), "rateSideHold", 287450588);
        setIntField(term186906, term186906.getClass(), "bellCount", -1120512550);
        setIntField(term186906, term186906.getClass(), "totalBellCount", -1302516626);
        setIntField(term186906, term186906.getClass(), "damageCount", 364431382);
        setIntField(term186906, term186906.getClass(), "overDamage", -1871723538);
        setBooleanField(term186906, term186906.getClass(), "isTechNewRecord", false);
        setBooleanField(term186906, term186906.getClass(), "isBattleNewRecord", true);
        setBooleanField(term186906, term186906.getClass(), "isOverDamageNewRecord", false);
        setBooleanField(term186906, term186906.getClass(), "isFullCombo", true);
        setBooleanField(term186906, term186906.getClass(), "isFullBell", true);
        setBooleanField(term186906, term186906.getClass(), "isAllBreak", false);
        setIntField(term186906, term186906.getClass(), "playerRating", 190634728);
        setIntField(term186906, term186906.getClass(), "battlePoint", 355866861);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayKind", argTypes, term186906, args);
    }

};


