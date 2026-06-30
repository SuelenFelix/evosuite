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

public class UserCard_canEqual_9231426735 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term130989;
     Object term131334;

    public UserCard_canEqual_9231426735() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term130995 = new Long(6130232388739280211L);
        term130989 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCard"));
        Object term130991 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term130993 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term131009 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term131010 = newInstance(Class.forName("java.time.LocalDate"));
        Object term131014 = newInstance(Class.forName("java.time.LocalTime"));
        Object term131019 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term131020 = newInstance(Class.forName("java.time.LocalDate"));
        Object term131024 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term130989, term130989.getClass(), "id", 6676891053568832868L);
        setLongField(term130991, term130991.getClass(), "id", 5962698858102688917L);
        setLongField(term130993, term130993.getClass(), "id", -5274741475814951610L);
        setField(term130993, term130993.getClass(), "extId", term130995);
        setField(term130993, term130993.getClass(), "luid", "oQFejbSARv");
        setIntField(term131010, term131010.getClass(), "year", 2022);
        setShortField(term131010, term131010.getClass(), "month", (short) 9);
        setShortField(term131010, term131010.getClass(), "day", (short) 13);
        setField(term131009, term131009.getClass(), "date", term131010);
        setByteField(term131014, term131014.getClass(), "hour", (byte) 3);
        setByteField(term131014, term131014.getClass(), "minute", (byte) 50);
        setByteField(term131014, term131014.getClass(), "second", (byte) 35);
        setIntField(term131014, term131014.getClass(), "nano", 260929854);
        setField(term131009, term131009.getClass(), "time", term131014);
        setField(term130993, term130993.getClass(), "registerTime", term131009);
        setIntField(term131020, term131020.getClass(), "year", 2022);
        setShortField(term131020, term131020.getClass(), "month", (short) 4);
        setShortField(term131020, term131020.getClass(), "day", (short) 7);
        setField(term131019, term131019.getClass(), "date", term131020);
        setByteField(term131024, term131024.getClass(), "hour", (byte) 8);
        setByteField(term131024, term131024.getClass(), "minute", (byte) 56);
        setByteField(term131024, term131024.getClass(), "second", (byte) 3);
        setIntField(term131024, term131024.getClass(), "nano", 496160001);
        setField(term131019, term131019.getClass(), "time", term131024);
        setField(term130993, term130993.getClass(), "accessTime", term131019);
        setField(term130991, term130991.getClass(), "card", term130993);
        setField(term130991, term130991.getClass(), "userName", "DzSvjuoClh");
        setIntField(term130991, term130991.getClass(), "level", -335338628);
        setIntField(term130991, term130991.getClass(), "reincarnationNum", 1539132721);
        setLongField(term130991, term130991.getClass(), "exp", -1935747502297184570L);
        setLongField(term130991, term130991.getClass(), "point", -1115974966771297534L);
        setLongField(term130991, term130991.getClass(), "totalPoint", -8480074625739823751L);
        setIntField(term130991, term130991.getClass(), "playCount", -564177085);
        setIntField(term130991, term130991.getClass(), "jewelCount", 1951006294);
        setIntField(term130991, term130991.getClass(), "totalJewelCount", 315490614);
        setIntField(term130991, term130991.getClass(), "medalCount", -181204804);
        setIntField(term130991, term130991.getClass(), "playerRating", 2073462223);
        setIntField(term130991, term130991.getClass(), "highestRating", 509141438);
        setIntField(term130991, term130991.getClass(), "battlePoint", 55918608);
        setIntField(term130991, term130991.getClass(), "bestBattlePoint", 1863053491);
        setIntField(term130991, term130991.getClass(), "overDamageBattlePoint", 1569101532);
        setBooleanField(term130991, term130991.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term130991, term130991.getClass(), "nameplateId", -1825428555);
        setIntField(term130991, term130991.getClass(), "trophyId", 2124679916);
        setIntField(term130991, term130991.getClass(), "cardId", -1587529994);
        setIntField(term130991, term130991.getClass(), "characterId", -214529845);
        setIntField(term130991, term130991.getClass(), "characterVoiceNo", 684495339);
        setIntField(term130991, term130991.getClass(), "tabSetting", 361364617);
        setIntField(term130991, term130991.getClass(), "tabSortSetting", -132332846);
        setIntField(term130991, term130991.getClass(), "cardCategorySetting", -160055040);
        setIntField(term130991, term130991.getClass(), "cardSortSetting", 7043168);
        setIntField(term130991, term130991.getClass(), "rivalScoreCategorySetting", 2007440099);
        setIntField(term130991, term130991.getClass(), "playedTutorialBit", 1462309526);
        setIntField(term130991, term130991.getClass(), "firstTutorialCancelNum", -451407895);
        setLongField(term130991, term130991.getClass(), "sumTechHighScore", 3845756509074397545L);
        setLongField(term130991, term130991.getClass(), "sumTechBasicHighScore", -8990478070439661478L);
        setLongField(term130991, term130991.getClass(), "sumTechAdvancedHighScore", 8447253874124151417L);
        setLongField(term130991, term130991.getClass(), "sumTechExpertHighScore", 576054595696591965L);
        setLongField(term130991, term130991.getClass(), "sumTechMasterHighScore", -1307471244279084505L);
        setLongField(term130991, term130991.getClass(), "sumTechLunaticHighScore", 4099470012856890917L);
        setLongField(term130991, term130991.getClass(), "sumBattleHighScore", -3403340174287273634L);
        setLongField(term130991, term130991.getClass(), "sumBattleBasicHighScore", 6769911770463090345L);
        setLongField(term130991, term130991.getClass(), "sumBattleAdvancedHighScore", -5006360652769891001L);
        setLongField(term130991, term130991.getClass(), "sumBattleExpertHighScore", 6339968460314730005L);
        setLongField(term130991, term130991.getClass(), "sumBattleMasterHighScore", 1051202900428385995L);
        setLongField(term130991, term130991.getClass(), "sumBattleLunaticHighScore", 7911824389949685997L);
        setField(term130991, term130991.getClass(), "eventWatchedDate", "mKfcJwCzHA");
        setField(term130991, term130991.getClass(), "cmEventWatchedDate", "aAolDGKlZL");
        setField(term130991, term130991.getClass(), "firstGameId", "QowFnXBGSJ");
        setField(term130991, term130991.getClass(), "firstRomVersion", "KZIClWErQV");
        setField(term130991, term130991.getClass(), "firstDataVersion", "NlMAkCBTMT");
        setField(term130991, term130991.getClass(), "firstPlayDate", "OZIAupXzmm");
        setField(term130991, term130991.getClass(), "lastGameId", "FYhlObvAKO");
        setField(term130991, term130991.getClass(), "lastRomVersion", "GFxNoBwsCD");
        setField(term130991, term130991.getClass(), "lastDataVersion", "zBVQNMxMvk");
        setField(term130991, term130991.getClass(), "compatibleCmVersion", "iJSPWddhZO");
        setField(term130991, term130991.getClass(), "lastPlayDate", "WbvttDefvl");
        setIntField(term130991, term130991.getClass(), "lastPlaceId", -1132970218);
        setField(term130991, term130991.getClass(), "lastPlaceName", "coNhvymEkq");
        setIntField(term130991, term130991.getClass(), "lastRegionId", -693000999);
        setField(term130991, term130991.getClass(), "lastRegionName", "dMuXJftgrw");
        setIntField(term130991, term130991.getClass(), "lastAllNetId", -518970778);
        setField(term130991, term130991.getClass(), "lastClientId", "INNyzaqXFS");
        setIntField(term130991, term130991.getClass(), "lastUsedDeckId", -534810305);
        setIntField(term130991, term130991.getClass(), "lastPlayMusicLevel", 1052129031);
        setIntField(term130991, term130991.getClass(), "lastEmoneyBrand", -107440624);
        setField(term130989, term130989.getClass(), "user", term130991);
        setIntField(term130989, term130989.getClass(), "cardId", -1);
        setIntField(term130989, term130989.getClass(), "digitalStock", 1);
        setIntField(term130989, term130989.getClass(), "analogStock", 1835428942);
        setIntField(term130989, term130989.getClass(), "level", -1551168372);
        setIntField(term130989, term130989.getClass(), "maxLevel", 10);
        setIntField(term130989, term130989.getClass(), "exp", 395080281);
        setIntField(term130989, term130989.getClass(), "printCount", -135265001);
        setIntField(term130989, term130989.getClass(), "useCount", -1280813670);
        setBooleanField(term130989, term130989.getClass(), "isNew", true);
        setField(term130989, term130989.getClass(), "kaikaDate", "0000-00-00 00:00:00.0");
        setField(term130989, term130989.getClass(), "choKaikaDate", "0000-00-00 00:00:00.0");
        setIntField(term130989, term130989.getClass(), "skillId", 1056389612);
        setBooleanField(term130989, term130989.getClass(), "isAcquired", true);
        setField(term130989, term130989.getClass(), "created", "0000-00-00 00:00:00.0");
        term131334 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCard");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term131334;
        callMethod(klass, "canEqual", argTypes, term130989, args);
    }

};


