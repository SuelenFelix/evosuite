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
import java.lang.Long;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Boolean;

public class UserEventPoint_init_67999037316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term388394;
     Object term388396;
     Object term388659;
     Object term388661;
     Object term388663;

    public UserEventPoint_init_67999037316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term388394 = new Long(-934893558280904112L);
        Long term388400 = new Long(-5133307284441518726L);
        term388396 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term388398 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term388414 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term388415 = newInstance(Class.forName("java.time.LocalDate"));
        Object term388419 = newInstance(Class.forName("java.time.LocalTime"));
        Object term388424 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term388425 = newInstance(Class.forName("java.time.LocalDate"));
        Object term388429 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term388396, term388396.getClass(), "id", 3466882082974373011L);
        setLongField(term388398, term388398.getClass(), "id", 3091913965450804622L);
        setField(term388398, term388398.getClass(), "extId", term388400);
        setField(term388398, term388398.getClass(), "luid", "nWBArUNMKc");
        setIntField(term388415, term388415.getClass(), "year", 2027);
        setShortField(term388415, term388415.getClass(), "month", (short) 1);
        setShortField(term388415, term388415.getClass(), "day", (short) 19);
        setField(term388414, term388414.getClass(), "date", term388415);
        setByteField(term388419, term388419.getClass(), "hour", (byte) 18);
        setByteField(term388419, term388419.getClass(), "minute", (byte) 46);
        setByteField(term388419, term388419.getClass(), "second", (byte) 52);
        setIntField(term388419, term388419.getClass(), "nano", 835577497);
        setField(term388414, term388414.getClass(), "time", term388419);
        setField(term388398, term388398.getClass(), "registerTime", term388414);
        setIntField(term388425, term388425.getClass(), "year", 2025);
        setShortField(term388425, term388425.getClass(), "month", (short) 12);
        setShortField(term388425, term388425.getClass(), "day", (short) 28);
        setField(term388424, term388424.getClass(), "date", term388425);
        setByteField(term388429, term388429.getClass(), "hour", (byte) 0);
        setByteField(term388429, term388429.getClass(), "minute", (byte) 36);
        setByteField(term388429, term388429.getClass(), "second", (byte) 46);
        setIntField(term388429, term388429.getClass(), "nano", 197920854);
        setField(term388424, term388424.getClass(), "time", term388429);
        setField(term388398, term388398.getClass(), "accessTime", term388424);
        setField(term388396, term388396.getClass(), "card", term388398);
        setField(term388396, term388396.getClass(), "userName", "msoCIbDKhD");
        setIntField(term388396, term388396.getClass(), "level", -1678540985);
        setIntField(term388396, term388396.getClass(), "reincarnationNum", -1993103294);
        setLongField(term388396, term388396.getClass(), "exp", -5507490903432770379L);
        setLongField(term388396, term388396.getClass(), "point", -6612334050477626121L);
        setLongField(term388396, term388396.getClass(), "totalPoint", 6458924540195179981L);
        setIntField(term388396, term388396.getClass(), "playCount", -280303541);
        setIntField(term388396, term388396.getClass(), "jewelCount", 608642404);
        setIntField(term388396, term388396.getClass(), "totalJewelCount", 1153136757);
        setIntField(term388396, term388396.getClass(), "medalCount", -234210757);
        setIntField(term388396, term388396.getClass(), "playerRating", 1743474844);
        setIntField(term388396, term388396.getClass(), "highestRating", -1884125496);
        setIntField(term388396, term388396.getClass(), "battlePoint", -2039512940);
        setIntField(term388396, term388396.getClass(), "bestBattlePoint", 1479021354);
        setIntField(term388396, term388396.getClass(), "overDamageBattlePoint", -1563523920);
        setBooleanField(term388396, term388396.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term388396, term388396.getClass(), "nameplateId", 667317640);
        setIntField(term388396, term388396.getClass(), "trophyId", 1268299296);
        setIntField(term388396, term388396.getClass(), "cardId", 1456218475);
        setIntField(term388396, term388396.getClass(), "characterId", 886984009);
        setIntField(term388396, term388396.getClass(), "characterVoiceNo", 859293450);
        setIntField(term388396, term388396.getClass(), "tabSetting", -1365671866);
        setIntField(term388396, term388396.getClass(), "tabSortSetting", -691449046);
        setIntField(term388396, term388396.getClass(), "cardCategorySetting", 473056558);
        setIntField(term388396, term388396.getClass(), "cardSortSetting", 1447392365);
        setIntField(term388396, term388396.getClass(), "rivalScoreCategorySetting", 717987547);
        setIntField(term388396, term388396.getClass(), "playedTutorialBit", 1201183052);
        setIntField(term388396, term388396.getClass(), "firstTutorialCancelNum", -1652298689);
        setLongField(term388396, term388396.getClass(), "sumTechHighScore", 4404596785614619344L);
        setLongField(term388396, term388396.getClass(), "sumTechBasicHighScore", 3670889134367936212L);
        setLongField(term388396, term388396.getClass(), "sumTechAdvancedHighScore", 2205308992080870806L);
        setLongField(term388396, term388396.getClass(), "sumTechExpertHighScore", -5125437773599619198L);
        setLongField(term388396, term388396.getClass(), "sumTechMasterHighScore", -2422264148284019426L);
        setLongField(term388396, term388396.getClass(), "sumTechLunaticHighScore", 5135029390439863316L);
        setLongField(term388396, term388396.getClass(), "sumBattleHighScore", -3150197964371081731L);
        setLongField(term388396, term388396.getClass(), "sumBattleBasicHighScore", -3864294304290057904L);
        setLongField(term388396, term388396.getClass(), "sumBattleAdvancedHighScore", 7680144213552793385L);
        setLongField(term388396, term388396.getClass(), "sumBattleExpertHighScore", 585485776426857669L);
        setLongField(term388396, term388396.getClass(), "sumBattleMasterHighScore", -8610541601201826336L);
        setLongField(term388396, term388396.getClass(), "sumBattleLunaticHighScore", 6604788345361425751L);
        setField(term388396, term388396.getClass(), "eventWatchedDate", "MAWACHZOiR");
        setField(term388396, term388396.getClass(), "cmEventWatchedDate", "AEkPxigjJm");
        setField(term388396, term388396.getClass(), "firstGameId", "iQJxYhucRy");
        setField(term388396, term388396.getClass(), "firstRomVersion", "NuiLbwxKTU");
        setField(term388396, term388396.getClass(), "firstDataVersion", "CPEVsgTbgb");
        setField(term388396, term388396.getClass(), "firstPlayDate", "uPqMURZrtl");
        setField(term388396, term388396.getClass(), "lastGameId", "IAZiWjauKz");
        setField(term388396, term388396.getClass(), "lastRomVersion", "XwGnsPCbzu");
        setField(term388396, term388396.getClass(), "lastDataVersion", "eFYGFvekYb");
        setField(term388396, term388396.getClass(), "compatibleCmVersion", "PeeqKWKRLc");
        setField(term388396, term388396.getClass(), "lastPlayDate", "kuModuIPXh");
        setIntField(term388396, term388396.getClass(), "lastPlaceId", 347648530);
        setField(term388396, term388396.getClass(), "lastPlaceName", "iwIUnEOvDP");
        setIntField(term388396, term388396.getClass(), "lastRegionId", 828032399);
        setField(term388396, term388396.getClass(), "lastRegionName", "cyOShNwqcN");
        setIntField(term388396, term388396.getClass(), "lastAllNetId", -1815235441);
        setField(term388396, term388396.getClass(), "lastClientId", "sHHnHyEETF");
        setIntField(term388396, term388396.getClass(), "lastUsedDeckId", -1620551735);
        setIntField(term388396, term388396.getClass(), "lastPlayMusicLevel", -481264802);
        setIntField(term388396, term388396.getClass(), "lastEmoneyBrand", 72431201);
        term388659 = new Integer(-1289146129);
        term388661 = new Long(-1443917216190729272L);
        term388663 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserEventPoint");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = long.class;
        argTypes[1] = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        argTypes[2] = int.class;
        argTypes[3] = long.class;
        argTypes[4] = boolean.class;
        Object[] args = new Object[5];
        args[0] = term388394;
        args[1] = term388396;
        args[2] = term388659;
        args[3] = term388661;
        args[4] = term388663;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


