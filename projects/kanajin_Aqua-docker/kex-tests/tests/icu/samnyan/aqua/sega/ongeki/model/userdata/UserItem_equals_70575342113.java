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

public class UserItem_equals_70575342113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108592;
     Object term108861;

    public UserItem_equals_70575342113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term108598 = new Long(1044883697493326351L);
        term108592 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserItem"));
        Object term108594 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term108596 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term108612 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term108613 = newInstance(Class.forName("java.time.LocalDate"));
        Object term108617 = newInstance(Class.forName("java.time.LocalTime"));
        Object term108622 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term108623 = newInstance(Class.forName("java.time.LocalDate"));
        Object term108627 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term108592, term108592.getClass(), "id", 7724848541150580446L);
        setLongField(term108594, term108594.getClass(), "id", -8649081737135416706L);
        setLongField(term108596, term108596.getClass(), "id", 3196459535969803538L);
        setField(term108596, term108596.getClass(), "extId", term108598);
        setField(term108596, term108596.getClass(), "luid", "BeeLASibwX");
        setIntField(term108613, term108613.getClass(), "year", 2015);
        setShortField(term108613, term108613.getClass(), "month", (short) 8);
        setShortField(term108613, term108613.getClass(), "day", (short) 3);
        setField(term108612, term108612.getClass(), "date", term108613);
        setByteField(term108617, term108617.getClass(), "hour", (byte) 21);
        setByteField(term108617, term108617.getClass(), "minute", (byte) 57);
        setByteField(term108617, term108617.getClass(), "second", (byte) 2);
        setIntField(term108617, term108617.getClass(), "nano", 438141628);
        setField(term108612, term108612.getClass(), "time", term108617);
        setField(term108596, term108596.getClass(), "registerTime", term108612);
        setIntField(term108623, term108623.getClass(), "year", 2011);
        setShortField(term108623, term108623.getClass(), "month", (short) 3);
        setShortField(term108623, term108623.getClass(), "day", (short) 10);
        setField(term108622, term108622.getClass(), "date", term108623);
        setByteField(term108627, term108627.getClass(), "hour", (byte) 4);
        setByteField(term108627, term108627.getClass(), "minute", (byte) 13);
        setByteField(term108627, term108627.getClass(), "second", (byte) 46);
        setIntField(term108627, term108627.getClass(), "nano", 212390008);
        setField(term108622, term108622.getClass(), "time", term108627);
        setField(term108596, term108596.getClass(), "accessTime", term108622);
        setField(term108594, term108594.getClass(), "card", term108596);
        setField(term108594, term108594.getClass(), "userName", "BqctwXkUdR");
        setIntField(term108594, term108594.getClass(), "level", 1694212421);
        setIntField(term108594, term108594.getClass(), "reincarnationNum", 1104915674);
        setLongField(term108594, term108594.getClass(), "exp", 2072385228958623867L);
        setLongField(term108594, term108594.getClass(), "point", -5291212609913926212L);
        setLongField(term108594, term108594.getClass(), "totalPoint", 7211117418131560848L);
        setIntField(term108594, term108594.getClass(), "playCount", -44179109);
        setIntField(term108594, term108594.getClass(), "jewelCount", 248819653);
        setIntField(term108594, term108594.getClass(), "totalJewelCount", -429028411);
        setIntField(term108594, term108594.getClass(), "medalCount", -337757010);
        setIntField(term108594, term108594.getClass(), "playerRating", -1192904975);
        setIntField(term108594, term108594.getClass(), "highestRating", 619419155);
        setIntField(term108594, term108594.getClass(), "battlePoint", -607185930);
        setIntField(term108594, term108594.getClass(), "bestBattlePoint", -108242433);
        setIntField(term108594, term108594.getClass(), "overDamageBattlePoint", 2045041189);
        setBooleanField(term108594, term108594.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term108594, term108594.getClass(), "nameplateId", 1746055569);
        setIntField(term108594, term108594.getClass(), "trophyId", 2048463054);
        setIntField(term108594, term108594.getClass(), "cardId", 1251228448);
        setIntField(term108594, term108594.getClass(), "characterId", -1853583675);
        setIntField(term108594, term108594.getClass(), "characterVoiceNo", 2085299143);
        setIntField(term108594, term108594.getClass(), "tabSetting", 41805417);
        setIntField(term108594, term108594.getClass(), "tabSortSetting", 296055711);
        setIntField(term108594, term108594.getClass(), "cardCategorySetting", 465864250);
        setIntField(term108594, term108594.getClass(), "cardSortSetting", 941713404);
        setIntField(term108594, term108594.getClass(), "rivalScoreCategorySetting", 585296192);
        setIntField(term108594, term108594.getClass(), "playedTutorialBit", -2093946527);
        setIntField(term108594, term108594.getClass(), "firstTutorialCancelNum", 312776664);
        setLongField(term108594, term108594.getClass(), "sumTechHighScore", 4389788271204872497L);
        setLongField(term108594, term108594.getClass(), "sumTechBasicHighScore", 6934085067016822925L);
        setLongField(term108594, term108594.getClass(), "sumTechAdvancedHighScore", -4991036242124049612L);
        setLongField(term108594, term108594.getClass(), "sumTechExpertHighScore", 1502561650731258826L);
        setLongField(term108594, term108594.getClass(), "sumTechMasterHighScore", -3437449521890068035L);
        setLongField(term108594, term108594.getClass(), "sumTechLunaticHighScore", 1698926183958033295L);
        setLongField(term108594, term108594.getClass(), "sumBattleHighScore", 4206208228550749180L);
        setLongField(term108594, term108594.getClass(), "sumBattleBasicHighScore", 3387118333525783222L);
        setLongField(term108594, term108594.getClass(), "sumBattleAdvancedHighScore", -1884099306500725348L);
        setLongField(term108594, term108594.getClass(), "sumBattleExpertHighScore", -2373213666263358066L);
        setLongField(term108594, term108594.getClass(), "sumBattleMasterHighScore", 3167925474408487500L);
        setLongField(term108594, term108594.getClass(), "sumBattleLunaticHighScore", 1795121082914093827L);
        setField(term108594, term108594.getClass(), "eventWatchedDate", "GRVnFiwbnZ");
        setField(term108594, term108594.getClass(), "cmEventWatchedDate", "bZevkoTsGp");
        setField(term108594, term108594.getClass(), "firstGameId", "TjanzjjMgi");
        setField(term108594, term108594.getClass(), "firstRomVersion", "UOZvJkhjUs");
        setField(term108594, term108594.getClass(), "firstDataVersion", "hUVFihsVHL");
        setField(term108594, term108594.getClass(), "firstPlayDate", "PUamQqZNZj");
        setField(term108594, term108594.getClass(), "lastGameId", "tfDqvBMzfw");
        setField(term108594, term108594.getClass(), "lastRomVersion", "rJfJfBomXU");
        setField(term108594, term108594.getClass(), "lastDataVersion", "kBdJQbVecB");
        setField(term108594, term108594.getClass(), "compatibleCmVersion", "JlirfQsPTm");
        setField(term108594, term108594.getClass(), "lastPlayDate", "jqfJtiVFaf");
        setIntField(term108594, term108594.getClass(), "lastPlaceId", 243025663);
        setField(term108594, term108594.getClass(), "lastPlaceName", "ZvqUprynBE");
        setIntField(term108594, term108594.getClass(), "lastRegionId", -1565507430);
        setField(term108594, term108594.getClass(), "lastRegionName", "WFTVkzwtMV");
        setIntField(term108594, term108594.getClass(), "lastAllNetId", -1974437877);
        setField(term108594, term108594.getClass(), "lastClientId", "NFhdyebxdy");
        setIntField(term108594, term108594.getClass(), "lastUsedDeckId", -910087562);
        setIntField(term108594, term108594.getClass(), "lastPlayMusicLevel", -478100700);
        setIntField(term108594, term108594.getClass(), "lastEmoneyBrand", -644350910);
        setField(term108592, term108592.getClass(), "user", term108594);
        setIntField(term108592, term108592.getClass(), "itemKind", 1392174755);
        setIntField(term108592, term108592.getClass(), "itemId", 542384961);
        setIntField(term108592, term108592.getClass(), "stock", 821706893);
        setBooleanField(term108592, term108592.getClass(), "isValid", false);
        term108861 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserItem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term108861;
        callMethod(klass, "equals", argTypes, term108592, args);
    }

};


