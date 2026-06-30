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

public class UserStory_getLastPlayMusicLevel_14698775848 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term161074;

    public UserStory_getLastPlayMusicLevel_14698775848() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term161080 = new Long(-1164342036939643746L);
        term161074 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserStory"));
        Object term161076 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term161078 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term161094 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term161095 = newInstance(Class.forName("java.time.LocalDate"));
        Object term161099 = newInstance(Class.forName("java.time.LocalTime"));
        Object term161104 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term161105 = newInstance(Class.forName("java.time.LocalDate"));
        Object term161109 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term161074, term161074.getClass(), "id", -2048122109769301584L);
        setLongField(term161076, term161076.getClass(), "id", -8997711710645180964L);
        setLongField(term161078, term161078.getClass(), "id", -8713996910880132871L);
        setField(term161078, term161078.getClass(), "extId", term161080);
        setField(term161078, term161078.getClass(), "luid", "LdsHLBFuxE");
        setIntField(term161095, term161095.getClass(), "year", 2027);
        setShortField(term161095, term161095.getClass(), "month", (short) 7);
        setShortField(term161095, term161095.getClass(), "day", (short) 21);
        setField(term161094, term161094.getClass(), "date", term161095);
        setByteField(term161099, term161099.getClass(), "hour", (byte) 9);
        setByteField(term161099, term161099.getClass(), "minute", (byte) 42);
        setByteField(term161099, term161099.getClass(), "second", (byte) 16);
        setIntField(term161099, term161099.getClass(), "nano", 660359132);
        setField(term161094, term161094.getClass(), "time", term161099);
        setField(term161078, term161078.getClass(), "registerTime", term161094);
        setIntField(term161105, term161105.getClass(), "year", 2022);
        setShortField(term161105, term161105.getClass(), "month", (short) 12);
        setShortField(term161105, term161105.getClass(), "day", (short) 24);
        setField(term161104, term161104.getClass(), "date", term161105);
        setByteField(term161109, term161109.getClass(), "hour", (byte) 7);
        setByteField(term161109, term161109.getClass(), "minute", (byte) 20);
        setByteField(term161109, term161109.getClass(), "second", (byte) 0);
        setIntField(term161109, term161109.getClass(), "nano", 127843410);
        setField(term161104, term161104.getClass(), "time", term161109);
        setField(term161078, term161078.getClass(), "accessTime", term161104);
        setField(term161076, term161076.getClass(), "card", term161078);
        setField(term161076, term161076.getClass(), "userName", "WdDBobmXbb");
        setIntField(term161076, term161076.getClass(), "level", -101715989);
        setIntField(term161076, term161076.getClass(), "reincarnationNum", 849720099);
        setLongField(term161076, term161076.getClass(), "exp", 6959832148690893218L);
        setLongField(term161076, term161076.getClass(), "point", 9054174532870356727L);
        setLongField(term161076, term161076.getClass(), "totalPoint", -8406317975085380712L);
        setIntField(term161076, term161076.getClass(), "playCount", -1883122431);
        setIntField(term161076, term161076.getClass(), "jewelCount", 1642134926);
        setIntField(term161076, term161076.getClass(), "totalJewelCount", 1144024512);
        setIntField(term161076, term161076.getClass(), "medalCount", -1985125812);
        setIntField(term161076, term161076.getClass(), "playerRating", -1768739818);
        setIntField(term161076, term161076.getClass(), "highestRating", -1499925323);
        setIntField(term161076, term161076.getClass(), "battlePoint", -745147263);
        setIntField(term161076, term161076.getClass(), "bestBattlePoint", 285424830);
        setIntField(term161076, term161076.getClass(), "overDamageBattlePoint", 1448276576);
        setBooleanField(term161076, term161076.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term161076, term161076.getClass(), "nameplateId", 376848403);
        setIntField(term161076, term161076.getClass(), "trophyId", -1638823326);
        setIntField(term161076, term161076.getClass(), "cardId", 1836202148);
        setIntField(term161076, term161076.getClass(), "characterId", -838056504);
        setIntField(term161076, term161076.getClass(), "characterVoiceNo", 216597043);
        setIntField(term161076, term161076.getClass(), "tabSetting", -1863649948);
        setIntField(term161076, term161076.getClass(), "tabSortSetting", 1188132768);
        setIntField(term161076, term161076.getClass(), "cardCategorySetting", -210441864);
        setIntField(term161076, term161076.getClass(), "cardSortSetting", -993404406);
        setIntField(term161076, term161076.getClass(), "rivalScoreCategorySetting", -843807783);
        setIntField(term161076, term161076.getClass(), "playedTutorialBit", -1540931841);
        setIntField(term161076, term161076.getClass(), "firstTutorialCancelNum", 1086303241);
        setLongField(term161076, term161076.getClass(), "sumTechHighScore", 5138173289133094895L);
        setLongField(term161076, term161076.getClass(), "sumTechBasicHighScore", -8603569983034188953L);
        setLongField(term161076, term161076.getClass(), "sumTechAdvancedHighScore", 1673910834994391163L);
        setLongField(term161076, term161076.getClass(), "sumTechExpertHighScore", 6420416810130314697L);
        setLongField(term161076, term161076.getClass(), "sumTechMasterHighScore", -1949964620904962419L);
        setLongField(term161076, term161076.getClass(), "sumTechLunaticHighScore", -8551703328287150294L);
        setLongField(term161076, term161076.getClass(), "sumBattleHighScore", -7184114446608947533L);
        setLongField(term161076, term161076.getClass(), "sumBattleBasicHighScore", 4282611577386894476L);
        setLongField(term161076, term161076.getClass(), "sumBattleAdvancedHighScore", 5461840589943005596L);
        setLongField(term161076, term161076.getClass(), "sumBattleExpertHighScore", 4172079491130812074L);
        setLongField(term161076, term161076.getClass(), "sumBattleMasterHighScore", -3422932225408332326L);
        setLongField(term161076, term161076.getClass(), "sumBattleLunaticHighScore", -7436930987563830432L);
        setField(term161076, term161076.getClass(), "eventWatchedDate", "LDbfuLlLaY");
        setField(term161076, term161076.getClass(), "cmEventWatchedDate", "TdtRhjRbpE");
        setField(term161076, term161076.getClass(), "firstGameId", "QKqgZRJSAe");
        setField(term161076, term161076.getClass(), "firstRomVersion", "NndiRNwUco");
        setField(term161076, term161076.getClass(), "firstDataVersion", "ZdtqQPtFUL");
        setField(term161076, term161076.getClass(), "firstPlayDate", "PsuOGjzsiR");
        setField(term161076, term161076.getClass(), "lastGameId", "KMtZBUgxHg");
        setField(term161076, term161076.getClass(), "lastRomVersion", "HOgLdEUbNT");
        setField(term161076, term161076.getClass(), "lastDataVersion", "eZTceUbJqy");
        setField(term161076, term161076.getClass(), "compatibleCmVersion", "yEnSWDaebl");
        setField(term161076, term161076.getClass(), "lastPlayDate", "FFHmFKyEmP");
        setIntField(term161076, term161076.getClass(), "lastPlaceId", 602126411);
        setField(term161076, term161076.getClass(), "lastPlaceName", "tmsApOAQNP");
        setIntField(term161076, term161076.getClass(), "lastRegionId", -1382786777);
        setField(term161076, term161076.getClass(), "lastRegionName", "vrdvjbZtaY");
        setIntField(term161076, term161076.getClass(), "lastAllNetId", -653869267);
        setField(term161076, term161076.getClass(), "lastClientId", "GDxmXDNVsL");
        setIntField(term161076, term161076.getClass(), "lastUsedDeckId", 2108460000);
        setIntField(term161076, term161076.getClass(), "lastPlayMusicLevel", 464860665);
        setIntField(term161076, term161076.getClass(), "lastEmoneyBrand", -829472053);
        setField(term161074, term161074.getClass(), "user", term161076);
        setIntField(term161074, term161074.getClass(), "storyId", 1237212779);
        setIntField(term161074, term161074.getClass(), "lastChapterId", -733200940);
        setIntField(term161074, term161074.getClass(), "jewelCount", -2099756995);
        setIntField(term161074, term161074.getClass(), "lastPlayMusicId", 146626977);
        setIntField(term161074, term161074.getClass(), "lastPlayMusicCategory", 588479166);
        setIntField(term161074, term161074.getClass(), "lastPlayMusicLevel", 555940372);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserStory");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastPlayMusicLevel", argTypes, term161074, args);
    }

};


