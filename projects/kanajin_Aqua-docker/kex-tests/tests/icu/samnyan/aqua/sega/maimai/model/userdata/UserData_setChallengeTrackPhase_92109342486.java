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

public class UserData_setChallengeTrackPhase_92109342486 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22881;
     Object term23055;

    public UserData_setChallengeTrackPhase_92109342486() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term22885 = new Long(2848819812340321742L);
        term22881 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term22883 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term22899 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term22900 = newInstance(Class.forName("java.time.LocalDate"));
        Object term22904 = newInstance(Class.forName("java.time.LocalTime"));
        Object term22909 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term22910 = newInstance(Class.forName("java.time.LocalDate"));
        Object term22914 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term22881, term22881.getClass(), "id", -5447369594017685765L);
        setLongField(term22883, term22883.getClass(), "id", -5724112525188606013L);
        setField(term22883, term22883.getClass(), "extId", term22885);
        setField(term22883, term22883.getClass(), "luid", "DddqUYfomL");
        setIntField(term22900, term22900.getClass(), "year", 2022);
        setShortField(term22900, term22900.getClass(), "month", (short) 12);
        setShortField(term22900, term22900.getClass(), "day", (short) 19);
        setField(term22899, term22899.getClass(), "date", term22900);
        setByteField(term22904, term22904.getClass(), "hour", (byte) 11);
        setByteField(term22904, term22904.getClass(), "minute", (byte) 25);
        setByteField(term22904, term22904.getClass(), "second", (byte) 6);
        setIntField(term22904, term22904.getClass(), "nano", 620469872);
        setField(term22899, term22899.getClass(), "time", term22904);
        setField(term22883, term22883.getClass(), "registerTime", term22899);
        setIntField(term22910, term22910.getClass(), "year", 2013);
        setShortField(term22910, term22910.getClass(), "month", (short) 5);
        setShortField(term22910, term22910.getClass(), "day", (short) 3);
        setField(term22909, term22909.getClass(), "date", term22910);
        setByteField(term22914, term22914.getClass(), "hour", (byte) 18);
        setByteField(term22914, term22914.getClass(), "minute", (byte) 52);
        setByteField(term22914, term22914.getClass(), "second", (byte) 15);
        setIntField(term22914, term22914.getClass(), "nano", 241685081);
        setField(term22909, term22909.getClass(), "time", term22914);
        setField(term22883, term22883.getClass(), "accessTime", term22909);
        setField(term22881, term22881.getClass(), "card", term22883);
        setIntField(term22881, term22881.getClass(), "lastDataVersion", 1877895251);
        setField(term22881, term22881.getClass(), "userName", "YQwoogpPyi");
        setIntField(term22881, term22881.getClass(), "point", 962916253);
        setIntField(term22881, term22881.getClass(), "totalPoint", 1580094069);
        setIntField(term22881, term22881.getClass(), "iconId", -890066143);
        setIntField(term22881, term22881.getClass(), "nameplateId", 1782477754);
        setIntField(term22881, term22881.getClass(), "frameId", 1979972143);
        setIntField(term22881, term22881.getClass(), "trophyId", -1445141749);
        setIntField(term22881, term22881.getClass(), "playCount", 231866725);
        setIntField(term22881, term22881.getClass(), "playVsCount", 264142674);
        setIntField(term22881, term22881.getClass(), "playSyncCount", 318938584);
        setIntField(term22881, term22881.getClass(), "winCount", 804113142);
        setIntField(term22881, term22881.getClass(), "helpCount", 1426555916);
        setIntField(term22881, term22881.getClass(), "comboCount", 96582503);
        setIntField(term22881, term22881.getClass(), "feverCount", -2078044123);
        setIntField(term22881, term22881.getClass(), "totalHiScore", -888123997);
        setIntField(term22881, term22881.getClass(), "totalEasyHighScore", 1348905505);
        setIntField(term22881, term22881.getClass(), "totalBasicHighScore", 670473947);
        setIntField(term22881, term22881.getClass(), "totalAdvancedHighScore", 24416797);
        setIntField(term22881, term22881.getClass(), "totalExpertHighScore", 1333624993);
        setIntField(term22881, term22881.getClass(), "totalMasterHighScore", -1351263253);
        setIntField(term22881, term22881.getClass(), "totalReMasterHighScore", -2032135607);
        setIntField(term22881, term22881.getClass(), "totalHighSync", -1160239470);
        setIntField(term22881, term22881.getClass(), "totalEasySync", 601515362);
        setIntField(term22881, term22881.getClass(), "totalBasicSync", 361169760);
        setIntField(term22881, term22881.getClass(), "totalAdvancedSync", 1796450668);
        setIntField(term22881, term22881.getClass(), "totalExpertSync", -1052517959);
        setIntField(term22881, term22881.getClass(), "totalMasterSync", -646227135);
        setIntField(term22881, term22881.getClass(), "totalReMasterSync", 445886422);
        setIntField(term22881, term22881.getClass(), "playerRating", -52982078);
        setIntField(term22881, term22881.getClass(), "highestRating", -1176310275);
        setIntField(term22881, term22881.getClass(), "rankAuthTailId", -992072250);
        setField(term22881, term22881.getClass(), "eventWatchedDate", "rnPhHoorxj");
        setField(term22881, term22881.getClass(), "webLimitDate", "GuwJLKquuI");
        setIntField(term22881, term22881.getClass(), "challengeTrackPhase", -21937920);
        setIntField(term22881, term22881.getClass(), "firstPlayBits", -1136589460);
        setField(term22881, term22881.getClass(), "lastPlayDate", "vYMCjgnztg");
        setIntField(term22881, term22881.getClass(), "lastPlaceId", -503938545);
        setField(term22881, term22881.getClass(), "lastPlaceName", "YupgKTSEiI");
        setIntField(term22881, term22881.getClass(), "lastRegionId", 2025866025);
        setField(term22881, term22881.getClass(), "lastRegionName", "HuOUlaFmvJ");
        setField(term22881, term22881.getClass(), "lastClientId", "dWVwcwFGNo");
        setField(term22881, term22881.getClass(), "lastCountryCode", "PNdLRrSAIY");
        setIntField(term22881, term22881.getClass(), "eventPoint", 1509936407);
        setIntField(term22881, term22881.getClass(), "totalLv", 480159064);
        setIntField(term22881, term22881.getClass(), "lastLoginBonusDay", 1447658561);
        setIntField(term22881, term22881.getClass(), "lastSurvivalBonusDay", -2004177132);
        setIntField(term22881, term22881.getClass(), "loginBonusLv", 1111078487);
        term23055 = new Integer(1426568609);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term23055;
        callMethod(klass, "setChallengeTrackPhase", argTypes, term22881, args);
    }

};


