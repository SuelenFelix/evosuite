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
import java.lang.Integer;

public class UserData_setLastPlaceId_15341810115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70953;
     Object term71216;

    public UserData_setLastPlaceId_15341810115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term70957 = new Long(5219030281405653303L);
        term70953 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term70955 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term70971 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term70972 = newInstance(Class.forName("java.time.LocalDate"));
        Object term70976 = newInstance(Class.forName("java.time.LocalTime"));
        Object term70981 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term70982 = newInstance(Class.forName("java.time.LocalDate"));
        Object term70986 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term70953, term70953.getClass(), "id", 9058652129546004164L);
        setLongField(term70955, term70955.getClass(), "id", -3412024028741687993L);
        setField(term70955, term70955.getClass(), "extId", term70957);
        setField(term70955, term70955.getClass(), "luid", "RtHOddPkOW");
        setIntField(term70972, term70972.getClass(), "year", 2013);
        setShortField(term70972, term70972.getClass(), "month", (short) 6);
        setShortField(term70972, term70972.getClass(), "day", (short) 29);
        setField(term70971, term70971.getClass(), "date", term70972);
        setByteField(term70976, term70976.getClass(), "hour", (byte) 22);
        setByteField(term70976, term70976.getClass(), "minute", (byte) 31);
        setByteField(term70976, term70976.getClass(), "second", (byte) 28);
        setIntField(term70976, term70976.getClass(), "nano", 930397670);
        setField(term70971, term70971.getClass(), "time", term70976);
        setField(term70955, term70955.getClass(), "registerTime", term70971);
        setIntField(term70982, term70982.getClass(), "year", 2020);
        setShortField(term70982, term70982.getClass(), "month", (short) 5);
        setShortField(term70982, term70982.getClass(), "day", (short) 8);
        setField(term70981, term70981.getClass(), "date", term70982);
        setByteField(term70986, term70986.getClass(), "hour", (byte) 14);
        setByteField(term70986, term70986.getClass(), "minute", (byte) 28);
        setByteField(term70986, term70986.getClass(), "second", (byte) 38);
        setIntField(term70986, term70986.getClass(), "nano", 93855882);
        setField(term70981, term70981.getClass(), "time", term70986);
        setField(term70955, term70955.getClass(), "accessTime", term70981);
        setField(term70953, term70953.getClass(), "card", term70955);
        setField(term70953, term70953.getClass(), "userName", "LAaHVAeRPU");
        setIntField(term70953, term70953.getClass(), "level", -1652639905);
        setIntField(term70953, term70953.getClass(), "reincarnationNum", -1461889742);
        setLongField(term70953, term70953.getClass(), "exp", -4743773691033199856L);
        setLongField(term70953, term70953.getClass(), "point", 5445249338164045376L);
        setLongField(term70953, term70953.getClass(), "totalPoint", 3904137395052612619L);
        setIntField(term70953, term70953.getClass(), "playCount", 1948939030);
        setIntField(term70953, term70953.getClass(), "jewelCount", -1707167847);
        setIntField(term70953, term70953.getClass(), "totalJewelCount", 1083097092);
        setIntField(term70953, term70953.getClass(), "medalCount", -352580386);
        setIntField(term70953, term70953.getClass(), "playerRating", 1000158617);
        setIntField(term70953, term70953.getClass(), "highestRating", 776700097);
        setIntField(term70953, term70953.getClass(), "battlePoint", -147634418);
        setIntField(term70953, term70953.getClass(), "bestBattlePoint", 1734729002);
        setIntField(term70953, term70953.getClass(), "overDamageBattlePoint", 356178482);
        setBooleanField(term70953, term70953.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term70953, term70953.getClass(), "nameplateId", 2114777679);
        setIntField(term70953, term70953.getClass(), "trophyId", 877149909);
        setIntField(term70953, term70953.getClass(), "cardId", -649501188);
        setIntField(term70953, term70953.getClass(), "characterId", 2143993585);
        setIntField(term70953, term70953.getClass(), "characterVoiceNo", -2067989740);
        setIntField(term70953, term70953.getClass(), "tabSetting", 229990395);
        setIntField(term70953, term70953.getClass(), "tabSortSetting", -1374118535);
        setIntField(term70953, term70953.getClass(), "cardCategorySetting", 2009032714);
        setIntField(term70953, term70953.getClass(), "cardSortSetting", -1630891015);
        setIntField(term70953, term70953.getClass(), "rivalScoreCategorySetting", 904551854);
        setIntField(term70953, term70953.getClass(), "playedTutorialBit", -49272576);
        setIntField(term70953, term70953.getClass(), "firstTutorialCancelNum", 246585268);
        setLongField(term70953, term70953.getClass(), "sumTechHighScore", -2627351923440470903L);
        setLongField(term70953, term70953.getClass(), "sumTechBasicHighScore", 2227412096769748963L);
        setLongField(term70953, term70953.getClass(), "sumTechAdvancedHighScore", -5691770586987635129L);
        setLongField(term70953, term70953.getClass(), "sumTechExpertHighScore", 278469276073195090L);
        setLongField(term70953, term70953.getClass(), "sumTechMasterHighScore", -8721079966012575280L);
        setLongField(term70953, term70953.getClass(), "sumTechLunaticHighScore", 3103352049634176766L);
        setLongField(term70953, term70953.getClass(), "sumBattleHighScore", 3732205319116661941L);
        setLongField(term70953, term70953.getClass(), "sumBattleBasicHighScore", -2437083850262908381L);
        setLongField(term70953, term70953.getClass(), "sumBattleAdvancedHighScore", 833849456046483202L);
        setLongField(term70953, term70953.getClass(), "sumBattleExpertHighScore", 3498660691906309998L);
        setLongField(term70953, term70953.getClass(), "sumBattleMasterHighScore", -2863041629805353276L);
        setLongField(term70953, term70953.getClass(), "sumBattleLunaticHighScore", 2542595135669094188L);
        setField(term70953, term70953.getClass(), "eventWatchedDate", "BLPwYfxwnm");
        setField(term70953, term70953.getClass(), "cmEventWatchedDate", "zItHVuBBzy");
        setField(term70953, term70953.getClass(), "firstGameId", "pQcdIREjlp");
        setField(term70953, term70953.getClass(), "firstRomVersion", "WjUrdNMIOj");
        setField(term70953, term70953.getClass(), "firstDataVersion", "aQUpwHjYvS");
        setField(term70953, term70953.getClass(), "firstPlayDate", "lvcTLkVhAN");
        setField(term70953, term70953.getClass(), "lastGameId", "BJJuVqxXjT");
        setField(term70953, term70953.getClass(), "lastRomVersion", "IvxbsFCczM");
        setField(term70953, term70953.getClass(), "lastDataVersion", "GkAaLUoaoL");
        setField(term70953, term70953.getClass(), "compatibleCmVersion", "VSmPzUiFzd");
        setField(term70953, term70953.getClass(), "lastPlayDate", "bLpZNCaWDB");
        setIntField(term70953, term70953.getClass(), "lastPlaceId", 1163312144);
        setField(term70953, term70953.getClass(), "lastPlaceName", "knmwCEeMTY");
        setIntField(term70953, term70953.getClass(), "lastRegionId", 1010014762);
        setField(term70953, term70953.getClass(), "lastRegionName", "qTiIgMQXbW");
        setIntField(term70953, term70953.getClass(), "lastAllNetId", -416886439);
        setField(term70953, term70953.getClass(), "lastClientId", "rARmHDyRHE");
        setIntField(term70953, term70953.getClass(), "lastUsedDeckId", -1632599980);
        setIntField(term70953, term70953.getClass(), "lastPlayMusicLevel", -445306395);
        setIntField(term70953, term70953.getClass(), "lastEmoneyBrand", -1543037055);
        term71216 = new Integer(-150763986);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term71216;
        callMethod(klass, "setLastPlaceId", argTypes, term70953, args);
    }

};


