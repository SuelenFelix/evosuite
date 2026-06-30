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

public class UserChapter_getJewelCount_10257872594 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84925;

    public UserChapter_getJewelCount_10257872594() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term84931 = new Long(-4030863184426321096L);
        term84925 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserChapter"));
        Object term84927 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term84929 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term84945 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term84946 = newInstance(Class.forName("java.time.LocalDate"));
        Object term84950 = newInstance(Class.forName("java.time.LocalTime"));
        Object term84955 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term84956 = newInstance(Class.forName("java.time.LocalDate"));
        Object term84960 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term84925, term84925.getClass(), "id", 4963001669659818161L);
        setLongField(term84927, term84927.getClass(), "id", 2968855634918029589L);
        setLongField(term84929, term84929.getClass(), "id", 4747433622332782753L);
        setField(term84929, term84929.getClass(), "extId", term84931);
        setField(term84929, term84929.getClass(), "luid", "dlLhtWVZjw");
        setIntField(term84946, term84946.getClass(), "year", 2025);
        setShortField(term84946, term84946.getClass(), "month", (short) 2);
        setShortField(term84946, term84946.getClass(), "day", (short) 24);
        setField(term84945, term84945.getClass(), "date", term84946);
        setByteField(term84950, term84950.getClass(), "hour", (byte) 10);
        setByteField(term84950, term84950.getClass(), "minute", (byte) 56);
        setByteField(term84950, term84950.getClass(), "second", (byte) 29);
        setIntField(term84950, term84950.getClass(), "nano", 207724630);
        setField(term84945, term84945.getClass(), "time", term84950);
        setField(term84929, term84929.getClass(), "registerTime", term84945);
        setIntField(term84956, term84956.getClass(), "year", 2027);
        setShortField(term84956, term84956.getClass(), "month", (short) 8);
        setShortField(term84956, term84956.getClass(), "day", (short) 16);
        setField(term84955, term84955.getClass(), "date", term84956);
        setByteField(term84960, term84960.getClass(), "hour", (byte) 1);
        setByteField(term84960, term84960.getClass(), "minute", (byte) 50);
        setByteField(term84960, term84960.getClass(), "second", (byte) 52);
        setIntField(term84960, term84960.getClass(), "nano", 161814778);
        setField(term84955, term84955.getClass(), "time", term84960);
        setField(term84929, term84929.getClass(), "accessTime", term84955);
        setField(term84927, term84927.getClass(), "card", term84929);
        setField(term84927, term84927.getClass(), "userName", "bGfglrDSXT");
        setIntField(term84927, term84927.getClass(), "level", 1756335526);
        setIntField(term84927, term84927.getClass(), "reincarnationNum", 1520765805);
        setLongField(term84927, term84927.getClass(), "exp", -2410843304256238512L);
        setLongField(term84927, term84927.getClass(), "point", 529795251759909859L);
        setLongField(term84927, term84927.getClass(), "totalPoint", 5093227115352597520L);
        setIntField(term84927, term84927.getClass(), "playCount", -1583406430);
        setIntField(term84927, term84927.getClass(), "jewelCount", -362377365);
        setIntField(term84927, term84927.getClass(), "totalJewelCount", -1066899178);
        setIntField(term84927, term84927.getClass(), "medalCount", -375367032);
        setIntField(term84927, term84927.getClass(), "playerRating", 947865229);
        setIntField(term84927, term84927.getClass(), "highestRating", 669536206);
        setIntField(term84927, term84927.getClass(), "battlePoint", 1462009781);
        setIntField(term84927, term84927.getClass(), "bestBattlePoint", 1888180272);
        setIntField(term84927, term84927.getClass(), "overDamageBattlePoint", 122373099);
        setBooleanField(term84927, term84927.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term84927, term84927.getClass(), "nameplateId", 1523613362);
        setIntField(term84927, term84927.getClass(), "trophyId", -534854731);
        setIntField(term84927, term84927.getClass(), "cardId", 974443737);
        setIntField(term84927, term84927.getClass(), "characterId", 1870256063);
        setIntField(term84927, term84927.getClass(), "characterVoiceNo", -1476089256);
        setIntField(term84927, term84927.getClass(), "tabSetting", -1574154979);
        setIntField(term84927, term84927.getClass(), "tabSortSetting", -1283710689);
        setIntField(term84927, term84927.getClass(), "cardCategorySetting", -336745260);
        setIntField(term84927, term84927.getClass(), "cardSortSetting", -100110545);
        setIntField(term84927, term84927.getClass(), "rivalScoreCategorySetting", 891852800);
        setIntField(term84927, term84927.getClass(), "playedTutorialBit", -1015397914);
        setIntField(term84927, term84927.getClass(), "firstTutorialCancelNum", -532093166);
        setLongField(term84927, term84927.getClass(), "sumTechHighScore", 1676643367165787423L);
        setLongField(term84927, term84927.getClass(), "sumTechBasicHighScore", -2189506306600248684L);
        setLongField(term84927, term84927.getClass(), "sumTechAdvancedHighScore", -1860737589067248426L);
        setLongField(term84927, term84927.getClass(), "sumTechExpertHighScore", -5623728246411068431L);
        setLongField(term84927, term84927.getClass(), "sumTechMasterHighScore", -1482512839344698645L);
        setLongField(term84927, term84927.getClass(), "sumTechLunaticHighScore", 5220887092676977977L);
        setLongField(term84927, term84927.getClass(), "sumBattleHighScore", -738697333147106204L);
        setLongField(term84927, term84927.getClass(), "sumBattleBasicHighScore", 4762222530088432089L);
        setLongField(term84927, term84927.getClass(), "sumBattleAdvancedHighScore", 1112619626486434161L);
        setLongField(term84927, term84927.getClass(), "sumBattleExpertHighScore", 518071851793374019L);
        setLongField(term84927, term84927.getClass(), "sumBattleMasterHighScore", -7335238292024569938L);
        setLongField(term84927, term84927.getClass(), "sumBattleLunaticHighScore", 145049428630073036L);
        setField(term84927, term84927.getClass(), "eventWatchedDate", "sIrqbajnbs");
        setField(term84927, term84927.getClass(), "cmEventWatchedDate", "AaxFofoThl");
        setField(term84927, term84927.getClass(), "firstGameId", "ukaqYcLsKW");
        setField(term84927, term84927.getClass(), "firstRomVersion", "EZLBboYbhD");
        setField(term84927, term84927.getClass(), "firstDataVersion", "bZISImXSTe");
        setField(term84927, term84927.getClass(), "firstPlayDate", "yrKoMMHHHY");
        setField(term84927, term84927.getClass(), "lastGameId", "JqDCwLjqnp");
        setField(term84927, term84927.getClass(), "lastRomVersion", "FHqHhmdJat");
        setField(term84927, term84927.getClass(), "lastDataVersion", "QvpedpvzkV");
        setField(term84927, term84927.getClass(), "compatibleCmVersion", "hSWpWtRQyH");
        setField(term84927, term84927.getClass(), "lastPlayDate", "DgHnOCKjBN");
        setIntField(term84927, term84927.getClass(), "lastPlaceId", -1607646566);
        setField(term84927, term84927.getClass(), "lastPlaceName", "nSSytCAuBk");
        setIntField(term84927, term84927.getClass(), "lastRegionId", 506130929);
        setField(term84927, term84927.getClass(), "lastRegionName", "XiZyOHXnNC");
        setIntField(term84927, term84927.getClass(), "lastAllNetId", -867712319);
        setField(term84927, term84927.getClass(), "lastClientId", "gQlDPvSqrX");
        setIntField(term84927, term84927.getClass(), "lastUsedDeckId", 1553829906);
        setIntField(term84927, term84927.getClass(), "lastPlayMusicLevel", -1834113546);
        setIntField(term84927, term84927.getClass(), "lastEmoneyBrand", -1096758602);
        setField(term84925, term84925.getClass(), "user", term84927);
        setIntField(term84925, term84925.getClass(), "chapterId", -1673344361);
        setIntField(term84925, term84925.getClass(), "jewelCount", 165656819);
        setIntField(term84925, term84925.getClass(), "lastPlayMusicCategory", -1323694629);
        setIntField(term84925, term84925.getClass(), "lastPlayMusicId", -2081432518);
        setIntField(term84925, term84925.getClass(), "lastPlayMusicLevel", -758163836);
        setBooleanField(term84925, term84925.getClass(), "isStoryWatched", false);
        setBooleanField(term84925, term84925.getClass(), "isClear", false);
        setIntField(term84925, term84925.getClass(), "skipTiming1", -1804114578);
        setIntField(term84925, term84925.getClass(), "skipTiming2", 1243466145);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserChapter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getJewelCount", argTypes, term84925, args);
    }

};


