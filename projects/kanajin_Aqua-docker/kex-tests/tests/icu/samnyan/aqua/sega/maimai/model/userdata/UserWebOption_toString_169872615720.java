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

public class UserWebOption_toString_169872615720 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42973;

    public UserWebOption_toString_169872615720() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term42979 = new Long(-6587807377747738663L);
        term42973 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserWebOption"));
        Object term42975 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term42977 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term42993 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term42994 = newInstance(Class.forName("java.time.LocalDate"));
        Object term42998 = newInstance(Class.forName("java.time.LocalTime"));
        Object term43003 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term43004 = newInstance(Class.forName("java.time.LocalDate"));
        Object term43008 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term42973, term42973.getClass(), "id", 4139034517298316285L);
        setLongField(term42975, term42975.getClass(), "id", 5797412846146719084L);
        setLongField(term42977, term42977.getClass(), "id", 5319740127125920367L);
        setField(term42977, term42977.getClass(), "extId", term42979);
        setField(term42977, term42977.getClass(), "luid", "cHqLMqZSmc");
        setIntField(term42994, term42994.getClass(), "year", 2014);
        setShortField(term42994, term42994.getClass(), "month", (short) 5);
        setShortField(term42994, term42994.getClass(), "day", (short) 20);
        setField(term42993, term42993.getClass(), "date", term42994);
        setByteField(term42998, term42998.getClass(), "hour", (byte) 12);
        setByteField(term42998, term42998.getClass(), "minute", (byte) 30);
        setByteField(term42998, term42998.getClass(), "second", (byte) 37);
        setIntField(term42998, term42998.getClass(), "nano", 390283474);
        setField(term42993, term42993.getClass(), "time", term42998);
        setField(term42977, term42977.getClass(), "registerTime", term42993);
        setIntField(term43004, term43004.getClass(), "year", 2028);
        setShortField(term43004, term43004.getClass(), "month", (short) 11);
        setShortField(term43004, term43004.getClass(), "day", (short) 28);
        setField(term43003, term43003.getClass(), "date", term43004);
        setByteField(term43008, term43008.getClass(), "hour", (byte) 4);
        setByteField(term43008, term43008.getClass(), "minute", (byte) 25);
        setByteField(term43008, term43008.getClass(), "second", (byte) 12);
        setIntField(term43008, term43008.getClass(), "nano", 726554360);
        setField(term43003, term43003.getClass(), "time", term43008);
        setField(term42977, term42977.getClass(), "accessTime", term43003);
        setField(term42975, term42975.getClass(), "card", term42977);
        setIntField(term42975, term42975.getClass(), "lastDataVersion", -843385533);
        setField(term42975, term42975.getClass(), "userName", "hkWmAkXSOW");
        setIntField(term42975, term42975.getClass(), "point", -156627014);
        setIntField(term42975, term42975.getClass(), "totalPoint", -933160129);
        setIntField(term42975, term42975.getClass(), "iconId", 1272821016);
        setIntField(term42975, term42975.getClass(), "nameplateId", -1553822493);
        setIntField(term42975, term42975.getClass(), "frameId", -623107839);
        setIntField(term42975, term42975.getClass(), "trophyId", -598781625);
        setIntField(term42975, term42975.getClass(), "playCount", -1717992579);
        setIntField(term42975, term42975.getClass(), "playVsCount", 271835355);
        setIntField(term42975, term42975.getClass(), "playSyncCount", -715995272);
        setIntField(term42975, term42975.getClass(), "winCount", 1175202910);
        setIntField(term42975, term42975.getClass(), "helpCount", 1984427818);
        setIntField(term42975, term42975.getClass(), "comboCount", 163785192);
        setIntField(term42975, term42975.getClass(), "feverCount", 699884037);
        setIntField(term42975, term42975.getClass(), "totalHiScore", -151920832);
        setIntField(term42975, term42975.getClass(), "totalEasyHighScore", 1800895955);
        setIntField(term42975, term42975.getClass(), "totalBasicHighScore", 1475225110);
        setIntField(term42975, term42975.getClass(), "totalAdvancedHighScore", -746882829);
        setIntField(term42975, term42975.getClass(), "totalExpertHighScore", 1303334365);
        setIntField(term42975, term42975.getClass(), "totalMasterHighScore", 931490251);
        setIntField(term42975, term42975.getClass(), "totalReMasterHighScore", -1812785070);
        setIntField(term42975, term42975.getClass(), "totalHighSync", -1062041611);
        setIntField(term42975, term42975.getClass(), "totalEasySync", -2077054717);
        setIntField(term42975, term42975.getClass(), "totalBasicSync", 93713831);
        setIntField(term42975, term42975.getClass(), "totalAdvancedSync", 1530899774);
        setIntField(term42975, term42975.getClass(), "totalExpertSync", 556786794);
        setIntField(term42975, term42975.getClass(), "totalMasterSync", 2062913883);
        setIntField(term42975, term42975.getClass(), "totalReMasterSync", 873881120);
        setIntField(term42975, term42975.getClass(), "playerRating", 1451809092);
        setIntField(term42975, term42975.getClass(), "highestRating", -274316319);
        setIntField(term42975, term42975.getClass(), "rankAuthTailId", -403442279);
        setField(term42975, term42975.getClass(), "eventWatchedDate", "DwQmZEKeOp");
        setField(term42975, term42975.getClass(), "webLimitDate", "DbxrFiyttv");
        setIntField(term42975, term42975.getClass(), "challengeTrackPhase", 269235773);
        setIntField(term42975, term42975.getClass(), "firstPlayBits", 87688173);
        setField(term42975, term42975.getClass(), "lastPlayDate", "iVIrSxTsaM");
        setIntField(term42975, term42975.getClass(), "lastPlaceId", 979019488);
        setField(term42975, term42975.getClass(), "lastPlaceName", "FmJNEfmYgq");
        setIntField(term42975, term42975.getClass(), "lastRegionId", 1853235183);
        setField(term42975, term42975.getClass(), "lastRegionName", "NqQofgWsJd");
        setField(term42975, term42975.getClass(), "lastClientId", "ZlVRdHsBMO");
        setField(term42975, term42975.getClass(), "lastCountryCode", "UMMXkhuqzw");
        setIntField(term42975, term42975.getClass(), "eventPoint", 2097371569);
        setIntField(term42975, term42975.getClass(), "totalLv", -10808205);
        setIntField(term42975, term42975.getClass(), "lastLoginBonusDay", -774591519);
        setIntField(term42975, term42975.getClass(), "lastSurvivalBonusDay", 1785308866);
        setIntField(term42975, term42975.getClass(), "loginBonusLv", 1881022849);
        setField(term42973, term42973.getClass(), "user", term42975);
        setBooleanField(term42973, term42973.getClass(), "isNetMember", true);
        setIntField(term42973, term42973.getClass(), "dispRate", -1443744876);
        setIntField(term42973, term42973.getClass(), "dispJudgeStyle", 1913818780);
        setIntField(term42973, term42973.getClass(), "dispRank", 2106340511);
        setIntField(term42973, term42973.getClass(), "dispHomeRanker", 1742847722);
        setIntField(term42973, term42973.getClass(), "dispTotalLv", 1423922857);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserWebOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term42973, args);
    }

};


