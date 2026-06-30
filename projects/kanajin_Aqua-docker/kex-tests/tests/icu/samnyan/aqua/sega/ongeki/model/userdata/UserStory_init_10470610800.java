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

public class UserStory_init_10470610800 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term157634;

    public UserStory_init_10470610800() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term157638 = new Long(-1279670138064751276L);
        term157634 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term157636 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term157652 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term157653 = newInstance(Class.forName("java.time.LocalDate"));
        Object term157657 = newInstance(Class.forName("java.time.LocalTime"));
        Object term157662 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term157663 = newInstance(Class.forName("java.time.LocalDate"));
        Object term157667 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term157634, term157634.getClass(), "id", 25777508728098735L);
        setLongField(term157636, term157636.getClass(), "id", -5537421233963863439L);
        setField(term157636, term157636.getClass(), "extId", term157638);
        setField(term157636, term157636.getClass(), "luid", "YKcZHffhWM");
        setIntField(term157653, term157653.getClass(), "year", 2015);
        setShortField(term157653, term157653.getClass(), "month", (short) 6);
        setShortField(term157653, term157653.getClass(), "day", (short) 29);
        setField(term157652, term157652.getClass(), "date", term157653);
        setByteField(term157657, term157657.getClass(), "hour", (byte) 15);
        setByteField(term157657, term157657.getClass(), "minute", (byte) 4);
        setByteField(term157657, term157657.getClass(), "second", (byte) 16);
        setIntField(term157657, term157657.getClass(), "nano", 322383816);
        setField(term157652, term157652.getClass(), "time", term157657);
        setField(term157636, term157636.getClass(), "registerTime", term157652);
        setIntField(term157663, term157663.getClass(), "year", 2029);
        setShortField(term157663, term157663.getClass(), "month", (short) 6);
        setShortField(term157663, term157663.getClass(), "day", (short) 10);
        setField(term157662, term157662.getClass(), "date", term157663);
        setByteField(term157667, term157667.getClass(), "hour", (byte) 10);
        setByteField(term157667, term157667.getClass(), "minute", (byte) 16);
        setByteField(term157667, term157667.getClass(), "second", (byte) 3);
        setIntField(term157667, term157667.getClass(), "nano", 695609423);
        setField(term157662, term157662.getClass(), "time", term157667);
        setField(term157636, term157636.getClass(), "accessTime", term157662);
        setField(term157634, term157634.getClass(), "card", term157636);
        setField(term157634, term157634.getClass(), "userName", "FVvtvTPEiD");
        setIntField(term157634, term157634.getClass(), "level", -1154325713);
        setIntField(term157634, term157634.getClass(), "reincarnationNum", -1075315005);
        setLongField(term157634, term157634.getClass(), "exp", -7776455266794736508L);
        setLongField(term157634, term157634.getClass(), "point", 1859486651056014320L);
        setLongField(term157634, term157634.getClass(), "totalPoint", 7937872670852497485L);
        setIntField(term157634, term157634.getClass(), "playCount", -34413100);
        setIntField(term157634, term157634.getClass(), "jewelCount", 1508503068);
        setIntField(term157634, term157634.getClass(), "totalJewelCount", 915463806);
        setIntField(term157634, term157634.getClass(), "medalCount", -924571065);
        setIntField(term157634, term157634.getClass(), "playerRating", -358133258);
        setIntField(term157634, term157634.getClass(), "highestRating", 994709385);
        setIntField(term157634, term157634.getClass(), "battlePoint", 1153732002);
        setIntField(term157634, term157634.getClass(), "bestBattlePoint", 1936443833);
        setIntField(term157634, term157634.getClass(), "overDamageBattlePoint", -531943903);
        setBooleanField(term157634, term157634.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term157634, term157634.getClass(), "nameplateId", 1225651816);
        setIntField(term157634, term157634.getClass(), "trophyId", -1615061649);
        setIntField(term157634, term157634.getClass(), "cardId", -251883790);
        setIntField(term157634, term157634.getClass(), "characterId", 1712922352);
        setIntField(term157634, term157634.getClass(), "characterVoiceNo", -430074689);
        setIntField(term157634, term157634.getClass(), "tabSetting", -163272182);
        setIntField(term157634, term157634.getClass(), "tabSortSetting", -1054836913);
        setIntField(term157634, term157634.getClass(), "cardCategorySetting", -1229412292);
        setIntField(term157634, term157634.getClass(), "cardSortSetting", -145290566);
        setIntField(term157634, term157634.getClass(), "rivalScoreCategorySetting", -484230704);
        setIntField(term157634, term157634.getClass(), "playedTutorialBit", -840960310);
        setIntField(term157634, term157634.getClass(), "firstTutorialCancelNum", 2113830045);
        setLongField(term157634, term157634.getClass(), "sumTechHighScore", 4330619556244422331L);
        setLongField(term157634, term157634.getClass(), "sumTechBasicHighScore", -3390269648729027515L);
        setLongField(term157634, term157634.getClass(), "sumTechAdvancedHighScore", 2068158559324124841L);
        setLongField(term157634, term157634.getClass(), "sumTechExpertHighScore", -8371620123385419373L);
        setLongField(term157634, term157634.getClass(), "sumTechMasterHighScore", 2322443444505607884L);
        setLongField(term157634, term157634.getClass(), "sumTechLunaticHighScore", -382033077003957775L);
        setLongField(term157634, term157634.getClass(), "sumBattleHighScore", -7039393188499276626L);
        setLongField(term157634, term157634.getClass(), "sumBattleBasicHighScore", 5335480018574102159L);
        setLongField(term157634, term157634.getClass(), "sumBattleAdvancedHighScore", -8598034656647189539L);
        setLongField(term157634, term157634.getClass(), "sumBattleExpertHighScore", -2322836104787041994L);
        setLongField(term157634, term157634.getClass(), "sumBattleMasterHighScore", -3184087865960753750L);
        setLongField(term157634, term157634.getClass(), "sumBattleLunaticHighScore", 1368967421869882287L);
        setField(term157634, term157634.getClass(), "eventWatchedDate", "paedcGulXI");
        setField(term157634, term157634.getClass(), "cmEventWatchedDate", "voVkXMJSsx");
        setField(term157634, term157634.getClass(), "firstGameId", "tOqDchKApH");
        setField(term157634, term157634.getClass(), "firstRomVersion", "iqeVuiibgM");
        setField(term157634, term157634.getClass(), "firstDataVersion", "LCPfALdqnP");
        setField(term157634, term157634.getClass(), "firstPlayDate", "YRvjJByBZa");
        setField(term157634, term157634.getClass(), "lastGameId", "yWPHiAqZcQ");
        setField(term157634, term157634.getClass(), "lastRomVersion", "IppcpUlrjC");
        setField(term157634, term157634.getClass(), "lastDataVersion", "hxSnnaHCFY");
        setField(term157634, term157634.getClass(), "compatibleCmVersion", "SQvESbffjw");
        setField(term157634, term157634.getClass(), "lastPlayDate", "eOSkqEXcaE");
        setIntField(term157634, term157634.getClass(), "lastPlaceId", 957422050);
        setField(term157634, term157634.getClass(), "lastPlaceName", "MAHSuEBjDv");
        setIntField(term157634, term157634.getClass(), "lastRegionId", -443514250);
        setField(term157634, term157634.getClass(), "lastRegionName", "FJPRnSrJmK");
        setIntField(term157634, term157634.getClass(), "lastAllNetId", 1623408712);
        setField(term157634, term157634.getClass(), "lastClientId", "fYRcUEKErh");
        setIntField(term157634, term157634.getClass(), "lastUsedDeckId", -689716944);
        setIntField(term157634, term157634.getClass(), "lastPlayMusicLevel", -76212338);
        setIntField(term157634, term157634.getClass(), "lastEmoneyBrand", 1841912944);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserStory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Object[] args = new Object[1];
        args[0] = term157634;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


