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

public class UserPlaylog_getPlayedMusicLevel1_62111526519 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term193226;

    public UserPlaylog_getPlayedMusicLevel1_62111526519() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term193232 = new Long(-5004803270846838598L);
        term193226 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog"));
        Object term193228 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term193230 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term193246 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term193247 = newInstance(Class.forName("java.time.LocalDate"));
        Object term193251 = newInstance(Class.forName("java.time.LocalTime"));
        Object term193256 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term193257 = newInstance(Class.forName("java.time.LocalDate"));
        Object term193261 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term193226, term193226.getClass(), "id", -683827499199595227L);
        setLongField(term193228, term193228.getClass(), "id", 8743516917770723308L);
        setLongField(term193230, term193230.getClass(), "id", 102207236902364060L);
        setField(term193230, term193230.getClass(), "extId", term193232);
        setField(term193230, term193230.getClass(), "luid", "yiVUZbRRMJ");
        setIntField(term193247, term193247.getClass(), "year", 2020);
        setShortField(term193247, term193247.getClass(), "month", (short) 2);
        setShortField(term193247, term193247.getClass(), "day", (short) 28);
        setField(term193246, term193246.getClass(), "date", term193247);
        setByteField(term193251, term193251.getClass(), "hour", (byte) 3);
        setByteField(term193251, term193251.getClass(), "minute", (byte) 46);
        setByteField(term193251, term193251.getClass(), "second", (byte) 58);
        setIntField(term193251, term193251.getClass(), "nano", 519279868);
        setField(term193246, term193246.getClass(), "time", term193251);
        setField(term193230, term193230.getClass(), "registerTime", term193246);
        setIntField(term193257, term193257.getClass(), "year", 2028);
        setShortField(term193257, term193257.getClass(), "month", (short) 8);
        setShortField(term193257, term193257.getClass(), "day", (short) 27);
        setField(term193256, term193256.getClass(), "date", term193257);
        setByteField(term193261, term193261.getClass(), "hour", (byte) 5);
        setByteField(term193261, term193261.getClass(), "minute", (byte) 50);
        setByteField(term193261, term193261.getClass(), "second", (byte) 39);
        setIntField(term193261, term193261.getClass(), "nano", 452455240);
        setField(term193256, term193256.getClass(), "time", term193261);
        setField(term193230, term193230.getClass(), "accessTime", term193256);
        setField(term193228, term193228.getClass(), "card", term193230);
        setField(term193228, term193228.getClass(), "userName", "fLEHiGuHVs");
        setIntField(term193228, term193228.getClass(), "level", -1649977050);
        setIntField(term193228, term193228.getClass(), "reincarnationNum", 629996726);
        setLongField(term193228, term193228.getClass(), "exp", -3247320536656625115L);
        setLongField(term193228, term193228.getClass(), "point", -7850300064339484966L);
        setLongField(term193228, term193228.getClass(), "totalPoint", -3458328871397273171L);
        setIntField(term193228, term193228.getClass(), "playCount", 43834381);
        setIntField(term193228, term193228.getClass(), "jewelCount", -344626639);
        setIntField(term193228, term193228.getClass(), "totalJewelCount", 1543187413);
        setIntField(term193228, term193228.getClass(), "medalCount", 911320014);
        setIntField(term193228, term193228.getClass(), "playerRating", -393953514);
        setIntField(term193228, term193228.getClass(), "highestRating", 109796987);
        setIntField(term193228, term193228.getClass(), "battlePoint", -2123134675);
        setIntField(term193228, term193228.getClass(), "bestBattlePoint", 1611645923);
        setIntField(term193228, term193228.getClass(), "overDamageBattlePoint", -2097613528);
        setBooleanField(term193228, term193228.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term193228, term193228.getClass(), "nameplateId", 1835910970);
        setIntField(term193228, term193228.getClass(), "trophyId", -800791185);
        setIntField(term193228, term193228.getClass(), "cardId", 1772283447);
        setIntField(term193228, term193228.getClass(), "characterId", -461557612);
        setIntField(term193228, term193228.getClass(), "characterVoiceNo", 210504323);
        setIntField(term193228, term193228.getClass(), "tabSetting", 1520176636);
        setIntField(term193228, term193228.getClass(), "tabSortSetting", 1707887906);
        setIntField(term193228, term193228.getClass(), "cardCategorySetting", 566561079);
        setIntField(term193228, term193228.getClass(), "cardSortSetting", 1136741540);
        setIntField(term193228, term193228.getClass(), "rivalScoreCategorySetting", -1462079169);
        setIntField(term193228, term193228.getClass(), "playedTutorialBit", 564422692);
        setIntField(term193228, term193228.getClass(), "firstTutorialCancelNum", -1598267137);
        setLongField(term193228, term193228.getClass(), "sumTechHighScore", -4587416835160858680L);
        setLongField(term193228, term193228.getClass(), "sumTechBasicHighScore", 4121717066786632792L);
        setLongField(term193228, term193228.getClass(), "sumTechAdvancedHighScore", -4147115952306361673L);
        setLongField(term193228, term193228.getClass(), "sumTechExpertHighScore", -6204257729362345112L);
        setLongField(term193228, term193228.getClass(), "sumTechMasterHighScore", 3794289278916493181L);
        setLongField(term193228, term193228.getClass(), "sumTechLunaticHighScore", 5313279882563398231L);
        setLongField(term193228, term193228.getClass(), "sumBattleHighScore", -36905419201306652L);
        setLongField(term193228, term193228.getClass(), "sumBattleBasicHighScore", 8225305627650584019L);
        setLongField(term193228, term193228.getClass(), "sumBattleAdvancedHighScore", 2457879867609405509L);
        setLongField(term193228, term193228.getClass(), "sumBattleExpertHighScore", 2070054875226545929L);
        setLongField(term193228, term193228.getClass(), "sumBattleMasterHighScore", -5433011372879614353L);
        setLongField(term193228, term193228.getClass(), "sumBattleLunaticHighScore", -5015259105569013979L);
        setField(term193228, term193228.getClass(), "eventWatchedDate", "aDqRYtnuEX");
        setField(term193228, term193228.getClass(), "cmEventWatchedDate", "zdxbtfvlKR");
        setField(term193228, term193228.getClass(), "firstGameId", "jjRBUiEJTO");
        setField(term193228, term193228.getClass(), "firstRomVersion", "FOKonOfMjU");
        setField(term193228, term193228.getClass(), "firstDataVersion", "lWbiRqiFLY");
        setField(term193228, term193228.getClass(), "firstPlayDate", "fZjjEMXeXg");
        setField(term193228, term193228.getClass(), "lastGameId", "HbwtoQBNKx");
        setField(term193228, term193228.getClass(), "lastRomVersion", "vAQgOxaqVS");
        setField(term193228, term193228.getClass(), "lastDataVersion", "HObMxrmeDP");
        setField(term193228, term193228.getClass(), "compatibleCmVersion", "aUlSeZzCEe");
        setField(term193228, term193228.getClass(), "lastPlayDate", "UIrGulbKPp");
        setIntField(term193228, term193228.getClass(), "lastPlaceId", 954586200);
        setField(term193228, term193228.getClass(), "lastPlaceName", "MeOYSudrpA");
        setIntField(term193228, term193228.getClass(), "lastRegionId", -109805366);
        setField(term193228, term193228.getClass(), "lastRegionName", "jRuwCuDOvG");
        setIntField(term193228, term193228.getClass(), "lastAllNetId", -744032962);
        setField(term193228, term193228.getClass(), "lastClientId", "tzynzphtSt");
        setIntField(term193228, term193228.getClass(), "lastUsedDeckId", 403901613);
        setIntField(term193228, term193228.getClass(), "lastPlayMusicLevel", -1399456203);
        setIntField(term193228, term193228.getClass(), "lastEmoneyBrand", -1622044225);
        setField(term193226, term193226.getClass(), "user", term193228);
        setIntField(term193226, term193226.getClass(), "sortNumber", 38757245);
        setIntField(term193226, term193226.getClass(), "placeId", 2027144411);
        setField(term193226, term193226.getClass(), "placeName", "JzThQHtYiI");
        setField(term193226, term193226.getClass(), "playDate", "iyvEVMiIDj");
        setField(term193226, term193226.getClass(), "userPlayDate", "wsXKrnKnnU");
        setIntField(term193226, term193226.getClass(), "musicId", -1280281752);
        setIntField(term193226, term193226.getClass(), "level", -409018511);
        setIntField(term193226, term193226.getClass(), "playKind", -1702868266);
        setIntField(term193226, term193226.getClass(), "eventId", -1114987711);
        setField(term193226, term193226.getClass(), "eventName", "HzchQiGlwd");
        setIntField(term193226, term193226.getClass(), "eventPoint", -235628635);
        setIntField(term193226, term193226.getClass(), "playedUserId1", 1526568010);
        setIntField(term193226, term193226.getClass(), "playedUserId2", -162919111);
        setIntField(term193226, term193226.getClass(), "playedUserId3", 402632755);
        setField(term193226, term193226.getClass(), "playedUserName1", "BtCILwmAJL");
        setField(term193226, term193226.getClass(), "playedUserName2", "mJzcKehaKq");
        setField(term193226, term193226.getClass(), "playedUserName3", "rafTbKaGSM");
        setIntField(term193226, term193226.getClass(), "playedMusicLevel1", -1689951656);
        setIntField(term193226, term193226.getClass(), "playedMusicLevel2", -1441923858);
        setIntField(term193226, term193226.getClass(), "playedMusicLevel3", 22148319);
        setIntField(term193226, term193226.getClass(), "cardId1", -473021331);
        setIntField(term193226, term193226.getClass(), "cardId2", -660334816);
        setIntField(term193226, term193226.getClass(), "cardId3", -1864873568);
        setIntField(term193226, term193226.getClass(), "cardLevel1", 710697959);
        setIntField(term193226, term193226.getClass(), "cardLevel2", -647347437);
        setIntField(term193226, term193226.getClass(), "cardLevel3", 658084221);
        setIntField(term193226, term193226.getClass(), "cardAttack1", -1984593436);
        setIntField(term193226, term193226.getClass(), "cardAttack2", -1366169312);
        setIntField(term193226, term193226.getClass(), "cardAttack3", 917532658);
        setIntField(term193226, term193226.getClass(), "bossCharaId", -906225721);
        setIntField(term193226, term193226.getClass(), "bossLevel", 1029803622);
        setIntField(term193226, term193226.getClass(), "bossAttribute", 1547718184);
        setIntField(term193226, term193226.getClass(), "clearStatus", 1882154507);
        setIntField(term193226, term193226.getClass(), "techScore", -1930761887);
        setIntField(term193226, term193226.getClass(), "techScoreRank", 1426685210);
        setIntField(term193226, term193226.getClass(), "battleScore", -581569867);
        setIntField(term193226, term193226.getClass(), "battleScoreRank", -987041198);
        setIntField(term193226, term193226.getClass(), "platinumScore", 1924660270);
        setIntField(term193226, term193226.getClass(), "maxCombo", 716661667);
        setIntField(term193226, term193226.getClass(), "judgeMiss", 786893106);
        setIntField(term193226, term193226.getClass(), "judgeHit", 137615027);
        setIntField(term193226, term193226.getClass(), "judgeBreak", -1236558524);
        setIntField(term193226, term193226.getClass(), "judgeCriticalBreak", -290487304);
        setIntField(term193226, term193226.getClass(), "rateTap", 938576013);
        setIntField(term193226, term193226.getClass(), "rateHold", -1555416747);
        setIntField(term193226, term193226.getClass(), "rateFlick", 135588064);
        setIntField(term193226, term193226.getClass(), "rateSideTap", 996710213);
        setIntField(term193226, term193226.getClass(), "rateSideHold", -1618090161);
        setIntField(term193226, term193226.getClass(), "bellCount", 1629570081);
        setIntField(term193226, term193226.getClass(), "totalBellCount", -2032841320);
        setIntField(term193226, term193226.getClass(), "damageCount", -402431218);
        setIntField(term193226, term193226.getClass(), "overDamage", -1895304212);
        setBooleanField(term193226, term193226.getClass(), "isTechNewRecord", true);
        setBooleanField(term193226, term193226.getClass(), "isBattleNewRecord", false);
        setBooleanField(term193226, term193226.getClass(), "isOverDamageNewRecord", true);
        setBooleanField(term193226, term193226.getClass(), "isFullCombo", false);
        setBooleanField(term193226, term193226.getClass(), "isFullBell", false);
        setBooleanField(term193226, term193226.getClass(), "isAllBreak", false);
        setIntField(term193226, term193226.getClass(), "playerRating", -1451313019);
        setIntField(term193226, term193226.getClass(), "battlePoint", -2084270378);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayedMusicLevel1", argTypes, term193226, args);
    }

};


