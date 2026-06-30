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

public class UserData_getExp_5905977815 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24033;

    public UserData_getExp_5905977815() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term24037 = new Long(-2644215923136513282L);
        term24033 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term24035 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term24051 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term24052 = newInstance(Class.forName("java.time.LocalDate"));
        Object term24056 = newInstance(Class.forName("java.time.LocalTime"));
        Object term24061 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term24062 = newInstance(Class.forName("java.time.LocalDate"));
        Object term24066 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term24033, term24033.getClass(), "id", 3369965039136843143L);
        setLongField(term24035, term24035.getClass(), "id", -383809899410674609L);
        setField(term24035, term24035.getClass(), "extId", term24037);
        setField(term24035, term24035.getClass(), "luid", "GISHLsgALf");
        setIntField(term24052, term24052.getClass(), "year", 2013);
        setShortField(term24052, term24052.getClass(), "month", (short) 7);
        setShortField(term24052, term24052.getClass(), "day", (short) 3);
        setField(term24051, term24051.getClass(), "date", term24052);
        setByteField(term24056, term24056.getClass(), "hour", (byte) 10);
        setByteField(term24056, term24056.getClass(), "minute", (byte) 59);
        setByteField(term24056, term24056.getClass(), "second", (byte) 22);
        setIntField(term24056, term24056.getClass(), "nano", 937921480);
        setField(term24051, term24051.getClass(), "time", term24056);
        setField(term24035, term24035.getClass(), "registerTime", term24051);
        setIntField(term24062, term24062.getClass(), "year", 2012);
        setShortField(term24062, term24062.getClass(), "month", (short) 2);
        setShortField(term24062, term24062.getClass(), "day", (short) 29);
        setField(term24061, term24061.getClass(), "date", term24062);
        setByteField(term24066, term24066.getClass(), "hour", (byte) 14);
        setByteField(term24066, term24066.getClass(), "minute", (byte) 26);
        setByteField(term24066, term24066.getClass(), "second", (byte) 20);
        setIntField(term24066, term24066.getClass(), "nano", 780823452);
        setField(term24061, term24061.getClass(), "time", term24066);
        setField(term24035, term24035.getClass(), "accessTime", term24061);
        setField(term24033, term24033.getClass(), "card", term24035);
        setField(term24033, term24033.getClass(), "userName", "PVykkUSgBq");
        setIntField(term24033, term24033.getClass(), "level", -1303269101);
        setIntField(term24033, term24033.getClass(), "reincarnationNum", 1435572720);
        setLongField(term24033, term24033.getClass(), "exp", 4633443327989555279L);
        setLongField(term24033, term24033.getClass(), "point", -7883918174480028850L);
        setLongField(term24033, term24033.getClass(), "totalPoint", 3512582740653676967L);
        setIntField(term24033, term24033.getClass(), "playCount", 1437618365);
        setIntField(term24033, term24033.getClass(), "jewelCount", 1122535239);
        setIntField(term24033, term24033.getClass(), "totalJewelCount", 1158923260);
        setIntField(term24033, term24033.getClass(), "medalCount", 1633508772);
        setIntField(term24033, term24033.getClass(), "playerRating", -545275970);
        setIntField(term24033, term24033.getClass(), "highestRating", 1355471365);
        setIntField(term24033, term24033.getClass(), "battlePoint", -1746962742);
        setIntField(term24033, term24033.getClass(), "bestBattlePoint", -575810668);
        setIntField(term24033, term24033.getClass(), "overDamageBattlePoint", 256028547);
        setBooleanField(term24033, term24033.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term24033, term24033.getClass(), "nameplateId", -750603024);
        setIntField(term24033, term24033.getClass(), "trophyId", 1255234202);
        setIntField(term24033, term24033.getClass(), "cardId", -223786928);
        setIntField(term24033, term24033.getClass(), "characterId", 1703103733);
        setIntField(term24033, term24033.getClass(), "characterVoiceNo", 1057562436);
        setIntField(term24033, term24033.getClass(), "tabSetting", 646610000);
        setIntField(term24033, term24033.getClass(), "tabSortSetting", 2003399396);
        setIntField(term24033, term24033.getClass(), "cardCategorySetting", 1223703911);
        setIntField(term24033, term24033.getClass(), "cardSortSetting", -1824905298);
        setIntField(term24033, term24033.getClass(), "rivalScoreCategorySetting", -2062724184);
        setIntField(term24033, term24033.getClass(), "playedTutorialBit", -716654499);
        setIntField(term24033, term24033.getClass(), "firstTutorialCancelNum", 1641117123);
        setLongField(term24033, term24033.getClass(), "sumTechHighScore", -6893173979797141349L);
        setLongField(term24033, term24033.getClass(), "sumTechBasicHighScore", 8849217995403029606L);
        setLongField(term24033, term24033.getClass(), "sumTechAdvancedHighScore", 2179437725582700997L);
        setLongField(term24033, term24033.getClass(), "sumTechExpertHighScore", 808761243947256536L);
        setLongField(term24033, term24033.getClass(), "sumTechMasterHighScore", 5841040494527118725L);
        setLongField(term24033, term24033.getClass(), "sumTechLunaticHighScore", 5535938323123427777L);
        setLongField(term24033, term24033.getClass(), "sumBattleHighScore", 1292632924316952683L);
        setLongField(term24033, term24033.getClass(), "sumBattleBasicHighScore", 2896485328388781986L);
        setLongField(term24033, term24033.getClass(), "sumBattleAdvancedHighScore", 54468717425932218L);
        setLongField(term24033, term24033.getClass(), "sumBattleExpertHighScore", 5860114696949347386L);
        setLongField(term24033, term24033.getClass(), "sumBattleMasterHighScore", 3415381732664403599L);
        setLongField(term24033, term24033.getClass(), "sumBattleLunaticHighScore", 3853271903861685327L);
        setField(term24033, term24033.getClass(), "eventWatchedDate", "tnKbZaCsuj");
        setField(term24033, term24033.getClass(), "cmEventWatchedDate", "ZFpcYBgLNC");
        setField(term24033, term24033.getClass(), "firstGameId", "VAGkRppBem");
        setField(term24033, term24033.getClass(), "firstRomVersion", "eKcEJRxNSu");
        setField(term24033, term24033.getClass(), "firstDataVersion", "NTXQPWFYSA");
        setField(term24033, term24033.getClass(), "firstPlayDate", "fOuOhBpldm");
        setField(term24033, term24033.getClass(), "lastGameId", "qQQRKGPyIM");
        setField(term24033, term24033.getClass(), "lastRomVersion", "lzcwhvjdFg");
        setField(term24033, term24033.getClass(), "lastDataVersion", "dfzWTjcjnI");
        setField(term24033, term24033.getClass(), "compatibleCmVersion", "bsnZXGEvFv");
        setField(term24033, term24033.getClass(), "lastPlayDate", "osFrHWYeRy");
        setIntField(term24033, term24033.getClass(), "lastPlaceId", -1084408453);
        setField(term24033, term24033.getClass(), "lastPlaceName", "scpIQUfPKw");
        setIntField(term24033, term24033.getClass(), "lastRegionId", -1466822773);
        setField(term24033, term24033.getClass(), "lastRegionName", "QKYBpCjuYt");
        setIntField(term24033, term24033.getClass(), "lastAllNetId", -230022261);
        setField(term24033, term24033.getClass(), "lastClientId", "vjiRfoGdkl");
        setIntField(term24033, term24033.getClass(), "lastUsedDeckId", 831967494);
        setIntField(term24033, term24033.getClass(), "lastPlayMusicLevel", -1858635791);
        setIntField(term24033, term24033.getClass(), "lastEmoneyBrand", 1919079331);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExp", argTypes, term24033, args);
    }

};


