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
import java.lang.Long;
import java.lang.Object;
import java.lang.Integer;

public class UserTrainingRoom_init_180664028018 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21369;
     Object term21371;
     Object term21646;
     Object term21648;

    public UserTrainingRoom_init_180664028018() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21369 = new Long(9113614356317836741L);
        Long term21375 = new Long(-4443169559037975007L);
        term21371 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term21373 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term21389 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term21390 = newInstance(Class.forName("java.time.LocalDate"));
        Object term21394 = newInstance(Class.forName("java.time.LocalTime"));
        Object term21399 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term21400 = newInstance(Class.forName("java.time.LocalDate"));
        Object term21404 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term21371, term21371.getClass(), "id", 2244124922001093690L);
        setLongField(term21373, term21373.getClass(), "id", -849289244399400018L);
        setField(term21373, term21373.getClass(), "extId", term21375);
        setField(term21373, term21373.getClass(), "luid", "gvjdfHNzOa");
        setIntField(term21390, term21390.getClass(), "year", 2016);
        setShortField(term21390, term21390.getClass(), "month", (short) 6);
        setShortField(term21390, term21390.getClass(), "day", (short) 23);
        setField(term21389, term21389.getClass(), "date", term21390);
        setByteField(term21394, term21394.getClass(), "hour", (byte) 20);
        setByteField(term21394, term21394.getClass(), "minute", (byte) 51);
        setByteField(term21394, term21394.getClass(), "second", (byte) 43);
        setIntField(term21394, term21394.getClass(), "nano", 284389409);
        setField(term21389, term21389.getClass(), "time", term21394);
        setField(term21373, term21373.getClass(), "registerTime", term21389);
        setIntField(term21400, term21400.getClass(), "year", 2014);
        setShortField(term21400, term21400.getClass(), "month", (short) 10);
        setShortField(term21400, term21400.getClass(), "day", (short) 7);
        setField(term21399, term21399.getClass(), "date", term21400);
        setByteField(term21404, term21404.getClass(), "hour", (byte) 12);
        setByteField(term21404, term21404.getClass(), "minute", (byte) 59);
        setByteField(term21404, term21404.getClass(), "second", (byte) 39);
        setIntField(term21404, term21404.getClass(), "nano", 603709306);
        setField(term21399, term21399.getClass(), "time", term21404);
        setField(term21373, term21373.getClass(), "accessTime", term21399);
        setField(term21371, term21371.getClass(), "card", term21373);
        setField(term21371, term21371.getClass(), "userName", "HqitWglYWX");
        setIntField(term21371, term21371.getClass(), "level", -511400358);
        setIntField(term21371, term21371.getClass(), "reincarnationNum", -742178468);
        setLongField(term21371, term21371.getClass(), "exp", -5334920917680098031L);
        setLongField(term21371, term21371.getClass(), "point", -5681371087517724194L);
        setLongField(term21371, term21371.getClass(), "totalPoint", -2109397517777696156L);
        setIntField(term21371, term21371.getClass(), "playCount", 694989162);
        setIntField(term21371, term21371.getClass(), "jewelCount", -65504209);
        setIntField(term21371, term21371.getClass(), "totalJewelCount", 1745199030);
        setIntField(term21371, term21371.getClass(), "medalCount", -1440013173);
        setIntField(term21371, term21371.getClass(), "playerRating", -288126597);
        setIntField(term21371, term21371.getClass(), "highestRating", -218831961);
        setIntField(term21371, term21371.getClass(), "battlePoint", 826765055);
        setIntField(term21371, term21371.getClass(), "bestBattlePoint", 1358117317);
        setIntField(term21371, term21371.getClass(), "overDamageBattlePoint", 229989439);
        setBooleanField(term21371, term21371.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term21371, term21371.getClass(), "nameplateId", -1620126913);
        setIntField(term21371, term21371.getClass(), "trophyId", -1095121979);
        setIntField(term21371, term21371.getClass(), "cardId", -1674851914);
        setIntField(term21371, term21371.getClass(), "characterId", -1891353352);
        setIntField(term21371, term21371.getClass(), "characterVoiceNo", 113007640);
        setIntField(term21371, term21371.getClass(), "tabSetting", 1782226794);
        setIntField(term21371, term21371.getClass(), "tabSortSetting", 1115327577);
        setIntField(term21371, term21371.getClass(), "cardCategorySetting", 840704993);
        setIntField(term21371, term21371.getClass(), "cardSortSetting", 1297035285);
        setIntField(term21371, term21371.getClass(), "rivalScoreCategorySetting", -826239685);
        setIntField(term21371, term21371.getClass(), "playedTutorialBit", -845551243);
        setIntField(term21371, term21371.getClass(), "firstTutorialCancelNum", 370671198);
        setLongField(term21371, term21371.getClass(), "sumTechHighScore", 6631484353678437959L);
        setLongField(term21371, term21371.getClass(), "sumTechBasicHighScore", -1763360854589438694L);
        setLongField(term21371, term21371.getClass(), "sumTechAdvancedHighScore", -4225690761644993738L);
        setLongField(term21371, term21371.getClass(), "sumTechExpertHighScore", 4498588544424613697L);
        setLongField(term21371, term21371.getClass(), "sumTechMasterHighScore", 6207481297504886524L);
        setLongField(term21371, term21371.getClass(), "sumTechLunaticHighScore", -8869783148712995243L);
        setLongField(term21371, term21371.getClass(), "sumBattleHighScore", 9148095734887346640L);
        setLongField(term21371, term21371.getClass(), "sumBattleBasicHighScore", -5311570055634772542L);
        setLongField(term21371, term21371.getClass(), "sumBattleAdvancedHighScore", -1279719656945091084L);
        setLongField(term21371, term21371.getClass(), "sumBattleExpertHighScore", 7190487627244901799L);
        setLongField(term21371, term21371.getClass(), "sumBattleMasterHighScore", -5577824208081701355L);
        setLongField(term21371, term21371.getClass(), "sumBattleLunaticHighScore", 4003767587571884508L);
        setField(term21371, term21371.getClass(), "eventWatchedDate", "pOuFRlHmbK");
        setField(term21371, term21371.getClass(), "cmEventWatchedDate", "WrzdBkinqV");
        setField(term21371, term21371.getClass(), "firstGameId", "vydWXHfFTw");
        setField(term21371, term21371.getClass(), "firstRomVersion", "DRhkpDneCC");
        setField(term21371, term21371.getClass(), "firstDataVersion", "vuIJRrypuA");
        setField(term21371, term21371.getClass(), "firstPlayDate", "AxfSZmaiyA");
        setField(term21371, term21371.getClass(), "lastGameId", "lBpveIKbea");
        setField(term21371, term21371.getClass(), "lastRomVersion", "uyLBVQYcOV");
        setField(term21371, term21371.getClass(), "lastDataVersion", "PoTZjDuBHa");
        setField(term21371, term21371.getClass(), "compatibleCmVersion", "MIwvgVrhzP");
        setField(term21371, term21371.getClass(), "lastPlayDate", "HcUUieXdep");
        setIntField(term21371, term21371.getClass(), "lastPlaceId", 1426800646);
        setField(term21371, term21371.getClass(), "lastPlaceName", "AbonCTtbef");
        setIntField(term21371, term21371.getClass(), "lastRegionId", 954234820);
        setField(term21371, term21371.getClass(), "lastRegionName", "maXrGOGoKA");
        setIntField(term21371, term21371.getClass(), "lastAllNetId", 1047346538);
        setField(term21371, term21371.getClass(), "lastClientId", "zAkgWQVCpM");
        setIntField(term21371, term21371.getClass(), "lastUsedDeckId", 728436340);
        setIntField(term21371, term21371.getClass(), "lastPlayMusicLevel", 1841731593);
        setIntField(term21371, term21371.getClass(), "lastEmoneyBrand", -1854929057);
        term21646 = new Integer(1703814701);
        term21648 = new Integer(1370246522);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTrainingRoom");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = long.class;
        argTypes[1] = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        argTypes[5] = Class.forName("java.lang.String");
        Object[] args = new Object[6];
        args[0] = term21369;
        args[1] = term21371;
        args[2] = "yQUDyOroXU";
        args[3] = term21646;
        args[4] = term21648;
        args[5] = "xweqkPdyJH";
        Object instance = callConstructor(klass, argTypes, args);
    }

};


