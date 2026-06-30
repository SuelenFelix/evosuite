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

public class UserCourse_isClear_196629431719 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1922136;

    public UserCourse_isClear_196629431719() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1922142 = new Long(4051658878918665197L);
        term1922136 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCourse"));
        Object term1922138 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term1922140 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term1922156 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1922157 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1922161 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1922166 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1922167 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1922171 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1922188 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1922189 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1922193 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1922249 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1922250 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1922254 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1922297 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1922298 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1922302 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1922343 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1922344 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1922348 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1922423 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1922424 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1922428 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term1922136, term1922136.getClass(), "id", -7818194226135832820L);
        setLongField(term1922138, term1922138.getClass(), "id", -8880396881392354873L);
        setLongField(term1922140, term1922140.getClass(), "id", -8919189442154751632L);
        setField(term1922140, term1922140.getClass(), "extId", term1922142);
        setField(term1922140, term1922140.getClass(), "luid", "MWCtqjFwIw");
        setIntField(term1922157, term1922157.getClass(), "year", 2018);
        setShortField(term1922157, term1922157.getClass(), "month", (short) 2);
        setShortField(term1922157, term1922157.getClass(), "day", (short) 4);
        setField(term1922156, term1922156.getClass(), "date", term1922157);
        setByteField(term1922161, term1922161.getClass(), "hour", (byte) 8);
        setByteField(term1922161, term1922161.getClass(), "minute", (byte) 7);
        setByteField(term1922161, term1922161.getClass(), "second", (byte) 51);
        setIntField(term1922161, term1922161.getClass(), "nano", 395275751);
        setField(term1922156, term1922156.getClass(), "time", term1922161);
        setField(term1922140, term1922140.getClass(), "registerTime", term1922156);
        setIntField(term1922167, term1922167.getClass(), "year", 2012);
        setShortField(term1922167, term1922167.getClass(), "month", (short) 7);
        setShortField(term1922167, term1922167.getClass(), "day", (short) 9);
        setField(term1922166, term1922166.getClass(), "date", term1922167);
        setByteField(term1922171, term1922171.getClass(), "hour", (byte) 8);
        setByteField(term1922171, term1922171.getClass(), "minute", (byte) 35);
        setByteField(term1922171, term1922171.getClass(), "second", (byte) 25);
        setIntField(term1922171, term1922171.getClass(), "nano", 934069602);
        setField(term1922166, term1922166.getClass(), "time", term1922171);
        setField(term1922140, term1922140.getClass(), "accessTime", term1922166);
        setField(term1922138, term1922138.getClass(), "card", term1922140);
        setField(term1922138, term1922138.getClass(), "userName", "FDSDAgbvnG");
        setIntField(term1922189, term1922189.getClass(), "year", 2012);
        setShortField(term1922189, term1922189.getClass(), "month", (short) 4);
        setShortField(term1922189, term1922189.getClass(), "day", (short) 8);
        setField(term1922188, term1922188.getClass(), "date", term1922189);
        setByteField(term1922193, term1922193.getClass(), "hour", (byte) 15);
        setByteField(term1922193, term1922193.getClass(), "minute", (byte) 4);
        setByteField(term1922193, term1922193.getClass(), "second", (byte) 15);
        setIntField(term1922193, term1922193.getClass(), "nano", 194344738);
        setField(term1922188, term1922188.getClass(), "time", term1922193);
        setField(term1922138, term1922138.getClass(), "lastLoginDate", term1922188);
        setBooleanField(term1922138, term1922138.getClass(), "isWebJoin", false);
        setField(term1922138, term1922138.getClass(), "webLimitDate", "LYMElqewyV");
        setIntField(term1922138, term1922138.getClass(), "level", -1846156059);
        setIntField(term1922138, term1922138.getClass(), "reincarnationNum", 510065223);
        setField(term1922138, term1922138.getClass(), "exp", "yqJChIYUfG");
        setLongField(term1922138, term1922138.getClass(), "point", 398404135233253473L);
        setLongField(term1922138, term1922138.getClass(), "totalPoint", -6564359442562195515L);
        setIntField(term1922138, term1922138.getClass(), "playCount", 416731368);
        setIntField(term1922138, term1922138.getClass(), "multiPlayCount", 1263145700);
        setIntField(term1922138, term1922138.getClass(), "multiWinCount", -1823781297);
        setIntField(term1922138, term1922138.getClass(), "requestResCount", 853221842);
        setIntField(term1922138, term1922138.getClass(), "acceptResCount", 1253008858);
        setIntField(term1922138, term1922138.getClass(), "successResCount", -506345192);
        setIntField(term1922138, term1922138.getClass(), "playerRating", -1325979610);
        setIntField(term1922138, term1922138.getClass(), "highestRating", 1938156492);
        setIntField(term1922138, term1922138.getClass(), "nameplateId", -1713245695);
        setIntField(term1922138, term1922138.getClass(), "frameId", -606587832);
        setIntField(term1922138, term1922138.getClass(), "characterId", -2042049593);
        setIntField(term1922138, term1922138.getClass(), "trophyId", 2067477299);
        setIntField(term1922138, term1922138.getClass(), "playedTutorialBit", -486983306);
        setIntField(term1922138, term1922138.getClass(), "firstTutorialCancelNum", -202145813);
        setIntField(term1922138, term1922138.getClass(), "masterTutorialCancelNum", 1592864082);
        setIntField(term1922138, term1922138.getClass(), "totalRepertoireCount", -875230704);
        setIntField(term1922138, term1922138.getClass(), "totalMapNum", 824976722);
        setLongField(term1922138, term1922138.getClass(), "totalHiScore", -1938686757339849280L);
        setLongField(term1922138, term1922138.getClass(), "totalBasicHighScore", -858562462517024171L);
        setLongField(term1922138, term1922138.getClass(), "totalAdvancedHighScore", 5275117486683038589L);
        setLongField(term1922138, term1922138.getClass(), "totalExpertHighScore", 1779788895294323465L);
        setLongField(term1922138, term1922138.getClass(), "totalMasterHighScore", 7739991117293090110L);
        setIntField(term1922250, term1922250.getClass(), "year", 2024);
        setShortField(term1922250, term1922250.getClass(), "month", (short) 11);
        setShortField(term1922250, term1922250.getClass(), "day", (short) 16);
        setField(term1922249, term1922249.getClass(), "date", term1922250);
        setByteField(term1922254, term1922254.getClass(), "hour", (byte) 7);
        setByteField(term1922254, term1922254.getClass(), "minute", (byte) 18);
        setByteField(term1922254, term1922254.getClass(), "second", (byte) 52);
        setIntField(term1922254, term1922254.getClass(), "nano", 158726857);
        setField(term1922249, term1922249.getClass(), "time", term1922254);
        setField(term1922138, term1922138.getClass(), "eventWatchedDate", term1922249);
        setIntField(term1922138, term1922138.getClass(), "friendCount", 1126499645);
        setBooleanField(term1922138, term1922138.getClass(), "isMaimai", true);
        setField(term1922138, term1922138.getClass(), "firstGameId", "AqGjVVwyQC");
        setField(term1922138, term1922138.getClass(), "firstRomVersion", "DYikjzGwLP");
        setField(term1922138, term1922138.getClass(), "firstDataVersion", "sqclrNsVMM");
        setIntField(term1922298, term1922298.getClass(), "year", 2029);
        setShortField(term1922298, term1922298.getClass(), "month", (short) 2);
        setShortField(term1922298, term1922298.getClass(), "day", (short) 27);
        setField(term1922297, term1922297.getClass(), "date", term1922298);
        setByteField(term1922302, term1922302.getClass(), "hour", (byte) 13);
        setByteField(term1922302, term1922302.getClass(), "minute", (byte) 23);
        setByteField(term1922302, term1922302.getClass(), "second", (byte) 32);
        setIntField(term1922302, term1922302.getClass(), "nano", 824232208);
        setField(term1922297, term1922297.getClass(), "time", term1922302);
        setField(term1922138, term1922138.getClass(), "firstPlayDate", term1922297);
        setField(term1922138, term1922138.getClass(), "lastGameId", "OGAswGvyqo");
        setField(term1922138, term1922138.getClass(), "lastRomVersion", "ndettJZdHP");
        setField(term1922138, term1922138.getClass(), "lastDataVersion", "PbfFUSEmHD");
        setIntField(term1922344, term1922344.getClass(), "year", 2028);
        setShortField(term1922344, term1922344.getClass(), "month", (short) 1);
        setShortField(term1922344, term1922344.getClass(), "day", (short) 2);
        setField(term1922343, term1922343.getClass(), "date", term1922344);
        setByteField(term1922348, term1922348.getClass(), "hour", (byte) 13);
        setByteField(term1922348, term1922348.getClass(), "minute", (byte) 6);
        setByteField(term1922348, term1922348.getClass(), "second", (byte) 41);
        setIntField(term1922348, term1922348.getClass(), "nano", 556642281);
        setField(term1922343, term1922343.getClass(), "time", term1922348);
        setField(term1922138, term1922138.getClass(), "lastPlayDate", term1922343);
        setIntField(term1922138, term1922138.getClass(), "lastPlaceId", 151411633);
        setField(term1922138, term1922138.getClass(), "lastPlaceName", "HDZBlhPTgf");
        setField(term1922138, term1922138.getClass(), "lastRegionId", "wgPZuWwrws");
        setField(term1922138, term1922138.getClass(), "lastRegionName", "NMyXDmBHEe");
        setField(term1922138, term1922138.getClass(), "lastAllNetId", "ykABpFCOfg");
        setField(term1922138, term1922138.getClass(), "lastClientId", "MVtwxpAmXy");
        setField(term1922136, term1922136.getClass(), "user", term1922138);
        setIntField(term1922136, term1922136.getClass(), "courseId", -630926540);
        setIntField(term1922136, term1922136.getClass(), "classId", -699568816);
        setIntField(term1922136, term1922136.getClass(), "playCount", 1602084365);
        setIntField(term1922136, term1922136.getClass(), "scoreMax", -261063464);
        setBooleanField(term1922136, term1922136.getClass(), "isFullCombo", true);
        setBooleanField(term1922136, term1922136.getClass(), "isAllJustice", false);
        setBooleanField(term1922136, term1922136.getClass(), "isSuccess", false);
        setIntField(term1922136, term1922136.getClass(), "scoreRank", 770687780);
        setIntField(term1922136, term1922136.getClass(), "eventId", 1440331697);
        setIntField(term1922424, term1922424.getClass(), "year", 2024);
        setShortField(term1922424, term1922424.getClass(), "month", (short) 12);
        setShortField(term1922424, term1922424.getClass(), "day", (short) 6);
        setField(term1922423, term1922423.getClass(), "date", term1922424);
        setByteField(term1922428, term1922428.getClass(), "hour", (byte) 11);
        setByteField(term1922428, term1922428.getClass(), "minute", (byte) 53);
        setByteField(term1922428, term1922428.getClass(), "second", (byte) 36);
        setIntField(term1922428, term1922428.getClass(), "nano", 155867265);
        setField(term1922423, term1922423.getClass(), "time", term1922428);
        setField(term1922136, term1922136.getClass(), "lastPlayDate", term1922423);
        setIntField(term1922136, term1922136.getClass(), "param1", 1073303765);
        setIntField(term1922136, term1922136.getClass(), "param2", 1517537869);
        setIntField(term1922136, term1922136.getClass(), "param3", -205652911);
        setIntField(term1922136, term1922136.getClass(), "param4", -1242737825);
        setBooleanField(term1922136, term1922136.getClass(), "isClear", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCourse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isClear", argTypes, term1922136, args);
    }

};


