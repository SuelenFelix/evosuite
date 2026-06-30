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
import java.lang.Integer;

public class UserDuel_setDuelId_26567527214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81509;
     Object term81805;

    public UserDuel_setDuelId_26567527214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term81515 = new Long(5381386339318883012L);
        term81509 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserDuel"));
        Object term81511 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term81513 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term81529 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term81530 = newInstance(Class.forName("java.time.LocalDate"));
        Object term81534 = newInstance(Class.forName("java.time.LocalTime"));
        Object term81539 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term81540 = newInstance(Class.forName("java.time.LocalDate"));
        Object term81544 = newInstance(Class.forName("java.time.LocalTime"));
        Object term81561 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term81562 = newInstance(Class.forName("java.time.LocalDate"));
        Object term81566 = newInstance(Class.forName("java.time.LocalTime"));
        Object term81622 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term81623 = newInstance(Class.forName("java.time.LocalDate"));
        Object term81627 = newInstance(Class.forName("java.time.LocalTime"));
        Object term81670 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term81671 = newInstance(Class.forName("java.time.LocalDate"));
        Object term81675 = newInstance(Class.forName("java.time.LocalTime"));
        Object term81716 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term81717 = newInstance(Class.forName("java.time.LocalDate"));
        Object term81721 = newInstance(Class.forName("java.time.LocalTime"));
        Object term81791 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term81792 = newInstance(Class.forName("java.time.LocalDate"));
        Object term81796 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term81509, term81509.getClass(), "id", 4601901314293570056L);
        setLongField(term81511, term81511.getClass(), "id", 3811147117668167855L);
        setLongField(term81513, term81513.getClass(), "id", -5397349204553241395L);
        setField(term81513, term81513.getClass(), "extId", term81515);
        setField(term81513, term81513.getClass(), "luid", "OYJvKAMFEk");
        setIntField(term81530, term81530.getClass(), "year", 2029);
        setShortField(term81530, term81530.getClass(), "month", (short) 10);
        setShortField(term81530, term81530.getClass(), "day", (short) 28);
        setField(term81529, term81529.getClass(), "date", term81530);
        setByteField(term81534, term81534.getClass(), "hour", (byte) 3);
        setByteField(term81534, term81534.getClass(), "minute", (byte) 8);
        setByteField(term81534, term81534.getClass(), "second", (byte) 59);
        setIntField(term81534, term81534.getClass(), "nano", 94100073);
        setField(term81529, term81529.getClass(), "time", term81534);
        setField(term81513, term81513.getClass(), "registerTime", term81529);
        setIntField(term81540, term81540.getClass(), "year", 2012);
        setShortField(term81540, term81540.getClass(), "month", (short) 5);
        setShortField(term81540, term81540.getClass(), "day", (short) 5);
        setField(term81539, term81539.getClass(), "date", term81540);
        setByteField(term81544, term81544.getClass(), "hour", (byte) 9);
        setByteField(term81544, term81544.getClass(), "minute", (byte) 8);
        setByteField(term81544, term81544.getClass(), "second", (byte) 40);
        setIntField(term81544, term81544.getClass(), "nano", 919436445);
        setField(term81539, term81539.getClass(), "time", term81544);
        setField(term81513, term81513.getClass(), "accessTime", term81539);
        setField(term81511, term81511.getClass(), "card", term81513);
        setField(term81511, term81511.getClass(), "userName", "puNAveVBkA");
        setIntField(term81562, term81562.getClass(), "year", 2015);
        setShortField(term81562, term81562.getClass(), "month", (short) 11);
        setShortField(term81562, term81562.getClass(), "day", (short) 3);
        setField(term81561, term81561.getClass(), "date", term81562);
        setByteField(term81566, term81566.getClass(), "hour", (byte) 5);
        setByteField(term81566, term81566.getClass(), "minute", (byte) 27);
        setByteField(term81566, term81566.getClass(), "second", (byte) 14);
        setIntField(term81566, term81566.getClass(), "nano", 150694068);
        setField(term81561, term81561.getClass(), "time", term81566);
        setField(term81511, term81511.getClass(), "lastLoginDate", term81561);
        setBooleanField(term81511, term81511.getClass(), "isWebJoin", true);
        setField(term81511, term81511.getClass(), "webLimitDate", "BcZKUIbuQL");
        setIntField(term81511, term81511.getClass(), "level", -1998048906);
        setIntField(term81511, term81511.getClass(), "reincarnationNum", -1915332852);
        setField(term81511, term81511.getClass(), "exp", "YvjPnZyRnw");
        setLongField(term81511, term81511.getClass(), "point", -5533270660427460254L);
        setLongField(term81511, term81511.getClass(), "totalPoint", 6870806673850570339L);
        setIntField(term81511, term81511.getClass(), "playCount", 1603272771);
        setIntField(term81511, term81511.getClass(), "multiPlayCount", -1169796605);
        setIntField(term81511, term81511.getClass(), "multiWinCount", 1294129760);
        setIntField(term81511, term81511.getClass(), "requestResCount", -1042003821);
        setIntField(term81511, term81511.getClass(), "acceptResCount", 1800189572);
        setIntField(term81511, term81511.getClass(), "successResCount", -555300889);
        setIntField(term81511, term81511.getClass(), "playerRating", -319938895);
        setIntField(term81511, term81511.getClass(), "highestRating", -529078248);
        setIntField(term81511, term81511.getClass(), "nameplateId", 2125754107);
        setIntField(term81511, term81511.getClass(), "frameId", 1094413748);
        setIntField(term81511, term81511.getClass(), "characterId", 1697340530);
        setIntField(term81511, term81511.getClass(), "trophyId", 2037702914);
        setIntField(term81511, term81511.getClass(), "playedTutorialBit", 540968254);
        setIntField(term81511, term81511.getClass(), "firstTutorialCancelNum", 1166539646);
        setIntField(term81511, term81511.getClass(), "masterTutorialCancelNum", 1055557164);
        setIntField(term81511, term81511.getClass(), "totalRepertoireCount", -1601763818);
        setIntField(term81511, term81511.getClass(), "totalMapNum", 562192186);
        setLongField(term81511, term81511.getClass(), "totalHiScore", -2212129370801839337L);
        setLongField(term81511, term81511.getClass(), "totalBasicHighScore", 5474646196659258873L);
        setLongField(term81511, term81511.getClass(), "totalAdvancedHighScore", -4693282265818959742L);
        setLongField(term81511, term81511.getClass(), "totalExpertHighScore", -3969214906313119862L);
        setLongField(term81511, term81511.getClass(), "totalMasterHighScore", 8375905579419331860L);
        setIntField(term81623, term81623.getClass(), "year", 2023);
        setShortField(term81623, term81623.getClass(), "month", (short) 3);
        setShortField(term81623, term81623.getClass(), "day", (short) 15);
        setField(term81622, term81622.getClass(), "date", term81623);
        setByteField(term81627, term81627.getClass(), "hour", (byte) 9);
        setByteField(term81627, term81627.getClass(), "minute", (byte) 10);
        setByteField(term81627, term81627.getClass(), "second", (byte) 38);
        setIntField(term81627, term81627.getClass(), "nano", 695302180);
        setField(term81622, term81622.getClass(), "time", term81627);
        setField(term81511, term81511.getClass(), "eventWatchedDate", term81622);
        setIntField(term81511, term81511.getClass(), "friendCount", -904648920);
        setBooleanField(term81511, term81511.getClass(), "isMaimai", true);
        setField(term81511, term81511.getClass(), "firstGameId", "IKmMfqFPku");
        setField(term81511, term81511.getClass(), "firstRomVersion", "NACnGDmVPl");
        setField(term81511, term81511.getClass(), "firstDataVersion", "SfWiFjkLGW");
        setIntField(term81671, term81671.getClass(), "year", 2019);
        setShortField(term81671, term81671.getClass(), "month", (short) 12);
        setShortField(term81671, term81671.getClass(), "day", (short) 29);
        setField(term81670, term81670.getClass(), "date", term81671);
        setByteField(term81675, term81675.getClass(), "hour", (byte) 19);
        setByteField(term81675, term81675.getClass(), "minute", (byte) 43);
        setByteField(term81675, term81675.getClass(), "second", (byte) 47);
        setIntField(term81675, term81675.getClass(), "nano", 957440346);
        setField(term81670, term81670.getClass(), "time", term81675);
        setField(term81511, term81511.getClass(), "firstPlayDate", term81670);
        setField(term81511, term81511.getClass(), "lastGameId", "urBahuOkUQ");
        setField(term81511, term81511.getClass(), "lastRomVersion", "zHcZrTMdOT");
        setField(term81511, term81511.getClass(), "lastDataVersion", "zIAIXHeKXt");
        setIntField(term81717, term81717.getClass(), "year", 2014);
        setShortField(term81717, term81717.getClass(), "month", (short) 3);
        setShortField(term81717, term81717.getClass(), "day", (short) 6);
        setField(term81716, term81716.getClass(), "date", term81717);
        setByteField(term81721, term81721.getClass(), "hour", (byte) 3);
        setByteField(term81721, term81721.getClass(), "minute", (byte) 21);
        setByteField(term81721, term81721.getClass(), "second", (byte) 53);
        setIntField(term81721, term81721.getClass(), "nano", 978038024);
        setField(term81716, term81716.getClass(), "time", term81721);
        setField(term81511, term81511.getClass(), "lastPlayDate", term81716);
        setIntField(term81511, term81511.getClass(), "lastPlaceId", -457236509);
        setField(term81511, term81511.getClass(), "lastPlaceName", "fVkSkOqFEO");
        setField(term81511, term81511.getClass(), "lastRegionId", "DLfgyAqDDu");
        setField(term81511, term81511.getClass(), "lastRegionName", "ryuQaXtwNj");
        setField(term81511, term81511.getClass(), "lastAllNetId", "OutjKNDSgR");
        setField(term81511, term81511.getClass(), "lastClientId", "brfLLGXcwA");
        setField(term81509, term81509.getClass(), "user", term81511);
        setIntField(term81509, term81509.getClass(), "duelId", 1719352674);
        setIntField(term81509, term81509.getClass(), "progress", 1551152450);
        setIntField(term81509, term81509.getClass(), "point", -1821029149);
        setBooleanField(term81509, term81509.getClass(), "isClear", false);
        setIntField(term81792, term81792.getClass(), "year", 2013);
        setShortField(term81792, term81792.getClass(), "month", (short) 5);
        setShortField(term81792, term81792.getClass(), "day", (short) 10);
        setField(term81791, term81791.getClass(), "date", term81792);
        setByteField(term81796, term81796.getClass(), "hour", (byte) 8);
        setByteField(term81796, term81796.getClass(), "minute", (byte) 51);
        setByteField(term81796, term81796.getClass(), "second", (byte) 38);
        setIntField(term81796, term81796.getClass(), "nano", 326978944);
        setField(term81791, term81791.getClass(), "time", term81796);
        setField(term81509, term81509.getClass(), "lastPlayDate", term81791);
        setIntField(term81509, term81509.getClass(), "param1", -1120692414);
        setIntField(term81509, term81509.getClass(), "param2", 630179419);
        setIntField(term81509, term81509.getClass(), "param3", -1314338966);
        setIntField(term81509, term81509.getClass(), "param4", 632003573);
        term81805 = new Integer(253586199);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserDuel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term81805;
        callMethod(klass, "setDuelId", argTypes, term81509, args);
    }

};


