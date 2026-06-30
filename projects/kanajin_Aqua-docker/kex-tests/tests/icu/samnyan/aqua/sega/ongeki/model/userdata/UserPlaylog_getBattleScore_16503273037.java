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

public class UserPlaylog_getBattleScore_16503273037 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term204602;

    public UserPlaylog_getBattleScore_16503273037() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term204608 = new Long(-412186147449928821L);
        term204602 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog"));
        Object term204604 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term204606 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term204622 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term204623 = newInstance(Class.forName("java.time.LocalDate"));
        Object term204627 = newInstance(Class.forName("java.time.LocalTime"));
        Object term204632 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term204633 = newInstance(Class.forName("java.time.LocalDate"));
        Object term204637 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term204602, term204602.getClass(), "id", -2882457524702747753L);
        setLongField(term204604, term204604.getClass(), "id", -4833561595834608141L);
        setLongField(term204606, term204606.getClass(), "id", 8655300051981404212L);
        setField(term204606, term204606.getClass(), "extId", term204608);
        setField(term204606, term204606.getClass(), "luid", "dKBKbXYYRZ");
        setIntField(term204623, term204623.getClass(), "year", 2028);
        setShortField(term204623, term204623.getClass(), "month", (short) 4);
        setShortField(term204623, term204623.getClass(), "day", (short) 5);
        setField(term204622, term204622.getClass(), "date", term204623);
        setByteField(term204627, term204627.getClass(), "hour", (byte) 14);
        setByteField(term204627, term204627.getClass(), "minute", (byte) 57);
        setByteField(term204627, term204627.getClass(), "second", (byte) 16);
        setIntField(term204627, term204627.getClass(), "nano", 963050998);
        setField(term204622, term204622.getClass(), "time", term204627);
        setField(term204606, term204606.getClass(), "registerTime", term204622);
        setIntField(term204633, term204633.getClass(), "year", 2027);
        setShortField(term204633, term204633.getClass(), "month", (short) 12);
        setShortField(term204633, term204633.getClass(), "day", (short) 25);
        setField(term204632, term204632.getClass(), "date", term204633);
        setByteField(term204637, term204637.getClass(), "hour", (byte) 19);
        setByteField(term204637, term204637.getClass(), "minute", (byte) 4);
        setByteField(term204637, term204637.getClass(), "second", (byte) 19);
        setIntField(term204637, term204637.getClass(), "nano", 237686859);
        setField(term204632, term204632.getClass(), "time", term204637);
        setField(term204606, term204606.getClass(), "accessTime", term204632);
        setField(term204604, term204604.getClass(), "card", term204606);
        setField(term204604, term204604.getClass(), "userName", "IkItfbpcap");
        setIntField(term204604, term204604.getClass(), "level", -912383879);
        setIntField(term204604, term204604.getClass(), "reincarnationNum", 419612893);
        setLongField(term204604, term204604.getClass(), "exp", 3841980887212256720L);
        setLongField(term204604, term204604.getClass(), "point", -2082189178019847660L);
        setLongField(term204604, term204604.getClass(), "totalPoint", 3649077341095610714L);
        setIntField(term204604, term204604.getClass(), "playCount", -1688808288);
        setIntField(term204604, term204604.getClass(), "jewelCount", 1315643953);
        setIntField(term204604, term204604.getClass(), "totalJewelCount", -169654203);
        setIntField(term204604, term204604.getClass(), "medalCount", 1943787075);
        setIntField(term204604, term204604.getClass(), "playerRating", -1518545816);
        setIntField(term204604, term204604.getClass(), "highestRating", -871898637);
        setIntField(term204604, term204604.getClass(), "battlePoint", -324898193);
        setIntField(term204604, term204604.getClass(), "bestBattlePoint", 1377591788);
        setIntField(term204604, term204604.getClass(), "overDamageBattlePoint", -557099510);
        setBooleanField(term204604, term204604.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term204604, term204604.getClass(), "nameplateId", 261292224);
        setIntField(term204604, term204604.getClass(), "trophyId", 65468982);
        setIntField(term204604, term204604.getClass(), "cardId", -950398966);
        setIntField(term204604, term204604.getClass(), "characterId", 1057009872);
        setIntField(term204604, term204604.getClass(), "characterVoiceNo", 1118718954);
        setIntField(term204604, term204604.getClass(), "tabSetting", -387115439);
        setIntField(term204604, term204604.getClass(), "tabSortSetting", -2074423972);
        setIntField(term204604, term204604.getClass(), "cardCategorySetting", -1404041303);
        setIntField(term204604, term204604.getClass(), "cardSortSetting", 1888933683);
        setIntField(term204604, term204604.getClass(), "rivalScoreCategorySetting", -2124091816);
        setIntField(term204604, term204604.getClass(), "playedTutorialBit", 1980547779);
        setIntField(term204604, term204604.getClass(), "firstTutorialCancelNum", 1413150509);
        setLongField(term204604, term204604.getClass(), "sumTechHighScore", -2969313522894122314L);
        setLongField(term204604, term204604.getClass(), "sumTechBasicHighScore", -1112677829107158544L);
        setLongField(term204604, term204604.getClass(), "sumTechAdvancedHighScore", 2837387316351102987L);
        setLongField(term204604, term204604.getClass(), "sumTechExpertHighScore", 5017180119961157803L);
        setLongField(term204604, term204604.getClass(), "sumTechMasterHighScore", -2482633767902300908L);
        setLongField(term204604, term204604.getClass(), "sumTechLunaticHighScore", -6160346455890380386L);
        setLongField(term204604, term204604.getClass(), "sumBattleHighScore", -7918460820957685559L);
        setLongField(term204604, term204604.getClass(), "sumBattleBasicHighScore", 1094480475210733406L);
        setLongField(term204604, term204604.getClass(), "sumBattleAdvancedHighScore", -2737365214261301444L);
        setLongField(term204604, term204604.getClass(), "sumBattleExpertHighScore", -6462636018792723772L);
        setLongField(term204604, term204604.getClass(), "sumBattleMasterHighScore", -7089581545867265794L);
        setLongField(term204604, term204604.getClass(), "sumBattleLunaticHighScore", 7517392464104551153L);
        setField(term204604, term204604.getClass(), "eventWatchedDate", "MJzpIWKpnW");
        setField(term204604, term204604.getClass(), "cmEventWatchedDate", "OAVOvFzQXP");
        setField(term204604, term204604.getClass(), "firstGameId", "TJWLTODbwy");
        setField(term204604, term204604.getClass(), "firstRomVersion", "gwokBeghOs");
        setField(term204604, term204604.getClass(), "firstDataVersion", "gSfPReupKO");
        setField(term204604, term204604.getClass(), "firstPlayDate", "djavJMNWzM");
        setField(term204604, term204604.getClass(), "lastGameId", "KLhZKvcirH");
        setField(term204604, term204604.getClass(), "lastRomVersion", "ymoyLFhkiZ");
        setField(term204604, term204604.getClass(), "lastDataVersion", "TmSTKXeNPY");
        setField(term204604, term204604.getClass(), "compatibleCmVersion", "yApToAwVAg");
        setField(term204604, term204604.getClass(), "lastPlayDate", "hGgExrMnNT");
        setIntField(term204604, term204604.getClass(), "lastPlaceId", -790909825);
        setField(term204604, term204604.getClass(), "lastPlaceName", "SZnouRvcAU");
        setIntField(term204604, term204604.getClass(), "lastRegionId", -284745118);
        setField(term204604, term204604.getClass(), "lastRegionName", "lpSxrqZGOz");
        setIntField(term204604, term204604.getClass(), "lastAllNetId", 13725205);
        setField(term204604, term204604.getClass(), "lastClientId", "JBbUvxQxnk");
        setIntField(term204604, term204604.getClass(), "lastUsedDeckId", 508141534);
        setIntField(term204604, term204604.getClass(), "lastPlayMusicLevel", 1738752715);
        setIntField(term204604, term204604.getClass(), "lastEmoneyBrand", 1995942126);
        setField(term204602, term204602.getClass(), "user", term204604);
        setIntField(term204602, term204602.getClass(), "sortNumber", -1625230288);
        setIntField(term204602, term204602.getClass(), "placeId", -171798351);
        setField(term204602, term204602.getClass(), "placeName", "pwqZhDkDOg");
        setField(term204602, term204602.getClass(), "playDate", "nIusisDwZi");
        setField(term204602, term204602.getClass(), "userPlayDate", "WFndbCMNJf");
        setIntField(term204602, term204602.getClass(), "musicId", 1331490909);
        setIntField(term204602, term204602.getClass(), "level", -1361172730);
        setIntField(term204602, term204602.getClass(), "playKind", 1833435218);
        setIntField(term204602, term204602.getClass(), "eventId", -1718069812);
        setField(term204602, term204602.getClass(), "eventName", "EWuRDOuoGG");
        setIntField(term204602, term204602.getClass(), "eventPoint", 1138412605);
        setIntField(term204602, term204602.getClass(), "playedUserId1", 1718167201);
        setIntField(term204602, term204602.getClass(), "playedUserId2", 1431553192);
        setIntField(term204602, term204602.getClass(), "playedUserId3", 953855887);
        setField(term204602, term204602.getClass(), "playedUserName1", "BmwRvtFFJx");
        setField(term204602, term204602.getClass(), "playedUserName2", "cEZqVAfleB");
        setField(term204602, term204602.getClass(), "playedUserName3", "nhLTWbgTqe");
        setIntField(term204602, term204602.getClass(), "playedMusicLevel1", 631485155);
        setIntField(term204602, term204602.getClass(), "playedMusicLevel2", -1352413368);
        setIntField(term204602, term204602.getClass(), "playedMusicLevel3", 1935994916);
        setIntField(term204602, term204602.getClass(), "cardId1", 710260184);
        setIntField(term204602, term204602.getClass(), "cardId2", -1659608527);
        setIntField(term204602, term204602.getClass(), "cardId3", 1859912957);
        setIntField(term204602, term204602.getClass(), "cardLevel1", 1423682963);
        setIntField(term204602, term204602.getClass(), "cardLevel2", -672568445);
        setIntField(term204602, term204602.getClass(), "cardLevel3", 1927405731);
        setIntField(term204602, term204602.getClass(), "cardAttack1", 1901138263);
        setIntField(term204602, term204602.getClass(), "cardAttack2", -1587806226);
        setIntField(term204602, term204602.getClass(), "cardAttack3", -1782020561);
        setIntField(term204602, term204602.getClass(), "bossCharaId", -1107385404);
        setIntField(term204602, term204602.getClass(), "bossLevel", -524207375);
        setIntField(term204602, term204602.getClass(), "bossAttribute", -590671889);
        setIntField(term204602, term204602.getClass(), "clearStatus", -1418367417);
        setIntField(term204602, term204602.getClass(), "techScore", -2130236957);
        setIntField(term204602, term204602.getClass(), "techScoreRank", -1477513467);
        setIntField(term204602, term204602.getClass(), "battleScore", 1784364775);
        setIntField(term204602, term204602.getClass(), "battleScoreRank", -1405043904);
        setIntField(term204602, term204602.getClass(), "platinumScore", -2106459386);
        setIntField(term204602, term204602.getClass(), "maxCombo", 412901715);
        setIntField(term204602, term204602.getClass(), "judgeMiss", 63312590);
        setIntField(term204602, term204602.getClass(), "judgeHit", 1065136159);
        setIntField(term204602, term204602.getClass(), "judgeBreak", 235554079);
        setIntField(term204602, term204602.getClass(), "judgeCriticalBreak", -1928935865);
        setIntField(term204602, term204602.getClass(), "rateTap", 36720539);
        setIntField(term204602, term204602.getClass(), "rateHold", 1238203454);
        setIntField(term204602, term204602.getClass(), "rateFlick", 1392215933);
        setIntField(term204602, term204602.getClass(), "rateSideTap", -1780970662);
        setIntField(term204602, term204602.getClass(), "rateSideHold", 1092997590);
        setIntField(term204602, term204602.getClass(), "bellCount", -1321843634);
        setIntField(term204602, term204602.getClass(), "totalBellCount", 1529348485);
        setIntField(term204602, term204602.getClass(), "damageCount", 391918007);
        setIntField(term204602, term204602.getClass(), "overDamage", 81788522);
        setBooleanField(term204602, term204602.getClass(), "isTechNewRecord", false);
        setBooleanField(term204602, term204602.getClass(), "isBattleNewRecord", false);
        setBooleanField(term204602, term204602.getClass(), "isOverDamageNewRecord", false);
        setBooleanField(term204602, term204602.getClass(), "isFullCombo", true);
        setBooleanField(term204602, term204602.getClass(), "isFullBell", true);
        setBooleanField(term204602, term204602.getClass(), "isAllBreak", true);
        setIntField(term204602, term204602.getClass(), "playerRating", -1593886817);
        setIntField(term204602, term204602.getClass(), "battlePoint", 1038801057);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBattleScore", argTypes, term204602, args);
    }

};


