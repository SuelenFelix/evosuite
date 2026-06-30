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

public class UserBoss_setPandoraFlagList0_177201387513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term92775;
     Object term92959;

    public UserBoss_setPandoraFlagList0_177201387513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term92781 = new Long(-1481367303699139651L);
        term92775 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserBoss"));
        Object term92777 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term92779 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term92795 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term92796 = newInstance(Class.forName("java.time.LocalDate"));
        Object term92800 = newInstance(Class.forName("java.time.LocalTime"));
        Object term92805 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term92806 = newInstance(Class.forName("java.time.LocalDate"));
        Object term92810 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term92775, term92775.getClass(), "id", -4539648422466320845L);
        setLongField(term92777, term92777.getClass(), "id", 369988508829037253L);
        setLongField(term92779, term92779.getClass(), "id", -9069994265835848577L);
        setField(term92779, term92779.getClass(), "extId", term92781);
        setField(term92779, term92779.getClass(), "luid", "RtHOddPkOW");
        setIntField(term92796, term92796.getClass(), "year", 2024);
        setShortField(term92796, term92796.getClass(), "month", (short) 1);
        setShortField(term92796, term92796.getClass(), "day", (short) 9);
        setField(term92795, term92795.getClass(), "date", term92796);
        setByteField(term92800, term92800.getClass(), "hour", (byte) 16);
        setByteField(term92800, term92800.getClass(), "minute", (byte) 51);
        setByteField(term92800, term92800.getClass(), "second", (byte) 43);
        setIntField(term92800, term92800.getClass(), "nano", 661225347);
        setField(term92795, term92795.getClass(), "time", term92800);
        setField(term92779, term92779.getClass(), "registerTime", term92795);
        setIntField(term92806, term92806.getClass(), "year", 2014);
        setShortField(term92806, term92806.getClass(), "month", (short) 6);
        setShortField(term92806, term92806.getClass(), "day", (short) 7);
        setField(term92805, term92805.getClass(), "date", term92806);
        setByteField(term92810, term92810.getClass(), "hour", (byte) 23);
        setByteField(term92810, term92810.getClass(), "minute", (byte) 34);
        setByteField(term92810, term92810.getClass(), "second", (byte) 36);
        setIntField(term92810, term92810.getClass(), "nano", 967981946);
        setField(term92805, term92805.getClass(), "time", term92810);
        setField(term92779, term92779.getClass(), "accessTime", term92805);
        setField(term92777, term92777.getClass(), "card", term92779);
        setIntField(term92777, term92777.getClass(), "lastDataVersion", 2091257387);
        setField(term92777, term92777.getClass(), "userName", "LAaHVAeRPU");
        setIntField(term92777, term92777.getClass(), "point", 1262385462);
        setIntField(term92777, term92777.getClass(), "totalPoint", 146198205);
        setIntField(term92777, term92777.getClass(), "iconId", 1811207533);
        setIntField(term92777, term92777.getClass(), "nameplateId", -1241224611);
        setIntField(term92777, term92777.getClass(), "frameId", 1661530764);
        setIntField(term92777, term92777.getClass(), "trophyId", -1244991565);
        setIntField(term92777, term92777.getClass(), "playCount", -865604268);
        setIntField(term92777, term92777.getClass(), "playVsCount", -629271467);
        setIntField(term92777, term92777.getClass(), "playSyncCount", -1485210649);
        setIntField(term92777, term92777.getClass(), "winCount", 343270861);
        setIntField(term92777, term92777.getClass(), "helpCount", 408001246);
        setIntField(term92777, term92777.getClass(), "comboCount", -413564129);
        setIntField(term92777, term92777.getClass(), "feverCount", -32548606);
        setIntField(term92777, term92777.getClass(), "totalHiScore", 129009378);
        setIntField(term92777, term92777.getClass(), "totalEasyHighScore", 1817148676);
        setIntField(term92777, term92777.getClass(), "totalBasicHighScore", 1276665124);
        setIntField(term92777, term92777.getClass(), "totalAdvancedHighScore", 631763699);
        setIntField(term92777, term92777.getClass(), "totalExpertHighScore", -2016696905);
        setIntField(term92777, term92777.getClass(), "totalMasterHighScore", 820644673);
        setIntField(term92777, term92777.getClass(), "totalReMasterHighScore", 1395411611);
        setIntField(term92777, term92777.getClass(), "totalHighSync", 1535159183);
        setIntField(term92777, term92777.getClass(), "totalEasySync", 542305172);
        setIntField(term92777, term92777.getClass(), "totalBasicSync", 1880502684);
        setIntField(term92777, term92777.getClass(), "totalAdvancedSync", 1208089406);
        setIntField(term92777, term92777.getClass(), "totalExpertSync", -822607091);
        setIntField(term92777, term92777.getClass(), "totalMasterSync", -1404356844);
        setIntField(term92777, term92777.getClass(), "totalReMasterSync", 1214654693);
        setIntField(term92777, term92777.getClass(), "playerRating", -1144368319);
        setIntField(term92777, term92777.getClass(), "highestRating", -1299647512);
        setIntField(term92777, term92777.getClass(), "rankAuthTailId", -738749379);
        setField(term92777, term92777.getClass(), "eventWatchedDate", "BLPwYfxwnm");
        setField(term92777, term92777.getClass(), "webLimitDate", "zItHVuBBzy");
        setIntField(term92777, term92777.getClass(), "challengeTrackPhase", 2067337022);
        setIntField(term92777, term92777.getClass(), "firstPlayBits", -462097537);
        setField(term92777, term92777.getClass(), "lastPlayDate", "pQcdIREjlp");
        setIntField(term92777, term92777.getClass(), "lastPlaceId", 1791338762);
        setField(term92777, term92777.getClass(), "lastPlaceName", "WjUrdNMIOj");
        setIntField(term92777, term92777.getClass(), "lastRegionId", 1852645839);
        setField(term92777, term92777.getClass(), "lastRegionName", "aQUpwHjYvS");
        setField(term92777, term92777.getClass(), "lastClientId", "lvcTLkVhAN");
        setField(term92777, term92777.getClass(), "lastCountryCode", "BJJuVqxXjT");
        setIntField(term92777, term92777.getClass(), "eventPoint", 439157981);
        setIntField(term92777, term92777.getClass(), "totalLv", 2026803446);
        setIntField(term92777, term92777.getClass(), "lastLoginBonusDay", -1060834778);
        setIntField(term92777, term92777.getClass(), "lastSurvivalBonusDay", 1424979936);
        setIntField(term92777, term92777.getClass(), "loginBonusLv", 1913639183);
        setField(term92775, term92775.getClass(), "user", term92777);
        setLongField(term92775, term92775.getClass(), "pandoraFlagList0", -1698215709085558019L);
        setLongField(term92775, term92775.getClass(), "pandoraFlagList1", -9057998854977924783L);
        setLongField(term92775, term92775.getClass(), "pandoraFlagList2", 8015201292704898322L);
        setLongField(term92775, term92775.getClass(), "pandoraFlagList3", 623115373634781772L);
        setLongField(term92775, term92775.getClass(), "pandoraFlagList4", -6928102703492980650L);
        setLongField(term92775, term92775.getClass(), "pandoraFlagList5", -5269076898456067678L);
        setLongField(term92775, term92775.getClass(), "pandoraFlagList6", 2124275424075254005L);
        setLongField(term92775, term92775.getClass(), "emblemFlagList", -6616339196088014666L);
        term92959 = new Long(-1437596366836021966L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserBoss");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term92959;
        callMethod(klass, "setPandoraFlagList0", argTypes, term92775, args);
    }

};


