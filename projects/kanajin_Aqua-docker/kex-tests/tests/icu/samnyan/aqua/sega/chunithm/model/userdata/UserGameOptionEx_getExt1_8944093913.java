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

public class UserGameOptionEx_getExt1_8944093913 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term310927;

    public UserGameOptionEx_getExt1_8944093913() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term310933 = new Long(9056245012917372169L);
        term310927 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOptionEx"));
        Object term310929 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term310931 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term310947 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term310948 = newInstance(Class.forName("java.time.LocalDate"));
        Object term310952 = newInstance(Class.forName("java.time.LocalTime"));
        Object term310957 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term310958 = newInstance(Class.forName("java.time.LocalDate"));
        Object term310962 = newInstance(Class.forName("java.time.LocalTime"));
        Object term310979 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term310980 = newInstance(Class.forName("java.time.LocalDate"));
        Object term310984 = newInstance(Class.forName("java.time.LocalTime"));
        Object term311040 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term311041 = newInstance(Class.forName("java.time.LocalDate"));
        Object term311045 = newInstance(Class.forName("java.time.LocalTime"));
        Object term311088 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term311089 = newInstance(Class.forName("java.time.LocalDate"));
        Object term311093 = newInstance(Class.forName("java.time.LocalTime"));
        Object term311134 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term311135 = newInstance(Class.forName("java.time.LocalDate"));
        Object term311139 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term310927, term310927.getClass(), "id", 4050545655807589401L);
        setLongField(term310929, term310929.getClass(), "id", 1419799849423868495L);
        setLongField(term310931, term310931.getClass(), "id", 2530677345139764372L);
        setField(term310931, term310931.getClass(), "extId", term310933);
        setField(term310931, term310931.getClass(), "luid", "kNKLoDsbIJ");
        setIntField(term310948, term310948.getClass(), "year", 2014);
        setShortField(term310948, term310948.getClass(), "month", (short) 8);
        setShortField(term310948, term310948.getClass(), "day", (short) 16);
        setField(term310947, term310947.getClass(), "date", term310948);
        setByteField(term310952, term310952.getClass(), "hour", (byte) 17);
        setByteField(term310952, term310952.getClass(), "minute", (byte) 38);
        setByteField(term310952, term310952.getClass(), "second", (byte) 21);
        setIntField(term310952, term310952.getClass(), "nano", 231455573);
        setField(term310947, term310947.getClass(), "time", term310952);
        setField(term310931, term310931.getClass(), "registerTime", term310947);
        setIntField(term310958, term310958.getClass(), "year", 2019);
        setShortField(term310958, term310958.getClass(), "month", (short) 10);
        setShortField(term310958, term310958.getClass(), "day", (short) 18);
        setField(term310957, term310957.getClass(), "date", term310958);
        setByteField(term310962, term310962.getClass(), "hour", (byte) 20);
        setByteField(term310962, term310962.getClass(), "minute", (byte) 2);
        setByteField(term310962, term310962.getClass(), "second", (byte) 42);
        setIntField(term310962, term310962.getClass(), "nano", 413895815);
        setField(term310957, term310957.getClass(), "time", term310962);
        setField(term310931, term310931.getClass(), "accessTime", term310957);
        setField(term310929, term310929.getClass(), "card", term310931);
        setField(term310929, term310929.getClass(), "userName", "QETULvuUfM");
        setIntField(term310980, term310980.getClass(), "year", 2012);
        setShortField(term310980, term310980.getClass(), "month", (short) 2);
        setShortField(term310980, term310980.getClass(), "day", (short) 6);
        setField(term310979, term310979.getClass(), "date", term310980);
        setByteField(term310984, term310984.getClass(), "hour", (byte) 19);
        setByteField(term310984, term310984.getClass(), "minute", (byte) 15);
        setByteField(term310984, term310984.getClass(), "second", (byte) 18);
        setIntField(term310984, term310984.getClass(), "nano", 267083211);
        setField(term310979, term310979.getClass(), "time", term310984);
        setField(term310929, term310929.getClass(), "lastLoginDate", term310979);
        setBooleanField(term310929, term310929.getClass(), "isWebJoin", false);
        setField(term310929, term310929.getClass(), "webLimitDate", "erGLJPrSFu");
        setIntField(term310929, term310929.getClass(), "level", -1463046270);
        setIntField(term310929, term310929.getClass(), "reincarnationNum", -1017027932);
        setField(term310929, term310929.getClass(), "exp", "hClrkDuclb");
        setLongField(term310929, term310929.getClass(), "point", 6854410637631093763L);
        setLongField(term310929, term310929.getClass(), "totalPoint", -2684937579371181761L);
        setIntField(term310929, term310929.getClass(), "playCount", 1969662928);
        setIntField(term310929, term310929.getClass(), "multiPlayCount", 1703170089);
        setIntField(term310929, term310929.getClass(), "multiWinCount", 363138033);
        setIntField(term310929, term310929.getClass(), "requestResCount", -1764874360);
        setIntField(term310929, term310929.getClass(), "acceptResCount", -448351770);
        setIntField(term310929, term310929.getClass(), "successResCount", 1136014453);
        setIntField(term310929, term310929.getClass(), "playerRating", -919366355);
        setIntField(term310929, term310929.getClass(), "highestRating", 1513356296);
        setIntField(term310929, term310929.getClass(), "nameplateId", 26137097);
        setIntField(term310929, term310929.getClass(), "frameId", 2093085087);
        setIntField(term310929, term310929.getClass(), "characterId", 940362175);
        setIntField(term310929, term310929.getClass(), "trophyId", -1224310255);
        setIntField(term310929, term310929.getClass(), "playedTutorialBit", -2074818221);
        setIntField(term310929, term310929.getClass(), "firstTutorialCancelNum", -1317687267);
        setIntField(term310929, term310929.getClass(), "masterTutorialCancelNum", 557693831);
        setIntField(term310929, term310929.getClass(), "totalRepertoireCount", 938638133);
        setIntField(term310929, term310929.getClass(), "totalMapNum", -130864088);
        setLongField(term310929, term310929.getClass(), "totalHiScore", -5478802546630413879L);
        setLongField(term310929, term310929.getClass(), "totalBasicHighScore", -567503879183114756L);
        setLongField(term310929, term310929.getClass(), "totalAdvancedHighScore", 3600842501953108737L);
        setLongField(term310929, term310929.getClass(), "totalExpertHighScore", -8383951510031878518L);
        setLongField(term310929, term310929.getClass(), "totalMasterHighScore", -5592861993594218992L);
        setIntField(term311041, term311041.getClass(), "year", 2021);
        setShortField(term311041, term311041.getClass(), "month", (short) 12);
        setShortField(term311041, term311041.getClass(), "day", (short) 25);
        setField(term311040, term311040.getClass(), "date", term311041);
        setByteField(term311045, term311045.getClass(), "hour", (byte) 22);
        setByteField(term311045, term311045.getClass(), "minute", (byte) 50);
        setByteField(term311045, term311045.getClass(), "second", (byte) 30);
        setIntField(term311045, term311045.getClass(), "nano", 569308889);
        setField(term311040, term311040.getClass(), "time", term311045);
        setField(term310929, term310929.getClass(), "eventWatchedDate", term311040);
        setIntField(term310929, term310929.getClass(), "friendCount", -509472233);
        setBooleanField(term310929, term310929.getClass(), "isMaimai", true);
        setField(term310929, term310929.getClass(), "firstGameId", "RQGjkjoJid");
        setField(term310929, term310929.getClass(), "firstRomVersion", "fqFCsfbRxM");
        setField(term310929, term310929.getClass(), "firstDataVersion", "VxtdFZGhCL");
        setIntField(term311089, term311089.getClass(), "year", 2012);
        setShortField(term311089, term311089.getClass(), "month", (short) 8);
        setShortField(term311089, term311089.getClass(), "day", (short) 16);
        setField(term311088, term311088.getClass(), "date", term311089);
        setByteField(term311093, term311093.getClass(), "hour", (byte) 12);
        setByteField(term311093, term311093.getClass(), "minute", (byte) 47);
        setByteField(term311093, term311093.getClass(), "second", (byte) 20);
        setIntField(term311093, term311093.getClass(), "nano", 223926806);
        setField(term311088, term311088.getClass(), "time", term311093);
        setField(term310929, term310929.getClass(), "firstPlayDate", term311088);
        setField(term310929, term310929.getClass(), "lastGameId", "NdCqWFAKtC");
        setField(term310929, term310929.getClass(), "lastRomVersion", "brggoDHwgJ");
        setField(term310929, term310929.getClass(), "lastDataVersion", "mDOxbNsMUA");
        setIntField(term311135, term311135.getClass(), "year", 2016);
        setShortField(term311135, term311135.getClass(), "month", (short) 5);
        setShortField(term311135, term311135.getClass(), "day", (short) 8);
        setField(term311134, term311134.getClass(), "date", term311135);
        setByteField(term311139, term311139.getClass(), "hour", (byte) 23);
        setByteField(term311139, term311139.getClass(), "minute", (byte) 34);
        setByteField(term311139, term311139.getClass(), "second", (byte) 52);
        setIntField(term311139, term311139.getClass(), "nano", 34088445);
        setField(term311134, term311134.getClass(), "time", term311139);
        setField(term310929, term310929.getClass(), "lastPlayDate", term311134);
        setIntField(term310929, term310929.getClass(), "lastPlaceId", 925935088);
        setField(term310929, term310929.getClass(), "lastPlaceName", "wmcOIwaOzF");
        setField(term310929, term310929.getClass(), "lastRegionId", "tvKxAKjRmt");
        setField(term310929, term310929.getClass(), "lastRegionName", "YqKucvfPsH");
        setField(term310929, term310929.getClass(), "lastAllNetId", "yJJLpUySXp");
        setField(term310929, term310929.getClass(), "lastClientId", "ZoRLfUSUqr");
        setField(term310927, term310927.getClass(), "user", term310929);
        setIntField(term310927, term310927.getClass(), "ext1", 125924563);
        setIntField(term310927, term310927.getClass(), "ext2", -640546426);
        setIntField(term310927, term310927.getClass(), "ext3", -545966550);
        setIntField(term310927, term310927.getClass(), "ext4", -2036780189);
        setIntField(term310927, term310927.getClass(), "ext5", -1475767692);
        setIntField(term310927, term310927.getClass(), "ext6", -1526337631);
        setIntField(term310927, term310927.getClass(), "ext7", 1413259880);
        setIntField(term310927, term310927.getClass(), "ext8", -707058176);
        setIntField(term310927, term310927.getClass(), "ext9", 1810176632);
        setIntField(term310927, term310927.getClass(), "ext10", -872274514);
        setIntField(term310927, term310927.getClass(), "ext11", 1210866595);
        setIntField(term310927, term310927.getClass(), "ext12", -1100589173);
        setIntField(term310927, term310927.getClass(), "ext13", 1988339953);
        setIntField(term310927, term310927.getClass(), "ext14", 1100230399);
        setIntField(term310927, term310927.getClass(), "ext15", -1544966933);
        setIntField(term310927, term310927.getClass(), "ext16", -373406556);
        setIntField(term310927, term310927.getClass(), "ext17", -341758770);
        setIntField(term310927, term310927.getClass(), "ext18", -1876169905);
        setIntField(term310927, term310927.getClass(), "ext19", -243506348);
        setIntField(term310927, term310927.getClass(), "ext20", 76715835);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOptionEx");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExt1", argTypes, term310927, args);
    }

};


