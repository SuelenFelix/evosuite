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
import java.lang.Long;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Boolean;

public class UserKop_init_206178933124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term282074;
     Object term282076;
     Object term282351;
     Object term282353;
     Object term282355;
     Object term282357;
     Object term282371;

    public UserKop_init_206178933124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term282074 = new Long(-3033319243151298428L);
        Long term282080 = new Long(4628458998884457238L);
        term282076 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term282078 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term282094 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term282095 = newInstance(Class.forName("java.time.LocalDate"));
        Object term282099 = newInstance(Class.forName("java.time.LocalTime"));
        Object term282104 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term282105 = newInstance(Class.forName("java.time.LocalDate"));
        Object term282109 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term282076, term282076.getClass(), "id", -3073562177566779450L);
        setLongField(term282078, term282078.getClass(), "id", 7654993871958953311L);
        setField(term282078, term282078.getClass(), "extId", term282080);
        setField(term282078, term282078.getClass(), "luid", "nbJzmGdHpB");
        setIntField(term282095, term282095.getClass(), "year", 2015);
        setShortField(term282095, term282095.getClass(), "month", (short) 7);
        setShortField(term282095, term282095.getClass(), "day", (short) 4);
        setField(term282094, term282094.getClass(), "date", term282095);
        setByteField(term282099, term282099.getClass(), "hour", (byte) 4);
        setByteField(term282099, term282099.getClass(), "minute", (byte) 41);
        setByteField(term282099, term282099.getClass(), "second", (byte) 48);
        setIntField(term282099, term282099.getClass(), "nano", 900420904);
        setField(term282094, term282094.getClass(), "time", term282099);
        setField(term282078, term282078.getClass(), "registerTime", term282094);
        setIntField(term282105, term282105.getClass(), "year", 2016);
        setShortField(term282105, term282105.getClass(), "month", (short) 12);
        setShortField(term282105, term282105.getClass(), "day", (short) 13);
        setField(term282104, term282104.getClass(), "date", term282105);
        setByteField(term282109, term282109.getClass(), "hour", (byte) 13);
        setByteField(term282109, term282109.getClass(), "minute", (byte) 42);
        setByteField(term282109, term282109.getClass(), "second", (byte) 15);
        setIntField(term282109, term282109.getClass(), "nano", 908878970);
        setField(term282104, term282104.getClass(), "time", term282109);
        setField(term282078, term282078.getClass(), "accessTime", term282104);
        setField(term282076, term282076.getClass(), "card", term282078);
        setField(term282076, term282076.getClass(), "userName", "HxihxzuKfN");
        setIntField(term282076, term282076.getClass(), "level", 1052072083);
        setIntField(term282076, term282076.getClass(), "reincarnationNum", 109527123);
        setLongField(term282076, term282076.getClass(), "exp", -6797779506886917138L);
        setLongField(term282076, term282076.getClass(), "point", 3494672123418516974L);
        setLongField(term282076, term282076.getClass(), "totalPoint", -6057351061947283078L);
        setIntField(term282076, term282076.getClass(), "playCount", -104430065);
        setIntField(term282076, term282076.getClass(), "jewelCount", -1315719378);
        setIntField(term282076, term282076.getClass(), "totalJewelCount", -676341161);
        setIntField(term282076, term282076.getClass(), "medalCount", 1659199645);
        setIntField(term282076, term282076.getClass(), "playerRating", 125450855);
        setIntField(term282076, term282076.getClass(), "highestRating", -522733425);
        setIntField(term282076, term282076.getClass(), "battlePoint", 1372640843);
        setIntField(term282076, term282076.getClass(), "bestBattlePoint", -1716607087);
        setIntField(term282076, term282076.getClass(), "overDamageBattlePoint", -1406941573);
        setBooleanField(term282076, term282076.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term282076, term282076.getClass(), "nameplateId", -422036741);
        setIntField(term282076, term282076.getClass(), "trophyId", 255603992);
        setIntField(term282076, term282076.getClass(), "cardId", 480186865);
        setIntField(term282076, term282076.getClass(), "characterId", 255438967);
        setIntField(term282076, term282076.getClass(), "characterVoiceNo", -871959442);
        setIntField(term282076, term282076.getClass(), "tabSetting", -1297201519);
        setIntField(term282076, term282076.getClass(), "tabSortSetting", -914784517);
        setIntField(term282076, term282076.getClass(), "cardCategorySetting", 798258525);
        setIntField(term282076, term282076.getClass(), "cardSortSetting", 746153151);
        setIntField(term282076, term282076.getClass(), "rivalScoreCategorySetting", -699538920);
        setIntField(term282076, term282076.getClass(), "playedTutorialBit", 516510463);
        setIntField(term282076, term282076.getClass(), "firstTutorialCancelNum", -1973306872);
        setLongField(term282076, term282076.getClass(), "sumTechHighScore", 6519517053532462625L);
        setLongField(term282076, term282076.getClass(), "sumTechBasicHighScore", -2607914607675830014L);
        setLongField(term282076, term282076.getClass(), "sumTechAdvancedHighScore", 1385999878183375758L);
        setLongField(term282076, term282076.getClass(), "sumTechExpertHighScore", 2292335491848752029L);
        setLongField(term282076, term282076.getClass(), "sumTechMasterHighScore", 8766200163245479864L);
        setLongField(term282076, term282076.getClass(), "sumTechLunaticHighScore", -2328570133557997366L);
        setLongField(term282076, term282076.getClass(), "sumBattleHighScore", -7700975853829438829L);
        setLongField(term282076, term282076.getClass(), "sumBattleBasicHighScore", 1396251350319986323L);
        setLongField(term282076, term282076.getClass(), "sumBattleAdvancedHighScore", 7720959499030198599L);
        setLongField(term282076, term282076.getClass(), "sumBattleExpertHighScore", -302115864733317137L);
        setLongField(term282076, term282076.getClass(), "sumBattleMasterHighScore", 6191909925856978228L);
        setLongField(term282076, term282076.getClass(), "sumBattleLunaticHighScore", -1647504565124792984L);
        setField(term282076, term282076.getClass(), "eventWatchedDate", "kenKdxPVfm");
        setField(term282076, term282076.getClass(), "cmEventWatchedDate", "fnztsFUlSX");
        setField(term282076, term282076.getClass(), "firstGameId", "eqAUffwade");
        setField(term282076, term282076.getClass(), "firstRomVersion", "NnRkGusQSv");
        setField(term282076, term282076.getClass(), "firstDataVersion", "psNOiLjLdY");
        setField(term282076, term282076.getClass(), "firstPlayDate", "LMXTwgTyDv");
        setField(term282076, term282076.getClass(), "lastGameId", "OvMjignBZh");
        setField(term282076, term282076.getClass(), "lastRomVersion", "XKohfOxQpG");
        setField(term282076, term282076.getClass(), "lastDataVersion", "vaEqtdWGqW");
        setField(term282076, term282076.getClass(), "compatibleCmVersion", "cSMVydOyqb");
        setField(term282076, term282076.getClass(), "lastPlayDate", "MkvQrFcRTd");
        setIntField(term282076, term282076.getClass(), "lastPlaceId", 1932414041);
        setField(term282076, term282076.getClass(), "lastPlaceName", "QCnYapvzyp");
        setIntField(term282076, term282076.getClass(), "lastRegionId", 919972160);
        setField(term282076, term282076.getClass(), "lastRegionName", "rvxLjNrfDV");
        setIntField(term282076, term282076.getClass(), "lastAllNetId", 1434660658);
        setField(term282076, term282076.getClass(), "lastClientId", "TZWChNggbR");
        setIntField(term282076, term282076.getClass(), "lastUsedDeckId", -1188362131);
        setIntField(term282076, term282076.getClass(), "lastPlayMusicLevel", -1549313487);
        setIntField(term282076, term282076.getClass(), "lastEmoneyBrand", -1858318156);
        term282351 = new Integer(-581381438);
        term282353 = new Integer(-1808491228);
        term282355 = new Integer(379274483);
        term282357 = new Integer(1360925526);
        term282371 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserKop");
        Class<?>[] argTypes = new Class<?>[9];
        argTypes[0] = long.class;
        argTypes[1] = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        argTypes[5] = int.class;
        argTypes[6] = int.class;
        argTypes[7] = Class.forName("java.lang.String");
        argTypes[8] = boolean.class;
        Object[] args = new Object[9];
        args[0] = term282074;
        args[1] = term282076;
        args[2] = "BdVKUioRZB";
        args[3] = term282351;
        args[4] = term282353;
        args[5] = term282355;
        args[6] = term282357;
        args[7] = "KmcVYqMyAn";
        args[8] = term282371;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


