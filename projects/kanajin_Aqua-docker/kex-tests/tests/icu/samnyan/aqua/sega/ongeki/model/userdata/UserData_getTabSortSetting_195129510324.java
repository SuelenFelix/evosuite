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

public class UserData_getTabSortSetting_195129510324 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32070;

    public UserData_getTabSortSetting_195129510324() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term32074 = new Long(6682528376118987775L);
        term32070 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term32072 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term32088 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term32089 = newInstance(Class.forName("java.time.LocalDate"));
        Object term32093 = newInstance(Class.forName("java.time.LocalTime"));
        Object term32098 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term32099 = newInstance(Class.forName("java.time.LocalDate"));
        Object term32103 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term32070, term32070.getClass(), "id", -6888944543104457634L);
        setLongField(term32072, term32072.getClass(), "id", 3965773362038690712L);
        setField(term32072, term32072.getClass(), "extId", term32074);
        setField(term32072, term32072.getClass(), "luid", "sJNXNshRLe");
        setIntField(term32089, term32089.getClass(), "year", 2018);
        setShortField(term32089, term32089.getClass(), "month", (short) 5);
        setShortField(term32089, term32089.getClass(), "day", (short) 22);
        setField(term32088, term32088.getClass(), "date", term32089);
        setByteField(term32093, term32093.getClass(), "hour", (byte) 16);
        setByteField(term32093, term32093.getClass(), "minute", (byte) 46);
        setByteField(term32093, term32093.getClass(), "second", (byte) 48);
        setIntField(term32093, term32093.getClass(), "nano", 72983043);
        setField(term32088, term32088.getClass(), "time", term32093);
        setField(term32072, term32072.getClass(), "registerTime", term32088);
        setIntField(term32099, term32099.getClass(), "year", 2022);
        setShortField(term32099, term32099.getClass(), "month", (short) 3);
        setShortField(term32099, term32099.getClass(), "day", (short) 16);
        setField(term32098, term32098.getClass(), "date", term32099);
        setByteField(term32103, term32103.getClass(), "hour", (byte) 16);
        setByteField(term32103, term32103.getClass(), "minute", (byte) 35);
        setByteField(term32103, term32103.getClass(), "second", (byte) 38);
        setIntField(term32103, term32103.getClass(), "nano", 79329968);
        setField(term32098, term32098.getClass(), "time", term32103);
        setField(term32072, term32072.getClass(), "accessTime", term32098);
        setField(term32070, term32070.getClass(), "card", term32072);
        setField(term32070, term32070.getClass(), "userName", "AYnbmgRCKr");
        setIntField(term32070, term32070.getClass(), "level", -414437174);
        setIntField(term32070, term32070.getClass(), "reincarnationNum", -860227615);
        setLongField(term32070, term32070.getClass(), "exp", 7329701902499669605L);
        setLongField(term32070, term32070.getClass(), "point", 596630330404532696L);
        setLongField(term32070, term32070.getClass(), "totalPoint", 3628778546975266226L);
        setIntField(term32070, term32070.getClass(), "playCount", -1696192372);
        setIntField(term32070, term32070.getClass(), "jewelCount", 1239525687);
        setIntField(term32070, term32070.getClass(), "totalJewelCount", 1496590861);
        setIntField(term32070, term32070.getClass(), "medalCount", 1046957508);
        setIntField(term32070, term32070.getClass(), "playerRating", -553500478);
        setIntField(term32070, term32070.getClass(), "highestRating", 841910530);
        setIntField(term32070, term32070.getClass(), "battlePoint", -1415371559);
        setIntField(term32070, term32070.getClass(), "bestBattlePoint", -2083858949);
        setIntField(term32070, term32070.getClass(), "overDamageBattlePoint", -1878319299);
        setBooleanField(term32070, term32070.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term32070, term32070.getClass(), "nameplateId", -690862846);
        setIntField(term32070, term32070.getClass(), "trophyId", 805027262);
        setIntField(term32070, term32070.getClass(), "cardId", 717389178);
        setIntField(term32070, term32070.getClass(), "characterId", -1265226052);
        setIntField(term32070, term32070.getClass(), "characterVoiceNo", 1970023149);
        setIntField(term32070, term32070.getClass(), "tabSetting", -336351735);
        setIntField(term32070, term32070.getClass(), "tabSortSetting", 1938932230);
        setIntField(term32070, term32070.getClass(), "cardCategorySetting", 1128720609);
        setIntField(term32070, term32070.getClass(), "cardSortSetting", 216265002);
        setIntField(term32070, term32070.getClass(), "rivalScoreCategorySetting", -97405660);
        setIntField(term32070, term32070.getClass(), "playedTutorialBit", 872278468);
        setIntField(term32070, term32070.getClass(), "firstTutorialCancelNum", -1003390920);
        setLongField(term32070, term32070.getClass(), "sumTechHighScore", 5655884987926296954L);
        setLongField(term32070, term32070.getClass(), "sumTechBasicHighScore", -6055416231811865303L);
        setLongField(term32070, term32070.getClass(), "sumTechAdvancedHighScore", 4600612212546071466L);
        setLongField(term32070, term32070.getClass(), "sumTechExpertHighScore", 736282298030442495L);
        setLongField(term32070, term32070.getClass(), "sumTechMasterHighScore", -8385042448755891761L);
        setLongField(term32070, term32070.getClass(), "sumTechLunaticHighScore", 3776640840397782177L);
        setLongField(term32070, term32070.getClass(), "sumBattleHighScore", -4458985981191164653L);
        setLongField(term32070, term32070.getClass(), "sumBattleBasicHighScore", 3774876119567638995L);
        setLongField(term32070, term32070.getClass(), "sumBattleAdvancedHighScore", -5849140391879955934L);
        setLongField(term32070, term32070.getClass(), "sumBattleExpertHighScore", 5257982794400938524L);
        setLongField(term32070, term32070.getClass(), "sumBattleMasterHighScore", -5630319423499317967L);
        setLongField(term32070, term32070.getClass(), "sumBattleLunaticHighScore", 7053349473507426657L);
        setField(term32070, term32070.getClass(), "eventWatchedDate", "iQRfDlaoYD");
        setField(term32070, term32070.getClass(), "cmEventWatchedDate", "kpcyrjDQzN");
        setField(term32070, term32070.getClass(), "firstGameId", "IyukykAHLQ");
        setField(term32070, term32070.getClass(), "firstRomVersion", "CwZcgFJqMh");
        setField(term32070, term32070.getClass(), "firstDataVersion", "RldCZqgRbO");
        setField(term32070, term32070.getClass(), "firstPlayDate", "LOVugCAgJs");
        setField(term32070, term32070.getClass(), "lastGameId", "SNmHXwCiFY");
        setField(term32070, term32070.getClass(), "lastRomVersion", "HZfkWoqyUW");
        setField(term32070, term32070.getClass(), "lastDataVersion", "QRwANPSyfT");
        setField(term32070, term32070.getClass(), "compatibleCmVersion", "DbZKLwYBgy");
        setField(term32070, term32070.getClass(), "lastPlayDate", "LnNRVsjmxw");
        setIntField(term32070, term32070.getClass(), "lastPlaceId", -2052568448);
        setField(term32070, term32070.getClass(), "lastPlaceName", "PlOnDkNrvX");
        setIntField(term32070, term32070.getClass(), "lastRegionId", 664155196);
        setField(term32070, term32070.getClass(), "lastRegionName", "MltgFGldop");
        setIntField(term32070, term32070.getClass(), "lastAllNetId", -1103257588);
        setField(term32070, term32070.getClass(), "lastClientId", "JCWSoxnBJs");
        setIntField(term32070, term32070.getClass(), "lastUsedDeckId", 1463219831);
        setIntField(term32070, term32070.getClass(), "lastPlayMusicLevel", -1516863216);
        setIntField(term32070, term32070.getClass(), "lastEmoneyBrand", 1392468004);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTabSortSetting", argTypes, term32070, args);
    }

};


