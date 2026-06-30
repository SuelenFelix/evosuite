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

public class UserEventMusic_getType_2412099494 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term370840;

    public UserEventMusic_getType_2412099494() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term370846 = new Long(-8121348431673567857L);
        term370840 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserEventMusic"));
        Object term370842 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term370844 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term370860 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term370861 = newInstance(Class.forName("java.time.LocalDate"));
        Object term370865 = newInstance(Class.forName("java.time.LocalTime"));
        Object term370870 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term370871 = newInstance(Class.forName("java.time.LocalDate"));
        Object term370875 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term370840, term370840.getClass(), "id", 4493327215414592588L);
        setLongField(term370842, term370842.getClass(), "id", 4516020887957787307L);
        setLongField(term370844, term370844.getClass(), "id", 3385475154165692318L);
        setField(term370844, term370844.getClass(), "extId", term370846);
        setField(term370844, term370844.getClass(), "luid", "yPMBJDQAOz");
        setIntField(term370861, term370861.getClass(), "year", 2021);
        setShortField(term370861, term370861.getClass(), "month", (short) 1);
        setShortField(term370861, term370861.getClass(), "day", (short) 6);
        setField(term370860, term370860.getClass(), "date", term370861);
        setByteField(term370865, term370865.getClass(), "hour", (byte) 1);
        setByteField(term370865, term370865.getClass(), "minute", (byte) 15);
        setByteField(term370865, term370865.getClass(), "second", (byte) 53);
        setIntField(term370865, term370865.getClass(), "nano", 117304601);
        setField(term370860, term370860.getClass(), "time", term370865);
        setField(term370844, term370844.getClass(), "registerTime", term370860);
        setIntField(term370871, term370871.getClass(), "year", 2025);
        setShortField(term370871, term370871.getClass(), "month", (short) 6);
        setShortField(term370871, term370871.getClass(), "day", (short) 3);
        setField(term370870, term370870.getClass(), "date", term370871);
        setByteField(term370875, term370875.getClass(), "hour", (byte) 8);
        setByteField(term370875, term370875.getClass(), "minute", (byte) 22);
        setByteField(term370875, term370875.getClass(), "second", (byte) 23);
        setIntField(term370875, term370875.getClass(), "nano", 12025593);
        setField(term370870, term370870.getClass(), "time", term370875);
        setField(term370844, term370844.getClass(), "accessTime", term370870);
        setField(term370842, term370842.getClass(), "card", term370844);
        setField(term370842, term370842.getClass(), "userName", "oqsgYMFTfZ");
        setIntField(term370842, term370842.getClass(), "level", -292295030);
        setIntField(term370842, term370842.getClass(), "reincarnationNum", -1820605383);
        setLongField(term370842, term370842.getClass(), "exp", 3885649415941072018L);
        setLongField(term370842, term370842.getClass(), "point", 2330237081823680679L);
        setLongField(term370842, term370842.getClass(), "totalPoint", -951626017101418271L);
        setIntField(term370842, term370842.getClass(), "playCount", -654567193);
        setIntField(term370842, term370842.getClass(), "jewelCount", 1804859736);
        setIntField(term370842, term370842.getClass(), "totalJewelCount", -1987672287);
        setIntField(term370842, term370842.getClass(), "medalCount", 572517165);
        setIntField(term370842, term370842.getClass(), "playerRating", 465847050);
        setIntField(term370842, term370842.getClass(), "highestRating", 2038161669);
        setIntField(term370842, term370842.getClass(), "battlePoint", -1798649675);
        setIntField(term370842, term370842.getClass(), "bestBattlePoint", -428041885);
        setIntField(term370842, term370842.getClass(), "overDamageBattlePoint", 22830527);
        setBooleanField(term370842, term370842.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term370842, term370842.getClass(), "nameplateId", -1562034026);
        setIntField(term370842, term370842.getClass(), "trophyId", 1598612274);
        setIntField(term370842, term370842.getClass(), "cardId", 1013413563);
        setIntField(term370842, term370842.getClass(), "characterId", -777863034);
        setIntField(term370842, term370842.getClass(), "characterVoiceNo", -616688345);
        setIntField(term370842, term370842.getClass(), "tabSetting", -1647493758);
        setIntField(term370842, term370842.getClass(), "tabSortSetting", 941222207);
        setIntField(term370842, term370842.getClass(), "cardCategorySetting", -1578218991);
        setIntField(term370842, term370842.getClass(), "cardSortSetting", 1923296076);
        setIntField(term370842, term370842.getClass(), "rivalScoreCategorySetting", 1414766148);
        setIntField(term370842, term370842.getClass(), "playedTutorialBit", 531833293);
        setIntField(term370842, term370842.getClass(), "firstTutorialCancelNum", -939976169);
        setLongField(term370842, term370842.getClass(), "sumTechHighScore", 8981124088822373763L);
        setLongField(term370842, term370842.getClass(), "sumTechBasicHighScore", 8067079716586537611L);
        setLongField(term370842, term370842.getClass(), "sumTechAdvancedHighScore", -4219964499222986900L);
        setLongField(term370842, term370842.getClass(), "sumTechExpertHighScore", 9066591031832975980L);
        setLongField(term370842, term370842.getClass(), "sumTechMasterHighScore", -8621177491187554721L);
        setLongField(term370842, term370842.getClass(), "sumTechLunaticHighScore", 6991141146960166283L);
        setLongField(term370842, term370842.getClass(), "sumBattleHighScore", -5679892054709146882L);
        setLongField(term370842, term370842.getClass(), "sumBattleBasicHighScore", -647853766605757537L);
        setLongField(term370842, term370842.getClass(), "sumBattleAdvancedHighScore", 8543637384292717239L);
        setLongField(term370842, term370842.getClass(), "sumBattleExpertHighScore", 3696630797002934740L);
        setLongField(term370842, term370842.getClass(), "sumBattleMasterHighScore", 447717263873108518L);
        setLongField(term370842, term370842.getClass(), "sumBattleLunaticHighScore", 7357985593321942478L);
        setField(term370842, term370842.getClass(), "eventWatchedDate", "iAFNdbRIVG");
        setField(term370842, term370842.getClass(), "cmEventWatchedDate", "AGnFhhQyih");
        setField(term370842, term370842.getClass(), "firstGameId", "IRAQJIbBQm");
        setField(term370842, term370842.getClass(), "firstRomVersion", "oUWxwMXaWa");
        setField(term370842, term370842.getClass(), "firstDataVersion", "OVuedhrXPK");
        setField(term370842, term370842.getClass(), "firstPlayDate", "eNLegmDnty");
        setField(term370842, term370842.getClass(), "lastGameId", "vvPLFWLFiF");
        setField(term370842, term370842.getClass(), "lastRomVersion", "yVOYltBxzA");
        setField(term370842, term370842.getClass(), "lastDataVersion", "iZhMqQtcWR");
        setField(term370842, term370842.getClass(), "compatibleCmVersion", "WgBQHbBTuD");
        setField(term370842, term370842.getClass(), "lastPlayDate", "hANCldNyWz");
        setIntField(term370842, term370842.getClass(), "lastPlaceId", 238401109);
        setField(term370842, term370842.getClass(), "lastPlaceName", "YgEldiuZiB");
        setIntField(term370842, term370842.getClass(), "lastRegionId", -485512261);
        setField(term370842, term370842.getClass(), "lastRegionName", "iJOleDJkLD");
        setIntField(term370842, term370842.getClass(), "lastAllNetId", 666619641);
        setField(term370842, term370842.getClass(), "lastClientId", "BmwTjEHWHB");
        setIntField(term370842, term370842.getClass(), "lastUsedDeckId", 316445800);
        setIntField(term370842, term370842.getClass(), "lastPlayMusicLevel", -2070112301);
        setIntField(term370842, term370842.getClass(), "lastEmoneyBrand", 1969813256);
        setField(term370840, term370840.getClass(), "user", term370842);
        setIntField(term370840, term370840.getClass(), "eventId", -1837655503);
        setIntField(term370840, term370840.getClass(), "type", -329121471);
        setIntField(term370840, term370840.getClass(), "musicId", 584325979);
        setIntField(term370840, term370840.getClass(), "level", 30410395);
        setIntField(term370840, term370840.getClass(), "techScoreMax", 1072616225);
        setIntField(term370840, term370840.getClass(), "platinumScoreMax", 357326561);
        setField(term370840, term370840.getClass(), "techRecordDate", "oOEmfborlo");
        setBooleanField(term370840, term370840.getClass(), "isTechNewRecord", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserEventMusic");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getType", argTypes, term370840, args);
    }

};


