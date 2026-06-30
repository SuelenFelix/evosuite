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

public class UserDuel_getParam2_9489949369 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78851;

    public UserDuel_getParam2_9489949369() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term78857 = new Long(-3948863953565024517L);
        term78851 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserDuel"));
        Object term78853 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term78855 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term78871 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term78872 = newInstance(Class.forName("java.time.LocalDate"));
        Object term78876 = newInstance(Class.forName("java.time.LocalTime"));
        Object term78881 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term78882 = newInstance(Class.forName("java.time.LocalDate"));
        Object term78886 = newInstance(Class.forName("java.time.LocalTime"));
        Object term78903 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term78904 = newInstance(Class.forName("java.time.LocalDate"));
        Object term78908 = newInstance(Class.forName("java.time.LocalTime"));
        Object term78964 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term78965 = newInstance(Class.forName("java.time.LocalDate"));
        Object term78969 = newInstance(Class.forName("java.time.LocalTime"));
        Object term79012 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term79013 = newInstance(Class.forName("java.time.LocalDate"));
        Object term79017 = newInstance(Class.forName("java.time.LocalTime"));
        Object term79058 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term79059 = newInstance(Class.forName("java.time.LocalDate"));
        Object term79063 = newInstance(Class.forName("java.time.LocalTime"));
        Object term79133 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term79134 = newInstance(Class.forName("java.time.LocalDate"));
        Object term79138 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term78851, term78851.getClass(), "id", -1486135171566437695L);
        setLongField(term78853, term78853.getClass(), "id", 5383609177501042021L);
        setLongField(term78855, term78855.getClass(), "id", 2779814845687231848L);
        setField(term78855, term78855.getClass(), "extId", term78857);
        setField(term78855, term78855.getClass(), "luid", "OEeAVwVwuj");
        setIntField(term78872, term78872.getClass(), "year", 2028);
        setShortField(term78872, term78872.getClass(), "month", (short) 11);
        setShortField(term78872, term78872.getClass(), "day", (short) 9);
        setField(term78871, term78871.getClass(), "date", term78872);
        setByteField(term78876, term78876.getClass(), "hour", (byte) 7);
        setByteField(term78876, term78876.getClass(), "minute", (byte) 38);
        setByteField(term78876, term78876.getClass(), "second", (byte) 24);
        setIntField(term78876, term78876.getClass(), "nano", 528146857);
        setField(term78871, term78871.getClass(), "time", term78876);
        setField(term78855, term78855.getClass(), "registerTime", term78871);
        setIntField(term78882, term78882.getClass(), "year", 2025);
        setShortField(term78882, term78882.getClass(), "month", (short) 3);
        setShortField(term78882, term78882.getClass(), "day", (short) 6);
        setField(term78881, term78881.getClass(), "date", term78882);
        setByteField(term78886, term78886.getClass(), "hour", (byte) 12);
        setByteField(term78886, term78886.getClass(), "minute", (byte) 2);
        setByteField(term78886, term78886.getClass(), "second", (byte) 23);
        setIntField(term78886, term78886.getClass(), "nano", 463787680);
        setField(term78881, term78881.getClass(), "time", term78886);
        setField(term78855, term78855.getClass(), "accessTime", term78881);
        setField(term78853, term78853.getClass(), "card", term78855);
        setField(term78853, term78853.getClass(), "userName", "WEgFuDZsxi");
        setIntField(term78904, term78904.getClass(), "year", 2014);
        setShortField(term78904, term78904.getClass(), "month", (short) 6);
        setShortField(term78904, term78904.getClass(), "day", (short) 26);
        setField(term78903, term78903.getClass(), "date", term78904);
        setByteField(term78908, term78908.getClass(), "hour", (byte) 23);
        setByteField(term78908, term78908.getClass(), "minute", (byte) 29);
        setByteField(term78908, term78908.getClass(), "second", (byte) 42);
        setIntField(term78908, term78908.getClass(), "nano", 792765324);
        setField(term78903, term78903.getClass(), "time", term78908);
        setField(term78853, term78853.getClass(), "lastLoginDate", term78903);
        setBooleanField(term78853, term78853.getClass(), "isWebJoin", true);
        setField(term78853, term78853.getClass(), "webLimitDate", "kvcaSGNTHd");
        setIntField(term78853, term78853.getClass(), "level", 484689354);
        setIntField(term78853, term78853.getClass(), "reincarnationNum", 1836490268);
        setField(term78853, term78853.getClass(), "exp", "opXkGeBDoI");
        setLongField(term78853, term78853.getClass(), "point", -6273351477363617569L);
        setLongField(term78853, term78853.getClass(), "totalPoint", -5620682754269520333L);
        setIntField(term78853, term78853.getClass(), "playCount", 388735696);
        setIntField(term78853, term78853.getClass(), "multiPlayCount", 105946838);
        setIntField(term78853, term78853.getClass(), "multiWinCount", -2076570725);
        setIntField(term78853, term78853.getClass(), "requestResCount", -976659428);
        setIntField(term78853, term78853.getClass(), "acceptResCount", 974582816);
        setIntField(term78853, term78853.getClass(), "successResCount", 1915101054);
        setIntField(term78853, term78853.getClass(), "playerRating", -956240810);
        setIntField(term78853, term78853.getClass(), "highestRating", 2125391204);
        setIntField(term78853, term78853.getClass(), "nameplateId", -1473375595);
        setIntField(term78853, term78853.getClass(), "frameId", 847182213);
        setIntField(term78853, term78853.getClass(), "characterId", 1757624590);
        setIntField(term78853, term78853.getClass(), "trophyId", 694012679);
        setIntField(term78853, term78853.getClass(), "playedTutorialBit", -630916471);
        setIntField(term78853, term78853.getClass(), "firstTutorialCancelNum", -167574207);
        setIntField(term78853, term78853.getClass(), "masterTutorialCancelNum", 1034189504);
        setIntField(term78853, term78853.getClass(), "totalRepertoireCount", 250123647);
        setIntField(term78853, term78853.getClass(), "totalMapNum", -1818613479);
        setLongField(term78853, term78853.getClass(), "totalHiScore", 9215348305313170099L);
        setLongField(term78853, term78853.getClass(), "totalBasicHighScore", -785087035950801971L);
        setLongField(term78853, term78853.getClass(), "totalAdvancedHighScore", 3850790119182839369L);
        setLongField(term78853, term78853.getClass(), "totalExpertHighScore", -405127137367295684L);
        setLongField(term78853, term78853.getClass(), "totalMasterHighScore", 3093905091334313614L);
        setIntField(term78965, term78965.getClass(), "year", 2019);
        setShortField(term78965, term78965.getClass(), "month", (short) 3);
        setShortField(term78965, term78965.getClass(), "day", (short) 23);
        setField(term78964, term78964.getClass(), "date", term78965);
        setByteField(term78969, term78969.getClass(), "hour", (byte) 1);
        setByteField(term78969, term78969.getClass(), "minute", (byte) 15);
        setByteField(term78969, term78969.getClass(), "second", (byte) 57);
        setIntField(term78969, term78969.getClass(), "nano", 53985671);
        setField(term78964, term78964.getClass(), "time", term78969);
        setField(term78853, term78853.getClass(), "eventWatchedDate", term78964);
        setIntField(term78853, term78853.getClass(), "friendCount", -93031622);
        setBooleanField(term78853, term78853.getClass(), "isMaimai", true);
        setField(term78853, term78853.getClass(), "firstGameId", "UHxidCtatV");
        setField(term78853, term78853.getClass(), "firstRomVersion", "LRzADDSjVT");
        setField(term78853, term78853.getClass(), "firstDataVersion", "lpFCMaAYxj");
        setIntField(term79013, term79013.getClass(), "year", 2011);
        setShortField(term79013, term79013.getClass(), "month", (short) 6);
        setShortField(term79013, term79013.getClass(), "day", (short) 27);
        setField(term79012, term79012.getClass(), "date", term79013);
        setByteField(term79017, term79017.getClass(), "hour", (byte) 12);
        setByteField(term79017, term79017.getClass(), "minute", (byte) 48);
        setByteField(term79017, term79017.getClass(), "second", (byte) 45);
        setIntField(term79017, term79017.getClass(), "nano", 332145929);
        setField(term79012, term79012.getClass(), "time", term79017);
        setField(term78853, term78853.getClass(), "firstPlayDate", term79012);
        setField(term78853, term78853.getClass(), "lastGameId", "fzHVMNSLii");
        setField(term78853, term78853.getClass(), "lastRomVersion", "TxymnVINZF");
        setField(term78853, term78853.getClass(), "lastDataVersion", "fkBfmixBEh");
        setIntField(term79059, term79059.getClass(), "year", 2020);
        setShortField(term79059, term79059.getClass(), "month", (short) 4);
        setShortField(term79059, term79059.getClass(), "day", (short) 29);
        setField(term79058, term79058.getClass(), "date", term79059);
        setByteField(term79063, term79063.getClass(), "hour", (byte) 2);
        setByteField(term79063, term79063.getClass(), "minute", (byte) 54);
        setByteField(term79063, term79063.getClass(), "second", (byte) 2);
        setIntField(term79063, term79063.getClass(), "nano", 314066531);
        setField(term79058, term79058.getClass(), "time", term79063);
        setField(term78853, term78853.getClass(), "lastPlayDate", term79058);
        setIntField(term78853, term78853.getClass(), "lastPlaceId", 1909891216);
        setField(term78853, term78853.getClass(), "lastPlaceName", "SWbairdDKL");
        setField(term78853, term78853.getClass(), "lastRegionId", "AibUFEALwF");
        setField(term78853, term78853.getClass(), "lastRegionName", "eXOUrXTrdW");
        setField(term78853, term78853.getClass(), "lastAllNetId", "aomDEETHep");
        setField(term78853, term78853.getClass(), "lastClientId", "GTMrlIYfIM");
        setField(term78851, term78851.getClass(), "user", term78853);
        setIntField(term78851, term78851.getClass(), "duelId", -1231417445);
        setIntField(term78851, term78851.getClass(), "progress", -1305887225);
        setIntField(term78851, term78851.getClass(), "point", 1861751365);
        setBooleanField(term78851, term78851.getClass(), "isClear", false);
        setIntField(term79134, term79134.getClass(), "year", 2010);
        setShortField(term79134, term79134.getClass(), "month", (short) 2);
        setShortField(term79134, term79134.getClass(), "day", (short) 11);
        setField(term79133, term79133.getClass(), "date", term79134);
        setByteField(term79138, term79138.getClass(), "hour", (byte) 12);
        setByteField(term79138, term79138.getClass(), "minute", (byte) 49);
        setByteField(term79138, term79138.getClass(), "second", (byte) 35);
        setIntField(term79138, term79138.getClass(), "nano", 685384504);
        setField(term79133, term79133.getClass(), "time", term79138);
        setField(term78851, term78851.getClass(), "lastPlayDate", term79133);
        setIntField(term78851, term78851.getClass(), "param1", 1137036889);
        setIntField(term78851, term78851.getClass(), "param2", 1607912632);
        setIntField(term78851, term78851.getClass(), "param3", -2089396254);
        setIntField(term78851, term78851.getClass(), "param4", 609444561);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserDuel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getParam2", argTypes, term78851, args);
    }

};


