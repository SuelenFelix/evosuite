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

public class UserPresentEvent_hashCode_17549188715 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100959;

    public UserPresentEvent_hashCode_17549188715() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term100965 = new Long(5319740127125920367L);
        term100959 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPresentEvent"));
        Object term100961 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term100963 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term100979 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term100980 = newInstance(Class.forName("java.time.LocalDate"));
        Object term100984 = newInstance(Class.forName("java.time.LocalTime"));
        Object term100989 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term100990 = newInstance(Class.forName("java.time.LocalDate"));
        Object term100994 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term100959, term100959.getClass(), "id", 3218173944566395082L);
        setLongField(term100961, term100961.getClass(), "id", -3694649475237271412L);
        setLongField(term100963, term100963.getClass(), "id", 5323722289713523213L);
        setField(term100963, term100963.getClass(), "extId", term100965);
        setField(term100963, term100963.getClass(), "luid", "rftaOUctkN");
        setIntField(term100980, term100980.getClass(), "year", 2010);
        setShortField(term100980, term100980.getClass(), "month", (short) 8);
        setShortField(term100980, term100980.getClass(), "day", (short) 25);
        setField(term100979, term100979.getClass(), "date", term100980);
        setByteField(term100984, term100984.getClass(), "hour", (byte) 7);
        setByteField(term100984, term100984.getClass(), "minute", (byte) 13);
        setByteField(term100984, term100984.getClass(), "second", (byte) 16);
        setIntField(term100984, term100984.getClass(), "nano", 196716483);
        setField(term100979, term100979.getClass(), "time", term100984);
        setField(term100963, term100963.getClass(), "registerTime", term100979);
        setIntField(term100990, term100990.getClass(), "year", 2016);
        setShortField(term100990, term100990.getClass(), "month", (short) 2);
        setShortField(term100990, term100990.getClass(), "day", (short) 19);
        setField(term100989, term100989.getClass(), "date", term100990);
        setByteField(term100994, term100994.getClass(), "hour", (byte) 1);
        setByteField(term100994, term100994.getClass(), "minute", (byte) 32);
        setByteField(term100994, term100994.getClass(), "second", (byte) 43);
        setIntField(term100994, term100994.getClass(), "nano", 671735228);
        setField(term100989, term100989.getClass(), "time", term100994);
        setField(term100963, term100963.getClass(), "accessTime", term100989);
        setField(term100961, term100961.getClass(), "card", term100963);
        setIntField(term100961, term100961.getClass(), "lastDataVersion", -1733288743);
        setField(term100961, term100961.getClass(), "userName", "BqodsrSZso");
        setIntField(term100961, term100961.getClass(), "point", -258749513);
        setIntField(term100961, term100961.getClass(), "totalPoint", -1844583866);
        setIntField(term100961, term100961.getClass(), "iconId", 2042786119);
        setIntField(term100961, term100961.getClass(), "nameplateId", -1283362130);
        setIntField(term100961, term100961.getClass(), "frameId", 1665540853);
        setIntField(term100961, term100961.getClass(), "trophyId", -1906608832);
        setIntField(term100961, term100961.getClass(), "playCount", 1588132306);
        setIntField(term100961, term100961.getClass(), "playVsCount", 1581941988);
        setIntField(term100961, term100961.getClass(), "playSyncCount", -1603773271);
        setIntField(term100961, term100961.getClass(), "winCount", -1605444948);
        setIntField(term100961, term100961.getClass(), "helpCount", 1720929948);
        setIntField(term100961, term100961.getClass(), "comboCount", -943731935);
        setIntField(term100961, term100961.getClass(), "feverCount", 1657200756);
        setIntField(term100961, term100961.getClass(), "totalHiScore", -826470678);
        setIntField(term100961, term100961.getClass(), "totalEasyHighScore", -1987983732);
        setIntField(term100961, term100961.getClass(), "totalBasicHighScore", -1566042472);
        setIntField(term100961, term100961.getClass(), "totalAdvancedHighScore", 654568310);
        setIntField(term100961, term100961.getClass(), "totalExpertHighScore", 1379492509);
        setIntField(term100961, term100961.getClass(), "totalMasterHighScore", 1859663828);
        setIntField(term100961, term100961.getClass(), "totalReMasterHighScore", -241347649);
        setIntField(term100961, term100961.getClass(), "totalHighSync", -996032013);
        setIntField(term100961, term100961.getClass(), "totalEasySync", -499780226);
        setIntField(term100961, term100961.getClass(), "totalBasicSync", -2047034320);
        setIntField(term100961, term100961.getClass(), "totalAdvancedSync", 229323589);
        setIntField(term100961, term100961.getClass(), "totalExpertSync", 608950067);
        setIntField(term100961, term100961.getClass(), "totalMasterSync", -1976530324);
        setIntField(term100961, term100961.getClass(), "totalReMasterSync", -345508496);
        setIntField(term100961, term100961.getClass(), "playerRating", 1836772931);
        setIntField(term100961, term100961.getClass(), "highestRating", 1471156136);
        setIntField(term100961, term100961.getClass(), "rankAuthTailId", 869271750);
        setField(term100961, term100961.getClass(), "eventWatchedDate", "APQYHLBKit");
        setField(term100961, term100961.getClass(), "webLimitDate", "tIucnzigbY");
        setIntField(term100961, term100961.getClass(), "challengeTrackPhase", -891906508);
        setIntField(term100961, term100961.getClass(), "firstPlayBits", 33200561);
        setField(term100961, term100961.getClass(), "lastPlayDate", "SMZbMLuReo");
        setIntField(term100961, term100961.getClass(), "lastPlaceId", -391675562);
        setField(term100961, term100961.getClass(), "lastPlaceName", "YNXNgIokRz");
        setIntField(term100961, term100961.getClass(), "lastRegionId", 206061309);
        setField(term100961, term100961.getClass(), "lastRegionName", "XRDgUBBIlB");
        setField(term100961, term100961.getClass(), "lastClientId", "kWMQGdvKwx");
        setField(term100961, term100961.getClass(), "lastCountryCode", "zRwnGNjqEc");
        setIntField(term100961, term100961.getClass(), "eventPoint", -469486858);
        setIntField(term100961, term100961.getClass(), "totalLv", -1184776933);
        setIntField(term100961, term100961.getClass(), "lastLoginBonusDay", -947890577);
        setIntField(term100961, term100961.getClass(), "lastSurvivalBonusDay", -2103526812);
        setIntField(term100961, term100961.getClass(), "loginBonusLv", 2001968974);
        setField(term100959, term100959.getClass(), "user", term100961);
        setIntField(term100959, term100959.getClass(), "presentEventId", 2036080787);
        setIntField(term100959, term100959.getClass(), "point", -1187989955);
        setIntField(term100959, term100959.getClass(), "presentCount", 1522845770);
        setIntField(term100959, term100959.getClass(), "rate", 457792368);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPresentEvent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term100959, args);
    }

};


