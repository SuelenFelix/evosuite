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

public class UserMusicDetail_canEqual_126710848338 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term420946;
     Object term421227;

    public UserMusicDetail_canEqual_126710848338() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term420952 = new Long(6338971839666144092L);
        term420946 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicDetail"));
        Object term420948 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term420950 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term420966 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term420967 = newInstance(Class.forName("java.time.LocalDate"));
        Object term420971 = newInstance(Class.forName("java.time.LocalTime"));
        Object term420976 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term420977 = newInstance(Class.forName("java.time.LocalDate"));
        Object term420981 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term420946, term420946.getClass(), "id", 2850309609822456590L);
        setLongField(term420948, term420948.getClass(), "id", -2755760342811919315L);
        setLongField(term420950, term420950.getClass(), "id", 2160976780758240372L);
        setField(term420950, term420950.getClass(), "extId", term420952);
        setField(term420950, term420950.getClass(), "luid", "SUIbokYSci");
        setIntField(term420967, term420967.getClass(), "year", 2029);
        setShortField(term420967, term420967.getClass(), "month", (short) 7);
        setShortField(term420967, term420967.getClass(), "day", (short) 29);
        setField(term420966, term420966.getClass(), "date", term420967);
        setByteField(term420971, term420971.getClass(), "hour", (byte) 11);
        setByteField(term420971, term420971.getClass(), "minute", (byte) 41);
        setByteField(term420971, term420971.getClass(), "second", (byte) 26);
        setIntField(term420971, term420971.getClass(), "nano", 286115016);
        setField(term420966, term420966.getClass(), "time", term420971);
        setField(term420950, term420950.getClass(), "registerTime", term420966);
        setIntField(term420977, term420977.getClass(), "year", 2027);
        setShortField(term420977, term420977.getClass(), "month", (short) 7);
        setShortField(term420977, term420977.getClass(), "day", (short) 16);
        setField(term420976, term420976.getClass(), "date", term420977);
        setByteField(term420981, term420981.getClass(), "hour", (byte) 9);
        setByteField(term420981, term420981.getClass(), "minute", (byte) 44);
        setByteField(term420981, term420981.getClass(), "second", (byte) 22);
        setIntField(term420981, term420981.getClass(), "nano", 468962417);
        setField(term420976, term420976.getClass(), "time", term420981);
        setField(term420950, term420950.getClass(), "accessTime", term420976);
        setField(term420948, term420948.getClass(), "card", term420950);
        setField(term420948, term420948.getClass(), "userName", "jLfMnXOUsI");
        setIntField(term420948, term420948.getClass(), "level", -289563431);
        setIntField(term420948, term420948.getClass(), "reincarnationNum", 229220434);
        setLongField(term420948, term420948.getClass(), "exp", 7795561592859762852L);
        setLongField(term420948, term420948.getClass(), "point", 5615105314199345292L);
        setLongField(term420948, term420948.getClass(), "totalPoint", 1995097271982095425L);
        setIntField(term420948, term420948.getClass(), "playCount", 347174754);
        setIntField(term420948, term420948.getClass(), "jewelCount", -1853198513);
        setIntField(term420948, term420948.getClass(), "totalJewelCount", -1679023532);
        setIntField(term420948, term420948.getClass(), "medalCount", -1151590162);
        setIntField(term420948, term420948.getClass(), "playerRating", 1917902220);
        setIntField(term420948, term420948.getClass(), "highestRating", -776946397);
        setIntField(term420948, term420948.getClass(), "battlePoint", 423800570);
        setIntField(term420948, term420948.getClass(), "bestBattlePoint", 1618247576);
        setIntField(term420948, term420948.getClass(), "overDamageBattlePoint", 1582637641);
        setBooleanField(term420948, term420948.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term420948, term420948.getClass(), "nameplateId", 1753054948);
        setIntField(term420948, term420948.getClass(), "trophyId", -1829551618);
        setIntField(term420948, term420948.getClass(), "cardId", 842747743);
        setIntField(term420948, term420948.getClass(), "characterId", -1960617419);
        setIntField(term420948, term420948.getClass(), "characterVoiceNo", -658955008);
        setIntField(term420948, term420948.getClass(), "tabSetting", 534308906);
        setIntField(term420948, term420948.getClass(), "tabSortSetting", -1630770706);
        setIntField(term420948, term420948.getClass(), "cardCategorySetting", -935903461);
        setIntField(term420948, term420948.getClass(), "cardSortSetting", 594418599);
        setIntField(term420948, term420948.getClass(), "rivalScoreCategorySetting", 1770271322);
        setIntField(term420948, term420948.getClass(), "playedTutorialBit", -675178771);
        setIntField(term420948, term420948.getClass(), "firstTutorialCancelNum", 1734364548);
        setLongField(term420948, term420948.getClass(), "sumTechHighScore", -2666860666928783917L);
        setLongField(term420948, term420948.getClass(), "sumTechBasicHighScore", 1012896355243506341L);
        setLongField(term420948, term420948.getClass(), "sumTechAdvancedHighScore", 6965558236170239942L);
        setLongField(term420948, term420948.getClass(), "sumTechExpertHighScore", 1458709963903698697L);
        setLongField(term420948, term420948.getClass(), "sumTechMasterHighScore", 7212759459207544486L);
        setLongField(term420948, term420948.getClass(), "sumTechLunaticHighScore", 1008394459913225127L);
        setLongField(term420948, term420948.getClass(), "sumBattleHighScore", -8192741721460172933L);
        setLongField(term420948, term420948.getClass(), "sumBattleBasicHighScore", 2793999343587038040L);
        setLongField(term420948, term420948.getClass(), "sumBattleAdvancedHighScore", 2019960798318927962L);
        setLongField(term420948, term420948.getClass(), "sumBattleExpertHighScore", 5861238859322825086L);
        setLongField(term420948, term420948.getClass(), "sumBattleMasterHighScore", 3277591499975533801L);
        setLongField(term420948, term420948.getClass(), "sumBattleLunaticHighScore", -3702955343376886749L);
        setField(term420948, term420948.getClass(), "eventWatchedDate", "XEhcUfOVBp");
        setField(term420948, term420948.getClass(), "cmEventWatchedDate", "WJXfySTZPn");
        setField(term420948, term420948.getClass(), "firstGameId", "VxlVPocYFl");
        setField(term420948, term420948.getClass(), "firstRomVersion", "sCLCiCxISr");
        setField(term420948, term420948.getClass(), "firstDataVersion", "fnEoiGWYEF");
        setField(term420948, term420948.getClass(), "firstPlayDate", "HzUwzTlJwZ");
        setField(term420948, term420948.getClass(), "lastGameId", "RLFQBdVJAC");
        setField(term420948, term420948.getClass(), "lastRomVersion", "TiNPKcDcgI");
        setField(term420948, term420948.getClass(), "lastDataVersion", "hYIpvXgkMi");
        setField(term420948, term420948.getClass(), "compatibleCmVersion", "FiINKXiSMY");
        setField(term420948, term420948.getClass(), "lastPlayDate", "AbimvmverQ");
        setIntField(term420948, term420948.getClass(), "lastPlaceId", 1743870675);
        setField(term420948, term420948.getClass(), "lastPlaceName", "BauDdWpelY");
        setIntField(term420948, term420948.getClass(), "lastRegionId", -1124851922);
        setField(term420948, term420948.getClass(), "lastRegionName", "FcoOUtcuhx");
        setIntField(term420948, term420948.getClass(), "lastAllNetId", -1663711834);
        setField(term420948, term420948.getClass(), "lastClientId", "qElxdYsXVm");
        setIntField(term420948, term420948.getClass(), "lastUsedDeckId", -2059753583);
        setIntField(term420948, term420948.getClass(), "lastPlayMusicLevel", 1318417032);
        setIntField(term420948, term420948.getClass(), "lastEmoneyBrand", -1668846598);
        setField(term420946, term420946.getClass(), "user", term420948);
        setIntField(term420946, term420946.getClass(), "musicId", 1733278955);
        setIntField(term420946, term420946.getClass(), "level", 1037226250);
        setIntField(term420946, term420946.getClass(), "playCount", 1204524892);
        setIntField(term420946, term420946.getClass(), "techScoreMax", 1409122561);
        setIntField(term420946, term420946.getClass(), "techScoreRank", 445474103);
        setIntField(term420946, term420946.getClass(), "battleScoreMax", -1916757834);
        setIntField(term420946, term420946.getClass(), "battleScoreRank", -2085981382);
        setIntField(term420946, term420946.getClass(), "maxComboCount", -383947549);
        setIntField(term420946, term420946.getClass(), "maxOverKill", -403238637);
        setIntField(term420946, term420946.getClass(), "maxTeamOverKill", 1744225004);
        setBooleanField(term420946, term420946.getClass(), "isFullBell", false);
        setBooleanField(term420946, term420946.getClass(), "isFullCombo", false);
        setBooleanField(term420946, term420946.getClass(), "isAllBreake", true);
        setBooleanField(term420946, term420946.getClass(), "isLock", true);
        setIntField(term420946, term420946.getClass(), "clearStatus", 1728757346);
        setBooleanField(term420946, term420946.getClass(), "isStoryWatched", false);
        term421227 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term421227;
        callMethod(klass, "canEqual", argTypes, term420946, args);
    }

};


