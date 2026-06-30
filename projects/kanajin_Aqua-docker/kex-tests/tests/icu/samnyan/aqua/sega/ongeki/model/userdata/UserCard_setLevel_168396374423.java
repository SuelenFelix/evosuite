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
import java.lang.Integer;

public class UserCard_setLevel_168396374423 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term124090;
     Object term124435;

    public UserCard_setLevel_168396374423() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term124096 = new Long(-113028659747841511L);
        term124090 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCard"));
        Object term124092 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term124094 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term124110 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term124111 = newInstance(Class.forName("java.time.LocalDate"));
        Object term124115 = newInstance(Class.forName("java.time.LocalTime"));
        Object term124120 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term124121 = newInstance(Class.forName("java.time.LocalDate"));
        Object term124125 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term124090, term124090.getClass(), "id", -2378963352680040291L);
        setLongField(term124092, term124092.getClass(), "id", -1377911535187205603L);
        setLongField(term124094, term124094.getClass(), "id", 1963308211585899148L);
        setField(term124094, term124094.getClass(), "extId", term124096);
        setField(term124094, term124094.getClass(), "luid", "xPXCillnkF");
        setIntField(term124111, term124111.getClass(), "year", 2027);
        setShortField(term124111, term124111.getClass(), "month", (short) 1);
        setShortField(term124111, term124111.getClass(), "day", (short) 12);
        setField(term124110, term124110.getClass(), "date", term124111);
        setByteField(term124115, term124115.getClass(), "hour", (byte) 12);
        setByteField(term124115, term124115.getClass(), "minute", (byte) 12);
        setByteField(term124115, term124115.getClass(), "second", (byte) 21);
        setIntField(term124115, term124115.getClass(), "nano", 77791222);
        setField(term124110, term124110.getClass(), "time", term124115);
        setField(term124094, term124094.getClass(), "registerTime", term124110);
        setIntField(term124121, term124121.getClass(), "year", 2018);
        setShortField(term124121, term124121.getClass(), "month", (short) 8);
        setShortField(term124121, term124121.getClass(), "day", (short) 2);
        setField(term124120, term124120.getClass(), "date", term124121);
        setByteField(term124125, term124125.getClass(), "hour", (byte) 20);
        setByteField(term124125, term124125.getClass(), "minute", (byte) 18);
        setByteField(term124125, term124125.getClass(), "second", (byte) 22);
        setIntField(term124125, term124125.getClass(), "nano", 639407296);
        setField(term124120, term124120.getClass(), "time", term124125);
        setField(term124094, term124094.getClass(), "accessTime", term124120);
        setField(term124092, term124092.getClass(), "card", term124094);
        setField(term124092, term124092.getClass(), "userName", "UQdNECYgYF");
        setIntField(term124092, term124092.getClass(), "level", 2043059296);
        setIntField(term124092, term124092.getClass(), "reincarnationNum", 809100435);
        setLongField(term124092, term124092.getClass(), "exp", 8278765430720560467L);
        setLongField(term124092, term124092.getClass(), "point", -4260909990089519019L);
        setLongField(term124092, term124092.getClass(), "totalPoint", 1281967310215812782L);
        setIntField(term124092, term124092.getClass(), "playCount", -1186136316);
        setIntField(term124092, term124092.getClass(), "jewelCount", -1777720081);
        setIntField(term124092, term124092.getClass(), "totalJewelCount", -21630131);
        setIntField(term124092, term124092.getClass(), "medalCount", -908750386);
        setIntField(term124092, term124092.getClass(), "playerRating", 373886649);
        setIntField(term124092, term124092.getClass(), "highestRating", -2113984384);
        setIntField(term124092, term124092.getClass(), "battlePoint", 900825176);
        setIntField(term124092, term124092.getClass(), "bestBattlePoint", -1078523636);
        setIntField(term124092, term124092.getClass(), "overDamageBattlePoint", -1869767871);
        setBooleanField(term124092, term124092.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term124092, term124092.getClass(), "nameplateId", -1987615511);
        setIntField(term124092, term124092.getClass(), "trophyId", -334279196);
        setIntField(term124092, term124092.getClass(), "cardId", -1801372665);
        setIntField(term124092, term124092.getClass(), "characterId", 149567580);
        setIntField(term124092, term124092.getClass(), "characterVoiceNo", -1027296422);
        setIntField(term124092, term124092.getClass(), "tabSetting", 1436156970);
        setIntField(term124092, term124092.getClass(), "tabSortSetting", 349805322);
        setIntField(term124092, term124092.getClass(), "cardCategorySetting", -1951028737);
        setIntField(term124092, term124092.getClass(), "cardSortSetting", -2088200216);
        setIntField(term124092, term124092.getClass(), "rivalScoreCategorySetting", 808519297);
        setIntField(term124092, term124092.getClass(), "playedTutorialBit", 1331143399);
        setIntField(term124092, term124092.getClass(), "firstTutorialCancelNum", -1736012493);
        setLongField(term124092, term124092.getClass(), "sumTechHighScore", 864110866491888612L);
        setLongField(term124092, term124092.getClass(), "sumTechBasicHighScore", 3004022983377365694L);
        setLongField(term124092, term124092.getClass(), "sumTechAdvancedHighScore", -1695107762872460507L);
        setLongField(term124092, term124092.getClass(), "sumTechExpertHighScore", 4554866694211671215L);
        setLongField(term124092, term124092.getClass(), "sumTechMasterHighScore", -5580225048562225206L);
        setLongField(term124092, term124092.getClass(), "sumTechLunaticHighScore", -884056550987254361L);
        setLongField(term124092, term124092.getClass(), "sumBattleHighScore", 5086155553765900107L);
        setLongField(term124092, term124092.getClass(), "sumBattleBasicHighScore", 702321277312675442L);
        setLongField(term124092, term124092.getClass(), "sumBattleAdvancedHighScore", -4022765571441236178L);
        setLongField(term124092, term124092.getClass(), "sumBattleExpertHighScore", 5580582980694576993L);
        setLongField(term124092, term124092.getClass(), "sumBattleMasterHighScore", -7401749911264099960L);
        setLongField(term124092, term124092.getClass(), "sumBattleLunaticHighScore", 1859360498942648942L);
        setField(term124092, term124092.getClass(), "eventWatchedDate", "tWKRqEdXvq");
        setField(term124092, term124092.getClass(), "cmEventWatchedDate", "IzICHEiRZJ");
        setField(term124092, term124092.getClass(), "firstGameId", "OVdPWRdMle");
        setField(term124092, term124092.getClass(), "firstRomVersion", "oimCfCnzdd");
        setField(term124092, term124092.getClass(), "firstDataVersion", "kDhZwzBdJr");
        setField(term124092, term124092.getClass(), "firstPlayDate", "lGNwldURrK");
        setField(term124092, term124092.getClass(), "lastGameId", "AfRMrnPQsz");
        setField(term124092, term124092.getClass(), "lastRomVersion", "ilHCxxLSlR");
        setField(term124092, term124092.getClass(), "lastDataVersion", "KINWoNPskz");
        setField(term124092, term124092.getClass(), "compatibleCmVersion", "ThcARbQtxE");
        setField(term124092, term124092.getClass(), "lastPlayDate", "zPIvKiioyO");
        setIntField(term124092, term124092.getClass(), "lastPlaceId", 1021379232);
        setField(term124092, term124092.getClass(), "lastPlaceName", "gkpveaZSZa");
        setIntField(term124092, term124092.getClass(), "lastRegionId", 180789471);
        setField(term124092, term124092.getClass(), "lastRegionName", "MJwprBacue");
        setIntField(term124092, term124092.getClass(), "lastAllNetId", -1718954451);
        setField(term124092, term124092.getClass(), "lastClientId", "mpuBHnTLtZ");
        setIntField(term124092, term124092.getClass(), "lastUsedDeckId", 1867721531);
        setIntField(term124092, term124092.getClass(), "lastPlayMusicLevel", -964194849);
        setIntField(term124092, term124092.getClass(), "lastEmoneyBrand", -1558640225);
        setField(term124090, term124090.getClass(), "user", term124092);
        setIntField(term124090, term124090.getClass(), "cardId", -1);
        setIntField(term124090, term124090.getClass(), "digitalStock", 1);
        setIntField(term124090, term124090.getClass(), "analogStock", 1206556058);
        setIntField(term124090, term124090.getClass(), "level", 85515004);
        setIntField(term124090, term124090.getClass(), "maxLevel", 10);
        setIntField(term124090, term124090.getClass(), "exp", 1809173984);
        setIntField(term124090, term124090.getClass(), "printCount", -1649722492);
        setIntField(term124090, term124090.getClass(), "useCount", 1892060110);
        setBooleanField(term124090, term124090.getClass(), "isNew", true);
        setField(term124090, term124090.getClass(), "kaikaDate", "0000-00-00 00:00:00.0");
        setField(term124090, term124090.getClass(), "choKaikaDate", "0000-00-00 00:00:00.0");
        setIntField(term124090, term124090.getClass(), "skillId", -1722968935);
        setBooleanField(term124090, term124090.getClass(), "isAcquired", true);
        setField(term124090, term124090.getClass(), "created", "0000-00-00 00:00:00.0");
        term124435 = new Integer(-352942698);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCard");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term124435;
        callMethod(klass, "setLevel", argTypes, term124090, args);
    }

};


