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

public class UserActivity_init_4143722660 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43711;

    public UserActivity_init_4143722660() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term43715 = new Long(8166095254618543564L);
        term43711 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term43713 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term43729 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term43730 = newInstance(Class.forName("java.time.LocalDate"));
        Object term43734 = newInstance(Class.forName("java.time.LocalTime"));
        Object term43739 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term43740 = newInstance(Class.forName("java.time.LocalDate"));
        Object term43744 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term43711, term43711.getClass(), "id", 3746481521207337771L);
        setLongField(term43713, term43713.getClass(), "id", 4341016500855678917L);
        setField(term43713, term43713.getClass(), "extId", term43715);
        setField(term43713, term43713.getClass(), "luid", "JTPAQsfRtT");
        setIntField(term43730, term43730.getClass(), "year", 2010);
        setShortField(term43730, term43730.getClass(), "month", (short) 3);
        setShortField(term43730, term43730.getClass(), "day", (short) 22);
        setField(term43729, term43729.getClass(), "date", term43730);
        setByteField(term43734, term43734.getClass(), "hour", (byte) 23);
        setByteField(term43734, term43734.getClass(), "minute", (byte) 36);
        setByteField(term43734, term43734.getClass(), "second", (byte) 22);
        setIntField(term43734, term43734.getClass(), "nano", 781575122);
        setField(term43729, term43729.getClass(), "time", term43734);
        setField(term43713, term43713.getClass(), "registerTime", term43729);
        setIntField(term43740, term43740.getClass(), "year", 2015);
        setShortField(term43740, term43740.getClass(), "month", (short) 8);
        setShortField(term43740, term43740.getClass(), "day", (short) 6);
        setField(term43739, term43739.getClass(), "date", term43740);
        setByteField(term43744, term43744.getClass(), "hour", (byte) 16);
        setByteField(term43744, term43744.getClass(), "minute", (byte) 16);
        setByteField(term43744, term43744.getClass(), "second", (byte) 21);
        setIntField(term43744, term43744.getClass(), "nano", 274900303);
        setField(term43739, term43739.getClass(), "time", term43744);
        setField(term43713, term43713.getClass(), "accessTime", term43739);
        setField(term43711, term43711.getClass(), "card", term43713);
        setIntField(term43711, term43711.getClass(), "lastDataVersion", 479749926);
        setField(term43711, term43711.getClass(), "userName", "otxkkKfDfl");
        setIntField(term43711, term43711.getClass(), "point", -23214369);
        setIntField(term43711, term43711.getClass(), "totalPoint", 1687480678);
        setIntField(term43711, term43711.getClass(), "iconId", 722649363);
        setIntField(term43711, term43711.getClass(), "nameplateId", 76618777);
        setIntField(term43711, term43711.getClass(), "frameId", 1705792936);
        setIntField(term43711, term43711.getClass(), "trophyId", -1909996617);
        setIntField(term43711, term43711.getClass(), "playCount", -190426986);
        setIntField(term43711, term43711.getClass(), "playVsCount", -555983707);
        setIntField(term43711, term43711.getClass(), "playSyncCount", -606116015);
        setIntField(term43711, term43711.getClass(), "winCount", -181890457);
        setIntField(term43711, term43711.getClass(), "helpCount", -944465027);
        setIntField(term43711, term43711.getClass(), "comboCount", 378932740);
        setIntField(term43711, term43711.getClass(), "feverCount", -346858205);
        setIntField(term43711, term43711.getClass(), "totalHiScore", -1490019542);
        setIntField(term43711, term43711.getClass(), "totalEasyHighScore", 681306470);
        setIntField(term43711, term43711.getClass(), "totalBasicHighScore", -1757429033);
        setIntField(term43711, term43711.getClass(), "totalAdvancedHighScore", -941018916);
        setIntField(term43711, term43711.getClass(), "totalExpertHighScore", -200717429);
        setIntField(term43711, term43711.getClass(), "totalMasterHighScore", 1017751788);
        setIntField(term43711, term43711.getClass(), "totalReMasterHighScore", 452190809);
        setIntField(term43711, term43711.getClass(), "totalHighSync", -868819495);
        setIntField(term43711, term43711.getClass(), "totalEasySync", -1011591867);
        setIntField(term43711, term43711.getClass(), "totalBasicSync", 709949296);
        setIntField(term43711, term43711.getClass(), "totalAdvancedSync", 1078431447);
        setIntField(term43711, term43711.getClass(), "totalExpertSync", -894257039);
        setIntField(term43711, term43711.getClass(), "totalMasterSync", 1586412497);
        setIntField(term43711, term43711.getClass(), "totalReMasterSync", 719020316);
        setIntField(term43711, term43711.getClass(), "playerRating", 1522532191);
        setIntField(term43711, term43711.getClass(), "highestRating", 137516958);
        setIntField(term43711, term43711.getClass(), "rankAuthTailId", -1233770688);
        setField(term43711, term43711.getClass(), "eventWatchedDate", "bqIuFFFwnP");
        setField(term43711, term43711.getClass(), "webLimitDate", "hDxvvVgGlk");
        setIntField(term43711, term43711.getClass(), "challengeTrackPhase", 722935077);
        setIntField(term43711, term43711.getClass(), "firstPlayBits", -304660297);
        setField(term43711, term43711.getClass(), "lastPlayDate", "XdjSvjaTqk");
        setIntField(term43711, term43711.getClass(), "lastPlaceId", 1530655970);
        setField(term43711, term43711.getClass(), "lastPlaceName", "ukrlYVcvsg");
        setIntField(term43711, term43711.getClass(), "lastRegionId", -154857398);
        setField(term43711, term43711.getClass(), "lastRegionName", "cpjqTCNflQ");
        setField(term43711, term43711.getClass(), "lastClientId", "wiYGATEfmw");
        setField(term43711, term43711.getClass(), "lastCountryCode", "FiALSqneIg");
        setIntField(term43711, term43711.getClass(), "eventPoint", 385239631);
        setIntField(term43711, term43711.getClass(), "totalLv", 836211088);
        setIntField(term43711, term43711.getClass(), "lastLoginBonusDay", -365730201);
        setIntField(term43711, term43711.getClass(), "lastSurvivalBonusDay", -1218078298);
        setIntField(term43711, term43711.getClass(), "loginBonusLv", -1186533450);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserActivity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Object[] args = new Object[1];
        args[0] = term43711;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


