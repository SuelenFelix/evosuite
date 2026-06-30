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

public class UserTechCount_setId_17702875846 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term364253;
     Object term364521;

    public UserTechCount_setId_17702875846() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term364259 = new Long(7440648013789140935L);
        term364253 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTechCount"));
        Object term364255 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term364257 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term364273 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term364274 = newInstance(Class.forName("java.time.LocalDate"));
        Object term364278 = newInstance(Class.forName("java.time.LocalTime"));
        Object term364283 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term364284 = newInstance(Class.forName("java.time.LocalDate"));
        Object term364288 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term364253, term364253.getClass(), "id", -1723503565092368190L);
        setLongField(term364255, term364255.getClass(), "id", -6301980397486329347L);
        setLongField(term364257, term364257.getClass(), "id", -6568541202296413661L);
        setField(term364257, term364257.getClass(), "extId", term364259);
        setField(term364257, term364257.getClass(), "luid", "hMcQqqWrkI");
        setIntField(term364274, term364274.getClass(), "year", 2029);
        setShortField(term364274, term364274.getClass(), "month", (short) 3);
        setShortField(term364274, term364274.getClass(), "day", (short) 30);
        setField(term364273, term364273.getClass(), "date", term364274);
        setByteField(term364278, term364278.getClass(), "hour", (byte) 10);
        setByteField(term364278, term364278.getClass(), "minute", (byte) 2);
        setByteField(term364278, term364278.getClass(), "second", (byte) 17);
        setIntField(term364278, term364278.getClass(), "nano", 15429109);
        setField(term364273, term364273.getClass(), "time", term364278);
        setField(term364257, term364257.getClass(), "registerTime", term364273);
        setIntField(term364284, term364284.getClass(), "year", 2024);
        setShortField(term364284, term364284.getClass(), "month", (short) 10);
        setShortField(term364284, term364284.getClass(), "day", (short) 1);
        setField(term364283, term364283.getClass(), "date", term364284);
        setByteField(term364288, term364288.getClass(), "hour", (byte) 1);
        setByteField(term364288, term364288.getClass(), "minute", (byte) 25);
        setByteField(term364288, term364288.getClass(), "second", (byte) 24);
        setIntField(term364288, term364288.getClass(), "nano", 259874836);
        setField(term364283, term364283.getClass(), "time", term364288);
        setField(term364257, term364257.getClass(), "accessTime", term364283);
        setField(term364255, term364255.getClass(), "card", term364257);
        setField(term364255, term364255.getClass(), "userName", "VqproKMPaT");
        setIntField(term364255, term364255.getClass(), "level", -167945455);
        setIntField(term364255, term364255.getClass(), "reincarnationNum", 1022373372);
        setLongField(term364255, term364255.getClass(), "exp", -5398302615752409806L);
        setLongField(term364255, term364255.getClass(), "point", 1491745867785358702L);
        setLongField(term364255, term364255.getClass(), "totalPoint", -3340160212318951218L);
        setIntField(term364255, term364255.getClass(), "playCount", 331566565);
        setIntField(term364255, term364255.getClass(), "jewelCount", 1952910560);
        setIntField(term364255, term364255.getClass(), "totalJewelCount", -754679914);
        setIntField(term364255, term364255.getClass(), "medalCount", -1836039127);
        setIntField(term364255, term364255.getClass(), "playerRating", 900689643);
        setIntField(term364255, term364255.getClass(), "highestRating", 1557191728);
        setIntField(term364255, term364255.getClass(), "battlePoint", 754288457);
        setIntField(term364255, term364255.getClass(), "bestBattlePoint", -1696153750);
        setIntField(term364255, term364255.getClass(), "overDamageBattlePoint", 1381561728);
        setBooleanField(term364255, term364255.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term364255, term364255.getClass(), "nameplateId", -591198491);
        setIntField(term364255, term364255.getClass(), "trophyId", 343211420);
        setIntField(term364255, term364255.getClass(), "cardId", 1709998217);
        setIntField(term364255, term364255.getClass(), "characterId", -416343443);
        setIntField(term364255, term364255.getClass(), "characterVoiceNo", -1989993420);
        setIntField(term364255, term364255.getClass(), "tabSetting", 530878700);
        setIntField(term364255, term364255.getClass(), "tabSortSetting", -70855393);
        setIntField(term364255, term364255.getClass(), "cardCategorySetting", 768181416);
        setIntField(term364255, term364255.getClass(), "cardSortSetting", -1184403653);
        setIntField(term364255, term364255.getClass(), "rivalScoreCategorySetting", 1589694421);
        setIntField(term364255, term364255.getClass(), "playedTutorialBit", -1652913061);
        setIntField(term364255, term364255.getClass(), "firstTutorialCancelNum", -1451214652);
        setLongField(term364255, term364255.getClass(), "sumTechHighScore", 3557466612473422221L);
        setLongField(term364255, term364255.getClass(), "sumTechBasicHighScore", -5985572112508752756L);
        setLongField(term364255, term364255.getClass(), "sumTechAdvancedHighScore", -8058502581494643596L);
        setLongField(term364255, term364255.getClass(), "sumTechExpertHighScore", 506136607251885741L);
        setLongField(term364255, term364255.getClass(), "sumTechMasterHighScore", 2494750242359488425L);
        setLongField(term364255, term364255.getClass(), "sumTechLunaticHighScore", 5795513133583859227L);
        setLongField(term364255, term364255.getClass(), "sumBattleHighScore", 3334779283723202823L);
        setLongField(term364255, term364255.getClass(), "sumBattleBasicHighScore", -2702193347922326831L);
        setLongField(term364255, term364255.getClass(), "sumBattleAdvancedHighScore", 1485490246570324926L);
        setLongField(term364255, term364255.getClass(), "sumBattleExpertHighScore", 1902888919925407865L);
        setLongField(term364255, term364255.getClass(), "sumBattleMasterHighScore", -5996222057346902627L);
        setLongField(term364255, term364255.getClass(), "sumBattleLunaticHighScore", -1345419415252015274L);
        setField(term364255, term364255.getClass(), "eventWatchedDate", "rCMXmSGkfG");
        setField(term364255, term364255.getClass(), "cmEventWatchedDate", "OSBwmfgFVY");
        setField(term364255, term364255.getClass(), "firstGameId", "WaKfMegDHZ");
        setField(term364255, term364255.getClass(), "firstRomVersion", "WRabHwyEOz");
        setField(term364255, term364255.getClass(), "firstDataVersion", "KQKXgucNwu");
        setField(term364255, term364255.getClass(), "firstPlayDate", "WXVAvampgb");
        setField(term364255, term364255.getClass(), "lastGameId", "oYTnZefdoa");
        setField(term364255, term364255.getClass(), "lastRomVersion", "NURhqfzHKI");
        setField(term364255, term364255.getClass(), "lastDataVersion", "LnZYsJlUsQ");
        setField(term364255, term364255.getClass(), "compatibleCmVersion", "HSusXQYBHP");
        setField(term364255, term364255.getClass(), "lastPlayDate", "FLPhtvtLOq");
        setIntField(term364255, term364255.getClass(), "lastPlaceId", -1495645335);
        setField(term364255, term364255.getClass(), "lastPlaceName", "cxAGzDzZQN");
        setIntField(term364255, term364255.getClass(), "lastRegionId", -1169365055);
        setField(term364255, term364255.getClass(), "lastRegionName", "kLSNOkINAm");
        setIntField(term364255, term364255.getClass(), "lastAllNetId", 859116546);
        setField(term364255, term364255.getClass(), "lastClientId", "zBRdYuXoYN");
        setIntField(term364255, term364255.getClass(), "lastUsedDeckId", 72256426);
        setIntField(term364255, term364255.getClass(), "lastPlayMusicLevel", 934861597);
        setIntField(term364255, term364255.getClass(), "lastEmoneyBrand", -48023358);
        setField(term364253, term364253.getClass(), "user", term364255);
        setIntField(term364253, term364253.getClass(), "levelId", -1717837386);
        setIntField(term364253, term364253.getClass(), "allBreakCount", 1424362633);
        setIntField(term364253, term364253.getClass(), "allBreakPlusCount", 388123789);
        term364521 = new Long(-2828817039587357549L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTechCount");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term364521;
        callMethod(klass, "setId", argTypes, term364253, args);
    }

};


