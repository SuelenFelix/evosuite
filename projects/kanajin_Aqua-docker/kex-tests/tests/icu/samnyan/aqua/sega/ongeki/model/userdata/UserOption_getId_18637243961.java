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

public class UserOption_getId_18637243961 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term308913;

    public UserOption_getId_18637243961() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term308919 = new Long(-1486519351300660432L);
        term308913 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption"));
        Object term308915 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term308917 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term308933 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term308934 = newInstance(Class.forName("java.time.LocalDate"));
        Object term308938 = newInstance(Class.forName("java.time.LocalTime"));
        Object term308943 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term308944 = newInstance(Class.forName("java.time.LocalDate"));
        Object term308948 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term308913, term308913.getClass(), "id", 4115191703673397303L);
        setLongField(term308915, term308915.getClass(), "id", 7638422238467082510L);
        setLongField(term308917, term308917.getClass(), "id", 1315793078153547876L);
        setField(term308917, term308917.getClass(), "extId", term308919);
        setField(term308917, term308917.getClass(), "luid", "IcvbaPtHCI");
        setIntField(term308934, term308934.getClass(), "year", 2014);
        setShortField(term308934, term308934.getClass(), "month", (short) 9);
        setShortField(term308934, term308934.getClass(), "day", (short) 20);
        setField(term308933, term308933.getClass(), "date", term308934);
        setByteField(term308938, term308938.getClass(), "hour", (byte) 4);
        setByteField(term308938, term308938.getClass(), "minute", (byte) 20);
        setByteField(term308938, term308938.getClass(), "second", (byte) 43);
        setIntField(term308938, term308938.getClass(), "nano", 424375033);
        setField(term308933, term308933.getClass(), "time", term308938);
        setField(term308917, term308917.getClass(), "registerTime", term308933);
        setIntField(term308944, term308944.getClass(), "year", 2016);
        setShortField(term308944, term308944.getClass(), "month", (short) 4);
        setShortField(term308944, term308944.getClass(), "day", (short) 19);
        setField(term308943, term308943.getClass(), "date", term308944);
        setByteField(term308948, term308948.getClass(), "hour", (byte) 0);
        setByteField(term308948, term308948.getClass(), "minute", (byte) 54);
        setByteField(term308948, term308948.getClass(), "second", (byte) 30);
        setIntField(term308948, term308948.getClass(), "nano", 632691153);
        setField(term308943, term308943.getClass(), "time", term308948);
        setField(term308917, term308917.getClass(), "accessTime", term308943);
        setField(term308915, term308915.getClass(), "card", term308917);
        setField(term308915, term308915.getClass(), "userName", "TpLdjLzfnM");
        setIntField(term308915, term308915.getClass(), "level", 1839099930);
        setIntField(term308915, term308915.getClass(), "reincarnationNum", 389115237);
        setLongField(term308915, term308915.getClass(), "exp", -7582179668083773781L);
        setLongField(term308915, term308915.getClass(), "point", 3621245161906330091L);
        setLongField(term308915, term308915.getClass(), "totalPoint", 6184167425726058626L);
        setIntField(term308915, term308915.getClass(), "playCount", 201178127);
        setIntField(term308915, term308915.getClass(), "jewelCount", 1523290038);
        setIntField(term308915, term308915.getClass(), "totalJewelCount", 1666444125);
        setIntField(term308915, term308915.getClass(), "medalCount", -1907610020);
        setIntField(term308915, term308915.getClass(), "playerRating", -558304449);
        setIntField(term308915, term308915.getClass(), "highestRating", 399759942);
        setIntField(term308915, term308915.getClass(), "battlePoint", -2032346482);
        setIntField(term308915, term308915.getClass(), "bestBattlePoint", 373546488);
        setIntField(term308915, term308915.getClass(), "overDamageBattlePoint", -944589693);
        setBooleanField(term308915, term308915.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term308915, term308915.getClass(), "nameplateId", 1958138136);
        setIntField(term308915, term308915.getClass(), "trophyId", 1632154076);
        setIntField(term308915, term308915.getClass(), "cardId", 204790228);
        setIntField(term308915, term308915.getClass(), "characterId", -2132870644);
        setIntField(term308915, term308915.getClass(), "characterVoiceNo", 319578880);
        setIntField(term308915, term308915.getClass(), "tabSetting", -1301385941);
        setIntField(term308915, term308915.getClass(), "tabSortSetting", -1433539567);
        setIntField(term308915, term308915.getClass(), "cardCategorySetting", -988966734);
        setIntField(term308915, term308915.getClass(), "cardSortSetting", -1429192604);
        setIntField(term308915, term308915.getClass(), "rivalScoreCategorySetting", 721488973);
        setIntField(term308915, term308915.getClass(), "playedTutorialBit", 1129309561);
        setIntField(term308915, term308915.getClass(), "firstTutorialCancelNum", -1834282676);
        setLongField(term308915, term308915.getClass(), "sumTechHighScore", 783221156437049222L);
        setLongField(term308915, term308915.getClass(), "sumTechBasicHighScore", 8335928718596250482L);
        setLongField(term308915, term308915.getClass(), "sumTechAdvancedHighScore", -259140890700478948L);
        setLongField(term308915, term308915.getClass(), "sumTechExpertHighScore", -3148645266521105667L);
        setLongField(term308915, term308915.getClass(), "sumTechMasterHighScore", -4654599309141523642L);
        setLongField(term308915, term308915.getClass(), "sumTechLunaticHighScore", 7036557807792625007L);
        setLongField(term308915, term308915.getClass(), "sumBattleHighScore", 7684568403322589199L);
        setLongField(term308915, term308915.getClass(), "sumBattleBasicHighScore", -7251873140179450300L);
        setLongField(term308915, term308915.getClass(), "sumBattleAdvancedHighScore", 5450498043519575035L);
        setLongField(term308915, term308915.getClass(), "sumBattleExpertHighScore", 6232935575089289931L);
        setLongField(term308915, term308915.getClass(), "sumBattleMasterHighScore", 3197903754562624586L);
        setLongField(term308915, term308915.getClass(), "sumBattleLunaticHighScore", 6821897634118931718L);
        setField(term308915, term308915.getClass(), "eventWatchedDate", "bhoYUUtgsQ");
        setField(term308915, term308915.getClass(), "cmEventWatchedDate", "XcBhxrFdvV");
        setField(term308915, term308915.getClass(), "firstGameId", "wtDJOIcmRf");
        setField(term308915, term308915.getClass(), "firstRomVersion", "BMrbKMgdYV");
        setField(term308915, term308915.getClass(), "firstDataVersion", "kXDyYBqBoz");
        setField(term308915, term308915.getClass(), "firstPlayDate", "JhMXaownHd");
        setField(term308915, term308915.getClass(), "lastGameId", "iExZeOzVen");
        setField(term308915, term308915.getClass(), "lastRomVersion", "BTUQGyWEFZ");
        setField(term308915, term308915.getClass(), "lastDataVersion", "QAdZYMdOjK");
        setField(term308915, term308915.getClass(), "compatibleCmVersion", "YPIxYibaKU");
        setField(term308915, term308915.getClass(), "lastPlayDate", "hAGyPTyoNh");
        setIntField(term308915, term308915.getClass(), "lastPlaceId", -2013430786);
        setField(term308915, term308915.getClass(), "lastPlaceName", "WIEdirzVjc");
        setIntField(term308915, term308915.getClass(), "lastRegionId", -420274573);
        setField(term308915, term308915.getClass(), "lastRegionName", "jbzOackPUQ");
        setIntField(term308915, term308915.getClass(), "lastAllNetId", -223726106);
        setField(term308915, term308915.getClass(), "lastClientId", "FvZbKfGFpg");
        setIntField(term308915, term308915.getClass(), "lastUsedDeckId", 495426369);
        setIntField(term308915, term308915.getClass(), "lastPlayMusicLevel", 1614607328);
        setIntField(term308915, term308915.getClass(), "lastEmoneyBrand", 1656951009);
        setField(term308913, term308913.getClass(), "user", term308915);
        setIntField(term308913, term308913.getClass(), "optionSet", 1159603940);
        setIntField(term308913, term308913.getClass(), "speed", 2041979999);
        setIntField(term308913, term308913.getClass(), "mirror", 623036088);
        setIntField(term308913, term308913.getClass(), "judgeTiming", 1236350177);
        setIntField(term308913, term308913.getClass(), "judgeAdjustment", -1563911019);
        setIntField(term308913, term308913.getClass(), "abort", 393245162);
        setIntField(term308913, term308913.getClass(), "stealthField", -1938335403);
        setIntField(term308913, term308913.getClass(), "tapSound", -1518620423);
        setIntField(term308913, term308913.getClass(), "volGuide", -250838827);
        setIntField(term308913, term308913.getClass(), "volAll", -1306980616);
        setIntField(term308913, term308913.getClass(), "volTap", -2066960279);
        setIntField(term308913, term308913.getClass(), "volCrTap", 1766576479);
        setIntField(term308913, term308913.getClass(), "volHold", -1294582627);
        setIntField(term308913, term308913.getClass(), "volSide", 1278596092);
        setIntField(term308913, term308913.getClass(), "volFlick", -378985840);
        setIntField(term308913, term308913.getClass(), "volBell", 2084793260);
        setIntField(term308913, term308913.getClass(), "volEnemy", -1873615956);
        setIntField(term308913, term308913.getClass(), "volSkill", -53292129);
        setIntField(term308913, term308913.getClass(), "volDamage", 27043473);
        setIntField(term308913, term308913.getClass(), "colorField", -1278195248);
        setIntField(term308913, term308913.getClass(), "colorLaneBright", 259782243);
        setIntField(term308913, term308913.getClass(), "colorWallBright", -1989754666);
        setIntField(term308913, term308913.getClass(), "colorLane", -1390001694);
        setIntField(term308913, term308913.getClass(), "colorSide", 903270470);
        setIntField(term308913, term308913.getClass(), "effectDamage", 25353712);
        setIntField(term308913, term308913.getClass(), "effectPos", 927932976);
        setIntField(term308913, term308913.getClass(), "judgeDisp", 1436769137);
        setIntField(term308913, term308913.getClass(), "judgePos", -1910221945);
        setIntField(term308913, term308913.getClass(), "judgeBreak", -1137342801);
        setIntField(term308913, term308913.getClass(), "judgeHit", -1433672081);
        setIntField(term308913, term308913.getClass(), "platinumBreakDisp", -1671760223);
        setIntField(term308913, term308913.getClass(), "judgeCriticalBreak", 615305411);
        setIntField(term308913, term308913.getClass(), "matching", 1143454924);
        setIntField(term308913, term308913.getClass(), "dispPlayerLv", -1580781990);
        setIntField(term308913, term308913.getClass(), "dispRating", 1347623570);
        setIntField(term308913, term308913.getClass(), "dispBP", 1780415950);
        setIntField(term308913, term308913.getClass(), "headphone", -1694290132);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term308913, args);
    }

};


