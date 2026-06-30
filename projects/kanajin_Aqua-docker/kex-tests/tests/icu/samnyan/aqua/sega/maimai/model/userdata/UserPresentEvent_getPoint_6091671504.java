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

public class UserPresentEvent_getPoint_6091671504 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97713;

    public UserPresentEvent_getPoint_6091671504() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term97719 = new Long(768144790810175653L);
        term97713 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPresentEvent"));
        Object term97715 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term97717 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term97733 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term97734 = newInstance(Class.forName("java.time.LocalDate"));
        Object term97738 = newInstance(Class.forName("java.time.LocalTime"));
        Object term97743 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term97744 = newInstance(Class.forName("java.time.LocalDate"));
        Object term97748 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term97713, term97713.getClass(), "id", -4266854609277222301L);
        setLongField(term97715, term97715.getClass(), "id", -3517544832850746345L);
        setLongField(term97717, term97717.getClass(), "id", -8129901089598682226L);
        setField(term97717, term97717.getClass(), "extId", term97719);
        setField(term97717, term97717.getClass(), "luid", "lktYSRAAkX");
        setIntField(term97734, term97734.getClass(), "year", 2019);
        setShortField(term97734, term97734.getClass(), "month", (short) 12);
        setShortField(term97734, term97734.getClass(), "day", (short) 8);
        setField(term97733, term97733.getClass(), "date", term97734);
        setByteField(term97738, term97738.getClass(), "hour", (byte) 20);
        setByteField(term97738, term97738.getClass(), "minute", (byte) 33);
        setByteField(term97738, term97738.getClass(), "second", (byte) 47);
        setIntField(term97738, term97738.getClass(), "nano", 329455724);
        setField(term97733, term97733.getClass(), "time", term97738);
        setField(term97717, term97717.getClass(), "registerTime", term97733);
        setIntField(term97744, term97744.getClass(), "year", 2023);
        setShortField(term97744, term97744.getClass(), "month", (short) 9);
        setShortField(term97744, term97744.getClass(), "day", (short) 17);
        setField(term97743, term97743.getClass(), "date", term97744);
        setByteField(term97748, term97748.getClass(), "hour", (byte) 16);
        setByteField(term97748, term97748.getClass(), "minute", (byte) 1);
        setByteField(term97748, term97748.getClass(), "second", (byte) 2);
        setIntField(term97748, term97748.getClass(), "nano", 296390053);
        setField(term97743, term97743.getClass(), "time", term97748);
        setField(term97717, term97717.getClass(), "accessTime", term97743);
        setField(term97715, term97715.getClass(), "card", term97717);
        setIntField(term97715, term97715.getClass(), "lastDataVersion", 1225276779);
        setField(term97715, term97715.getClass(), "userName", "KmbCndAIRO");
        setIntField(term97715, term97715.getClass(), "point", -1640653355);
        setIntField(term97715, term97715.getClass(), "totalPoint", -648278413);
        setIntField(term97715, term97715.getClass(), "iconId", -1181202031);
        setIntField(term97715, term97715.getClass(), "nameplateId", -439859067);
        setIntField(term97715, term97715.getClass(), "frameId", -66207086);
        setIntField(term97715, term97715.getClass(), "trophyId", -1284058526);
        setIntField(term97715, term97715.getClass(), "playCount", 862234803);
        setIntField(term97715, term97715.getClass(), "playVsCount", -616491282);
        setIntField(term97715, term97715.getClass(), "playSyncCount", -58881768);
        setIntField(term97715, term97715.getClass(), "winCount", 1032489246);
        setIntField(term97715, term97715.getClass(), "helpCount", -902458143);
        setIntField(term97715, term97715.getClass(), "comboCount", -1015807113);
        setIntField(term97715, term97715.getClass(), "feverCount", -741690280);
        setIntField(term97715, term97715.getClass(), "totalHiScore", -302708306);
        setIntField(term97715, term97715.getClass(), "totalEasyHighScore", -805114262);
        setIntField(term97715, term97715.getClass(), "totalBasicHighScore", 32762414);
        setIntField(term97715, term97715.getClass(), "totalAdvancedHighScore", -2095258959);
        setIntField(term97715, term97715.getClass(), "totalExpertHighScore", -2021218682);
        setIntField(term97715, term97715.getClass(), "totalMasterHighScore", 1079108695);
        setIntField(term97715, term97715.getClass(), "totalReMasterHighScore", -1181567725);
        setIntField(term97715, term97715.getClass(), "totalHighSync", 767307414);
        setIntField(term97715, term97715.getClass(), "totalEasySync", -122688671);
        setIntField(term97715, term97715.getClass(), "totalBasicSync", -1230291029);
        setIntField(term97715, term97715.getClass(), "totalAdvancedSync", 1594785809);
        setIntField(term97715, term97715.getClass(), "totalExpertSync", -670648979);
        setIntField(term97715, term97715.getClass(), "totalMasterSync", 1399645267);
        setIntField(term97715, term97715.getClass(), "totalReMasterSync", 1041538795);
        setIntField(term97715, term97715.getClass(), "playerRating", 1356367916);
        setIntField(term97715, term97715.getClass(), "highestRating", 1576872122);
        setIntField(term97715, term97715.getClass(), "rankAuthTailId", 380977694);
        setField(term97715, term97715.getClass(), "eventWatchedDate", "LfLWkWgTGE");
        setField(term97715, term97715.getClass(), "webLimitDate", "uleoYrEbgk");
        setIntField(term97715, term97715.getClass(), "challengeTrackPhase", -1411160608);
        setIntField(term97715, term97715.getClass(), "firstPlayBits", 117398006);
        setField(term97715, term97715.getClass(), "lastPlayDate", "JINAWGBEol");
        setIntField(term97715, term97715.getClass(), "lastPlaceId", -1432040068);
        setField(term97715, term97715.getClass(), "lastPlaceName", "HZRzxVDGhV");
        setIntField(term97715, term97715.getClass(), "lastRegionId", -153489469);
        setField(term97715, term97715.getClass(), "lastRegionName", "wOWOSBOjln");
        setField(term97715, term97715.getClass(), "lastClientId", "iVXUeGctUB");
        setField(term97715, term97715.getClass(), "lastCountryCode", "bmLiVLNmZC");
        setIntField(term97715, term97715.getClass(), "eventPoint", 1080583578);
        setIntField(term97715, term97715.getClass(), "totalLv", 283702087);
        setIntField(term97715, term97715.getClass(), "lastLoginBonusDay", 612339159);
        setIntField(term97715, term97715.getClass(), "lastSurvivalBonusDay", 1739451740);
        setIntField(term97715, term97715.getClass(), "loginBonusLv", -1033928520);
        setField(term97713, term97713.getClass(), "user", term97715);
        setIntField(term97713, term97713.getClass(), "presentEventId", 2015415340);
        setIntField(term97713, term97713.getClass(), "point", -1270808334);
        setIntField(term97713, term97713.getClass(), "presentCount", 450987049);
        setIntField(term97713, term97713.getClass(), "rate", -1761685529);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPresentEvent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPoint", argTypes, term97713, args);
    }

};


