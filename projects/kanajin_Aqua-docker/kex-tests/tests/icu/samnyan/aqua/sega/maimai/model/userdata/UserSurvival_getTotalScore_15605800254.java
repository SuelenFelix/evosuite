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

public class UserSurvival_getTotalScore_15605800254 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term102966;

    public UserSurvival_getTotalScore_15605800254() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term102972 = new Long(4742108233936970770L);
        term102966 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserSurvival"));
        Object term102968 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term102970 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term102986 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term102987 = newInstance(Class.forName("java.time.LocalDate"));
        Object term102991 = newInstance(Class.forName("java.time.LocalTime"));
        Object term102996 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term102997 = newInstance(Class.forName("java.time.LocalDate"));
        Object term103001 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term102966, term102966.getClass(), "id", -1571430290273452440L);
        setLongField(term102968, term102968.getClass(), "id", -8441035120108438069L);
        setLongField(term102970, term102970.getClass(), "id", -715683813342234891L);
        setField(term102970, term102970.getClass(), "extId", term102972);
        setField(term102970, term102970.getClass(), "luid", "wcVhMnVVMH");
        setIntField(term102987, term102987.getClass(), "year", 2020);
        setShortField(term102987, term102987.getClass(), "month", (short) 8);
        setShortField(term102987, term102987.getClass(), "day", (short) 5);
        setField(term102986, term102986.getClass(), "date", term102987);
        setByteField(term102991, term102991.getClass(), "hour", (byte) 12);
        setByteField(term102991, term102991.getClass(), "minute", (byte) 1);
        setByteField(term102991, term102991.getClass(), "second", (byte) 26);
        setIntField(term102991, term102991.getClass(), "nano", 71456472);
        setField(term102986, term102986.getClass(), "time", term102991);
        setField(term102970, term102970.getClass(), "registerTime", term102986);
        setIntField(term102997, term102997.getClass(), "year", 2011);
        setShortField(term102997, term102997.getClass(), "month", (short) 11);
        setShortField(term102997, term102997.getClass(), "day", (short) 10);
        setField(term102996, term102996.getClass(), "date", term102997);
        setByteField(term103001, term103001.getClass(), "hour", (byte) 6);
        setByteField(term103001, term103001.getClass(), "minute", (byte) 13);
        setByteField(term103001, term103001.getClass(), "second", (byte) 21);
        setIntField(term103001, term103001.getClass(), "nano", 381837054);
        setField(term102996, term102996.getClass(), "time", term103001);
        setField(term102970, term102970.getClass(), "accessTime", term102996);
        setField(term102968, term102968.getClass(), "card", term102970);
        setIntField(term102968, term102968.getClass(), "lastDataVersion", 538423507);
        setField(term102968, term102968.getClass(), "userName", "EUWyNZxbWR");
        setIntField(term102968, term102968.getClass(), "point", 1371984304);
        setIntField(term102968, term102968.getClass(), "totalPoint", 1647027332);
        setIntField(term102968, term102968.getClass(), "iconId", -1728711778);
        setIntField(term102968, term102968.getClass(), "nameplateId", 800733694);
        setIntField(term102968, term102968.getClass(), "frameId", 1960110038);
        setIntField(term102968, term102968.getClass(), "trophyId", 1089415716);
        setIntField(term102968, term102968.getClass(), "playCount", 2091132733);
        setIntField(term102968, term102968.getClass(), "playVsCount", 163419995);
        setIntField(term102968, term102968.getClass(), "playSyncCount", -1077085727);
        setIntField(term102968, term102968.getClass(), "winCount", 839351605);
        setIntField(term102968, term102968.getClass(), "helpCount", 585407284);
        setIntField(term102968, term102968.getClass(), "comboCount", -1453114237);
        setIntField(term102968, term102968.getClass(), "feverCount", 1408014748);
        setIntField(term102968, term102968.getClass(), "totalHiScore", -1808362201);
        setIntField(term102968, term102968.getClass(), "totalEasyHighScore", -1948153194);
        setIntField(term102968, term102968.getClass(), "totalBasicHighScore", 847610205);
        setIntField(term102968, term102968.getClass(), "totalAdvancedHighScore", 278413809);
        setIntField(term102968, term102968.getClass(), "totalExpertHighScore", 917959261);
        setIntField(term102968, term102968.getClass(), "totalMasterHighScore", 919466486);
        setIntField(term102968, term102968.getClass(), "totalReMasterHighScore", -1201638276);
        setIntField(term102968, term102968.getClass(), "totalHighSync", 1343406968);
        setIntField(term102968, term102968.getClass(), "totalEasySync", -279850700);
        setIntField(term102968, term102968.getClass(), "totalBasicSync", 2061426713);
        setIntField(term102968, term102968.getClass(), "totalAdvancedSync", -1674907707);
        setIntField(term102968, term102968.getClass(), "totalExpertSync", -161061296);
        setIntField(term102968, term102968.getClass(), "totalMasterSync", 1870072131);
        setIntField(term102968, term102968.getClass(), "totalReMasterSync", 2143067629);
        setIntField(term102968, term102968.getClass(), "playerRating", 1813631828);
        setIntField(term102968, term102968.getClass(), "highestRating", 1323160882);
        setIntField(term102968, term102968.getClass(), "rankAuthTailId", 1113398500);
        setField(term102968, term102968.getClass(), "eventWatchedDate", "TaoriKlxVP");
        setField(term102968, term102968.getClass(), "webLimitDate", "CDKCMwdzTR");
        setIntField(term102968, term102968.getClass(), "challengeTrackPhase", 80339386);
        setIntField(term102968, term102968.getClass(), "firstPlayBits", 10586783);
        setField(term102968, term102968.getClass(), "lastPlayDate", "ehviwWrUip");
        setIntField(term102968, term102968.getClass(), "lastPlaceId", 1404577219);
        setField(term102968, term102968.getClass(), "lastPlaceName", "LNsNBvvYgQ");
        setIntField(term102968, term102968.getClass(), "lastRegionId", -1718338317);
        setField(term102968, term102968.getClass(), "lastRegionName", "VGKsvldNNB");
        setField(term102968, term102968.getClass(), "lastClientId", "pfyJIgGkiH");
        setField(term102968, term102968.getClass(), "lastCountryCode", "lvQpEwdZeM");
        setIntField(term102968, term102968.getClass(), "eventPoint", 30310807);
        setIntField(term102968, term102968.getClass(), "totalLv", 1550335964);
        setIntField(term102968, term102968.getClass(), "lastLoginBonusDay", -1163619800);
        setIntField(term102968, term102968.getClass(), "lastSurvivalBonusDay", 853492949);
        setIntField(term102968, term102968.getClass(), "loginBonusLv", 1115052318);
        setField(term102966, term102966.getClass(), "user", term102968);
        setIntField(term102966, term102966.getClass(), "survivalId", -1113759328);
        setIntField(term102966, term102966.getClass(), "totalScore", 1682421727);
        setIntField(term102966, term102966.getClass(), "totalAchieve", 1305604796);
        setBooleanField(term102966, term102966.getClass(), "isClear", false);
        setBooleanField(term102966, term102966.getClass(), "isNoDamage", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserSurvival");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalScore", argTypes, term102966, args);
    }

};


