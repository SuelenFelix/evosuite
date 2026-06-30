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

public class UserMusicDetail_isAllBreake_134716789115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term410345;

    public UserMusicDetail_isAllBreake_134716789115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term410351 = new Long(6320559761926095887L);
        term410345 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicDetail"));
        Object term410347 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term410349 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term410365 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term410366 = newInstance(Class.forName("java.time.LocalDate"));
        Object term410370 = newInstance(Class.forName("java.time.LocalTime"));
        Object term410375 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term410376 = newInstance(Class.forName("java.time.LocalDate"));
        Object term410380 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term410345, term410345.getClass(), "id", 548239283608218118L);
        setLongField(term410347, term410347.getClass(), "id", -2393150017658519295L);
        setLongField(term410349, term410349.getClass(), "id", -282949357886650094L);
        setField(term410349, term410349.getClass(), "extId", term410351);
        setField(term410349, term410349.getClass(), "luid", "FsTiphgkbE");
        setIntField(term410366, term410366.getClass(), "year", 2024);
        setShortField(term410366, term410366.getClass(), "month", (short) 10);
        setShortField(term410366, term410366.getClass(), "day", (short) 4);
        setField(term410365, term410365.getClass(), "date", term410366);
        setByteField(term410370, term410370.getClass(), "hour", (byte) 1);
        setByteField(term410370, term410370.getClass(), "minute", (byte) 35);
        setByteField(term410370, term410370.getClass(), "second", (byte) 2);
        setIntField(term410370, term410370.getClass(), "nano", 781240972);
        setField(term410365, term410365.getClass(), "time", term410370);
        setField(term410349, term410349.getClass(), "registerTime", term410365);
        setIntField(term410376, term410376.getClass(), "year", 2014);
        setShortField(term410376, term410376.getClass(), "month", (short) 6);
        setShortField(term410376, term410376.getClass(), "day", (short) 5);
        setField(term410375, term410375.getClass(), "date", term410376);
        setByteField(term410380, term410380.getClass(), "hour", (byte) 10);
        setByteField(term410380, term410380.getClass(), "minute", (byte) 50);
        setByteField(term410380, term410380.getClass(), "second", (byte) 12);
        setIntField(term410380, term410380.getClass(), "nano", 692629270);
        setField(term410375, term410375.getClass(), "time", term410380);
        setField(term410349, term410349.getClass(), "accessTime", term410375);
        setField(term410347, term410347.getClass(), "card", term410349);
        setField(term410347, term410347.getClass(), "userName", "rXmYJGjfaf");
        setIntField(term410347, term410347.getClass(), "level", -916388929);
        setIntField(term410347, term410347.getClass(), "reincarnationNum", 904052833);
        setLongField(term410347, term410347.getClass(), "exp", 5675685642943024361L);
        setLongField(term410347, term410347.getClass(), "point", 2388536828509795515L);
        setLongField(term410347, term410347.getClass(), "totalPoint", -3183525352022378229L);
        setIntField(term410347, term410347.getClass(), "playCount", 1997283686);
        setIntField(term410347, term410347.getClass(), "jewelCount", -1320401889);
        setIntField(term410347, term410347.getClass(), "totalJewelCount", -831440917);
        setIntField(term410347, term410347.getClass(), "medalCount", -2014223370);
        setIntField(term410347, term410347.getClass(), "playerRating", 1654561683);
        setIntField(term410347, term410347.getClass(), "highestRating", 2075402659);
        setIntField(term410347, term410347.getClass(), "battlePoint", 1914608773);
        setIntField(term410347, term410347.getClass(), "bestBattlePoint", -637528607);
        setIntField(term410347, term410347.getClass(), "overDamageBattlePoint", 2008575126);
        setBooleanField(term410347, term410347.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term410347, term410347.getClass(), "nameplateId", 301667127);
        setIntField(term410347, term410347.getClass(), "trophyId", 1848900496);
        setIntField(term410347, term410347.getClass(), "cardId", -988791435);
        setIntField(term410347, term410347.getClass(), "characterId", -1814683135);
        setIntField(term410347, term410347.getClass(), "characterVoiceNo", 2139308332);
        setIntField(term410347, term410347.getClass(), "tabSetting", 1550222829);
        setIntField(term410347, term410347.getClass(), "tabSortSetting", 83429601);
        setIntField(term410347, term410347.getClass(), "cardCategorySetting", 1322584528);
        setIntField(term410347, term410347.getClass(), "cardSortSetting", 2046421462);
        setIntField(term410347, term410347.getClass(), "rivalScoreCategorySetting", 160865740);
        setIntField(term410347, term410347.getClass(), "playedTutorialBit", 1540479122);
        setIntField(term410347, term410347.getClass(), "firstTutorialCancelNum", 602850305);
        setLongField(term410347, term410347.getClass(), "sumTechHighScore", -2112525754530386827L);
        setLongField(term410347, term410347.getClass(), "sumTechBasicHighScore", -7558640179934958704L);
        setLongField(term410347, term410347.getClass(), "sumTechAdvancedHighScore", 7534275919759555162L);
        setLongField(term410347, term410347.getClass(), "sumTechExpertHighScore", -6297522184197592868L);
        setLongField(term410347, term410347.getClass(), "sumTechMasterHighScore", 8332584667883410658L);
        setLongField(term410347, term410347.getClass(), "sumTechLunaticHighScore", -7684351169632643854L);
        setLongField(term410347, term410347.getClass(), "sumBattleHighScore", -3754325764090193679L);
        setLongField(term410347, term410347.getClass(), "sumBattleBasicHighScore", -2836847517663893738L);
        setLongField(term410347, term410347.getClass(), "sumBattleAdvancedHighScore", -9144061403350933482L);
        setLongField(term410347, term410347.getClass(), "sumBattleExpertHighScore", -2061418607713782861L);
        setLongField(term410347, term410347.getClass(), "sumBattleMasterHighScore", 6663959595334072081L);
        setLongField(term410347, term410347.getClass(), "sumBattleLunaticHighScore", 561545793548791935L);
        setField(term410347, term410347.getClass(), "eventWatchedDate", "ClmXxMCdlJ");
        setField(term410347, term410347.getClass(), "cmEventWatchedDate", "SWLgUMyiCb");
        setField(term410347, term410347.getClass(), "firstGameId", "tvYEXZmCEo");
        setField(term410347, term410347.getClass(), "firstRomVersion", "ivWHDXgMlQ");
        setField(term410347, term410347.getClass(), "firstDataVersion", "APTGcrzMgG");
        setField(term410347, term410347.getClass(), "firstPlayDate", "WtSrlsaVgR");
        setField(term410347, term410347.getClass(), "lastGameId", "xGyAGzGIQP");
        setField(term410347, term410347.getClass(), "lastRomVersion", "pyssAdGxRq");
        setField(term410347, term410347.getClass(), "lastDataVersion", "eaRdieaDnr");
        setField(term410347, term410347.getClass(), "compatibleCmVersion", "oAaRqUkgMm");
        setField(term410347, term410347.getClass(), "lastPlayDate", "ZkDEuXECSS");
        setIntField(term410347, term410347.getClass(), "lastPlaceId", 1705989523);
        setField(term410347, term410347.getClass(), "lastPlaceName", "BfVqWdddCO");
        setIntField(term410347, term410347.getClass(), "lastRegionId", -1070705569);
        setField(term410347, term410347.getClass(), "lastRegionName", "BRXLvxvdxD");
        setIntField(term410347, term410347.getClass(), "lastAllNetId", 453868758);
        setField(term410347, term410347.getClass(), "lastClientId", "YogHqEBRpg");
        setIntField(term410347, term410347.getClass(), "lastUsedDeckId", 1457772906);
        setIntField(term410347, term410347.getClass(), "lastPlayMusicLevel", 262899468);
        setIntField(term410347, term410347.getClass(), "lastEmoneyBrand", -1879208240);
        setField(term410345, term410345.getClass(), "user", term410347);
        setIntField(term410345, term410345.getClass(), "musicId", 777595329);
        setIntField(term410345, term410345.getClass(), "level", 1916300230);
        setIntField(term410345, term410345.getClass(), "playCount", -1641600069);
        setIntField(term410345, term410345.getClass(), "techScoreMax", -1954609547);
        setIntField(term410345, term410345.getClass(), "techScoreRank", 2015118676);
        setIntField(term410345, term410345.getClass(), "battleScoreMax", -1107078384);
        setIntField(term410345, term410345.getClass(), "battleScoreRank", 478449836);
        setIntField(term410345, term410345.getClass(), "maxComboCount", -1452238782);
        setIntField(term410345, term410345.getClass(), "maxOverKill", -1918602278);
        setIntField(term410345, term410345.getClass(), "maxTeamOverKill", 369179668);
        setBooleanField(term410345, term410345.getClass(), "isFullBell", true);
        setBooleanField(term410345, term410345.getClass(), "isFullCombo", true);
        setBooleanField(term410345, term410345.getClass(), "isAllBreake", true);
        setBooleanField(term410345, term410345.getClass(), "isLock", true);
        setIntField(term410345, term410345.getClass(), "clearStatus", 1465687943);
        setBooleanField(term410345, term410345.getClass(), "isStoryWatched", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isAllBreake", argTypes, term410345, args);
    }

};


