package icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external;

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
import static icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ExternalUserData_setLastClientId_207468833297 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39306;

    public ExternalUserData_setLastClientId_207468833297() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39306 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ExternalUserData"));
        Object term39331 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term39332 = newInstance(Class.forName("java.time.LocalDate"));
        Object term39336 = newInstance(Class.forName("java.time.LocalTime"));
        Object term39392 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term39393 = newInstance(Class.forName("java.time.LocalDate"));
        Object term39397 = newInstance(Class.forName("java.time.LocalTime"));
        Object term39440 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term39441 = newInstance(Class.forName("java.time.LocalDate"));
        Object term39445 = newInstance(Class.forName("java.time.LocalTime"));
        Object term39486 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term39487 = newInstance(Class.forName("java.time.LocalDate"));
        Object term39491 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term39306, term39306.getClass(), "accessCode", "yqEphNxUPZ");
        setField(term39306, term39306.getClass(), "userName", "mJJxTuZuKO");
        setIntField(term39332, term39332.getClass(), "year", 2025);
        setShortField(term39332, term39332.getClass(), "month", (short) 9);
        setShortField(term39332, term39332.getClass(), "day", (short) 5);
        setField(term39331, term39331.getClass(), "date", term39332);
        setByteField(term39336, term39336.getClass(), "hour", (byte) 11);
        setByteField(term39336, term39336.getClass(), "minute", (byte) 59);
        setByteField(term39336, term39336.getClass(), "second", (byte) 37);
        setIntField(term39336, term39336.getClass(), "nano", 93740487);
        setField(term39331, term39331.getClass(), "time", term39336);
        setField(term39306, term39306.getClass(), "lastLoginDate", term39331);
        setBooleanField(term39306, term39306.getClass(), "isWebJoin", false);
        setField(term39306, term39306.getClass(), "webLimitDate", "anSZCikKpS");
        setIntField(term39306, term39306.getClass(), "level", -438794741);
        setIntField(term39306, term39306.getClass(), "reincarnationNum", -1400834481);
        setField(term39306, term39306.getClass(), "exp", "zvMQGbTtsV");
        setLongField(term39306, term39306.getClass(), "point", 1924411240174876881L);
        setLongField(term39306, term39306.getClass(), "totalPoint", -8287954071414913487L);
        setIntField(term39306, term39306.getClass(), "playCount", 957091706);
        setIntField(term39306, term39306.getClass(), "multiPlayCount", -2011802805);
        setIntField(term39306, term39306.getClass(), "multiWinCount", -1683802689);
        setIntField(term39306, term39306.getClass(), "requestResCount", -1949346221);
        setIntField(term39306, term39306.getClass(), "acceptResCount", 831638391);
        setIntField(term39306, term39306.getClass(), "successResCount", -1184374392);
        setIntField(term39306, term39306.getClass(), "playerRating", -758870402);
        setIntField(term39306, term39306.getClass(), "highestRating", 72767889);
        setIntField(term39306, term39306.getClass(), "nameplateId", 1699515029);
        setIntField(term39306, term39306.getClass(), "frameId", 673153263);
        setIntField(term39306, term39306.getClass(), "characterId", -1355715967);
        setIntField(term39306, term39306.getClass(), "trophyId", -972516789);
        setIntField(term39306, term39306.getClass(), "playedTutorialBit", 720077443);
        setIntField(term39306, term39306.getClass(), "firstTutorialCancelNum", -884523977);
        setIntField(term39306, term39306.getClass(), "masterTutorialCancelNum", -1396233580);
        setIntField(term39306, term39306.getClass(), "totalRepertoireCount", -654234892);
        setIntField(term39306, term39306.getClass(), "totalMapNum", -50930731);
        setLongField(term39306, term39306.getClass(), "totalHiScore", -1379663556617181551L);
        setLongField(term39306, term39306.getClass(), "totalBasicHighScore", -927624000067769617L);
        setLongField(term39306, term39306.getClass(), "totalAdvancedHighScore", 2978561187278004830L);
        setLongField(term39306, term39306.getClass(), "totalExpertHighScore", 4903104596895674146L);
        setLongField(term39306, term39306.getClass(), "totalMasterHighScore", 3410093279424884335L);
        setIntField(term39393, term39393.getClass(), "year", 2028);
        setShortField(term39393, term39393.getClass(), "month", (short) 12);
        setShortField(term39393, term39393.getClass(), "day", (short) 28);
        setField(term39392, term39392.getClass(), "date", term39393);
        setByteField(term39397, term39397.getClass(), "hour", (byte) 11);
        setByteField(term39397, term39397.getClass(), "minute", (byte) 37);
        setByteField(term39397, term39397.getClass(), "second", (byte) 0);
        setIntField(term39397, term39397.getClass(), "nano", 315383282);
        setField(term39392, term39392.getClass(), "time", term39397);
        setField(term39306, term39306.getClass(), "eventWatchedDate", term39392);
        setIntField(term39306, term39306.getClass(), "friendCount", -1067876039);
        setBooleanField(term39306, term39306.getClass(), "isMaimai", true);
        setField(term39306, term39306.getClass(), "firstGameId", "DyUuIDzZPG");
        setField(term39306, term39306.getClass(), "firstRomVersion", "EGQLusEtRN");
        setField(term39306, term39306.getClass(), "firstDataVersion", "GwGUMPdvZq");
        setIntField(term39441, term39441.getClass(), "year", 2029);
        setShortField(term39441, term39441.getClass(), "month", (short) 10);
        setShortField(term39441, term39441.getClass(), "day", (short) 12);
        setField(term39440, term39440.getClass(), "date", term39441);
        setByteField(term39445, term39445.getClass(), "hour", (byte) 12);
        setByteField(term39445, term39445.getClass(), "minute", (byte) 8);
        setByteField(term39445, term39445.getClass(), "second", (byte) 27);
        setIntField(term39445, term39445.getClass(), "nano", 729635487);
        setField(term39440, term39440.getClass(), "time", term39445);
        setField(term39306, term39306.getClass(), "firstPlayDate", term39440);
        setField(term39306, term39306.getClass(), "lastGameId", "iXRAYcFyfS");
        setField(term39306, term39306.getClass(), "lastRomVersion", "lokyclbLEz");
        setField(term39306, term39306.getClass(), "lastDataVersion", "hAPmQGaxkI");
        setIntField(term39487, term39487.getClass(), "year", 2015);
        setShortField(term39487, term39487.getClass(), "month", (short) 3);
        setShortField(term39487, term39487.getClass(), "day", (short) 29);
        setField(term39486, term39486.getClass(), "date", term39487);
        setByteField(term39491, term39491.getClass(), "hour", (byte) 23);
        setByteField(term39491, term39491.getClass(), "minute", (byte) 1);
        setByteField(term39491, term39491.getClass(), "second", (byte) 57);
        setIntField(term39491, term39491.getClass(), "nano", 425020447);
        setField(term39486, term39486.getClass(), "time", term39491);
        setField(term39306, term39306.getClass(), "lastPlayDate", term39486);
        setIntField(term39306, term39306.getClass(), "lastPlaceId", -1143749623);
        setField(term39306, term39306.getClass(), "lastPlaceName", "ojrnLnJZjT");
        setField(term39306, term39306.getClass(), "lastRegionId", "rtvXSMjOdJ");
        setField(term39306, term39306.getClass(), "lastRegionName", "EDkfjuDpNv");
        setField(term39306, term39306.getClass(), "lastAllNetId", "LNHkTUfuHX");
        setField(term39306, term39306.getClass(), "lastClientId", "SVWcOAHiTp");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "oShLCaneoQ";
        callMethod(klass, "setLastClientId", argTypes, term39306, args);
    }

};


