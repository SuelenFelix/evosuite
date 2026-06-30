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

public class UserCard_getExp_5896723999 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term115707;

    public UserCard_getExp_5896723999() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term115713 = new Long(-4714000263923324167L);
        term115707 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCard"));
        Object term115709 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term115711 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term115727 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term115728 = newInstance(Class.forName("java.time.LocalDate"));
        Object term115732 = newInstance(Class.forName("java.time.LocalTime"));
        Object term115737 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term115738 = newInstance(Class.forName("java.time.LocalDate"));
        Object term115742 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term115707, term115707.getClass(), "id", 184995883378761613L);
        setLongField(term115709, term115709.getClass(), "id", -1961336317298398723L);
        setLongField(term115711, term115711.getClass(), "id", -4188014368193495459L);
        setField(term115711, term115711.getClass(), "extId", term115713);
        setField(term115711, term115711.getClass(), "luid", "vfKOoCcJXS");
        setIntField(term115728, term115728.getClass(), "year", 2016);
        setShortField(term115728, term115728.getClass(), "month", (short) 5);
        setShortField(term115728, term115728.getClass(), "day", (short) 15);
        setField(term115727, term115727.getClass(), "date", term115728);
        setByteField(term115732, term115732.getClass(), "hour", (byte) 13);
        setByteField(term115732, term115732.getClass(), "minute", (byte) 7);
        setByteField(term115732, term115732.getClass(), "second", (byte) 29);
        setIntField(term115732, term115732.getClass(), "nano", 36973761);
        setField(term115727, term115727.getClass(), "time", term115732);
        setField(term115711, term115711.getClass(), "registerTime", term115727);
        setIntField(term115738, term115738.getClass(), "year", 2028);
        setShortField(term115738, term115738.getClass(), "month", (short) 11);
        setShortField(term115738, term115738.getClass(), "day", (short) 8);
        setField(term115737, term115737.getClass(), "date", term115738);
        setByteField(term115742, term115742.getClass(), "hour", (byte) 11);
        setByteField(term115742, term115742.getClass(), "minute", (byte) 41);
        setByteField(term115742, term115742.getClass(), "second", (byte) 26);
        setIntField(term115742, term115742.getClass(), "nano", 234822620);
        setField(term115737, term115737.getClass(), "time", term115742);
        setField(term115711, term115711.getClass(), "accessTime", term115737);
        setField(term115709, term115709.getClass(), "card", term115711);
        setField(term115709, term115709.getClass(), "userName", "jCPFInZUzz");
        setIntField(term115709, term115709.getClass(), "level", 596868453);
        setIntField(term115709, term115709.getClass(), "reincarnationNum", -1890744188);
        setLongField(term115709, term115709.getClass(), "exp", -6162042744608645687L);
        setLongField(term115709, term115709.getClass(), "point", -768181341123198570L);
        setLongField(term115709, term115709.getClass(), "totalPoint", 2215962843194405336L);
        setIntField(term115709, term115709.getClass(), "playCount", 2118439468);
        setIntField(term115709, term115709.getClass(), "jewelCount", -241809702);
        setIntField(term115709, term115709.getClass(), "totalJewelCount", 711539411);
        setIntField(term115709, term115709.getClass(), "medalCount", 702531885);
        setIntField(term115709, term115709.getClass(), "playerRating", 137777785);
        setIntField(term115709, term115709.getClass(), "highestRating", -1972381311);
        setIntField(term115709, term115709.getClass(), "battlePoint", -1871425005);
        setIntField(term115709, term115709.getClass(), "bestBattlePoint", -1968820002);
        setIntField(term115709, term115709.getClass(), "overDamageBattlePoint", 1126576455);
        setBooleanField(term115709, term115709.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term115709, term115709.getClass(), "nameplateId", -84202309);
        setIntField(term115709, term115709.getClass(), "trophyId", 54744840);
        setIntField(term115709, term115709.getClass(), "cardId", -1017477523);
        setIntField(term115709, term115709.getClass(), "characterId", 1084453109);
        setIntField(term115709, term115709.getClass(), "characterVoiceNo", -1674658475);
        setIntField(term115709, term115709.getClass(), "tabSetting", 1130325657);
        setIntField(term115709, term115709.getClass(), "tabSortSetting", 247563740);
        setIntField(term115709, term115709.getClass(), "cardCategorySetting", 1806796271);
        setIntField(term115709, term115709.getClass(), "cardSortSetting", -91540855);
        setIntField(term115709, term115709.getClass(), "rivalScoreCategorySetting", -2120152870);
        setIntField(term115709, term115709.getClass(), "playedTutorialBit", -2111077974);
        setIntField(term115709, term115709.getClass(), "firstTutorialCancelNum", 1055817592);
        setLongField(term115709, term115709.getClass(), "sumTechHighScore", 7879219871162071666L);
        setLongField(term115709, term115709.getClass(), "sumTechBasicHighScore", 1261850776639815763L);
        setLongField(term115709, term115709.getClass(), "sumTechAdvancedHighScore", -685097663307483951L);
        setLongField(term115709, term115709.getClass(), "sumTechExpertHighScore", -4168405689932850368L);
        setLongField(term115709, term115709.getClass(), "sumTechMasterHighScore", 1994467307553019192L);
        setLongField(term115709, term115709.getClass(), "sumTechLunaticHighScore", 6166211929948701735L);
        setLongField(term115709, term115709.getClass(), "sumBattleHighScore", 5420405057636586268L);
        setLongField(term115709, term115709.getClass(), "sumBattleBasicHighScore", -5193308217272845832L);
        setLongField(term115709, term115709.getClass(), "sumBattleAdvancedHighScore", 7614259363636351841L);
        setLongField(term115709, term115709.getClass(), "sumBattleExpertHighScore", -1649645229179944661L);
        setLongField(term115709, term115709.getClass(), "sumBattleMasterHighScore", 773946221142910749L);
        setLongField(term115709, term115709.getClass(), "sumBattleLunaticHighScore", -6763150534832600535L);
        setField(term115709, term115709.getClass(), "eventWatchedDate", "WPHeIEBBVh");
        setField(term115709, term115709.getClass(), "cmEventWatchedDate", "ruFkchQbOS");
        setField(term115709, term115709.getClass(), "firstGameId", "tBfuxXsdPa");
        setField(term115709, term115709.getClass(), "firstRomVersion", "fbUKhQMRyD");
        setField(term115709, term115709.getClass(), "firstDataVersion", "NSGSwngDCi");
        setField(term115709, term115709.getClass(), "firstPlayDate", "IqTXCynBeA");
        setField(term115709, term115709.getClass(), "lastGameId", "bgIAbyunKO");
        setField(term115709, term115709.getClass(), "lastRomVersion", "ECOAkMOcmP");
        setField(term115709, term115709.getClass(), "lastDataVersion", "GropLwcnsd");
        setField(term115709, term115709.getClass(), "compatibleCmVersion", "OPVlJKGGVY");
        setField(term115709, term115709.getClass(), "lastPlayDate", "kcbEwUStJX");
        setIntField(term115709, term115709.getClass(), "lastPlaceId", 967496047);
        setField(term115709, term115709.getClass(), "lastPlaceName", "rbJDQpboBH");
        setIntField(term115709, term115709.getClass(), "lastRegionId", -1410428562);
        setField(term115709, term115709.getClass(), "lastRegionName", "AJvPxKmklj");
        setIntField(term115709, term115709.getClass(), "lastAllNetId", 1498236261);
        setField(term115709, term115709.getClass(), "lastClientId", "nXIqTwQhkl");
        setIntField(term115709, term115709.getClass(), "lastUsedDeckId", -1544783703);
        setIntField(term115709, term115709.getClass(), "lastPlayMusicLevel", -1332726862);
        setIntField(term115709, term115709.getClass(), "lastEmoneyBrand", 953524774);
        setField(term115707, term115707.getClass(), "user", term115709);
        setIntField(term115707, term115707.getClass(), "cardId", -1);
        setIntField(term115707, term115707.getClass(), "digitalStock", 1);
        setIntField(term115707, term115707.getClass(), "analogStock", 959188355);
        setIntField(term115707, term115707.getClass(), "level", -1044212296);
        setIntField(term115707, term115707.getClass(), "maxLevel", 10);
        setIntField(term115707, term115707.getClass(), "exp", -1818413689);
        setIntField(term115707, term115707.getClass(), "printCount", 1416082413);
        setIntField(term115707, term115707.getClass(), "useCount", 1462806642);
        setBooleanField(term115707, term115707.getClass(), "isNew", true);
        setField(term115707, term115707.getClass(), "kaikaDate", "0000-00-00 00:00:00.0");
        setField(term115707, term115707.getClass(), "choKaikaDate", "0000-00-00 00:00:00.0");
        setIntField(term115707, term115707.getClass(), "skillId", -1504046723);
        setBooleanField(term115707, term115707.getClass(), "isAcquired", true);
        setField(term115707, term115707.getClass(), "created", "0000-00-00 00:00:00.0");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCard");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExp", argTypes, term115707, args);
    }

};


