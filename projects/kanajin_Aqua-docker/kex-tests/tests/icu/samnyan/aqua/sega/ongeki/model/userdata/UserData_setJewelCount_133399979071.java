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

public class UserData_setJewelCount_133399979071 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52033;
     Object term52296;

    public UserData_setJewelCount_133399979071() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term52037 = new Long(2297097306706899827L);
        term52033 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term52035 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term52051 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term52052 = newInstance(Class.forName("java.time.LocalDate"));
        Object term52056 = newInstance(Class.forName("java.time.LocalTime"));
        Object term52061 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term52062 = newInstance(Class.forName("java.time.LocalDate"));
        Object term52066 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term52033, term52033.getClass(), "id", 2539855115472922877L);
        setLongField(term52035, term52035.getClass(), "id", 2225205033924782338L);
        setField(term52035, term52035.getClass(), "extId", term52037);
        setField(term52035, term52035.getClass(), "luid", "IbOvZLmtSE");
        setIntField(term52052, term52052.getClass(), "year", 2024);
        setShortField(term52052, term52052.getClass(), "month", (short) 9);
        setShortField(term52052, term52052.getClass(), "day", (short) 7);
        setField(term52051, term52051.getClass(), "date", term52052);
        setByteField(term52056, term52056.getClass(), "hour", (byte) 2);
        setByteField(term52056, term52056.getClass(), "minute", (byte) 37);
        setByteField(term52056, term52056.getClass(), "second", (byte) 4);
        setIntField(term52056, term52056.getClass(), "nano", 236043949);
        setField(term52051, term52051.getClass(), "time", term52056);
        setField(term52035, term52035.getClass(), "registerTime", term52051);
        setIntField(term52062, term52062.getClass(), "year", 2025);
        setShortField(term52062, term52062.getClass(), "month", (short) 7);
        setShortField(term52062, term52062.getClass(), "day", (short) 4);
        setField(term52061, term52061.getClass(), "date", term52062);
        setByteField(term52066, term52066.getClass(), "hour", (byte) 18);
        setByteField(term52066, term52066.getClass(), "minute", (byte) 13);
        setByteField(term52066, term52066.getClass(), "second", (byte) 37);
        setIntField(term52066, term52066.getClass(), "nano", 681447348);
        setField(term52061, term52061.getClass(), "time", term52066);
        setField(term52035, term52035.getClass(), "accessTime", term52061);
        setField(term52033, term52033.getClass(), "card", term52035);
        setField(term52033, term52033.getClass(), "userName", "AOsIglRFcp");
        setIntField(term52033, term52033.getClass(), "level", -654564305);
        setIntField(term52033, term52033.getClass(), "reincarnationNum", -1985017499);
        setLongField(term52033, term52033.getClass(), "exp", 7835393778718147329L);
        setLongField(term52033, term52033.getClass(), "point", 2629509803227198743L);
        setLongField(term52033, term52033.getClass(), "totalPoint", -8008739907583786665L);
        setIntField(term52033, term52033.getClass(), "playCount", 1959598890);
        setIntField(term52033, term52033.getClass(), "jewelCount", -920963609);
        setIntField(term52033, term52033.getClass(), "totalJewelCount", -724930680);
        setIntField(term52033, term52033.getClass(), "medalCount", -1859413089);
        setIntField(term52033, term52033.getClass(), "playerRating", -288823387);
        setIntField(term52033, term52033.getClass(), "highestRating", 1565022809);
        setIntField(term52033, term52033.getClass(), "battlePoint", 286088345);
        setIntField(term52033, term52033.getClass(), "bestBattlePoint", -1958895309);
        setIntField(term52033, term52033.getClass(), "overDamageBattlePoint", -639022235);
        setBooleanField(term52033, term52033.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term52033, term52033.getClass(), "nameplateId", -1063872965);
        setIntField(term52033, term52033.getClass(), "trophyId", 804907633);
        setIntField(term52033, term52033.getClass(), "cardId", -937521678);
        setIntField(term52033, term52033.getClass(), "characterId", 194707851);
        setIntField(term52033, term52033.getClass(), "characterVoiceNo", 806877632);
        setIntField(term52033, term52033.getClass(), "tabSetting", -1198681384);
        setIntField(term52033, term52033.getClass(), "tabSortSetting", 1224777627);
        setIntField(term52033, term52033.getClass(), "cardCategorySetting", -1771549367);
        setIntField(term52033, term52033.getClass(), "cardSortSetting", -83563931);
        setIntField(term52033, term52033.getClass(), "rivalScoreCategorySetting", 1175147923);
        setIntField(term52033, term52033.getClass(), "playedTutorialBit", -1424244263);
        setIntField(term52033, term52033.getClass(), "firstTutorialCancelNum", 808665285);
        setLongField(term52033, term52033.getClass(), "sumTechHighScore", -7262010620280836353L);
        setLongField(term52033, term52033.getClass(), "sumTechBasicHighScore", -7722734066534066354L);
        setLongField(term52033, term52033.getClass(), "sumTechAdvancedHighScore", -644547147296685723L);
        setLongField(term52033, term52033.getClass(), "sumTechExpertHighScore", 2771276802933392082L);
        setLongField(term52033, term52033.getClass(), "sumTechMasterHighScore", 9159382852866553531L);
        setLongField(term52033, term52033.getClass(), "sumTechLunaticHighScore", 308309058288153545L);
        setLongField(term52033, term52033.getClass(), "sumBattleHighScore", 2769769615541963064L);
        setLongField(term52033, term52033.getClass(), "sumBattleBasicHighScore", 3900506286067369407L);
        setLongField(term52033, term52033.getClass(), "sumBattleAdvancedHighScore", 2739506880892071716L);
        setLongField(term52033, term52033.getClass(), "sumBattleExpertHighScore", 6348449517519237060L);
        setLongField(term52033, term52033.getClass(), "sumBattleMasterHighScore", -3736670675123148973L);
        setLongField(term52033, term52033.getClass(), "sumBattleLunaticHighScore", -732854020469829996L);
        setField(term52033, term52033.getClass(), "eventWatchedDate", "bdONLhBZoA");
        setField(term52033, term52033.getClass(), "cmEventWatchedDate", "qPVeRcolUe");
        setField(term52033, term52033.getClass(), "firstGameId", "AscZyfQFkU");
        setField(term52033, term52033.getClass(), "firstRomVersion", "nPfruizWey");
        setField(term52033, term52033.getClass(), "firstDataVersion", "RvgkUqMUFX");
        setField(term52033, term52033.getClass(), "firstPlayDate", "nOqmldTbXj");
        setField(term52033, term52033.getClass(), "lastGameId", "xNDnWDGUNx");
        setField(term52033, term52033.getClass(), "lastRomVersion", "faGVqjLquQ");
        setField(term52033, term52033.getClass(), "lastDataVersion", "MbsTNUmNqV");
        setField(term52033, term52033.getClass(), "compatibleCmVersion", "VdDIonpedU");
        setField(term52033, term52033.getClass(), "lastPlayDate", "VjtXZcUFNx");
        setIntField(term52033, term52033.getClass(), "lastPlaceId", 2003642877);
        setField(term52033, term52033.getClass(), "lastPlaceName", "bOZSTccXbt");
        setIntField(term52033, term52033.getClass(), "lastRegionId", -1574456346);
        setField(term52033, term52033.getClass(), "lastRegionName", "MBSsxxeNUU");
        setIntField(term52033, term52033.getClass(), "lastAllNetId", 638598511);
        setField(term52033, term52033.getClass(), "lastClientId", "NmUhmPLSgG");
        setIntField(term52033, term52033.getClass(), "lastUsedDeckId", -946663870);
        setIntField(term52033, term52033.getClass(), "lastPlayMusicLevel", 1997126409);
        setIntField(term52033, term52033.getClass(), "lastEmoneyBrand", 1794793561);
        term52296 = new Integer(1483253425);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term52296;
        callMethod(klass, "setJewelCount", argTypes, term52033, args);
    }

};


