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

public class UserPlaylog_getPlatinumScore_100708847439 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term205866;

    public UserPlaylog_getPlatinumScore_100708847439() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term205872 = new Long(2287449183416662404L);
        term205866 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog"));
        Object term205868 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term205870 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term205886 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term205887 = newInstance(Class.forName("java.time.LocalDate"));
        Object term205891 = newInstance(Class.forName("java.time.LocalTime"));
        Object term205896 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term205897 = newInstance(Class.forName("java.time.LocalDate"));
        Object term205901 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term205866, term205866.getClass(), "id", -6991127400049428884L);
        setLongField(term205868, term205868.getClass(), "id", -1933693943060764133L);
        setLongField(term205870, term205870.getClass(), "id", -4003046645689014889L);
        setField(term205870, term205870.getClass(), "extId", term205872);
        setField(term205870, term205870.getClass(), "luid", "FbmXCvKRwt");
        setIntField(term205887, term205887.getClass(), "year", 2016);
        setShortField(term205887, term205887.getClass(), "month", (short) 5);
        setShortField(term205887, term205887.getClass(), "day", (short) 5);
        setField(term205886, term205886.getClass(), "date", term205887);
        setByteField(term205891, term205891.getClass(), "hour", (byte) 17);
        setByteField(term205891, term205891.getClass(), "minute", (byte) 12);
        setByteField(term205891, term205891.getClass(), "second", (byte) 48);
        setIntField(term205891, term205891.getClass(), "nano", 651546858);
        setField(term205886, term205886.getClass(), "time", term205891);
        setField(term205870, term205870.getClass(), "registerTime", term205886);
        setIntField(term205897, term205897.getClass(), "year", 2025);
        setShortField(term205897, term205897.getClass(), "month", (short) 1);
        setShortField(term205897, term205897.getClass(), "day", (short) 28);
        setField(term205896, term205896.getClass(), "date", term205897);
        setByteField(term205901, term205901.getClass(), "hour", (byte) 5);
        setByteField(term205901, term205901.getClass(), "minute", (byte) 55);
        setByteField(term205901, term205901.getClass(), "second", (byte) 9);
        setIntField(term205901, term205901.getClass(), "nano", 554633353);
        setField(term205896, term205896.getClass(), "time", term205901);
        setField(term205870, term205870.getClass(), "accessTime", term205896);
        setField(term205868, term205868.getClass(), "card", term205870);
        setField(term205868, term205868.getClass(), "userName", "vfuyVTMcUs");
        setIntField(term205868, term205868.getClass(), "level", 1398762920);
        setIntField(term205868, term205868.getClass(), "reincarnationNum", 774063243);
        setLongField(term205868, term205868.getClass(), "exp", 6658691713150865522L);
        setLongField(term205868, term205868.getClass(), "point", -6088951695311332675L);
        setLongField(term205868, term205868.getClass(), "totalPoint", -8361095709109236209L);
        setIntField(term205868, term205868.getClass(), "playCount", -99848402);
        setIntField(term205868, term205868.getClass(), "jewelCount", 1606962249);
        setIntField(term205868, term205868.getClass(), "totalJewelCount", -981567119);
        setIntField(term205868, term205868.getClass(), "medalCount", 925481683);
        setIntField(term205868, term205868.getClass(), "playerRating", -1873713064);
        setIntField(term205868, term205868.getClass(), "highestRating", 2075342882);
        setIntField(term205868, term205868.getClass(), "battlePoint", 1797445263);
        setIntField(term205868, term205868.getClass(), "bestBattlePoint", 1653675136);
        setIntField(term205868, term205868.getClass(), "overDamageBattlePoint", 661708296);
        setBooleanField(term205868, term205868.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term205868, term205868.getClass(), "nameplateId", -238072053);
        setIntField(term205868, term205868.getClass(), "trophyId", -1590160640);
        setIntField(term205868, term205868.getClass(), "cardId", 912288551);
        setIntField(term205868, term205868.getClass(), "characterId", 1638500325);
        setIntField(term205868, term205868.getClass(), "characterVoiceNo", 1177380645);
        setIntField(term205868, term205868.getClass(), "tabSetting", -394947882);
        setIntField(term205868, term205868.getClass(), "tabSortSetting", 84960163);
        setIntField(term205868, term205868.getClass(), "cardCategorySetting", -1576427116);
        setIntField(term205868, term205868.getClass(), "cardSortSetting", 836315769);
        setIntField(term205868, term205868.getClass(), "rivalScoreCategorySetting", -848316647);
        setIntField(term205868, term205868.getClass(), "playedTutorialBit", -1208380119);
        setIntField(term205868, term205868.getClass(), "firstTutorialCancelNum", -864238024);
        setLongField(term205868, term205868.getClass(), "sumTechHighScore", 8345721568537802019L);
        setLongField(term205868, term205868.getClass(), "sumTechBasicHighScore", 6375393214793723627L);
        setLongField(term205868, term205868.getClass(), "sumTechAdvancedHighScore", -5691229805091221434L);
        setLongField(term205868, term205868.getClass(), "sumTechExpertHighScore", -8861409251849023554L);
        setLongField(term205868, term205868.getClass(), "sumTechMasterHighScore", -6221207054545737477L);
        setLongField(term205868, term205868.getClass(), "sumTechLunaticHighScore", -1547432966497730106L);
        setLongField(term205868, term205868.getClass(), "sumBattleHighScore", 1514689428748955863L);
        setLongField(term205868, term205868.getClass(), "sumBattleBasicHighScore", 8422562998353389254L);
        setLongField(term205868, term205868.getClass(), "sumBattleAdvancedHighScore", 2579025162835686352L);
        setLongField(term205868, term205868.getClass(), "sumBattleExpertHighScore", -3022212091469657775L);
        setLongField(term205868, term205868.getClass(), "sumBattleMasterHighScore", 2883675100866950179L);
        setLongField(term205868, term205868.getClass(), "sumBattleLunaticHighScore", -2383745875227495097L);
        setField(term205868, term205868.getClass(), "eventWatchedDate", "opHgXUwQGP");
        setField(term205868, term205868.getClass(), "cmEventWatchedDate", "wjTDJQrHWE");
        setField(term205868, term205868.getClass(), "firstGameId", "KSaLmJhcxE");
        setField(term205868, term205868.getClass(), "firstRomVersion", "sryEMADEOO");
        setField(term205868, term205868.getClass(), "firstDataVersion", "xKDNNGzjvj");
        setField(term205868, term205868.getClass(), "firstPlayDate", "ApBiNWRnEc");
        setField(term205868, term205868.getClass(), "lastGameId", "IDmKgcRPdh");
        setField(term205868, term205868.getClass(), "lastRomVersion", "caxOjNGwiL");
        setField(term205868, term205868.getClass(), "lastDataVersion", "JtJYkiGrDe");
        setField(term205868, term205868.getClass(), "compatibleCmVersion", "vkcceVjOTT");
        setField(term205868, term205868.getClass(), "lastPlayDate", "CYxqKIxVOo");
        setIntField(term205868, term205868.getClass(), "lastPlaceId", -1314380245);
        setField(term205868, term205868.getClass(), "lastPlaceName", "YlBXwuYBDH");
        setIntField(term205868, term205868.getClass(), "lastRegionId", 1515851499);
        setField(term205868, term205868.getClass(), "lastRegionName", "dxtSyZnIlU");
        setIntField(term205868, term205868.getClass(), "lastAllNetId", 1012518296);
        setField(term205868, term205868.getClass(), "lastClientId", "REmxEjNVMr");
        setIntField(term205868, term205868.getClass(), "lastUsedDeckId", 1105035324);
        setIntField(term205868, term205868.getClass(), "lastPlayMusicLevel", -1584523024);
        setIntField(term205868, term205868.getClass(), "lastEmoneyBrand", -480708883);
        setField(term205866, term205866.getClass(), "user", term205868);
        setIntField(term205866, term205866.getClass(), "sortNumber", 2138621717);
        setIntField(term205866, term205866.getClass(), "placeId", -215379633);
        setField(term205866, term205866.getClass(), "placeName", "LDuxPzKmkU");
        setField(term205866, term205866.getClass(), "playDate", "WCRUmtCmTC");
        setField(term205866, term205866.getClass(), "userPlayDate", "AkvUMrmZBD");
        setIntField(term205866, term205866.getClass(), "musicId", -1102891843);
        setIntField(term205866, term205866.getClass(), "level", -1019000095);
        setIntField(term205866, term205866.getClass(), "playKind", -840293673);
        setIntField(term205866, term205866.getClass(), "eventId", 1264858800);
        setField(term205866, term205866.getClass(), "eventName", "xjfEZHfbeM");
        setIntField(term205866, term205866.getClass(), "eventPoint", 1788889024);
        setIntField(term205866, term205866.getClass(), "playedUserId1", -1986327151);
        setIntField(term205866, term205866.getClass(), "playedUserId2", 1265876286);
        setIntField(term205866, term205866.getClass(), "playedUserId3", 111275435);
        setField(term205866, term205866.getClass(), "playedUserName1", "NGVYBvLiYI");
        setField(term205866, term205866.getClass(), "playedUserName2", "Zkmgyplfwc");
        setField(term205866, term205866.getClass(), "playedUserName3", "iHfHTXLSld");
        setIntField(term205866, term205866.getClass(), "playedMusicLevel1", 1944060051);
        setIntField(term205866, term205866.getClass(), "playedMusicLevel2", 630074094);
        setIntField(term205866, term205866.getClass(), "playedMusicLevel3", 570208042);
        setIntField(term205866, term205866.getClass(), "cardId1", -93488030);
        setIntField(term205866, term205866.getClass(), "cardId2", 926138799);
        setIntField(term205866, term205866.getClass(), "cardId3", 591313019);
        setIntField(term205866, term205866.getClass(), "cardLevel1", -1755672438);
        setIntField(term205866, term205866.getClass(), "cardLevel2", -2140257584);
        setIntField(term205866, term205866.getClass(), "cardLevel3", -1626490850);
        setIntField(term205866, term205866.getClass(), "cardAttack1", 446978027);
        setIntField(term205866, term205866.getClass(), "cardAttack2", -384315341);
        setIntField(term205866, term205866.getClass(), "cardAttack3", 204740619);
        setIntField(term205866, term205866.getClass(), "bossCharaId", 107555188);
        setIntField(term205866, term205866.getClass(), "bossLevel", -531718135);
        setIntField(term205866, term205866.getClass(), "bossAttribute", 598160626);
        setIntField(term205866, term205866.getClass(), "clearStatus", 1754085320);
        setIntField(term205866, term205866.getClass(), "techScore", -143315713);
        setIntField(term205866, term205866.getClass(), "techScoreRank", -362106921);
        setIntField(term205866, term205866.getClass(), "battleScore", 86367204);
        setIntField(term205866, term205866.getClass(), "battleScoreRank", -602995676);
        setIntField(term205866, term205866.getClass(), "platinumScore", 815088701);
        setIntField(term205866, term205866.getClass(), "maxCombo", 502026234);
        setIntField(term205866, term205866.getClass(), "judgeMiss", -871479292);
        setIntField(term205866, term205866.getClass(), "judgeHit", -1077764191);
        setIntField(term205866, term205866.getClass(), "judgeBreak", 1374586510);
        setIntField(term205866, term205866.getClass(), "judgeCriticalBreak", -354597292);
        setIntField(term205866, term205866.getClass(), "rateTap", -581675259);
        setIntField(term205866, term205866.getClass(), "rateHold", -495803538);
        setIntField(term205866, term205866.getClass(), "rateFlick", -168864726);
        setIntField(term205866, term205866.getClass(), "rateSideTap", 970702834);
        setIntField(term205866, term205866.getClass(), "rateSideHold", -863293599);
        setIntField(term205866, term205866.getClass(), "bellCount", -416844310);
        setIntField(term205866, term205866.getClass(), "totalBellCount", -609565612);
        setIntField(term205866, term205866.getClass(), "damageCount", 1241183529);
        setIntField(term205866, term205866.getClass(), "overDamage", 825457585);
        setBooleanField(term205866, term205866.getClass(), "isTechNewRecord", true);
        setBooleanField(term205866, term205866.getClass(), "isBattleNewRecord", true);
        setBooleanField(term205866, term205866.getClass(), "isOverDamageNewRecord", false);
        setBooleanField(term205866, term205866.getClass(), "isFullCombo", true);
        setBooleanField(term205866, term205866.getClass(), "isFullBell", false);
        setBooleanField(term205866, term205866.getClass(), "isAllBreak", true);
        setIntField(term205866, term205866.getClass(), "playerRating", -365689493);
        setIntField(term205866, term205866.getClass(), "battlePoint", -1044364593);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlatinumScore", argTypes, term205866, args);
    }

};


