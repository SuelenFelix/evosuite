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
import java.lang.Integer;

public class ExternalUserData_setPlayedTutorialBit_202026357271 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28604;
     Object term28855;

    public ExternalUserData_setPlayedTutorialBit_202026357271() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28604 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData"));
        Object term28629 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28630 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28634 = newInstance(Class.forName("java.time.LocalTime"));
        Object term28690 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28691 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28695 = newInstance(Class.forName("java.time.LocalTime"));
        Object term28738 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28739 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28743 = newInstance(Class.forName("java.time.LocalTime"));
        Object term28784 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28785 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28789 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term28604, term28604.getClass(), "accessCode", "YciMAObLwl");
        setField(term28604, term28604.getClass(), "userName", "qAmVqwwdyf");
        setIntField(term28630, term28630.getClass(), "year", 2027);
        setShortField(term28630, term28630.getClass(), "month", (short) 1);
        setShortField(term28630, term28630.getClass(), "day", (short) 20);
        setField(term28629, term28629.getClass(), "date", term28630);
        setByteField(term28634, term28634.getClass(), "hour", (byte) 8);
        setByteField(term28634, term28634.getClass(), "minute", (byte) 5);
        setByteField(term28634, term28634.getClass(), "second", (byte) 44);
        setIntField(term28634, term28634.getClass(), "nano", 960768267);
        setField(term28629, term28629.getClass(), "time", term28634);
        setField(term28604, term28604.getClass(), "lastLoginDate", term28629);
        setBooleanField(term28604, term28604.getClass(), "isWebJoin", false);
        setField(term28604, term28604.getClass(), "webLimitDate", "IXPaHQnEUy");
        setIntField(term28604, term28604.getClass(), "level", 42982854);
        setIntField(term28604, term28604.getClass(), "reincarnationNum", -1129506480);
        setField(term28604, term28604.getClass(), "exp", "zhcWVVrrjs");
        setLongField(term28604, term28604.getClass(), "point", 1350676497718116574L);
        setLongField(term28604, term28604.getClass(), "totalPoint", -4477377284889705897L);
        setIntField(term28604, term28604.getClass(), "playCount", 301438568);
        setIntField(term28604, term28604.getClass(), "multiPlayCount", -1667908453);
        setIntField(term28604, term28604.getClass(), "multiWinCount", 315910438);
        setIntField(term28604, term28604.getClass(), "requestResCount", -1673157821);
        setIntField(term28604, term28604.getClass(), "acceptResCount", 1217804703);
        setIntField(term28604, term28604.getClass(), "successResCount", -1981494102);
        setIntField(term28604, term28604.getClass(), "playerRating", -2064148945);
        setIntField(term28604, term28604.getClass(), "highestRating", 494400151);
        setIntField(term28604, term28604.getClass(), "nameplateId", 1588058685);
        setIntField(term28604, term28604.getClass(), "frameId", 1677707412);
        setIntField(term28604, term28604.getClass(), "characterId", -297367861);
        setIntField(term28604, term28604.getClass(), "trophyId", -1133541490);
        setIntField(term28604, term28604.getClass(), "playedTutorialBit", 942412391);
        setIntField(term28604, term28604.getClass(), "firstTutorialCancelNum", 751596480);
        setIntField(term28604, term28604.getClass(), "masterTutorialCancelNum", 1971485144);
        setIntField(term28604, term28604.getClass(), "totalRepertoireCount", 2059603512);
        setIntField(term28604, term28604.getClass(), "totalMapNum", -1308902065);
        setLongField(term28604, term28604.getClass(), "totalHiScore", 6323132402520425961L);
        setLongField(term28604, term28604.getClass(), "totalBasicHighScore", -354905832180781372L);
        setLongField(term28604, term28604.getClass(), "totalAdvancedHighScore", -5967061076297699457L);
        setLongField(term28604, term28604.getClass(), "totalExpertHighScore", 1550364590565203407L);
        setLongField(term28604, term28604.getClass(), "totalMasterHighScore", 4530705892517898929L);
        setIntField(term28691, term28691.getClass(), "year", 2023);
        setShortField(term28691, term28691.getClass(), "month", (short) 11);
        setShortField(term28691, term28691.getClass(), "day", (short) 8);
        setField(term28690, term28690.getClass(), "date", term28691);
        setByteField(term28695, term28695.getClass(), "hour", (byte) 21);
        setByteField(term28695, term28695.getClass(), "minute", (byte) 57);
        setByteField(term28695, term28695.getClass(), "second", (byte) 28);
        setIntField(term28695, term28695.getClass(), "nano", 426944685);
        setField(term28690, term28690.getClass(), "time", term28695);
        setField(term28604, term28604.getClass(), "eventWatchedDate", term28690);
        setIntField(term28604, term28604.getClass(), "friendCount", 605255795);
        setBooleanField(term28604, term28604.getClass(), "isMaimai", false);
        setField(term28604, term28604.getClass(), "firstGameId", "EAMaFLdmaG");
        setField(term28604, term28604.getClass(), "firstRomVersion", "DYZSJMwbhX");
        setField(term28604, term28604.getClass(), "firstDataVersion", "QGcshsIIWo");
        setIntField(term28739, term28739.getClass(), "year", 2020);
        setShortField(term28739, term28739.getClass(), "month", (short) 9);
        setShortField(term28739, term28739.getClass(), "day", (short) 2);
        setField(term28738, term28738.getClass(), "date", term28739);
        setByteField(term28743, term28743.getClass(), "hour", (byte) 17);
        setByteField(term28743, term28743.getClass(), "minute", (byte) 47);
        setByteField(term28743, term28743.getClass(), "second", (byte) 32);
        setIntField(term28743, term28743.getClass(), "nano", 161829485);
        setField(term28738, term28738.getClass(), "time", term28743);
        setField(term28604, term28604.getClass(), "firstPlayDate", term28738);
        setField(term28604, term28604.getClass(), "lastGameId", "dPHtrzKWgf");
        setField(term28604, term28604.getClass(), "lastRomVersion", "olmFxfIVeh");
        setField(term28604, term28604.getClass(), "lastDataVersion", "iSPirUEhXs");
        setIntField(term28785, term28785.getClass(), "year", 2014);
        setShortField(term28785, term28785.getClass(), "month", (short) 5);
        setShortField(term28785, term28785.getClass(), "day", (short) 20);
        setField(term28784, term28784.getClass(), "date", term28785);
        setByteField(term28789, term28789.getClass(), "hour", (byte) 12);
        setByteField(term28789, term28789.getClass(), "minute", (byte) 30);
        setByteField(term28789, term28789.getClass(), "second", (byte) 37);
        setIntField(term28789, term28789.getClass(), "nano", 390283474);
        setField(term28784, term28784.getClass(), "time", term28789);
        setField(term28604, term28604.getClass(), "lastPlayDate", term28784);
        setIntField(term28604, term28604.getClass(), "lastPlaceId", 1743438307);
        setField(term28604, term28604.getClass(), "lastPlaceName", "WWyLFmYpAy");
        setField(term28604, term28604.getClass(), "lastRegionId", "vbSWeJWOQh");
        setField(term28604, term28604.getClass(), "lastRegionName", "hyvFdAvkOr");
        setField(term28604, term28604.getClass(), "lastAllNetId", "ewbQRtustW");
        setField(term28604, term28604.getClass(), "lastClientId", "cABEHYBnys");
        term28855 = new Integer(-1122596893);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term28855;
        callMethod(klass, "setPlayedTutorialBit", argTypes, term28604, args);
    }

};


