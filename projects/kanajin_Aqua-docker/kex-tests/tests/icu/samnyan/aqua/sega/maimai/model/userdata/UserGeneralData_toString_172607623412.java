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

public class UserGeneralData_toString_172607623412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term111743;

    public UserGeneralData_toString_172607623412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term111749 = new Long(3662777917800385964L);
        term111743 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserGeneralData"));
        Object term111745 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term111747 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term111763 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term111764 = newInstance(Class.forName("java.time.LocalDate"));
        Object term111768 = newInstance(Class.forName("java.time.LocalTime"));
        Object term111773 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term111774 = newInstance(Class.forName("java.time.LocalDate"));
        Object term111778 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term111743, term111743.getClass(), "id", -2637969624924642017L);
        setLongField(term111745, term111745.getClass(), "id", 1486119760230388070L);
        setLongField(term111747, term111747.getClass(), "id", 8298987863520566549L);
        setField(term111747, term111747.getClass(), "extId", term111749);
        setField(term111747, term111747.getClass(), "luid", "QIADULuFso");
        setIntField(term111764, term111764.getClass(), "year", 2018);
        setShortField(term111764, term111764.getClass(), "month", (short) 7);
        setShortField(term111764, term111764.getClass(), "day", (short) 9);
        setField(term111763, term111763.getClass(), "date", term111764);
        setByteField(term111768, term111768.getClass(), "hour", (byte) 23);
        setByteField(term111768, term111768.getClass(), "minute", (byte) 14);
        setByteField(term111768, term111768.getClass(), "second", (byte) 46);
        setIntField(term111768, term111768.getClass(), "nano", 735911690);
        setField(term111763, term111763.getClass(), "time", term111768);
        setField(term111747, term111747.getClass(), "registerTime", term111763);
        setIntField(term111774, term111774.getClass(), "year", 2013);
        setShortField(term111774, term111774.getClass(), "month", (short) 3);
        setShortField(term111774, term111774.getClass(), "day", (short) 22);
        setField(term111773, term111773.getClass(), "date", term111774);
        setByteField(term111778, term111778.getClass(), "hour", (byte) 5);
        setByteField(term111778, term111778.getClass(), "minute", (byte) 34);
        setByteField(term111778, term111778.getClass(), "second", (byte) 39);
        setIntField(term111778, term111778.getClass(), "nano", 3203168);
        setField(term111773, term111773.getClass(), "time", term111778);
        setField(term111747, term111747.getClass(), "accessTime", term111773);
        setField(term111745, term111745.getClass(), "card", term111747);
        setIntField(term111745, term111745.getClass(), "lastDataVersion", -1233239714);
        setField(term111745, term111745.getClass(), "userName", "XWnZIYfmmD");
        setIntField(term111745, term111745.getClass(), "point", -699807547);
        setIntField(term111745, term111745.getClass(), "totalPoint", -367006964);
        setIntField(term111745, term111745.getClass(), "iconId", 770134239);
        setIntField(term111745, term111745.getClass(), "nameplateId", -1196107767);
        setIntField(term111745, term111745.getClass(), "frameId", -1090930776);
        setIntField(term111745, term111745.getClass(), "trophyId", -664970301);
        setIntField(term111745, term111745.getClass(), "playCount", -430975239);
        setIntField(term111745, term111745.getClass(), "playVsCount", 1276909937);
        setIntField(term111745, term111745.getClass(), "playSyncCount", -1172444844);
        setIntField(term111745, term111745.getClass(), "winCount", 2013784342);
        setIntField(term111745, term111745.getClass(), "helpCount", -1307511700);
        setIntField(term111745, term111745.getClass(), "comboCount", 908109455);
        setIntField(term111745, term111745.getClass(), "feverCount", -194331492);
        setIntField(term111745, term111745.getClass(), "totalHiScore", 385537347);
        setIntField(term111745, term111745.getClass(), "totalEasyHighScore", 2002210105);
        setIntField(term111745, term111745.getClass(), "totalBasicHighScore", 548837946);
        setIntField(term111745, term111745.getClass(), "totalAdvancedHighScore", -753858590);
        setIntField(term111745, term111745.getClass(), "totalExpertHighScore", -1239607397);
        setIntField(term111745, term111745.getClass(), "totalMasterHighScore", -27255493);
        setIntField(term111745, term111745.getClass(), "totalReMasterHighScore", -1574305824);
        setIntField(term111745, term111745.getClass(), "totalHighSync", 404118457);
        setIntField(term111745, term111745.getClass(), "totalEasySync", 1980044368);
        setIntField(term111745, term111745.getClass(), "totalBasicSync", -1715014296);
        setIntField(term111745, term111745.getClass(), "totalAdvancedSync", 821264755);
        setIntField(term111745, term111745.getClass(), "totalExpertSync", -1122219060);
        setIntField(term111745, term111745.getClass(), "totalMasterSync", -1283490413);
        setIntField(term111745, term111745.getClass(), "totalReMasterSync", 1352370517);
        setIntField(term111745, term111745.getClass(), "playerRating", -1823113056);
        setIntField(term111745, term111745.getClass(), "highestRating", -237444611);
        setIntField(term111745, term111745.getClass(), "rankAuthTailId", -176508450);
        setField(term111745, term111745.getClass(), "eventWatchedDate", "PbkTntqZDZ");
        setField(term111745, term111745.getClass(), "webLimitDate", "yDWoqUswuW");
        setIntField(term111745, term111745.getClass(), "challengeTrackPhase", 1875398911);
        setIntField(term111745, term111745.getClass(), "firstPlayBits", 370478918);
        setField(term111745, term111745.getClass(), "lastPlayDate", "mgjEDzRwET");
        setIntField(term111745, term111745.getClass(), "lastPlaceId", 989896657);
        setField(term111745, term111745.getClass(), "lastPlaceName", "CepeBzACyE");
        setIntField(term111745, term111745.getClass(), "lastRegionId", 1410935694);
        setField(term111745, term111745.getClass(), "lastRegionName", "WtgzEUhZIl");
        setField(term111745, term111745.getClass(), "lastClientId", "tzigWGaijF");
        setField(term111745, term111745.getClass(), "lastCountryCode", "VWFNUuzpse");
        setIntField(term111745, term111745.getClass(), "eventPoint", 832242375);
        setIntField(term111745, term111745.getClass(), "totalLv", 1927641893);
        setIntField(term111745, term111745.getClass(), "lastLoginBonusDay", 260354570);
        setIntField(term111745, term111745.getClass(), "lastSurvivalBonusDay", 566416820);
        setIntField(term111745, term111745.getClass(), "loginBonusLv", 1472997822);
        setField(term111743, term111743.getClass(), "user", term111745);
        setField(term111743, term111743.getClass(), "propertyKey", "XdnUnODLtI");
        setField(term111743, term111743.getClass(), "propertyValue", "blbqUBWvWn");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserGeneralData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term111743, args);
    }

};


