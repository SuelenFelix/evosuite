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

public class ExternalUserData_getLastGameId_191139740639 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15640;

    public ExternalUserData_getLastGameId_191139740639() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15640 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData"));
        Object term15665 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term15666 = newInstance(Class.forName("java.time.LocalDate"));
        Object term15670 = newInstance(Class.forName("java.time.LocalTime"));
        Object term15726 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term15727 = newInstance(Class.forName("java.time.LocalDate"));
        Object term15731 = newInstance(Class.forName("java.time.LocalTime"));
        Object term15774 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term15775 = newInstance(Class.forName("java.time.LocalDate"));
        Object term15779 = newInstance(Class.forName("java.time.LocalTime"));
        Object term15820 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term15821 = newInstance(Class.forName("java.time.LocalDate"));
        Object term15825 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term15640, term15640.getClass(), "accessCode", "EWFbEDAVrE");
        setField(term15640, term15640.getClass(), "userName", "EMiMtYgfvr");
        setIntField(term15666, term15666.getClass(), "year", 2020);
        setShortField(term15666, term15666.getClass(), "month", (short) 5);
        setShortField(term15666, term15666.getClass(), "day", (short) 12);
        setField(term15665, term15665.getClass(), "date", term15666);
        setByteField(term15670, term15670.getClass(), "hour", (byte) 22);
        setByteField(term15670, term15670.getClass(), "minute", (byte) 7);
        setByteField(term15670, term15670.getClass(), "second", (byte) 49);
        setIntField(term15670, term15670.getClass(), "nano", 677355362);
        setField(term15665, term15665.getClass(), "time", term15670);
        setField(term15640, term15640.getClass(), "lastLoginDate", term15665);
        setBooleanField(term15640, term15640.getClass(), "isWebJoin", false);
        setField(term15640, term15640.getClass(), "webLimitDate", "OyYyYYnJuF");
        setIntField(term15640, term15640.getClass(), "level", -642716895);
        setIntField(term15640, term15640.getClass(), "reincarnationNum", 1743398246);
        setField(term15640, term15640.getClass(), "exp", "aYLvcxZohT");
        setLongField(term15640, term15640.getClass(), "point", -5460517064177800852L);
        setLongField(term15640, term15640.getClass(), "totalPoint", -5242567610844514867L);
        setIntField(term15640, term15640.getClass(), "playCount", -934658823);
        setIntField(term15640, term15640.getClass(), "multiPlayCount", 1632177303);
        setIntField(term15640, term15640.getClass(), "multiWinCount", -802592348);
        setIntField(term15640, term15640.getClass(), "requestResCount", -1576584269);
        setIntField(term15640, term15640.getClass(), "acceptResCount", 1474899591);
        setIntField(term15640, term15640.getClass(), "successResCount", 297582552);
        setIntField(term15640, term15640.getClass(), "playerRating", -1485916498);
        setIntField(term15640, term15640.getClass(), "highestRating", 722787672);
        setIntField(term15640, term15640.getClass(), "nameplateId", 2077491675);
        setIntField(term15640, term15640.getClass(), "frameId", -1728316609);
        setIntField(term15640, term15640.getClass(), "characterId", 47118909);
        setIntField(term15640, term15640.getClass(), "trophyId", -2093707412);
        setIntField(term15640, term15640.getClass(), "playedTutorialBit", -680627153);
        setIntField(term15640, term15640.getClass(), "firstTutorialCancelNum", 722519669);
        setIntField(term15640, term15640.getClass(), "masterTutorialCancelNum", -40335961);
        setIntField(term15640, term15640.getClass(), "totalRepertoireCount", 175343605);
        setIntField(term15640, term15640.getClass(), "totalMapNum", 1050853183);
        setLongField(term15640, term15640.getClass(), "totalHiScore", -2951854704066477061L);
        setLongField(term15640, term15640.getClass(), "totalBasicHighScore", 174253963298276221L);
        setLongField(term15640, term15640.getClass(), "totalAdvancedHighScore", 3713624957161771816L);
        setLongField(term15640, term15640.getClass(), "totalExpertHighScore", 6130232388739280211L);
        setLongField(term15640, term15640.getClass(), "totalMasterHighScore", 3423965054378869855L);
        setIntField(term15727, term15727.getClass(), "year", 2010);
        setShortField(term15727, term15727.getClass(), "month", (short) 11);
        setShortField(term15727, term15727.getClass(), "day", (short) 1);
        setField(term15726, term15726.getClass(), "date", term15727);
        setByteField(term15731, term15731.getClass(), "hour", (byte) 5);
        setByteField(term15731, term15731.getClass(), "minute", (byte) 32);
        setByteField(term15731, term15731.getClass(), "second", (byte) 8);
        setIntField(term15731, term15731.getClass(), "nano", 918832231);
        setField(term15726, term15726.getClass(), "time", term15731);
        setField(term15640, term15640.getClass(), "eventWatchedDate", term15726);
        setIntField(term15640, term15640.getClass(), "friendCount", 848428785);
        setBooleanField(term15640, term15640.getClass(), "isMaimai", true);
        setField(term15640, term15640.getClass(), "firstGameId", "mnHyQbMyld");
        setField(term15640, term15640.getClass(), "firstRomVersion", "KHtaDOIcJZ");
        setField(term15640, term15640.getClass(), "firstDataVersion", "vgdwrCZczl");
        setIntField(term15775, term15775.getClass(), "year", 2026);
        setShortField(term15775, term15775.getClass(), "month", (short) 2);
        setShortField(term15775, term15775.getClass(), "day", (short) 5);
        setField(term15774, term15774.getClass(), "date", term15775);
        setByteField(term15779, term15779.getClass(), "hour", (byte) 1);
        setByteField(term15779, term15779.getClass(), "minute", (byte) 38);
        setByteField(term15779, term15779.getClass(), "second", (byte) 15);
        setIntField(term15779, term15779.getClass(), "nano", 167345230);
        setField(term15774, term15774.getClass(), "time", term15779);
        setField(term15640, term15640.getClass(), "firstPlayDate", term15774);
        setField(term15640, term15640.getClass(), "lastGameId", "gKMNrpKBpu");
        setField(term15640, term15640.getClass(), "lastRomVersion", "ZbHJVEqcoa");
        setField(term15640, term15640.getClass(), "lastDataVersion", "awDQVEVIKi");
        setIntField(term15821, term15821.getClass(), "year", 2029);
        setShortField(term15821, term15821.getClass(), "month", (short) 6);
        setShortField(term15821, term15821.getClass(), "day", (short) 4);
        setField(term15820, term15820.getClass(), "date", term15821);
        setByteField(term15825, term15825.getClass(), "hour", (byte) 22);
        setByteField(term15825, term15825.getClass(), "minute", (byte) 1);
        setByteField(term15825, term15825.getClass(), "second", (byte) 38);
        setIntField(term15825, term15825.getClass(), "nano", 329228491);
        setField(term15820, term15820.getClass(), "time", term15825);
        setField(term15640, term15640.getClass(), "lastPlayDate", term15820);
        setIntField(term15640, term15640.getClass(), "lastPlaceId", -1984436481);
        setField(term15640, term15640.getClass(), "lastPlaceName", "HJwNgUzZZR");
        setField(term15640, term15640.getClass(), "lastRegionId", "FvUCZgTXhq");
        setField(term15640, term15640.getClass(), "lastRegionName", "wWWidPCHzx");
        setField(term15640, term15640.getClass(), "lastAllNetId", "OwPIiBRuKK");
        setField(term15640, term15640.getClass(), "lastClientId", "sgfGySMODT");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastGameId", argTypes, term15640, args);
    }

};


