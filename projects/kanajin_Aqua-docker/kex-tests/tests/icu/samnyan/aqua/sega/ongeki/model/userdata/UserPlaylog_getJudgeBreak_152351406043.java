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

public class UserPlaylog_getJudgeBreak_152351406043 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term208394;

    public UserPlaylog_getJudgeBreak_152351406043() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term208400 = new Long(661905373566913125L);
        term208394 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog"));
        Object term208396 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term208398 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term208414 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term208415 = newInstance(Class.forName("java.time.LocalDate"));
        Object term208419 = newInstance(Class.forName("java.time.LocalTime"));
        Object term208424 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term208425 = newInstance(Class.forName("java.time.LocalDate"));
        Object term208429 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term208394, term208394.getClass(), "id", -6752202374526248146L);
        setLongField(term208396, term208396.getClass(), "id", -6497077470652020501L);
        setLongField(term208398, term208398.getClass(), "id", 7303414244814770322L);
        setField(term208398, term208398.getClass(), "extId", term208400);
        setField(term208398, term208398.getClass(), "luid", "RwbNOPHwhW");
        setIntField(term208415, term208415.getClass(), "year", 2021);
        setShortField(term208415, term208415.getClass(), "month", (short) 4);
        setShortField(term208415, term208415.getClass(), "day", (short) 25);
        setField(term208414, term208414.getClass(), "date", term208415);
        setByteField(term208419, term208419.getClass(), "hour", (byte) 8);
        setByteField(term208419, term208419.getClass(), "minute", (byte) 14);
        setByteField(term208419, term208419.getClass(), "second", (byte) 18);
        setIntField(term208419, term208419.getClass(), "nano", 906796683);
        setField(term208414, term208414.getClass(), "time", term208419);
        setField(term208398, term208398.getClass(), "registerTime", term208414);
        setIntField(term208425, term208425.getClass(), "year", 2012);
        setShortField(term208425, term208425.getClass(), "month", (short) 7);
        setShortField(term208425, term208425.getClass(), "day", (short) 16);
        setField(term208424, term208424.getClass(), "date", term208425);
        setByteField(term208429, term208429.getClass(), "hour", (byte) 8);
        setByteField(term208429, term208429.getClass(), "minute", (byte) 3);
        setByteField(term208429, term208429.getClass(), "second", (byte) 1);
        setIntField(term208429, term208429.getClass(), "nano", 861288078);
        setField(term208424, term208424.getClass(), "time", term208429);
        setField(term208398, term208398.getClass(), "accessTime", term208424);
        setField(term208396, term208396.getClass(), "card", term208398);
        setField(term208396, term208396.getClass(), "userName", "FSKhxZvpnl");
        setIntField(term208396, term208396.getClass(), "level", 1346767326);
        setIntField(term208396, term208396.getClass(), "reincarnationNum", -2092002829);
        setLongField(term208396, term208396.getClass(), "exp", -5710353143857259966L);
        setLongField(term208396, term208396.getClass(), "point", 9137128163873801102L);
        setLongField(term208396, term208396.getClass(), "totalPoint", -5094047922496720971L);
        setIntField(term208396, term208396.getClass(), "playCount", -1361580827);
        setIntField(term208396, term208396.getClass(), "jewelCount", -958463390);
        setIntField(term208396, term208396.getClass(), "totalJewelCount", 1950799121);
        setIntField(term208396, term208396.getClass(), "medalCount", -323987081);
        setIntField(term208396, term208396.getClass(), "playerRating", -917394097);
        setIntField(term208396, term208396.getClass(), "highestRating", -1877002042);
        setIntField(term208396, term208396.getClass(), "battlePoint", 1442941255);
        setIntField(term208396, term208396.getClass(), "bestBattlePoint", 1666341034);
        setIntField(term208396, term208396.getClass(), "overDamageBattlePoint", -46731631);
        setBooleanField(term208396, term208396.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term208396, term208396.getClass(), "nameplateId", -1256254174);
        setIntField(term208396, term208396.getClass(), "trophyId", -1808461007);
        setIntField(term208396, term208396.getClass(), "cardId", -497824423);
        setIntField(term208396, term208396.getClass(), "characterId", -1924448836);
        setIntField(term208396, term208396.getClass(), "characterVoiceNo", -220172762);
        setIntField(term208396, term208396.getClass(), "tabSetting", -91583035);
        setIntField(term208396, term208396.getClass(), "tabSortSetting", 1118579974);
        setIntField(term208396, term208396.getClass(), "cardCategorySetting", 1007007632);
        setIntField(term208396, term208396.getClass(), "cardSortSetting", -885454757);
        setIntField(term208396, term208396.getClass(), "rivalScoreCategorySetting", -1232749539);
        setIntField(term208396, term208396.getClass(), "playedTutorialBit", -381558021);
        setIntField(term208396, term208396.getClass(), "firstTutorialCancelNum", 1819668222);
        setLongField(term208396, term208396.getClass(), "sumTechHighScore", 5637017051115054752L);
        setLongField(term208396, term208396.getClass(), "sumTechBasicHighScore", 1284898884974047648L);
        setLongField(term208396, term208396.getClass(), "sumTechAdvancedHighScore", -1999224272669818099L);
        setLongField(term208396, term208396.getClass(), "sumTechExpertHighScore", -1474649360128434645L);
        setLongField(term208396, term208396.getClass(), "sumTechMasterHighScore", 6893932243006371587L);
        setLongField(term208396, term208396.getClass(), "sumTechLunaticHighScore", -7702057743711326700L);
        setLongField(term208396, term208396.getClass(), "sumBattleHighScore", -1736190174758030847L);
        setLongField(term208396, term208396.getClass(), "sumBattleBasicHighScore", 3403199788023038385L);
        setLongField(term208396, term208396.getClass(), "sumBattleAdvancedHighScore", 313282191329776502L);
        setLongField(term208396, term208396.getClass(), "sumBattleExpertHighScore", 8142865199942375989L);
        setLongField(term208396, term208396.getClass(), "sumBattleMasterHighScore", -8158315682107732056L);
        setLongField(term208396, term208396.getClass(), "sumBattleLunaticHighScore", -7943631067445632207L);
        setField(term208396, term208396.getClass(), "eventWatchedDate", "dKmYpbxoRS");
        setField(term208396, term208396.getClass(), "cmEventWatchedDate", "azUzzteCGy");
        setField(term208396, term208396.getClass(), "firstGameId", "BLBvGRqyYM");
        setField(term208396, term208396.getClass(), "firstRomVersion", "oKQiVhGGYR");
        setField(term208396, term208396.getClass(), "firstDataVersion", "TzLaUPSnqj");
        setField(term208396, term208396.getClass(), "firstPlayDate", "aBNUlBwETR");
        setField(term208396, term208396.getClass(), "lastGameId", "qjmxrabYcx");
        setField(term208396, term208396.getClass(), "lastRomVersion", "myWRMyEhIt");
        setField(term208396, term208396.getClass(), "lastDataVersion", "EmDmkDpxon");
        setField(term208396, term208396.getClass(), "compatibleCmVersion", "VvItpTBxIr");
        setField(term208396, term208396.getClass(), "lastPlayDate", "lRNmJJNKCh");
        setIntField(term208396, term208396.getClass(), "lastPlaceId", 655578194);
        setField(term208396, term208396.getClass(), "lastPlaceName", "wQjEhEbcxP");
        setIntField(term208396, term208396.getClass(), "lastRegionId", 132693406);
        setField(term208396, term208396.getClass(), "lastRegionName", "WQWajfRESR");
        setIntField(term208396, term208396.getClass(), "lastAllNetId", -1100588127);
        setField(term208396, term208396.getClass(), "lastClientId", "FpLNKrgBfH");
        setIntField(term208396, term208396.getClass(), "lastUsedDeckId", 1035089895);
        setIntField(term208396, term208396.getClass(), "lastPlayMusicLevel", 4217888);
        setIntField(term208396, term208396.getClass(), "lastEmoneyBrand", -1453563811);
        setField(term208394, term208394.getClass(), "user", term208396);
        setIntField(term208394, term208394.getClass(), "sortNumber", -1548291822);
        setIntField(term208394, term208394.getClass(), "placeId", 1083791914);
        setField(term208394, term208394.getClass(), "placeName", "eOMULntXto");
        setField(term208394, term208394.getClass(), "playDate", "wGroGsyEBE");
        setField(term208394, term208394.getClass(), "userPlayDate", "ytRmDKVnzC");
        setIntField(term208394, term208394.getClass(), "musicId", 1266062345);
        setIntField(term208394, term208394.getClass(), "level", -547310147);
        setIntField(term208394, term208394.getClass(), "playKind", 893881579);
        setIntField(term208394, term208394.getClass(), "eventId", 198045917);
        setField(term208394, term208394.getClass(), "eventName", "xIlQLEFozf");
        setIntField(term208394, term208394.getClass(), "eventPoint", -1667202438);
        setIntField(term208394, term208394.getClass(), "playedUserId1", -2053124772);
        setIntField(term208394, term208394.getClass(), "playedUserId2", -873131161);
        setIntField(term208394, term208394.getClass(), "playedUserId3", 1399978457);
        setField(term208394, term208394.getClass(), "playedUserName1", "vjkUeksZSx");
        setField(term208394, term208394.getClass(), "playedUserName2", "jOmdJDMEKW");
        setField(term208394, term208394.getClass(), "playedUserName3", "yVUBrwMSLo");
        setIntField(term208394, term208394.getClass(), "playedMusicLevel1", -1973849284);
        setIntField(term208394, term208394.getClass(), "playedMusicLevel2", -1074349521);
        setIntField(term208394, term208394.getClass(), "playedMusicLevel3", -301274199);
        setIntField(term208394, term208394.getClass(), "cardId1", 495802747);
        setIntField(term208394, term208394.getClass(), "cardId2", -2002408985);
        setIntField(term208394, term208394.getClass(), "cardId3", -1289271829);
        setIntField(term208394, term208394.getClass(), "cardLevel1", -1303889576);
        setIntField(term208394, term208394.getClass(), "cardLevel2", 158488233);
        setIntField(term208394, term208394.getClass(), "cardLevel3", 1641465748);
        setIntField(term208394, term208394.getClass(), "cardAttack1", 191297190);
        setIntField(term208394, term208394.getClass(), "cardAttack2", -184116368);
        setIntField(term208394, term208394.getClass(), "cardAttack3", -2078321901);
        setIntField(term208394, term208394.getClass(), "bossCharaId", 644110294);
        setIntField(term208394, term208394.getClass(), "bossLevel", 858147518);
        setIntField(term208394, term208394.getClass(), "bossAttribute", -1727167401);
        setIntField(term208394, term208394.getClass(), "clearStatus", -842185797);
        setIntField(term208394, term208394.getClass(), "techScore", 478918889);
        setIntField(term208394, term208394.getClass(), "techScoreRank", 750079737);
        setIntField(term208394, term208394.getClass(), "battleScore", -1296400594);
        setIntField(term208394, term208394.getClass(), "battleScoreRank", 1238281654);
        setIntField(term208394, term208394.getClass(), "platinumScore", 369742636);
        setIntField(term208394, term208394.getClass(), "maxCombo", -1541868819);
        setIntField(term208394, term208394.getClass(), "judgeMiss", 1305998954);
        setIntField(term208394, term208394.getClass(), "judgeHit", 433793843);
        setIntField(term208394, term208394.getClass(), "judgeBreak", -2139860020);
        setIntField(term208394, term208394.getClass(), "judgeCriticalBreak", 1169604514);
        setIntField(term208394, term208394.getClass(), "rateTap", 838946722);
        setIntField(term208394, term208394.getClass(), "rateHold", 757054652);
        setIntField(term208394, term208394.getClass(), "rateFlick", 1524588225);
        setIntField(term208394, term208394.getClass(), "rateSideTap", -659368843);
        setIntField(term208394, term208394.getClass(), "rateSideHold", 1745645738);
        setIntField(term208394, term208394.getClass(), "bellCount", -500405572);
        setIntField(term208394, term208394.getClass(), "totalBellCount", 81259518);
        setIntField(term208394, term208394.getClass(), "damageCount", 1396067902);
        setIntField(term208394, term208394.getClass(), "overDamage", 1776157151);
        setBooleanField(term208394, term208394.getClass(), "isTechNewRecord", true);
        setBooleanField(term208394, term208394.getClass(), "isBattleNewRecord", true);
        setBooleanField(term208394, term208394.getClass(), "isOverDamageNewRecord", false);
        setBooleanField(term208394, term208394.getClass(), "isFullCombo", true);
        setBooleanField(term208394, term208394.getClass(), "isFullBell", true);
        setBooleanField(term208394, term208394.getClass(), "isAllBreak", false);
        setIntField(term208394, term208394.getClass(), "playerRating", 358349632);
        setIntField(term208394, term208394.getClass(), "battlePoint", 378160100);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getJudgeBreak", argTypes, term208394, args);
    }

};


