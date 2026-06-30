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

public class UserCharacter_isValid_1705824028 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term111530;

    public UserCharacter_isValid_1705824028() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term111536 = new Long(2191130532479601175L);
        term111530 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCharacter"));
        Object term111532 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term111534 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term111550 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term111551 = newInstance(Class.forName("java.time.LocalDate"));
        Object term111555 = newInstance(Class.forName("java.time.LocalTime"));
        Object term111560 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term111561 = newInstance(Class.forName("java.time.LocalDate"));
        Object term111565 = newInstance(Class.forName("java.time.LocalTime"));
        Object term111582 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term111583 = newInstance(Class.forName("java.time.LocalDate"));
        Object term111587 = newInstance(Class.forName("java.time.LocalTime"));
        Object term111643 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term111644 = newInstance(Class.forName("java.time.LocalDate"));
        Object term111648 = newInstance(Class.forName("java.time.LocalTime"));
        Object term111691 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term111692 = newInstance(Class.forName("java.time.LocalDate"));
        Object term111696 = newInstance(Class.forName("java.time.LocalTime"));
        Object term111737 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term111738 = newInstance(Class.forName("java.time.LocalDate"));
        Object term111742 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term111530, term111530.getClass(), "id", -2344830742558802930L);
        setLongField(term111532, term111532.getClass(), "id", -2400272512040933740L);
        setLongField(term111534, term111534.getClass(), "id", 2471459865342914246L);
        setField(term111534, term111534.getClass(), "extId", term111536);
        setField(term111534, term111534.getClass(), "luid", "XkidVezikV");
        setIntField(term111551, term111551.getClass(), "year", 2029);
        setShortField(term111551, term111551.getClass(), "month", (short) 8);
        setShortField(term111551, term111551.getClass(), "day", (short) 24);
        setField(term111550, term111550.getClass(), "date", term111551);
        setByteField(term111555, term111555.getClass(), "hour", (byte) 5);
        setByteField(term111555, term111555.getClass(), "minute", (byte) 25);
        setByteField(term111555, term111555.getClass(), "second", (byte) 34);
        setIntField(term111555, term111555.getClass(), "nano", 402410897);
        setField(term111550, term111550.getClass(), "time", term111555);
        setField(term111534, term111534.getClass(), "registerTime", term111550);
        setIntField(term111561, term111561.getClass(), "year", 2018);
        setShortField(term111561, term111561.getClass(), "month", (short) 6);
        setShortField(term111561, term111561.getClass(), "day", (short) 18);
        setField(term111560, term111560.getClass(), "date", term111561);
        setByteField(term111565, term111565.getClass(), "hour", (byte) 20);
        setByteField(term111565, term111565.getClass(), "minute", (byte) 1);
        setByteField(term111565, term111565.getClass(), "second", (byte) 31);
        setIntField(term111565, term111565.getClass(), "nano", 536441532);
        setField(term111560, term111560.getClass(), "time", term111565);
        setField(term111534, term111534.getClass(), "accessTime", term111560);
        setField(term111532, term111532.getClass(), "card", term111534);
        setField(term111532, term111532.getClass(), "userName", "xSsMPNRSUV");
        setIntField(term111583, term111583.getClass(), "year", 2023);
        setShortField(term111583, term111583.getClass(), "month", (short) 4);
        setShortField(term111583, term111583.getClass(), "day", (short) 23);
        setField(term111582, term111582.getClass(), "date", term111583);
        setByteField(term111587, term111587.getClass(), "hour", (byte) 4);
        setByteField(term111587, term111587.getClass(), "minute", (byte) 15);
        setByteField(term111587, term111587.getClass(), "second", (byte) 3);
        setIntField(term111587, term111587.getClass(), "nano", 1598414);
        setField(term111582, term111582.getClass(), "time", term111587);
        setField(term111532, term111532.getClass(), "lastLoginDate", term111582);
        setBooleanField(term111532, term111532.getClass(), "isWebJoin", false);
        setField(term111532, term111532.getClass(), "webLimitDate", "DRbcFFNcSr");
        setIntField(term111532, term111532.getClass(), "level", 1206556058);
        setIntField(term111532, term111532.getClass(), "reincarnationNum", 85515004);
        setField(term111532, term111532.getClass(), "exp", "WGDSInQrVz");
        setLongField(term111532, term111532.getClass(), "point", 1298833491565248675L);
        setLongField(term111532, term111532.getClass(), "totalPoint", -5282656070291958064L);
        setIntField(term111532, term111532.getClass(), "playCount", 1809173984);
        setIntField(term111532, term111532.getClass(), "multiPlayCount", -1649722492);
        setIntField(term111532, term111532.getClass(), "multiWinCount", 1892060110);
        setIntField(term111532, term111532.getClass(), "requestResCount", -1722968935);
        setIntField(term111532, term111532.getClass(), "acceptResCount", -352942698);
        setIntField(term111532, term111532.getClass(), "successResCount", -291574787);
        setIntField(term111532, term111532.getClass(), "playerRating", 1661313090);
        setIntField(term111532, term111532.getClass(), "highestRating", 1684314973);
        setIntField(term111532, term111532.getClass(), "nameplateId", 1244976316);
        setIntField(term111532, term111532.getClass(), "frameId", -1572789846);
        setIntField(term111532, term111532.getClass(), "characterId", -1829984905);
        setIntField(term111532, term111532.getClass(), "trophyId", -1730584098);
        setIntField(term111532, term111532.getClass(), "playedTutorialBit", -1681411287);
        setIntField(term111532, term111532.getClass(), "firstTutorialCancelNum", -1796526306);
        setIntField(term111532, term111532.getClass(), "masterTutorialCancelNum", 719664754);
        setIntField(term111532, term111532.getClass(), "totalRepertoireCount", 1908542558);
        setIntField(term111532, term111532.getClass(), "totalMapNum", -1081520792);
        setLongField(term111532, term111532.getClass(), "totalHiScore", -4217861566486163749L);
        setLongField(term111532, term111532.getClass(), "totalBasicHighScore", -4945539086208200375L);
        setLongField(term111532, term111532.getClass(), "totalAdvancedHighScore", -1244149061151367736L);
        setLongField(term111532, term111532.getClass(), "totalExpertHighScore", 985346718698079792L);
        setLongField(term111532, term111532.getClass(), "totalMasterHighScore", 4787080389628135236L);
        setIntField(term111644, term111644.getClass(), "year", 2021);
        setShortField(term111644, term111644.getClass(), "month", (short) 12);
        setShortField(term111644, term111644.getClass(), "day", (short) 31);
        setField(term111643, term111643.getClass(), "date", term111644);
        setByteField(term111648, term111648.getClass(), "hour", (byte) 14);
        setByteField(term111648, term111648.getClass(), "minute", (byte) 7);
        setByteField(term111648, term111648.getClass(), "second", (byte) 36);
        setIntField(term111648, term111648.getClass(), "nano", 42029316);
        setField(term111643, term111643.getClass(), "time", term111648);
        setField(term111532, term111532.getClass(), "eventWatchedDate", term111643);
        setIntField(term111532, term111532.getClass(), "friendCount", 1538397670);
        setBooleanField(term111532, term111532.getClass(), "isMaimai", false);
        setField(term111532, term111532.getClass(), "firstGameId", "pJboxLnvbb");
        setField(term111532, term111532.getClass(), "firstRomVersion", "ofGdinTYHj");
        setField(term111532, term111532.getClass(), "firstDataVersion", "FaJjdWrmzf");
        setIntField(term111692, term111692.getClass(), "year", 2025);
        setShortField(term111692, term111692.getClass(), "month", (short) 2);
        setShortField(term111692, term111692.getClass(), "day", (short) 6);
        setField(term111691, term111691.getClass(), "date", term111692);
        setByteField(term111696, term111696.getClass(), "hour", (byte) 15);
        setByteField(term111696, term111696.getClass(), "minute", (byte) 17);
        setByteField(term111696, term111696.getClass(), "second", (byte) 14);
        setIntField(term111696, term111696.getClass(), "nano", 517876656);
        setField(term111691, term111691.getClass(), "time", term111696);
        setField(term111532, term111532.getClass(), "firstPlayDate", term111691);
        setField(term111532, term111532.getClass(), "lastGameId", "qBRgIZjugc");
        setField(term111532, term111532.getClass(), "lastRomVersion", "ZPnUGVLyiF");
        setField(term111532, term111532.getClass(), "lastDataVersion", "iGWKoojIzf");
        setIntField(term111738, term111738.getClass(), "year", 2025);
        setShortField(term111738, term111738.getClass(), "month", (short) 10);
        setShortField(term111738, term111738.getClass(), "day", (short) 12);
        setField(term111737, term111737.getClass(), "date", term111738);
        setByteField(term111742, term111742.getClass(), "hour", (byte) 21);
        setByteField(term111742, term111742.getClass(), "minute", (byte) 43);
        setByteField(term111742, term111742.getClass(), "second", (byte) 56);
        setIntField(term111742, term111742.getClass(), "nano", 106716069);
        setField(term111737, term111737.getClass(), "time", term111742);
        setField(term111532, term111532.getClass(), "lastPlayDate", term111737);
        setIntField(term111532, term111532.getClass(), "lastPlaceId", 1892710246);
        setField(term111532, term111532.getClass(), "lastPlaceName", "hBwCfmunWp");
        setField(term111532, term111532.getClass(), "lastRegionId", "dEmUNxEaGp");
        setField(term111532, term111532.getClass(), "lastRegionName", "FiihXkdDjE");
        setField(term111532, term111532.getClass(), "lastAllNetId", "ttkSFEAzwY");
        setField(term111532, term111532.getClass(), "lastClientId", "ZTUqSMjJHU");
        setField(term111530, term111530.getClass(), "user", term111532);
        setIntField(term111530, term111530.getClass(), "characterId", 1847407988);
        setIntField(term111530, term111530.getClass(), "playCount", 15668872);
        setIntField(term111530, term111530.getClass(), "level", 1);
        setIntField(term111530, term111530.getClass(), "skillId", -1367697974);
        setIntField(term111530, term111530.getClass(), "friendshipExp", 16297395);
        setBooleanField(term111530, term111530.getClass(), "isValid", true);
        setBooleanField(term111530, term111530.getClass(), "isNewMark", true);
        setIntField(term111530, term111530.getClass(), "param1", 623171819);
        setIntField(term111530, term111530.getClass(), "param2", 1066443567);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCharacter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isValid", argTypes, term111530, args);
    }

};


