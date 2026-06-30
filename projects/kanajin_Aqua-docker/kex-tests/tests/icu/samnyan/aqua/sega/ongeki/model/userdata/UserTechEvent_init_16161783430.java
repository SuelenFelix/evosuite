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

public class UserTechEvent_init_16161783430 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term351147;

    public UserTechEvent_init_16161783430() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term351151 = new Long(1924411240174876881L);
        term351147 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term351149 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term351165 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term351166 = newInstance(Class.forName("java.time.LocalDate"));
        Object term351170 = newInstance(Class.forName("java.time.LocalTime"));
        Object term351175 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term351176 = newInstance(Class.forName("java.time.LocalDate"));
        Object term351180 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term351147, term351147.getClass(), "id", -693410437029680344L);
        setLongField(term351149, term351149.getClass(), "id", 3826456250520250685L);
        setField(term351149, term351149.getClass(), "extId", term351151);
        setField(term351149, term351149.getClass(), "luid", "pAmUpWsLXv");
        setIntField(term351166, term351166.getClass(), "year", 2020);
        setShortField(term351166, term351166.getClass(), "month", (short) 8);
        setShortField(term351166, term351166.getClass(), "day", (short) 23);
        setField(term351165, term351165.getClass(), "date", term351166);
        setByteField(term351170, term351170.getClass(), "hour", (byte) 22);
        setByteField(term351170, term351170.getClass(), "minute", (byte) 19);
        setByteField(term351170, term351170.getClass(), "second", (byte) 9);
        setIntField(term351170, term351170.getClass(), "nano", 356061612);
        setField(term351165, term351165.getClass(), "time", term351170);
        setField(term351149, term351149.getClass(), "registerTime", term351165);
        setIntField(term351176, term351176.getClass(), "year", 2025);
        setShortField(term351176, term351176.getClass(), "month", (short) 7);
        setShortField(term351176, term351176.getClass(), "day", (short) 31);
        setField(term351175, term351175.getClass(), "date", term351176);
        setByteField(term351180, term351180.getClass(), "hour", (byte) 8);
        setByteField(term351180, term351180.getClass(), "minute", (byte) 27);
        setByteField(term351180, term351180.getClass(), "second", (byte) 32);
        setIntField(term351180, term351180.getClass(), "nano", 822056119);
        setField(term351175, term351175.getClass(), "time", term351180);
        setField(term351149, term351149.getClass(), "accessTime", term351175);
        setField(term351147, term351147.getClass(), "card", term351149);
        setField(term351147, term351147.getClass(), "userName", "ZucPDUiZpC");
        setIntField(term351147, term351147.getClass(), "level", -876662610);
        setIntField(term351147, term351147.getClass(), "reincarnationNum", -1546908568);
        setLongField(term351147, term351147.getClass(), "exp", 5324627202990196878L);
        setLongField(term351147, term351147.getClass(), "point", 5179324161193360035L);
        setLongField(term351147, term351147.getClass(), "totalPoint", -885816947369113790L);
        setIntField(term351147, term351147.getClass(), "playCount", -2021174489);
        setIntField(term351147, term351147.getClass(), "jewelCount", -634825256);
        setIntField(term351147, term351147.getClass(), "totalJewelCount", -207676653);
        setIntField(term351147, term351147.getClass(), "medalCount", 807356841);
        setIntField(term351147, term351147.getClass(), "playerRating", 983766145);
        setIntField(term351147, term351147.getClass(), "highestRating", 489648419);
        setIntField(term351147, term351147.getClass(), "battlePoint", -1151891319);
        setIntField(term351147, term351147.getClass(), "bestBattlePoint", -1469426711);
        setIntField(term351147, term351147.getClass(), "overDamageBattlePoint", -2062350891);
        setBooleanField(term351147, term351147.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term351147, term351147.getClass(), "nameplateId", -61610287);
        setIntField(term351147, term351147.getClass(), "trophyId", -130947643);
        setIntField(term351147, term351147.getClass(), "cardId", 1961190444);
        setIntField(term351147, term351147.getClass(), "characterId", 66534572);
        setIntField(term351147, term351147.getClass(), "characterVoiceNo", -400700059);
        setIntField(term351147, term351147.getClass(), "tabSetting", -883041544);
        setIntField(term351147, term351147.getClass(), "tabSortSetting", -1693230043);
        setIntField(term351147, term351147.getClass(), "cardCategorySetting", 1021914688);
        setIntField(term351147, term351147.getClass(), "cardSortSetting", -2052966052);
        setIntField(term351147, term351147.getClass(), "rivalScoreCategorySetting", -251118454);
        setIntField(term351147, term351147.getClass(), "playedTutorialBit", 79166172);
        setIntField(term351147, term351147.getClass(), "firstTutorialCancelNum", -951357105);
        setLongField(term351147, term351147.getClass(), "sumTechHighScore", 4495739305875213360L);
        setLongField(term351147, term351147.getClass(), "sumTechBasicHighScore", 3447998273572828130L);
        setLongField(term351147, term351147.getClass(), "sumTechAdvancedHighScore", 7478898989635046318L);
        setLongField(term351147, term351147.getClass(), "sumTechExpertHighScore", 7444417603124164235L);
        setLongField(term351147, term351147.getClass(), "sumTechMasterHighScore", 125960923897038685L);
        setLongField(term351147, term351147.getClass(), "sumTechLunaticHighScore", -5431129108295834023L);
        setLongField(term351147, term351147.getClass(), "sumBattleHighScore", 5712554633943553814L);
        setLongField(term351147, term351147.getClass(), "sumBattleBasicHighScore", -5483079949394620114L);
        setLongField(term351147, term351147.getClass(), "sumBattleAdvancedHighScore", -3268241208636935246L);
        setLongField(term351147, term351147.getClass(), "sumBattleExpertHighScore", 5955726063420259251L);
        setLongField(term351147, term351147.getClass(), "sumBattleMasterHighScore", -1458973148390629204L);
        setLongField(term351147, term351147.getClass(), "sumBattleLunaticHighScore", -2253977061714436708L);
        setField(term351147, term351147.getClass(), "eventWatchedDate", "RgQKSzsInA");
        setField(term351147, term351147.getClass(), "cmEventWatchedDate", "asnyzKvzil");
        setField(term351147, term351147.getClass(), "firstGameId", "DRMYgRZLeO");
        setField(term351147, term351147.getClass(), "firstRomVersion", "yVdYaOoNuz");
        setField(term351147, term351147.getClass(), "firstDataVersion", "viKTALSmVg");
        setField(term351147, term351147.getClass(), "firstPlayDate", "KeNjGpNHJa");
        setField(term351147, term351147.getClass(), "lastGameId", "BoYXXyHcMJ");
        setField(term351147, term351147.getClass(), "lastRomVersion", "BviqbLXTPZ");
        setField(term351147, term351147.getClass(), "lastDataVersion", "FwyFCiPSrm");
        setField(term351147, term351147.getClass(), "compatibleCmVersion", "KUcTWyEqgi");
        setField(term351147, term351147.getClass(), "lastPlayDate", "IymNZoTRUi");
        setIntField(term351147, term351147.getClass(), "lastPlaceId", 1963867246);
        setField(term351147, term351147.getClass(), "lastPlaceName", "rFZEHjvgcB");
        setIntField(term351147, term351147.getClass(), "lastRegionId", -1893477627);
        setField(term351147, term351147.getClass(), "lastRegionName", "nFmrYjVqEL");
        setIntField(term351147, term351147.getClass(), "lastAllNetId", -605407350);
        setField(term351147, term351147.getClass(), "lastClientId", "PlOCkYkhbh");
        setIntField(term351147, term351147.getClass(), "lastUsedDeckId", 2146650417);
        setIntField(term351147, term351147.getClass(), "lastPlayMusicLevel", 842732819);
        setIntField(term351147, term351147.getClass(), "lastEmoneyBrand", 1021455955);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTechEvent");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Object[] args = new Object[1];
        args[0] = term351147;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


