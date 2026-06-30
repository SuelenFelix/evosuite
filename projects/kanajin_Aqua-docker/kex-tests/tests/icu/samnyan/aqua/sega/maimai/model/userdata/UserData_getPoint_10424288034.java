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

public class UserData_getPoint_10424288034 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1057;

    public UserData_getPoint_10424288034() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1061 = new Long(5270370404989704783L);
        term1057 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term1059 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term1075 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1076 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1080 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1085 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1086 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1090 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term1057, term1057.getClass(), "id", -7237588299778557629L);
        setLongField(term1059, term1059.getClass(), "id", 6967924379644551255L);
        setField(term1059, term1059.getClass(), "extId", term1061);
        setField(term1059, term1059.getClass(), "luid", "xrwlQZdwCp");
        setIntField(term1076, term1076.getClass(), "year", 2029);
        setShortField(term1076, term1076.getClass(), "month", (short) 8);
        setShortField(term1076, term1076.getClass(), "day", (short) 29);
        setField(term1075, term1075.getClass(), "date", term1076);
        setByteField(term1080, term1080.getClass(), "hour", (byte) 15);
        setByteField(term1080, term1080.getClass(), "minute", (byte) 50);
        setByteField(term1080, term1080.getClass(), "second", (byte) 1);
        setIntField(term1080, term1080.getClass(), "nano", 277971904);
        setField(term1075, term1075.getClass(), "time", term1080);
        setField(term1059, term1059.getClass(), "registerTime", term1075);
        setIntField(term1086, term1086.getClass(), "year", 2022);
        setShortField(term1086, term1086.getClass(), "month", (short) 11);
        setShortField(term1086, term1086.getClass(), "day", (short) 16);
        setField(term1085, term1085.getClass(), "date", term1086);
        setByteField(term1090, term1090.getClass(), "hour", (byte) 15);
        setByteField(term1090, term1090.getClass(), "minute", (byte) 54);
        setByteField(term1090, term1090.getClass(), "second", (byte) 2);
        setIntField(term1090, term1090.getClass(), "nano", 733274103);
        setField(term1085, term1085.getClass(), "time", term1090);
        setField(term1059, term1059.getClass(), "accessTime", term1085);
        setField(term1057, term1057.getClass(), "card", term1059);
        setIntField(term1057, term1057.getClass(), "lastDataVersion", 1283079251);
        setField(term1057, term1057.getClass(), "userName", "IDCWpPLRkE");
        setIntField(term1057, term1057.getClass(), "point", -523949691);
        setIntField(term1057, term1057.getClass(), "totalPoint", 1398204340);
        setIntField(term1057, term1057.getClass(), "iconId", 229204365);
        setIntField(term1057, term1057.getClass(), "nameplateId", -461771056);
        setIntField(term1057, term1057.getClass(), "frameId", -243422082);
        setIntField(term1057, term1057.getClass(), "trophyId", 1384592638);
        setIntField(term1057, term1057.getClass(), "playCount", -1002370457);
        setIntField(term1057, term1057.getClass(), "playVsCount", -2014576105);
        setIntField(term1057, term1057.getClass(), "playSyncCount", 1296895584);
        setIntField(term1057, term1057.getClass(), "winCount", 628918458);
        setIntField(term1057, term1057.getClass(), "helpCount", -1274456137);
        setIntField(term1057, term1057.getClass(), "comboCount", 1041916673);
        setIntField(term1057, term1057.getClass(), "feverCount", -601863069);
        setIntField(term1057, term1057.getClass(), "totalHiScore", 663292551);
        setIntField(term1057, term1057.getClass(), "totalEasyHighScore", -1885090354);
        setIntField(term1057, term1057.getClass(), "totalBasicHighScore", -2066804303);
        setIntField(term1057, term1057.getClass(), "totalAdvancedHighScore", -1731761810);
        setIntField(term1057, term1057.getClass(), "totalExpertHighScore", 197109649);
        setIntField(term1057, term1057.getClass(), "totalMasterHighScore", -1239406390);
        setIntField(term1057, term1057.getClass(), "totalReMasterHighScore", 1557431527);
        setIntField(term1057, term1057.getClass(), "totalHighSync", -1504890659);
        setIntField(term1057, term1057.getClass(), "totalEasySync", 1358829571);
        setIntField(term1057, term1057.getClass(), "totalBasicSync", 991356662);
        setIntField(term1057, term1057.getClass(), "totalAdvancedSync", -506958186);
        setIntField(term1057, term1057.getClass(), "totalExpertSync", -507387516);
        setIntField(term1057, term1057.getClass(), "totalMasterSync", -1970452551);
        setIntField(term1057, term1057.getClass(), "totalReMasterSync", -1896376975);
        setIntField(term1057, term1057.getClass(), "playerRating", 729658803);
        setIntField(term1057, term1057.getClass(), "highestRating", 114754804);
        setIntField(term1057, term1057.getClass(), "rankAuthTailId", 1687361082);
        setField(term1057, term1057.getClass(), "eventWatchedDate", "nyiiPDVjAc");
        setField(term1057, term1057.getClass(), "webLimitDate", "aKnKipADSo");
        setIntField(term1057, term1057.getClass(), "challengeTrackPhase", 584893196);
        setIntField(term1057, term1057.getClass(), "firstPlayBits", 497269071);
        setField(term1057, term1057.getClass(), "lastPlayDate", "wSQxaModmm");
        setIntField(term1057, term1057.getClass(), "lastPlaceId", -1899301124);
        setField(term1057, term1057.getClass(), "lastPlaceName", "UlajhuVLaP");
        setIntField(term1057, term1057.getClass(), "lastRegionId", -1882480155);
        setField(term1057, term1057.getClass(), "lastRegionName", "gGSMzuGICf");
        setField(term1057, term1057.getClass(), "lastClientId", "hxCBltsObl");
        setField(term1057, term1057.getClass(), "lastCountryCode", "BndsHwAFMv");
        setIntField(term1057, term1057.getClass(), "eventPoint", -1410220680);
        setIntField(term1057, term1057.getClass(), "totalLv", 389427431);
        setIntField(term1057, term1057.getClass(), "lastLoginBonusDay", -1945706126);
        setIntField(term1057, term1057.getClass(), "lastSurvivalBonusDay", 1152356969);
        setIntField(term1057, term1057.getClass(), "loginBonusLv", -1667990367);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPoint", argTypes, term1057, args);
    }

};


