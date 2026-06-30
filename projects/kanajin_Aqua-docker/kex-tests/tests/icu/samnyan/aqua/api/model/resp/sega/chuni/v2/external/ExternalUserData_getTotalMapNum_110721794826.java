package icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external;

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
import static icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ExternalUserData_getTotalMapNum_110721794826 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10427;

    public ExternalUserData_getTotalMapNum_110721794826() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10427 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData"));
        Object term10452 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10453 = newInstance(Class.forName("java.time.LocalDate"));
        Object term10457 = newInstance(Class.forName("java.time.LocalTime"));
        Object term10513 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10514 = newInstance(Class.forName("java.time.LocalDate"));
        Object term10518 = newInstance(Class.forName("java.time.LocalTime"));
        Object term10561 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10562 = newInstance(Class.forName("java.time.LocalDate"));
        Object term10566 = newInstance(Class.forName("java.time.LocalTime"));
        Object term10607 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10608 = newInstance(Class.forName("java.time.LocalDate"));
        Object term10612 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term10427, term10427.getClass(), "accessCode", "TjWpyghUWN");
        setField(term10427, term10427.getClass(), "userName", "dkZFDZxcde");
        setIntField(term10453, term10453.getClass(), "year", 2013);
        setShortField(term10453, term10453.getClass(), "month", (short) 7);
        setShortField(term10453, term10453.getClass(), "day", (short) 26);
        setField(term10452, term10452.getClass(), "date", term10453);
        setByteField(term10457, term10457.getClass(), "hour", (byte) 14);
        setByteField(term10457, term10457.getClass(), "minute", (byte) 45);
        setByteField(term10457, term10457.getClass(), "second", (byte) 33);
        setIntField(term10457, term10457.getClass(), "nano", 547995853);
        setField(term10452, term10452.getClass(), "time", term10457);
        setField(term10427, term10427.getClass(), "lastLoginDate", term10452);
        setBooleanField(term10427, term10427.getClass(), "isWebJoin", true);
        setField(term10427, term10427.getClass(), "webLimitDate", "WXcZEtUKlI");
        setIntField(term10427, term10427.getClass(), "level", -1271375703);
        setIntField(term10427, term10427.getClass(), "reincarnationNum", 1136208236);
        setField(term10427, term10427.getClass(), "exp", "IkpjUOuWQU");
        setLongField(term10427, term10427.getClass(), "point", 4795660804170399986L);
        setLongField(term10427, term10427.getClass(), "totalPoint", -4030863184426321096L);
        setIntField(term10427, term10427.getClass(), "playCount", -1220630391);
        setIntField(term10427, term10427.getClass(), "multiPlayCount", -995822131);
        setIntField(term10427, term10427.getClass(), "multiWinCount", -687282231);
        setIntField(term10427, term10427.getClass(), "requestResCount", 1200440315);
        setIntField(term10427, term10427.getClass(), "acceptResCount", 40571662);
        setIntField(term10427, term10427.getClass(), "successResCount", 1863910269);
        setIntField(term10427, term10427.getClass(), "playerRating", 864645689);
        setIntField(term10427, term10427.getClass(), "highestRating", 279384872);
        setIntField(term10427, term10427.getClass(), "nameplateId", 1427305953);
        setIntField(term10427, term10427.getClass(), "frameId", -781832877);
        setIntField(term10427, term10427.getClass(), "characterId", 797203987);
        setIntField(term10427, term10427.getClass(), "trophyId", 1973060703);
        setIntField(term10427, term10427.getClass(), "playedTutorialBit", -138239905);
        setIntField(term10427, term10427.getClass(), "firstTutorialCancelNum", 1709474063);
        setIntField(term10427, term10427.getClass(), "masterTutorialCancelNum", 1406617209);
        setIntField(term10427, term10427.getClass(), "totalRepertoireCount", 1706047059);
        setIntField(term10427, term10427.getClass(), "totalMapNum", 590451710);
        setLongField(term10427, term10427.getClass(), "totalHiScore", -8010214112439224349L);
        setLongField(term10427, term10427.getClass(), "totalBasicHighScore", -6673920710396545553L);
        setLongField(term10427, term10427.getClass(), "totalAdvancedHighScore", 3412644969878030772L);
        setLongField(term10427, term10427.getClass(), "totalExpertHighScore", 6698455537431331246L);
        setLongField(term10427, term10427.getClass(), "totalMasterHighScore", -8327432141027603933L);
        setIntField(term10514, term10514.getClass(), "year", 2016);
        setShortField(term10514, term10514.getClass(), "month", (short) 12);
        setShortField(term10514, term10514.getClass(), "day", (short) 20);
        setField(term10513, term10513.getClass(), "date", term10514);
        setByteField(term10518, term10518.getClass(), "hour", (byte) 8);
        setByteField(term10518, term10518.getClass(), "minute", (byte) 46);
        setByteField(term10518, term10518.getClass(), "second", (byte) 16);
        setIntField(term10518, term10518.getClass(), "nano", 10071864);
        setField(term10513, term10513.getClass(), "time", term10518);
        setField(term10427, term10427.getClass(), "eventWatchedDate", term10513);
        setIntField(term10427, term10427.getClass(), "friendCount", -1999787419);
        setBooleanField(term10427, term10427.getClass(), "isMaimai", false);
        setField(term10427, term10427.getClass(), "firstGameId", "boSSpezHeU");
        setField(term10427, term10427.getClass(), "firstRomVersion", "OUeBWNTQDh");
        setField(term10427, term10427.getClass(), "firstDataVersion", "gltJarNuUk");
        setIntField(term10562, term10562.getClass(), "year", 2021);
        setShortField(term10562, term10562.getClass(), "month", (short) 8);
        setShortField(term10562, term10562.getClass(), "day", (short) 27);
        setField(term10561, term10561.getClass(), "date", term10562);
        setByteField(term10566, term10566.getClass(), "hour", (byte) 20);
        setByteField(term10566, term10566.getClass(), "minute", (byte) 11);
        setByteField(term10566, term10566.getClass(), "second", (byte) 47);
        setIntField(term10566, term10566.getClass(), "nano", 116303493);
        setField(term10561, term10561.getClass(), "time", term10566);
        setField(term10427, term10427.getClass(), "firstPlayDate", term10561);
        setField(term10427, term10427.getClass(), "lastGameId", "ZwZIDwYcSW");
        setField(term10427, term10427.getClass(), "lastRomVersion", "sOdkipUKRu");
        setField(term10427, term10427.getClass(), "lastDataVersion", "oKwCDqywym");
        setIntField(term10608, term10608.getClass(), "year", 2012);
        setShortField(term10608, term10608.getClass(), "month", (short) 5);
        setShortField(term10608, term10608.getClass(), "day", (short) 17);
        setField(term10607, term10607.getClass(), "date", term10608);
        setByteField(term10612, term10612.getClass(), "hour", (byte) 19);
        setByteField(term10612, term10612.getClass(), "minute", (byte) 36);
        setByteField(term10612, term10612.getClass(), "second", (byte) 33);
        setIntField(term10612, term10612.getClass(), "nano", 46625011);
        setField(term10607, term10607.getClass(), "time", term10612);
        setField(term10427, term10427.getClass(), "lastPlayDate", term10607);
        setIntField(term10427, term10427.getClass(), "lastPlaceId", -1224443634);
        setField(term10427, term10427.getClass(), "lastPlaceName", "zjZYTddemL");
        setField(term10427, term10427.getClass(), "lastRegionId", "QtrylgCLiF");
        setField(term10427, term10427.getClass(), "lastRegionName", "orEuhCStGM");
        setField(term10427, term10427.getClass(), "lastAllNetId", "HhEaSXWvrY");
        setField(term10427, term10427.getClass(), "lastClientId", "CVRGEomOth");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalMapNum", argTypes, term10427, args);
    }

};


