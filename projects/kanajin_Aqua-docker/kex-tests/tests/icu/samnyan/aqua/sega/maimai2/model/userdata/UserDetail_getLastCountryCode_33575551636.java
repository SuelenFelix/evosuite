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

public class UserDetail_getLastCountryCode_33575551636 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term215946;

    public UserDetail_getLastCountryCode_33575551636() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term215950 = new Long(-8303973304709662279L);
        Integer term216013 = new Integer(1433214025);
        ArrayList term216011 = new ArrayList();
        ((ArrayList) term216011).add(term216013);
        Integer term216019 = new Integer(1424797105);
        Integer term216021 = new Integer(386281072);
        Integer term216023 = new Integer(-782180775);
        Integer term216025 = new Integer(-1971308334);
        Integer term216027 = new Integer(-2070149565);
        ArrayList term216017 = new ArrayList();
        ((ArrayList) term216017).add(term216019);
        ((ArrayList) term216017).add(term216021);
        ((ArrayList) term216017).add(term216023);
        ((ArrayList) term216017).add(term216025);
        ((ArrayList) term216017).add(term216027);
        term215946 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term215948 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term215964 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term215965 = newInstance(Class.forName("java.time.LocalDate"));
        Object term215969 = newInstance(Class.forName("java.time.LocalTime"));
        Object term215974 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term215975 = newInstance(Class.forName("java.time.LocalDate"));
        Object term215979 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term215946, term215946.getClass(), "id", -2828858984131180284L);
        setLongField(term215948, term215948.getClass(), "id", -3396355268779460071L);
        setField(term215948, term215948.getClass(), "extId", term215950);
        setField(term215948, term215948.getClass(), "luid", "xZqnBiMirf");
        setIntField(term215965, term215965.getClass(), "year", 2014);
        setShortField(term215965, term215965.getClass(), "month", (short) 6);
        setShortField(term215965, term215965.getClass(), "day", (short) 27);
        setField(term215964, term215964.getClass(), "date", term215965);
        setByteField(term215969, term215969.getClass(), "hour", (byte) 12);
        setByteField(term215969, term215969.getClass(), "minute", (byte) 38);
        setByteField(term215969, term215969.getClass(), "second", (byte) 25);
        setIntField(term215969, term215969.getClass(), "nano", 969490220);
        setField(term215964, term215964.getClass(), "time", term215969);
        setField(term215948, term215948.getClass(), "registerTime", term215964);
        setIntField(term215975, term215975.getClass(), "year", 2011);
        setShortField(term215975, term215975.getClass(), "month", (short) 3);
        setShortField(term215975, term215975.getClass(), "day", (short) 10);
        setField(term215974, term215974.getClass(), "date", term215975);
        setByteField(term215979, term215979.getClass(), "hour", (byte) 17);
        setByteField(term215979, term215979.getClass(), "minute", (byte) 52);
        setByteField(term215979, term215979.getClass(), "second", (byte) 30);
        setIntField(term215979, term215979.getClass(), "nano", 491721919);
        setField(term215974, term215974.getClass(), "time", term215979);
        setField(term215948, term215948.getClass(), "accessTime", term215974);
        setField(term215946, term215946.getClass(), "card", term215948);
        setField(term215946, term215946.getClass(), "userName", "xbTnLBJgrO");
        setIntField(term215946, term215946.getClass(), "isNetMember", 171250909);
        setIntField(term215946, term215946.getClass(), "iconId", -1179023049);
        setIntField(term215946, term215946.getClass(), "plateId", -1691362029);
        setIntField(term215946, term215946.getClass(), "titleId", 1019426887);
        setIntField(term215946, term215946.getClass(), "partnerId", 1500347336);
        setIntField(term215946, term215946.getClass(), "frameId", -828034588);
        setIntField(term215946, term215946.getClass(), "selectMapId", -1193638033);
        setIntField(term215946, term215946.getClass(), "totalAwake", -2098104719);
        setIntField(term215946, term215946.getClass(), "gradeRating", -120776227);
        setIntField(term215946, term215946.getClass(), "musicRating", 1294158309);
        setIntField(term215946, term215946.getClass(), "playerRating", -784492931);
        setIntField(term215946, term215946.getClass(), "highestRating", -461250607);
        setIntField(term215946, term215946.getClass(), "gradeRank", -2060857326);
        setIntField(term215946, term215946.getClass(), "classRank", -1677905526);
        setIntField(term215946, term215946.getClass(), "courseRank", -2005574071);
        setField(term215946, term215946.getClass(), "charaSlot", term216011);
        setField(term215946, term215946.getClass(), "charaLockSlot", term216017);
        setLongField(term215946, term215946.getClass(), "contentBit", -1596923983195220727L);
        setIntField(term215946, term215946.getClass(), "playCount", -483684474);
        setField(term215946, term215946.getClass(), "eventWatchedDate", "btUYtcnXAn");
        setField(term215946, term215946.getClass(), "lastGameId", "hqbWyqwrmR");
        setField(term215946, term215946.getClass(), "lastRomVersion", "oXrgjZXMbI");
        setField(term215946, term215946.getClass(), "lastDataVersion", "MIDWbEbLtH");
        setField(term215946, term215946.getClass(), "lastLoginDate", "ThZGdWuUtY");
        setField(term215946, term215946.getClass(), "lastPlayDate", "rmZGykevfv");
        setIntField(term215946, term215946.getClass(), "lastPlayCredit", 610276196);
        setIntField(term215946, term215946.getClass(), "lastPlayMode", 1105443366);
        setIntField(term215946, term215946.getClass(), "lastPlaceId", 1211186370);
        setField(term215946, term215946.getClass(), "lastPlaceName", "qEgGzsCsUP");
        setIntField(term215946, term215946.getClass(), "lastAllNetId", -885711997);
        setIntField(term215946, term215946.getClass(), "lastRegionId", -1915339493);
        setField(term215946, term215946.getClass(), "lastRegionName", "SMrVFrHMxw");
        setField(term215946, term215946.getClass(), "lastClientId", "FcmprsyTYG");
        setField(term215946, term215946.getClass(), "lastCountryCode", "KgHphkrrWw");
        setIntField(term215946, term215946.getClass(), "lastSelectEMoney", 1982163713);
        setIntField(term215946, term215946.getClass(), "lastSelectTicket", -936235619);
        setIntField(term215946, term215946.getClass(), "lastSelectCourse", -1737988954);
        setIntField(term215946, term215946.getClass(), "lastCountCourse", -1112663214);
        setField(term215946, term215946.getClass(), "firstGameId", "cFWVILDGxM");
        setField(term215946, term215946.getClass(), "firstRomVersion", "hxeToHRGfs");
        setField(term215946, term215946.getClass(), "firstDataVersion", "NkkBmqoKvD");
        setField(term215946, term215946.getClass(), "firstPlayDate", "SIaYQjjfDC");
        setField(term215946, term215946.getClass(), "compatibleCmVersion", "WwhwqCIftE");
        setField(term215946, term215946.getClass(), "dailyBonusDate", "tsCHeBTsRj");
        setField(term215946, term215946.getClass(), "dailyCourseBonusDate", "TcvdHlKKqR");
        setField(term215946, term215946.getClass(), "lastPairLoginDate", "MjnlUNAbWN");
        setField(term215946, term215946.getClass(), "lastTrialPlayDate", "lpzPSZrJNP");
        setIntField(term215946, term215946.getClass(), "playVsCount", -1504730734);
        setIntField(term215946, term215946.getClass(), "playSyncCount", 2126788729);
        setIntField(term215946, term215946.getClass(), "winCount", -1276455926);
        setIntField(term215946, term215946.getClass(), "helpCount", 1918928310);
        setIntField(term215946, term215946.getClass(), "comboCount", -708509459);
        setLongField(term215946, term215946.getClass(), "totalDeluxscore", 4119542005949505984L);
        setLongField(term215946, term215946.getClass(), "totalBasicDeluxscore", 2433252635898707635L);
        setLongField(term215946, term215946.getClass(), "totalAdvancedDeluxscore", 8324625588726021975L);
        setLongField(term215946, term215946.getClass(), "totalExpertDeluxscore", 628147125708063776L);
        setLongField(term215946, term215946.getClass(), "totalMasterDeluxscore", -1431983127218148270L);
        setLongField(term215946, term215946.getClass(), "totalReMasterDeluxscore", -4488790513338654221L);
        setIntField(term215946, term215946.getClass(), "totalSync", -757195452);
        setIntField(term215946, term215946.getClass(), "totalBasicSync", 1691064728);
        setIntField(term215946, term215946.getClass(), "totalAdvancedSync", -302581106);
        setIntField(term215946, term215946.getClass(), "totalExpertSync", -569973638);
        setIntField(term215946, term215946.getClass(), "totalMasterSync", 1315234524);
        setIntField(term215946, term215946.getClass(), "totalReMasterSync", -1608597532);
        setLongField(term215946, term215946.getClass(), "totalAchievement", -465346656741950839L);
        setLongField(term215946, term215946.getClass(), "totalBasicAchievement", 4651579706861308831L);
        setLongField(term215946, term215946.getClass(), "totalAdvancedAchievement", 5310141360469061657L);
        setLongField(term215946, term215946.getClass(), "totalExpertAchievement", 1140037959282484196L);
        setLongField(term215946, term215946.getClass(), "totalMasterAchievement", -8519575547874927224L);
        setLongField(term215946, term215946.getClass(), "totalReMasterAchievement", -135249980433565287L);
        setLongField(term215946, term215946.getClass(), "playerOldRating", -5321005129201389012L);
        setLongField(term215946, term215946.getClass(), "playerNewRating", -6346531281189712724L);
        setIntField(term215946, term215946.getClass(), "banState", 80971770);
        setLongField(term215946, term215946.getClass(), "dateTime", 1851254231278465740L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastCountryCode", argTypes, term215946, args);
    }

};


