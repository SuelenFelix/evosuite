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

public class UserFriendSeasonRanking_getSeasonId_696318123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16413;

    public UserFriendSeasonRanking_getSeasonId_696318123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term16419 = new Long(1967728129628047933L);
        Integer term16482 = new Integer(479531250);
        Integer term16484 = new Integer(1320570890);
        Integer term16486 = new Integer(-130649791);
        Integer term16488 = new Integer(534834644);
        Integer term16490 = new Integer(1959097203);
        Integer term16492 = new Integer(-209654048);
        Integer term16494 = new Integer(477625804);
        ArrayList term16480 = new ArrayList();
        ((ArrayList) term16480).add(term16482);
        ((ArrayList) term16480).add(term16484);
        ((ArrayList) term16480).add(term16486);
        ((ArrayList) term16480).add(term16488);
        ((ArrayList) term16480).add(term16490);
        ((ArrayList) term16480).add(term16492);
        ((ArrayList) term16480).add(term16494);
        Integer term16500 = new Integer(252575029);
        Integer term16502 = new Integer(57189932);
        ArrayList term16498 = new ArrayList();
        ((ArrayList) term16498).add(term16500);
        ((ArrayList) term16498).add(term16502);
        term16413 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserFriendSeasonRanking"));
        Object term16415 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term16417 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term16433 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term16434 = newInstance(Class.forName("java.time.LocalDate"));
        Object term16438 = newInstance(Class.forName("java.time.LocalTime"));
        Object term16443 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term16444 = newInstance(Class.forName("java.time.LocalDate"));
        Object term16448 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term16413, term16413.getClass(), "id", -4187265590402169996L);
        setLongField(term16415, term16415.getClass(), "id", -8033044954947064558L);
        setLongField(term16417, term16417.getClass(), "id", 4626639872957534248L);
        setField(term16417, term16417.getClass(), "extId", term16419);
        setField(term16417, term16417.getClass(), "luid", "gKMNrpKBpu");
        setIntField(term16434, term16434.getClass(), "year", 2022);
        setShortField(term16434, term16434.getClass(), "month", (short) 6);
        setShortField(term16434, term16434.getClass(), "day", (short) 20);
        setField(term16433, term16433.getClass(), "date", term16434);
        setByteField(term16438, term16438.getClass(), "hour", (byte) 7);
        setByteField(term16438, term16438.getClass(), "minute", (byte) 57);
        setByteField(term16438, term16438.getClass(), "second", (byte) 37);
        setIntField(term16438, term16438.getClass(), "nano", 90374877);
        setField(term16433, term16433.getClass(), "time", term16438);
        setField(term16417, term16417.getClass(), "registerTime", term16433);
        setIntField(term16444, term16444.getClass(), "year", 2023);
        setShortField(term16444, term16444.getClass(), "month", (short) 2);
        setShortField(term16444, term16444.getClass(), "day", (short) 16);
        setField(term16443, term16443.getClass(), "date", term16444);
        setByteField(term16448, term16448.getClass(), "hour", (byte) 3);
        setByteField(term16448, term16448.getClass(), "minute", (byte) 18);
        setByteField(term16448, term16448.getClass(), "second", (byte) 56);
        setIntField(term16448, term16448.getClass(), "nano", 733017887);
        setField(term16443, term16443.getClass(), "time", term16448);
        setField(term16417, term16417.getClass(), "accessTime", term16443);
        setField(term16415, term16415.getClass(), "card", term16417);
        setField(term16415, term16415.getClass(), "userName", "ZbHJVEqcoa");
        setIntField(term16415, term16415.getClass(), "isNetMember", -1341357647);
        setIntField(term16415, term16415.getClass(), "iconId", 138447019);
        setIntField(term16415, term16415.getClass(), "plateId", 114915275);
        setIntField(term16415, term16415.getClass(), "titleId", 338519695);
        setIntField(term16415, term16415.getClass(), "partnerId", 2025566580);
        setIntField(term16415, term16415.getClass(), "frameId", -1231122778);
        setIntField(term16415, term16415.getClass(), "selectMapId", 1923558221);
        setIntField(term16415, term16415.getClass(), "totalAwake", 1762934060);
        setIntField(term16415, term16415.getClass(), "gradeRating", -859828739);
        setIntField(term16415, term16415.getClass(), "musicRating", 1986855642);
        setIntField(term16415, term16415.getClass(), "playerRating", 1280322790);
        setIntField(term16415, term16415.getClass(), "highestRating", -1702209203);
        setIntField(term16415, term16415.getClass(), "gradeRank", -1592307668);
        setIntField(term16415, term16415.getClass(), "classRank", -203832871);
        setIntField(term16415, term16415.getClass(), "courseRank", 1151963130);
        setField(term16415, term16415.getClass(), "charaSlot", term16480);
        setField(term16415, term16415.getClass(), "charaLockSlot", term16498);
        setLongField(term16415, term16415.getClass(), "contentBit", -7062466217011408314L);
        setIntField(term16415, term16415.getClass(), "playCount", -1855819749);
        setField(term16415, term16415.getClass(), "eventWatchedDate", "awDQVEVIKi");
        setField(term16415, term16415.getClass(), "lastGameId", "HJwNgUzZZR");
        setField(term16415, term16415.getClass(), "lastRomVersion", "FvUCZgTXhq");
        setField(term16415, term16415.getClass(), "lastDataVersion", "wWWidPCHzx");
        setField(term16415, term16415.getClass(), "lastLoginDate", "OwPIiBRuKK");
        setField(term16415, term16415.getClass(), "lastPlayDate", "sgfGySMODT");
        setIntField(term16415, term16415.getClass(), "lastPlayCredit", 1059048043);
        setIntField(term16415, term16415.getClass(), "lastPlayMode", 537273345);
        setIntField(term16415, term16415.getClass(), "lastPlaceId", -346107257);
        setField(term16415, term16415.getClass(), "lastPlaceName", "ndAITnOsny");
        setIntField(term16415, term16415.getClass(), "lastAllNetId", -1577393360);
        setIntField(term16415, term16415.getClass(), "lastRegionId", 1112256038);
        setField(term16415, term16415.getClass(), "lastRegionName", "CVZnTiJucs");
        setField(term16415, term16415.getClass(), "lastClientId", "ecHEQufXoq");
        setField(term16415, term16415.getClass(), "lastCountryCode", "btBLMvHzJg");
        setIntField(term16415, term16415.getClass(), "lastSelectEMoney", -441333794);
        setIntField(term16415, term16415.getClass(), "lastSelectTicket", 1504698817);
        setIntField(term16415, term16415.getClass(), "lastSelectCourse", -2018333791);
        setIntField(term16415, term16415.getClass(), "lastCountCourse", -742476678);
        setField(term16415, term16415.getClass(), "firstGameId", "JdOMfNWgLP");
        setField(term16415, term16415.getClass(), "firstRomVersion", "uWqXrwAsDU");
        setField(term16415, term16415.getClass(), "firstDataVersion", "hgFbWAUtsu");
        setField(term16415, term16415.getClass(), "firstPlayDate", "HqoTWlkbwF");
        setField(term16415, term16415.getClass(), "compatibleCmVersion", "CwNELDTAPP");
        setField(term16415, term16415.getClass(), "dailyBonusDate", "GSzQdbHLHw");
        setField(term16415, term16415.getClass(), "dailyCourseBonusDate", "IkfarsYNJO");
        setField(term16415, term16415.getClass(), "lastPairLoginDate", "aZKOWhHMEh");
        setField(term16415, term16415.getClass(), "lastTrialPlayDate", "YfkhviKZwl");
        setIntField(term16415, term16415.getClass(), "playVsCount", -824369460);
        setIntField(term16415, term16415.getClass(), "playSyncCount", -1573760035);
        setIntField(term16415, term16415.getClass(), "winCount", -1147965121);
        setIntField(term16415, term16415.getClass(), "helpCount", -867099093);
        setIntField(term16415, term16415.getClass(), "comboCount", -1091199008);
        setLongField(term16415, term16415.getClass(), "totalDeluxscore", -5455716707538294699L);
        setLongField(term16415, term16415.getClass(), "totalBasicDeluxscore", -1889784286465977825L);
        setLongField(term16415, term16415.getClass(), "totalAdvancedDeluxscore", 5592522907226111065L);
        setLongField(term16415, term16415.getClass(), "totalExpertDeluxscore", -2577420466618938650L);
        setLongField(term16415, term16415.getClass(), "totalMasterDeluxscore", 5614572229094721840L);
        setLongField(term16415, term16415.getClass(), "totalReMasterDeluxscore", -159468133651974975L);
        setIntField(term16415, term16415.getClass(), "totalSync", 1837886253);
        setIntField(term16415, term16415.getClass(), "totalBasicSync", -269528550);
        setIntField(term16415, term16415.getClass(), "totalAdvancedSync", 2108571355);
        setIntField(term16415, term16415.getClass(), "totalExpertSync", 1909966089);
        setIntField(term16415, term16415.getClass(), "totalMasterSync", 1827255916);
        setIntField(term16415, term16415.getClass(), "totalReMasterSync", 2039815750);
        setLongField(term16415, term16415.getClass(), "totalAchievement", 9160882370265093763L);
        setLongField(term16415, term16415.getClass(), "totalBasicAchievement", 6848008460134431064L);
        setLongField(term16415, term16415.getClass(), "totalAdvancedAchievement", -5338413783740215067L);
        setLongField(term16415, term16415.getClass(), "totalExpertAchievement", -814922776357887557L);
        setLongField(term16415, term16415.getClass(), "totalMasterAchievement", 800893933628130392L);
        setLongField(term16415, term16415.getClass(), "totalReMasterAchievement", -6983938899150831997L);
        setLongField(term16415, term16415.getClass(), "playerOldRating", -2720964670491002091L);
        setLongField(term16415, term16415.getClass(), "playerNewRating", -723697646775816649L);
        setIntField(term16415, term16415.getClass(), "banState", 2079590265);
        setLongField(term16415, term16415.getClass(), "dateTime", -5671086125367688052L);
        setField(term16413, term16413.getClass(), "user", term16415);
        setIntField(term16413, term16413.getClass(), "seasonId", -435079567);
        setIntField(term16413, term16413.getClass(), "point", -1017617829);
        setIntField(term16413, term16413.getClass(), "rank", 270928865);
        setBooleanField(term16413, term16413.getClass(), "rewardGet", false);
        setField(term16413, term16413.getClass(), "userName", "DcOhhAfJTI");
        setField(term16413, term16413.getClass(), "recordDate", "gYTIkBFOoS");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserFriendSeasonRanking");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSeasonId", argTypes, term16413, args);
    }

};


