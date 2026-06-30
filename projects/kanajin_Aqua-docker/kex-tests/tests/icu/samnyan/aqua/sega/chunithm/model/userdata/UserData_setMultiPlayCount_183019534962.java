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
import java.lang.Integer;

public class UserData_setMultiPlayCount_183019534962 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term155929;
     Object term156205;

    public UserData_setMultiPlayCount_183019534962() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term155933 = new Long(3086974592680165932L);
        term155929 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term155931 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term155947 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term155948 = newInstance(Class.forName("java.time.LocalDate"));
        Object term155952 = newInstance(Class.forName("java.time.LocalTime"));
        Object term155957 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term155958 = newInstance(Class.forName("java.time.LocalDate"));
        Object term155962 = newInstance(Class.forName("java.time.LocalTime"));
        Object term155979 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term155980 = newInstance(Class.forName("java.time.LocalDate"));
        Object term155984 = newInstance(Class.forName("java.time.LocalTime"));
        Object term156040 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term156041 = newInstance(Class.forName("java.time.LocalDate"));
        Object term156045 = newInstance(Class.forName("java.time.LocalTime"));
        Object term156088 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term156089 = newInstance(Class.forName("java.time.LocalDate"));
        Object term156093 = newInstance(Class.forName("java.time.LocalTime"));
        Object term156134 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term156135 = newInstance(Class.forName("java.time.LocalDate"));
        Object term156139 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term155929, term155929.getClass(), "id", 8164291404572285008L);
        setLongField(term155931, term155931.getClass(), "id", -2427315021561332890L);
        setField(term155931, term155931.getClass(), "extId", term155933);
        setField(term155931, term155931.getClass(), "luid", "YfMHlokFKp");
        setIntField(term155948, term155948.getClass(), "year", 2014);
        setShortField(term155948, term155948.getClass(), "month", (short) 6);
        setShortField(term155948, term155948.getClass(), "day", (short) 20);
        setField(term155947, term155947.getClass(), "date", term155948);
        setByteField(term155952, term155952.getClass(), "hour", (byte) 15);
        setByteField(term155952, term155952.getClass(), "minute", (byte) 18);
        setByteField(term155952, term155952.getClass(), "second", (byte) 14);
        setIntField(term155952, term155952.getClass(), "nano", 576617573);
        setField(term155947, term155947.getClass(), "time", term155952);
        setField(term155931, term155931.getClass(), "registerTime", term155947);
        setIntField(term155958, term155958.getClass(), "year", 2016);
        setShortField(term155958, term155958.getClass(), "month", (short) 10);
        setShortField(term155958, term155958.getClass(), "day", (short) 24);
        setField(term155957, term155957.getClass(), "date", term155958);
        setByteField(term155962, term155962.getClass(), "hour", (byte) 7);
        setByteField(term155962, term155962.getClass(), "minute", (byte) 44);
        setByteField(term155962, term155962.getClass(), "second", (byte) 53);
        setIntField(term155962, term155962.getClass(), "nano", 196141171);
        setField(term155957, term155957.getClass(), "time", term155962);
        setField(term155931, term155931.getClass(), "accessTime", term155957);
        setField(term155929, term155929.getClass(), "card", term155931);
        setField(term155929, term155929.getClass(), "userName", "mvxWIPkluG");
        setIntField(term155980, term155980.getClass(), "year", 2012);
        setShortField(term155980, term155980.getClass(), "month", (short) 12);
        setShortField(term155980, term155980.getClass(), "day", (short) 24);
        setField(term155979, term155979.getClass(), "date", term155980);
        setByteField(term155984, term155984.getClass(), "hour", (byte) 9);
        setByteField(term155984, term155984.getClass(), "minute", (byte) 29);
        setByteField(term155984, term155984.getClass(), "second", (byte) 15);
        setIntField(term155984, term155984.getClass(), "nano", 178311098);
        setField(term155979, term155979.getClass(), "time", term155984);
        setField(term155929, term155929.getClass(), "lastLoginDate", term155979);
        setBooleanField(term155929, term155929.getClass(), "isWebJoin", true);
        setField(term155929, term155929.getClass(), "webLimitDate", "wOkHioNorr");
        setIntField(term155929, term155929.getClass(), "level", -34413100);
        setIntField(term155929, term155929.getClass(), "reincarnationNum", 1508503068);
        setField(term155929, term155929.getClass(), "exp", "UrMOWCrQMH");
        setLongField(term155929, term155929.getClass(), "point", -6816141902035124591L);
        setLongField(term155929, term155929.getClass(), "totalPoint", -83252622637557191L);
        setIntField(term155929, term155929.getClass(), "playCount", 915463806);
        setIntField(term155929, term155929.getClass(), "multiPlayCount", -924571065);
        setIntField(term155929, term155929.getClass(), "multiWinCount", -358133258);
        setIntField(term155929, term155929.getClass(), "requestResCount", 994709385);
        setIntField(term155929, term155929.getClass(), "acceptResCount", 1153732002);
        setIntField(term155929, term155929.getClass(), "successResCount", 1936443833);
        setIntField(term155929, term155929.getClass(), "playerRating", -531943903);
        setIntField(term155929, term155929.getClass(), "highestRating", 1225651816);
        setIntField(term155929, term155929.getClass(), "nameplateId", -1615061649);
        setIntField(term155929, term155929.getClass(), "frameId", -251883790);
        setIntField(term155929, term155929.getClass(), "characterId", 1712922352);
        setIntField(term155929, term155929.getClass(), "trophyId", -430074689);
        setIntField(term155929, term155929.getClass(), "playedTutorialBit", -163272182);
        setIntField(term155929, term155929.getClass(), "firstTutorialCancelNum", -1054836913);
        setIntField(term155929, term155929.getClass(), "masterTutorialCancelNum", -1229412292);
        setIntField(term155929, term155929.getClass(), "totalRepertoireCount", -145290566);
        setIntField(term155929, term155929.getClass(), "totalMapNum", -484230704);
        setLongField(term155929, term155929.getClass(), "totalHiScore", 2703347811680968422L);
        setLongField(term155929, term155929.getClass(), "totalBasicHighScore", -3614998234615616494L);
        setLongField(term155929, term155929.getClass(), "totalAdvancedHighScore", 448310655487166741L);
        setLongField(term155929, term155929.getClass(), "totalExpertHighScore", 6665682102336248554L);
        setLongField(term155929, term155929.getClass(), "totalMasterHighScore", -7801053273167145554L);
        setIntField(term156041, term156041.getClass(), "year", 2019);
        setShortField(term156041, term156041.getClass(), "month", (short) 2);
        setShortField(term156041, term156041.getClass(), "day", (short) 23);
        setField(term156040, term156040.getClass(), "date", term156041);
        setByteField(term156045, term156045.getClass(), "hour", (byte) 23);
        setByteField(term156045, term156045.getClass(), "minute", (byte) 41);
        setByteField(term156045, term156045.getClass(), "second", (byte) 26);
        setIntField(term156045, term156045.getClass(), "nano", 62829519);
        setField(term156040, term156040.getClass(), "time", term156045);
        setField(term155929, term155929.getClass(), "eventWatchedDate", term156040);
        setIntField(term155929, term155929.getClass(), "friendCount", -840960310);
        setBooleanField(term155929, term155929.getClass(), "isMaimai", true);
        setField(term155929, term155929.getClass(), "firstGameId", "WvuyCTtUTF");
        setField(term155929, term155929.getClass(), "firstRomVersion", "mSDLNUwhJE");
        setField(term155929, term155929.getClass(), "firstDataVersion", "kydwcBIblz");
        setIntField(term156089, term156089.getClass(), "year", 2011);
        setShortField(term156089, term156089.getClass(), "month", (short) 5);
        setShortField(term156089, term156089.getClass(), "day", (short) 7);
        setField(term156088, term156088.getClass(), "date", term156089);
        setByteField(term156093, term156093.getClass(), "hour", (byte) 10);
        setByteField(term156093, term156093.getClass(), "minute", (byte) 37);
        setByteField(term156093, term156093.getClass(), "second", (byte) 16);
        setIntField(term156093, term156093.getClass(), "nano", 705773546);
        setField(term156088, term156088.getClass(), "time", term156093);
        setField(term155929, term155929.getClass(), "firstPlayDate", term156088);
        setField(term155929, term155929.getClass(), "lastGameId", "uALaoojxvW");
        setField(term155929, term155929.getClass(), "lastRomVersion", "FrsBgmvjej");
        setField(term155929, term155929.getClass(), "lastDataVersion", "OmLoZDdbMy");
        setIntField(term156135, term156135.getClass(), "year", 2016);
        setShortField(term156135, term156135.getClass(), "month", (short) 8);
        setShortField(term156135, term156135.getClass(), "day", (short) 28);
        setField(term156134, term156134.getClass(), "date", term156135);
        setByteField(term156139, term156139.getClass(), "hour", (byte) 11);
        setByteField(term156139, term156139.getClass(), "minute", (byte) 35);
        setByteField(term156139, term156139.getClass(), "second", (byte) 23);
        setIntField(term156139, term156139.getClass(), "nano", 126214783);
        setField(term156134, term156134.getClass(), "time", term156139);
        setField(term155929, term155929.getClass(), "lastPlayDate", term156134);
        setIntField(term155929, term155929.getClass(), "lastPlaceId", 2113830045);
        setField(term155929, term155929.getClass(), "lastPlaceName", "mbNJbZsitQ");
        setField(term155929, term155929.getClass(), "lastRegionId", "VMuWmeVPqW");
        setField(term155929, term155929.getClass(), "lastRegionName", "wtmpUxaoro");
        setField(term155929, term155929.getClass(), "lastAllNetId", "lZpqCAUiaE");
        setField(term155929, term155929.getClass(), "lastClientId", "rwsydXSAIm");
        term156205 = new Integer(957422050);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term156205;
        callMethod(klass, "setMultiPlayCount", argTypes, term155929, args);
    }

};


