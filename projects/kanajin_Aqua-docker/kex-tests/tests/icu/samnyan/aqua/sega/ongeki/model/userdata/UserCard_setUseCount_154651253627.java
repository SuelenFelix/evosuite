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

public class UserCard_setUseCount_154651253627 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term126370;
     Object term126715;

    public UserCard_setUseCount_154651253627() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term126376 = new Long(-6969704322644192945L);
        term126370 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCard"));
        Object term126372 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term126374 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term126390 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term126391 = newInstance(Class.forName("java.time.LocalDate"));
        Object term126395 = newInstance(Class.forName("java.time.LocalTime"));
        Object term126400 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term126401 = newInstance(Class.forName("java.time.LocalDate"));
        Object term126405 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term126370, term126370.getClass(), "id", -778783496569950771L);
        setLongField(term126372, term126372.getClass(), "id", 219030081880094853L);
        setLongField(term126374, term126374.getClass(), "id", -5378368160931631383L);
        setField(term126374, term126374.getClass(), "extId", term126376);
        setField(term126374, term126374.getClass(), "luid", "DOCvwqbYDn");
        setIntField(term126391, term126391.getClass(), "year", 2017);
        setShortField(term126391, term126391.getClass(), "month", (short) 10);
        setShortField(term126391, term126391.getClass(), "day", (short) 10);
        setField(term126390, term126390.getClass(), "date", term126391);
        setByteField(term126395, term126395.getClass(), "hour", (byte) 18);
        setByteField(term126395, term126395.getClass(), "minute", (byte) 16);
        setByteField(term126395, term126395.getClass(), "second", (byte) 29);
        setIntField(term126395, term126395.getClass(), "nano", 468943994);
        setField(term126390, term126390.getClass(), "time", term126395);
        setField(term126374, term126374.getClass(), "registerTime", term126390);
        setIntField(term126401, term126401.getClass(), "year", 2029);
        setShortField(term126401, term126401.getClass(), "month", (short) 3);
        setShortField(term126401, term126401.getClass(), "day", (short) 21);
        setField(term126400, term126400.getClass(), "date", term126401);
        setByteField(term126405, term126405.getClass(), "hour", (byte) 12);
        setByteField(term126405, term126405.getClass(), "minute", (byte) 42);
        setByteField(term126405, term126405.getClass(), "second", (byte) 52);
        setIntField(term126405, term126405.getClass(), "nano", 391302765);
        setField(term126400, term126400.getClass(), "time", term126405);
        setField(term126374, term126374.getClass(), "accessTime", term126400);
        setField(term126372, term126372.getClass(), "card", term126374);
        setField(term126372, term126372.getClass(), "userName", "mnqceiHjKv");
        setIntField(term126372, term126372.getClass(), "level", -1079036443);
        setIntField(term126372, term126372.getClass(), "reincarnationNum", -1417718040);
        setLongField(term126372, term126372.getClass(), "exp", 1617352011767593477L);
        setLongField(term126372, term126372.getClass(), "point", -6812894659999570299L);
        setLongField(term126372, term126372.getClass(), "totalPoint", -6612720630083569967L);
        setIntField(term126372, term126372.getClass(), "playCount", 18353300);
        setIntField(term126372, term126372.getClass(), "jewelCount", 1452754173);
        setIntField(term126372, term126372.getClass(), "totalJewelCount", 1189377206);
        setIntField(term126372, term126372.getClass(), "medalCount", -748230577);
        setIntField(term126372, term126372.getClass(), "playerRating", 1467449226);
        setIntField(term126372, term126372.getClass(), "highestRating", 1200062192);
        setIntField(term126372, term126372.getClass(), "battlePoint", -380394398);
        setIntField(term126372, term126372.getClass(), "bestBattlePoint", -1610784102);
        setIntField(term126372, term126372.getClass(), "overDamageBattlePoint", -1370330753);
        setBooleanField(term126372, term126372.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term126372, term126372.getClass(), "nameplateId", 344676776);
        setIntField(term126372, term126372.getClass(), "trophyId", -1435671539);
        setIntField(term126372, term126372.getClass(), "cardId", 1697936302);
        setIntField(term126372, term126372.getClass(), "characterId", 1944775515);
        setIntField(term126372, term126372.getClass(), "characterVoiceNo", -1473667383);
        setIntField(term126372, term126372.getClass(), "tabSetting", -19932223);
        setIntField(term126372, term126372.getClass(), "tabSortSetting", 1845280212);
        setIntField(term126372, term126372.getClass(), "cardCategorySetting", -308191283);
        setIntField(term126372, term126372.getClass(), "cardSortSetting", -1623247571);
        setIntField(term126372, term126372.getClass(), "rivalScoreCategorySetting", 43547318);
        setIntField(term126372, term126372.getClass(), "playedTutorialBit", -323685716);
        setIntField(term126372, term126372.getClass(), "firstTutorialCancelNum", -630584026);
        setLongField(term126372, term126372.getClass(), "sumTechHighScore", -1463274807294281745L);
        setLongField(term126372, term126372.getClass(), "sumTechBasicHighScore", -7360567020426727871L);
        setLongField(term126372, term126372.getClass(), "sumTechAdvancedHighScore", -4951152440659224698L);
        setLongField(term126372, term126372.getClass(), "sumTechExpertHighScore", 4622054980510220760L);
        setLongField(term126372, term126372.getClass(), "sumTechMasterHighScore", -1813058512304462983L);
        setLongField(term126372, term126372.getClass(), "sumTechLunaticHighScore", 6715113961014724007L);
        setLongField(term126372, term126372.getClass(), "sumBattleHighScore", 8138569655289283796L);
        setLongField(term126372, term126372.getClass(), "sumBattleBasicHighScore", 8486341158857732851L);
        setLongField(term126372, term126372.getClass(), "sumBattleAdvancedHighScore", -1841431837058507587L);
        setLongField(term126372, term126372.getClass(), "sumBattleExpertHighScore", -4793727605259755243L);
        setLongField(term126372, term126372.getClass(), "sumBattleMasterHighScore", -3961732186218757638L);
        setLongField(term126372, term126372.getClass(), "sumBattleLunaticHighScore", 7542972100796672161L);
        setField(term126372, term126372.getClass(), "eventWatchedDate", "AsVDXoZoBU");
        setField(term126372, term126372.getClass(), "cmEventWatchedDate", "cPxpxZMgIo");
        setField(term126372, term126372.getClass(), "firstGameId", "uWtOISrfeA");
        setField(term126372, term126372.getClass(), "firstRomVersion", "tYlSzqLqvb");
        setField(term126372, term126372.getClass(), "firstDataVersion", "GzeLmNKDuY");
        setField(term126372, term126372.getClass(), "firstPlayDate", "hPPpARaLPc");
        setField(term126372, term126372.getClass(), "lastGameId", "DtBDapYLSe");
        setField(term126372, term126372.getClass(), "lastRomVersion", "PrJzEmEvlo");
        setField(term126372, term126372.getClass(), "lastDataVersion", "DWGWVuqpug");
        setField(term126372, term126372.getClass(), "compatibleCmVersion", "MCSpZrEsbC");
        setField(term126372, term126372.getClass(), "lastPlayDate", "HisKZVFThP");
        setIntField(term126372, term126372.getClass(), "lastPlaceId", -383863049);
        setField(term126372, term126372.getClass(), "lastPlaceName", "aYnflhXuDg");
        setIntField(term126372, term126372.getClass(), "lastRegionId", -1172515373);
        setField(term126372, term126372.getClass(), "lastRegionName", "CfykLOhTuP");
        setIntField(term126372, term126372.getClass(), "lastAllNetId", 997927264);
        setField(term126372, term126372.getClass(), "lastClientId", "pGIHyjmseT");
        setIntField(term126372, term126372.getClass(), "lastUsedDeckId", 2027000196);
        setIntField(term126372, term126372.getClass(), "lastPlayMusicLevel", 969594087);
        setIntField(term126372, term126372.getClass(), "lastEmoneyBrand", -1821087116);
        setField(term126370, term126370.getClass(), "user", term126372);
        setIntField(term126370, term126370.getClass(), "cardId", -1);
        setIntField(term126370, term126370.getClass(), "digitalStock", 1);
        setIntField(term126370, term126370.getClass(), "analogStock", 1300292635);
        setIntField(term126370, term126370.getClass(), "level", -476484302);
        setIntField(term126370, term126370.getClass(), "maxLevel", 10);
        setIntField(term126370, term126370.getClass(), "exp", 1763908335);
        setIntField(term126370, term126370.getClass(), "printCount", -1248507539);
        setIntField(term126370, term126370.getClass(), "useCount", 1066760380);
        setBooleanField(term126370, term126370.getClass(), "isNew", true);
        setField(term126370, term126370.getClass(), "kaikaDate", "0000-00-00 00:00:00.0");
        setField(term126370, term126370.getClass(), "choKaikaDate", "0000-00-00 00:00:00.0");
        setIntField(term126370, term126370.getClass(), "skillId", -1800908977);
        setBooleanField(term126370, term126370.getClass(), "isAcquired", true);
        setField(term126370, term126370.getClass(), "created", "0000-00-00 00:00:00.0");
        term126715 = new Integer(-146806266);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCard");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term126715;
        callMethod(klass, "setUseCount", argTypes, term126370, args);
    }

};


