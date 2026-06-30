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

public class UserMusicDetail_hashCode_8877601627 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term187657;

    public UserMusicDetail_hashCode_8877601627() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term187663 = new Long(-7840999196900383276L);
        term187657 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserMusicDetail"));
        Object term187659 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term187661 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term187677 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term187678 = newInstance(Class.forName("java.time.LocalDate"));
        Object term187682 = newInstance(Class.forName("java.time.LocalTime"));
        Object term187687 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term187688 = newInstance(Class.forName("java.time.LocalDate"));
        Object term187692 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term187657, term187657.getClass(), "id", -618571331806918749L);
        setLongField(term187659, term187659.getClass(), "id", -1963615592479122073L);
        setLongField(term187661, term187661.getClass(), "id", -2675023620754967902L);
        setField(term187661, term187661.getClass(), "extId", term187663);
        setField(term187661, term187661.getClass(), "luid", "foIizkyVeR");
        setIntField(term187678, term187678.getClass(), "year", 2013);
        setShortField(term187678, term187678.getClass(), "month", (short) 6);
        setShortField(term187678, term187678.getClass(), "day", (short) 1);
        setField(term187677, term187677.getClass(), "date", term187678);
        setByteField(term187682, term187682.getClass(), "hour", (byte) 4);
        setByteField(term187682, term187682.getClass(), "minute", (byte) 10);
        setByteField(term187682, term187682.getClass(), "second", (byte) 53);
        setIntField(term187682, term187682.getClass(), "nano", 464418403);
        setField(term187677, term187677.getClass(), "time", term187682);
        setField(term187661, term187661.getClass(), "registerTime", term187677);
        setIntField(term187688, term187688.getClass(), "year", 2018);
        setShortField(term187688, term187688.getClass(), "month", (short) 10);
        setShortField(term187688, term187688.getClass(), "day", (short) 24);
        setField(term187687, term187687.getClass(), "date", term187688);
        setByteField(term187692, term187692.getClass(), "hour", (byte) 3);
        setByteField(term187692, term187692.getClass(), "minute", (byte) 15);
        setByteField(term187692, term187692.getClass(), "second", (byte) 45);
        setIntField(term187692, term187692.getClass(), "nano", 835508246);
        setField(term187687, term187687.getClass(), "time", term187692);
        setField(term187661, term187661.getClass(), "accessTime", term187687);
        setField(term187659, term187659.getClass(), "card", term187661);
        setIntField(term187659, term187659.getClass(), "lastDataVersion", -2037967574);
        setField(term187659, term187659.getClass(), "userName", "eohWMLzQjb");
        setIntField(term187659, term187659.getClass(), "point", 1991370032);
        setIntField(term187659, term187659.getClass(), "totalPoint", 1065006855);
        setIntField(term187659, term187659.getClass(), "iconId", -1612389552);
        setIntField(term187659, term187659.getClass(), "nameplateId", -404639164);
        setIntField(term187659, term187659.getClass(), "frameId", -38326633);
        setIntField(term187659, term187659.getClass(), "trophyId", -978512262);
        setIntField(term187659, term187659.getClass(), "playCount", 204370070);
        setIntField(term187659, term187659.getClass(), "playVsCount", 508044179);
        setIntField(term187659, term187659.getClass(), "playSyncCount", -66719186);
        setIntField(term187659, term187659.getClass(), "winCount", -1762089197);
        setIntField(term187659, term187659.getClass(), "helpCount", -1974719272);
        setIntField(term187659, term187659.getClass(), "comboCount", -681178437);
        setIntField(term187659, term187659.getClass(), "feverCount", 1910232262);
        setIntField(term187659, term187659.getClass(), "totalHiScore", -431187291);
        setIntField(term187659, term187659.getClass(), "totalEasyHighScore", -462263566);
        setIntField(term187659, term187659.getClass(), "totalBasicHighScore", 551459159);
        setIntField(term187659, term187659.getClass(), "totalAdvancedHighScore", -409808538);
        setIntField(term187659, term187659.getClass(), "totalExpertHighScore", 2027545173);
        setIntField(term187659, term187659.getClass(), "totalMasterHighScore", 806017344);
        setIntField(term187659, term187659.getClass(), "totalReMasterHighScore", 714977344);
        setIntField(term187659, term187659.getClass(), "totalHighSync", -688742086);
        setIntField(term187659, term187659.getClass(), "totalEasySync", 236038528);
        setIntField(term187659, term187659.getClass(), "totalBasicSync", -1180193604);
        setIntField(term187659, term187659.getClass(), "totalAdvancedSync", 1149579022);
        setIntField(term187659, term187659.getClass(), "totalExpertSync", 689712843);
        setIntField(term187659, term187659.getClass(), "totalMasterSync", -766108965);
        setIntField(term187659, term187659.getClass(), "totalReMasterSync", -1600788149);
        setIntField(term187659, term187659.getClass(), "playerRating", 237058014);
        setIntField(term187659, term187659.getClass(), "highestRating", -337868688);
        setIntField(term187659, term187659.getClass(), "rankAuthTailId", 873452507);
        setField(term187659, term187659.getClass(), "eventWatchedDate", "rVRShyvOxF");
        setField(term187659, term187659.getClass(), "webLimitDate", "esjLVLaZjU");
        setIntField(term187659, term187659.getClass(), "challengeTrackPhase", -287614125);
        setIntField(term187659, term187659.getClass(), "firstPlayBits", 1215720277);
        setField(term187659, term187659.getClass(), "lastPlayDate", "sjMukKEPTQ");
        setIntField(term187659, term187659.getClass(), "lastPlaceId", -1139276284);
        setField(term187659, term187659.getClass(), "lastPlaceName", "AarWepexbz");
        setIntField(term187659, term187659.getClass(), "lastRegionId", 1360833110);
        setField(term187659, term187659.getClass(), "lastRegionName", "XaYdQMGKRk");
        setField(term187659, term187659.getClass(), "lastClientId", "kIIognzCdz");
        setField(term187659, term187659.getClass(), "lastCountryCode", "urMZxEQIXl");
        setIntField(term187659, term187659.getClass(), "eventPoint", 572659344);
        setIntField(term187659, term187659.getClass(), "totalLv", 2041143525);
        setIntField(term187659, term187659.getClass(), "lastLoginBonusDay", -1059744296);
        setIntField(term187659, term187659.getClass(), "lastSurvivalBonusDay", -1968002967);
        setIntField(term187659, term187659.getClass(), "loginBonusLv", -2322904);
        setField(term187657, term187657.getClass(), "user", term187659);
        setIntField(term187657, term187657.getClass(), "musicId", 946790222);
        setIntField(term187657, term187657.getClass(), "level", 779969771);
        setIntField(term187657, term187657.getClass(), "playCount", -635673956);
        setIntField(term187657, term187657.getClass(), "scoreMax", -2146788868);
        setIntField(term187657, term187657.getClass(), "syncRateMax", -433546904);
        setBooleanField(term187657, term187657.getClass(), "isAllPerfect", false);
        setIntField(term187657, term187657.getClass(), "isAllPerfectPlus", 1398625880);
        setIntField(term187657, term187657.getClass(), "fullCombo", -547222460);
        setIntField(term187657, term187657.getClass(), "maxFever", 2008612160);
        setIntField(term187657, term187657.getClass(), "achievement", 1116369694);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term187657, args);
    }

};


