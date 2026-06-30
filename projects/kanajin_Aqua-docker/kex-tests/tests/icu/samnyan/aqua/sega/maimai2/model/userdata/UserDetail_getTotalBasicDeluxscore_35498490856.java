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

public class UserDetail_getTotalBasicDeluxscore_35498490856 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4261224;

    public UserDetail_getTotalBasicDeluxscore_35498490856() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4261228 = new Long(1107316092196427982L);
        Integer term4261291 = new Integer(-2092002829);
        Integer term4261293 = new Integer(-1361580827);
        Integer term4261295 = new Integer(-958463390);
        Integer term4261297 = new Integer(1950799121);
        Integer term4261299 = new Integer(-323987081);
        Integer term4261301 = new Integer(-917394097);
        ArrayList term4261289 = new ArrayList();
        ((ArrayList) term4261289).add(term4261291);
        ((ArrayList) term4261289).add(term4261293);
        ((ArrayList) term4261289).add(term4261295);
        ((ArrayList) term4261289).add(term4261297);
        ((ArrayList) term4261289).add(term4261299);
        ((ArrayList) term4261289).add(term4261301);
        Integer term4261307 = new Integer(-1877002042);
        ArrayList term4261305 = new ArrayList();
        ((ArrayList) term4261305).add(term4261307);
        term4261224 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4261226 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4261242 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4261243 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4261247 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4261252 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4261253 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4261257 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4261224, term4261224.getClass(), "id", -66704511386677549L);
        setLongField(term4261226, term4261226.getClass(), "id", -7320046668891572043L);
        setField(term4261226, term4261226.getClass(), "extId", term4261228);
        setField(term4261226, term4261226.getClass(), "luid", "YATBcGZxxG");
        setIntField(term4261243, term4261243.getClass(), "year", 2024);
        setShortField(term4261243, term4261243.getClass(), "month", (short) 8);
        setShortField(term4261243, term4261243.getClass(), "day", (short) 4);
        setField(term4261242, term4261242.getClass(), "date", term4261243);
        setByteField(term4261247, term4261247.getClass(), "hour", (byte) 11);
        setByteField(term4261247, term4261247.getClass(), "minute", (byte) 38);
        setByteField(term4261247, term4261247.getClass(), "second", (byte) 30);
        setIntField(term4261247, term4261247.getClass(), "nano", 454534115);
        setField(term4261242, term4261242.getClass(), "time", term4261247);
        setField(term4261226, term4261226.getClass(), "registerTime", term4261242);
        setIntField(term4261253, term4261253.getClass(), "year", 2021);
        setShortField(term4261253, term4261253.getClass(), "month", (short) 3);
        setShortField(term4261253, term4261253.getClass(), "day", (short) 31);
        setField(term4261252, term4261252.getClass(), "date", term4261253);
        setByteField(term4261257, term4261257.getClass(), "hour", (byte) 7);
        setByteField(term4261257, term4261257.getClass(), "minute", (byte) 29);
        setByteField(term4261257, term4261257.getClass(), "second", (byte) 22);
        setIntField(term4261257, term4261257.getClass(), "nano", 973034061);
        setField(term4261252, term4261252.getClass(), "time", term4261257);
        setField(term4261226, term4261226.getClass(), "accessTime", term4261252);
        setField(term4261224, term4261224.getClass(), "card", term4261226);
        setField(term4261224, term4261224.getClass(), "userName", "PVGHNFIxrT");
        setIntField(term4261224, term4261224.getClass(), "isNetMember", -582074781);
        setIntField(term4261224, term4261224.getClass(), "iconId", 1697815339);
        setIntField(term4261224, term4261224.getClass(), "plateId", -115714042);
        setIntField(term4261224, term4261224.getClass(), "titleId", -2054846924);
        setIntField(term4261224, term4261224.getClass(), "partnerId", -38275593);
        setIntField(term4261224, term4261224.getClass(), "frameId", -801346977);
        setIntField(term4261224, term4261224.getClass(), "selectMapId", -1733603442);
        setIntField(term4261224, term4261224.getClass(), "totalAwake", 429800234);
        setIntField(term4261224, term4261224.getClass(), "gradeRating", 1903554231);
        setIntField(term4261224, term4261224.getClass(), "musicRating", -512721528);
        setIntField(term4261224, term4261224.getClass(), "playerRating", 537891469);
        setIntField(term4261224, term4261224.getClass(), "highestRating", 1064854171);
        setIntField(term4261224, term4261224.getClass(), "gradeRank", 1192302129);
        setIntField(term4261224, term4261224.getClass(), "classRank", 1015420960);
        setIntField(term4261224, term4261224.getClass(), "courseRank", -1838309295);
        setField(term4261224, term4261224.getClass(), "charaSlot", term4261289);
        setField(term4261224, term4261224.getClass(), "charaLockSlot", term4261305);
        setLongField(term4261224, term4261224.getClass(), "contentBit", -9009080657049342482L);
        setIntField(term4261224, term4261224.getClass(), "playCount", -618078522);
        setField(term4261224, term4261224.getClass(), "eventWatchedDate", "rFJVFMtcNb");
        setField(term4261224, term4261224.getClass(), "lastGameId", "nIBJVANctK");
        setField(term4261224, term4261224.getClass(), "lastRomVersion", "RixcpXVOLQ");
        setField(term4261224, term4261224.getClass(), "lastDataVersion", "TIdgMNyvjS");
        setField(term4261224, term4261224.getClass(), "lastLoginDate", "QbpFtrUhPI");
        setField(term4261224, term4261224.getClass(), "lastPlayDate", "EqEksWOxFr");
        setIntField(term4261224, term4261224.getClass(), "lastPlayCredit", 381565431);
        setIntField(term4261224, term4261224.getClass(), "lastPlayMode", 1144513555);
        setIntField(term4261224, term4261224.getClass(), "lastPlaceId", -1224544361);
        setField(term4261224, term4261224.getClass(), "lastPlaceName", "EKWdLpoldl");
        setIntField(term4261224, term4261224.getClass(), "lastAllNetId", 673328254);
        setIntField(term4261224, term4261224.getClass(), "lastRegionId", -1319117442);
        setField(term4261224, term4261224.getClass(), "lastRegionName", "NFYxpvzGQf");
        setField(term4261224, term4261224.getClass(), "lastClientId", "GhfUvoCHOu");
        setField(term4261224, term4261224.getClass(), "lastCountryCode", "CHZrpHFSfi");
        setIntField(term4261224, term4261224.getClass(), "lastSelectEMoney", 711384027);
        setIntField(term4261224, term4261224.getClass(), "lastSelectTicket", 2025820425);
        setIntField(term4261224, term4261224.getClass(), "lastSelectCourse", -1943327391);
        setIntField(term4261224, term4261224.getClass(), "lastCountCourse", 758450760);
        setField(term4261224, term4261224.getClass(), "firstGameId", "GUvpdeEykq");
        setField(term4261224, term4261224.getClass(), "firstRomVersion", "GgnXKsfhtr");
        setField(term4261224, term4261224.getClass(), "firstDataVersion", "AtgnEHGwev");
        setField(term4261224, term4261224.getClass(), "firstPlayDate", "HLQNCJyEJf");
        setField(term4261224, term4261224.getClass(), "compatibleCmVersion", "FeovxGwXid");
        setField(term4261224, term4261224.getClass(), "dailyBonusDate", "bBZyiOPtPl");
        setField(term4261224, term4261224.getClass(), "dailyCourseBonusDate", "qGQlFjMfDe");
        setField(term4261224, term4261224.getClass(), "lastPairLoginDate", "dWQwswEDCt");
        setField(term4261224, term4261224.getClass(), "lastTrialPlayDate", "VaLfEKZBrC");
        setIntField(term4261224, term4261224.getClass(), "playVsCount", 2126070218);
        setIntField(term4261224, term4261224.getClass(), "playSyncCount", 1268446727);
        setIntField(term4261224, term4261224.getClass(), "winCount", 465297744);
        setIntField(term4261224, term4261224.getClass(), "helpCount", 518159941);
        setIntField(term4261224, term4261224.getClass(), "comboCount", 862009510);
        setLongField(term4261224, term4261224.getClass(), "totalDeluxscore", 6507283495080972969L);
        setLongField(term4261224, term4261224.getClass(), "totalBasicDeluxscore", 3525494690228599513L);
        setLongField(term4261224, term4261224.getClass(), "totalAdvancedDeluxscore", -222744128342591644L);
        setLongField(term4261224, term4261224.getClass(), "totalExpertDeluxscore", -6735842223717164309L);
        setLongField(term4261224, term4261224.getClass(), "totalMasterDeluxscore", 7436815306557851220L);
        setLongField(term4261224, term4261224.getClass(), "totalReMasterDeluxscore", 8039274106091285887L);
        setIntField(term4261224, term4261224.getClass(), "totalSync", -1566056535);
        setIntField(term4261224, term4261224.getClass(), "totalBasicSync", -1729641702);
        setIntField(term4261224, term4261224.getClass(), "totalAdvancedSync", 1081465974);
        setIntField(term4261224, term4261224.getClass(), "totalExpertSync", -1503932038);
        setIntField(term4261224, term4261224.getClass(), "totalMasterSync", 499759620);
        setIntField(term4261224, term4261224.getClass(), "totalReMasterSync", -196821894);
        setLongField(term4261224, term4261224.getClass(), "totalAchievement", -8106468072154972473L);
        setLongField(term4261224, term4261224.getClass(), "totalBasicAchievement", 6324220047259761727L);
        setLongField(term4261224, term4261224.getClass(), "totalAdvancedAchievement", -216588492131421231L);
        setLongField(term4261224, term4261224.getClass(), "totalExpertAchievement", -1538324319498245212L);
        setLongField(term4261224, term4261224.getClass(), "totalMasterAchievement", 2124634120463489651L);
        setLongField(term4261224, term4261224.getClass(), "totalReMasterAchievement", 3479203181088387004L);
        setLongField(term4261224, term4261224.getClass(), "playerOldRating", 8867542455429092856L);
        setLongField(term4261224, term4261224.getClass(), "playerNewRating", 893446051809397038L);
        setIntField(term4261224, term4261224.getClass(), "banState", 1339605972);
        setLongField(term4261224, term4261224.getClass(), "dateTime", 7741479301741504162L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalBasicDeluxscore", argTypes, term4261224, args);
    }

};


