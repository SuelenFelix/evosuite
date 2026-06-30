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

public class UserCharacter_setCharacterId_2183579588 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35012;
     Object term35191;

    public UserCharacter_setCharacterId_2183579588() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term35018 = new Long(-4924950707540628022L);
        term35012 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserCharacter"));
        Object term35014 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term35016 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term35032 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term35033 = newInstance(Class.forName("java.time.LocalDate"));
        Object term35037 = newInstance(Class.forName("java.time.LocalTime"));
        Object term35042 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term35043 = newInstance(Class.forName("java.time.LocalDate"));
        Object term35047 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term35012, term35012.getClass(), "id", -7406618974062419277L);
        setLongField(term35014, term35014.getClass(), "id", 868503089567085985L);
        setLongField(term35016, term35016.getClass(), "id", -3277773415369003529L);
        setField(term35016, term35016.getClass(), "extId", term35018);
        setField(term35016, term35016.getClass(), "luid", "thCjwQjRBL");
        setIntField(term35033, term35033.getClass(), "year", 2020);
        setShortField(term35033, term35033.getClass(), "month", (short) 1);
        setShortField(term35033, term35033.getClass(), "day", (short) 23);
        setField(term35032, term35032.getClass(), "date", term35033);
        setByteField(term35037, term35037.getClass(), "hour", (byte) 17);
        setByteField(term35037, term35037.getClass(), "minute", (byte) 24);
        setByteField(term35037, term35037.getClass(), "second", (byte) 54);
        setIntField(term35037, term35037.getClass(), "nano", 261767355);
        setField(term35032, term35032.getClass(), "time", term35037);
        setField(term35016, term35016.getClass(), "registerTime", term35032);
        setIntField(term35043, term35043.getClass(), "year", 2011);
        setShortField(term35043, term35043.getClass(), "month", (short) 1);
        setShortField(term35043, term35043.getClass(), "day", (short) 20);
        setField(term35042, term35042.getClass(), "date", term35043);
        setByteField(term35047, term35047.getClass(), "hour", (byte) 5);
        setByteField(term35047, term35047.getClass(), "minute", (byte) 23);
        setByteField(term35047, term35047.getClass(), "second", (byte) 54);
        setIntField(term35047, term35047.getClass(), "nano", 4207750);
        setField(term35042, term35042.getClass(), "time", term35047);
        setField(term35016, term35016.getClass(), "accessTime", term35042);
        setField(term35014, term35014.getClass(), "card", term35016);
        setIntField(term35014, term35014.getClass(), "lastDataVersion", 159666228);
        setField(term35014, term35014.getClass(), "userName", "ojLrjltndD");
        setIntField(term35014, term35014.getClass(), "point", -1706840691);
        setIntField(term35014, term35014.getClass(), "totalPoint", -722277466);
        setIntField(term35014, term35014.getClass(), "iconId", 1000587160);
        setIntField(term35014, term35014.getClass(), "nameplateId", 1691425223);
        setIntField(term35014, term35014.getClass(), "frameId", 2086385537);
        setIntField(term35014, term35014.getClass(), "trophyId", -898458301);
        setIntField(term35014, term35014.getClass(), "playCount", -1752896);
        setIntField(term35014, term35014.getClass(), "playVsCount", -1202458563);
        setIntField(term35014, term35014.getClass(), "playSyncCount", -974221589);
        setIntField(term35014, term35014.getClass(), "winCount", -167704667);
        setIntField(term35014, term35014.getClass(), "helpCount", -820617926);
        setIntField(term35014, term35014.getClass(), "comboCount", -1871142929);
        setIntField(term35014, term35014.getClass(), "feverCount", -1594964553);
        setIntField(term35014, term35014.getClass(), "totalHiScore", -1839071263);
        setIntField(term35014, term35014.getClass(), "totalEasyHighScore", 1247519674);
        setIntField(term35014, term35014.getClass(), "totalBasicHighScore", -460205484);
        setIntField(term35014, term35014.getClass(), "totalAdvancedHighScore", -1144163240);
        setIntField(term35014, term35014.getClass(), "totalExpertHighScore", 2135238175);
        setIntField(term35014, term35014.getClass(), "totalMasterHighScore", -407365393);
        setIntField(term35014, term35014.getClass(), "totalReMasterHighScore", 1408195458);
        setIntField(term35014, term35014.getClass(), "totalHighSync", 1129173756);
        setIntField(term35014, term35014.getClass(), "totalEasySync", 267573446);
        setIntField(term35014, term35014.getClass(), "totalBasicSync", -1319954987);
        setIntField(term35014, term35014.getClass(), "totalAdvancedSync", 701324276);
        setIntField(term35014, term35014.getClass(), "totalExpertSync", -2141408767);
        setIntField(term35014, term35014.getClass(), "totalMasterSync", 2033366485);
        setIntField(term35014, term35014.getClass(), "totalReMasterSync", 688731975);
        setIntField(term35014, term35014.getClass(), "playerRating", 1198340749);
        setIntField(term35014, term35014.getClass(), "highestRating", -385710681);
        setIntField(term35014, term35014.getClass(), "rankAuthTailId", 1624133267);
        setField(term35014, term35014.getClass(), "eventWatchedDate", "VJtFSexKat");
        setField(term35014, term35014.getClass(), "webLimitDate", "xPVddlPSQR");
        setIntField(term35014, term35014.getClass(), "challengeTrackPhase", -1547947305);
        setIntField(term35014, term35014.getClass(), "firstPlayBits", -919225635);
        setField(term35014, term35014.getClass(), "lastPlayDate", "MxrhCLTMTH");
        setIntField(term35014, term35014.getClass(), "lastPlaceId", -1044514554);
        setField(term35014, term35014.getClass(), "lastPlaceName", "kEehLMZcOU");
        setIntField(term35014, term35014.getClass(), "lastRegionId", 35189099);
        setField(term35014, term35014.getClass(), "lastRegionName", "RhLliqMiOF");
        setField(term35014, term35014.getClass(), "lastClientId", "jlhonEGrJH");
        setField(term35014, term35014.getClass(), "lastCountryCode", "RKcKwlEYZb");
        setIntField(term35014, term35014.getClass(), "eventPoint", -1399937823);
        setIntField(term35014, term35014.getClass(), "totalLv", 1439151010);
        setIntField(term35014, term35014.getClass(), "lastLoginBonusDay", 520109121);
        setIntField(term35014, term35014.getClass(), "lastSurvivalBonusDay", -1374704112);
        setIntField(term35014, term35014.getClass(), "loginBonusLv", 1603677150);
        setField(term35012, term35012.getClass(), "user", term35014);
        setIntField(term35012, term35012.getClass(), "characterId", -926340720);
        setIntField(term35012, term35012.getClass(), "point", -1134329349);
        setIntField(term35012, term35012.getClass(), "level", -1590495256);
        term35191 = new Integer(1804035317);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserCharacter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term35191;
        callMethod(klass, "setCharacterId", argTypes, term35012, args);
    }

};


