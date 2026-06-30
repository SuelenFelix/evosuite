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

public class UserMusicDetail_getTechScoreMax_16044104506 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term406376;

    public UserMusicDetail_getTechScoreMax_16044104506() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term406382 = new Long(6313343355456678206L);
        term406376 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicDetail"));
        Object term406378 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term406380 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term406396 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term406397 = newInstance(Class.forName("java.time.LocalDate"));
        Object term406401 = newInstance(Class.forName("java.time.LocalTime"));
        Object term406406 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term406407 = newInstance(Class.forName("java.time.LocalDate"));
        Object term406411 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term406376, term406376.getClass(), "id", -3094489110597065278L);
        setLongField(term406378, term406378.getClass(), "id", 3629680404122589907L);
        setLongField(term406380, term406380.getClass(), "id", -600026769415209181L);
        setField(term406380, term406380.getClass(), "extId", term406382);
        setField(term406380, term406380.getClass(), "luid", "lieQJjQUFB");
        setIntField(term406397, term406397.getClass(), "year", 2015);
        setShortField(term406397, term406397.getClass(), "month", (short) 12);
        setShortField(term406397, term406397.getClass(), "day", (short) 3);
        setField(term406396, term406396.getClass(), "date", term406397);
        setByteField(term406401, term406401.getClass(), "hour", (byte) 9);
        setByteField(term406401, term406401.getClass(), "minute", (byte) 57);
        setByteField(term406401, term406401.getClass(), "second", (byte) 8);
        setIntField(term406401, term406401.getClass(), "nano", 387525054);
        setField(term406396, term406396.getClass(), "time", term406401);
        setField(term406380, term406380.getClass(), "registerTime", term406396);
        setIntField(term406407, term406407.getClass(), "year", 2019);
        setShortField(term406407, term406407.getClass(), "month", (short) 1);
        setShortField(term406407, term406407.getClass(), "day", (short) 15);
        setField(term406406, term406406.getClass(), "date", term406407);
        setByteField(term406411, term406411.getClass(), "hour", (byte) 12);
        setByteField(term406411, term406411.getClass(), "minute", (byte) 5);
        setByteField(term406411, term406411.getClass(), "second", (byte) 14);
        setIntField(term406411, term406411.getClass(), "nano", 485893917);
        setField(term406406, term406406.getClass(), "time", term406411);
        setField(term406380, term406380.getClass(), "accessTime", term406406);
        setField(term406378, term406378.getClass(), "card", term406380);
        setField(term406378, term406378.getClass(), "userName", "AnTIqTtttv");
        setIntField(term406378, term406378.getClass(), "level", 1900199518);
        setIntField(term406378, term406378.getClass(), "reincarnationNum", -1552702958);
        setLongField(term406378, term406378.getClass(), "exp", 945049753895570588L);
        setLongField(term406378, term406378.getClass(), "point", 3291597327489638767L);
        setLongField(term406378, term406378.getClass(), "totalPoint", -2413931516820820415L);
        setIntField(term406378, term406378.getClass(), "playCount", -1164870086);
        setIntField(term406378, term406378.getClass(), "jewelCount", -165962732);
        setIntField(term406378, term406378.getClass(), "totalJewelCount", -673972361);
        setIntField(term406378, term406378.getClass(), "medalCount", 1270352003);
        setIntField(term406378, term406378.getClass(), "playerRating", -1976543587);
        setIntField(term406378, term406378.getClass(), "highestRating", 1523681622);
        setIntField(term406378, term406378.getClass(), "battlePoint", -1280085068);
        setIntField(term406378, term406378.getClass(), "bestBattlePoint", 1770498049);
        setIntField(term406378, term406378.getClass(), "overDamageBattlePoint", 654887059);
        setBooleanField(term406378, term406378.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term406378, term406378.getClass(), "nameplateId", 1289698277);
        setIntField(term406378, term406378.getClass(), "trophyId", 108566162);
        setIntField(term406378, term406378.getClass(), "cardId", -895036223);
        setIntField(term406378, term406378.getClass(), "characterId", 1934284462);
        setIntField(term406378, term406378.getClass(), "characterVoiceNo", 2070598543);
        setIntField(term406378, term406378.getClass(), "tabSetting", -1319781793);
        setIntField(term406378, term406378.getClass(), "tabSortSetting", 185083501);
        setIntField(term406378, term406378.getClass(), "cardCategorySetting", 742711465);
        setIntField(term406378, term406378.getClass(), "cardSortSetting", -1794207616);
        setIntField(term406378, term406378.getClass(), "rivalScoreCategorySetting", -1014179276);
        setIntField(term406378, term406378.getClass(), "playedTutorialBit", 370873600);
        setIntField(term406378, term406378.getClass(), "firstTutorialCancelNum", -201242508);
        setLongField(term406378, term406378.getClass(), "sumTechHighScore", -756835273781061428L);
        setLongField(term406378, term406378.getClass(), "sumTechBasicHighScore", -3141687489525106813L);
        setLongField(term406378, term406378.getClass(), "sumTechAdvancedHighScore", 3674968935893434172L);
        setLongField(term406378, term406378.getClass(), "sumTechExpertHighScore", -4948608045371758090L);
        setLongField(term406378, term406378.getClass(), "sumTechMasterHighScore", 7290181375514940963L);
        setLongField(term406378, term406378.getClass(), "sumTechLunaticHighScore", 7809203922794704939L);
        setLongField(term406378, term406378.getClass(), "sumBattleHighScore", -2374048218341379066L);
        setLongField(term406378, term406378.getClass(), "sumBattleBasicHighScore", -5655634345080714479L);
        setLongField(term406378, term406378.getClass(), "sumBattleAdvancedHighScore", 5099454980169140885L);
        setLongField(term406378, term406378.getClass(), "sumBattleExpertHighScore", -1003542830785449576L);
        setLongField(term406378, term406378.getClass(), "sumBattleMasterHighScore", -996250085480298262L);
        setLongField(term406378, term406378.getClass(), "sumBattleLunaticHighScore", 1833599522965636758L);
        setField(term406378, term406378.getClass(), "eventWatchedDate", "vFFtdqHNLX");
        setField(term406378, term406378.getClass(), "cmEventWatchedDate", "dqGRCaUFKO");
        setField(term406378, term406378.getClass(), "firstGameId", "NyUAOAxgDv");
        setField(term406378, term406378.getClass(), "firstRomVersion", "zPIKamLvqc");
        setField(term406378, term406378.getClass(), "firstDataVersion", "CDyqNoFUUL");
        setField(term406378, term406378.getClass(), "firstPlayDate", "QeQcMxXNOx");
        setField(term406378, term406378.getClass(), "lastGameId", "MHVecwGAbz");
        setField(term406378, term406378.getClass(), "lastRomVersion", "XThiHNGdXP");
        setField(term406378, term406378.getClass(), "lastDataVersion", "JcHyduzYlu");
        setField(term406378, term406378.getClass(), "compatibleCmVersion", "ISqzrHGRdm");
        setField(term406378, term406378.getClass(), "lastPlayDate", "YAWcEzgpOu");
        setIntField(term406378, term406378.getClass(), "lastPlaceId", -2001201983);
        setField(term406378, term406378.getClass(), "lastPlaceName", "bBbATInUCr");
        setIntField(term406378, term406378.getClass(), "lastRegionId", -1945430238);
        setField(term406378, term406378.getClass(), "lastRegionName", "AMlPMRNDoC");
        setIntField(term406378, term406378.getClass(), "lastAllNetId", -596836364);
        setField(term406378, term406378.getClass(), "lastClientId", "jJrMyymbJH");
        setIntField(term406378, term406378.getClass(), "lastUsedDeckId", 544265360);
        setIntField(term406378, term406378.getClass(), "lastPlayMusicLevel", 1283176961);
        setIntField(term406378, term406378.getClass(), "lastEmoneyBrand", 690115754);
        setField(term406376, term406376.getClass(), "user", term406378);
        setIntField(term406376, term406376.getClass(), "musicId", 456197023);
        setIntField(term406376, term406376.getClass(), "level", 707290013);
        setIntField(term406376, term406376.getClass(), "playCount", 1478557592);
        setIntField(term406376, term406376.getClass(), "techScoreMax", -992237454);
        setIntField(term406376, term406376.getClass(), "techScoreRank", 765804762);
        setIntField(term406376, term406376.getClass(), "battleScoreMax", 370001200);
        setIntField(term406376, term406376.getClass(), "battleScoreRank", -1443277624);
        setIntField(term406376, term406376.getClass(), "maxComboCount", 215257398);
        setIntField(term406376, term406376.getClass(), "maxOverKill", 378698467);
        setIntField(term406376, term406376.getClass(), "maxTeamOverKill", 1857604586);
        setBooleanField(term406376, term406376.getClass(), "isFullBell", false);
        setBooleanField(term406376, term406376.getClass(), "isFullCombo", false);
        setBooleanField(term406376, term406376.getClass(), "isAllBreake", true);
        setBooleanField(term406376, term406376.getClass(), "isLock", false);
        setIntField(term406376, term406376.getClass(), "clearStatus", 769835845);
        setBooleanField(term406376, term406376.getClass(), "isStoryWatched", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTechScoreMax", argTypes, term406376, args);
    }

};


