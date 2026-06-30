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

public class UserScenario_equals_48657069 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100389;
     Object term100656;

    public UserScenario_equals_48657069() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term100395 = new Long(1993646237353405740L);
        term100389 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserScenario"));
        Object term100391 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term100393 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term100409 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term100410 = newInstance(Class.forName("java.time.LocalDate"));
        Object term100414 = newInstance(Class.forName("java.time.LocalTime"));
        Object term100419 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term100420 = newInstance(Class.forName("java.time.LocalDate"));
        Object term100424 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term100389, term100389.getClass(), "id", -6600873378715339777L);
        setLongField(term100391, term100391.getClass(), "id", -5693438879808590110L);
        setLongField(term100393, term100393.getClass(), "id", 8029601947786876260L);
        setField(term100393, term100393.getClass(), "extId", term100395);
        setField(term100393, term100393.getClass(), "luid", "FhbYnMXUCk");
        setIntField(term100410, term100410.getClass(), "year", 2011);
        setShortField(term100410, term100410.getClass(), "month", (short) 10);
        setShortField(term100410, term100410.getClass(), "day", (short) 20);
        setField(term100409, term100409.getClass(), "date", term100410);
        setByteField(term100414, term100414.getClass(), "hour", (byte) 2);
        setByteField(term100414, term100414.getClass(), "minute", (byte) 15);
        setByteField(term100414, term100414.getClass(), "second", (byte) 4);
        setIntField(term100414, term100414.getClass(), "nano", 46300192);
        setField(term100409, term100409.getClass(), "time", term100414);
        setField(term100393, term100393.getClass(), "registerTime", term100409);
        setIntField(term100420, term100420.getClass(), "year", 2023);
        setShortField(term100420, term100420.getClass(), "month", (short) 3);
        setShortField(term100420, term100420.getClass(), "day", (short) 26);
        setField(term100419, term100419.getClass(), "date", term100420);
        setByteField(term100424, term100424.getClass(), "hour", (byte) 2);
        setByteField(term100424, term100424.getClass(), "minute", (byte) 30);
        setByteField(term100424, term100424.getClass(), "second", (byte) 47);
        setIntField(term100424, term100424.getClass(), "nano", 494050019);
        setField(term100419, term100419.getClass(), "time", term100424);
        setField(term100393, term100393.getClass(), "accessTime", term100419);
        setField(term100391, term100391.getClass(), "card", term100393);
        setField(term100391, term100391.getClass(), "userName", "MMUzzZjmHQ");
        setIntField(term100391, term100391.getClass(), "level", -416293515);
        setIntField(term100391, term100391.getClass(), "reincarnationNum", 814623608);
        setLongField(term100391, term100391.getClass(), "exp", 1428981907548987584L);
        setLongField(term100391, term100391.getClass(), "point", 8237319232825837512L);
        setLongField(term100391, term100391.getClass(), "totalPoint", -6127827855081859363L);
        setIntField(term100391, term100391.getClass(), "playCount", 1611955417);
        setIntField(term100391, term100391.getClass(), "jewelCount", 1393785528);
        setIntField(term100391, term100391.getClass(), "totalJewelCount", -666320722);
        setIntField(term100391, term100391.getClass(), "medalCount", -307183487);
        setIntField(term100391, term100391.getClass(), "playerRating", 1944402596);
        setIntField(term100391, term100391.getClass(), "highestRating", 1104970147);
        setIntField(term100391, term100391.getClass(), "battlePoint", -1654077862);
        setIntField(term100391, term100391.getClass(), "bestBattlePoint", 1321847205);
        setIntField(term100391, term100391.getClass(), "overDamageBattlePoint", -1616030271);
        setBooleanField(term100391, term100391.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term100391, term100391.getClass(), "nameplateId", 222268564);
        setIntField(term100391, term100391.getClass(), "trophyId", 465025492);
        setIntField(term100391, term100391.getClass(), "cardId", 1522390788);
        setIntField(term100391, term100391.getClass(), "characterId", -1659618250);
        setIntField(term100391, term100391.getClass(), "characterVoiceNo", -1678083548);
        setIntField(term100391, term100391.getClass(), "tabSetting", -318929562);
        setIntField(term100391, term100391.getClass(), "tabSortSetting", 444110876);
        setIntField(term100391, term100391.getClass(), "cardCategorySetting", 1331389613);
        setIntField(term100391, term100391.getClass(), "cardSortSetting", -112675568);
        setIntField(term100391, term100391.getClass(), "rivalScoreCategorySetting", 1560144379);
        setIntField(term100391, term100391.getClass(), "playedTutorialBit", 1375062894);
        setIntField(term100391, term100391.getClass(), "firstTutorialCancelNum", -1230393533);
        setLongField(term100391, term100391.getClass(), "sumTechHighScore", -7995755881860007512L);
        setLongField(term100391, term100391.getClass(), "sumTechBasicHighScore", 8748765904759083100L);
        setLongField(term100391, term100391.getClass(), "sumTechAdvancedHighScore", 6385422299803844802L);
        setLongField(term100391, term100391.getClass(), "sumTechExpertHighScore", -5859029021975243925L);
        setLongField(term100391, term100391.getClass(), "sumTechMasterHighScore", 2244262697913198516L);
        setLongField(term100391, term100391.getClass(), "sumTechLunaticHighScore", -596830690725548669L);
        setLongField(term100391, term100391.getClass(), "sumBattleHighScore", -6584986167310061085L);
        setLongField(term100391, term100391.getClass(), "sumBattleBasicHighScore", 2006885296053941229L);
        setLongField(term100391, term100391.getClass(), "sumBattleAdvancedHighScore", 8646136630297442718L);
        setLongField(term100391, term100391.getClass(), "sumBattleExpertHighScore", -2058127576113117049L);
        setLongField(term100391, term100391.getClass(), "sumBattleMasterHighScore", 4901753685449608322L);
        setLongField(term100391, term100391.getClass(), "sumBattleLunaticHighScore", 2141191683984860872L);
        setField(term100391, term100391.getClass(), "eventWatchedDate", "NSPCJaizlC");
        setField(term100391, term100391.getClass(), "cmEventWatchedDate", "JoFUYaQQtF");
        setField(term100391, term100391.getClass(), "firstGameId", "SAKoORlZVA");
        setField(term100391, term100391.getClass(), "firstRomVersion", "HhYVbmMRiN");
        setField(term100391, term100391.getClass(), "firstDataVersion", "UYEVBNEKyf");
        setField(term100391, term100391.getClass(), "firstPlayDate", "EXduYtKPaE");
        setField(term100391, term100391.getClass(), "lastGameId", "UVMEqArKpY");
        setField(term100391, term100391.getClass(), "lastRomVersion", "fLbDziHEHK");
        setField(term100391, term100391.getClass(), "lastDataVersion", "lzRecPiQNU");
        setField(term100391, term100391.getClass(), "compatibleCmVersion", "CVfKmjoLKq");
        setField(term100391, term100391.getClass(), "lastPlayDate", "zvqciKTUAl");
        setIntField(term100391, term100391.getClass(), "lastPlaceId", -1066801533);
        setField(term100391, term100391.getClass(), "lastPlaceName", "hvNiDuvOYJ");
        setIntField(term100391, term100391.getClass(), "lastRegionId", -2069135847);
        setField(term100391, term100391.getClass(), "lastRegionName", "unTIyPhfcW");
        setIntField(term100391, term100391.getClass(), "lastAllNetId", -2030631838);
        setField(term100391, term100391.getClass(), "lastClientId", "McPsgamHga");
        setIntField(term100391, term100391.getClass(), "lastUsedDeckId", 1097564063);
        setIntField(term100391, term100391.getClass(), "lastPlayMusicLevel", 2087389339);
        setIntField(term100391, term100391.getClass(), "lastEmoneyBrand", 1125591053);
        setField(term100389, term100389.getClass(), "user", term100391);
        setIntField(term100389, term100389.getClass(), "scenarioId", -424318105);
        setIntField(term100389, term100389.getClass(), "playCount", -1529748409);
        term100656 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserScenario");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term100656;
        callMethod(klass, "equals", argTypes, term100389, args);
    }

};


