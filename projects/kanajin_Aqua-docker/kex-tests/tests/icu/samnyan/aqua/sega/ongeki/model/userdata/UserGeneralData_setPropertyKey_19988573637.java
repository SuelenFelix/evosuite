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

public class UserGeneralData_setPropertyKey_19988573637 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term297452;

    public UserGeneralData_setPropertyKey_19988573637() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term297458 = new Long(7199459243454109261L);
        term297452 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserGeneralData"));
        Object term297454 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term297456 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term297472 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term297473 = newInstance(Class.forName("java.time.LocalDate"));
        Object term297477 = newInstance(Class.forName("java.time.LocalTime"));
        Object term297482 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term297483 = newInstance(Class.forName("java.time.LocalDate"));
        Object term297487 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term297452, term297452.getClass(), "id", 4567132761902689298L);
        setLongField(term297454, term297454.getClass(), "id", -2925405021052298133L);
        setLongField(term297456, term297456.getClass(), "id", -2712793510753791797L);
        setField(term297456, term297456.getClass(), "extId", term297458);
        setField(term297456, term297456.getClass(), "luid", "SzBvOdpmGj");
        setIntField(term297473, term297473.getClass(), "year", 2016);
        setShortField(term297473, term297473.getClass(), "month", (short) 10);
        setShortField(term297473, term297473.getClass(), "day", (short) 2);
        setField(term297472, term297472.getClass(), "date", term297473);
        setByteField(term297477, term297477.getClass(), "hour", (byte) 0);
        setByteField(term297477, term297477.getClass(), "minute", (byte) 16);
        setByteField(term297477, term297477.getClass(), "second", (byte) 21);
        setIntField(term297477, term297477.getClass(), "nano", 353747821);
        setField(term297472, term297472.getClass(), "time", term297477);
        setField(term297456, term297456.getClass(), "registerTime", term297472);
        setIntField(term297483, term297483.getClass(), "year", 2021);
        setShortField(term297483, term297483.getClass(), "month", (short) 4);
        setShortField(term297483, term297483.getClass(), "day", (short) 26);
        setField(term297482, term297482.getClass(), "date", term297483);
        setByteField(term297487, term297487.getClass(), "hour", (byte) 1);
        setByteField(term297487, term297487.getClass(), "minute", (byte) 51);
        setByteField(term297487, term297487.getClass(), "second", (byte) 48);
        setIntField(term297487, term297487.getClass(), "nano", 602595192);
        setField(term297482, term297482.getClass(), "time", term297487);
        setField(term297456, term297456.getClass(), "accessTime", term297482);
        setField(term297454, term297454.getClass(), "card", term297456);
        setField(term297454, term297454.getClass(), "userName", "hyIqGTzCGV");
        setIntField(term297454, term297454.getClass(), "level", 637765414);
        setIntField(term297454, term297454.getClass(), "reincarnationNum", 341721275);
        setLongField(term297454, term297454.getClass(), "exp", -1168545945502857273L);
        setLongField(term297454, term297454.getClass(), "point", 1789620383911849622L);
        setLongField(term297454, term297454.getClass(), "totalPoint", -6147918430310783222L);
        setIntField(term297454, term297454.getClass(), "playCount", -936249939);
        setIntField(term297454, term297454.getClass(), "jewelCount", 1285532045);
        setIntField(term297454, term297454.getClass(), "totalJewelCount", 52440432);
        setIntField(term297454, term297454.getClass(), "medalCount", -1179855015);
        setIntField(term297454, term297454.getClass(), "playerRating", -37998348);
        setIntField(term297454, term297454.getClass(), "highestRating", -2096674239);
        setIntField(term297454, term297454.getClass(), "battlePoint", -745127430);
        setIntField(term297454, term297454.getClass(), "bestBattlePoint", 341777835);
        setIntField(term297454, term297454.getClass(), "overDamageBattlePoint", 1817987123);
        setBooleanField(term297454, term297454.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term297454, term297454.getClass(), "nameplateId", -915521999);
        setIntField(term297454, term297454.getClass(), "trophyId", 1356209871);
        setIntField(term297454, term297454.getClass(), "cardId", 1462296562);
        setIntField(term297454, term297454.getClass(), "characterId", -1473967340);
        setIntField(term297454, term297454.getClass(), "characterVoiceNo", 1531531350);
        setIntField(term297454, term297454.getClass(), "tabSetting", 1820921426);
        setIntField(term297454, term297454.getClass(), "tabSortSetting", 633768322);
        setIntField(term297454, term297454.getClass(), "cardCategorySetting", -1140895757);
        setIntField(term297454, term297454.getClass(), "cardSortSetting", 1459964684);
        setIntField(term297454, term297454.getClass(), "rivalScoreCategorySetting", 171708543);
        setIntField(term297454, term297454.getClass(), "playedTutorialBit", -492946763);
        setIntField(term297454, term297454.getClass(), "firstTutorialCancelNum", -974551871);
        setLongField(term297454, term297454.getClass(), "sumTechHighScore", 748634425534675766L);
        setLongField(term297454, term297454.getClass(), "sumTechBasicHighScore", 5363099505968981338L);
        setLongField(term297454, term297454.getClass(), "sumTechAdvancedHighScore", 6218478191633520410L);
        setLongField(term297454, term297454.getClass(), "sumTechExpertHighScore", -8353542237593884415L);
        setLongField(term297454, term297454.getClass(), "sumTechMasterHighScore", 4614613761541219298L);
        setLongField(term297454, term297454.getClass(), "sumTechLunaticHighScore", 8152605273814235029L);
        setLongField(term297454, term297454.getClass(), "sumBattleHighScore", 408357831214513953L);
        setLongField(term297454, term297454.getClass(), "sumBattleBasicHighScore", 2187537437811652696L);
        setLongField(term297454, term297454.getClass(), "sumBattleAdvancedHighScore", -1257473999077022364L);
        setLongField(term297454, term297454.getClass(), "sumBattleExpertHighScore", 2222099848815556833L);
        setLongField(term297454, term297454.getClass(), "sumBattleMasterHighScore", -6931210091729206925L);
        setLongField(term297454, term297454.getClass(), "sumBattleLunaticHighScore", 2005529713300428795L);
        setField(term297454, term297454.getClass(), "eventWatchedDate", "neTMUkKvtF");
        setField(term297454, term297454.getClass(), "cmEventWatchedDate", "gOcGTGkmIA");
        setField(term297454, term297454.getClass(), "firstGameId", "aIdjgZqQLf");
        setField(term297454, term297454.getClass(), "firstRomVersion", "SzZxkTtjzT");
        setField(term297454, term297454.getClass(), "firstDataVersion", "bqUMcVqQmH");
        setField(term297454, term297454.getClass(), "firstPlayDate", "xhUxsrKBUI");
        setField(term297454, term297454.getClass(), "lastGameId", "QcmKptYrXb");
        setField(term297454, term297454.getClass(), "lastRomVersion", "KMNJwsKaEB");
        setField(term297454, term297454.getClass(), "lastDataVersion", "lUahSCHKNx");
        setField(term297454, term297454.getClass(), "compatibleCmVersion", "LElfnxAXwr");
        setField(term297454, term297454.getClass(), "lastPlayDate", "hlySbLstOL");
        setIntField(term297454, term297454.getClass(), "lastPlaceId", -1418428118);
        setField(term297454, term297454.getClass(), "lastPlaceName", "BrhgoDPjVB");
        setIntField(term297454, term297454.getClass(), "lastRegionId", 916140150);
        setField(term297454, term297454.getClass(), "lastRegionName", "KtxsyuscWG");
        setIntField(term297454, term297454.getClass(), "lastAllNetId", -813184479);
        setField(term297454, term297454.getClass(), "lastClientId", "CBimniZbgp");
        setIntField(term297454, term297454.getClass(), "lastUsedDeckId", -786109908);
        setIntField(term297454, term297454.getClass(), "lastPlayMusicLevel", 1566790738);
        setIntField(term297454, term297454.getClass(), "lastEmoneyBrand", -439472582);
        setField(term297452, term297452.getClass(), "user", term297454);
        setField(term297452, term297452.getClass(), "propertyKey", "FeoAVnPhfg");
        setField(term297452, term297452.getClass(), "propertyValue", "fTlWYYPrKH");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserGeneralData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "mfXnrMabia";
        callMethod(klass, "setPropertyKey", argTypes, term297452, args);
    }

};


