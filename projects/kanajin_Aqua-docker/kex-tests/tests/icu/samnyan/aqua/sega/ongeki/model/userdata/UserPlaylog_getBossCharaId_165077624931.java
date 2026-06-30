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

public class UserPlaylog_getBossCharaId_165077624931 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term200810;

    public UserPlaylog_getBossCharaId_165077624931() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term200816 = new Long(-1750555031444556464L);
        term200810 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog"));
        Object term200812 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term200814 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term200830 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term200831 = newInstance(Class.forName("java.time.LocalDate"));
        Object term200835 = newInstance(Class.forName("java.time.LocalTime"));
        Object term200840 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term200841 = newInstance(Class.forName("java.time.LocalDate"));
        Object term200845 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term200810, term200810.getClass(), "id", -3729917382497386096L);
        setLongField(term200812, term200812.getClass(), "id", -648918313748693919L);
        setLongField(term200814, term200814.getClass(), "id", 4588689385775306407L);
        setField(term200814, term200814.getClass(), "extId", term200816);
        setField(term200814, term200814.getClass(), "luid", "iOqolNKBBZ");
        setIntField(term200831, term200831.getClass(), "year", 2024);
        setShortField(term200831, term200831.getClass(), "month", (short) 9);
        setShortField(term200831, term200831.getClass(), "day", (short) 8);
        setField(term200830, term200830.getClass(), "date", term200831);
        setByteField(term200835, term200835.getClass(), "hour", (byte) 6);
        setByteField(term200835, term200835.getClass(), "minute", (byte) 3);
        setByteField(term200835, term200835.getClass(), "second", (byte) 52);
        setIntField(term200835, term200835.getClass(), "nano", 511733450);
        setField(term200830, term200830.getClass(), "time", term200835);
        setField(term200814, term200814.getClass(), "registerTime", term200830);
        setIntField(term200841, term200841.getClass(), "year", 2015);
        setShortField(term200841, term200841.getClass(), "month", (short) 1);
        setShortField(term200841, term200841.getClass(), "day", (short) 25);
        setField(term200840, term200840.getClass(), "date", term200841);
        setByteField(term200845, term200845.getClass(), "hour", (byte) 16);
        setByteField(term200845, term200845.getClass(), "minute", (byte) 22);
        setByteField(term200845, term200845.getClass(), "second", (byte) 44);
        setIntField(term200845, term200845.getClass(), "nano", 980528775);
        setField(term200840, term200840.getClass(), "time", term200845);
        setField(term200814, term200814.getClass(), "accessTime", term200840);
        setField(term200812, term200812.getClass(), "card", term200814);
        setField(term200812, term200812.getClass(), "userName", "qHaXwWoRPp");
        setIntField(term200812, term200812.getClass(), "level", -472753268);
        setIntField(term200812, term200812.getClass(), "reincarnationNum", -71568231);
        setLongField(term200812, term200812.getClass(), "exp", -3273202638826133226L);
        setLongField(term200812, term200812.getClass(), "point", -6686996941069004372L);
        setLongField(term200812, term200812.getClass(), "totalPoint", -7105219826727107473L);
        setIntField(term200812, term200812.getClass(), "playCount", -323433716);
        setIntField(term200812, term200812.getClass(), "jewelCount", 642234337);
        setIntField(term200812, term200812.getClass(), "totalJewelCount", 868094454);
        setIntField(term200812, term200812.getClass(), "medalCount", -372419681);
        setIntField(term200812, term200812.getClass(), "playerRating", -1558460902);
        setIntField(term200812, term200812.getClass(), "highestRating", 1921138991);
        setIntField(term200812, term200812.getClass(), "battlePoint", -528755484);
        setIntField(term200812, term200812.getClass(), "bestBattlePoint", 2092929808);
        setIntField(term200812, term200812.getClass(), "overDamageBattlePoint", -125968267);
        setBooleanField(term200812, term200812.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term200812, term200812.getClass(), "nameplateId", -2072312648);
        setIntField(term200812, term200812.getClass(), "trophyId", -2067197521);
        setIntField(term200812, term200812.getClass(), "cardId", 244892117);
        setIntField(term200812, term200812.getClass(), "characterId", 648802737);
        setIntField(term200812, term200812.getClass(), "characterVoiceNo", 1881844545);
        setIntField(term200812, term200812.getClass(), "tabSetting", -676894877);
        setIntField(term200812, term200812.getClass(), "tabSortSetting", -354337478);
        setIntField(term200812, term200812.getClass(), "cardCategorySetting", -1590416902);
        setIntField(term200812, term200812.getClass(), "cardSortSetting", 100923797);
        setIntField(term200812, term200812.getClass(), "rivalScoreCategorySetting", -445388895);
        setIntField(term200812, term200812.getClass(), "playedTutorialBit", 201796101);
        setIntField(term200812, term200812.getClass(), "firstTutorialCancelNum", 234395553);
        setLongField(term200812, term200812.getClass(), "sumTechHighScore", -6366920650507521486L);
        setLongField(term200812, term200812.getClass(), "sumTechBasicHighScore", 66583604441572962L);
        setLongField(term200812, term200812.getClass(), "sumTechAdvancedHighScore", -2760323169777751324L);
        setLongField(term200812, term200812.getClass(), "sumTechExpertHighScore", -4877120891991443065L);
        setLongField(term200812, term200812.getClass(), "sumTechMasterHighScore", 317697620496323748L);
        setLongField(term200812, term200812.getClass(), "sumTechLunaticHighScore", 7113434039163821271L);
        setLongField(term200812, term200812.getClass(), "sumBattleHighScore", -4716800369751248906L);
        setLongField(term200812, term200812.getClass(), "sumBattleBasicHighScore", 6190867656233459127L);
        setLongField(term200812, term200812.getClass(), "sumBattleAdvancedHighScore", -7620000718026172257L);
        setLongField(term200812, term200812.getClass(), "sumBattleExpertHighScore", -3951747327991411147L);
        setLongField(term200812, term200812.getClass(), "sumBattleMasterHighScore", 7278749259716792201L);
        setLongField(term200812, term200812.getClass(), "sumBattleLunaticHighScore", -2508804438678717552L);
        setField(term200812, term200812.getClass(), "eventWatchedDate", "rQwzadXXMc");
        setField(term200812, term200812.getClass(), "cmEventWatchedDate", "gZzjwImIrc");
        setField(term200812, term200812.getClass(), "firstGameId", "iQJtugmGBh");
        setField(term200812, term200812.getClass(), "firstRomVersion", "fcqYTYiluc");
        setField(term200812, term200812.getClass(), "firstDataVersion", "whRzmsbgft");
        setField(term200812, term200812.getClass(), "firstPlayDate", "RDrlijEuJf");
        setField(term200812, term200812.getClass(), "lastGameId", "iMzCqvAffI");
        setField(term200812, term200812.getClass(), "lastRomVersion", "qJHeGEeBIn");
        setField(term200812, term200812.getClass(), "lastDataVersion", "tyzvCLuaer");
        setField(term200812, term200812.getClass(), "compatibleCmVersion", "lCThPYNAQY");
        setField(term200812, term200812.getClass(), "lastPlayDate", "NmDLyTLdov");
        setIntField(term200812, term200812.getClass(), "lastPlaceId", -621067847);
        setField(term200812, term200812.getClass(), "lastPlaceName", "smqFlnzjoa");
        setIntField(term200812, term200812.getClass(), "lastRegionId", -1632173626);
        setField(term200812, term200812.getClass(), "lastRegionName", "lFrVzxKduB");
        setIntField(term200812, term200812.getClass(), "lastAllNetId", -1269306678);
        setField(term200812, term200812.getClass(), "lastClientId", "igjtFtTsrI");
        setIntField(term200812, term200812.getClass(), "lastUsedDeckId", 1965424854);
        setIntField(term200812, term200812.getClass(), "lastPlayMusicLevel", 888615778);
        setIntField(term200812, term200812.getClass(), "lastEmoneyBrand", -1570407348);
        setField(term200810, term200810.getClass(), "user", term200812);
        setIntField(term200810, term200810.getClass(), "sortNumber", -1947588739);
        setIntField(term200810, term200810.getClass(), "placeId", -1793583689);
        setField(term200810, term200810.getClass(), "placeName", "EKttUdwvzA");
        setField(term200810, term200810.getClass(), "playDate", "eyieSuzrqP");
        setField(term200810, term200810.getClass(), "userPlayDate", "lZSGWSjmgy");
        setIntField(term200810, term200810.getClass(), "musicId", 1536802731);
        setIntField(term200810, term200810.getClass(), "level", 569188464);
        setIntField(term200810, term200810.getClass(), "playKind", -1888994743);
        setIntField(term200810, term200810.getClass(), "eventId", -1749008759);
        setField(term200810, term200810.getClass(), "eventName", "yPdZsUxCbI");
        setIntField(term200810, term200810.getClass(), "eventPoint", 1359414274);
        setIntField(term200810, term200810.getClass(), "playedUserId1", 1978530837);
        setIntField(term200810, term200810.getClass(), "playedUserId2", 1247024543);
        setIntField(term200810, term200810.getClass(), "playedUserId3", 1421118020);
        setField(term200810, term200810.getClass(), "playedUserName1", "SLfoYQqUXQ");
        setField(term200810, term200810.getClass(), "playedUserName2", "WAaABaGbvV");
        setField(term200810, term200810.getClass(), "playedUserName3", "UbtugtxjDH");
        setIntField(term200810, term200810.getClass(), "playedMusicLevel1", -1237618589);
        setIntField(term200810, term200810.getClass(), "playedMusicLevel2", 220945896);
        setIntField(term200810, term200810.getClass(), "playedMusicLevel3", -1084557423);
        setIntField(term200810, term200810.getClass(), "cardId1", -1721728684);
        setIntField(term200810, term200810.getClass(), "cardId2", -1444832055);
        setIntField(term200810, term200810.getClass(), "cardId3", -900862013);
        setIntField(term200810, term200810.getClass(), "cardLevel1", -1008697761);
        setIntField(term200810, term200810.getClass(), "cardLevel2", 1747574942);
        setIntField(term200810, term200810.getClass(), "cardLevel3", -1968471584);
        setIntField(term200810, term200810.getClass(), "cardAttack1", 1254265686);
        setIntField(term200810, term200810.getClass(), "cardAttack2", 105771602);
        setIntField(term200810, term200810.getClass(), "cardAttack3", -872972096);
        setIntField(term200810, term200810.getClass(), "bossCharaId", 1715079422);
        setIntField(term200810, term200810.getClass(), "bossLevel", 2006443268);
        setIntField(term200810, term200810.getClass(), "bossAttribute", 573298888);
        setIntField(term200810, term200810.getClass(), "clearStatus", 1336470941);
        setIntField(term200810, term200810.getClass(), "techScore", 1859725140);
        setIntField(term200810, term200810.getClass(), "techScoreRank", -755594998);
        setIntField(term200810, term200810.getClass(), "battleScore", 114893968);
        setIntField(term200810, term200810.getClass(), "battleScoreRank", -1259245032);
        setIntField(term200810, term200810.getClass(), "platinumScore", 1946548320);
        setIntField(term200810, term200810.getClass(), "maxCombo", 1072604902);
        setIntField(term200810, term200810.getClass(), "judgeMiss", 521443191);
        setIntField(term200810, term200810.getClass(), "judgeHit", -2081317858);
        setIntField(term200810, term200810.getClass(), "judgeBreak", 521636774);
        setIntField(term200810, term200810.getClass(), "judgeCriticalBreak", 957822710);
        setIntField(term200810, term200810.getClass(), "rateTap", 2109876514);
        setIntField(term200810, term200810.getClass(), "rateHold", 420904170);
        setIntField(term200810, term200810.getClass(), "rateFlick", -1514514018);
        setIntField(term200810, term200810.getClass(), "rateSideTap", 589432414);
        setIntField(term200810, term200810.getClass(), "rateSideHold", 1352632094);
        setIntField(term200810, term200810.getClass(), "bellCount", 292956547);
        setIntField(term200810, term200810.getClass(), "totalBellCount", -92695569);
        setIntField(term200810, term200810.getClass(), "damageCount", 1565627695);
        setIntField(term200810, term200810.getClass(), "overDamage", -919076299);
        setBooleanField(term200810, term200810.getClass(), "isTechNewRecord", true);
        setBooleanField(term200810, term200810.getClass(), "isBattleNewRecord", true);
        setBooleanField(term200810, term200810.getClass(), "isOverDamageNewRecord", true);
        setBooleanField(term200810, term200810.getClass(), "isFullCombo", true);
        setBooleanField(term200810, term200810.getClass(), "isFullBell", false);
        setBooleanField(term200810, term200810.getClass(), "isAllBreak", true);
        setIntField(term200810, term200810.getClass(), "playerRating", 1129660297);
        setIntField(term200810, term200810.getClass(), "battlePoint", -275725090);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBossCharaId", argTypes, term200810, args);
    }

};


