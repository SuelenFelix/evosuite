package icu.samnyan.aqua.sega.chunithm.model.userdata;

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
import static icu.samnyan.aqua.sega.chunithm.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class UserData_setFirstDataVersion_147027794088 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term167105;

    public UserData_setFirstDataVersion_147027794088() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term167109 = new Long(4525924047960478347L);
        term167105 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term167107 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term167123 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term167124 = newInstance(Class.forName("java.time.LocalDate"));
        Object term167128 = newInstance(Class.forName("java.time.LocalTime"));
        Object term167133 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term167134 = newInstance(Class.forName("java.time.LocalDate"));
        Object term167138 = newInstance(Class.forName("java.time.LocalTime"));
        Object term167155 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term167156 = newInstance(Class.forName("java.time.LocalDate"));
        Object term167160 = newInstance(Class.forName("java.time.LocalTime"));
        Object term167216 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term167217 = newInstance(Class.forName("java.time.LocalDate"));
        Object term167221 = newInstance(Class.forName("java.time.LocalTime"));
        Object term167264 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term167265 = newInstance(Class.forName("java.time.LocalDate"));
        Object term167269 = newInstance(Class.forName("java.time.LocalTime"));
        Object term167310 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term167311 = newInstance(Class.forName("java.time.LocalDate"));
        Object term167315 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term167105, term167105.getClass(), "id", 3831373290233240912L);
        setLongField(term167107, term167107.getClass(), "id", -8875705710065624742L);
        setField(term167107, term167107.getClass(), "extId", term167109);
        setField(term167107, term167107.getClass(), "luid", "vQjtGUwOfe");
        setIntField(term167124, term167124.getClass(), "year", 2021);
        setShortField(term167124, term167124.getClass(), "month", (short) 5);
        setShortField(term167124, term167124.getClass(), "day", (short) 30);
        setField(term167123, term167123.getClass(), "date", term167124);
        setByteField(term167128, term167128.getClass(), "hour", (byte) 21);
        setByteField(term167128, term167128.getClass(), "minute", (byte) 41);
        setByteField(term167128, term167128.getClass(), "second", (byte) 14);
        setIntField(term167128, term167128.getClass(), "nano", 87518339);
        setField(term167123, term167123.getClass(), "time", term167128);
        setField(term167107, term167107.getClass(), "registerTime", term167123);
        setIntField(term167134, term167134.getClass(), "year", 2012);
        setShortField(term167134, term167134.getClass(), "month", (short) 8);
        setShortField(term167134, term167134.getClass(), "day", (short) 8);
        setField(term167133, term167133.getClass(), "date", term167134);
        setByteField(term167138, term167138.getClass(), "hour", (byte) 11);
        setByteField(term167138, term167138.getClass(), "minute", (byte) 12);
        setByteField(term167138, term167138.getClass(), "second", (byte) 8);
        setIntField(term167138, term167138.getClass(), "nano", 93839709);
        setField(term167133, term167133.getClass(), "time", term167138);
        setField(term167107, term167107.getClass(), "accessTime", term167133);
        setField(term167105, term167105.getClass(), "card", term167107);
        setField(term167105, term167105.getClass(), "userName", "XQbCHMjIJN");
        setIntField(term167156, term167156.getClass(), "year", 2019);
        setShortField(term167156, term167156.getClass(), "month", (short) 11);
        setShortField(term167156, term167156.getClass(), "day", (short) 12);
        setField(term167155, term167155.getClass(), "date", term167156);
        setByteField(term167160, term167160.getClass(), "hour", (byte) 22);
        setByteField(term167160, term167160.getClass(), "minute", (byte) 22);
        setByteField(term167160, term167160.getClass(), "second", (byte) 38);
        setIntField(term167160, term167160.getClass(), "nano", 669911786);
        setField(term167155, term167155.getClass(), "time", term167160);
        setField(term167105, term167105.getClass(), "lastLoginDate", term167155);
        setBooleanField(term167105, term167105.getClass(), "isWebJoin", true);
        setField(term167105, term167105.getClass(), "webLimitDate", "amaRjUoHzE");
        setIntField(term167105, term167105.getClass(), "level", -1465687477);
        setIntField(term167105, term167105.getClass(), "reincarnationNum", 1456965553);
        setField(term167105, term167105.getClass(), "exp", "wZvDZQbQkT");
        setLongField(term167105, term167105.getClass(), "point", -8194245212128058943L);
        setLongField(term167105, term167105.getClass(), "totalPoint", -3211414419641712590L);
        setIntField(term167105, term167105.getClass(), "playCount", 891917447);
        setIntField(term167105, term167105.getClass(), "multiPlayCount", 733611816);
        setIntField(term167105, term167105.getClass(), "multiWinCount", 809743488);
        setIntField(term167105, term167105.getClass(), "requestResCount", -2061421262);
        setIntField(term167105, term167105.getClass(), "acceptResCount", 729222890);
        setIntField(term167105, term167105.getClass(), "successResCount", -1662914642);
        setIntField(term167105, term167105.getClass(), "playerRating", -355284486);
        setIntField(term167105, term167105.getClass(), "highestRating", 1770512077);
        setIntField(term167105, term167105.getClass(), "nameplateId", -187774462);
        setIntField(term167105, term167105.getClass(), "frameId", -1557635802);
        setIntField(term167105, term167105.getClass(), "characterId", 863085455);
        setIntField(term167105, term167105.getClass(), "trophyId", -825201659);
        setIntField(term167105, term167105.getClass(), "playedTutorialBit", 1694627785);
        setIntField(term167105, term167105.getClass(), "firstTutorialCancelNum", -1218124526);
        setIntField(term167105, term167105.getClass(), "masterTutorialCancelNum", 2095913246);
        setIntField(term167105, term167105.getClass(), "totalRepertoireCount", 2032378574);
        setIntField(term167105, term167105.getClass(), "totalMapNum", -532981370);
        setLongField(term167105, term167105.getClass(), "totalHiScore", -7151126183741184747L);
        setLongField(term167105, term167105.getClass(), "totalBasicHighScore", -5196407870377205566L);
        setLongField(term167105, term167105.getClass(), "totalAdvancedHighScore", -6773944686989684227L);
        setLongField(term167105, term167105.getClass(), "totalExpertHighScore", -7682378554119457253L);
        setLongField(term167105, term167105.getClass(), "totalMasterHighScore", 1869604949062541679L);
        setIntField(term167217, term167217.getClass(), "year", 2016);
        setShortField(term167217, term167217.getClass(), "month", (short) 10);
        setShortField(term167217, term167217.getClass(), "day", (short) 7);
        setField(term167216, term167216.getClass(), "date", term167217);
        setByteField(term167221, term167221.getClass(), "hour", (byte) 5);
        setByteField(term167221, term167221.getClass(), "minute", (byte) 21);
        setByteField(term167221, term167221.getClass(), "second", (byte) 0);
        setIntField(term167221, term167221.getClass(), "nano", 825788993);
        setField(term167216, term167216.getClass(), "time", term167221);
        setField(term167105, term167105.getClass(), "eventWatchedDate", term167216);
        setIntField(term167105, term167105.getClass(), "friendCount", -634537095);
        setBooleanField(term167105, term167105.getClass(), "isMaimai", false);
        setField(term167105, term167105.getClass(), "firstGameId", "PjoFrjVnvp");
        setField(term167105, term167105.getClass(), "firstRomVersion", "GpMCgmyrOD");
        setField(term167105, term167105.getClass(), "firstDataVersion", "PLzRVzTTYD");
        setIntField(term167265, term167265.getClass(), "year", 2015);
        setShortField(term167265, term167265.getClass(), "month", (short) 8);
        setShortField(term167265, term167265.getClass(), "day", (short) 4);
        setField(term167264, term167264.getClass(), "date", term167265);
        setByteField(term167269, term167269.getClass(), "hour", (byte) 9);
        setByteField(term167269, term167269.getClass(), "minute", (byte) 5);
        setByteField(term167269, term167269.getClass(), "second", (byte) 13);
        setIntField(term167269, term167269.getClass(), "nano", 624960104);
        setField(term167264, term167264.getClass(), "time", term167269);
        setField(term167105, term167105.getClass(), "firstPlayDate", term167264);
        setField(term167105, term167105.getClass(), "lastGameId", "CqbaNMhyiw");
        setField(term167105, term167105.getClass(), "lastRomVersion", "wONtKlWTYQ");
        setField(term167105, term167105.getClass(), "lastDataVersion", "bWswflOaHX");
        setIntField(term167311, term167311.getClass(), "year", 2011);
        setShortField(term167311, term167311.getClass(), "month", (short) 8);
        setShortField(term167311, term167311.getClass(), "day", (short) 10);
        setField(term167310, term167310.getClass(), "date", term167311);
        setByteField(term167315, term167315.getClass(), "hour", (byte) 7);
        setByteField(term167315, term167315.getClass(), "minute", (byte) 35);
        setByteField(term167315, term167315.getClass(), "second", (byte) 12);
        setIntField(term167315, term167315.getClass(), "nano", 395331597);
        setField(term167310, term167310.getClass(), "time", term167315);
        setField(term167105, term167105.getClass(), "lastPlayDate", term167310);
        setIntField(term167105, term167105.getClass(), "lastPlaceId", -1818314526);
        setField(term167105, term167105.getClass(), "lastPlaceName", "foIizkyVeR");
        setField(term167105, term167105.getClass(), "lastRegionId", "eohWMLzQjb");
        setField(term167105, term167105.getClass(), "lastRegionName", "rVRShyvOxF");
        setField(term167105, term167105.getClass(), "lastAllNetId", "esjLVLaZjU");
        setField(term167105, term167105.getClass(), "lastClientId", "sjMukKEPTQ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "AarWepexbz";
        callMethod(klass, "setFirstDataVersion", argTypes, term167105, args);
    }

};


