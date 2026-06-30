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

public class UserGameOptionEx_getExt9_89440170311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term314511;

    public UserGameOptionEx_getExt9_89440170311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term314517 = new Long(3660520943100987842L);
        term314511 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOptionEx"));
        Object term314513 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term314515 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term314531 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term314532 = newInstance(Class.forName("java.time.LocalDate"));
        Object term314536 = newInstance(Class.forName("java.time.LocalTime"));
        Object term314541 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term314542 = newInstance(Class.forName("java.time.LocalDate"));
        Object term314546 = newInstance(Class.forName("java.time.LocalTime"));
        Object term314563 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term314564 = newInstance(Class.forName("java.time.LocalDate"));
        Object term314568 = newInstance(Class.forName("java.time.LocalTime"));
        Object term314624 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term314625 = newInstance(Class.forName("java.time.LocalDate"));
        Object term314629 = newInstance(Class.forName("java.time.LocalTime"));
        Object term314672 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term314673 = newInstance(Class.forName("java.time.LocalDate"));
        Object term314677 = newInstance(Class.forName("java.time.LocalTime"));
        Object term314718 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term314719 = newInstance(Class.forName("java.time.LocalDate"));
        Object term314723 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term314511, term314511.getClass(), "id", -865131657054854580L);
        setLongField(term314513, term314513.getClass(), "id", 1011331685296452545L);
        setLongField(term314515, term314515.getClass(), "id", 5146027058171164355L);
        setField(term314515, term314515.getClass(), "extId", term314517);
        setField(term314515, term314515.getClass(), "luid", "HqjQGEpUiH");
        setIntField(term314532, term314532.getClass(), "year", 2013);
        setShortField(term314532, term314532.getClass(), "month", (short) 4);
        setShortField(term314532, term314532.getClass(), "day", (short) 25);
        setField(term314531, term314531.getClass(), "date", term314532);
        setByteField(term314536, term314536.getClass(), "hour", (byte) 9);
        setByteField(term314536, term314536.getClass(), "minute", (byte) 59);
        setByteField(term314536, term314536.getClass(), "second", (byte) 14);
        setIntField(term314536, term314536.getClass(), "nano", 568257571);
        setField(term314531, term314531.getClass(), "time", term314536);
        setField(term314515, term314515.getClass(), "registerTime", term314531);
        setIntField(term314542, term314542.getClass(), "year", 2018);
        setShortField(term314542, term314542.getClass(), "month", (short) 2);
        setShortField(term314542, term314542.getClass(), "day", (short) 16);
        setField(term314541, term314541.getClass(), "date", term314542);
        setByteField(term314546, term314546.getClass(), "hour", (byte) 1);
        setByteField(term314546, term314546.getClass(), "minute", (byte) 18);
        setByteField(term314546, term314546.getClass(), "second", (byte) 11);
        setIntField(term314546, term314546.getClass(), "nano", 916075371);
        setField(term314541, term314541.getClass(), "time", term314546);
        setField(term314515, term314515.getClass(), "accessTime", term314541);
        setField(term314513, term314513.getClass(), "card", term314515);
        setField(term314513, term314513.getClass(), "userName", "BtiUMsmVbh");
        setIntField(term314564, term314564.getClass(), "year", 2011);
        setShortField(term314564, term314564.getClass(), "month", (short) 4);
        setShortField(term314564, term314564.getClass(), "day", (short) 4);
        setField(term314563, term314563.getClass(), "date", term314564);
        setByteField(term314568, term314568.getClass(), "hour", (byte) 20);
        setByteField(term314568, term314568.getClass(), "minute", (byte) 0);
        setByteField(term314568, term314568.getClass(), "second", (byte) 40);
        setIntField(term314568, term314568.getClass(), "nano", 431461674);
        setField(term314563, term314563.getClass(), "time", term314568);
        setField(term314513, term314513.getClass(), "lastLoginDate", term314563);
        setBooleanField(term314513, term314513.getClass(), "isWebJoin", false);
        setField(term314513, term314513.getClass(), "webLimitDate", "INHNqaImEM");
        setIntField(term314513, term314513.getClass(), "level", -1268575411);
        setIntField(term314513, term314513.getClass(), "reincarnationNum", 1668826386);
        setField(term314513, term314513.getClass(), "exp", "vPIneuzFyr");
        setLongField(term314513, term314513.getClass(), "point", -2692218180683745222L);
        setLongField(term314513, term314513.getClass(), "totalPoint", -1619797161891252512L);
        setIntField(term314513, term314513.getClass(), "playCount", 1361977398);
        setIntField(term314513, term314513.getClass(), "multiPlayCount", 188661554);
        setIntField(term314513, term314513.getClass(), "multiWinCount", -2020298839);
        setIntField(term314513, term314513.getClass(), "requestResCount", -1799370620);
        setIntField(term314513, term314513.getClass(), "acceptResCount", -43905327);
        setIntField(term314513, term314513.getClass(), "successResCount", -1939600597);
        setIntField(term314513, term314513.getClass(), "playerRating", -1029523143);
        setIntField(term314513, term314513.getClass(), "highestRating", 1000414163);
        setIntField(term314513, term314513.getClass(), "nameplateId", -112032066);
        setIntField(term314513, term314513.getClass(), "frameId", 599757412);
        setIntField(term314513, term314513.getClass(), "characterId", 1560593676);
        setIntField(term314513, term314513.getClass(), "trophyId", -1022472400);
        setIntField(term314513, term314513.getClass(), "playedTutorialBit", -2027830462);
        setIntField(term314513, term314513.getClass(), "firstTutorialCancelNum", 1123640429);
        setIntField(term314513, term314513.getClass(), "masterTutorialCancelNum", -1849340559);
        setIntField(term314513, term314513.getClass(), "totalRepertoireCount", -984948165);
        setIntField(term314513, term314513.getClass(), "totalMapNum", -841056494);
        setLongField(term314513, term314513.getClass(), "totalHiScore", 6115895261247894187L);
        setLongField(term314513, term314513.getClass(), "totalBasicHighScore", 7095337677763783504L);
        setLongField(term314513, term314513.getClass(), "totalAdvancedHighScore", 9169174050186427729L);
        setLongField(term314513, term314513.getClass(), "totalExpertHighScore", 531403575031340860L);
        setLongField(term314513, term314513.getClass(), "totalMasterHighScore", -8005402419576701688L);
        setIntField(term314625, term314625.getClass(), "year", 2022);
        setShortField(term314625, term314625.getClass(), "month", (short) 7);
        setShortField(term314625, term314625.getClass(), "day", (short) 16);
        setField(term314624, term314624.getClass(), "date", term314625);
        setByteField(term314629, term314629.getClass(), "hour", (byte) 16);
        setByteField(term314629, term314629.getClass(), "minute", (byte) 6);
        setByteField(term314629, term314629.getClass(), "second", (byte) 30);
        setIntField(term314629, term314629.getClass(), "nano", 611173909);
        setField(term314624, term314624.getClass(), "time", term314629);
        setField(term314513, term314513.getClass(), "eventWatchedDate", term314624);
        setIntField(term314513, term314513.getClass(), "friendCount", 1087542157);
        setBooleanField(term314513, term314513.getClass(), "isMaimai", false);
        setField(term314513, term314513.getClass(), "firstGameId", "eGDUBxxnZQ");
        setField(term314513, term314513.getClass(), "firstRomVersion", "mFAJYTcPxb");
        setField(term314513, term314513.getClass(), "firstDataVersion", "kEeOXwuQLs");
        setIntField(term314673, term314673.getClass(), "year", 2011);
        setShortField(term314673, term314673.getClass(), "month", (short) 2);
        setShortField(term314673, term314673.getClass(), "day", (short) 28);
        setField(term314672, term314672.getClass(), "date", term314673);
        setByteField(term314677, term314677.getClass(), "hour", (byte) 4);
        setByteField(term314677, term314677.getClass(), "minute", (byte) 38);
        setByteField(term314677, term314677.getClass(), "second", (byte) 5);
        setIntField(term314677, term314677.getClass(), "nano", 892053767);
        setField(term314672, term314672.getClass(), "time", term314677);
        setField(term314513, term314513.getClass(), "firstPlayDate", term314672);
        setField(term314513, term314513.getClass(), "lastGameId", "MyeSojBBPn");
        setField(term314513, term314513.getClass(), "lastRomVersion", "IBEiicEMis");
        setField(term314513, term314513.getClass(), "lastDataVersion", "bWUMMMnrsO");
        setIntField(term314719, term314719.getClass(), "year", 2024);
        setShortField(term314719, term314719.getClass(), "month", (short) 3);
        setShortField(term314719, term314719.getClass(), "day", (short) 25);
        setField(term314718, term314718.getClass(), "date", term314719);
        setByteField(term314723, term314723.getClass(), "hour", (byte) 5);
        setByteField(term314723, term314723.getClass(), "minute", (byte) 48);
        setByteField(term314723, term314723.getClass(), "second", (byte) 58);
        setIntField(term314723, term314723.getClass(), "nano", 996017093);
        setField(term314718, term314718.getClass(), "time", term314723);
        setField(term314513, term314513.getClass(), "lastPlayDate", term314718);
        setIntField(term314513, term314513.getClass(), "lastPlaceId", 694255273);
        setField(term314513, term314513.getClass(), "lastPlaceName", "QMuSzIUAqW");
        setField(term314513, term314513.getClass(), "lastRegionId", "ecDNTpPdOH");
        setField(term314513, term314513.getClass(), "lastRegionName", "BsVYnEehhF");
        setField(term314513, term314513.getClass(), "lastAllNetId", "YwJlByssSF");
        setField(term314513, term314513.getClass(), "lastClientId", "EWbLFcROZq");
        setField(term314511, term314511.getClass(), "user", term314513);
        setIntField(term314511, term314511.getClass(), "ext1", 1611637924);
        setIntField(term314511, term314511.getClass(), "ext2", 936243753);
        setIntField(term314511, term314511.getClass(), "ext3", -803028984);
        setIntField(term314511, term314511.getClass(), "ext4", 1233951453);
        setIntField(term314511, term314511.getClass(), "ext5", -210141931);
        setIntField(term314511, term314511.getClass(), "ext6", 1459050716);
        setIntField(term314511, term314511.getClass(), "ext7", -1995664477);
        setIntField(term314511, term314511.getClass(), "ext8", 1563502930);
        setIntField(term314511, term314511.getClass(), "ext9", -1763493297);
        setIntField(term314511, term314511.getClass(), "ext10", 1559779370);
        setIntField(term314511, term314511.getClass(), "ext11", 369095015);
        setIntField(term314511, term314511.getClass(), "ext12", 905536730);
        setIntField(term314511, term314511.getClass(), "ext13", 1579733651);
        setIntField(term314511, term314511.getClass(), "ext14", 734712664);
        setIntField(term314511, term314511.getClass(), "ext15", 1380507045);
        setIntField(term314511, term314511.getClass(), "ext16", -817128051);
        setIntField(term314511, term314511.getClass(), "ext17", 1221899586);
        setIntField(term314511, term314511.getClass(), "ext18", 1587152573);
        setIntField(term314511, term314511.getClass(), "ext19", 374759994);
        setIntField(term314511, term314511.getClass(), "ext20", 1614709177);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOptionEx");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExt9", argTypes, term314511, args);
    }

};


