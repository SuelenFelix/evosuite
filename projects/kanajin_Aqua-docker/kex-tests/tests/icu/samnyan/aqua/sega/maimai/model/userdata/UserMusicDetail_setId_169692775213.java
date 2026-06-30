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

public class UserMusicDetail_setId_169692775213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term183505;
     Object term183691;

    public UserMusicDetail_setId_169692775213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term183511 = new Long(7450734758126089960L);
        term183505 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserMusicDetail"));
        Object term183507 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term183509 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term183525 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term183526 = newInstance(Class.forName("java.time.LocalDate"));
        Object term183530 = newInstance(Class.forName("java.time.LocalTime"));
        Object term183535 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term183536 = newInstance(Class.forName("java.time.LocalDate"));
        Object term183540 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term183505, term183505.getClass(), "id", 3693671303799195202L);
        setLongField(term183507, term183507.getClass(), "id", 5122767787240845667L);
        setLongField(term183509, term183509.getClass(), "id", -1856029526365001621L);
        setField(term183509, term183509.getClass(), "extId", term183511);
        setField(term183509, term183509.getClass(), "luid", "mBvhIZezxE");
        setIntField(term183526, term183526.getClass(), "year", 2026);
        setShortField(term183526, term183526.getClass(), "month", (short) 7);
        setShortField(term183526, term183526.getClass(), "day", (short) 14);
        setField(term183525, term183525.getClass(), "date", term183526);
        setByteField(term183530, term183530.getClass(), "hour", (byte) 0);
        setByteField(term183530, term183530.getClass(), "minute", (byte) 23);
        setByteField(term183530, term183530.getClass(), "second", (byte) 25);
        setIntField(term183530, term183530.getClass(), "nano", 866814095);
        setField(term183525, term183525.getClass(), "time", term183530);
        setField(term183509, term183509.getClass(), "registerTime", term183525);
        setIntField(term183536, term183536.getClass(), "year", 2015);
        setShortField(term183536, term183536.getClass(), "month", (short) 10);
        setShortField(term183536, term183536.getClass(), "day", (short) 2);
        setField(term183535, term183535.getClass(), "date", term183536);
        setByteField(term183540, term183540.getClass(), "hour", (byte) 10);
        setByteField(term183540, term183540.getClass(), "minute", (byte) 7);
        setByteField(term183540, term183540.getClass(), "second", (byte) 29);
        setIntField(term183540, term183540.getClass(), "nano", 202938426);
        setField(term183535, term183535.getClass(), "time", term183540);
        setField(term183509, term183509.getClass(), "accessTime", term183535);
        setField(term183507, term183507.getClass(), "card", term183509);
        setIntField(term183507, term183507.getClass(), "lastDataVersion", 1838622682);
        setField(term183507, term183507.getClass(), "userName", "sswCagQpqo");
        setIntField(term183507, term183507.getClass(), "point", -406109350);
        setIntField(term183507, term183507.getClass(), "totalPoint", 797815649);
        setIntField(term183507, term183507.getClass(), "iconId", 931999736);
        setIntField(term183507, term183507.getClass(), "nameplateId", -300651667);
        setIntField(term183507, term183507.getClass(), "frameId", -1048497625);
        setIntField(term183507, term183507.getClass(), "trophyId", 181689078);
        setIntField(term183507, term183507.getClass(), "playCount", -826168137);
        setIntField(term183507, term183507.getClass(), "playVsCount", 477221152);
        setIntField(term183507, term183507.getClass(), "playSyncCount", 1023319265);
        setIntField(term183507, term183507.getClass(), "winCount", -1264226544);
        setIntField(term183507, term183507.getClass(), "helpCount", 1380061756);
        setIntField(term183507, term183507.getClass(), "comboCount", 1798891806);
        setIntField(term183507, term183507.getClass(), "feverCount", 1878050477);
        setIntField(term183507, term183507.getClass(), "totalHiScore", 1498041972);
        setIntField(term183507, term183507.getClass(), "totalEasyHighScore", 1662247107);
        setIntField(term183507, term183507.getClass(), "totalBasicHighScore", 1872541031);
        setIntField(term183507, term183507.getClass(), "totalAdvancedHighScore", -827509470);
        setIntField(term183507, term183507.getClass(), "totalExpertHighScore", 859195402);
        setIntField(term183507, term183507.getClass(), "totalMasterHighScore", 1202737127);
        setIntField(term183507, term183507.getClass(), "totalReMasterHighScore", 1885154242);
        setIntField(term183507, term183507.getClass(), "totalHighSync", -826196689);
        setIntField(term183507, term183507.getClass(), "totalEasySync", 1424650227);
        setIntField(term183507, term183507.getClass(), "totalBasicSync", 1508245539);
        setIntField(term183507, term183507.getClass(), "totalAdvancedSync", 302801650);
        setIntField(term183507, term183507.getClass(), "totalExpertSync", 720566843);
        setIntField(term183507, term183507.getClass(), "totalMasterSync", -2003226144);
        setIntField(term183507, term183507.getClass(), "totalReMasterSync", -228212588);
        setIntField(term183507, term183507.getClass(), "playerRating", 1683808039);
        setIntField(term183507, term183507.getClass(), "highestRating", -113765491);
        setIntField(term183507, term183507.getClass(), "rankAuthTailId", 264254625);
        setField(term183507, term183507.getClass(), "eventWatchedDate", "LrwYiZGGQg");
        setField(term183507, term183507.getClass(), "webLimitDate", "ugFOXAltBR");
        setIntField(term183507, term183507.getClass(), "challengeTrackPhase", 1680829699);
        setIntField(term183507, term183507.getClass(), "firstPlayBits", -492588617);
        setField(term183507, term183507.getClass(), "lastPlayDate", "PviulmdPhA");
        setIntField(term183507, term183507.getClass(), "lastPlaceId", 478737389);
        setField(term183507, term183507.getClass(), "lastPlaceName", "NAUDTajaNN");
        setIntField(term183507, term183507.getClass(), "lastRegionId", 1631871740);
        setField(term183507, term183507.getClass(), "lastRegionName", "BgJwVzSZYi");
        setField(term183507, term183507.getClass(), "lastClientId", "ecRYXrSwPc");
        setField(term183507, term183507.getClass(), "lastCountryCode", "EgUbHeKEEX");
        setIntField(term183507, term183507.getClass(), "eventPoint", 434120739);
        setIntField(term183507, term183507.getClass(), "totalLv", -449814515);
        setIntField(term183507, term183507.getClass(), "lastLoginBonusDay", 29185931);
        setIntField(term183507, term183507.getClass(), "lastSurvivalBonusDay", 1090858432);
        setIntField(term183507, term183507.getClass(), "loginBonusLv", 791901718);
        setField(term183505, term183505.getClass(), "user", term183507);
        setIntField(term183505, term183505.getClass(), "musicId", -456669727);
        setIntField(term183505, term183505.getClass(), "level", 1644778528);
        setIntField(term183505, term183505.getClass(), "playCount", -1650894056);
        setIntField(term183505, term183505.getClass(), "scoreMax", 1981610805);
        setIntField(term183505, term183505.getClass(), "syncRateMax", -1666292055);
        setBooleanField(term183505, term183505.getClass(), "isAllPerfect", true);
        setIntField(term183505, term183505.getClass(), "isAllPerfectPlus", -1249886381);
        setIntField(term183505, term183505.getClass(), "fullCombo", 154728228);
        setIntField(term183505, term183505.getClass(), "maxFever", 1090052880);
        setIntField(term183505, term183505.getClass(), "achievement", 226615887);
        term183691 = new Long(6951543447963559207L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term183691;
        callMethod(klass, "setId", argTypes, term183505, args);
    }

};


