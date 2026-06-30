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
import java.lang.Boolean;

public class UserChapter_setStoryWatched_87350433019 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term91870;
     Object term92144;

    public UserChapter_setStoryWatched_87350433019() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term91876 = new Long(8540994973773607992L);
        term91870 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserChapter"));
        Object term91872 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term91874 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term91890 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term91891 = newInstance(Class.forName("java.time.LocalDate"));
        Object term91895 = newInstance(Class.forName("java.time.LocalTime"));
        Object term91900 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term91901 = newInstance(Class.forName("java.time.LocalDate"));
        Object term91905 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term91870, term91870.getClass(), "id", -3051425144031943154L);
        setLongField(term91872, term91872.getClass(), "id", -2805023601494962378L);
        setLongField(term91874, term91874.getClass(), "id", -8047350216025705777L);
        setField(term91874, term91874.getClass(), "extId", term91876);
        setField(term91874, term91874.getClass(), "luid", "JPgLQWnVaG");
        setIntField(term91891, term91891.getClass(), "year", 2020);
        setShortField(term91891, term91891.getClass(), "month", (short) 2);
        setShortField(term91891, term91891.getClass(), "day", (short) 22);
        setField(term91890, term91890.getClass(), "date", term91891);
        setByteField(term91895, term91895.getClass(), "hour", (byte) 5);
        setByteField(term91895, term91895.getClass(), "minute", (byte) 45);
        setByteField(term91895, term91895.getClass(), "second", (byte) 53);
        setIntField(term91895, term91895.getClass(), "nano", 933056720);
        setField(term91890, term91890.getClass(), "time", term91895);
        setField(term91874, term91874.getClass(), "registerTime", term91890);
        setIntField(term91901, term91901.getClass(), "year", 2012);
        setShortField(term91901, term91901.getClass(), "month", (short) 11);
        setShortField(term91901, term91901.getClass(), "day", (short) 26);
        setField(term91900, term91900.getClass(), "date", term91901);
        setByteField(term91905, term91905.getClass(), "hour", (byte) 23);
        setByteField(term91905, term91905.getClass(), "minute", (byte) 32);
        setByteField(term91905, term91905.getClass(), "second", (byte) 25);
        setIntField(term91905, term91905.getClass(), "nano", 47326173);
        setField(term91900, term91900.getClass(), "time", term91905);
        setField(term91874, term91874.getClass(), "accessTime", term91900);
        setField(term91872, term91872.getClass(), "card", term91874);
        setField(term91872, term91872.getClass(), "userName", "IOLqavRFIA");
        setIntField(term91872, term91872.getClass(), "level", 1671774860);
        setIntField(term91872, term91872.getClass(), "reincarnationNum", -1376241623);
        setLongField(term91872, term91872.getClass(), "exp", -307530754220207890L);
        setLongField(term91872, term91872.getClass(), "point", 903870994450397235L);
        setLongField(term91872, term91872.getClass(), "totalPoint", -507882494111971435L);
        setIntField(term91872, term91872.getClass(), "playCount", -949624433);
        setIntField(term91872, term91872.getClass(), "jewelCount", 757298168);
        setIntField(term91872, term91872.getClass(), "totalJewelCount", 1392304956);
        setIntField(term91872, term91872.getClass(), "medalCount", -51203093);
        setIntField(term91872, term91872.getClass(), "playerRating", 950494826);
        setIntField(term91872, term91872.getClass(), "highestRating", 364244181);
        setIntField(term91872, term91872.getClass(), "battlePoint", -181128819);
        setIntField(term91872, term91872.getClass(), "bestBattlePoint", 1578870716);
        setIntField(term91872, term91872.getClass(), "overDamageBattlePoint", 170089904);
        setBooleanField(term91872, term91872.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term91872, term91872.getClass(), "nameplateId", 1115214841);
        setIntField(term91872, term91872.getClass(), "trophyId", -161656545);
        setIntField(term91872, term91872.getClass(), "cardId", 1569649652);
        setIntField(term91872, term91872.getClass(), "characterId", 1224092165);
        setIntField(term91872, term91872.getClass(), "characterVoiceNo", 286266173);
        setIntField(term91872, term91872.getClass(), "tabSetting", 524985992);
        setIntField(term91872, term91872.getClass(), "tabSortSetting", 1329035477);
        setIntField(term91872, term91872.getClass(), "cardCategorySetting", 479749926);
        setIntField(term91872, term91872.getClass(), "cardSortSetting", -23214369);
        setIntField(term91872, term91872.getClass(), "rivalScoreCategorySetting", 1687480678);
        setIntField(term91872, term91872.getClass(), "playedTutorialBit", 722649363);
        setIntField(term91872, term91872.getClass(), "firstTutorialCancelNum", 76618777);
        setLongField(term91872, term91872.getClass(), "sumTechHighScore", -1637303739632886364L);
        setLongField(term91872, term91872.getClass(), "sumTechBasicHighScore", -1091026600020065841L);
        setLongField(term91872, term91872.getClass(), "sumTechAdvancedHighScore", -283146496512849751L);
        setLongField(term91872, term91872.getClass(), "sumTechExpertHighScore", 4232818761285083732L);
        setLongField(term91872, term91872.getClass(), "sumTechMasterHighScore", -4554130551331636632L);
        setLongField(term91872, term91872.getClass(), "sumTechLunaticHighScore", 1142848901389558554L);
        setLongField(term91872, term91872.getClass(), "sumBattleHighScore", -8765880532269366931L);
        setLongField(term91872, term91872.getClass(), "sumBattleBasicHighScore", 2031577096594269874L);
        setLongField(term91872, term91872.getClass(), "sumBattleAdvancedHighScore", 851269462212379561L);
        setLongField(term91872, term91872.getClass(), "sumBattleExpertHighScore", -3023642624075318286L);
        setLongField(term91872, term91872.getClass(), "sumBattleMasterHighScore", 5754464717374858428L);
        setLongField(term91872, term91872.getClass(), "sumBattleLunaticHighScore", 1769538929299224531L);
        setField(term91872, term91872.getClass(), "eventWatchedDate", "FpmxstceWP");
        setField(term91872, term91872.getClass(), "cmEventWatchedDate", "JhehNkztDU");
        setField(term91872, term91872.getClass(), "firstGameId", "axzwQpwfps");
        setField(term91872, term91872.getClass(), "firstRomVersion", "SRphuuiFTJ");
        setField(term91872, term91872.getClass(), "firstDataVersion", "SLJslBhpEj");
        setField(term91872, term91872.getClass(), "firstPlayDate", "BkSzKYsyMt");
        setField(term91872, term91872.getClass(), "lastGameId", "BehEjNaXVK");
        setField(term91872, term91872.getClass(), "lastRomVersion", "TrunCyrewP");
        setField(term91872, term91872.getClass(), "lastDataVersion", "NGQmiHNyCj");
        setField(term91872, term91872.getClass(), "compatibleCmVersion", "fJerFGYlGC");
        setField(term91872, term91872.getClass(), "lastPlayDate", "CvltyVwJfx");
        setIntField(term91872, term91872.getClass(), "lastPlaceId", 1705792936);
        setField(term91872, term91872.getClass(), "lastPlaceName", "aKQcZIBmMO");
        setIntField(term91872, term91872.getClass(), "lastRegionId", -1909996617);
        setField(term91872, term91872.getClass(), "lastRegionName", "izEIjACTdh");
        setIntField(term91872, term91872.getClass(), "lastAllNetId", -190426986);
        setField(term91872, term91872.getClass(), "lastClientId", "FBpdKznMSt");
        setIntField(term91872, term91872.getClass(), "lastUsedDeckId", -555983707);
        setIntField(term91872, term91872.getClass(), "lastPlayMusicLevel", -606116015);
        setIntField(term91872, term91872.getClass(), "lastEmoneyBrand", -181890457);
        setField(term91870, term91870.getClass(), "user", term91872);
        setIntField(term91870, term91870.getClass(), "chapterId", -944465027);
        setIntField(term91870, term91870.getClass(), "jewelCount", 378932740);
        setIntField(term91870, term91870.getClass(), "lastPlayMusicCategory", -346858205);
        setIntField(term91870, term91870.getClass(), "lastPlayMusicId", -1490019542);
        setIntField(term91870, term91870.getClass(), "lastPlayMusicLevel", 681306470);
        setBooleanField(term91870, term91870.getClass(), "isStoryWatched", true);
        setBooleanField(term91870, term91870.getClass(), "isClear", true);
        setIntField(term91870, term91870.getClass(), "skipTiming1", -1757429033);
        setIntField(term91870, term91870.getClass(), "skipTiming2", -941018916);
        term92144 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserChapter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term92144;
        callMethod(klass, "setStoryWatched", argTypes, term91870, args);
    }

};


