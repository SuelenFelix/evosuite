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

public class UserPlaylog_getUserPlayDate_18724749106 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term185010;

    public UserPlaylog_getUserPlayDate_18724749106() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term185016 = new Long(-7273680182770718108L);
        term185010 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog"));
        Object term185012 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term185014 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term185030 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term185031 = newInstance(Class.forName("java.time.LocalDate"));
        Object term185035 = newInstance(Class.forName("java.time.LocalTime"));
        Object term185040 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term185041 = newInstance(Class.forName("java.time.LocalDate"));
        Object term185045 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term185010, term185010.getClass(), "id", -3029001302245362106L);
        setLongField(term185012, term185012.getClass(), "id", 1176329535134080860L);
        setLongField(term185014, term185014.getClass(), "id", -956849515813002310L);
        setField(term185014, term185014.getClass(), "extId", term185016);
        setField(term185014, term185014.getClass(), "luid", "wypGnKmTVO");
        setIntField(term185031, term185031.getClass(), "year", 2026);
        setShortField(term185031, term185031.getClass(), "month", (short) 6);
        setShortField(term185031, term185031.getClass(), "day", (short) 4);
        setField(term185030, term185030.getClass(), "date", term185031);
        setByteField(term185035, term185035.getClass(), "hour", (byte) 14);
        setByteField(term185035, term185035.getClass(), "minute", (byte) 13);
        setByteField(term185035, term185035.getClass(), "second", (byte) 32);
        setIntField(term185035, term185035.getClass(), "nano", 911119428);
        setField(term185030, term185030.getClass(), "time", term185035);
        setField(term185014, term185014.getClass(), "registerTime", term185030);
        setIntField(term185041, term185041.getClass(), "year", 2010);
        setShortField(term185041, term185041.getClass(), "month", (short) 3);
        setShortField(term185041, term185041.getClass(), "day", (short) 18);
        setField(term185040, term185040.getClass(), "date", term185041);
        setByteField(term185045, term185045.getClass(), "hour", (byte) 5);
        setByteField(term185045, term185045.getClass(), "minute", (byte) 31);
        setByteField(term185045, term185045.getClass(), "second", (byte) 55);
        setIntField(term185045, term185045.getClass(), "nano", 783578310);
        setField(term185040, term185040.getClass(), "time", term185045);
        setField(term185014, term185014.getClass(), "accessTime", term185040);
        setField(term185012, term185012.getClass(), "card", term185014);
        setField(term185012, term185012.getClass(), "userName", "ZJyeOTJatG");
        setIntField(term185012, term185012.getClass(), "level", 117135344);
        setIntField(term185012, term185012.getClass(), "reincarnationNum", 1755958093);
        setLongField(term185012, term185012.getClass(), "exp", -6483907418875523184L);
        setLongField(term185012, term185012.getClass(), "point", -3609163494345805186L);
        setLongField(term185012, term185012.getClass(), "totalPoint", 4242550647316343079L);
        setIntField(term185012, term185012.getClass(), "playCount", 539487007);
        setIntField(term185012, term185012.getClass(), "jewelCount", 1325638563);
        setIntField(term185012, term185012.getClass(), "totalJewelCount", 1580065656);
        setIntField(term185012, term185012.getClass(), "medalCount", 535660);
        setIntField(term185012, term185012.getClass(), "playerRating", -809782205);
        setIntField(term185012, term185012.getClass(), "highestRating", -253697422);
        setIntField(term185012, term185012.getClass(), "battlePoint", -1751906935);
        setIntField(term185012, term185012.getClass(), "bestBattlePoint", -739935304);
        setIntField(term185012, term185012.getClass(), "overDamageBattlePoint", 343930030);
        setBooleanField(term185012, term185012.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term185012, term185012.getClass(), "nameplateId", -42006399);
        setIntField(term185012, term185012.getClass(), "trophyId", 1336799594);
        setIntField(term185012, term185012.getClass(), "cardId", -1301911357);
        setIntField(term185012, term185012.getClass(), "characterId", 504881648);
        setIntField(term185012, term185012.getClass(), "characterVoiceNo", 1350912746);
        setIntField(term185012, term185012.getClass(), "tabSetting", -1039288445);
        setIntField(term185012, term185012.getClass(), "tabSortSetting", 2076060135);
        setIntField(term185012, term185012.getClass(), "cardCategorySetting", -529144633);
        setIntField(term185012, term185012.getClass(), "cardSortSetting", -884210737);
        setIntField(term185012, term185012.getClass(), "rivalScoreCategorySetting", -438744694);
        setIntField(term185012, term185012.getClass(), "playedTutorialBit", 510826397);
        setIntField(term185012, term185012.getClass(), "firstTutorialCancelNum", -1227312153);
        setLongField(term185012, term185012.getClass(), "sumTechHighScore", 2907467836687806397L);
        setLongField(term185012, term185012.getClass(), "sumTechBasicHighScore", -5275968844798955518L);
        setLongField(term185012, term185012.getClass(), "sumTechAdvancedHighScore", 7306081329674635089L);
        setLongField(term185012, term185012.getClass(), "sumTechExpertHighScore", 7148058443193955745L);
        setLongField(term185012, term185012.getClass(), "sumTechMasterHighScore", -3375083120558893907L);
        setLongField(term185012, term185012.getClass(), "sumTechLunaticHighScore", -8061922010585633118L);
        setLongField(term185012, term185012.getClass(), "sumBattleHighScore", -28132922818978307L);
        setLongField(term185012, term185012.getClass(), "sumBattleBasicHighScore", 6455656644270038151L);
        setLongField(term185012, term185012.getClass(), "sumBattleAdvancedHighScore", -4993366704575832693L);
        setLongField(term185012, term185012.getClass(), "sumBattleExpertHighScore", -2391200937247895620L);
        setLongField(term185012, term185012.getClass(), "sumBattleMasterHighScore", 6463427973591776612L);
        setLongField(term185012, term185012.getClass(), "sumBattleLunaticHighScore", -4088229342833015337L);
        setField(term185012, term185012.getClass(), "eventWatchedDate", "hTdnBXpOrg");
        setField(term185012, term185012.getClass(), "cmEventWatchedDate", "eirvJIHvNv");
        setField(term185012, term185012.getClass(), "firstGameId", "KlEXYJRndC");
        setField(term185012, term185012.getClass(), "firstRomVersion", "hdCuWcZCRF");
        setField(term185012, term185012.getClass(), "firstDataVersion", "XtoPxpKddi");
        setField(term185012, term185012.getClass(), "firstPlayDate", "ojbuocgBLe");
        setField(term185012, term185012.getClass(), "lastGameId", "uywNOdgSnt");
        setField(term185012, term185012.getClass(), "lastRomVersion", "rRMWZeqfsk");
        setField(term185012, term185012.getClass(), "lastDataVersion", "IdOQAszUjk");
        setField(term185012, term185012.getClass(), "compatibleCmVersion", "XpMUuQdrUZ");
        setField(term185012, term185012.getClass(), "lastPlayDate", "TPYmifEWia");
        setIntField(term185012, term185012.getClass(), "lastPlaceId", -983748653);
        setField(term185012, term185012.getClass(), "lastPlaceName", "IRIegRQckL");
        setIntField(term185012, term185012.getClass(), "lastRegionId", 69606628);
        setField(term185012, term185012.getClass(), "lastRegionName", "oFHoOVYcEY");
        setIntField(term185012, term185012.getClass(), "lastAllNetId", 1551247631);
        setField(term185012, term185012.getClass(), "lastClientId", "SsduBcDNWb");
        setIntField(term185012, term185012.getClass(), "lastUsedDeckId", -650586371);
        setIntField(term185012, term185012.getClass(), "lastPlayMusicLevel", -1350906164);
        setIntField(term185012, term185012.getClass(), "lastEmoneyBrand", 444731205);
        setField(term185010, term185010.getClass(), "user", term185012);
        setIntField(term185010, term185010.getClass(), "sortNumber", -1140021781);
        setIntField(term185010, term185010.getClass(), "placeId", 752670193);
        setField(term185010, term185010.getClass(), "placeName", "cykMaZePdO");
        setField(term185010, term185010.getClass(), "playDate", "TpnkYWqNUj");
        setField(term185010, term185010.getClass(), "userPlayDate", "eNNbxsHrdX");
        setIntField(term185010, term185010.getClass(), "musicId", -1881269322);
        setIntField(term185010, term185010.getClass(), "level", -1156353639);
        setIntField(term185010, term185010.getClass(), "playKind", -2123849351);
        setIntField(term185010, term185010.getClass(), "eventId", -680880020);
        setField(term185010, term185010.getClass(), "eventName", "PHeLqVCgUF");
        setIntField(term185010, term185010.getClass(), "eventPoint", -1038233622);
        setIntField(term185010, term185010.getClass(), "playedUserId1", -1376494298);
        setIntField(term185010, term185010.getClass(), "playedUserId2", 641536751);
        setIntField(term185010, term185010.getClass(), "playedUserId3", 1009826201);
        setField(term185010, term185010.getClass(), "playedUserName1", "pNwyRKGjjM");
        setField(term185010, term185010.getClass(), "playedUserName2", "MSUEuvzuwP");
        setField(term185010, term185010.getClass(), "playedUserName3", "kxHgqohAOx");
        setIntField(term185010, term185010.getClass(), "playedMusicLevel1", -514267762);
        setIntField(term185010, term185010.getClass(), "playedMusicLevel2", -351553807);
        setIntField(term185010, term185010.getClass(), "playedMusicLevel3", -1939890429);
        setIntField(term185010, term185010.getClass(), "cardId1", -2050304978);
        setIntField(term185010, term185010.getClass(), "cardId2", -1960407729);
        setIntField(term185010, term185010.getClass(), "cardId3", -890731167);
        setIntField(term185010, term185010.getClass(), "cardLevel1", 88958658);
        setIntField(term185010, term185010.getClass(), "cardLevel2", -1360000339);
        setIntField(term185010, term185010.getClass(), "cardLevel3", 1151552333);
        setIntField(term185010, term185010.getClass(), "cardAttack1", -1639285726);
        setIntField(term185010, term185010.getClass(), "cardAttack2", 858615712);
        setIntField(term185010, term185010.getClass(), "cardAttack3", -999600154);
        setIntField(term185010, term185010.getClass(), "bossCharaId", -201429161);
        setIntField(term185010, term185010.getClass(), "bossLevel", 1900864076);
        setIntField(term185010, term185010.getClass(), "bossAttribute", 235469007);
        setIntField(term185010, term185010.getClass(), "clearStatus", 1009857473);
        setIntField(term185010, term185010.getClass(), "techScore", 1198152792);
        setIntField(term185010, term185010.getClass(), "techScoreRank", 920073923);
        setIntField(term185010, term185010.getClass(), "battleScore", -626830892);
        setIntField(term185010, term185010.getClass(), "battleScoreRank", 578762810);
        setIntField(term185010, term185010.getClass(), "platinumScore", -377138416);
        setIntField(term185010, term185010.getClass(), "maxCombo", 893990624);
        setIntField(term185010, term185010.getClass(), "judgeMiss", 1423967830);
        setIntField(term185010, term185010.getClass(), "judgeHit", 841806507);
        setIntField(term185010, term185010.getClass(), "judgeBreak", 1652012038);
        setIntField(term185010, term185010.getClass(), "judgeCriticalBreak", 1955474256);
        setIntField(term185010, term185010.getClass(), "rateTap", 2134864696);
        setIntField(term185010, term185010.getClass(), "rateHold", -518554287);
        setIntField(term185010, term185010.getClass(), "rateFlick", 123727036);
        setIntField(term185010, term185010.getClass(), "rateSideTap", 1780326204);
        setIntField(term185010, term185010.getClass(), "rateSideHold", -1863902998);
        setIntField(term185010, term185010.getClass(), "bellCount", -250348280);
        setIntField(term185010, term185010.getClass(), "totalBellCount", -562854876);
        setIntField(term185010, term185010.getClass(), "damageCount", -550640214);
        setIntField(term185010, term185010.getClass(), "overDamage", 221003516);
        setBooleanField(term185010, term185010.getClass(), "isTechNewRecord", false);
        setBooleanField(term185010, term185010.getClass(), "isBattleNewRecord", true);
        setBooleanField(term185010, term185010.getClass(), "isOverDamageNewRecord", false);
        setBooleanField(term185010, term185010.getClass(), "isFullCombo", false);
        setBooleanField(term185010, term185010.getClass(), "isFullBell", true);
        setBooleanField(term185010, term185010.getClass(), "isAllBreak", false);
        setIntField(term185010, term185010.getClass(), "playerRating", 694042457);
        setIntField(term185010, term185010.getClass(), "battlePoint", 415234643);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserPlayDate", argTypes, term185010, args);
    }

};


