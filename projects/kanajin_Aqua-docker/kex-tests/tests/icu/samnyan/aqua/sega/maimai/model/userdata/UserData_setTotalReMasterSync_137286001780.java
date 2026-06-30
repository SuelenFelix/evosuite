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

public class UserData_setTotalReMasterSync_137286001780 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21245;
     Object term21419;

    public UserData_setTotalReMasterSync_137286001780() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term21249 = new Long(6005241913654469005L);
        term21245 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term21247 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term21263 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term21264 = newInstance(Class.forName("java.time.LocalDate"));
        Object term21268 = newInstance(Class.forName("java.time.LocalTime"));
        Object term21273 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term21274 = newInstance(Class.forName("java.time.LocalDate"));
        Object term21278 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term21245, term21245.getClass(), "id", 4266570509071948633L);
        setLongField(term21247, term21247.getClass(), "id", -7291742736502427077L);
        setField(term21247, term21247.getClass(), "extId", term21249);
        setField(term21247, term21247.getClass(), "luid", "QVLresHoaP");
        setIntField(term21264, term21264.getClass(), "year", 2014);
        setShortField(term21264, term21264.getClass(), "month", (short) 6);
        setShortField(term21264, term21264.getClass(), "day", (short) 28);
        setField(term21263, term21263.getClass(), "date", term21264);
        setByteField(term21268, term21268.getClass(), "hour", (byte) 7);
        setByteField(term21268, term21268.getClass(), "minute", (byte) 14);
        setByteField(term21268, term21268.getClass(), "second", (byte) 59);
        setIntField(term21268, term21268.getClass(), "nano", 314278386);
        setField(term21263, term21263.getClass(), "time", term21268);
        setField(term21247, term21247.getClass(), "registerTime", term21263);
        setIntField(term21274, term21274.getClass(), "year", 2015);
        setShortField(term21274, term21274.getClass(), "month", (short) 10);
        setShortField(term21274, term21274.getClass(), "day", (short) 8);
        setField(term21273, term21273.getClass(), "date", term21274);
        setByteField(term21278, term21278.getClass(), "hour", (byte) 22);
        setByteField(term21278, term21278.getClass(), "minute", (byte) 20);
        setByteField(term21278, term21278.getClass(), "second", (byte) 59);
        setIntField(term21278, term21278.getClass(), "nano", 350521903);
        setField(term21273, term21273.getClass(), "time", term21278);
        setField(term21247, term21247.getClass(), "accessTime", term21273);
        setField(term21245, term21245.getClass(), "card", term21247);
        setIntField(term21245, term21245.getClass(), "lastDataVersion", -1513402749);
        setField(term21245, term21245.getClass(), "userName", "IbxeAMwLVt");
        setIntField(term21245, term21245.getClass(), "point", -1865692837);
        setIntField(term21245, term21245.getClass(), "totalPoint", 966678407);
        setIntField(term21245, term21245.getClass(), "iconId", -881632231);
        setIntField(term21245, term21245.getClass(), "nameplateId", -1285148224);
        setIntField(term21245, term21245.getClass(), "frameId", -2002558482);
        setIntField(term21245, term21245.getClass(), "trophyId", 794384312);
        setIntField(term21245, term21245.getClass(), "playCount", 1166664554);
        setIntField(term21245, term21245.getClass(), "playVsCount", -1287204441);
        setIntField(term21245, term21245.getClass(), "playSyncCount", 1826016641);
        setIntField(term21245, term21245.getClass(), "winCount", 1726886771);
        setIntField(term21245, term21245.getClass(), "helpCount", 1045689376);
        setIntField(term21245, term21245.getClass(), "comboCount", 767458787);
        setIntField(term21245, term21245.getClass(), "feverCount", 2103721338);
        setIntField(term21245, term21245.getClass(), "totalHiScore", 621330308);
        setIntField(term21245, term21245.getClass(), "totalEasyHighScore", -1597424060);
        setIntField(term21245, term21245.getClass(), "totalBasicHighScore", 243854303);
        setIntField(term21245, term21245.getClass(), "totalAdvancedHighScore", 1754709105);
        setIntField(term21245, term21245.getClass(), "totalExpertHighScore", 1523196898);
        setIntField(term21245, term21245.getClass(), "totalMasterHighScore", 2061147445);
        setIntField(term21245, term21245.getClass(), "totalReMasterHighScore", -531060561);
        setIntField(term21245, term21245.getClass(), "totalHighSync", -1974107061);
        setIntField(term21245, term21245.getClass(), "totalEasySync", -1806271948);
        setIntField(term21245, term21245.getClass(), "totalBasicSync", 1708731871);
        setIntField(term21245, term21245.getClass(), "totalAdvancedSync", 1855866160);
        setIntField(term21245, term21245.getClass(), "totalExpertSync", -1463148153);
        setIntField(term21245, term21245.getClass(), "totalMasterSync", -121679722);
        setIntField(term21245, term21245.getClass(), "totalReMasterSync", -1283714004);
        setIntField(term21245, term21245.getClass(), "playerRating", -1085038483);
        setIntField(term21245, term21245.getClass(), "highestRating", 1089796055);
        setIntField(term21245, term21245.getClass(), "rankAuthTailId", -456321892);
        setField(term21245, term21245.getClass(), "eventWatchedDate", "bShlAqoTmZ");
        setField(term21245, term21245.getClass(), "webLimitDate", "nOKlKlNhtU");
        setIntField(term21245, term21245.getClass(), "challengeTrackPhase", 1803068346);
        setIntField(term21245, term21245.getClass(), "firstPlayBits", 1598485572);
        setField(term21245, term21245.getClass(), "lastPlayDate", "gXFNBHJSey");
        setIntField(term21245, term21245.getClass(), "lastPlaceId", 1328348146);
        setField(term21245, term21245.getClass(), "lastPlaceName", "wUcSfItZgv");
        setIntField(term21245, term21245.getClass(), "lastRegionId", 835037846);
        setField(term21245, term21245.getClass(), "lastRegionName", "rOfPCPHmtJ");
        setField(term21245, term21245.getClass(), "lastClientId", "EnmiAvfpJv");
        setField(term21245, term21245.getClass(), "lastCountryCode", "AdYzLPMcwe");
        setIntField(term21245, term21245.getClass(), "eventPoint", 1151852495);
        setIntField(term21245, term21245.getClass(), "totalLv", -1258846135);
        setIntField(term21245, term21245.getClass(), "lastLoginBonusDay", -2113882456);
        setIntField(term21245, term21245.getClass(), "lastSurvivalBonusDay", 913224981);
        setIntField(term21245, term21245.getClass(), "loginBonusLv", -2064677239);
        term21419 = new Integer(584068841);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term21419;
        callMethod(klass, "setTotalReMasterSync", argTypes, term21245, args);
    }

};


