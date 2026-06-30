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

public class UserMusicDetail_setFullCombo_140068071222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term186269;
     Object term186455;

    public UserMusicDetail_setFullCombo_140068071222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term186275 = new Long(3447455321955655601L);
        term186269 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserMusicDetail"));
        Object term186271 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term186273 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term186289 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term186290 = newInstance(Class.forName("java.time.LocalDate"));
        Object term186294 = newInstance(Class.forName("java.time.LocalTime"));
        Object term186299 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term186300 = newInstance(Class.forName("java.time.LocalDate"));
        Object term186304 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term186269, term186269.getClass(), "id", 1147867669908260197L);
        setLongField(term186271, term186271.getClass(), "id", -4547752041588255808L);
        setLongField(term186273, term186273.getClass(), "id", -3197677601690573647L);
        setField(term186273, term186273.getClass(), "extId", term186275);
        setField(term186273, term186273.getClass(), "luid", "ZdtqQPtFUL");
        setIntField(term186290, term186290.getClass(), "year", 2025);
        setShortField(term186290, term186290.getClass(), "month", (short) 9);
        setShortField(term186290, term186290.getClass(), "day", (short) 28);
        setField(term186289, term186289.getClass(), "date", term186290);
        setByteField(term186294, term186294.getClass(), "hour", (byte) 19);
        setByteField(term186294, term186294.getClass(), "minute", (byte) 59);
        setByteField(term186294, term186294.getClass(), "second", (byte) 17);
        setIntField(term186294, term186294.getClass(), "nano", 528282549);
        setField(term186289, term186289.getClass(), "time", term186294);
        setField(term186273, term186273.getClass(), "registerTime", term186289);
        setIntField(term186300, term186300.getClass(), "year", 2024);
        setShortField(term186300, term186300.getClass(), "month", (short) 9);
        setShortField(term186300, term186300.getClass(), "day", (short) 15);
        setField(term186299, term186299.getClass(), "date", term186300);
        setByteField(term186304, term186304.getClass(), "hour", (byte) 7);
        setByteField(term186304, term186304.getClass(), "minute", (byte) 33);
        setByteField(term186304, term186304.getClass(), "second", (byte) 0);
        setIntField(term186304, term186304.getClass(), "nano", 990831240);
        setField(term186299, term186299.getClass(), "time", term186304);
        setField(term186273, term186273.getClass(), "accessTime", term186299);
        setField(term186271, term186271.getClass(), "card", term186273);
        setIntField(term186271, term186271.getClass(), "lastDataVersion", 1547349648);
        setField(term186271, term186271.getClass(), "userName", "PsuOGjzsiR");
        setIntField(term186271, term186271.getClass(), "point", -609059585);
        setIntField(term186271, term186271.getClass(), "totalPoint", 1054746926);
        setIntField(term186271, term186271.getClass(), "iconId", -909284296);
        setIntField(term186271, term186271.getClass(), "nameplateId", -1099231922);
        setIntField(term186271, term186271.getClass(), "frameId", 813019973);
        setIntField(term186271, term186271.getClass(), "trophyId", -450164269);
        setIntField(term186271, term186271.getClass(), "playCount", 1500628335);
        setIntField(term186271, term186271.getClass(), "playVsCount", 1502191735);
        setIntField(term186271, term186271.getClass(), "playSyncCount", 883356350);
        setIntField(term186271, term186271.getClass(), "winCount", -231229977);
        setIntField(term186271, term186271.getClass(), "helpCount", 1221465470);
        setIntField(term186271, term186271.getClass(), "comboCount", -783367851);
        setIntField(term186271, term186271.getClass(), "feverCount", -1073619898);
        setIntField(term186271, term186271.getClass(), "totalHiScore", 2125930163);
        setIntField(term186271, term186271.getClass(), "totalEasyHighScore", -1769244531);
        setIntField(term186271, term186271.getClass(), "totalBasicHighScore", -1654530322);
        setIntField(term186271, term186271.getClass(), "totalAdvancedHighScore", 504630549);
        setIntField(term186271, term186271.getClass(), "totalExpertHighScore", -1575115809);
        setIntField(term186271, term186271.getClass(), "totalMasterHighScore", -1048109902);
        setIntField(term186271, term186271.getClass(), "totalReMasterHighScore", 400044497);
        setIntField(term186271, term186271.getClass(), "totalHighSync", -1032732364);
        setIntField(term186271, term186271.getClass(), "totalEasySync", -772901170);
        setIntField(term186271, term186271.getClass(), "totalBasicSync", 1010920323);
        setIntField(term186271, term186271.getClass(), "totalAdvancedSync", 795109394);
        setIntField(term186271, term186271.getClass(), "totalExpertSync", -1603426004);
        setIntField(term186271, term186271.getClass(), "totalMasterSync", 2129743945);
        setIntField(term186271, term186271.getClass(), "totalReMasterSync", 1226684652);
        setIntField(term186271, term186271.getClass(), "playerRating", 1760988562);
        setIntField(term186271, term186271.getClass(), "highestRating", -1651775743);
        setIntField(term186271, term186271.getClass(), "rankAuthTailId", -396665766);
        setField(term186271, term186271.getClass(), "eventWatchedDate", "KMtZBUgxHg");
        setField(term186271, term186271.getClass(), "webLimitDate", "HOgLdEUbNT");
        setIntField(term186271, term186271.getClass(), "challengeTrackPhase", -722629821);
        setIntField(term186271, term186271.getClass(), "firstPlayBits", -633621373);
        setField(term186271, term186271.getClass(), "lastPlayDate", "eZTceUbJqy");
        setIntField(term186271, term186271.getClass(), "lastPlaceId", -1124899234);
        setField(term186271, term186271.getClass(), "lastPlaceName", "yEnSWDaebl");
        setIntField(term186271, term186271.getClass(), "lastRegionId", -666861446);
        setField(term186271, term186271.getClass(), "lastRegionName", "FFHmFKyEmP");
        setField(term186271, term186271.getClass(), "lastClientId", "tmsApOAQNP");
        setField(term186271, term186271.getClass(), "lastCountryCode", "vrdvjbZtaY");
        setIntField(term186271, term186271.getClass(), "eventPoint", 1499451545);
        setIntField(term186271, term186271.getClass(), "totalLv", 2119246378);
        setIntField(term186271, term186271.getClass(), "lastLoginBonusDay", 1721762833);
        setIntField(term186271, term186271.getClass(), "lastSurvivalBonusDay", -95395858);
        setIntField(term186271, term186271.getClass(), "loginBonusLv", 1637717331);
        setField(term186269, term186269.getClass(), "user", term186271);
        setIntField(term186269, term186269.getClass(), "musicId", 553059303);
        setIntField(term186269, term186269.getClass(), "level", 1917532344);
        setIntField(term186269, term186269.getClass(), "playCount", 3457645);
        setIntField(term186269, term186269.getClass(), "scoreMax", -1377628168);
        setIntField(term186269, term186269.getClass(), "syncRateMax", -959778702);
        setBooleanField(term186269, term186269.getClass(), "isAllPerfect", true);
        setIntField(term186269, term186269.getClass(), "isAllPerfectPlus", 992492220);
        setIntField(term186269, term186269.getClass(), "fullCombo", -199409402);
        setIntField(term186269, term186269.getClass(), "maxFever", -260237749);
        setIntField(term186269, term186269.getClass(), "achievement", 584235366);
        term186455 = new Integer(32230270);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term186455;
        callMethod(klass, "setFullCombo", argTypes, term186269, args);
    }

};


