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

public class UserData_getTotalMapNum_83182378927 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term140883;

    public UserData_getTotalMapNum_83182378927() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term140887 = new Long(6041374912351843923L);
        term140883 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term140885 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term140901 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term140902 = newInstance(Class.forName("java.time.LocalDate"));
        Object term140906 = newInstance(Class.forName("java.time.LocalTime"));
        Object term140911 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term140912 = newInstance(Class.forName("java.time.LocalDate"));
        Object term140916 = newInstance(Class.forName("java.time.LocalTime"));
        Object term140933 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term140934 = newInstance(Class.forName("java.time.LocalDate"));
        Object term140938 = newInstance(Class.forName("java.time.LocalTime"));
        Object term140994 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term140995 = newInstance(Class.forName("java.time.LocalDate"));
        Object term140999 = newInstance(Class.forName("java.time.LocalTime"));
        Object term141042 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term141043 = newInstance(Class.forName("java.time.LocalDate"));
        Object term141047 = newInstance(Class.forName("java.time.LocalTime"));
        Object term141088 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term141089 = newInstance(Class.forName("java.time.LocalDate"));
        Object term141093 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term140883, term140883.getClass(), "id", -6217009676274443835L);
        setLongField(term140885, term140885.getClass(), "id", 4798281117299013998L);
        setField(term140885, term140885.getClass(), "extId", term140887);
        setField(term140885, term140885.getClass(), "luid", "xKSrJBCTXk");
        setIntField(term140902, term140902.getClass(), "year", 2014);
        setShortField(term140902, term140902.getClass(), "month", (short) 9);
        setShortField(term140902, term140902.getClass(), "day", (short) 10);
        setField(term140901, term140901.getClass(), "date", term140902);
        setByteField(term140906, term140906.getClass(), "hour", (byte) 17);
        setByteField(term140906, term140906.getClass(), "minute", (byte) 2);
        setByteField(term140906, term140906.getClass(), "second", (byte) 57);
        setIntField(term140906, term140906.getClass(), "nano", 88462228);
        setField(term140901, term140901.getClass(), "time", term140906);
        setField(term140885, term140885.getClass(), "registerTime", term140901);
        setIntField(term140912, term140912.getClass(), "year", 2025);
        setShortField(term140912, term140912.getClass(), "month", (short) 4);
        setShortField(term140912, term140912.getClass(), "day", (short) 8);
        setField(term140911, term140911.getClass(), "date", term140912);
        setByteField(term140916, term140916.getClass(), "hour", (byte) 6);
        setByteField(term140916, term140916.getClass(), "minute", (byte) 37);
        setByteField(term140916, term140916.getClass(), "second", (byte) 39);
        setIntField(term140916, term140916.getClass(), "nano", 553724922);
        setField(term140911, term140911.getClass(), "time", term140916);
        setField(term140885, term140885.getClass(), "accessTime", term140911);
        setField(term140883, term140883.getClass(), "card", term140885);
        setField(term140883, term140883.getClass(), "userName", "GbWyFVlZnY");
        setIntField(term140934, term140934.getClass(), "year", 2013);
        setShortField(term140934, term140934.getClass(), "month", (short) 8);
        setShortField(term140934, term140934.getClass(), "day", (short) 30);
        setField(term140933, term140933.getClass(), "date", term140934);
        setByteField(term140938, term140938.getClass(), "hour", (byte) 19);
        setByteField(term140938, term140938.getClass(), "minute", (byte) 9);
        setByteField(term140938, term140938.getClass(), "second", (byte) 28);
        setIntField(term140938, term140938.getClass(), "nano", 361122187);
        setField(term140933, term140933.getClass(), "time", term140938);
        setField(term140883, term140883.getClass(), "lastLoginDate", term140933);
        setBooleanField(term140883, term140883.getClass(), "isWebJoin", false);
        setField(term140883, term140883.getClass(), "webLimitDate", "DUXodxIhLc");
        setIntField(term140883, term140883.getClass(), "level", 1016127323);
        setIntField(term140883, term140883.getClass(), "reincarnationNum", -1424228916);
        setField(term140883, term140883.getClass(), "exp", "LfEDxfBelf");
        setLongField(term140883, term140883.getClass(), "point", 4734290833546653850L);
        setLongField(term140883, term140883.getClass(), "totalPoint", 6957785192444979753L);
        setIntField(term140883, term140883.getClass(), "playCount", -1330367712);
        setIntField(term140883, term140883.getClass(), "multiPlayCount", 1127423658);
        setIntField(term140883, term140883.getClass(), "multiWinCount", 1769148291);
        setIntField(term140883, term140883.getClass(), "requestResCount", -589939936);
        setIntField(term140883, term140883.getClass(), "acceptResCount", -1648554957);
        setIntField(term140883, term140883.getClass(), "successResCount", -562928205);
        setIntField(term140883, term140883.getClass(), "playerRating", 1606784584);
        setIntField(term140883, term140883.getClass(), "highestRating", -1363533335);
        setIntField(term140883, term140883.getClass(), "nameplateId", 366895162);
        setIntField(term140883, term140883.getClass(), "frameId", 1724693880);
        setIntField(term140883, term140883.getClass(), "characterId", -1087721009);
        setIntField(term140883, term140883.getClass(), "trophyId", -2015236116);
        setIntField(term140883, term140883.getClass(), "playedTutorialBit", 23503476);
        setIntField(term140883, term140883.getClass(), "firstTutorialCancelNum", 1507237625);
        setIntField(term140883, term140883.getClass(), "masterTutorialCancelNum", 845255343);
        setIntField(term140883, term140883.getClass(), "totalRepertoireCount", 1633731345);
        setIntField(term140883, term140883.getClass(), "totalMapNum", 953429371);
        setLongField(term140883, term140883.getClass(), "totalHiScore", 3092320965130533188L);
        setLongField(term140883, term140883.getClass(), "totalBasicHighScore", -1170031023592641016L);
        setLongField(term140883, term140883.getClass(), "totalAdvancedHighScore", -4256671127039800048L);
        setLongField(term140883, term140883.getClass(), "totalExpertHighScore", 4963001669659818161L);
        setLongField(term140883, term140883.getClass(), "totalMasterHighScore", 2968855634918029589L);
        setIntField(term140995, term140995.getClass(), "year", 2011);
        setShortField(term140995, term140995.getClass(), "month", (short) 4);
        setShortField(term140995, term140995.getClass(), "day", (short) 1);
        setField(term140994, term140994.getClass(), "date", term140995);
        setByteField(term140999, term140999.getClass(), "hour", (byte) 11);
        setByteField(term140999, term140999.getClass(), "minute", (byte) 16);
        setByteField(term140999, term140999.getClass(), "second", (byte) 54);
        setIntField(term140999, term140999.getClass(), "nano", 974119130);
        setField(term140994, term140994.getClass(), "time", term140999);
        setField(term140883, term140883.getClass(), "eventWatchedDate", term140994);
        setIntField(term140883, term140883.getClass(), "friendCount", 200402683);
        setBooleanField(term140883, term140883.getClass(), "isMaimai", true);
        setField(term140883, term140883.getClass(), "firstGameId", "VGpvGtWXWx");
        setField(term140883, term140883.getClass(), "firstRomVersion", "SzRPOLwctZ");
        setField(term140883, term140883.getClass(), "firstDataVersion", "guEINAQxpo");
        setIntField(term141043, term141043.getClass(), "year", 2027);
        setShortField(term141043, term141043.getClass(), "month", (short) 9);
        setShortField(term141043, term141043.getClass(), "day", (short) 8);
        setField(term141042, term141042.getClass(), "date", term141043);
        setByteField(term141047, term141047.getClass(), "hour", (byte) 1);
        setByteField(term141047, term141047.getClass(), "minute", (byte) 31);
        setByteField(term141047, term141047.getClass(), "second", (byte) 26);
        setIntField(term141047, term141047.getClass(), "nano", 866365204);
        setField(term141042, term141042.getClass(), "time", term141047);
        setField(term140883, term140883.getClass(), "firstPlayDate", term141042);
        setField(term140883, term140883.getClass(), "lastGameId", "SxRLZbHkvS");
        setField(term140883, term140883.getClass(), "lastRomVersion", "HtiqQJqDeX");
        setField(term140883, term140883.getClass(), "lastDataVersion", "tqDmiYDfPG");
        setIntField(term141089, term141089.getClass(), "year", 2028);
        setShortField(term141089, term141089.getClass(), "month", (short) 8);
        setShortField(term141089, term141089.getClass(), "day", (short) 6);
        setField(term141088, term141088.getClass(), "date", term141089);
        setByteField(term141093, term141093.getClass(), "hour", (byte) 14);
        setByteField(term141093, term141093.getClass(), "minute", (byte) 40);
        setByteField(term141093, term141093.getClass(), "second", (byte) 5);
        setIntField(term141093, term141093.getClass(), "nano", 121134357);
        setField(term141088, term141088.getClass(), "time", term141093);
        setField(term140883, term140883.getClass(), "lastPlayDate", term141088);
        setIntField(term140883, term140883.getClass(), "lastPlaceId", 1718675670);
        setField(term140883, term140883.getClass(), "lastPlaceName", "NIFTrWKaFV");
        setField(term140883, term140883.getClass(), "lastRegionId", "fczMoiWIlg");
        setField(term140883, term140883.getClass(), "lastRegionName", "FLDFVNZCaf");
        setField(term140883, term140883.getClass(), "lastAllNetId", "RatdSkwnHJ");
        setField(term140883, term140883.getClass(), "lastClientId", "oseqzeIHdW");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalMapNum", argTypes, term140883, args);
    }

};


