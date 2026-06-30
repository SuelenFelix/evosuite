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

public class UserMemoryChapter_getLastPlayMusicId_10484295746 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term391514;

    public UserMemoryChapter_getLastPlayMusicId_10484295746() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term391520 = new Long(2769081086274438111L);
        term391514 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMemoryChapter"));
        Object term391516 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term391518 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term391534 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term391535 = newInstance(Class.forName("java.time.LocalDate"));
        Object term391539 = newInstance(Class.forName("java.time.LocalTime"));
        Object term391544 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term391545 = newInstance(Class.forName("java.time.LocalDate"));
        Object term391549 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term391514, term391514.getClass(), "id", -3830405672068422634L);
        setLongField(term391516, term391516.getClass(), "id", -8064870071028325494L);
        setLongField(term391518, term391518.getClass(), "id", -1684585402235114857L);
        setField(term391518, term391518.getClass(), "extId", term391520);
        setField(term391518, term391518.getClass(), "luid", "TFyHgZlhHm");
        setIntField(term391535, term391535.getClass(), "year", 2018);
        setShortField(term391535, term391535.getClass(), "month", (short) 5);
        setShortField(term391535, term391535.getClass(), "day", (short) 21);
        setField(term391534, term391534.getClass(), "date", term391535);
        setByteField(term391539, term391539.getClass(), "hour", (byte) 5);
        setByteField(term391539, term391539.getClass(), "minute", (byte) 33);
        setByteField(term391539, term391539.getClass(), "second", (byte) 46);
        setIntField(term391539, term391539.getClass(), "nano", 925508421);
        setField(term391534, term391534.getClass(), "time", term391539);
        setField(term391518, term391518.getClass(), "registerTime", term391534);
        setIntField(term391545, term391545.getClass(), "year", 2019);
        setShortField(term391545, term391545.getClass(), "month", (short) 11);
        setShortField(term391545, term391545.getClass(), "day", (short) 26);
        setField(term391544, term391544.getClass(), "date", term391545);
        setByteField(term391549, term391549.getClass(), "hour", (byte) 0);
        setByteField(term391549, term391549.getClass(), "minute", (byte) 52);
        setByteField(term391549, term391549.getClass(), "second", (byte) 46);
        setIntField(term391549, term391549.getClass(), "nano", 395192883);
        setField(term391544, term391544.getClass(), "time", term391549);
        setField(term391518, term391518.getClass(), "accessTime", term391544);
        setField(term391516, term391516.getClass(), "card", term391518);
        setField(term391516, term391516.getClass(), "userName", "gnTunDyVHn");
        setIntField(term391516, term391516.getClass(), "level", 1432122822);
        setIntField(term391516, term391516.getClass(), "reincarnationNum", -1125991653);
        setLongField(term391516, term391516.getClass(), "exp", 3907394296245329186L);
        setLongField(term391516, term391516.getClass(), "point", 1794472426796529632L);
        setLongField(term391516, term391516.getClass(), "totalPoint", 2938661221832723053L);
        setIntField(term391516, term391516.getClass(), "playCount", -2010592949);
        setIntField(term391516, term391516.getClass(), "jewelCount", 275848272);
        setIntField(term391516, term391516.getClass(), "totalJewelCount", 859948148);
        setIntField(term391516, term391516.getClass(), "medalCount", -40159127);
        setIntField(term391516, term391516.getClass(), "playerRating", -1161207500);
        setIntField(term391516, term391516.getClass(), "highestRating", -146466277);
        setIntField(term391516, term391516.getClass(), "battlePoint", -786001745);
        setIntField(term391516, term391516.getClass(), "bestBattlePoint", -1751158171);
        setIntField(term391516, term391516.getClass(), "overDamageBattlePoint", 623581468);
        setBooleanField(term391516, term391516.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term391516, term391516.getClass(), "nameplateId", 1652914820);
        setIntField(term391516, term391516.getClass(), "trophyId", -1163767109);
        setIntField(term391516, term391516.getClass(), "cardId", -1476507245);
        setIntField(term391516, term391516.getClass(), "characterId", 2113560591);
        setIntField(term391516, term391516.getClass(), "characterVoiceNo", 1504512721);
        setIntField(term391516, term391516.getClass(), "tabSetting", 184188354);
        setIntField(term391516, term391516.getClass(), "tabSortSetting", -1109254946);
        setIntField(term391516, term391516.getClass(), "cardCategorySetting", -1708875559);
        setIntField(term391516, term391516.getClass(), "cardSortSetting", -224047238);
        setIntField(term391516, term391516.getClass(), "rivalScoreCategorySetting", -842441188);
        setIntField(term391516, term391516.getClass(), "playedTutorialBit", -872512380);
        setIntField(term391516, term391516.getClass(), "firstTutorialCancelNum", -1082649620);
        setLongField(term391516, term391516.getClass(), "sumTechHighScore", 2571290489779623157L);
        setLongField(term391516, term391516.getClass(), "sumTechBasicHighScore", -6275765097861644360L);
        setLongField(term391516, term391516.getClass(), "sumTechAdvancedHighScore", 8443534845334408491L);
        setLongField(term391516, term391516.getClass(), "sumTechExpertHighScore", 8975154494311168906L);
        setLongField(term391516, term391516.getClass(), "sumTechMasterHighScore", -8427798782945486577L);
        setLongField(term391516, term391516.getClass(), "sumTechLunaticHighScore", -8939611260364249555L);
        setLongField(term391516, term391516.getClass(), "sumBattleHighScore", 486809775933281158L);
        setLongField(term391516, term391516.getClass(), "sumBattleBasicHighScore", -2360291257196558995L);
        setLongField(term391516, term391516.getClass(), "sumBattleAdvancedHighScore", -6779467491727073995L);
        setLongField(term391516, term391516.getClass(), "sumBattleExpertHighScore", 8422506845939017887L);
        setLongField(term391516, term391516.getClass(), "sumBattleMasterHighScore", 5407073192977748514L);
        setLongField(term391516, term391516.getClass(), "sumBattleLunaticHighScore", -7552384471304384283L);
        setField(term391516, term391516.getClass(), "eventWatchedDate", "ftvnZVUwbq");
        setField(term391516, term391516.getClass(), "cmEventWatchedDate", "LlJJBiEEZc");
        setField(term391516, term391516.getClass(), "firstGameId", "KvWDdzLJex");
        setField(term391516, term391516.getClass(), "firstRomVersion", "ywiqFHpAUH");
        setField(term391516, term391516.getClass(), "firstDataVersion", "rJPXQnDvHn");
        setField(term391516, term391516.getClass(), "firstPlayDate", "yuYkEGMQJu");
        setField(term391516, term391516.getClass(), "lastGameId", "mzImnYusSQ");
        setField(term391516, term391516.getClass(), "lastRomVersion", "NbaGYQaBUu");
        setField(term391516, term391516.getClass(), "lastDataVersion", "sVvjpYdlBK");
        setField(term391516, term391516.getClass(), "compatibleCmVersion", "NTKdQbEnRW");
        setField(term391516, term391516.getClass(), "lastPlayDate", "YCfAdKIyBh");
        setIntField(term391516, term391516.getClass(), "lastPlaceId", 1284880964);
        setField(term391516, term391516.getClass(), "lastPlaceName", "vHlLialRqe");
        setIntField(term391516, term391516.getClass(), "lastRegionId", 641603537);
        setField(term391516, term391516.getClass(), "lastRegionName", "flHjqlTtvp");
        setIntField(term391516, term391516.getClass(), "lastAllNetId", 1999259729);
        setField(term391516, term391516.getClass(), "lastClientId", "ocTSzfIYBn");
        setIntField(term391516, term391516.getClass(), "lastUsedDeckId", 2136230790);
        setIntField(term391516, term391516.getClass(), "lastPlayMusicLevel", -1272468082);
        setIntField(term391516, term391516.getClass(), "lastEmoneyBrand", -998274725);
        setField(term391514, term391514.getClass(), "user", term391516);
        setIntField(term391514, term391514.getClass(), "chapterId", -303692529);
        setIntField(term391514, term391514.getClass(), "jewelCount", -1835737581);
        setIntField(term391514, term391514.getClass(), "lastPlayMusicCategory", -407445270);
        setIntField(term391514, term391514.getClass(), "lastPlayMusicId", 2031359663);
        setIntField(term391514, term391514.getClass(), "lastPlayMusicLevel", -1952238276);
        setBooleanField(term391514, term391514.getClass(), "isDialogWatched", true);
        setBooleanField(term391514, term391514.getClass(), "isStoryWatched", true);
        setBooleanField(term391514, term391514.getClass(), "isBossWatched", false);
        setBooleanField(term391514, term391514.getClass(), "isClear", true);
        setIntField(term391514, term391514.getClass(), "gaugeId", 1318179535);
        setIntField(term391514, term391514.getClass(), "gaugeNum", -1454703889);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMemoryChapter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastPlayMusicId", argTypes, term391514, args);
    }

};


