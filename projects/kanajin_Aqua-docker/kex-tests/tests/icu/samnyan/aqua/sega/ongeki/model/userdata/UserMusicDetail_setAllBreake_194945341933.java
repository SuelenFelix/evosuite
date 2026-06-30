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
import java.lang.Boolean;

public class UserMusicDetail_setAllBreake_194945341933 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term418732;
     Object term419013;

    public UserMusicDetail_setAllBreake_194945341933() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term418738 = new Long(-3092537062189928451L);
        term418732 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicDetail"));
        Object term418734 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term418736 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term418752 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term418753 = newInstance(Class.forName("java.time.LocalDate"));
        Object term418757 = newInstance(Class.forName("java.time.LocalTime"));
        Object term418762 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term418763 = newInstance(Class.forName("java.time.LocalDate"));
        Object term418767 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term418732, term418732.getClass(), "id", -2962264635533398274L);
        setLongField(term418734, term418734.getClass(), "id", 3646776705061824657L);
        setLongField(term418736, term418736.getClass(), "id", -7427875133071866152L);
        setField(term418736, term418736.getClass(), "extId", term418738);
        setField(term418736, term418736.getClass(), "luid", "jRzQkSBPuY");
        setIntField(term418753, term418753.getClass(), "year", 2024);
        setShortField(term418753, term418753.getClass(), "month", (short) 4);
        setShortField(term418753, term418753.getClass(), "day", (short) 9);
        setField(term418752, term418752.getClass(), "date", term418753);
        setByteField(term418757, term418757.getClass(), "hour", (byte) 0);
        setByteField(term418757, term418757.getClass(), "minute", (byte) 48);
        setByteField(term418757, term418757.getClass(), "second", (byte) 32);
        setIntField(term418757, term418757.getClass(), "nano", 320317914);
        setField(term418752, term418752.getClass(), "time", term418757);
        setField(term418736, term418736.getClass(), "registerTime", term418752);
        setIntField(term418763, term418763.getClass(), "year", 2010);
        setShortField(term418763, term418763.getClass(), "month", (short) 1);
        setShortField(term418763, term418763.getClass(), "day", (short) 23);
        setField(term418762, term418762.getClass(), "date", term418763);
        setByteField(term418767, term418767.getClass(), "hour", (byte) 17);
        setByteField(term418767, term418767.getClass(), "minute", (byte) 14);
        setByteField(term418767, term418767.getClass(), "second", (byte) 3);
        setIntField(term418767, term418767.getClass(), "nano", 196125620);
        setField(term418762, term418762.getClass(), "time", term418767);
        setField(term418736, term418736.getClass(), "accessTime", term418762);
        setField(term418734, term418734.getClass(), "card", term418736);
        setField(term418734, term418734.getClass(), "userName", "NJpTfZgTNC");
        setIntField(term418734, term418734.getClass(), "level", -593637360);
        setIntField(term418734, term418734.getClass(), "reincarnationNum", 1021463183);
        setLongField(term418734, term418734.getClass(), "exp", -5984904184500546992L);
        setLongField(term418734, term418734.getClass(), "point", -3753032898010670349L);
        setLongField(term418734, term418734.getClass(), "totalPoint", 4857761923906902719L);
        setIntField(term418734, term418734.getClass(), "playCount", 1363855289);
        setIntField(term418734, term418734.getClass(), "jewelCount", -1712071640);
        setIntField(term418734, term418734.getClass(), "totalJewelCount", -971148722);
        setIntField(term418734, term418734.getClass(), "medalCount", 1720903344);
        setIntField(term418734, term418734.getClass(), "playerRating", 1299622391);
        setIntField(term418734, term418734.getClass(), "highestRating", 369662321);
        setIntField(term418734, term418734.getClass(), "battlePoint", 1323658775);
        setIntField(term418734, term418734.getClass(), "bestBattlePoint", -237274667);
        setIntField(term418734, term418734.getClass(), "overDamageBattlePoint", -1221341483);
        setBooleanField(term418734, term418734.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term418734, term418734.getClass(), "nameplateId", 145950176);
        setIntField(term418734, term418734.getClass(), "trophyId", -566045704);
        setIntField(term418734, term418734.getClass(), "cardId", 1614434712);
        setIntField(term418734, term418734.getClass(), "characterId", -369298098);
        setIntField(term418734, term418734.getClass(), "characterVoiceNo", -1320911275);
        setIntField(term418734, term418734.getClass(), "tabSetting", -1516680461);
        setIntField(term418734, term418734.getClass(), "tabSortSetting", -933833145);
        setIntField(term418734, term418734.getClass(), "cardCategorySetting", 8996399);
        setIntField(term418734, term418734.getClass(), "cardSortSetting", 606950328);
        setIntField(term418734, term418734.getClass(), "rivalScoreCategorySetting", 638457802);
        setIntField(term418734, term418734.getClass(), "playedTutorialBit", 319470295);
        setIntField(term418734, term418734.getClass(), "firstTutorialCancelNum", -541395202);
        setLongField(term418734, term418734.getClass(), "sumTechHighScore", -5513865682866519955L);
        setLongField(term418734, term418734.getClass(), "sumTechBasicHighScore", 426044452307258606L);
        setLongField(term418734, term418734.getClass(), "sumTechAdvancedHighScore", 8304421366070039214L);
        setLongField(term418734, term418734.getClass(), "sumTechExpertHighScore", 2198154191348827056L);
        setLongField(term418734, term418734.getClass(), "sumTechMasterHighScore", -7551570621917535247L);
        setLongField(term418734, term418734.getClass(), "sumTechLunaticHighScore", -3698228172952242235L);
        setLongField(term418734, term418734.getClass(), "sumBattleHighScore", 992478561604514308L);
        setLongField(term418734, term418734.getClass(), "sumBattleBasicHighScore", 1620313251101281339L);
        setLongField(term418734, term418734.getClass(), "sumBattleAdvancedHighScore", -3300208159138094261L);
        setLongField(term418734, term418734.getClass(), "sumBattleExpertHighScore", -4897279374299824880L);
        setLongField(term418734, term418734.getClass(), "sumBattleMasterHighScore", 186697328955035658L);
        setLongField(term418734, term418734.getClass(), "sumBattleLunaticHighScore", 8449283413869941788L);
        setField(term418734, term418734.getClass(), "eventWatchedDate", "qoHpRNMTLJ");
        setField(term418734, term418734.getClass(), "cmEventWatchedDate", "QSiREnTiia");
        setField(term418734, term418734.getClass(), "firstGameId", "kWeOMOYXge");
        setField(term418734, term418734.getClass(), "firstRomVersion", "vpPMbDafxR");
        setField(term418734, term418734.getClass(), "firstDataVersion", "SktJTgEbrq");
        setField(term418734, term418734.getClass(), "firstPlayDate", "bkphvaAJUa");
        setField(term418734, term418734.getClass(), "lastGameId", "PSigvFPSPH");
        setField(term418734, term418734.getClass(), "lastRomVersion", "nooRpgbSLm");
        setField(term418734, term418734.getClass(), "lastDataVersion", "YJlJoPbFiB");
        setField(term418734, term418734.getClass(), "compatibleCmVersion", "VAbnJzxbRS");
        setField(term418734, term418734.getClass(), "lastPlayDate", "GdeMjBgWYH");
        setIntField(term418734, term418734.getClass(), "lastPlaceId", 992017929);
        setField(term418734, term418734.getClass(), "lastPlaceName", "InxMAFclmv");
        setIntField(term418734, term418734.getClass(), "lastRegionId", 1682297980);
        setField(term418734, term418734.getClass(), "lastRegionName", "FpVOXxxfqr");
        setIntField(term418734, term418734.getClass(), "lastAllNetId", 465156120);
        setField(term418734, term418734.getClass(), "lastClientId", "WrKJPmITUt");
        setIntField(term418734, term418734.getClass(), "lastUsedDeckId", 2048571160);
        setIntField(term418734, term418734.getClass(), "lastPlayMusicLevel", 165801141);
        setIntField(term418734, term418734.getClass(), "lastEmoneyBrand", -1513645041);
        setField(term418732, term418732.getClass(), "user", term418734);
        setIntField(term418732, term418732.getClass(), "musicId", -1114814678);
        setIntField(term418732, term418732.getClass(), "level", -1766175976);
        setIntField(term418732, term418732.getClass(), "playCount", 478775340);
        setIntField(term418732, term418732.getClass(), "techScoreMax", 1937813136);
        setIntField(term418732, term418732.getClass(), "techScoreRank", -695398609);
        setIntField(term418732, term418732.getClass(), "battleScoreMax", 1327168127);
        setIntField(term418732, term418732.getClass(), "battleScoreRank", 1683372207);
        setIntField(term418732, term418732.getClass(), "maxComboCount", -1425026728);
        setIntField(term418732, term418732.getClass(), "maxOverKill", 333707841);
        setIntField(term418732, term418732.getClass(), "maxTeamOverKill", 39498641);
        setBooleanField(term418732, term418732.getClass(), "isFullBell", false);
        setBooleanField(term418732, term418732.getClass(), "isFullCombo", false);
        setBooleanField(term418732, term418732.getClass(), "isAllBreake", true);
        setBooleanField(term418732, term418732.getClass(), "isLock", true);
        setIntField(term418732, term418732.getClass(), "clearStatus", 508724846);
        setBooleanField(term418732, term418732.getClass(), "isStoryWatched", true);
        term419013 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term419013;
        callMethod(klass, "setAllBreake", argTypes, term418732, args);
    }

};


