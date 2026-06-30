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

public class UserMusicDetail_getUser_5627590792 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56097;

    public UserMusicDetail_getUser_5627590792() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term56103 = new Long(-8876856890348836498L);
        Integer term56166 = new Integer(1857693976);
        Integer term56168 = new Integer(1631305277);
        ArrayList term56164 = new ArrayList();
        ((ArrayList) term56164).add(term56166);
        ((ArrayList) term56164).add(term56168);
        Integer term56174 = new Integer(162113491);
        Integer term56176 = new Integer(-932147928);
        Integer term56178 = new Integer(487369012);
        Integer term56180 = new Integer(-179238712);
        Integer term56182 = new Integer(-2018735535);
        Integer term56184 = new Integer(-658524954);
        Integer term56186 = new Integer(-2009613557);
        Integer term56188 = new Integer(654195547);
        Integer term56190 = new Integer(1622857008);
        ArrayList term56172 = new ArrayList();
        ((ArrayList) term56172).add(term56174);
        ((ArrayList) term56172).add(term56176);
        ((ArrayList) term56172).add(term56178);
        ((ArrayList) term56172).add(term56180);
        ((ArrayList) term56172).add(term56182);
        ((ArrayList) term56172).add(term56184);
        ((ArrayList) term56172).add(term56186);
        ((ArrayList) term56172).add(term56188);
        ((ArrayList) term56172).add(term56190);
        term56097 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserMusicDetail"));
        Object term56099 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term56101 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term56117 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term56118 = newInstance(Class.forName("java.time.LocalDate"));
        Object term56122 = newInstance(Class.forName("java.time.LocalTime"));
        Object term56127 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term56128 = newInstance(Class.forName("java.time.LocalDate"));
        Object term56132 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term56097, term56097.getClass(), "id", 2414820119632962722L);
        setLongField(term56099, term56099.getClass(), "id", -6228694154790578964L);
        setLongField(term56101, term56101.getClass(), "id", 1652025727169242768L);
        setField(term56101, term56101.getClass(), "extId", term56103);
        setField(term56101, term56101.getClass(), "luid", "DEugGJIaYt");
        setIntField(term56118, term56118.getClass(), "year", 2029);
        setShortField(term56118, term56118.getClass(), "month", (short) 7);
        setShortField(term56118, term56118.getClass(), "day", (short) 14);
        setField(term56117, term56117.getClass(), "date", term56118);
        setByteField(term56122, term56122.getClass(), "hour", (byte) 17);
        setByteField(term56122, term56122.getClass(), "minute", (byte) 37);
        setByteField(term56122, term56122.getClass(), "second", (byte) 39);
        setIntField(term56122, term56122.getClass(), "nano", 333402299);
        setField(term56117, term56117.getClass(), "time", term56122);
        setField(term56101, term56101.getClass(), "registerTime", term56117);
        setIntField(term56128, term56128.getClass(), "year", 2025);
        setShortField(term56128, term56128.getClass(), "month", (short) 10);
        setShortField(term56128, term56128.getClass(), "day", (short) 30);
        setField(term56127, term56127.getClass(), "date", term56128);
        setByteField(term56132, term56132.getClass(), "hour", (byte) 1);
        setByteField(term56132, term56132.getClass(), "minute", (byte) 4);
        setByteField(term56132, term56132.getClass(), "second", (byte) 18);
        setIntField(term56132, term56132.getClass(), "nano", 717716253);
        setField(term56127, term56127.getClass(), "time", term56132);
        setField(term56101, term56101.getClass(), "accessTime", term56127);
        setField(term56099, term56099.getClass(), "card", term56101);
        setField(term56099, term56099.getClass(), "userName", "lzZIObOJmC");
        setIntField(term56099, term56099.getClass(), "isNetMember", 1611629079);
        setIntField(term56099, term56099.getClass(), "iconId", 770171276);
        setIntField(term56099, term56099.getClass(), "plateId", -1497914215);
        setIntField(term56099, term56099.getClass(), "titleId", 254385018);
        setIntField(term56099, term56099.getClass(), "partnerId", 672070228);
        setIntField(term56099, term56099.getClass(), "frameId", 1014463904);
        setIntField(term56099, term56099.getClass(), "selectMapId", 928673401);
        setIntField(term56099, term56099.getClass(), "totalAwake", -631739609);
        setIntField(term56099, term56099.getClass(), "gradeRating", -2045566233);
        setIntField(term56099, term56099.getClass(), "musicRating", 102632361);
        setIntField(term56099, term56099.getClass(), "playerRating", -871963633);
        setIntField(term56099, term56099.getClass(), "highestRating", -572352492);
        setIntField(term56099, term56099.getClass(), "gradeRank", -583361854);
        setIntField(term56099, term56099.getClass(), "classRank", 717140857);
        setIntField(term56099, term56099.getClass(), "courseRank", 891889211);
        setField(term56099, term56099.getClass(), "charaSlot", term56164);
        setField(term56099, term56099.getClass(), "charaLockSlot", term56172);
        setLongField(term56099, term56099.getClass(), "contentBit", 4659041496243630964L);
        setIntField(term56099, term56099.getClass(), "playCount", 265502816);
        setField(term56099, term56099.getClass(), "eventWatchedDate", "RFmGKwvSgz");
        setField(term56099, term56099.getClass(), "lastGameId", "EUEUhZglna");
        setField(term56099, term56099.getClass(), "lastRomVersion", "znDPtjpZrG");
        setField(term56099, term56099.getClass(), "lastDataVersion", "uodLjxczjr");
        setField(term56099, term56099.getClass(), "lastLoginDate", "HJLVBQAtGs");
        setField(term56099, term56099.getClass(), "lastPlayDate", "dxAxECMYEm");
        setIntField(term56099, term56099.getClass(), "lastPlayCredit", -1730476579);
        setIntField(term56099, term56099.getClass(), "lastPlayMode", -1501333599);
        setIntField(term56099, term56099.getClass(), "lastPlaceId", 1525193088);
        setField(term56099, term56099.getClass(), "lastPlaceName", "ylGHeywyhx");
        setIntField(term56099, term56099.getClass(), "lastAllNetId", 1734906845);
        setIntField(term56099, term56099.getClass(), "lastRegionId", 678776902);
        setField(term56099, term56099.getClass(), "lastRegionName", "SqMpUczXhg");
        setField(term56099, term56099.getClass(), "lastClientId", "voDQuoTpgt");
        setField(term56099, term56099.getClass(), "lastCountryCode", "wgwSIKAsrj");
        setIntField(term56099, term56099.getClass(), "lastSelectEMoney", -1148076813);
        setIntField(term56099, term56099.getClass(), "lastSelectTicket", 1450586432);
        setIntField(term56099, term56099.getClass(), "lastSelectCourse", 1726648633);
        setIntField(term56099, term56099.getClass(), "lastCountCourse", 859999867);
        setField(term56099, term56099.getClass(), "firstGameId", "aGJCHRHyCe");
        setField(term56099, term56099.getClass(), "firstRomVersion", "WingwhSgfc");
        setField(term56099, term56099.getClass(), "firstDataVersion", "YEcmxINfnL");
        setField(term56099, term56099.getClass(), "firstPlayDate", "EGytMwlDVe");
        setField(term56099, term56099.getClass(), "compatibleCmVersion", "GFQCmYZmcg");
        setField(term56099, term56099.getClass(), "dailyBonusDate", "qPgbFtsgtk");
        setField(term56099, term56099.getClass(), "dailyCourseBonusDate", "nkmiePLZgp");
        setField(term56099, term56099.getClass(), "lastPairLoginDate", "VoCvDpwwFr");
        setField(term56099, term56099.getClass(), "lastTrialPlayDate", "zYOmoQqDOd");
        setIntField(term56099, term56099.getClass(), "playVsCount", 469845570);
        setIntField(term56099, term56099.getClass(), "playSyncCount", 1192737321);
        setIntField(term56099, term56099.getClass(), "winCount", 827191651);
        setIntField(term56099, term56099.getClass(), "helpCount", -432140549);
        setIntField(term56099, term56099.getClass(), "comboCount", -1134516117);
        setLongField(term56099, term56099.getClass(), "totalDeluxscore", -7465474190642854260L);
        setLongField(term56099, term56099.getClass(), "totalBasicDeluxscore", -8372788044669645675L);
        setLongField(term56099, term56099.getClass(), "totalAdvancedDeluxscore", -1591356946285738868L);
        setLongField(term56099, term56099.getClass(), "totalExpertDeluxscore", 8225112290225174957L);
        setLongField(term56099, term56099.getClass(), "totalMasterDeluxscore", 2016254485611358021L);
        setLongField(term56099, term56099.getClass(), "totalReMasterDeluxscore", 7087994518559082143L);
        setIntField(term56099, term56099.getClass(), "totalSync", 1618532335);
        setIntField(term56099, term56099.getClass(), "totalBasicSync", 1620043047);
        setIntField(term56099, term56099.getClass(), "totalAdvancedSync", -1329172198);
        setIntField(term56099, term56099.getClass(), "totalExpertSync", -1036092775);
        setIntField(term56099, term56099.getClass(), "totalMasterSync", 857844283);
        setIntField(term56099, term56099.getClass(), "totalReMasterSync", 559778075);
        setLongField(term56099, term56099.getClass(), "totalAchievement", -4261531885468581427L);
        setLongField(term56099, term56099.getClass(), "totalBasicAchievement", -5071622903555986914L);
        setLongField(term56099, term56099.getClass(), "totalAdvancedAchievement", 3882122150290927490L);
        setLongField(term56099, term56099.getClass(), "totalExpertAchievement", -1606772867931980245L);
        setLongField(term56099, term56099.getClass(), "totalMasterAchievement", -681588793216734678L);
        setLongField(term56099, term56099.getClass(), "totalReMasterAchievement", -1863876892925084453L);
        setLongField(term56099, term56099.getClass(), "playerOldRating", 4384548833934581339L);
        setLongField(term56099, term56099.getClass(), "playerNewRating", -4507015763084556962L);
        setIntField(term56099, term56099.getClass(), "banState", 188273941);
        setLongField(term56099, term56099.getClass(), "dateTime", 1746899333256847901L);
        setField(term56097, term56097.getClass(), "user", term56099);
        setIntField(term56097, term56097.getClass(), "musicId", 736020163);
        setIntField(term56097, term56097.getClass(), "level", 1233013986);
        setIntField(term56097, term56097.getClass(), "playCount", 342111166);
        setIntField(term56097, term56097.getClass(), "achievement", -846825115);
        setIntField(term56097, term56097.getClass(), "comboStatus", -88572295);
        setIntField(term56097, term56097.getClass(), "syncStatus", -1830705318);
        setIntField(term56097, term56097.getClass(), "deluxscoreMax", 1003880925);
        setIntField(term56097, term56097.getClass(), "scoreRank", -1963566761);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUser", argTypes, term56097, args);
    }

};


