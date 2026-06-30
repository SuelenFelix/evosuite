package icu.samnyan.aqua.sega.maimai.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;
import java.lang.Integer;

public class UserActivity_setParam3_109755683017 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48619;
     Object term48802;

    public UserActivity_setParam3_109755683017() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term48625 = new Long(-8121849829073967555L);
        term48619 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserActivity"));
        Object term48621 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term48623 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term48639 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term48640 = newInstance(Class.forName("java.time.LocalDate"));
        Object term48644 = newInstance(Class.forName("java.time.LocalTime"));
        Object term48649 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term48650 = newInstance(Class.forName("java.time.LocalDate"));
        Object term48654 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term48619, term48619.getClass(), "id", 7006402814669334483L);
        setLongField(term48621, term48621.getClass(), "id", -4003544865306793676L);
        setLongField(term48623, term48623.getClass(), "id", -769824408235898287L);
        setField(term48623, term48623.getClass(), "extId", term48625);
        setField(term48623, term48623.getClass(), "luid", "iXRAYcFyfS");
        setIntField(term48640, term48640.getClass(), "year", 2023);
        setShortField(term48640, term48640.getClass(), "month", (short) 5);
        setShortField(term48640, term48640.getClass(), "day", (short) 8);
        setField(term48639, term48639.getClass(), "date", term48640);
        setByteField(term48644, term48644.getClass(), "hour", (byte) 6);
        setByteField(term48644, term48644.getClass(), "minute", (byte) 35);
        setByteField(term48644, term48644.getClass(), "second", (byte) 9);
        setIntField(term48644, term48644.getClass(), "nano", 577816079);
        setField(term48639, term48639.getClass(), "time", term48644);
        setField(term48623, term48623.getClass(), "registerTime", term48639);
        setIntField(term48650, term48650.getClass(), "year", 2019);
        setShortField(term48650, term48650.getClass(), "month", (short) 12);
        setShortField(term48650, term48650.getClass(), "day", (short) 13);
        setField(term48649, term48649.getClass(), "date", term48650);
        setByteField(term48654, term48654.getClass(), "hour", (byte) 7);
        setByteField(term48654, term48654.getClass(), "minute", (byte) 59);
        setByteField(term48654, term48654.getClass(), "second", (byte) 40);
        setIntField(term48654, term48654.getClass(), "nano", 824164134);
        setField(term48649, term48649.getClass(), "time", term48654);
        setField(term48623, term48623.getClass(), "accessTime", term48649);
        setField(term48621, term48621.getClass(), "card", term48623);
        setIntField(term48621, term48621.getClass(), "lastDataVersion", 101409079);
        setField(term48621, term48621.getClass(), "userName", "lokyclbLEz");
        setIntField(term48621, term48621.getClass(), "point", 667385993);
        setIntField(term48621, term48621.getClass(), "totalPoint", 1869326215);
        setIntField(term48621, term48621.getClass(), "iconId", 1721500010);
        setIntField(term48621, term48621.getClass(), "nameplateId", 347987989);
        setIntField(term48621, term48621.getClass(), "frameId", 967236150);
        setIntField(term48621, term48621.getClass(), "trophyId", 1128257999);
        setIntField(term48621, term48621.getClass(), "playCount", -1294526073);
        setIntField(term48621, term48621.getClass(), "playVsCount", 1308295);
        setIntField(term48621, term48621.getClass(), "playSyncCount", -1992871983);
        setIntField(term48621, term48621.getClass(), "winCount", -746244948);
        setIntField(term48621, term48621.getClass(), "helpCount", -1545293106);
        setIntField(term48621, term48621.getClass(), "comboCount", 150764621);
        setIntField(term48621, term48621.getClass(), "feverCount", 1888338766);
        setIntField(term48621, term48621.getClass(), "totalHiScore", 1982543201);
        setIntField(term48621, term48621.getClass(), "totalEasyHighScore", 74831560);
        setIntField(term48621, term48621.getClass(), "totalBasicHighScore", 1825435825);
        setIntField(term48621, term48621.getClass(), "totalAdvancedHighScore", 1481132137);
        setIntField(term48621, term48621.getClass(), "totalExpertHighScore", -781680177);
        setIntField(term48621, term48621.getClass(), "totalMasterHighScore", -897834640);
        setIntField(term48621, term48621.getClass(), "totalReMasterHighScore", -375611393);
        setIntField(term48621, term48621.getClass(), "totalHighSync", -1798238449);
        setIntField(term48621, term48621.getClass(), "totalEasySync", 470207750);
        setIntField(term48621, term48621.getClass(), "totalBasicSync", -1220080582);
        setIntField(term48621, term48621.getClass(), "totalAdvancedSync", -607572941);
        setIntField(term48621, term48621.getClass(), "totalExpertSync", 684781565);
        setIntField(term48621, term48621.getClass(), "totalMasterSync", -1582304993);
        setIntField(term48621, term48621.getClass(), "totalReMasterSync", -1728289450);
        setIntField(term48621, term48621.getClass(), "playerRating", 1143106804);
        setIntField(term48621, term48621.getClass(), "highestRating", -574562393);
        setIntField(term48621, term48621.getClass(), "rankAuthTailId", 621957704);
        setField(term48621, term48621.getClass(), "eventWatchedDate", "hAPmQGaxkI");
        setField(term48621, term48621.getClass(), "webLimitDate", "ojrnLnJZjT");
        setIntField(term48621, term48621.getClass(), "challengeTrackPhase", 1938454325);
        setIntField(term48621, term48621.getClass(), "firstPlayBits", -1406084415);
        setField(term48621, term48621.getClass(), "lastPlayDate", "rtvXSMjOdJ");
        setIntField(term48621, term48621.getClass(), "lastPlaceId", 642206554);
        setField(term48621, term48621.getClass(), "lastPlaceName", "EDkfjuDpNv");
        setIntField(term48621, term48621.getClass(), "lastRegionId", 947904287);
        setField(term48621, term48621.getClass(), "lastRegionName", "LNHkTUfuHX");
        setField(term48621, term48621.getClass(), "lastClientId", "SVWcOAHiTp");
        setField(term48621, term48621.getClass(), "lastCountryCode", "oShLCaneoQ");
        setIntField(term48621, term48621.getClass(), "eventPoint", 1008116811);
        setIntField(term48621, term48621.getClass(), "totalLv", -453969559);
        setIntField(term48621, term48621.getClass(), "lastLoginBonusDay", -1976851292);
        setIntField(term48621, term48621.getClass(), "lastSurvivalBonusDay", 1007436356);
        setIntField(term48621, term48621.getClass(), "loginBonusLv", 953383703);
        setField(term48619, term48619.getClass(), "user", term48621);
        setIntField(term48619, term48619.getClass(), "kind", 379942336);
        setIntField(term48619, term48619.getClass(), "activityId", -1553154317);
        setLongField(term48619, term48619.getClass(), "sortNumber", -2828343143039517941L);
        setIntField(term48619, term48619.getClass(), "param1", -1016850135);
        setIntField(term48619, term48619.getClass(), "param2", 475367008);
        setIntField(term48619, term48619.getClass(), "param3", -1916736881);
        setIntField(term48619, term48619.getClass(), "param4", -1918049413);
        term48802 = new Integer(786449451);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserActivity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term48802;
        callMethod(klass, "setParam3", argTypes, term48619, args);
    }

};


