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

public class UserItem_canEqual_9840920814 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term109022;
     Object term109291;

    public UserItem_canEqual_9840920814() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term109028 = new Long(-7406618974062419277L);
        term109022 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserItem"));
        Object term109024 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term109026 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term109042 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term109043 = newInstance(Class.forName("java.time.LocalDate"));
        Object term109047 = newInstance(Class.forName("java.time.LocalTime"));
        Object term109052 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term109053 = newInstance(Class.forName("java.time.LocalDate"));
        Object term109057 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term109022, term109022.getClass(), "id", 4695542955666419066L);
        setLongField(term109024, term109024.getClass(), "id", 5184136181588829179L);
        setLongField(term109026, term109026.getClass(), "id", -6782013692212067743L);
        setField(term109026, term109026.getClass(), "extId", term109028);
        setField(term109026, term109026.getClass(), "luid", "tLWbdOibIF");
        setIntField(term109043, term109043.getClass(), "year", 2027);
        setShortField(term109043, term109043.getClass(), "month", (short) 1);
        setShortField(term109043, term109043.getClass(), "day", (short) 10);
        setField(term109042, term109042.getClass(), "date", term109043);
        setByteField(term109047, term109047.getClass(), "hour", (byte) 8);
        setByteField(term109047, term109047.getClass(), "minute", (byte) 34);
        setByteField(term109047, term109047.getClass(), "second", (byte) 28);
        setIntField(term109047, term109047.getClass(), "nano", 703673031);
        setField(term109042, term109042.getClass(), "time", term109047);
        setField(term109026, term109026.getClass(), "registerTime", term109042);
        setIntField(term109053, term109053.getClass(), "year", 2014);
        setShortField(term109053, term109053.getClass(), "month", (short) 5);
        setShortField(term109053, term109053.getClass(), "day", (short) 30);
        setField(term109052, term109052.getClass(), "date", term109053);
        setByteField(term109057, term109057.getClass(), "hour", (byte) 10);
        setByteField(term109057, term109057.getClass(), "minute", (byte) 34);
        setByteField(term109057, term109057.getClass(), "second", (byte) 17);
        setIntField(term109057, term109057.getClass(), "nano", 917654429);
        setField(term109052, term109052.getClass(), "time", term109057);
        setField(term109026, term109026.getClass(), "accessTime", term109052);
        setField(term109024, term109024.getClass(), "card", term109026);
        setField(term109024, term109024.getClass(), "userName", "SMOAkwbjOJ");
        setIntField(term109024, term109024.getClass(), "level", -624144007);
        setIntField(term109024, term109024.getClass(), "reincarnationNum", 869208951);
        setLongField(term109024, term109024.getClass(), "exp", 8691781742778305794L);
        setLongField(term109024, term109024.getClass(), "point", 8232658097064806470L);
        setLongField(term109024, term109024.getClass(), "totalPoint", 2299320555486744104L);
        setIntField(term109024, term109024.getClass(), "playCount", -1001034291);
        setIntField(term109024, term109024.getClass(), "jewelCount", -1612288598);
        setIntField(term109024, term109024.getClass(), "totalJewelCount", 1512583982);
        setIntField(term109024, term109024.getClass(), "medalCount", 554400317);
        setIntField(term109024, term109024.getClass(), "playerRating", 1771270508);
        setIntField(term109024, term109024.getClass(), "highestRating", 2025369602);
        setIntField(term109024, term109024.getClass(), "battlePoint", 1229764972);
        setIntField(term109024, term109024.getClass(), "bestBattlePoint", -202016645);
        setIntField(term109024, term109024.getClass(), "overDamageBattlePoint", -1135802429);
        setBooleanField(term109024, term109024.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term109024, term109024.getClass(), "nameplateId", -354346702);
        setIntField(term109024, term109024.getClass(), "trophyId", -471266285);
        setIntField(term109024, term109024.getClass(), "cardId", -1203375064);
        setIntField(term109024, term109024.getClass(), "characterId", -849622887);
        setIntField(term109024, term109024.getClass(), "characterVoiceNo", -631297994);
        setIntField(term109024, term109024.getClass(), "tabSetting", 864666826);
        setIntField(term109024, term109024.getClass(), "tabSortSetting", 40323219);
        setIntField(term109024, term109024.getClass(), "cardCategorySetting", -2020163854);
        setIntField(term109024, term109024.getClass(), "cardSortSetting", -806823193);
        setIntField(term109024, term109024.getClass(), "rivalScoreCategorySetting", 128449587);
        setIntField(term109024, term109024.getClass(), "playedTutorialBit", 1470799236);
        setIntField(term109024, term109024.getClass(), "firstTutorialCancelNum", -2013078692);
        setLongField(term109024, term109024.getClass(), "sumTechHighScore", -7923304208284039427L);
        setLongField(term109024, term109024.getClass(), "sumTechBasicHighScore", 1614428480983807273L);
        setLongField(term109024, term109024.getClass(), "sumTechAdvancedHighScore", 2399810728701767602L);
        setLongField(term109024, term109024.getClass(), "sumTechExpertHighScore", 1731037220890873295L);
        setLongField(term109024, term109024.getClass(), "sumTechMasterHighScore", 9096957387179242981L);
        setLongField(term109024, term109024.getClass(), "sumTechLunaticHighScore", -6089052616730866540L);
        setLongField(term109024, term109024.getClass(), "sumBattleHighScore", 6239531663351903414L);
        setLongField(term109024, term109024.getClass(), "sumBattleBasicHighScore", -3213625856614760566L);
        setLongField(term109024, term109024.getClass(), "sumBattleAdvancedHighScore", 5154227867425678434L);
        setLongField(term109024, term109024.getClass(), "sumBattleExpertHighScore", -6918265040377058945L);
        setLongField(term109024, term109024.getClass(), "sumBattleMasterHighScore", 1480375479175046157L);
        setLongField(term109024, term109024.getClass(), "sumBattleLunaticHighScore", 7292580889725954907L);
        setField(term109024, term109024.getClass(), "eventWatchedDate", "MfaucIGOtB");
        setField(term109024, term109024.getClass(), "cmEventWatchedDate", "InUomUyBlU");
        setField(term109024, term109024.getClass(), "firstGameId", "JeDxEhXsPC");
        setField(term109024, term109024.getClass(), "firstRomVersion", "VAGxXrcAsi");
        setField(term109024, term109024.getClass(), "firstDataVersion", "ApYkVuFRIL");
        setField(term109024, term109024.getClass(), "firstPlayDate", "diuhMpMKFr");
        setField(term109024, term109024.getClass(), "lastGameId", "jYgdYPEnbw");
        setField(term109024, term109024.getClass(), "lastRomVersion", "MaWPQSNeis");
        setField(term109024, term109024.getClass(), "lastDataVersion", "SiShLTAOSK");
        setField(term109024, term109024.getClass(), "compatibleCmVersion", "FAPbpaVZzb");
        setField(term109024, term109024.getClass(), "lastPlayDate", "jMmGJiFUkL");
        setIntField(term109024, term109024.getClass(), "lastPlaceId", -911027260);
        setField(term109024, term109024.getClass(), "lastPlaceName", "fHyUJhfoxR");
        setIntField(term109024, term109024.getClass(), "lastRegionId", 1971287649);
        setField(term109024, term109024.getClass(), "lastRegionName", "CgnkREXVNP");
        setIntField(term109024, term109024.getClass(), "lastAllNetId", -1688662880);
        setField(term109024, term109024.getClass(), "lastClientId", "mBAKehIGeW");
        setIntField(term109024, term109024.getClass(), "lastUsedDeckId", 635942792);
        setIntField(term109024, term109024.getClass(), "lastPlayMusicLevel", -126969868);
        setIntField(term109024, term109024.getClass(), "lastEmoneyBrand", 1605804678);
        setField(term109022, term109022.getClass(), "user", term109024);
        setIntField(term109022, term109022.getClass(), "itemKind", -1830340335);
        setIntField(term109022, term109022.getClass(), "itemId", 439648027);
        setIntField(term109022, term109022.getClass(), "stock", 702556555);
        setBooleanField(term109022, term109022.getClass(), "isValid", true);
        term109291 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserItem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term109291;
        callMethod(klass, "canEqual", argTypes, term109022, args);
    }

};


