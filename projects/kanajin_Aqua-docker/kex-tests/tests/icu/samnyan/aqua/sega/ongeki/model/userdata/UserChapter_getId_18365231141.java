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

public class UserChapter_getId_18365231141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83623;

    public UserChapter_getId_18365231141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term83629 = new Long(3090901538358721367L);
        term83623 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserChapter"));
        Object term83625 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term83627 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term83643 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term83644 = newInstance(Class.forName("java.time.LocalDate"));
        Object term83648 = newInstance(Class.forName("java.time.LocalTime"));
        Object term83653 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term83654 = newInstance(Class.forName("java.time.LocalDate"));
        Object term83658 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term83623, term83623.getClass(), "id", 6610508350585809711L);
        setLongField(term83625, term83625.getClass(), "id", -8793140099009782071L);
        setLongField(term83627, term83627.getClass(), "id", 6032322064040415926L);
        setField(term83627, term83627.getClass(), "extId", term83629);
        setField(term83627, term83627.getClass(), "luid", "ChmRdUmCnQ");
        setIntField(term83644, term83644.getClass(), "year", 2029);
        setShortField(term83644, term83644.getClass(), "month", (short) 1);
        setShortField(term83644, term83644.getClass(), "day", (short) 15);
        setField(term83643, term83643.getClass(), "date", term83644);
        setByteField(term83648, term83648.getClass(), "hour", (byte) 1);
        setByteField(term83648, term83648.getClass(), "minute", (byte) 39);
        setByteField(term83648, term83648.getClass(), "second", (byte) 40);
        setIntField(term83648, term83648.getClass(), "nano", 99482694);
        setField(term83643, term83643.getClass(), "time", term83648);
        setField(term83627, term83627.getClass(), "registerTime", term83643);
        setIntField(term83654, term83654.getClass(), "year", 2025);
        setShortField(term83654, term83654.getClass(), "month", (short) 2);
        setShortField(term83654, term83654.getClass(), "day", (short) 11);
        setField(term83653, term83653.getClass(), "date", term83654);
        setByteField(term83658, term83658.getClass(), "hour", (byte) 15);
        setByteField(term83658, term83658.getClass(), "minute", (byte) 46);
        setByteField(term83658, term83658.getClass(), "second", (byte) 31);
        setIntField(term83658, term83658.getClass(), "nano", 989587730);
        setField(term83653, term83653.getClass(), "time", term83658);
        setField(term83627, term83627.getClass(), "accessTime", term83653);
        setField(term83625, term83625.getClass(), "card", term83627);
        setField(term83625, term83625.getClass(), "userName", "WbDSdFiKLp");
        setIntField(term83625, term83625.getClass(), "level", -2040263086);
        setIntField(term83625, term83625.getClass(), "reincarnationNum", -1917411490);
        setLongField(term83625, term83625.getClass(), "exp", -4408222906457582842L);
        setLongField(term83625, term83625.getClass(), "point", 7298722086104684L);
        setLongField(term83625, term83625.getClass(), "totalPoint", -4391657012610556206L);
        setIntField(term83625, term83625.getClass(), "playCount", -335301241);
        setIntField(term83625, term83625.getClass(), "jewelCount", 911548156);
        setIntField(term83625, term83625.getClass(), "totalJewelCount", -185022670);
        setIntField(term83625, term83625.getClass(), "medalCount", -761249284);
        setIntField(term83625, term83625.getClass(), "playerRating", 1921491694);
        setIntField(term83625, term83625.getClass(), "highestRating", -187830634);
        setIntField(term83625, term83625.getClass(), "battlePoint", 1691791355);
        setIntField(term83625, term83625.getClass(), "bestBattlePoint", -1331748165);
        setIntField(term83625, term83625.getClass(), "overDamageBattlePoint", 1369016583);
        setBooleanField(term83625, term83625.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term83625, term83625.getClass(), "nameplateId", 2033476845);
        setIntField(term83625, term83625.getClass(), "trophyId", 463965810);
        setIntField(term83625, term83625.getClass(), "cardId", 970217905);
        setIntField(term83625, term83625.getClass(), "characterId", -486492381);
        setIntField(term83625, term83625.getClass(), "characterVoiceNo", 30517520);
        setIntField(term83625, term83625.getClass(), "tabSetting", 1096518455);
        setIntField(term83625, term83625.getClass(), "tabSortSetting", -1731653174);
        setIntField(term83625, term83625.getClass(), "cardCategorySetting", 1249351936);
        setIntField(term83625, term83625.getClass(), "cardSortSetting", 1731404822);
        setIntField(term83625, term83625.getClass(), "rivalScoreCategorySetting", -877806535);
        setIntField(term83625, term83625.getClass(), "playedTutorialBit", -1489914829);
        setIntField(term83625, term83625.getClass(), "firstTutorialCancelNum", -1208940453);
        setLongField(term83625, term83625.getClass(), "sumTechHighScore", 4233874350901096997L);
        setLongField(term83625, term83625.getClass(), "sumTechBasicHighScore", 4153899405411550335L);
        setLongField(term83625, term83625.getClass(), "sumTechAdvancedHighScore", 3959114672373605667L);
        setLongField(term83625, term83625.getClass(), "sumTechExpertHighScore", 1102968285448626659L);
        setLongField(term83625, term83625.getClass(), "sumTechMasterHighScore", 6853911867658043615L);
        setLongField(term83625, term83625.getClass(), "sumTechLunaticHighScore", 1320878772738094792L);
        setLongField(term83625, term83625.getClass(), "sumBattleHighScore", 6709908432613210121L);
        setLongField(term83625, term83625.getClass(), "sumBattleBasicHighScore", -8496380081001714297L);
        setLongField(term83625, term83625.getClass(), "sumBattleAdvancedHighScore", -5796471103228499506L);
        setLongField(term83625, term83625.getClass(), "sumBattleExpertHighScore", -8448744088477595154L);
        setLongField(term83625, term83625.getClass(), "sumBattleMasterHighScore", 5936677913610437976L);
        setLongField(term83625, term83625.getClass(), "sumBattleLunaticHighScore", -7717851618699599254L);
        setField(term83625, term83625.getClass(), "eventWatchedDate", "DNeKwjPiYD");
        setField(term83625, term83625.getClass(), "cmEventWatchedDate", "jxryzEuKJL");
        setField(term83625, term83625.getClass(), "firstGameId", "EPCordSkfF");
        setField(term83625, term83625.getClass(), "firstRomVersion", "TdSezgsZkW");
        setField(term83625, term83625.getClass(), "firstDataVersion", "aJlxWEbXVP");
        setField(term83625, term83625.getClass(), "firstPlayDate", "pxpYGruvWy");
        setField(term83625, term83625.getClass(), "lastGameId", "BMskFMPoeb");
        setField(term83625, term83625.getClass(), "lastRomVersion", "LdfzgJfEqK");
        setField(term83625, term83625.getClass(), "lastDataVersion", "YdzBhsGATX");
        setField(term83625, term83625.getClass(), "compatibleCmVersion", "IxrOGCWNvM");
        setField(term83625, term83625.getClass(), "lastPlayDate", "ixwssTuJbB");
        setIntField(term83625, term83625.getClass(), "lastPlaceId", 661206297);
        setField(term83625, term83625.getClass(), "lastPlaceName", "IXdiuaFyFC");
        setIntField(term83625, term83625.getClass(), "lastRegionId", 155345516);
        setField(term83625, term83625.getClass(), "lastRegionName", "CLVzSrhOjS");
        setIntField(term83625, term83625.getClass(), "lastAllNetId", 1328408059);
        setField(term83625, term83625.getClass(), "lastClientId", "OrrgHDCMip");
        setIntField(term83625, term83625.getClass(), "lastUsedDeckId", 1491641290);
        setIntField(term83625, term83625.getClass(), "lastPlayMusicLevel", 917414277);
        setIntField(term83625, term83625.getClass(), "lastEmoneyBrand", 1585368761);
        setField(term83623, term83623.getClass(), "user", term83625);
        setIntField(term83623, term83623.getClass(), "chapterId", -1814545416);
        setIntField(term83623, term83623.getClass(), "jewelCount", -1486799161);
        setIntField(term83623, term83623.getClass(), "lastPlayMusicCategory", -455064174);
        setIntField(term83623, term83623.getClass(), "lastPlayMusicId", -1278860746);
        setIntField(term83623, term83623.getClass(), "lastPlayMusicLevel", 1573046503);
        setBooleanField(term83623, term83623.getClass(), "isStoryWatched", true);
        setBooleanField(term83623, term83623.getClass(), "isClear", false);
        setIntField(term83623, term83623.getClass(), "skipTiming1", -1546535153);
        setIntField(term83623, term83623.getClass(), "skipTiming2", 933284110);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserChapter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term83623, args);
    }

};


