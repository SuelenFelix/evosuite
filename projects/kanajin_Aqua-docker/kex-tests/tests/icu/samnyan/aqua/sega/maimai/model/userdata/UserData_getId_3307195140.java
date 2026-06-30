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

public class UserData_getId_3307195140 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public UserData_getId_3307195140() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5 = new Long(2442117782898005296L);
        term1 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term3 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term19 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term20 = newInstance(Class.forName("java.time.LocalDate"));
        Object term24 = newInstance(Class.forName("java.time.LocalTime"));
        Object term29 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term30 = newInstance(Class.forName("java.time.LocalDate"));
        Object term34 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term1, term1.getClass(), "id", 2442117782898005296L);
        setLongField(term3, term3.getClass(), "id", 6375119433582206027L);
        setField(term3, term3.getClass(), "extId", term5);
        setField(term3, term3.getClass(), "luid", "PAEBtnZtTD");
        setIntField(term20, term20.getClass(), "year", 2012);
        setShortField(term20, term20.getClass(), "month", (short) 8);
        setShortField(term20, term20.getClass(), "day", (short) 25);
        setField(term19, term19.getClass(), "date", term20);
        setByteField(term24, term24.getClass(), "hour", (byte) 5);
        setByteField(term24, term24.getClass(), "minute", (byte) 20);
        setByteField(term24, term24.getClass(), "second", (byte) 50);
        setIntField(term24, term24.getClass(), "nano", 345595912);
        setField(term19, term19.getClass(), "time", term24);
        setField(term3, term3.getClass(), "registerTime", term19);
        setIntField(term30, term30.getClass(), "year", 2021);
        setShortField(term30, term30.getClass(), "month", (short) 1);
        setShortField(term30, term30.getClass(), "day", (short) 18);
        setField(term29, term29.getClass(), "date", term30);
        setByteField(term34, term34.getClass(), "hour", (byte) 13);
        setByteField(term34, term34.getClass(), "minute", (byte) 38);
        setByteField(term34, term34.getClass(), "second", (byte) 26);
        setIntField(term34, term34.getClass(), "nano", 544608644);
        setField(term29, term29.getClass(), "time", term34);
        setField(term3, term3.getClass(), "accessTime", term29);
        setField(term1, term1.getClass(), "card", term3);
        setIntField(term1, term1.getClass(), "lastDataVersion", 568599855);
        setField(term1, term1.getClass(), "userName", "sjlJAEtRrb");
        setIntField(term1, term1.getClass(), "point", 1162663216);
        setIntField(term1, term1.getClass(), "totalPoint", 1484323161);
        setIntField(term1, term1.getClass(), "iconId", 391863371);
        setIntField(term1, term1.getClass(), "nameplateId", -1922583790);
        setIntField(term1, term1.getClass(), "frameId", -616727354);
        setIntField(term1, term1.getClass(), "trophyId", -1955890973);
        setIntField(term1, term1.getClass(), "playCount", -2038273078);
        setIntField(term1, term1.getClass(), "playVsCount", 1227103734);
        setIntField(term1, term1.getClass(), "playSyncCount", -1339778481);
        setIntField(term1, term1.getClass(), "winCount", 1725571209);
        setIntField(term1, term1.getClass(), "helpCount", -522618178);
        setIntField(term1, term1.getClass(), "comboCount", 1134449235);
        setIntField(term1, term1.getClass(), "feverCount", -883034806);
        setIntField(term1, term1.getClass(), "totalHiScore", 1585847225);
        setIntField(term1, term1.getClass(), "totalEasyHighScore", 597278769);
        setIntField(term1, term1.getClass(), "totalBasicHighScore", -1685132342);
        setIntField(term1, term1.getClass(), "totalAdvancedHighScore", -1456670397);
        setIntField(term1, term1.getClass(), "totalExpertHighScore", 1622346318);
        setIntField(term1, term1.getClass(), "totalMasterHighScore", 1048535127);
        setIntField(term1, term1.getClass(), "totalReMasterHighScore", -655067527);
        setIntField(term1, term1.getClass(), "totalHighSync", -6029667);
        setIntField(term1, term1.getClass(), "totalEasySync", -2068769794);
        setIntField(term1, term1.getClass(), "totalBasicSync", -117576464);
        setIntField(term1, term1.getClass(), "totalAdvancedSync", -1007160944);
        setIntField(term1, term1.getClass(), "totalExpertSync", 1135664017);
        setIntField(term1, term1.getClass(), "totalMasterSync", 590364439);
        setIntField(term1, term1.getClass(), "totalReMasterSync", 865208305);
        setIntField(term1, term1.getClass(), "playerRating", -1275173084);
        setIntField(term1, term1.getClass(), "highestRating", -244121226);
        setIntField(term1, term1.getClass(), "rankAuthTailId", -203030934);
        setField(term1, term1.getClass(), "eventWatchedDate", "MuLcgQHgqz");
        setField(term1, term1.getClass(), "webLimitDate", "xxtlPwDYFs");
        setIntField(term1, term1.getClass(), "challengeTrackPhase", -1179120542);
        setIntField(term1, term1.getClass(), "firstPlayBits", -73683645);
        setField(term1, term1.getClass(), "lastPlayDate", "jJCZpVmanW");
        setIntField(term1, term1.getClass(), "lastPlaceId", -226514366);
        setField(term1, term1.getClass(), "lastPlaceName", "EGtDIRbSSb");
        setIntField(term1, term1.getClass(), "lastRegionId", 1193880199);
        setField(term1, term1.getClass(), "lastRegionName", "SzjVpOQTyS");
        setField(term1, term1.getClass(), "lastClientId", "MjGYSRKTNF");
        setField(term1, term1.getClass(), "lastCountryCode", "hRNSzYYIrc");
        setIntField(term1, term1.getClass(), "eventPoint", -1087774327);
        setIntField(term1, term1.getClass(), "totalLv", -1530420153);
        setIntField(term1, term1.getClass(), "lastLoginBonusDay", -469968304);
        setIntField(term1, term1.getClass(), "lastSurvivalBonusDay", -1145578966);
        setIntField(term1, term1.getClass(), "loginBonusLv", 679763016);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term1, args);
    }

};


