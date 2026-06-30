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

public class UserGeneralData_getPropertyKey_20900239223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108641;

    public UserGeneralData_getPropertyKey_20900239223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term108647 = new Long(6150186973473930616L);
        term108641 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserGeneralData"));
        Object term108643 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term108645 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term108661 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term108662 = newInstance(Class.forName("java.time.LocalDate"));
        Object term108666 = newInstance(Class.forName("java.time.LocalTime"));
        Object term108671 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term108672 = newInstance(Class.forName("java.time.LocalDate"));
        Object term108676 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term108641, term108641.getClass(), "id", -8538697616110187183L);
        setLongField(term108643, term108643.getClass(), "id", -1177978844927364440L);
        setLongField(term108645, term108645.getClass(), "id", -2253606887164749750L);
        setField(term108645, term108645.getClass(), "extId", term108647);
        setField(term108645, term108645.getClass(), "luid", "uzPbXEJVpP");
        setIntField(term108662, term108662.getClass(), "year", 2029);
        setShortField(term108662, term108662.getClass(), "month", (short) 8);
        setShortField(term108662, term108662.getClass(), "day", (short) 22);
        setField(term108661, term108661.getClass(), "date", term108662);
        setByteField(term108666, term108666.getClass(), "hour", (byte) 10);
        setByteField(term108666, term108666.getClass(), "minute", (byte) 22);
        setByteField(term108666, term108666.getClass(), "second", (byte) 10);
        setIntField(term108666, term108666.getClass(), "nano", 996890551);
        setField(term108661, term108661.getClass(), "time", term108666);
        setField(term108645, term108645.getClass(), "registerTime", term108661);
        setIntField(term108672, term108672.getClass(), "year", 2021);
        setShortField(term108672, term108672.getClass(), "month", (short) 7);
        setShortField(term108672, term108672.getClass(), "day", (short) 26);
        setField(term108671, term108671.getClass(), "date", term108672);
        setByteField(term108676, term108676.getClass(), "hour", (byte) 16);
        setByteField(term108676, term108676.getClass(), "minute", (byte) 31);
        setByteField(term108676, term108676.getClass(), "second", (byte) 41);
        setIntField(term108676, term108676.getClass(), "nano", 114150112);
        setField(term108671, term108671.getClass(), "time", term108676);
        setField(term108645, term108645.getClass(), "accessTime", term108671);
        setField(term108643, term108643.getClass(), "card", term108645);
        setIntField(term108643, term108643.getClass(), "lastDataVersion", 1753008116);
        setField(term108643, term108643.getClass(), "userName", "vDorZRqjUi");
        setIntField(term108643, term108643.getClass(), "point", 1276815986);
        setIntField(term108643, term108643.getClass(), "totalPoint", -521303871);
        setIntField(term108643, term108643.getClass(), "iconId", -1392718153);
        setIntField(term108643, term108643.getClass(), "nameplateId", -256278679);
        setIntField(term108643, term108643.getClass(), "frameId", -524155996);
        setIntField(term108643, term108643.getClass(), "trophyId", -1349685301);
        setIntField(term108643, term108643.getClass(), "playCount", -2128633946);
        setIntField(term108643, term108643.getClass(), "playVsCount", 1147052903);
        setIntField(term108643, term108643.getClass(), "playSyncCount", 328521391);
        setIntField(term108643, term108643.getClass(), "winCount", 2086464016);
        setIntField(term108643, term108643.getClass(), "helpCount", 332481036);
        setIntField(term108643, term108643.getClass(), "comboCount", -962070662);
        setIntField(term108643, term108643.getClass(), "feverCount", -1257419523);
        setIntField(term108643, term108643.getClass(), "totalHiScore", -1180293605);
        setIntField(term108643, term108643.getClass(), "totalEasyHighScore", 1441290201);
        setIntField(term108643, term108643.getClass(), "totalBasicHighScore", -1067225283);
        setIntField(term108643, term108643.getClass(), "totalAdvancedHighScore", 1939913208);
        setIntField(term108643, term108643.getClass(), "totalExpertHighScore", 2000789813);
        setIntField(term108643, term108643.getClass(), "totalMasterHighScore", -1740920122);
        setIntField(term108643, term108643.getClass(), "totalReMasterHighScore", 306763791);
        setIntField(term108643, term108643.getClass(), "totalHighSync", 393909417);
        setIntField(term108643, term108643.getClass(), "totalEasySync", 682347070);
        setIntField(term108643, term108643.getClass(), "totalBasicSync", 1184037017);
        setIntField(term108643, term108643.getClass(), "totalAdvancedSync", 1807084039);
        setIntField(term108643, term108643.getClass(), "totalExpertSync", 12248994);
        setIntField(term108643, term108643.getClass(), "totalMasterSync", 1548844480);
        setIntField(term108643, term108643.getClass(), "totalReMasterSync", 1696710568);
        setIntField(term108643, term108643.getClass(), "playerRating", 224785444);
        setIntField(term108643, term108643.getClass(), "highestRating", -330212578);
        setIntField(term108643, term108643.getClass(), "rankAuthTailId", -383799487);
        setField(term108643, term108643.getClass(), "eventWatchedDate", "pTjttMNuyX");
        setField(term108643, term108643.getClass(), "webLimitDate", "fFPyzrPhJi");
        setIntField(term108643, term108643.getClass(), "challengeTrackPhase", -96219237);
        setIntField(term108643, term108643.getClass(), "firstPlayBits", -1518626871);
        setField(term108643, term108643.getClass(), "lastPlayDate", "tiYwzLkwHD");
        setIntField(term108643, term108643.getClass(), "lastPlaceId", -914604698);
        setField(term108643, term108643.getClass(), "lastPlaceName", "vHPMbWTklV");
        setIntField(term108643, term108643.getClass(), "lastRegionId", 1800655832);
        setField(term108643, term108643.getClass(), "lastRegionName", "phgJprcnjd");
        setField(term108643, term108643.getClass(), "lastClientId", "RRjrjGfCoC");
        setField(term108643, term108643.getClass(), "lastCountryCode", "MzbYanIDmI");
        setIntField(term108643, term108643.getClass(), "eventPoint", 191603316);
        setIntField(term108643, term108643.getClass(), "totalLv", -1398388889);
        setIntField(term108643, term108643.getClass(), "lastLoginBonusDay", -125489803);
        setIntField(term108643, term108643.getClass(), "lastSurvivalBonusDay", 55566850);
        setIntField(term108643, term108643.getClass(), "loginBonusLv", 78561748);
        setField(term108641, term108641.getClass(), "user", term108643);
        setField(term108641, term108641.getClass(), "propertyKey", "RYHcwmdSCF");
        setField(term108641, term108641.getClass(), "propertyValue", "PbtJLrRbsa");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserGeneralData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPropertyKey", argTypes, term108641, args);
    }

};


