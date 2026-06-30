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

public class UserEventPoint_getUser_1615476682 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term382397;

    public UserEventPoint_getUser_1615476682() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term382403 = new Long(-7186158121023817313L);
        term382397 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserEventPoint"));
        Object term382399 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term382401 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term382417 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term382418 = newInstance(Class.forName("java.time.LocalDate"));
        Object term382422 = newInstance(Class.forName("java.time.LocalTime"));
        Object term382427 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term382428 = newInstance(Class.forName("java.time.LocalDate"));
        Object term382432 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term382397, term382397.getClass(), "id", -3603596150810172351L);
        setLongField(term382399, term382399.getClass(), "id", 5759313717234737636L);
        setLongField(term382401, term382401.getClass(), "id", -8487454210997187905L);
        setField(term382401, term382401.getClass(), "extId", term382403);
        setField(term382401, term382401.getClass(), "luid", "RzEkdDLwLw");
        setIntField(term382418, term382418.getClass(), "year", 2025);
        setShortField(term382418, term382418.getClass(), "month", (short) 6);
        setShortField(term382418, term382418.getClass(), "day", (short) 26);
        setField(term382417, term382417.getClass(), "date", term382418);
        setByteField(term382422, term382422.getClass(), "hour", (byte) 5);
        setByteField(term382422, term382422.getClass(), "minute", (byte) 5);
        setByteField(term382422, term382422.getClass(), "second", (byte) 26);
        setIntField(term382422, term382422.getClass(), "nano", 427591205);
        setField(term382417, term382417.getClass(), "time", term382422);
        setField(term382401, term382401.getClass(), "registerTime", term382417);
        setIntField(term382428, term382428.getClass(), "year", 2010);
        setShortField(term382428, term382428.getClass(), "month", (short) 6);
        setShortField(term382428, term382428.getClass(), "day", (short) 30);
        setField(term382427, term382427.getClass(), "date", term382428);
        setByteField(term382432, term382432.getClass(), "hour", (byte) 5);
        setByteField(term382432, term382432.getClass(), "minute", (byte) 19);
        setByteField(term382432, term382432.getClass(), "second", (byte) 42);
        setIntField(term382432, term382432.getClass(), "nano", 772603752);
        setField(term382427, term382427.getClass(), "time", term382432);
        setField(term382401, term382401.getClass(), "accessTime", term382427);
        setField(term382399, term382399.getClass(), "card", term382401);
        setField(term382399, term382399.getClass(), "userName", "VvULNgHesw");
        setIntField(term382399, term382399.getClass(), "level", 1800098661);
        setIntField(term382399, term382399.getClass(), "reincarnationNum", 309441626);
        setLongField(term382399, term382399.getClass(), "exp", 5871497817442516855L);
        setLongField(term382399, term382399.getClass(), "point", 2307459958941404204L);
        setLongField(term382399, term382399.getClass(), "totalPoint", -1030180636118626387L);
        setIntField(term382399, term382399.getClass(), "playCount", -1922181507);
        setIntField(term382399, term382399.getClass(), "jewelCount", 1045365396);
        setIntField(term382399, term382399.getClass(), "totalJewelCount", 247206067);
        setIntField(term382399, term382399.getClass(), "medalCount", 469822422);
        setIntField(term382399, term382399.getClass(), "playerRating", -459572031);
        setIntField(term382399, term382399.getClass(), "highestRating", 1009143126);
        setIntField(term382399, term382399.getClass(), "battlePoint", -445328372);
        setIntField(term382399, term382399.getClass(), "bestBattlePoint", 132536914);
        setIntField(term382399, term382399.getClass(), "overDamageBattlePoint", 1738260128);
        setBooleanField(term382399, term382399.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term382399, term382399.getClass(), "nameplateId", -254970472);
        setIntField(term382399, term382399.getClass(), "trophyId", 1956767048);
        setIntField(term382399, term382399.getClass(), "cardId", -304239617);
        setIntField(term382399, term382399.getClass(), "characterId", -1704325064);
        setIntField(term382399, term382399.getClass(), "characterVoiceNo", 1970641849);
        setIntField(term382399, term382399.getClass(), "tabSetting", 257856545);
        setIntField(term382399, term382399.getClass(), "tabSortSetting", 1892317857);
        setIntField(term382399, term382399.getClass(), "cardCategorySetting", -1156392777);
        setIntField(term382399, term382399.getClass(), "cardSortSetting", -1605378570);
        setIntField(term382399, term382399.getClass(), "rivalScoreCategorySetting", 1253084897);
        setIntField(term382399, term382399.getClass(), "playedTutorialBit", -158207959);
        setIntField(term382399, term382399.getClass(), "firstTutorialCancelNum", 950864435);
        setLongField(term382399, term382399.getClass(), "sumTechHighScore", -7801116720649009159L);
        setLongField(term382399, term382399.getClass(), "sumTechBasicHighScore", -5646675118190170023L);
        setLongField(term382399, term382399.getClass(), "sumTechAdvancedHighScore", 4677013515149211612L);
        setLongField(term382399, term382399.getClass(), "sumTechExpertHighScore", -9163825122652251397L);
        setLongField(term382399, term382399.getClass(), "sumTechMasterHighScore", -7506395683639645778L);
        setLongField(term382399, term382399.getClass(), "sumTechLunaticHighScore", 6794110305032407873L);
        setLongField(term382399, term382399.getClass(), "sumBattleHighScore", 4951612847648699286L);
        setLongField(term382399, term382399.getClass(), "sumBattleBasicHighScore", -766416534046504497L);
        setLongField(term382399, term382399.getClass(), "sumBattleAdvancedHighScore", 7731850539576788583L);
        setLongField(term382399, term382399.getClass(), "sumBattleExpertHighScore", -7550343991456145598L);
        setLongField(term382399, term382399.getClass(), "sumBattleMasterHighScore", -6831717350631718330L);
        setLongField(term382399, term382399.getClass(), "sumBattleLunaticHighScore", -8820745766074748046L);
        setField(term382399, term382399.getClass(), "eventWatchedDate", "TcGPCGJgmY");
        setField(term382399, term382399.getClass(), "cmEventWatchedDate", "vpkEjvXXLH");
        setField(term382399, term382399.getClass(), "firstGameId", "bFGbwwFEDW");
        setField(term382399, term382399.getClass(), "firstRomVersion", "EcnkWdMLFI");
        setField(term382399, term382399.getClass(), "firstDataVersion", "ysZpVZRgWL");
        setField(term382399, term382399.getClass(), "firstPlayDate", "lxRPqpdlTF");
        setField(term382399, term382399.getClass(), "lastGameId", "uTQsuxGcQK");
        setField(term382399, term382399.getClass(), "lastRomVersion", "bCdsUbgglI");
        setField(term382399, term382399.getClass(), "lastDataVersion", "ZHTWbwKLEA");
        setField(term382399, term382399.getClass(), "compatibleCmVersion", "nxuqVUvwIM");
        setField(term382399, term382399.getClass(), "lastPlayDate", "hvBNsxOuOW");
        setIntField(term382399, term382399.getClass(), "lastPlaceId", -1163168350);
        setField(term382399, term382399.getClass(), "lastPlaceName", "nBeWTZkylU");
        setIntField(term382399, term382399.getClass(), "lastRegionId", -1990889379);
        setField(term382399, term382399.getClass(), "lastRegionName", "QmEkSdWoDZ");
        setIntField(term382399, term382399.getClass(), "lastAllNetId", 1360621475);
        setField(term382399, term382399.getClass(), "lastClientId", "uULuyJzekz");
        setIntField(term382399, term382399.getClass(), "lastUsedDeckId", -575348039);
        setIntField(term382399, term382399.getClass(), "lastPlayMusicLevel", 1770120374);
        setIntField(term382399, term382399.getClass(), "lastEmoneyBrand", 1577498913);
        setField(term382397, term382397.getClass(), "user", term382399);
        setIntField(term382397, term382397.getClass(), "eventId", 2064410706);
        setLongField(term382397, term382397.getClass(), "point", -1229678052402089584L);
        setBooleanField(term382397, term382397.getClass(), "isRankingRewarded", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserEventPoint");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUser", argTypes, term382397, args);
    }

};


