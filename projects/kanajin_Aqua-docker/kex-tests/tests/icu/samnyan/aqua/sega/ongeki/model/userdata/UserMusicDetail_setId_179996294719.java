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

public class UserMusicDetail_setId_179996294719 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term412109;
     Object term412390;

    public UserMusicDetail_setId_179996294719() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term412115 = new Long(-5597498165246748176L);
        term412109 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicDetail"));
        Object term412111 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term412113 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term412129 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term412130 = newInstance(Class.forName("java.time.LocalDate"));
        Object term412134 = newInstance(Class.forName("java.time.LocalTime"));
        Object term412139 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term412140 = newInstance(Class.forName("java.time.LocalDate"));
        Object term412144 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term412109, term412109.getClass(), "id", -7504197321023156031L);
        setLongField(term412111, term412111.getClass(), "id", -4616219918340895069L);
        setLongField(term412113, term412113.getClass(), "id", -4577134311575942029L);
        setField(term412113, term412113.getClass(), "extId", term412115);
        setField(term412113, term412113.getClass(), "luid", "AeDsZcMHlQ");
        setIntField(term412130, term412130.getClass(), "year", 2022);
        setShortField(term412130, term412130.getClass(), "month", (short) 8);
        setShortField(term412130, term412130.getClass(), "day", (short) 5);
        setField(term412129, term412129.getClass(), "date", term412130);
        setByteField(term412134, term412134.getClass(), "hour", (byte) 21);
        setByteField(term412134, term412134.getClass(), "minute", (byte) 56);
        setByteField(term412134, term412134.getClass(), "second", (byte) 57);
        setIntField(term412134, term412134.getClass(), "nano", 476201299);
        setField(term412129, term412129.getClass(), "time", term412134);
        setField(term412113, term412113.getClass(), "registerTime", term412129);
        setIntField(term412140, term412140.getClass(), "year", 2027);
        setShortField(term412140, term412140.getClass(), "month", (short) 3);
        setShortField(term412140, term412140.getClass(), "day", (short) 16);
        setField(term412139, term412139.getClass(), "date", term412140);
        setByteField(term412144, term412144.getClass(), "hour", (byte) 15);
        setByteField(term412144, term412144.getClass(), "minute", (byte) 24);
        setByteField(term412144, term412144.getClass(), "second", (byte) 44);
        setIntField(term412144, term412144.getClass(), "nano", 527222515);
        setField(term412139, term412139.getClass(), "time", term412144);
        setField(term412113, term412113.getClass(), "accessTime", term412139);
        setField(term412111, term412111.getClass(), "card", term412113);
        setField(term412111, term412111.getClass(), "userName", "sWyAmiCtxp");
        setIntField(term412111, term412111.getClass(), "level", 641173338);
        setIntField(term412111, term412111.getClass(), "reincarnationNum", 1699401185);
        setLongField(term412111, term412111.getClass(), "exp", 4586583870979588373L);
        setLongField(term412111, term412111.getClass(), "point", 1855606159228929170L);
        setLongField(term412111, term412111.getClass(), "totalPoint", -4306529967991880114L);
        setIntField(term412111, term412111.getClass(), "playCount", -1900473660);
        setIntField(term412111, term412111.getClass(), "jewelCount", -1786164389);
        setIntField(term412111, term412111.getClass(), "totalJewelCount", -221073812);
        setIntField(term412111, term412111.getClass(), "medalCount", -1852535606);
        setIntField(term412111, term412111.getClass(), "playerRating", -1003951947);
        setIntField(term412111, term412111.getClass(), "highestRating", -942905669);
        setIntField(term412111, term412111.getClass(), "battlePoint", 803283224);
        setIntField(term412111, term412111.getClass(), "bestBattlePoint", 1103886079);
        setIntField(term412111, term412111.getClass(), "overDamageBattlePoint", 2087517759);
        setBooleanField(term412111, term412111.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term412111, term412111.getClass(), "nameplateId", 1870764435);
        setIntField(term412111, term412111.getClass(), "trophyId", 776379157);
        setIntField(term412111, term412111.getClass(), "cardId", -103855969);
        setIntField(term412111, term412111.getClass(), "characterId", 1382938356);
        setIntField(term412111, term412111.getClass(), "characterVoiceNo", 1622030093);
        setIntField(term412111, term412111.getClass(), "tabSetting", 447309846);
        setIntField(term412111, term412111.getClass(), "tabSortSetting", 2043594561);
        setIntField(term412111, term412111.getClass(), "cardCategorySetting", 1152996595);
        setIntField(term412111, term412111.getClass(), "cardSortSetting", -466338824);
        setIntField(term412111, term412111.getClass(), "rivalScoreCategorySetting", 922263611);
        setIntField(term412111, term412111.getClass(), "playedTutorialBit", 699709277);
        setIntField(term412111, term412111.getClass(), "firstTutorialCancelNum", -949171074);
        setLongField(term412111, term412111.getClass(), "sumTechHighScore", -8033065057793110925L);
        setLongField(term412111, term412111.getClass(), "sumTechBasicHighScore", -2786276876338956864L);
        setLongField(term412111, term412111.getClass(), "sumTechAdvancedHighScore", -8042572274150637794L);
        setLongField(term412111, term412111.getClass(), "sumTechExpertHighScore", 2610705597204246697L);
        setLongField(term412111, term412111.getClass(), "sumTechMasterHighScore", 3251705644984918543L);
        setLongField(term412111, term412111.getClass(), "sumTechLunaticHighScore", -5423276771127866251L);
        setLongField(term412111, term412111.getClass(), "sumBattleHighScore", -4958570681594433477L);
        setLongField(term412111, term412111.getClass(), "sumBattleBasicHighScore", 8971201495631609696L);
        setLongField(term412111, term412111.getClass(), "sumBattleAdvancedHighScore", -4022369478766898864L);
        setLongField(term412111, term412111.getClass(), "sumBattleExpertHighScore", -2909137106846420129L);
        setLongField(term412111, term412111.getClass(), "sumBattleMasterHighScore", -3121708308089880255L);
        setLongField(term412111, term412111.getClass(), "sumBattleLunaticHighScore", -1176178962060860608L);
        setField(term412111, term412111.getClass(), "eventWatchedDate", "WeBhlWHbrQ");
        setField(term412111, term412111.getClass(), "cmEventWatchedDate", "kqRncrgIEK");
        setField(term412111, term412111.getClass(), "firstGameId", "usuNcHEllD");
        setField(term412111, term412111.getClass(), "firstRomVersion", "BHsLUwrzKI");
        setField(term412111, term412111.getClass(), "firstDataVersion", "ExDeUSYliL");
        setField(term412111, term412111.getClass(), "firstPlayDate", "FMaYLOYehM");
        setField(term412111, term412111.getClass(), "lastGameId", "FRFplJBlmK");
        setField(term412111, term412111.getClass(), "lastRomVersion", "qfQIqMKNWc");
        setField(term412111, term412111.getClass(), "lastDataVersion", "upoABwfzCG");
        setField(term412111, term412111.getClass(), "compatibleCmVersion", "nDFlpfcNZS");
        setField(term412111, term412111.getClass(), "lastPlayDate", "OUIzcuBAqa");
        setIntField(term412111, term412111.getClass(), "lastPlaceId", 713809100);
        setField(term412111, term412111.getClass(), "lastPlaceName", "qnenfLncbk");
        setIntField(term412111, term412111.getClass(), "lastRegionId", -860538934);
        setField(term412111, term412111.getClass(), "lastRegionName", "ZbAtBSiKeu");
        setIntField(term412111, term412111.getClass(), "lastAllNetId", 2018296809);
        setField(term412111, term412111.getClass(), "lastClientId", "QgrbwxcmcS");
        setIntField(term412111, term412111.getClass(), "lastUsedDeckId", 1917500617);
        setIntField(term412111, term412111.getClass(), "lastPlayMusicLevel", 175730667);
        setIntField(term412111, term412111.getClass(), "lastEmoneyBrand", -1081092578);
        setField(term412109, term412109.getClass(), "user", term412111);
        setIntField(term412109, term412109.getClass(), "musicId", -662193081);
        setIntField(term412109, term412109.getClass(), "level", 2036130324);
        setIntField(term412109, term412109.getClass(), "playCount", 213989417);
        setIntField(term412109, term412109.getClass(), "techScoreMax", 983082975);
        setIntField(term412109, term412109.getClass(), "techScoreRank", 1436732510);
        setIntField(term412109, term412109.getClass(), "battleScoreMax", -146303749);
        setIntField(term412109, term412109.getClass(), "battleScoreRank", 367973262);
        setIntField(term412109, term412109.getClass(), "maxComboCount", 1012768883);
        setIntField(term412109, term412109.getClass(), "maxOverKill", 1506251525);
        setIntField(term412109, term412109.getClass(), "maxTeamOverKill", -1346295028);
        setBooleanField(term412109, term412109.getClass(), "isFullBell", false);
        setBooleanField(term412109, term412109.getClass(), "isFullCombo", false);
        setBooleanField(term412109, term412109.getClass(), "isAllBreake", true);
        setBooleanField(term412109, term412109.getClass(), "isLock", true);
        setIntField(term412109, term412109.getClass(), "clearStatus", -732016038);
        setBooleanField(term412109, term412109.getClass(), "isStoryWatched", true);
        term412390 = new Long(-6379793022268068863L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term412390;
        callMethod(klass, "setId", argTypes, term412109, args);
    }

};


