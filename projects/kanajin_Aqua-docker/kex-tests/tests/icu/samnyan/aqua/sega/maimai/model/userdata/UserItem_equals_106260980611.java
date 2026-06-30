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

public class UserItem_equals_106260980611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87521;
     Object term87700;

    public UserItem_equals_106260980611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term87527 = new Long(6130232388739280211L);
        term87521 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserItem"));
        Object term87523 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term87525 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term87541 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term87542 = newInstance(Class.forName("java.time.LocalDate"));
        Object term87546 = newInstance(Class.forName("java.time.LocalTime"));
        Object term87551 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term87552 = newInstance(Class.forName("java.time.LocalDate"));
        Object term87556 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term87521, term87521.getClass(), "id", 3128610259359668233L);
        setLongField(term87523, term87523.getClass(), "id", -7966859634511305171L);
        setLongField(term87525, term87525.getClass(), "id", 5885163998873132588L);
        setField(term87525, term87525.getClass(), "extId", term87527);
        setField(term87525, term87525.getClass(), "luid", "hxHKgOYyQD");
        setIntField(term87542, term87542.getClass(), "year", 2022);
        setShortField(term87542, term87542.getClass(), "month", (short) 9);
        setShortField(term87542, term87542.getClass(), "day", (short) 13);
        setField(term87541, term87541.getClass(), "date", term87542);
        setByteField(term87546, term87546.getClass(), "hour", (byte) 3);
        setByteField(term87546, term87546.getClass(), "minute", (byte) 50);
        setByteField(term87546, term87546.getClass(), "second", (byte) 35);
        setIntField(term87546, term87546.getClass(), "nano", 260929854);
        setField(term87541, term87541.getClass(), "time", term87546);
        setField(term87525, term87525.getClass(), "registerTime", term87541);
        setIntField(term87552, term87552.getClass(), "year", 2022);
        setShortField(term87552, term87552.getClass(), "month", (short) 4);
        setShortField(term87552, term87552.getClass(), "day", (short) 7);
        setField(term87551, term87551.getClass(), "date", term87552);
        setByteField(term87556, term87556.getClass(), "hour", (byte) 8);
        setByteField(term87556, term87556.getClass(), "minute", (byte) 56);
        setByteField(term87556, term87556.getClass(), "second", (byte) 3);
        setIntField(term87556, term87556.getClass(), "nano", 496160001);
        setField(term87551, term87551.getClass(), "time", term87556);
        setField(term87525, term87525.getClass(), "accessTime", term87551);
        setField(term87523, term87523.getClass(), "card", term87525);
        setIntField(term87523, term87523.getClass(), "lastDataVersion", -354597292);
        setField(term87523, term87523.getClass(), "userName", "opEyNuSzgs");
        setIntField(term87523, term87523.getClass(), "point", -581675259);
        setIntField(term87523, term87523.getClass(), "totalPoint", -495803538);
        setIntField(term87523, term87523.getClass(), "iconId", -168864726);
        setIntField(term87523, term87523.getClass(), "nameplateId", 970702834);
        setIntField(term87523, term87523.getClass(), "frameId", -863293599);
        setIntField(term87523, term87523.getClass(), "trophyId", -416844310);
        setIntField(term87523, term87523.getClass(), "playCount", -609565612);
        setIntField(term87523, term87523.getClass(), "playVsCount", 1241183529);
        setIntField(term87523, term87523.getClass(), "playSyncCount", 825457585);
        setIntField(term87523, term87523.getClass(), "winCount", -365689493);
        setIntField(term87523, term87523.getClass(), "helpCount", -1044364593);
        setIntField(term87523, term87523.getClass(), "comboCount", -1144558597);
        setIntField(term87523, term87523.getClass(), "feverCount", 392267583);
        setIntField(term87523, term87523.getClass(), "totalHiScore", 1712122682);
        setIntField(term87523, term87523.getClass(), "totalEasyHighScore", -551874415);
        setIntField(term87523, term87523.getClass(), "totalBasicHighScore", -966624066);
        setIntField(term87523, term87523.getClass(), "totalAdvancedHighScore", -724561959);
        setIntField(term87523, term87523.getClass(), "totalExpertHighScore", 473971426);
        setIntField(term87523, term87523.getClass(), "totalMasterHighScore", -1017341002);
        setIntField(term87523, term87523.getClass(), "totalReMasterHighScore", -54592257);
        setIntField(term87523, term87523.getClass(), "totalHighSync", -949100313);
        setIntField(term87523, term87523.getClass(), "totalEasySync", -1081835094);
        setIntField(term87523, term87523.getClass(), "totalBasicSync", 1048568503);
        setIntField(term87523, term87523.getClass(), "totalAdvancedSync", 1162032291);
        setIntField(term87523, term87523.getClass(), "totalExpertSync", 2093059007);
        setIntField(term87523, term87523.getClass(), "totalMasterSync", 372882015);
        setIntField(term87523, term87523.getClass(), "totalReMasterSync", -1653385509);
        setIntField(term87523, term87523.getClass(), "playerRating", 1135771983);
        setIntField(term87523, term87523.getClass(), "highestRating", 190828856);
        setIntField(term87523, term87523.getClass(), "rankAuthTailId", 555694422);
        setField(term87523, term87523.getClass(), "eventWatchedDate", "YTnlgdIqfA");
        setField(term87523, term87523.getClass(), "webLimitDate", "gcKmFclftu");
        setIntField(term87523, term87523.getClass(), "challengeTrackPhase", -1555435028);
        setIntField(term87523, term87523.getClass(), "firstPlayBits", -1501344759);
        setField(term87523, term87523.getClass(), "lastPlayDate", "lfREOBPEuD");
        setIntField(term87523, term87523.getClass(), "lastPlaceId", -429485955);
        setField(term87523, term87523.getClass(), "lastPlaceName", "JAGjDlTwTa");
        setIntField(term87523, term87523.getClass(), "lastRegionId", -1666329424);
        setField(term87523, term87523.getClass(), "lastRegionName", "wIDeyLnekQ");
        setField(term87523, term87523.getClass(), "lastClientId", "tOGPTIqSMm");
        setField(term87523, term87523.getClass(), "lastCountryCode", "cFwZnaLmLP");
        setIntField(term87523, term87523.getClass(), "eventPoint", -1283755218);
        setIntField(term87523, term87523.getClass(), "totalLv", -1544800993);
        setIntField(term87523, term87523.getClass(), "lastLoginBonusDay", 532107043);
        setIntField(term87523, term87523.getClass(), "lastSurvivalBonusDay", -1800024865);
        setIntField(term87523, term87523.getClass(), "loginBonusLv", 1555494796);
        setField(term87521, term87521.getClass(), "user", term87523);
        setIntField(term87521, term87521.getClass(), "itemKind", -1304585657);
        setIntField(term87521, term87521.getClass(), "itemId", 902409852);
        setIntField(term87521, term87521.getClass(), "stock", 500447593);
        term87700 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserItem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term87700;
        callMethod(klass, "equals", argTypes, term87521, args);
    }

};


