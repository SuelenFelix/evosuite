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

public class UserItem_canEqual_186677243512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87791;
     Object term87970;

    public UserItem_canEqual_186677243512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term87797 = new Long(3423965054378869855L);
        term87791 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserItem"));
        Object term87793 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term87795 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term87811 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term87812 = newInstance(Class.forName("java.time.LocalDate"));
        Object term87816 = newInstance(Class.forName("java.time.LocalTime"));
        Object term87821 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term87822 = newInstance(Class.forName("java.time.LocalDate"));
        Object term87826 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term87791, term87791.getClass(), "id", 2201264121669950608L);
        setLongField(term87793, term87793.getClass(), "id", 4911393165710268247L);
        setLongField(term87795, term87795.getClass(), "id", -836309941570511418L);
        setField(term87795, term87795.getClass(), "extId", term87797);
        setField(term87795, term87795.getClass(), "luid", "cBtfnWBMkE");
        setIntField(term87812, term87812.getClass(), "year", 2013);
        setShortField(term87812, term87812.getClass(), "month", (short) 1);
        setShortField(term87812, term87812.getClass(), "day", (short) 25);
        setField(term87811, term87811.getClass(), "date", term87812);
        setByteField(term87816, term87816.getClass(), "hour", (byte) 11);
        setByteField(term87816, term87816.getClass(), "minute", (byte) 5);
        setByteField(term87816, term87816.getClass(), "second", (byte) 35);
        setIntField(term87816, term87816.getClass(), "nano", 914812579);
        setField(term87811, term87811.getClass(), "time", term87816);
        setField(term87795, term87795.getClass(), "registerTime", term87811);
        setIntField(term87822, term87822.getClass(), "year", 2020);
        setShortField(term87822, term87822.getClass(), "month", (short) 11);
        setShortField(term87822, term87822.getClass(), "day", (short) 6);
        setField(term87821, term87821.getClass(), "date", term87822);
        setByteField(term87826, term87826.getClass(), "hour", (byte) 20);
        setByteField(term87826, term87826.getClass(), "minute", (byte) 26);
        setByteField(term87826, term87826.getClass(), "second", (byte) 26);
        setIntField(term87826, term87826.getClass(), "nano", 961202696);
        setField(term87821, term87821.getClass(), "time", term87826);
        setField(term87795, term87795.getClass(), "accessTime", term87821);
        setField(term87793, term87793.getClass(), "card", term87795);
        setIntField(term87793, term87793.getClass(), "lastDataVersion", 206201108);
        setField(term87793, term87793.getClass(), "userName", "sFixkFlMhw");
        setIntField(term87793, term87793.getClass(), "point", -926229753);
        setIntField(term87793, term87793.getClass(), "totalPoint", 245326381);
        setIntField(term87793, term87793.getClass(), "iconId", 122420715);
        setIntField(term87793, term87793.getClass(), "nameplateId", 190071205);
        setIntField(term87793, term87793.getClass(), "frameId", 2096693078);
        setIntField(term87793, term87793.getClass(), "trophyId", 1474853885);
        setIntField(term87793, term87793.getClass(), "playCount", 638225249);
        setIntField(term87793, term87793.getClass(), "playVsCount", -669172505);
        setIntField(term87793, term87793.getClass(), "playSyncCount", 1077847171);
        setIntField(term87793, term87793.getClass(), "winCount", -167763728);
        setIntField(term87793, term87793.getClass(), "helpCount", -413077084);
        setIntField(term87793, term87793.getClass(), "comboCount", -2108615302);
        setIntField(term87793, term87793.getClass(), "feverCount", 708531286);
        setIntField(term87793, term87793.getClass(), "totalHiScore", -1789461612);
        setIntField(term87793, term87793.getClass(), "totalEasyHighScore", 461243699);
        setIntField(term87793, term87793.getClass(), "totalBasicHighScore", 1738463601);
        setIntField(term87793, term87793.getClass(), "totalAdvancedHighScore", -1010128268);
        setIntField(term87793, term87793.getClass(), "totalExpertHighScore", -2057175143);
        setIntField(term87793, term87793.getClass(), "totalMasterHighScore", 1430166837);
        setIntField(term87793, term87793.getClass(), "totalReMasterHighScore", -1161108991);
        setIntField(term87793, term87793.getClass(), "totalHighSync", -2024150009);
        setIntField(term87793, term87793.getClass(), "totalEasySync", 1182356135);
        setIntField(term87793, term87793.getClass(), "totalBasicSync", 313863614);
        setIntField(term87793, term87793.getClass(), "totalAdvancedSync", -927688075);
        setIntField(term87793, term87793.getClass(), "totalExpertSync", 1980560798);
        setIntField(term87793, term87793.getClass(), "totalMasterSync", 1048342124);
        setIntField(term87793, term87793.getClass(), "totalReMasterSync", -535149999);
        setIntField(term87793, term87793.getClass(), "playerRating", 1350386277);
        setIntField(term87793, term87793.getClass(), "highestRating", -1834376367);
        setIntField(term87793, term87793.getClass(), "rankAuthTailId", -942813197);
        setField(term87793, term87793.getClass(), "eventWatchedDate", "wNaCYPwDGZ");
        setField(term87793, term87793.getClass(), "webLimitDate", "CFojehEtAR");
        setIntField(term87793, term87793.getClass(), "challengeTrackPhase", 1374395557);
        setIntField(term87793, term87793.getClass(), "firstPlayBits", 1293688614);
        setField(term87793, term87793.getClass(), "lastPlayDate", "EYeLeoxDrM");
        setIntField(term87793, term87793.getClass(), "lastPlaceId", 151983912);
        setField(term87793, term87793.getClass(), "lastPlaceName", "zIPJJJubgX");
        setIntField(term87793, term87793.getClass(), "lastRegionId", -997603268);
        setField(term87793, term87793.getClass(), "lastRegionName", "WRbxmSFTaO");
        setField(term87793, term87793.getClass(), "lastClientId", "ZekQCuvPXT");
        setField(term87793, term87793.getClass(), "lastCountryCode", "GUXdlpmVNQ");
        setIntField(term87793, term87793.getClass(), "eventPoint", -1827144788);
        setIntField(term87793, term87793.getClass(), "totalLv", -1031810940);
        setIntField(term87793, term87793.getClass(), "lastLoginBonusDay", -1519353412);
        setIntField(term87793, term87793.getClass(), "lastSurvivalBonusDay", 1644249608);
        setIntField(term87793, term87793.getClass(), "loginBonusLv", 628215504);
        setField(term87791, term87791.getClass(), "user", term87793);
        setIntField(term87791, term87791.getClass(), "itemKind", -165430098);
        setIntField(term87791, term87791.getClass(), "itemId", 1205948703);
        setIntField(term87791, term87791.getClass(), "stock", 800755955);
        term87970 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserItem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term87970;
        callMethod(klass, "canEqual", argTypes, term87791, args);
    }

};


