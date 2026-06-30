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

public class UserMusicDetail_setAchievement_118825279224 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term186825;
     Object term187011;

    public UserMusicDetail_setAchievement_118825279224() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term186831 = new Long(-7574091101944828886L);
        term186825 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserMusicDetail"));
        Object term186827 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term186829 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term186845 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term186846 = newInstance(Class.forName("java.time.LocalDate"));
        Object term186850 = newInstance(Class.forName("java.time.LocalTime"));
        Object term186855 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term186856 = newInstance(Class.forName("java.time.LocalDate"));
        Object term186860 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term186825, term186825.getClass(), "id", -5381866975637720642L);
        setLongField(term186827, term186827.getClass(), "id", -3951751659567091652L);
        setLongField(term186829, term186829.getClass(), "id", 3805208480992130216L);
        setField(term186829, term186829.getClass(), "extId", term186831);
        setField(term186829, term186829.getClass(), "luid", "AwEMMAveFP");
        setIntField(term186846, term186846.getClass(), "year", 2022);
        setShortField(term186846, term186846.getClass(), "month", (short) 6);
        setShortField(term186846, term186846.getClass(), "day", (short) 16);
        setField(term186845, term186845.getClass(), "date", term186846);
        setByteField(term186850, term186850.getClass(), "hour", (byte) 7);
        setByteField(term186850, term186850.getClass(), "minute", (byte) 13);
        setByteField(term186850, term186850.getClass(), "second", (byte) 14);
        setIntField(term186850, term186850.getClass(), "nano", 284843097);
        setField(term186845, term186845.getClass(), "time", term186850);
        setField(term186829, term186829.getClass(), "registerTime", term186845);
        setIntField(term186856, term186856.getClass(), "year", 2026);
        setShortField(term186856, term186856.getClass(), "month", (short) 10);
        setShortField(term186856, term186856.getClass(), "day", (short) 8);
        setField(term186855, term186855.getClass(), "date", term186856);
        setByteField(term186860, term186860.getClass(), "hour", (byte) 23);
        setByteField(term186860, term186860.getClass(), "minute", (byte) 47);
        setByteField(term186860, term186860.getClass(), "second", (byte) 50);
        setIntField(term186860, term186860.getClass(), "nano", 794191369);
        setField(term186855, term186855.getClass(), "time", term186860);
        setField(term186829, term186829.getClass(), "accessTime", term186855);
        setField(term186827, term186827.getClass(), "card", term186829);
        setIntField(term186827, term186827.getClass(), "lastDataVersion", 2017916645);
        setField(term186827, term186827.getClass(), "userName", "uILgJuNCYC");
        setIntField(term186827, term186827.getClass(), "point", -1885688651);
        setIntField(term186827, term186827.getClass(), "totalPoint", -669891096);
        setIntField(term186827, term186827.getClass(), "iconId", 444508774);
        setIntField(term186827, term186827.getClass(), "nameplateId", -1646512710);
        setIntField(term186827, term186827.getClass(), "frameId", -842803149);
        setIntField(term186827, term186827.getClass(), "trophyId", -1470870038);
        setIntField(term186827, term186827.getClass(), "playCount", 1901214983);
        setIntField(term186827, term186827.getClass(), "playVsCount", -912677436);
        setIntField(term186827, term186827.getClass(), "playSyncCount", 501483542);
        setIntField(term186827, term186827.getClass(), "winCount", -1341378441);
        setIntField(term186827, term186827.getClass(), "helpCount", 1543260834);
        setIntField(term186827, term186827.getClass(), "comboCount", -1816497982);
        setIntField(term186827, term186827.getClass(), "feverCount", -1094263531);
        setIntField(term186827, term186827.getClass(), "totalHiScore", -882836007);
        setIntField(term186827, term186827.getClass(), "totalEasyHighScore", 1898732537);
        setIntField(term186827, term186827.getClass(), "totalBasicHighScore", -188432554);
        setIntField(term186827, term186827.getClass(), "totalAdvancedHighScore", 2048037012);
        setIntField(term186827, term186827.getClass(), "totalExpertHighScore", 1439251579);
        setIntField(term186827, term186827.getClass(), "totalMasterHighScore", 1072263729);
        setIntField(term186827, term186827.getClass(), "totalReMasterHighScore", -942974196);
        setIntField(term186827, term186827.getClass(), "totalHighSync", -445020067);
        setIntField(term186827, term186827.getClass(), "totalEasySync", -1194687350);
        setIntField(term186827, term186827.getClass(), "totalBasicSync", -265509979);
        setIntField(term186827, term186827.getClass(), "totalAdvancedSync", -2137461606);
        setIntField(term186827, term186827.getClass(), "totalExpertSync", 734327184);
        setIntField(term186827, term186827.getClass(), "totalMasterSync", -39538216);
        setIntField(term186827, term186827.getClass(), "totalReMasterSync", -842518026);
        setIntField(term186827, term186827.getClass(), "playerRating", -1604691351);
        setIntField(term186827, term186827.getClass(), "highestRating", 1677301464);
        setIntField(term186827, term186827.getClass(), "rankAuthTailId", -1872506876);
        setField(term186827, term186827.getClass(), "eventWatchedDate", "gUkbWFfDwB");
        setField(term186827, term186827.getClass(), "webLimitDate", "kTamONbRjQ");
        setIntField(term186827, term186827.getClass(), "challengeTrackPhase", 1516334438);
        setIntField(term186827, term186827.getClass(), "firstPlayBits", 1219627860);
        setField(term186827, term186827.getClass(), "lastPlayDate", "hGULbvEJOJ");
        setIntField(term186827, term186827.getClass(), "lastPlaceId", 53962207);
        setField(term186827, term186827.getClass(), "lastPlaceName", "mHRhpRdJAm");
        setIntField(term186827, term186827.getClass(), "lastRegionId", 753018072);
        setField(term186827, term186827.getClass(), "lastRegionName", "JPPiPXJaoa");
        setField(term186827, term186827.getClass(), "lastClientId", "fGLEhwmSAi");
        setField(term186827, term186827.getClass(), "lastCountryCode", "oBoeDHJtuf");
        setIntField(term186827, term186827.getClass(), "eventPoint", 1490352486);
        setIntField(term186827, term186827.getClass(), "totalLv", -1149890129);
        setIntField(term186827, term186827.getClass(), "lastLoginBonusDay", 990337027);
        setIntField(term186827, term186827.getClass(), "lastSurvivalBonusDay", -1560937231);
        setIntField(term186827, term186827.getClass(), "loginBonusLv", 1505904236);
        setField(term186825, term186825.getClass(), "user", term186827);
        setIntField(term186825, term186825.getClass(), "musicId", -1460174198);
        setIntField(term186825, term186825.getClass(), "level", -791498167);
        setIntField(term186825, term186825.getClass(), "playCount", 1151147685);
        setIntField(term186825, term186825.getClass(), "scoreMax", 1333024010);
        setIntField(term186825, term186825.getClass(), "syncRateMax", 2010217781);
        setBooleanField(term186825, term186825.getClass(), "isAllPerfect", false);
        setIntField(term186825, term186825.getClass(), "isAllPerfectPlus", 393859217);
        setIntField(term186825, term186825.getClass(), "fullCombo", 296879904);
        setIntField(term186825, term186825.getClass(), "maxFever", -1809115588);
        setIntField(term186825, term186825.getClass(), "achievement", -2078103801);
        term187011 = new Integer(-1867517941);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term187011;
        callMethod(klass, "setAchievement", argTypes, term186825, args);
    }

};


