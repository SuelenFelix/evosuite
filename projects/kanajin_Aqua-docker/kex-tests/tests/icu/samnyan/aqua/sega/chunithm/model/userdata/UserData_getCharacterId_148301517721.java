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

public class UserData_getCharacterId_148301517721 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term138327;

    public UserData_getCharacterId_148301517721() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term138331 = new Long(-2951854704066477061L);
        term138327 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term138329 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term138345 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term138346 = newInstance(Class.forName("java.time.LocalDate"));
        Object term138350 = newInstance(Class.forName("java.time.LocalTime"));
        Object term138355 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term138356 = newInstance(Class.forName("java.time.LocalDate"));
        Object term138360 = newInstance(Class.forName("java.time.LocalTime"));
        Object term138377 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term138378 = newInstance(Class.forName("java.time.LocalDate"));
        Object term138382 = newInstance(Class.forName("java.time.LocalTime"));
        Object term138438 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term138439 = newInstance(Class.forName("java.time.LocalDate"));
        Object term138443 = newInstance(Class.forName("java.time.LocalTime"));
        Object term138486 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term138487 = newInstance(Class.forName("java.time.LocalDate"));
        Object term138491 = newInstance(Class.forName("java.time.LocalTime"));
        Object term138532 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term138533 = newInstance(Class.forName("java.time.LocalDate"));
        Object term138537 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term138327, term138327.getClass(), "id", -4813337266375113125L);
        setLongField(term138329, term138329.getClass(), "id", -5645042874196452363L);
        setField(term138329, term138329.getClass(), "extId", term138331);
        setField(term138329, term138329.getClass(), "luid", "heEXeIaieQ");
        setIntField(term138346, term138346.getClass(), "year", 2029);
        setShortField(term138346, term138346.getClass(), "month", (short) 4);
        setShortField(term138346, term138346.getClass(), "day", (short) 20);
        setField(term138345, term138345.getClass(), "date", term138346);
        setByteField(term138350, term138350.getClass(), "hour", (byte) 8);
        setByteField(term138350, term138350.getClass(), "minute", (byte) 8);
        setByteField(term138350, term138350.getClass(), "second", (byte) 39);
        setIntField(term138350, term138350.getClass(), "nano", 45548450);
        setField(term138345, term138345.getClass(), "time", term138350);
        setField(term138329, term138329.getClass(), "registerTime", term138345);
        setIntField(term138356, term138356.getClass(), "year", 2015);
        setShortField(term138356, term138356.getClass(), "month", (short) 1);
        setShortField(term138356, term138356.getClass(), "day", (short) 14);
        setField(term138355, term138355.getClass(), "date", term138356);
        setByteField(term138360, term138360.getClass(), "hour", (byte) 17);
        setByteField(term138360, term138360.getClass(), "minute", (byte) 48);
        setByteField(term138360, term138360.getClass(), "second", (byte) 25);
        setIntField(term138360, term138360.getClass(), "nano", 585352469);
        setField(term138355, term138355.getClass(), "time", term138360);
        setField(term138329, term138329.getClass(), "accessTime", term138355);
        setField(term138327, term138327.getClass(), "card", term138329);
        setField(term138327, term138327.getClass(), "userName", "MhsNUxKgPP");
        setIntField(term138378, term138378.getClass(), "year", 2017);
        setShortField(term138378, term138378.getClass(), "month", (short) 2);
        setShortField(term138378, term138378.getClass(), "day", (short) 15);
        setField(term138377, term138377.getClass(), "date", term138378);
        setByteField(term138382, term138382.getClass(), "hour", (byte) 2);
        setByteField(term138382, term138382.getClass(), "minute", (byte) 35);
        setByteField(term138382, term138382.getClass(), "second", (byte) 41);
        setIntField(term138382, term138382.getClass(), "nano", 416362651);
        setField(term138377, term138377.getClass(), "time", term138382);
        setField(term138327, term138327.getClass(), "lastLoginDate", term138377);
        setBooleanField(term138327, term138327.getClass(), "isWebJoin", true);
        setField(term138327, term138327.getClass(), "webLimitDate", "cGLyrLlynk");
        setIntField(term138327, term138327.getClass(), "level", 221439292);
        setIntField(term138327, term138327.getClass(), "reincarnationNum", -1449686187);
        setField(term138327, term138327.getClass(), "exp", "mMpSzaWkTz");
        setLongField(term138327, term138327.getClass(), "point", 1089144432691396169L);
        setLongField(term138327, term138327.getClass(), "totalPoint", 6043571308877237179L);
        setIntField(term138327, term138327.getClass(), "playCount", -1374649219);
        setIntField(term138327, term138327.getClass(), "multiPlayCount", 1856279121);
        setIntField(term138327, term138327.getClass(), "multiWinCount", -407004822);
        setIntField(term138327, term138327.getClass(), "requestResCount", -1357273988);
        setIntField(term138327, term138327.getClass(), "acceptResCount", -923140400);
        setIntField(term138327, term138327.getClass(), "successResCount", -553202541);
        setIntField(term138327, term138327.getClass(), "playerRating", -921082991);
        setIntField(term138327, term138327.getClass(), "highestRating", -1697647652);
        setIntField(term138327, term138327.getClass(), "nameplateId", -653540011);
        setIntField(term138327, term138327.getClass(), "frameId", -897305207);
        setIntField(term138327, term138327.getClass(), "characterId", -1682000986);
        setIntField(term138327, term138327.getClass(), "trophyId", 417127629);
        setIntField(term138327, term138327.getClass(), "playedTutorialBit", 891084826);
        setIntField(term138327, term138327.getClass(), "firstTutorialCancelNum", -1903396559);
        setIntField(term138327, term138327.getClass(), "masterTutorialCancelNum", -379718533);
        setIntField(term138327, term138327.getClass(), "totalRepertoireCount", 1847948269);
        setIntField(term138327, term138327.getClass(), "totalMapNum", -1587620345);
        setLongField(term138327, term138327.getClass(), "totalHiScore", 1857688668677867235L);
        setLongField(term138327, term138327.getClass(), "totalBasicHighScore", -1175329770645054224L);
        setLongField(term138327, term138327.getClass(), "totalAdvancedHighScore", -8641861887771020491L);
        setLongField(term138327, term138327.getClass(), "totalExpertHighScore", 6610508350585809711L);
        setLongField(term138327, term138327.getClass(), "totalMasterHighScore", -8793140099009782071L);
        setIntField(term138439, term138439.getClass(), "year", 2024);
        setShortField(term138439, term138439.getClass(), "month", (short) 6);
        setShortField(term138439, term138439.getClass(), "day", (short) 27);
        setField(term138438, term138438.getClass(), "date", term138439);
        setByteField(term138443, term138443.getClass(), "hour", (byte) 5);
        setByteField(term138443, term138443.getClass(), "minute", (byte) 45);
        setByteField(term138443, term138443.getClass(), "second", (byte) 51);
        setIntField(term138443, term138443.getClass(), "nano", 363991868);
        setField(term138438, term138438.getClass(), "time", term138443);
        setField(term138327, term138327.getClass(), "eventWatchedDate", term138438);
        setIntField(term138327, term138327.getClass(), "friendCount", 1594802760);
        setBooleanField(term138327, term138327.getClass(), "isMaimai", false);
        setField(term138327, term138327.getClass(), "firstGameId", "leDgyXJudi");
        setField(term138327, term138327.getClass(), "firstRomVersion", "YgSDrWcUog");
        setField(term138327, term138327.getClass(), "firstDataVersion", "GnJMoyfrTK");
        setIntField(term138487, term138487.getClass(), "year", 2016);
        setShortField(term138487, term138487.getClass(), "month", (short) 5);
        setShortField(term138487, term138487.getClass(), "day", (short) 6);
        setField(term138486, term138486.getClass(), "date", term138487);
        setByteField(term138491, term138491.getClass(), "hour", (byte) 11);
        setByteField(term138491, term138491.getClass(), "minute", (byte) 4);
        setByteField(term138491, term138491.getClass(), "second", (byte) 34);
        setIntField(term138491, term138491.getClass(), "nano", 282282258);
        setField(term138486, term138486.getClass(), "time", term138491);
        setField(term138327, term138327.getClass(), "firstPlayDate", term138486);
        setField(term138327, term138327.getClass(), "lastGameId", "sDreXejQef");
        setField(term138327, term138327.getClass(), "lastRomVersion", "hKwivnVeCZ");
        setField(term138327, term138327.getClass(), "lastDataVersion", "fvxDfGibVS");
        setIntField(term138533, term138533.getClass(), "year", 2012);
        setShortField(term138533, term138533.getClass(), "month", (short) 5);
        setShortField(term138533, term138533.getClass(), "day", (short) 30);
        setField(term138532, term138532.getClass(), "date", term138533);
        setByteField(term138537, term138537.getClass(), "hour", (byte) 10);
        setByteField(term138537, term138537.getClass(), "minute", (byte) 28);
        setByteField(term138537, term138537.getClass(), "second", (byte) 24);
        setIntField(term138537, term138537.getClass(), "nano", 279576746);
        setField(term138532, term138532.getClass(), "time", term138537);
        setField(term138327, term138327.getClass(), "lastPlayDate", term138532);
        setIntField(term138327, term138327.getClass(), "lastPlaceId", -737020605);
        setField(term138327, term138327.getClass(), "lastPlaceName", "xlERWkGbKr");
        setField(term138327, term138327.getClass(), "lastRegionId", "QvJNEroCUL");
        setField(term138327, term138327.getClass(), "lastRegionName", "CpfLVqPiil");
        setField(term138327, term138327.getClass(), "lastAllNetId", "LmFOclAgbf");
        setField(term138327, term138327.getClass(), "lastClientId", "nYfzbXugsB");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCharacterId", argTypes, term138327, args);
    }

};


