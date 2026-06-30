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

public class UserCharacter_init_2249012920 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32599;

    public UserCharacter_init_2249012920() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term32603 = new Long(2354625302846375590L);
        term32599 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term32601 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term32617 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term32618 = newInstance(Class.forName("java.time.LocalDate"));
        Object term32622 = newInstance(Class.forName("java.time.LocalTime"));
        Object term32627 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term32628 = newInstance(Class.forName("java.time.LocalDate"));
        Object term32632 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term32599, term32599.getClass(), "id", -7698746988132548371L);
        setLongField(term32601, term32601.getClass(), "id", 2145420811068634601L);
        setField(term32601, term32601.getClass(), "extId", term32603);
        setField(term32601, term32601.getClass(), "luid", "laTITSWZuc");
        setIntField(term32618, term32618.getClass(), "year", 2028);
        setShortField(term32618, term32618.getClass(), "month", (short) 5);
        setShortField(term32618, term32618.getClass(), "day", (short) 6);
        setField(term32617, term32617.getClass(), "date", term32618);
        setByteField(term32622, term32622.getClass(), "hour", (byte) 19);
        setByteField(term32622, term32622.getClass(), "minute", (byte) 33);
        setByteField(term32622, term32622.getClass(), "second", (byte) 32);
        setIntField(term32622, term32622.getClass(), "nano", 917257563);
        setField(term32617, term32617.getClass(), "time", term32622);
        setField(term32601, term32601.getClass(), "registerTime", term32617);
        setIntField(term32628, term32628.getClass(), "year", 2029);
        setShortField(term32628, term32628.getClass(), "month", (short) 7);
        setShortField(term32628, term32628.getClass(), "day", (short) 22);
        setField(term32627, term32627.getClass(), "date", term32628);
        setByteField(term32632, term32632.getClass(), "hour", (byte) 17);
        setByteField(term32632, term32632.getClass(), "minute", (byte) 59);
        setByteField(term32632, term32632.getClass(), "second", (byte) 58);
        setIntField(term32632, term32632.getClass(), "nano", 921418702);
        setField(term32627, term32627.getClass(), "time", term32632);
        setField(term32601, term32601.getClass(), "accessTime", term32627);
        setField(term32599, term32599.getClass(), "card", term32601);
        setIntField(term32599, term32599.getClass(), "lastDataVersion", -870011438);
        setField(term32599, term32599.getClass(), "userName", "fkzRpxlAqS");
        setIntField(term32599, term32599.getClass(), "point", -1767217325);
        setIntField(term32599, term32599.getClass(), "totalPoint", -170630873);
        setIntField(term32599, term32599.getClass(), "iconId", -1246900588);
        setIntField(term32599, term32599.getClass(), "nameplateId", 548633933);
        setIntField(term32599, term32599.getClass(), "frameId", -1532179986);
        setIntField(term32599, term32599.getClass(), "trophyId", 1644599689);
        setIntField(term32599, term32599.getClass(), "playCount", 1665477880);
        setIntField(term32599, term32599.getClass(), "playVsCount", 2044728583);
        setIntField(term32599, term32599.getClass(), "playSyncCount", 64790905);
        setIntField(term32599, term32599.getClass(), "winCount", -1199056049);
        setIntField(term32599, term32599.getClass(), "helpCount", -1074336148);
        setIntField(term32599, term32599.getClass(), "comboCount", -561801733);
        setIntField(term32599, term32599.getClass(), "feverCount", 2134609936);
        setIntField(term32599, term32599.getClass(), "totalHiScore", -409989519);
        setIntField(term32599, term32599.getClass(), "totalEasyHighScore", -1293074430);
        setIntField(term32599, term32599.getClass(), "totalBasicHighScore", 608662433);
        setIntField(term32599, term32599.getClass(), "totalAdvancedHighScore", -2015476493);
        setIntField(term32599, term32599.getClass(), "totalExpertHighScore", 41528103);
        setIntField(term32599, term32599.getClass(), "totalMasterHighScore", -1732381818);
        setIntField(term32599, term32599.getClass(), "totalReMasterHighScore", 1960614460);
        setIntField(term32599, term32599.getClass(), "totalHighSync", -1488501179);
        setIntField(term32599, term32599.getClass(), "totalEasySync", 2086648406);
        setIntField(term32599, term32599.getClass(), "totalBasicSync", 805890273);
        setIntField(term32599, term32599.getClass(), "totalAdvancedSync", 1078863472);
        setIntField(term32599, term32599.getClass(), "totalExpertSync", -1845619952);
        setIntField(term32599, term32599.getClass(), "totalMasterSync", -1363744441);
        setIntField(term32599, term32599.getClass(), "totalReMasterSync", -1303828030);
        setIntField(term32599, term32599.getClass(), "playerRating", 1611629079);
        setIntField(term32599, term32599.getClass(), "highestRating", 770171276);
        setIntField(term32599, term32599.getClass(), "rankAuthTailId", -1497914215);
        setField(term32599, term32599.getClass(), "eventWatchedDate", "VYvbTGKslj");
        setField(term32599, term32599.getClass(), "webLimitDate", "owLqDDnwZA");
        setIntField(term32599, term32599.getClass(), "challengeTrackPhase", 254385018);
        setIntField(term32599, term32599.getClass(), "firstPlayBits", 672070228);
        setField(term32599, term32599.getClass(), "lastPlayDate", "eBcTbweeYp");
        setIntField(term32599, term32599.getClass(), "lastPlaceId", 1014463904);
        setField(term32599, term32599.getClass(), "lastPlaceName", "drcmjfQUDq");
        setIntField(term32599, term32599.getClass(), "lastRegionId", 928673401);
        setField(term32599, term32599.getClass(), "lastRegionName", "GjdWUoUSyA");
        setField(term32599, term32599.getClass(), "lastClientId", "YEkxWsWaUl");
        setField(term32599, term32599.getClass(), "lastCountryCode", "RINhPkhhct");
        setIntField(term32599, term32599.getClass(), "eventPoint", -631739609);
        setIntField(term32599, term32599.getClass(), "totalLv", -2045566233);
        setIntField(term32599, term32599.getClass(), "lastLoginBonusDay", 102632361);
        setIntField(term32599, term32599.getClass(), "lastSurvivalBonusDay", -871963633);
        setIntField(term32599, term32599.getClass(), "loginBonusLv", -572352492);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserCharacter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Object[] args = new Object[1];
        args[0] = term32599;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


