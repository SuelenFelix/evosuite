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

public class UserTechCount_getAllBreakPlusCount_6403676665 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term363825;

    public UserTechCount_getAllBreakPlusCount_6403676665() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term363831 = new Long(8912657350087595530L);
        term363825 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTechCount"));
        Object term363827 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term363829 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term363845 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term363846 = newInstance(Class.forName("java.time.LocalDate"));
        Object term363850 = newInstance(Class.forName("java.time.LocalTime"));
        Object term363855 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term363856 = newInstance(Class.forName("java.time.LocalDate"));
        Object term363860 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term363825, term363825.getClass(), "id", 6229202481102211631L);
        setLongField(term363827, term363827.getClass(), "id", -7324525031327626423L);
        setLongField(term363829, term363829.getClass(), "id", -8723081569097676833L);
        setField(term363829, term363829.getClass(), "extId", term363831);
        setField(term363829, term363829.getClass(), "luid", "NsIZKXSDhj");
        setIntField(term363846, term363846.getClass(), "year", 2013);
        setShortField(term363846, term363846.getClass(), "month", (short) 12);
        setShortField(term363846, term363846.getClass(), "day", (short) 9);
        setField(term363845, term363845.getClass(), "date", term363846);
        setByteField(term363850, term363850.getClass(), "hour", (byte) 15);
        setByteField(term363850, term363850.getClass(), "minute", (byte) 30);
        setByteField(term363850, term363850.getClass(), "second", (byte) 42);
        setIntField(term363850, term363850.getClass(), "nano", 905822345);
        setField(term363845, term363845.getClass(), "time", term363850);
        setField(term363829, term363829.getClass(), "registerTime", term363845);
        setIntField(term363856, term363856.getClass(), "year", 2029);
        setShortField(term363856, term363856.getClass(), "month", (short) 5);
        setShortField(term363856, term363856.getClass(), "day", (short) 20);
        setField(term363855, term363855.getClass(), "date", term363856);
        setByteField(term363860, term363860.getClass(), "hour", (byte) 18);
        setByteField(term363860, term363860.getClass(), "minute", (byte) 32);
        setByteField(term363860, term363860.getClass(), "second", (byte) 59);
        setIntField(term363860, term363860.getClass(), "nano", 565196467);
        setField(term363855, term363855.getClass(), "time", term363860);
        setField(term363829, term363829.getClass(), "accessTime", term363855);
        setField(term363827, term363827.getClass(), "card", term363829);
        setField(term363827, term363827.getClass(), "userName", "qtNFCYJCBu");
        setIntField(term363827, term363827.getClass(), "level", 2107510964);
        setIntField(term363827, term363827.getClass(), "reincarnationNum", -1827616712);
        setLongField(term363827, term363827.getClass(), "exp", -5236622851858872830L);
        setLongField(term363827, term363827.getClass(), "point", 3978826810356384028L);
        setLongField(term363827, term363827.getClass(), "totalPoint", -1673999983897165384L);
        setIntField(term363827, term363827.getClass(), "playCount", -271086357);
        setIntField(term363827, term363827.getClass(), "jewelCount", -921946272);
        setIntField(term363827, term363827.getClass(), "totalJewelCount", 718445326);
        setIntField(term363827, term363827.getClass(), "medalCount", -2032967913);
        setIntField(term363827, term363827.getClass(), "playerRating", 529467175);
        setIntField(term363827, term363827.getClass(), "highestRating", -1568076782);
        setIntField(term363827, term363827.getClass(), "battlePoint", 381915876);
        setIntField(term363827, term363827.getClass(), "bestBattlePoint", 867444906);
        setIntField(term363827, term363827.getClass(), "overDamageBattlePoint", -72765225);
        setBooleanField(term363827, term363827.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term363827, term363827.getClass(), "nameplateId", -1824667885);
        setIntField(term363827, term363827.getClass(), "trophyId", -458637777);
        setIntField(term363827, term363827.getClass(), "cardId", 1726305480);
        setIntField(term363827, term363827.getClass(), "characterId", 351010747);
        setIntField(term363827, term363827.getClass(), "characterVoiceNo", -2027425706);
        setIntField(term363827, term363827.getClass(), "tabSetting", 1094608946);
        setIntField(term363827, term363827.getClass(), "tabSortSetting", 370713335);
        setIntField(term363827, term363827.getClass(), "cardCategorySetting", 1669198109);
        setIntField(term363827, term363827.getClass(), "cardSortSetting", -783556200);
        setIntField(term363827, term363827.getClass(), "rivalScoreCategorySetting", -510597938);
        setIntField(term363827, term363827.getClass(), "playedTutorialBit", -1646934731);
        setIntField(term363827, term363827.getClass(), "firstTutorialCancelNum", 1931423561);
        setLongField(term363827, term363827.getClass(), "sumTechHighScore", 6046050618024286036L);
        setLongField(term363827, term363827.getClass(), "sumTechBasicHighScore", -7638052843985352575L);
        setLongField(term363827, term363827.getClass(), "sumTechAdvancedHighScore", 2026338600424476063L);
        setLongField(term363827, term363827.getClass(), "sumTechExpertHighScore", -5863547937539275531L);
        setLongField(term363827, term363827.getClass(), "sumTechMasterHighScore", -7865624833237150978L);
        setLongField(term363827, term363827.getClass(), "sumTechLunaticHighScore", 8059562967525466132L);
        setLongField(term363827, term363827.getClass(), "sumBattleHighScore", -3697922179525153561L);
        setLongField(term363827, term363827.getClass(), "sumBattleBasicHighScore", -4071969881778316953L);
        setLongField(term363827, term363827.getClass(), "sumBattleAdvancedHighScore", 3190635865643353601L);
        setLongField(term363827, term363827.getClass(), "sumBattleExpertHighScore", -1642341397760803484L);
        setLongField(term363827, term363827.getClass(), "sumBattleMasterHighScore", -3392358754655935189L);
        setLongField(term363827, term363827.getClass(), "sumBattleLunaticHighScore", 1239903310128995862L);
        setField(term363827, term363827.getClass(), "eventWatchedDate", "PhitAXFqCo");
        setField(term363827, term363827.getClass(), "cmEventWatchedDate", "qEPvDkuGIc");
        setField(term363827, term363827.getClass(), "firstGameId", "ssCMFzVcsO");
        setField(term363827, term363827.getClass(), "firstRomVersion", "fhJGnpfhvy");
        setField(term363827, term363827.getClass(), "firstDataVersion", "bQensQtcHI");
        setField(term363827, term363827.getClass(), "firstPlayDate", "VPHXmJPSMk");
        setField(term363827, term363827.getClass(), "lastGameId", "hynorzJtIc");
        setField(term363827, term363827.getClass(), "lastRomVersion", "HGsCokxFUe");
        setField(term363827, term363827.getClass(), "lastDataVersion", "vCNlTXoRZt");
        setField(term363827, term363827.getClass(), "compatibleCmVersion", "CDjnJTCyDp");
        setField(term363827, term363827.getClass(), "lastPlayDate", "rNzHrfrGVL");
        setIntField(term363827, term363827.getClass(), "lastPlaceId", -159452988);
        setField(term363827, term363827.getClass(), "lastPlaceName", "ymxSWBzOig");
        setIntField(term363827, term363827.getClass(), "lastRegionId", 1231058195);
        setField(term363827, term363827.getClass(), "lastRegionName", "hIPtmFFVkJ");
        setIntField(term363827, term363827.getClass(), "lastAllNetId", 160279285);
        setField(term363827, term363827.getClass(), "lastClientId", "pmtrddnNIl");
        setIntField(term363827, term363827.getClass(), "lastUsedDeckId", 141793851);
        setIntField(term363827, term363827.getClass(), "lastPlayMusicLevel", -272671593);
        setIntField(term363827, term363827.getClass(), "lastEmoneyBrand", 1750556954);
        setField(term363825, term363825.getClass(), "user", term363827);
        setIntField(term363825, term363825.getClass(), "levelId", -966199193);
        setIntField(term363825, term363825.getClass(), "allBreakCount", -1396496486);
        setIntField(term363825, term363825.getClass(), "allBreakPlusCount", 453762951);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTechCount");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAllBreakPlusCount", argTypes, term363825, args);
    }

};


