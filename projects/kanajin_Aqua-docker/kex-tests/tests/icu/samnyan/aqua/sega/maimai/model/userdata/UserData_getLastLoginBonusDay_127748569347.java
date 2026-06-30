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

public class UserData_getLastLoginBonusDay_127748569347 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12409;

    public UserData_getLastLoginBonusDay_127748569347() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term12413 = new Long(4044358158040652353L);
        term12409 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term12411 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term12427 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12428 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12432 = newInstance(Class.forName("java.time.LocalTime"));
        Object term12437 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12438 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12442 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term12409, term12409.getClass(), "id", 3133860696238261492L);
        setLongField(term12411, term12411.getClass(), "id", 7247160664318067468L);
        setField(term12411, term12411.getClass(), "extId", term12413);
        setField(term12411, term12411.getClass(), "luid", "qYtAeLzOhW");
        setIntField(term12428, term12428.getClass(), "year", 2020);
        setShortField(term12428, term12428.getClass(), "month", (short) 12);
        setShortField(term12428, term12428.getClass(), "day", (short) 21);
        setField(term12427, term12427.getClass(), "date", term12428);
        setByteField(term12432, term12432.getClass(), "hour", (byte) 20);
        setByteField(term12432, term12432.getClass(), "minute", (byte) 16);
        setByteField(term12432, term12432.getClass(), "second", (byte) 59);
        setIntField(term12432, term12432.getClass(), "nano", 976524801);
        setField(term12427, term12427.getClass(), "time", term12432);
        setField(term12411, term12411.getClass(), "registerTime", term12427);
        setIntField(term12438, term12438.getClass(), "year", 2028);
        setShortField(term12438, term12438.getClass(), "month", (short) 5);
        setShortField(term12438, term12438.getClass(), "day", (short) 15);
        setField(term12437, term12437.getClass(), "date", term12438);
        setByteField(term12442, term12442.getClass(), "hour", (byte) 20);
        setByteField(term12442, term12442.getClass(), "minute", (byte) 31);
        setByteField(term12442, term12442.getClass(), "second", (byte) 49);
        setIntField(term12442, term12442.getClass(), "nano", 945744862);
        setField(term12437, term12437.getClass(), "time", term12442);
        setField(term12411, term12411.getClass(), "accessTime", term12437);
        setField(term12409, term12409.getClass(), "card", term12411);
        setIntField(term12409, term12409.getClass(), "lastDataVersion", -683868408);
        setField(term12409, term12409.getClass(), "userName", "tJzmOfcUnY");
        setIntField(term12409, term12409.getClass(), "point", -381130069);
        setIntField(term12409, term12409.getClass(), "totalPoint", 885769749);
        setIntField(term12409, term12409.getClass(), "iconId", -1021168716);
        setIntField(term12409, term12409.getClass(), "nameplateId", -1238055654);
        setIntField(term12409, term12409.getClass(), "frameId", 1561513428);
        setIntField(term12409, term12409.getClass(), "trophyId", 778959809);
        setIntField(term12409, term12409.getClass(), "playCount", -7504064);
        setIntField(term12409, term12409.getClass(), "playVsCount", -1464364418);
        setIntField(term12409, term12409.getClass(), "playSyncCount", 1050420173);
        setIntField(term12409, term12409.getClass(), "winCount", 994300935);
        setIntField(term12409, term12409.getClass(), "helpCount", 433954476);
        setIntField(term12409, term12409.getClass(), "comboCount", 1780958641);
        setIntField(term12409, term12409.getClass(), "feverCount", 1890582085);
        setIntField(term12409, term12409.getClass(), "totalHiScore", 2146568808);
        setIntField(term12409, term12409.getClass(), "totalEasyHighScore", 245081679);
        setIntField(term12409, term12409.getClass(), "totalBasicHighScore", 1199789398);
        setIntField(term12409, term12409.getClass(), "totalAdvancedHighScore", -1056402285);
        setIntField(term12409, term12409.getClass(), "totalExpertHighScore", 1881803912);
        setIntField(term12409, term12409.getClass(), "totalMasterHighScore", -188535038);
        setIntField(term12409, term12409.getClass(), "totalReMasterHighScore", 254650626);
        setIntField(term12409, term12409.getClass(), "totalHighSync", -1789030917);
        setIntField(term12409, term12409.getClass(), "totalEasySync", 912208163);
        setIntField(term12409, term12409.getClass(), "totalBasicSync", 909767683);
        setIntField(term12409, term12409.getClass(), "totalAdvancedSync", -639390893);
        setIntField(term12409, term12409.getClass(), "totalExpertSync", 1176415280);
        setIntField(term12409, term12409.getClass(), "totalMasterSync", -1272714687);
        setIntField(term12409, term12409.getClass(), "totalReMasterSync", -762778853);
        setIntField(term12409, term12409.getClass(), "playerRating", 946727239);
        setIntField(term12409, term12409.getClass(), "highestRating", 349182490);
        setIntField(term12409, term12409.getClass(), "rankAuthTailId", -353671511);
        setField(term12409, term12409.getClass(), "eventWatchedDate", "TKlccZUpjz");
        setField(term12409, term12409.getClass(), "webLimitDate", "GGzwMoHZXC");
        setIntField(term12409, term12409.getClass(), "challengeTrackPhase", 1598831363);
        setIntField(term12409, term12409.getClass(), "firstPlayBits", -690367798);
        setField(term12409, term12409.getClass(), "lastPlayDate", "IpmgwHTgnG");
        setIntField(term12409, term12409.getClass(), "lastPlaceId", 1863738073);
        setField(term12409, term12409.getClass(), "lastPlaceName", "tIpkeYIezR");
        setIntField(term12409, term12409.getClass(), "lastRegionId", 2009028243);
        setField(term12409, term12409.getClass(), "lastRegionName", "YkZtEtthvz");
        setField(term12409, term12409.getClass(), "lastClientId", "dwlZSxlXOo");
        setField(term12409, term12409.getClass(), "lastCountryCode", "lKrEAkypza");
        setIntField(term12409, term12409.getClass(), "eventPoint", 1900131331);
        setIntField(term12409, term12409.getClass(), "totalLv", -1489604464);
        setIntField(term12409, term12409.getClass(), "lastLoginBonusDay", 601642248);
        setIntField(term12409, term12409.getClass(), "lastSurvivalBonusDay", -1186936928);
        setIntField(term12409, term12409.getClass(), "loginBonusLv", -315380004);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastLoginBonusDay", argTypes, term12409, args);
    }

};


