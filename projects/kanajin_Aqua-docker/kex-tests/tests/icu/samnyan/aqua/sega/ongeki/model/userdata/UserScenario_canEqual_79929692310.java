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

public class UserScenario_canEqual_79929692310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100817;
     Object term101084;

    public UserScenario_canEqual_79929692310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term100823 = new Long(-4043093655001688454L);
        term100817 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserScenario"));
        Object term100819 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term100821 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term100837 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term100838 = newInstance(Class.forName("java.time.LocalDate"));
        Object term100842 = newInstance(Class.forName("java.time.LocalTime"));
        Object term100847 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term100848 = newInstance(Class.forName("java.time.LocalDate"));
        Object term100852 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term100817, term100817.getClass(), "id", -4611460103853741537L);
        setLongField(term100819, term100819.getClass(), "id", 4454588796716170496L);
        setLongField(term100821, term100821.getClass(), "id", -6254614817790211877L);
        setField(term100821, term100821.getClass(), "extId", term100823);
        setField(term100821, term100821.getClass(), "luid", "wiqxbqDkJU");
        setIntField(term100838, term100838.getClass(), "year", 2012);
        setShortField(term100838, term100838.getClass(), "month", (short) 6);
        setShortField(term100838, term100838.getClass(), "day", (short) 7);
        setField(term100837, term100837.getClass(), "date", term100838);
        setByteField(term100842, term100842.getClass(), "hour", (byte) 19);
        setByteField(term100842, term100842.getClass(), "minute", (byte) 20);
        setByteField(term100842, term100842.getClass(), "second", (byte) 29);
        setIntField(term100842, term100842.getClass(), "nano", 953959934);
        setField(term100837, term100837.getClass(), "time", term100842);
        setField(term100821, term100821.getClass(), "registerTime", term100837);
        setIntField(term100848, term100848.getClass(), "year", 2024);
        setShortField(term100848, term100848.getClass(), "month", (short) 3);
        setShortField(term100848, term100848.getClass(), "day", (short) 21);
        setField(term100847, term100847.getClass(), "date", term100848);
        setByteField(term100852, term100852.getClass(), "hour", (byte) 1);
        setByteField(term100852, term100852.getClass(), "minute", (byte) 21);
        setByteField(term100852, term100852.getClass(), "second", (byte) 2);
        setIntField(term100852, term100852.getClass(), "nano", 692012262);
        setField(term100847, term100847.getClass(), "time", term100852);
        setField(term100821, term100821.getClass(), "accessTime", term100847);
        setField(term100819, term100819.getClass(), "card", term100821);
        setField(term100819, term100819.getClass(), "userName", "psNunGzDVf");
        setIntField(term100819, term100819.getClass(), "level", 755997989);
        setIntField(term100819, term100819.getClass(), "reincarnationNum", -794785945);
        setLongField(term100819, term100819.getClass(), "exp", -4915758880704997916L);
        setLongField(term100819, term100819.getClass(), "point", 7912030788557604118L);
        setLongField(term100819, term100819.getClass(), "totalPoint", -3761927265698212278L);
        setIntField(term100819, term100819.getClass(), "playCount", 1059904606);
        setIntField(term100819, term100819.getClass(), "jewelCount", 994860846);
        setIntField(term100819, term100819.getClass(), "totalJewelCount", 726731947);
        setIntField(term100819, term100819.getClass(), "medalCount", -2009136728);
        setIntField(term100819, term100819.getClass(), "playerRating", 579864376);
        setIntField(term100819, term100819.getClass(), "highestRating", -1048697968);
        setIntField(term100819, term100819.getClass(), "battlePoint", -892964431);
        setIntField(term100819, term100819.getClass(), "bestBattlePoint", 1006790201);
        setIntField(term100819, term100819.getClass(), "overDamageBattlePoint", 843806429);
        setBooleanField(term100819, term100819.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term100819, term100819.getClass(), "nameplateId", 283696386);
        setIntField(term100819, term100819.getClass(), "trophyId", 564614202);
        setIntField(term100819, term100819.getClass(), "cardId", 677731743);
        setIntField(term100819, term100819.getClass(), "characterId", 1693950543);
        setIntField(term100819, term100819.getClass(), "characterVoiceNo", 1754551236);
        setIntField(term100819, term100819.getClass(), "tabSetting", -348120687);
        setIntField(term100819, term100819.getClass(), "tabSortSetting", -50653203);
        setIntField(term100819, term100819.getClass(), "cardCategorySetting", 771255311);
        setIntField(term100819, term100819.getClass(), "cardSortSetting", -1063550375);
        setIntField(term100819, term100819.getClass(), "rivalScoreCategorySetting", 416754757);
        setIntField(term100819, term100819.getClass(), "playedTutorialBit", -878383495);
        setIntField(term100819, term100819.getClass(), "firstTutorialCancelNum", -1333087297);
        setLongField(term100819, term100819.getClass(), "sumTechHighScore", 1170580072130944655L);
        setLongField(term100819, term100819.getClass(), "sumTechBasicHighScore", 4978788793814668080L);
        setLongField(term100819, term100819.getClass(), "sumTechAdvancedHighScore", -720349426913581051L);
        setLongField(term100819, term100819.getClass(), "sumTechExpertHighScore", -4642930237593091070L);
        setLongField(term100819, term100819.getClass(), "sumTechMasterHighScore", 8487537903730003233L);
        setLongField(term100819, term100819.getClass(), "sumTechLunaticHighScore", 2098403151846708507L);
        setLongField(term100819, term100819.getClass(), "sumBattleHighScore", -1562117768116694382L);
        setLongField(term100819, term100819.getClass(), "sumBattleBasicHighScore", 5704548673526128268L);
        setLongField(term100819, term100819.getClass(), "sumBattleAdvancedHighScore", 2264889560960513145L);
        setLongField(term100819, term100819.getClass(), "sumBattleExpertHighScore", 3620836361287844637L);
        setLongField(term100819, term100819.getClass(), "sumBattleMasterHighScore", 2491904753526916872L);
        setLongField(term100819, term100819.getClass(), "sumBattleLunaticHighScore", -6367340974615807088L);
        setField(term100819, term100819.getClass(), "eventWatchedDate", "YFOetAfnRt");
        setField(term100819, term100819.getClass(), "cmEventWatchedDate", "VgCCefhtcT");
        setField(term100819, term100819.getClass(), "firstGameId", "DEvoiMeeMr");
        setField(term100819, term100819.getClass(), "firstRomVersion", "CeaAfrYZQU");
        setField(term100819, term100819.getClass(), "firstDataVersion", "hLWnnngzRq");
        setField(term100819, term100819.getClass(), "firstPlayDate", "iLNHwyhEDE");
        setField(term100819, term100819.getClass(), "lastGameId", "duILkPooNH");
        setField(term100819, term100819.getClass(), "lastRomVersion", "bUJrQeiZOb");
        setField(term100819, term100819.getClass(), "lastDataVersion", "mQqpexSybQ");
        setField(term100819, term100819.getClass(), "compatibleCmVersion", "KxEBqnheIv");
        setField(term100819, term100819.getClass(), "lastPlayDate", "ExgxdQmpcx");
        setIntField(term100819, term100819.getClass(), "lastPlaceId", 855437401);
        setField(term100819, term100819.getClass(), "lastPlaceName", "SUwVfgXZzs");
        setIntField(term100819, term100819.getClass(), "lastRegionId", 929964148);
        setField(term100819, term100819.getClass(), "lastRegionName", "OzwvrniiKl");
        setIntField(term100819, term100819.getClass(), "lastAllNetId", 1226042578);
        setField(term100819, term100819.getClass(), "lastClientId", "beAkHVBeEQ");
        setIntField(term100819, term100819.getClass(), "lastUsedDeckId", 1894178312);
        setIntField(term100819, term100819.getClass(), "lastPlayMusicLevel", 1804953221);
        setIntField(term100819, term100819.getClass(), "lastEmoneyBrand", -1246078900);
        setField(term100817, term100817.getClass(), "user", term100819);
        setIntField(term100817, term100817.getClass(), "scenarioId", 488994033);
        setIntField(term100817, term100817.getClass(), "playCount", 1059681981);
        term101084 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserScenario");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term101084;
        callMethod(klass, "canEqual", argTypes, term100817, args);
    }

};


