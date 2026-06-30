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

public class ExternalUserData_setLastPlayDate_106027187591 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36800;
     Object term37051;

    public ExternalUserData_setLastPlayDate_106027187591() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36800 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData"));
        Object term36825 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term36826 = newInstance(Class.forName("java.time.LocalDate"));
        Object term36830 = newInstance(Class.forName("java.time.LocalTime"));
        Object term36886 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term36887 = newInstance(Class.forName("java.time.LocalDate"));
        Object term36891 = newInstance(Class.forName("java.time.LocalTime"));
        Object term36934 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term36935 = newInstance(Class.forName("java.time.LocalDate"));
        Object term36939 = newInstance(Class.forName("java.time.LocalTime"));
        Object term36980 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term36981 = newInstance(Class.forName("java.time.LocalDate"));
        Object term36985 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term36800, term36800.getClass(), "accessCode", "DiSkERzqOE");
        setField(term36800, term36800.getClass(), "userName", "hPSZZeYqHQ");
        setIntField(term36826, term36826.getClass(), "year", 2027);
        setShortField(term36826, term36826.getClass(), "month", (short) 8);
        setShortField(term36826, term36826.getClass(), "day", (short) 16);
        setField(term36825, term36825.getClass(), "date", term36826);
        setByteField(term36830, term36830.getClass(), "hour", (byte) 1);
        setByteField(term36830, term36830.getClass(), "minute", (byte) 50);
        setByteField(term36830, term36830.getClass(), "second", (byte) 52);
        setIntField(term36830, term36830.getClass(), "nano", 161814778);
        setField(term36825, term36825.getClass(), "time", term36830);
        setField(term36800, term36800.getClass(), "lastLoginDate", term36825);
        setBooleanField(term36800, term36800.getClass(), "isWebJoin", true);
        setField(term36800, term36800.getClass(), "webLimitDate", "scReMUKyGq");
        setIntField(term36800, term36800.getClass(), "level", 2119231643);
        setIntField(term36800, term36800.getClass(), "reincarnationNum", 688546450);
        setField(term36800, term36800.getClass(), "exp", "FmIpnxjRxA");
        setLongField(term36800, term36800.getClass(), "point", -1413653349314156044L);
        setLongField(term36800, term36800.getClass(), "totalPoint", 742593745847006219L);
        setIntField(term36800, term36800.getClass(), "playCount", 115635779);
        setIntField(term36800, term36800.getClass(), "multiPlayCount", -1081685171);
        setIntField(term36800, term36800.getClass(), "multiWinCount", 1511699134);
        setIntField(term36800, term36800.getClass(), "requestResCount", 185647247);
        setIntField(term36800, term36800.getClass(), "acceptResCount", 720814309);
        setIntField(term36800, term36800.getClass(), "successResCount", 964137425);
        setIntField(term36800, term36800.getClass(), "playerRating", -1378885614);
        setIntField(term36800, term36800.getClass(), "highestRating", -1408615666);
        setIntField(term36800, term36800.getClass(), "nameplateId", -502299598);
        setIntField(term36800, term36800.getClass(), "frameId", -516287593);
        setIntField(term36800, term36800.getClass(), "characterId", -187311406);
        setIntField(term36800, term36800.getClass(), "trophyId", 1496632406);
        setIntField(term36800, term36800.getClass(), "playedTutorialBit", 1858277277);
        setIntField(term36800, term36800.getClass(), "firstTutorialCancelNum", 2145928130);
        setIntField(term36800, term36800.getClass(), "masterTutorialCancelNum", -1095947031);
        setIntField(term36800, term36800.getClass(), "totalRepertoireCount", 1504187156);
        setIntField(term36800, term36800.getClass(), "totalMapNum", -1713723083);
        setLongField(term36800, term36800.getClass(), "totalHiScore", 6801904611028883308L);
        setLongField(term36800, term36800.getClass(), "totalBasicHighScore", -7717027128782374599L);
        setLongField(term36800, term36800.getClass(), "totalAdvancedHighScore", 4872921045907555824L);
        setLongField(term36800, term36800.getClass(), "totalExpertHighScore", 6921855906793748590L);
        setLongField(term36800, term36800.getClass(), "totalMasterHighScore", 7450182989722198450L);
        setIntField(term36887, term36887.getClass(), "year", 2018);
        setShortField(term36887, term36887.getClass(), "month", (short) 2);
        setShortField(term36887, term36887.getClass(), "day", (short) 16);
        setField(term36886, term36886.getClass(), "date", term36887);
        setByteField(term36891, term36891.getClass(), "hour", (byte) 16);
        setByteField(term36891, term36891.getClass(), "minute", (byte) 32);
        setByteField(term36891, term36891.getClass(), "second", (byte) 46);
        setIntField(term36891, term36891.getClass(), "nano", 932915298);
        setField(term36886, term36886.getClass(), "time", term36891);
        setField(term36800, term36800.getClass(), "eventWatchedDate", term36886);
        setIntField(term36800, term36800.getClass(), "friendCount", -1337690242);
        setBooleanField(term36800, term36800.getClass(), "isMaimai", true);
        setField(term36800, term36800.getClass(), "firstGameId", "FTjxxGvyun");
        setField(term36800, term36800.getClass(), "firstRomVersion", "qsjXSwKloH");
        setField(term36800, term36800.getClass(), "firstDataVersion", "DDZHUPglvb");
        setIntField(term36935, term36935.getClass(), "year", 2013);
        setShortField(term36935, term36935.getClass(), "month", (short) 11);
        setShortField(term36935, term36935.getClass(), "day", (short) 7);
        setField(term36934, term36934.getClass(), "date", term36935);
        setByteField(term36939, term36939.getClass(), "hour", (byte) 9);
        setByteField(term36939, term36939.getClass(), "minute", (byte) 3);
        setByteField(term36939, term36939.getClass(), "second", (byte) 32);
        setIntField(term36939, term36939.getClass(), "nano", 53548583);
        setField(term36934, term36934.getClass(), "time", term36939);
        setField(term36800, term36800.getClass(), "firstPlayDate", term36934);
        setField(term36800, term36800.getClass(), "lastGameId", "rWoaXvNyVg");
        setField(term36800, term36800.getClass(), "lastRomVersion", "FLzaBCFjGv");
        setField(term36800, term36800.getClass(), "lastDataVersion", "OLYhTSqTqJ");
        setIntField(term36981, term36981.getClass(), "year", 2024);
        setShortField(term36981, term36981.getClass(), "month", (short) 11);
        setShortField(term36981, term36981.getClass(), "day", (short) 26);
        setField(term36980, term36980.getClass(), "date", term36981);
        setByteField(term36985, term36985.getClass(), "hour", (byte) 3);
        setByteField(term36985, term36985.getClass(), "minute", (byte) 8);
        setByteField(term36985, term36985.getClass(), "second", (byte) 47);
        setIntField(term36985, term36985.getClass(), "nano", 559634968);
        setField(term36980, term36980.getClass(), "time", term36985);
        setField(term36800, term36800.getClass(), "lastPlayDate", term36980);
        setIntField(term36800, term36800.getClass(), "lastPlaceId", 264872152);
        setField(term36800, term36800.getClass(), "lastPlaceName", "AIHoadcpQz");
        setField(term36800, term36800.getClass(), "lastRegionId", "fWMsLtuOEV");
        setField(term36800, term36800.getClass(), "lastRegionName", "fvgZQBalnd");
        setField(term36800, term36800.getClass(), "lastAllNetId", "tViQSKUCLE");
        setField(term36800, term36800.getClass(), "lastClientId", "QbaeHheqiP");
        term37051 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term37052 = newInstance(Class.forName("java.time.LocalDate"));
        Object term37056 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term37052, term37052.getClass(), "year", 2018);
        setShortField(term37052, term37052.getClass(), "month", (short) 4);
        setShortField(term37052, term37052.getClass(), "day", (short) 20);
        setField(term37051, term37051.getClass(), "date", term37052);
        setByteField(term37056, term37056.getClass(), "hour", (byte) 16);
        setByteField(term37056, term37056.getClass(), "minute", (byte) 13);
        setByteField(term37056, term37056.getClass(), "second", (byte) 15);
        setIntField(term37056, term37056.getClass(), "nano", 195741881);
        setField(term37051, term37051.getClass(), "time", term37056);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term37051;
        callMethod(klass, "setLastPlayDate", argTypes, term36800, args);
    }

};


