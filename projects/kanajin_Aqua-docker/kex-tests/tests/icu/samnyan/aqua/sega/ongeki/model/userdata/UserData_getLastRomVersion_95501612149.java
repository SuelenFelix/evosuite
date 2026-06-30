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

public class UserData_getLastRomVersion_95501612149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42645;

    public UserData_getLastRomVersion_95501612149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term42649 = new Long(1672578078364590450L);
        term42645 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term42647 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term42663 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term42664 = newInstance(Class.forName("java.time.LocalDate"));
        Object term42668 = newInstance(Class.forName("java.time.LocalTime"));
        Object term42673 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term42674 = newInstance(Class.forName("java.time.LocalDate"));
        Object term42678 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term42645, term42645.getClass(), "id", -3863836475734251469L);
        setLongField(term42647, term42647.getClass(), "id", -490278022171411868L);
        setField(term42647, term42647.getClass(), "extId", term42649);
        setField(term42647, term42647.getClass(), "luid", "jyexiarswN");
        setIntField(term42664, term42664.getClass(), "year", 2016);
        setShortField(term42664, term42664.getClass(), "month", (short) 11);
        setShortField(term42664, term42664.getClass(), "day", (short) 20);
        setField(term42663, term42663.getClass(), "date", term42664);
        setByteField(term42668, term42668.getClass(), "hour", (byte) 17);
        setByteField(term42668, term42668.getClass(), "minute", (byte) 20);
        setByteField(term42668, term42668.getClass(), "second", (byte) 21);
        setIntField(term42668, term42668.getClass(), "nano", 340096364);
        setField(term42663, term42663.getClass(), "time", term42668);
        setField(term42647, term42647.getClass(), "registerTime", term42663);
        setIntField(term42674, term42674.getClass(), "year", 2024);
        setShortField(term42674, term42674.getClass(), "month", (short) 10);
        setShortField(term42674, term42674.getClass(), "day", (short) 28);
        setField(term42673, term42673.getClass(), "date", term42674);
        setByteField(term42678, term42678.getClass(), "hour", (byte) 5);
        setByteField(term42678, term42678.getClass(), "minute", (byte) 13);
        setByteField(term42678, term42678.getClass(), "second", (byte) 51);
        setIntField(term42678, term42678.getClass(), "nano", 605693001);
        setField(term42673, term42673.getClass(), "time", term42678);
        setField(term42647, term42647.getClass(), "accessTime", term42673);
        setField(term42645, term42645.getClass(), "card", term42647);
        setField(term42645, term42645.getClass(), "userName", "ZBLFNFVEHD");
        setIntField(term42645, term42645.getClass(), "level", -1774267288);
        setIntField(term42645, term42645.getClass(), "reincarnationNum", -1394083316);
        setLongField(term42645, term42645.getClass(), "exp", -8013089614220844724L);
        setLongField(term42645, term42645.getClass(), "point", -1719297732277781462L);
        setLongField(term42645, term42645.getClass(), "totalPoint", 2341406897372304425L);
        setIntField(term42645, term42645.getClass(), "playCount", 23814407);
        setIntField(term42645, term42645.getClass(), "jewelCount", 1941438128);
        setIntField(term42645, term42645.getClass(), "totalJewelCount", -418002301);
        setIntField(term42645, term42645.getClass(), "medalCount", 2067599442);
        setIntField(term42645, term42645.getClass(), "playerRating", -335577660);
        setIntField(term42645, term42645.getClass(), "highestRating", 1488144730);
        setIntField(term42645, term42645.getClass(), "battlePoint", -1075257608);
        setIntField(term42645, term42645.getClass(), "bestBattlePoint", -693529847);
        setIntField(term42645, term42645.getClass(), "overDamageBattlePoint", -325187625);
        setBooleanField(term42645, term42645.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term42645, term42645.getClass(), "nameplateId", -317484961);
        setIntField(term42645, term42645.getClass(), "trophyId", 418080259);
        setIntField(term42645, term42645.getClass(), "cardId", 657195865);
        setIntField(term42645, term42645.getClass(), "characterId", 1397647176);
        setIntField(term42645, term42645.getClass(), "characterVoiceNo", -1375675721);
        setIntField(term42645, term42645.getClass(), "tabSetting", 456313553);
        setIntField(term42645, term42645.getClass(), "tabSortSetting", 1636460194);
        setIntField(term42645, term42645.getClass(), "cardCategorySetting", -1926178417);
        setIntField(term42645, term42645.getClass(), "cardSortSetting", -1011180309);
        setIntField(term42645, term42645.getClass(), "rivalScoreCategorySetting", -342719145);
        setIntField(term42645, term42645.getClass(), "playedTutorialBit", 2101766592);
        setIntField(term42645, term42645.getClass(), "firstTutorialCancelNum", 802196878);
        setLongField(term42645, term42645.getClass(), "sumTechHighScore", -2558783251634097471L);
        setLongField(term42645, term42645.getClass(), "sumTechBasicHighScore", -1057119189849263277L);
        setLongField(term42645, term42645.getClass(), "sumTechAdvancedHighScore", -8704154300958772604L);
        setLongField(term42645, term42645.getClass(), "sumTechExpertHighScore", -4450089717153471904L);
        setLongField(term42645, term42645.getClass(), "sumTechMasterHighScore", 8555372807363389523L);
        setLongField(term42645, term42645.getClass(), "sumTechLunaticHighScore", 4135693817001955957L);
        setLongField(term42645, term42645.getClass(), "sumBattleHighScore", -3822804973679381574L);
        setLongField(term42645, term42645.getClass(), "sumBattleBasicHighScore", 8503915599730893579L);
        setLongField(term42645, term42645.getClass(), "sumBattleAdvancedHighScore", 995860001169768274L);
        setLongField(term42645, term42645.getClass(), "sumBattleExpertHighScore", 1369830788516662006L);
        setLongField(term42645, term42645.getClass(), "sumBattleMasterHighScore", 6127011005231905639L);
        setLongField(term42645, term42645.getClass(), "sumBattleLunaticHighScore", -8925131548818125405L);
        setField(term42645, term42645.getClass(), "eventWatchedDate", "miNxpUfOyL");
        setField(term42645, term42645.getClass(), "cmEventWatchedDate", "BAPTojeHRU");
        setField(term42645, term42645.getClass(), "firstGameId", "uqDEIRoVVf");
        setField(term42645, term42645.getClass(), "firstRomVersion", "HnLeZhnLzz");
        setField(term42645, term42645.getClass(), "firstDataVersion", "ziYEsRkZmD");
        setField(term42645, term42645.getClass(), "firstPlayDate", "RFbJNwiLtv");
        setField(term42645, term42645.getClass(), "lastGameId", "eCxWMOpomA");
        setField(term42645, term42645.getClass(), "lastRomVersion", "pkQawlBtEF");
        setField(term42645, term42645.getClass(), "lastDataVersion", "rdKTcvHHnV");
        setField(term42645, term42645.getClass(), "compatibleCmVersion", "ELfUfLbXZf");
        setField(term42645, term42645.getClass(), "lastPlayDate", "SAglaHkagn");
        setIntField(term42645, term42645.getClass(), "lastPlaceId", -174401540);
        setField(term42645, term42645.getClass(), "lastPlaceName", "eZGxUfdoFn");
        setIntField(term42645, term42645.getClass(), "lastRegionId", -1881073314);
        setField(term42645, term42645.getClass(), "lastRegionName", "yCWSlaOrSv");
        setIntField(term42645, term42645.getClass(), "lastAllNetId", -1902513009);
        setField(term42645, term42645.getClass(), "lastClientId", "PFpWKxDIRz");
        setIntField(term42645, term42645.getClass(), "lastUsedDeckId", 1810303681);
        setIntField(term42645, term42645.getClass(), "lastPlayMusicLevel", 1374798468);
        setIntField(term42645, term42645.getClass(), "lastEmoneyBrand", -425364766);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastRomVersion", argTypes, term42645, args);
    }

};


