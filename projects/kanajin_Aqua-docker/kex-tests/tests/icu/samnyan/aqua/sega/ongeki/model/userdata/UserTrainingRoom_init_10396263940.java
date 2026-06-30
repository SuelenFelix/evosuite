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

public class UserTrainingRoom_init_10396263940 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12935;

    public UserTrainingRoom_init_10396263940() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term12939 = new Long(6855071767938501807L);
        term12935 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term12937 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term12953 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12954 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12958 = newInstance(Class.forName("java.time.LocalTime"));
        Object term12963 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12964 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12968 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term12935, term12935.getClass(), "id", 6545086285386938562L);
        setLongField(term12937, term12937.getClass(), "id", 3951346165629352117L);
        setField(term12937, term12937.getClass(), "extId", term12939);
        setField(term12937, term12937.getClass(), "luid", "qphdrqUtNx");
        setIntField(term12954, term12954.getClass(), "year", 2016);
        setShortField(term12954, term12954.getClass(), "month", (short) 2);
        setShortField(term12954, term12954.getClass(), "day", (short) 25);
        setField(term12953, term12953.getClass(), "date", term12954);
        setByteField(term12958, term12958.getClass(), "hour", (byte) 8);
        setByteField(term12958, term12958.getClass(), "minute", (byte) 54);
        setByteField(term12958, term12958.getClass(), "second", (byte) 40);
        setIntField(term12958, term12958.getClass(), "nano", 124525896);
        setField(term12953, term12953.getClass(), "time", term12958);
        setField(term12937, term12937.getClass(), "registerTime", term12953);
        setIntField(term12964, term12964.getClass(), "year", 2029);
        setShortField(term12964, term12964.getClass(), "month", (short) 1);
        setShortField(term12964, term12964.getClass(), "day", (short) 10);
        setField(term12963, term12963.getClass(), "date", term12964);
        setByteField(term12968, term12968.getClass(), "hour", (byte) 8);
        setByteField(term12968, term12968.getClass(), "minute", (byte) 46);
        setByteField(term12968, term12968.getClass(), "second", (byte) 35);
        setIntField(term12968, term12968.getClass(), "nano", 58807194);
        setField(term12963, term12963.getClass(), "time", term12968);
        setField(term12937, term12937.getClass(), "accessTime", term12963);
        setField(term12935, term12935.getClass(), "card", term12937);
        setField(term12935, term12935.getClass(), "userName", "bwlLFAfNWx");
        setIntField(term12935, term12935.getClass(), "level", -232352320);
        setIntField(term12935, term12935.getClass(), "reincarnationNum", -232333014);
        setLongField(term12935, term12935.getClass(), "exp", -4187265590402169996L);
        setLongField(term12935, term12935.getClass(), "point", -8033044954947064558L);
        setLongField(term12935, term12935.getClass(), "totalPoint", 4626639872957534248L);
        setIntField(term12935, term12935.getClass(), "playCount", -139694079);
        setIntField(term12935, term12935.getClass(), "jewelCount", -1602072035);
        setIntField(term12935, term12935.getClass(), "totalJewelCount", 1902624392);
        setIntField(term12935, term12935.getClass(), "medalCount", 904607217);
        setIntField(term12935, term12935.getClass(), "playerRating", 434914590);
        setIntField(term12935, term12935.getClass(), "highestRating", 1983756621);
        setIntField(term12935, term12935.getClass(), "battlePoint", -2134711835);
        setIntField(term12935, term12935.getClass(), "bestBattlePoint", -1641244494);
        setIntField(term12935, term12935.getClass(), "overDamageBattlePoint", 1124282188);
        setBooleanField(term12935, term12935.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term12935, term12935.getClass(), "nameplateId", -489441521);
        setIntField(term12935, term12935.getClass(), "trophyId", 225873732);
        setIntField(term12935, term12935.getClass(), "cardId", 529879356);
        setIntField(term12935, term12935.getClass(), "characterId", 18072182);
        setIntField(term12935, term12935.getClass(), "characterVoiceNo", 1544768934);
        setIntField(term12935, term12935.getClass(), "tabSetting", -383508597);
        setIntField(term12935, term12935.getClass(), "tabSortSetting", -819372164);
        setIntField(term12935, term12935.getClass(), "cardCategorySetting", 958132675);
        setIntField(term12935, term12935.getClass(), "cardSortSetting", -689879283);
        setIntField(term12935, term12935.getClass(), "rivalScoreCategorySetting", 1985432430);
        setIntField(term12935, term12935.getClass(), "playedTutorialBit", -1769933499);
        setIntField(term12935, term12935.getClass(), "firstTutorialCancelNum", -1510932472);
        setLongField(term12935, term12935.getClass(), "sumTechHighScore", -7062466217011408314L);
        setLongField(term12935, term12935.getClass(), "sumTechBasicHighScore", -5455716707538294699L);
        setLongField(term12935, term12935.getClass(), "sumTechAdvancedHighScore", -1889784286465977825L);
        setLongField(term12935, term12935.getClass(), "sumTechExpertHighScore", 5592522907226111065L);
        setLongField(term12935, term12935.getClass(), "sumTechMasterHighScore", -2577420466618938650L);
        setLongField(term12935, term12935.getClass(), "sumTechLunaticHighScore", 5614572229094721840L);
        setLongField(term12935, term12935.getClass(), "sumBattleHighScore", -159468133651974975L);
        setLongField(term12935, term12935.getClass(), "sumBattleBasicHighScore", 9160882370265093763L);
        setLongField(term12935, term12935.getClass(), "sumBattleAdvancedHighScore", 6848008460134431064L);
        setLongField(term12935, term12935.getClass(), "sumBattleExpertHighScore", -5338413783740215067L);
        setLongField(term12935, term12935.getClass(), "sumBattleMasterHighScore", -814922776357887557L);
        setLongField(term12935, term12935.getClass(), "sumBattleLunaticHighScore", 800893933628130392L);
        setField(term12935, term12935.getClass(), "eventWatchedDate", "JWodNQzjjV");
        setField(term12935, term12935.getClass(), "cmEventWatchedDate", "CAgxWjhxNf");
        setField(term12935, term12935.getClass(), "firstGameId", "goAoCMhKBu");
        setField(term12935, term12935.getClass(), "firstRomVersion", "BWxJSgKHRT");
        setField(term12935, term12935.getClass(), "firstDataVersion", "AGXoIndFnm");
        setField(term12935, term12935.getClass(), "firstPlayDate", "mwmFMNEzkK");
        setField(term12935, term12935.getClass(), "lastGameId", "kVAmKknVln");
        setField(term12935, term12935.getClass(), "lastRomVersion", "MRFLbEGYKG");
        setField(term12935, term12935.getClass(), "lastDataVersion", "BYrGukTyof");
        setField(term12935, term12935.getClass(), "compatibleCmVersion", "jiCGTTzKGB");
        setField(term12935, term12935.getClass(), "lastPlayDate", "MqICFYzDJj");
        setIntField(term12935, term12935.getClass(), "lastPlaceId", 1970654816);
        setField(term12935, term12935.getClass(), "lastPlaceName", "YgQvdcBQKw");
        setIntField(term12935, term12935.getClass(), "lastRegionId", 1354781442);
        setField(term12935, term12935.getClass(), "lastRegionName", "FiYYLuailz");
        setIntField(term12935, term12935.getClass(), "lastAllNetId", -393590701);
        setField(term12935, term12935.getClass(), "lastClientId", "XebAeSnCKZ");
        setIntField(term12935, term12935.getClass(), "lastUsedDeckId", 86344574);
        setIntField(term12935, term12935.getClass(), "lastPlayMusicLevel", -829441157);
        setIntField(term12935, term12935.getClass(), "lastEmoneyBrand", -1489991025);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTrainingRoom");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Object[] args = new Object[1];
        args[0] = term12935;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


