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

public class UserData_setTotalRepertoireCount_83178720776 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term161921;
     Object term162197;

    public UserData_setTotalRepertoireCount_83178720776() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term161925 = new Long(4341016500855678917L);
        term161921 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term161923 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term161939 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term161940 = newInstance(Class.forName("java.time.LocalDate"));
        Object term161944 = newInstance(Class.forName("java.time.LocalTime"));
        Object term161949 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term161950 = newInstance(Class.forName("java.time.LocalDate"));
        Object term161954 = newInstance(Class.forName("java.time.LocalTime"));
        Object term161971 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term161972 = newInstance(Class.forName("java.time.LocalDate"));
        Object term161976 = newInstance(Class.forName("java.time.LocalTime"));
        Object term162032 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term162033 = newInstance(Class.forName("java.time.LocalDate"));
        Object term162037 = newInstance(Class.forName("java.time.LocalTime"));
        Object term162080 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term162081 = newInstance(Class.forName("java.time.LocalDate"));
        Object term162085 = newInstance(Class.forName("java.time.LocalTime"));
        Object term162126 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term162127 = newInstance(Class.forName("java.time.LocalDate"));
        Object term162131 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term161921, term161921.getClass(), "id", 8783385027474010513L);
        setLongField(term161923, term161923.getClass(), "id", 8798081825245510432L);
        setField(term161923, term161923.getClass(), "extId", term161925);
        setField(term161923, term161923.getClass(), "luid", "yPIlHPlNib");
        setIntField(term161940, term161940.getClass(), "year", 2027);
        setShortField(term161940, term161940.getClass(), "month", (short) 6);
        setShortField(term161940, term161940.getClass(), "day", (short) 1);
        setField(term161939, term161939.getClass(), "date", term161940);
        setByteField(term161944, term161944.getClass(), "hour", (byte) 9);
        setByteField(term161944, term161944.getClass(), "minute", (byte) 3);
        setByteField(term161944, term161944.getClass(), "second", (byte) 28);
        setIntField(term161944, term161944.getClass(), "nano", 819168428);
        setField(term161939, term161939.getClass(), "time", term161944);
        setField(term161923, term161923.getClass(), "registerTime", term161939);
        setIntField(term161950, term161950.getClass(), "year", 2010);
        setShortField(term161950, term161950.getClass(), "month", (short) 12);
        setShortField(term161950, term161950.getClass(), "day", (short) 11);
        setField(term161949, term161949.getClass(), "date", term161950);
        setByteField(term161954, term161954.getClass(), "hour", (byte) 11);
        setByteField(term161954, term161954.getClass(), "minute", (byte) 19);
        setByteField(term161954, term161954.getClass(), "second", (byte) 28);
        setIntField(term161954, term161954.getClass(), "nano", 664374385);
        setField(term161949, term161949.getClass(), "time", term161954);
        setField(term161923, term161923.getClass(), "accessTime", term161949);
        setField(term161921, term161921.getClass(), "card", term161923);
        setField(term161921, term161921.getClass(), "userName", "qdtUDYxxKy");
        setIntField(term161972, term161972.getClass(), "year", 2028);
        setShortField(term161972, term161972.getClass(), "month", (short) 7);
        setShortField(term161972, term161972.getClass(), "day", (short) 3);
        setField(term161971, term161971.getClass(), "date", term161972);
        setByteField(term161976, term161976.getClass(), "hour", (byte) 11);
        setByteField(term161976, term161976.getClass(), "minute", (byte) 21);
        setByteField(term161976, term161976.getClass(), "second", (byte) 10);
        setIntField(term161976, term161976.getClass(), "nano", 369167996);
        setField(term161971, term161971.getClass(), "time", term161976);
        setField(term161921, term161921.getClass(), "lastLoginDate", term161971);
        setBooleanField(term161921, term161921.getClass(), "isWebJoin", true);
        setField(term161921, term161921.getClass(), "webLimitDate", "fSxuiDFwrP");
        setIntField(term161921, term161921.getClass(), "level", -837749919);
        setIntField(term161921, term161921.getClass(), "reincarnationNum", -56371414);
        setField(term161921, term161921.getClass(), "exp", "kkVoDibEgl");
        setLongField(term161921, term161921.getClass(), "point", -7961081262439193657L);
        setLongField(term161921, term161921.getClass(), "totalPoint", 179552899106698143L);
        setIntField(term161921, term161921.getClass(), "playCount", 1655747400);
        setIntField(term161921, term161921.getClass(), "multiPlayCount", 1345032092);
        setIntField(term161921, term161921.getClass(), "multiWinCount", 953985132);
        setIntField(term161921, term161921.getClass(), "requestResCount", -1177278432);
        setIntField(term161921, term161921.getClass(), "acceptResCount", -467461131);
        setIntField(term161921, term161921.getClass(), "successResCount", 1619548087);
        setIntField(term161921, term161921.getClass(), "playerRating", -661818935);
        setIntField(term161921, term161921.getClass(), "highestRating", 263615284);
        setIntField(term161921, term161921.getClass(), "nameplateId", -1940382171);
        setIntField(term161921, term161921.getClass(), "frameId", 1646141136);
        setIntField(term161921, term161921.getClass(), "characterId", 1608131433);
        setIntField(term161921, term161921.getClass(), "trophyId", 97138194);
        setIntField(term161921, term161921.getClass(), "playedTutorialBit", -744642234);
        setIntField(term161921, term161921.getClass(), "firstTutorialCancelNum", -349460490);
        setIntField(term161921, term161921.getClass(), "masterTutorialCancelNum", 1945749170);
        setIntField(term161921, term161921.getClass(), "totalRepertoireCount", -282883918);
        setIntField(term161921, term161921.getClass(), "totalMapNum", -1576666542);
        setLongField(term161921, term161921.getClass(), "totalHiScore", 2000871719067281404L);
        setLongField(term161921, term161921.getClass(), "totalBasicHighScore", 2513828001019390305L);
        setLongField(term161921, term161921.getClass(), "totalAdvancedHighScore", 1343365543075006207L);
        setLongField(term161921, term161921.getClass(), "totalExpertHighScore", -6723803215469447157L);
        setLongField(term161921, term161921.getClass(), "totalMasterHighScore", -3908796315764473052L);
        setIntField(term162033, term162033.getClass(), "year", 2028);
        setShortField(term162033, term162033.getClass(), "month", (short) 4);
        setShortField(term162033, term162033.getClass(), "day", (short) 7);
        setField(term162032, term162032.getClass(), "date", term162033);
        setByteField(term162037, term162037.getClass(), "hour", (byte) 7);
        setByteField(term162037, term162037.getClass(), "minute", (byte) 40);
        setByteField(term162037, term162037.getClass(), "second", (byte) 59);
        setIntField(term162037, term162037.getClass(), "nano", 308015168);
        setField(term162032, term162032.getClass(), "time", term162037);
        setField(term161921, term161921.getClass(), "eventWatchedDate", term162032);
        setIntField(term161921, term161921.getClass(), "friendCount", 622981013);
        setBooleanField(term161921, term161921.getClass(), "isMaimai", false);
        setField(term161921, term161921.getClass(), "firstGameId", "PLwKYMwKMG");
        setField(term161921, term161921.getClass(), "firstRomVersion", "iNAPriOsZk");
        setField(term161921, term161921.getClass(), "firstDataVersion", "WIzLNHlHin");
        setIntField(term162081, term162081.getClass(), "year", 2028);
        setShortField(term162081, term162081.getClass(), "month", (short) 8);
        setShortField(term162081, term162081.getClass(), "day", (short) 27);
        setField(term162080, term162080.getClass(), "date", term162081);
        setByteField(term162085, term162085.getClass(), "hour", (byte) 12);
        setByteField(term162085, term162085.getClass(), "minute", (byte) 13);
        setByteField(term162085, term162085.getClass(), "second", (byte) 44);
        setIntField(term162085, term162085.getClass(), "nano", 368273004);
        setField(term162080, term162080.getClass(), "time", term162085);
        setField(term161921, term161921.getClass(), "firstPlayDate", term162080);
        setField(term161921, term161921.getClass(), "lastGameId", "uXqaYisYbX");
        setField(term161921, term161921.getClass(), "lastRomVersion", "GoCyvRPeGu");
        setField(term161921, term161921.getClass(), "lastDataVersion", "qokvePyIUm");
        setIntField(term162127, term162127.getClass(), "year", 2017);
        setShortField(term162127, term162127.getClass(), "month", (short) 9);
        setShortField(term162127, term162127.getClass(), "day", (short) 2);
        setField(term162126, term162126.getClass(), "date", term162127);
        setByteField(term162131, term162131.getClass(), "hour", (byte) 12);
        setByteField(term162131, term162131.getClass(), "minute", (byte) 44);
        setByteField(term162131, term162131.getClass(), "second", (byte) 21);
        setIntField(term162131, term162131.getClass(), "nano", 92732011);
        setField(term162126, term162126.getClass(), "time", term162131);
        setField(term161921, term161921.getClass(), "lastPlayDate", term162126);
        setIntField(term161921, term161921.getClass(), "lastPlaceId", -2054776518);
        setField(term161921, term161921.getClass(), "lastPlaceName", "mdkCDAisEP");
        setField(term161921, term161921.getClass(), "lastRegionId", "KCXlVnMQNa");
        setField(term161921, term161921.getClass(), "lastRegionName", "itHxInHLQD");
        setField(term161921, term161921.getClass(), "lastAllNetId", "YKcZHffhWM");
        setField(term161921, term161921.getClass(), "lastClientId", "FVvtvTPEiD");
        term162197 = new Integer(-2002407733);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term162197;
        callMethod(klass, "setTotalRepertoireCount", argTypes, term161921, args);
    }

};


