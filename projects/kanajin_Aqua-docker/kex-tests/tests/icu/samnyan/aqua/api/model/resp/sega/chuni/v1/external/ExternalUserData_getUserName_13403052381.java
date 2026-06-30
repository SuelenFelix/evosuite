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

public class ExternalUserData_getUserName_13403052381 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term402;

    public ExternalUserData_getUserName_13403052381() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term402 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ExternalUserData"));
        Object term427 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term428 = newInstance(Class.forName("java.time.LocalDate"));
        Object term432 = newInstance(Class.forName("java.time.LocalTime"));
        Object term488 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term489 = newInstance(Class.forName("java.time.LocalDate"));
        Object term493 = newInstance(Class.forName("java.time.LocalTime"));
        Object term536 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term537 = newInstance(Class.forName("java.time.LocalDate"));
        Object term541 = newInstance(Class.forName("java.time.LocalTime"));
        Object term582 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term583 = newInstance(Class.forName("java.time.LocalDate"));
        Object term587 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term402, term402.getClass(), "accessCode", "aJlieCFVtF");
        setField(term402, term402.getClass(), "userName", "ZiaGIbnzTs");
        setIntField(term428, term428.getClass(), "year", 2022);
        setShortField(term428, term428.getClass(), "month", (short) 2);
        setShortField(term428, term428.getClass(), "day", (short) 26);
        setField(term427, term427.getClass(), "date", term428);
        setByteField(term432, term432.getClass(), "hour", (byte) 11);
        setByteField(term432, term432.getClass(), "minute", (byte) 42);
        setByteField(term432, term432.getClass(), "second", (byte) 15);
        setIntField(term432, term432.getClass(), "nano", 377731937);
        setField(term427, term427.getClass(), "time", term432);
        setField(term402, term402.getClass(), "lastLoginDate", term427);
        setBooleanField(term402, term402.getClass(), "isWebJoin", false);
        setField(term402, term402.getClass(), "webLimitDate", "tbcdzjIfER");
        setIntField(term402, term402.getClass(), "level", -6029667);
        setIntField(term402, term402.getClass(), "reincarnationNum", -2068769794);
        setField(term402, term402.getClass(), "exp", "HyxfbSQYBe");
        setLongField(term402, term402.getClass(), "point", 6811161968424632369L);
        setLongField(term402, term402.getClass(), "totalPoint", -7237588299778557629L);
        setIntField(term402, term402.getClass(), "playCount", -117576464);
        setIntField(term402, term402.getClass(), "multiPlayCount", -1007160944);
        setIntField(term402, term402.getClass(), "multiWinCount", 1135664017);
        setIntField(term402, term402.getClass(), "requestResCount", 590364439);
        setIntField(term402, term402.getClass(), "acceptResCount", 865208305);
        setIntField(term402, term402.getClass(), "successResCount", -1275173084);
        setIntField(term402, term402.getClass(), "playerRating", -244121226);
        setIntField(term402, term402.getClass(), "highestRating", -203030934);
        setIntField(term402, term402.getClass(), "nameplateId", -1179120542);
        setIntField(term402, term402.getClass(), "frameId", -73683645);
        setIntField(term402, term402.getClass(), "characterId", -226514366);
        setIntField(term402, term402.getClass(), "trophyId", 1193880199);
        setIntField(term402, term402.getClass(), "playedTutorialBit", -1087774327);
        setIntField(term402, term402.getClass(), "firstTutorialCancelNum", -1530420153);
        setIntField(term402, term402.getClass(), "masterTutorialCancelNum", -469968304);
        setIntField(term402, term402.getClass(), "totalRepertoireCount", -1145578966);
        setIntField(term402, term402.getClass(), "totalMapNum", 679763016);
        setLongField(term402, term402.getClass(), "totalHiScore", 6967924379644551255L);
        setLongField(term402, term402.getClass(), "totalBasicHighScore", -2813493605142626659L);
        setLongField(term402, term402.getClass(), "totalAdvancedHighScore", -8885298608300233488L);
        setLongField(term402, term402.getClass(), "totalExpertHighScore", -4325723315152823407L);
        setLongField(term402, term402.getClass(), "totalMasterHighScore", 2535595959091595249L);
        setIntField(term489, term489.getClass(), "year", 2026);
        setShortField(term489, term489.getClass(), "month", (short) 12);
        setShortField(term489, term489.getClass(), "day", (short) 14);
        setField(term488, term488.getClass(), "date", term489);
        setByteField(term493, term493.getClass(), "hour", (byte) 16);
        setByteField(term493, term493.getClass(), "minute", (byte) 34);
        setByteField(term493, term493.getClass(), "second", (byte) 9);
        setIntField(term493, term493.getClass(), "nano", 518326996);
        setField(term488, term488.getClass(), "time", term493);
        setField(term402, term402.getClass(), "eventWatchedDate", term488);
        setIntField(term402, term402.getClass(), "friendCount", 1962444399);
        setBooleanField(term402, term402.getClass(), "isMaimai", false);
        setField(term402, term402.getClass(), "firstGameId", "pCTimMblYc");
        setField(term402, term402.getClass(), "firstRomVersion", "hNxWaHcfhY");
        setField(term402, term402.getClass(), "firstDataVersion", "RkybSrpybU");
        setIntField(term537, term537.getClass(), "year", 2025);
        setShortField(term537, term537.getClass(), "month", (short) 4);
        setShortField(term537, term537.getClass(), "day", (short) 24);
        setField(term536, term536.getClass(), "date", term537);
        setByteField(term541, term541.getClass(), "hour", (byte) 18);
        setByteField(term541, term541.getClass(), "minute", (byte) 11);
        setByteField(term541, term541.getClass(), "second", (byte) 40);
        setIntField(term541, term541.getClass(), "nano", 137454929);
        setField(term536, term536.getClass(), "time", term541);
        setField(term402, term402.getClass(), "firstPlayDate", term536);
        setField(term402, term402.getClass(), "lastGameId", "xOEqzGAmDU");
        setField(term402, term402.getClass(), "lastRomVersion", "eZFUvlxvGV");
        setField(term402, term402.getClass(), "lastDataVersion", "BYqFIqCKAV");
        setIntField(term583, term583.getClass(), "year", 2024);
        setShortField(term583, term583.getClass(), "month", (short) 1);
        setShortField(term583, term583.getClass(), "day", (short) 24);
        setField(term582, term582.getClass(), "date", term583);
        setByteField(term587, term587.getClass(), "hour", (byte) 20);
        setByteField(term587, term587.getClass(), "minute", (byte) 28);
        setByteField(term587, term587.getClass(), "second", (byte) 39);
        setIntField(term587, term587.getClass(), "nano", 952728177);
        setField(term582, term582.getClass(), "time", term587);
        setField(term402, term402.getClass(), "lastPlayDate", term582);
        setIntField(term402, term402.getClass(), "lastPlaceId", 767834723);
        setField(term402, term402.getClass(), "lastPlaceName", "vrQLuWIDJX");
        setField(term402, term402.getClass(), "lastRegionId", "flxyYxBRtu");
        setField(term402, term402.getClass(), "lastRegionName", "OclPbYPkcH");
        setField(term402, term402.getClass(), "lastAllNetId", "IoAlmYsBwc");
        setField(term402, term402.getClass(), "lastClientId", "TEParAifyi");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserName", argTypes, term402, args);
    }

};


