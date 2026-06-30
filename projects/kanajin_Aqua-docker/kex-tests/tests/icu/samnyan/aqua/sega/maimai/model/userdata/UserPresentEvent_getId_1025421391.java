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

public class UserPresentEvent_getId_1025421391 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96903;

    public UserPresentEvent_getId_1025421391() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term96909 = new Long(-7296330380944173376L);
        term96903 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPresentEvent"));
        Object term96905 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term96907 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term96923 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term96924 = newInstance(Class.forName("java.time.LocalDate"));
        Object term96928 = newInstance(Class.forName("java.time.LocalTime"));
        Object term96933 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term96934 = newInstance(Class.forName("java.time.LocalDate"));
        Object term96938 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term96903, term96903.getClass(), "id", -1596516630146686041L);
        setLongField(term96905, term96905.getClass(), "id", -8370506620911901379L);
        setLongField(term96907, term96907.getClass(), "id", -7185067999629587082L);
        setField(term96907, term96907.getClass(), "extId", term96909);
        setField(term96907, term96907.getClass(), "luid", "AbYQkbUCWK");
        setIntField(term96924, term96924.getClass(), "year", 2014);
        setShortField(term96924, term96924.getClass(), "month", (short) 11);
        setShortField(term96924, term96924.getClass(), "day", (short) 30);
        setField(term96923, term96923.getClass(), "date", term96924);
        setByteField(term96928, term96928.getClass(), "hour", (byte) 19);
        setByteField(term96928, term96928.getClass(), "minute", (byte) 38);
        setByteField(term96928, term96928.getClass(), "second", (byte) 52);
        setIntField(term96928, term96928.getClass(), "nano", 246326841);
        setField(term96923, term96923.getClass(), "time", term96928);
        setField(term96907, term96907.getClass(), "registerTime", term96923);
        setIntField(term96934, term96934.getClass(), "year", 2028);
        setShortField(term96934, term96934.getClass(), "month", (short) 5);
        setShortField(term96934, term96934.getClass(), "day", (short) 3);
        setField(term96933, term96933.getClass(), "date", term96934);
        setByteField(term96938, term96938.getClass(), "hour", (byte) 15);
        setByteField(term96938, term96938.getClass(), "minute", (byte) 33);
        setByteField(term96938, term96938.getClass(), "second", (byte) 14);
        setIntField(term96938, term96938.getClass(), "nano", 322733130);
        setField(term96933, term96933.getClass(), "time", term96938);
        setField(term96907, term96907.getClass(), "accessTime", term96933);
        setField(term96905, term96905.getClass(), "card", term96907);
        setIntField(term96905, term96905.getClass(), "lastDataVersion", -1518205033);
        setField(term96905, term96905.getClass(), "userName", "PjENVjWdrp");
        setIntField(term96905, term96905.getClass(), "point", -1389703991);
        setIntField(term96905, term96905.getClass(), "totalPoint", 1125567446);
        setIntField(term96905, term96905.getClass(), "iconId", -1287731042);
        setIntField(term96905, term96905.getClass(), "nameplateId", 1189363638);
        setIntField(term96905, term96905.getClass(), "frameId", -282860769);
        setIntField(term96905, term96905.getClass(), "trophyId", -2077950026);
        setIntField(term96905, term96905.getClass(), "playCount", -817927463);
        setIntField(term96905, term96905.getClass(), "playVsCount", 960720214);
        setIntField(term96905, term96905.getClass(), "playSyncCount", -957641184);
        setIntField(term96905, term96905.getClass(), "winCount", 471804975);
        setIntField(term96905, term96905.getClass(), "helpCount", 1899331160);
        setIntField(term96905, term96905.getClass(), "comboCount", 370966868);
        setIntField(term96905, term96905.getClass(), "feverCount", 1534519464);
        setIntField(term96905, term96905.getClass(), "totalHiScore", 1522021119);
        setIntField(term96905, term96905.getClass(), "totalEasyHighScore", 1922776430);
        setIntField(term96905, term96905.getClass(), "totalBasicHighScore", 207030742);
        setIntField(term96905, term96905.getClass(), "totalAdvancedHighScore", -1102011869);
        setIntField(term96905, term96905.getClass(), "totalExpertHighScore", -407213500);
        setIntField(term96905, term96905.getClass(), "totalMasterHighScore", -1528154718);
        setIntField(term96905, term96905.getClass(), "totalReMasterHighScore", -1963134013);
        setIntField(term96905, term96905.getClass(), "totalHighSync", -1567320858);
        setIntField(term96905, term96905.getClass(), "totalEasySync", 292846859);
        setIntField(term96905, term96905.getClass(), "totalBasicSync", 1747705525);
        setIntField(term96905, term96905.getClass(), "totalAdvancedSync", -198676619);
        setIntField(term96905, term96905.getClass(), "totalExpertSync", 899931868);
        setIntField(term96905, term96905.getClass(), "totalMasterSync", -826588890);
        setIntField(term96905, term96905.getClass(), "totalReMasterSync", 592322019);
        setIntField(term96905, term96905.getClass(), "playerRating", -1046549331);
        setIntField(term96905, term96905.getClass(), "highestRating", -798007195);
        setIntField(term96905, term96905.getClass(), "rankAuthTailId", -606955967);
        setField(term96905, term96905.getClass(), "eventWatchedDate", "nNjXJbBqnD");
        setField(term96905, term96905.getClass(), "webLimitDate", "IPIWZFytSS");
        setIntField(term96905, term96905.getClass(), "challengeTrackPhase", -903464599);
        setIntField(term96905, term96905.getClass(), "firstPlayBits", 814440903);
        setField(term96905, term96905.getClass(), "lastPlayDate", "BOKRfsJbBj");
        setIntField(term96905, term96905.getClass(), "lastPlaceId", 766559610);
        setField(term96905, term96905.getClass(), "lastPlaceName", "AbIDnsFOzO");
        setIntField(term96905, term96905.getClass(), "lastRegionId", -1273191881);
        setField(term96905, term96905.getClass(), "lastRegionName", "ekTUXbqVGx");
        setField(term96905, term96905.getClass(), "lastClientId", "ECPFDcnHIT");
        setField(term96905, term96905.getClass(), "lastCountryCode", "cgHejOgcDW");
        setIntField(term96905, term96905.getClass(), "eventPoint", 313589831);
        setIntField(term96905, term96905.getClass(), "totalLv", 842617390);
        setIntField(term96905, term96905.getClass(), "lastLoginBonusDay", 2085125396);
        setIntField(term96905, term96905.getClass(), "lastSurvivalBonusDay", -1735393631);
        setIntField(term96905, term96905.getClass(), "loginBonusLv", -1094243769);
        setField(term96903, term96903.getClass(), "user", term96905);
        setIntField(term96903, term96903.getClass(), "presentEventId", -673888239);
        setIntField(term96903, term96903.getClass(), "point", 2004435662);
        setIntField(term96903, term96903.getClass(), "presentCount", 2045422512);
        setIntField(term96903, term96903.getClass(), "rate", -848743363);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPresentEvent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term96903, args);
    }

};


