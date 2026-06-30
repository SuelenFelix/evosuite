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

public class UserBoss_getPandoraFlagList3_168828666 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90591;

    public UserBoss_getPandoraFlagList3_168828666() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term90597 = new Long(-6985556670871089725L);
        term90591 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserBoss"));
        Object term90593 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term90595 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term90611 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term90612 = newInstance(Class.forName("java.time.LocalDate"));
        Object term90616 = newInstance(Class.forName("java.time.LocalTime"));
        Object term90621 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term90622 = newInstance(Class.forName("java.time.LocalDate"));
        Object term90626 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term90591, term90591.getClass(), "id", 5067793047038594982L);
        setLongField(term90593, term90593.getClass(), "id", -1572808624189549793L);
        setLongField(term90595, term90595.getClass(), "id", -6151316713456472560L);
        setField(term90595, term90595.getClass(), "extId", term90597);
        setField(term90595, term90595.getClass(), "luid", "XLjtkfroHJ");
        setIntField(term90612, term90612.getClass(), "year", 2012);
        setShortField(term90612, term90612.getClass(), "month", (short) 2);
        setShortField(term90612, term90612.getClass(), "day", (short) 24);
        setField(term90611, term90611.getClass(), "date", term90612);
        setByteField(term90616, term90616.getClass(), "hour", (byte) 7);
        setByteField(term90616, term90616.getClass(), "minute", (byte) 19);
        setByteField(term90616, term90616.getClass(), "second", (byte) 47);
        setIntField(term90616, term90616.getClass(), "nano", 173778376);
        setField(term90611, term90611.getClass(), "time", term90616);
        setField(term90595, term90595.getClass(), "registerTime", term90611);
        setIntField(term90622, term90622.getClass(), "year", 2029);
        setShortField(term90622, term90622.getClass(), "month", (short) 3);
        setShortField(term90622, term90622.getClass(), "day", (short) 28);
        setField(term90621, term90621.getClass(), "date", term90622);
        setByteField(term90626, term90626.getClass(), "hour", (byte) 6);
        setByteField(term90626, term90626.getClass(), "minute", (byte) 43);
        setByteField(term90626, term90626.getClass(), "second", (byte) 8);
        setIntField(term90626, term90626.getClass(), "nano", 873338827);
        setField(term90621, term90621.getClass(), "time", term90626);
        setField(term90595, term90595.getClass(), "accessTime", term90621);
        setField(term90593, term90593.getClass(), "card", term90595);
        setIntField(term90593, term90593.getClass(), "lastDataVersion", 1383683097);
        setField(term90593, term90593.getClass(), "userName", "hdqypaATat");
        setIntField(term90593, term90593.getClass(), "point", 1395150060);
        setIntField(term90593, term90593.getClass(), "totalPoint", -1878396438);
        setIntField(term90593, term90593.getClass(), "iconId", 22205123);
        setIntField(term90593, term90593.getClass(), "nameplateId", 479068999);
        setIntField(term90593, term90593.getClass(), "frameId", -1528330666);
        setIntField(term90593, term90593.getClass(), "trophyId", -453088521);
        setIntField(term90593, term90593.getClass(), "playCount", -1951273050);
        setIntField(term90593, term90593.getClass(), "playVsCount", 924528463);
        setIntField(term90593, term90593.getClass(), "playSyncCount", 148137606);
        setIntField(term90593, term90593.getClass(), "winCount", 364962451);
        setIntField(term90593, term90593.getClass(), "helpCount", -368045173);
        setIntField(term90593, term90593.getClass(), "comboCount", -38776100);
        setIntField(term90593, term90593.getClass(), "feverCount", -1097669979);
        setIntField(term90593, term90593.getClass(), "totalHiScore", -1780432495);
        setIntField(term90593, term90593.getClass(), "totalEasyHighScore", 428202681);
        setIntField(term90593, term90593.getClass(), "totalBasicHighScore", 1573860785);
        setIntField(term90593, term90593.getClass(), "totalAdvancedHighScore", -774422538);
        setIntField(term90593, term90593.getClass(), "totalExpertHighScore", 1066017141);
        setIntField(term90593, term90593.getClass(), "totalMasterHighScore", -338312520);
        setIntField(term90593, term90593.getClass(), "totalReMasterHighScore", -1944265950);
        setIntField(term90593, term90593.getClass(), "totalHighSync", -1587031240);
        setIntField(term90593, term90593.getClass(), "totalEasySync", -1989664257);
        setIntField(term90593, term90593.getClass(), "totalBasicSync", -1910664616);
        setIntField(term90593, term90593.getClass(), "totalAdvancedSync", 487482309);
        setIntField(term90593, term90593.getClass(), "totalExpertSync", -579808690);
        setIntField(term90593, term90593.getClass(), "totalMasterSync", -1713470455);
        setIntField(term90593, term90593.getClass(), "totalReMasterSync", 216514040);
        setIntField(term90593, term90593.getClass(), "playerRating", 1192613481);
        setIntField(term90593, term90593.getClass(), "highestRating", -904848351);
        setIntField(term90593, term90593.getClass(), "rankAuthTailId", 381787538);
        setField(term90593, term90593.getClass(), "eventWatchedDate", "yXrHDHEipD");
        setField(term90593, term90593.getClass(), "webLimitDate", "pbqIeikQzp");
        setIntField(term90593, term90593.getClass(), "challengeTrackPhase", 1698188292);
        setIntField(term90593, term90593.getClass(), "firstPlayBits", -602012601);
        setField(term90593, term90593.getClass(), "lastPlayDate", "baLJgqNNUx");
        setIntField(term90593, term90593.getClass(), "lastPlaceId", 1074862789);
        setField(term90593, term90593.getClass(), "lastPlaceName", "GlPSGqVaBj");
        setIntField(term90593, term90593.getClass(), "lastRegionId", 1938881305);
        setField(term90593, term90593.getClass(), "lastRegionName", "jieMNXAAbL");
        setField(term90593, term90593.getClass(), "lastClientId", "NbmTxmqOjh");
        setField(term90593, term90593.getClass(), "lastCountryCode", "rLDmBbcLaC");
        setIntField(term90593, term90593.getClass(), "eventPoint", 300219839);
        setIntField(term90593, term90593.getClass(), "totalLv", 962854007);
        setIntField(term90593, term90593.getClass(), "lastLoginBonusDay", 824386522);
        setIntField(term90593, term90593.getClass(), "lastSurvivalBonusDay", -1414905297);
        setIntField(term90593, term90593.getClass(), "loginBonusLv", 1128316994);
        setField(term90591, term90591.getClass(), "user", term90593);
        setLongField(term90591, term90591.getClass(), "pandoraFlagList0", -5597498165246748176L);
        setLongField(term90591, term90591.getClass(), "pandoraFlagList1", 6174523862926526279L);
        setLongField(term90591, term90591.getClass(), "pandoraFlagList2", 4977537501907213732L);
        setLongField(term90591, term90591.getClass(), "pandoraFlagList3", -2341942457089205755L);
        setLongField(term90591, term90591.getClass(), "pandoraFlagList4", -7503147844796296300L);
        setLongField(term90591, term90591.getClass(), "pandoraFlagList5", 1099634235456795888L);
        setLongField(term90591, term90591.getClass(), "pandoraFlagList6", 5391189846186870864L);
        setLongField(term90591, term90591.getClass(), "emblemFlagList", 7314774835988078404L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserBoss");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPandoraFlagList3", argTypes, term90591, args);
    }

};


