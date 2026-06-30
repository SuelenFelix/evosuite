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

public class UserData_getLastPlayDate_190304995352 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43914;

    public UserData_getLastPlayDate_190304995352() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term43918 = new Long(-1832940336320585644L);
        term43914 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term43916 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term43932 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term43933 = newInstance(Class.forName("java.time.LocalDate"));
        Object term43937 = newInstance(Class.forName("java.time.LocalTime"));
        Object term43942 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term43943 = newInstance(Class.forName("java.time.LocalDate"));
        Object term43947 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term43914, term43914.getClass(), "id", 3396057794430157389L);
        setLongField(term43916, term43916.getClass(), "id", -419363521580148942L);
        setField(term43916, term43916.getClass(), "extId", term43918);
        setField(term43916, term43916.getClass(), "luid", "eNOEXYoAtV");
        setIntField(term43933, term43933.getClass(), "year", 2013);
        setShortField(term43933, term43933.getClass(), "month", (short) 1);
        setShortField(term43933, term43933.getClass(), "day", (short) 17);
        setField(term43932, term43932.getClass(), "date", term43933);
        setByteField(term43937, term43937.getClass(), "hour", (byte) 19);
        setByteField(term43937, term43937.getClass(), "minute", (byte) 49);
        setByteField(term43937, term43937.getClass(), "second", (byte) 53);
        setIntField(term43937, term43937.getClass(), "nano", 217542739);
        setField(term43932, term43932.getClass(), "time", term43937);
        setField(term43916, term43916.getClass(), "registerTime", term43932);
        setIntField(term43943, term43943.getClass(), "year", 2025);
        setShortField(term43943, term43943.getClass(), "month", (short) 8);
        setShortField(term43943, term43943.getClass(), "day", (short) 8);
        setField(term43942, term43942.getClass(), "date", term43943);
        setByteField(term43947, term43947.getClass(), "hour", (byte) 12);
        setByteField(term43947, term43947.getClass(), "minute", (byte) 29);
        setByteField(term43947, term43947.getClass(), "second", (byte) 36);
        setIntField(term43947, term43947.getClass(), "nano", 329488602);
        setField(term43942, term43942.getClass(), "time", term43947);
        setField(term43916, term43916.getClass(), "accessTime", term43942);
        setField(term43914, term43914.getClass(), "card", term43916);
        setField(term43914, term43914.getClass(), "userName", "SNqwfZGLFh");
        setIntField(term43914, term43914.getClass(), "level", 2042788478);
        setIntField(term43914, term43914.getClass(), "reincarnationNum", -620591021);
        setLongField(term43914, term43914.getClass(), "exp", 7635276988377158212L);
        setLongField(term43914, term43914.getClass(), "point", -5040671346926017489L);
        setLongField(term43914, term43914.getClass(), "totalPoint", -8525585238233113814L);
        setIntField(term43914, term43914.getClass(), "playCount", -766656824);
        setIntField(term43914, term43914.getClass(), "jewelCount", 137514813);
        setIntField(term43914, term43914.getClass(), "totalJewelCount", -590298353);
        setIntField(term43914, term43914.getClass(), "medalCount", -917544425);
        setIntField(term43914, term43914.getClass(), "playerRating", -1044762733);
        setIntField(term43914, term43914.getClass(), "highestRating", 446184231);
        setIntField(term43914, term43914.getClass(), "battlePoint", 1313599240);
        setIntField(term43914, term43914.getClass(), "bestBattlePoint", 1889501733);
        setIntField(term43914, term43914.getClass(), "overDamageBattlePoint", 1316243148);
        setBooleanField(term43914, term43914.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term43914, term43914.getClass(), "nameplateId", 1524913540);
        setIntField(term43914, term43914.getClass(), "trophyId", -1924743705);
        setIntField(term43914, term43914.getClass(), "cardId", -1829672767);
        setIntField(term43914, term43914.getClass(), "characterId", -311098933);
        setIntField(term43914, term43914.getClass(), "characterVoiceNo", -1778687889);
        setIntField(term43914, term43914.getClass(), "tabSetting", -1827662352);
        setIntField(term43914, term43914.getClass(), "tabSortSetting", -1292290537);
        setIntField(term43914, term43914.getClass(), "cardCategorySetting", 1060963259);
        setIntField(term43914, term43914.getClass(), "cardSortSetting", -1275604693);
        setIntField(term43914, term43914.getClass(), "rivalScoreCategorySetting", 455869012);
        setIntField(term43914, term43914.getClass(), "playedTutorialBit", 782841747);
        setIntField(term43914, term43914.getClass(), "firstTutorialCancelNum", 744634969);
        setLongField(term43914, term43914.getClass(), "sumTechHighScore", -3955508582186061944L);
        setLongField(term43914, term43914.getClass(), "sumTechBasicHighScore", -7986118407298160731L);
        setLongField(term43914, term43914.getClass(), "sumTechAdvancedHighScore", 6721721782435142809L);
        setLongField(term43914, term43914.getClass(), "sumTechExpertHighScore", -8413391289081836699L);
        setLongField(term43914, term43914.getClass(), "sumTechMasterHighScore", -4569299590968645007L);
        setLongField(term43914, term43914.getClass(), "sumTechLunaticHighScore", -4026624946106334837L);
        setLongField(term43914, term43914.getClass(), "sumBattleHighScore", 3465513040115241688L);
        setLongField(term43914, term43914.getClass(), "sumBattleBasicHighScore", 5260379851065937225L);
        setLongField(term43914, term43914.getClass(), "sumBattleAdvancedHighScore", -358904349595052653L);
        setLongField(term43914, term43914.getClass(), "sumBattleExpertHighScore", -6117082530291957563L);
        setLongField(term43914, term43914.getClass(), "sumBattleMasterHighScore", 8605580628003894246L);
        setLongField(term43914, term43914.getClass(), "sumBattleLunaticHighScore", 2742759719072632386L);
        setField(term43914, term43914.getClass(), "eventWatchedDate", "sMqpXbgEga");
        setField(term43914, term43914.getClass(), "cmEventWatchedDate", "nYJlDpoMcL");
        setField(term43914, term43914.getClass(), "firstGameId", "SQnbnBmbcf");
        setField(term43914, term43914.getClass(), "firstRomVersion", "jaNVteZrZi");
        setField(term43914, term43914.getClass(), "firstDataVersion", "bMRkDiPUGu");
        setField(term43914, term43914.getClass(), "firstPlayDate", "xjKxECGyLT");
        setField(term43914, term43914.getClass(), "lastGameId", "ffKeJGEXBT");
        setField(term43914, term43914.getClass(), "lastRomVersion", "rsnXTpfhqf");
        setField(term43914, term43914.getClass(), "lastDataVersion", "gzvlGZVfnZ");
        setField(term43914, term43914.getClass(), "compatibleCmVersion", "rmSqCaXWHi");
        setField(term43914, term43914.getClass(), "lastPlayDate", "ScztqspySK");
        setIntField(term43914, term43914.getClass(), "lastPlaceId", -13561953);
        setField(term43914, term43914.getClass(), "lastPlaceName", "IvYxGwWoVu");
        setIntField(term43914, term43914.getClass(), "lastRegionId", 2069622671);
        setField(term43914, term43914.getClass(), "lastRegionName", "XnZHOhTfxL");
        setIntField(term43914, term43914.getClass(), "lastAllNetId", 86341231);
        setField(term43914, term43914.getClass(), "lastClientId", "oFBhNamtAs");
        setIntField(term43914, term43914.getClass(), "lastUsedDeckId", -926119173);
        setIntField(term43914, term43914.getClass(), "lastPlayMusicLevel", 1613936898);
        setIntField(term43914, term43914.getClass(), "lastEmoneyBrand", -406599151);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastPlayDate", argTypes, term43914, args);
    }

};


