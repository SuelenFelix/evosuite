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

public class UserPlaylog_getBattlePoint_213539292061 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term219770;

    public UserPlaylog_getBattlePoint_213539292061() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term219776 = new Long(1133267598258375793L);
        term219770 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog"));
        Object term219772 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term219774 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term219790 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term219791 = newInstance(Class.forName("java.time.LocalDate"));
        Object term219795 = newInstance(Class.forName("java.time.LocalTime"));
        Object term219800 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term219801 = newInstance(Class.forName("java.time.LocalDate"));
        Object term219805 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term219770, term219770.getClass(), "id", -6646878577302155605L);
        setLongField(term219772, term219772.getClass(), "id", 218984008209321665L);
        setLongField(term219774, term219774.getClass(), "id", -7522319046970408025L);
        setField(term219774, term219774.getClass(), "extId", term219776);
        setField(term219774, term219774.getClass(), "luid", "yTZpTnBddt");
        setIntField(term219791, term219791.getClass(), "year", 2014);
        setShortField(term219791, term219791.getClass(), "month", (short) 8);
        setShortField(term219791, term219791.getClass(), "day", (short) 10);
        setField(term219790, term219790.getClass(), "date", term219791);
        setByteField(term219795, term219795.getClass(), "hour", (byte) 17);
        setByteField(term219795, term219795.getClass(), "minute", (byte) 8);
        setByteField(term219795, term219795.getClass(), "second", (byte) 32);
        setIntField(term219795, term219795.getClass(), "nano", 120357006);
        setField(term219790, term219790.getClass(), "time", term219795);
        setField(term219774, term219774.getClass(), "registerTime", term219790);
        setIntField(term219801, term219801.getClass(), "year", 2029);
        setShortField(term219801, term219801.getClass(), "month", (short) 5);
        setShortField(term219801, term219801.getClass(), "day", (short) 3);
        setField(term219800, term219800.getClass(), "date", term219801);
        setByteField(term219805, term219805.getClass(), "hour", (byte) 21);
        setByteField(term219805, term219805.getClass(), "minute", (byte) 41);
        setByteField(term219805, term219805.getClass(), "second", (byte) 9);
        setIntField(term219805, term219805.getClass(), "nano", 699417700);
        setField(term219800, term219800.getClass(), "time", term219805);
        setField(term219774, term219774.getClass(), "accessTime", term219800);
        setField(term219772, term219772.getClass(), "card", term219774);
        setField(term219772, term219772.getClass(), "userName", "MZpJiKRbDf");
        setIntField(term219772, term219772.getClass(), "level", -1573651514);
        setIntField(term219772, term219772.getClass(), "reincarnationNum", 442927197);
        setLongField(term219772, term219772.getClass(), "exp", -5590687905785932678L);
        setLongField(term219772, term219772.getClass(), "point", -5818970464137804543L);
        setLongField(term219772, term219772.getClass(), "totalPoint", 6216563288198425050L);
        setIntField(term219772, term219772.getClass(), "playCount", 917288340);
        setIntField(term219772, term219772.getClass(), "jewelCount", -2012928539);
        setIntField(term219772, term219772.getClass(), "totalJewelCount", 353624133);
        setIntField(term219772, term219772.getClass(), "medalCount", 1458847382);
        setIntField(term219772, term219772.getClass(), "playerRating", 1897651561);
        setIntField(term219772, term219772.getClass(), "highestRating", -206624818);
        setIntField(term219772, term219772.getClass(), "battlePoint", -1493843544);
        setIntField(term219772, term219772.getClass(), "bestBattlePoint", 1146894465);
        setIntField(term219772, term219772.getClass(), "overDamageBattlePoint", 1655601907);
        setBooleanField(term219772, term219772.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term219772, term219772.getClass(), "nameplateId", 386717026);
        setIntField(term219772, term219772.getClass(), "trophyId", -1122137505);
        setIntField(term219772, term219772.getClass(), "cardId", -1610088806);
        setIntField(term219772, term219772.getClass(), "characterId", 1370330366);
        setIntField(term219772, term219772.getClass(), "characterVoiceNo", -1370258867);
        setIntField(term219772, term219772.getClass(), "tabSetting", -549158541);
        setIntField(term219772, term219772.getClass(), "tabSortSetting", -1505813367);
        setIntField(term219772, term219772.getClass(), "cardCategorySetting", 1794847769);
        setIntField(term219772, term219772.getClass(), "cardSortSetting", 752849995);
        setIntField(term219772, term219772.getClass(), "rivalScoreCategorySetting", -896577043);
        setIntField(term219772, term219772.getClass(), "playedTutorialBit", -1212408134);
        setIntField(term219772, term219772.getClass(), "firstTutorialCancelNum", 986010271);
        setLongField(term219772, term219772.getClass(), "sumTechHighScore", 5115792555939417744L);
        setLongField(term219772, term219772.getClass(), "sumTechBasicHighScore", -6423809871120776825L);
        setLongField(term219772, term219772.getClass(), "sumTechAdvancedHighScore", 919517685710364664L);
        setLongField(term219772, term219772.getClass(), "sumTechExpertHighScore", 4757880362679397439L);
        setLongField(term219772, term219772.getClass(), "sumTechMasterHighScore", 199962027033346897L);
        setLongField(term219772, term219772.getClass(), "sumTechLunaticHighScore", -1930446810556827108L);
        setLongField(term219772, term219772.getClass(), "sumBattleHighScore", -6571677302957237750L);
        setLongField(term219772, term219772.getClass(), "sumBattleBasicHighScore", -1266972511083779048L);
        setLongField(term219772, term219772.getClass(), "sumBattleAdvancedHighScore", -5684915513934212085L);
        setLongField(term219772, term219772.getClass(), "sumBattleExpertHighScore", 2578504569388169682L);
        setLongField(term219772, term219772.getClass(), "sumBattleMasterHighScore", -2925538166644968167L);
        setLongField(term219772, term219772.getClass(), "sumBattleLunaticHighScore", -1285327709543010415L);
        setField(term219772, term219772.getClass(), "eventWatchedDate", "pzowNkfzax");
        setField(term219772, term219772.getClass(), "cmEventWatchedDate", "pHIiFQwtzh");
        setField(term219772, term219772.getClass(), "firstGameId", "IpeAMdfzEl");
        setField(term219772, term219772.getClass(), "firstRomVersion", "czwByajnQU");
        setField(term219772, term219772.getClass(), "firstDataVersion", "dktEAADiuk");
        setField(term219772, term219772.getClass(), "firstPlayDate", "KzSkjXMULH");
        setField(term219772, term219772.getClass(), "lastGameId", "zAtXWhPRak");
        setField(term219772, term219772.getClass(), "lastRomVersion", "KioasZeahx");
        setField(term219772, term219772.getClass(), "lastDataVersion", "dVNgjQwxWt");
        setField(term219772, term219772.getClass(), "compatibleCmVersion", "EfWpPcTmvF");
        setField(term219772, term219772.getClass(), "lastPlayDate", "yASxuiMlXa");
        setIntField(term219772, term219772.getClass(), "lastPlaceId", -1598534439);
        setField(term219772, term219772.getClass(), "lastPlaceName", "gHZbqXXAsK");
        setIntField(term219772, term219772.getClass(), "lastRegionId", -1043159944);
        setField(term219772, term219772.getClass(), "lastRegionName", "yVPTdGtpeE");
        setIntField(term219772, term219772.getClass(), "lastAllNetId", 68900141);
        setField(term219772, term219772.getClass(), "lastClientId", "lGAVkJkYju");
        setIntField(term219772, term219772.getClass(), "lastUsedDeckId", 875120885);
        setIntField(term219772, term219772.getClass(), "lastPlayMusicLevel", 219806255);
        setIntField(term219772, term219772.getClass(), "lastEmoneyBrand", -78303419);
        setField(term219770, term219770.getClass(), "user", term219772);
        setIntField(term219770, term219770.getClass(), "sortNumber", -34443382);
        setIntField(term219770, term219770.getClass(), "placeId", -1880409584);
        setField(term219770, term219770.getClass(), "placeName", "ySKgFEQiSA");
        setField(term219770, term219770.getClass(), "playDate", "wTErQjQBYm");
        setField(term219770, term219770.getClass(), "userPlayDate", "AdTPmAbneR");
        setIntField(term219770, term219770.getClass(), "musicId", -1950497940);
        setIntField(term219770, term219770.getClass(), "level", -1513594834);
        setIntField(term219770, term219770.getClass(), "playKind", -222476680);
        setIntField(term219770, term219770.getClass(), "eventId", 714687545);
        setField(term219770, term219770.getClass(), "eventName", "bxakWPukmz");
        setIntField(term219770, term219770.getClass(), "eventPoint", 1817543699);
        setIntField(term219770, term219770.getClass(), "playedUserId1", 2115962141);
        setIntField(term219770, term219770.getClass(), "playedUserId2", -1497536978);
        setIntField(term219770, term219770.getClass(), "playedUserId3", -777356780);
        setField(term219770, term219770.getClass(), "playedUserName1", "RzPPntXKjQ");
        setField(term219770, term219770.getClass(), "playedUserName2", "DvgaTRaCbe");
        setField(term219770, term219770.getClass(), "playedUserName3", "UJWyNyJzPg");
        setIntField(term219770, term219770.getClass(), "playedMusicLevel1", -433755466);
        setIntField(term219770, term219770.getClass(), "playedMusicLevel2", -662989137);
        setIntField(term219770, term219770.getClass(), "playedMusicLevel3", 1085222473);
        setIntField(term219770, term219770.getClass(), "cardId1", -1985615907);
        setIntField(term219770, term219770.getClass(), "cardId2", -670282000);
        setIntField(term219770, term219770.getClass(), "cardId3", -1243215597);
        setIntField(term219770, term219770.getClass(), "cardLevel1", 739285728);
        setIntField(term219770, term219770.getClass(), "cardLevel2", 895363317);
        setIntField(term219770, term219770.getClass(), "cardLevel3", -756616553);
        setIntField(term219770, term219770.getClass(), "cardAttack1", -1861007560);
        setIntField(term219770, term219770.getClass(), "cardAttack2", 1071844053);
        setIntField(term219770, term219770.getClass(), "cardAttack3", -602779235);
        setIntField(term219770, term219770.getClass(), "bossCharaId", 4825650);
        setIntField(term219770, term219770.getClass(), "bossLevel", -460932057);
        setIntField(term219770, term219770.getClass(), "bossAttribute", 1553110893);
        setIntField(term219770, term219770.getClass(), "clearStatus", -770887424);
        setIntField(term219770, term219770.getClass(), "techScore", -682694487);
        setIntField(term219770, term219770.getClass(), "techScoreRank", -1644654932);
        setIntField(term219770, term219770.getClass(), "battleScore", -1690119901);
        setIntField(term219770, term219770.getClass(), "battleScoreRank", -1184354442);
        setIntField(term219770, term219770.getClass(), "platinumScore", 1643203131);
        setIntField(term219770, term219770.getClass(), "maxCombo", 879850300);
        setIntField(term219770, term219770.getClass(), "judgeMiss", -328600136);
        setIntField(term219770, term219770.getClass(), "judgeHit", -1356378874);
        setIntField(term219770, term219770.getClass(), "judgeBreak", -1303299405);
        setIntField(term219770, term219770.getClass(), "judgeCriticalBreak", -2110310382);
        setIntField(term219770, term219770.getClass(), "rateTap", -794758258);
        setIntField(term219770, term219770.getClass(), "rateHold", -935853011);
        setIntField(term219770, term219770.getClass(), "rateFlick", 531088094);
        setIntField(term219770, term219770.getClass(), "rateSideTap", -676106342);
        setIntField(term219770, term219770.getClass(), "rateSideHold", 1847578166);
        setIntField(term219770, term219770.getClass(), "bellCount", 171250909);
        setIntField(term219770, term219770.getClass(), "totalBellCount", -1179023049);
        setIntField(term219770, term219770.getClass(), "damageCount", -1691362029);
        setIntField(term219770, term219770.getClass(), "overDamage", 1019426887);
        setBooleanField(term219770, term219770.getClass(), "isTechNewRecord", true);
        setBooleanField(term219770, term219770.getClass(), "isBattleNewRecord", true);
        setBooleanField(term219770, term219770.getClass(), "isOverDamageNewRecord", true);
        setBooleanField(term219770, term219770.getClass(), "isFullCombo", true);
        setBooleanField(term219770, term219770.getClass(), "isFullBell", true);
        setBooleanField(term219770, term219770.getClass(), "isAllBreak", true);
        setIntField(term219770, term219770.getClass(), "playerRating", 1500347336);
        setIntField(term219770, term219770.getClass(), "battlePoint", -828034588);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBattlePoint", argTypes, term219770, args);
    }

};


