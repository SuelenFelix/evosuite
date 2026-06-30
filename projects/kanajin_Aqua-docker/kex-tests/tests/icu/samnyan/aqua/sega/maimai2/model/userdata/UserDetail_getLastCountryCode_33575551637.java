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

public class UserDetail_getLastCountryCode_33575551637 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term216001;

    public UserDetail_getLastCountryCode_33575551637() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term216005 = new Long(-8303973304709662279L);
        Integer term216068 = new Integer(1433214025);
        ArrayList term216066 = new ArrayList();
        ((ArrayList) term216066).add(term216068);
        Integer term216074 = new Integer(1424797105);
        Integer term216076 = new Integer(386281072);
        Integer term216078 = new Integer(-782180775);
        Integer term216080 = new Integer(-1971308334);
        Integer term216082 = new Integer(-2070149565);
        ArrayList term216072 = new ArrayList();
        ((ArrayList) term216072).add(term216074);
        ((ArrayList) term216072).add(term216076);
        ((ArrayList) term216072).add(term216078);
        ((ArrayList) term216072).add(term216080);
        ((ArrayList) term216072).add(term216082);
        term216001 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term216003 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term216019 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term216020 = newInstance(Class.forName("java.time.LocalDate"));
        Object term216024 = newInstance(Class.forName("java.time.LocalTime"));
        Object term216029 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term216030 = newInstance(Class.forName("java.time.LocalDate"));
        Object term216034 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term216001, term216001.getClass(), "id", -2828858984131180284L);
        setLongField(term216003, term216003.getClass(), "id", -3396355268779460071L);
        setField(term216003, term216003.getClass(), "extId", term216005);
        setField(term216003, term216003.getClass(), "luid", "xZqnBiMirf");
        setIntField(term216020, term216020.getClass(), "year", 2014);
        setShortField(term216020, term216020.getClass(), "month", (short) 6);
        setShortField(term216020, term216020.getClass(), "day", (short) 27);
        setField(term216019, term216019.getClass(), "date", term216020);
        setByteField(term216024, term216024.getClass(), "hour", (byte) 12);
        setByteField(term216024, term216024.getClass(), "minute", (byte) 38);
        setByteField(term216024, term216024.getClass(), "second", (byte) 25);
        setIntField(term216024, term216024.getClass(), "nano", 969490220);
        setField(term216019, term216019.getClass(), "time", term216024);
        setField(term216003, term216003.getClass(), "registerTime", term216019);
        setIntField(term216030, term216030.getClass(), "year", 2011);
        setShortField(term216030, term216030.getClass(), "month", (short) 3);
        setShortField(term216030, term216030.getClass(), "day", (short) 10);
        setField(term216029, term216029.getClass(), "date", term216030);
        setByteField(term216034, term216034.getClass(), "hour", (byte) 17);
        setByteField(term216034, term216034.getClass(), "minute", (byte) 52);
        setByteField(term216034, term216034.getClass(), "second", (byte) 30);
        setIntField(term216034, term216034.getClass(), "nano", 491721919);
        setField(term216029, term216029.getClass(), "time", term216034);
        setField(term216003, term216003.getClass(), "accessTime", term216029);
        setField(term216001, term216001.getClass(), "card", term216003);
        setField(term216001, term216001.getClass(), "userName", "xbTnLBJgrO");
        setIntField(term216001, term216001.getClass(), "isNetMember", 171250909);
        setIntField(term216001, term216001.getClass(), "iconId", -1179023049);
        setIntField(term216001, term216001.getClass(), "plateId", -1691362029);
        setIntField(term216001, term216001.getClass(), "titleId", 1019426887);
        setIntField(term216001, term216001.getClass(), "partnerId", 1500347336);
        setIntField(term216001, term216001.getClass(), "frameId", -828034588);
        setIntField(term216001, term216001.getClass(), "selectMapId", -1193638033);
        setIntField(term216001, term216001.getClass(), "totalAwake", -2098104719);
        setIntField(term216001, term216001.getClass(), "gradeRating", -120776227);
        setIntField(term216001, term216001.getClass(), "musicRating", 1294158309);
        setIntField(term216001, term216001.getClass(), "playerRating", -784492931);
        setIntField(term216001, term216001.getClass(), "highestRating", -461250607);
        setIntField(term216001, term216001.getClass(), "gradeRank", -2060857326);
        setIntField(term216001, term216001.getClass(), "classRank", -1677905526);
        setIntField(term216001, term216001.getClass(), "courseRank", -2005574071);
        setField(term216001, term216001.getClass(), "charaSlot", term216066);
        setField(term216001, term216001.getClass(), "charaLockSlot", term216072);
        setLongField(term216001, term216001.getClass(), "contentBit", -1596923983195220727L);
        setIntField(term216001, term216001.getClass(), "playCount", -483684474);
        setField(term216001, term216001.getClass(), "eventWatchedDate", "btUYtcnXAn");
        setField(term216001, term216001.getClass(), "lastGameId", "hqbWyqwrmR");
        setField(term216001, term216001.getClass(), "lastRomVersion", "oXrgjZXMbI");
        setField(term216001, term216001.getClass(), "lastDataVersion", "MIDWbEbLtH");
        setField(term216001, term216001.getClass(), "lastLoginDate", "ThZGdWuUtY");
        setField(term216001, term216001.getClass(), "lastPlayDate", "rmZGykevfv");
        setIntField(term216001, term216001.getClass(), "lastPlayCredit", 610276196);
        setIntField(term216001, term216001.getClass(), "lastPlayMode", 1105443366);
        setIntField(term216001, term216001.getClass(), "lastPlaceId", 1211186370);
        setField(term216001, term216001.getClass(), "lastPlaceName", "qEgGzsCsUP");
        setIntField(term216001, term216001.getClass(), "lastAllNetId", -885711997);
        setIntField(term216001, term216001.getClass(), "lastRegionId", -1915339493);
        setField(term216001, term216001.getClass(), "lastRegionName", "SMrVFrHMxw");
        setField(term216001, term216001.getClass(), "lastClientId", "FcmprsyTYG");
        setField(term216001, term216001.getClass(), "lastCountryCode", "KgHphkrrWw");
        setIntField(term216001, term216001.getClass(), "lastSelectEMoney", 1982163713);
        setIntField(term216001, term216001.getClass(), "lastSelectTicket", -936235619);
        setIntField(term216001, term216001.getClass(), "lastSelectCourse", -1737988954);
        setIntField(term216001, term216001.getClass(), "lastCountCourse", -1112663214);
        setField(term216001, term216001.getClass(), "firstGameId", "cFWVILDGxM");
        setField(term216001, term216001.getClass(), "firstRomVersion", "hxeToHRGfs");
        setField(term216001, term216001.getClass(), "firstDataVersion", "NkkBmqoKvD");
        setField(term216001, term216001.getClass(), "firstPlayDate", "SIaYQjjfDC");
        setField(term216001, term216001.getClass(), "compatibleCmVersion", "WwhwqCIftE");
        setField(term216001, term216001.getClass(), "dailyBonusDate", "tsCHeBTsRj");
        setField(term216001, term216001.getClass(), "dailyCourseBonusDate", "TcvdHlKKqR");
        setField(term216001, term216001.getClass(), "lastPairLoginDate", "MjnlUNAbWN");
        setField(term216001, term216001.getClass(), "lastTrialPlayDate", "lpzPSZrJNP");
        setIntField(term216001, term216001.getClass(), "playVsCount", -1504730734);
        setIntField(term216001, term216001.getClass(), "playSyncCount", 2126788729);
        setIntField(term216001, term216001.getClass(), "winCount", -1276455926);
        setIntField(term216001, term216001.getClass(), "helpCount", 1918928310);
        setIntField(term216001, term216001.getClass(), "comboCount", -708509459);
        setLongField(term216001, term216001.getClass(), "totalDeluxscore", 4119542005949505984L);
        setLongField(term216001, term216001.getClass(), "totalBasicDeluxscore", 2433252635898707635L);
        setLongField(term216001, term216001.getClass(), "totalAdvancedDeluxscore", 8324625588726021975L);
        setLongField(term216001, term216001.getClass(), "totalExpertDeluxscore", 628147125708063776L);
        setLongField(term216001, term216001.getClass(), "totalMasterDeluxscore", -1431983127218148270L);
        setLongField(term216001, term216001.getClass(), "totalReMasterDeluxscore", -4488790513338654221L);
        setIntField(term216001, term216001.getClass(), "totalSync", -757195452);
        setIntField(term216001, term216001.getClass(), "totalBasicSync", 1691064728);
        setIntField(term216001, term216001.getClass(), "totalAdvancedSync", -302581106);
        setIntField(term216001, term216001.getClass(), "totalExpertSync", -569973638);
        setIntField(term216001, term216001.getClass(), "totalMasterSync", 1315234524);
        setIntField(term216001, term216001.getClass(), "totalReMasterSync", -1608597532);
        setLongField(term216001, term216001.getClass(), "totalAchievement", -465346656741950839L);
        setLongField(term216001, term216001.getClass(), "totalBasicAchievement", 4651579706861308831L);
        setLongField(term216001, term216001.getClass(), "totalAdvancedAchievement", 5310141360469061657L);
        setLongField(term216001, term216001.getClass(), "totalExpertAchievement", 1140037959282484196L);
        setLongField(term216001, term216001.getClass(), "totalMasterAchievement", -8519575547874927224L);
        setLongField(term216001, term216001.getClass(), "totalReMasterAchievement", -135249980433565287L);
        setLongField(term216001, term216001.getClass(), "playerOldRating", -5321005129201389012L);
        setLongField(term216001, term216001.getClass(), "playerNewRating", -6346531281189712724L);
        setIntField(term216001, term216001.getClass(), "banState", 80971770);
        setLongField(term216001, term216001.getClass(), "dateTime", 1851254231278465740L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastCountryCode", argTypes, term216001, args);
    }

};


