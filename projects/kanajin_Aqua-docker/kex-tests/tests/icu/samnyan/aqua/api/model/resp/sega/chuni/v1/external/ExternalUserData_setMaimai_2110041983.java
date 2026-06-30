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
import java.lang.Boolean;

public class ExternalUserData_setMaimai_2110041983 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33448;
     Object term33699;

    public ExternalUserData_setMaimai_2110041983() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33448 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ExternalUserData"));
        Object term33473 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term33474 = newInstance(Class.forName("java.time.LocalDate"));
        Object term33478 = newInstance(Class.forName("java.time.LocalTime"));
        Object term33534 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term33535 = newInstance(Class.forName("java.time.LocalDate"));
        Object term33539 = newInstance(Class.forName("java.time.LocalTime"));
        Object term33582 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term33583 = newInstance(Class.forName("java.time.LocalDate"));
        Object term33587 = newInstance(Class.forName("java.time.LocalTime"));
        Object term33628 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term33629 = newInstance(Class.forName("java.time.LocalDate"));
        Object term33633 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term33448, term33448.getClass(), "accessCode", "FKDqHRpMcc");
        setField(term33448, term33448.getClass(), "userName", "mIRMQIxHUD");
        setIntField(term33474, term33474.getClass(), "year", 2019);
        setShortField(term33474, term33474.getClass(), "month", (short) 3);
        setShortField(term33474, term33474.getClass(), "day", (short) 23);
        setField(term33473, term33473.getClass(), "date", term33474);
        setByteField(term33478, term33478.getClass(), "hour", (byte) 13);
        setByteField(term33478, term33478.getClass(), "minute", (byte) 19);
        setByteField(term33478, term33478.getClass(), "second", (byte) 44);
        setIntField(term33478, term33478.getClass(), "nano", 912714703);
        setField(term33473, term33473.getClass(), "time", term33478);
        setField(term33448, term33448.getClass(), "lastLoginDate", term33473);
        setBooleanField(term33448, term33448.getClass(), "isWebJoin", true);
        setField(term33448, term33448.getClass(), "webLimitDate", "FbBMtntDbw");
        setIntField(term33448, term33448.getClass(), "level", 1922068039);
        setIntField(term33448, term33448.getClass(), "reincarnationNum", -410564443);
        setField(term33448, term33448.getClass(), "exp", "zRnpRGaHlI");
        setLongField(term33448, term33448.getClass(), "point", -7006877527579112761L);
        setLongField(term33448, term33448.getClass(), "totalPoint", -8699693633047465617L);
        setIntField(term33448, term33448.getClass(), "playCount", 996017434);
        setIntField(term33448, term33448.getClass(), "multiPlayCount", -983870300);
        setIntField(term33448, term33448.getClass(), "multiWinCount", 360715062);
        setIntField(term33448, term33448.getClass(), "requestResCount", 1047409266);
        setIntField(term33448, term33448.getClass(), "acceptResCount", 1427248961);
        setIntField(term33448, term33448.getClass(), "successResCount", 1445291866);
        setIntField(term33448, term33448.getClass(), "playerRating", -139927812);
        setIntField(term33448, term33448.getClass(), "highestRating", -2065157320);
        setIntField(term33448, term33448.getClass(), "nameplateId", 1782011477);
        setIntField(term33448, term33448.getClass(), "frameId", 2129957018);
        setIntField(term33448, term33448.getClass(), "characterId", 691663312);
        setIntField(term33448, term33448.getClass(), "trophyId", -1236696275);
        setIntField(term33448, term33448.getClass(), "playedTutorialBit", 575249858);
        setIntField(term33448, term33448.getClass(), "firstTutorialCancelNum", -297957951);
        setIntField(term33448, term33448.getClass(), "masterTutorialCancelNum", -1816920588);
        setIntField(term33448, term33448.getClass(), "totalRepertoireCount", 1674165862);
        setIntField(term33448, term33448.getClass(), "totalMapNum", 1875252647);
        setLongField(term33448, term33448.getClass(), "totalHiScore", -590890905395927244L);
        setLongField(term33448, term33448.getClass(), "totalBasicHighScore", 6978548804004471804L);
        setLongField(term33448, term33448.getClass(), "totalAdvancedHighScore", -8957441653116712448L);
        setLongField(term33448, term33448.getClass(), "totalExpertHighScore", -5761087225966065493L);
        setLongField(term33448, term33448.getClass(), "totalMasterHighScore", 493557348274366095L);
        setIntField(term33535, term33535.getClass(), "year", 2027);
        setShortField(term33535, term33535.getClass(), "month", (short) 3);
        setShortField(term33535, term33535.getClass(), "day", (short) 4);
        setField(term33534, term33534.getClass(), "date", term33535);
        setByteField(term33539, term33539.getClass(), "hour", (byte) 2);
        setByteField(term33539, term33539.getClass(), "minute", (byte) 3);
        setByteField(term33539, term33539.getClass(), "second", (byte) 31);
        setIntField(term33539, term33539.getClass(), "nano", 652064220);
        setField(term33534, term33534.getClass(), "time", term33539);
        setField(term33448, term33448.getClass(), "eventWatchedDate", term33534);
        setIntField(term33448, term33448.getClass(), "friendCount", -1298688401);
        setBooleanField(term33448, term33448.getClass(), "isMaimai", true);
        setField(term33448, term33448.getClass(), "firstGameId", "dVHfxjbMRK");
        setField(term33448, term33448.getClass(), "firstRomVersion", "LzwyLxKJpw");
        setField(term33448, term33448.getClass(), "firstDataVersion", "ZhWJlplAVK");
        setIntField(term33583, term33583.getClass(), "year", 2023);
        setShortField(term33583, term33583.getClass(), "month", (short) 12);
        setShortField(term33583, term33583.getClass(), "day", (short) 3);
        setField(term33582, term33582.getClass(), "date", term33583);
        setByteField(term33587, term33587.getClass(), "hour", (byte) 14);
        setByteField(term33587, term33587.getClass(), "minute", (byte) 6);
        setByteField(term33587, term33587.getClass(), "second", (byte) 20);
        setIntField(term33587, term33587.getClass(), "nano", 660325634);
        setField(term33582, term33582.getClass(), "time", term33587);
        setField(term33448, term33448.getClass(), "firstPlayDate", term33582);
        setField(term33448, term33448.getClass(), "lastGameId", "pnmjTuTojv");
        setField(term33448, term33448.getClass(), "lastRomVersion", "eMtshhmGEm");
        setField(term33448, term33448.getClass(), "lastDataVersion", "VJUbzHGOvg");
        setIntField(term33629, term33629.getClass(), "year", 2019);
        setShortField(term33629, term33629.getClass(), "month", (short) 2);
        setShortField(term33629, term33629.getClass(), "day", (short) 13);
        setField(term33628, term33628.getClass(), "date", term33629);
        setByteField(term33633, term33633.getClass(), "hour", (byte) 5);
        setByteField(term33633, term33633.getClass(), "minute", (byte) 59);
        setByteField(term33633, term33633.getClass(), "second", (byte) 42);
        setIntField(term33633, term33633.getClass(), "nano", 720385556);
        setField(term33628, term33628.getClass(), "time", term33633);
        setField(term33448, term33448.getClass(), "lastPlayDate", term33628);
        setIntField(term33448, term33448.getClass(), "lastPlaceId", 1907832341);
        setField(term33448, term33448.getClass(), "lastPlaceName", "SiwcigIrfD");
        setField(term33448, term33448.getClass(), "lastRegionId", "MFIdGVLoDo");
        setField(term33448, term33448.getClass(), "lastRegionName", "kbxgTcnXyU");
        setField(term33448, term33448.getClass(), "lastAllNetId", "lnJvDbbuwo");
        setField(term33448, term33448.getClass(), "lastClientId", "KExnWkKGvF");
        term33699 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term33699;
        callMethod(klass, "setMaimai", argTypes, term33448, args);
    }

};


