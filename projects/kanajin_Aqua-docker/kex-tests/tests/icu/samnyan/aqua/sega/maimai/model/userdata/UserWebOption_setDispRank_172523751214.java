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

public class UserWebOption_setDispRank_172523751214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41333;
     Object term41515;

    public UserWebOption_setDispRank_172523751214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term41339 = new Long(8802866251294305945L);
        term41333 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserWebOption"));
        Object term41335 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term41337 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term41353 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term41354 = newInstance(Class.forName("java.time.LocalDate"));
        Object term41358 = newInstance(Class.forName("java.time.LocalTime"));
        Object term41363 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term41364 = newInstance(Class.forName("java.time.LocalDate"));
        Object term41368 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term41333, term41333.getClass(), "id", -5344598381371854750L);
        setLongField(term41335, term41335.getClass(), "id", -3718250311794019732L);
        setLongField(term41337, term41337.getClass(), "id", -5935517391653614345L);
        setField(term41337, term41337.getClass(), "extId", term41339);
        setField(term41337, term41337.getClass(), "luid", "yJKKddLqMb");
        setIntField(term41354, term41354.getClass(), "year", 2017);
        setShortField(term41354, term41354.getClass(), "month", (short) 2);
        setShortField(term41354, term41354.getClass(), "day", (short) 5);
        setField(term41353, term41353.getClass(), "date", term41354);
        setByteField(term41358, term41358.getClass(), "hour", (byte) 5);
        setByteField(term41358, term41358.getClass(), "minute", (byte) 46);
        setByteField(term41358, term41358.getClass(), "second", (byte) 38);
        setIntField(term41358, term41358.getClass(), "nano", 214202896);
        setField(term41353, term41353.getClass(), "time", term41358);
        setField(term41337, term41337.getClass(), "registerTime", term41353);
        setIntField(term41364, term41364.getClass(), "year", 2025);
        setShortField(term41364, term41364.getClass(), "month", (short) 6);
        setShortField(term41364, term41364.getClass(), "day", (short) 18);
        setField(term41363, term41363.getClass(), "date", term41364);
        setByteField(term41368, term41368.getClass(), "hour", (byte) 14);
        setByteField(term41368, term41368.getClass(), "minute", (byte) 17);
        setByteField(term41368, term41368.getClass(), "second", (byte) 34);
        setIntField(term41368, term41368.getClass(), "nano", 564527758);
        setField(term41363, term41363.getClass(), "time", term41368);
        setField(term41337, term41337.getClass(), "accessTime", term41363);
        setField(term41335, term41335.getClass(), "card", term41337);
        setIntField(term41335, term41335.getClass(), "lastDataVersion", -2007275509);
        setField(term41335, term41335.getClass(), "userName", "LWEYaXeKBe");
        setIntField(term41335, term41335.getClass(), "point", -540049509);
        setIntField(term41335, term41335.getClass(), "totalPoint", -75757335);
        setIntField(term41335, term41335.getClass(), "iconId", 1493891481);
        setIntField(term41335, term41335.getClass(), "nameplateId", 1654753354);
        setIntField(term41335, term41335.getClass(), "frameId", 609765653);
        setIntField(term41335, term41335.getClass(), "trophyId", 919376771);
        setIntField(term41335, term41335.getClass(), "playCount", 632440696);
        setIntField(term41335, term41335.getClass(), "playVsCount", 1176303286);
        setIntField(term41335, term41335.getClass(), "playSyncCount", -1738480762);
        setIntField(term41335, term41335.getClass(), "winCount", -1175470028);
        setIntField(term41335, term41335.getClass(), "helpCount", -910760048);
        setIntField(term41335, term41335.getClass(), "comboCount", 702111671);
        setIntField(term41335, term41335.getClass(), "feverCount", 1127359599);
        setIntField(term41335, term41335.getClass(), "totalHiScore", 890298090);
        setIntField(term41335, term41335.getClass(), "totalEasyHighScore", 1824978585);
        setIntField(term41335, term41335.getClass(), "totalBasicHighScore", 2056999648);
        setIntField(term41335, term41335.getClass(), "totalAdvancedHighScore", -1235710002);
        setIntField(term41335, term41335.getClass(), "totalExpertHighScore", -1092087194);
        setIntField(term41335, term41335.getClass(), "totalMasterHighScore", 287049516);
        setIntField(term41335, term41335.getClass(), "totalReMasterHighScore", -2118245549);
        setIntField(term41335, term41335.getClass(), "totalHighSync", -974734669);
        setIntField(term41335, term41335.getClass(), "totalEasySync", 637485378);
        setIntField(term41335, term41335.getClass(), "totalBasicSync", -972072842);
        setIntField(term41335, term41335.getClass(), "totalAdvancedSync", -1654330782);
        setIntField(term41335, term41335.getClass(), "totalExpertSync", 618840851);
        setIntField(term41335, term41335.getClass(), "totalMasterSync", 879137590);
        setIntField(term41335, term41335.getClass(), "totalReMasterSync", 388908072);
        setIntField(term41335, term41335.getClass(), "playerRating", -605646727);
        setIntField(term41335, term41335.getClass(), "highestRating", -1938624293);
        setIntField(term41335, term41335.getClass(), "rankAuthTailId", 1289551510);
        setField(term41335, term41335.getClass(), "eventWatchedDate", "cNoFvpHBHw");
        setField(term41335, term41335.getClass(), "webLimitDate", "DoSWbCtsBg");
        setIntField(term41335, term41335.getClass(), "challengeTrackPhase", 1397954481);
        setIntField(term41335, term41335.getClass(), "firstPlayBits", -394854340);
        setField(term41335, term41335.getClass(), "lastPlayDate", "NrXtkbXwDc");
        setIntField(term41335, term41335.getClass(), "lastPlaceId", -519383992);
        setField(term41335, term41335.getClass(), "lastPlaceName", "EUapSrAmOe");
        setIntField(term41335, term41335.getClass(), "lastRegionId", -1783256546);
        setField(term41335, term41335.getClass(), "lastRegionName", "dUHylIprea");
        setField(term41335, term41335.getClass(), "lastClientId", "FKDqHRpMcc");
        setField(term41335, term41335.getClass(), "lastCountryCode", "mIRMQIxHUD");
        setIntField(term41335, term41335.getClass(), "eventPoint", -19542865);
        setIntField(term41335, term41335.getClass(), "totalLv", 311289836);
        setIntField(term41335, term41335.getClass(), "lastLoginBonusDay", -1424263819);
        setIntField(term41335, term41335.getClass(), "lastSurvivalBonusDay", -620026126);
        setIntField(term41335, term41335.getClass(), "loginBonusLv", 489378978);
        setField(term41333, term41333.getClass(), "user", term41335);
        setBooleanField(term41333, term41333.getClass(), "isNetMember", true);
        setIntField(term41333, term41333.getClass(), "dispRate", -1498567410);
        setIntField(term41333, term41333.getClass(), "dispJudgeStyle", 1977510197);
        setIntField(term41333, term41333.getClass(), "dispRank", 1801307871);
        setIntField(term41333, term41333.getClass(), "dispHomeRanker", -528389150);
        setIntField(term41333, term41333.getClass(), "dispTotalLv", -1003260338);
        term41515 = new Integer(-1745035486);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserWebOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term41515;
        callMethod(klass, "setDispRank", argTypes, term41333, args);
    }

};


