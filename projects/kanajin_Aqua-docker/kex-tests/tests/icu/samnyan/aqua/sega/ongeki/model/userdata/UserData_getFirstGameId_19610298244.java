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

public class UserData_getFirstGameId_19610298244 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40530;

    public UserData_getFirstGameId_19610298244() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term40534 = new Long(-8463029266761149071L);
        term40530 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term40532 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term40548 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term40549 = newInstance(Class.forName("java.time.LocalDate"));
        Object term40553 = newInstance(Class.forName("java.time.LocalTime"));
        Object term40558 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term40559 = newInstance(Class.forName("java.time.LocalDate"));
        Object term40563 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term40530, term40530.getClass(), "id", 8547681246636788948L);
        setLongField(term40532, term40532.getClass(), "id", -2070418897756378076L);
        setField(term40532, term40532.getClass(), "extId", term40534);
        setField(term40532, term40532.getClass(), "luid", "DLpKfwPpvr");
        setIntField(term40549, term40549.getClass(), "year", 2021);
        setShortField(term40549, term40549.getClass(), "month", (short) 5);
        setShortField(term40549, term40549.getClass(), "day", (short) 6);
        setField(term40548, term40548.getClass(), "date", term40549);
        setByteField(term40553, term40553.getClass(), "hour", (byte) 21);
        setByteField(term40553, term40553.getClass(), "minute", (byte) 10);
        setByteField(term40553, term40553.getClass(), "second", (byte) 43);
        setIntField(term40553, term40553.getClass(), "nano", 123313014);
        setField(term40548, term40548.getClass(), "time", term40553);
        setField(term40532, term40532.getClass(), "registerTime", term40548);
        setIntField(term40559, term40559.getClass(), "year", 2011);
        setShortField(term40559, term40559.getClass(), "month", (short) 6);
        setShortField(term40559, term40559.getClass(), "day", (short) 21);
        setField(term40558, term40558.getClass(), "date", term40559);
        setByteField(term40563, term40563.getClass(), "hour", (byte) 3);
        setByteField(term40563, term40563.getClass(), "minute", (byte) 19);
        setByteField(term40563, term40563.getClass(), "second", (byte) 41);
        setIntField(term40563, term40563.getClass(), "nano", 920537748);
        setField(term40558, term40558.getClass(), "time", term40563);
        setField(term40532, term40532.getClass(), "accessTime", term40558);
        setField(term40530, term40530.getClass(), "card", term40532);
        setField(term40530, term40530.getClass(), "userName", "DLFXidLbuT");
        setIntField(term40530, term40530.getClass(), "level", -15011809);
        setIntField(term40530, term40530.getClass(), "reincarnationNum", -482193296);
        setLongField(term40530, term40530.getClass(), "exp", 4733182453235379235L);
        setLongField(term40530, term40530.getClass(), "point", -5161762055522201695L);
        setLongField(term40530, term40530.getClass(), "totalPoint", -6455995631591797782L);
        setIntField(term40530, term40530.getClass(), "playCount", 1506869786);
        setIntField(term40530, term40530.getClass(), "jewelCount", 950749769);
        setIntField(term40530, term40530.getClass(), "totalJewelCount", 1497396124);
        setIntField(term40530, term40530.getClass(), "medalCount", 1013816325);
        setIntField(term40530, term40530.getClass(), "playerRating", -756785345);
        setIntField(term40530, term40530.getClass(), "highestRating", -1077451707);
        setIntField(term40530, term40530.getClass(), "battlePoint", -580180892);
        setIntField(term40530, term40530.getClass(), "bestBattlePoint", 862135498);
        setIntField(term40530, term40530.getClass(), "overDamageBattlePoint", -1640521852);
        setBooleanField(term40530, term40530.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term40530, term40530.getClass(), "nameplateId", 1999560627);
        setIntField(term40530, term40530.getClass(), "trophyId", 93344937);
        setIntField(term40530, term40530.getClass(), "cardId", 1426545044);
        setIntField(term40530, term40530.getClass(), "characterId", -2114135536);
        setIntField(term40530, term40530.getClass(), "characterVoiceNo", -1934156754);
        setIntField(term40530, term40530.getClass(), "tabSetting", -2122545415);
        setIntField(term40530, term40530.getClass(), "tabSortSetting", 45477597);
        setIntField(term40530, term40530.getClass(), "cardCategorySetting", 702851889);
        setIntField(term40530, term40530.getClass(), "cardSortSetting", 2035373298);
        setIntField(term40530, term40530.getClass(), "rivalScoreCategorySetting", 1328311779);
        setIntField(term40530, term40530.getClass(), "playedTutorialBit", -1459351662);
        setIntField(term40530, term40530.getClass(), "firstTutorialCancelNum", -887392605);
        setLongField(term40530, term40530.getClass(), "sumTechHighScore", -992220562260824979L);
        setLongField(term40530, term40530.getClass(), "sumTechBasicHighScore", -2035190444044214401L);
        setLongField(term40530, term40530.getClass(), "sumTechAdvancedHighScore", -447638576776090708L);
        setLongField(term40530, term40530.getClass(), "sumTechExpertHighScore", -3876284999950409934L);
        setLongField(term40530, term40530.getClass(), "sumTechMasterHighScore", 219518058983770018L);
        setLongField(term40530, term40530.getClass(), "sumTechLunaticHighScore", 1549908057368393138L);
        setLongField(term40530, term40530.getClass(), "sumBattleHighScore", 1779727837594554817L);
        setLongField(term40530, term40530.getClass(), "sumBattleBasicHighScore", -6445063982585716818L);
        setLongField(term40530, term40530.getClass(), "sumBattleAdvancedHighScore", -4609129422862658333L);
        setLongField(term40530, term40530.getClass(), "sumBattleExpertHighScore", 4606742231634944447L);
        setLongField(term40530, term40530.getClass(), "sumBattleMasterHighScore", 1182124670479030227L);
        setLongField(term40530, term40530.getClass(), "sumBattleLunaticHighScore", -7781300974767589244L);
        setField(term40530, term40530.getClass(), "eventWatchedDate", "FjkxfTXGIH");
        setField(term40530, term40530.getClass(), "cmEventWatchedDate", "KJkWSFFnmR");
        setField(term40530, term40530.getClass(), "firstGameId", "FBYRIDZvmW");
        setField(term40530, term40530.getClass(), "firstRomVersion", "IyjLfrDZrV");
        setField(term40530, term40530.getClass(), "firstDataVersion", "BRMTHqqoRg");
        setField(term40530, term40530.getClass(), "firstPlayDate", "nOElYZBeyU");
        setField(term40530, term40530.getClass(), "lastGameId", "eUXPtGmoNg");
        setField(term40530, term40530.getClass(), "lastRomVersion", "ZjqXyUmAJY");
        setField(term40530, term40530.getClass(), "lastDataVersion", "pjEERkBbYo");
        setField(term40530, term40530.getClass(), "compatibleCmVersion", "FQPqmjhWog");
        setField(term40530, term40530.getClass(), "lastPlayDate", "sYtJsiIiSX");
        setIntField(term40530, term40530.getClass(), "lastPlaceId", 1813573586);
        setField(term40530, term40530.getClass(), "lastPlaceName", "KgfsAwTFFn");
        setIntField(term40530, term40530.getClass(), "lastRegionId", -1950105121);
        setField(term40530, term40530.getClass(), "lastRegionName", "hFnFlgThhp");
        setIntField(term40530, term40530.getClass(), "lastAllNetId", 1664370474);
        setField(term40530, term40530.getClass(), "lastClientId", "aEZAnHuGSR");
        setIntField(term40530, term40530.getClass(), "lastUsedDeckId", 56756754);
        setIntField(term40530, term40530.getClass(), "lastPlayMusicLevel", -1283242129);
        setIntField(term40530, term40530.getClass(), "lastEmoneyBrand", -1400827537);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFirstGameId", argTypes, term40530, args);
    }

};


