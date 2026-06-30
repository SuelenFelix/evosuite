package icu.samnyan.aqua.sega.maimai2.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai2.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;
import java.util.ArrayList;
import java.lang.Integer;

public class UserDetail_setComboCount_1165172671131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4304342;
     Object term4304703;

    public UserDetail_setComboCount_1165172671131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4304346 = new Long(-4152905340342113900L);
        Integer term4304409 = new Integer(-270196134);
        Integer term4304411 = new Integer(-518906199);
        Integer term4304413 = new Integer(913561629);
        Integer term4304415 = new Integer(-82780836);
        Integer term4304417 = new Integer(-1538850204);
        Integer term4304419 = new Integer(-2037783207);
        ArrayList term4304407 = new ArrayList();
        ((ArrayList) term4304407).add(term4304409);
        ((ArrayList) term4304407).add(term4304411);
        ((ArrayList) term4304407).add(term4304413);
        ((ArrayList) term4304407).add(term4304415);
        ((ArrayList) term4304407).add(term4304417);
        ((ArrayList) term4304407).add(term4304419);
        Integer term4304425 = new Integer(799731049);
        Integer term4304427 = new Integer(1446415915);
        Integer term4304429 = new Integer(1616695923);
        Integer term4304431 = new Integer(-1952633376);
        Integer term4304433 = new Integer(-2077418776);
        ArrayList term4304423 = new ArrayList();
        ((ArrayList) term4304423).add(term4304425);
        ((ArrayList) term4304423).add(term4304427);
        ((ArrayList) term4304423).add(term4304429);
        ((ArrayList) term4304423).add(term4304431);
        ((ArrayList) term4304423).add(term4304433);
        term4304342 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4304344 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4304360 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4304361 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4304365 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4304370 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4304371 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4304375 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4304342, term4304342.getClass(), "id", -8073107309666042086L);
        setLongField(term4304344, term4304344.getClass(), "id", -6417653423217472412L);
        setField(term4304344, term4304344.getClass(), "extId", term4304346);
        setField(term4304344, term4304344.getClass(), "luid", "mjcDptagyb");
        setIntField(term4304361, term4304361.getClass(), "year", 2025);
        setShortField(term4304361, term4304361.getClass(), "month", (short) 8);
        setShortField(term4304361, term4304361.getClass(), "day", (short) 18);
        setField(term4304360, term4304360.getClass(), "date", term4304361);
        setByteField(term4304365, term4304365.getClass(), "hour", (byte) 22);
        setByteField(term4304365, term4304365.getClass(), "minute", (byte) 16);
        setByteField(term4304365, term4304365.getClass(), "second", (byte) 57);
        setIntField(term4304365, term4304365.getClass(), "nano", 507441552);
        setField(term4304360, term4304360.getClass(), "time", term4304365);
        setField(term4304344, term4304344.getClass(), "registerTime", term4304360);
        setIntField(term4304371, term4304371.getClass(), "year", 2029);
        setShortField(term4304371, term4304371.getClass(), "month", (short) 5);
        setShortField(term4304371, term4304371.getClass(), "day", (short) 31);
        setField(term4304370, term4304370.getClass(), "date", term4304371);
        setByteField(term4304375, term4304375.getClass(), "hour", (byte) 19);
        setByteField(term4304375, term4304375.getClass(), "minute", (byte) 3);
        setByteField(term4304375, term4304375.getClass(), "second", (byte) 40);
        setIntField(term4304375, term4304375.getClass(), "nano", 523579730);
        setField(term4304370, term4304370.getClass(), "time", term4304375);
        setField(term4304344, term4304344.getClass(), "accessTime", term4304370);
        setField(term4304342, term4304342.getClass(), "card", term4304344);
        setField(term4304342, term4304342.getClass(), "userName", "UfnOolNcfN");
        setIntField(term4304342, term4304342.getClass(), "isNetMember", -1280869616);
        setIntField(term4304342, term4304342.getClass(), "iconId", 123652735);
        setIntField(term4304342, term4304342.getClass(), "plateId", -1480165938);
        setIntField(term4304342, term4304342.getClass(), "titleId", 427326631);
        setIntField(term4304342, term4304342.getClass(), "partnerId", -1760278547);
        setIntField(term4304342, term4304342.getClass(), "frameId", -1760877180);
        setIntField(term4304342, term4304342.getClass(), "selectMapId", -470253937);
        setIntField(term4304342, term4304342.getClass(), "totalAwake", 1889390489);
        setIntField(term4304342, term4304342.getClass(), "gradeRating", 154648475);
        setIntField(term4304342, term4304342.getClass(), "musicRating", -403392165);
        setIntField(term4304342, term4304342.getClass(), "playerRating", -1735713571);
        setIntField(term4304342, term4304342.getClass(), "highestRating", -1099619524);
        setIntField(term4304342, term4304342.getClass(), "gradeRank", 1919693867);
        setIntField(term4304342, term4304342.getClass(), "classRank", -118639610);
        setIntField(term4304342, term4304342.getClass(), "courseRank", 1592530317);
        setField(term4304342, term4304342.getClass(), "charaSlot", term4304407);
        setField(term4304342, term4304342.getClass(), "charaLockSlot", term4304423);
        setLongField(term4304342, term4304342.getClass(), "contentBit", 858682866498876738L);
        setIntField(term4304342, term4304342.getClass(), "playCount", 308207150);
        setField(term4304342, term4304342.getClass(), "eventWatchedDate", "vciZtyjmiF");
        setField(term4304342, term4304342.getClass(), "lastGameId", "aPAhXaPdLf");
        setField(term4304342, term4304342.getClass(), "lastRomVersion", "BWrMNPwhiJ");
        setField(term4304342, term4304342.getClass(), "lastDataVersion", "IUHyOINtSr");
        setField(term4304342, term4304342.getClass(), "lastLoginDate", "VVcEULfjRD");
        setField(term4304342, term4304342.getClass(), "lastPlayDate", "qQfyLaJGQo");
        setIntField(term4304342, term4304342.getClass(), "lastPlayCredit", 823203458);
        setIntField(term4304342, term4304342.getClass(), "lastPlayMode", -1683103170);
        setIntField(term4304342, term4304342.getClass(), "lastPlaceId", 556741071);
        setField(term4304342, term4304342.getClass(), "lastPlaceName", "yHfOJnxfyr");
        setIntField(term4304342, term4304342.getClass(), "lastAllNetId", -1164657270);
        setIntField(term4304342, term4304342.getClass(), "lastRegionId", -2065603201);
        setField(term4304342, term4304342.getClass(), "lastRegionName", "IAzILdTMTs");
        setField(term4304342, term4304342.getClass(), "lastClientId", "koXKovAimu");
        setField(term4304342, term4304342.getClass(), "lastCountryCode", "DFvAdYRiyd");
        setIntField(term4304342, term4304342.getClass(), "lastSelectEMoney", -39167541);
        setIntField(term4304342, term4304342.getClass(), "lastSelectTicket", -27706117);
        setIntField(term4304342, term4304342.getClass(), "lastSelectCourse", -1060767399);
        setIntField(term4304342, term4304342.getClass(), "lastCountCourse", 421489506);
        setField(term4304342, term4304342.getClass(), "firstGameId", "EwNVMuMDXt");
        setField(term4304342, term4304342.getClass(), "firstRomVersion", "bGPKgxftmw");
        setField(term4304342, term4304342.getClass(), "firstDataVersion", "gQusoSRAsI");
        setField(term4304342, term4304342.getClass(), "firstPlayDate", "zbqfKmkoCd");
        setField(term4304342, term4304342.getClass(), "compatibleCmVersion", "wOQmLkPqmH");
        setField(term4304342, term4304342.getClass(), "dailyBonusDate", "ulEmJfwvGE");
        setField(term4304342, term4304342.getClass(), "dailyCourseBonusDate", "STtIqFpuQM");
        setField(term4304342, term4304342.getClass(), "lastPairLoginDate", "igsScenOIF");
        setField(term4304342, term4304342.getClass(), "lastTrialPlayDate", "rqCjReQHIt");
        setIntField(term4304342, term4304342.getClass(), "playVsCount", 420279574);
        setIntField(term4304342, term4304342.getClass(), "playSyncCount", 20355728);
        setIntField(term4304342, term4304342.getClass(), "winCount", 1374469192);
        setIntField(term4304342, term4304342.getClass(), "helpCount", 1978953067);
        setIntField(term4304342, term4304342.getClass(), "comboCount", 359625723);
        setLongField(term4304342, term4304342.getClass(), "totalDeluxscore", -4682535978781189757L);
        setLongField(term4304342, term4304342.getClass(), "totalBasicDeluxscore", -3092803422322831309L);
        setLongField(term4304342, term4304342.getClass(), "totalAdvancedDeluxscore", 1926075083054789644L);
        setLongField(term4304342, term4304342.getClass(), "totalExpertDeluxscore", -3474190251296119836L);
        setLongField(term4304342, term4304342.getClass(), "totalMasterDeluxscore", -7567925595342593652L);
        setLongField(term4304342, term4304342.getClass(), "totalReMasterDeluxscore", -7726368604506291269L);
        setIntField(term4304342, term4304342.getClass(), "totalSync", -1963542408);
        setIntField(term4304342, term4304342.getClass(), "totalBasicSync", 433513115);
        setIntField(term4304342, term4304342.getClass(), "totalAdvancedSync", 1982411201);
        setIntField(term4304342, term4304342.getClass(), "totalExpertSync", 1441224164);
        setIntField(term4304342, term4304342.getClass(), "totalMasterSync", 1452663184);
        setIntField(term4304342, term4304342.getClass(), "totalReMasterSync", 1409758306);
        setLongField(term4304342, term4304342.getClass(), "totalAchievement", -6339462026029440017L);
        setLongField(term4304342, term4304342.getClass(), "totalBasicAchievement", 3545054683048648566L);
        setLongField(term4304342, term4304342.getClass(), "totalAdvancedAchievement", -8489270901992621315L);
        setLongField(term4304342, term4304342.getClass(), "totalExpertAchievement", -4903107740155327922L);
        setLongField(term4304342, term4304342.getClass(), "totalMasterAchievement", 7211929507232070183L);
        setLongField(term4304342, term4304342.getClass(), "totalReMasterAchievement", -1003051421977079719L);
        setLongField(term4304342, term4304342.getClass(), "playerOldRating", 7585403169612363396L);
        setLongField(term4304342, term4304342.getClass(), "playerNewRating", 3125360181105278511L);
        setIntField(term4304342, term4304342.getClass(), "banState", -1857650795);
        setLongField(term4304342, term4304342.getClass(), "dateTime", 1826075933681193237L);
        term4304703 = new Integer(-1792229101);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4304703;
        callMethod(klass, "setComboCount", argTypes, term4304342, args);
    }

};


