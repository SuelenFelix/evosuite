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

public class UserCharacter_canEqual_185239406424 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term179093;
     Object term179378;

    public UserCharacter_canEqual_185239406424() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term179099 = new Long(1442167273909860961L);
        term179093 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCharacter"));
        Object term179095 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term179097 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term179113 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term179114 = newInstance(Class.forName("java.time.LocalDate"));
        Object term179118 = newInstance(Class.forName("java.time.LocalTime"));
        Object term179123 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term179124 = newInstance(Class.forName("java.time.LocalDate"));
        Object term179128 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term179093, term179093.getClass(), "id", 1278060485580511930L);
        setLongField(term179095, term179095.getClass(), "id", -7729614411633305187L);
        setLongField(term179097, term179097.getClass(), "id", 7287180051933066596L);
        setField(term179097, term179097.getClass(), "extId", term179099);
        setField(term179097, term179097.getClass(), "luid", "bvJdvzzEbX");
        setIntField(term179114, term179114.getClass(), "year", 2010);
        setShortField(term179114, term179114.getClass(), "month", (short) 7);
        setShortField(term179114, term179114.getClass(), "day", (short) 21);
        setField(term179113, term179113.getClass(), "date", term179114);
        setByteField(term179118, term179118.getClass(), "hour", (byte) 12);
        setByteField(term179118, term179118.getClass(), "minute", (byte) 18);
        setByteField(term179118, term179118.getClass(), "second", (byte) 51);
        setIntField(term179118, term179118.getClass(), "nano", 209901550);
        setField(term179113, term179113.getClass(), "time", term179118);
        setField(term179097, term179097.getClass(), "registerTime", term179113);
        setIntField(term179124, term179124.getClass(), "year", 2028);
        setShortField(term179124, term179124.getClass(), "month", (short) 7);
        setShortField(term179124, term179124.getClass(), "day", (short) 2);
        setField(term179123, term179123.getClass(), "date", term179124);
        setByteField(term179128, term179128.getClass(), "hour", (byte) 23);
        setByteField(term179128, term179128.getClass(), "minute", (byte) 41);
        setByteField(term179128, term179128.getClass(), "second", (byte) 2);
        setIntField(term179128, term179128.getClass(), "nano", 187705257);
        setField(term179123, term179123.getClass(), "time", term179128);
        setField(term179097, term179097.getClass(), "accessTime", term179123);
        setField(term179095, term179095.getClass(), "card", term179097);
        setField(term179095, term179095.getClass(), "userName", "qkbheFUdro");
        setIntField(term179095, term179095.getClass(), "level", -34115571);
        setIntField(term179095, term179095.getClass(), "reincarnationNum", 2098121847);
        setLongField(term179095, term179095.getClass(), "exp", 5646115203911352916L);
        setLongField(term179095, term179095.getClass(), "point", 169327056621903152L);
        setLongField(term179095, term179095.getClass(), "totalPoint", -2295704228460481812L);
        setIntField(term179095, term179095.getClass(), "playCount", 870572059);
        setIntField(term179095, term179095.getClass(), "jewelCount", -1255111844);
        setIntField(term179095, term179095.getClass(), "totalJewelCount", -1114425326);
        setIntField(term179095, term179095.getClass(), "medalCount", 512107996);
        setIntField(term179095, term179095.getClass(), "playerRating", 838748747);
        setIntField(term179095, term179095.getClass(), "highestRating", 429358930);
        setIntField(term179095, term179095.getClass(), "battlePoint", 1691700582);
        setIntField(term179095, term179095.getClass(), "bestBattlePoint", -1661320880);
        setIntField(term179095, term179095.getClass(), "overDamageBattlePoint", -1500981713);
        setBooleanField(term179095, term179095.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term179095, term179095.getClass(), "nameplateId", 151330446);
        setIntField(term179095, term179095.getClass(), "trophyId", 1085757815);
        setIntField(term179095, term179095.getClass(), "cardId", 1419726204);
        setIntField(term179095, term179095.getClass(), "characterId", 327539141);
        setIntField(term179095, term179095.getClass(), "characterVoiceNo", 564309045);
        setIntField(term179095, term179095.getClass(), "tabSetting", -393999611);
        setIntField(term179095, term179095.getClass(), "tabSortSetting", 277874910);
        setIntField(term179095, term179095.getClass(), "cardCategorySetting", -1564481884);
        setIntField(term179095, term179095.getClass(), "cardSortSetting", -1891590977);
        setIntField(term179095, term179095.getClass(), "rivalScoreCategorySetting", -49122115);
        setIntField(term179095, term179095.getClass(), "playedTutorialBit", 1162634645);
        setIntField(term179095, term179095.getClass(), "firstTutorialCancelNum", -1269431491);
        setLongField(term179095, term179095.getClass(), "sumTechHighScore", 3646546264522810551L);
        setLongField(term179095, term179095.getClass(), "sumTechBasicHighScore", 4896856838451272148L);
        setLongField(term179095, term179095.getClass(), "sumTechAdvancedHighScore", 4710935698592379616L);
        setLongField(term179095, term179095.getClass(), "sumTechExpertHighScore", -9125213887622226318L);
        setLongField(term179095, term179095.getClass(), "sumTechMasterHighScore", -1591719784370334403L);
        setLongField(term179095, term179095.getClass(), "sumTechLunaticHighScore", 3216330630601724959L);
        setLongField(term179095, term179095.getClass(), "sumBattleHighScore", -6756414322797783883L);
        setLongField(term179095, term179095.getClass(), "sumBattleBasicHighScore", 3041223353818110326L);
        setLongField(term179095, term179095.getClass(), "sumBattleAdvancedHighScore", -4947393274942672796L);
        setLongField(term179095, term179095.getClass(), "sumBattleExpertHighScore", 2725107251661268942L);
        setLongField(term179095, term179095.getClass(), "sumBattleMasterHighScore", 3521183508234920638L);
        setLongField(term179095, term179095.getClass(), "sumBattleLunaticHighScore", 8944490321421801220L);
        setField(term179095, term179095.getClass(), "eventWatchedDate", "adnAJZpEzc");
        setField(term179095, term179095.getClass(), "cmEventWatchedDate", "ghmRSHgYWE");
        setField(term179095, term179095.getClass(), "firstGameId", "ldISIooOeQ");
        setField(term179095, term179095.getClass(), "firstRomVersion", "gnoGEIFddy");
        setField(term179095, term179095.getClass(), "firstDataVersion", "BfiOcqELWK");
        setField(term179095, term179095.getClass(), "firstPlayDate", "YFDokxIEPp");
        setField(term179095, term179095.getClass(), "lastGameId", "GVhcHUODnf");
        setField(term179095, term179095.getClass(), "lastRomVersion", "qbgUPrqzVf");
        setField(term179095, term179095.getClass(), "lastDataVersion", "umsvuHPNzY");
        setField(term179095, term179095.getClass(), "compatibleCmVersion", "zqDSyUKoPF");
        setField(term179095, term179095.getClass(), "lastPlayDate", "gQkofIQlsj");
        setIntField(term179095, term179095.getClass(), "lastPlaceId", 2066614250);
        setField(term179095, term179095.getClass(), "lastPlaceName", "mXgXrambAc");
        setIntField(term179095, term179095.getClass(), "lastRegionId", 1678127654);
        setField(term179095, term179095.getClass(), "lastRegionName", "UlUhWNmCda");
        setIntField(term179095, term179095.getClass(), "lastAllNetId", -1503783301);
        setField(term179095, term179095.getClass(), "lastClientId", "uOHvCJYPTG");
        setIntField(term179095, term179095.getClass(), "lastUsedDeckId", -755256222);
        setIntField(term179095, term179095.getClass(), "lastPlayMusicLevel", -776385039);
        setIntField(term179095, term179095.getClass(), "lastEmoneyBrand", 1475507904);
        setField(term179093, term179093.getClass(), "user", term179095);
        setIntField(term179093, term179093.getClass(), "characterId", -1307551368);
        setIntField(term179093, term179093.getClass(), "costumeId", -1368286452);
        setIntField(term179093, term179093.getClass(), "attachmentId", -1376166915);
        setIntField(term179093, term179093.getClass(), "playCount", -746820758);
        setIntField(term179093, term179093.getClass(), "intimateLevel", -14052587);
        setIntField(term179093, term179093.getClass(), "intimateCount", -1178359208);
        setIntField(term179093, term179093.getClass(), "intimateCountRewarded", -494779428);
        setField(term179093, term179093.getClass(), "intimateCountDate", "IimwlXiyhC");
        setBooleanField(term179093, term179093.getClass(), "isNew", true);
        term179378 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCharacter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term179378;
        callMethod(klass, "canEqual", argTypes, term179093, args);
    }

};


