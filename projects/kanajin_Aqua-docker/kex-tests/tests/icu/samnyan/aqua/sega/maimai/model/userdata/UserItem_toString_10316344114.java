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

public class UserItem_toString_10316344114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term88330;

    public UserItem_toString_10316344114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term88336 = new Long(6041374912351843923L);
        term88330 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserItem"));
        Object term88332 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term88334 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term88350 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term88351 = newInstance(Class.forName("java.time.LocalDate"));
        Object term88355 = newInstance(Class.forName("java.time.LocalTime"));
        Object term88360 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term88361 = newInstance(Class.forName("java.time.LocalDate"));
        Object term88365 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term88330, term88330.getClass(), "id", -8510452367371037137L);
        setLongField(term88332, term88332.getClass(), "id", 2123432481270520381L);
        setLongField(term88334, term88334.getClass(), "id", 7205698466499430091L);
        setField(term88334, term88334.getClass(), "extId", term88336);
        setField(term88334, term88334.getClass(), "luid", "MQzXbKeQIa");
        setIntField(term88351, term88351.getClass(), "year", 2025);
        setShortField(term88351, term88351.getClass(), "month", (short) 7);
        setShortField(term88351, term88351.getClass(), "day", (short) 31);
        setField(term88350, term88350.getClass(), "date", term88351);
        setByteField(term88355, term88355.getClass(), "hour", (byte) 14);
        setByteField(term88355, term88355.getClass(), "minute", (byte) 45);
        setByteField(term88355, term88355.getClass(), "second", (byte) 16);
        setIntField(term88355, term88355.getClass(), "nano", 864162960);
        setField(term88350, term88350.getClass(), "time", term88355);
        setField(term88334, term88334.getClass(), "registerTime", term88350);
        setIntField(term88361, term88361.getClass(), "year", 2018);
        setShortField(term88361, term88361.getClass(), "month", (short) 11);
        setShortField(term88361, term88361.getClass(), "day", (short) 5);
        setField(term88360, term88360.getClass(), "date", term88361);
        setByteField(term88365, term88365.getClass(), "hour", (byte) 11);
        setByteField(term88365, term88365.getClass(), "minute", (byte) 27);
        setByteField(term88365, term88365.getClass(), "second", (byte) 20);
        setIntField(term88365, term88365.getClass(), "nano", 980926676);
        setField(term88360, term88360.getClass(), "time", term88365);
        setField(term88334, term88334.getClass(), "accessTime", term88360);
        setField(term88332, term88332.getClass(), "card", term88334);
        setIntField(term88332, term88332.getClass(), "lastDataVersion", 1166123699);
        setField(term88332, term88332.getClass(), "userName", "YHDwlXeRTi");
        setIntField(term88332, term88332.getClass(), "point", -1457506209);
        setIntField(term88332, term88332.getClass(), "totalPoint", -1619288980);
        setIntField(term88332, term88332.getClass(), "iconId", -1191842125);
        setIntField(term88332, term88332.getClass(), "nameplateId", 800085811);
        setIntField(term88332, term88332.getClass(), "frameId", -991536181);
        setIntField(term88332, term88332.getClass(), "trophyId", 1245758357);
        setIntField(term88332, term88332.getClass(), "playCount", 957593927);
        setIntField(term88332, term88332.getClass(), "playVsCount", 1947837575);
        setIntField(term88332, term88332.getClass(), "playSyncCount", 1877399032);
        setIntField(term88332, term88332.getClass(), "winCount", -322909871);
        setIntField(term88332, term88332.getClass(), "helpCount", -1837027129);
        setIntField(term88332, term88332.getClass(), "comboCount", 1406186846);
        setIntField(term88332, term88332.getClass(), "feverCount", -709701767);
        setIntField(term88332, term88332.getClass(), "totalHiScore", 1445634110);
        setIntField(term88332, term88332.getClass(), "totalEasyHighScore", 430916113);
        setIntField(term88332, term88332.getClass(), "totalBasicHighScore", -62605968);
        setIntField(term88332, term88332.getClass(), "totalAdvancedHighScore", 743020447);
        setIntField(term88332, term88332.getClass(), "totalExpertHighScore", -227812702);
        setIntField(term88332, term88332.getClass(), "totalMasterHighScore", -1688725575);
        setIntField(term88332, term88332.getClass(), "totalReMasterHighScore", -821504884);
        setIntField(term88332, term88332.getClass(), "totalHighSync", 628485113);
        setIntField(term88332, term88332.getClass(), "totalEasySync", 1121498523);
        setIntField(term88332, term88332.getClass(), "totalBasicSync", 571250476);
        setIntField(term88332, term88332.getClass(), "totalAdvancedSync", 850454258);
        setIntField(term88332, term88332.getClass(), "totalExpertSync", -1170623459);
        setIntField(term88332, term88332.getClass(), "totalMasterSync", 1449993114);
        setIntField(term88332, term88332.getClass(), "totalReMasterSync", -734393320);
        setIntField(term88332, term88332.getClass(), "playerRating", -345557283);
        setIntField(term88332, term88332.getClass(), "highestRating", 156448167);
        setIntField(term88332, term88332.getClass(), "rankAuthTailId", -1594914286);
        setField(term88332, term88332.getClass(), "eventWatchedDate", "WIJiLZqEqc");
        setField(term88332, term88332.getClass(), "webLimitDate", "OuZMVgPpoE");
        setIntField(term88332, term88332.getClass(), "challengeTrackPhase", -1101748725);
        setIntField(term88332, term88332.getClass(), "firstPlayBits", 1729452900);
        setField(term88332, term88332.getClass(), "lastPlayDate", "nDUyFfanYp");
        setIntField(term88332, term88332.getClass(), "lastPlaceId", 1494418561);
        setField(term88332, term88332.getClass(), "lastPlaceName", "hYmQxPxTFd");
        setIntField(term88332, term88332.getClass(), "lastRegionId", 1872045675);
        setField(term88332, term88332.getClass(), "lastRegionName", "Clkrygzvpw");
        setField(term88332, term88332.getClass(), "lastClientId", "TPzGOBNENK");
        setField(term88332, term88332.getClass(), "lastCountryCode", "ADhlvQDtuh");
        setIntField(term88332, term88332.getClass(), "eventPoint", -663114662);
        setIntField(term88332, term88332.getClass(), "totalLv", 1816340610);
        setIntField(term88332, term88332.getClass(), "lastLoginBonusDay", -2106969244);
        setIntField(term88332, term88332.getClass(), "lastSurvivalBonusDay", 1867730492);
        setIntField(term88332, term88332.getClass(), "loginBonusLv", 2124844100);
        setField(term88330, term88330.getClass(), "user", term88332);
        setIntField(term88330, term88330.getClass(), "itemKind", 23858291);
        setIntField(term88330, term88330.getClass(), "itemId", 59541663);
        setIntField(term88330, term88330.getClass(), "stock", -200802631);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term88330, args);
    }

};


