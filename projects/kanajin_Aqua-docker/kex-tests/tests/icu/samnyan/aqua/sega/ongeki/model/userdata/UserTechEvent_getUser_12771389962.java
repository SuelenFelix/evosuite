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

public class UserTechEvent_getUser_12771389962 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term352022;

    public UserTechEvent_getUser_12771389962() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term352028 = new Long(-1379663556617181551L);
        term352022 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTechEvent"));
        Object term352024 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term352026 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term352042 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term352043 = newInstance(Class.forName("java.time.LocalDate"));
        Object term352047 = newInstance(Class.forName("java.time.LocalTime"));
        Object term352052 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term352053 = newInstance(Class.forName("java.time.LocalDate"));
        Object term352057 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term352022, term352022.getClass(), "id", -2360467120224302875L);
        setLongField(term352024, term352024.getClass(), "id", -1552298558408800936L);
        setLongField(term352026, term352026.getClass(), "id", -5123699697640622133L);
        setField(term352026, term352026.getClass(), "extId", term352028);
        setField(term352026, term352026.getClass(), "luid", "LhoMbtRsOf");
        setIntField(term352043, term352043.getClass(), "year", 2013);
        setShortField(term352043, term352043.getClass(), "month", (short) 5);
        setShortField(term352043, term352043.getClass(), "day", (short) 26);
        setField(term352042, term352042.getClass(), "date", term352043);
        setByteField(term352047, term352047.getClass(), "hour", (byte) 13);
        setByteField(term352047, term352047.getClass(), "minute", (byte) 14);
        setByteField(term352047, term352047.getClass(), "second", (byte) 4);
        setIntField(term352047, term352047.getClass(), "nano", 125550160);
        setField(term352042, term352042.getClass(), "time", term352047);
        setField(term352026, term352026.getClass(), "registerTime", term352042);
        setIntField(term352053, term352053.getClass(), "year", 2019);
        setShortField(term352053, term352053.getClass(), "month", (short) 8);
        setShortField(term352053, term352053.getClass(), "day", (short) 15);
        setField(term352052, term352052.getClass(), "date", term352053);
        setByteField(term352057, term352057.getClass(), "hour", (byte) 13);
        setByteField(term352057, term352057.getClass(), "minute", (byte) 37);
        setByteField(term352057, term352057.getClass(), "second", (byte) 43);
        setIntField(term352057, term352057.getClass(), "nano", 174771933);
        setField(term352052, term352052.getClass(), "time", term352057);
        setField(term352026, term352026.getClass(), "accessTime", term352052);
        setField(term352024, term352024.getClass(), "card", term352026);
        setField(term352024, term352024.getClass(), "userName", "TKyYFwRMMd");
        setIntField(term352024, term352024.getClass(), "level", 10581451);
        setIntField(term352024, term352024.getClass(), "reincarnationNum", 1659591860);
        setLongField(term352024, term352024.getClass(), "exp", 7804271043718575522L);
        setLongField(term352024, term352024.getClass(), "point", 5436571745215980206L);
        setLongField(term352024, term352024.getClass(), "totalPoint", 5690683600113564028L);
        setIntField(term352024, term352024.getClass(), "playCount", -2081131382);
        setIntField(term352024, term352024.getClass(), "jewelCount", -1241016990);
        setIntField(term352024, term352024.getClass(), "totalJewelCount", 1961417205);
        setIntField(term352024, term352024.getClass(), "medalCount", 1431903188);
        setIntField(term352024, term352024.getClass(), "playerRating", 534856759);
        setIntField(term352024, term352024.getClass(), "highestRating", 1165713141);
        setIntField(term352024, term352024.getClass(), "battlePoint", 1958322335);
        setIntField(term352024, term352024.getClass(), "bestBattlePoint", 1769126826);
        setIntField(term352024, term352024.getClass(), "overDamageBattlePoint", -5485074);
        setBooleanField(term352024, term352024.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term352024, term352024.getClass(), "nameplateId", -1972342988);
        setIntField(term352024, term352024.getClass(), "trophyId", -1344263161);
        setIntField(term352024, term352024.getClass(), "cardId", -1456160297);
        setIntField(term352024, term352024.getClass(), "characterId", -907685278);
        setIntField(term352024, term352024.getClass(), "characterVoiceNo", -261534939);
        setIntField(term352024, term352024.getClass(), "tabSetting", 372214007);
        setIntField(term352024, term352024.getClass(), "tabSortSetting", -1180858795);
        setIntField(term352024, term352024.getClass(), "cardCategorySetting", -748983429);
        setIntField(term352024, term352024.getClass(), "cardSortSetting", -52992881);
        setIntField(term352024, term352024.getClass(), "rivalScoreCategorySetting", -1531419354);
        setIntField(term352024, term352024.getClass(), "playedTutorialBit", 2023879700);
        setIntField(term352024, term352024.getClass(), "firstTutorialCancelNum", 633537369);
        setLongField(term352024, term352024.getClass(), "sumTechHighScore", -7865165503723600814L);
        setLongField(term352024, term352024.getClass(), "sumTechBasicHighScore", 1265066406755635750L);
        setLongField(term352024, term352024.getClass(), "sumTechAdvancedHighScore", -4023796199372020395L);
        setLongField(term352024, term352024.getClass(), "sumTechExpertHighScore", 4637630844734584293L);
        setLongField(term352024, term352024.getClass(), "sumTechMasterHighScore", -3849799601731684461L);
        setLongField(term352024, term352024.getClass(), "sumTechLunaticHighScore", 4585807607649694725L);
        setLongField(term352024, term352024.getClass(), "sumBattleHighScore", 5238726486476915659L);
        setLongField(term352024, term352024.getClass(), "sumBattleBasicHighScore", -5773468670518880993L);
        setLongField(term352024, term352024.getClass(), "sumBattleAdvancedHighScore", 4586971199143136642L);
        setLongField(term352024, term352024.getClass(), "sumBattleExpertHighScore", -2078305193959982177L);
        setLongField(term352024, term352024.getClass(), "sumBattleMasterHighScore", 1878325657589289255L);
        setLongField(term352024, term352024.getClass(), "sumBattleLunaticHighScore", 6404022134702114944L);
        setField(term352024, term352024.getClass(), "eventWatchedDate", "FCcLfFnOVg");
        setField(term352024, term352024.getClass(), "cmEventWatchedDate", "ZZYgsvgmuf");
        setField(term352024, term352024.getClass(), "firstGameId", "ngxVuADmIY");
        setField(term352024, term352024.getClass(), "firstRomVersion", "ssUuyeeEoq");
        setField(term352024, term352024.getClass(), "firstDataVersion", "pBCPwmxjLn");
        setField(term352024, term352024.getClass(), "firstPlayDate", "vzFSOLYWWO");
        setField(term352024, term352024.getClass(), "lastGameId", "hJMNLMicvd");
        setField(term352024, term352024.getClass(), "lastRomVersion", "yFWwQWfrwb");
        setField(term352024, term352024.getClass(), "lastDataVersion", "rfYZjjaWWA");
        setField(term352024, term352024.getClass(), "compatibleCmVersion", "uYAcQFqUxd");
        setField(term352024, term352024.getClass(), "lastPlayDate", "jVBYJmsMWY");
        setIntField(term352024, term352024.getClass(), "lastPlaceId", -276570452);
        setField(term352024, term352024.getClass(), "lastPlaceName", "ZAigNbKlUO");
        setIntField(term352024, term352024.getClass(), "lastRegionId", 1091471325);
        setField(term352024, term352024.getClass(), "lastRegionName", "eTbwUEboBa");
        setIntField(term352024, term352024.getClass(), "lastAllNetId", 861224645);
        setField(term352024, term352024.getClass(), "lastClientId", "yaSaMPsjDH");
        setIntField(term352024, term352024.getClass(), "lastUsedDeckId", -1284524137);
        setIntField(term352024, term352024.getClass(), "lastPlayMusicLevel", -982291940);
        setIntField(term352024, term352024.getClass(), "lastEmoneyBrand", 148549853);
        setField(term352022, term352022.getClass(), "user", term352024);
        setIntField(term352022, term352022.getClass(), "eventId", -948592140);
        setIntField(term352022, term352022.getClass(), "totalTechScore", -1839518509);
        setIntField(term352022, term352022.getClass(), "totalPlatinumScore", 848784413);
        setField(term352022, term352022.getClass(), "techRecordDate", "QYUBTYqmdU");
        setBooleanField(term352022, term352022.getClass(), "isRankingRewarded", false);
        setBooleanField(term352022, term352022.getClass(), "isTotalTechNewRecord", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTechEvent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUser", argTypes, term352022, args);
    }

};


