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

public class UserData_getLastDataVersion_73805179750 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43068;

    public UserData_getLastDataVersion_73805179750() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term43072 = new Long(4949335493504695457L);
        term43068 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term43070 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term43086 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term43087 = newInstance(Class.forName("java.time.LocalDate"));
        Object term43091 = newInstance(Class.forName("java.time.LocalTime"));
        Object term43096 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term43097 = newInstance(Class.forName("java.time.LocalDate"));
        Object term43101 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term43068, term43068.getClass(), "id", 5793505030039838427L);
        setLongField(term43070, term43070.getClass(), "id", 104869345921695905L);
        setField(term43070, term43070.getClass(), "extId", term43072);
        setField(term43070, term43070.getClass(), "luid", "qePuOCwoCf");
        setIntField(term43087, term43087.getClass(), "year", 2029);
        setShortField(term43087, term43087.getClass(), "month", (short) 7);
        setShortField(term43087, term43087.getClass(), "day", (short) 19);
        setField(term43086, term43086.getClass(), "date", term43087);
        setByteField(term43091, term43091.getClass(), "hour", (byte) 4);
        setByteField(term43091, term43091.getClass(), "minute", (byte) 38);
        setByteField(term43091, term43091.getClass(), "second", (byte) 15);
        setIntField(term43091, term43091.getClass(), "nano", 260833456);
        setField(term43086, term43086.getClass(), "time", term43091);
        setField(term43070, term43070.getClass(), "registerTime", term43086);
        setIntField(term43097, term43097.getClass(), "year", 2019);
        setShortField(term43097, term43097.getClass(), "month", (short) 12);
        setShortField(term43097, term43097.getClass(), "day", (short) 13);
        setField(term43096, term43096.getClass(), "date", term43097);
        setByteField(term43101, term43101.getClass(), "hour", (byte) 17);
        setByteField(term43101, term43101.getClass(), "minute", (byte) 38);
        setByteField(term43101, term43101.getClass(), "second", (byte) 43);
        setIntField(term43101, term43101.getClass(), "nano", 435007801);
        setField(term43096, term43096.getClass(), "time", term43101);
        setField(term43070, term43070.getClass(), "accessTime", term43096);
        setField(term43068, term43068.getClass(), "card", term43070);
        setField(term43068, term43068.getClass(), "userName", "vJPujDInGq");
        setIntField(term43068, term43068.getClass(), "level", -240455247);
        setIntField(term43068, term43068.getClass(), "reincarnationNum", 412243891);
        setLongField(term43068, term43068.getClass(), "exp", -5803631481953709495L);
        setLongField(term43068, term43068.getClass(), "point", -4983190578576857758L);
        setLongField(term43068, term43068.getClass(), "totalPoint", 1551212309300619628L);
        setIntField(term43068, term43068.getClass(), "playCount", -1517264869);
        setIntField(term43068, term43068.getClass(), "jewelCount", 1498231709);
        setIntField(term43068, term43068.getClass(), "totalJewelCount", -775074162);
        setIntField(term43068, term43068.getClass(), "medalCount", 304255923);
        setIntField(term43068, term43068.getClass(), "playerRating", 1532668668);
        setIntField(term43068, term43068.getClass(), "highestRating", -100547107);
        setIntField(term43068, term43068.getClass(), "battlePoint", 2140567451);
        setIntField(term43068, term43068.getClass(), "bestBattlePoint", -390400057);
        setIntField(term43068, term43068.getClass(), "overDamageBattlePoint", -157273113);
        setBooleanField(term43068, term43068.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term43068, term43068.getClass(), "nameplateId", 1497057438);
        setIntField(term43068, term43068.getClass(), "trophyId", 1526060255);
        setIntField(term43068, term43068.getClass(), "cardId", -833785119);
        setIntField(term43068, term43068.getClass(), "characterId", -1920705464);
        setIntField(term43068, term43068.getClass(), "characterVoiceNo", 428714196);
        setIntField(term43068, term43068.getClass(), "tabSetting", 934939315);
        setIntField(term43068, term43068.getClass(), "tabSortSetting", -935897776);
        setIntField(term43068, term43068.getClass(), "cardCategorySetting", 1370328728);
        setIntField(term43068, term43068.getClass(), "cardSortSetting", 1126005767);
        setIntField(term43068, term43068.getClass(), "rivalScoreCategorySetting", -1155333431);
        setIntField(term43068, term43068.getClass(), "playedTutorialBit", -2110210183);
        setIntField(term43068, term43068.getClass(), "firstTutorialCancelNum", -687531774);
        setLongField(term43068, term43068.getClass(), "sumTechHighScore", -4520530213003895999L);
        setLongField(term43068, term43068.getClass(), "sumTechBasicHighScore", 1915067600167472834L);
        setLongField(term43068, term43068.getClass(), "sumTechAdvancedHighScore", -5052214162065838650L);
        setLongField(term43068, term43068.getClass(), "sumTechExpertHighScore", -94222650078853780L);
        setLongField(term43068, term43068.getClass(), "sumTechMasterHighScore", -2164399567942958295L);
        setLongField(term43068, term43068.getClass(), "sumTechLunaticHighScore", 6485127487584904536L);
        setLongField(term43068, term43068.getClass(), "sumBattleHighScore", 6217646173265243924L);
        setLongField(term43068, term43068.getClass(), "sumBattleBasicHighScore", 4772045766380729761L);
        setLongField(term43068, term43068.getClass(), "sumBattleAdvancedHighScore", -5215160586515108435L);
        setLongField(term43068, term43068.getClass(), "sumBattleExpertHighScore", -2509873143781504715L);
        setLongField(term43068, term43068.getClass(), "sumBattleMasterHighScore", -4904759676997645613L);
        setLongField(term43068, term43068.getClass(), "sumBattleLunaticHighScore", -2640287313269620296L);
        setField(term43068, term43068.getClass(), "eventWatchedDate", "cHZGcMhatT");
        setField(term43068, term43068.getClass(), "cmEventWatchedDate", "OZGyrUPedG");
        setField(term43068, term43068.getClass(), "firstGameId", "GAxMzRqmXU");
        setField(term43068, term43068.getClass(), "firstRomVersion", "XMhUDGKSWO");
        setField(term43068, term43068.getClass(), "firstDataVersion", "jLgzxtuvVo");
        setField(term43068, term43068.getClass(), "firstPlayDate", "wmmxjOkPnH");
        setField(term43068, term43068.getClass(), "lastGameId", "jgRohUQWxJ");
        setField(term43068, term43068.getClass(), "lastRomVersion", "CJlAiZDIQO");
        setField(term43068, term43068.getClass(), "lastDataVersion", "osgWaTBVoE");
        setField(term43068, term43068.getClass(), "compatibleCmVersion", "mvkMYcgAod");
        setField(term43068, term43068.getClass(), "lastPlayDate", "esbhDGQDgF");
        setIntField(term43068, term43068.getClass(), "lastPlaceId", -1997574107);
        setField(term43068, term43068.getClass(), "lastPlaceName", "tKlyiBloWu");
        setIntField(term43068, term43068.getClass(), "lastRegionId", 748487022);
        setField(term43068, term43068.getClass(), "lastRegionName", "uIgRFcwqLd");
        setIntField(term43068, term43068.getClass(), "lastAllNetId", -706230330);
        setField(term43068, term43068.getClass(), "lastClientId", "AvdsiEyCve");
        setIntField(term43068, term43068.getClass(), "lastUsedDeckId", -926446006);
        setIntField(term43068, term43068.getClass(), "lastPlayMusicLevel", 572417171);
        setIntField(term43068, term43068.getClass(), "lastEmoneyBrand", 46222099);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastDataVersion", argTypes, term43068, args);
    }

};


