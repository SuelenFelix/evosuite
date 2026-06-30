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

public class UserData_setLastPlaceName_186256185095 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term170197;

    public UserData_setLastPlaceName_186256185095() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term170201 = new Long(3077284143733577490L);
        term170197 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term170199 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term170215 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term170216 = newInstance(Class.forName("java.time.LocalDate"));
        Object term170220 = newInstance(Class.forName("java.time.LocalTime"));
        Object term170225 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term170226 = newInstance(Class.forName("java.time.LocalDate"));
        Object term170230 = newInstance(Class.forName("java.time.LocalTime"));
        Object term170247 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term170248 = newInstance(Class.forName("java.time.LocalDate"));
        Object term170252 = newInstance(Class.forName("java.time.LocalTime"));
        Object term170308 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term170309 = newInstance(Class.forName("java.time.LocalDate"));
        Object term170313 = newInstance(Class.forName("java.time.LocalTime"));
        Object term170356 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term170357 = newInstance(Class.forName("java.time.LocalDate"));
        Object term170361 = newInstance(Class.forName("java.time.LocalTime"));
        Object term170402 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term170403 = newInstance(Class.forName("java.time.LocalDate"));
        Object term170407 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term170197, term170197.getClass(), "id", 2177661519078714019L);
        setLongField(term170199, term170199.getClass(), "id", -7627890620954511666L);
        setField(term170199, term170199.getClass(), "extId", term170201);
        setField(term170199, term170199.getClass(), "luid", "sMTYULvlCk");
        setIntField(term170216, term170216.getClass(), "year", 2012);
        setShortField(term170216, term170216.getClass(), "month", (short) 12);
        setShortField(term170216, term170216.getClass(), "day", (short) 29);
        setField(term170215, term170215.getClass(), "date", term170216);
        setByteField(term170220, term170220.getClass(), "hour", (byte) 2);
        setByteField(term170220, term170220.getClass(), "minute", (byte) 47);
        setByteField(term170220, term170220.getClass(), "second", (byte) 40);
        setIntField(term170220, term170220.getClass(), "nano", 637653402);
        setField(term170215, term170215.getClass(), "time", term170220);
        setField(term170199, term170199.getClass(), "registerTime", term170215);
        setIntField(term170226, term170226.getClass(), "year", 2028);
        setShortField(term170226, term170226.getClass(), "month", (short) 7);
        setShortField(term170226, term170226.getClass(), "day", (short) 13);
        setField(term170225, term170225.getClass(), "date", term170226);
        setByteField(term170230, term170230.getClass(), "hour", (byte) 0);
        setByteField(term170230, term170230.getClass(), "minute", (byte) 46);
        setByteField(term170230, term170230.getClass(), "second", (byte) 21);
        setIntField(term170230, term170230.getClass(), "nano", 992869213);
        setField(term170225, term170225.getClass(), "time", term170230);
        setField(term170199, term170199.getClass(), "accessTime", term170225);
        setField(term170197, term170197.getClass(), "card", term170199);
        setField(term170197, term170197.getClass(), "userName", "lEgoBZROnz");
        setIntField(term170248, term170248.getClass(), "year", 2029);
        setShortField(term170248, term170248.getClass(), "month", (short) 4);
        setShortField(term170248, term170248.getClass(), "day", (short) 24);
        setField(term170247, term170247.getClass(), "date", term170248);
        setByteField(term170252, term170252.getClass(), "hour", (byte) 11);
        setByteField(term170252, term170252.getClass(), "minute", (byte) 24);
        setByteField(term170252, term170252.getClass(), "second", (byte) 20);
        setIntField(term170252, term170252.getClass(), "nano", 896656426);
        setField(term170247, term170247.getClass(), "time", term170252);
        setField(term170197, term170197.getClass(), "lastLoginDate", term170247);
        setBooleanField(term170197, term170197.getClass(), "isWebJoin", false);
        setField(term170197, term170197.getClass(), "webLimitDate", "vtbyaDCaje");
        setIntField(term170197, term170197.getClass(), "level", 698385520);
        setIntField(term170197, term170197.getClass(), "reincarnationNum", 849449580);
        setField(term170197, term170197.getClass(), "exp", "ONhxPKQMMo");
        setLongField(term170197, term170197.getClass(), "point", 6226564475251569033L);
        setLongField(term170197, term170197.getClass(), "totalPoint", -4159863432036511837L);
        setIntField(term170197, term170197.getClass(), "playCount", 223713903);
        setIntField(term170197, term170197.getClass(), "multiPlayCount", 1671953554);
        setIntField(term170197, term170197.getClass(), "multiWinCount", 478755818);
        setIntField(term170197, term170197.getClass(), "requestResCount", -1272313823);
        setIntField(term170197, term170197.getClass(), "acceptResCount", -872110316);
        setIntField(term170197, term170197.getClass(), "successResCount", -1523155561);
        setIntField(term170197, term170197.getClass(), "playerRating", 538636137);
        setIntField(term170197, term170197.getClass(), "highestRating", 1198486550);
        setIntField(term170197, term170197.getClass(), "nameplateId", 1991523491);
        setIntField(term170197, term170197.getClass(), "frameId", 1175856889);
        setIntField(term170197, term170197.getClass(), "characterId", -1544836830);
        setIntField(term170197, term170197.getClass(), "trophyId", 836331634);
        setIntField(term170197, term170197.getClass(), "playedTutorialBit", -1611918528);
        setIntField(term170197, term170197.getClass(), "firstTutorialCancelNum", -1007102246);
        setIntField(term170197, term170197.getClass(), "masterTutorialCancelNum", 284875252);
        setIntField(term170197, term170197.getClass(), "totalRepertoireCount", -1037642084);
        setIntField(term170197, term170197.getClass(), "totalMapNum", -1771453281);
        setLongField(term170197, term170197.getClass(), "totalHiScore", 7397608429844042575L);
        setLongField(term170197, term170197.getClass(), "totalBasicHighScore", 298756682777431426L);
        setLongField(term170197, term170197.getClass(), "totalAdvancedHighScore", 1074990585989802601L);
        setLongField(term170197, term170197.getClass(), "totalExpertHighScore", 9066576144978232615L);
        setLongField(term170197, term170197.getClass(), "totalMasterHighScore", 8152379894028795698L);
        setIntField(term170309, term170309.getClass(), "year", 2018);
        setShortField(term170309, term170309.getClass(), "month", (short) 5);
        setShortField(term170309, term170309.getClass(), "day", (short) 29);
        setField(term170308, term170308.getClass(), "date", term170309);
        setByteField(term170313, term170313.getClass(), "hour", (byte) 14);
        setByteField(term170313, term170313.getClass(), "minute", (byte) 56);
        setByteField(term170313, term170313.getClass(), "second", (byte) 46);
        setIntField(term170313, term170313.getClass(), "nano", 473674732);
        setField(term170308, term170308.getClass(), "time", term170313);
        setField(term170197, term170197.getClass(), "eventWatchedDate", term170308);
        setIntField(term170197, term170197.getClass(), "friendCount", -1850267429);
        setBooleanField(term170197, term170197.getClass(), "isMaimai", false);
        setField(term170197, term170197.getClass(), "firstGameId", "gqboIFYuNV");
        setField(term170197, term170197.getClass(), "firstRomVersion", "RzdWOEWDgx");
        setField(term170197, term170197.getClass(), "firstDataVersion", "UvWhWDwqRL");
        setIntField(term170357, term170357.getClass(), "year", 2023);
        setShortField(term170357, term170357.getClass(), "month", (short) 10);
        setShortField(term170357, term170357.getClass(), "day", (short) 20);
        setField(term170356, term170356.getClass(), "date", term170357);
        setByteField(term170361, term170361.getClass(), "hour", (byte) 6);
        setByteField(term170361, term170361.getClass(), "minute", (byte) 6);
        setByteField(term170361, term170361.getClass(), "second", (byte) 30);
        setIntField(term170361, term170361.getClass(), "nano", 881680554);
        setField(term170356, term170356.getClass(), "time", term170361);
        setField(term170197, term170197.getClass(), "firstPlayDate", term170356);
        setField(term170197, term170197.getClass(), "lastGameId", "QtaCenHMXj");
        setField(term170197, term170197.getClass(), "lastRomVersion", "uDaDGeYDnv");
        setField(term170197, term170197.getClass(), "lastDataVersion", "CZxtRDAuOY");
        setIntField(term170403, term170403.getClass(), "year", 2015);
        setShortField(term170403, term170403.getClass(), "month", (short) 9);
        setShortField(term170403, term170403.getClass(), "day", (short) 28);
        setField(term170402, term170402.getClass(), "date", term170403);
        setByteField(term170407, term170407.getClass(), "hour", (byte) 4);
        setByteField(term170407, term170407.getClass(), "minute", (byte) 11);
        setByteField(term170407, term170407.getClass(), "second", (byte) 53);
        setIntField(term170407, term170407.getClass(), "nano", 253802498);
        setField(term170402, term170402.getClass(), "time", term170407);
        setField(term170197, term170197.getClass(), "lastPlayDate", term170402);
        setIntField(term170197, term170197.getClass(), "lastPlaceId", 1810435844);
        setField(term170197, term170197.getClass(), "lastPlaceName", "cKYpQTvxsS");
        setField(term170197, term170197.getClass(), "lastRegionId", "HLsUyMzuDC");
        setField(term170197, term170197.getClass(), "lastRegionName", "iHgKzDjHmx");
        setField(term170197, term170197.getClass(), "lastAllNetId", "lcUHIQRWLS");
        setField(term170197, term170197.getClass(), "lastClientId", "chsXPLmgYZ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "oBXyKERtMw";
        callMethod(klass, "setLastPlaceName", argTypes, term170197, args);
    }

};


