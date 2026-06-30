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

public class UserData_getEventWatchedDate_156666725834 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8977;

    public UserData_getEventWatchedDate_156666725834() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term8981 = new Long(-484994522244390100L);
        term8977 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term8979 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term8995 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8996 = newInstance(Class.forName("java.time.LocalDate"));
        Object term9000 = newInstance(Class.forName("java.time.LocalTime"));
        Object term9005 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term9006 = newInstance(Class.forName("java.time.LocalDate"));
        Object term9010 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term8977, term8977.getClass(), "id", 305759998609888272L);
        setLongField(term8979, term8979.getClass(), "id", -8654565919063661957L);
        setField(term8979, term8979.getClass(), "extId", term8981);
        setField(term8979, term8979.getClass(), "luid", "QSrDQfEsTR");
        setIntField(term8996, term8996.getClass(), "year", 2028);
        setShortField(term8996, term8996.getClass(), "month", (short) 4);
        setShortField(term8996, term8996.getClass(), "day", (short) 1);
        setField(term8995, term8995.getClass(), "date", term8996);
        setByteField(term9000, term9000.getClass(), "hour", (byte) 16);
        setByteField(term9000, term9000.getClass(), "minute", (byte) 22);
        setByteField(term9000, term9000.getClass(), "second", (byte) 32);
        setIntField(term9000, term9000.getClass(), "nano", 406353763);
        setField(term8995, term8995.getClass(), "time", term9000);
        setField(term8979, term8979.getClass(), "registerTime", term8995);
        setIntField(term9006, term9006.getClass(), "year", 2019);
        setShortField(term9006, term9006.getClass(), "month", (short) 7);
        setShortField(term9006, term9006.getClass(), "day", (short) 19);
        setField(term9005, term9005.getClass(), "date", term9006);
        setByteField(term9010, term9010.getClass(), "hour", (byte) 10);
        setByteField(term9010, term9010.getClass(), "minute", (byte) 54);
        setByteField(term9010, term9010.getClass(), "second", (byte) 55);
        setIntField(term9010, term9010.getClass(), "nano", 244650454);
        setField(term9005, term9005.getClass(), "time", term9010);
        setField(term8979, term8979.getClass(), "accessTime", term9005);
        setField(term8977, term8977.getClass(), "card", term8979);
        setIntField(term8977, term8977.getClass(), "lastDataVersion", -1825382367);
        setField(term8977, term8977.getClass(), "userName", "PsqusYmejD");
        setIntField(term8977, term8977.getClass(), "point", -1791371074);
        setIntField(term8977, term8977.getClass(), "totalPoint", -1151122332);
        setIntField(term8977, term8977.getClass(), "iconId", 953387911);
        setIntField(term8977, term8977.getClass(), "nameplateId", -1550025613);
        setIntField(term8977, term8977.getClass(), "frameId", 814617314);
        setIntField(term8977, term8977.getClass(), "trophyId", -159489307);
        setIntField(term8977, term8977.getClass(), "playCount", 1317020952);
        setIntField(term8977, term8977.getClass(), "playVsCount", -742710703);
        setIntField(term8977, term8977.getClass(), "playSyncCount", -355505521);
        setIntField(term8977, term8977.getClass(), "winCount", 1227316523);
        setIntField(term8977, term8977.getClass(), "helpCount", -58633039);
        setIntField(term8977, term8977.getClass(), "comboCount", 448061908);
        setIntField(term8977, term8977.getClass(), "feverCount", -1268483887);
        setIntField(term8977, term8977.getClass(), "totalHiScore", -1929689681);
        setIntField(term8977, term8977.getClass(), "totalEasyHighScore", -91240911);
        setIntField(term8977, term8977.getClass(), "totalBasicHighScore", -321227954);
        setIntField(term8977, term8977.getClass(), "totalAdvancedHighScore", 373810833);
        setIntField(term8977, term8977.getClass(), "totalExpertHighScore", -215979293);
        setIntField(term8977, term8977.getClass(), "totalMasterHighScore", -19567889);
        setIntField(term8977, term8977.getClass(), "totalReMasterHighScore", 693500318);
        setIntField(term8977, term8977.getClass(), "totalHighSync", 1702404702);
        setIntField(term8977, term8977.getClass(), "totalEasySync", 1141592999);
        setIntField(term8977, term8977.getClass(), "totalBasicSync", 848113442);
        setIntField(term8977, term8977.getClass(), "totalAdvancedSync", 793974213);
        setIntField(term8977, term8977.getClass(), "totalExpertSync", 722546287);
        setIntField(term8977, term8977.getClass(), "totalMasterSync", -2060284160);
        setIntField(term8977, term8977.getClass(), "totalReMasterSync", -568450686);
        setIntField(term8977, term8977.getClass(), "playerRating", 1314660281);
        setIntField(term8977, term8977.getClass(), "highestRating", -126399768);
        setIntField(term8977, term8977.getClass(), "rankAuthTailId", 318982923);
        setField(term8977, term8977.getClass(), "eventWatchedDate", "NTWMiBEaDF");
        setField(term8977, term8977.getClass(), "webLimitDate", "SPBstwKFVr");
        setIntField(term8977, term8977.getClass(), "challengeTrackPhase", -154210001);
        setIntField(term8977, term8977.getClass(), "firstPlayBits", 621910137);
        setField(term8977, term8977.getClass(), "lastPlayDate", "WxYUTuqmIq");
        setIntField(term8977, term8977.getClass(), "lastPlaceId", 241533020);
        setField(term8977, term8977.getClass(), "lastPlaceName", "OeQLvhVERT");
        setIntField(term8977, term8977.getClass(), "lastRegionId", 2081679151);
        setField(term8977, term8977.getClass(), "lastRegionName", "IlvgFINwIa");
        setField(term8977, term8977.getClass(), "lastClientId", "GEJABPlHSI");
        setField(term8977, term8977.getClass(), "lastCountryCode", "aQFUvuaYxd");
        setIntField(term8977, term8977.getClass(), "eventPoint", -1030167086);
        setIntField(term8977, term8977.getClass(), "totalLv", -434230943);
        setIntField(term8977, term8977.getClass(), "lastLoginBonusDay", 698633875);
        setIntField(term8977, term8977.getClass(), "lastSurvivalBonusDay", 548468113);
        setIntField(term8977, term8977.getClass(), "loginBonusLv", 1701819905);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEventWatchedDate", argTypes, term8977, args);
    }

};


