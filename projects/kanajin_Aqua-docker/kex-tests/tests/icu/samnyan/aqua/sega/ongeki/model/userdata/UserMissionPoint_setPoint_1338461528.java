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

public class UserMissionPoint_setPoint_1338461528 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10307;
     Object term10574;

    public UserMissionPoint_setPoint_1338461528() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term10313 = new Long(2486810210675247493L);
        term10307 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMissionPoint"));
        Object term10309 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term10311 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term10327 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10328 = newInstance(Class.forName("java.time.LocalDate"));
        Object term10332 = newInstance(Class.forName("java.time.LocalTime"));
        Object term10337 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10338 = newInstance(Class.forName("java.time.LocalDate"));
        Object term10342 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term10307, term10307.getClass(), "id", 185544001230120339L);
        setLongField(term10309, term10309.getClass(), "id", 4096288569907305445L);
        setLongField(term10311, term10311.getClass(), "id", 6940486570215409900L);
        setField(term10311, term10311.getClass(), "extId", term10313);
        setField(term10311, term10311.getClass(), "luid", "jiUSjqwSIQ");
        setIntField(term10328, term10328.getClass(), "year", 2012);
        setShortField(term10328, term10328.getClass(), "month", (short) 4);
        setShortField(term10328, term10328.getClass(), "day", (short) 25);
        setField(term10327, term10327.getClass(), "date", term10328);
        setByteField(term10332, term10332.getClass(), "hour", (byte) 21);
        setByteField(term10332, term10332.getClass(), "minute", (byte) 14);
        setByteField(term10332, term10332.getClass(), "second", (byte) 15);
        setIntField(term10332, term10332.getClass(), "nano", 561700934);
        setField(term10327, term10327.getClass(), "time", term10332);
        setField(term10311, term10311.getClass(), "registerTime", term10327);
        setIntField(term10338, term10338.getClass(), "year", 2011);
        setShortField(term10338, term10338.getClass(), "month", (short) 10);
        setShortField(term10338, term10338.getClass(), "day", (short) 25);
        setField(term10337, term10337.getClass(), "date", term10338);
        setByteField(term10342, term10342.getClass(), "hour", (byte) 10);
        setByteField(term10342, term10342.getClass(), "minute", (byte) 33);
        setByteField(term10342, term10342.getClass(), "second", (byte) 8);
        setIntField(term10342, term10342.getClass(), "nano", 268304014);
        setField(term10337, term10337.getClass(), "time", term10342);
        setField(term10311, term10311.getClass(), "accessTime", term10337);
        setField(term10309, term10309.getClass(), "card", term10311);
        setField(term10309, term10309.getClass(), "userName", "MgLCedQfoj");
        setIntField(term10309, term10309.getClass(), "level", -146564963);
        setIntField(term10309, term10309.getClass(), "reincarnationNum", -83178716);
        setLongField(term10309, term10309.getClass(), "exp", -7370364068296402536L);
        setLongField(term10309, term10309.getClass(), "point", -1084263688306617320L);
        setLongField(term10309, term10309.getClass(), "totalPoint", 1193381106528373019L);
        setIntField(term10309, term10309.getClass(), "playCount", -1292704466);
        setIntField(term10309, term10309.getClass(), "jewelCount", 1991858584);
        setIntField(term10309, term10309.getClass(), "totalJewelCount", -1300947782);
        setIntField(term10309, term10309.getClass(), "medalCount", 188512644);
        setIntField(term10309, term10309.getClass(), "playerRating", 1851127634);
        setIntField(term10309, term10309.getClass(), "highestRating", 783730213);
        setIntField(term10309, term10309.getClass(), "battlePoint", 1815951606);
        setIntField(term10309, term10309.getClass(), "bestBattlePoint", 1105016932);
        setIntField(term10309, term10309.getClass(), "overDamageBattlePoint", -365784998);
        setBooleanField(term10309, term10309.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term10309, term10309.getClass(), "nameplateId", -1893236300);
        setIntField(term10309, term10309.getClass(), "trophyId", -1858909368);
        setIntField(term10309, term10309.getClass(), "cardId", -280113263);
        setIntField(term10309, term10309.getClass(), "characterId", 529625347);
        setIntField(term10309, term10309.getClass(), "characterVoiceNo", 1409095253);
        setIntField(term10309, term10309.getClass(), "tabSetting", 315179039);
        setIntField(term10309, term10309.getClass(), "tabSortSetting", -1835923897);
        setIntField(term10309, term10309.getClass(), "cardCategorySetting", -341287775);
        setIntField(term10309, term10309.getClass(), "cardSortSetting", -1651110911);
        setIntField(term10309, term10309.getClass(), "rivalScoreCategorySetting", -1934033808);
        setIntField(term10309, term10309.getClass(), "playedTutorialBit", 950322609);
        setIntField(term10309, term10309.getClass(), "firstTutorialCancelNum", -2023791789);
        setLongField(term10309, term10309.getClass(), "sumTechHighScore", -1365372122034008688L);
        setLongField(term10309, term10309.getClass(), "sumTechBasicHighScore", -6108006981756732593L);
        setLongField(term10309, term10309.getClass(), "sumTechAdvancedHighScore", -3565554762799701668L);
        setLongField(term10309, term10309.getClass(), "sumTechExpertHighScore", -6837989212848250735L);
        setLongField(term10309, term10309.getClass(), "sumTechMasterHighScore", -4231979631084175364L);
        setLongField(term10309, term10309.getClass(), "sumTechLunaticHighScore", 1634166935474035772L);
        setLongField(term10309, term10309.getClass(), "sumBattleHighScore", -2614906266506360948L);
        setLongField(term10309, term10309.getClass(), "sumBattleBasicHighScore", 1133267598258375793L);
        setLongField(term10309, term10309.getClass(), "sumBattleAdvancedHighScore", 2990264647913003810L);
        setLongField(term10309, term10309.getClass(), "sumBattleExpertHighScore", -2195794659127490022L);
        setLongField(term10309, term10309.getClass(), "sumBattleMasterHighScore", 6142089107139955834L);
        setLongField(term10309, term10309.getClass(), "sumBattleLunaticHighScore", -7506365302323354325L);
        setField(term10309, term10309.getClass(), "eventWatchedDate", "zgKiINdgNu");
        setField(term10309, term10309.getClass(), "cmEventWatchedDate", "zLMTXDQHYH");
        setField(term10309, term10309.getClass(), "firstGameId", "PqywFWJlpE");
        setField(term10309, term10309.getClass(), "firstRomVersion", "OzXRsFGTIp");
        setField(term10309, term10309.getClass(), "firstDataVersion", "TjWpyghUWN");
        setField(term10309, term10309.getClass(), "firstPlayDate", "dkZFDZxcde");
        setField(term10309, term10309.getClass(), "lastGameId", "WXcZEtUKlI");
        setField(term10309, term10309.getClass(), "lastRomVersion", "IkpjUOuWQU");
        setField(term10309, term10309.getClass(), "lastDataVersion", "boSSpezHeU");
        setField(term10309, term10309.getClass(), "compatibleCmVersion", "OUeBWNTQDh");
        setField(term10309, term10309.getClass(), "lastPlayDate", "gltJarNuUk");
        setIntField(term10309, term10309.getClass(), "lastPlaceId", 353974456);
        setField(term10309, term10309.getClass(), "lastPlaceName", "ZwZIDwYcSW");
        setIntField(term10309, term10309.getClass(), "lastRegionId", -485108462);
        setField(term10309, term10309.getClass(), "lastRegionName", "sOdkipUKRu");
        setIntField(term10309, term10309.getClass(), "lastAllNetId", 1418551216);
        setField(term10309, term10309.getClass(), "lastClientId", "oKwCDqywym");
        setIntField(term10309, term10309.getClass(), "lastUsedDeckId", -626779272);
        setIntField(term10309, term10309.getClass(), "lastPlayMusicLevel", -1150062870);
        setIntField(term10309, term10309.getClass(), "lastEmoneyBrand", -886200503);
        setField(term10307, term10307.getClass(), "user", term10309);
        setIntField(term10307, term10307.getClass(), "eventId", 1136393691);
        setLongField(term10307, term10307.getClass(), "point", -4693900822622913579L);
        term10574 = new Long(-997945615782059734L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMissionPoint");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term10574;
        callMethod(klass, "setPoint", argTypes, term10307, args);
    }

};


