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

public class UserEventMusic_getUser_814939192 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term369932;

    public UserEventMusic_getUser_814939192() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term369938 = new Long(8039153062846287600L);
        term369932 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserEventMusic"));
        Object term369934 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term369936 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term369952 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term369953 = newInstance(Class.forName("java.time.LocalDate"));
        Object term369957 = newInstance(Class.forName("java.time.LocalTime"));
        Object term369962 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term369963 = newInstance(Class.forName("java.time.LocalDate"));
        Object term369967 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term369932, term369932.getClass(), "id", 2782682060712134896L);
        setLongField(term369934, term369934.getClass(), "id", 4274390632842427357L);
        setLongField(term369936, term369936.getClass(), "id", 5905741934783343910L);
        setField(term369936, term369936.getClass(), "extId", term369938);
        setField(term369936, term369936.getClass(), "luid", "sFtnQtDxXr");
        setIntField(term369953, term369953.getClass(), "year", 2014);
        setShortField(term369953, term369953.getClass(), "month", (short) 6);
        setShortField(term369953, term369953.getClass(), "day", (short) 4);
        setField(term369952, term369952.getClass(), "date", term369953);
        setByteField(term369957, term369957.getClass(), "hour", (byte) 11);
        setByteField(term369957, term369957.getClass(), "minute", (byte) 47);
        setByteField(term369957, term369957.getClass(), "second", (byte) 18);
        setIntField(term369957, term369957.getClass(), "nano", 119506475);
        setField(term369952, term369952.getClass(), "time", term369957);
        setField(term369936, term369936.getClass(), "registerTime", term369952);
        setIntField(term369963, term369963.getClass(), "year", 2016);
        setShortField(term369963, term369963.getClass(), "month", (short) 2);
        setShortField(term369963, term369963.getClass(), "day", (short) 16);
        setField(term369962, term369962.getClass(), "date", term369963);
        setByteField(term369967, term369967.getClass(), "hour", (byte) 4);
        setByteField(term369967, term369967.getClass(), "minute", (byte) 2);
        setByteField(term369967, term369967.getClass(), "second", (byte) 16);
        setIntField(term369967, term369967.getClass(), "nano", 644071727);
        setField(term369962, term369962.getClass(), "time", term369967);
        setField(term369936, term369936.getClass(), "accessTime", term369962);
        setField(term369934, term369934.getClass(), "card", term369936);
        setField(term369934, term369934.getClass(), "userName", "RpRSYUeiLL");
        setIntField(term369934, term369934.getClass(), "level", 1170527467);
        setIntField(term369934, term369934.getClass(), "reincarnationNum", -1527492834);
        setLongField(term369934, term369934.getClass(), "exp", 7993774036098223255L);
        setLongField(term369934, term369934.getClass(), "point", -7947963434364787140L);
        setLongField(term369934, term369934.getClass(), "totalPoint", -6100885398580900293L);
        setIntField(term369934, term369934.getClass(), "playCount", 272545799);
        setIntField(term369934, term369934.getClass(), "jewelCount", -1339330054);
        setIntField(term369934, term369934.getClass(), "totalJewelCount", 1512057859);
        setIntField(term369934, term369934.getClass(), "medalCount", 112891921);
        setIntField(term369934, term369934.getClass(), "playerRating", 1556090771);
        setIntField(term369934, term369934.getClass(), "highestRating", -172517860);
        setIntField(term369934, term369934.getClass(), "battlePoint", 160858045);
        setIntField(term369934, term369934.getClass(), "bestBattlePoint", -1128802377);
        setIntField(term369934, term369934.getClass(), "overDamageBattlePoint", -678637322);
        setBooleanField(term369934, term369934.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term369934, term369934.getClass(), "nameplateId", 976486899);
        setIntField(term369934, term369934.getClass(), "trophyId", -1303254594);
        setIntField(term369934, term369934.getClass(), "cardId", 1218143780);
        setIntField(term369934, term369934.getClass(), "characterId", 2083093374);
        setIntField(term369934, term369934.getClass(), "characterVoiceNo", -1694099954);
        setIntField(term369934, term369934.getClass(), "tabSetting", 1320097719);
        setIntField(term369934, term369934.getClass(), "tabSortSetting", -593169701);
        setIntField(term369934, term369934.getClass(), "cardCategorySetting", 1427743426);
        setIntField(term369934, term369934.getClass(), "cardSortSetting", -79072635);
        setIntField(term369934, term369934.getClass(), "rivalScoreCategorySetting", 2074933938);
        setIntField(term369934, term369934.getClass(), "playedTutorialBit", -366500972);
        setIntField(term369934, term369934.getClass(), "firstTutorialCancelNum", 1275600920);
        setLongField(term369934, term369934.getClass(), "sumTechHighScore", -7970732100834105412L);
        setLongField(term369934, term369934.getClass(), "sumTechBasicHighScore", 7378109497264582610L);
        setLongField(term369934, term369934.getClass(), "sumTechAdvancedHighScore", -5202803787976416383L);
        setLongField(term369934, term369934.getClass(), "sumTechExpertHighScore", -814688884833578936L);
        setLongField(term369934, term369934.getClass(), "sumTechMasterHighScore", 2100487460729696485L);
        setLongField(term369934, term369934.getClass(), "sumTechLunaticHighScore", -2674401760278481877L);
        setLongField(term369934, term369934.getClass(), "sumBattleHighScore", 8734780235994612254L);
        setLongField(term369934, term369934.getClass(), "sumBattleBasicHighScore", 1396935544147104691L);
        setLongField(term369934, term369934.getClass(), "sumBattleAdvancedHighScore", 4560304671995333605L);
        setLongField(term369934, term369934.getClass(), "sumBattleExpertHighScore", 7651560637347284226L);
        setLongField(term369934, term369934.getClass(), "sumBattleMasterHighScore", -7766716933670927528L);
        setLongField(term369934, term369934.getClass(), "sumBattleLunaticHighScore", 5754925129802712747L);
        setField(term369934, term369934.getClass(), "eventWatchedDate", "uapnKkIphK");
        setField(term369934, term369934.getClass(), "cmEventWatchedDate", "YVHCxkabZC");
        setField(term369934, term369934.getClass(), "firstGameId", "WjKeDakRTY");
        setField(term369934, term369934.getClass(), "firstRomVersion", "QJdoGKWtdQ");
        setField(term369934, term369934.getClass(), "firstDataVersion", "yZhUveYVvY");
        setField(term369934, term369934.getClass(), "firstPlayDate", "KXQWzTpxDD");
        setField(term369934, term369934.getClass(), "lastGameId", "LTDqZejnus");
        setField(term369934, term369934.getClass(), "lastRomVersion", "gNqzyKsZuO");
        setField(term369934, term369934.getClass(), "lastDataVersion", "LRkFTiFyzB");
        setField(term369934, term369934.getClass(), "compatibleCmVersion", "lniPCszubT");
        setField(term369934, term369934.getClass(), "lastPlayDate", "qMRykyRMKT");
        setIntField(term369934, term369934.getClass(), "lastPlaceId", -263504544);
        setField(term369934, term369934.getClass(), "lastPlaceName", "YrjBfcIVyC");
        setIntField(term369934, term369934.getClass(), "lastRegionId", -2032691281);
        setField(term369934, term369934.getClass(), "lastRegionName", "uutwLArpSj");
        setIntField(term369934, term369934.getClass(), "lastAllNetId", -1504060610);
        setField(term369934, term369934.getClass(), "lastClientId", "zVZHAyQQge");
        setIntField(term369934, term369934.getClass(), "lastUsedDeckId", 1388078921);
        setIntField(term369934, term369934.getClass(), "lastPlayMusicLevel", -905385159);
        setIntField(term369934, term369934.getClass(), "lastEmoneyBrand", 599182703);
        setField(term369932, term369932.getClass(), "user", term369934);
        setIntField(term369932, term369932.getClass(), "eventId", 128707910);
        setIntField(term369932, term369932.getClass(), "type", 1623454343);
        setIntField(term369932, term369932.getClass(), "musicId", -398430689);
        setIntField(term369932, term369932.getClass(), "level", 537076622);
        setIntField(term369932, term369932.getClass(), "techScoreMax", 817905945);
        setIntField(term369932, term369932.getClass(), "platinumScoreMax", 615643550);
        setField(term369932, term369932.getClass(), "techRecordDate", "VTtwCwRfPQ");
        setBooleanField(term369932, term369932.getClass(), "isTechNewRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserEventMusic");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUser", argTypes, term369932, args);
    }

};


