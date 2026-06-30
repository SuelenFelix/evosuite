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

public class UserMap_equals_134736807523 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term288885;
     Object term289172;

    public UserMap_equals_134736807523() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term288891 = new Long(-2577420466618938650L);
        term288885 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMap"));
        Object term288887 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term288889 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term288905 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term288906 = newInstance(Class.forName("java.time.LocalDate"));
        Object term288910 = newInstance(Class.forName("java.time.LocalTime"));
        Object term288915 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term288916 = newInstance(Class.forName("java.time.LocalDate"));
        Object term288920 = newInstance(Class.forName("java.time.LocalTime"));
        Object term288937 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term288938 = newInstance(Class.forName("java.time.LocalDate"));
        Object term288942 = newInstance(Class.forName("java.time.LocalTime"));
        Object term288998 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term288999 = newInstance(Class.forName("java.time.LocalDate"));
        Object term289003 = newInstance(Class.forName("java.time.LocalTime"));
        Object term289046 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term289047 = newInstance(Class.forName("java.time.LocalDate"));
        Object term289051 = newInstance(Class.forName("java.time.LocalTime"));
        Object term289092 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term289093 = newInstance(Class.forName("java.time.LocalDate"));
        Object term289097 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term288885, term288885.getClass(), "id", -1954015532365465759L);
        setLongField(term288887, term288887.getClass(), "id", -6512802381597662009L);
        setLongField(term288889, term288889.getClass(), "id", -2194383482869570162L);
        setField(term288889, term288889.getClass(), "extId", term288891);
        setField(term288889, term288889.getClass(), "luid", "fETlboOXMD");
        setIntField(term288906, term288906.getClass(), "year", 2028);
        setShortField(term288906, term288906.getClass(), "month", (short) 5);
        setShortField(term288906, term288906.getClass(), "day", (short) 23);
        setField(term288905, term288905.getClass(), "date", term288906);
        setByteField(term288910, term288910.getClass(), "hour", (byte) 5);
        setByteField(term288910, term288910.getClass(), "minute", (byte) 58);
        setByteField(term288910, term288910.getClass(), "second", (byte) 23);
        setIntField(term288910, term288910.getClass(), "nano", 964430982);
        setField(term288905, term288905.getClass(), "time", term288910);
        setField(term288889, term288889.getClass(), "registerTime", term288905);
        setIntField(term288916, term288916.getClass(), "year", 2029);
        setShortField(term288916, term288916.getClass(), "month", (short) 2);
        setShortField(term288916, term288916.getClass(), "day", (short) 4);
        setField(term288915, term288915.getClass(), "date", term288916);
        setByteField(term288920, term288920.getClass(), "hour", (byte) 1);
        setByteField(term288920, term288920.getClass(), "minute", (byte) 17);
        setByteField(term288920, term288920.getClass(), "second", (byte) 52);
        setIntField(term288920, term288920.getClass(), "nano", 749228557);
        setField(term288915, term288915.getClass(), "time", term288920);
        setField(term288889, term288889.getClass(), "accessTime", term288915);
        setField(term288887, term288887.getClass(), "card", term288889);
        setField(term288887, term288887.getClass(), "userName", "VUNSRpHsgz");
        setIntField(term288938, term288938.getClass(), "year", 2011);
        setShortField(term288938, term288938.getClass(), "month", (short) 7);
        setShortField(term288938, term288938.getClass(), "day", (short) 3);
        setField(term288937, term288937.getClass(), "date", term288938);
        setByteField(term288942, term288942.getClass(), "hour", (byte) 15);
        setByteField(term288942, term288942.getClass(), "minute", (byte) 35);
        setByteField(term288942, term288942.getClass(), "second", (byte) 51);
        setIntField(term288942, term288942.getClass(), "nano", 588485399);
        setField(term288937, term288937.getClass(), "time", term288942);
        setField(term288887, term288887.getClass(), "lastLoginDate", term288937);
        setBooleanField(term288887, term288887.getClass(), "isWebJoin", true);
        setField(term288887, term288887.getClass(), "webLimitDate", "THoPgbPYUF");
        setIntField(term288887, term288887.getClass(), "level", -1756194305);
        setIntField(term288887, term288887.getClass(), "reincarnationNum", 83370923);
        setField(term288887, term288887.getClass(), "exp", "FLJqMgPbQm");
        setLongField(term288887, term288887.getClass(), "point", 6272509896964660741L);
        setLongField(term288887, term288887.getClass(), "totalPoint", -8854434162914610061L);
        setIntField(term288887, term288887.getClass(), "playCount", -1299639537);
        setIntField(term288887, term288887.getClass(), "multiPlayCount", -1373829729);
        setIntField(term288887, term288887.getClass(), "multiWinCount", -1556465214);
        setIntField(term288887, term288887.getClass(), "requestResCount", -222495364);
        setIntField(term288887, term288887.getClass(), "acceptResCount", -1152557968);
        setIntField(term288887, term288887.getClass(), "successResCount", 1194030737);
        setIntField(term288887, term288887.getClass(), "playerRating", 353795028);
        setIntField(term288887, term288887.getClass(), "highestRating", -1230943141);
        setIntField(term288887, term288887.getClass(), "nameplateId", -2046024363);
        setIntField(term288887, term288887.getClass(), "frameId", -226788568);
        setIntField(term288887, term288887.getClass(), "characterId", 832622865);
        setIntField(term288887, term288887.getClass(), "trophyId", 1290031096);
        setIntField(term288887, term288887.getClass(), "playedTutorialBit", 1244845068);
        setIntField(term288887, term288887.getClass(), "firstTutorialCancelNum", -1073577017);
        setIntField(term288887, term288887.getClass(), "masterTutorialCancelNum", -26693320);
        setIntField(term288887, term288887.getClass(), "totalRepertoireCount", -483886121);
        setIntField(term288887, term288887.getClass(), "totalMapNum", 1561622574);
        setLongField(term288887, term288887.getClass(), "totalHiScore", -5968601817421624476L);
        setLongField(term288887, term288887.getClass(), "totalBasicHighScore", 7520988637380790424L);
        setLongField(term288887, term288887.getClass(), "totalAdvancedHighScore", 3026771141762351269L);
        setLongField(term288887, term288887.getClass(), "totalExpertHighScore", -5644277598782586928L);
        setLongField(term288887, term288887.getClass(), "totalMasterHighScore", 8775279542599344811L);
        setIntField(term288999, term288999.getClass(), "year", 2020);
        setShortField(term288999, term288999.getClass(), "month", (short) 4);
        setShortField(term288999, term288999.getClass(), "day", (short) 8);
        setField(term288998, term288998.getClass(), "date", term288999);
        setByteField(term289003, term289003.getClass(), "hour", (byte) 6);
        setByteField(term289003, term289003.getClass(), "minute", (byte) 58);
        setByteField(term289003, term289003.getClass(), "second", (byte) 16);
        setIntField(term289003, term289003.getClass(), "nano", 724458411);
        setField(term288998, term288998.getClass(), "time", term289003);
        setField(term288887, term288887.getClass(), "eventWatchedDate", term288998);
        setIntField(term288887, term288887.getClass(), "friendCount", 1113888710);
        setBooleanField(term288887, term288887.getClass(), "isMaimai", false);
        setField(term288887, term288887.getClass(), "firstGameId", "npMxjCfNPy");
        setField(term288887, term288887.getClass(), "firstRomVersion", "skQRylzRMg");
        setField(term288887, term288887.getClass(), "firstDataVersion", "PwmioJcxYU");
        setIntField(term289047, term289047.getClass(), "year", 2027);
        setShortField(term289047, term289047.getClass(), "month", (short) 5);
        setShortField(term289047, term289047.getClass(), "day", (short) 25);
        setField(term289046, term289046.getClass(), "date", term289047);
        setByteField(term289051, term289051.getClass(), "hour", (byte) 22);
        setByteField(term289051, term289051.getClass(), "minute", (byte) 26);
        setByteField(term289051, term289051.getClass(), "second", (byte) 25);
        setIntField(term289051, term289051.getClass(), "nano", 462619713);
        setField(term289046, term289046.getClass(), "time", term289051);
        setField(term288887, term288887.getClass(), "firstPlayDate", term289046);
        setField(term288887, term288887.getClass(), "lastGameId", "wkgBbdahBJ");
        setField(term288887, term288887.getClass(), "lastRomVersion", "TIOKoSkgvB");
        setField(term288887, term288887.getClass(), "lastDataVersion", "klYAJTFSIk");
        setIntField(term289093, term289093.getClass(), "year", 2028);
        setShortField(term289093, term289093.getClass(), "month", (short) 10);
        setShortField(term289093, term289093.getClass(), "day", (short) 24);
        setField(term289092, term289092.getClass(), "date", term289093);
        setByteField(term289097, term289097.getClass(), "hour", (byte) 7);
        setByteField(term289097, term289097.getClass(), "minute", (byte) 55);
        setByteField(term289097, term289097.getClass(), "second", (byte) 3);
        setIntField(term289097, term289097.getClass(), "nano", 581074464);
        setField(term289092, term289092.getClass(), "time", term289097);
        setField(term288887, term288887.getClass(), "lastPlayDate", term289092);
        setIntField(term288887, term288887.getClass(), "lastPlaceId", -698024242);
        setField(term288887, term288887.getClass(), "lastPlaceName", "YLhafUDZSf");
        setField(term288887, term288887.getClass(), "lastRegionId", "NkqVectDCd");
        setField(term288887, term288887.getClass(), "lastRegionName", "PAiEsxsOUA");
        setField(term288887, term288887.getClass(), "lastAllNetId", "YKgbVyVpIQ");
        setField(term288887, term288887.getClass(), "lastClientId", "nrxEBlDDtw");
        setField(term288885, term288885.getClass(), "user", term288887);
        setIntField(term288885, term288885.getClass(), "mapId", -2008426651);
        setIntField(term288885, term288885.getClass(), "position", -1796035804);
        setBooleanField(term288885, term288885.getClass(), "isClear", false);
        setIntField(term288885, term288885.getClass(), "areaId", 623019437);
        setIntField(term288885, term288885.getClass(), "routeNumber", 1658668354);
        setIntField(term288885, term288885.getClass(), "eventId", 917621580);
        setIntField(term288885, term288885.getClass(), "rate", 446002412);
        setIntField(term288885, term288885.getClass(), "statusCount", -1099013474);
        setBooleanField(term288885, term288885.getClass(), "isValid", true);
        term289172 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term289172;
        callMethod(klass, "equals", argTypes, term288885, args);
    }

};


