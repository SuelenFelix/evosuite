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

public class UserActivity_setParam2_182150254716 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term298794;
     Object term299079;

    public UserActivity_setParam2_182150254716() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term298800 = new Long(-7514437039500876647L);
        term298794 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserActivity"));
        Object term298796 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term298798 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term298814 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term298815 = newInstance(Class.forName("java.time.LocalDate"));
        Object term298819 = newInstance(Class.forName("java.time.LocalTime"));
        Object term298824 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term298825 = newInstance(Class.forName("java.time.LocalDate"));
        Object term298829 = newInstance(Class.forName("java.time.LocalTime"));
        Object term298846 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term298847 = newInstance(Class.forName("java.time.LocalDate"));
        Object term298851 = newInstance(Class.forName("java.time.LocalTime"));
        Object term298907 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term298908 = newInstance(Class.forName("java.time.LocalDate"));
        Object term298912 = newInstance(Class.forName("java.time.LocalTime"));
        Object term298955 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term298956 = newInstance(Class.forName("java.time.LocalDate"));
        Object term298960 = newInstance(Class.forName("java.time.LocalTime"));
        Object term299001 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term299002 = newInstance(Class.forName("java.time.LocalDate"));
        Object term299006 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term298794, term298794.getClass(), "id", -5815010963403726423L);
        setLongField(term298796, term298796.getClass(), "id", -4344355325060611900L);
        setLongField(term298798, term298798.getClass(), "id", -2783285373103915891L);
        setField(term298798, term298798.getClass(), "extId", term298800);
        setField(term298798, term298798.getClass(), "luid", "THLGPyhTxM");
        setIntField(term298815, term298815.getClass(), "year", 2010);
        setShortField(term298815, term298815.getClass(), "month", (short) 11);
        setShortField(term298815, term298815.getClass(), "day", (short) 21);
        setField(term298814, term298814.getClass(), "date", term298815);
        setByteField(term298819, term298819.getClass(), "hour", (byte) 14);
        setByteField(term298819, term298819.getClass(), "minute", (byte) 40);
        setByteField(term298819, term298819.getClass(), "second", (byte) 23);
        setIntField(term298819, term298819.getClass(), "nano", 637847060);
        setField(term298814, term298814.getClass(), "time", term298819);
        setField(term298798, term298798.getClass(), "registerTime", term298814);
        setIntField(term298825, term298825.getClass(), "year", 2028);
        setShortField(term298825, term298825.getClass(), "month", (short) 1);
        setShortField(term298825, term298825.getClass(), "day", (short) 2);
        setField(term298824, term298824.getClass(), "date", term298825);
        setByteField(term298829, term298829.getClass(), "hour", (byte) 10);
        setByteField(term298829, term298829.getClass(), "minute", (byte) 2);
        setByteField(term298829, term298829.getClass(), "second", (byte) 19);
        setIntField(term298829, term298829.getClass(), "nano", 701102444);
        setField(term298824, term298824.getClass(), "time", term298829);
        setField(term298798, term298798.getClass(), "accessTime", term298824);
        setField(term298796, term298796.getClass(), "card", term298798);
        setField(term298796, term298796.getClass(), "userName", "XdUkazWzCb");
        setIntField(term298847, term298847.getClass(), "year", 2012);
        setShortField(term298847, term298847.getClass(), "month", (short) 6);
        setShortField(term298847, term298847.getClass(), "day", (short) 24);
        setField(term298846, term298846.getClass(), "date", term298847);
        setByteField(term298851, term298851.getClass(), "hour", (byte) 3);
        setByteField(term298851, term298851.getClass(), "minute", (byte) 30);
        setByteField(term298851, term298851.getClass(), "second", (byte) 46);
        setIntField(term298851, term298851.getClass(), "nano", 362166861);
        setField(term298846, term298846.getClass(), "time", term298851);
        setField(term298796, term298796.getClass(), "lastLoginDate", term298846);
        setBooleanField(term298796, term298796.getClass(), "isWebJoin", false);
        setField(term298796, term298796.getClass(), "webLimitDate", "pqVRGoWaeR");
        setIntField(term298796, term298796.getClass(), "level", -1895763167);
        setIntField(term298796, term298796.getClass(), "reincarnationNum", 25974685);
        setField(term298796, term298796.getClass(), "exp", "JqdeuiBTPA");
        setLongField(term298796, term298796.getClass(), "point", 5464988889380818357L);
        setLongField(term298796, term298796.getClass(), "totalPoint", -8081186299043869903L);
        setIntField(term298796, term298796.getClass(), "playCount", -748415491);
        setIntField(term298796, term298796.getClass(), "multiPlayCount", -106467519);
        setIntField(term298796, term298796.getClass(), "multiWinCount", -891158934);
        setIntField(term298796, term298796.getClass(), "requestResCount", 59717458);
        setIntField(term298796, term298796.getClass(), "acceptResCount", 1161304512);
        setIntField(term298796, term298796.getClass(), "successResCount", 1179045291);
        setIntField(term298796, term298796.getClass(), "playerRating", 187796156);
        setIntField(term298796, term298796.getClass(), "highestRating", 236799050);
        setIntField(term298796, term298796.getClass(), "nameplateId", 2059959850);
        setIntField(term298796, term298796.getClass(), "frameId", -926051580);
        setIntField(term298796, term298796.getClass(), "characterId", -696509293);
        setIntField(term298796, term298796.getClass(), "trophyId", 355853026);
        setIntField(term298796, term298796.getClass(), "playedTutorialBit", -1598167746);
        setIntField(term298796, term298796.getClass(), "firstTutorialCancelNum", 1736642602);
        setIntField(term298796, term298796.getClass(), "masterTutorialCancelNum", 58048208);
        setIntField(term298796, term298796.getClass(), "totalRepertoireCount", 1074355036);
        setIntField(term298796, term298796.getClass(), "totalMapNum", 55518272);
        setLongField(term298796, term298796.getClass(), "totalHiScore", 5268809567055520901L);
        setLongField(term298796, term298796.getClass(), "totalBasicHighScore", -5908406676382829407L);
        setLongField(term298796, term298796.getClass(), "totalAdvancedHighScore", 6817440310229946932L);
        setLongField(term298796, term298796.getClass(), "totalExpertHighScore", 7016478005878165666L);
        setLongField(term298796, term298796.getClass(), "totalMasterHighScore", -5985110120806433534L);
        setIntField(term298908, term298908.getClass(), "year", 2014);
        setShortField(term298908, term298908.getClass(), "month", (short) 3);
        setShortField(term298908, term298908.getClass(), "day", (short) 16);
        setField(term298907, term298907.getClass(), "date", term298908);
        setByteField(term298912, term298912.getClass(), "hour", (byte) 1);
        setByteField(term298912, term298912.getClass(), "minute", (byte) 17);
        setByteField(term298912, term298912.getClass(), "second", (byte) 30);
        setIntField(term298912, term298912.getClass(), "nano", 48009943);
        setField(term298907, term298907.getClass(), "time", term298912);
        setField(term298796, term298796.getClass(), "eventWatchedDate", term298907);
        setIntField(term298796, term298796.getClass(), "friendCount", 786099887);
        setBooleanField(term298796, term298796.getClass(), "isMaimai", false);
        setField(term298796, term298796.getClass(), "firstGameId", "tDOAjYoXYW");
        setField(term298796, term298796.getClass(), "firstRomVersion", "cniOQvwvCr");
        setField(term298796, term298796.getClass(), "firstDataVersion", "KxinsOQMeG");
        setIntField(term298956, term298956.getClass(), "year", 2011);
        setShortField(term298956, term298956.getClass(), "month", (short) 2);
        setShortField(term298956, term298956.getClass(), "day", (short) 22);
        setField(term298955, term298955.getClass(), "date", term298956);
        setByteField(term298960, term298960.getClass(), "hour", (byte) 7);
        setByteField(term298960, term298960.getClass(), "minute", (byte) 33);
        setByteField(term298960, term298960.getClass(), "second", (byte) 34);
        setIntField(term298960, term298960.getClass(), "nano", 44254399);
        setField(term298955, term298955.getClass(), "time", term298960);
        setField(term298796, term298796.getClass(), "firstPlayDate", term298955);
        setField(term298796, term298796.getClass(), "lastGameId", "mbuEVrmMpD");
        setField(term298796, term298796.getClass(), "lastRomVersion", "gQGlISxORX");
        setField(term298796, term298796.getClass(), "lastDataVersion", "IhgSPsiEAp");
        setIntField(term299002, term299002.getClass(), "year", 2016);
        setShortField(term299002, term299002.getClass(), "month", (short) 11);
        setShortField(term299002, term299002.getClass(), "day", (short) 13);
        setField(term299001, term299001.getClass(), "date", term299002);
        setByteField(term299006, term299006.getClass(), "hour", (byte) 19);
        setByteField(term299006, term299006.getClass(), "minute", (byte) 34);
        setByteField(term299006, term299006.getClass(), "second", (byte) 50);
        setIntField(term299006, term299006.getClass(), "nano", 844196128);
        setField(term299001, term299001.getClass(), "time", term299006);
        setField(term298796, term298796.getClass(), "lastPlayDate", term299001);
        setIntField(term298796, term298796.getClass(), "lastPlaceId", -1241638653);
        setField(term298796, term298796.getClass(), "lastPlaceName", "VIiDjdCWsX");
        setField(term298796, term298796.getClass(), "lastRegionId", "HUpXsvCasn");
        setField(term298796, term298796.getClass(), "lastRegionName", "gxKFHEvCMQ");
        setField(term298796, term298796.getClass(), "lastAllNetId", "WGrgiaSQnl");
        setField(term298796, term298796.getClass(), "lastClientId", "FdPORhHvkS");
        setField(term298794, term298794.getClass(), "user", term298796);
        setIntField(term298794, term298794.getClass(), "kind", -832082737);
        setIntField(term298794, term298794.getClass(), "activityId", 659361179);
        setIntField(term298794, term298794.getClass(), "sortNumber", 1762459373);
        setIntField(term298794, term298794.getClass(), "param1", 542713324);
        setIntField(term298794, term298794.getClass(), "param2", 193960798);
        setIntField(term298794, term298794.getClass(), "param3", -2096728827);
        setIntField(term298794, term298794.getClass(), "param4", 1007899485);
        term299079 = new Integer(509496894);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserActivity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term299079;
        callMethod(klass, "setParam2", argTypes, term298794, args);
    }

};


