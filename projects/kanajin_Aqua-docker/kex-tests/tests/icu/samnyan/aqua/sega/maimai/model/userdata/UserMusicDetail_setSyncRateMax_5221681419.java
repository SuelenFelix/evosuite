package icu.samnyan.aqua.sega.maimai.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;
import java.lang.Integer;

public class UserMusicDetail_setSyncRateMax_5221681419 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term185435;
     Object term185621;

    public UserMusicDetail_setSyncRateMax_5221681419() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term185441 = new Long(5047215164896153648L);
        term185435 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserMusicDetail"));
        Object term185437 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term185439 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term185455 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term185456 = newInstance(Class.forName("java.time.LocalDate"));
        Object term185460 = newInstance(Class.forName("java.time.LocalTime"));
        Object term185465 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term185466 = newInstance(Class.forName("java.time.LocalDate"));
        Object term185470 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term185435, term185435.getClass(), "id", -1133623154868596434L);
        setLongField(term185437, term185437.getClass(), "id", -7907370981376515453L);
        setLongField(term185439, term185439.getClass(), "id", 912529279953387872L);
        setField(term185439, term185439.getClass(), "extId", term185441);
        setField(term185439, term185439.getClass(), "luid", "JIYvHbwfiy");
        setIntField(term185456, term185456.getClass(), "year", 2024);
        setShortField(term185456, term185456.getClass(), "month", (short) 4);
        setShortField(term185456, term185456.getClass(), "day", (short) 4);
        setField(term185455, term185455.getClass(), "date", term185456);
        setByteField(term185460, term185460.getClass(), "hour", (byte) 21);
        setByteField(term185460, term185460.getClass(), "minute", (byte) 32);
        setByteField(term185460, term185460.getClass(), "second", (byte) 44);
        setIntField(term185460, term185460.getClass(), "nano", 890583556);
        setField(term185455, term185455.getClass(), "time", term185460);
        setField(term185439, term185439.getClass(), "registerTime", term185455);
        setIntField(term185466, term185466.getClass(), "year", 2024);
        setShortField(term185466, term185466.getClass(), "month", (short) 2);
        setShortField(term185466, term185466.getClass(), "day", (short) 18);
        setField(term185465, term185465.getClass(), "date", term185466);
        setByteField(term185470, term185470.getClass(), "hour", (byte) 2);
        setByteField(term185470, term185470.getClass(), "minute", (byte) 30);
        setByteField(term185470, term185470.getClass(), "second", (byte) 53);
        setIntField(term185470, term185470.getClass(), "nano", 510978511);
        setField(term185465, term185465.getClass(), "time", term185470);
        setField(term185439, term185439.getClass(), "accessTime", term185465);
        setField(term185437, term185437.getClass(), "card", term185439);
        setIntField(term185437, term185437.getClass(), "lastDataVersion", -151975583);
        setField(term185437, term185437.getClass(), "userName", "YheKvmZTNn");
        setIntField(term185437, term185437.getClass(), "point", 512142844);
        setIntField(term185437, term185437.getClass(), "totalPoint", 1431469010);
        setIntField(term185437, term185437.getClass(), "iconId", -572433456);
        setIntField(term185437, term185437.getClass(), "nameplateId", 1918188503);
        setIntField(term185437, term185437.getClass(), "frameId", -1028237459);
        setIntField(term185437, term185437.getClass(), "trophyId", -2014249321);
        setIntField(term185437, term185437.getClass(), "playCount", -1811289877);
        setIntField(term185437, term185437.getClass(), "playVsCount", -2138351988);
        setIntField(term185437, term185437.getClass(), "playSyncCount", -667844036);
        setIntField(term185437, term185437.getClass(), "winCount", 1613117337);
        setIntField(term185437, term185437.getClass(), "helpCount", 906019813);
        setIntField(term185437, term185437.getClass(), "comboCount", -1968619562);
        setIntField(term185437, term185437.getClass(), "feverCount", 1552657763);
        setIntField(term185437, term185437.getClass(), "totalHiScore", 716467535);
        setIntField(term185437, term185437.getClass(), "totalEasyHighScore", 623661019);
        setIntField(term185437, term185437.getClass(), "totalBasicHighScore", 1861359165);
        setIntField(term185437, term185437.getClass(), "totalAdvancedHighScore", 279977482);
        setIntField(term185437, term185437.getClass(), "totalExpertHighScore", -1928066935);
        setIntField(term185437, term185437.getClass(), "totalMasterHighScore", -1119292784);
        setIntField(term185437, term185437.getClass(), "totalReMasterHighScore", -982747498);
        setIntField(term185437, term185437.getClass(), "totalHighSync", -1572622840);
        setIntField(term185437, term185437.getClass(), "totalEasySync", -581756252);
        setIntField(term185437, term185437.getClass(), "totalBasicSync", 1628958864);
        setIntField(term185437, term185437.getClass(), "totalAdvancedSync", -1991340208);
        setIntField(term185437, term185437.getClass(), "totalExpertSync", -1854505303);
        setIntField(term185437, term185437.getClass(), "totalMasterSync", 665490168);
        setIntField(term185437, term185437.getClass(), "totalReMasterSync", -941791336);
        setIntField(term185437, term185437.getClass(), "playerRating", -758672115);
        setIntField(term185437, term185437.getClass(), "highestRating", 452432817);
        setIntField(term185437, term185437.getClass(), "rankAuthTailId", 137156501);
        setField(term185437, term185437.getClass(), "eventWatchedDate", "cLPBTxvmBL");
        setField(term185437, term185437.getClass(), "webLimitDate", "BqBLmrxQoP");
        setIntField(term185437, term185437.getClass(), "challengeTrackPhase", 1742277429);
        setIntField(term185437, term185437.getClass(), "firstPlayBits", -988582796);
        setField(term185437, term185437.getClass(), "lastPlayDate", "wGTLHXqSLS");
        setIntField(term185437, term185437.getClass(), "lastPlaceId", -1470588255);
        setField(term185437, term185437.getClass(), "lastPlaceName", "vcDcmZWIgW");
        setIntField(term185437, term185437.getClass(), "lastRegionId", -721898193);
        setField(term185437, term185437.getClass(), "lastRegionName", "hpFqndTGJq");
        setField(term185437, term185437.getClass(), "lastClientId", "aLNaauObcW");
        setField(term185437, term185437.getClass(), "lastCountryCode", "rKOiGTBanj");
        setIntField(term185437, term185437.getClass(), "eventPoint", -25458774);
        setIntField(term185437, term185437.getClass(), "totalLv", 1715379525);
        setIntField(term185437, term185437.getClass(), "lastLoginBonusDay", 693133880);
        setIntField(term185437, term185437.getClass(), "lastSurvivalBonusDay", -57222570);
        setIntField(term185437, term185437.getClass(), "loginBonusLv", 1725214486);
        setField(term185435, term185435.getClass(), "user", term185437);
        setIntField(term185435, term185435.getClass(), "musicId", -1110580563);
        setIntField(term185435, term185435.getClass(), "level", -1842428356);
        setIntField(term185435, term185435.getClass(), "playCount", 1406620137);
        setIntField(term185435, term185435.getClass(), "scoreMax", 936694998);
        setIntField(term185435, term185435.getClass(), "syncRateMax", -421663526);
        setBooleanField(term185435, term185435.getClass(), "isAllPerfect", false);
        setIntField(term185435, term185435.getClass(), "isAllPerfectPlus", -407039111);
        setIntField(term185435, term185435.getClass(), "fullCombo", 1776791756);
        setIntField(term185435, term185435.getClass(), "maxFever", -1195508953);
        setIntField(term185435, term185435.getClass(), "achievement", 512042962);
        term185621 = new Integer(1525819402);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term185621;
        callMethod(klass, "setSyncRateMax", argTypes, term185435, args);
    }

};


