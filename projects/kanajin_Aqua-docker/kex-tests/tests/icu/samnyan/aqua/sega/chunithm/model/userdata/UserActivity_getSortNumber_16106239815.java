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

public class UserActivity_getSortNumber_16106239815 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term293573;

    public UserActivity_getSortNumber_16106239815() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term293579 = new Long(-723697646775816649L);
        term293573 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserActivity"));
        Object term293575 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term293577 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term293593 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term293594 = newInstance(Class.forName("java.time.LocalDate"));
        Object term293598 = newInstance(Class.forName("java.time.LocalTime"));
        Object term293603 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term293604 = newInstance(Class.forName("java.time.LocalDate"));
        Object term293608 = newInstance(Class.forName("java.time.LocalTime"));
        Object term293625 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term293626 = newInstance(Class.forName("java.time.LocalDate"));
        Object term293630 = newInstance(Class.forName("java.time.LocalTime"));
        Object term293686 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term293687 = newInstance(Class.forName("java.time.LocalDate"));
        Object term293691 = newInstance(Class.forName("java.time.LocalTime"));
        Object term293734 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term293735 = newInstance(Class.forName("java.time.LocalDate"));
        Object term293739 = newInstance(Class.forName("java.time.LocalTime"));
        Object term293780 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term293781 = newInstance(Class.forName("java.time.LocalDate"));
        Object term293785 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term293573, term293573.getClass(), "id", -497952545782064277L);
        setLongField(term293575, term293575.getClass(), "id", 7460739162162045801L);
        setLongField(term293577, term293577.getClass(), "id", -5532808814285818165L);
        setField(term293577, term293577.getClass(), "extId", term293579);
        setField(term293577, term293577.getClass(), "luid", "OIRXQPPjVx");
        setIntField(term293594, term293594.getClass(), "year", 2025);
        setShortField(term293594, term293594.getClass(), "month", (short) 11);
        setShortField(term293594, term293594.getClass(), "day", (short) 9);
        setField(term293593, term293593.getClass(), "date", term293594);
        setByteField(term293598, term293598.getClass(), "hour", (byte) 7);
        setByteField(term293598, term293598.getClass(), "minute", (byte) 41);
        setByteField(term293598, term293598.getClass(), "second", (byte) 13);
        setIntField(term293598, term293598.getClass(), "nano", 342029717);
        setField(term293593, term293593.getClass(), "time", term293598);
        setField(term293577, term293577.getClass(), "registerTime", term293593);
        setIntField(term293604, term293604.getClass(), "year", 2017);
        setShortField(term293604, term293604.getClass(), "month", (short) 7);
        setShortField(term293604, term293604.getClass(), "day", (short) 3);
        setField(term293603, term293603.getClass(), "date", term293604);
        setByteField(term293608, term293608.getClass(), "hour", (byte) 4);
        setByteField(term293608, term293608.getClass(), "minute", (byte) 54);
        setByteField(term293608, term293608.getClass(), "second", (byte) 26);
        setIntField(term293608, term293608.getClass(), "nano", 621010222);
        setField(term293603, term293603.getClass(), "time", term293608);
        setField(term293577, term293577.getClass(), "accessTime", term293603);
        setField(term293575, term293575.getClass(), "card", term293577);
        setField(term293575, term293575.getClass(), "userName", "SxVFmiOidb");
        setIntField(term293626, term293626.getClass(), "year", 2027);
        setShortField(term293626, term293626.getClass(), "month", (short) 11);
        setShortField(term293626, term293626.getClass(), "day", (short) 28);
        setField(term293625, term293625.getClass(), "date", term293626);
        setByteField(term293630, term293630.getClass(), "hour", (byte) 3);
        setByteField(term293630, term293630.getClass(), "minute", (byte) 25);
        setByteField(term293630, term293630.getClass(), "second", (byte) 56);
        setIntField(term293630, term293630.getClass(), "nano", 782994417);
        setField(term293625, term293625.getClass(), "time", term293630);
        setField(term293575, term293575.getClass(), "lastLoginDate", term293625);
        setBooleanField(term293575, term293575.getClass(), "isWebJoin", false);
        setField(term293575, term293575.getClass(), "webLimitDate", "BsiZGiodQR");
        setIntField(term293575, term293575.getClass(), "level", 681832977);
        setIntField(term293575, term293575.getClass(), "reincarnationNum", 1524336479);
        setField(term293575, term293575.getClass(), "exp", "oJyzXrwmfx");
        setLongField(term293575, term293575.getClass(), "point", 8715063241676350223L);
        setLongField(term293575, term293575.getClass(), "totalPoint", 8749998032565339478L);
        setIntField(term293575, term293575.getClass(), "playCount", 968701988);
        setIntField(term293575, term293575.getClass(), "multiPlayCount", 195003627);
        setIntField(term293575, term293575.getClass(), "multiWinCount", 218703424);
        setIntField(term293575, term293575.getClass(), "requestResCount", -1344458322);
        setIntField(term293575, term293575.getClass(), "acceptResCount", 72566816);
        setIntField(term293575, term293575.getClass(), "successResCount", -188533678);
        setIntField(term293575, term293575.getClass(), "playerRating", 145353220);
        setIntField(term293575, term293575.getClass(), "highestRating", 743278024);
        setIntField(term293575, term293575.getClass(), "nameplateId", 1804144939);
        setIntField(term293575, term293575.getClass(), "frameId", 647434101);
        setIntField(term293575, term293575.getClass(), "characterId", -1053102933);
        setIntField(term293575, term293575.getClass(), "trophyId", -1147306541);
        setIntField(term293575, term293575.getClass(), "playedTutorialBit", -709169906);
        setIntField(term293575, term293575.getClass(), "firstTutorialCancelNum", -1521964012);
        setIntField(term293575, term293575.getClass(), "masterTutorialCancelNum", 1670532643);
        setIntField(term293575, term293575.getClass(), "totalRepertoireCount", 1132888529);
        setIntField(term293575, term293575.getClass(), "totalMapNum", -749019689);
        setLongField(term293575, term293575.getClass(), "totalHiScore", -2844921168908116451L);
        setLongField(term293575, term293575.getClass(), "totalBasicHighScore", 1210014003210444730L);
        setLongField(term293575, term293575.getClass(), "totalAdvancedHighScore", 4954389181137471134L);
        setLongField(term293575, term293575.getClass(), "totalExpertHighScore", 3180630027369982060L);
        setLongField(term293575, term293575.getClass(), "totalMasterHighScore", 6674236555977199465L);
        setIntField(term293687, term293687.getClass(), "year", 2017);
        setShortField(term293687, term293687.getClass(), "month", (short) 3);
        setShortField(term293687, term293687.getClass(), "day", (short) 22);
        setField(term293686, term293686.getClass(), "date", term293687);
        setByteField(term293691, term293691.getClass(), "hour", (byte) 5);
        setByteField(term293691, term293691.getClass(), "minute", (byte) 38);
        setByteField(term293691, term293691.getClass(), "second", (byte) 36);
        setIntField(term293691, term293691.getClass(), "nano", 669917263);
        setField(term293686, term293686.getClass(), "time", term293691);
        setField(term293575, term293575.getClass(), "eventWatchedDate", term293686);
        setIntField(term293575, term293575.getClass(), "friendCount", 10308038);
        setBooleanField(term293575, term293575.getClass(), "isMaimai", false);
        setField(term293575, term293575.getClass(), "firstGameId", "RsEXdKLcXN");
        setField(term293575, term293575.getClass(), "firstRomVersion", "zoOFEvSdRU");
        setField(term293575, term293575.getClass(), "firstDataVersion", "WtywQPTOaF");
        setIntField(term293735, term293735.getClass(), "year", 2020);
        setShortField(term293735, term293735.getClass(), "month", (short) 12);
        setShortField(term293735, term293735.getClass(), "day", (short) 8);
        setField(term293734, term293734.getClass(), "date", term293735);
        setByteField(term293739, term293739.getClass(), "hour", (byte) 12);
        setByteField(term293739, term293739.getClass(), "minute", (byte) 17);
        setByteField(term293739, term293739.getClass(), "second", (byte) 49);
        setIntField(term293739, term293739.getClass(), "nano", 452422477);
        setField(term293734, term293734.getClass(), "time", term293739);
        setField(term293575, term293575.getClass(), "firstPlayDate", term293734);
        setField(term293575, term293575.getClass(), "lastGameId", "MZMkZoDeKG");
        setField(term293575, term293575.getClass(), "lastRomVersion", "JWhhCdUerg");
        setField(term293575, term293575.getClass(), "lastDataVersion", "DrlBWOScgm");
        setIntField(term293781, term293781.getClass(), "year", 2016);
        setShortField(term293781, term293781.getClass(), "month", (short) 11);
        setShortField(term293781, term293781.getClass(), "day", (short) 30);
        setField(term293780, term293780.getClass(), "date", term293781);
        setByteField(term293785, term293785.getClass(), "hour", (byte) 0);
        setByteField(term293785, term293785.getClass(), "minute", (byte) 46);
        setByteField(term293785, term293785.getClass(), "second", (byte) 25);
        setIntField(term293785, term293785.getClass(), "nano", 691477809);
        setField(term293780, term293780.getClass(), "time", term293785);
        setField(term293575, term293575.getClass(), "lastPlayDate", term293780);
        setIntField(term293575, term293575.getClass(), "lastPlaceId", 1806892057);
        setField(term293575, term293575.getClass(), "lastPlaceName", "dOAfAvZzvo");
        setField(term293575, term293575.getClass(), "lastRegionId", "FEfDieFUtF");
        setField(term293575, term293575.getClass(), "lastRegionName", "OvdIsypBPN");
        setField(term293575, term293575.getClass(), "lastAllNetId", "NJNxLsnXOW");
        setField(term293575, term293575.getClass(), "lastClientId", "GwcBHiivYy");
        setField(term293573, term293573.getClass(), "user", term293575);
        setIntField(term293573, term293573.getClass(), "kind", 753991973);
        setIntField(term293573, term293573.getClass(), "activityId", -1799585006);
        setIntField(term293573, term293573.getClass(), "sortNumber", -570035943);
        setIntField(term293573, term293573.getClass(), "param1", 1887980610);
        setIntField(term293573, term293573.getClass(), "param2", -856907689);
        setIntField(term293573, term293573.getClass(), "param3", -1114722762);
        setIntField(term293573, term293573.getClass(), "param4", -1313611523);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserActivity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSortNumber", argTypes, term293573, args);
    }

};


