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

public class UserData_setSumTechAdvancedHighScore_175410366794 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61808;
     Object term62071;

    public UserData_setSumTechAdvancedHighScore_175410366794() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term61812 = new Long(-6587807377747738663L);
        term61808 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term61810 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term61826 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term61827 = newInstance(Class.forName("java.time.LocalDate"));
        Object term61831 = newInstance(Class.forName("java.time.LocalTime"));
        Object term61836 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term61837 = newInstance(Class.forName("java.time.LocalDate"));
        Object term61841 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term61808, term61808.getClass(), "id", -2397817278487988239L);
        setLongField(term61810, term61810.getClass(), "id", 1618391554363715092L);
        setField(term61810, term61810.getClass(), "extId", term61812);
        setField(term61810, term61810.getClass(), "luid", "ThGyaiqnHq");
        setIntField(term61827, term61827.getClass(), "year", 2014);
        setShortField(term61827, term61827.getClass(), "month", (short) 5);
        setShortField(term61827, term61827.getClass(), "day", (short) 20);
        setField(term61826, term61826.getClass(), "date", term61827);
        setByteField(term61831, term61831.getClass(), "hour", (byte) 12);
        setByteField(term61831, term61831.getClass(), "minute", (byte) 30);
        setByteField(term61831, term61831.getClass(), "second", (byte) 37);
        setIntField(term61831, term61831.getClass(), "nano", 390283474);
        setField(term61826, term61826.getClass(), "time", term61831);
        setField(term61810, term61810.getClass(), "registerTime", term61826);
        setIntField(term61837, term61837.getClass(), "year", 2028);
        setShortField(term61837, term61837.getClass(), "month", (short) 11);
        setShortField(term61837, term61837.getClass(), "day", (short) 28);
        setField(term61836, term61836.getClass(), "date", term61837);
        setByteField(term61841, term61841.getClass(), "hour", (byte) 4);
        setByteField(term61841, term61841.getClass(), "minute", (byte) 25);
        setByteField(term61841, term61841.getClass(), "second", (byte) 12);
        setIntField(term61841, term61841.getClass(), "nano", 726554360);
        setField(term61836, term61836.getClass(), "time", term61841);
        setField(term61810, term61810.getClass(), "accessTime", term61836);
        setField(term61808, term61808.getClass(), "card", term61810);
        setField(term61808, term61808.getClass(), "userName", "AtEuOtHJrK");
        setIntField(term61808, term61808.getClass(), "level", 2044728583);
        setIntField(term61808, term61808.getClass(), "reincarnationNum", 64790905);
        setLongField(term61808, term61808.getClass(), "exp", -1576466761979476990L);
        setLongField(term61808, term61808.getClass(), "point", 7724921193278956157L);
        setLongField(term61808, term61808.getClass(), "totalPoint", 433374929829481228L);
        setIntField(term61808, term61808.getClass(), "playCount", -1199056049);
        setIntField(term61808, term61808.getClass(), "jewelCount", -1074336148);
        setIntField(term61808, term61808.getClass(), "totalJewelCount", -561801733);
        setIntField(term61808, term61808.getClass(), "medalCount", 2134609936);
        setIntField(term61808, term61808.getClass(), "playerRating", -409989519);
        setIntField(term61808, term61808.getClass(), "highestRating", -1293074430);
        setIntField(term61808, term61808.getClass(), "battlePoint", 608662433);
        setIntField(term61808, term61808.getClass(), "bestBattlePoint", -2015476493);
        setIntField(term61808, term61808.getClass(), "overDamageBattlePoint", 41528103);
        setBooleanField(term61808, term61808.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term61808, term61808.getClass(), "nameplateId", -1732381818);
        setIntField(term61808, term61808.getClass(), "trophyId", 1960614460);
        setIntField(term61808, term61808.getClass(), "cardId", -1488501179);
        setIntField(term61808, term61808.getClass(), "characterId", 2086648406);
        setIntField(term61808, term61808.getClass(), "characterVoiceNo", 805890273);
        setIntField(term61808, term61808.getClass(), "tabSetting", 1078863472);
        setIntField(term61808, term61808.getClass(), "tabSortSetting", -1845619952);
        setIntField(term61808, term61808.getClass(), "cardCategorySetting", -1363744441);
        setIntField(term61808, term61808.getClass(), "cardSortSetting", -1303828030);
        setIntField(term61808, term61808.getClass(), "rivalScoreCategorySetting", 1611629079);
        setIntField(term61808, term61808.getClass(), "playedTutorialBit", 770171276);
        setIntField(term61808, term61808.getClass(), "firstTutorialCancelNum", -1497914215);
        setLongField(term61808, term61808.getClass(), "sumTechHighScore", -2013335001765194503L);
        setLongField(term61808, term61808.getClass(), "sumTechBasicHighScore", 2099082576325089685L);
        setLongField(term61808, term61808.getClass(), "sumTechAdvancedHighScore", -4221717002257817742L);
        setLongField(term61808, term61808.getClass(), "sumTechExpertHighScore", -4465503610042466187L);
        setLongField(term61808, term61808.getClass(), "sumTechMasterHighScore", -4715213274903499549L);
        setLongField(term61808, term61808.getClass(), "sumTechLunaticHighScore", -206273696983196193L);
        setLongField(term61808, term61808.getClass(), "sumBattleHighScore", -1915177024356330506L);
        setLongField(term61808, term61808.getClass(), "sumBattleBasicHighScore", -8102057067828170079L);
        setLongField(term61808, term61808.getClass(), "sumBattleAdvancedHighScore", 2870545673083303918L);
        setLongField(term61808, term61808.getClass(), "sumBattleExpertHighScore", -7840381460094892118L);
        setLongField(term61808, term61808.getClass(), "sumBattleMasterHighScore", -8300306774743166010L);
        setLongField(term61808, term61808.getClass(), "sumBattleLunaticHighScore", 6114404614513911757L);
        setField(term61808, term61808.getClass(), "eventWatchedDate", "gzqokHWvLu");
        setField(term61808, term61808.getClass(), "cmEventWatchedDate", "ANCcRsABGP");
        setField(term61808, term61808.getClass(), "firstGameId", "MBadwVIvwu");
        setField(term61808, term61808.getClass(), "firstRomVersion", "zTMIjtwMQL");
        setField(term61808, term61808.getClass(), "firstDataVersion", "cjJhlsbSLZ");
        setField(term61808, term61808.getClass(), "firstPlayDate", "BvcBilSFZf");
        setField(term61808, term61808.getClass(), "lastGameId", "ppUmoMssug");
        setField(term61808, term61808.getClass(), "lastRomVersion", "FcponInvBb");
        setField(term61808, term61808.getClass(), "lastDataVersion", "IFOOxmFxbX");
        setField(term61808, term61808.getClass(), "compatibleCmVersion", "aDEuPKrSZt");
        setField(term61808, term61808.getClass(), "lastPlayDate", "aDhkmoCCUK");
        setIntField(term61808, term61808.getClass(), "lastPlaceId", 254385018);
        setField(term61808, term61808.getClass(), "lastPlaceName", "ibnuoVVkVm");
        setIntField(term61808, term61808.getClass(), "lastRegionId", 672070228);
        setField(term61808, term61808.getClass(), "lastRegionName", "mXVgkxjTjD");
        setIntField(term61808, term61808.getClass(), "lastAllNetId", 1014463904);
        setField(term61808, term61808.getClass(), "lastClientId", "qodBmKUkev");
        setIntField(term61808, term61808.getClass(), "lastUsedDeckId", 928673401);
        setIntField(term61808, term61808.getClass(), "lastPlayMusicLevel", -631739609);
        setIntField(term61808, term61808.getClass(), "lastEmoneyBrand", -2045566233);
        term62071 = new Long(-8439940175231511654L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term62071;
        callMethod(klass, "setSumTechAdvancedHighScore", argTypes, term61808, args);
    }

};


