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

public class ExternalUserData_getTrophyId_11636659721 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8422;

    public ExternalUserData_getTrophyId_11636659721() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8422 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData"));
        Object term8447 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8448 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8452 = newInstance(Class.forName("java.time.LocalTime"));
        Object term8508 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8509 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8513 = newInstance(Class.forName("java.time.LocalTime"));
        Object term8556 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8557 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8561 = newInstance(Class.forName("java.time.LocalTime"));
        Object term8602 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8603 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8607 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term8422, term8422.getClass(), "accessCode", "zNFLXMifnS");
        setField(term8422, term8422.getClass(), "userName", "HHQcYMSBVc");
        setIntField(term8448, term8448.getClass(), "year", 2020);
        setShortField(term8448, term8448.getClass(), "month", (short) 5);
        setShortField(term8448, term8448.getClass(), "day", (short) 12);
        setField(term8447, term8447.getClass(), "date", term8448);
        setByteField(term8452, term8452.getClass(), "hour", (byte) 0);
        setByteField(term8452, term8452.getClass(), "minute", (byte) 15);
        setByteField(term8452, term8452.getClass(), "second", (byte) 24);
        setIntField(term8452, term8452.getClass(), "nano", 250257744);
        setField(term8447, term8447.getClass(), "time", term8452);
        setField(term8422, term8422.getClass(), "lastLoginDate", term8447);
        setBooleanField(term8422, term8422.getClass(), "isWebJoin", true);
        setField(term8422, term8422.getClass(), "webLimitDate", "wdoqITnaAP");
        setIntField(term8422, term8422.getClass(), "level", 1638851942);
        setIntField(term8422, term8422.getClass(), "reincarnationNum", 1374790203);
        setField(term8422, term8422.getClass(), "exp", "rIPMBcrNqB");
        setLongField(term8422, term8422.getClass(), "point", -4598158870068953328L);
        setLongField(term8422, term8422.getClass(), "totalPoint", 138235087558060686L);
        setIntField(term8422, term8422.getClass(), "playCount", 1160010161);
        setIntField(term8422, term8422.getClass(), "multiPlayCount", -423900705);
        setIntField(term8422, term8422.getClass(), "multiWinCount", -525570815);
        setIntField(term8422, term8422.getClass(), "requestResCount", 754055848);
        setIntField(term8422, term8422.getClass(), "acceptResCount", -19246901);
        setIntField(term8422, term8422.getClass(), "successResCount", -370828664);
        setIntField(term8422, term8422.getClass(), "playerRating", 1168633950);
        setIntField(term8422, term8422.getClass(), "highestRating", 1607082164);
        setIntField(term8422, term8422.getClass(), "nameplateId", 1890399366);
        setIntField(term8422, term8422.getClass(), "frameId", -1867239125);
        setIntField(term8422, term8422.getClass(), "characterId", 952869601);
        setIntField(term8422, term8422.getClass(), "trophyId", 91958879);
        setIntField(term8422, term8422.getClass(), "playedTutorialBit", -645429025);
        setIntField(term8422, term8422.getClass(), "firstTutorialCancelNum", -688213483);
        setIntField(term8422, term8422.getClass(), "masterTutorialCancelNum", 644154104);
        setIntField(term8422, term8422.getClass(), "totalRepertoireCount", 76650923);
        setIntField(term8422, term8422.getClass(), "totalMapNum", 1003743923);
        setLongField(term8422, term8422.getClass(), "totalHiScore", 5381386339318883012L);
        setLongField(term8422, term8422.getClass(), "totalBasicHighScore", -1333707622307134180L);
        setLongField(term8422, term8422.getClass(), "totalAdvancedHighScore", -4360569253593381888L);
        setLongField(term8422, term8422.getClass(), "totalExpertHighScore", 1457594663983990440L);
        setLongField(term8422, term8422.getClass(), "totalMasterHighScore", 3452833434644634217L);
        setIntField(term8509, term8509.getClass(), "year", 2013);
        setShortField(term8509, term8509.getClass(), "month", (short) 9);
        setShortField(term8509, term8509.getClass(), "day", (short) 19);
        setField(term8508, term8508.getClass(), "date", term8509);
        setByteField(term8513, term8513.getClass(), "hour", (byte) 12);
        setByteField(term8513, term8513.getClass(), "minute", (byte) 29);
        setByteField(term8513, term8513.getClass(), "second", (byte) 28);
        setIntField(term8513, term8513.getClass(), "nano", 244069764);
        setField(term8508, term8508.getClass(), "time", term8513);
        setField(term8422, term8422.getClass(), "eventWatchedDate", term8508);
        setIntField(term8422, term8422.getClass(), "friendCount", 1887772522);
        setBooleanField(term8422, term8422.getClass(), "isMaimai", true);
        setField(term8422, term8422.getClass(), "firstGameId", "UDaboHZHhz");
        setField(term8422, term8422.getClass(), "firstRomVersion", "nRvKihUSPj");
        setField(term8422, term8422.getClass(), "firstDataVersion", "BbNeQJpYPr");
        setIntField(term8557, term8557.getClass(), "year", 2025);
        setShortField(term8557, term8557.getClass(), "month", (short) 12);
        setShortField(term8557, term8557.getClass(), "day", (short) 16);
        setField(term8556, term8556.getClass(), "date", term8557);
        setByteField(term8561, term8561.getClass(), "hour", (byte) 7);
        setByteField(term8561, term8561.getClass(), "minute", (byte) 53);
        setByteField(term8561, term8561.getClass(), "second", (byte) 23);
        setIntField(term8561, term8561.getClass(), "nano", 532991944);
        setField(term8556, term8556.getClass(), "time", term8561);
        setField(term8422, term8422.getClass(), "firstPlayDate", term8556);
        setField(term8422, term8422.getClass(), "lastGameId", "riMtzCoxNj");
        setField(term8422, term8422.getClass(), "lastRomVersion", "YAXkVjQZcV");
        setField(term8422, term8422.getClass(), "lastDataVersion", "pumvwBWvpy");
        setIntField(term8603, term8603.getClass(), "year", 2024);
        setShortField(term8603, term8603.getClass(), "month", (short) 2);
        setShortField(term8603, term8603.getClass(), "day", (short) 5);
        setField(term8602, term8602.getClass(), "date", term8603);
        setByteField(term8607, term8607.getClass(), "hour", (byte) 12);
        setByteField(term8607, term8607.getClass(), "minute", (byte) 28);
        setByteField(term8607, term8607.getClass(), "second", (byte) 37);
        setIntField(term8607, term8607.getClass(), "nano", 689695229);
        setField(term8602, term8602.getClass(), "time", term8607);
        setField(term8422, term8422.getClass(), "lastPlayDate", term8602);
        setIntField(term8422, term8422.getClass(), "lastPlaceId", 354196060);
        setField(term8422, term8422.getClass(), "lastPlaceName", "HwLHeGLyhe");
        setField(term8422, term8422.getClass(), "lastRegionId", "RDnkgWkcbz");
        setField(term8422, term8422.getClass(), "lastRegionName", "IBpaxltauX");
        setField(term8422, term8422.getClass(), "lastAllNetId", "hePqROaplw");
        setField(term8422, term8422.getClass(), "lastClientId", "PJcSNDruWd");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTrophyId", argTypes, term8422, args);
    }

};


