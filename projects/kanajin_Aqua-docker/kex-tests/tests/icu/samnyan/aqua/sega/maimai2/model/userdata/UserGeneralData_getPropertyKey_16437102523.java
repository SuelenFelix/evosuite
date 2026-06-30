package icu.samnyan.aqua.sega.maimai2.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai2.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;
import java.util.ArrayList;
import java.lang.Integer;

public class UserGeneralData_getPropertyKey_16437102523 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term133954;

    public UserGeneralData_getPropertyKey_16437102523() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term133960 = new Long(2145420811068634601L);
        Integer term134023 = new Integer(1936798149);
        Integer term134025 = new Integer(188304401);
        Integer term134027 = new Integer(-40613160);
        Integer term134029 = new Integer(1359973218);
        Integer term134031 = new Integer(-218759803);
        Integer term134033 = new Integer(1288936083);
        Integer term134035 = new Integer(4086209);
        Integer term134037 = new Integer(300964556);
        Integer term134039 = new Integer(-958207893);
        ArrayList term134021 = new ArrayList();
        ((ArrayList) term134021).add(term134023);
        ((ArrayList) term134021).add(term134025);
        ((ArrayList) term134021).add(term134027);
        ((ArrayList) term134021).add(term134029);
        ((ArrayList) term134021).add(term134031);
        ((ArrayList) term134021).add(term134033);
        ((ArrayList) term134021).add(term134035);
        ((ArrayList) term134021).add(term134037);
        ((ArrayList) term134021).add(term134039);
        Integer term134045 = new Integer(674390543);
        Integer term134047 = new Integer(1472100258);
        Integer term134049 = new Integer(12681987);
        Integer term134051 = new Integer(-1987364934);
        Integer term134053 = new Integer(1364414277);
        Integer term134055 = new Integer(-961137606);
        ArrayList term134043 = new ArrayList();
        ((ArrayList) term134043).add(term134045);
        ((ArrayList) term134043).add(term134047);
        ((ArrayList) term134043).add(term134049);
        ((ArrayList) term134043).add(term134051);
        ((ArrayList) term134043).add(term134053);
        ((ArrayList) term134043).add(term134055);
        term133954 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserGeneralData"));
        Object term133956 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term133958 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term133974 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term133975 = newInstance(Class.forName("java.time.LocalDate"));
        Object term133979 = newInstance(Class.forName("java.time.LocalTime"));
        Object term133984 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term133985 = newInstance(Class.forName("java.time.LocalDate"));
        Object term133989 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term133954, term133954.getClass(), "id", 2900857943936563142L);
        setLongField(term133956, term133956.getClass(), "id", -8115951018499591662L);
        setLongField(term133958, term133958.getClass(), "id", 861784392548340556L);
        setField(term133958, term133958.getClass(), "extId", term133960);
        setField(term133958, term133958.getClass(), "luid", "ZDvGrpCzSc");
        setIntField(term133975, term133975.getClass(), "year", 2019);
        setShortField(term133975, term133975.getClass(), "month", (short) 2);
        setShortField(term133975, term133975.getClass(), "day", (short) 19);
        setField(term133974, term133974.getClass(), "date", term133975);
        setByteField(term133979, term133979.getClass(), "hour", (byte) 9);
        setByteField(term133979, term133979.getClass(), "minute", (byte) 3);
        setByteField(term133979, term133979.getClass(), "second", (byte) 19);
        setIntField(term133979, term133979.getClass(), "nano", 646336873);
        setField(term133974, term133974.getClass(), "time", term133979);
        setField(term133958, term133958.getClass(), "registerTime", term133974);
        setIntField(term133985, term133985.getClass(), "year", 2017);
        setShortField(term133985, term133985.getClass(), "month", (short) 2);
        setShortField(term133985, term133985.getClass(), "day", (short) 10);
        setField(term133984, term133984.getClass(), "date", term133985);
        setByteField(term133989, term133989.getClass(), "hour", (byte) 13);
        setByteField(term133989, term133989.getClass(), "minute", (byte) 52);
        setByteField(term133989, term133989.getClass(), "second", (byte) 4);
        setIntField(term133989, term133989.getClass(), "nano", 660576536);
        setField(term133984, term133984.getClass(), "time", term133989);
        setField(term133958, term133958.getClass(), "accessTime", term133984);
        setField(term133956, term133956.getClass(), "card", term133958);
        setField(term133956, term133956.getClass(), "userName", "OseqIIMKlG");
        setIntField(term133956, term133956.getClass(), "isNetMember", -1876896401);
        setIntField(term133956, term133956.getClass(), "iconId", -718518592);
        setIntField(term133956, term133956.getClass(), "plateId", -632825483);
        setIntField(term133956, term133956.getClass(), "titleId", 675039331);
        setIntField(term133956, term133956.getClass(), "partnerId", -199646960);
        setIntField(term133956, term133956.getClass(), "frameId", -932918306);
        setIntField(term133956, term133956.getClass(), "selectMapId", -736397590);
        setIntField(term133956, term133956.getClass(), "totalAwake", 1986891014);
        setIntField(term133956, term133956.getClass(), "gradeRating", -1661858214);
        setIntField(term133956, term133956.getClass(), "musicRating", 1298044863);
        setIntField(term133956, term133956.getClass(), "playerRating", 1115180322);
        setIntField(term133956, term133956.getClass(), "highestRating", -252644885);
        setIntField(term133956, term133956.getClass(), "gradeRank", -738886431);
        setIntField(term133956, term133956.getClass(), "classRank", 1454600617);
        setIntField(term133956, term133956.getClass(), "courseRank", 279047706);
        setField(term133956, term133956.getClass(), "charaSlot", term134021);
        setField(term133956, term133956.getClass(), "charaLockSlot", term134043);
        setLongField(term133956, term133956.getClass(), "contentBit", -3902999923021457584L);
        setIntField(term133956, term133956.getClass(), "playCount", 330393546);
        setField(term133956, term133956.getClass(), "eventWatchedDate", "qOsyLpoLDX");
        setField(term133956, term133956.getClass(), "lastGameId", "ieESeaonzX");
        setField(term133956, term133956.getClass(), "lastRomVersion", "MiDxSLYCkN");
        setField(term133956, term133956.getClass(), "lastDataVersion", "olwpoCLMLH");
        setField(term133956, term133956.getClass(), "lastLoginDate", "aigtpfubEk");
        setField(term133956, term133956.getClass(), "lastPlayDate", "VkDDJVqlRm");
        setIntField(term133956, term133956.getClass(), "lastPlayCredit", -1272435460);
        setIntField(term133956, term133956.getClass(), "lastPlayMode", -1484603549);
        setIntField(term133956, term133956.getClass(), "lastPlaceId", 1942980695);
        setField(term133956, term133956.getClass(), "lastPlaceName", "SUGqIJvCrc");
        setIntField(term133956, term133956.getClass(), "lastAllNetId", 1796271838);
        setIntField(term133956, term133956.getClass(), "lastRegionId", -1313938080);
        setField(term133956, term133956.getClass(), "lastRegionName", "TrQnxgLKzu");
        setField(term133956, term133956.getClass(), "lastClientId", "MsenaDqyDy");
        setField(term133956, term133956.getClass(), "lastCountryCode", "rKQXUHZdfd");
        setIntField(term133956, term133956.getClass(), "lastSelectEMoney", -2070649848);
        setIntField(term133956, term133956.getClass(), "lastSelectTicket", -291029205);
        setIntField(term133956, term133956.getClass(), "lastSelectCourse", 929711065);
        setIntField(term133956, term133956.getClass(), "lastCountCourse", -1034367222);
        setField(term133956, term133956.getClass(), "firstGameId", "gBuTBlOYRS");
        setField(term133956, term133956.getClass(), "firstRomVersion", "mywuLwqGWK");
        setField(term133956, term133956.getClass(), "firstDataVersion", "ZySPRbJHwO");
        setField(term133956, term133956.getClass(), "firstPlayDate", "qVZzWMIpdZ");
        setField(term133956, term133956.getClass(), "compatibleCmVersion", "RVyPHqsjIQ");
        setField(term133956, term133956.getClass(), "dailyBonusDate", "HInKycRClK");
        setField(term133956, term133956.getClass(), "dailyCourseBonusDate", "ovWYiKLJPi");
        setField(term133956, term133956.getClass(), "lastPairLoginDate", "KqOycFiFAf");
        setField(term133956, term133956.getClass(), "lastTrialPlayDate", "pBstCdjkMe");
        setIntField(term133956, term133956.getClass(), "playVsCount", 1086994460);
        setIntField(term133956, term133956.getClass(), "playSyncCount", 434127670);
        setIntField(term133956, term133956.getClass(), "winCount", -1916016616);
        setIntField(term133956, term133956.getClass(), "helpCount", -24073374);
        setIntField(term133956, term133956.getClass(), "comboCount", -1683460380);
        setLongField(term133956, term133956.getClass(), "totalDeluxscore", -5047088911084319834L);
        setLongField(term133956, term133956.getClass(), "totalBasicDeluxscore", 7870842614378198411L);
        setLongField(term133956, term133956.getClass(), "totalAdvancedDeluxscore", -1875458193797116894L);
        setLongField(term133956, term133956.getClass(), "totalExpertDeluxscore", -1652907758196354689L);
        setLongField(term133956, term133956.getClass(), "totalMasterDeluxscore", -3703127822002046631L);
        setLongField(term133956, term133956.getClass(), "totalReMasterDeluxscore", 292172229267974833L);
        setIntField(term133956, term133956.getClass(), "totalSync", -1328582865);
        setIntField(term133956, term133956.getClass(), "totalBasicSync", -2124482280);
        setIntField(term133956, term133956.getClass(), "totalAdvancedSync", -559363939);
        setIntField(term133956, term133956.getClass(), "totalExpertSync", 477002993);
        setIntField(term133956, term133956.getClass(), "totalMasterSync", -1566937884);
        setIntField(term133956, term133956.getClass(), "totalReMasterSync", 18844455);
        setLongField(term133956, term133956.getClass(), "totalAchievement", 1335656234045854132L);
        setLongField(term133956, term133956.getClass(), "totalBasicAchievement", 6329344177797642642L);
        setLongField(term133956, term133956.getClass(), "totalAdvancedAchievement", -379801462734499278L);
        setLongField(term133956, term133956.getClass(), "totalExpertAchievement", -43453793118016545L);
        setLongField(term133956, term133956.getClass(), "totalMasterAchievement", -1791426284813917337L);
        setLongField(term133956, term133956.getClass(), "totalReMasterAchievement", -7269211581156867258L);
        setLongField(term133956, term133956.getClass(), "playerOldRating", -922501789254675769L);
        setLongField(term133956, term133956.getClass(), "playerNewRating", 4601630418248923726L);
        setIntField(term133956, term133956.getClass(), "banState", -104376222);
        setLongField(term133956, term133956.getClass(), "dateTime", 480039199470672932L);
        setField(term133954, term133954.getClass(), "user", term133956);
        setField(term133954, term133954.getClass(), "propertyKey", "BpLdpzfuoW");
        setField(term133954, term133954.getClass(), "propertyValue", "rkzpRpPNtv");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserGeneralData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPropertyKey", argTypes, term133954, args);
    }

};


