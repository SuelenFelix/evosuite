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

public class UserMusicDetail_getAchievement_127889893012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term183229;

    public UserMusicDetail_getAchievement_127889893012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term183235 = new Long(4530705892517898929L);
        term183229 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserMusicDetail"));
        Object term183231 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term183233 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term183249 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term183250 = newInstance(Class.forName("java.time.LocalDate"));
        Object term183254 = newInstance(Class.forName("java.time.LocalTime"));
        Object term183259 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term183260 = newInstance(Class.forName("java.time.LocalDate"));
        Object term183264 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term183229, term183229.getClass(), "id", 6550654434780156893L);
        setLongField(term183231, term183231.getClass(), "id", 2915324594222120179L);
        setLongField(term183233, term183233.getClass(), "id", 6230221287187976505L);
        setField(term183233, term183233.getClass(), "extId", term183235);
        setField(term183233, term183233.getClass(), "luid", "yHeJtottbK");
        setIntField(term183250, term183250.getClass(), "year", 2010);
        setShortField(term183250, term183250.getClass(), "month", (short) 9);
        setShortField(term183250, term183250.getClass(), "day", (short) 8);
        setField(term183249, term183249.getClass(), "date", term183250);
        setByteField(term183254, term183254.getClass(), "hour", (byte) 10);
        setByteField(term183254, term183254.getClass(), "minute", (byte) 51);
        setByteField(term183254, term183254.getClass(), "second", (byte) 17);
        setIntField(term183254, term183254.getClass(), "nano", 736149959);
        setField(term183249, term183249.getClass(), "time", term183254);
        setField(term183233, term183233.getClass(), "registerTime", term183249);
        setIntField(term183260, term183260.getClass(), "year", 2022);
        setShortField(term183260, term183260.getClass(), "month", (short) 6);
        setShortField(term183260, term183260.getClass(), "day", (short) 3);
        setField(term183259, term183259.getClass(), "date", term183260);
        setByteField(term183264, term183264.getClass(), "hour", (byte) 14);
        setByteField(term183264, term183264.getClass(), "minute", (byte) 38);
        setByteField(term183264, term183264.getClass(), "second", (byte) 25);
        setIntField(term183264, term183264.getClass(), "nano", 986041484);
        setField(term183259, term183259.getClass(), "time", term183264);
        setField(term183233, term183233.getClass(), "accessTime", term183259);
        setField(term183231, term183231.getClass(), "card", term183233);
        setIntField(term183231, term183231.getClass(), "lastDataVersion", -1652950002);
        setField(term183231, term183231.getClass(), "userName", "EsebiMkeGU");
        setIntField(term183231, term183231.getClass(), "point", 1507858766);
        setIntField(term183231, term183231.getClass(), "totalPoint", 1976269197);
        setIntField(term183231, term183231.getClass(), "iconId", 125717085);
        setIntField(term183231, term183231.getClass(), "nameplateId", 1936913239);
        setIntField(term183231, term183231.getClass(), "frameId", 2111155870);
        setIntField(term183231, term183231.getClass(), "trophyId", -1212199958);
        setIntField(term183231, term183231.getClass(), "playCount", -17156620);
        setIntField(term183231, term183231.getClass(), "playVsCount", 1035486061);
        setIntField(term183231, term183231.getClass(), "playSyncCount", -61511771);
        setIntField(term183231, term183231.getClass(), "winCount", -2091211182);
        setIntField(term183231, term183231.getClass(), "helpCount", -1089395185);
        setIntField(term183231, term183231.getClass(), "comboCount", 91597068);
        setIntField(term183231, term183231.getClass(), "feverCount", -827122687);
        setIntField(term183231, term183231.getClass(), "totalHiScore", -389628664);
        setIntField(term183231, term183231.getClass(), "totalEasyHighScore", -500289334);
        setIntField(term183231, term183231.getClass(), "totalBasicHighScore", -825119915);
        setIntField(term183231, term183231.getClass(), "totalAdvancedHighScore", 1551858482);
        setIntField(term183231, term183231.getClass(), "totalExpertHighScore", -385229935);
        setIntField(term183231, term183231.getClass(), "totalMasterHighScore", 1482152184);
        setIntField(term183231, term183231.getClass(), "totalReMasterHighScore", 1499591192);
        setIntField(term183231, term183231.getClass(), "totalHighSync", 1900142480);
        setIntField(term183231, term183231.getClass(), "totalEasySync", 446525078);
        setIntField(term183231, term183231.getClass(), "totalBasicSync", 505748531);
        setIntField(term183231, term183231.getClass(), "totalAdvancedSync", -2087175082);
        setIntField(term183231, term183231.getClass(), "totalExpertSync", 822598782);
        setIntField(term183231, term183231.getClass(), "totalMasterSync", -197113842);
        setIntField(term183231, term183231.getClass(), "totalReMasterSync", 179097140);
        setIntField(term183231, term183231.getClass(), "playerRating", 254393089);
        setIntField(term183231, term183231.getClass(), "highestRating", 950205408);
        setIntField(term183231, term183231.getClass(), "rankAuthTailId", 1046905244);
        setField(term183231, term183231.getClass(), "eventWatchedDate", "ronKInFVff");
        setField(term183231, term183231.getClass(), "webLimitDate", "OTWCnNUjew");
        setIntField(term183231, term183231.getClass(), "challengeTrackPhase", 230610277);
        setIntField(term183231, term183231.getClass(), "firstPlayBits", -1135946747);
        setField(term183231, term183231.getClass(), "lastPlayDate", "oUSILMxQiI");
        setIntField(term183231, term183231.getClass(), "lastPlaceId", 654335690);
        setField(term183231, term183231.getClass(), "lastPlaceName", "dohWFHGwwR");
        setIntField(term183231, term183231.getClass(), "lastRegionId", -2049269451);
        setField(term183231, term183231.getClass(), "lastRegionName", "yXKOrgWdes");
        setField(term183231, term183231.getClass(), "lastClientId", "LIssGNIAFq");
        setField(term183231, term183231.getClass(), "lastCountryCode", "MqkrVMSgoi");
        setIntField(term183231, term183231.getClass(), "eventPoint", -996401996);
        setIntField(term183231, term183231.getClass(), "totalLv", -1498050165);
        setIntField(term183231, term183231.getClass(), "lastLoginBonusDay", -1953680007);
        setIntField(term183231, term183231.getClass(), "lastSurvivalBonusDay", 221897733);
        setIntField(term183231, term183231.getClass(), "loginBonusLv", -1185198422);
        setField(term183229, term183229.getClass(), "user", term183231);
        setIntField(term183229, term183229.getClass(), "musicId", -1844362885);
        setIntField(term183229, term183229.getClass(), "level", 223756934);
        setIntField(term183229, term183229.getClass(), "playCount", -785394797);
        setIntField(term183229, term183229.getClass(), "scoreMax", 1836428731);
        setIntField(term183229, term183229.getClass(), "syncRateMax", 934676803);
        setBooleanField(term183229, term183229.getClass(), "isAllPerfect", true);
        setIntField(term183229, term183229.getClass(), "isAllPerfectPlus", 1858067800);
        setIntField(term183229, term183229.getClass(), "fullCombo", 1257474338);
        setIntField(term183229, term183229.getClass(), "maxFever", -1948738081);
        setIntField(term183229, term183229.getClass(), "achievement", -2043711017);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAchievement", argTypes, term183229, args);
    }

};


