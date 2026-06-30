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

public class UserData_getTotalExpertHighScore_43997996921 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5545;

    public UserData_getTotalExpertHighScore_43997996921() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5549 = new Long(-2585684163342970173L);
        term5545 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term5547 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term5563 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5564 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5568 = newInstance(Class.forName("java.time.LocalTime"));
        Object term5573 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5574 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5578 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term5545, term5545.getClass(), "id", -6292278961887936280L);
        setLongField(term5547, term5547.getClass(), "id", -6645965768855543712L);
        setField(term5547, term5547.getClass(), "extId", term5549);
        setField(term5547, term5547.getClass(), "luid", "vKQukfbJUd");
        setIntField(term5564, term5564.getClass(), "year", 2020);
        setShortField(term5564, term5564.getClass(), "month", (short) 8);
        setShortField(term5564, term5564.getClass(), "day", (short) 15);
        setField(term5563, term5563.getClass(), "date", term5564);
        setByteField(term5568, term5568.getClass(), "hour", (byte) 2);
        setByteField(term5568, term5568.getClass(), "minute", (byte) 0);
        setByteField(term5568, term5568.getClass(), "second", (byte) 38);
        setIntField(term5568, term5568.getClass(), "nano", 146431486);
        setField(term5563, term5563.getClass(), "time", term5568);
        setField(term5547, term5547.getClass(), "registerTime", term5563);
        setIntField(term5574, term5574.getClass(), "year", 2014);
        setShortField(term5574, term5574.getClass(), "month", (short) 11);
        setShortField(term5574, term5574.getClass(), "day", (short) 8);
        setField(term5573, term5573.getClass(), "date", term5574);
        setByteField(term5578, term5578.getClass(), "hour", (byte) 8);
        setByteField(term5578, term5578.getClass(), "minute", (byte) 43);
        setByteField(term5578, term5578.getClass(), "second", (byte) 32);
        setIntField(term5578, term5578.getClass(), "nano", 154434838);
        setField(term5573, term5573.getClass(), "time", term5578);
        setField(term5547, term5547.getClass(), "accessTime", term5573);
        setField(term5545, term5545.getClass(), "card", term5547);
        setIntField(term5545, term5545.getClass(), "lastDataVersion", -407582855);
        setField(term5545, term5545.getClass(), "userName", "lFRJFUMVbx");
        setIntField(term5545, term5545.getClass(), "point", 1190753616);
        setIntField(term5545, term5545.getClass(), "totalPoint", -752378450);
        setIntField(term5545, term5545.getClass(), "iconId", 848907965);
        setIntField(term5545, term5545.getClass(), "nameplateId", 1865070548);
        setIntField(term5545, term5545.getClass(), "frameId", 1904515443);
        setIntField(term5545, term5545.getClass(), "trophyId", 1361126430);
        setIntField(term5545, term5545.getClass(), "playCount", 1728588701);
        setIntField(term5545, term5545.getClass(), "playVsCount", -355769268);
        setIntField(term5545, term5545.getClass(), "playSyncCount", -114460662);
        setIntField(term5545, term5545.getClass(), "winCount", -355376034);
        setIntField(term5545, term5545.getClass(), "helpCount", 588390599);
        setIntField(term5545, term5545.getClass(), "comboCount", -95969566);
        setIntField(term5545, term5545.getClass(), "feverCount", -68615285);
        setIntField(term5545, term5545.getClass(), "totalHiScore", -337504086);
        setIntField(term5545, term5545.getClass(), "totalEasyHighScore", 2074130991);
        setIntField(term5545, term5545.getClass(), "totalBasicHighScore", 532588266);
        setIntField(term5545, term5545.getClass(), "totalAdvancedHighScore", -1286686332);
        setIntField(term5545, term5545.getClass(), "totalExpertHighScore", -284885486);
        setIntField(term5545, term5545.getClass(), "totalMasterHighScore", 1791984446);
        setIntField(term5545, term5545.getClass(), "totalReMasterHighScore", 804070622);
        setIntField(term5545, term5545.getClass(), "totalHighSync", 1850364894);
        setIntField(term5545, term5545.getClass(), "totalEasySync", 915367534);
        setIntField(term5545, term5545.getClass(), "totalBasicSync", 1949983666);
        setIntField(term5545, term5545.getClass(), "totalAdvancedSync", 154111854);
        setIntField(term5545, term5545.getClass(), "totalExpertSync", 710986341);
        setIntField(term5545, term5545.getClass(), "totalMasterSync", -873958002);
        setIntField(term5545, term5545.getClass(), "totalReMasterSync", -1780848958);
        setIntField(term5545, term5545.getClass(), "playerRating", 1235045850);
        setIntField(term5545, term5545.getClass(), "highestRating", -75143033);
        setIntField(term5545, term5545.getClass(), "rankAuthTailId", 797015478);
        setField(term5545, term5545.getClass(), "eventWatchedDate", "sZdUNdggUW");
        setField(term5545, term5545.getClass(), "webLimitDate", "OqbwYQfvAe");
        setIntField(term5545, term5545.getClass(), "challengeTrackPhase", 717574276);
        setIntField(term5545, term5545.getClass(), "firstPlayBits", 1795369860);
        setField(term5545, term5545.getClass(), "lastPlayDate", "tRxZafjqIx");
        setIntField(term5545, term5545.getClass(), "lastPlaceId", -570164389);
        setField(term5545, term5545.getClass(), "lastPlaceName", "DhjNLmRMCu");
        setIntField(term5545, term5545.getClass(), "lastRegionId", 43200329);
        setField(term5545, term5545.getClass(), "lastRegionName", "PgPzMSEjjX");
        setField(term5545, term5545.getClass(), "lastClientId", "wzsPSPcRdj");
        setField(term5545, term5545.getClass(), "lastCountryCode", "kGMQdqJYyB");
        setIntField(term5545, term5545.getClass(), "eventPoint", 998679955);
        setIntField(term5545, term5545.getClass(), "totalLv", 953741504);
        setIntField(term5545, term5545.getClass(), "lastLoginBonusDay", 1389452261);
        setIntField(term5545, term5545.getClass(), "lastSurvivalBonusDay", 1615957955);
        setIntField(term5545, term5545.getClass(), "loginBonusLv", 1779370220);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalExpertHighScore", argTypes, term5545, args);
    }

};


