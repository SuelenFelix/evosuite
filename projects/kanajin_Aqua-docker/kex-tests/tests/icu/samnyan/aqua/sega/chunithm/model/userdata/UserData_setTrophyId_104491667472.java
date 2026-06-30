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

public class UserData_setTrophyId_104491667472 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term160209;
     Object term160485;

    public UserData_setTrophyId_104491667472() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term160213 = new Long(6465987664600701876L);
        term160209 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term160211 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term160227 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term160228 = newInstance(Class.forName("java.time.LocalDate"));
        Object term160232 = newInstance(Class.forName("java.time.LocalTime"));
        Object term160237 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term160238 = newInstance(Class.forName("java.time.LocalDate"));
        Object term160242 = newInstance(Class.forName("java.time.LocalTime"));
        Object term160259 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term160260 = newInstance(Class.forName("java.time.LocalDate"));
        Object term160264 = newInstance(Class.forName("java.time.LocalTime"));
        Object term160320 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term160321 = newInstance(Class.forName("java.time.LocalDate"));
        Object term160325 = newInstance(Class.forName("java.time.LocalTime"));
        Object term160368 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term160369 = newInstance(Class.forName("java.time.LocalDate"));
        Object term160373 = newInstance(Class.forName("java.time.LocalTime"));
        Object term160414 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term160415 = newInstance(Class.forName("java.time.LocalDate"));
        Object term160419 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term160209, term160209.getClass(), "id", -1575737126982353837L);
        setLongField(term160211, term160211.getClass(), "id", 6494928659054318901L);
        setField(term160211, term160211.getClass(), "extId", term160213);
        setField(term160211, term160211.getClass(), "luid", "lZNePPEWLC");
        setIntField(term160228, term160228.getClass(), "year", 2018);
        setShortField(term160228, term160228.getClass(), "month", (short) 2);
        setShortField(term160228, term160228.getClass(), "day", (short) 26);
        setField(term160227, term160227.getClass(), "date", term160228);
        setByteField(term160232, term160232.getClass(), "hour", (byte) 21);
        setByteField(term160232, term160232.getClass(), "minute", (byte) 42);
        setByteField(term160232, term160232.getClass(), "second", (byte) 35);
        setIntField(term160232, term160232.getClass(), "nano", 871916842);
        setField(term160227, term160227.getClass(), "time", term160232);
        setField(term160211, term160211.getClass(), "registerTime", term160227);
        setIntField(term160238, term160238.getClass(), "year", 2015);
        setShortField(term160238, term160238.getClass(), "month", (short) 6);
        setShortField(term160238, term160238.getClass(), "day", (short) 14);
        setField(term160237, term160237.getClass(), "date", term160238);
        setByteField(term160242, term160242.getClass(), "hour", (byte) 10);
        setByteField(term160242, term160242.getClass(), "minute", (byte) 27);
        setByteField(term160242, term160242.getClass(), "second", (byte) 54);
        setIntField(term160242, term160242.getClass(), "nano", 839570751);
        setField(term160237, term160237.getClass(), "time", term160242);
        setField(term160211, term160211.getClass(), "accessTime", term160237);
        setField(term160209, term160209.getClass(), "card", term160211);
        setField(term160209, term160209.getClass(), "userName", "XyvyWBkpUr");
        setIntField(term160260, term160260.getClass(), "year", 2019);
        setShortField(term160260, term160260.getClass(), "month", (short) 4);
        setShortField(term160260, term160260.getClass(), "day", (short) 23);
        setField(term160259, term160259.getClass(), "date", term160260);
        setByteField(term160264, term160264.getClass(), "hour", (byte) 0);
        setByteField(term160264, term160264.getClass(), "minute", (byte) 47);
        setByteField(term160264, term160264.getClass(), "second", (byte) 16);
        setIntField(term160264, term160264.getClass(), "nano", 11949481);
        setField(term160259, term160259.getClass(), "time", term160264);
        setField(term160209, term160209.getClass(), "lastLoginDate", term160259);
        setBooleanField(term160209, term160209.getClass(), "isWebJoin", false);
        setField(term160209, term160209.getClass(), "webLimitDate", "AuUQylJqWv");
        setIntField(term160209, term160209.getClass(), "level", -812267058);
        setIntField(term160209, term160209.getClass(), "reincarnationNum", 1394307839);
        setField(term160209, term160209.getClass(), "exp", "gyZHokNAZb");
        setLongField(term160209, term160209.getClass(), "point", -3004736165532415279L);
        setLongField(term160209, term160209.getClass(), "totalPoint", -499589695916275164L);
        setIntField(term160209, term160209.getClass(), "playCount", 794207842);
        setIntField(term160209, term160209.getClass(), "multiPlayCount", -771456985);
        setIntField(term160209, term160209.getClass(), "multiWinCount", -722140170);
        setIntField(term160209, term160209.getClass(), "requestResCount", 1916400220);
        setIntField(term160209, term160209.getClass(), "acceptResCount", -1141686836);
        setIntField(term160209, term160209.getClass(), "successResCount", 478352224);
        setIntField(term160209, term160209.getClass(), "playerRating", -1101969321);
        setIntField(term160209, term160209.getClass(), "highestRating", -1548753200);
        setIntField(term160209, term160209.getClass(), "nameplateId", 464016562);
        setIntField(term160209, term160209.getClass(), "frameId", -1354580524);
        setIntField(term160209, term160209.getClass(), "characterId", 1631553778);
        setIntField(term160209, term160209.getClass(), "trophyId", 518955314);
        setIntField(term160209, term160209.getClass(), "playedTutorialBit", 947568502);
        setIntField(term160209, term160209.getClass(), "firstTutorialCancelNum", -1214145327);
        setIntField(term160209, term160209.getClass(), "masterTutorialCancelNum", -1998835806);
        setIntField(term160209, term160209.getClass(), "totalRepertoireCount", -1633893651);
        setIntField(term160209, term160209.getClass(), "totalMapNum", -104469333);
        setLongField(term160209, term160209.getClass(), "totalHiScore", -248717578970051492L);
        setLongField(term160209, term160209.getClass(), "totalBasicHighScore", -3192952069616776104L);
        setLongField(term160209, term160209.getClass(), "totalAdvancedHighScore", 5174934145269975705L);
        setLongField(term160209, term160209.getClass(), "totalExpertHighScore", 2429413598537988825L);
        setLongField(term160209, term160209.getClass(), "totalMasterHighScore", -8994091859603599701L);
        setIntField(term160321, term160321.getClass(), "year", 2029);
        setShortField(term160321, term160321.getClass(), "month", (short) 7);
        setShortField(term160321, term160321.getClass(), "day", (short) 10);
        setField(term160320, term160320.getClass(), "date", term160321);
        setByteField(term160325, term160325.getClass(), "hour", (byte) 7);
        setByteField(term160325, term160325.getClass(), "minute", (byte) 17);
        setByteField(term160325, term160325.getClass(), "second", (byte) 30);
        setIntField(term160325, term160325.getClass(), "nano", 846761709);
        setField(term160320, term160320.getClass(), "time", term160325);
        setField(term160209, term160209.getClass(), "eventWatchedDate", term160320);
        setIntField(term160209, term160209.getClass(), "friendCount", 154770061);
        setBooleanField(term160209, term160209.getClass(), "isMaimai", false);
        setField(term160209, term160209.getClass(), "firstGameId", "BDiGllEiZb");
        setField(term160209, term160209.getClass(), "firstRomVersion", "EmYykcYSYU");
        setField(term160209, term160209.getClass(), "firstDataVersion", "tmkiHdXIso");
        setIntField(term160369, term160369.getClass(), "year", 2028);
        setShortField(term160369, term160369.getClass(), "month", (short) 11);
        setShortField(term160369, term160369.getClass(), "day", (short) 30);
        setField(term160368, term160368.getClass(), "date", term160369);
        setByteField(term160373, term160373.getClass(), "hour", (byte) 15);
        setByteField(term160373, term160373.getClass(), "minute", (byte) 17);
        setByteField(term160373, term160373.getClass(), "second", (byte) 54);
        setIntField(term160373, term160373.getClass(), "nano", 193052974);
        setField(term160368, term160368.getClass(), "time", term160373);
        setField(term160209, term160209.getClass(), "firstPlayDate", term160368);
        setField(term160209, term160209.getClass(), "lastGameId", "iivsdaIdLe");
        setField(term160209, term160209.getClass(), "lastRomVersion", "yNZErAgZDk");
        setField(term160209, term160209.getClass(), "lastDataVersion", "gyeAErvtXb");
        setIntField(term160415, term160415.getClass(), "year", 2016);
        setShortField(term160415, term160415.getClass(), "month", (short) 12);
        setShortField(term160415, term160415.getClass(), "day", (short) 23);
        setField(term160414, term160414.getClass(), "date", term160415);
        setByteField(term160419, term160419.getClass(), "hour", (byte) 14);
        setByteField(term160419, term160419.getClass(), "minute", (byte) 42);
        setByteField(term160419, term160419.getClass(), "second", (byte) 32);
        setIntField(term160419, term160419.getClass(), "nano", 279802206);
        setField(term160414, term160414.getClass(), "time", term160419);
        setField(term160209, term160209.getClass(), "lastPlayDate", term160414);
        setIntField(term160209, term160209.getClass(), "lastPlaceId", 1923537756);
        setField(term160209, term160209.getClass(), "lastPlaceName", "IEsZEVbFZG");
        setField(term160209, term160209.getClass(), "lastRegionId", "hefxCEhnuL");
        setField(term160209, term160209.getClass(), "lastRegionName", "nAZCgcAqKF");
        setField(term160209, term160209.getClass(), "lastAllNetId", "qEwUfGEixD");
        setField(term160209, term160209.getClass(), "lastClientId", "gzwdEqELlU");
        term160485 = new Integer(1759570934);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term160485;
        callMethod(klass, "setTrophyId", argTypes, term160209, args);
    }

};


