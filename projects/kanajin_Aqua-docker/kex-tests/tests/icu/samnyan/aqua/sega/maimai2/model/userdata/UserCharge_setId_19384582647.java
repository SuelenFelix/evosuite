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

public class UserCharge_setId_19384582647 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term124627;
     Object term125024;

    public UserCharge_setId_19384582647() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term124633 = new Long(4199886998224701110L);
        Integer term124696 = new Integer(-2087321012);
        Integer term124698 = new Integer(-1613074612);
        Integer term124700 = new Integer(1054908502);
        Integer term124702 = new Integer(-1226802566);
        Integer term124704 = new Integer(1162813858);
        Integer term124706 = new Integer(494596414);
        Integer term124708 = new Integer(1226377461);
        Integer term124710 = new Integer(-1540486514);
        ArrayList term124694 = new ArrayList();
        ((ArrayList) term124694).add(term124696);
        ((ArrayList) term124694).add(term124698);
        ((ArrayList) term124694).add(term124700);
        ((ArrayList) term124694).add(term124702);
        ((ArrayList) term124694).add(term124704);
        ((ArrayList) term124694).add(term124706);
        ((ArrayList) term124694).add(term124708);
        ((ArrayList) term124694).add(term124710);
        Integer term124716 = new Integer(1471031478);
        Integer term124718 = new Integer(-334716487);
        Integer term124720 = new Integer(-1739012814);
        Integer term124722 = new Integer(1989014880);
        Integer term124724 = new Integer(-330280702);
        Integer term124726 = new Integer(-1858425735);
        Integer term124728 = new Integer(1818274550);
        ArrayList term124714 = new ArrayList();
        ((ArrayList) term124714).add(term124716);
        ((ArrayList) term124714).add(term124718);
        ((ArrayList) term124714).add(term124720);
        ((ArrayList) term124714).add(term124722);
        ((ArrayList) term124714).add(term124724);
        ((ArrayList) term124714).add(term124726);
        ((ArrayList) term124714).add(term124728);
        term124627 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCharge"));
        Object term124629 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term124631 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term124647 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term124648 = newInstance(Class.forName("java.time.LocalDate"));
        Object term124652 = newInstance(Class.forName("java.time.LocalTime"));
        Object term124657 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term124658 = newInstance(Class.forName("java.time.LocalDate"));
        Object term124662 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term124627, term124627.getClass(), "id", 2948932720021770792L);
        setLongField(term124629, term124629.getClass(), "id", 6996026879949446195L);
        setLongField(term124631, term124631.getClass(), "id", -4777127728733378629L);
        setField(term124631, term124631.getClass(), "extId", term124633);
        setField(term124631, term124631.getClass(), "luid", "vRbigVGnNS");
        setIntField(term124648, term124648.getClass(), "year", 2025);
        setShortField(term124648, term124648.getClass(), "month", (short) 8);
        setShortField(term124648, term124648.getClass(), "day", (short) 4);
        setField(term124647, term124647.getClass(), "date", term124648);
        setByteField(term124652, term124652.getClass(), "hour", (byte) 7);
        setByteField(term124652, term124652.getClass(), "minute", (byte) 29);
        setByteField(term124652, term124652.getClass(), "second", (byte) 4);
        setIntField(term124652, term124652.getClass(), "nano", 175288511);
        setField(term124647, term124647.getClass(), "time", term124652);
        setField(term124631, term124631.getClass(), "registerTime", term124647);
        setIntField(term124658, term124658.getClass(), "year", 2029);
        setShortField(term124658, term124658.getClass(), "month", (short) 9);
        setShortField(term124658, term124658.getClass(), "day", (short) 1);
        setField(term124657, term124657.getClass(), "date", term124658);
        setByteField(term124662, term124662.getClass(), "hour", (byte) 19);
        setByteField(term124662, term124662.getClass(), "minute", (byte) 56);
        setByteField(term124662, term124662.getClass(), "second", (byte) 46);
        setIntField(term124662, term124662.getClass(), "nano", 657110114);
        setField(term124657, term124657.getClass(), "time", term124662);
        setField(term124631, term124631.getClass(), "accessTime", term124657);
        setField(term124629, term124629.getClass(), "card", term124631);
        setField(term124629, term124629.getClass(), "userName", "bVteGrLeFP");
        setIntField(term124629, term124629.getClass(), "isNetMember", 1674142259);
        setIntField(term124629, term124629.getClass(), "iconId", -1303208102);
        setIntField(term124629, term124629.getClass(), "plateId", 1957563972);
        setIntField(term124629, term124629.getClass(), "titleId", -193596012);
        setIntField(term124629, term124629.getClass(), "partnerId", 919991978);
        setIntField(term124629, term124629.getClass(), "frameId", -240870307);
        setIntField(term124629, term124629.getClass(), "selectMapId", -812476026);
        setIntField(term124629, term124629.getClass(), "totalAwake", -1921252803);
        setIntField(term124629, term124629.getClass(), "gradeRating", 542685338);
        setIntField(term124629, term124629.getClass(), "musicRating", 593280113);
        setIntField(term124629, term124629.getClass(), "playerRating", 1265600687);
        setIntField(term124629, term124629.getClass(), "highestRating", 156680957);
        setIntField(term124629, term124629.getClass(), "gradeRank", -181324663);
        setIntField(term124629, term124629.getClass(), "classRank", 973270477);
        setIntField(term124629, term124629.getClass(), "courseRank", 50996915);
        setField(term124629, term124629.getClass(), "charaSlot", term124694);
        setField(term124629, term124629.getClass(), "charaLockSlot", term124714);
        setLongField(term124629, term124629.getClass(), "contentBit", 7337740023273342727L);
        setIntField(term124629, term124629.getClass(), "playCount", -241796987);
        setField(term124629, term124629.getClass(), "eventWatchedDate", "LLVxzGZuym");
        setField(term124629, term124629.getClass(), "lastGameId", "FHWZKmPKlK");
        setField(term124629, term124629.getClass(), "lastRomVersion", "MqWvZIWxCr");
        setField(term124629, term124629.getClass(), "lastDataVersion", "iiMXpaWLIH");
        setField(term124629, term124629.getClass(), "lastLoginDate", "MqMDTdIpYR");
        setField(term124629, term124629.getClass(), "lastPlayDate", "uuwidsQbSs");
        setIntField(term124629, term124629.getClass(), "lastPlayCredit", -1252248921);
        setIntField(term124629, term124629.getClass(), "lastPlayMode", 1214656233);
        setIntField(term124629, term124629.getClass(), "lastPlaceId", 376569110);
        setField(term124629, term124629.getClass(), "lastPlaceName", "rXLmNRoJfU");
        setIntField(term124629, term124629.getClass(), "lastAllNetId", -366233083);
        setIntField(term124629, term124629.getClass(), "lastRegionId", -1586250649);
        setField(term124629, term124629.getClass(), "lastRegionName", "dWaVZloZWE");
        setField(term124629, term124629.getClass(), "lastClientId", "vgZFgEliKc");
        setField(term124629, term124629.getClass(), "lastCountryCode", "cwNMyoCqHJ");
        setIntField(term124629, term124629.getClass(), "lastSelectEMoney", 714204805);
        setIntField(term124629, term124629.getClass(), "lastSelectTicket", -1539644001);
        setIntField(term124629, term124629.getClass(), "lastSelectCourse", 1694021329);
        setIntField(term124629, term124629.getClass(), "lastCountCourse", -340695215);
        setField(term124629, term124629.getClass(), "firstGameId", "PzUYNYWLsN");
        setField(term124629, term124629.getClass(), "firstRomVersion", "rGvXtIHjBI");
        setField(term124629, term124629.getClass(), "firstDataVersion", "PKJkUkzual");
        setField(term124629, term124629.getClass(), "firstPlayDate", "WYcqisofgT");
        setField(term124629, term124629.getClass(), "compatibleCmVersion", "vVYrwXQCzi");
        setField(term124629, term124629.getClass(), "dailyBonusDate", "urqqtlYppy");
        setField(term124629, term124629.getClass(), "dailyCourseBonusDate", "znNUsUuegd");
        setField(term124629, term124629.getClass(), "lastPairLoginDate", "TvOdQLksId");
        setField(term124629, term124629.getClass(), "lastTrialPlayDate", "gbrBAjYfeF");
        setIntField(term124629, term124629.getClass(), "playVsCount", -965593105);
        setIntField(term124629, term124629.getClass(), "playSyncCount", -1713765557);
        setIntField(term124629, term124629.getClass(), "winCount", -100503999);
        setIntField(term124629, term124629.getClass(), "helpCount", -1152780010);
        setIntField(term124629, term124629.getClass(), "comboCount", 1773328262);
        setLongField(term124629, term124629.getClass(), "totalDeluxscore", 5100914994140818113L);
        setLongField(term124629, term124629.getClass(), "totalBasicDeluxscore", 1399778523078780919L);
        setLongField(term124629, term124629.getClass(), "totalAdvancedDeluxscore", -8298604862992870049L);
        setLongField(term124629, term124629.getClass(), "totalExpertDeluxscore", 8745188247028469647L);
        setLongField(term124629, term124629.getClass(), "totalMasterDeluxscore", -1981865007955337201L);
        setLongField(term124629, term124629.getClass(), "totalReMasterDeluxscore", 3725162199751207272L);
        setIntField(term124629, term124629.getClass(), "totalSync", 1076156036);
        setIntField(term124629, term124629.getClass(), "totalBasicSync", 497222104);
        setIntField(term124629, term124629.getClass(), "totalAdvancedSync", -422135580);
        setIntField(term124629, term124629.getClass(), "totalExpertSync", -1726471303);
        setIntField(term124629, term124629.getClass(), "totalMasterSync", 1563484306);
        setIntField(term124629, term124629.getClass(), "totalReMasterSync", -1064532569);
        setLongField(term124629, term124629.getClass(), "totalAchievement", 2177661519078714019L);
        setLongField(term124629, term124629.getClass(), "totalBasicAchievement", -7627890620954511666L);
        setLongField(term124629, term124629.getClass(), "totalAdvancedAchievement", 6226564475251569033L);
        setLongField(term124629, term124629.getClass(), "totalExpertAchievement", -4159863432036511837L);
        setLongField(term124629, term124629.getClass(), "totalMasterAchievement", 7397608429844042575L);
        setLongField(term124629, term124629.getClass(), "totalReMasterAchievement", 298756682777431426L);
        setLongField(term124629, term124629.getClass(), "playerOldRating", 1074990585989802601L);
        setLongField(term124629, term124629.getClass(), "playerNewRating", 9066576144978232615L);
        setIntField(term124629, term124629.getClass(), "banState", 1894908411);
        setLongField(term124629, term124629.getClass(), "dateTime", 8152379894028795698L);
        setField(term124627, term124627.getClass(), "user", term124629);
        setIntField(term124627, term124627.getClass(), "chargeId", 1128957140);
        setIntField(term124627, term124627.getClass(), "stock", 1975880274);
        setField(term124627, term124627.getClass(), "purchaseDate", "oQyDIyWghi");
        setField(term124627, term124627.getClass(), "validDate", "VGvITdbKFh");
        term125024 = new Long(-6852826463016078835L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCharge");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term125024;
        callMethod(klass, "setId", argTypes, term124627, args);
    }

};


