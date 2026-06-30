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
import java.lang.Integer;

public class UserMusicDetail_setMaxOverKill_139310914629 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term416960;
     Object term417241;

    public UserMusicDetail_setMaxOverKill_139310914629() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term416966 = new Long(7048544371106200955L);
        term416960 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicDetail"));
        Object term416962 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term416964 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term416980 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term416981 = newInstance(Class.forName("java.time.LocalDate"));
        Object term416985 = newInstance(Class.forName("java.time.LocalTime"));
        Object term416990 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term416991 = newInstance(Class.forName("java.time.LocalDate"));
        Object term416995 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term416960, term416960.getClass(), "id", -7507877021382252785L);
        setLongField(term416962, term416962.getClass(), "id", 2438226105974082525L);
        setLongField(term416964, term416964.getClass(), "id", 4258664082060869419L);
        setField(term416964, term416964.getClass(), "extId", term416966);
        setField(term416964, term416964.getClass(), "luid", "SBVdXJCHmh");
        setIntField(term416981, term416981.getClass(), "year", 2025);
        setShortField(term416981, term416981.getClass(), "month", (short) 1);
        setShortField(term416981, term416981.getClass(), "day", (short) 18);
        setField(term416980, term416980.getClass(), "date", term416981);
        setByteField(term416985, term416985.getClass(), "hour", (byte) 20);
        setByteField(term416985, term416985.getClass(), "minute", (byte) 4);
        setByteField(term416985, term416985.getClass(), "second", (byte) 10);
        setIntField(term416985, term416985.getClass(), "nano", 795485401);
        setField(term416980, term416980.getClass(), "time", term416985);
        setField(term416964, term416964.getClass(), "registerTime", term416980);
        setIntField(term416991, term416991.getClass(), "year", 2013);
        setShortField(term416991, term416991.getClass(), "month", (short) 12);
        setShortField(term416991, term416991.getClass(), "day", (short) 26);
        setField(term416990, term416990.getClass(), "date", term416991);
        setByteField(term416995, term416995.getClass(), "hour", (byte) 3);
        setByteField(term416995, term416995.getClass(), "minute", (byte) 37);
        setByteField(term416995, term416995.getClass(), "second", (byte) 18);
        setIntField(term416995, term416995.getClass(), "nano", 285460284);
        setField(term416990, term416990.getClass(), "time", term416995);
        setField(term416964, term416964.getClass(), "accessTime", term416990);
        setField(term416962, term416962.getClass(), "card", term416964);
        setField(term416962, term416962.getClass(), "userName", "mspnLtkeZh");
        setIntField(term416962, term416962.getClass(), "level", 429215768);
        setIntField(term416962, term416962.getClass(), "reincarnationNum", 1624825522);
        setLongField(term416962, term416962.getClass(), "exp", 1587012880546974334L);
        setLongField(term416962, term416962.getClass(), "point", -33789643498791229L);
        setLongField(term416962, term416962.getClass(), "totalPoint", -4125603703143987724L);
        setIntField(term416962, term416962.getClass(), "playCount", 983790556);
        setIntField(term416962, term416962.getClass(), "jewelCount", -1869207999);
        setIntField(term416962, term416962.getClass(), "totalJewelCount", 1302417712);
        setIntField(term416962, term416962.getClass(), "medalCount", 980450401);
        setIntField(term416962, term416962.getClass(), "playerRating", -1750367143);
        setIntField(term416962, term416962.getClass(), "highestRating", 1290372973);
        setIntField(term416962, term416962.getClass(), "battlePoint", -265082541);
        setIntField(term416962, term416962.getClass(), "bestBattlePoint", -837829543);
        setIntField(term416962, term416962.getClass(), "overDamageBattlePoint", -949189415);
        setBooleanField(term416962, term416962.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term416962, term416962.getClass(), "nameplateId", -1252799932);
        setIntField(term416962, term416962.getClass(), "trophyId", 659069538);
        setIntField(term416962, term416962.getClass(), "cardId", -1349423448);
        setIntField(term416962, term416962.getClass(), "characterId", 856382188);
        setIntField(term416962, term416962.getClass(), "characterVoiceNo", -1826335762);
        setIntField(term416962, term416962.getClass(), "tabSetting", -1737163056);
        setIntField(term416962, term416962.getClass(), "tabSortSetting", 1798645102);
        setIntField(term416962, term416962.getClass(), "cardCategorySetting", -1437201156);
        setIntField(term416962, term416962.getClass(), "cardSortSetting", 1745538855);
        setIntField(term416962, term416962.getClass(), "rivalScoreCategorySetting", -32859072);
        setIntField(term416962, term416962.getClass(), "playedTutorialBit", -1884898128);
        setIntField(term416962, term416962.getClass(), "firstTutorialCancelNum", 2087784336);
        setLongField(term416962, term416962.getClass(), "sumTechHighScore", 1251330731021815458L);
        setLongField(term416962, term416962.getClass(), "sumTechBasicHighScore", -7990532920202309101L);
        setLongField(term416962, term416962.getClass(), "sumTechAdvancedHighScore", -2135794487884936751L);
        setLongField(term416962, term416962.getClass(), "sumTechExpertHighScore", -3077931634651383833L);
        setLongField(term416962, term416962.getClass(), "sumTechMasterHighScore", 5790705628606774553L);
        setLongField(term416962, term416962.getClass(), "sumTechLunaticHighScore", 1346298962230405847L);
        setLongField(term416962, term416962.getClass(), "sumBattleHighScore", -5180908594439128379L);
        setLongField(term416962, term416962.getClass(), "sumBattleBasicHighScore", -6327713282073039866L);
        setLongField(term416962, term416962.getClass(), "sumBattleAdvancedHighScore", -7286123213086251349L);
        setLongField(term416962, term416962.getClass(), "sumBattleExpertHighScore", 8759180592820191228L);
        setLongField(term416962, term416962.getClass(), "sumBattleMasterHighScore", 6101216569608838765L);
        setLongField(term416962, term416962.getClass(), "sumBattleLunaticHighScore", -2303957714772567419L);
        setField(term416962, term416962.getClass(), "eventWatchedDate", "RXpLroOXsC");
        setField(term416962, term416962.getClass(), "cmEventWatchedDate", "jjSMeqSrJL");
        setField(term416962, term416962.getClass(), "firstGameId", "VnfjqHyoYI");
        setField(term416962, term416962.getClass(), "firstRomVersion", "TjJwziNWuL");
        setField(term416962, term416962.getClass(), "firstDataVersion", "WatxsKGZcU");
        setField(term416962, term416962.getClass(), "firstPlayDate", "cVaBgdxkjz");
        setField(term416962, term416962.getClass(), "lastGameId", "dfWgbioujx");
        setField(term416962, term416962.getClass(), "lastRomVersion", "ExXcLZgLcy");
        setField(term416962, term416962.getClass(), "lastDataVersion", "YRgvLqYriV");
        setField(term416962, term416962.getClass(), "compatibleCmVersion", "zZlrtqpeIS");
        setField(term416962, term416962.getClass(), "lastPlayDate", "varXwFpLak");
        setIntField(term416962, term416962.getClass(), "lastPlaceId", -704894414);
        setField(term416962, term416962.getClass(), "lastPlaceName", "NqYJwPXwzf");
        setIntField(term416962, term416962.getClass(), "lastRegionId", -726401940);
        setField(term416962, term416962.getClass(), "lastRegionName", "xHYsONEsNI");
        setIntField(term416962, term416962.getClass(), "lastAllNetId", 139856747);
        setField(term416962, term416962.getClass(), "lastClientId", "jHwBIbVVPH");
        setIntField(term416962, term416962.getClass(), "lastUsedDeckId", 1320526542);
        setIntField(term416962, term416962.getClass(), "lastPlayMusicLevel", -1852506100);
        setIntField(term416962, term416962.getClass(), "lastEmoneyBrand", 231698505);
        setField(term416960, term416960.getClass(), "user", term416962);
        setIntField(term416960, term416960.getClass(), "musicId", 1668289004);
        setIntField(term416960, term416960.getClass(), "level", 1423574082);
        setIntField(term416960, term416960.getClass(), "playCount", 1084023013);
        setIntField(term416960, term416960.getClass(), "techScoreMax", 593305960);
        setIntField(term416960, term416960.getClass(), "techScoreRank", -234079906);
        setIntField(term416960, term416960.getClass(), "battleScoreMax", -1614513955);
        setIntField(term416960, term416960.getClass(), "battleScoreRank", 1485909451);
        setIntField(term416960, term416960.getClass(), "maxComboCount", 1014125983);
        setIntField(term416960, term416960.getClass(), "maxOverKill", 1865775268);
        setIntField(term416960, term416960.getClass(), "maxTeamOverKill", 1056338751);
        setBooleanField(term416960, term416960.getClass(), "isFullBell", false);
        setBooleanField(term416960, term416960.getClass(), "isFullCombo", false);
        setBooleanField(term416960, term416960.getClass(), "isAllBreake", true);
        setBooleanField(term416960, term416960.getClass(), "isLock", true);
        setIntField(term416960, term416960.getClass(), "clearStatus", -598377560);
        setBooleanField(term416960, term416960.getClass(), "isStoryWatched", false);
        term417241 = new Integer(992659688);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term417241;
        callMethod(klass, "setMaxOverKill", argTypes, term416960, args);
    }

};


