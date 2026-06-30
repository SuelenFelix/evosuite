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

public class UserData_equals_1057440215100 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26705;
     Object term26879;

    public UserData_equals_1057440215100() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term26709 = new Long(-1832940336320585644L);
        term26705 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term26707 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term26723 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term26724 = newInstance(Class.forName("java.time.LocalDate"));
        Object term26728 = newInstance(Class.forName("java.time.LocalTime"));
        Object term26733 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term26734 = newInstance(Class.forName("java.time.LocalDate"));
        Object term26738 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term26705, term26705.getClass(), "id", 5731563613239387113L);
        setLongField(term26707, term26707.getClass(), "id", 3381333711768010594L);
        setField(term26707, term26707.getClass(), "extId", term26709);
        setField(term26707, term26707.getClass(), "luid", "lzcwhvjdFg");
        setIntField(term26724, term26724.getClass(), "year", 2013);
        setShortField(term26724, term26724.getClass(), "month", (short) 1);
        setShortField(term26724, term26724.getClass(), "day", (short) 17);
        setField(term26723, term26723.getClass(), "date", term26724);
        setByteField(term26728, term26728.getClass(), "hour", (byte) 19);
        setByteField(term26728, term26728.getClass(), "minute", (byte) 49);
        setByteField(term26728, term26728.getClass(), "second", (byte) 53);
        setIntField(term26728, term26728.getClass(), "nano", 217542739);
        setField(term26723, term26723.getClass(), "time", term26728);
        setField(term26707, term26707.getClass(), "registerTime", term26723);
        setIntField(term26734, term26734.getClass(), "year", 2025);
        setShortField(term26734, term26734.getClass(), "month", (short) 8);
        setShortField(term26734, term26734.getClass(), "day", (short) 8);
        setField(term26733, term26733.getClass(), "date", term26734);
        setByteField(term26738, term26738.getClass(), "hour", (byte) 12);
        setByteField(term26738, term26738.getClass(), "minute", (byte) 29);
        setByteField(term26738, term26738.getClass(), "second", (byte) 36);
        setIntField(term26738, term26738.getClass(), "nano", 329488602);
        setField(term26733, term26733.getClass(), "time", term26738);
        setField(term26707, term26707.getClass(), "accessTime", term26733);
        setField(term26705, term26705.getClass(), "card", term26707);
        setIntField(term26705, term26705.getClass(), "lastDataVersion", 147233013);
        setField(term26705, term26705.getClass(), "userName", "dfzWTjcjnI");
        setIntField(term26705, term26705.getClass(), "point", -828376022);
        setIntField(term26705, term26705.getClass(), "totalPoint", -1133227278);
        setIntField(term26705, term26705.getClass(), "iconId", -1998106900);
        setIntField(term26705, term26705.getClass(), "nameplateId", -1628037152);
        setIntField(term26705, term26705.getClass(), "frameId", -1550570392);
        setIntField(term26705, term26705.getClass(), "trophyId", -59951395);
        setIntField(term26705, term26705.getClass(), "playCount", -294114307);
        setIntField(term26705, term26705.getClass(), "playVsCount", -745407686);
        setIntField(term26705, term26705.getClass(), "playSyncCount", -1183051462);
        setIntField(term26705, term26705.getClass(), "winCount", -572029073);
        setIntField(term26705, term26705.getClass(), "helpCount", 1348271533);
        setIntField(term26705, term26705.getClass(), "comboCount", 1234771885);
        setIntField(term26705, term26705.getClass(), "feverCount", 1821658782);
        setIntField(term26705, term26705.getClass(), "totalHiScore", 871613900);
        setIntField(term26705, term26705.getClass(), "totalEasyHighScore", 1322676409);
        setIntField(term26705, term26705.getClass(), "totalBasicHighScore", -954764876);
        setIntField(term26705, term26705.getClass(), "totalAdvancedHighScore", 1870177323);
        setIntField(term26705, term26705.getClass(), "totalExpertHighScore", -1027146644);
        setIntField(term26705, term26705.getClass(), "totalMasterHighScore", 341013967);
        setIntField(term26705, term26705.getClass(), "totalReMasterHighScore", 1873439089);
        setIntField(term26705, term26705.getClass(), "totalHighSync", -1069668783);
        setIntField(term26705, term26705.getClass(), "totalEasySync", -301450995);
        setIntField(term26705, term26705.getClass(), "totalBasicSync", 753886838);
        setIntField(term26705, term26705.getClass(), "totalAdvancedSync", -1802788931);
        setIntField(term26705, term26705.getClass(), "totalExpertSync", 505497573);
        setIntField(term26705, term26705.getClass(), "totalMasterSync", 1848062442);
        setIntField(term26705, term26705.getClass(), "totalReMasterSync", -122481618);
        setIntField(term26705, term26705.getClass(), "playerRating", -82929535);
        setIntField(term26705, term26705.getClass(), "highestRating", 1850505181);
        setIntField(term26705, term26705.getClass(), "rankAuthTailId", 324766253);
        setField(term26705, term26705.getClass(), "eventWatchedDate", "bsnZXGEvFv");
        setField(term26705, term26705.getClass(), "webLimitDate", "osFrHWYeRy");
        setIntField(term26705, term26705.getClass(), "challengeTrackPhase", -1128978986);
        setIntField(term26705, term26705.getClass(), "firstPlayBits", 192962115);
        setField(term26705, term26705.getClass(), "lastPlayDate", "scpIQUfPKw");
        setIntField(term26705, term26705.getClass(), "lastPlaceId", 1531205463);
        setField(term26705, term26705.getClass(), "lastPlaceName", "QKYBpCjuYt");
        setIntField(term26705, term26705.getClass(), "lastRegionId", 586115489);
        setField(term26705, term26705.getClass(), "lastRegionName", "vjiRfoGdkl");
        setField(term26705, term26705.getClass(), "lastClientId", "TwaxeSHvnR");
        setField(term26705, term26705.getClass(), "lastCountryCode", "paPzDETzIq");
        setIntField(term26705, term26705.getClass(), "eventPoint", 1377331021);
        setIntField(term26705, term26705.getClass(), "totalLv", 1915536131);
        setIntField(term26705, term26705.getClass(), "lastLoginBonusDay", 936561631);
        setIntField(term26705, term26705.getClass(), "lastSurvivalBonusDay", -160474197);
        setIntField(term26705, term26705.getClass(), "loginBonusLv", 279768924);
        term26879 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term26879;
        callMethod(klass, "equals", argTypes, term26705, args);
    }

};


