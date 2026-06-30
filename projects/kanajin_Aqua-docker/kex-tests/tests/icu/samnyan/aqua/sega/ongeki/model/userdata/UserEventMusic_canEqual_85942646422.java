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

public class UserEventMusic_canEqual_85942646422 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term379474;
     Object term379758;

    public UserEventMusic_canEqual_85942646422() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term379480 = new Long(5885163998873132588L);
        term379474 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserEventMusic"));
        Object term379476 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term379478 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term379494 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term379495 = newInstance(Class.forName("java.time.LocalDate"));
        Object term379499 = newInstance(Class.forName("java.time.LocalTime"));
        Object term379504 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term379505 = newInstance(Class.forName("java.time.LocalDate"));
        Object term379509 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term379474, term379474.getClass(), "id", 2166516580522292542L);
        setLongField(term379476, term379476.getClass(), "id", 5145588788434421537L);
        setLongField(term379478, term379478.getClass(), "id", 8304594912179378476L);
        setField(term379478, term379478.getClass(), "extId", term379480);
        setField(term379478, term379478.getClass(), "luid", "WQqJkQNpny");
        setIntField(term379495, term379495.getClass(), "year", 2029);
        setShortField(term379495, term379495.getClass(), "month", (short) 4);
        setShortField(term379495, term379495.getClass(), "day", (short) 2);
        setField(term379494, term379494.getClass(), "date", term379495);
        setByteField(term379499, term379499.getClass(), "hour", (byte) 0);
        setByteField(term379499, term379499.getClass(), "minute", (byte) 17);
        setByteField(term379499, term379499.getClass(), "second", (byte) 49);
        setIntField(term379499, term379499.getClass(), "nano", 285006166);
        setField(term379494, term379494.getClass(), "time", term379499);
        setField(term379478, term379478.getClass(), "registerTime", term379494);
        setIntField(term379505, term379505.getClass(), "year", 2012);
        setShortField(term379505, term379505.getClass(), "month", (short) 6);
        setShortField(term379505, term379505.getClass(), "day", (short) 12);
        setField(term379504, term379504.getClass(), "date", term379505);
        setByteField(term379509, term379509.getClass(), "hour", (byte) 0);
        setByteField(term379509, term379509.getClass(), "minute", (byte) 47);
        setByteField(term379509, term379509.getClass(), "second", (byte) 35);
        setIntField(term379509, term379509.getClass(), "nano", 111700489);
        setField(term379504, term379504.getClass(), "time", term379509);
        setField(term379478, term379478.getClass(), "accessTime", term379504);
        setField(term379476, term379476.getClass(), "card", term379478);
        setField(term379476, term379476.getClass(), "userName", "ROIsepQHAA");
        setIntField(term379476, term379476.getClass(), "level", -1911892286);
        setIntField(term379476, term379476.getClass(), "reincarnationNum", 763022141);
        setLongField(term379476, term379476.getClass(), "exp", 673836944728222713L);
        setLongField(term379476, term379476.getClass(), "point", 9096006081385526421L);
        setLongField(term379476, term379476.getClass(), "totalPoint", 6971305382398128768L);
        setIntField(term379476, term379476.getClass(), "playCount", -1569221794);
        setIntField(term379476, term379476.getClass(), "jewelCount", 2113009425);
        setIntField(term379476, term379476.getClass(), "totalJewelCount", -1009736585);
        setIntField(term379476, term379476.getClass(), "medalCount", 67570822);
        setIntField(term379476, term379476.getClass(), "playerRating", 891421952);
        setIntField(term379476, term379476.getClass(), "highestRating", -532312548);
        setIntField(term379476, term379476.getClass(), "battlePoint", -1299216105);
        setIntField(term379476, term379476.getClass(), "bestBattlePoint", 768256023);
        setIntField(term379476, term379476.getClass(), "overDamageBattlePoint", -1712430850);
        setBooleanField(term379476, term379476.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term379476, term379476.getClass(), "nameplateId", 1974693268);
        setIntField(term379476, term379476.getClass(), "trophyId", 1146439897);
        setIntField(term379476, term379476.getClass(), "cardId", 696414347);
        setIntField(term379476, term379476.getClass(), "characterId", -637942741);
        setIntField(term379476, term379476.getClass(), "characterVoiceNo", -1519940182);
        setIntField(term379476, term379476.getClass(), "tabSetting", -881040839);
        setIntField(term379476, term379476.getClass(), "tabSortSetting", -1305172504);
        setIntField(term379476, term379476.getClass(), "cardCategorySetting", 75002024);
        setIntField(term379476, term379476.getClass(), "cardSortSetting", 2003428157);
        setIntField(term379476, term379476.getClass(), "rivalScoreCategorySetting", 1818936350);
        setIntField(term379476, term379476.getClass(), "playedTutorialBit", 1043913455);
        setIntField(term379476, term379476.getClass(), "firstTutorialCancelNum", -1634997589);
        setLongField(term379476, term379476.getClass(), "sumTechHighScore", 5374299751880397446L);
        setLongField(term379476, term379476.getClass(), "sumTechBasicHighScore", 8801394421501731816L);
        setLongField(term379476, term379476.getClass(), "sumTechAdvancedHighScore", 8014779158792316789L);
        setLongField(term379476, term379476.getClass(), "sumTechExpertHighScore", 5086144052611083383L);
        setLongField(term379476, term379476.getClass(), "sumTechMasterHighScore", -396436355841272408L);
        setLongField(term379476, term379476.getClass(), "sumTechLunaticHighScore", 3173070840653254794L);
        setLongField(term379476, term379476.getClass(), "sumBattleHighScore", -5433820621629238314L);
        setLongField(term379476, term379476.getClass(), "sumBattleBasicHighScore", 6845472835417026012L);
        setLongField(term379476, term379476.getClass(), "sumBattleAdvancedHighScore", 8684701146957322766L);
        setLongField(term379476, term379476.getClass(), "sumBattleExpertHighScore", 5959775560220511496L);
        setLongField(term379476, term379476.getClass(), "sumBattleMasterHighScore", 1447962097056970967L);
        setLongField(term379476, term379476.getClass(), "sumBattleLunaticHighScore", -7838538790729250996L);
        setField(term379476, term379476.getClass(), "eventWatchedDate", "kkYDHznTak");
        setField(term379476, term379476.getClass(), "cmEventWatchedDate", "jyEoZRPUuE");
        setField(term379476, term379476.getClass(), "firstGameId", "vhlWqnjZqT");
        setField(term379476, term379476.getClass(), "firstRomVersion", "bNARBCCQim");
        setField(term379476, term379476.getClass(), "firstDataVersion", "IUNYmythma");
        setField(term379476, term379476.getClass(), "firstPlayDate", "sMZrsZlNQZ");
        setField(term379476, term379476.getClass(), "lastGameId", "bQqeeCglIt");
        setField(term379476, term379476.getClass(), "lastRomVersion", "eZQGfGuyjn");
        setField(term379476, term379476.getClass(), "lastDataVersion", "wzlnektawT");
        setField(term379476, term379476.getClass(), "compatibleCmVersion", "TkfMUqKrVs");
        setField(term379476, term379476.getClass(), "lastPlayDate", "nrRAnhPOLE");
        setIntField(term379476, term379476.getClass(), "lastPlaceId", 223393607);
        setField(term379476, term379476.getClass(), "lastPlaceName", "KWOGOjMRVh");
        setIntField(term379476, term379476.getClass(), "lastRegionId", -217890242);
        setField(term379476, term379476.getClass(), "lastRegionName", "AZCNGxdxrF");
        setIntField(term379476, term379476.getClass(), "lastAllNetId", -750232652);
        setField(term379476, term379476.getClass(), "lastClientId", "QjuKOcxuCu");
        setIntField(term379476, term379476.getClass(), "lastUsedDeckId", -1831363199);
        setIntField(term379476, term379476.getClass(), "lastPlayMusicLevel", -931364454);
        setIntField(term379476, term379476.getClass(), "lastEmoneyBrand", -1768985663);
        setField(term379474, term379474.getClass(), "user", term379476);
        setIntField(term379474, term379474.getClass(), "eventId", -1625953936);
        setIntField(term379474, term379474.getClass(), "type", 2085375189);
        setIntField(term379474, term379474.getClass(), "musicId", 1294613197);
        setIntField(term379474, term379474.getClass(), "level", -484595676);
        setIntField(term379474, term379474.getClass(), "techScoreMax", 1015340949);
        setIntField(term379474, term379474.getClass(), "platinumScoreMax", 811783730);
        setField(term379474, term379474.getClass(), "techRecordDate", "RAHHfUndRU");
        setBooleanField(term379474, term379474.getClass(), "isTechNewRecord", false);
        term379758 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserEventMusic");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term379758;
        callMethod(klass, "canEqual", argTypes, term379474, args);
    }

};


