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

public class UserItem_setId_18953403976 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term85904;
     Object term86083;

    public UserItem_setId_18953403976() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term85910 = new Long(-5656664340499957324L);
        term85904 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserItem"));
        Object term85906 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term85908 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term85924 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term85925 = newInstance(Class.forName("java.time.LocalDate"));
        Object term85929 = newInstance(Class.forName("java.time.LocalTime"));
        Object term85934 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term85935 = newInstance(Class.forName("java.time.LocalDate"));
        Object term85939 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term85904, term85904.getClass(), "id", -7087265016767824631L);
        setLongField(term85906, term85906.getClass(), "id", -8121348431673567857L);
        setLongField(term85908, term85908.getClass(), "id", 7594342965038171122L);
        setField(term85908, term85908.getClass(), "extId", term85910);
        setField(term85908, term85908.getClass(), "luid", "InNyZMCrst");
        setIntField(term85925, term85925.getClass(), "year", 2013);
        setShortField(term85925, term85925.getClass(), "month", (short) 12);
        setShortField(term85925, term85925.getClass(), "day", (short) 7);
        setField(term85924, term85924.getClass(), "date", term85925);
        setByteField(term85929, term85929.getClass(), "hour", (byte) 15);
        setByteField(term85929, term85929.getClass(), "minute", (byte) 56);
        setByteField(term85929, term85929.getClass(), "second", (byte) 2);
        setIntField(term85929, term85929.getClass(), "nano", 550722676);
        setField(term85924, term85924.getClass(), "time", term85929);
        setField(term85908, term85908.getClass(), "registerTime", term85924);
        setIntField(term85935, term85935.getClass(), "year", 2014);
        setShortField(term85935, term85935.getClass(), "month", (short) 7);
        setShortField(term85935, term85935.getClass(), "day", (short) 18);
        setField(term85934, term85934.getClass(), "date", term85935);
        setByteField(term85939, term85939.getClass(), "hour", (byte) 19);
        setByteField(term85939, term85939.getClass(), "minute", (byte) 34);
        setByteField(term85939, term85939.getClass(), "second", (byte) 55);
        setIntField(term85939, term85939.getClass(), "nano", 945082868);
        setField(term85934, term85934.getClass(), "time", term85939);
        setField(term85908, term85908.getClass(), "accessTime", term85934);
        setField(term85906, term85906.getClass(), "card", term85908);
        setIntField(term85906, term85906.getClass(), "lastDataVersion", 1697782346);
        setField(term85906, term85906.getClass(), "userName", "llSJDzNeEq");
        setIntField(term85906, term85906.getClass(), "point", 1469006441);
        setIntField(term85906, term85906.getClass(), "totalPoint", -848703672);
        setIntField(term85906, term85906.getClass(), "iconId", 1610879895);
        setIntField(term85906, term85906.getClass(), "nameplateId", -1707478961);
        setIntField(term85906, term85906.getClass(), "frameId", -1627748692);
        setIntField(term85906, term85906.getClass(), "trophyId", -1802652052);
        setIntField(term85906, term85906.getClass(), "playCount", -450223205);
        setIntField(term85906, term85906.getClass(), "playVsCount", -1685460453);
        setIntField(term85906, term85906.getClass(), "playSyncCount", -932031927);
        setIntField(term85906, term85906.getClass(), "winCount", -396155497);
        setIntField(term85906, term85906.getClass(), "helpCount", 1550347477);
        setIntField(term85906, term85906.getClass(), "comboCount", 1999753330);
        setIntField(term85906, term85906.getClass(), "feverCount", -1417694542);
        setIntField(term85906, term85906.getClass(), "totalHiScore", -1703634243);
        setIntField(term85906, term85906.getClass(), "totalEasyHighScore", -1946719296);
        setIntField(term85906, term85906.getClass(), "totalBasicHighScore", 1702907407);
        setIntField(term85906, term85906.getClass(), "totalAdvancedHighScore", 1943139725);
        setIntField(term85906, term85906.getClass(), "totalExpertHighScore", -1895631581);
        setIntField(term85906, term85906.getClass(), "totalMasterHighScore", 1484386906);
        setIntField(term85906, term85906.getClass(), "totalReMasterHighScore", -1086902549);
        setIntField(term85906, term85906.getClass(), "totalHighSync", -1325092699);
        setIntField(term85906, term85906.getClass(), "totalEasySync", 1282150470);
        setIntField(term85906, term85906.getClass(), "totalBasicSync", -2063207620);
        setIntField(term85906, term85906.getClass(), "totalAdvancedSync", 908971966);
        setIntField(term85906, term85906.getClass(), "totalExpertSync", -1448487643);
        setIntField(term85906, term85906.getClass(), "totalMasterSync", 799385851);
        setIntField(term85906, term85906.getClass(), "totalReMasterSync", -360289814);
        setIntField(term85906, term85906.getClass(), "playerRating", 1714192838);
        setIntField(term85906, term85906.getClass(), "highestRating", 352666115);
        setIntField(term85906, term85906.getClass(), "rankAuthTailId", -1583419177);
        setField(term85906, term85906.getClass(), "eventWatchedDate", "YIDNFdhfGO");
        setField(term85906, term85906.getClass(), "webLimitDate", "adNbqunmox");
        setIntField(term85906, term85906.getClass(), "challengeTrackPhase", 1961030764);
        setIntField(term85906, term85906.getClass(), "firstPlayBits", 523495110);
        setField(term85906, term85906.getClass(), "lastPlayDate", "ImSBmTIdsP");
        setIntField(term85906, term85906.getClass(), "lastPlaceId", 600476089);
        setField(term85906, term85906.getClass(), "lastPlaceName", "KDKQhbiclt");
        setIntField(term85906, term85906.getClass(), "lastRegionId", -1449298992);
        setField(term85906, term85906.getClass(), "lastRegionName", "diWnDDpNWl");
        setField(term85906, term85906.getClass(), "lastClientId", "jcrJhyEbDI");
        setField(term85906, term85906.getClass(), "lastCountryCode", "DHbGOjJfEz");
        setIntField(term85906, term85906.getClass(), "eventPoint", -703663587);
        setIntField(term85906, term85906.getClass(), "totalLv", 2081392977);
        setIntField(term85906, term85906.getClass(), "lastLoginBonusDay", 671407930);
        setIntField(term85906, term85906.getClass(), "lastSurvivalBonusDay", -758107101);
        setIntField(term85906, term85906.getClass(), "loginBonusLv", -555009086);
        setField(term85904, term85904.getClass(), "user", term85906);
        setIntField(term85904, term85904.getClass(), "itemKind", -1874643641);
        setIntField(term85904, term85904.getClass(), "itemId", -228827613);
        setIntField(term85904, term85904.getClass(), "stock", -912383879);
        term86083 = new Long(-4475453924678388077L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserItem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term86083;
        callMethod(klass, "setId", argTypes, term85904, args);
    }

};


